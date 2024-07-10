
package ru.gosuslugi.dom.schema.integration.appeals;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Информация об исполнителе обращения
 * 
 * <p>Java class for AnswererInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnswererInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswererInfoType", propOrder = {
    "organization"
})
public class AnswererInfoType {

    /**
     * Организация - исполнитель обращения
     * 
     */
    @XmlElement(name = "Organization", required = true)
    protected RegOrgType organization;

    /**
     * Организация - исполнитель обращения
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(RegOrgType value) {
        this.organization = value;
    }

}
