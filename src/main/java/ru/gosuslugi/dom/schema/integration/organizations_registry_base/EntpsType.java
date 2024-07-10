
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Индивидуальный предприниматель
 * 
 * <p>Java class for EntpsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntpsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Sex" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1"/>
 *               <enumeration value="M"/>
 *               <enumeration value="F"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
 *         <element name="StateRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntpsType", propOrder = {
    "surname",
    "firstName",
    "patronymic",
    "sex",
    "ogrnip",
    "stateRegistrationDate",
    "inn"
})
public class EntpsType {

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
     * Пол (M- мужской, F-женский)
     * 
     */
    @XmlElement(name = "Sex")
    protected String sex;
    /**
     * ОГРН
     * 
     */
    @XmlElement(name = "OGRNIP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
    protected String ogrnip;
    /**
     * Дата государственной регистрации
     * 
     */
    @XmlElement(name = "StateRegistrationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stateRegistrationDate;
    /**
     * ИНН
     * 
     */
    @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
    protected String inn;

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
     * Пол (M- мужской, F-женский)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSex()
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * ОГРН
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRNIP() {
        return ogrnip;
    }

    /**
     * Sets the value of the ogrnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOGRNIP()
     */
    public void setOGRNIP(String value) {
        this.ogrnip = value;
    }

    /**
     * Дата государственной регистрации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateRegistrationDate() {
        return stateRegistrationDate;
    }

    /**
     * Sets the value of the stateRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStateRegistrationDate()
     */
    public void setStateRegistrationDate(XMLGregorianCalendar value) {
        this.stateRegistrationDate = value;
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

}
