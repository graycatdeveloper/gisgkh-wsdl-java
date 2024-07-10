
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ФПИЮЛ (Филиал или представительство иностранного юридического лица)
 * 
 * <p>Java class for ForeignBranchType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ForeignBranchType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}FullName"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}ShortName" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}NZA"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
 *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="AccreditationStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="AccreditationEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="RegistrationCountry">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="2"/>
 *               <maxLength value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignBranchType", propOrder = {
    "fullName",
    "shortName",
    "nza",
    "inn",
    "kpp",
    "address",
    "fiasHouseGuid",
    "accreditationStartDate",
    "accreditationEndDate",
    "registrationCountry"
})
public class ForeignBranchType {

    /**
     * Полное наименование
     * 
     */
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    /**
     * Сокращенное наименование
     * 
     */
    @XmlElement(name = "ShortName")
    protected String shortName;
    /**
     * НЗА (Номер записи об аккредитации)
     * 
     */
    @XmlElement(name = "NZA", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
    protected String nza;
    /**
     * ИНН
     * 
     */
    @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
    protected String inn;
    /**
     * КПП
     * 
     */
    @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
    protected String kpp;
    /**
     * Адрес места нахождения(жительства)_текст
     * 
     */
    @XmlElement(name = "Address")
    protected String address;
    /**
     * Адрес места нахождения(жительства)_ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Дата внесения записи в реестр аккредитованных
     * 
     */
    @XmlElement(name = "AccreditationStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accreditationStartDate;
    /**
     * Дата прекращения действия аккредитации
     * 
     */
    @XmlElement(name = "AccreditationEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accreditationEndDate;
    /**
     * Страна регистрации иностранного ЮЛ (Справочник ОКСМ, альфа-2)
     * 
     */
    @XmlElement(name = "RegistrationCountry", required = true)
    protected String registrationCountry;

    /**
     * Полное наименование
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFullName()
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Сокращенное наименование
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShortName()
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * НЗА (Номер записи об аккредитации)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNZA() {
        return nza;
    }

    /**
     * Sets the value of the nza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNZA()
     */
    public void setNZA(String value) {
        this.nza = value;
    }

    /**
     * ИНН
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getINN()
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * КПП
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKPP()
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

    /**
     * Адрес места нахождения(жительства)_текст
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
     * Адрес места нахождения(жительства)_ФИАС
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
     * Дата внесения записи в реестр аккредитованных
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccreditationStartDate() {
        return accreditationStartDate;
    }

    /**
     * Sets the value of the accreditationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAccreditationStartDate()
     */
    public void setAccreditationStartDate(XMLGregorianCalendar value) {
        this.accreditationStartDate = value;
    }

    /**
     * Дата прекращения действия аккредитации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccreditationEndDate() {
        return accreditationEndDate;
    }

    /**
     * Sets the value of the accreditationEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAccreditationEndDate()
     */
    public void setAccreditationEndDate(XMLGregorianCalendar value) {
        this.accreditationEndDate = value;
    }

    /**
     * Страна регистрации иностранного ЮЛ (Справочник ОКСМ, альфа-2)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationCountry() {
        return registrationCountry;
    }

    /**
     * Sets the value of the registrationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistrationCountry()
     */
    public void setRegistrationCountry(String value) {
        this.registrationCountry = value;
    }

}
