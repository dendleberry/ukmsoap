
package com.ukmail.ns.msg.header._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The enterprise header
 * 				element, describing the Integration properties for the message
 * 				payload.
 * 
 * <p>Java class for header complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="header">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Timestamp" type="{http://ns.ukmail.com/msg/header/1.0}timestamp"/>
 *         &lt;element name="Application" type="{http://ns.ukmail.com/msg/header/1.0}application"/>
 *         &lt;element name="MessageType" type="{http://ns.ukmail.com/msg/header/1.0}messagetype"/>
 *         &lt;element name="Version" type="{http://ns.ukmail.com/msg/header/1.0}version"/>
 *         &lt;element name="MessageId" type="{http://ns.ukmail.com/msg/header/1.0}UUID"/>
 *         &lt;element name="CorrelationId" type="{http://ns.ukmail.com/msg/header/1.0}correlationid" minOccurs="0"/>
 *         &lt;element name="Priority" type="{http://ns.ukmail.com/msg/header/1.0}priority" minOccurs="0"/>
 *         &lt;element name="Expire" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "header", propOrder = {

})
public class Header {

    @XmlElement(name = "Timestamp", required = true)
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Application", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String application;
    @XmlElement(name = "MessageType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String messageType;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElementRef(name = "CorrelationId", namespace = "http://ns.ukmail.com/msg/header/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correlationId;
    @XmlElementRef(name = "Priority", namespace = "http://ns.ukmail.com/msg/header/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priority;
    @XmlElementRef(name = "Expire", namespace = "http://ns.ukmail.com/msg/header/1.0", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expire;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrelationId(JAXBElement<String> value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriority(JAXBElement<String> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the expire property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpire() {
        return expire;
    }

    /**
     * Sets the value of the expire property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpire(JAXBElement<XMLGregorianCalendar> value) {
        this.expire = value;
    }

}
