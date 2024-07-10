
package ru.gosuslugi.dom.schema.integration.inspection;

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
 * Проверка.
 * 
 * <p>Java class for ExaminationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExaminationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExaminationOverview">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <sequence>
 *                       <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                       <element name="URIRegistrationNumber" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <pattern value="\d{14}|\d{12}"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="URIRegistrationDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
 *                       <element name="PublishERP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     </sequence>
 *                   </choice>
 *                   <element name="ExaminationTypeType">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="Scheduled">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ScheduledExaminationSubjectInfoType"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Unscheduled">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="BaseURIRegistration" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                                       <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}UnscheduledExaminationSubjectInfoType"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="OversightActivitiesRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="ExaminationForm" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *                   <element name="OrderDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RegulatoryAuthorityInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FunctionRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FunctionRegistryNumberType"/>
 *                   <element name="RegulatoryAuthorityID" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}RegulatoryAuthorityIDType">
 *                         <pattern value="\d{1,22}"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="AuthorizedPersons" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ERPExecutiveType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                             <element name="FullName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
 *                             <element name="Position" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="InvolvedExperts" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NotificationInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="NotRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="RequiredAndNotSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <sequence>
 *                     <element name="NotificationDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *                     <element name="NotificationMethod" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   </sequence>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExaminationInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="BasedOnPrecept" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="RelatedExamination" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Objective" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   <element name="AdditionalInfoAboutExamBase" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                   <element name="Tasks" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   <element name="Object" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                   <element name="From" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateTimeType"/>
 *                   <element name="To" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateTimeType" minOccurs="0"/>
 *                   <element name="Duration" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="WorkDays" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType">
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="WorkHours" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType">
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="CooperationWith" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2048Type" minOccurs="0"/>
 *                   <element name="ProsecutorAgreementInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ProsecutorAgreementInformationType" minOccurs="0"/>
 *                   <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String4000Type" minOccurs="0"/>
 *                   <element name="InspectionInabilityReason" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String4000Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExecutingInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Event" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationEventType" maxOccurs="unbounded"/>
 *                   <element name="Place" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationPlaceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ResultsInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ResultsInfoType" minOccurs="0"/>
 *         <element name="Attachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExaminationType", propOrder = {
    "examinationOverview",
    "regulatoryAuthorityInformation",
    "notificationInfo",
    "examinationInfo",
    "executingInfo",
    "resultsInfo",
    "attachments",
    "signedAttachments"
})
public class ExaminationType {

    /**
     * Общая информация о проверке
     * 
     */
    @XmlElement(name = "ExaminationOverview", required = true)
    protected ExaminationType.ExaminationOverview examinationOverview;
    /**
     * Информация об органе контроля
     * 
     */
    @XmlElement(name = "RegulatoryAuthorityInformation", required = true)
    protected ExaminationType.RegulatoryAuthorityInformation regulatoryAuthorityInformation;
    /**
     * Информация об уведомлении
     * 
     */
    @XmlElement(name = "NotificationInfo", required = true)
    protected ExaminationType.NotificationInfo notificationInfo;
    /**
     * Сведения о проверке
     * 
     */
    @XmlElement(name = "ExaminationInfo", required = true)
    protected ExaminationType.ExaminationInfo examinationInfo;
    /**
     * Информация о мероприятиях
     * 
     */
    @XmlElement(name = "ExecutingInfo")
    protected ExaminationType.ExecutingInfo executingInfo;
    /**
     * Сведения о результатах проверки
     * 
     */
    @XmlElement(name = "ResultsInfo")
    protected ResultsInfoType resultsInfo;
    /**
     * Документы проверки
     * 
     */
    @XmlElement(name = "Attachments")
    protected List<AttachmentType> attachments;
    /**
     * Электронные документы проверки с открепленной (detached) подписью
     * 
     */
    @XmlElement(name = "SignedAttachments")
    protected List<SignedAttachmentType> signedAttachments;

    /**
     * Общая информация о проверке
     * 
     * @return
     *     possible object is
     *     {@link ExaminationType.ExaminationOverview }
     *     
     */
    public ExaminationType.ExaminationOverview getExaminationOverview() {
        return examinationOverview;
    }

    /**
     * Sets the value of the examinationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationType.ExaminationOverview }
     *     
     * @see #getExaminationOverview()
     */
    public void setExaminationOverview(ExaminationType.ExaminationOverview value) {
        this.examinationOverview = value;
    }

    /**
     * Информация об органе контроля
     * 
     * @return
     *     possible object is
     *     {@link ExaminationType.RegulatoryAuthorityInformation }
     *     
     */
    public ExaminationType.RegulatoryAuthorityInformation getRegulatoryAuthorityInformation() {
        return regulatoryAuthorityInformation;
    }

    /**
     * Sets the value of the regulatoryAuthorityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationType.RegulatoryAuthorityInformation }
     *     
     * @see #getRegulatoryAuthorityInformation()
     */
    public void setRegulatoryAuthorityInformation(ExaminationType.RegulatoryAuthorityInformation value) {
        this.regulatoryAuthorityInformation = value;
    }

    /**
     * Информация об уведомлении
     * 
     * @return
     *     possible object is
     *     {@link ExaminationType.NotificationInfo }
     *     
     */
    public ExaminationType.NotificationInfo getNotificationInfo() {
        return notificationInfo;
    }

    /**
     * Sets the value of the notificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationType.NotificationInfo }
     *     
     * @see #getNotificationInfo()
     */
    public void setNotificationInfo(ExaminationType.NotificationInfo value) {
        this.notificationInfo = value;
    }

    /**
     * Сведения о проверке
     * 
     * @return
     *     possible object is
     *     {@link ExaminationType.ExaminationInfo }
     *     
     */
    public ExaminationType.ExaminationInfo getExaminationInfo() {
        return examinationInfo;
    }

    /**
     * Sets the value of the examinationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationType.ExaminationInfo }
     *     
     * @see #getExaminationInfo()
     */
    public void setExaminationInfo(ExaminationType.ExaminationInfo value) {
        this.examinationInfo = value;
    }

    /**
     * Информация о мероприятиях
     * 
     * @return
     *     possible object is
     *     {@link ExaminationType.ExecutingInfo }
     *     
     */
    public ExaminationType.ExecutingInfo getExecutingInfo() {
        return executingInfo;
    }

    /**
     * Sets the value of the executingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExaminationType.ExecutingInfo }
     *     
     * @see #getExecutingInfo()
     */
    public void setExecutingInfo(ExaminationType.ExecutingInfo value) {
        this.executingInfo = value;
    }

    /**
     * Сведения о результатах проверки
     * 
     * @return
     *     possible object is
     *     {@link ResultsInfoType }
     *     
     */
    public ResultsInfoType getResultsInfo() {
        return resultsInfo;
    }

    /**
     * Sets the value of the resultsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsInfoType }
     *     
     * @see #getResultsInfo()
     */
    public void setResultsInfo(ResultsInfoType value) {
        this.resultsInfo = value;
    }

    /**
     * Документы проверки
     * 
     * Gets the value of the attachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachments().add(newItem);
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
     *     The value of the attachments property.
     */
    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        return this.attachments;
    }

    /**
     * Электронные документы проверки с открепленной (detached) подписью
     * 
     * Gets the value of the signedAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignedAttachments().add(newItem);
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
     *     The value of the signedAttachments property.
     */
    public List<SignedAttachmentType> getSignedAttachments() {
        if (signedAttachments == null) {
            signedAttachments = new ArrayList<>();
        }
        return this.signedAttachments;
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
     *         <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="BasedOnPrecept" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="RelatedExamination" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Objective" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         <element name="AdditionalInfoAboutExamBase" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="Tasks" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         <element name="Object" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
     *         <element name="From" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateTimeType"/>
     *         <element name="To" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateTimeType" minOccurs="0"/>
     *         <element name="Duration" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="WorkDays" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType">
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="WorkHours" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType">
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="CooperationWith" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2048Type" minOccurs="0"/>
     *         <element name="ProsecutorAgreementInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ProsecutorAgreementInformationType" minOccurs="0"/>
     *         <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String4000Type" minOccurs="0"/>
     *         <element name="InspectionInabilityReason" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String4000Type" minOccurs="0"/>
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
        "base",
        "basedOnPrecept",
        "relatedExamination",
        "objective",
        "additionalInfoAboutExamBase",
        "tasks",
        "object",
        "from",
        "to",
        "duration",
        "cooperationWith",
        "prosecutorAgreementInformation",
        "additionalInfo",
        "inspectionInabilityReason"
    })
    public static class ExaminationInfo {

        /**
         * Основание проведения проверки. НСИ "Основание проведения проверки" (реестровый номер 68).
         * 
         */
        @XmlElement(name = "Base")
        protected NsiRef base;
        /**
         * Предписание, на основании которого проводится проверка. Доступно для заполнения, только при следующих условиях:           В качестве "Основание проведения проверки" указано одно из следующих:       - "Истечение срока исполнения юридическим лицом, индивидуальным предпринимателем ранее выданного предписания об устранении выявленного нарушения обязательных требований и (или) требований, установленных муниципальными правовыми актами";                              - "Истечение срока исполнения лицензиатом ранее выданного лицензирующим органом предписания об устранении выявленного нарушения лицензионных требований" 
         * - "Истечение срока исполнения физическим лицом ранее выданного предписания об устранении выявленного нарушения обязательных требований и (или) требований, установленных правовыми актами"
         * - "Наличие ходатайства лицензиата о проведении лицензирующим органом внеплановой выездной проверки в целях установления факта досрочного исполнения предписания лицензирующего органа"   ИЛИ                                      для "Предмет проверки" указано одно из следующих:
         * - "Выполнение предписаний органов государственного контроля (надзора), органов муниципального контроля";
         * - "Принимаемые лицензиатом меры по исполнению предписаний об устранении выявленных нарушений лицензионных требований"
         * 
         */
        @XmlElement(name = "BasedOnPrecept")
        protected ExaminationType.ExaminationInfo.BasedOnPrecept basedOnPrecept;
        /**
         * Связанная проверка.
         * 
         */
        @XmlElement(name = "RelatedExamination")
        protected ExaminationType.ExaminationInfo.RelatedExamination relatedExamination;
        /**
         * Цель проведения проверки с реквизитами документов основания.
         * 
         */
        @XmlElement(name = "Objective", required = true)
        protected String objective;
        /**
         * Дополнительная информация об основаниих проведения проверки.
         * 
         */
        @XmlElement(name = "AdditionalInfoAboutExamBase")
        protected String additionalInfoAboutExamBase;
        /**
         * Задачи проведения проверки.
         * 
         */
        @XmlElement(name = "Tasks", required = true)
        protected String tasks;
        /**
         * Предмет проверки. НСИ "Предмет проверки" (реестровый номер 69).
         * 
         */
        @XmlElement(name = "Object", required = true)
        protected List<NsiRef> object;
        /**
         * Срок проведения проверки с (включительно) - дата начала проведения проверки.
         * 
         */
        @XmlElement(name = "From", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar from;
        /**
         * Срок проведения проверки по (включительно) - дата окончания проведения проверки.
         * Обязательно для заполнения для внеплановой проверки, субъектом которой является ЮЛ или ИП.
         * 
         */
        @XmlElement(name = "To")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar to;
        /**
         * Срок проведения проверки. Должно быть обязательно заполнено хотя бы одно из полей tns:WorkDays или tns:WorkHours, если субъектом проверки является ЮЛ или ИП.
         * 
         */
        @XmlElement(name = "Duration")
        protected ExaminationType.ExaminationInfo.Duration duration;
        /**
         * Орган государственного надзора (контроля) и/или орган муниципального контроля,  с которым  проверка проводится совместно.
         * 
         */
        @XmlElement(name = "CooperationWith")
        protected String cooperationWith;
        /**
         * Информация о согласовании проведения проверки с органами прокуратуры                Обязательно для заполнения, если у проверки в BaseURIRegistration (Основание регистрации проверки в ФГИС "ЕРП") = "Заявление КО"
         * 
         */
        @XmlElement(name = "ProsecutorAgreementInformation")
        protected ProsecutorAgreementInformationType prosecutorAgreementInformation;
        /**
         * Дополнительная информация о проверке.
         * 
         */
        @XmlElement(name = "AdditionalInfo")
        protected String additionalInfo;
        /**
         * Причины невозможности проведения проверки
         * 
         */
        @XmlElement(name = "InspectionInabilityReason")
        protected String inspectionInabilityReason;

        /**
         * Основание проведения проверки. НСИ "Основание проведения проверки" (реестровый номер 68).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getBase()
         */
        public void setBase(NsiRef value) {
            this.base = value;
        }

        /**
         * Предписание, на основании которого проводится проверка. Доступно для заполнения, только при следующих условиях:           В качестве "Основание проведения проверки" указано одно из следующих:       - "Истечение срока исполнения юридическим лицом, индивидуальным предпринимателем ранее выданного предписания об устранении выявленного нарушения обязательных требований и (или) требований, установленных муниципальными правовыми актами";                              - "Истечение срока исполнения лицензиатом ранее выданного лицензирующим органом предписания об устранении выявленного нарушения лицензионных требований" 
         * - "Истечение срока исполнения физическим лицом ранее выданного предписания об устранении выявленного нарушения обязательных требований и (или) требований, установленных правовыми актами"
         * - "Наличие ходатайства лицензиата о проведении лицензирующим органом внеплановой выездной проверки в целях установления факта досрочного исполнения предписания лицензирующего органа"   ИЛИ                                      для "Предмет проверки" указано одно из следующих:
         * - "Выполнение предписаний органов государственного контроля (надзора), органов муниципального контроля";
         * - "Принимаемые лицензиатом меры по исполнению предписаний об устранении выявленных нарушений лицензионных требований"
         * 
         * @return
         *     possible object is
         *     {@link ExaminationType.ExaminationInfo.BasedOnPrecept }
         *     
         */
        public ExaminationType.ExaminationInfo.BasedOnPrecept getBasedOnPrecept() {
            return basedOnPrecept;
        }

        /**
         * Sets the value of the basedOnPrecept property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationType.ExaminationInfo.BasedOnPrecept }
         *     
         * @see #getBasedOnPrecept()
         */
        public void setBasedOnPrecept(ExaminationType.ExaminationInfo.BasedOnPrecept value) {
            this.basedOnPrecept = value;
        }

        /**
         * Связанная проверка.
         * 
         * @return
         *     possible object is
         *     {@link ExaminationType.ExaminationInfo.RelatedExamination }
         *     
         */
        public ExaminationType.ExaminationInfo.RelatedExamination getRelatedExamination() {
            return relatedExamination;
        }

        /**
         * Sets the value of the relatedExamination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationType.ExaminationInfo.RelatedExamination }
         *     
         * @see #getRelatedExamination()
         */
        public void setRelatedExamination(ExaminationType.ExaminationInfo.RelatedExamination value) {
            this.relatedExamination = value;
        }

        /**
         * Цель проведения проверки с реквизитами документов основания.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjective() {
            return objective;
        }

        /**
         * Sets the value of the objective property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getObjective()
         */
        public void setObjective(String value) {
            this.objective = value;
        }

        /**
         * Дополнительная информация об основаниих проведения проверки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfoAboutExamBase() {
            return additionalInfoAboutExamBase;
        }

        /**
         * Sets the value of the additionalInfoAboutExamBase property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInfoAboutExamBase()
         */
        public void setAdditionalInfoAboutExamBase(String value) {
            this.additionalInfoAboutExamBase = value;
        }

        /**
         * Задачи проведения проверки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTasks() {
            return tasks;
        }

        /**
         * Sets the value of the tasks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTasks()
         */
        public void setTasks(String value) {
            this.tasks = value;
        }

        /**
         * Предмет проверки. НСИ "Предмет проверки" (реестровый номер 69).
         * 
         * Gets the value of the object property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the object property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getObject().add(newItem);
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
         *     The value of the object property.
         */
        public List<NsiRef> getObject() {
            if (object == null) {
                object = new ArrayList<>();
            }
            return this.object;
        }

        /**
         * Срок проведения проверки с (включительно) - дата начала проведения проверки.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getFrom()
         */
        public void setFrom(XMLGregorianCalendar value) {
            this.from = value;
        }

        /**
         * Срок проведения проверки по (включительно) - дата окончания проведения проверки.
         * Обязательно для заполнения для внеплановой проверки, субъектом которой является ЮЛ или ИП.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getTo()
         */
        public void setTo(XMLGregorianCalendar value) {
            this.to = value;
        }

        /**
         * Срок проведения проверки. Должно быть обязательно заполнено хотя бы одно из полей tns:WorkDays или tns:WorkHours, если субъектом проверки является ЮЛ или ИП.
         * 
         * @return
         *     possible object is
         *     {@link ExaminationType.ExaminationInfo.Duration }
         *     
         */
        public ExaminationType.ExaminationInfo.Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationType.ExaminationInfo.Duration }
         *     
         * @see #getDuration()
         */
        public void setDuration(ExaminationType.ExaminationInfo.Duration value) {
            this.duration = value;
        }

        /**
         * Орган государственного надзора (контроля) и/или орган муниципального контроля,  с которым  проверка проводится совместно.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCooperationWith() {
            return cooperationWith;
        }

        /**
         * Sets the value of the cooperationWith property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCooperationWith()
         */
        public void setCooperationWith(String value) {
            this.cooperationWith = value;
        }

        /**
         * Информация о согласовании проведения проверки с органами прокуратуры                Обязательно для заполнения, если у проверки в BaseURIRegistration (Основание регистрации проверки в ФГИС "ЕРП") = "Заявление КО"
         * 
         * @return
         *     possible object is
         *     {@link ProsecutorAgreementInformationType }
         *     
         */
        public ProsecutorAgreementInformationType getProsecutorAgreementInformation() {
            return prosecutorAgreementInformation;
        }

        /**
         * Sets the value of the prosecutorAgreementInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProsecutorAgreementInformationType }
         *     
         * @see #getProsecutorAgreementInformation()
         */
        public void setProsecutorAgreementInformation(ProsecutorAgreementInformationType value) {
            this.prosecutorAgreementInformation = value;
        }

        /**
         * Дополнительная информация о проверке.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfo() {
            return additionalInfo;
        }

        /**
         * Sets the value of the additionalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInfo()
         */
        public void setAdditionalInfo(String value) {
            this.additionalInfo = value;
        }

        /**
         * Причины невозможности проведения проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInspectionInabilityReason() {
            return inspectionInabilityReason;
        }

        /**
         * Sets the value of the inspectionInabilityReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInspectionInabilityReason()
         */
        public void setInspectionInabilityReason(String value) {
            this.inspectionInabilityReason = value;
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
         *         <element name="PreceptGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "preceptGuid"
        })
        public static class BasedOnPrecept {

            /**
             * Идентификатор предписания в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "PreceptGuid", required = true)
            protected String preceptGuid;

            /**
             * Идентификатор предписания в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreceptGuid() {
                return preceptGuid;
            }

            /**
             * Sets the value of the preceptGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPreceptGuid()
             */
            public void setPreceptGuid(String value) {
                this.preceptGuid = value;
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
         *         <element name="WorkDays" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType">
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="WorkHours" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}TimeUnitCountType">
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
            "workDays",
            "workHours"
        })
        public static class Duration {

            /**
             * Рабочих дней.  Продолжительность проведения проверки, дней
             * 
             */
            @XmlElement(name = "WorkDays")
            protected Double workDays;
            /**
             * Рабочих часов (для МСП и МКП).
             * 
             */
            @XmlElement(name = "WorkHours")
            protected Double workHours;

            /**
             * Рабочих дней.  Продолжительность проведения проверки, дней
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWorkDays() {
                return workDays;
            }

            /**
             * Sets the value of the workDays property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             * @see #getWorkDays()
             */
            public void setWorkDays(Double value) {
                this.workDays = value;
            }

            /**
             * Рабочих часов (для МСП и МКП).
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getWorkHours() {
                return workHours;
            }

            /**
             * Sets the value of the workHours property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             * @see #getWorkHours()
             */
            public void setWorkHours(Double value) {
                this.workHours = value;
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
         *         <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "examinationGuid"
        })
        public static class RelatedExamination {

            /**
             * Идентификатор проверки в ГИС ЖКХ.
             * 
             */
            @XmlElement(name = "ExaminationGuid", required = true)
            protected String examinationGuid;

            /**
             * Идентификатор проверки в ГИС ЖКХ.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExaminationGuid() {
                return examinationGuid;
            }

            /**
             * Sets the value of the examinationGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getExaminationGuid()
             */
            public void setExaminationGuid(String value) {
                this.examinationGuid = value;
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
     *         <choice>
     *           <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <sequence>
     *             <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *             <element name="URIRegistrationNumber" minOccurs="0">
     *               <simpleType>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   <pattern value="\d{14}|\d{12}"/>
     *                 </restriction>
     *               </simpleType>
     *             </element>
     *             <element name="URIRegistrationDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
     *             <element name="PublishERP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *           </sequence>
     *         </choice>
     *         <element name="ExaminationTypeType">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="Scheduled">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ScheduledExaminationSubjectInfoType"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Unscheduled">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="BaseURIRegistration" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                             <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}UnscheduledExaminationSubjectInfoType"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="OversightActivitiesRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="ExaminationForm" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
     *         <element name="OrderDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
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
        "shouldNotBeRegistered",
        "shouldBeRegistered",
        "uriRegistrationNumber",
        "uriRegistrationDate",
        "publishERP",
        "examinationTypeType",
        "oversightActivitiesRef",
        "examinationForm",
        "orderNumber",
        "orderDate"
    })
    public static class ExaminationOverview {

        /**
         * Проверка не должна быть зарегистрирована в Едином реестре проверок.
         * 
         */
        @XmlElement(name = "ShouldNotBeRegistered")
        protected Boolean shouldNotBeRegistered;
        /**
         * Проверка должна быть зарегистрирована в Едином реестре проверок.
         * 
         */
        @XmlElement(name = "ShouldBeRegistered")
        protected Boolean shouldBeRegistered;
        /**
         * Учетный номер проверки в Едином реестре проверок.
         * 
         */
        @XmlElement(name = "URIRegistrationNumber")
        protected String uriRegistrationNumber;
        /**
         * Дата присвоения учетного номера проверки
         * 
         */
        @XmlElement(name = "URIRegistrationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar uriRegistrationDate;
        /**
         * Опубликовать в открытой части ЕРП?
         * 
         * (Выполняется публикация проверки в открытой части ЕРП)
         * Публикация в ЕРП доступна для следующих сценариев: 
         *  1. Создание информации о проверке
         *  2. Изменение информации о проверке
         * 
         * Если не заполнено при первичном размещении, то в открытой части ЕРП проверка не будет размещена.
         * 
         * Если указано "true" при первичном размещении или при изменении, то проверка будет размещена в открытой части ЕРП.
         * 
         * Если значение не заполнено  при изменении (ранее было указано "true"), то проверка снимается с публикации в ЕРП.
         * 
         */
        @XmlElement(name = "PublishERP")
        protected Boolean publishERP;
        /**
         * Вид проверки, информация о субъекте проверки
         * 
         */
        @XmlElement(name = "ExaminationTypeType", required = true)
        protected ExaminationType.ExaminationOverview.ExaminationTypeType examinationTypeType;
        /**
         * Вид осуществления контрольной деятельности. НСИ
         * 
         */
        @XmlElement(name = "OversightActivitiesRef", required = true)
        protected NsiRef oversightActivitiesRef;
        /**
         * Форма проведения проверки. НСИ "Форма проведения проверки" (реестровый номер 71).
         * 
         */
        @XmlElement(name = "ExaminationForm", required = true)
        protected NsiRef examinationForm;
        /**
         * Номер распоряжения (приказа). Обязательно для заполнения, если Вид проверки = «Внеплановая» и присылается tns:ShouldBeRegistered
         * 
         */
        @XmlElement(name = "OrderNumber")
        protected String orderNumber;
        /**
         * Дата утверждения распоряжения (приказа). Обязательно для заполнения, если Вид проверки = «Внеплановая» и присылается tns:ShouldBeRegistered
         * 
         */
        @XmlElement(name = "OrderDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar orderDate;

        /**
         * Проверка не должна быть зарегистрирована в Едином реестре проверок.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShouldNotBeRegistered() {
            return shouldNotBeRegistered;
        }

        /**
         * Sets the value of the shouldNotBeRegistered property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isShouldNotBeRegistered()
         */
        public void setShouldNotBeRegistered(Boolean value) {
            this.shouldNotBeRegistered = value;
        }

        /**
         * Проверка должна быть зарегистрирована в Едином реестре проверок.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShouldBeRegistered() {
            return shouldBeRegistered;
        }

        /**
         * Sets the value of the shouldBeRegistered property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isShouldBeRegistered()
         */
        public void setShouldBeRegistered(Boolean value) {
            this.shouldBeRegistered = value;
        }

        /**
         * Учетный номер проверки в Едином реестре проверок.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURIRegistrationNumber() {
            return uriRegistrationNumber;
        }

        /**
         * Sets the value of the uriRegistrationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getURIRegistrationNumber()
         */
        public void setURIRegistrationNumber(String value) {
            this.uriRegistrationNumber = value;
        }

        /**
         * Дата присвоения учетного номера проверки
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getURIRegistrationDate() {
            return uriRegistrationDate;
        }

        /**
         * Sets the value of the uriRegistrationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getURIRegistrationDate()
         */
        public void setURIRegistrationDate(XMLGregorianCalendar value) {
            this.uriRegistrationDate = value;
        }

        /**
         * Опубликовать в открытой части ЕРП?
         * 
         * (Выполняется публикация проверки в открытой части ЕРП)
         * Публикация в ЕРП доступна для следующих сценариев: 
         *  1. Создание информации о проверке
         *  2. Изменение информации о проверке
         * 
         * Если не заполнено при первичном размещении, то в открытой части ЕРП проверка не будет размещена.
         * 
         * Если указано "true" при первичном размещении или при изменении, то проверка будет размещена в открытой части ЕРП.
         * 
         * Если значение не заполнено  при изменении (ранее было указано "true"), то проверка снимается с публикации в ЕРП.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPublishERP() {
            return publishERP;
        }

        /**
         * Sets the value of the publishERP property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPublishERP()
         */
        public void setPublishERP(Boolean value) {
            this.publishERP = value;
        }

        /**
         * Вид проверки, информация о субъекте проверки
         * 
         * @return
         *     possible object is
         *     {@link ExaminationType.ExaminationOverview.ExaminationTypeType }
         *     
         */
        public ExaminationType.ExaminationOverview.ExaminationTypeType getExaminationTypeType() {
            return examinationTypeType;
        }

        /**
         * Sets the value of the examinationTypeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationType.ExaminationOverview.ExaminationTypeType }
         *     
         * @see #getExaminationTypeType()
         */
        public void setExaminationTypeType(ExaminationType.ExaminationOverview.ExaminationTypeType value) {
            this.examinationTypeType = value;
        }

        /**
         * Вид осуществления контрольной деятельности. НСИ
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getOversightActivitiesRef() {
            return oversightActivitiesRef;
        }

        /**
         * Sets the value of the oversightActivitiesRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getOversightActivitiesRef()
         */
        public void setOversightActivitiesRef(NsiRef value) {
            this.oversightActivitiesRef = value;
        }

        /**
         * Форма проведения проверки. НСИ "Форма проведения проверки" (реестровый номер 71).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getExaminationForm() {
            return examinationForm;
        }

        /**
         * Sets the value of the examinationForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getExaminationForm()
         */
        public void setExaminationForm(NsiRef value) {
            this.examinationForm = value;
        }

        /**
         * Номер распоряжения (приказа). Обязательно для заполнения, если Вид проверки = «Внеплановая» и присылается tns:ShouldBeRegistered
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderNumber() {
            return orderNumber;
        }

        /**
         * Sets the value of the orderNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrderNumber()
         */
        public void setOrderNumber(String value) {
            this.orderNumber = value;
        }

        /**
         * Дата утверждения распоряжения (приказа). Обязательно для заполнения, если Вид проверки = «Внеплановая» и присылается tns:ShouldBeRegistered
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getOrderDate() {
            return orderDate;
        }

        /**
         * Sets the value of the orderDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getOrderDate()
         */
        public void setOrderDate(XMLGregorianCalendar value) {
            this.orderDate = value;
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
         *         <element name="Scheduled">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ScheduledExaminationSubjectInfoType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Unscheduled">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="BaseURIRegistration" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *                   <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}UnscheduledExaminationSubjectInfoType"/>
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
        @XmlType(name = "", propOrder = {
            "scheduled",
            "unscheduled"
        })
        public static class ExaminationTypeType {

            /**
             * Плановая проверка.
             * 
             */
            @XmlElement(name = "Scheduled")
            protected ExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled scheduled;
            /**
             * Внеплановая проверка.
             * 
             */
            @XmlElement(name = "Unscheduled")
            protected ExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled unscheduled;

            /**
             * Плановая проверка.
             * 
             * @return
             *     possible object is
             *     {@link ExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled }
             *     
             */
            public ExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled getScheduled() {
                return scheduled;
            }

            /**
             * Sets the value of the scheduled property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled }
             *     
             * @see #getScheduled()
             */
            public void setScheduled(ExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled value) {
                this.scheduled = value;
            }

            /**
             * Внеплановая проверка.
             * 
             * @return
             *     possible object is
             *     {@link ExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled }
             *     
             */
            public ExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled getUnscheduled() {
                return unscheduled;
            }

            /**
             * Sets the value of the unscheduled property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled }
             *     
             * @see #getUnscheduled()
             */
            public void setUnscheduled(ExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled value) {
                this.unscheduled = value;
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
             *         <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ScheduledExaminationSubjectInfoType"/>
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
                "subject"
            })
            public static class Scheduled {

                /**
                 * Субъект проверки (ЮЛ, ИП).
                 * 
                 */
                @XmlElement(name = "Subject", required = true)
                protected ScheduledExaminationSubjectInfoType subject;

                /**
                 * Субъект проверки (ЮЛ, ИП).
                 * 
                 * @return
                 *     possible object is
                 *     {@link ScheduledExaminationSubjectInfoType }
                 *     
                 */
                public ScheduledExaminationSubjectInfoType getSubject() {
                    return subject;
                }

                /**
                 * Sets the value of the subject property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ScheduledExaminationSubjectInfoType }
                 *     
                 * @see #getSubject()
                 */
                public void setSubject(ScheduledExaminationSubjectInfoType value) {
                    this.subject = value;
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
             *         <element name="BaseURIRegistration" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
             *         <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}UnscheduledExaminationSubjectInfoType"/>
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
                "baseURIRegistration",
                "subject"
            })
            public static class Unscheduled {

                /**
                 * Основание регистрации проверки в ФГИС "ЕРП". НСИ (реестровый номер 167).  Обязательно заполняется, если для проверки прислано ShouldBeRegistered
                 * 
                 */
                @XmlElement(name = "BaseURIRegistration")
                protected NsiRef baseURIRegistration;
                /**
                 * Субъект проверки (ЮЛ, ИП, Гражданин).
                 * 
                 */
                @XmlElement(name = "Subject", required = true)
                protected UnscheduledExaminationSubjectInfoType subject;

                /**
                 * Основание регистрации проверки в ФГИС "ЕРП". НСИ (реестровый номер 167).  Обязательно заполняется, если для проверки прислано ShouldBeRegistered
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getBaseURIRegistration() {
                    return baseURIRegistration;
                }

                /**
                 * Sets the value of the baseURIRegistration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getBaseURIRegistration()
                 */
                public void setBaseURIRegistration(NsiRef value) {
                    this.baseURIRegistration = value;
                }

                /**
                 * Субъект проверки (ЮЛ, ИП, Гражданин).
                 * 
                 * @return
                 *     possible object is
                 *     {@link UnscheduledExaminationSubjectInfoType }
                 *     
                 */
                public UnscheduledExaminationSubjectInfoType getSubject() {
                    return subject;
                }

                /**
                 * Sets the value of the subject property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UnscheduledExaminationSubjectInfoType }
                 *     
                 * @see #getSubject()
                 */
                public void setSubject(UnscheduledExaminationSubjectInfoType value) {
                    this.subject = value;
                }

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
     *         <element name="Event" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationEventType" maxOccurs="unbounded"/>
     *         <element name="Place" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationPlaceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "event",
        "place"
    })
    public static class ExecutingInfo {

        /**
         * Мероприятие проверки.
         * 
         */
        @XmlElement(name = "Event", required = true)
        protected List<ExaminationEventType> event;
        /**
         * Место проведения проверки.
         * 
         */
        @XmlElement(name = "Place")
        protected List<ExaminationPlaceType> place;

        /**
         * Мероприятие проверки.
         * 
         * Gets the value of the event property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExaminationEventType }
         * </p>
         * 
         * 
         * @return
         *     The value of the event property.
         */
        public List<ExaminationEventType> getEvent() {
            if (event == null) {
                event = new ArrayList<>();
            }
            return this.event;
        }

        /**
         * Место проведения проверки.
         * 
         * Gets the value of the place property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the place property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExaminationPlaceType }
         * </p>
         * 
         * 
         * @return
         *     The value of the place property.
         */
        public List<ExaminationPlaceType> getPlace() {
            if (place == null) {
                place = new ArrayList<>();
            }
            return this.place;
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
     *         <element name="NotRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="RequiredAndNotSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <sequence>
     *           <element name="NotificationDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
     *           <element name="NotificationMethod" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
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
        "notRequired",
        "requiredAndNotSent",
        "notificationDate",
        "notificationMethod"
    })
    public static class NotificationInfo {

        /**
         * Уведомление не требуется
         * 
         */
        @XmlElement(name = "NotRequired")
        protected Boolean notRequired;
        /**
         * Уведомление требуется, не  отправлено
         * 
         */
        @XmlElement(name = "RequiredAndNotSent")
        protected Boolean requiredAndNotSent;
        /**
         * Дата уведомления
         * 
         */
        @XmlElement(name = "NotificationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar notificationDate;
        /**
         * Способ уведомления о проведении проверки
         * 
         */
        @XmlElement(name = "NotificationMethod")
        protected String notificationMethod;

        /**
         * Уведомление не требуется
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotRequired() {
            return notRequired;
        }

        /**
         * Sets the value of the notRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNotRequired()
         */
        public void setNotRequired(Boolean value) {
            this.notRequired = value;
        }

        /**
         * Уведомление требуется, не  отправлено
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRequiredAndNotSent() {
            return requiredAndNotSent;
        }

        /**
         * Sets the value of the requiredAndNotSent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isRequiredAndNotSent()
         */
        public void setRequiredAndNotSent(Boolean value) {
            this.requiredAndNotSent = value;
        }

        /**
         * Дата уведомления
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getNotificationDate() {
            return notificationDate;
        }

        /**
         * Sets the value of the notificationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getNotificationDate()
         */
        public void setNotificationDate(XMLGregorianCalendar value) {
            this.notificationDate = value;
        }

        /**
         * Способ уведомления о проведении проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationMethod() {
            return notificationMethod;
        }

        /**
         * Sets the value of the notificationMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNotificationMethod()
         */
        public void setNotificationMethod(String value) {
            this.notificationMethod = value;
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
     *         <element name="FunctionRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}FunctionRegistryNumberType"/>
     *         <element name="RegulatoryAuthorityID" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}RegulatoryAuthorityIDType">
     *               <pattern value="\d{1,22}"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AuthorizedPersons" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ERPExecutiveType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   <element name="FullName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
     *                   <element name="Position" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="InvolvedExperts" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
        "functionRegistryNumber",
        "regulatoryAuthorityID",
        "authorizedPersons",
        "involvedExperts"
    })
    public static class RegulatoryAuthorityInformation {

        /**
         * Реестровый номер функции органа жилищного надзора в системе «Федеральный реестр государственных и муниципальных услуг»
         * 
         */
        @XmlElement(name = "FunctionRegistryNumber", required = true)
        protected String functionRegistryNumber;
        /**
         * Идентификатор контролирующего органа в системе «Федеральный реестр государственных и муниципальных услуг». Доступно и обязательно для заполнения, только если для проверки присылается ShouldBeRegistered
         * 
         */
        @XmlElement(name = "RegulatoryAuthorityID")
        protected String regulatoryAuthorityID;
        /**
         * ФИО и должность лиц, уполномоченных на проведение проверки
         * 
         */
        @XmlElement(name = "AuthorizedPersons")
        protected ExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons authorizedPersons;
        /**
         * ФИО и должность экспертов, привлекаемых к проведению проверки
         * 
         */
        @XmlElement(name = "InvolvedExperts")
        protected String involvedExperts;

        /**
         * Реестровый номер функции органа жилищного надзора в системе «Федеральный реестр государственных и муниципальных услуг»
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunctionRegistryNumber() {
            return functionRegistryNumber;
        }

        /**
         * Sets the value of the functionRegistryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFunctionRegistryNumber()
         */
        public void setFunctionRegistryNumber(String value) {
            this.functionRegistryNumber = value;
        }

        /**
         * Идентификатор контролирующего органа в системе «Федеральный реестр государственных и муниципальных услуг». Доступно и обязательно для заполнения, только если для проверки присылается ShouldBeRegistered
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegulatoryAuthorityID() {
            return regulatoryAuthorityID;
        }

        /**
         * Sets the value of the regulatoryAuthorityID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRegulatoryAuthorityID()
         */
        public void setRegulatoryAuthorityID(String value) {
            this.regulatoryAuthorityID = value;
        }

        /**
         * ФИО и должность лиц, уполномоченных на проведение проверки
         * 
         * @return
         *     possible object is
         *     {@link ExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons }
         *     
         */
        public ExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons getAuthorizedPersons() {
            return authorizedPersons;
        }

        /**
         * Sets the value of the authorizedPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons }
         *     
         * @see #getAuthorizedPersons()
         */
        public void setAuthorizedPersons(ExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons value) {
            this.authorizedPersons = value;
        }

        /**
         * ФИО и должность экспертов, привлекаемых к проведению проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInvolvedExperts() {
            return involvedExperts;
        }

        /**
         * Sets the value of the involvedExperts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInvolvedExperts()
         */
        public void setInvolvedExperts(String value) {
            this.involvedExperts = value;
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
         *         <element name="ERPExecutiveType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *         <element name="FullName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
         *         <element name="Position" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String256Type" minOccurs="0"/>
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
            "erpExecutiveType",
            "fullName",
            "position"
        })
        public static class AuthorizedPersons {

            /**
             * Тип лица, уполномоченного на проведение проверки.
             * 
             * НСИ "Тип уполномоченного лица на проведение проверки ФГИС ЕРП"
             * 
             */
            @XmlElement(name = "ERPExecutiveType")
            protected NsiRef erpExecutiveType;
            /**
             * Фамилия, имя, отчество
             * 
             */
            @XmlElement(name = "FullName")
            protected String fullName;
            /**
             * Должность
             * 
             */
            @XmlElement(name = "Position")
            protected String position;

            /**
             * Тип лица, уполномоченного на проведение проверки.
             * 
             * НСИ "Тип уполномоченного лица на проведение проверки ФГИС ЕРП"
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getERPExecutiveType() {
                return erpExecutiveType;
            }

            /**
             * Sets the value of the erpExecutiveType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getERPExecutiveType()
             */
            public void setERPExecutiveType(NsiRef value) {
                this.erpExecutiveType = value;
            }

            /**
             * Фамилия, имя, отчество
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
             * Должность
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPosition()
             */
            public void setPosition(String value) {
                this.position = value;
            }

        }

    }

}
