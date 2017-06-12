package uk.gov.dvla.osg;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import com.business_post.ukmail.mailmark.manifest.Item;
import com.business_post.ukmail.mailmark.manifest.ObjectFactory;

public class Main {
	static String propFile;
	
	public static void main(String[] args) throws Exception {
		String filename;
		String logFile;
		String errFile;
		
		if(args.length != 2){
			System.out.println("INCORRECT NUMBER OF ARGUMENTS");
			System.out.println("1) SOAPFILE path, 2) Props file");
			filename="C:\\Users\\dendlel\\Desktop\\LIVE_SOAP\\1382150000.SOAPFILE.DATA";
			propFile="C:\\Users\\dendlel\\Desktop\\LIVE_SOAP\\props.dat";
		}else{
			filename=args[0];
			propFile=args[1];
		}
		
		if( !(new File(propFile).exists()) ){
			System.out.println("Props file '" + propFile + "' doesn't exist!");
			System.exit(1);
		}
		
		logFile=filename + ".LOG";
		errFile=filename + ".ERR.LOG";
		
		PrintStream log = new PrintStream(new BufferedOutputStream(new FileOutputStream(logFile)));
		PrintStream err = new PrintStream(new BufferedOutputStream(new FileOutputStream(errFile)));
		
		System.setOut(log);
		System.setErr(err);
		FileHandler fh = new FileHandler(filename);
		
		//split requests into 1000s and send request
		Integer count = 0;
		Integer totalCount = 0;
		ArrayList<OutgoingItems> allItems = new ArrayList<OutgoingItems>();
		ArrayList<OutgoingItems> thosandList = new ArrayList<OutgoingItems>();
		
		allItems = fh.getOutGoingItems();
		
		for(OutgoingItems items : allItems){
			thosandList.add(items);
			count ++;
			totalCount ++;
			//send when we have 1000 customers in the list
			if(count == 1000 || count == allItems.size() || totalCount == allItems.size()){
				sendRequest(items.getScid(), items.getAppName(), items.getBatchRef(), thosandList);
				thosandList.clear();
				count = 0;
			}
		}
		log.flush();
		err.flush();
	}

	public static void sendRequest(String scid, String application, String batchRef, ArrayList<OutgoingItems> outgoingItems) throws Exception{
		
		MailMarkSession session = new MailMarkSession(propFile);
		session.setApplication(application);
		session.setBatchReference(batchRef);
		session.setScid(scid);
		
		for(OutgoingItems items : outgoingItems){
			ObjectFactory ob = new ObjectFactory();
			Item item = new Item();
			item.setClazz(items.getInClass());
			
			item.setDPS(ob.createItemDPS(items.getDps()));
			item.setEIBItemId(items.getItemID());
			item.setFormat(items.getFormat());
			item.setMachinable(items.getMachineable());
			item.setMailType(items.getMailType());
			item.setNumberOfAddressLines(items.getNoOfAddressLines());
			item.setPostCode(items.getPostcode());
			item.setProduct(items.getProduct());
			item.setSpare8(items.getBagItemLink());
			item.setWeight(items.getWeight());
			session.mailItems.add(item);
		}
		
		boolean success = session.commit();
		
		if(success){
			System.out.println("SUCCESS");
		}else{
			System.out.println("ERROR");
		}
		
	}

}
