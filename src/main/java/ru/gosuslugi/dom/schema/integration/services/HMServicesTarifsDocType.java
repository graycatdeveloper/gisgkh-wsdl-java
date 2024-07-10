
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.DocumentPortalType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.base.RegionType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgVersionType;


/**
 * Документ. Тарифы ЖКУ
 * 
 * <p>Java class for HMServicesTarifsDocType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HMServicesTarifsDocType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}DocumentPortalType">
 *       <sequence>
 *         <element name="EffectivePeriodFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EffectivePeriodTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="CancelServicesTarifDocGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="IsPublished" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
 *         <choice>
 *           <element name="GKU">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="MServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                     <element name="Municipalities" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *                     <element name="RSOOrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersionType" maxOccurs="unbounded"/>
 *                     <element name="SKI" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Name">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <maxLength value="140"/>
 *                                     <minLength value="1"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="KU">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="MServiceType" maxOccurs="unbounded">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                             <sequence>
 *                               <element name="Name" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="100"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="IsOverhaul" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <sequence>
 *             <element name="OKTMOs" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded"/>
 *             <element name="ServiceType">
 *               <simpleType>
 *                 <restriction>
 *                   <simpleType>
 *                     <list>
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                           <enumeration value="S"/>
 *                           <enumeration value="R"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </list>
 *                   </simpleType>
 *                   <minLength value="1"/>
 *                   <maxLength value="2"/>
 *                   <enumeration value="S"/>
 *                   <enumeration value="R"/>
 *                 </restriction>
 *               </simpleType>
 *             </element>
 *           </sequence>
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
@XmlType(name = "HMServicesTarifsDocType", propOrder = {
    "effectivePeriodFrom",
    "effectivePeriodTo",
    "cancelServicesTarifDocGUID",
    "isPublished",
    "region",
    "gku",
    "ku",
    "isOverhaul",
    "oktmOs",
    "serviceType"
})
@XmlSeeAlso({
    ExportHMServicesTarifsResultType.class
})
public class HMServicesTarifsDocType
    extends DocumentPortalType
{

    /**
     * Дата начала действия тарифа
     * 
     */
    @XmlElement(name = "EffectivePeriodFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivePeriodFrom;
    /**
     * Дата окончания действия тарифа
     * 
     */
    @XmlElement(name = "EffectivePeriodTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivePeriodTo;
    /**
     * Отмяеняет прежний документ (ссылка на документ)
     * 
     */
    @XmlElement(name = "CancelServicesTarifDocGUID")
    protected String cancelServicesTarifDocGUID;
    /**
     * Документ всегда приходит в статусе "Опубликован" и публикуется на Портале. Экспортируются только опубликованные документы.
     * 
     */
    @XmlElement(name = "IsPublished")
    protected boolean isPublished;
    /**
     * Субъект РФ
     * 
     */
    @XmlElement(name = "Region", required = true)
    protected RegionType region;
    /**
     * Вид ЖКУ = "Коммунальные услуги"
     * Доступно организациям с полномочием:
     * - Орган государственной власти субъекта РФ в сфере ЖКХ
     * - Орган местного самоуправления в сфере ЖКХ 
     * - Управляющая организация
     * 
     */
    @XmlElement(name = "GKU")
    protected HMServicesTarifsDocType.GKU gku;
    /**
     * Вид ЖКУ = "Коммунальные ресурсы"
     * Доступно организациям с полномочием:
     * - Орган исполнительной власти субъекта РФ в области регулирования тарифов
     * - Федеральная антимонопольная служба (Федеральная служба по тарифам)
     * - Ресурсоснабжающая организация
     * 
     */
    @XmlElement(name = "KU")
    protected HMServicesTarifsDocType.KU ku;
    /**
     * Вид ЖКУ = "Капитальный ремонт"
     * Доступно организациям с полномочиями:
     * - Орган государственной власти субъекта РФ в сфере ЖКХ
     * 
     */
    @XmlElement(name = "IsOverhaul")
    protected Boolean isOverhaul;
    /**
     * Муниципальные образования
     * 
     */
    @XmlElement(name = "OKTMOs")
    protected List<OKTMORefType> oktmOs;
    /**
     * Вид жилищно-коммунальной услуги
     * (S)ocial hiring - Социальный наем
     * (R)epair and maintenance - Содержание и ремонт жилого помещения
     * 
     */
    @XmlList
    @XmlElement(name = "ServiceType")
    protected List<String> serviceType;

    /**
     * Дата начала действия тарифа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivePeriodFrom() {
        return effectivePeriodFrom;
    }

    /**
     * Sets the value of the effectivePeriodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEffectivePeriodFrom()
     */
    public void setEffectivePeriodFrom(XMLGregorianCalendar value) {
        this.effectivePeriodFrom = value;
    }

    /**
     * Дата окончания действия тарифа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivePeriodTo() {
        return effectivePeriodTo;
    }

    /**
     * Sets the value of the effectivePeriodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEffectivePeriodTo()
     */
    public void setEffectivePeriodTo(XMLGregorianCalendar value) {
        this.effectivePeriodTo = value;
    }

    /**
     * Отмяеняет прежний документ (ссылка на документ)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelServicesTarifDocGUID() {
        return cancelServicesTarifDocGUID;
    }

    /**
     * Sets the value of the cancelServicesTarifDocGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCancelServicesTarifDocGUID()
     */
    public void setCancelServicesTarifDocGUID(String value) {
        this.cancelServicesTarifDocGUID = value;
    }

    /**
     * Документ всегда приходит в статусе "Опубликован" и публикуется на Портале. Экспортируются только опубликованные документы.
     * 
     */
    public boolean isIsPublished() {
        return isPublished;
    }

    /**
     * Sets the value of the isPublished property.
     * 
     */
    public void setIsPublished(boolean value) {
        this.isPublished = value;
    }

    /**
     * Субъект РФ
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
     * Вид ЖКУ = "Коммунальные услуги"
     * Доступно организациям с полномочием:
     * - Орган государственной власти субъекта РФ в сфере ЖКХ
     * - Орган местного самоуправления в сфере ЖКХ 
     * - Управляющая организация
     * 
     * @return
     *     possible object is
     *     {@link HMServicesTarifsDocType.GKU }
     *     
     */
    public HMServicesTarifsDocType.GKU getGKU() {
        return gku;
    }

    /**
     * Sets the value of the gku property.
     * 
     * @param value
     *     allowed object is
     *     {@link HMServicesTarifsDocType.GKU }
     *     
     * @see #getGKU()
     */
    public void setGKU(HMServicesTarifsDocType.GKU value) {
        this.gku = value;
    }

    /**
     * Вид ЖКУ = "Коммунальные ресурсы"
     * Доступно организациям с полномочием:
     * - Орган исполнительной власти субъекта РФ в области регулирования тарифов
     * - Федеральная антимонопольная служба (Федеральная служба по тарифам)
     * - Ресурсоснабжающая организация
     * 
     * @return
     *     possible object is
     *     {@link HMServicesTarifsDocType.KU }
     *     
     */
    public HMServicesTarifsDocType.KU getKU() {
        return ku;
    }

    /**
     * Sets the value of the ku property.
     * 
     * @param value
     *     allowed object is
     *     {@link HMServicesTarifsDocType.KU }
     *     
     * @see #getKU()
     */
    public void setKU(HMServicesTarifsDocType.KU value) {
        this.ku = value;
    }

    /**
     * Вид ЖКУ = "Капитальный ремонт"
     * Доступно организациям с полномочиями:
     * - Орган государственной власти субъекта РФ в сфере ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOverhaul() {
        return isOverhaul;
    }

    /**
     * Sets the value of the isOverhaul property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsOverhaul()
     */
    public void setIsOverhaul(Boolean value) {
        this.isOverhaul = value;
    }

    /**
     * Муниципальные образования
     * 
     * Gets the value of the oktmOs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oktmOs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOKTMOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OKTMORefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the oktmOs property.
     */
    public List<OKTMORefType> getOKTMOs() {
        if (oktmOs == null) {
            oktmOs = new ArrayList<>();
        }
        return this.oktmOs;
    }

    /**
     * Вид жилищно-коммунальной услуги
     * (S)ocial hiring - Социальный наем
     * (R)epair and maintenance - Содержание и ремонт жилого помещения
     * 
     * Gets the value of the serviceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceType property.
     */
    public List<String> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<>();
        }
        return this.serviceType;
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
     *         <element name="MServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
     *         <element name="Municipalities" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
     *         <element name="RSOOrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersionType" maxOccurs="unbounded"/>
     *         <element name="SKI" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Name">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="140"/>
     *                         <minLength value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
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
        "mServiceType",
        "municipalities",
        "rsoOrganizationGUID",
        "ski"
    })
    public static class GKU {

        /**
         * Вид коммунальной услуги (НСИ №3)
         * 
         */
        @XmlElement(name = "MServiceType", required = true)
        protected List<NsiRef> mServiceType;
        /**
         * Муниципальное образование
         * 
         */
        @XmlElement(name = "Municipalities")
        protected OKTMORefType municipalities;
        /**
         * Идентификатор РСО
         * 
         */
        @XmlElement(name = "RSOOrganizationGUID", required = true)
        protected List<RegOrgVersionType> rsoOrganizationGUID;
        /**
         * Система коммунальной инфраструктуры (СКИ)
         * 
         */
        @XmlElement(name = "SKI")
        protected List<HMServicesTarifsDocType.GKU.SKI> ski;

        /**
         * Вид коммунальной услуги (НСИ №3)
         * 
         * Gets the value of the mServiceType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mServiceType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMServiceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the mServiceType property.
         */
        public List<NsiRef> getMServiceType() {
            if (mServiceType == null) {
                mServiceType = new ArrayList<>();
            }
            return this.mServiceType;
        }

        /**
         * Муниципальное образование
         * 
         * @return
         *     possible object is
         *     {@link OKTMORefType }
         *     
         */
        public OKTMORefType getMunicipalities() {
            return municipalities;
        }

        /**
         * Sets the value of the municipalities property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKTMORefType }
         *     
         * @see #getMunicipalities()
         */
        public void setMunicipalities(OKTMORefType value) {
            this.municipalities = value;
        }

        /**
         * Идентификатор РСО
         * 
         * Gets the value of the rsoOrganizationGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rsoOrganizationGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRSOOrganizationGUID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RegOrgVersionType }
         * </p>
         * 
         * 
         * @return
         *     The value of the rsoOrganizationGUID property.
         */
        public List<RegOrgVersionType> getRSOOrganizationGUID() {
            if (rsoOrganizationGUID == null) {
                rsoOrganizationGUID = new ArrayList<>();
            }
            return this.rsoOrganizationGUID;
        }

        /**
         * Система коммунальной инфраструктуры (СКИ)
         * 
         * Gets the value of the ski property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ski property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSKI().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HMServicesTarifsDocType.GKU.SKI }
         * </p>
         * 
         * 
         * @return
         *     The value of the ski property.
         */
        public List<HMServicesTarifsDocType.GKU.SKI> getSKI() {
            if (ski == null) {
                ski = new ArrayList<>();
            }
            return this.ski;
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
         *         <element name="Name">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="140"/>
         *               <minLength value="1"/>
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
        @XmlType(name = "", propOrder = {
            "name"
        })
        public static class SKI {

            /**
             * Наименование СКИ
             * 
             */
            @XmlElement(name = "Name", required = true)
            protected String name;

            /**
             * Наименование СКИ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getName()
             */
            public void setName(String value) {
                this.name = value;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="MServiceType" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *                 <sequence>
     *                   <element name="Name" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="100"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
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
        "mServiceType"
    })
    public static class KU {

        /**
         * Вид коммунального ресурса (НСИ №2)
         * 
         */
        @XmlElement(name = "MServiceType", required = true)
        protected List<HMServicesTarifsDocType.KU.MServiceType> mServiceType;

        /**
         * Вид коммунального ресурса (НСИ №2)
         * 
         * Gets the value of the mServiceType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mServiceType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMServiceType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HMServicesTarifsDocType.KU.MServiceType }
         * </p>
         * 
         * 
         * @return
         *     The value of the mServiceType property.
         */
        public List<HMServicesTarifsDocType.KU.MServiceType> getMServiceType() {
            if (mServiceType == null) {
                mServiceType = new ArrayList<>();
            }
            return this.mServiceType;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
         *       <sequence>
         *         <element name="Name" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="100"/>
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
            "rest"
        })
        public static class MServiceType
            extends NsiRef
        {

            /**
             * Gets the rest of the content model. 
             * 
             * <p>
             * You are getting this "catch-all" property because of the following reason: 
             * The field name "Name" is used by two different parts of a schema. See: 
             * line 1454 of file:/C:/Users/grayc/IdeaProjects/gisgkh-wsdl-java/wsdl_xsd_14.4.0.1/services/hcs-services-types.xsd
             * line 26 of file:/C:/Users/grayc/IdeaProjects/gisgkh-wsdl-java/wsdl_xsd_14.4.0.1/lib/hcs-nsi-base.xsd
             * <p>
             * To get rid of this property, apply a property customization to one 
             * of both of the following declarations to change their names:
             * 
             */
            @XmlElementRef(name = "Name", namespace = "http://dom.gosuslugi.ru/schema/integration/services/", type = JAXBElement.class, required = false)
            protected List<JAXBElement<String>> rest;

            /**
             * Gets the rest of the content model. 
             * 
             * <p>
             * You are getting this "catch-all" property because of the following reason: 
             * The field name "Name" is used by two different parts of a schema. See: 
             * line 1454 of file:/C:/Users/grayc/IdeaProjects/gisgkh-wsdl-java/wsdl_xsd_14.4.0.1/services/hcs-services-types.xsd
             * line 26 of file:/C:/Users/grayc/IdeaProjects/gisgkh-wsdl-java/wsdl_xsd_14.4.0.1/lib/hcs-nsi-base.xsd
             * <p>
             * To get rid of this property, apply a property customization to one 
             * of both of the following declarations to change their names:
             * 
             * Gets the value of the rest property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rest property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getRest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * </p>
             * 
             * 
             * @return
             *     The value of the rest property.
             */
            public List<JAXBElement<String>> getRest() {
                if (rest == null) {
                    rest = new ArrayList<>();
                }
                return this.rest;
            }

        }

    }

}
