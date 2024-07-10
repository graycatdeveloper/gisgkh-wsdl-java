
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Сообщение о проведении ОСС
 * 
 * <p>Java class for MessageType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MessageType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="OrganizationGuid" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element name="MessageNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MessageDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <choice>
 *           <element name="ExtraVoting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="AnnualVoting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <choice>
 *           <element name="AVoting">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="AVotingEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="ResolutionPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="3000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Meeting">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     <element name="VotingPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="3000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="MeetingAVoting">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="AVotingEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="ResolutionPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="3000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     <element name="VotingPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="3000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="EVoting">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="EVotingDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     <element name="EVotingDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     <element name="Discipline">
 *                       <simpleType>
 *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="InfoReview">
 *                       <simpleType>
 *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType"/>
 *                     <element name="FirstVoting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     <element name="AdminOfGeneralMeeting" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AdminOfGeneralMeetingType"/>
 *                     <element name="AdminAddress">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="2000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="MeetingType" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeetingTypeType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}VoteInitiators" maxOccurs="unbounded"/>
 *         <element name="DecisionList" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType" minOccurs="0"/>
 *                   <element name="QuestionName">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="3000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="DecisionsType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="HomeownersDecisionsType" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <choice minOccurs="0">
 *                     <element name="CharterContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="CharterNotContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                   <element name="FormingFund" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="ManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType" minOccurs="0"/>
 *                   <element name="AdminOfGeneralMeeting" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AdminOfGeneralMeetingType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ModificationReason" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
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
@XmlType(name = "MessageType", propOrder = {
    "fiasHouseGUID",
    "organizationGuid",
    "messageNum",
    "messageDate",
    "extraVoting",
    "annualVoting",
    "aVoting",
    "meeting",
    "meetingAVoting",
    "eVoting",
    "meetingType",
    "voteInitiators",
    "decisionList",
    "modificationReason"
})
public class MessageType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * Обязательно к заполнению, если "Тип собрания" = "Собрание собственников" и не заполнено ТСЖ/Кооператив
     * 
     */
    @XmlElement(name = "FIASHouseGUID")
    protected String fiasHouseGUID;
    /**
     * Товарищество Собственников Жилья/ Кооператив
     * 
     */
    @XmlElement(name = "OrganizationGuid")
    protected RegOrgType organizationGuid;
    /**
     * Номер сообщения
     * 
     */
    @XmlElement(name = "MessageNum")
    protected String messageNum;
    /**
     * Дата составления сообщения
     * 
     */
    @XmlElement(name = "MessageDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar messageDate;
    /**
     * Внеочередное собрание
     * 
     */
    @XmlElement(name = "ExtraVoting")
    protected Boolean extraVoting;
    /**
     * Ежегодное собрание
     * 
     */
    @XmlElement(name = "AnnualVoting")
    protected Boolean annualVoting;
    /**
     * Заочное голосование (опросным путем)
     * 
     */
    @XmlElement(name = "AVoting")
    protected MessageType.AVoting aVoting;
    /**
     * Очное голосование
     * 
     */
    @XmlElement(name = "Meeting")
    protected MessageType.Meeting meeting;
    /**
     * Очно-заочное голоосвание
     * 
     */
    @XmlElement(name = "MeetingAVoting")
    protected MessageType.MeetingAVoting meetingAVoting;
    /**
     * Заочное голоосвание с использованием системы
     * 
     */
    @XmlElement(name = "EVoting")
    protected MessageType.EVoting eVoting;
    /**
     * Тип собрания
     * 
     * Доступны следующие значения:
     * -Owners - Собрание собственников
     * -Homeowners - Собрание ТСЖ
     * -Cooperative - Собрание кооператива
     * 
     * По умолчанию устанавливается значение "Собрание собственников"
     * 
     */
    @XmlElement(name = "MeetingType", required = true)
    @XmlSchemaType(name = "string")
    protected MeetingTypeType meetingType;
    /**
     * Сведения об инициаторах собрания
     * 
     */
    @XmlElement(name = "VoteInitiators", required = true)
    protected List<VoteInitiators> voteInitiators;
    /**
     * Повестка
     * 
     */
    @XmlElement(name = "DecisionList", required = true)
    protected List<MessageType.DecisionList> decisionList;
    /**
     * Основание изменения. Заполняется для сообщений в статусе "Сообщение размещено" и с формой проведения отличной от "Заочное голосование с использованием системы"
     * 
     */
    @XmlElement(name = "ModificationReason")
    protected String modificationReason;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * Обязательно к заполнению, если "Тип собрания" = "Собрание собственников" и не заполнено ТСЖ/Кооператив
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGUID()
     */
    public void setFIASHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Товарищество Собственников Жилья/ Кооператив
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrganizationGuid() {
        return organizationGuid;
    }

    /**
     * Sets the value of the organizationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrganizationGuid()
     */
    public void setOrganizationGuid(RegOrgType value) {
        this.organizationGuid = value;
    }

    /**
     * Номер сообщения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageNum() {
        return messageNum;
    }

    /**
     * Sets the value of the messageNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageNum()
     */
    public void setMessageNum(String value) {
        this.messageNum = value;
    }

    /**
     * Дата составления сообщения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDate() {
        return messageDate;
    }

    /**
     * Sets the value of the messageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getMessageDate()
     */
    public void setMessageDate(XMLGregorianCalendar value) {
        this.messageDate = value;
    }

    /**
     * Внеочередное собрание
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraVoting() {
        return extraVoting;
    }

    /**
     * Sets the value of the extraVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExtraVoting()
     */
    public void setExtraVoting(Boolean value) {
        this.extraVoting = value;
    }

    /**
     * Ежегодное собрание
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnualVoting() {
        return annualVoting;
    }

    /**
     * Sets the value of the annualVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnnualVoting()
     */
    public void setAnnualVoting(Boolean value) {
        this.annualVoting = value;
    }

    /**
     * Заочное голосование (опросным путем)
     * 
     * @return
     *     possible object is
     *     {@link MessageType.AVoting }
     *     
     */
    public MessageType.AVoting getAVoting() {
        return aVoting;
    }

    /**
     * Sets the value of the aVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.AVoting }
     *     
     * @see #getAVoting()
     */
    public void setAVoting(MessageType.AVoting value) {
        this.aVoting = value;
    }

    /**
     * Очное голосование
     * 
     * @return
     *     possible object is
     *     {@link MessageType.Meeting }
     *     
     */
    public MessageType.Meeting getMeeting() {
        return meeting;
    }

    /**
     * Sets the value of the meeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.Meeting }
     *     
     * @see #getMeeting()
     */
    public void setMeeting(MessageType.Meeting value) {
        this.meeting = value;
    }

    /**
     * Очно-заочное голоосвание
     * 
     * @return
     *     possible object is
     *     {@link MessageType.MeetingAVoting }
     *     
     */
    public MessageType.MeetingAVoting getMeetingAVoting() {
        return meetingAVoting;
    }

    /**
     * Sets the value of the meetingAVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.MeetingAVoting }
     *     
     * @see #getMeetingAVoting()
     */
    public void setMeetingAVoting(MessageType.MeetingAVoting value) {
        this.meetingAVoting = value;
    }

    /**
     * Заочное голоосвание с использованием системы
     * 
     * @return
     *     possible object is
     *     {@link MessageType.EVoting }
     *     
     */
    public MessageType.EVoting getEVoting() {
        return eVoting;
    }

    /**
     * Sets the value of the eVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.EVoting }
     *     
     * @see #getEVoting()
     */
    public void setEVoting(MessageType.EVoting value) {
        this.eVoting = value;
    }

    /**
     * Тип собрания
     * 
     * Доступны следующие значения:
     * -Owners - Собрание собственников
     * -Homeowners - Собрание ТСЖ
     * -Cooperative - Собрание кооператива
     * 
     * По умолчанию устанавливается значение "Собрание собственников"
     * 
     * @return
     *     possible object is
     *     {@link MeetingTypeType }
     *     
     */
    public MeetingTypeType getMeetingType() {
        return meetingType;
    }

    /**
     * Sets the value of the meetingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTypeType }
     *     
     * @see #getMeetingType()
     */
    public void setMeetingType(MeetingTypeType value) {
        this.meetingType = value;
    }

    /**
     * Сведения об инициаторах собрания
     * 
     * Gets the value of the voteInitiators property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteInitiators property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVoteInitiators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VoteInitiators }
     * </p>
     * 
     * 
     * @return
     *     The value of the voteInitiators property.
     */
    public List<VoteInitiators> getVoteInitiators() {
        if (voteInitiators == null) {
            voteInitiators = new ArrayList<>();
        }
        return this.voteInitiators;
    }

    /**
     * Повестка
     * 
     * Gets the value of the decisionList property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionList property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecisionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType.DecisionList }
     * </p>
     * 
     * 
     * @return
     *     The value of the decisionList property.
     */
    public List<MessageType.DecisionList> getDecisionList() {
        if (decisionList == null) {
            decisionList = new ArrayList<>();
        }
        return this.decisionList;
    }

    /**
     * Основание изменения. Заполняется для сообщений в статусе "Сообщение размещено" и с формой проведения отличной от "Заочное голосование с использованием системы"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModificationReason()
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
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
     *         <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="AVotingEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ResolutionPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="3000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
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
        "aVotingStartDate",
        "aVotingEndDate",
        "resolutionPlace",
        "attachments"
    })
    public static class AVoting {

        /**
         * Дата начала приема решений
         * 
         */
        @XmlElement(name = "AVotingStartDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingStartDate;
        /**
         * Дата окончания приема решений
         * 
         */
        @XmlElement(name = "AVotingEndDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingEndDate;
        /**
         * Место приема решений
         * 
         */
        @XmlElement(name = "ResolutionPlace", required = true)
        protected String resolutionPlace;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments")
        protected List<Attachments> attachments;

        /**
         * Дата начала приема решений
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAVotingStartDate() {
            return aVotingStartDate;
        }

        /**
         * Sets the value of the aVotingStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAVotingStartDate()
         */
        public void setAVotingStartDate(XMLGregorianCalendar value) {
            this.aVotingStartDate = value;
        }

        /**
         * Дата окончания приема решений
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAVotingEndDate() {
            return aVotingEndDate;
        }

        /**
         * Sets the value of the aVotingEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAVotingEndDate()
         */
        public void setAVotingEndDate(XMLGregorianCalendar value) {
            this.aVotingEndDate = value;
        }

        /**
         * Место приема решений
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResolutionPlace() {
            return resolutionPlace;
        }

        /**
         * Sets the value of the resolutionPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getResolutionPlace()
         */
        public void setResolutionPlace(String value) {
            this.resolutionPlace = value;
        }

        /**
         * Прикрепляемые файлы
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
         * {@link Attachments }
         * </p>
         * 
         * 
         * @return
         *     The value of the attachments property.
         */
        public List<Attachments> getAttachments() {
            if (attachments == null) {
                attachments = new ArrayList<>();
            }
            return this.attachments;
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
     *         <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType" minOccurs="0"/>
     *         <element name="QuestionName">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="3000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="DecisionsType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="HomeownersDecisionsType" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <choice minOccurs="0">
     *           <element name="CharterContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="CharterNotContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
     *         <element name="FormingFund" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="ManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType" minOccurs="0"/>
     *         <element name="AdminOfGeneralMeeting" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AdminOfGeneralMeetingType" minOccurs="0"/>
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
        "questionNumber",
        "questionName",
        "decisionsType",
        "homeownersDecisionsType",
        "charterContained",
        "charterNotContained",
        "formingFund",
        "managementType",
        "votingSystemDetails",
        "adminOfGeneralMeeting"
    })
    public static class DecisionList {

        /**
         * Номер вопроса
         * 
         */
        @XmlElement(name = "QuestionNumber")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected Integer questionNumber;
        /**
         * Вопрос
         * 
         */
        @XmlElement(name = "QuestionName", required = true)
        protected String questionName;
        /**
         * Тип вопроса (НСИ №63)
         * 
         * Обязательно к заполнению, если "Тип собрания" = "Собрание собственников"
         * 
         */
        @XmlElement(name = "DecisionsType")
        protected NsiRef decisionsType;
        /**
         * Тип вопроса для ТСЖ (НСИ №341)
         * 
         * Обязательно к заполнению, если "Тип собрания" = "Собрание ТСЖ"
         * 
         */
        @XmlElement(name = "HomeownersDecisionsType")
        protected MessageType.DecisionList.HomeownersDecisionsType homeownersDecisionsType;
        /**
         * Есть в уставе
         * 
         */
        @XmlElement(name = "CharterContained")
        protected Boolean charterContained;
        /**
         * Нет в уставе
         * 
         */
        @XmlElement(name = "CharterNotContained")
        protected Boolean charterNotContained;
        /**
         * Выбранный способ формирования фонда (справочник «Вид счета\Способ формирования фонда» НСИ 62). При импорте нельзя указывать "Значение не выбрано".
         * 
         */
        @XmlElement(name = "FormingFund")
        protected NsiRef formingFund;
        /**
         * Выбранный способ управления МКД (справочник «Способ управления» НСИ 25)
         * 
         */
        @XmlElement(name = "ManagementType")
        protected NsiRef managementType;
        /**
         * Система, в которой проводится голосование. Заполняется только для вопроса "Использование иной информационной системы при проведении общего собрания собственников помещений в многоквартирном доме в форме заочного голосования"
         * 
         */
        @XmlElement(name = "VotingSystemDetails")
        protected VotingSystemDetailsType votingSystemDetails;
        /**
         * Сведения о выбираемом АОСС
         * 
         * Заполняется только для вопросов с типом "Определение администратора общего собрания с указанием СНИЛС и(или) ОГРН"
         * 
         */
        @XmlElement(name = "AdminOfGeneralMeeting")
        protected AdminOfGeneralMeetingType adminOfGeneralMeeting;

        /**
         * Номер вопроса
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuestionNumber() {
            return questionNumber;
        }

        /**
         * Sets the value of the questionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getQuestionNumber()
         */
        public void setQuestionNumber(Integer value) {
            this.questionNumber = value;
        }

        /**
         * Вопрос
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuestionName() {
            return questionName;
        }

        /**
         * Sets the value of the questionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getQuestionName()
         */
        public void setQuestionName(String value) {
            this.questionName = value;
        }

        /**
         * Тип вопроса (НСИ №63)
         * 
         * Обязательно к заполнению, если "Тип собрания" = "Собрание собственников"
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getDecisionsType() {
            return decisionsType;
        }

        /**
         * Sets the value of the decisionsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getDecisionsType()
         */
        public void setDecisionsType(NsiRef value) {
            this.decisionsType = value;
        }

        /**
         * Тип вопроса для ТСЖ (НСИ №341)
         * 
         * Обязательно к заполнению, если "Тип собрания" = "Собрание ТСЖ"
         * 
         * @return
         *     possible object is
         *     {@link MessageType.DecisionList.HomeownersDecisionsType }
         *     
         */
        public MessageType.DecisionList.HomeownersDecisionsType getHomeownersDecisionsType() {
            return homeownersDecisionsType;
        }

        /**
         * Sets the value of the homeownersDecisionsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link MessageType.DecisionList.HomeownersDecisionsType }
         *     
         * @see #getHomeownersDecisionsType()
         */
        public void setHomeownersDecisionsType(MessageType.DecisionList.HomeownersDecisionsType value) {
            this.homeownersDecisionsType = value;
        }

        /**
         * Есть в уставе
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCharterContained() {
            return charterContained;
        }

        /**
         * Sets the value of the charterContained property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCharterContained()
         */
        public void setCharterContained(Boolean value) {
            this.charterContained = value;
        }

        /**
         * Нет в уставе
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCharterNotContained() {
            return charterNotContained;
        }

        /**
         * Sets the value of the charterNotContained property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCharterNotContained()
         */
        public void setCharterNotContained(Boolean value) {
            this.charterNotContained = value;
        }

        /**
         * Выбранный способ формирования фонда (справочник «Вид счета\Способ формирования фонда» НСИ 62). При импорте нельзя указывать "Значение не выбрано".
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getFormingFund() {
            return formingFund;
        }

        /**
         * Sets the value of the formingFund property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getFormingFund()
         */
        public void setFormingFund(NsiRef value) {
            this.formingFund = value;
        }

        /**
         * Выбранный способ управления МКД (справочник «Способ управления» НСИ 25)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getManagementType() {
            return managementType;
        }

        /**
         * Sets the value of the managementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getManagementType()
         */
        public void setManagementType(NsiRef value) {
            this.managementType = value;
        }

        /**
         * Система, в которой проводится голосование. Заполняется только для вопроса "Использование иной информационной системы при проведении общего собрания собственников помещений в многоквартирном доме в форме заочного голосования"
         * 
         * @return
         *     possible object is
         *     {@link VotingSystemDetailsType }
         *     
         */
        public VotingSystemDetailsType getVotingSystemDetails() {
            return votingSystemDetails;
        }

        /**
         * Sets the value of the votingSystemDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link VotingSystemDetailsType }
         *     
         * @see #getVotingSystemDetails()
         */
        public void setVotingSystemDetails(VotingSystemDetailsType value) {
            this.votingSystemDetails = value;
        }

        /**
         * Сведения о выбираемом АОСС
         * 
         * Заполняется только для вопросов с типом "Определение администратора общего собрания с указанием СНИЛС и(или) ОГРН"
         * 
         * @return
         *     possible object is
         *     {@link AdminOfGeneralMeetingType }
         *     
         */
        public AdminOfGeneralMeetingType getAdminOfGeneralMeeting() {
            return adminOfGeneralMeeting;
        }

        /**
         * Sets the value of the adminOfGeneralMeeting property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdminOfGeneralMeetingType }
         *     
         * @see #getAdminOfGeneralMeeting()
         */
        public void setAdminOfGeneralMeeting(AdminOfGeneralMeetingType value) {
            this.adminOfGeneralMeeting = value;
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
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HomeownersDecisionsType
            extends NsiRef
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
     *         <element name="EVotingDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element name="EVotingDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element name="Discipline">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="InfoReview">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType"/>
     *         <element name="FirstVoting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="AdminOfGeneralMeeting" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AdminOfGeneralMeetingType"/>
     *         <element name="AdminAddress">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="2000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
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
        "eVotingDateBegin",
        "eVotingDateEnd",
        "discipline",
        "infoReview",
        "votingSystemDetails",
        "firstVoting",
        "adminOfGeneralMeeting",
        "adminAddress",
        "attachments"
    })
    public static class EVoting {

        /**
         * Дата и время начала проведения голосования
         * 
         */
        @XmlElement(name = "EVotingDateBegin", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar eVotingDateBegin;
        /**
         * Дата и время окончания проведения голосования
         * 
         */
        @XmlElement(name = "EVotingDateEnd", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar eVotingDateEnd;
        /**
         * Порядок приема оформленных в письменной форме решений собственников
         * 
         */
        @XmlElement(name = "Discipline", required = true)
        protected String discipline;
        /**
         * Порядок ознакомления с информацией и (или) материалами, которые будут представлены на данном собрании
         * 
         */
        @XmlElement(name = "InfoReview", required = true)
        protected String infoReview;
        /**
         * Система, в которой проводится голосование
         * 
         */
        @XmlElement(name = "VotingSystemDetails", required = true)
        protected VotingSystemDetailsType votingSystemDetails;
        /**
         * Первое ОСС
         * 
         * Заполняется только если  в tns:VotingSystem выбрано "Региональная информационная система" или "ЕПГУ"
         * 
         */
        @XmlElement(name = "FirstVoting")
        protected Boolean firstVoting;
        /**
         * Сведения об АОСС
         * 
         */
        @XmlElement(name = "AdminOfGeneralMeeting", required = true)
        protected AdminOfGeneralMeetingType adminOfGeneralMeeting;
        /**
         * Место или фактический адрес администратора общего собрания
         * 
         */
        @XmlElement(name = "AdminAddress", required = true)
        protected String adminAddress;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments")
        protected List<Attachments> attachments;

        /**
         * Дата и время начала проведения голосования
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEVotingDateBegin() {
            return eVotingDateBegin;
        }

        /**
         * Sets the value of the eVotingDateBegin property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEVotingDateBegin()
         */
        public void setEVotingDateBegin(XMLGregorianCalendar value) {
            this.eVotingDateBegin = value;
        }

        /**
         * Дата и время окончания проведения голосования
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEVotingDateEnd() {
            return eVotingDateEnd;
        }

        /**
         * Sets the value of the eVotingDateEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEVotingDateEnd()
         */
        public void setEVotingDateEnd(XMLGregorianCalendar value) {
            this.eVotingDateEnd = value;
        }

        /**
         * Порядок приема оформленных в письменной форме решений собственников
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscipline() {
            return discipline;
        }

        /**
         * Sets the value of the discipline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDiscipline()
         */
        public void setDiscipline(String value) {
            this.discipline = value;
        }

        /**
         * Порядок ознакомления с информацией и (или) материалами, которые будут представлены на данном собрании
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoReview() {
            return infoReview;
        }

        /**
         * Sets the value of the infoReview property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInfoReview()
         */
        public void setInfoReview(String value) {
            this.infoReview = value;
        }

        /**
         * Система, в которой проводится голосование
         * 
         * @return
         *     possible object is
         *     {@link VotingSystemDetailsType }
         *     
         */
        public VotingSystemDetailsType getVotingSystemDetails() {
            return votingSystemDetails;
        }

        /**
         * Sets the value of the votingSystemDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link VotingSystemDetailsType }
         *     
         * @see #getVotingSystemDetails()
         */
        public void setVotingSystemDetails(VotingSystemDetailsType value) {
            this.votingSystemDetails = value;
        }

        /**
         * Первое ОСС
         * 
         * Заполняется только если  в tns:VotingSystem выбрано "Региональная информационная система" или "ЕПГУ"
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFirstVoting() {
            return firstVoting;
        }

        /**
         * Sets the value of the firstVoting property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isFirstVoting()
         */
        public void setFirstVoting(Boolean value) {
            this.firstVoting = value;
        }

        /**
         * Сведения об АОСС
         * 
         * @return
         *     possible object is
         *     {@link AdminOfGeneralMeetingType }
         *     
         */
        public AdminOfGeneralMeetingType getAdminOfGeneralMeeting() {
            return adminOfGeneralMeeting;
        }

        /**
         * Sets the value of the adminOfGeneralMeeting property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdminOfGeneralMeetingType }
         *     
         * @see #getAdminOfGeneralMeeting()
         */
        public void setAdminOfGeneralMeeting(AdminOfGeneralMeetingType value) {
            this.adminOfGeneralMeeting = value;
        }

        /**
         * Место или фактический адрес администратора общего собрания
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdminAddress() {
            return adminAddress;
        }

        /**
         * Sets the value of the adminAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdminAddress()
         */
        public void setAdminAddress(String value) {
            this.adminAddress = value;
        }

        /**
         * Прикрепляемые файлы
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
         * {@link Attachments }
         * </p>
         * 
         * 
         * @return
         *     The value of the attachments property.
         */
        public List<Attachments> getAttachments() {
            if (attachments == null) {
                attachments = new ArrayList<>();
            }
            return this.attachments;
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
     *         <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element name="VotingPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="3000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
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
        "meetingDate",
        "votingPlace",
        "attachments"
    })
    public static class Meeting {

        /**
         * Даьа и время проведения собрания
         * 
         */
        @XmlElement(name = "MeetingDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar meetingDate;
        /**
         * Место проведения собрания
         * 
         */
        @XmlElement(name = "VotingPlace", required = true)
        protected String votingPlace;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments")
        protected List<Attachments> attachments;

        /**
         * Даьа и время проведения собрания
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMeetingDate() {
            return meetingDate;
        }

        /**
         * Sets the value of the meetingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getMeetingDate()
         */
        public void setMeetingDate(XMLGregorianCalendar value) {
            this.meetingDate = value;
        }

        /**
         * Место проведения собрания
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVotingPlace() {
            return votingPlace;
        }

        /**
         * Sets the value of the votingPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getVotingPlace()
         */
        public void setVotingPlace(String value) {
            this.votingPlace = value;
        }

        /**
         * Прикрепляемые файлы
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
         * {@link Attachments }
         * </p>
         * 
         * 
         * @return
         *     The value of the attachments property.
         */
        public List<Attachments> getAttachments() {
            if (attachments == null) {
                attachments = new ArrayList<>();
            }
            return this.attachments;
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
     *         <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="AVotingEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ResolutionPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="3000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element name="VotingPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="3000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
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
        "aVotingStartDate",
        "aVotingEndDate",
        "resolutionPlace",
        "meetingDate",
        "votingPlace",
        "attachments"
    })
    public static class MeetingAVoting {

        /**
         * Дата начала приема решений
         * 
         */
        @XmlElement(name = "AVotingStartDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingStartDate;
        /**
         * Дата окончания приема решений
         * 
         */
        @XmlElement(name = "AVotingEndDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingEndDate;
        /**
         * Место приема решений
         * 
         */
        @XmlElement(name = "ResolutionPlace", required = true)
        protected String resolutionPlace;
        /**
         * Даьа и время проведения собрания
         * 
         */
        @XmlElement(name = "MeetingDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar meetingDate;
        /**
         * Место проведения собрания
         * 
         */
        @XmlElement(name = "VotingPlace", required = true)
        protected String votingPlace;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments")
        protected List<Attachments> attachments;

        /**
         * Дата начала приема решений
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAVotingStartDate() {
            return aVotingStartDate;
        }

        /**
         * Sets the value of the aVotingStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAVotingStartDate()
         */
        public void setAVotingStartDate(XMLGregorianCalendar value) {
            this.aVotingStartDate = value;
        }

        /**
         * Дата окончания приема решений
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAVotingEndDate() {
            return aVotingEndDate;
        }

        /**
         * Sets the value of the aVotingEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAVotingEndDate()
         */
        public void setAVotingEndDate(XMLGregorianCalendar value) {
            this.aVotingEndDate = value;
        }

        /**
         * Место приема решений
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResolutionPlace() {
            return resolutionPlace;
        }

        /**
         * Sets the value of the resolutionPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getResolutionPlace()
         */
        public void setResolutionPlace(String value) {
            this.resolutionPlace = value;
        }

        /**
         * Даьа и время проведения собрания
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMeetingDate() {
            return meetingDate;
        }

        /**
         * Sets the value of the meetingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getMeetingDate()
         */
        public void setMeetingDate(XMLGregorianCalendar value) {
            this.meetingDate = value;
        }

        /**
         * Место проведения собрания
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVotingPlace() {
            return votingPlace;
        }

        /**
         * Sets the value of the votingPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getVotingPlace()
         */
        public void setVotingPlace(String value) {
            this.votingPlace = value;
        }

        /**
         * Прикрепляемые файлы
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
         * {@link Attachments }
         * </p>
         * 
         * 
         * @return
         *     The value of the attachments property.
         */
        public List<Attachments> getAttachments() {
            if (attachments == null) {
                attachments = new ArrayList<>();
            }
            return this.attachments;
        }

    }

}
