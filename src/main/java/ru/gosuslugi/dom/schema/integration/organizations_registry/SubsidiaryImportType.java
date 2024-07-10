
package ru.gosuslugi.dom.schema.integration.organizations_registry;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.SubsidiaryType;


/**
 * Импорт ОП
 * 
 * <p>Java class for SubsidiaryImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SubsidiaryImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CreateSubsidiary">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}SubsidiaryType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="UpdateSubsidiary">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
 *                   <element name="FullName" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="4000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN" minOccurs="0"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OKOPF" minOccurs="0"/>
 *                   <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *                   <element name="ActivityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="SourceName" minOccurs="0">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/base/>String255Type">
 *                           <attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsidiaryImportType", propOrder = {
    "createSubsidiary",
    "updateSubsidiary"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.organizations_registry.ImportSubsidiaryRequest.Subsidiary.class
})
public class SubsidiaryImportType {

    /**
     * Создание обособленного подразделения
     * 
     */
    @XmlElement(name = "CreateSubsidiary")
    protected SubsidiaryImportType.CreateSubsidiary createSubsidiary;
    /**
     * Внесение изменений в обособленное подразделение
     * 
     */
    @XmlElement(name = "UpdateSubsidiary")
    protected SubsidiaryImportType.UpdateSubsidiary updateSubsidiary;

    /**
     * Создание обособленного подразделения
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryImportType.CreateSubsidiary }
     *     
     */
    public SubsidiaryImportType.CreateSubsidiary getCreateSubsidiary() {
        return createSubsidiary;
    }

    /**
     * Sets the value of the createSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryImportType.CreateSubsidiary }
     *     
     * @see #getCreateSubsidiary()
     */
    public void setCreateSubsidiary(SubsidiaryImportType.CreateSubsidiary value) {
        this.createSubsidiary = value;
    }

    /**
     * Внесение изменений в обособленное подразделение
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryImportType.UpdateSubsidiary }
     *     
     */
    public SubsidiaryImportType.UpdateSubsidiary getUpdateSubsidiary() {
        return updateSubsidiary;
    }

    /**
     * Sets the value of the updateSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryImportType.UpdateSubsidiary }
     *     
     * @see #getUpdateSubsidiary()
     */
    public void setUpdateSubsidiary(SubsidiaryImportType.UpdateSubsidiary value) {
        this.updateSubsidiary = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}SubsidiaryType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
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
        "orgVersionGUID"
    })
    public static class CreateSubsidiary
        extends SubsidiaryType
    {

        /**
         * Идентификатор головной организации версии записи в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
        protected String orgVersionGUID;

        /**
         * Идентификатор головной организации версии записи в реестре организаций
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgVersionGUID() {
            return orgVersionGUID;
        }

        /**
         * Sets the value of the orgVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrgVersionGUID()
         */
        public void setOrgVersionGUID(String value) {
            this.orgVersionGUID = value;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
     *         <element name="FullName" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="4000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN" minOccurs="0"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OKOPF" minOccurs="0"/>
     *         <element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
     *         <element name="ActivityEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="SourceName" minOccurs="0">
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
    @XmlType(name = "", propOrder = {
        "orgVersionGUID",
        "fullName",
        "inn",
        "okopf",
        "address",
        "fiasHouseGuid",
        "activityEndDate",
        "sourceName"
    })
    public static class UpdateSubsidiary {

        /**
         * Идентификатор версии записи в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
        protected String orgVersionGUID;
        /**
         * Полное наименование
         * 
         */
        @XmlElement(name = "FullName")
        protected String fullName;
        /**
         * ИНН
         * 
         */
        @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
        protected String inn;
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
         * Источник информации
         * 
         */
        @XmlElement(name = "SourceName")
        protected SubsidiaryImportType.UpdateSubsidiary.SourceName sourceName;

        /**
         * Идентификатор версии записи в реестре организаций
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgVersionGUID() {
            return orgVersionGUID;
        }

        /**
         * Sets the value of the orgVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrgVersionGUID()
         */
        public void setOrgVersionGUID(String value) {
            this.orgVersionGUID = value;
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
         *     {@link SubsidiaryImportType.UpdateSubsidiary.SourceName }
         *     
         */
        public SubsidiaryImportType.UpdateSubsidiary.SourceName getSourceName() {
            return sourceName;
        }

        /**
         * Sets the value of the sourceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubsidiaryImportType.UpdateSubsidiary.SourceName }
         *     
         * @see #getSourceName()
         */
        public void setSourceName(SubsidiaryImportType.UpdateSubsidiary.SourceName value) {
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

}
