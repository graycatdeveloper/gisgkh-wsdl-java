
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.ID;


/**
 * Физическое лицо в ДРСО
 * 
 * <p>Java class for DRSOIndType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DRSOIndType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence minOccurs="0">
 *         <element name="Surname">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="FirstName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Patronymic" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="60"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
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
 *         <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}ID"/>
 *         </choice>
 *         <element name="PlaceBirth" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="255"/>
 *               <minLength value="1"/>
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
@XmlType(name = "DRSOIndType", propOrder = {
    "surname",
    "firstName",
    "patronymic",
    "sex",
    "dateOfBirth",
    "snils",
    "id",
    "placeBirth"
})
public class DRSOIndType {

    /**
     * Фамилия
     * 
     */
    @XmlElement(name = "Surname")
    protected String surname;
    /**
     * Имя
     * 
     */
    @XmlElement(name = "FirstName")
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
     * Дата рождения
     * 
     */
    @XmlElement(name = "DateOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    /**
     * СНИЛС
     * 
     */
    @XmlElement(name = "SNILS", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
    protected String snils;
    /**
     * Удостоверение личности
     * 
     */
    @XmlElement(name = "ID", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
    protected ID id;
    /**
     * Место рождения
     * 
     */
    @XmlElement(name = "PlaceBirth")
    protected String placeBirth;

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
     * Дата рождения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateOfBirth()
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * СНИЛС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSNILS()
     */
    public void setSNILS(String value) {
        this.snils = value;
    }

    /**
     * Удостоверение личности
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     * @see #getID()
     */
    public void setID(ID value) {
        this.id = value;
    }

    /**
     * Место рождения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceBirth() {
        return placeBirth;
    }

    /**
     * Sets the value of the placeBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlaceBirth()
     */
    public void setPlaceBirth(String value) {
        this.placeBirth = value;
    }

}
