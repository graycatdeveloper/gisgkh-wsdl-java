
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об организации
 * 
 * <p>Java class for OrganizationInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganizationInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="orgRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationInfoType", propOrder = {
    "orgRootGUID",
    "name",
    "tel"
})
public class OrganizationInfoType {

    /**
     * Корневой идентификатор организации (в Реестре организаций ГИС ЖКХ)
     * 
     */
    @XmlElement(required = true)
    protected String orgRootGUID;
    /**
     * Наименование организации
     * 
     */
    @XmlElement(required = true)
    protected String name;
    /**
     * Телефон организации
     * 
     */
    protected String tel;

    /**
     * Корневой идентификатор организации (в Реестре организаций ГИС ЖКХ)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRootGUID() {
        return orgRootGUID;
    }

    /**
     * Sets the value of the orgRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgRootGUID()
     */
    public void setOrgRootGUID(String value) {
        this.orgRootGUID = value;
    }

    /**
     * Наименование организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Телефон организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTel()
     */
    public void setTel(String value) {
        this.tel = value;
    }

}
