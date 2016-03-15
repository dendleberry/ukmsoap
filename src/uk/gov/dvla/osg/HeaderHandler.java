package uk.gov.dvla.osg;
import java.util.Locale;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;



public class HeaderHandler implements SOAPHandler<SOAPMessageContext> {
	 
    @Override
	public boolean handleMessage(SOAPMessageContext smc) {
 
        Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
 
        if (outboundProperty.booleanValue()) {
 
            SOAPMessage message = smc.getMessage();
            //This adds a security header to outbound messages
 
            try {
 
                SOAPEnvelope envelope = smc.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
 
                SOAPElement security =
                        header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
 
                SOAPElement usernameToken =
                        security.addChildElement("UsernameToken", "wsse");
                usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
 
                SOAPElement username =
                        usernameToken.addChildElement("Username", "wsse");
                username.addTextNode("DVLAMorriston");//"DVLAQA");
 
                SOAPElement password =
                        usernameToken.addChildElement("Password", "wsse");
                password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
                password.addTextNode("W3j74Xn5Y5");//mrcT9S678g");
 
                //Print out the outbound SOAP message to System.out
                message.writeTo(System.out);
                System.out.println("");
              
                
            } catch (Exception e) {
                e.printStackTrace();
            }
 
        } else {
            try {
                
                //This handler does nothing with the response from the Web Service so
                //we just print out the SOAP message.
                SOAPMessage message = smc.getMessage();
                message.writeTo(System.out);
                System.out.println("");
 
            } catch (Exception ex) {
                ex.printStackTrace();
            } 
        }
 
 
        return outboundProperty;
 
    }

 
    @Override
	public Set getHeaders() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return null;
    }
 
    @Override
	public boolean handleFault(SOAPMessageContext context) {
    	System.out.println("SOAP FAULT" + context);
    	
    	//MailMark use non standard error codes, which breaks the standard.
    	//This handler gets the non-standard error, then changes the message to standard
    	//so that internal processing can continue.
    	
    	try {
    		SOAPMessage messageFromServer = context.getMessage();
    	
			SOAPFault fa = messageFromServer.getSOAPBody().getFault();
			//Get original (non-standard) error message from them
			String errorMessage = GetErrorMessageFromSOAPFault(fa);
			
			String faultCode = GetFaultCodeFromSOAPFault(fa);
			
			//Set the error code to a standard one
			
			fa.setFaultCode("se:Sender");	
			
			
			//Set the reason for the failure as captured from the original message
			fa.addFaultReasonText("Error: ("+ faultCode +") " + errorMessage, Locale.getDefault());

			context.setMessage(messageFromServer);
			
		} catch (SOAPException e) {
			e.printStackTrace();
		}
   	
        return false;
    }
 
    private String GetErrorMessageFromSOAPFault(SOAPFault fa) {
    	return fa.getDetail().getFirstChild().getTextContent();
	}
    
    private String GetFaultCodeFromSOAPFault(SOAPFault fa) {
    	return fa.getFaultCode();
	}


	@Override
	public void close(MessageContext context) {
    //throw new UnsupportedOperationException("Not supported yet.");
    }
    
   
}
