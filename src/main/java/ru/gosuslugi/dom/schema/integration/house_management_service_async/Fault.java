
package ru.gosuslugi.dom.schema.integration.house_management_service_async;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "Fault", targetNamespace = "http://dom.gosuslugi.ru/schema/integration/base/")
public class Fault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ru.gosuslugi.dom.schema.integration.base.Fault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Fault(String message, ru.gosuslugi.dom.schema.integration.base.Fault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public Fault(String message, ru.gosuslugi.dom.schema.integration.base.Fault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ru.gosuslugi.dom.schema.integration.base.Fault
     */
    public ru.gosuslugi.dom.schema.integration.base.Fault getFaultInfo() {
        return faultInfo;
    }

}
