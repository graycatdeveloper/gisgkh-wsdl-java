
package ru.gosuslugi.dom.schema.integration.tech_conn;

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
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Составной тип. Сведения о представителе заявителя
 * 
 * <p>Java class for RepresentativeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RepresentativeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <choice>
 *               <element name="Person">
 *                 <complexType>
 *                   <complexContent>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                       <sequence>
 *                         <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
 *                         <element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                         <element name="Gender" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}GenderType"/>
 *                         <element name="RegistrationAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
 *                         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
 *                         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
 *                       </sequence>
 *                     </restriction>
 *                   </complexContent>
 *                 </complexType>
 *               </element>
 *               <element name="Businessman">
 *                 <complexType>
 *                   <complexContent>
 *                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                       <sequence>
 *                         <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
 *                         <element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                         <element name="Gender" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}GenderType"/>
 *                         <element name="RegistrationAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
 *                         <element name="PostAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType" minOccurs="0"/>
 *                         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
 *                         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
 *                       </sequence>
 *                     </restriction>
 *                   </complexContent>
 *                 </complexType>
 *               </element>
 *             </choice>
 *             <element name="Document">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PrimaryIdentityDocument"/>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *           </sequence>
 *           <element name="Employee">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="FullName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
 *                     <element name="ShortName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type" minOccurs="0"/>
 *                     <element name="INN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
 *                     <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
 *                     <element name="KPP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPPType"/>
 *                     <element name="LegalEntityType" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *                     <element name="LegalAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
 *                     <element name="PostAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
 *                     <element name="ContactPerson" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
 *                               <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
 *                               <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="PowerOfAttorneyDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SignedPowerOfAttorneyDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentativeType", propOrder = {
    "person",
    "businessman",
    "document",
    "employee",
    "powerOfAttorneyDocument",
    "signedPowerOfAttorneyDocument"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.tech_conn.AgreementApplicationType.ApplicationVersion.Representative.class
})
public class RepresentativeType {

    /**
     * Физичечское лицо
     * 
     */
    @XmlElement(name = "Person")
    protected RepresentativeType.Person person;
    /**
     * Индивидуальный предприниматель
     * 
     */
    @XmlElement(name = "Businessman")
    protected RepresentativeType.Businessman businessman;
    /**
     * Сведения о документе, удостоверяющем личность заявителя
     * 
     */
    @XmlElement(name = "Document")
    protected RepresentativeType.Document document;
    /**
     * Юридическое лицо
     * 
     */
    @XmlElement(name = "Employee")
    protected RepresentativeType.Employee employee;
    /**
     * Документ, подтверждающий полномочия представителя
     * 
     */
    @XmlElement(name = "PowerOfAttorneyDocument")
    protected List<AttachmentType> powerOfAttorneyDocument;
    /**
     * Документ, подтверждающий полномочия представителя, с открепленной (detached) подписью
     * 
     */
    @XmlElement(name = "SignedPowerOfAttorneyDocument")
    protected List<SignedAttachmentType> signedPowerOfAttorneyDocument;

    /**
     * Физичечское лицо
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType.Person }
     *     
     */
    public RepresentativeType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType.Person }
     *     
     * @see #getPerson()
     */
    public void setPerson(RepresentativeType.Person value) {
        this.person = value;
    }

    /**
     * Индивидуальный предприниматель
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType.Businessman }
     *     
     */
    public RepresentativeType.Businessman getBusinessman() {
        return businessman;
    }

    /**
     * Sets the value of the businessman property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType.Businessman }
     *     
     * @see #getBusinessman()
     */
    public void setBusinessman(RepresentativeType.Businessman value) {
        this.businessman = value;
    }

    /**
     * Сведения о документе, удостоверяющем личность заявителя
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType.Document }
     *     
     */
    public RepresentativeType.Document getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType.Document }
     *     
     * @see #getDocument()
     */
    public void setDocument(RepresentativeType.Document value) {
        this.document = value;
    }

    /**
     * Юридическое лицо
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType.Employee }
     *     
     */
    public RepresentativeType.Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType.Employee }
     *     
     * @see #getEmployee()
     */
    public void setEmployee(RepresentativeType.Employee value) {
        this.employee = value;
    }

    /**
     * Документ, подтверждающий полномочия представителя
     * 
     * Gets the value of the powerOfAttorneyDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the powerOfAttorneyDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPowerOfAttorneyDocument().add(newItem);
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
     *     The value of the powerOfAttorneyDocument property.
     */
    public List<AttachmentType> getPowerOfAttorneyDocument() {
        if (powerOfAttorneyDocument == null) {
            powerOfAttorneyDocument = new ArrayList<>();
        }
        return this.powerOfAttorneyDocument;
    }

    /**
     * Документ, подтверждающий полномочия представителя, с открепленной (detached) подписью
     * 
     * Gets the value of the signedPowerOfAttorneyDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedPowerOfAttorneyDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignedPowerOfAttorneyDocument().add(newItem);
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
     *     The value of the signedPowerOfAttorneyDocument property.
     */
    public List<SignedAttachmentType> getSignedPowerOfAttorneyDocument() {
        if (signedPowerOfAttorneyDocument == null) {
            signedPowerOfAttorneyDocument = new ArrayList<>();
        }
        return this.signedPowerOfAttorneyDocument;
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
     *         <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
     *         <element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Gender" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}GenderType"/>
     *         <element name="RegistrationAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
     *         <element name="PostAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType" minOccurs="0"/>
     *         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
     *         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
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
        "lastName",
        "firstName",
        "middleName",
        "birthDate",
        "gender",
        "registrationAddress",
        "postAddress",
        "phone",
        "email"
    })
    public static class Businessman {

        /**
         * Фамилия
         * 
         */
        @XmlElement(name = "LastName", required = true)
        protected String lastName;
        /**
         * Имя
         * 
         */
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        /**
         * Отчество
         * 
         */
        @XmlElement(name = "MiddleName")
        protected String middleName;
        /**
         * Дата рождения
         * 
         */
        @XmlElement(name = "BirthDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        /**
         * Пол
         * 
         */
        @XmlElement(name = "Gender", required = true)
        @XmlSchemaType(name = "string")
        protected GenderType gender;
        /**
         * Адрес регистрации по месту жительства
         * 
         */
        @XmlElement(name = "RegistrationAddress", required = true)
        protected AddressType registrationAddress;
        /**
         * Почтовый адрес
         * 
         */
        @XmlElement(name = "PostAddress")
        protected AddressType postAddress;
        /**
         * Контактный телефон
         * 
         */
        @XmlElement(name = "Phone", required = true)
        protected String phone;
        /**
         * Контактный адрес электронной почты
         * 
         */
        @XmlElement(name = "Email")
        protected String email;

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
         * Дата рождения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getBirthDate()
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Пол
         * 
         * @return
         *     possible object is
         *     {@link GenderType }
         *     
         */
        public GenderType getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenderType }
         *     
         * @see #getGender()
         */
        public void setGender(GenderType value) {
            this.gender = value;
        }

        /**
         * Адрес регистрации по месту жительства
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getRegistrationAddress() {
            return registrationAddress;
        }

        /**
         * Sets the value of the registrationAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         * @see #getRegistrationAddress()
         */
        public void setRegistrationAddress(AddressType value) {
            this.registrationAddress = value;
        }

        /**
         * Почтовый адрес
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getPostAddress() {
            return postAddress;
        }

        /**
         * Sets the value of the postAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         * @see #getPostAddress()
         */
        public void setPostAddress(AddressType value) {
            this.postAddress = value;
        }

        /**
         * Контактный телефон
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPhone()
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Контактный адрес электронной почты
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getEmail()
         */
        public void setEmail(String value) {
            this.email = value;
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
     *         <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PrimaryIdentityDocument"/>
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
        "documentType",
        "series",
        "number",
        "issueDate",
        "issuer",
        "issuerCode"
    })
    public static class Document {

        /**
         * Вид документа. Справочник "Вид документа, удостоверяющего личность" ЕСНСИ
         * 
         */
        @XmlElement(name = "DocumentType", required = true)
        protected EsnsiItemType documentType;
        /**
         * Серия документ
         * 
         */
        @XmlElement(name = "Series")
        protected String series;
        /**
         * Номер документа
         * 
         */
        @XmlElement(name = "Number", required = true)
        protected String number;
        /**
         * Дата выдачи документа
         * 
         */
        @XmlElement(name = "IssueDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar issueDate;
        /**
         * Кем выдан
         * 
         */
        @XmlElement(name = "Issuer", required = true)
        protected String issuer;
        /**
         * Код подразделения
         * 
         */
        @XmlElement(name = "IssuerCode")
        protected String issuerCode;

        /**
         * Вид документа. Справочник "Вид документа, удостоверяющего личность" ЕСНСИ
         * 
         * @return
         *     possible object is
         *     {@link EsnsiItemType }
         *     
         */
        public EsnsiItemType getDocumentType() {
            return documentType;
        }

        /**
         * Sets the value of the documentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link EsnsiItemType }
         *     
         * @see #getDocumentType()
         */
        public void setDocumentType(EsnsiItemType value) {
            this.documentType = value;
        }

        /**
         * Серия документ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeries() {
            return series;
        }

        /**
         * Sets the value of the series property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSeries()
         */
        public void setSeries(String value) {
            this.series = value;
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
         * Дата выдачи документа
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getIssueDate() {
            return issueDate;
        }

        /**
         * Sets the value of the issueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getIssueDate()
         */
        public void setIssueDate(XMLGregorianCalendar value) {
            this.issueDate = value;
        }

        /**
         * Кем выдан
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuer() {
            return issuer;
        }

        /**
         * Sets the value of the issuer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getIssuer()
         */
        public void setIssuer(String value) {
            this.issuer = value;
        }

        /**
         * Код подразделения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuerCode() {
            return issuerCode;
        }

        /**
         * Sets the value of the issuerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getIssuerCode()
         */
        public void setIssuerCode(String value) {
            this.issuerCode = value;
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
     *         <element name="FullName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
     *         <element name="ShortName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type" minOccurs="0"/>
     *         <element name="INN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
     *         <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
     *         <element name="KPP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPPType"/>
     *         <element name="LegalEntityType" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
     *         <element name="LegalAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
     *         <element name="PostAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
     *         <element name="ContactPerson" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
     *                   <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
     *                   <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "fullName",
        "shortName",
        "inn",
        "ogrn",
        "kpp",
        "legalEntityType",
        "legalAddress",
        "postAddress",
        "contactPerson"
    })
    public static class Employee {

        /**
         * Полное наименование
         * 
         */
        @XmlElement(name = "FullName", required = true)
        protected String fullName;
        /**
         * Сокращенное наименование
         * 
         */
        @XmlElement(name = "ShortName")
        protected String shortName;
        /**
         * ИНН
         * 
         */
        @XmlElement(name = "INN", required = true)
        protected String inn;
        /**
         * ОГРН
         * 
         */
        @XmlElement(name = "OGRN", required = true)
        protected String ogrn;
        /**
         * КПП
         * 
         */
        @XmlElement(name = "KPP", required = true)
        protected String kpp;
        /**
         * Организационно правовая форма. Справочник "ОКОПФ" ЕСНСИ
         * 
         */
        @XmlElement(name = "LegalEntityType", required = true)
        protected EsnsiItemType legalEntityType;
        /**
         * Адрес регистрации
         * 
         */
        @XmlElement(name = "LegalAddress", required = true)
        protected AddressType legalAddress;
        /**
         * Почтовый адрес
         * 
         */
        @XmlElement(name = "PostAddress", required = true)
        protected AddressType postAddress;
        /**
         * Сведения о контактном лице организации
         * 
         */
        @XmlElement(name = "ContactPerson")
        protected RepresentativeType.Employee.ContactPerson contactPerson;

        /**
         * Полное наименование
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFullName()
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Сокращенное наименование
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getShortName()
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * ИНН
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getINN()
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * ОГРН
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOGRN() {
            return ogrn;
        }

        /**
         * Sets the value of the ogrn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOGRN()
         */
        public void setOGRN(String value) {
            this.ogrn = value;
        }

        /**
         * КПП
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKPP() {
            return kpp;
        }

        /**
         * Sets the value of the kpp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getKPP()
         */
        public void setKPP(String value) {
            this.kpp = value;
        }

        /**
         * Организационно правовая форма. Справочник "ОКОПФ" ЕСНСИ
         * 
         * @return
         *     possible object is
         *     {@link EsnsiItemType }
         *     
         */
        public EsnsiItemType getLegalEntityType() {
            return legalEntityType;
        }

        /**
         * Sets the value of the legalEntityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link EsnsiItemType }
         *     
         * @see #getLegalEntityType()
         */
        public void setLegalEntityType(EsnsiItemType value) {
            this.legalEntityType = value;
        }

        /**
         * Адрес регистрации
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getLegalAddress() {
            return legalAddress;
        }

        /**
         * Sets the value of the legalAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         * @see #getLegalAddress()
         */
        public void setLegalAddress(AddressType value) {
            this.legalAddress = value;
        }

        /**
         * Почтовый адрес
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getPostAddress() {
            return postAddress;
        }

        /**
         * Sets the value of the postAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         * @see #getPostAddress()
         */
        public void setPostAddress(AddressType value) {
            this.postAddress = value;
        }

        /**
         * Сведения о контактном лице организации
         * 
         * @return
         *     possible object is
         *     {@link RepresentativeType.Employee.ContactPerson }
         *     
         */
        public RepresentativeType.Employee.ContactPerson getContactPerson() {
            return contactPerson;
        }

        /**
         * Sets the value of the contactPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link RepresentativeType.Employee.ContactPerson }
         *     
         * @see #getContactPerson()
         */
        public void setContactPerson(RepresentativeType.Employee.ContactPerson value) {
            this.contactPerson = value;
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
         *         <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
         *         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
         *         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
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
            "lastName",
            "firstName",
            "middleName",
            "phone",
            "email"
        })
        public static class ContactPerson {

            /**
             * Фамилия
             * 
             */
            @XmlElement(name = "LastName", required = true)
            protected String lastName;
            /**
             * Имя
             * 
             */
            @XmlElement(name = "FirstName", required = true)
            protected String firstName;
            /**
             * Отчество
             * 
             */
            @XmlElement(name = "MiddleName")
            protected String middleName;
            /**
             * Контактный телефон
             * 
             */
            @XmlElement(name = "Phone", required = true)
            protected String phone;
            /**
             * Контактный адрес электронной почты
             * 
             */
            @XmlElement(name = "Email")
            protected String email;

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
             * Контактный телефон
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPhone()
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Контактный адрес электронной почты
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getEmail()
             */
            public void setEmail(String value) {
                this.email = value;
            }

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
     *         <group ref="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhysicalPersonQualifiedName-ModelGroup"/>
     *         <element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Gender" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}GenderType"/>
     *         <element name="RegistrationAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
     *         <element name="Phone" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}PhoneNumberRFType"/>
     *         <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EmailAddressType" minOccurs="0"/>
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
        "lastName",
        "firstName",
        "middleName",
        "birthDate",
        "gender",
        "registrationAddress",
        "phone",
        "email"
    })
    public static class Person {

        /**
         * Фамилия
         * 
         */
        @XmlElement(name = "LastName", required = true)
        protected String lastName;
        /**
         * Имя
         * 
         */
        @XmlElement(name = "FirstName", required = true)
        protected String firstName;
        /**
         * Отчество
         * 
         */
        @XmlElement(name = "MiddleName")
        protected String middleName;
        /**
         * Дата рождения
         * 
         */
        @XmlElement(name = "BirthDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        /**
         * Пол
         * 
         */
        @XmlElement(name = "Gender", required = true)
        @XmlSchemaType(name = "string")
        protected GenderType gender;
        /**
         * Адрес регистрации по месту жительства
         * 
         */
        @XmlElement(name = "RegistrationAddress", required = true)
        protected AddressType registrationAddress;
        /**
         * Контактный телефон
         * 
         */
        @XmlElement(name = "Phone", required = true)
        protected String phone;
        /**
         * Контактный адрес электронной почты
         * 
         */
        @XmlElement(name = "Email")
        protected String email;

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
         * Дата рождения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getBirthDate()
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Пол
         * 
         * @return
         *     possible object is
         *     {@link GenderType }
         *     
         */
        public GenderType getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link GenderType }
         *     
         * @see #getGender()
         */
        public void setGender(GenderType value) {
            this.gender = value;
        }

        /**
         * Адрес регистрации по месту жительства
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getRegistrationAddress() {
            return registrationAddress;
        }

        /**
         * Sets the value of the registrationAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         * @see #getRegistrationAddress()
         */
        public void setRegistrationAddress(AddressType value) {
            this.registrationAddress = value;
        }

        /**
         * Контактный телефон
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPhone()
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Контактный адрес электронной почты
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getEmail()
         */
        public void setEmail(String value) {
            this.email = value;
        }

    }

}
