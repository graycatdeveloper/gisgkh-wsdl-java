
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageObjectType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManageObjectType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <sequence>
 *           <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageObjectType", propOrder = {
    "fiasHouseGuid",
    "startDate",
    "endDate"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.PlacingContract.ContractObject.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.EditContract.ContractObject.Add.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.EditContract.ContractObject.Edit.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.PlacingCharter.ContractObject.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.EditCharter.ContractObject.Add.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.EditCharter.ContractObject.Edit.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Contract.ContractObject.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Charter.ContractObject.class
})
public class ManageObjectType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Дата начала предоставления услуг
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата окончания предоставления услуг
     * 
     */
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Дата начала предоставления услуг
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
     * Дата окончания предоставления услуг
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
