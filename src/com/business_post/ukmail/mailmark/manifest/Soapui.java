
package com.business_post.ukmail.mailmark.manifest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "soapui", targetNamespace = "http://ukmail.business-post.com/mailmark/manifest", wsdlLocation = "https://mailmark.ukmail.com/sst/item_manifest-1.java?WSDL")//   https://sandbox.mailmark.ukmail.com/sst/item_manifest-1.java?WSDL
public class Soapui extends Service {
	
	private Properties props;
    private final static URL SOAPUI_WSDL_LOCATION;
    private final static WebServiceException SOAPUI_EXCEPTION;
    private final static QName SOAPUI_QNAME = new QName("http://ukmail.business-post.com/mailmark/manifest", "soapui");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://mailmark.ukmail.com/sst/item_manifest-1?WSDL");// https://sandbox.mailmark.ukmail.com/sst/item_manifest-1?WSDL
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPUI_WSDL_LOCATION = url;
        SOAPUI_EXCEPTION = e;
    }

    public Soapui() {
        super(__getWsdlLocation(), SOAPUI_QNAME);
    }

    public Soapui(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPUI_QNAME, features);
    }

    public Soapui(URL wsdlLocation) {
        super(wsdlLocation, SOAPUI_QNAME);
    }

    public Soapui(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPUI_QNAME, features);
    }

    public Soapui(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Soapui(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MailmarkOnrampPortType
     */
    @WebEndpoint(name = "item_manifest-1.2.binding.soap")
    public MailmarkOnrampPortType getItemManifest1BindingSoap() {
        return super.getPort(new QName("http://ukmail.business-post.com/mailmark/manifest", "item_manifest-1.2.binding.soap"), MailmarkOnrampPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MailmarkOnrampPortType
     */
    @WebEndpoint(name = "item_manifest-1.2.binding.soap")
    public MailmarkOnrampPortType getItemManifest1BindingSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://ukmail.business-post.com/mailmark/manifest", "item_manifest-1.2.binding.soap"), MailmarkOnrampPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPUI_EXCEPTION!= null) {
            throw SOAPUI_EXCEPTION;
        }
        return SOAPUI_WSDL_LOCATION;
    }

}
