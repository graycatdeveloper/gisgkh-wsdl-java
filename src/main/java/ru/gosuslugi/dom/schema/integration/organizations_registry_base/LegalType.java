
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Юридическое лицо
 * 
 * <p>Java class for LegalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LegalType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}ShortName" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}FullName"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}CommercialName" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
 *         <element name="StateRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OKOPF" minOccurs="0"/>
 *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="ActivityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalType", propOrder = {
    "shortName",
    "fullName",
    "commercialName",
    "ogrn",
    "stateRegistrationDate",
    "inn",
    "kpp",
    "okopf",
    "address",
    "fiasHouseGuid",
    "activityEndDate"
})
public class LegalType {

    /**
     * Сокращенное наименование
     * 
     */
    @XmlElement(name = "ShortName")
    protected String shortName;
    /**
     * Полное наименование
     * 
     */
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    /**
     * Фирменное наименование
     * 
     */
    @XmlElement(name = "CommercialName")
    protected String commercialName;
    /**
     * ОГРН
     * 
     */
    @XmlElement(name = "OGRN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
    protected String ogrn;
    /**
     * Дата государственной регистрации
     * 
     */
    @XmlElement(name = "StateRegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stateRegistrationDate;
    /**
     * ИНН
     * 
     */
    @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
    protected String inn;
    /**
     * КПП
     * 
     */
    @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
    protected String kpp;
    /**
     * ОКОПФ
     * 
     */
    @XmlElement(name = "OKOPF", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
    protected String okopf;
    /**
     * Адрес регистрации
     * 
     */
    @XmlElement(name = "Address")
    protected String address;
    /**
     * Адрес регистрации (Глобальный уникальный идентификатор дома по ФИАС)
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Дата прекращения деятельности
     * 
     */
    @XmlElement(name = "ActivityEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityEndDate;

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
     * Фирменное наименование
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialName() {
        return commercialName;
    }

    /**
     * Sets the value of the commercialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCommercialName()
     */
    public void setCommercialName(String value) {
        this.commercialName = value;
    }

    /**
     * ОГРН
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOGRN()
     */
    public void setOGRN(String value) {
        this.ogrn = value;
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
     * ОКОПФ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKOPF() {
        return okopf;
    }

    /**
     * Sets the value of the okopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKOPF()
     */
    public void setOKOPF(String value) {
        this.okopf = value;
    }

    /**
     * Адрес регистрации
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
     * Адрес регистрации (Глобальный уникальный идентификатор дома по ФИАС)
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
     * Дата прекращения деятельности
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * Sets the value of the activityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getActivityEndDate()
     */
    public void setActivityEndDate(XMLGregorianCalendar value) {
        this.activityEndDate = value;
    }

}
