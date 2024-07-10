
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация о заявителе, указываемая в параметрах запроса
 * 
 * <p>Java class for ApplicantInfoRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApplicantInfoRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="firstName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType" minOccurs="0"/>
 *         <element name="lastName" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType" minOccurs="0"/>
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
@XmlType(name = "ApplicantInfoRequestType", propOrder = {
    "firstName",
    "lastName",
    "middleName",
    "snils",
    "document"
})
public class ApplicantInfoRequestType {

    /**
     * Имя
     * 
     */
    protected String firstName;
    /**
     * Фамилия
     * 
     */
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
     * Документ, удостоверяющий личность заявителя
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
     * Документ, удостоверяющий личность заявителя
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
