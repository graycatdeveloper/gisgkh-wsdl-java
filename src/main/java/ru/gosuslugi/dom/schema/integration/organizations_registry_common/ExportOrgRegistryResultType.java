
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.EntpsType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.ForeignBranchType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgVersionType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.SubsidiaryType;


/**
 * Результат экспорта сведений из реестра организаций
 * 
 * <p>Java class for exportOrgRegistryResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportOrgRegistryResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
 *         <element name="OrgVersion">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
 *                   <element name="lastEditingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <choice>
 *                     <element name="Legal" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType"/>
 *                     <element name="Subsidiary">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}SubsidiaryType">
 *                             <sequence>
 *                               <element name="StatusVersion">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="ParentOrg">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersion"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Entrp" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType"/>
 *                     <element name="ForeignBranch" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}ForeignBranchType"/>
 *                   </choice>
 *                   <element name="registryOrganizationStatus" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="P"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}orgPPAGUID" minOccurs="0"/>
 *         <element name="organizationRoles" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="isRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportOrgRegistryResultType", propOrder = {
    "orgRootEntityGUID",
    "orgVersion",
    "orgPPAGUID",
    "organizationRoles",
    "isRegistered"
})
public class ExportOrgRegistryResultType {

    /**
     * Идентификатор корневой сущности организации в реестре организаций
     * 
     */
    @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
    protected String orgRootEntityGUID;
    /**
     * Версия организации в реестре организаций
     * 
     */
    @XmlElement(name = "OrgVersion", required = true)
    protected ExportOrgRegistryResultType.OrgVersion orgVersion;
    /**
     * Идентификатор зарегистрированной организации
     * 
     */
    @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String orgPPAGUID;
    /**
     * Полномочие организации (НСИ №20)
     * 
     */
    protected List<NsiRef> organizationRoles;
    /**
     * Зарегистрирована в ГИС ЖКХ
     * 
     */
    protected Boolean isRegistered;

    /**
     * Идентификатор корневой сущности организации в реестре организаций
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRootEntityGUID() {
        return orgRootEntityGUID;
    }

    /**
     * Sets the value of the orgRootEntityGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgRootEntityGUID()
     */
    public void setOrgRootEntityGUID(String value) {
        this.orgRootEntityGUID = value;
    }

    /**
     * Версия организации в реестре организаций
     * 
     * @return
     *     possible object is
     *     {@link ExportOrgRegistryResultType.OrgVersion }
     *     
     */
    public ExportOrgRegistryResultType.OrgVersion getOrgVersion() {
        return orgVersion;
    }

    /**
     * Sets the value of the orgVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOrgRegistryResultType.OrgVersion }
     *     
     * @see #getOrgVersion()
     */
    public void setOrgVersion(ExportOrgRegistryResultType.OrgVersion value) {
        this.orgVersion = value;
    }

    /**
     * Идентификатор зарегистрированной организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
    }

    /**
     * Полномочие организации (НСИ №20)
     * 
     * Gets the value of the organizationRoles property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationRoles property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganizationRoles().add(newItem);
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
     *     The value of the organizationRoles property.
     */
    public List<NsiRef> getOrganizationRoles() {
        if (organizationRoles == null) {
            organizationRoles = new ArrayList<>();
        }
        return this.organizationRoles;
    }

    /**
     * Зарегистрирована в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegistered() {
        return isRegistered;
    }

    /**
     * Sets the value of the isRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRegistered()
     */
    public void setIsRegistered(Boolean value) {
        this.isRegistered = value;
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
     *         <element name="lastEditingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <choice>
     *           <element name="Legal" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType"/>
     *           <element name="Subsidiary">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}SubsidiaryType">
     *                   <sequence>
     *                     <element name="StatusVersion">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="ParentOrg">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersion"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Entrp" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType"/>
     *           <element name="ForeignBranch" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}ForeignBranchType"/>
     *         </choice>
     *         <element name="registryOrganizationStatus" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="P"/>
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
        "orgVersionGUID",
        "lastEditingDate",
        "isActual",
        "legal",
        "subsidiary",
        "entrp",
        "foreignBranch",
        "registryOrganizationStatus"
    })
    public static class OrgVersion {

        /**
         * Идентификатор версии записи в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
        protected String orgVersionGUID;
        /**
         * Дата последнего изменения
         * 
         */
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar lastEditingDate;
        /**
         * Признак актуальности записи
         * 
         */
        @XmlElement(name = "IsActual")
        protected boolean isActual;
        /**
         * Юридическое лицо
         * 
         */
        @XmlElement(name = "Legal")
        protected LegalType legal;
        /**
         * Обособленное подразделение
         * 
         */
        @XmlElement(name = "Subsidiary")
        protected ExportOrgRegistryResultType.OrgVersion.Subsidiary subsidiary;
        /**
         * Индивидуальный предприниматель
         * 
         */
        @XmlElement(name = "Entrp")
        protected EntpsType entrp;
        /**
         * ФПИЮЛ (Филиал или представительство иностранного юридического лица)
         * 
         */
        @XmlElement(name = "ForeignBranch")
        protected ForeignBranchType foreignBranch;
        /**
         * Статус:
         * (P)UBLISHED - опубликована в одном из документов в рамках раскрытия
         * 
         */
        protected String registryOrganizationStatus;

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
         * Дата последнего изменения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastEditingDate() {
            return lastEditingDate;
        }

        /**
         * Sets the value of the lastEditingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getLastEditingDate()
         */
        public void setLastEditingDate(XMLGregorianCalendar value) {
            this.lastEditingDate = value;
        }

        /**
         * Признак актуальности записи
         * 
         */
        public boolean isIsActual() {
            return isActual;
        }

        /**
         * Sets the value of the isActual property.
         * 
         */
        public void setIsActual(boolean value) {
            this.isActual = value;
        }

        /**
         * Юридическое лицо
         * 
         * @return
         *     possible object is
         *     {@link LegalType }
         *     
         */
        public LegalType getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link LegalType }
         *     
         * @see #getLegal()
         */
        public void setLegal(LegalType value) {
            this.legal = value;
        }

        /**
         * Обособленное подразделение
         * 
         * @return
         *     possible object is
         *     {@link ExportOrgRegistryResultType.OrgVersion.Subsidiary }
         *     
         */
        public ExportOrgRegistryResultType.OrgVersion.Subsidiary getSubsidiary() {
            return subsidiary;
        }

        /**
         * Sets the value of the subsidiary property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportOrgRegistryResultType.OrgVersion.Subsidiary }
         *     
         * @see #getSubsidiary()
         */
        public void setSubsidiary(ExportOrgRegistryResultType.OrgVersion.Subsidiary value) {
            this.subsidiary = value;
        }

        /**
         * Индивидуальный предприниматель
         * 
         * @return
         *     possible object is
         *     {@link EntpsType }
         *     
         */
        public EntpsType getEntrp() {
            return entrp;
        }

        /**
         * Sets the value of the entrp property.
         * 
         * @param value
         *     allowed object is
         *     {@link EntpsType }
         *     
         * @see #getEntrp()
         */
        public void setEntrp(EntpsType value) {
            this.entrp = value;
        }

        /**
         * ФПИЮЛ (Филиал или представительство иностранного юридического лица)
         * 
         * @return
         *     possible object is
         *     {@link ForeignBranchType }
         *     
         */
        public ForeignBranchType getForeignBranch() {
            return foreignBranch;
        }

        /**
         * Sets the value of the foreignBranch property.
         * 
         * @param value
         *     allowed object is
         *     {@link ForeignBranchType }
         *     
         * @see #getForeignBranch()
         */
        public void setForeignBranch(ForeignBranchType value) {
            this.foreignBranch = value;
        }

        /**
         * Статус:
         * (P)UBLISHED - опубликована в одном из документов в рамках раскрытия
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistryOrganizationStatus() {
            return registryOrganizationStatus;
        }

        /**
         * Sets the value of the registryOrganizationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRegistryOrganizationStatus()
         */
        public void setRegistryOrganizationStatus(String value) {
            this.registryOrganizationStatus = value;
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
         *         <element name="StatusVersion">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="ParentOrg">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersion"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
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
            "statusVersion",
            "parentOrg"
        })
        public static class Subsidiary
            extends SubsidiaryType
        {

            /**
             * Статус версии
             * 
             */
            @XmlElement(name = "StatusVersion", required = true)
            protected String statusVersion;
            /**
             * Информация о головной организации
             * 
             */
            @XmlElement(name = "ParentOrg", required = true)
            protected ExportOrgRegistryResultType.OrgVersion.Subsidiary.ParentOrg parentOrg;

            /**
             * Статус версии
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusVersion() {
                return statusVersion;
            }

            /**
             * Sets the value of the statusVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getStatusVersion()
             */
            public void setStatusVersion(String value) {
                this.statusVersion = value;
            }

            /**
             * Информация о головной организации
             * 
             * @return
             *     possible object is
             *     {@link ExportOrgRegistryResultType.OrgVersion.Subsidiary.ParentOrg }
             *     
             */
            public ExportOrgRegistryResultType.OrgVersion.Subsidiary.ParentOrg getParentOrg() {
                return parentOrg;
            }

            /**
             * Sets the value of the parentOrg property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportOrgRegistryResultType.OrgVersion.Subsidiary.ParentOrg }
             *     
             * @see #getParentOrg()
             */
            public void setParentOrg(ExportOrgRegistryResultType.OrgVersion.Subsidiary.ParentOrg value) {
                this.parentOrg = value;
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
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersion"/>
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
                "regOrgVersion"
            })
            public static class ParentOrg {

                /**
                 * Версия организации в реестре организаций
                 * 
                 */
                @XmlElement(name = "RegOrgVersion", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
                protected RegOrgVersionType regOrgVersion;

                /**
                 * Версия организации в реестре организаций
                 * 
                 * @return
                 *     possible object is
                 *     {@link RegOrgVersionType }
                 *     
                 */
                public RegOrgVersionType getRegOrgVersion() {
                    return regOrgVersion;
                }

                /**
                 * Sets the value of the regOrgVersion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RegOrgVersionType }
                 *     
                 * @see #getRegOrgVersion()
                 */
                public void setRegOrgVersion(RegOrgVersionType value) {
                    this.regOrgVersion = value;
                }

            }

        }

    }

}
