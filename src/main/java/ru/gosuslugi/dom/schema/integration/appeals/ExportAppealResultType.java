
package ru.gosuslugi.dom.schema.integration.appeals;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Тип результата экспорта обращений
 * 
 * <p>Java class for exportAppealResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportAppealResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ParentAppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="ApplicantInfo">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}ApplicantType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AppealNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealNumberType"/>
 *         <element name="AppealCreateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <choice>
 *           <element name="AppealTopic" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *           <element name="AnotherTopic">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="250"/>
 *                 <minLength value="1"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </choice>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="AppealText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="AppealHistory" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *                   <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <choice minOccurs="0">
 *                     <element name="Answer">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}AnswerInfoType">
 *                             <sequence>
 *                               <element name="AnswerIsSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Redirected">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Receiver">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type" minOccurs="0"/>
 *                               <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                               <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="RolledOver">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RollOverAppealType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsNotRequired">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Assesment">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <choice>
 *                               <element name="InformationIsReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               <sequence>
 *                                 <choice>
 *                                   <element name="AnswerIsPartlyReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                   <element name="AnswerIsNotSatisfied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 </choice>
 *                                 <element name="DeclineComment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type"/>
 *                               </sequence>
 *                             </choice>
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
 *         <element name="AppealStatus" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealStatusType"/>
 *         <choice>
 *           <element name="Redirected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element name="RedirectedIsNotHCS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         </choice>
 *         <element name="RolledOver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AnswerIsNotRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AppealWithdrawn" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FromMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ExecutionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="NPARequirements" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *         <element name="DateOfAppointment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Collective" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="NeighbourInfo" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}ApplicantType">
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
@XmlType(name = "exportAppealResultType", propOrder = {
    "appealGUID",
    "parentAppealGUID",
    "applicantInfo",
    "appealNumber",
    "appealCreateDate",
    "appealTopic",
    "anotherTopic",
    "fiasHouseGuid",
    "oktmo",
    "appealText",
    "attachment",
    "answererGUID",
    "appealHistory",
    "appealStatus",
    "redirected",
    "redirectedIsNotHCS",
    "rolledOver",
    "answerIsNotRequired",
    "appealWithdrawn",
    "fromMobile",
    "executionEndDate",
    "npaRequirements",
    "dateOfAppointment",
    "collective",
    "neighbourInfo"
})
public class ExportAppealResultType {

    /**
     * Идентификатор обращения в системе ГИС ЖКХ
     * 
     */
    @XmlElement(name = "AppealGUID", required = true)
    protected String appealGUID;
    /**
     * Идентификатор родительского обращения
     * 
     */
    @XmlElement(name = "ParentAppealGUID")
    protected String parentAppealGUID;
    /**
     * Заявитель обращения
     * 
     */
    @XmlElement(name = "ApplicantInfo", required = true)
    protected ExportAppealResultType.ApplicantInfo applicantInfo;
    /**
     * Номер обращения
     * 
     */
    @XmlElement(name = "AppealNumber", required = true)
    protected String appealNumber;
    /**
     * Дата создания обращения
     * 
     */
    @XmlElement(name = "AppealCreateDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appealCreateDate;
    /**
     * Тема обращения (НСИ 220)
     * 
     */
    @XmlElement(name = "AppealTopic")
    protected NsiRef appealTopic;
    /**
     * Другая тема обращения
     * 
     */
    @XmlElement(name = "AnotherTopic")
    protected String anotherTopic;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected OKTMORefType oktmo;
    /**
     * Текст обращения
     * 
     */
    @XmlElement(name = "AppealText", required = true)
    protected String appealText;
    /**
     * Прикрепленные файлы
     * 
     */
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    /**
     * Идентификатор исполнителя по обращению
     * 
     */
    @XmlElement(name = "AnswererGUID")
    protected String answererGUID;
    /**
     * История изменений по обращению
     * 
     */
    @XmlElement(name = "AppealHistory")
    protected List<ExportAppealResultType.AppealHistory> appealHistory;
    /**
     * Статус обращения
     * Send -Отправлено /Получено 
     * Executed - Исполнено Withdrawn - Отозвано
     * 
     */
    @XmlElement(name = "AppealStatus", required = true)
    @XmlSchemaType(name = "string")
    protected AppealStatusType appealStatus;
    /**
     * Перенаправлено в другую организацию
     * 
     */
    @XmlElement(name = "Redirected")
    protected Boolean redirected;
    /**
     * Перенаправлено в организацию, не зарегистрированную в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "RedirectedIsNotHCS")
    protected Boolean redirectedIsNotHCS;
    /**
     * Продлен срок рассмотрения
     * 
     */
    @XmlElement(name = "RolledOver")
    protected Boolean rolledOver;
    /**
     * Ответ на обращение не требуется
     * 
     */
    @XmlElement(name = "AnswerIsNotRequired")
    protected Boolean answerIsNotRequired;
    /**
     * Обращение отозвано заявителем
     * 
     */
    @XmlElement(name = "AppealWithdrawn")
    protected ExportAppealResultType.AppealWithdrawn appealWithdrawn;
    /**
     * Признак поступления обращения из мобильного приложения "Госуслуги Дом"
     * 
     */
    @XmlElement(name = "FromMobile")
    protected Boolean fromMobile;
    /**
     * Дата окончания срока исполнения обращения. Рассчитывается ГИС ЖКХ на основании требований нормативно-правовых актов (НПА)
     * 
     */
    @XmlElement(name = "ExecutionEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionEndDate;
    /**
     * Требования нормативно-правовых актов (НПА), на основании которых рассчитана дата окончания срока исполнения обращения ExecutionEndDate (согласно справочнику «Темы обращений»)
     * 
     */
    @XmlElement(name = "NPARequirements")
    protected String npaRequirements;
    /**
     * Планируемая дата исполнения обращения
     * 
     */
    @XmlElement(name = "DateOfAppointment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfAppointment;
    /**
     * Признак коллективного обращения
     * 
     */
    @XmlElement(name = "Collective")
    protected Boolean collective;
    /**
     * Присоединившиеся соседи к Коллективному обращению
     * 
     */
    @XmlElement(name = "NeighbourInfo")
    protected List<ExportAppealResultType.NeighbourInfo> neighbourInfo;

    /**
     * Идентификатор обращения в системе ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealGUID() {
        return appealGUID;
    }

    /**
     * Sets the value of the appealGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppealGUID()
     */
    public void setAppealGUID(String value) {
        this.appealGUID = value;
    }

    /**
     * Идентификатор родительского обращения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentAppealGUID() {
        return parentAppealGUID;
    }

    /**
     * Sets the value of the parentAppealGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getParentAppealGUID()
     */
    public void setParentAppealGUID(String value) {
        this.parentAppealGUID = value;
    }

    /**
     * Заявитель обращения
     * 
     * @return
     *     possible object is
     *     {@link ExportAppealResultType.ApplicantInfo }
     *     
     */
    public ExportAppealResultType.ApplicantInfo getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAppealResultType.ApplicantInfo }
     *     
     * @see #getApplicantInfo()
     */
    public void setApplicantInfo(ExportAppealResultType.ApplicantInfo value) {
        this.applicantInfo = value;
    }

    /**
     * Номер обращения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealNumber() {
        return appealNumber;
    }

    /**
     * Sets the value of the appealNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppealNumber()
     */
    public void setAppealNumber(String value) {
        this.appealNumber = value;
    }

    /**
     * Дата создания обращения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppealCreateDate() {
        return appealCreateDate;
    }

    /**
     * Sets the value of the appealCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAppealCreateDate()
     */
    public void setAppealCreateDate(XMLGregorianCalendar value) {
        this.appealCreateDate = value;
    }

    /**
     * Тема обращения (НСИ 220)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getAppealTopic() {
        return appealTopic;
    }

    /**
     * Sets the value of the appealTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getAppealTopic()
     */
    public void setAppealTopic(NsiRef value) {
        this.appealTopic = value;
    }

    /**
     * Другая тема обращения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotherTopic() {
        return anotherTopic;
    }

    /**
     * Sets the value of the anotherTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnotherTopic()
     */
    public void setAnotherTopic(String value) {
        this.anotherTopic = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
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
     * ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Текст обращения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppealText() {
        return appealText;
    }

    /**
     * Sets the value of the appealText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAppealText()
     */
    public void setAppealText(String value) {
        this.appealText = value;
    }

    /**
     * Прикрепленные файлы
     * 
     * Gets the value of the attachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachment().add(newItem);
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
     *     The value of the attachment property.
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<>();
        }
        return this.attachment;
    }

    /**
     * Идентификатор исполнителя по обращению
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswererGUID() {
        return answererGUID;
    }

    /**
     * Sets the value of the answererGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnswererGUID()
     */
    public void setAnswererGUID(String value) {
        this.answererGUID = value;
    }

    /**
     * История изменений по обращению
     * 
     * Gets the value of the appealHistory property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appealHistory property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAppealHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAppealResultType.AppealHistory }
     * </p>
     * 
     * 
     * @return
     *     The value of the appealHistory property.
     */
    public List<ExportAppealResultType.AppealHistory> getAppealHistory() {
        if (appealHistory == null) {
            appealHistory = new ArrayList<>();
        }
        return this.appealHistory;
    }

    /**
     * Статус обращения
     * Send -Отправлено /Получено 
     * Executed - Исполнено Withdrawn - Отозвано
     * 
     * @return
     *     possible object is
     *     {@link AppealStatusType }
     *     
     */
    public AppealStatusType getAppealStatus() {
        return appealStatus;
    }

    /**
     * Sets the value of the appealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealStatusType }
     *     
     * @see #getAppealStatus()
     */
    public void setAppealStatus(AppealStatusType value) {
        this.appealStatus = value;
    }

    /**
     * Перенаправлено в другую организацию
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedirected() {
        return redirected;
    }

    /**
     * Sets the value of the redirected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRedirected()
     */
    public void setRedirected(Boolean value) {
        this.redirected = value;
    }

    /**
     * Перенаправлено в организацию, не зарегистрированную в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedirectedIsNotHCS() {
        return redirectedIsNotHCS;
    }

    /**
     * Sets the value of the redirectedIsNotHCS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRedirectedIsNotHCS()
     */
    public void setRedirectedIsNotHCS(Boolean value) {
        this.redirectedIsNotHCS = value;
    }

    /**
     * Продлен срок рассмотрения
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRolledOver() {
        return rolledOver;
    }

    /**
     * Sets the value of the rolledOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRolledOver()
     */
    public void setRolledOver(Boolean value) {
        this.rolledOver = value;
    }

    /**
     * Ответ на обращение не требуется
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerIsNotRequired() {
        return answerIsNotRequired;
    }

    /**
     * Sets the value of the answerIsNotRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnswerIsNotRequired()
     */
    public void setAnswerIsNotRequired(Boolean value) {
        this.answerIsNotRequired = value;
    }

    /**
     * Обращение отозвано заявителем
     * 
     * @return
     *     possible object is
     *     {@link ExportAppealResultType.AppealWithdrawn }
     *     
     */
    public ExportAppealResultType.AppealWithdrawn getAppealWithdrawn() {
        return appealWithdrawn;
    }

    /**
     * Sets the value of the appealWithdrawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAppealResultType.AppealWithdrawn }
     *     
     * @see #getAppealWithdrawn()
     */
    public void setAppealWithdrawn(ExportAppealResultType.AppealWithdrawn value) {
        this.appealWithdrawn = value;
    }

    /**
     * Признак поступления обращения из мобильного приложения "Госуслуги Дом"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFromMobile() {
        return fromMobile;
    }

    /**
     * Sets the value of the fromMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFromMobile()
     */
    public void setFromMobile(Boolean value) {
        this.fromMobile = value;
    }

    /**
     * Дата окончания срока исполнения обращения. Рассчитывается ГИС ЖКХ на основании требований нормативно-правовых актов (НПА)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionEndDate() {
        return executionEndDate;
    }

    /**
     * Sets the value of the executionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExecutionEndDate()
     */
    public void setExecutionEndDate(XMLGregorianCalendar value) {
        this.executionEndDate = value;
    }

    /**
     * Требования нормативно-правовых актов (НПА), на основании которых рассчитана дата окончания срока исполнения обращения ExecutionEndDate (согласно справочнику «Темы обращений»)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPARequirements() {
        return npaRequirements;
    }

    /**
     * Sets the value of the npaRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNPARequirements()
     */
    public void setNPARequirements(String value) {
        this.npaRequirements = value;
    }

    /**
     * Планируемая дата исполнения обращения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    /**
     * Sets the value of the dateOfAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateOfAppointment()
     */
    public void setDateOfAppointment(XMLGregorianCalendar value) {
        this.dateOfAppointment = value;
    }

    /**
     * Признак коллективного обращения
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollective() {
        return collective;
    }

    /**
     * Sets the value of the collective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCollective()
     */
    public void setCollective(Boolean value) {
        this.collective = value;
    }

    /**
     * Присоединившиеся соседи к Коллективному обращению
     * 
     * Gets the value of the neighbourInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neighbourInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNeighbourInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAppealResultType.NeighbourInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the neighbourInfo property.
     */
    public List<ExportAppealResultType.NeighbourInfo> getNeighbourInfo() {
        if (neighbourInfo == null) {
            neighbourInfo = new ArrayList<>();
        }
        return this.neighbourInfo;
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
     *         <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
     *         <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <choice minOccurs="0">
     *           <element name="Answer">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}AnswerInfoType">
     *                   <sequence>
     *                     <element name="AnswerIsSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Redirected">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Receiver">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type" minOccurs="0"/>
     *                     <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                     <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="RolledOver">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RollOverAppealType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="IsNotRequired">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Assesment">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <choice>
     *                     <element name="InformationIsReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     <sequence>
     *                       <choice>
     *                         <element name="AnswerIsPartlyReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                         <element name="AnswerIsNotSatisfied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                       </choice>
     *                       <element name="DeclineComment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type"/>
     *                     </sequence>
     *                   </choice>
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
        "organization",
        "changeDate",
        "answer",
        "redirected",
        "rolledOver",
        "isNotRequired",
        "assesment"
    })
    public static class AppealHistory {

        /**
         * Организация, выполнившая действие по обращению
         * 
         */
        @XmlElement(name = "Organization")
        protected RegOrgType organization;
        /**
         * Дата изменения (выполнения действия)
         * 
         */
        @XmlElement(name = "ChangeDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar changeDate;
        /**
         * Сведения об ответе на обращение
         * 
         */
        @XmlElement(name = "Answer")
        protected ExportAppealResultType.AppealHistory.Answer answer;
        /**
         * Обращение переадресовано
         * 
         */
        @XmlElement(name = "Redirected")
        protected ExportAppealResultType.AppealHistory.Redirected redirected;
        /**
         * Продлен срок рассмотрения обращения
         * 
         */
        @XmlElement(name = "RolledOver")
        protected ExportAppealResultType.AppealHistory.RolledOver rolledOver;
        /**
         * Ответ на обращение не требуется
         * 
         */
        @XmlElement(name = "IsNotRequired")
        protected ExportAppealResultType.AppealHistory.IsNotRequired isNotRequired;
        /**
         * Оценка исполнения обращения
         * 
         */
        @XmlElement(name = "Assesment")
        protected ExportAppealResultType.AppealHistory.Assesment assesment;

        /**
         * Организация, выполнившая действие по обращению
         * 
         * @return
         *     possible object is
         *     {@link RegOrgType }
         *     
         */
        public RegOrgType getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgType }
         *     
         * @see #getOrganization()
         */
        public void setOrganization(RegOrgType value) {
            this.organization = value;
        }

        /**
         * Дата изменения (выполнения действия)
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getChangeDate() {
            return changeDate;
        }

        /**
         * Sets the value of the changeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getChangeDate()
         */
        public void setChangeDate(XMLGregorianCalendar value) {
            this.changeDate = value;
        }

        /**
         * Сведения об ответе на обращение
         * 
         * @return
         *     possible object is
         *     {@link ExportAppealResultType.AppealHistory.Answer }
         *     
         */
        public ExportAppealResultType.AppealHistory.Answer getAnswer() {
            return answer;
        }

        /**
         * Sets the value of the answer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAppealResultType.AppealHistory.Answer }
         *     
         * @see #getAnswer()
         */
        public void setAnswer(ExportAppealResultType.AppealHistory.Answer value) {
            this.answer = value;
        }

        /**
         * Обращение переадресовано
         * 
         * @return
         *     possible object is
         *     {@link ExportAppealResultType.AppealHistory.Redirected }
         *     
         */
        public ExportAppealResultType.AppealHistory.Redirected getRedirected() {
            return redirected;
        }

        /**
         * Sets the value of the redirected property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAppealResultType.AppealHistory.Redirected }
         *     
         * @see #getRedirected()
         */
        public void setRedirected(ExportAppealResultType.AppealHistory.Redirected value) {
            this.redirected = value;
        }

        /**
         * Продлен срок рассмотрения обращения
         * 
         * @return
         *     possible object is
         *     {@link ExportAppealResultType.AppealHistory.RolledOver }
         *     
         */
        public ExportAppealResultType.AppealHistory.RolledOver getRolledOver() {
            return rolledOver;
        }

        /**
         * Sets the value of the rolledOver property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAppealResultType.AppealHistory.RolledOver }
         *     
         * @see #getRolledOver()
         */
        public void setRolledOver(ExportAppealResultType.AppealHistory.RolledOver value) {
            this.rolledOver = value;
        }

        /**
         * Ответ на обращение не требуется
         * 
         * @return
         *     possible object is
         *     {@link ExportAppealResultType.AppealHistory.IsNotRequired }
         *     
         */
        public ExportAppealResultType.AppealHistory.IsNotRequired getIsNotRequired() {
            return isNotRequired;
        }

        /**
         * Sets the value of the isNotRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAppealResultType.AppealHistory.IsNotRequired }
         *     
         * @see #getIsNotRequired()
         */
        public void setIsNotRequired(ExportAppealResultType.AppealHistory.IsNotRequired value) {
            this.isNotRequired = value;
        }

        /**
         * Оценка исполнения обращения
         * 
         * @return
         *     possible object is
         *     {@link ExportAppealResultType.AppealHistory.Assesment }
         *     
         */
        public ExportAppealResultType.AppealHistory.Assesment getAssesment() {
            return assesment;
        }

        /**
         * Sets the value of the assesment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAppealResultType.AppealHistory.Assesment }
         *     
         * @see #getAssesment()
         */
        public void setAssesment(ExportAppealResultType.AppealHistory.Assesment value) {
            this.assesment = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}AnswerInfoType">
         *       <sequence>
         *         <element name="AnswerIsSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
            "answerIsSent",
            "signedAttachments"
        })
        public static class Answer
            extends AnswerInfoType
        {

            /**
             * Ответ отправлен
             * 
             */
            @XmlElement(name = "AnswerIsSent")
            protected Boolean answerIsSent;
            /**
             * Прикрепленные файлы с открепленной (detached) подписью
             * 
             */
            @XmlElement(name = "SignedAttachments")
            protected List<SignedAttachmentType> signedAttachments;

            /**
             * Ответ отправлен
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnswerIsSent() {
                return answerIsSent;
            }

            /**
             * Sets the value of the answerIsSent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isAnswerIsSent()
             */
            public void setAnswerIsSent(Boolean value) {
                this.answerIsSent = value;
            }

            /**
             * Прикрепленные файлы с открепленной (detached) подписью
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
         *         <element name="InformationIsReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <sequence>
         *           <choice>
         *             <element name="AnswerIsPartlyReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *             <element name="AnswerIsNotSatisfied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *           </choice>
         *           <element name="DeclineComment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type"/>
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
            "informationIsReceived",
            "answerIsPartlyReceived",
            "answerIsNotSatisfied",
            "declineComment"
        })
        public static class Assesment {

            /**
             * Необходимая информация получена
             * 
             */
            @XmlElement(name = "InformationIsReceived")
            protected Boolean informationIsReceived;
            /**
             * Необходимая информация получена частично
             * 
             */
            @XmlElement(name = "AnswerIsPartlyReceived")
            protected Boolean answerIsPartlyReceived;
            /**
             * Ответом не удовлетворен
             * 
             */
            @XmlElement(name = "AnswerIsNotSatisfied")
            protected Boolean answerIsNotSatisfied;
            /**
             * Отзыв
             * 
             */
            @XmlElement(name = "DeclineComment")
            protected String declineComment;

            /**
             * Необходимая информация получена
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInformationIsReceived() {
                return informationIsReceived;
            }

            /**
             * Sets the value of the informationIsReceived property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isInformationIsReceived()
             */
            public void setInformationIsReceived(Boolean value) {
                this.informationIsReceived = value;
            }

            /**
             * Необходимая информация получена частично
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnswerIsPartlyReceived() {
                return answerIsPartlyReceived;
            }

            /**
             * Sets the value of the answerIsPartlyReceived property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isAnswerIsPartlyReceived()
             */
            public void setAnswerIsPartlyReceived(Boolean value) {
                this.answerIsPartlyReceived = value;
            }

            /**
             * Ответом не удовлетворен
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnswerIsNotSatisfied() {
                return answerIsNotSatisfied;
            }

            /**
             * Sets the value of the answerIsNotSatisfied property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isAnswerIsNotSatisfied()
             */
            public void setAnswerIsNotSatisfied(Boolean value) {
                this.answerIsNotSatisfied = value;
            }

            /**
             * Отзыв
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeclineComment() {
                return declineComment;
            }

            /**
             * Sets the value of the declineComment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDeclineComment()
             */
            public void setDeclineComment(String value) {
                this.declineComment = value;
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
         *         <element name="Cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "cause"
        })
        public static class IsNotRequired {

            /**
             * Причина, по которой ответ на обращение не требуется
             * 
             */
            @XmlElement(name = "Cause", required = true)
            protected String cause;

            /**
             * Причина, по которой ответ на обращение не требуется
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCause() {
                return cause;
            }

            /**
             * Sets the value of the cause property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCause()
             */
            public void setCause(String value) {
                this.cause = value;
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
         *         <element name="Receiver">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type" minOccurs="0"/>
         *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
            "receiver",
            "comment",
            "attachment",
            "answererGUID"
        })
        public static class Redirected {

            /**
             * Адресат обращения
             * 
             */
            @XmlElement(name = "Receiver", required = true)
            protected ExportAppealResultType.AppealHistory.Redirected.Receiver receiver;
            /**
             * Комментарий
             * 
             */
            @XmlElement(name = "Comment")
            protected String comment;
            /**
             * Прикрепленные файлы
             * 
             */
            @XmlElement(name = "Attachment")
            protected List<AttachmentType> attachment;
            /**
             * Идентификатор исполнителя по обращению
             * 
             */
            @XmlElement(name = "AnswererGUID")
            protected String answererGUID;

            /**
             * Адресат обращения
             * 
             * @return
             *     possible object is
             *     {@link ExportAppealResultType.AppealHistory.Redirected.Receiver }
             *     
             */
            public ExportAppealResultType.AppealHistory.Redirected.Receiver getReceiver() {
                return receiver;
            }

            /**
             * Sets the value of the receiver property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportAppealResultType.AppealHistory.Redirected.Receiver }
             *     
             * @see #getReceiver()
             */
            public void setReceiver(ExportAppealResultType.AppealHistory.Redirected.Receiver value) {
                this.receiver = value;
            }

            /**
             * Комментарий
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComment() {
                return comment;
            }

            /**
             * Sets the value of the comment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getComment()
             */
            public void setComment(String value) {
                this.comment = value;
            }

            /**
             * Прикрепленные файлы
             * 
             * Gets the value of the attachment property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachment property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAttachment().add(newItem);
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
             *     The value of the attachment property.
             */
            public List<AttachmentType> getAttachment() {
                if (attachment == null) {
                    attachment = new ArrayList<>();
                }
                return this.attachment;
            }

            /**
             * Идентификатор исполнителя по обращению
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnswererGUID() {
                return answererGUID;
            }

            /**
             * Sets the value of the answererGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAnswererGUID()
             */
            public void setAnswererGUID(String value) {
                this.answererGUID = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Receiver
                extends RegOrgType
            {


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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RollOverAppealType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RolledOver
            extends RollOverAppealType
        {


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
     *         <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type" minOccurs="0"/>
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
        "comment"
    })
    public static class AppealWithdrawn {

        /**
         * Комментарий заявителя
         * 
         */
        @XmlElement(name = "Comment")
        protected String comment;

        /**
         * Комментарий заявителя
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getComment()
         */
        public void setComment(String value) {
            this.comment = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}ApplicantType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ApplicantInfo
        extends ApplicantType
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}ApplicantType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NeighbourInfo
        extends ApplicantType
    {


    }

}
