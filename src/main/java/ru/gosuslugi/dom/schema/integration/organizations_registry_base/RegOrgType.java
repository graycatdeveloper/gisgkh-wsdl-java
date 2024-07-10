
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegOrgType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RegOrgType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegOrgType", propOrder = {
    "orgRootEntityGUID"
})
public class RegOrgType {

    /**
     * Идентификатор корневой сущности организации в реестре организаций
     * 
     */
    @XmlElement(required = true)
    protected String orgRootEntityGUID;

    /**
     * Идентификатор корневой сущности организации в реестре организаций
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRootEntityGUID() {
        return orgRootEntityGUID;
    }

    /**
     * Sets the value of the orgRootEntityGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgRootEntityGUID()
     */
    public void setOrgRootEntityGUID(String value) {
        this.orgRootEntityGUID = value;
    }

}
