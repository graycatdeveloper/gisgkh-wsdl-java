
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;


/**
 * Параметры записи о предоставлении или о внесении изменений в лицнезию
 * 
 * <p>Java class for LicenseEntryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseEntryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ErulNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulNumberType" minOccurs="0"/>
 *         <element name="TempNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}TempNumberType" minOccurs="0"/>
 *         <element name="TempNumberDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType"/>
 *         <element name="LicenseRegDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="LicenseStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="LicenseEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="LicensingAuthority">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice minOccurs="0">
 *           <element name="LicensedActivityHouseFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <element name="LicensedActivityAddressFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </choice>
 *         <element name="LicensableTypeOfActivity" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType"/>
 *         <element name="LicenseOrganization">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseOrganizationType">
 *                 <sequence>
 *                   <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseePhoneType" minOccurs="0"/>
 *                   <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseeEmailType" minOccurs="0"/>
 *                   <element name="LicenseeComplianceAssessment" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="DateComplianceAssessment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="IdentityDocument" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             <element name="Series" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="45"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Number">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="45"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             <element name="IssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <choice minOccurs="0">
 *                     <element name="ResidenceHouseFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="ResidenceAddressFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "LicenseEntryType", propOrder = {
    "erulNumber",
    "tempNumber",
    "tempNumberDate",
    "licenseNumber",
    "licenseRegDate",
    "licenseStartDate",
    "licenseEndDate",
    "licensingAuthority",
    "licensedActivityHouseFIASGuid",
    "licensedActivityAddressFIASGuid",
    "licensableTypeOfActivity",
    "licenseOrganization",
    "employeeFio",
    "employeePosition"
})
public class LicenseEntryType {

    /**
     * Номер лицензии по ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulNumber")
    protected String erulNumber;
    /**
     * Временный номер лицензии
     * 
     */
    @XmlElement(name = "TempNumber")
    protected String tempNumber;
    /**
     * Дата присвоения временного номера
     * 
     */
    @XmlElement(name = "TempNumberDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempNumberDate;
    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     */
    @XmlElement(name = "LicenseNumber", required = true)
    protected String licenseNumber;
    /**
     * Дата регистрации лицензии
     * 
     */
    @XmlElement(name = "LicenseRegDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseRegDate;
    /**
     * Дата начала действия лицензии
     * 
     */
    @XmlElement(name = "LicenseStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseStartDate;
    /**
     * Дата окончания действия лицензии
     * 
     */
    @XmlElement(name = "LicenseEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseEndDate;
    /**
     * Лицензирующий орган
     * 
     */
    @XmlElement(name = "LicensingAuthority", required = true)
    protected LicenseEntryType.LicensingAuthority licensingAuthority;
    /**
     * Адрес осуществления лицензируемого вида деятельности. Код дома по ФИАС
     * 
     */
    @XmlElement(name = "LicensedActivityHouseFIASGuid")
    protected String licensedActivityHouseFIASGuid;
    /**
     * Адрес осуществления лицензируемого вида деятельности. Код адресного элемента по ФИАС. Заполняется в случае когда адрес указан не до дома.
     * 
     */
    @XmlElement(name = "LicensedActivityAddressFIASGuid")
    protected String licensedActivityAddressFIASGuid;
    /**
     * Лицензируемый вид деятельности с указанием выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности
     * 
     */
    @XmlElement(name = "LicensableTypeOfActivity", required = true)
    protected String licensableTypeOfActivity;
    /**
     * Информация о лицензиате
     * 
     */
    @XmlElement(name = "LicenseOrganization", required = true)
    protected LicenseEntryType.LicenseOrganization licenseOrganization;
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
     * Номер лицензии по ЕРУЛ
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
     * Временный номер лицензии
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
     * Дата присвоения временного номера
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempNumberDate() {
        return tempNumberDate;
    }

    /**
     * Sets the value of the tempNumberDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTempNumberDate()
     */
    public void setTempNumberDate(XMLGregorianCalendar value) {
        this.tempNumberDate = value;
    }

    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicenseNumber()
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

    /**
     * Дата регистрации лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseRegDate() {
        return licenseRegDate;
    }

    /**
     * Sets the value of the licenseRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLicenseRegDate()
     */
    public void setLicenseRegDate(XMLGregorianCalendar value) {
        this.licenseRegDate = value;
    }

    /**
     * Дата начала действия лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseStartDate() {
        return licenseStartDate;
    }

    /**
     * Sets the value of the licenseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLicenseStartDate()
     */
    public void setLicenseStartDate(XMLGregorianCalendar value) {
        this.licenseStartDate = value;
    }

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
     * Лицензирующий орган
     * 
     * @return
     *     possible object is
     *     {@link LicenseEntryType.LicensingAuthority }
     *     
     */
    public LicenseEntryType.LicensingAuthority getLicensingAuthority() {
        return licensingAuthority;
    }

    /**
     * Sets the value of the licensingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseEntryType.LicensingAuthority }
     *     
     * @see #getLicensingAuthority()
     */
    public void setLicensingAuthority(LicenseEntryType.LicensingAuthority value) {
        this.licensingAuthority = value;
    }

    /**
     * Адрес осуществления лицензируемого вида деятельности. Код дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensedActivityHouseFIASGuid() {
        return licensedActivityHouseFIASGuid;
    }

    /**
     * Sets the value of the licensedActivityHouseFIASGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicensedActivityHouseFIASGuid()
     */
    public void setLicensedActivityHouseFIASGuid(String value) {
        this.licensedActivityHouseFIASGuid = value;
    }

    /**
     * Адрес осуществления лицензируемого вида деятельности. Код адресного элемента по ФИАС. Заполняется в случае когда адрес указан не до дома.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensedActivityAddressFIASGuid() {
        return licensedActivityAddressFIASGuid;
    }

    /**
     * Sets the value of the licensedActivityAddressFIASGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicensedActivityAddressFIASGuid()
     */
    public void setLicensedActivityAddressFIASGuid(String value) {
        this.licensedActivityAddressFIASGuid = value;
    }

    /**
     * Лицензируемый вид деятельности с указанием выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicensableTypeOfActivity() {
        return licensableTypeOfActivity;
    }

    /**
     * Sets the value of the licensableTypeOfActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicensableTypeOfActivity()
     */
    public void setLicensableTypeOfActivity(String value) {
        this.licensableTypeOfActivity = value;
    }

    /**
     * Информация о лицензиате
     * 
     * @return
     *     possible object is
     *     {@link LicenseEntryType.LicenseOrganization }
     *     
     */
    public LicenseEntryType.LicenseOrganization getLicenseOrganization() {
        return licenseOrganization;
    }

    /**
     * Sets the value of the licenseOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseEntryType.LicenseOrganization }
     *     
     * @see #getLicenseOrganization()
     */
    public void setLicenseOrganization(LicenseEntryType.LicenseOrganization value) {
        this.licenseOrganization = value;
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseOrganizationType">
     *       <sequence>
     *         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseePhoneType" minOccurs="0"/>
     *         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseeEmailType" minOccurs="0"/>
     *         <element name="LicenseeComplianceAssessment" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="DateComplianceAssessment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="IdentityDocument" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   <element name="Series" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="45"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Number">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="45"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   <element name="IssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <choice minOccurs="0">
     *           <element name="ResidenceHouseFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="ResidenceAddressFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phone",
        "email",
        "licenseeComplianceAssessment",
        "dateComplianceAssessment",
        "identityDocument",
        "address",
        "residenceHouseFIASGuid",
        "residenceAddressFIASGuid"
    })
    public static class LicenseOrganization
        extends LicenseOrganizationType
    {

        /**
         * Телефон лицензиата
         * 
         */
        @XmlElement(name = "Phone")
        protected String phone;
        /**
         * Адрес электронной почты лицензиата
         * 
         */
        @XmlElement(name = "Email")
        protected String email;
        /**
         * Информация о проведении оценки соответствия лицензиата
         * 
         */
        @XmlElement(name = "LicenseeComplianceAssessment")
        protected String licenseeComplianceAssessment;
        /**
         * Дата проведения оценки соответствия лицензиата
         * 
         */
        @XmlElement(name = "DateComplianceAssessment")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateComplianceAssessment;
        /**
         * Документ, удостоверяющий личность. Заполняется только для лицензиата-ИП
         * 
         */
        @XmlElement(name = "IdentityDocument")
        protected LicenseEntryType.LicenseOrganization.IdentityDocument identityDocument;
        /**
         * Адрес места жительства для ИП
         * 
         */
        @XmlElement(name = "Address")
        protected String address;
        /**
         * Адрес места жительства для ИП (Глобальный уникальный идентификатор дома по ФИАС)
         * 
         */
        @XmlElement(name = "ResidenceHouseFIASGuid")
        protected String residenceHouseFIASGuid;
        /**
         * Адрес места жительства для ИП (Глобальный уникальный идентификатор дома по ФИАС)
         * 
         */
        @XmlElement(name = "ResidenceAddressFIASGuid")
        protected String residenceAddressFIASGuid;

        /**
         * Телефон лицензиата
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPhone()
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Адрес электронной почты лицензиата
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getEmail()
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Информация о проведении оценки соответствия лицензиата
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseeComplianceAssessment() {
            return licenseeComplianceAssessment;
        }

        /**
         * Sets the value of the licenseeComplianceAssessment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLicenseeComplianceAssessment()
         */
        public void setLicenseeComplianceAssessment(String value) {
            this.licenseeComplianceAssessment = value;
        }

        /**
         * Дата проведения оценки соответствия лицензиата
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateComplianceAssessment() {
            return dateComplianceAssessment;
        }

        /**
         * Sets the value of the dateComplianceAssessment property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateComplianceAssessment()
         */
        public void setDateComplianceAssessment(XMLGregorianCalendar value) {
            this.dateComplianceAssessment = value;
        }

        /**
         * Документ, удостоверяющий личность. Заполняется только для лицензиата-ИП
         * 
         * @return
         *     possible object is
         *     {@link LicenseEntryType.LicenseOrganization.IdentityDocument }
         *     
         */
        public LicenseEntryType.LicenseOrganization.IdentityDocument getIdentityDocument() {
            return identityDocument;
        }

        /**
         * Sets the value of the identityDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link LicenseEntryType.LicenseOrganization.IdentityDocument }
         *     
         * @see #getIdentityDocument()
         */
        public void setIdentityDocument(LicenseEntryType.LicenseOrganization.IdentityDocument value) {
            this.identityDocument = value;
        }

        /**
         * Адрес места жительства для ИП
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAddress()
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Адрес места жительства для ИП (Глобальный уникальный идентификатор дома по ФИАС)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidenceHouseFIASGuid() {
            return residenceHouseFIASGuid;
        }

        /**
         * Sets the value of the residenceHouseFIASGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getResidenceHouseFIASGuid()
         */
        public void setResidenceHouseFIASGuid(String value) {
            this.residenceHouseFIASGuid = value;
        }

        /**
         * Адрес места жительства для ИП (Глобальный уникальный идентификатор дома по ФИАС)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidenceAddressFIASGuid() {
            return residenceAddressFIASGuid;
        }

        /**
         * Sets the value of the residenceAddressFIASGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getResidenceAddressFIASGuid()
         */
        public void setResidenceAddressFIASGuid(String value) {
            this.residenceAddressFIASGuid = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element name="Series" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="45"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Number">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="45"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         <element name="IssuedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "series",
            "number",
            "issueDate",
            "issuedBy"
        })
        public static class IdentityDocument {

            /**
             * Документ, удостоверяющий личность  (НСИ 95)
             * 
             */
            @XmlElement(name = "Type", required = true)
            protected NsiRef type;
            /**
             * Серия документа
             * 
             */
            @XmlElement(name = "Series")
            protected String series;
            /**
             * Номер документа
             * 
             */
            @XmlElement(name = "Number", required = true)
            protected String number;
            /**
             * Дата выдачи документа
             * 
             */
            @XmlElement(name = "IssueDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar issueDate;
            /**
             * Кем выдан документ
             * 
             */
            @XmlElement(name = "IssuedBy", required = true)
            protected String issuedBy;

            /**
             * Документ, удостоверяющий личность  (НСИ 95)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getType()
             */
            public void setType(NsiRef value) {
                this.type = value;
            }

            /**
             * Серия документа
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeries() {
                return series;
            }

            /**
             * Sets the value of the series property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getSeries()
             */
            public void setSeries(String value) {
                this.series = value;
            }

            /**
             * Номер документа
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getNumber()
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Дата выдачи документа
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getIssueDate() {
                return issueDate;
            }

            /**
             * Sets the value of the issueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getIssueDate()
             */
            public void setIssueDate(XMLGregorianCalendar value) {
                this.issueDate = value;
            }

            /**
             * Кем выдан документ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIssuedBy() {
                return issuedBy;
            }

            /**
             * Sets the value of the issuedBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getIssuedBy()
             */
            public void setIssuedBy(String value) {
                this.issuedBy = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LicensingAuthority
        extends LegalType
    {


    }

}
