
package ru.gosuslugi.dom.schema.integration.licenses;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат экспорта информации о лицензиях на управление многоквартирными домами
 * 
 * <p>Java class for exportLicenseResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportLicenseResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseType">
 *       <sequence>
 *         <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="LicenseVersion" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         <element name="ErulNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulNumberType" minOccurs="0"/>
 *         <element name="TempNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}TempNumberType" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="ApplicationMethod" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ApplicationMethodType" minOccurs="0"/>
 *           <element name="ApplicationNumber" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="100"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportLicenseResultType", propOrder = {
    "licenseGUID",
    "licenseVersion",
    "erulNumber",
    "tempNumber",
    "applicationMethod",
    "applicationNumber",
    "applicationDate"
})
public class ExportLicenseResultType
    extends LicenseType
{

    /**
     * Идентификатор лицензии в системе
     * 
     */
    @XmlElement(name = "LicenseGUID", required = true)
    protected String licenseGUID;
    /**
     * Версия лицензии
     * 
     */
    @XmlElement(name = "LicenseVersion", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger licenseVersion;
    /**
     * Номер лицензии по ЕРУЛ. Актуально только для версий, начиная с 14.3.0.2
     * 
     */
    @XmlElement(name = "ErulNumber")
    protected String erulNumber;
    /**
     * Временный номер лицензии Актуально только для версий, начиная с 14.3.0.2
     * 
     */
    @XmlElement(name = "TempNumber")
    protected String tempNumber;
    /**
     * Способ подачи заявления о предоставлении лицензии
     * 
     */
    @XmlElement(name = "ApplicationMethod")
    @XmlSchemaType(name = "string")
    protected ApplicationMethodType applicationMethod;
    /**
     * Номер заявления на предоставление лицензии
     * 
     */
    @XmlElement(name = "ApplicationNumber")
    protected String applicationNumber;
    /**
     * Дата заявления на предоставление лицензии
     * 
     */
    @XmlElement(name = "ApplicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar applicationDate;

    /**
     * Идентификатор лицензии в системе
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseGUID() {
        return licenseGUID;
    }

    /**
     * Sets the value of the licenseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicenseGUID()
     */
    public void setLicenseGUID(String value) {
        this.licenseGUID = value;
    }

    /**
     * Версия лицензии
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLicenseVersion() {
        return licenseVersion;
    }

    /**
     * Sets the value of the licenseVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLicenseVersion()
     */
    public void setLicenseVersion(BigInteger value) {
        this.licenseVersion = value;
    }

    /**
     * Номер лицензии по ЕРУЛ. Актуально только для версий, начиная с 14.3.0.2
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErulNumber() {
        return erulNumber;
    }

    /**
     * Sets the value of the erulNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErulNumber()
     */
    public void setErulNumber(String value) {
        this.erulNumber = value;
    }

    /**
     * Временный номер лицензии Актуально только для версий, начиная с 14.3.0.2
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempNumber() {
        return tempNumber;
    }

    /**
     * Sets the value of the tempNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTempNumber()
     */
    public void setTempNumber(String value) {
        this.tempNumber = value;
    }

    /**
     * Способ подачи заявления о предоставлении лицензии
     * 
     * @return
     *     possible object is
     *     {@link ApplicationMethodType }
     *     
     */
    public ApplicationMethodType getApplicationMethod() {
        return applicationMethod;
    }

    /**
     * Sets the value of the applicationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationMethodType }
     *     
     * @see #getApplicationMethod()
     */
    public void setApplicationMethod(ApplicationMethodType value) {
        this.applicationMethod = value;
    }

    /**
     * Номер заявления на предоставление лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicationNumber()
     */
    public void setApplicationNumber(String value) {
        this.applicationNumber = value;
    }

    /**
     * Дата заявления на предоставление лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getApplicationDate()
     */
    public void setApplicationDate(XMLGregorianCalendar value) {
        this.applicationDate = value;
    }

}
