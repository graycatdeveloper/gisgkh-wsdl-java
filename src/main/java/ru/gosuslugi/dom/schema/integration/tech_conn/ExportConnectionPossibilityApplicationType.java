
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Составной тип. Экспорт заявления на предоставление информации о возможности подключения к сетям теплоснабжения
 * 
 * <p>Java class for exportConnectionPossibilityApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportConnectionPossibilityApplicationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicationOverview">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}TechnicalSpecificationApplicationStatusType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ApplicantCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *         <element name="Network">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TypeOfWork" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *         <element name="Applicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType"/>
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
 *                 <sequence>
 *                   <element name="ConnectioAgreementDeadline" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ObjectTechnicalParameters">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
 *                   <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
 *                   <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
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
@XmlType(name = "exportConnectionPossibilityApplicationType", propOrder = {
    "applicationOverview",
    "applicantCategory",
    "network",
    "typeOfWork",
    "applicant",
    "representative",
    "objectAddressInfo",
    "land",
    "facility",
    "objectTechnicalParameters",
    "documents"
})
public class ExportConnectionPossibilityApplicationType {

    /**
     * Общие сведения о заявлении
     * 
     */
    @XmlElement(name = "ApplicationOverview", required = true)
    protected ExportConnectionPossibilityApplicationType.ApplicationOverview applicationOverview;
    /**
     * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
     * 
     */
    @XmlElement(name = "ApplicantCategory", required = true)
    protected EsnsiItemType applicantCategory;
    /**
     * Вид сети для технологического присоединения. Значение из справочника "Виды сетей для технологического присоединения"
     * 
     */
    @XmlElement(name = "Network", required = true)
    protected ExportConnectionPossibilityApplicationType.Network network;
    /**
     * Основание обращения. Cправочник "Основание обращения за услугой по выдаче технических условий подключения и договора о подключении к системам теплоснабжения" ЕСНСИ
     * 
     */
    @XmlElement(name = "TypeOfWork", required = true)
    protected EsnsiItemType typeOfWork;
    /**
     * Сведения о заявителе
     * 
     */
    @XmlElement(name = "Applicant", required = true)
    protected ApplicantType applicant;
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
    protected List<ExportConnectionPossibilityApplicationType.Land> land;
    /**
     * Сведения об объекте недвижимости
     * 
     */
    @XmlElement(name = "Facility", required = true)
    protected ExportConnectionPossibilityApplicationType.Facility facility;
    /**
     * Технические характеристики подключаемого объекта
     * 
     */
    @XmlElement(name = "ObjectTechnicalParameters", required = true)
    protected ExportConnectionPossibilityApplicationType.ObjectTechnicalParameters objectTechnicalParameters;
    /**
     * Документы, приложенные к заявлению
     * 
     */
    @XmlElement(name = "Documents", required = true)
    protected ExportConnectionPossibilityApplicationType.Documents documents;

    /**
     * Общие сведения о заявлении
     * 
     * @return
     *     possible object is
     *     {@link ExportConnectionPossibilityApplicationType.ApplicationOverview }
     *     
     */
    public ExportConnectionPossibilityApplicationType.ApplicationOverview getApplicationOverview() {
        return applicationOverview;
    }

    /**
     * Sets the value of the applicationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportConnectionPossibilityApplicationType.ApplicationOverview }
     *     
     * @see #getApplicationOverview()
     */
    public void setApplicationOverview(ExportConnectionPossibilityApplicationType.ApplicationOverview value) {
        this.applicationOverview = value;
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
     * Вид сети для технологического присоединения. Значение из справочника "Виды сетей для технологического присоединения"
     * 
     * @return
     *     possible object is
     *     {@link ExportConnectionPossibilityApplicationType.Network }
     *     
     */
    public ExportConnectionPossibilityApplicationType.Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportConnectionPossibilityApplicationType.Network }
     *     
     * @see #getNetwork()
     */
    public void setNetwork(ExportConnectionPossibilityApplicationType.Network value) {
        this.network = value;
    }

    /**
     * Основание обращения. Cправочник "Основание обращения за услугой по выдаче технических условий подключения и договора о подключении к системам теплоснабжения" ЕСНСИ
     * 
     * @return
     *     possible object is
     *     {@link EsnsiItemType }
     *     
     */
    public EsnsiItemType getTypeOfWork() {
        return typeOfWork;
    }

    /**
     * Sets the value of the typeOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsnsiItemType }
     *     
     * @see #getTypeOfWork()
     */
    public void setTypeOfWork(EsnsiItemType value) {
        this.typeOfWork = value;
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
     * {@link ExportConnectionPossibilityApplicationType.Land }
     * </p>
     * 
     * 
     * @return
     *     The value of the land property.
     */
    public List<ExportConnectionPossibilityApplicationType.Land> getLand() {
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
     *     {@link ExportConnectionPossibilityApplicationType.Facility }
     *     
     */
    public ExportConnectionPossibilityApplicationType.Facility getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportConnectionPossibilityApplicationType.Facility }
     *     
     * @see #getFacility()
     */
    public void setFacility(ExportConnectionPossibilityApplicationType.Facility value) {
        this.facility = value;
    }

    /**
     * Технические характеристики подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link ExportConnectionPossibilityApplicationType.ObjectTechnicalParameters }
     *     
     */
    public ExportConnectionPossibilityApplicationType.ObjectTechnicalParameters getObjectTechnicalParameters() {
        return objectTechnicalParameters;
    }

    /**
     * Sets the value of the objectTechnicalParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportConnectionPossibilityApplicationType.ObjectTechnicalParameters }
     *     
     * @see #getObjectTechnicalParameters()
     */
    public void setObjectTechnicalParameters(ExportConnectionPossibilityApplicationType.ObjectTechnicalParameters value) {
        this.objectTechnicalParameters = value;
    }

    /**
     * Документы, приложенные к заявлению
     * 
     * @return
     *     possible object is
     *     {@link ExportConnectionPossibilityApplicationType.Documents }
     *     
     */
    public ExportConnectionPossibilityApplicationType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportConnectionPossibilityApplicationType.Documents }
     *     
     * @see #getDocuments()
     */
    public void setDocuments(ExportConnectionPossibilityApplicationType.Documents value) {
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
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}TechnicalSpecificationApplicationStatusType"/>
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
        protected TechnicalSpecificationApplicationStatusType status;

        /**
         * Статус заявления
         * 
         * @return
         *     possible object is
         *     {@link TechnicalSpecificationApplicationStatusType }
         *     
         */
        public TechnicalSpecificationApplicationStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link TechnicalSpecificationApplicationStatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(TechnicalSpecificationApplicationStatusType value) {
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
     *       <sequence>
     *         <element name="ConnectioAgreementDeadline" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "connectioAgreementDeadline"
    })
    public static class Facility
        extends FacilityCommonType
    {

        /**
         * Срок, в течение которого заявитель обратится в сетевую организацию за заключением договора о подключении
         * 
         */
        @XmlElement(name = "ConnectioAgreementDeadline", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar connectioAgreementDeadline;

        /**
         * Срок, в течение которого заявитель обратится в сетевую организацию за заключением договора о подключении
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getConnectioAgreementDeadline() {
            return connectioAgreementDeadline;
        }

        /**
         * Sets the value of the connectioAgreementDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getConnectioAgreementDeadline()
         */
        public void setConnectioAgreementDeadline(XMLGregorianCalendar value) {
            this.connectioAgreementDeadline = value;
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
     *         <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "networkType"
    })
    public static class Network {

        /**
         * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
         * 
         */
        @XmlElement(name = "NetworkType", required = true)
        protected NsiRef networkType;

        /**
         * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getNetworkType() {
            return networkType;
        }

        /**
         * Sets the value of the networkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getNetworkType()
         */
        public void setNetworkType(NsiRef value) {
            this.networkType = value;
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
     *         <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
     *         <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
     *         <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
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
        "pluggableHeatLoad",
        "heatConsumptionInfo",
        "heatTransfer"
    })
    public static class ObjectTechnicalParameters {

        /**
         * Подключаемая мощность (нагрузка) по теплоснабжению
         * 
         */
        @XmlElement(name = "PluggableHeatLoad", required = true)
        protected HeatingPowerDetailsType pluggableHeatLoad;
        /**
         * Сведения о теплопотреблении
         * 
         */
        @XmlElement(name = "HeatConsumptionInfo", required = true)
        protected HeatingConsumptionInfoType heatConsumptionInfo;
        /**
         * Сведения о теплоносителе
         * 
         */
        @XmlElement(name = "HeatTransfer")
        protected List<HeatTransferType> heatTransfer;

        /**
         * Подключаемая мощность (нагрузка) по теплоснабжению
         * 
         * @return
         *     possible object is
         *     {@link HeatingPowerDetailsType }
         *     
         */
        public HeatingPowerDetailsType getPluggableHeatLoad() {
            return pluggableHeatLoad;
        }

        /**
         * Sets the value of the pluggableHeatLoad property.
         * 
         * @param value
         *     allowed object is
         *     {@link HeatingPowerDetailsType }
         *     
         * @see #getPluggableHeatLoad()
         */
        public void setPluggableHeatLoad(HeatingPowerDetailsType value) {
            this.pluggableHeatLoad = value;
        }

        /**
         * Сведения о теплопотреблении
         * 
         * @return
         *     possible object is
         *     {@link HeatingConsumptionInfoType }
         *     
         */
        public HeatingConsumptionInfoType getHeatConsumptionInfo() {
            return heatConsumptionInfo;
        }

        /**
         * Sets the value of the heatConsumptionInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link HeatingConsumptionInfoType }
         *     
         * @see #getHeatConsumptionInfo()
         */
        public void setHeatConsumptionInfo(HeatingConsumptionInfoType value) {
            this.heatConsumptionInfo = value;
        }

        /**
         * Сведения о теплоносителе
         * 
         * Gets the value of the heatTransfer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the heatTransfer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHeatTransfer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HeatTransferType }
         * </p>
         * 
         * 
         * @return
         *     The value of the heatTransfer property.
         */
        public List<HeatTransferType> getHeatTransfer() {
            if (heatTransfer == null) {
                heatTransfer = new ArrayList<>();
            }
            return this.heatTransfer;
        }

    }

}
