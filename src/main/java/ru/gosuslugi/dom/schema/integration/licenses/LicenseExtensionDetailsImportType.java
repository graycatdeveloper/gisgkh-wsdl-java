
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры для импорта записи о продлении
 * 
 * <p>Java class for LicenseExtensionDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseExtensionDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EmployeeFio" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EmployeeFioType"/>
 *         <element name="EmployeePosition" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EmployeePositionType"/>
 *         <element name="DontSendToErul" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DontSendFns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseExtensionDetailsImportType", propOrder = {
    "licenseEndDate",
    "employeeFio",
    "employeePosition",
    "dontSendToErul",
    "dontSendFns"
})
public class LicenseExtensionDetailsImportType {

    /**
     * Новая дата окончания действия лицензии
     * 
     */
    @XmlElement(name = "LicenseEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseEndDate;
    /**
     * ФИО должностного лица, подписавшего приказ о продлении лицензии
     * 
     */
    @XmlElement(name = "EmployeeFio", required = true)
    protected String employeeFio;
    /**
     * Должность лица, подписавшего приказ о продлении лицензии
     * 
     */
    @XmlElement(name = "EmployeePosition", required = true)
    protected String employeePosition;
    /**
     * Не отправлять реестровую запись в единый реестру цчета лицензий
     * 
     */
    @XmlElement(name = "DontSendToErul")
    protected Boolean dontSendToErul;
    /**
     * Не отправлять реестровую в ЕГРЮЛ/ЕГРИП
     * 
     */
    @XmlElement(name = "DontSendFns")
    protected Boolean dontSendFns;

    /**
     * Новая дата окончания действия лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseEndDate() {
        return licenseEndDate;
    }

    /**
     * Sets the value of the licenseEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLicenseEndDate()
     */
    public void setLicenseEndDate(XMLGregorianCalendar value) {
        this.licenseEndDate = value;
    }

    /**
     * ФИО должностного лица, подписавшего приказ о продлении лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeFio() {
        return employeeFio;
    }

    /**
     * Sets the value of the employeeFio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEmployeeFio()
     */
    public void setEmployeeFio(String value) {
        this.employeeFio = value;
    }

    /**
     * Должность лица, подписавшего приказ о продлении лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeePosition() {
        return employeePosition;
    }

    /**
     * Sets the value of the employeePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEmployeePosition()
     */
    public void setEmployeePosition(String value) {
        this.employeePosition = value;
    }

    /**
     * Не отправлять реестровую запись в единый реестру цчета лицензий
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontSendToErul() {
        return dontSendToErul;
    }

    /**
     * Sets the value of the dontSendToErul property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDontSendToErul()
     */
    public void setDontSendToErul(Boolean value) {
        this.dontSendToErul = value;
    }

    /**
     * Не отправлять реестровую в ЕГРЮЛ/ЕГРИП
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontSendFns() {
        return dontSendFns;
    }

    /**
     * Sets the value of the dontSendFns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDontSendFns()
     */
    public void setDontSendFns(Boolean value) {
        this.dontSendFns = value;
    }

}
