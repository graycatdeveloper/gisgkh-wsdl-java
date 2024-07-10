
package ru.gosuslugi.dom.schema.integration.appeals;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Заявитель
 * 
 * <p>Java class for ApplicantType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApplicantType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <choice>
 *             <element name="Person">
 *               <complexType>
 *                 <complexContent>
 *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}PersonType">
 *                   </extension>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *             <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           </choice>
 *           <element name="PostAddress" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String100Type" minOccurs="0"/>
 *           <element name="ApartmentNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}PremisesNumType" minOccurs="0"/>
 *           <element name="Email" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String100Type" minOccurs="0"/>
 *           <element name="PhoneNumber" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *         <element name="HCS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicantType", propOrder = {
    "person",
    "org",
    "postAddress",
    "apartmentNumber",
    "email",
    "phoneNumber",
    "hcs"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.appeals.ExportAppealResultType.ApplicantInfo.class,
    ru.gosuslugi.dom.schema.integration.appeals.ExportAppealResultType.NeighbourInfo.class
})
public class ApplicantType {

    /**
     * Физическое лицо
     * 
     */
    @XmlElement(name = "Person")
    protected ApplicantType.Person person;
    /**
     * Ссылка на реестр организаций
     * 
     */
    @XmlElement(name = "Org")
    protected RegOrgType org;
    /**
     * Почтовый адрес
     * 
     */
    @XmlElement(name = "PostAddress")
    protected String postAddress;
    /**
     * Номер помещения
     * 
     */
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    /**
     * Электронная почта
     * 
     */
    @XmlElement(name = "Email")
    protected String email;
    /**
     * Номер телефона
     * 
     */
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    /**
     * Обращение сформировано ГИС ЖКХ
     * 
     */
    @XmlElement(name = "HCS")
    protected Boolean hcs;

    /**
     * Физическое лицо
     * 
     * @return
     *     possible object is
     *     {@link ApplicantType.Person }
     *     
     */
    public ApplicantType.Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantType.Person }
     *     
     * @see #getPerson()
     */
    public void setPerson(ApplicantType.Person value) {
        this.person = value;
    }

    /**
     * Ссылка на реестр организаций
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrg()
     */
    public void setOrg(RegOrgType value) {
        this.org = value;
    }

    /**
     * Почтовый адрес
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * Sets the value of the postAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPostAddress()
     */
    public void setPostAddress(String value) {
        this.postAddress = value;
    }

    /**
     * Номер помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApartmentNumber()
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Электронная почта
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

    /**
     * Номер телефона
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPhoneNumber()
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Обращение сформировано ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHCS() {
        return hcs;
    }

    /**
     * Sets the value of the hcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHCS()
     */
    public void setHCS(Boolean value) {
        this.hcs = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}PersonType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Person
        extends PersonType
    {


    }

}
