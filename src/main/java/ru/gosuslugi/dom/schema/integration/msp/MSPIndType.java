
package ru.gosuslugi.dom.schema.integration.msp;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.ID;


/**
 * Физическое лицо
 * 
 * <p>Java class for MSPIndType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MSPIndType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType">
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS" minOccurs="0"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}ID" minOccurs="0"/>
 *         </sequence>
 *         <element name="Sex" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Male"/>
 *               <enumeration value="Female"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}DateOfBirth" minOccurs="0"/>
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
@XmlType(name = "MSPIndType", propOrder = {
    "snils",
    "id",
    "sex",
    "dateOfBirth",
    "placeBirth"
})
@XmlSeeAlso({
    CitizenSubsidyOverviewType.class,
    CitizenCompensationOverviewType.class
})
public class MSPIndType
    extends FIOType
{

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
     * Пол (Male- мужской, Female-женский)
     * 
     */
    @XmlElement(name = "Sex")
    protected String sex;
    /**
     * Дата рождения
     * 
     */
    @XmlElement(name = "DateOfBirth", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    /**
     * Место рождения
     * 
     */
    @XmlElement(name = "PlaceBirth", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
    protected String placeBirth;

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
     * Пол (Male- мужской, Female-женский)
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
