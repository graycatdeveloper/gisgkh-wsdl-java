
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Terminate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateType", propOrder = {
    "terminate"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.TerminateContract.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.TerminateCharter.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportSupplyResourceContractRequest.Contract.TerminateContract.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Contract.Terminate.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Charter.Terminate.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportBriefSocialHireContractResultType.TerminateContract.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportSupplyResourceContractResultType.TerminateContract.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportBriefSupplyResourceContractResultType.TerminateContract.class
})
public class TerminateType {

    /**
     * Дата расторжения, прекращения действия устава
     * 
     */
    @XmlElement(name = "Terminate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminate;

    /**
     * Дата расторжения, прекращения действия устава
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminate() {
        return terminate;
    }

    /**
     * Sets the value of the terminate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTerminate()
     */
    public void setTerminate(XMLGregorianCalendar value) {
        this.terminate = value;
    }

}
