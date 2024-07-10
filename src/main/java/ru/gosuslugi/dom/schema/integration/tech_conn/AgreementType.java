
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
 * Составной тип: Экспрот данных договора о подключении
 * 
 * <p>Java class for AgreementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AgreementType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgreementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AgreementStatusType"/>
 *         <element name="AgreementVersion" maxOccurs="unbounded">
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
 *                   <element name="AgreementFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
 *                   <element name="MessageToApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
 *                   <choice minOccurs="0">
 *                     <sequence>
 *                       <element name="ProtocolOfDisagreementsFile" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
 *                       <element name="MessageFromApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
 *                     </sequence>
 *                     <sequence>
 *                       <element name="AgreementSignedByApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
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
@XmlType(name = "AgreementType", propOrder = {
    "agreementGuid",
    "status",
    "agreementVersion"
})
public class AgreementType {

    /**
     * Корневой идентификатор договора
     * 
     */
    @XmlElement(name = "AgreementGuid", required = true)
    protected String agreementGuid;
    /**
     * Статус договора
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected AgreementStatusType status;
    /**
     * Версия договора
     * 
     */
    @XmlElement(name = "AgreementVersion", required = true)
    protected List<AgreementType.AgreementVersion> agreementVersion;

    /**
     * Корневой идентификатор договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementGuid() {
        return agreementGuid;
    }

    /**
     * Sets the value of the agreementGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgreementGuid()
     */
    public void setAgreementGuid(String value) {
        this.agreementGuid = value;
    }

    /**
     * Статус договора
     * 
     * @return
     *     possible object is
     *     {@link AgreementStatusType }
     *     
     */
    public AgreementStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementStatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(AgreementStatusType value) {
        this.status = value;
    }

    /**
     * Версия договора
     * 
     * Gets the value of the agreementVersion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementVersion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAgreementVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementType.AgreementVersion }
     * </p>
     * 
     * 
     * @return
     *     The value of the agreementVersion property.
     */
    public List<AgreementType.AgreementVersion> getAgreementVersion() {
        if (agreementVersion == null) {
            agreementVersion = new ArrayList<>();
        }
        return this.agreementVersion;
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
     *         <element name="AgreementFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
     *         <element name="MessageToApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
     *         <choice minOccurs="0">
     *           <sequence>
     *             <element name="ProtocolOfDisagreementsFile" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
     *             <element name="MessageFromApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type" minOccurs="0"/>
     *           </sequence>
     *           <sequence>
     *             <element name="AgreementSignedByApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType"/>
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
        "agreementFile",
        "messageToApplicant",
        "protocolOfDisagreementsFile",
        "messageFromApplicant",
        "agreementSignedByApplicant",
        "signedDate"
    })
    public static class AgreementVersion {

        /**
         * Идентификатор версии договора
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
         * Номер договора
         * 
         */
        @XmlElement(name = "Number", required = true)
        protected String number;
        /**
         * Дата договора
         * 
         */
        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        /**
         * Файл договора, подписанный со стороны исполнителя
         * 
         */
        @XmlElement(name = "AgreementFile", required = true)
        protected List<SignedAttachmentType> agreementFile;
        /**
         * Сообщение заявителю
         * 
         */
        @XmlElement(name = "MessageToApplicant", required = true)
        protected String messageToApplicant;
        /**
         * Протокол разногласий к текущей редакции договора
         * 
         */
        @XmlElement(name = "ProtocolOfDisagreementsFile")
        protected AttachedDocumentType protocolOfDisagreementsFile;
        /**
         * Сообщение от заявителя
         * 
         */
        @XmlElement(name = "MessageFromApplicant")
        protected String messageFromApplicant;
        /**
         * Файлы подписанного заявителем договора
         * 
         */
        @XmlElement(name = "AgreementSignedByApplicant")
        protected AttachedDocumentType agreementSignedByApplicant;
        /**
         * Дата подписания договора
         * 
         */
        @XmlElement(name = "SignedDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signedDate;

        /**
         * Идентификатор версии договора
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
         * Номер договора
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
         * Дата договора
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
         * Файл договора, подписанный со стороны исполнителя
         * 
         * Gets the value of the agreementFile property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agreementFile property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAgreementFile().add(newItem);
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
         *     The value of the agreementFile property.
         */
        public List<SignedAttachmentType> getAgreementFile() {
            if (agreementFile == null) {
                agreementFile = new ArrayList<>();
            }
            return this.agreementFile;
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
         * Протокол разногласий к текущей редакции договора
         * 
         * @return
         *     possible object is
         *     {@link AttachedDocumentType }
         *     
         */
        public AttachedDocumentType getProtocolOfDisagreementsFile() {
            return protocolOfDisagreementsFile;
        }

        /**
         * Sets the value of the protocolOfDisagreementsFile property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachedDocumentType }
         *     
         * @see #getProtocolOfDisagreementsFile()
         */
        public void setProtocolOfDisagreementsFile(AttachedDocumentType value) {
            this.protocolOfDisagreementsFile = value;
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
         * Файлы подписанного заявителем договора
         * 
         * @return
         *     possible object is
         *     {@link AttachedDocumentType }
         *     
         */
        public AttachedDocumentType getAgreementSignedByApplicant() {
            return agreementSignedByApplicant;
        }

        /**
         * Sets the value of the agreementSignedByApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachedDocumentType }
         *     
         * @see #getAgreementSignedByApplicant()
         */
        public void setAgreementSignedByApplicant(AttachedDocumentType value) {
            this.agreementSignedByApplicant = value;
        }

        /**
         * Дата подписания договора
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
