
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;


/**
 * Документы лицензионного дела
 * 
 * <p>Java class for AccompanyingDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccompanyingDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Document">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="DocType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="DecisionOrg">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="DocumentStatus">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="A"/>
 *                         <enumeration value="C"/>
 *                         <enumeration value="P"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="BaseDocument" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="BaseDocType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="BaseDocDecisionOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BaseDocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BaseDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="BaseDocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
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
@XmlType(name = "AccompanyingDocumentType", propOrder = {
    "document",
    "baseDocument"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.licenses.LicenseType.AccompanyingDocument.class,
    ru.gosuslugi.dom.schema.integration.licenses.CorrectLicenseType.AccompanyingDocument.class
})
public class AccompanyingDocumentType {

    /**
     * Реквизиты размещаемого документа
     * 
     */
    @XmlElement(name = "Document", required = true)
    protected AccompanyingDocumentType.Document document;
    /**
     * Реквизиты документа, являющегося основанием для размещения информации
     * 
     */
    @XmlElement(name = "BaseDocument")
    protected AccompanyingDocumentType.BaseDocument baseDocument;

    /**
     * Реквизиты размещаемого документа
     * 
     * @return
     *     possible object is
     *     {@link AccompanyingDocumentType.Document }
     *     
     */
    public AccompanyingDocumentType.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccompanyingDocumentType.Document }
     *     
     * @see #getDocument()
     */
    public void setDocument(AccompanyingDocumentType.Document value) {
        this.document = value;
    }

    /**
     * Реквизиты документа, являющегося основанием для размещения информации
     * 
     * @return
     *     possible object is
     *     {@link AccompanyingDocumentType.BaseDocument }
     *     
     */
    public AccompanyingDocumentType.BaseDocument getBaseDocument() {
        return baseDocument;
    }

    /**
     * Sets the value of the baseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccompanyingDocumentType.BaseDocument }
     *     
     * @see #getBaseDocument()
     */
    public void setBaseDocument(AccompanyingDocumentType.BaseDocument value) {
        this.baseDocument = value;
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
     *         <element name="BaseDocType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="BaseDocDecisionOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BaseDocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BaseDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="BaseDocDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
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
        "baseDocType",
        "baseDocDecisionOrg",
        "baseDocName",
        "baseDocNumber",
        "baseDocDate",
        "dateFrom",
        "additionalInfo"
    })
    public static class BaseDocument {

        /**
         * Основание размещения (Тип электронного документа)
         * 
         */
        @XmlElement(name = "BaseDocType")
        protected NsiRef baseDocType;
        /**
         * Наименование организации, принявшей решение
         * 
         */
        @XmlElement(name = "BaseDocDecisionOrg")
        protected String baseDocDecisionOrg;
        /**
         * Наименование документа
         * 
         */
        @XmlElement(name = "BaseDocName")
        protected String baseDocName;
        /**
         * Номер документа
         * 
         */
        @XmlElement(name = "BaseDocNumber")
        protected String baseDocNumber;
        /**
         * Дата документа
         * 
         */
        @XmlElement(name = "BaseDocDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar baseDocDate;
        /**
         * Дата вступления в силу
         * 
         */
        @XmlElement(name = "DateFrom")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFrom;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInfo")
        protected String additionalInfo;

        /**
         * Основание размещения (Тип электронного документа)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getBaseDocType() {
            return baseDocType;
        }

        /**
         * Sets the value of the baseDocType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getBaseDocType()
         */
        public void setBaseDocType(NsiRef value) {
            this.baseDocType = value;
        }

        /**
         * Наименование организации, принявшей решение
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseDocDecisionOrg() {
            return baseDocDecisionOrg;
        }

        /**
         * Sets the value of the baseDocDecisionOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBaseDocDecisionOrg()
         */
        public void setBaseDocDecisionOrg(String value) {
            this.baseDocDecisionOrg = value;
        }

        /**
         * Наименование документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseDocName() {
            return baseDocName;
        }

        /**
         * Sets the value of the baseDocName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBaseDocName()
         */
        public void setBaseDocName(String value) {
            this.baseDocName = value;
        }

        /**
         * Номер документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseDocNumber() {
            return baseDocNumber;
        }

        /**
         * Sets the value of the baseDocNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBaseDocNumber()
         */
        public void setBaseDocNumber(String value) {
            this.baseDocNumber = value;
        }

        /**
         * Дата документа
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBaseDocDate() {
            return baseDocDate;
        }

        /**
         * Sets the value of the baseDocDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getBaseDocDate()
         */
        public void setBaseDocDate(XMLGregorianCalendar value) {
            this.baseDocDate = value;
        }

        /**
         * Дата вступления в силу
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateFrom()
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
        }

        /**
         * Дополнительная информация
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
     *         <element name="DocType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="DecisionOrg">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="DocumentStatus">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="A"/>
     *               <enumeration value="C"/>
     *               <enumeration value="P"/>
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
        "docType",
        "regDate",
        "decisionOrg",
        "name",
        "number",
        "documentStatus"
    })
    public static class Document {

        /**
         * Тип документа
         * 
         */
        @XmlElement(name = "DocType", required = true)
        protected NsiRef docType;
        /**
         * Дата включения в реестр
         * 
         */
        @XmlElement(name = "RegDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar regDate;
        /**
         * Наименование организации, принявшей решение
         * 
         */
        @XmlElement(name = "DecisionOrg", required = true)
        protected AccompanyingDocumentType.Document.DecisionOrg decisionOrg;
        /**
         * Наименование документа
         * 
         */
        @XmlElement(name = "Name", required = true)
        protected String name;
        /**
         * Номер документа
         * 
         */
        @XmlElement(name = "Number")
        protected String number;
        /**
         * Статус документа:    
         *     A - ACTIVE - Действующиий
         *     C - CANCELED - Отменен
         *     P - PROJECT - 
         * Проект
         * 
         */
        @XmlElement(name = "DocumentStatus", required = true)
        protected String documentStatus;

        /**
         * Тип документа
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getDocType() {
            return docType;
        }

        /**
         * Sets the value of the docType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getDocType()
         */
        public void setDocType(NsiRef value) {
            this.docType = value;
        }

        /**
         * Дата включения в реестр
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegDate() {
            return regDate;
        }

        /**
         * Sets the value of the regDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getRegDate()
         */
        public void setRegDate(XMLGregorianCalendar value) {
            this.regDate = value;
        }

        /**
         * Наименование организации, принявшей решение
         * 
         * @return
         *     possible object is
         *     {@link AccompanyingDocumentType.Document.DecisionOrg }
         *     
         */
        public AccompanyingDocumentType.Document.DecisionOrg getDecisionOrg() {
            return decisionOrg;
        }

        /**
         * Sets the value of the decisionOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccompanyingDocumentType.Document.DecisionOrg }
         *     
         * @see #getDecisionOrg()
         */
        public void setDecisionOrg(AccompanyingDocumentType.Document.DecisionOrg value) {
            this.decisionOrg = value;
        }

        /**
         * Наименование документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getName()
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Номер документа
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
         * Статус документа:    
         *     A - ACTIVE - Действующиий
         *     C - CANCELED - Отменен
         *     P - PROJECT - 
         * Проект
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentStatus() {
            return documentStatus;
        }

        /**
         * Sets the value of the documentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDocumentStatus()
         */
        public void setDocumentStatus(String value) {
            this.documentStatus = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DecisionOrg
            extends LegalType
        {


        }

    }

}
