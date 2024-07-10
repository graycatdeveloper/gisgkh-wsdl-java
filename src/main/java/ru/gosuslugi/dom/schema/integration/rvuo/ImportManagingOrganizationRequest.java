
package ru.gosuslugi.dom.schema.integration.rvuo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="ManagingOrganization" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="PlacingManagingOrganization">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="BusinessProperties" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}BusinessPropertiesType"/>
 *                               <element name="OrganizationData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationType"/>
 *                               <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedOrganizationDocumentType" maxOccurs="100"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="EditManagingOrganization">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="OrganizationData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationType"/>
 *                               <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedOrganizationDocumentType" maxOccurs="100"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentManagingOrganization">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="DeleteManagingOrganization">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="PublishManagingOrganization">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.1.8.3""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "managingOrganization"
})
@XmlRootElement(name = "importManagingOrganizationRequest")
public class ImportManagingOrganizationRequest
    extends BaseType
{

    /**
     * Управляющая организация
     * 
     */
    @XmlElement(name = "ManagingOrganization", required = true)
    protected List<ImportManagingOrganizationRequest.ManagingOrganization> managingOrganization;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Управляющая организация
     * 
     * Gets the value of the managingOrganization property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managingOrganization property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getManagingOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportManagingOrganizationRequest.ManagingOrganization }
     * </p>
     * 
     * 
     * @return
     *     The value of the managingOrganization property.
     */
    public List<ImportManagingOrganizationRequest.ManagingOrganization> getManagingOrganization() {
        if (managingOrganization == null) {
            managingOrganization = new ArrayList<>();
        }
        return this.managingOrganization;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "13.1.8.3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="PlacingManagingOrganization">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="BusinessProperties" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}BusinessPropertiesType"/>
     *                     <element name="OrganizationData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationType"/>
     *                     <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedOrganizationDocumentType" maxOccurs="100"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="EditManagingOrganization">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="OrganizationData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationType"/>
     *                     <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedOrganizationDocumentType" maxOccurs="100"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentManagingOrganization">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="DeleteManagingOrganization">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="PublishManagingOrganization">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
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
        "transportGUID",
        "placingManagingOrganization",
        "editManagingOrganization",
        "annulmentManagingOrganization",
        "deleteManagingOrganization",
        "publishManagingOrganization"
    })
    public static class ManagingOrganization {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Размещение управляющей организации
         * 
         */
        @XmlElement(name = "PlacingManagingOrganization")
        protected ImportManagingOrganizationRequest.ManagingOrganization.PlacingManagingOrganization placingManagingOrganization;
        /**
         * Редактирование управляющей организации
         * 
         */
        @XmlElement(name = "EditManagingOrganization")
        protected ImportManagingOrganizationRequest.ManagingOrganization.EditManagingOrganization editManagingOrganization;
        /**
         * Аннулирование управляющей организации
         * 
         */
        @XmlElement(name = "AnnulmentManagingOrganization")
        protected ImportManagingOrganizationRequest.ManagingOrganization.AnnulmentManagingOrganization annulmentManagingOrganization;
        /**
         * Удаление управляющей организации
         * 
         */
        @XmlElement(name = "DeleteManagingOrganization")
        protected ImportManagingOrganizationRequest.ManagingOrganization.DeleteManagingOrganization deleteManagingOrganization;
        /**
         * Изменение управляющей организации в статусе "Проект" на статус "Размещена"
         * 
         */
        @XmlElement(name = "PublishManagingOrganization")
        protected ImportManagingOrganizationRequest.ManagingOrganization.PublishManagingOrganization publishManagingOrganization;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Размещение управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.PlacingManagingOrganization }
         *     
         */
        public ImportManagingOrganizationRequest.ManagingOrganization.PlacingManagingOrganization getPlacingManagingOrganization() {
            return placingManagingOrganization;
        }

        /**
         * Sets the value of the placingManagingOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.PlacingManagingOrganization }
         *     
         * @see #getPlacingManagingOrganization()
         */
        public void setPlacingManagingOrganization(ImportManagingOrganizationRequest.ManagingOrganization.PlacingManagingOrganization value) {
            this.placingManagingOrganization = value;
        }

        /**
         * Редактирование управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.EditManagingOrganization }
         *     
         */
        public ImportManagingOrganizationRequest.ManagingOrganization.EditManagingOrganization getEditManagingOrganization() {
            return editManagingOrganization;
        }

        /**
         * Sets the value of the editManagingOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.EditManagingOrganization }
         *     
         * @see #getEditManagingOrganization()
         */
        public void setEditManagingOrganization(ImportManagingOrganizationRequest.ManagingOrganization.EditManagingOrganization value) {
            this.editManagingOrganization = value;
        }

        /**
         * Аннулирование управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.AnnulmentManagingOrganization }
         *     
         */
        public ImportManagingOrganizationRequest.ManagingOrganization.AnnulmentManagingOrganization getAnnulmentManagingOrganization() {
            return annulmentManagingOrganization;
        }

        /**
         * Sets the value of the annulmentManagingOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.AnnulmentManagingOrganization }
         *     
         * @see #getAnnulmentManagingOrganization()
         */
        public void setAnnulmentManagingOrganization(ImportManagingOrganizationRequest.ManagingOrganization.AnnulmentManagingOrganization value) {
            this.annulmentManagingOrganization = value;
        }

        /**
         * Удаление управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.DeleteManagingOrganization }
         *     
         */
        public ImportManagingOrganizationRequest.ManagingOrganization.DeleteManagingOrganization getDeleteManagingOrganization() {
            return deleteManagingOrganization;
        }

        /**
         * Sets the value of the deleteManagingOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.DeleteManagingOrganization }
         *     
         * @see #getDeleteManagingOrganization()
         */
        public void setDeleteManagingOrganization(ImportManagingOrganizationRequest.ManagingOrganization.DeleteManagingOrganization value) {
            this.deleteManagingOrganization = value;
        }

        /**
         * Изменение управляющей организации в статусе "Проект" на статус "Размещена"
         * 
         * @return
         *     possible object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.PublishManagingOrganization }
         *     
         */
        public ImportManagingOrganizationRequest.ManagingOrganization.PublishManagingOrganization getPublishManagingOrganization() {
            return publishManagingOrganization;
        }

        /**
         * Sets the value of the publishManagingOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportManagingOrganizationRequest.ManagingOrganization.PublishManagingOrganization }
         *     
         * @see #getPublishManagingOrganization()
         */
        public void setPublishManagingOrganization(ImportManagingOrganizationRequest.ManagingOrganization.PublishManagingOrganization value) {
            this.publishManagingOrganization = value;
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
         *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
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
            "orgGUID",
            "annulmentReason"
        })
        public static class AnnulmentManagingOrganization {

            /**
             * Уникальный идентификатор управляющей организации
             * 
             */
            @XmlElement(name = "OrgGUID", required = true)
            protected String orgGUID;
            /**
             * Причина аннулирования управляющей организации
             * 
             */
            @XmlElement(name = "AnnulmentReason", required = true)
            protected String annulmentReason;

            /**
             * Уникальный идентификатор управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgGUID() {
                return orgGUID;
            }

            /**
             * Sets the value of the orgGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgGUID()
             */
            public void setOrgGUID(String value) {
                this.orgGUID = value;
            }

            /**
             * Причина аннулирования управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnulmentReason() {
                return annulmentReason;
            }

            /**
             * Sets the value of the annulmentReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAnnulmentReason()
             */
            public void setAnnulmentReason(String value) {
                this.annulmentReason = value;
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
         *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "orgGUID"
        })
        public static class DeleteManagingOrganization {

            /**
             * Уникальный идентификатор управляющей организации
             * 
             */
            @XmlElement(name = "OrgGUID", required = true)
            protected String orgGUID;

            /**
             * Уникальный идентификатор управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgGUID() {
                return orgGUID;
            }

            /**
             * Sets the value of the orgGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgGUID()
             */
            public void setOrgGUID(String value) {
                this.orgGUID = value;
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
         *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="OrganizationData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationType"/>
         *         <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedOrganizationDocumentType" maxOccurs="100"/>
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
            "orgGUID",
            "organizationData",
            "attachedDocument"
        })
        public static class EditManagingOrganization {

            /**
             * Уникальный идентификатор управляющей организации
             * 
             */
            @XmlElement(name = "OrgGUID", required = true)
            protected String orgGUID;
            /**
             * Информация об управляющей организации
             * 
             */
            @XmlElement(name = "OrganizationData", required = true)
            protected ManagingOrganizationType organizationData;
            /**
             * Документ прилагаемый к информации об управляющей организации
             * 
             */
            @XmlElement(name = "AttachedDocument", required = true)
            protected List<AttachedOrganizationDocumentType> attachedDocument;

            /**
             * Уникальный идентификатор управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgGUID() {
                return orgGUID;
            }

            /**
             * Sets the value of the orgGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgGUID()
             */
            public void setOrgGUID(String value) {
                this.orgGUID = value;
            }

            /**
             * Информация об управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link ManagingOrganizationType }
             *     
             */
            public ManagingOrganizationType getOrganizationData() {
                return organizationData;
            }

            /**
             * Sets the value of the organizationData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ManagingOrganizationType }
             *     
             * @see #getOrganizationData()
             */
            public void setOrganizationData(ManagingOrganizationType value) {
                this.organizationData = value;
            }

            /**
             * Документ прилагаемый к информации об управляющей организации
             * 
             * Gets the value of the attachedDocument property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachedDocument property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAttachedDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachedOrganizationDocumentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the attachedDocument property.
             */
            public List<AttachedOrganizationDocumentType> getAttachedDocument() {
                if (attachedDocument == null) {
                    attachedDocument = new ArrayList<>();
                }
                return this.attachedDocument;
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
         *         <element name="BusinessProperties" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}BusinessPropertiesType"/>
         *         <element name="OrganizationData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}ManagingOrganizationType"/>
         *         <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedOrganizationDocumentType" maxOccurs="100"/>
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
            "businessProperties",
            "organizationData",
            "attachedDocument"
        })
        public static class PlacingManagingOrganization {

            /**
             * Реквизиты управляющей организации
             * 
             */
            @XmlElement(name = "BusinessProperties", required = true)
            protected BusinessPropertiesType businessProperties;
            /**
             * Информация об управляющей организации
             * 
             */
            @XmlElement(name = "OrganizationData", required = true)
            protected ManagingOrganizationType organizationData;
            /**
             * Документ прилагаемый к информации об управляющей организации
             * 
             */
            @XmlElement(name = "AttachedDocument", required = true)
            protected List<AttachedOrganizationDocumentType> attachedDocument;

            /**
             * Реквизиты управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link BusinessPropertiesType }
             *     
             */
            public BusinessPropertiesType getBusinessProperties() {
                return businessProperties;
            }

            /**
             * Sets the value of the businessProperties property.
             * 
             * @param value
             *     allowed object is
             *     {@link BusinessPropertiesType }
             *     
             * @see #getBusinessProperties()
             */
            public void setBusinessProperties(BusinessPropertiesType value) {
                this.businessProperties = value;
            }

            /**
             * Информация об управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link ManagingOrganizationType }
             *     
             */
            public ManagingOrganizationType getOrganizationData() {
                return organizationData;
            }

            /**
             * Sets the value of the organizationData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ManagingOrganizationType }
             *     
             * @see #getOrganizationData()
             */
            public void setOrganizationData(ManagingOrganizationType value) {
                this.organizationData = value;
            }

            /**
             * Документ прилагаемый к информации об управляющей организации
             * 
             * Gets the value of the attachedDocument property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachedDocument property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAttachedDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachedOrganizationDocumentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the attachedDocument property.
             */
            public List<AttachedOrganizationDocumentType> getAttachedDocument() {
                if (attachedDocument == null) {
                    attachedDocument = new ArrayList<>();
                }
                return this.attachedDocument;
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
         *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "orgGUID"
        })
        public static class PublishManagingOrganization {

            /**
             * Уникальный идентификатор управляющей организации
             * 
             */
            @XmlElement(name = "OrgGUID", required = true)
            protected String orgGUID;

            /**
             * Уникальный идентификатор управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgGUID() {
                return orgGUID;
            }

            /**
             * Sets the value of the orgGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgGUID()
             */
            public void setOrgGUID(String value) {
                this.orgGUID = value;
            }

        }

    }

}
