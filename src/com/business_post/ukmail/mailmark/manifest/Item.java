
package com.business_post.ukmail.mailmark.manifest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertisingAttribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertisingAttribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertisingAttribute3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdvertisingAttribute4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DPS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EIBItemId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;pattern value=".*[0-9].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Format">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Machinable">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MailOriginatorSubDivisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailSubType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailSubType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailSubType3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailSubType4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MailerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumberOfAddressLines">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;pattern value=".*[0-9].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PAFResellerProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAFResellerProductVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PAFVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value="[/^ *$/]{7}|.*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Product">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RTSDPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTSPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RTSService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResellerUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseDPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseItemId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResponseLicenceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseMailType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsePostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseSupplyChain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Spare8">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;pattern value=".*[^\s].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Spare9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialServiceBarcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialServiceFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weight">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;pattern value=".*[0-9].*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "addressLine6",
    "addressLine7",
    "addressLine8",
    "addressLine9",
    "advertisingAttribute1",
    "advertisingAttribute2",
    "advertisingAttribute3",
    "advertisingAttribute4",
    "campaignName",
    "clazz",
    "dps",
    "department",
    "eibItemId",
    "format",
    "machinable",
    "mailOriginatorSubDivisionName",
    "mailSubType1",
    "mailSubType2",
    "mailSubType3",
    "mailSubType4",
    "mailType",
    "mailerId",
    "numberOfAddressLines",
    "pafResellerProduct",
    "pafResellerProductVersion",
    "pafVersion",
    "postCode",
    "product",
    "rtsdps",
    "rtsPostCode",
    "rtsService",
    "resellerUsed",
    "responseClass",
    "responseDPS",
    "responseFormat",
    "responseItemId",
    "responseLicenceNo",
    "responseMailType",
    "responsePostCode",
    "responseSupplyChain",
    "spare1",
    "spare10",
    "spare2",
    "spare3",
    "spare4",
    "spare5",
    "spare6",
    "spare7",
    "spare8",
    "spare9",
    "specialServiceBarcode",
    "specialServiceFlag",
    "weight"
})
public class Item {

    @XmlElementRef(name = "AddressLine1", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "AddressLine4", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine4;
    @XmlElementRef(name = "AddressLine5", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine5;
    @XmlElementRef(name = "AddressLine6", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine6;
    @XmlElementRef(name = "AddressLine7", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine7;
    @XmlElementRef(name = "AddressLine8", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine8;
    @XmlElementRef(name = "AddressLine9", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine9;
    @XmlElementRef(name = "AdvertisingAttribute1", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advertisingAttribute1;
    @XmlElementRef(name = "AdvertisingAttribute2", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advertisingAttribute2;
    @XmlElementRef(name = "AdvertisingAttribute3", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advertisingAttribute3;
    @XmlElementRef(name = "AdvertisingAttribute4", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> advertisingAttribute4;
    @XmlElementRef(name = "CampaignName", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaignName;
    @XmlElement(name = "Class", required = true)
    protected String clazz;
    @XmlElementRef(name = "DPS", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dps;
    @XmlElementRef(name = "Department", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElement(name = "EIBItemId")
    protected int eibItemId;
    @XmlElement(name = "Format", required = true)
    protected String format;
    @XmlElement(name = "Machinable", required = true)
    protected String machinable;
    @XmlElementRef(name = "MailOriginatorSubDivisionName", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailOriginatorSubDivisionName;
    @XmlElementRef(name = "MailSubType1", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailSubType1;
    @XmlElementRef(name = "MailSubType2", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailSubType2;
    @XmlElementRef(name = "MailSubType3", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailSubType3;
    @XmlElementRef(name = "MailSubType4", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailSubType4;
    @XmlElement(name = "MailType", required = true)
    protected String mailType;
    @XmlElement(name = "MailerId")
    protected Integer mailerId;
    @XmlElement(name = "NumberOfAddressLines")
    protected int numberOfAddressLines;
    @XmlElementRef(name = "PAFResellerProduct", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pafResellerProduct;
    @XmlElementRef(name = "PAFResellerProductVersion", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pafResellerProductVersion;
    @XmlElementRef(name = "PAFVersion", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pafVersion;
    @XmlElement(name = "PostCode", required = true)
    protected String postCode;
    @XmlElement(name = "Product", required = true)
    protected String product;
    @XmlElementRef(name = "RTSDPS", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtsdps;
    @XmlElementRef(name = "RTSPostCode", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtsPostCode;
    @XmlElementRef(name = "RTSService", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rtsService;
    @XmlElementRef(name = "ResellerUsed", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resellerUsed;
    @XmlElementRef(name = "ResponseClass", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseClass;
    @XmlElementRef(name = "ResponseDPS", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseDPS;
    @XmlElementRef(name = "ResponseFormat", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseFormat;
    @XmlElement(name = "ResponseItemId")
    protected Integer responseItemId;
    @XmlElementRef(name = "ResponseLicenceNo", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseLicenceNo;
    @XmlElementRef(name = "ResponseMailType", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseMailType;
    @XmlElementRef(name = "ResponsePostCode", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsePostCode;
    @XmlElementRef(name = "ResponseSupplyChain", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseSupplyChain;
    @XmlElementRef(name = "Spare1", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare1;
    @XmlElementRef(name = "Spare10", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare10;
    @XmlElementRef(name = "Spare2", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare2;
    @XmlElementRef(name = "Spare3", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare3;
    @XmlElementRef(name = "Spare4", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare4;
    @XmlElementRef(name = "Spare5", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare5;
    @XmlElementRef(name = "Spare6", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare6;
    @XmlElementRef(name = "Spare7", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare7;
    @XmlElement(name = "Spare8", required = true)
    protected String spare8;
    @XmlElementRef(name = "Spare9", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spare9;
    @XmlElementRef(name = "SpecialServiceBarcode", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialServiceBarcode;
    @XmlElementRef(name = "SpecialServiceFlag", namespace = "http://ukmail.business-post.com/mailmark/manifest", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialServiceFlag;
    @XmlElement(name = "Weight")
    protected int weight;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine4(JAXBElement<String> value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine5(JAXBElement<String> value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the addressLine6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine6() {
        return addressLine6;
    }

    /**
     * Sets the value of the addressLine6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine6(JAXBElement<String> value) {
        this.addressLine6 = value;
    }

    /**
     * Gets the value of the addressLine7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine7() {
        return addressLine7;
    }

    /**
     * Sets the value of the addressLine7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine7(JAXBElement<String> value) {
        this.addressLine7 = value;
    }

    /**
     * Gets the value of the addressLine8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine8() {
        return addressLine8;
    }

    /**
     * Sets the value of the addressLine8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine8(JAXBElement<String> value) {
        this.addressLine8 = value;
    }

    /**
     * Gets the value of the addressLine9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine9() {
        return addressLine9;
    }

    /**
     * Sets the value of the addressLine9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine9(JAXBElement<String> value) {
        this.addressLine9 = value;
    }

    /**
     * Gets the value of the advertisingAttribute1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvertisingAttribute1() {
        return advertisingAttribute1;
    }

    /**
     * Sets the value of the advertisingAttribute1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvertisingAttribute1(JAXBElement<String> value) {
        this.advertisingAttribute1 = value;
    }

    /**
     * Gets the value of the advertisingAttribute2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvertisingAttribute2() {
        return advertisingAttribute2;
    }

    /**
     * Sets the value of the advertisingAttribute2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvertisingAttribute2(JAXBElement<String> value) {
        this.advertisingAttribute2 = value;
    }

    /**
     * Gets the value of the advertisingAttribute3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvertisingAttribute3() {
        return advertisingAttribute3;
    }

    /**
     * Sets the value of the advertisingAttribute3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvertisingAttribute3(JAXBElement<String> value) {
        this.advertisingAttribute3 = value;
    }

    /**
     * Gets the value of the advertisingAttribute4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdvertisingAttribute4() {
        return advertisingAttribute4;
    }

    /**
     * Sets the value of the advertisingAttribute4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdvertisingAttribute4(JAXBElement<String> value) {
        this.advertisingAttribute4 = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaignName(JAXBElement<String> value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the dps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDPS() {
        return dps;
    }

    /**
     * Sets the value of the dps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDPS(JAXBElement<String> value) {
        this.dps = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the eibItemId property.
     * 
     */
    public int getEIBItemId() {
        return eibItemId;
    }

    /**
     * Sets the value of the eibItemId property.
     * 
     */
    public void setEIBItemId(int value) {
        this.eibItemId = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the machinable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachinable() {
        return machinable;
    }

    /**
     * Sets the value of the machinable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachinable(String value) {
        this.machinable = value;
    }

    /**
     * Gets the value of the mailOriginatorSubDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailOriginatorSubDivisionName() {
        return mailOriginatorSubDivisionName;
    }

    /**
     * Sets the value of the mailOriginatorSubDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailOriginatorSubDivisionName(JAXBElement<String> value) {
        this.mailOriginatorSubDivisionName = value;
    }

    /**
     * Gets the value of the mailSubType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailSubType1() {
        return mailSubType1;
    }

    /**
     * Sets the value of the mailSubType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailSubType1(JAXBElement<String> value) {
        this.mailSubType1 = value;
    }

    /**
     * Gets the value of the mailSubType2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailSubType2() {
        return mailSubType2;
    }

    /**
     * Sets the value of the mailSubType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailSubType2(JAXBElement<String> value) {
        this.mailSubType2 = value;
    }

    /**
     * Gets the value of the mailSubType3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailSubType3() {
        return mailSubType3;
    }

    /**
     * Sets the value of the mailSubType3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailSubType3(JAXBElement<String> value) {
        this.mailSubType3 = value;
    }

    /**
     * Gets the value of the mailSubType4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailSubType4() {
        return mailSubType4;
    }

    /**
     * Sets the value of the mailSubType4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailSubType4(JAXBElement<String> value) {
        this.mailSubType4 = value;
    }

    /**
     * Gets the value of the mailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailType() {
        return mailType;
    }

    /**
     * Sets the value of the mailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailType(String value) {
        this.mailType = value;
    }

    /**
     * Gets the value of the mailerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMailerId() {
        return mailerId;
    }

    /**
     * Sets the value of the mailerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMailerId(Integer value) {
        this.mailerId = value;
    }

    /**
     * Gets the value of the numberOfAddressLines property.
     * 
     */
    public int getNumberOfAddressLines() {
        return numberOfAddressLines;
    }

    /**
     * Sets the value of the numberOfAddressLines property.
     * 
     */
    public void setNumberOfAddressLines(int value) {
        this.numberOfAddressLines = value;
    }

    /**
     * Gets the value of the pafResellerProduct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAFResellerProduct() {
        return pafResellerProduct;
    }

    /**
     * Sets the value of the pafResellerProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAFResellerProduct(JAXBElement<String> value) {
        this.pafResellerProduct = value;
    }

    /**
     * Gets the value of the pafResellerProductVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAFResellerProductVersion() {
        return pafResellerProductVersion;
    }

    /**
     * Sets the value of the pafResellerProductVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAFResellerProductVersion(JAXBElement<String> value) {
        this.pafResellerProductVersion = value;
    }

    /**
     * Gets the value of the pafVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPAFVersion() {
        return pafVersion;
    }

    /**
     * Sets the value of the pafVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPAFVersion(JAXBElement<String> value) {
        this.pafVersion = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the rtsdps property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRTSDPS() {
        return rtsdps;
    }

    /**
     * Sets the value of the rtsdps property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRTSDPS(JAXBElement<String> value) {
        this.rtsdps = value;
    }

    /**
     * Gets the value of the rtsPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRTSPostCode() {
        return rtsPostCode;
    }

    /**
     * Sets the value of the rtsPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRTSPostCode(JAXBElement<String> value) {
        this.rtsPostCode = value;
    }

    /**
     * Gets the value of the rtsService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRTSService() {
        return rtsService;
    }

    /**
     * Sets the value of the rtsService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRTSService(JAXBElement<String> value) {
        this.rtsService = value;
    }

    /**
     * Gets the value of the resellerUsed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResellerUsed() {
        return resellerUsed;
    }

    /**
     * Sets the value of the resellerUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResellerUsed(JAXBElement<String> value) {
        this.resellerUsed = value;
    }

    /**
     * Gets the value of the responseClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseClass() {
        return responseClass;
    }

    /**
     * Sets the value of the responseClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseClass(JAXBElement<String> value) {
        this.responseClass = value;
    }

    /**
     * Gets the value of the responseDPS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseDPS() {
        return responseDPS;
    }

    /**
     * Sets the value of the responseDPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseDPS(JAXBElement<String> value) {
        this.responseDPS = value;
    }

    /**
     * Gets the value of the responseFormat property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseFormat() {
        return responseFormat;
    }

    /**
     * Sets the value of the responseFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseFormat(JAXBElement<String> value) {
        this.responseFormat = value;
    }

    /**
     * Gets the value of the responseItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponseItemId() {
        return responseItemId;
    }

    /**
     * Sets the value of the responseItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponseItemId(Integer value) {
        this.responseItemId = value;
    }

    /**
     * Gets the value of the responseLicenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseLicenceNo() {
        return responseLicenceNo;
    }

    /**
     * Sets the value of the responseLicenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseLicenceNo(JAXBElement<String> value) {
        this.responseLicenceNo = value;
    }

    /**
     * Gets the value of the responseMailType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseMailType() {
        return responseMailType;
    }

    /**
     * Sets the value of the responseMailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseMailType(JAXBElement<String> value) {
        this.responseMailType = value;
    }

    /**
     * Gets the value of the responsePostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsePostCode() {
        return responsePostCode;
    }

    /**
     * Sets the value of the responsePostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsePostCode(JAXBElement<String> value) {
        this.responsePostCode = value;
    }

    /**
     * Gets the value of the responseSupplyChain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseSupplyChain() {
        return responseSupplyChain;
    }

    /**
     * Sets the value of the responseSupplyChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseSupplyChain(JAXBElement<String> value) {
        this.responseSupplyChain = value;
    }

    /**
     * Gets the value of the spare1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare1() {
        return spare1;
    }

    /**
     * Sets the value of the spare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare1(JAXBElement<String> value) {
        this.spare1 = value;
    }

    /**
     * Gets the value of the spare10 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare10() {
        return spare10;
    }

    /**
     * Sets the value of the spare10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare10(JAXBElement<String> value) {
        this.spare10 = value;
    }

    /**
     * Gets the value of the spare2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare2() {
        return spare2;
    }

    /**
     * Sets the value of the spare2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare2(JAXBElement<String> value) {
        this.spare2 = value;
    }

    /**
     * Gets the value of the spare3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare3() {
        return spare3;
    }

    /**
     * Sets the value of the spare3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare3(JAXBElement<String> value) {
        this.spare3 = value;
    }

    /**
     * Gets the value of the spare4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare4() {
        return spare4;
    }

    /**
     * Sets the value of the spare4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare4(JAXBElement<String> value) {
        this.spare4 = value;
    }

    /**
     * Gets the value of the spare5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare5() {
        return spare5;
    }

    /**
     * Sets the value of the spare5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare5(JAXBElement<String> value) {
        this.spare5 = value;
    }

    /**
     * Gets the value of the spare6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare6() {
        return spare6;
    }

    /**
     * Sets the value of the spare6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare6(JAXBElement<String> value) {
        this.spare6 = value;
    }

    /**
     * Gets the value of the spare7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare7() {
        return spare7;
    }

    /**
     * Sets the value of the spare7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare7(JAXBElement<String> value) {
        this.spare7 = value;
    }

    /**
     * Gets the value of the spare8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare8() {
        return spare8;
    }

    /**
     * Sets the value of the spare8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare8(String value) {
        this.spare8 = value;
    }

    /**
     * Gets the value of the spare9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpare9() {
        return spare9;
    }

    /**
     * Sets the value of the spare9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpare9(JAXBElement<String> value) {
        this.spare9 = value;
    }

    /**
     * Gets the value of the specialServiceBarcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialServiceBarcode() {
        return specialServiceBarcode;
    }

    /**
     * Sets the value of the specialServiceBarcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialServiceBarcode(JAXBElement<String> value) {
        this.specialServiceBarcode = value;
    }

    /**
     * Gets the value of the specialServiceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialServiceFlag() {
        return specialServiceFlag;
    }

    /**
     * Sets the value of the specialServiceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialServiceFlag(JAXBElement<String> value) {
        this.specialServiceFlag = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
