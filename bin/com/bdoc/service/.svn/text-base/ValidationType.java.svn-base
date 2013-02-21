
package com.bdoc.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="validationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANCEL_ASSEMBLY"/>
 *     &lt;enumeration value="CONTINUE"/>
 *     &lt;enumeration value="VALIDATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "validationType")
@XmlEnum
public enum ValidationType {

    CANCEL_ASSEMBLY,
    CONTINUE,
    VALIDATE;

    public String value() {
        return name();
    }

    public static ValidationType fromValue(String v) {
        return valueOf(v);
    }

}
