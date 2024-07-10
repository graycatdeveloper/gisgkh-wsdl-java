
package ru.gosuslugi.dom.schema.integration.appeals;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <element name="AppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *           </sequence>
 *           <choice>
 *             <element name="AppealNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealNumberType" maxOccurs="1000"/>
 *             <sequence>
 *               <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               <element name="AppealTheme" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *               <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *               <element name="StatusOfAppeal" minOccurs="0">
 *                 <complexType>
 *                   <complexContent>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                       <sequence>
 *                         <element name="NotSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                         <element name="Sent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                         <element name="InWork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                         <element name="Executed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                         <element name="Withdrawn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                       </sequence>
 *                     </restriction>
 *                   </complexContent>
 *                 </complexType>
 *               </element>
 *             </sequence>
 *           </choice>
 *           <choice>
 *             <element name="AnswerGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *             <sequence>
 *               <element name="StartCreateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               <element name="EndCreateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               <element name="StartPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *               <element name="EndPostDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             </sequence>
 *           </choice>
 *         </choice>
 *         <element name="IncludeHCSAppeals" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appealGUID",
    "appealNumber",
    "startDate",
    "endDate",
    "appealTheme",
    "fiasHouseGuid",
    "statusOfAppeal",
    "answerGUID",
    "startCreateDate",
    "endCreateDate",
    "startPostDate",
    "endPostDate",
    "includeHCSAppeals"
})
@XmlRootElement(name = "exportAppealRequest")
public class ExportAppealRequest
    extends BaseType
{

    /**
     * Идентификатор обращения в системе ГИС ЖКХ
     * 
     */
    @XmlElement(name = "AppealGUID")
    protected List<String> appealGUID;
    /**
     * Номер обращения
     * 
     */
    @XmlElement(name = "AppealNumber")
    protected List<String> appealNumber;
    /**
     * Дата создания обращения - начало диапазона
     * 
     */
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата создания обращения - конец диапазона
     * 
     */
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    /**
     * Тема обращения (НСИ 220)
     * 
     */
    @XmlElement(name = "AppealTheme")
    protected NsiRef appealTheme;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected List<String> fiasHouseGuid;
    /**
     * Статус обращения
     * 
     */
    @XmlElement(name = "StatusOfAppeal")
    protected ExportAppealRequest.StatusOfAppeal statusOfAppeal;
    /**
     * Идентификатор ответа
     * 
     */
    @XmlElement(name = "AnswerGUID")
    protected List<String> answerGUID;
    /**
     * Дата создания ответа на обращения - начало диапазона
     * 
     */
    @XmlElement(name = "StartCreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startCreateDate;
    /**
     * Дата создания ответа на обращения - конец диапазона
     * 
     */
    @XmlElement(name = "EndCreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endCreateDate;
    /**
     * Дата отправки ответа на обращения - начало диапазона
     * 
     */
    @XmlElement(name = "StartPostDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startPostDate;
    /**
     * Дата отправки ответа на обращения - конец диапазона
     * 
     */
    @XmlElement(name = "EndPostDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endPostDate;
    /**
     * Признак "Включать в экспорт обращения, сформированные ГИС ЖКХ" (для запросов по бизнес-атрибутам обращения или ответа)
     * 
     */
    @XmlElement(name = "IncludeHCSAppeals")
    protected Boolean includeHCSAppeals;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор обращения в системе ГИС ЖКХ
     * 
     * Gets the value of the appealGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appealGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAppealGUID().add(newItem);
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
     *     The value of the appealGUID property.
     */
    public List<String> getAppealGUID() {
        if (appealGUID == null) {
            appealGUID = new ArrayList<>();
        }
        return this.appealGUID;
    }

    /**
     * Номер обращения
     * 
     * Gets the value of the appealNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appealNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAppealNumber().add(newItem);
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
     *     The value of the appealNumber property.
     */
    public List<String> getAppealNumber() {
        if (appealNumber == null) {
            appealNumber = new ArrayList<>();
        }
        return this.appealNumber;
    }

    /**
     * Дата создания обращения - начало диапазона
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата создания обращения - конец диапазона
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Тема обращения (НСИ 220)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getAppealTheme() {
        return appealTheme;
    }

    /**
     * Sets the value of the appealTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getAppealTheme()
     */
    public void setAppealTheme(NsiRef value) {
        this.appealTheme = value;
    }

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
     * Статус обращения
     * 
     * @return
     *     possible object is
     *     {@link ExportAppealRequest.StatusOfAppeal }
     *     
     */
    public ExportAppealRequest.StatusOfAppeal getStatusOfAppeal() {
        return statusOfAppeal;
    }

    /**
     * Sets the value of the statusOfAppeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAppealRequest.StatusOfAppeal }
     *     
     * @see #getStatusOfAppeal()
     */
    public void setStatusOfAppeal(ExportAppealRequest.StatusOfAppeal value) {
        this.statusOfAppeal = value;
    }

    /**
     * Идентификатор ответа
     * 
     * Gets the value of the answerGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnswerGUID().add(newItem);
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
     *     The value of the answerGUID property.
     */
    public List<String> getAnswerGUID() {
        if (answerGUID == null) {
            answerGUID = new ArrayList<>();
        }
        return this.answerGUID;
    }

    /**
     * Дата создания ответа на обращения - начало диапазона
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartCreateDate() {
        return startCreateDate;
    }

    /**
     * Sets the value of the startCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartCreateDate()
     */
    public void setStartCreateDate(XMLGregorianCalendar value) {
        this.startCreateDate = value;
    }

    /**
     * Дата создания ответа на обращения - конец диапазона
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndCreateDate() {
        return endCreateDate;
    }

    /**
     * Sets the value of the endCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndCreateDate()
     */
    public void setEndCreateDate(XMLGregorianCalendar value) {
        this.endCreateDate = value;
    }

    /**
     * Дата отправки ответа на обращения - начало диапазона
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartPostDate() {
        return startPostDate;
    }

    /**
     * Sets the value of the startPostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartPostDate()
     */
    public void setStartPostDate(XMLGregorianCalendar value) {
        this.startPostDate = value;
    }

    /**
     * Дата отправки ответа на обращения - конец диапазона
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndPostDate() {
        return endPostDate;
    }

    /**
     * Sets the value of the endPostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndPostDate()
     */
    public void setEndPostDate(XMLGregorianCalendar value) {
        this.endPostDate = value;
    }

    /**
     * Признак "Включать в экспорт обращения, сформированные ГИС ЖКХ" (для запросов по бизнес-атрибутам обращения или ответа)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHCSAppeals() {
        return includeHCSAppeals;
    }

    /**
     * Sets the value of the includeHCSAppeals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeHCSAppeals()
     */
    public void setIncludeHCSAppeals(Boolean value) {
        this.includeHCSAppeals = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <element name="NotSent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="Sent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="InWork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="Executed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="Withdrawn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "notSent",
        "sent",
        "inWork",
        "executed",
        "withdrawn"
    })
    public static class StatusOfAppeal {

        /**
         * Не отправлено (элемент не используется в Системе - обращения, имеющие статус "Не отправлено", не экспортируются)
         * 
         */
        @XmlElement(name = "NotSent")
        protected Boolean notSent;
        /**
         * Отправлено
         * 
         */
        @XmlElement(name = "Sent")
        protected Boolean sent;
        /**
         * В работе
         * 
         */
        @XmlElement(name = "InWork")
        protected Boolean inWork;
        /**
         * Исполнено
         * 
         */
        @XmlElement(name = "Executed")
        protected Boolean executed;
        /**
         * Отозвано
         * 
         */
        @XmlElement(name = "Withdrawn")
        protected Boolean withdrawn;

        /**
         * Не отправлено (элемент не используется в Системе - обращения, имеющие статус "Не отправлено", не экспортируются)
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotSent() {
            return notSent;
        }

        /**
         * Sets the value of the notSent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNotSent()
         */
        public void setNotSent(Boolean value) {
            this.notSent = value;
        }

        /**
         * Отправлено
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSent() {
            return sent;
        }

        /**
         * Sets the value of the sent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isSent()
         */
        public void setSent(Boolean value) {
            this.sent = value;
        }

        /**
         * В работе
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInWork() {
            return inWork;
        }

        /**
         * Sets the value of the inWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isInWork()
         */
        public void setInWork(Boolean value) {
            this.inWork = value;
        }

        /**
         * Исполнено
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExecuted() {
            return executed;
        }

        /**
         * Sets the value of the executed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isExecuted()
         */
        public void setExecuted(Boolean value) {
            this.executed = value;
        }

        /**
         * Отозвано
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWithdrawn() {
            return withdrawn;
        }

        /**
         * Sets the value of the withdrawn property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isWithdrawn()
         */
        public void setWithdrawn(Boolean value) {
            this.withdrawn = value;
        }

    }

}
