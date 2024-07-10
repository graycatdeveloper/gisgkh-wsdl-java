
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Составной тип: Экспрот данных акта по договору
 * 
 * <p>Java class for ActType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ActKind" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActKindType"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActStatusType"/>
 *         <element name="ActVersion" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="VersionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="VersionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="ActualVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type"/>
 *                   <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="ActFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
 *                   <element name="MessageToApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
 *                   <choice minOccurs="0">
 *                     <sequence>
 *                       <element name="CommentFile" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
 *                       <element name="MessageFromApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
 *                     </sequence>
 *                     <sequence>
 *                       <element name="ActSignedByApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
 *                       <element name="SignedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     </sequence>
 *                   </choice>
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
@XmlType(name = "ActType", propOrder = {
    "actGuid",
    "actKind",
    "status",
    "actVersion"
})
public class ActType {

    /**
     * Корневой идентификатор акта
     * 
     */
    @XmlElement(name = "ActGuid", required = true)
    protected String actGuid;
    /**
     * Вид акта
     * 
     */
    @XmlElement(name = "ActKind", required = true)
    @XmlSchemaType(name = "string")
    protected ActKindType actKind;
    /**
     * Статус акта
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ActStatusType status;
    /**
     * Версия акта
     * 
     */
    @XmlElement(name = "ActVersion", required = true)
    protected List<ActType.ActVersion> actVersion;

    /**
     * Корневой идентификатор акта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActGuid() {
        return actGuid;
    }

    /**
     * Sets the value of the actGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActGuid()
     */
    public void setActGuid(String value) {
        this.actGuid = value;
    }

    /**
     * Вид акта
     * 
     * @return
     *     possible object is
     *     {@link ActKindType }
     *     
     */
    public ActKindType getActKind() {
        return actKind;
    }

    /**
     * Sets the value of the actKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActKindType }
     *     
     * @see #getActKind()
     */
    public void setActKind(ActKindType value) {
        this.actKind = value;
    }

    /**
     * Статус акта
     * 
     * @return
     *     possible object is
     *     {@link ActStatusType }
     *     
     */
    public ActStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActStatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(ActStatusType value) {
        this.status = value;
    }

    /**
     * Версия акта
     * 
     * Gets the value of the actVersion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actVersion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActType.ActVersion }
     * </p>
     * 
     * 
     * @return
     *     The value of the actVersion property.
     */
    public List<ActType.ActVersion> getActVersion() {
        if (actVersion == null) {
            actVersion = new ArrayList<>();
        }
        return this.actVersion;
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
     *         <element name="VersionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="VersionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ActualVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type"/>
     *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ActFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
     *         <element name="MessageToApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
     *         <choice minOccurs="0">
     *           <sequence>
     *             <element name="CommentFile" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
     *             <element name="MessageFromApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
     *           </sequence>
     *           <sequence>
     *             <element name="ActSignedByApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
     *             <element name="SignedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *           </sequence>
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
        "versionGuid",
        "versionNumber",
        "versionDate",
        "actualVersion",
        "number",
        "date",
        "actFile",
        "messageToApplicant",
        "commentFile",
        "messageFromApplicant",
        "actSignedByApplicant",
        "signedDate"
    })
    public static class ActVersion {

        /**
         * Идентификатор версии акта
         * 
         */
        @XmlElement(name = "VersionGuid", required = true)
        protected String versionGuid;
        /**
         * Порядковый номер версии
         * 
         */
        @XmlElement(name = "VersionNumber")
        protected int versionNumber;
        /**
         * Дата версии
         * 
         */
        @XmlElement(name = "VersionDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar versionDate;
        /**
         * Актуальная версия
         * 
         */
        @XmlElement(name = "ActualVersion")
        protected Boolean actualVersion;
        /**
         * Номер акта
         * 
         */
        @XmlElement(name = "Number", required = true)
        protected String number;
        /**
         * Дата акта
         * 
         */
        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        /**
         * Файл акта, подписанный со стороны исполнителя
         * 
         */
        @XmlElement(name = "ActFile", required = true)
        protected List<SignedAttachmentType> actFile;
        /**
         * Сообщение заявителю
         * 
         */
        @XmlElement(name = "MessageToApplicant", required = true)
        protected String messageToApplicant;
        /**
         * Файлы, содержащие замечания к акту
         * 
         */
        @XmlElement(name = "CommentFile")
        protected AttachedDocumentType commentFile;
        /**
         * Сообщение от заявителя
         * 
         */
        @XmlElement(name = "MessageFromApplicant")
        protected String messageFromApplicant;
        /**
         * Файлы подписанного заявителем акта
         * 
         */
        @XmlElement(name = "ActSignedByApplicant")
        protected AttachedDocumentType actSignedByApplicant;
        /**
         * Дата подписания акта
         * 
         */
        @XmlElement(name = "SignedDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signedDate;

        /**
         * Идентификатор версии акта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersionGuid() {
            return versionGuid;
        }

        /**
         * Sets the value of the versionGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getVersionGuid()
         */
        public void setVersionGuid(String value) {
            this.versionGuid = value;
        }

        /**
         * Порядковый номер версии
         * 
         */
        public int getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         */
        public void setVersionNumber(int value) {
            this.versionNumber = value;
        }

        /**
         * Дата версии
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getVersionDate() {
            return versionDate;
        }

        /**
         * Sets the value of the versionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getVersionDate()
         */
        public void setVersionDate(XMLGregorianCalendar value) {
            this.versionDate = value;
        }

        /**
         * Актуальная версия
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isActualVersion() {
            return actualVersion;
        }

        /**
         * Sets the value of the actualVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isActualVersion()
         */
        public void setActualVersion(Boolean value) {
            this.actualVersion = value;
        }

        /**
         * Номер акта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNumber()
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * Дата акта
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
         * Файл акта, подписанный со стороны исполнителя
         * 
         * Gets the value of the actFile property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the actFile property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getActFile().add(newItem);
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
         *     The value of the actFile property.
         */
        public List<SignedAttachmentType> getActFile() {
            if (actFile == null) {
                actFile = new ArrayList<>();
            }
            return this.actFile;
        }

        /**
         * Сообщение заявителю
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageToApplicant() {
            return messageToApplicant;
        }

        /**
         * Sets the value of the messageToApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMessageToApplicant()
         */
        public void setMessageToApplicant(String value) {
            this.messageToApplicant = value;
        }

        /**
         * Файлы, содержащие замечания к акту
         * 
         * @return
         *     possible object is
         *     {@link AttachedDocumentType }
         *     
         */
        public AttachedDocumentType getCommentFile() {
            return commentFile;
        }

        /**
         * Sets the value of the commentFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachedDocumentType }
         *     
         * @see #getCommentFile()
         */
        public void setCommentFile(AttachedDocumentType value) {
            this.commentFile = value;
        }

        /**
         * Сообщение от заявителя
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageFromApplicant() {
            return messageFromApplicant;
        }

        /**
         * Sets the value of the messageFromApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMessageFromApplicant()
         */
        public void setMessageFromApplicant(String value) {
            this.messageFromApplicant = value;
        }

        /**
         * Файлы подписанного заявителем акта
         * 
         * @return
         *     possible object is
         *     {@link AttachedDocumentType }
         *     
         */
        public AttachedDocumentType getActSignedByApplicant() {
            return actSignedByApplicant;
        }

        /**
         * Sets the value of the actSignedByApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachedDocumentType }
         *     
         * @see #getActSignedByApplicant()
         */
        public void setActSignedByApplicant(AttachedDocumentType value) {
            this.actSignedByApplicant = value;
        }

        /**
         * Дата подписания акта
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignedDate() {
            return signedDate;
        }

        /**
         * Sets the value of the signedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSignedDate()
         */
        public void setSignedDate(XMLGregorianCalendar value) {
            this.signedDate = value;
        }

    }

}
