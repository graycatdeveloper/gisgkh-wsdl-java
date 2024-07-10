
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgVersionType;


/**
 * Протокол ОСС (для экспорта)
 * 
 * <p>Java class for ProtocolExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProtocolExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrganizationGuid" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element name="ProtocolNum" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <choice>
 *           <element name="AVoting">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     <element name="AVotingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="ResolutionPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="3000"/>
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Meeting">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}VoitingType">
 *                   <sequence>
 *                     <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </extension>
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
 *                     <element name="Discipline" minOccurs="0">
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
 *                     <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType" minOccurs="0"/>
 *                     <element name="FirstVoting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
 *                     <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     <element name="VotingPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="3000"/>
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     <element name="AVotingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="ResolutionPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="3000"/>
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="MeetingType" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeetingTypeType" minOccurs="0"/>
 *         <choice>
 *           <element name="ExtraVoting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="AnnualVoting" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="VoteInitiators" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingInitiatorIndType"/>
 *                   <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersionType"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MeetingEligibility">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="C"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DecisionList" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType" minOccurs="0"/>
 *                     <element name="QuestionName">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="3000"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="DecisionsType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="HomeownersDecisionsType" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <choice minOccurs="0">
 *                       <element name="CharterContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                       <element name="CharterNotContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     </choice>
 *                     <sequence>
 *                       <element name="Agree" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                       <element name="Against" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                       <element name="Abstent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                     </sequence>
 *                     <element name="FormingFund" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="ManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType" minOccurs="0"/>
 *                     <element name="AdminOfGeneralMeeting" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AdminOfGeneralMeetingType" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="votingResume" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="M"/>
 *                         <enumeration value="N"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Modification" minOccurs="0">
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
@XmlType(name = "ProtocolExportType", propOrder = {
    "fiasHouseGuid",
    "organizationGuid",
    "protocolNum",
    "protocolDate",
    "aVoting",
    "meeting",
    "eVoting",
    "meetingAVoting",
    "meetingType",
    "extraVoting",
    "annualVoting",
    "voteInitiators",
    "meetingEligibility",
    "decisionList",
    "modification"
})
@XmlSeeAlso({
    ExportVotingProtocolResultType.class
})
public class ProtocolExportType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected List<String> fiasHouseGuid;
    /**
     * Товарищество Собственников Жилья/ Кооператив
     * 
     */
    @XmlElement(name = "OrganizationGuid")
    protected RegOrgType organizationGuid;
    /**
     * Номер протокола
     * 
     */
    @XmlElement(name = "ProtocolNum")
    protected String protocolNum;
    /**
     * Дата составления протокола
     * 
     */
    @XmlElement(name = "ProtocolDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolDate;
    /**
     * Заочное голосование (опросным путем)
     * 
     */
    @XmlElement(name = "AVoting")
    protected ProtocolExportType.AVoting aVoting;
    /**
     * Очное голосование
     * 
     */
    @XmlElement(name = "Meeting")
    protected ProtocolExportType.Meeting meeting;
    /**
     * Заочное голосование с использованием системы
     * 
     */
    @XmlElement(name = "EVoting")
    protected ProtocolExportType.EVoting eVoting;
    /**
     * Очное-заочное голосование
     * 
     */
    @XmlElement(name = "MeetingAVoting")
    protected ProtocolExportType.MeetingAVoting meetingAVoting;
    /**
     * Тип собрания
     * 
     * Доступны следующие значения:
     * -Owners - Собрание собственников
     * -Homeowners - Собрание ТСЖ
     * -Cooperative - Собрание кооператива
     * 
     */
    @XmlElement(name = "MeetingType")
    @XmlSchemaType(name = "string")
    protected MeetingTypeType meetingType;
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
     * Сведения об инициаторах собрания
     * 
     */
    @XmlElement(name = "VoteInitiators")
    protected List<ProtocolExportType.VoteInitiators> voteInitiators;
    /**
     * Правомочность собрания
     * Допустимые значения
     * (C)OMPETENT - Правомочно (имеет кворум)
     * (N)OT_COMPETENT- Не правомочно (кворум отсутствует)
     * 
     */
    @XmlElement(name = "MeetingEligibility", required = true)
    protected String meetingEligibility;
    /**
     * Повестка
     * 
     */
    @XmlElement(name = "DecisionList", required = true)
    protected List<ProtocolExportType.DecisionList> decisionList;
    /**
     * Основание изменения. Заполняется для протоколов ОСС в статусе "Размещен"
     * 
     */
    @XmlElement(name = "Modification")
    protected String modification;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * Gets the value of the fiasHouseGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFIASHouseGuid().add(newItem);
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
     *     The value of the fiasHouseGuid property.
     */
    public List<String> getFIASHouseGuid() {
        if (fiasHouseGuid == null) {
            fiasHouseGuid = new ArrayList<>();
        }
        return this.fiasHouseGuid;
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
     * Номер протокола
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolNum() {
        return protocolNum;
    }

    /**
     * Sets the value of the protocolNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProtocolNum()
     */
    public void setProtocolNum(String value) {
        this.protocolNum = value;
    }

    /**
     * Дата составления протокола
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolDate() {
        return protocolDate;
    }

    /**
     * Sets the value of the protocolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getProtocolDate()
     */
    public void setProtocolDate(XMLGregorianCalendar value) {
        this.protocolDate = value;
    }

    /**
     * Заочное голосование (опросным путем)
     * 
     * @return
     *     possible object is
     *     {@link ProtocolExportType.AVoting }
     *     
     */
    public ProtocolExportType.AVoting getAVoting() {
        return aVoting;
    }

    /**
     * Sets the value of the aVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolExportType.AVoting }
     *     
     * @see #getAVoting()
     */
    public void setAVoting(ProtocolExportType.AVoting value) {
        this.aVoting = value;
    }

    /**
     * Очное голосование
     * 
     * @return
     *     possible object is
     *     {@link ProtocolExportType.Meeting }
     *     
     */
    public ProtocolExportType.Meeting getMeeting() {
        return meeting;
    }

    /**
     * Sets the value of the meeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolExportType.Meeting }
     *     
     * @see #getMeeting()
     */
    public void setMeeting(ProtocolExportType.Meeting value) {
        this.meeting = value;
    }

    /**
     * Заочное голосование с использованием системы
     * 
     * @return
     *     possible object is
     *     {@link ProtocolExportType.EVoting }
     *     
     */
    public ProtocolExportType.EVoting getEVoting() {
        return eVoting;
    }

    /**
     * Sets the value of the eVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolExportType.EVoting }
     *     
     * @see #getEVoting()
     */
    public void setEVoting(ProtocolExportType.EVoting value) {
        this.eVoting = value;
    }

    /**
     * Очное-заочное голосование
     * 
     * @return
     *     possible object is
     *     {@link ProtocolExportType.MeetingAVoting }
     *     
     */
    public ProtocolExportType.MeetingAVoting getMeetingAVoting() {
        return meetingAVoting;
    }

    /**
     * Sets the value of the meetingAVoting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtocolExportType.MeetingAVoting }
     *     
     * @see #getMeetingAVoting()
     */
    public void setMeetingAVoting(ProtocolExportType.MeetingAVoting value) {
        this.meetingAVoting = value;
    }

    /**
     * Тип собрания
     * 
     * Доступны следующие значения:
     * -Owners - Собрание собственников
     * -Homeowners - Собрание ТСЖ
     * -Cooperative - Собрание кооператива
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
     * {@link ProtocolExportType.VoteInitiators }
     * </p>
     * 
     * 
     * @return
     *     The value of the voteInitiators property.
     */
    public List<ProtocolExportType.VoteInitiators> getVoteInitiators() {
        if (voteInitiators == null) {
            voteInitiators = new ArrayList<>();
        }
        return this.voteInitiators;
    }

    /**
     * Правомочность собрания
     * Допустимые значения
     * (C)OMPETENT - Правомочно (имеет кворум)
     * (N)OT_COMPETENT- Не правомочно (кворум отсутствует)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingEligibility() {
        return meetingEligibility;
    }

    /**
     * Sets the value of the meetingEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeetingEligibility()
     */
    public void setMeetingEligibility(String value) {
        this.meetingEligibility = value;
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
     * {@link ProtocolExportType.DecisionList }
     * </p>
     * 
     * 
     * @return
     *     The value of the decisionList property.
     */
    public List<ProtocolExportType.DecisionList> getDecisionList() {
        if (decisionList == null) {
            decisionList = new ArrayList<>();
        }
        return this.decisionList;
    }

    /**
     * Основание изменения. Заполняется для протоколов ОСС в статусе "Размещен"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModification()
     */
    public void setModification(String value) {
        this.modification = value;
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
     *         <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="AVotingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ResolutionPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="3000"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded"/>
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
        "aVotingDate",
        "resolutionPlace",
        "attachments"
    })
    public static class AVoting {

        /**
         * Дата начала приема решений собственников
         * 
         */
        @XmlElement(name = "AVotingStartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingStartDate;
        /**
         * Дата окончания приема решений
         * 
         */
        @XmlElement(name = "AVotingDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingDate;
        /**
         * Место приема решения
         * 
         */
        @XmlElement(name = "ResolutionPlace", required = true)
        protected String resolutionPlace;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments", required = true)
        protected List<Attachments> attachments;

        /**
         * Дата начала приема решений собственников
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
        public XMLGregorianCalendar getAVotingDate() {
            return aVotingDate;
        }

        /**
         * Sets the value of the aVotingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAVotingDate()
         */
        public void setAVotingDate(XMLGregorianCalendar value) {
            this.aVotingDate = value;
        }

        /**
         * Место приема решения
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
     *         <sequence>
     *           <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType" minOccurs="0"/>
     *           <element name="QuestionName">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <minLength value="1"/>
     *                 <maxLength value="3000"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="DecisionsType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *           <element name="HomeownersDecisionsType" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <choice minOccurs="0">
     *             <element name="CharterContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *             <element name="CharterNotContained" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           </choice>
     *           <sequence>
     *             <element name="Agree" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *             <element name="Against" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *             <element name="Abstent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *           </sequence>
     *           <element name="FormingFund" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *           <element name="ManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *           <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType" minOccurs="0"/>
     *           <element name="AdminOfGeneralMeeting" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AdminOfGeneralMeetingType" minOccurs="0"/>
     *         </sequence>
     *         <element name="votingResume" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="M"/>
     *               <enumeration value="N"/>
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
        "questionNumber",
        "questionName",
        "decisionsType",
        "homeownersDecisionsType",
        "charterContained",
        "charterNotContained",
        "agree",
        "against",
        "abstent",
        "formingFund",
        "managementType",
        "votingSystemDetails",
        "adminOfGeneralMeeting",
        "votingResume"
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
         */
        @XmlElement(name = "DecisionsType")
        protected NsiRef decisionsType;
        /**
         * Тип вопроса для ТСЖ (НСИ №341)
         * 
         */
        @XmlElement(name = "HomeownersDecisionsType")
        protected ProtocolExportType.DecisionList.HomeownersDecisionsType homeownersDecisionsType;
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
         * Результаты голосования «За»
         * 
         */
        @XmlElement(name = "Agree")
        protected BigDecimal agree;
        /**
         * Результаты голосования «Против»
         * 
         */
        @XmlElement(name = "Against")
        protected BigDecimal against;
        /**
         * Результаты голосования «Воздержался»
         * 
         */
        @XmlElement(name = "Abstent")
        protected BigDecimal abstent;
        /**
         * Выбранный способ формирования фонда (справочник «Вид счета\Способ формирования фонда» НСИ 62)
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
         * Итог голосования
         * Допустимые значения:
         * DECISION_IS_(M)ADE - решение принято
         * DECISION_IS_(N)OT_MADE - решение не принято
         * 
         */
        protected String votingResume;

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
         * @return
         *     possible object is
         *     {@link ProtocolExportType.DecisionList.HomeownersDecisionsType }
         *     
         */
        public ProtocolExportType.DecisionList.HomeownersDecisionsType getHomeownersDecisionsType() {
            return homeownersDecisionsType;
        }

        /**
         * Sets the value of the homeownersDecisionsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtocolExportType.DecisionList.HomeownersDecisionsType }
         *     
         * @see #getHomeownersDecisionsType()
         */
        public void setHomeownersDecisionsType(ProtocolExportType.DecisionList.HomeownersDecisionsType value) {
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
         * Результаты голосования «За»
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAgree() {
            return agree;
        }

        /**
         * Sets the value of the agree property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAgree()
         */
        public void setAgree(BigDecimal value) {
            this.agree = value;
        }

        /**
         * Результаты голосования «Против»
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAgainst() {
            return against;
        }

        /**
         * Sets the value of the against property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAgainst()
         */
        public void setAgainst(BigDecimal value) {
            this.against = value;
        }

        /**
         * Результаты голосования «Воздержался»
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAbstent() {
            return abstent;
        }

        /**
         * Sets the value of the abstent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAbstent()
         */
        public void setAbstent(BigDecimal value) {
            this.abstent = value;
        }

        /**
         * Выбранный способ формирования фонда (справочник «Вид счета\Способ формирования фонда» НСИ 62)
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
         * Итог голосования
         * Допустимые значения:
         * DECISION_IS_(M)ADE - решение принято
         * DECISION_IS_(N)OT_MADE - решение не принято
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVotingResume() {
            return votingResume;
        }

        /**
         * Sets the value of the votingResume property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getVotingResume()
         */
        public void setVotingResume(String value) {
            this.votingResume = value;
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
     *         <element name="Discipline" minOccurs="0">
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
     *         <element name="VotingSystemDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemDetailsType" minOccurs="0"/>
     *         <element name="FirstVoting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        @XmlElement(name = "Discipline")
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
        @XmlElement(name = "VotingSystemDetails")
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}VoitingType">
     *       <sequence>
     *         <element name="MeetingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded"/>
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
        "meetingDate",
        "attachments"
    })
    public static class Meeting
        extends VoitingType
    {

        /**
         * Дата и время проведения собрания
         * 
         */
        @XmlElement(name = "MeetingDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar meetingDate;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments", required = true)
        protected List<Attachments> attachments;

        /**
         * Дата и время проведения собрания
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
     *               <maxLength value="3000"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AVotingStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="AVotingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ResolutionPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="3000"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded"/>
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
        "aVotingStartDate",
        "aVotingDate",
        "resolutionPlace",
        "attachments"
    })
    public static class MeetingAVoting {

        /**
         * Дата и время проведения собрания
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
         * Дата начала приема решений собственников
         * 
         */
        @XmlElement(name = "AVotingStartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingStartDate;
        /**
         * Дата окончания приема решений
         * 
         */
        @XmlElement(name = "AVotingDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar aVotingDate;
        /**
         * Место приема решения
         * 
         */
        @XmlElement(name = "ResolutionPlace", required = true)
        protected String resolutionPlace;
        /**
         * Прикрепляемые файлы
         * 
         */
        @XmlElement(name = "Attachments", required = true)
        protected List<Attachments> attachments;

        /**
         * Дата и время проведения собрания
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
         * Дата начала приема решений собственников
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
        public XMLGregorianCalendar getAVotingDate() {
            return aVotingDate;
        }

        /**
         * Sets the value of the aVotingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAVotingDate()
         */
        public void setAVotingDate(XMLGregorianCalendar value) {
            this.aVotingDate = value;
        }

        /**
         * Место приема решения
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
     *       <choice>
     *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingInitiatorIndType"/>
     *         <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersionType"/>
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
        "ind",
        "org"
    })
    public static class VoteInitiators {

        /**
         * Физическое лицо (собственник помещений)
         * 
         */
        @XmlElement(name = "Ind")
        protected VotingInitiatorIndType ind;
        /**
         * Организация инициатор собрания ИП или Юр. лицо (УО)
         * 
         */
        @XmlElement(name = "Org")
        protected RegOrgVersionType org;

        /**
         * Физическое лицо (собственник помещений)
         * 
         * @return
         *     possible object is
         *     {@link VotingInitiatorIndType }
         *     
         */
        public VotingInitiatorIndType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link VotingInitiatorIndType }
         *     
         * @see #getInd()
         */
        public void setInd(VotingInitiatorIndType value) {
            this.ind = value;
        }

        /**
         * Организация инициатор собрания ИП или Юр. лицо (УО)
         * 
         * @return
         *     possible object is
         *     {@link RegOrgVersionType }
         *     
         */
        public RegOrgVersionType getOrg() {
            return org;
        }

        /**
         * Sets the value of the org property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgVersionType }
         *     
         * @see #getOrg()
         */
        public void setOrg(RegOrgVersionType value) {
            this.org = value;
        }

    }

}
