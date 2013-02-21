
package com.bdoc.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "BDocWebException", targetNamespace = "http://service.bdoc.com/")
public class BDocWebException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BDocWebException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public BDocWebException_Exception(String message, BDocWebException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public BDocWebException_Exception(String message, BDocWebException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.bdoc.service.BDocWebException
     */
    public BDocWebException getFaultInfo() {
        return faultInfo;
    }

}