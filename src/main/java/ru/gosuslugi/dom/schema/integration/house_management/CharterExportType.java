
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Устав (для экспорта)
 * 
 * <p>Java class for CharterExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CharterExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="DateDetails" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterDateDetailsExportType" minOccurs="0"/>
 *         <element name="MeetingProtocol" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ProtocolMeetingOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NoCharterApproveProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AttachmentCharter" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AutomaticRollOverOneYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IndicationsAnyDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharterExportType", propOrder = {
    "date",
    "dateDetails",
    "meetingProtocol",
    "noCharterApproveProtocol",
    "attachmentCharter",
    "automaticRollOverOneYear",
    "indicationsAnyDay"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Charter.class
})
public class CharterExportType {

    /**
     * Дата регистрации TCН/ТСЖ/кооператива (Организации Поставщика данных)
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Информация о сроках
     * 
     */
    @XmlElement(name = "DateDetails")
    protected CharterDateDetailsExportType dateDetails;
    /**
     * Протокол собрания собственников
     * 
     */
    @XmlElement(name = "MeetingProtocol")
    protected CharterExportType.MeetingProtocol meetingProtocol;
    /**
     * Протокол, содержащий решение об утверждении устава, отсутствует (при значениии True MeetingProtocol необзяательны)
     * 
     */
    @XmlElement(name = "NoCharterApproveProtocol")
    protected Boolean noCharterApproveProtocol;
    /**
     * Документы устава
     * 
     */
    @XmlElement(name = "AttachmentCharter")
    protected List<AttachmentType> attachmentCharter;
    /**
     * Автоматически продлить срок оказания услуг на один год. Для автоматического продления указывается значение true.
     * 
     */
    @XmlElement(name = "AutomaticRollOverOneYear")
    protected Boolean automaticRollOverOneYear;
    /**
     * Разрешить (true) или запретить (false) передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца.
     * 
     */
    @XmlElement(name = "IndicationsAnyDay")
    protected Boolean indicationsAnyDay;

    /**
     * Дата регистрации TCН/ТСЖ/кооператива (Организации Поставщика данных)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Информация о сроках
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsExportType }
     *     
     */
    public CharterDateDetailsExportType getDateDetails() {
        return dateDetails;
    }

    /**
     * Sets the value of the dateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsExportType }
     *     
     * @see #getDateDetails()
     */
    public void setDateDetails(CharterDateDetailsExportType value) {
        this.dateDetails = value;
    }

    /**
     * Протокол собрания собственников
     * 
     * @return
     *     possible object is
     *     {@link CharterExportType.MeetingProtocol }
     *     
     */
    public CharterExportType.MeetingProtocol getMeetingProtocol() {
        return meetingProtocol;
    }

    /**
     * Sets the value of the meetingProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterExportType.MeetingProtocol }
     *     
     * @see #getMeetingProtocol()
     */
    public void setMeetingProtocol(CharterExportType.MeetingProtocol value) {
        this.meetingProtocol = value;
    }

    /**
     * Протокол, содержащий решение об утверждении устава, отсутствует (при значениии True MeetingProtocol необзяательны)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCharterApproveProtocol() {
        return noCharterApproveProtocol;
    }

    /**
     * Sets the value of the noCharterApproveProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoCharterApproveProtocol()
     */
    public void setNoCharterApproveProtocol(Boolean value) {
        this.noCharterApproveProtocol = value;
    }

    /**
     * Документы устава
     * 
     * Gets the value of the attachmentCharter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentCharter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachmentCharter().add(newItem);
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
     *     The value of the attachmentCharter property.
     */
    public List<AttachmentType> getAttachmentCharter() {
        if (attachmentCharter == null) {
            attachmentCharter = new ArrayList<>();
        }
        return this.attachmentCharter;
    }

    /**
     * Автоматически продлить срок оказания услуг на один год. Для автоматического продления указывается значение true.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticRollOverOneYear() {
        return automaticRollOverOneYear;
    }

    /**
     * Sets the value of the automaticRollOverOneYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAutomaticRollOverOneYear()
     */
    public void setAutomaticRollOverOneYear(Boolean value) {
        this.automaticRollOverOneYear = value;
    }

    /**
     * Разрешить (true) или запретить (false) передачу гражданам текущих показаний по индивидуальным приборам учета в любой день месяца.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicationsAnyDay() {
        return indicationsAnyDay;
    }

    /**
     * Sets the value of the indicationsAnyDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIndicationsAnyDay()
     */
    public void setIndicationsAnyDay(Boolean value) {
        this.indicationsAnyDay = value;
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
     *         <element name="ProtocolMeetingOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100" minOccurs="0"/>
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
        "protocolMeetingOwners",
        "votingProtocolGUID"
    })
    public static class MeetingProtocol {

        /**
         * Протокол собрания собственников (Добавление нового протокола)
         * 
         */
        @XmlElement(name = "ProtocolMeetingOwners")
        protected List<AttachmentType> protocolMeetingOwners;
        /**
         * Идентификатор версии протокола голосования (Добавление протокола из реестра сведений о голосовании)
         * 
         */
        @XmlElement(name = "VotingProtocolGUID")
        protected List<String> votingProtocolGUID;

        /**
         * Протокол собрания собственников (Добавление нового протокола)
         * 
         * Gets the value of the protocolMeetingOwners property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolMeetingOwners property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProtocolMeetingOwners().add(newItem);
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
         *     The value of the protocolMeetingOwners property.
         */
        public List<AttachmentType> getProtocolMeetingOwners() {
            if (protocolMeetingOwners == null) {
                protocolMeetingOwners = new ArrayList<>();
            }
            return this.protocolMeetingOwners;
        }

        /**
         * Идентификатор версии протокола голосования (Добавление протокола из реестра сведений о голосовании)
         * 
         * Gets the value of the votingProtocolGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the votingProtocolGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getVotingProtocolGUID().add(newItem);
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
         *     The value of the votingProtocolGUID property.
         */
        public List<String> getVotingProtocolGUID() {
            if (votingProtocolGUID == null) {
                votingProtocolGUID = new ArrayList<>();
            }
            return this.votingProtocolGUID;
        }

    }

}
