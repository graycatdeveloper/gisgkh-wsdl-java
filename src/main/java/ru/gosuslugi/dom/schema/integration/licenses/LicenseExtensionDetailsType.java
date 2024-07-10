
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры записи о продлении
 * 
 * <p>Java class for LicenseExtensionDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseExtensionDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EmployeeFio" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EmployeeFioType" minOccurs="0"/>
 *         <element name="EmployeePosition" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EmployeePositionType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseExtensionDetailsType", propOrder = {
    "licenseEndDate",
    "employeeFio",
    "employeePosition"
})
public class LicenseExtensionDetailsType {

    /**
     * Дата окончания действия лицензии
     * 
     */
    @XmlElement(name = "LicenseEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseEndDate;
    /**
     * ФИО должностного лица, подписавшего приказ о предоставлении/изменении лицензии
     * 
     */
    @XmlElement(name = "EmployeeFio")
    protected String employeeFio;
    /**
     * Должность лица, подписавшего приказ о предоставлении/изменении лицензии
     * 
     */
    @XmlElement(name = "EmployeePosition")
    protected String employeePosition;

    /**
     * Дата окончания действия лицензии
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
     * ФИО должностного лица, подписавшего приказ о предоставлении/изменении лицензии
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
     * Должность лица, подписавшего приказ о предоставлении/изменении лицензии
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

}
