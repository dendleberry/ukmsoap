
package com.ukmail.ns.msg.header._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ukmail.ns.msg.header._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Ukmail_QNAME = new QName("http://ns.ukmail.com/msg/header/1.0", "ukmail");
    private final static QName _HeaderExpire_QNAME = new QName("http://ns.ukmail.com/msg/header/1.0", "Expire");
    private final static QName _HeaderCorrelationId_QNAME = new QName("http://ns.ukmail.com/msg/header/1.0", "CorrelationId");
    private final static QName _HeaderPriority_QNAME = new QName("http://ns.ukmail.com/msg/header/1.0", "Priority");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ukmail.ns.msg.header._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Ukmail }
     * 
     */
    public Ukmail createUkmail() {
        return new Ukmail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.ukmail.com/msg/header/1.0", name = "ukmail")
    public JAXBElement<Header> createUkmail(Header value) {
        return new JAXBElement<Header>(_Ukmail_QNAME, Header.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.ukmail.com/msg/header/1.0", name = "Expire", scope = Header.class)
    public JAXBElement<XMLGregorianCalendar> createHeaderExpire(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_HeaderExpire_QNAME, XMLGregorianCalendar.class, Header.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.ukmail.com/msg/header/1.0", name = "CorrelationId", scope = Header.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createHeaderCorrelationId(String value) {
        return new JAXBElement<String>(_HeaderCorrelationId_QNAME, String.class, Header.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.ukmail.com/msg/header/1.0", name = "Priority", scope = Header.class)
    public JAXBElement<String> createHeaderPriority(String value) {
        return new JAXBElement<String>(_HeaderPriority_QNAME, String.class, Header.class, value);
    }

}
