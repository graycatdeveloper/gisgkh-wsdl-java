
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Итоги для голосований с использованием системы
 * 
 * <p>Java class for ExternalVotingProtocolType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExternalVotingProtocolType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProtocolNum" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                   <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType"/>
 *                   <sequence>
 *                     <element name="Agree" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                     <element name="Against" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                     <element name="Abstent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="VotingResume">
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
@XmlType(name = "ExternalVotingProtocolType", propOrder = {
    "protocolNum",
    "protocolDate",
    "meetingEligibility",
    "decisionList",
    "attachments"
})
public class ExternalVotingProtocolType {

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
    protected List<ExternalVotingProtocolType.DecisionList> decisionList;
    /**
     * Прикрепляемые файлы
     * 
     */
    @XmlElement(name = "Attachments")
    protected List<Attachments> attachments;

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
     * {@link ExternalVotingProtocolType.DecisionList }
     * </p>
     * 
     * 
     * @return
     *     The value of the decisionList property.
     */
    public List<ExternalVotingProtocolType.DecisionList> getDecisionList() {
        if (decisionList == null) {
            decisionList = new ArrayList<>();
        }
        return this.decisionList;
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
     *         <element name="QuestionNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}QuestionNumberType"/>
     *         <sequence>
     *           <element name="Agree" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *           <element name="Against" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *           <element name="Abstent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         </sequence>
     *         <element name="VotingResume">
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
        "agree",
        "against",
        "abstent",
        "votingResume"
    })
    public static class DecisionList {

        /**
         * Номер вопроса
         * 
         */
        @XmlElement(name = "QuestionNumber")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected int questionNumber;
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
         * Итог голосования
         * Допустимые значения:
         * DECISION_IS_(M)ADE - решение принято
         * DECISION_IS_(N)OT_MADE - решение не принято
         * 
         */
        @XmlElement(name = "VotingResume", required = true)
        protected String votingResume;

        /**
         * Номер вопроса
         * 
         */
        public int getQuestionNumber() {
            return questionNumber;
        }

        /**
         * Sets the value of the questionNumber property.
         * 
         */
        public void setQuestionNumber(int value) {
            this.questionNumber = value;
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

    }

}
