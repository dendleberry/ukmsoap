
package com.business_post.ukmail.mailmark.manifest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BatchReference" type="{http://ukmail.business-post.com/mailmark/manifest}BatchReference"/>
 *         &lt;element name="SCID" type="{http://ukmail.business-post.com/mailmark/manifest}SCID"/>
 *         &lt;element name="Items" type="{http://ukmail.business-post.com/mailmark/manifest}Items"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "batchReference",
    "scid",
    "items"
})
@XmlRootElement(name = "ItemsBatch")
public class ItemsBatch {

    @XmlElement(name = "BatchReference", required = true)
    protected String batchReference;
    @XmlElement(name = "SCID", required = true)
    protected String scid;
    @XmlElement(name = "Items", required = true)
    protected Items items;

    /**
     * Gets the value of the batchReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchReference() {
        return batchReference;
    }

    /**
     * Sets the value of the batchReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchReference(String value) {
        this.batchReference = value;
    }

    /**
     * Gets the value of the scid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCID() {
        return scid;
    }

    /**
     * Sets the value of the scid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCID(String value) {
        this.scid = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }

}
