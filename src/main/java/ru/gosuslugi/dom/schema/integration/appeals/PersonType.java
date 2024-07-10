
package ru.gosuslugi.dom.schema.integration.appeals;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Физическое лицо - заявитель обращения
 * 
 * <p>Java class for PersonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PersonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Surname" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String100Type"/>
 *         <element name="FirstName" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String100Type"/>
 *         <element name="Patronymic" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String100Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonType", propOrder = {
    "surname",
    "firstName",
    "patronymic"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.appeals.ApplicantType.Person.class
})
public class PersonType {

    /**
     * Фамилия
     * 
     */
    @XmlElement(name = "Surname", required = true)
    protected String surname;
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
    @XmlElement(name = "Patronymic")
    protected String patronymic;

    /**
     * Фамилия
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSurname()
     */
    public void setSurname(String value) {
        this.surname = value;
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
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPatronymic()
     */
    public void setPatronymic(String value) {
        this.patronymic = value;
    }

}
