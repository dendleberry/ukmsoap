
package com.ukmail.ns.msg.header._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ukmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ukmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ukmail" type="{http://ns.ukmail.com/msg/header/1.0}header"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ukmail", propOrder = {

})
public class Ukmail {

    @XmlElement(required = true)
    protected Header ukmail;

    /**
     * Gets the value of the ukmail property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getUkmail() {
        return ukmail;
    }

    /**
     * Sets the value of the ukmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setUkmail(Header value) {
        this.ukmail = value;
    }

}
