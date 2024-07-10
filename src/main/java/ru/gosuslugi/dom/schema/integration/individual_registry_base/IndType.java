
package ru.gosuslugi.dom.schema.integration.individual_registry_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Физическое лицо
 * 
 * <p>Java class for IndType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IndType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}Sex" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}DateOfBirth" minOccurs="0"/>
 *         <choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}ID"/>
 *         </choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}PlaceBirth" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndType", propOrder = {
    "sex",
    "dateOfBirth",
    "snils",
    "id",
    "placeBirth"
})
public class IndType
    extends FIOType
{

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
    @XmlElement(name = "SNILS")
    protected String snils;
    /**
     * Удостоверение личности
     * 
     */
    @XmlElement(name = "ID")
    protected ID id;
    /**
     * Место рождения
     * 
     */
    @XmlElement(name = "PlaceBirth")
    protected String placeBirth;

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
