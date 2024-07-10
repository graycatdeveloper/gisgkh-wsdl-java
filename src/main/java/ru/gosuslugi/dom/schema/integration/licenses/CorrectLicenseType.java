
package ru.gosuslugi.dom.schema.integration.licenses;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;


/**
 * Изменения в лицензии
 * 
 * <p>Java class for CorrectLicenseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CorrectLicenseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="LicenseVersion" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *           <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType" minOccurs="0"/>
 *           <element name="LicenseRegDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *         <element name="LicenseStatus">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <pattern value="A"/>
 *               <pattern value="F"/>
 *               <pattern value="C"/>
 *               <pattern value="R"/>
 *               <enumeration value="A"/>
 *               <enumeration value="F"/>
 *               <enumeration value="C"/>
 *               <enumeration value="R"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="LicensingAuthority">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RegionFIASGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="LicensableTypeOfActivity" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType"/>
 *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
 *         <element name="AccompanyingDocument" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}AccompanyingDocumentType">
 *                 <sequence>
 *                   <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="DocumentStatus">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="A"/>
 *                         <enumeration value="C"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HouseType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectLicenseType", propOrder = {
    "licenseGUID",
    "licenseVersion",
    "licenseNumber",
    "licenseRegDate",
    "licenseStatus",
    "licensingAuthority",
    "regionFIASGuid",
    "region",
    "licensableTypeOfActivity",
    "additionalInformation",
    "accompanyingDocument",
    "house"
})
public class CorrectLicenseType {

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
     * Номер лицензии
     * 
     */
    @XmlElement(name = "LicenseNumber")
    protected String licenseNumber;
    /**
     * Дата регистрации лицензии
     * 
     */
    @XmlElement(name = "LicenseRegDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseRegDate;
    /**
     * Статус лицензии:    
     *     A - ACTIVE - включена в реестр, действующая
     *     F - FINISHED - включена в реестр, действие прекращено в зависимости от даты окончания действия лицензии
     *     C - CANCELED - аннулирована
     *     R - REJECTED - отменена в зависимости от основания
     * 
     */
    @XmlElement(name = "LicenseStatus", required = true)
    protected String licenseStatus;
    /**
     * Наименование лицензирующего органа
     * 
     */
    @XmlElement(name = "LicensingAuthority", required = true)
    protected CorrectLicenseType.LicensingAuthority licensingAuthority;
    /**
     * Адрес осуществления лицензируемого вида деятельности (код по ФИАС)
     * 
     */
    @XmlElement(name = "RegionFIASGuid")
    protected String regionFIASGuid;
    /**
     * Адрес осуществления лицензируемого вида деятельности
     * 
     */
    @XmlElement(name = "Region", required = true)
    protected String region;
    /**
     * Лицензируемый вид деятельности с указанием выполняемых работ, оказываемых услуг, составляющих лицензируемый вид деятельности
     * 
     */
    @XmlElement(name = "LicensableTypeOfActivity", required = true)
    protected String licensableTypeOfActivity;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Документы лицензионного дела
     * 
     */
    @XmlElement(name = "AccompanyingDocument", required = true)
    protected List<CorrectLicenseType.AccompanyingDocument> accompanyingDocument;
    /**
     * Информация о домах
     * 
     */
    @XmlElement(name = "House")
    protected List<HouseType> house;

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
     * Номер лицензии
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
     *     A - ACTIVE - включена в реестр, действующая
     *     F - FINISHED - включена в реестр, действие прекращено в зависимости от даты окончания действия лицензии
     *     C - CANCELED - аннулирована
     *     R - REJECTED - отменена в зависимости от основания
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicenseStatus()
     */
    public void setLicenseStatus(String value) {
        this.licenseStatus = value;
    }

    /**
     * Наименование лицензирующего органа
     * 
     * @return
     *     possible object is
     *     {@link CorrectLicenseType.LicensingAuthority }
     *     
     */
    public CorrectLicenseType.LicensingAuthority getLicensingAuthority() {
        return licensingAuthority;
    }

    /**
     * Sets the value of the licensingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectLicenseType.LicensingAuthority }
     *     
     * @see #getLicensingAuthority()
     */
    public void setLicensingAuthority(CorrectLicenseType.LicensingAuthority value) {
        this.licensingAuthority = value;
    }

    /**
     * Адрес осуществления лицензируемого вида деятельности (код по ФИАС)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionFIASGuid() {
        return regionFIASGuid;
    }

    /**
     * Sets the value of the regionFIASGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegionFIASGuid()
     */
    public void setRegionFIASGuid(String value) {
        this.regionFIASGuid = value;
    }

    /**
     * Адрес осуществления лицензируемого вида деятельности
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegion()
     */
    public void setRegion(String value) {
        this.region = value;
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
     * Документы лицензионного дела
     * 
     * Gets the value of the accompanyingDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accompanyingDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccompanyingDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorrectLicenseType.AccompanyingDocument }
     * </p>
     * 
     * 
     * @return
     *     The value of the accompanyingDocument property.
     */
    public List<CorrectLicenseType.AccompanyingDocument> getAccompanyingDocument() {
        if (accompanyingDocument == null) {
            accompanyingDocument = new ArrayList<>();
        }
        return this.accompanyingDocument;
    }

    /**
     * Информация о домах
     * 
     * Gets the value of the house property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the house property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the house property.
     */
    public List<HouseType> getHouse() {
        if (house == null) {
            house = new ArrayList<>();
        }
        return this.house;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}AccompanyingDocumentType">
     *       <sequence>
     *         <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="DocumentStatus">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="A"/>
     *               <enumeration value="C"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
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
        "dateFrom",
        "documentStatus"
    })
    public static class AccompanyingDocument
        extends AccompanyingDocumentType
    {

        /**
         * Дата вступления документа в силу
         * 
         */
        @XmlElement(name = "DateFrom", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFrom;
        /**
         * Статус документа:    
         *      A - ACTIVE - Действующий
         *      C - CANCELED - Отменен
         * 
         */
        @XmlElement(name = "DocumentStatus", required = true)
        protected String documentStatus;

        /**
         * Дата вступления документа в силу
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateFrom()
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
        }

        /**
         * Статус документа:    
         *      A - ACTIVE - Действующий
         *      C - CANCELED - Отменен
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentStatus() {
            return documentStatus;
        }

        /**
         * Sets the value of the documentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDocumentStatus()
         */
        public void setDocumentStatus(String value) {
            this.documentStatus = value;
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
