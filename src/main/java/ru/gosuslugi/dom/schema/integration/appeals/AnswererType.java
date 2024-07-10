
package ru.gosuslugi.dom.schema.integration.appeals;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Лицо-исполнитель обращения
 * 
 * <p>Java class for AnswererType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnswererType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Surname" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String256Type"/>
 *         <element name="FirstName" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String256Type"/>
 *         <element name="Patronymic" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String256Type" minOccurs="0"/>
 *         <element name="Post" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String255Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswererType", propOrder = {
    "surname",
    "firstName",
    "patronymic",
    "post"
})
public class AnswererType {

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
     * Должность
     * 
     */
    @XmlElement(name = "Post", required = true)
    protected String post;

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

    /**
     * Должность
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPost()
     */
    public void setPost(String value) {
        this.post = value;
    }

}
