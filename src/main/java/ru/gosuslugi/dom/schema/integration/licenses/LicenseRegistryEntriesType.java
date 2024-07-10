
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Полная информация о реестровой записи
 * 
 * <p>Java class for LicenseRegistryEntriesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseRegistryEntriesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryInfo" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EntryInfoType"/>
 *         <choice>
 *           <element name="LicenseEntryDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseEntryType"/>
 *           <element name="LicenseExtensionDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseExtensionDetailsType"/>
 *           <element name="LicenseTerminationDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseTerminationDetailsType"/>
 *           <element name="InclusionHouseDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}InclusionHouseDetailsType"/>
 *           <element name="ExclusionHouseDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ExclusionHouseDetailsType"/>
 *           <element name="DeactualizationDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DeactalizationDetailsType"/>
 *           <element name="UnionDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}UnionDetailsType"/>
 *           <element name="SelfChangeDetails">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseePhoneType" minOccurs="0"/>
 *                     <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseeEmailType" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="OtherDetails" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}OtherDetailsType"/>
 *         </choice>
 *         <element name="ErulSentInfo" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulSentInfoType" minOccurs="0"/>
 *         <element name="FnsSentInfo" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}FnsSentInfoType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseRegistryEntriesType", propOrder = {
    "entryInfo",
    "licenseEntryDetails",
    "licenseExtensionDetails",
    "licenseTerminationDetails",
    "inclusionHouseDetails",
    "exclusionHouseDetails",
    "deactualizationDetails",
    "unionDetails",
    "selfChangeDetails",
    "otherDetails",
    "erulSentInfo",
    "fnsSentInfo"
})
public class LicenseRegistryEntriesType {

    /**
     * Общая информация о реестровой записи
     * 
     */
    @XmlElement(name = "EntryInfo", required = true)
    protected EntryInfoType entryInfo;
    /**
     * Параметры записи о предоставлении лицензии или о внесении изменений в лицензию
     * 
     */
    @XmlElement(name = "LicenseEntryDetails")
    protected LicenseEntryType licenseEntryDetails;
    /**
     * Параметры записи о продлении лицензии
     * 
     */
    @XmlElement(name = "LicenseExtensionDetails")
    protected LicenseExtensionDetailsType licenseExtensionDetails;
    /**
     * Параметры записи о прекращении или об аннулировании лицензии
     * 
     */
    @XmlElement(name = "LicenseTerminationDetails")
    protected LicenseTerminationDetailsType licenseTerminationDetails;
    /**
     * Параметры записи о вклчюении дома
     * 
     */
    @XmlElement(name = "InclusionHouseDetails")
    protected InclusionHouseDetailsType inclusionHouseDetails;
    /**
     * Параметры записи об исключении дома
     * 
     */
    @XmlElement(name = "ExclusionHouseDetails")
    protected ExclusionHouseDetailsType exclusionHouseDetails;
    /**
     * Параметры записи о деактуализации
     * 
     */
    @XmlElement(name = "DeactualizationDetails")
    protected DeactalizationDetailsType deactualizationDetails;
    /**
     * Параметры записи об объединении
     * 
     */
    @XmlElement(name = "UnionDetails")
    protected UnionDetailsType unionDetails;
    /**
     * Параметры записи о внесении изменений в лицензию лицензиатом
     * 
     */
    @XmlElement(name = "SelfChangeDetails")
    protected LicenseRegistryEntriesType.SelfChangeDetails selfChangeDetails;
    /**
     * Параметры иной записи
     * 
     */
    @XmlElement(name = "OtherDetails")
    protected OtherDetailsType otherDetails;
    /**
     * Информация об отправке в ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulSentInfo")
    protected ErulSentInfoType erulSentInfo;
    /**
     * Информация об отправке в ФНС
     * 
     */
    @XmlElement(name = "FnsSentInfo")
    protected FnsSentInfoType fnsSentInfo;

    /**
     * Общая информация о реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link EntryInfoType }
     *     
     */
    public EntryInfoType getEntryInfo() {
        return entryInfo;
    }

    /**
     * Sets the value of the entryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryInfoType }
     *     
     * @see #getEntryInfo()
     */
    public void setEntryInfo(EntryInfoType value) {
        this.entryInfo = value;
    }

    /**
     * Параметры записи о предоставлении лицензии или о внесении изменений в лицензию
     * 
     * @return
     *     possible object is
     *     {@link LicenseEntryType }
     *     
     */
    public LicenseEntryType getLicenseEntryDetails() {
        return licenseEntryDetails;
    }

    /**
     * Sets the value of the licenseEntryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseEntryType }
     *     
     * @see #getLicenseEntryDetails()
     */
    public void setLicenseEntryDetails(LicenseEntryType value) {
        this.licenseEntryDetails = value;
    }

    /**
     * Параметры записи о продлении лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseExtensionDetailsType }
     *     
     */
    public LicenseExtensionDetailsType getLicenseExtensionDetails() {
        return licenseExtensionDetails;
    }

    /**
     * Sets the value of the licenseExtensionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseExtensionDetailsType }
     *     
     * @see #getLicenseExtensionDetails()
     */
    public void setLicenseExtensionDetails(LicenseExtensionDetailsType value) {
        this.licenseExtensionDetails = value;
    }

    /**
     * Параметры записи о прекращении или об аннулировании лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseTerminationDetailsType }
     *     
     */
    public LicenseTerminationDetailsType getLicenseTerminationDetails() {
        return licenseTerminationDetails;
    }

    /**
     * Sets the value of the licenseTerminationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTerminationDetailsType }
     *     
     * @see #getLicenseTerminationDetails()
     */
    public void setLicenseTerminationDetails(LicenseTerminationDetailsType value) {
        this.licenseTerminationDetails = value;
    }

    /**
     * Параметры записи о вклчюении дома
     * 
     * @return
     *     possible object is
     *     {@link InclusionHouseDetailsType }
     *     
     */
    public InclusionHouseDetailsType getInclusionHouseDetails() {
        return inclusionHouseDetails;
    }

    /**
     * Sets the value of the inclusionHouseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusionHouseDetailsType }
     *     
     * @see #getInclusionHouseDetails()
     */
    public void setInclusionHouseDetails(InclusionHouseDetailsType value) {
        this.inclusionHouseDetails = value;
    }

    /**
     * Параметры записи об исключении дома
     * 
     * @return
     *     possible object is
     *     {@link ExclusionHouseDetailsType }
     *     
     */
    public ExclusionHouseDetailsType getExclusionHouseDetails() {
        return exclusionHouseDetails;
    }

    /**
     * Sets the value of the exclusionHouseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionHouseDetailsType }
     *     
     * @see #getExclusionHouseDetails()
     */
    public void setExclusionHouseDetails(ExclusionHouseDetailsType value) {
        this.exclusionHouseDetails = value;
    }

    /**
     * Параметры записи о деактуализации
     * 
     * @return
     *     possible object is
     *     {@link DeactalizationDetailsType }
     *     
     */
    public DeactalizationDetailsType getDeactualizationDetails() {
        return deactualizationDetails;
    }

    /**
     * Sets the value of the deactualizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeactalizationDetailsType }
     *     
     * @see #getDeactualizationDetails()
     */
    public void setDeactualizationDetails(DeactalizationDetailsType value) {
        this.deactualizationDetails = value;
    }

    /**
     * Параметры записи об объединении
     * 
     * @return
     *     possible object is
     *     {@link UnionDetailsType }
     *     
     */
    public UnionDetailsType getUnionDetails() {
        return unionDetails;
    }

    /**
     * Sets the value of the unionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionDetailsType }
     *     
     * @see #getUnionDetails()
     */
    public void setUnionDetails(UnionDetailsType value) {
        this.unionDetails = value;
    }

    /**
     * Параметры записи о внесении изменений в лицензию лицензиатом
     * 
     * @return
     *     possible object is
     *     {@link LicenseRegistryEntriesType.SelfChangeDetails }
     *     
     */
    public LicenseRegistryEntriesType.SelfChangeDetails getSelfChangeDetails() {
        return selfChangeDetails;
    }

    /**
     * Sets the value of the selfChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseRegistryEntriesType.SelfChangeDetails }
     *     
     * @see #getSelfChangeDetails()
     */
    public void setSelfChangeDetails(LicenseRegistryEntriesType.SelfChangeDetails value) {
        this.selfChangeDetails = value;
    }

    /**
     * Параметры иной записи
     * 
     * @return
     *     possible object is
     *     {@link OtherDetailsType }
     *     
     */
    public OtherDetailsType getOtherDetails() {
        return otherDetails;
    }

    /**
     * Sets the value of the otherDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherDetailsType }
     *     
     * @see #getOtherDetails()
     */
    public void setOtherDetails(OtherDetailsType value) {
        this.otherDetails = value;
    }

    /**
     * Информация об отправке в ЕРУЛ
     * 
     * @return
     *     possible object is
     *     {@link ErulSentInfoType }
     *     
     */
    public ErulSentInfoType getErulSentInfo() {
        return erulSentInfo;
    }

    /**
     * Sets the value of the erulSentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErulSentInfoType }
     *     
     * @see #getErulSentInfo()
     */
    public void setErulSentInfo(ErulSentInfoType value) {
        this.erulSentInfo = value;
    }

    /**
     * Информация об отправке в ФНС
     * 
     * @return
     *     possible object is
     *     {@link FnsSentInfoType }
     *     
     */
    public FnsSentInfoType getFnsSentInfo() {
        return fnsSentInfo;
    }

    /**
     * Sets the value of the fnsSentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FnsSentInfoType }
     *     
     * @see #getFnsSentInfo()
     */
    public void setFnsSentInfo(FnsSentInfoType value) {
        this.fnsSentInfo = value;
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
     *         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseePhoneType" minOccurs="0"/>
     *         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseeEmailType" minOccurs="0"/>
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
        "phone",
        "email"
    })
    public static class SelfChangeDetails {

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

    }

}
