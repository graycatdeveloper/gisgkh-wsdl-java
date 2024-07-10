
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о физическом лице.
 * 
 * <p>Java class for CitizenInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CitizenInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LastName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *         <element name="FirstName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *         <element name="MiddleName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *         <element name="OtherPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenInfoType", propOrder = {
    "lastName",
    "firstName",
    "middleName",
    "otherPersons"
})
public class CitizenInfoType {

    /**
     * Фамилия.
     * 
     */
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    /**
     * Имя.
     * 
     */
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    /**
     * Отчество.
     * 
     */
    @XmlElement(name = "MiddleName")
    protected String middleName;
    /**
     * Другие физические лица, в отношении которых проводится проверка
     * 
     */
    @XmlElement(name = "OtherPersons")
    protected String otherPersons;

    /**
     * Фамилия.
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
     * Имя.
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
     * Отчество.
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
     * Другие физические лица, в отношении которых проводится проверка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPersons() {
        return otherPersons;
    }

    /**
     * Sets the value of the otherPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOtherPersons()
     */
    public void setOtherPersons(String value) {
        this.otherPersons = value;
    }

}
