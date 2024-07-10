
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
 * Проверка (экспорт)
 * 
 * <p>Java class for exportExaminationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportExaminationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExaminationOverview">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     <sequence>
 *                       <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                       <element name="URIRegistrationNumber" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <pattern value="\d{1,18}"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="URIRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *                                       <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportUnscheduledExaminationSubjectInfoType"/>
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
 *                   <element name="OversightActivitiesRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="ExaminationForm" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *                   <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RegulatoryAuthorityInformation" minOccurs="0">
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
 *         <element name="NotificationInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="NotRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="RequiredAndNotSent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <sequence>
 *                     <element name="NotificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="NotificationMethod" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
 *                   <element name="Objective" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   <element name="AdditionalInfoAboutExamBase" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                   <element name="Tasks" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                   <element name="Object" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   <element name="From" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   <element name="To" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *                   <element name="ProsecutorAgreementInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportProsecutorAgreementInformationType" minOccurs="0"/>
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
 *                   <element name="Event" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationEventType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="Place" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationPlaceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ResultsInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportResultsInfoType">
 *                 <sequence>
 *                   <element name="CancelExaminationResults" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExaminationChangeInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportExaminationChangeInfoType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
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
@XmlType(name = "exportExaminationType", propOrder = {
    "examinationOverview",
    "regulatoryAuthorityInformation",
    "notificationInfo",
    "examinationInfo",
    "executingInfo",
    "resultsInfo",
    "examinationChangeInfo",
    "cancelledInfo",
    "attachments",
    "signedAttachments"
})
public class ExportExaminationType {

    /**
     * Общая информация о проверке
     * 
     */
    @XmlElement(name = "ExaminationOverview", required = true)
    protected ExportExaminationType.ExaminationOverview examinationOverview;
    /**
     * Информация об органе контроля
     * 
     */
    @XmlElement(name = "RegulatoryAuthorityInformation")
    protected ExportExaminationType.RegulatoryAuthorityInformation regulatoryAuthorityInformation;
    /**
     * Информация об уведомлении
     * 
     */
    @XmlElement(name = "NotificationInfo")
    protected ExportExaminationType.NotificationInfo notificationInfo;
    /**
     * Сведения о проверке
     * 
     */
    @XmlElement(name = "ExaminationInfo", required = true)
    protected ExportExaminationType.ExaminationInfo examinationInfo;
    /**
     * Информация о мероприятиях
     * 
     */
    @XmlElement(name = "ExecutingInfo")
    protected ExportExaminationType.ExecutingInfo executingInfo;
    /**
     * Сведения о результатах проверки
     * 
     */
    @XmlElement(name = "ResultsInfo")
    protected ExportExaminationType.ResultsInfo resultsInfo;
    /**
     * Информация об изменении провери
     * 
     */
    @XmlElement(name = "ExaminationChangeInfo")
    protected ExportExaminationType.ExaminationChangeInfo examinationChangeInfo;
    /**
     * Информция об отмене проверки.
     * 
     */
    @XmlElement(name = "CancelledInfo")
    protected ExportCancelledInfoWithAttachmentsType cancelledInfo;
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
     *     {@link ExportExaminationType.ExaminationOverview }
     *     
     */
    public ExportExaminationType.ExaminationOverview getExaminationOverview() {
        return examinationOverview;
    }

    /**
     * Sets the value of the examinationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.ExaminationOverview }
     *     
     * @see #getExaminationOverview()
     */
    public void setExaminationOverview(ExportExaminationType.ExaminationOverview value) {
        this.examinationOverview = value;
    }

    /**
     * Информация об органе контроля
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType.RegulatoryAuthorityInformation }
     *     
     */
    public ExportExaminationType.RegulatoryAuthorityInformation getRegulatoryAuthorityInformation() {
        return regulatoryAuthorityInformation;
    }

    /**
     * Sets the value of the regulatoryAuthorityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.RegulatoryAuthorityInformation }
     *     
     * @see #getRegulatoryAuthorityInformation()
     */
    public void setRegulatoryAuthorityInformation(ExportExaminationType.RegulatoryAuthorityInformation value) {
        this.regulatoryAuthorityInformation = value;
    }

    /**
     * Информация об уведомлении
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType.NotificationInfo }
     *     
     */
    public ExportExaminationType.NotificationInfo getNotificationInfo() {
        return notificationInfo;
    }

    /**
     * Sets the value of the notificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.NotificationInfo }
     *     
     * @see #getNotificationInfo()
     */
    public void setNotificationInfo(ExportExaminationType.NotificationInfo value) {
        this.notificationInfo = value;
    }

    /**
     * Сведения о проверке
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType.ExaminationInfo }
     *     
     */
    public ExportExaminationType.ExaminationInfo getExaminationInfo() {
        return examinationInfo;
    }

    /**
     * Sets the value of the examinationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.ExaminationInfo }
     *     
     * @see #getExaminationInfo()
     */
    public void setExaminationInfo(ExportExaminationType.ExaminationInfo value) {
        this.examinationInfo = value;
    }

    /**
     * Информация о мероприятиях
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType.ExecutingInfo }
     *     
     */
    public ExportExaminationType.ExecutingInfo getExecutingInfo() {
        return executingInfo;
    }

    /**
     * Sets the value of the executingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.ExecutingInfo }
     *     
     * @see #getExecutingInfo()
     */
    public void setExecutingInfo(ExportExaminationType.ExecutingInfo value) {
        this.executingInfo = value;
    }

    /**
     * Сведения о результатах проверки
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType.ResultsInfo }
     *     
     */
    public ExportExaminationType.ResultsInfo getResultsInfo() {
        return resultsInfo;
    }

    /**
     * Sets the value of the resultsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.ResultsInfo }
     *     
     * @see #getResultsInfo()
     */
    public void setResultsInfo(ExportExaminationType.ResultsInfo value) {
        this.resultsInfo = value;
    }

    /**
     * Информация об изменении провери
     * 
     * @return
     *     possible object is
     *     {@link ExportExaminationType.ExaminationChangeInfo }
     *     
     */
    public ExportExaminationType.ExaminationChangeInfo getExaminationChangeInfo() {
        return examinationChangeInfo;
    }

    /**
     * Sets the value of the examinationChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportExaminationType.ExaminationChangeInfo }
     *     
     * @see #getExaminationChangeInfo()
     */
    public void setExaminationChangeInfo(ExportExaminationType.ExaminationChangeInfo value) {
        this.examinationChangeInfo = value;
    }

    /**
     * Информция об отмене проверки.
     * 
     * @return
     *     possible object is
     *     {@link ExportCancelledInfoWithAttachmentsType }
     *     
     */
    public ExportCancelledInfoWithAttachmentsType getCancelledInfo() {
        return cancelledInfo;
    }

    /**
     * Sets the value of the cancelledInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCancelledInfoWithAttachmentsType }
     *     
     * @see #getCancelledInfo()
     */
    public void setCancelledInfo(ExportCancelledInfoWithAttachmentsType value) {
        this.cancelledInfo = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportExaminationChangeInfoType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExaminationChangeInfo
        extends ExportExaminationChangeInfoType
    {


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
     *         <element name="Objective" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         <element name="AdditionalInfoAboutExamBase" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="Tasks" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
     *         <element name="Object" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
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
     *         <element name="From" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element name="To" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
     *         <element name="ProsecutorAgreementInformation" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportProsecutorAgreementInformationType" minOccurs="0"/>
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
        "objective",
        "additionalInfoAboutExamBase",
        "tasks",
        "object",
        "basedOnPrecept",
        "relatedExamination",
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
        @XmlElement(name = "Tasks")
        protected String tasks;
        /**
         * Предмет проверки. НСИ "Предмет проверки" (реестровый номер 69).
         * 
         */
        @XmlElement(name = "Object")
        protected List<NsiRef> object;
        /**
         * Предписание, на основании которого проводится проверка
         * 
         */
        @XmlElement(name = "BasedOnPrecept")
        protected ExportExaminationType.ExaminationInfo.BasedOnPrecept basedOnPrecept;
        /**
         * Связанная проверка
         * 
         */
        @XmlElement(name = "RelatedExamination")
        protected ExportExaminationType.ExaminationInfo.RelatedExamination relatedExamination;
        /**
         * Срок проведения проверки с (включительно) - дата начала проведения проверки.
         * 
         */
        @XmlElement(name = "From", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar from;
        /**
         * Срок проведения проверки по (включительно) - дата окончания проведения проверки.
         * 
         */
        @XmlElement(name = "To")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar to;
        /**
         * Срок проведения проверки.
         * 
         */
        @XmlElement(name = "Duration")
        protected ExportExaminationType.ExaminationInfo.Duration duration;
        /**
         * Орган государственного надзора (контроля) и/или орган муниципального контроля,  с которым  проверка проводится совместно.
         * 
         */
        @XmlElement(name = "CooperationWith")
        protected String cooperationWith;
        /**
         * Информация о согласовании проведения проверки с органами прокуратуры
         * 
         */
        @XmlElement(name = "ProsecutorAgreementInformation")
        protected ExportProsecutorAgreementInformationType prosecutorAgreementInformation;
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
         * Предписание, на основании которого проводится проверка
         * 
         * @return
         *     possible object is
         *     {@link ExportExaminationType.ExaminationInfo.BasedOnPrecept }
         *     
         */
        public ExportExaminationType.ExaminationInfo.BasedOnPrecept getBasedOnPrecept() {
            return basedOnPrecept;
        }

        /**
         * Sets the value of the basedOnPrecept property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportExaminationType.ExaminationInfo.BasedOnPrecept }
         *     
         * @see #getBasedOnPrecept()
         */
        public void setBasedOnPrecept(ExportExaminationType.ExaminationInfo.BasedOnPrecept value) {
            this.basedOnPrecept = value;
        }

        /**
         * Связанная проверка
         * 
         * @return
         *     possible object is
         *     {@link ExportExaminationType.ExaminationInfo.RelatedExamination }
         *     
         */
        public ExportExaminationType.ExaminationInfo.RelatedExamination getRelatedExamination() {
            return relatedExamination;
        }

        /**
         * Sets the value of the relatedExamination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportExaminationType.ExaminationInfo.RelatedExamination }
         *     
         * @see #getRelatedExamination()
         */
        public void setRelatedExamination(ExportExaminationType.ExaminationInfo.RelatedExamination value) {
            this.relatedExamination = value;
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
         * Срок проведения проверки.
         * 
         * @return
         *     possible object is
         *     {@link ExportExaminationType.ExaminationInfo.Duration }
         *     
         */
        public ExportExaminationType.ExaminationInfo.Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportExaminationType.ExaminationInfo.Duration }
         *     
         * @see #getDuration()
         */
        public void setDuration(ExportExaminationType.ExaminationInfo.Duration value) {
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
         * Информация о согласовании проведения проверки с органами прокуратуры
         * 
         * @return
         *     possible object is
         *     {@link ExportProsecutorAgreementInformationType }
         *     
         */
        public ExportProsecutorAgreementInformationType getProsecutorAgreementInformation() {
            return prosecutorAgreementInformation;
        }

        /**
         * Sets the value of the prosecutorAgreementInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportProsecutorAgreementInformationType }
         *     
         * @see #getProsecutorAgreementInformation()
         */
        public void setProsecutorAgreementInformation(ExportProsecutorAgreementInformationType value) {
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
             * Рабочих дней.
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
             * Рабочих дней.
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
     *           <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *           <sequence>
     *             <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *             <element name="URIRegistrationNumber" minOccurs="0">
     *               <simpleType>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   <pattern value="\d{1,18}"/>
     *                 </restriction>
     *               </simpleType>
     *             </element>
     *             <element name="URIRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
     *                             <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportUnscheduledExaminationSubjectInfoType"/>
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
     *         <element name="OversightActivitiesRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="ExaminationForm" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
     *         <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
         * Учетный номер проверки в едином реестре проверок
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
         */
        @XmlElement(name = "PublishERP")
        protected Boolean publishERP;
        /**
         * Вид проверки, информация о субъекте проверки
         * 
         */
        @XmlElement(name = "ExaminationTypeType", required = true)
        protected ExportExaminationType.ExaminationOverview.ExaminationTypeType examinationTypeType;
        /**
         * Вид осуществления контрольной деятельности. НСИ
         * 
         */
        @XmlElement(name = "OversightActivitiesRef")
        protected NsiRef oversightActivitiesRef;
        /**
         * Форма проведения проверки. НСИ "Форма проведения проверки" (реестровый номер 71).
         * 
         */
        @XmlElement(name = "ExaminationForm", required = true)
        protected NsiRef examinationForm;
        /**
         * Номер распоряжения (приказа).
         * 
         */
        @XmlElement(name = "OrderNumber")
        protected String orderNumber;
        /**
         * Дата утверждения распоряжения (приказа).
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
         * Учетный номер проверки в едином реестре проверок
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
         *     {@link ExportExaminationType.ExaminationOverview.ExaminationTypeType }
         *     
         */
        public ExportExaminationType.ExaminationOverview.ExaminationTypeType getExaminationTypeType() {
            return examinationTypeType;
        }

        /**
         * Sets the value of the examinationTypeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportExaminationType.ExaminationOverview.ExaminationTypeType }
         *     
         * @see #getExaminationTypeType()
         */
        public void setExaminationTypeType(ExportExaminationType.ExaminationOverview.ExaminationTypeType value) {
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
         * Номер распоряжения (приказа).
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
         * Дата утверждения распоряжения (приказа).
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
         *                   <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportUnscheduledExaminationSubjectInfoType"/>
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
            protected ExportExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled scheduled;
            /**
             * Внеплановая проверка.
             * 
             */
            @XmlElement(name = "Unscheduled")
            protected ExportExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled unscheduled;

            /**
             * Плановая проверка.
             * 
             * @return
             *     possible object is
             *     {@link ExportExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled }
             *     
             */
            public ExportExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled getScheduled() {
                return scheduled;
            }

            /**
             * Sets the value of the scheduled property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled }
             *     
             * @see #getScheduled()
             */
            public void setScheduled(ExportExaminationType.ExaminationOverview.ExaminationTypeType.Scheduled value) {
                this.scheduled = value;
            }

            /**
             * Внеплановая проверка.
             * 
             * @return
             *     possible object is
             *     {@link ExportExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled }
             *     
             */
            public ExportExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled getUnscheduled() {
                return unscheduled;
            }

            /**
             * Sets the value of the unscheduled property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled }
             *     
             * @see #getUnscheduled()
             */
            public void setUnscheduled(ExportExaminationType.ExaminationOverview.ExaminationTypeType.Unscheduled value) {
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
             *         <element name="Subject" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportUnscheduledExaminationSubjectInfoType"/>
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
                 * Основание регистрации проверки в ФГИС "ЕРП". НСИ (реестровый номер 167).
                 * 
                 */
                @XmlElement(name = "BaseURIRegistration")
                protected NsiRef baseURIRegistration;
                /**
                 * Субъект проверки (ЮЛ, ИП, Гражданин).
                 * 
                 */
                @XmlElement(name = "Subject", required = true)
                protected ExportUnscheduledExaminationSubjectInfoType subject;

                /**
                 * Основание регистрации проверки в ФГИС "ЕРП". НСИ (реестровый номер 167).
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
                 *     {@link ExportUnscheduledExaminationSubjectInfoType }
                 *     
                 */
                public ExportUnscheduledExaminationSubjectInfoType getSubject() {
                    return subject;
                }

                /**
                 * Sets the value of the subject property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExportUnscheduledExaminationSubjectInfoType }
                 *     
                 * @see #getSubject()
                 */
                public void setSubject(ExportUnscheduledExaminationSubjectInfoType value) {
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
     *         <element name="Event" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationEventType" maxOccurs="unbounded" minOccurs="0"/>
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
        @XmlElement(name = "Event")
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
     *           <element name="NotificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *           <element name="NotificationMethod" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
         * Идентификатор контролирующего органа в системе «Федеральный реестр государственных и муниципальных услуг».
         * 
         */
        @XmlElement(name = "RegulatoryAuthorityID")
        protected String regulatoryAuthorityID;
        /**
         * ФИО и должность лиц, уполномоченных на проведение проверки
         * 
         */
        @XmlElement(name = "AuthorizedPersons")
        protected ExportExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons authorizedPersons;
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
         * Идентификатор контролирующего органа в системе «Федеральный реестр государственных и муниципальных услуг».
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
         *     {@link ExportExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons }
         *     
         */
        public ExportExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons getAuthorizedPersons() {
            return authorizedPersons;
        }

        /**
         * Sets the value of the authorizedPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons }
         *     
         * @see #getAuthorizedPersons()
         */
        public void setAuthorizedPersons(ExportExaminationType.RegulatoryAuthorityInformation.AuthorizedPersons value) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportResultsInfoType">
     *       <sequence>
     *         <element name="CancelExaminationResults" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
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
        "cancelExaminationResults"
    })
    public static class ResultsInfo
        extends ExportResultsInfoType
    {

        /**
         * Информация об отмене результата
         * 
         */
        @XmlElement(name = "CancelExaminationResults")
        protected ExportCancelledInfoWithAttachmentsType cancelExaminationResults;

        /**
         * Информация об отмене результата
         * 
         * @return
         *     possible object is
         *     {@link ExportCancelledInfoWithAttachmentsType }
         *     
         */
        public ExportCancelledInfoWithAttachmentsType getCancelExaminationResults() {
            return cancelExaminationResults;
        }

        /**
         * Sets the value of the cancelExaminationResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportCancelledInfoWithAttachmentsType }
         *     
         * @see #getCancelExaminationResults()
         */
        public void setCancelExaminationResults(ExportCancelledInfoWithAttachmentsType value) {
            this.cancelExaminationResults = value;
        }

    }

}
