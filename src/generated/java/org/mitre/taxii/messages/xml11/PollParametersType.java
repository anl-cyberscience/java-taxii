
package org.mitre.taxii.messages.xml11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains parameters for a Poll Request
 * 
 * <p>Java class for PollParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response_Type" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ResponseTypeEnum" minOccurs="0"/>
 *         &lt;element name="Content_Binding" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ContentBindingIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Query" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}QueryType" minOccurs="0"/>
 *         &lt;element name="Delivery_Parameters" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}PushParameterType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="allow_asynch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollParametersType", propOrder = {
    "responseType",
    "contentBinding",
    "query",
    "deliveryParameters"
})
public class PollParametersType {

    @XmlElement(name = "Response_Type", defaultValue = "FULL")
    protected ResponseTypeEnum responseType;
    @XmlElement(name = "Content_Binding")
    protected List<ContentBindingIDType> contentBinding;
    @XmlElement(name = "Query")
    protected QueryType query;
    @XmlElement(name = "Delivery_Parameters")
    protected PushParameterType deliveryParameters;
    @XmlAttribute(name = "allow_asynch")
    protected Boolean allowAsynch;

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeEnum }
     *     
     */
    public ResponseTypeEnum getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeEnum }
     *     
     */
    public void setResponseType(ResponseTypeEnum value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the contentBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentBindingIDType }
     * 
     * 
     */
    public List<ContentBindingIDType> getContentBinding() {
        if (contentBinding == null) {
            contentBinding = new ArrayList<ContentBindingIDType>();
        }
        return this.contentBinding;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType }
     *     
     */
    public QueryType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType }
     *     
     */
    public void setQuery(QueryType value) {
        this.query = value;
    }

    /**
     * Gets the value of the deliveryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PushParameterType }
     *     
     */
    public PushParameterType getDeliveryParameters() {
        return deliveryParameters;
    }

    /**
     * Sets the value of the deliveryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PushParameterType }
     *     
     */
    public void setDeliveryParameters(PushParameterType value) {
        this.deliveryParameters = value;
    }

    /**
     * Gets the value of the allowAsynch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowAsynch() {
        if (allowAsynch == null) {
            return false;
        } else {
            return allowAsynch;
        }
    }

    /**
     * Sets the value of the allowAsynch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAsynch(Boolean value) {
        this.allowAsynch = value;
    }

}