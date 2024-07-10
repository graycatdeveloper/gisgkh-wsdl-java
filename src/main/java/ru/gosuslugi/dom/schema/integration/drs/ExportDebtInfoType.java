
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
 * Информация о задолженности, подтвержденной судебным актом для экспорта ГИС ЖКХ
 * 
 * <p>Java class for ExportDebtInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDebtInfoType">
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
 *                   <element name="debtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="actType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ActType" minOccurs="0"/>
 *                   <element name="cancelledAddress" type="{http://dom.gosuslugi.ru/schema/integration/drs/}CancelledAddressType" minOccurs="0"/>
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
@XmlType(name = "ExportDebtInfoType", propOrder = {
    "person",
    "document"
})
public class ExportDebtInfoType {

    /**
     * Информация о лице, в отношении которого имеется задолженность
     * 
     */
    @XmlElement(required = true)
    protected ExportDebtInfoType.Person person;
    /**
     * Документ, подтверждающий задолженность
     * 
     */
    protected List<ExportDebtInfoType.Document> document;

    /**
     * Информация о лице, в отношении которого имеется задолженность
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtInfoType.Person }
     *     
     */
    public ExportDebtInfoType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtInfoType.Person }
     *     
     * @see #getPerson()
     */
    public void setPerson(ExportDebtInfoType.Person value) {
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
     * {@link ExportDebtInfoType.Document }
     * </p>
     * 
     * 
     * @return
     *     The value of the document property.
     */
    public List<ExportDebtInfoType.Document> getDocument() {
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
     *         <element name="debtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="actType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ActType" minOccurs="0"/>
     *         <element name="cancelledAddress" type="{http://dom.gosuslugi.ru/schema/integration/drs/}CancelledAddressType" minOccurs="0"/>
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
        "attachment",
        "debtGUID",
        "actType",
        "cancelledAddress"
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
         * Идентификатор записи в реестре сведений о задолженности.
         * 
         * Выгружается, если запрос на экспорт отправлен по новой версии (14.0.0.0)
         * 
         */
        protected String debtGUID;
        /**
         * Информация о судебном акте.
         * 									Обязательно для заполнения, если тип документа = судебный акт (заполняется для новой версии ответа на запрос).
         * 
         * Выгружается, если запрос на экспорт отправлен по новой версии (14.0.0.0)
         * 
         */
        protected ActType actType;
        /**
         * Информация об аннулированном объекте жилищного фонда, указанном в записи в реестре сведений о задолженности.
         * 						Запролняется, если судебный акт ссылается на аннулированный в ГИС ЖКХ объект жилищного фонда.
         * 
         * Выгружается, если запрос на экспорт отправлен по новой версии (14.0.0.0)
         * 
         */
        protected CancelledAddressType cancelledAddress;

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

        /**
         * Идентификатор записи в реестре сведений о задолженности.
         * 
         * Выгружается, если запрос на экспорт отправлен по новой версии (14.0.0.0)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDebtGUID() {
            return debtGUID;
        }

        /**
         * Sets the value of the debtGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDebtGUID()
         */
        public void setDebtGUID(String value) {
            this.debtGUID = value;
        }

        /**
         * Информация о судебном акте.
         * 									Обязательно для заполнения, если тип документа = судебный акт (заполняется для новой версии ответа на запрос).
         * 
         * Выгружается, если запрос на экспорт отправлен по новой версии (14.0.0.0)
         * 
         * @return
         *     possible object is
         *     {@link ActType }
         *     
         */
        public ActType getActType() {
            return actType;
        }

        /**
         * Sets the value of the actType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActType }
         *     
         * @see #getActType()
         */
        public void setActType(ActType value) {
            this.actType = value;
        }

        /**
         * Информация об аннулированном объекте жилищного фонда, указанном в записи в реестре сведений о задолженности.
         * 						Запролняется, если судебный акт ссылается на аннулированный в ГИС ЖКХ объект жилищного фонда.
         * 
         * Выгружается, если запрос на экспорт отправлен по новой версии (14.0.0.0)
         * 
         * @return
         *     possible object is
         *     {@link CancelledAddressType }
         *     
         */
        public CancelledAddressType getCancelledAddress() {
            return cancelledAddress;
        }

        /**
         * Sets the value of the cancelledAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link CancelledAddressType }
         *     
         * @see #getCancelledAddress()
         */
        public void setCancelledAddress(CancelledAddressType value) {
            this.cancelledAddress = value;
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
