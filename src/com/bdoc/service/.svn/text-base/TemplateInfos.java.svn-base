
package com.bdoc.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for templateInfos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="templateInfos">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.bdoc.com/}template">
 *       &lt;sequence>
 *         &lt;element name="dataStreamName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="htmlPreview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nodeItems" type="{http://service.bdoc.com/}nodeItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="technicalEntities" type="{http://service.bdoc.com/}technicalEntity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="translateDescriptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templateInfos", propOrder = {
    "dataStreamName",
    "domainName",
    "htmlPreview",
    "nodeItems",
    "technicalEntities",
    "translateDescriptions",
    "type"
})
public class TemplateInfos
    extends Template
{

    protected String dataStreamName;
    protected String domainName;
    protected String htmlPreview;
    @XmlElement(nillable = true)
    protected List<NodeItem> nodeItems;
    @XmlElement(nillable = true)
    protected List<TechnicalEntity> technicalEntities;
    @XmlElement(required = true)
    protected TemplateInfos.TranslateDescriptions translateDescriptions;
    protected int type;

    /**
     * Gets the value of the dataStreamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataStreamName() {
        return dataStreamName;
    }

    /**
     * Sets the value of the dataStreamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataStreamName(String value) {
        this.dataStreamName = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the htmlPreview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlPreview() {
        return htmlPreview;
    }

    /**
     * Sets the value of the htmlPreview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlPreview(String value) {
        this.htmlPreview = value;
    }

    /**
     * Gets the value of the nodeItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeItem }
     * 
     * 
     */
    public List<NodeItem> getNodeItems() {
        if (nodeItems == null) {
            nodeItems = new ArrayList<NodeItem>();
        }
        return this.nodeItems;
    }

    /**
     * Gets the value of the technicalEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalEntity }
     * 
     * 
     */
    public List<TechnicalEntity> getTechnicalEntities() {
        if (technicalEntities == null) {
            technicalEntities = new ArrayList<TechnicalEntity>();
        }
        return this.technicalEntities;
    }

    /**
     * Gets the value of the translateDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateInfos.TranslateDescriptions }
     *     
     */
    public TemplateInfos.TranslateDescriptions getTranslateDescriptions() {
        return translateDescriptions;
    }

    /**
     * Sets the value of the translateDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateInfos.TranslateDescriptions }
     *     
     */
    public void setTranslateDescriptions(TemplateInfos.TranslateDescriptions value) {
        this.translateDescriptions = value;
    }

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }


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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class TranslateDescriptions {

        protected List<TemplateInfos.TranslateDescriptions.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TemplateInfos.TranslateDescriptions.Entry }
         * 
         * 
         */
        public List<TemplateInfos.TranslateDescriptions.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<TemplateInfos.TranslateDescriptions.Entry>();
            }
            return this.entry;
        }


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
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "key",
            "value"
        })
        public static class Entry {

            protected String key;
            protected String value;

            /**
             * Gets the value of the key property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
