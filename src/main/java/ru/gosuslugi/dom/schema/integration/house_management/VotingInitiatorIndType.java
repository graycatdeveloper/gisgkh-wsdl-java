
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;


/**
 * Инициатор - физическое лицо
 * 
 * <p>Java class for VotingInitiatorIndType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VotingInitiatorIndType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType">
 *       <sequence>
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
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS" minOccurs="0"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingInitiatorIndID" minOccurs="0"/>
 *         </sequence>
 *         <element name="PlaceBirth" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="255"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VotingInitiatorIndType", propOrder = {
    "sex",
    "dateOfBirth",
    "snils",
    "votingInitiatorIndID",
    "placeBirth"
})
public class VotingInitiatorIndType
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
    @XmlElement(name = "SNILS", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
    protected String snils;
    /**
     * Удостоверение личности
     * 
     */
    @XmlElement(name = "VotingInitiatorIndID")
    protected VotingInitiatorIndID votingInitiatorIndID;
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
     *     {@link VotingInitiatorIndID }
     *     
     */
    public VotingInitiatorIndID getVotingInitiatorIndID() {
        return votingInitiatorIndID;
    }

    /**
     * Sets the value of the votingInitiatorIndID property.
     * 
     * @param value
     *     allowed object is
     *     {@link VotingInitiatorIndID }
     *     
     * @see #getVotingInitiatorIndID()
     */
    public void setVotingInitiatorIndID(VotingInitiatorIndID value) {
        this.votingInitiatorIndID = value;
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
