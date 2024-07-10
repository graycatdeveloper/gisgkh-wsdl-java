
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.math.BigDecimal;
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
 * Составной тип. Экспорт заявления на предоставление технических условий подключения
 * 
 * <p>Java class for exportTechnicalSpecificationApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportTechnicalSpecificationApplicationType">
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
 *                   <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                   <element name="ConnectedResource" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TypeOfWork" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *         <sequence minOccurs="0">
 *           <element name="TerritoryDevelopmentContractNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String20Type"/>
 *           <element name="TerritoryDevelopmentContractDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="DecisionNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String20Type"/>
 *           <element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         </sequence>
 *         <element name="Applicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType"/>
 *         <element name="Representative" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}RepresentativeType" minOccurs="0"/>
 *         <element name="ObjectAddressInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ObjectAddressInfoType"/>
 *         <element name="Land" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}LandCommonType">
 *                 <sequence>
 *                   <element name="PermittedUse" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
 *                   <element name="BuildingFloorLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType" minOccurs="0"/>
 *                   <element name="BuildingHeightLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
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
 *                   <choice minOccurs="0">
 *                     <choice minOccurs="0">
 *                       <element name="ExpectedCommissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                       <element name="ExpectedEndOfConstructionNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     </choice>
 *                     <element name="ExpectedEndOfConstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   </choice>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ObjectTechnicalParameters">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <sequence>
 *                     <element name="PluggableWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType"/>
 *                     <element name="CurrentWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType" minOccurs="0"/>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
 *                     <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
 *                     <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="ReliabilityCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *                   </sequence>
 *                 </choice>
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
 *                   <sequence>
 *                     <element name="CopyOfProjectContract" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="SignedCopyOfProjectContract" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="LandPlan" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="SignedLandPlan" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "exportTechnicalSpecificationApplicationType", propOrder = {
    "applicationOverview",
    "applicantCategory",
    "network",
    "typeOfWork",
    "territoryDevelopmentContractNumber",
    "territoryDevelopmentContractDate",
    "decisionNumber",
    "decisionDate",
    "applicant",
    "representative",
    "objectAddressInfo",
    "land",
    "facility",
    "objectTechnicalParameters",
    "documents"
})
public class ExportTechnicalSpecificationApplicationType {

    /**
     * Общие сведения о заявлении
     * 
     */
    @XmlElement(name = "ApplicationOverview", required = true)
    protected ExportTechnicalSpecificationApplicationType.ApplicationOverview applicationOverview;
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
    protected ExportTechnicalSpecificationApplicationType.Network network;
    /**
     * Основание обращения. 
     * 					Для заявлений по теплоснабжению - справочник "Основание обращения за услугой по выдаче технических условий подключения и договора о подключении к системам теплоснабжения" ЕСНСИ
     * 					Для заявлений по водоснабению и водоотведению - справочник "Основание обращения за услугой по выдаче технических условий подключения к системам водоснабжения и (или) водоотведения" ЕСНСИ
     * 
     */
    @XmlElement(name = "TypeOfWork", required = true)
    protected EsnsiItemType typeOfWork;
    /**
     * Номер договора о комплексном развитии территории
     * 
     */
    @XmlElement(name = "TerritoryDevelopmentContractNumber")
    protected String territoryDevelopmentContractNumber;
    /**
     * Дата заключения договора о комплексном развитии территории
     * 
     */
    @XmlElement(name = "TerritoryDevelopmentContractDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar territoryDevelopmentContractDate;
    /**
     * Номер решения о предварительном согласовании предоставления земельного участка
     * 
     */
    @XmlElement(name = "DecisionNumber")
    protected String decisionNumber;
    /**
     * Дата решения о предварительном согласовании предоставления земельного участка
     * 
     */
    @XmlElement(name = "DecisionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
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
    protected List<ExportTechnicalSpecificationApplicationType.Land> land;
    /**
     * Сведения об объекте недвижимости
     * 
     */
    @XmlElement(name = "Facility", required = true)
    protected ExportTechnicalSpecificationApplicationType.Facility facility;
    /**
     * Технические характеристики подключаемого объекта
     * 
     */
    @XmlElement(name = "ObjectTechnicalParameters", required = true)
    protected ExportTechnicalSpecificationApplicationType.ObjectTechnicalParameters objectTechnicalParameters;
    /**
     * Документы, приложенные к заявлению
     * 
     */
    @XmlElement(name = "Documents", required = true)
    protected ExportTechnicalSpecificationApplicationType.Documents documents;

    /**
     * Общие сведения о заявлении
     * 
     * @return
     *     possible object is
     *     {@link ExportTechnicalSpecificationApplicationType.ApplicationOverview }
     *     
     */
    public ExportTechnicalSpecificationApplicationType.ApplicationOverview getApplicationOverview() {
        return applicationOverview;
    }

    /**
     * Sets the value of the applicationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTechnicalSpecificationApplicationType.ApplicationOverview }
     *     
     * @see #getApplicationOverview()
     */
    public void setApplicationOverview(ExportTechnicalSpecificationApplicationType.ApplicationOverview value) {
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
     *     {@link ExportTechnicalSpecificationApplicationType.Network }
     *     
     */
    public ExportTechnicalSpecificationApplicationType.Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTechnicalSpecificationApplicationType.Network }
     *     
     * @see #getNetwork()
     */
    public void setNetwork(ExportTechnicalSpecificationApplicationType.Network value) {
        this.network = value;
    }

    /**
     * Основание обращения. 
     * 					Для заявлений по теплоснабжению - справочник "Основание обращения за услугой по выдаче технических условий подключения и договора о подключении к системам теплоснабжения" ЕСНСИ
     * 					Для заявлений по водоснабению и водоотведению - справочник "Основание обращения за услугой по выдаче технических условий подключения к системам водоснабжения и (или) водоотведения" ЕСНСИ
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
     * Номер договора о комплексном развитии территории
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryDevelopmentContractNumber() {
        return territoryDevelopmentContractNumber;
    }

    /**
     * Sets the value of the territoryDevelopmentContractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTerritoryDevelopmentContractNumber()
     */
    public void setTerritoryDevelopmentContractNumber(String value) {
        this.territoryDevelopmentContractNumber = value;
    }

    /**
     * Дата заключения договора о комплексном развитии территории
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerritoryDevelopmentContractDate() {
        return territoryDevelopmentContractDate;
    }

    /**
     * Sets the value of the territoryDevelopmentContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTerritoryDevelopmentContractDate()
     */
    public void setTerritoryDevelopmentContractDate(XMLGregorianCalendar value) {
        this.territoryDevelopmentContractDate = value;
    }

    /**
     * Номер решения о предварительном согласовании предоставления земельного участка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNumber() {
        return decisionNumber;
    }

    /**
     * Sets the value of the decisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionNumber()
     */
    public void setDecisionNumber(String value) {
        this.decisionNumber = value;
    }

    /**
     * Дата решения о предварительном согласовании предоставления земельного участка
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDecisionDate()
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
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
     * {@link ExportTechnicalSpecificationApplicationType.Land }
     * </p>
     * 
     * 
     * @return
     *     The value of the land property.
     */
    public List<ExportTechnicalSpecificationApplicationType.Land> getLand() {
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
     *     {@link ExportTechnicalSpecificationApplicationType.Facility }
     *     
     */
    public ExportTechnicalSpecificationApplicationType.Facility getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTechnicalSpecificationApplicationType.Facility }
     *     
     * @see #getFacility()
     */
    public void setFacility(ExportTechnicalSpecificationApplicationType.Facility value) {
        this.facility = value;
    }

    /**
     * Технические характеристики подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link ExportTechnicalSpecificationApplicationType.ObjectTechnicalParameters }
     *     
     */
    public ExportTechnicalSpecificationApplicationType.ObjectTechnicalParameters getObjectTechnicalParameters() {
        return objectTechnicalParameters;
    }

    /**
     * Sets the value of the objectTechnicalParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTechnicalSpecificationApplicationType.ObjectTechnicalParameters }
     *     
     * @see #getObjectTechnicalParameters()
     */
    public void setObjectTechnicalParameters(ExportTechnicalSpecificationApplicationType.ObjectTechnicalParameters value) {
        this.objectTechnicalParameters = value;
    }

    /**
     * Документы, приложенные к заявлению
     * 
     * @return
     *     possible object is
     *     {@link ExportTechnicalSpecificationApplicationType.Documents }
     *     
     */
    public ExportTechnicalSpecificationApplicationType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportTechnicalSpecificationApplicationType.Documents }
     *     
     * @see #getDocuments()
     */
    public void setDocuments(ExportTechnicalSpecificationApplicationType.Documents value) {
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
     *         <sequence>
     *           <element name="CopyOfProjectContract" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *           <element name="SignedCopyOfProjectContract" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         </sequence>
     *         <sequence>
     *           <element name="LandPlan" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *           <element name="SignedLandPlan" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "signedLandBorderDocument",
        "copyOfProjectContract",
        "signedCopyOfProjectContract",
        "landPlan",
        "signedLandPlan"
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
         * Копия договора на подготовку проектной документации на подключаемый объект
         * 
         */
        @XmlElement(name = "CopyOfProjectContract")
        protected List<AttachmentType> copyOfProjectContract;
        /**
         * Копия договора на подготовку проектной документации на подключаемый объект c открепленной (detached) подписью
         * 
         */
        @XmlElement(name = "SignedCopyOfProjectContract")
        protected List<SignedAttachmentType> signedCopyOfProjectContract;
        /**
         * Градостроительный план земельного участка
         * 
         */
        @XmlElement(name = "LandPlan")
        protected List<AttachmentType> landPlan;
        /**
         * Градостроительный план земельного участка  c открепленной (detached) подписью
         * 
         */
        @XmlElement(name = "SignedLandPlan")
        protected List<SignedAttachmentType> signedLandPlan;

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

        /**
         * Копия договора на подготовку проектной документации на подключаемый объект
         * 
         * Gets the value of the copyOfProjectContract property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the copyOfProjectContract property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCopyOfProjectContract().add(newItem);
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
         *     The value of the copyOfProjectContract property.
         */
        public List<AttachmentType> getCopyOfProjectContract() {
            if (copyOfProjectContract == null) {
                copyOfProjectContract = new ArrayList<>();
            }
            return this.copyOfProjectContract;
        }

        /**
         * Копия договора на подготовку проектной документации на подключаемый объект c открепленной (detached) подписью
         * 
         * Gets the value of the signedCopyOfProjectContract property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedCopyOfProjectContract property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSignedCopyOfProjectContract().add(newItem);
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
         *     The value of the signedCopyOfProjectContract property.
         */
        public List<SignedAttachmentType> getSignedCopyOfProjectContract() {
            if (signedCopyOfProjectContract == null) {
                signedCopyOfProjectContract = new ArrayList<>();
            }
            return this.signedCopyOfProjectContract;
        }

        /**
         * Градостроительный план земельного участка
         * 
         * Gets the value of the landPlan property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the landPlan property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLandPlan().add(newItem);
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
         *     The value of the landPlan property.
         */
        public List<AttachmentType> getLandPlan() {
            if (landPlan == null) {
                landPlan = new ArrayList<>();
            }
            return this.landPlan;
        }

        /**
         * Градостроительный план земельного участка  c открепленной (detached) подписью
         * 
         * Gets the value of the signedLandPlan property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedLandPlan property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSignedLandPlan().add(newItem);
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
         *     The value of the signedLandPlan property.
         */
        public List<SignedAttachmentType> getSignedLandPlan() {
            if (signedLandPlan == null) {
                signedLandPlan = new ArrayList<>();
            }
            return this.signedLandPlan;
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
     *         <choice minOccurs="0">
     *           <choice minOccurs="0">
     *             <element name="ExpectedCommissioningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *             <element name="ExpectedEndOfConstructionNotificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *           </choice>
     *           <element name="ExpectedEndOfConstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "buildingRightsDocument",
        "signedBuildingRightsDocument",
        "expectedCommissioningDate",
        "expectedEndOfConstructionNotificationDate",
        "expectedEndOfConstructionDate"
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
         * Планируемый срок ввода в эксплуатацию объекта
         * 
         */
        @XmlElement(name = "ExpectedCommissioningDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expectedCommissioningDate;
        /**
         * Планируемая дата согласования уведомления об окончании строительства
         * 
         */
        @XmlElement(name = "ExpectedEndOfConstructionNotificationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expectedEndOfConstructionNotificationDate;
        /**
         * Планируемый срок завершения строительства объекта
         * 
         */
        @XmlElement(name = "ExpectedEndOfConstructionDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expectedEndOfConstructionDate;

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

        /**
         * Планируемый срок ввода в эксплуатацию объекта
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpectedCommissioningDate() {
            return expectedCommissioningDate;
        }

        /**
         * Sets the value of the expectedCommissioningDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getExpectedCommissioningDate()
         */
        public void setExpectedCommissioningDate(XMLGregorianCalendar value) {
            this.expectedCommissioningDate = value;
        }

        /**
         * Планируемая дата согласования уведомления об окончании строительства
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpectedEndOfConstructionNotificationDate() {
            return expectedEndOfConstructionNotificationDate;
        }

        /**
         * Sets the value of the expectedEndOfConstructionNotificationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getExpectedEndOfConstructionNotificationDate()
         */
        public void setExpectedEndOfConstructionNotificationDate(XMLGregorianCalendar value) {
            this.expectedEndOfConstructionNotificationDate = value;
        }

        /**
         * Планируемый срок завершения строительства объекта
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpectedEndOfConstructionDate() {
            return expectedEndOfConstructionDate;
        }

        /**
         * Sets the value of the expectedEndOfConstructionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getExpectedEndOfConstructionDate()
         */
        public void setExpectedEndOfConstructionDate(XMLGregorianCalendar value) {
            this.expectedEndOfConstructionDate = value;
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
     *         <element name="BuildingFloorLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}FloorCountType" minOccurs="0"/>
     *         <element name="BuildingHeightLimit" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}BuildingHeightType" minOccurs="0"/>
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
        "permittedUse",
        "buildingFloorLimit",
        "buildingHeightLimit"
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
         * Предельное количество этажей
         * 
         */
        @XmlElement(name = "BuildingFloorLimit")
        protected Integer buildingFloorLimit;
        /**
         * Предельная высота здания/сооружения
         * 
         */
        @XmlElement(name = "BuildingHeightLimit")
        protected BigDecimal buildingHeightLimit;

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

        /**
         * Предельное количество этажей
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBuildingFloorLimit() {
            return buildingFloorLimit;
        }

        /**
         * Sets the value of the buildingFloorLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getBuildingFloorLimit()
         */
        public void setBuildingFloorLimit(Integer value) {
            this.buildingFloorLimit = value;
        }

        /**
         * Предельная высота здания/сооружения
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBuildingHeightLimit() {
            return buildingHeightLimit;
        }

        /**
         * Sets the value of the buildingHeightLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getBuildingHeightLimit()
         */
        public void setBuildingHeightLimit(BigDecimal value) {
            this.buildingHeightLimit = value;
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <sequence>
     *           <element name="PluggableWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType"/>
     *           <element name="CurrentWaterLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}WaterSupplyPowerDetailsType" minOccurs="0"/>
     *         </sequence>
     *         <sequence>
     *           <element name="PluggableHeatLoad" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingPowerDetailsType"/>
     *           <element name="HeatConsumptionInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatingConsumptionInfoType"/>
     *           <element name="HeatTransfer" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}HeatTransferType" maxOccurs="unbounded" minOccurs="0"/>
     *           <element name="ReliabilityCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
     *         </sequence>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pluggableWaterLoad",
        "currentWaterLoad",
        "pluggableHeatLoad",
        "heatConsumptionInfo",
        "heatTransfer",
        "reliabilityCategory"
    })
    public static class ObjectTechnicalParameters {

        /**
         * Подключаемая мощность (нагрузка) по водоснабжени и (или) водоотведению
         * 
         */
        @XmlElement(name = "PluggableWaterLoad")
        protected WaterSupplyPowerDetailsType pluggableWaterLoad;
        /**
         * Текущая подключеная мощность (нагрузка) по водоснабжени и (или) водоотведению
         * 
         */
        @XmlElement(name = "CurrentWaterLoad")
        protected WaterSupplyPowerDetailsType currentWaterLoad;
        /**
         * Подключаемая мощность (нагрузка) по теплоснабжению
         * 
         */
        @XmlElement(name = "PluggableHeatLoad")
        protected HeatingPowerDetailsType pluggableHeatLoad;
        /**
         * Сведения о теплопотреблении
         * 
         */
        @XmlElement(name = "HeatConsumptionInfo")
        protected HeatingConsumptionInfoType heatConsumptionInfo;
        /**
         * Сведения о теплоносителе
         * 
         */
        @XmlElement(name = "HeatTransfer")
        protected List<HeatTransferType> heatTransfer;
        /**
         * Категория надежности. Справочник "Категория надежности теплоснабжения подключаемого объекта" ЕСНСИ
         * 
         */
        @XmlElement(name = "ReliabilityCategory")
        protected EsnsiItemType reliabilityCategory;

        /**
         * Подключаемая мощность (нагрузка) по водоснабжени и (или) водоотведению
         * 
         * @return
         *     possible object is
         *     {@link WaterSupplyPowerDetailsType }
         *     
         */
        public WaterSupplyPowerDetailsType getPluggableWaterLoad() {
            return pluggableWaterLoad;
        }

        /**
         * Sets the value of the pluggableWaterLoad property.
         * 
         * @param value
         *     allowed object is
         *     {@link WaterSupplyPowerDetailsType }
         *     
         * @see #getPluggableWaterLoad()
         */
        public void setPluggableWaterLoad(WaterSupplyPowerDetailsType value) {
            this.pluggableWaterLoad = value;
        }

        /**
         * Текущая подключеная мощность (нагрузка) по водоснабжени и (или) водоотведению
         * 
         * @return
         *     possible object is
         *     {@link WaterSupplyPowerDetailsType }
         *     
         */
        public WaterSupplyPowerDetailsType getCurrentWaterLoad() {
            return currentWaterLoad;
        }

        /**
         * Sets the value of the currentWaterLoad property.
         * 
         * @param value
         *     allowed object is
         *     {@link WaterSupplyPowerDetailsType }
         *     
         * @see #getCurrentWaterLoad()
         */
        public void setCurrentWaterLoad(WaterSupplyPowerDetailsType value) {
            this.currentWaterLoad = value;
        }

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

        /**
         * Категория надежности. Справочник "Категория надежности теплоснабжения подключаемого объекта" ЕСНСИ
         * 
         * @return
         *     possible object is
         *     {@link EsnsiItemType }
         *     
         */
        public EsnsiItemType getReliabilityCategory() {
            return reliabilityCategory;
        }

        /**
         * Sets the value of the reliabilityCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link EsnsiItemType }
         *     
         * @see #getReliabilityCategory()
         */
        public void setReliabilityCategory(EsnsiItemType value) {
            this.reliabilityCategory = value;
        }

    }

}
