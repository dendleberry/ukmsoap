package uk.gov.dvla.osg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
	String filename;
	String line = null;
	
	public FileHandler(String file){
		this.filename = file;
	}
	
	public ArrayList<OutgoingItems> getOutGoingItems() throws IOException{
		
		ArrayList<OutgoingItems> ogi = new ArrayList<OutgoingItems>();

		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while ((line = br.readLine()) != null){
			String[] parts = line.split("\\|");
			OutgoingItems i = new OutgoingItems();
			i.setAppName(parts[0]);
			i.setBatchRef(parts[1]);
			i.setScid(parts[2]);
			i.setInClass(parts[3]);
			i.setDps(parts[4]);
			i.setItemID(Integer.parseInt(parts[5]));
			i.setFormat(parts[6]);
			i.setMachineable(parts[7]);
			i.setMailType(parts[8]);
			i.setNoOfAddressLines(Integer.parseInt(parts[9]));
			i.setPostcode(parts[10]);
			i.setProduct(parts[11]);
			i.setBagItemLink(parts[12]);
			i.setWeight(Integer.parseInt(parts[13]));
			//i.print();
			ogi.add(i);
		}
		return ogi;
	}
	

}
