
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegOrgVersionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RegOrgVersionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegOrgVersionType", propOrder = {
    "orgVersionGUID"
})
public class RegOrgVersionType {

    /**
     * Идентификатор версии записи в реестре организаций
     * 
     */
    @XmlElement(required = true)
    protected String orgVersionGUID;

    /**
     * Идентификатор версии записи в реестре организаций
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgVersionGUID() {
        return orgVersionGUID;
    }

    /**
     * Sets the value of the orgVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgVersionGUID()
     */
    public void setOrgVersionGUID(String value) {
        this.orgVersionGUID = value;
    }

}
