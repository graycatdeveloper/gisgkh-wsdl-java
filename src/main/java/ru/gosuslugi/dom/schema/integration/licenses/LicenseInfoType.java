
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.RegionType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;


/**
 * Общая инфомрация о лицензии
 * 
 * <p>Java class for LicenseInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ErulNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulNumberType" minOccurs="0"/>
 *         <element name="ErulNumberDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="TempNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}TempNumberType" minOccurs="0"/>
 *         <element name="TempNumberDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType"/>
 *         <element name="LicenseRegDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="LicenseStatus" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseStatusType"/>
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
 *         <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
 *         <choice minOccurs="0">
 *           <element name="LicensedActivityHouseFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <element name="LicensedActivityAddressFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </choice>
 *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
 *         <element name="LicenseOrganization">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseOrganizationType">
 *                 <sequence>
 *                   <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseePhoneType" minOccurs="0"/>
 *                   <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseeEmailType" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ProvidingOrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}OrderNumberType" minOccurs="0"/>
 *         <element name="ProvidingOrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="UpdateOrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}OrderNumberType" minOccurs="0"/>
 *         <element name="UpdateOrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="ProlongationOrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}OrderNumberType" minOccurs="0"/>
 *         <element name="ProlongationOrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseInfoType", propOrder = {
    "erulNumber",
    "erulNumberDate",
    "tempNumber",
    "tempNumberDate",
    "licenseNumber",
    "licenseRegDate",
    "licenseStatus",
    "licenseStartDate",
    "licenseEndDate",
    "licensingAuthority",
    "region",
    "licensedActivityHouseFIASGuid",
    "licensedActivityAddressFIASGuid",
    "additionalInformation",
    "licenseOrganization",
    "providingOrderNumber",
    "providingOrderDate",
    "updateOrderNumber",
    "updateOrderDate",
    "prolongationOrderNumber",
    "prolongationOrderDate"
})
public class LicenseInfoType {

    /**
     * Номер лицензии по ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulNumber")
    protected String erulNumber;
    /**
     * Дата присвоения номера по ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulNumberDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar erulNumberDate;
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
     * Статус лицензии:    
     *     Active - включена в реестр, действующая
     *     Expired - Истек срок действия
     *     Canceled - аннулирована
     *     Terminated - Прекращено действие лицензии
     *     Deactualized - Лицензия деактуализирована
     *     Project - Проект (получение номера в ЕРУЛ)
     * 
     */
    @XmlElement(name = "LicenseStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LicenseStatusType licenseStatus;
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
    protected LicenseInfoType.LicensingAuthority licensingAuthority;
    /**
     * Субъект РФ, на который выдана лицензия
     * 
     */
    @XmlElement(name = "Region", required = true)
    protected RegionType region;
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
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Информация о лицензиате
     * 
     */
    @XmlElement(name = "LicenseOrganization", required = true)
    protected LicenseInfoType.LicenseOrganization licenseOrganization;
    /**
     * Номер приказа о предоставлении лицензии
     * 
     */
    @XmlElement(name = "ProvidingOrderNumber")
    protected String providingOrderNumber;
    /**
     * Дата приказа о предоставлении лицензии
     * 
     */
    @XmlElement(name = "ProvidingOrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar providingOrderDate;
    /**
     * Номер приказа о внесении изменений в лицензию (последнее изменение)
     * 
     */
    @XmlElement(name = "UpdateOrderNumber")
    protected String updateOrderNumber;
    /**
     * Дата приказа  о внесении изменений в лицензию (последнее изменение)
     * 
     */
    @XmlElement(name = "UpdateOrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateOrderDate;
    /**
     * Номер приказа о продлении лицнезии (последнее продление)
     * 
     */
    @XmlElement(name = "ProlongationOrderNumber")
    protected String prolongationOrderNumber;
    /**
     * Дата приказа  о продлении лицнезии (последнее продление)
     * 
     */
    @XmlElement(name = "ProlongationOrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prolongationOrderDate;

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
     * Дата присвоения номера по ЕРУЛ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErulNumberDate() {
        return erulNumberDate;
    }

    /**
     * Sets the value of the erulNumberDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getErulNumberDate()
     */
    public void setErulNumberDate(XMLGregorianCalendar value) {
        this.erulNumberDate = value;
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
     * Статус лицензии:    
     *     Active - включена в реестр, действующая
     *     Expired - Истек срок действия
     *     Canceled - аннулирована
     *     Terminated - Прекращено действие лицензии
     *     Deactualized - Лицензия деактуализирована
     *     Project - Проект (получение номера в ЕРУЛ)
     * 
     * @return
     *     possible object is
     *     {@link LicenseStatusType }
     *     
     */
    public LicenseStatusType getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseStatusType }
     *     
     * @see #getLicenseStatus()
     */
    public void setLicenseStatus(LicenseStatusType value) {
        this.licenseStatus = value;
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
     *     {@link LicenseInfoType.LicensingAuthority }
     *     
     */
    public LicenseInfoType.LicensingAuthority getLicensingAuthority() {
        return licensingAuthority;
    }

    /**
     * Sets the value of the licensingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseInfoType.LicensingAuthority }
     *     
     * @see #getLicensingAuthority()
     */
    public void setLicensingAuthority(LicenseInfoType.LicensingAuthority value) {
        this.licensingAuthority = value;
    }

    /**
     * Субъект РФ, на который выдана лицензия
     * 
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     * @see #getRegion()
     */
    public void setRegion(RegionType value) {
        this.region = value;
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
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInformation()
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Информация о лицензиате
     * 
     * @return
     *     possible object is
     *     {@link LicenseInfoType.LicenseOrganization }
     *     
     */
    public LicenseInfoType.LicenseOrganization getLicenseOrganization() {
        return licenseOrganization;
    }

    /**
     * Sets the value of the licenseOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseInfoType.LicenseOrganization }
     *     
     * @see #getLicenseOrganization()
     */
    public void setLicenseOrganization(LicenseInfoType.LicenseOrganization value) {
        this.licenseOrganization = value;
    }

    /**
     * Номер приказа о предоставлении лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidingOrderNumber() {
        return providingOrderNumber;
    }

    /**
     * Sets the value of the providingOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProvidingOrderNumber()
     */
    public void setProvidingOrderNumber(String value) {
        this.providingOrderNumber = value;
    }

    /**
     * Дата приказа о предоставлении лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvidingOrderDate() {
        return providingOrderDate;
    }

    /**
     * Sets the value of the providingOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getProvidingOrderDate()
     */
    public void setProvidingOrderDate(XMLGregorianCalendar value) {
        this.providingOrderDate = value;
    }

    /**
     * Номер приказа о внесении изменений в лицензию (последнее изменение)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateOrderNumber() {
        return updateOrderNumber;
    }

    /**
     * Sets the value of the updateOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUpdateOrderNumber()
     */
    public void setUpdateOrderNumber(String value) {
        this.updateOrderNumber = value;
    }

    /**
     * Дата приказа  о внесении изменений в лицензию (последнее изменение)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateOrderDate() {
        return updateOrderDate;
    }

    /**
     * Sets the value of the updateOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getUpdateOrderDate()
     */
    public void setUpdateOrderDate(XMLGregorianCalendar value) {
        this.updateOrderDate = value;
    }

    /**
     * Номер приказа о продлении лицнезии (последнее продление)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProlongationOrderNumber() {
        return prolongationOrderNumber;
    }

    /**
     * Sets the value of the prolongationOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProlongationOrderNumber()
     */
    public void setProlongationOrderNumber(String value) {
        this.prolongationOrderNumber = value;
    }

    /**
     * Дата приказа  о продлении лицнезии (последнее продление)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProlongationOrderDate() {
        return prolongationOrderDate;
    }

    /**
     * Sets the value of the prolongationOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getProlongationOrderDate()
     */
    public void setProlongationOrderDate(XMLGregorianCalendar value) {
        this.prolongationOrderDate = value;
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
        "email"
    })
    public static class LicenseOrganization
        extends LicenseOrganizationType
    {

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
