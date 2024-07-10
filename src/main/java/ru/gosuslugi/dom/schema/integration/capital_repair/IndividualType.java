
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Общий тип для физического лица
 * 
 * <p>Java class for IndividualType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IndividualType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LastName" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type"/>
 *         <element name="FirstName" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type"/>
 *         <element name="Patronymic" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualType", propOrder = {
    "lastName",
    "firstName",
    "patronymic"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ContractType.Individual.class,
    ru.gosuslugi.dom.schema.integration.capital_repair.ShortExportContractType.Individual.class
})
public class IndividualType {

    /**
     * Фамилия физического лица
     * 
     */
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    /**
     * Имя физического лица
     * 
     */
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    /**
     * Отчество физического лица
     * 
     */
    @XmlElement(name = "Patronymic")
    protected String patronymic;

    /**
     * Фамилия физического лица
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
     * Имя физического лица
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
     * Отчество физического лица
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
