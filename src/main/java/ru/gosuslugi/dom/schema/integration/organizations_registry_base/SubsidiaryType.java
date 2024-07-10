
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * ОП (Обособленное подразделение)
 * 
 * <p>Java class for SubsidiaryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SubsidiaryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FullName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="4000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ShortName" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="500"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OKOPF"/>
 *         <element name="Address" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="4000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="ActivityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="SourceName">
 *           <complexType>
 *             <simpleContent>
 *               <extension base="<http://dom.gosuslugi.ru/schema/integration/base/>String255Type">
 *                 <attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               </extension>
 *             </simpleContent>
 *           </complexType>
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
@XmlType(name = "SubsidiaryType", propOrder = {
    "fullName",
    "shortName",
    "ogrn",
    "inn",
    "kpp",
    "okopf",
    "address",
    "fiasHouseGuid",
    "activityEndDate",
    "sourceName"
})
public class SubsidiaryType {

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
     * ОГРН
     * 
     */
    @XmlElement(name = "OGRN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
    protected String ogrn;
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
     * ОКОПФ
     * 
     */
    @XmlElement(name = "OKOPF", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
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
     * Источник информации
     * 
     */
    @XmlElement(name = "SourceName", required = true)
    protected SubsidiaryType.SourceName sourceName;

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

    /**
     * Источник информации
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryType.SourceName }
     *     
     */
    public SubsidiaryType.SourceName getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryType.SourceName }
     *     
     * @see #getSourceName()
     */
    public void setSourceName(SubsidiaryType.SourceName value) {
        this.sourceName = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <extension base="<http://dom.gosuslugi.ru/schema/integration/base/>String255Type">
     *       <attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     </extension>
     *   </simpleContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SourceName {

        /**
         * Скалярный тип. Строка не более 255 символов.
         * 
         */
        @XmlValue
        protected String value;
        /**
         * от
         * 
         */
        @XmlAttribute(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

        /**
         * Скалярный тип. Строка не более 255 символов.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getValue()
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * от
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDate()
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}
