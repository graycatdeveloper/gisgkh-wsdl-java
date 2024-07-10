
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Информация о задолженности, подтвержденной судебным актом
 * 
 * <p>Java class for DebtInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DebtInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="person">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="firstName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType"/>
 *                   <element name="lastName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType"/>
 *                   <element name="middleName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType" minOccurs="0"/>
 *                   <element name="snils" type="{http://dom.gosuslugi.ru/schema/integration/drs/}SNILSType" minOccurs="0"/>
 *                   <element name="document" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DocumentType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="document" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
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
@XmlType(name = "DebtInfoType", propOrder = {
    "person",
    "document"
})
public class DebtInfoType {

    /**
     * Информация о лице, в отношении которого имеется задолженность
     * 
     */
    @XmlElement(required = true)
    protected DebtInfoType.Person person;
    /**
     * Документ, подтверждающий задолженность
     * 
     */
    protected List<DebtInfoType.Document> document;

    /**
     * Информация о лице, в отношении которого имеется задолженность
     * 
     * @return
     *     possible object is
     *     {@link DebtInfoType.Person }
     *     
     */
    public DebtInfoType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInfoType.Person }
     *     
     * @see #getPerson()
     */
    public void setPerson(DebtInfoType.Person value) {
        this.person = value;
    }

    /**
     * Документ, подтверждающий задолженность
     * 
     * Gets the value of the document property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DebtInfoType.Document }
     * </p>
     * 
     * 
     * @return
     *     The value of the document property.
     */
    public List<DebtInfoType.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<>();
        }
        return this.document;
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
     *         <element name="type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
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
        "type",
        "attachment"
    })
    public static class Document {

        /**
         * Тип документа, для ответа на подзапрос (НСИ 358)
         * 
         */
        @XmlElement(required = true)
        protected NsiRef type;
        /**
         * Прикрепленный файл
         * 
         */
        @XmlElement(required = true)
        protected AttachmentType attachment;

        /**
         * Тип документа, для ответа на подзапрос (НСИ 358)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getType()
         */
        public void setType(NsiRef value) {
            this.type = value;
        }

        /**
         * Прикрепленный файл
         * 
         * @return
         *     possible object is
         *     {@link AttachmentType }
         *     
         */
        public AttachmentType getAttachment() {
            return attachment;
        }

        /**
         * Sets the value of the attachment property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentType }
         *     
         * @see #getAttachment()
         */
        public void setAttachment(AttachmentType value) {
            this.attachment = value;
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
     *         <element name="firstName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType"/>
     *         <element name="lastName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType"/>
     *         <element name="middleName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType" minOccurs="0"/>
     *         <element name="snils" type="{http://dom.gosuslugi.ru/schema/integration/drs/}SNILSType" minOccurs="0"/>
     *         <element name="document" type="{http://dom.gosuslugi.ru/schema/integration/drs/}DocumentType" minOccurs="0"/>
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
        "firstName",
        "lastName",
        "middleName",
        "snils",
        "document"
    })
    public static class Person {

        /**
         * Имя
         * 
         */
        @XmlElement(required = true)
        protected String firstName;
        /**
         * Фамилия
         * 
         */
        @XmlElement(required = true)
        protected String lastName;
        /**
         * Отчество
         * 
         */
        protected String middleName;
        /**
         * СНИЛС
         * 
         */
        protected String snils;
        /**
         * Документ, удостоверяющий личность
         * 
         */
        protected DocumentType document;

        /**
         * Имя
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFirstName()
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Фамилия
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLastName()
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Отчество
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMiddleName()
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * СНИЛС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSnils() {
            return snils;
        }

        /**
         * Sets the value of the snils property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSnils()
         */
        public void setSnils(String value) {
            this.snils = value;
        }

        /**
         * Документ, удостоверяющий личность
         * 
         * @return
         *     possible object is
         *     {@link DocumentType }
         *     
         */
        public DocumentType getDocument() {
            return document;
        }

        /**
         * Sets the value of the document property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentType }
         *     
         * @see #getDocument()
         */
        public void setDocument(DocumentType value) {
            this.document = value;
        }

    }

}
