
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for ContractServiceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContractServiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractServiceType", propOrder = {
    "serviceType",
    "startDate",
    "endDate"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.PlacingContract.ContractObject.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.PlacingContract.ContractObject.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.EditContract.ContractObject.Add.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.EditContract.ContractObject.Add.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.EditContract.ContractObject.Edit.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.EditContract.ContractObject.Edit.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.PlacingCharter.ContractObject.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.PlacingCharter.ContractObject.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.EditCharter.ContractObject.Add.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.EditCharter.ContractObject.Add.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.EditCharter.ContractObject.Edit.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.EditCharter.ContractObject.Edit.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Contract.ContractObject.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Contract.ContractObject.AddService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Charter.ContractObject.HouseService.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Charter.ContractObject.AddService.class
})
public class ContractServiceType {

    /**
     * Ссылка на НСИ
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected NsiRef serviceType;
    /**
     * Дата начала предоставления услуги
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата окончания предоставления услуги
     * 
     */
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Ссылка на НСИ
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(NsiRef value) {
        this.serviceType = value;
    }

    /**
     * Дата начала предоставления услуги
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата окончания предоставления услуги
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
