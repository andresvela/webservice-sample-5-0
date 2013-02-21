
package com.bdoc.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputDataForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputDataForm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.bdoc.com/}interactionForm">
 *       &lt;sequence>
 *         &lt;element name="dataFields" type="{http://service.bdoc.com/}dataField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputDataForm", propOrder = {
    "dataFields"
})
public class InputDataForm
    extends InteractionForm
{

    @XmlElement(nillable = true)
    protected List<DataField> dataFields;

    /**
     * Gets the value of the dataFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataField }
     * 
     * 
     */
    public List<DataField> getDataFields() {
        if (dataFields == null) {
            dataFields = new ArrayList<DataField>();
        }
        return this.dataFields;
    }

}
