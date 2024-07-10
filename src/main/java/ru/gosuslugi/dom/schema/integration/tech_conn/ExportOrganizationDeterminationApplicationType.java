
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Составной тип. Экспорт заявления на определение организации для технологического присоединения
 * 
 * <p>Java class for exportOrganizationDeterminationApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportOrganizationDeterminationApplicationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicationOverview">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OrganizationDeterminationApplicationStatusType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Network">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                   <element name="ConnectedResource" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Applicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType"/>
 *         <element name="ApplicantCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *         <element name="Representative" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}RepresentativeType" minOccurs="0"/>
 *         <element name="ObjectAddressInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ObjectAddressInfoType"/>
 *         <element name="Land" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}LandCommonType">
 *                 <sequence>
 *                   <element name="PermittedUse" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Facility">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FacilityCommonType">
 *                 <sequence minOccurs="0">
 *                   <element name="BuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="SignedBuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Documents">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element name="LandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="SignedLandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="LandBorderDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="SignedLandBorderDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
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
@XmlType(name = "exportOrganizationDeterminationApplicationType", propOrder = {
    "applicationOverview",
    "network",
    "applicant",
    "applicantCategory",
    "representative",
    "objectAddressInfo",
    "land",
    "facility",
    "documents"
})
public class ExportOrganizationDeterminationApplicationType {

    /**
     * Общие сведения о заявлении
     * 
     */
    @XmlElement(name = "ApplicationOverview", required = true)
    protected ExportOrganizationDeterminationApplicationType.ApplicationOverview applicationOverview;
    /**
     * Вид сети для технологического присоединения. Значение из справочника "Виды сетей для технологического присоединения"
     * 
     */
    @XmlElement(name = "Network", required = true)
    protected ExportOrganizationDeterminationApplicationType.Network network;
    /**
     * Сведения о заявителе
     * 
     */
    @XmlElement(name = "Applicant", required = true)
    protected ApplicantType applicant;
    /**
     * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
     * 
     */
    @XmlElement(name = "ApplicantCategory", required = true)
    protected EsnsiItemType applicantCategory;
    /**
     * Сведения о представителе заявителя
     * 
     */
    @XmlElement(name = "Representative")
    protected RepresentativeType representative;
    /**
     * Информация об адресе подключаемого объекта
     * 
     */
    @XmlElement(name = "ObjectAddressInfo", required = true)
    protected ObjectAddressInfoType objectAddressInfo;
    /**
     * Сведения о земельном участке
     * 
     */
    @XmlElement(name = "Land", required = true)
    protected List<ExportOrganizationDeterminationApplicationType.Land> land;
    /**
     * Сведения об объекте недвижимости
     * 
     */
    @XmlElement(name = "Facility", required = true)
    protected ExportOrganizationDeterminationApplicationType.Facility facility;
    /**
     * Документы, приложенные к заявлению
     * 
     */
    @XmlElement(name = "Documents", required = true)
    protected ExportOrganizationDeterminationApplicationType.Documents documents;

    /**
     * Общие сведения о заявлении
     * 
     * @return
     *     possible object is
     *     {@link ExportOrganizationDeterminationApplicationType.ApplicationOverview }
     *     
     */
    public ExportOrganizationDeterminationApplicationType.ApplicationOverview getApplicationOverview() {
        return applicationOverview;
    }

    /**
     * Sets the value of the applicationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOrganizationDeterminationApplicationType.ApplicationOverview }
     *     
     * @see #getApplicationOverview()
     */
    public void setApplicationOverview(ExportOrganizationDeterminationApplicationType.ApplicationOverview value) {
        this.applicationOverview = value;
    }

    /**
     * Вид сети для технологического присоединения. Значение из справочника "Виды сетей для технологического присоединения"
     * 
     * @return
     *     possible object is
     *     {@link ExportOrganizationDeterminationApplicationType.Network }
     *     
     */
    public ExportOrganizationDeterminationApplicationType.Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOrganizationDeterminationApplicationType.Network }
     *     
     * @see #getNetwork()
     */
    public void setNetwork(ExportOrganizationDeterminationApplicationType.Network value) {
        this.network = value;
    }

    /**
     * Сведения о заявителе
     * 
     * @return
     *     possible object is
     *     {@link ApplicantType }
     *     
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantType }
     *     
     * @see #getApplicant()
     */
    public void setApplicant(ApplicantType value) {
        this.applicant = value;
    }

    /**
     * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
     * 
     * @return
     *     possible object is
     *     {@link EsnsiItemType }
     *     
     */
    public EsnsiItemType getApplicantCategory() {
        return applicantCategory;
    }

    /**
     * Sets the value of the applicantCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsnsiItemType }
     *     
     * @see #getApplicantCategory()
     */
    public void setApplicantCategory(EsnsiItemType value) {
        this.applicantCategory = value;
    }

    /**
     * Сведения о представителе заявителя
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType }
     *     
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType }
     *     
     * @see #getRepresentative()
     */
    public void setRepresentative(RepresentativeType value) {
        this.representative = value;
    }

    /**
     * Информация об адресе подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link ObjectAddressInfoType }
     *     
     */
    public ObjectAddressInfoType getObjectAddressInfo() {
        return objectAddressInfo;
    }

    /**
     * Sets the value of the objectAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAddressInfoType }
     *     
     * @see #getObjectAddressInfo()
     */
    public void setObjectAddressInfo(ObjectAddressInfoType value) {
        this.objectAddressInfo = value;
    }

    /**
     * Сведения о земельном участке
     * 
     * Gets the value of the land property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the land property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOrganizationDeterminationApplicationType.Land }
     * </p>
     * 
     * 
     * @return
     *     The value of the land property.
     */
    public List<ExportOrganizationDeterminationApplicationType.Land> getLand() {
        if (land == null) {
            land = new ArrayList<>();
        }
        return this.land;
    }

    /**
     * Сведения об объекте недвижимости
     * 
     * @return
     *     possible object is
     *     {@link ExportOrganizationDeterminationApplicationType.Facility }
     *     
     */
    public ExportOrganizationDeterminationApplicationType.Facility getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOrganizationDeterminationApplicationType.Facility }
     *     
     * @see #getFacility()
     */
    public void setFacility(ExportOrganizationDeterminationApplicationType.Facility value) {
        this.facility = value;
    }

    /**
     * Документы, приложенные к заявлению
     * 
     * @return
     *     possible object is
     *     {@link ExportOrganizationDeterminationApplicationType.Documents }
     *     
     */
    public ExportOrganizationDeterminationApplicationType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOrganizationDeterminationApplicationType.Documents }
     *     
     * @see #getDocuments()
     */
    public void setDocuments(ExportOrganizationDeterminationApplicationType.Documents value) {
        this.documents = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
     *       <sequence>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OrganizationDeterminationApplicationStatusType"/>
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
        "status"
    })
    public static class ApplicationOverview
        extends ApplicationOverviewType
    {

        /**
         * Статус заявления
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "string")
        protected OrganizationDeterminationApplicationStatusType status;

        /**
         * Статус заявления
         * 
         * @return
         *     possible object is
         *     {@link OrganizationDeterminationApplicationStatusType }
         *     
         */
        public OrganizationDeterminationApplicationStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationDeterminationApplicationStatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(OrganizationDeterminationApplicationStatusType value) {
            this.status = value;
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
     *         <sequence>
     *           <element name="LandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *           <element name="SignedLandRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         </sequence>
     *         <sequence>
     *           <element name="LandBorderDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *           <element name="SignedLandBorderDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         </sequence>
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
        "landRightsDocument",
        "signedLandRightsDocument",
        "landBorderDocument",
        "signedLandBorderDocument"
    })
    public static class Documents {

        /**
         * Правоустанавливающий или правоудостоверяющий документ на земельный участок
         * 
         */
        @XmlElement(name = "LandRightsDocument")
        protected List<AttachmentType> landRightsDocument;
        /**
         * Правоустанавливающий или правоудостоверяющий документ на земельный участок с открепленной (detached) подписью
         * 
         */
        @XmlElement(name = "SignedLandRightsDocument")
        protected List<SignedAttachmentType> signedLandRightsDocument;
        /**
         * Документ, содеражащий сведения о границах земельного участка
         * 
         */
        @XmlElement(name = "LandBorderDocument")
        protected List<AttachmentType> landBorderDocument;
        /**
         * Документ, содеражащий сведения о границах земельного участка с открепленной (detached) подписью
         * 
         */
        @XmlElement(name = "SignedLandBorderDocument")
        protected List<SignedAttachmentType> signedLandBorderDocument;

        /**
         * Правоустанавливающий или правоудостоверяющий документ на земельный участок
         * 
         * Gets the value of the landRightsDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the landRightsDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLandRightsDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the landRightsDocument property.
         */
        public List<AttachmentType> getLandRightsDocument() {
            if (landRightsDocument == null) {
                landRightsDocument = new ArrayList<>();
            }
            return this.landRightsDocument;
        }

        /**
         * Правоустанавливающий или правоудостоверяющий документ на земельный участок с открепленной (detached) подписью
         * 
         * Gets the value of the signedLandRightsDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedLandRightsDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSignedLandRightsDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SignedAttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the signedLandRightsDocument property.
         */
        public List<SignedAttachmentType> getSignedLandRightsDocument() {
            if (signedLandRightsDocument == null) {
                signedLandRightsDocument = new ArrayList<>();
            }
            return this.signedLandRightsDocument;
        }

        /**
         * Документ, содеражащий сведения о границах земельного участка
         * 
         * Gets the value of the landBorderDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the landBorderDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLandBorderDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the landBorderDocument property.
         */
        public List<AttachmentType> getLandBorderDocument() {
            if (landBorderDocument == null) {
                landBorderDocument = new ArrayList<>();
            }
            return this.landBorderDocument;
        }

        /**
         * Документ, содеражащий сведения о границах земельного участка с открепленной (detached) подписью
         * 
         * Gets the value of the signedLandBorderDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedLandBorderDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSignedLandBorderDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SignedAttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the signedLandBorderDocument property.
         */
        public List<SignedAttachmentType> getSignedLandBorderDocument() {
            if (signedLandBorderDocument == null) {
                signedLandBorderDocument = new ArrayList<>();
            }
            return this.signedLandBorderDocument;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FacilityCommonType">
     *       <sequence minOccurs="0">
     *         <element name="BuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="SignedBuildingRightsDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "buildingRightsDocument",
        "signedBuildingRightsDocument"
    })
    public static class Facility
        extends FacilityCommonType
    {

        /**
         * Правоустанавливающий или правоудостоверяющий документ на подключаемый объект
         * 
         */
        @XmlElement(name = "BuildingRightsDocument")
        protected List<AttachmentType> buildingRightsDocument;
        /**
         * Правоустанавливающий или правоудостоверяющий документ на подключаемый объект с открепленной (detached) подписью
         * 
         */
        @XmlElement(name = "SignedBuildingRightsDocument")
        protected List<SignedAttachmentType> signedBuildingRightsDocument;

        /**
         * Правоустанавливающий или правоудостоверяющий документ на подключаемый объект
         * 
         * Gets the value of the buildingRightsDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the buildingRightsDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBuildingRightsDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the buildingRightsDocument property.
         */
        public List<AttachmentType> getBuildingRightsDocument() {
            if (buildingRightsDocument == null) {
                buildingRightsDocument = new ArrayList<>();
            }
            return this.buildingRightsDocument;
        }

        /**
         * Правоустанавливающий или правоудостоверяющий документ на подключаемый объект с открепленной (detached) подписью
         * 
         * Gets the value of the signedBuildingRightsDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedBuildingRightsDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSignedBuildingRightsDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SignedAttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the signedBuildingRightsDocument property.
         */
        public List<SignedAttachmentType> getSignedBuildingRightsDocument() {
            if (signedBuildingRightsDocument == null) {
                signedBuildingRightsDocument = new ArrayList<>();
            }
            return this.signedBuildingRightsDocument;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}LandCommonType">
     *       <sequence>
     *         <element name="PermittedUse" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
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
        "permittedUse"
    })
    public static class Land
        extends LandCommonType
    {

        /**
         * Вид разрешенного использования земельного участка. Справочник "Вид разрешенного использования земельного участка" ЕСНСИ
         * 
         */
        @XmlElement(name = "PermittedUse")
        protected EsnsiItemType permittedUse;

        /**
         * Вид разрешенного использования земельного участка. Справочник "Вид разрешенного использования земельного участка" ЕСНСИ
         * 
         * @return
         *     possible object is
         *     {@link EsnsiItemType }
         *     
         */
        public EsnsiItemType getPermittedUse() {
            return permittedUse;
        }

        /**
         * Sets the value of the permittedUse property.
         * 
         * @param value
         *     allowed object is
         *     {@link EsnsiItemType }
         *     
         * @see #getPermittedUse()
         */
        public void setPermittedUse(EsnsiItemType value) {
            this.permittedUse = value;
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
     *         <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
     *         <element name="ConnectedResource" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
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
        "networkType",
        "connectedResource"
    })
    public static class Network {

        /**
         * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
         * 
         */
        @XmlElement(name = "NetworkType", required = true)
        protected List<NsiRef> networkType;
        /**
         * Подключаемый ресурс. Справочник "Вид ресурсов или услуг, доступный для подключения" в ЕСНСИ
         * 
         */
        @XmlElement(name = "ConnectedResource")
        protected List<EsnsiItemType> connectedResource;

        /**
         * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
         * 
         * Gets the value of the networkType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNetworkType().add(newItem);
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
         *     The value of the networkType property.
         */
        public List<NsiRef> getNetworkType() {
            if (networkType == null) {
                networkType = new ArrayList<>();
            }
            return this.networkType;
        }

        /**
         * Подключаемый ресурс. Справочник "Вид ресурсов или услуг, доступный для подключения" в ЕСНСИ
         * 
         * Gets the value of the connectedResource property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectedResource property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getConnectedResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EsnsiItemType }
         * </p>
         * 
         * 
         * @return
         *     The value of the connectedResource property.
         */
        public List<EsnsiItemType> getConnectedResource() {
            if (connectedResource == null) {
                connectedResource = new ArrayList<>();
            }
            return this.connectedResource;
        }

    }

}
