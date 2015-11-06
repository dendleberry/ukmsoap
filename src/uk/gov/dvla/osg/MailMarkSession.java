package uk.gov.dvla.osg;

import java.util.ArrayList; 
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPFaultException;

import org.w3c.dom.Node;

import com.business_post.ukmail.mailmark.manifest.Item;
import com.business_post.ukmail.mailmark.manifest.Items;
import com.business_post.ukmail.mailmark.manifest.ItemsBatch;
import com.business_post.ukmail.mailmark.manifest.MailmarkOnrampPortType;
import com.business_post.ukmail.mailmark.manifest.Soapui;
import com.ukmail.ns.msg.header._1.Header;
import com.ukmail.ns.msg.header._1.Ukmail;

public class MailMarkSession {
	
	private String batchReference;
	private String application;
	private String scid;
	public ArrayList<Item> mailItems;

	
	public String getScid() {
		return scid;
	}

	public void setScid(String scid) {
		this.scid = scid;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getBatchReference() {
		return batchReference;
	}

	public void setBatchReference(String batchReference) {
		this.batchReference = batchReference;
	}
		
	public MailMarkSession(){
		mailItems = new ArrayList<Item>();
	}
	
	public boolean commit() throws Exception{
		boolean success = false;
		UUID messageGuid = UUID.randomUUID();
		
		Soapui client = new Soapui();

		HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
		client.setHandlerResolver(handlerResolver);

		MailmarkOnrampPortType soap = client.getItemManifest1BindingSoap();

		Header header = new Header();

		header.setApplication(application);

		header.setMessageId(messageGuid.toString());

		header.setVersion("1.0");

		header.setMessageType("item_manifest-1");

		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);

		header.setTimestamp(date2);

		Ukmail ukmail = new Ukmail();

		ukmail.setUkmail(header);	
		Items items = new Items();
		ItemsBatch batch = new ItemsBatch();
		
		for(Item mailItem : mailItems){
			items.getItem().add(mailItem);
		}		

		batch.setItems(items);
		batch.setBatchReference(batchReference);
		batch.setSCID(scid);
		String responseString;

		try {
			System.out.println("Contacting UkMail...");
						
			Object response = soap.itemManifest1(batch , new Holder<Header>(header)); // new Holder<Header>() THIS
			System.out.println(response);
			//Node node = (Node) response;
			responseString = (String) response;//node.getFirstChild().getNodeValue();

			success = responseString.equalsIgnoreCase("success");
		} 
		catch (SOAPFaultException soapException) {
			throw new Exception("Error from UkMail: (Outgoing messageId: "+ messageGuid.toString() +")" + soapException.getMessage());
		}
		
		if(!success){		
			throw new Exception("Non specific failure - response was not \"success\" (response was "+responseString+") (Outgoing messageId: "+ messageGuid.toString() +")");
		}
		
		return success;
		
	}

}
