
package ru.gosuslugi.dom.schema.integration.organizations_registry_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Организация и версия организации в реестре организаций
 * 
 * <p>Java class for RegOrgRootAndVersionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RegOrgRootAndVersionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegOrgRootAndVersionType", propOrder = {
    "orgVersionGUID",
    "orgRootEntityGUID"
})
public class RegOrgRootAndVersionType {

    /**
     * Идентификатор версии записи в реестре организаций
     * 
     */
    protected String orgVersionGUID;
    /**
     * Идентификатор корневой сущности организации в реестре организаций
     * 
     */
    protected String orgRootEntityGUID;

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
