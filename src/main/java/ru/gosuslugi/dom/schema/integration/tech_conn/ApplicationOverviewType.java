
package ru.gosuslugi.dom.schema.integration.tech_conn;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Общие сведения о заявлении
 * 
 * <p>Java class for ApplicationOverviewType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApplicationOverviewType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="GISHCSNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String20Type"/>
 *         <element name="GISHCSRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <sequence minOccurs="0">
 *           <element name="EPGUNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *           <element name="EPGUStatementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="AnswerSentInfo">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Status">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="NOT_SENT"/>
 *                           <enumeration value="PROCESSING"/>
 *                           <enumeration value="SENT"/>
 *                           <enumeration value="ERROR"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *         <element name="ExecutorPerson" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExecutionDeadline" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationOverviewType", propOrder = {
    "applicationGuid",
    "gishcsNumber",
    "gishcsRegistrationDate",
    "epguNumber",
    "epguStatementDate",
    "answerSentInfo",
    "executorPerson",
    "executionDeadline"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportOrganizationDeterminationApplicationType.ApplicationOverview.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportTechnicalSpecificationApplicationType.ApplicationOverview.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportConnectionPossibilityApplicationType.ApplicationOverview.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ActApplicationType.ApplicationOverview.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.AgreementApplicationType.ApplicationOverview.class
})
public class ApplicationOverviewType {

    /**
     * Уникальный идентификатор заявления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ApplicationGuid", required = true)
    protected String applicationGuid;
    /**
     * Регистрационны номер заявления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "GISHCSNumber", required = true)
    protected String gishcsNumber;
    /**
     * Дата регистрации заявления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "GISHCSRegistrationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gishcsRegistrationDate;
    /**
     * Номер заявления на ЕПГУ
     * 
     */
    @XmlElement(name = "EPGUNumber")
    protected Long epguNumber;
    /**
     * Дата заявления на ЕПГУ
     * 
     */
    @XmlElement(name = "EPGUStatementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar epguStatementDate;
    /**
     * Сведения о статусе отправки ответа на ЕПГУ
     * 
     */
    @XmlElement(name = "AnswerSentInfo")
    protected ApplicationOverviewType.AnswerSentInfo answerSentInfo;
    /**
     * Информация об исполнителе по заявлению
     * 
     */
    @XmlElement(name = "ExecutorPerson")
    protected ApplicationOverviewType.ExecutorPerson executorPerson;
    /**
     * Дата истечения срока отправки ответа по заявлению. В зависимости от статуса заявления ответ может ожидаться как от сетевой организации, так и от заявителя
     * 
     */
    @XmlElement(name = "ExecutionDeadline", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar executionDeadline;

    /**
     * Уникальный идентификатор заявления в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationGuid() {
        return applicationGuid;
    }

    /**
     * Sets the value of the applicationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicationGuid()
     */
    public void setApplicationGuid(String value) {
        this.applicationGuid = value;
    }

    /**
     * Регистрационны номер заявления в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGISHCSNumber() {
        return gishcsNumber;
    }

    /**
     * Sets the value of the gishcsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGISHCSNumber()
     */
    public void setGISHCSNumber(String value) {
        this.gishcsNumber = value;
    }

    /**
     * Дата регистрации заявления в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGISHCSRegistrationDate() {
        return gishcsRegistrationDate;
    }

    /**
     * Sets the value of the gishcsRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getGISHCSRegistrationDate()
     */
    public void setGISHCSRegistrationDate(XMLGregorianCalendar value) {
        this.gishcsRegistrationDate = value;
    }

    /**
     * Номер заявления на ЕПГУ
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEPGUNumber() {
        return epguNumber;
    }

    /**
     * Sets the value of the epguNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     * @see #getEPGUNumber()
     */
    public void setEPGUNumber(Long value) {
        this.epguNumber = value;
    }

    /**
     * Дата заявления на ЕПГУ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEPGUStatementDate() {
        return epguStatementDate;
    }

    /**
     * Sets the value of the epguStatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEPGUStatementDate()
     */
    public void setEPGUStatementDate(XMLGregorianCalendar value) {
        this.epguStatementDate = value;
    }

    /**
     * Сведения о статусе отправки ответа на ЕПГУ
     * 
     * @return
     *     possible object is
     *     {@link ApplicationOverviewType.AnswerSentInfo }
     *     
     */
    public ApplicationOverviewType.AnswerSentInfo getAnswerSentInfo() {
        return answerSentInfo;
    }

    /**
     * Sets the value of the answerSentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationOverviewType.AnswerSentInfo }
     *     
     * @see #getAnswerSentInfo()
     */
    public void setAnswerSentInfo(ApplicationOverviewType.AnswerSentInfo value) {
        this.answerSentInfo = value;
    }

    /**
     * Информация об исполнителе по заявлению
     * 
     * @return
     *     possible object is
     *     {@link ApplicationOverviewType.ExecutorPerson }
     *     
     */
    public ApplicationOverviewType.ExecutorPerson getExecutorPerson() {
        return executorPerson;
    }

    /**
     * Sets the value of the executorPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationOverviewType.ExecutorPerson }
     *     
     * @see #getExecutorPerson()
     */
    public void setExecutorPerson(ApplicationOverviewType.ExecutorPerson value) {
        this.executorPerson = value;
    }

    /**
     * Дата истечения срока отправки ответа по заявлению. В зависимости от статуса заявления ответ может ожидаться как от сетевой организации, так и от заявителя
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecutionDeadline() {
        return executionDeadline;
    }

    /**
     * Sets the value of the executionDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExecutionDeadline()
     */
    public void setExecutionDeadline(XMLGregorianCalendar value) {
        this.executionDeadline = value;
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
     *         <element name="Status">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="NOT_SENT"/>
     *               <enumeration value="PROCESSING"/>
     *               <enumeration value="SENT"/>
     *               <enumeration value="ERROR"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="SentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "status",
        "sentDate"
    })
    public static class AnswerSentInfo {

        /**
         * Статус отправки ответа
         * 
         */
        @XmlElement(name = "Status", required = true)
        protected String status;
        /**
         * Дата отправки
         * 
         */
        @XmlElement(name = "SentDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar sentDate;

        /**
         * Статус отправки ответа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getStatus()
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Дата отправки
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSentDate() {
            return sentDate;
        }

        /**
         * Sets the value of the sentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSentDate()
         */
        public void setSentDate(XMLGregorianCalendar value) {
            this.sentDate = value;
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
     *         <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
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
        "fio"
    })
    public static class ExecutorPerson {

        /**
         * Фамилия И.О. исполнителя по заявлению
         * 
         */
        @XmlElement(name = "FIO", required = true)
        protected String fio;

        /**
         * Фамилия И.О. исполнителя по заявлению
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIO() {
            return fio;
        }

        /**
         * Sets the value of the fio property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFIO()
         */
        public void setFIO(String value) {
            this.fio = value;
        }

    }

}
