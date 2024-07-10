
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Параметры для импорта записи о предоставлении или о внесении изменений в лицензию
 * 
 * <p>Java class for LicenseEntryImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseEntryImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ErulNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulNumberType" minOccurs="0"/>
 *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType"/>
 *         <element name="LicenseStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="LicenseEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <sequence minOccurs="0">
 *           <element name="ApplicationMethod" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ApplicationMethodType"/>
 *           <element name="ApplicationNumber">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="100"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="ApplicationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         </sequence>
 *         <choice>
 *           <element name="LicensedActivityHouseFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="LicensedActivityAddressFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </choice>
 *         <element name="LicenseOrganization">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                 <sequence>
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
 *                   <element name="StateRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <choice minOccurs="0">
 *                     <element name="ResidenceHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="ResidenceAddressGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
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
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "LicenseEntryImportType", propOrder = {
    "erulNumber",
    "licenseNumber",
    "licenseStartDate",
    "licenseEndDate",
    "applicationMethod",
    "applicationNumber",
    "applicationDate",
    "licensedActivityHouseFIASGuid",
    "licensedActivityAddressFIASGuid",
    "licenseOrganization",
    "employeeFio",
    "employeePosition",
    "dontSendToErul",
    "dontSendFns"
})
public class LicenseEntryImportType {

    /**
     * Номер лицензии по ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulNumber")
    protected String erulNumber;
    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     */
    @XmlElement(name = "LicenseNumber", required = true)
    protected String licenseNumber;
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
     * Адрес осуществления лицензируемого вида деятельности. Глобальный уникальный идентификатор дома по ФИАС. Заполняется, если не указан идентификатор адресного объекта
     * 
     */
    @XmlElement(name = "LicensedActivityHouseFIASGuid")
    protected String licensedActivityHouseFIASGuid;
    /**
     * Адрес осуществления лицензируемого вида деятельности. Глобальный уникальный идентификатор адреса по ФИАС. Заполняется, если необходимо указать адрес не до дома.
     * 
     */
    @XmlElement(name = "LicensedActivityAddressFIASGuid")
    protected String licensedActivityAddressFIASGuid;
    /**
     * Информация о лицензиате
     * 
     */
    @XmlElement(name = "LicenseOrganization", required = true)
    protected LicenseEntryImportType.LicenseOrganization licenseOrganization;
    /**
     * ФИО должностного лица, подписавшего приказ о предоставлении/изменении лицензии
     * 
     */
    @XmlElement(name = "EmployeeFio", required = true)
    protected String employeeFio;
    /**
     * Должность лица, подписавшего приказ о предоставлении/изменении лицензии
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

    /**
     * Адрес осуществления лицензируемого вида деятельности. Глобальный уникальный идентификатор дома по ФИАС. Заполняется, если не указан идентификатор адресного объекта
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
     * Адрес осуществления лицензируемого вида деятельности. Глобальный уникальный идентификатор адреса по ФИАС. Заполняется, если необходимо указать адрес не до дома.
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
     * Информация о лицензиате
     * 
     * @return
     *     possible object is
     *     {@link LicenseEntryImportType.LicenseOrganization }
     *     
     */
    public LicenseEntryImportType.LicenseOrganization getLicenseOrganization() {
        return licenseOrganization;
    }

    /**
     * Sets the value of the licenseOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseEntryImportType.LicenseOrganization }
     *     
     * @see #getLicenseOrganization()
     */
    public void setLicenseOrganization(LicenseEntryImportType.LicenseOrganization value) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *       <sequence>
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
     *         <element name="StateRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <choice minOccurs="0">
     *           <element name="ResidenceHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="ResidenceAddressGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
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
        "identityDocument",
        "stateRegistrationDate",
        "residenceHouseGuid",
        "residenceAddressGuid",
        "phone",
        "email",
        "licenseeComplianceAssessment",
        "dateComplianceAssessment"
    })
    public static class LicenseOrganization
        extends RegOrgType
    {

        /**
         * Документ, удостоверяющий личность. Заполняется только для лицензиата-ИП
         * 
         */
        @XmlElement(name = "IdentityDocument")
        protected LicenseEntryImportType.LicenseOrganization.IdentityDocument identityDocument;
        /**
         * Дата государственной регистрации
         * 
         */
        @XmlElement(name = "StateRegistrationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stateRegistrationDate;
        /**
         * Адрес места нахождения/Адрес места жительства. Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "ResidenceHouseGuid")
        protected String residenceHouseGuid;
        /**
         * Адрес места нахождения/Адрес места жительства. Глобальный уникальный идентификатор адреса по ФИАС. Заполняется, если необходимо указать адрес не до дома.
         * 
         */
        @XmlElement(name = "ResidenceAddressGuid")
        protected String residenceAddressGuid;
        /**
         * Номер телефона лицензиата
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
         * @return
         *     possible object is
         *     {@link LicenseEntryImportType.LicenseOrganization.IdentityDocument }
         *     
         */
        public LicenseEntryImportType.LicenseOrganization.IdentityDocument getIdentityDocument() {
            return identityDocument;
        }

        /**
         * Sets the value of the identityDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link LicenseEntryImportType.LicenseOrganization.IdentityDocument }
         *     
         * @see #getIdentityDocument()
         */
        public void setIdentityDocument(LicenseEntryImportType.LicenseOrganization.IdentityDocument value) {
            this.identityDocument = value;
        }

        /**
         * Дата государственной регистрации
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStateRegistrationDate() {
            return stateRegistrationDate;
        }

        /**
         * Sets the value of the stateRegistrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getStateRegistrationDate()
         */
        public void setStateRegistrationDate(XMLGregorianCalendar value) {
            this.stateRegistrationDate = value;
        }

        /**
         * Адрес места нахождения/Адрес места жительства. Глобальный уникальный идентификатор дома по ФИАС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidenceHouseGuid() {
            return residenceHouseGuid;
        }

        /**
         * Sets the value of the residenceHouseGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getResidenceHouseGuid()
         */
        public void setResidenceHouseGuid(String value) {
            this.residenceHouseGuid = value;
        }

        /**
         * Адрес места нахождения/Адрес места жительства. Глобальный уникальный идентификатор адреса по ФИАС. Заполняется, если необходимо указать адрес не до дома.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidenceAddressGuid() {
            return residenceAddressGuid;
        }

        /**
         * Sets the value of the residenceAddressGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getResidenceAddressGuid()
         */
        public void setResidenceAddressGuid(String value) {
            this.residenceAddressGuid = value;
        }

        /**
         * Номер телефона лицензиата
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

}
