
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Результат экспорта сведений о делегированных правах
 * 
 * <p>Java class for exportDelegatedAccessType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDelegatedAccessType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ParentOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}orgPPAGUID"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrg"/>
 *         <element name="AccessRequest" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}AccessRequest" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDelegatedAccessType", propOrder = {
    "parentOrg",
    "orgPPAGUID",
    "regOrg",
    "accessRequest"
})
public class ExportDelegatedAccessType {

    /**
     * Информация о головной организации (для обособленных подразделений)
     * 
     */
    @XmlElement(name = "ParentOrg")
    protected RegOrgType parentOrg;
    /**
     * Идентификатор зарегистрированной организации
     * 
     */
    @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String orgPPAGUID;
    /**
     * Организация в реестре организаций
     * 
     */
    @XmlElement(name = "RegOrg", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
    protected RegOrgType regOrg;
    /**
     * Заявка на доступ
     * 
     */
    @XmlElement(name = "AccessRequest")
    protected List<AccessRequest> accessRequest;

    /**
     * Информация о головной организации (для обособленных подразделений)
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getParentOrg() {
        return parentOrg;
    }

    /**
     * Sets the value of the parentOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getParentOrg()
     */
    public void setParentOrg(RegOrgType value) {
        this.parentOrg = value;
    }

    /**
     * Идентификатор зарегистрированной организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
    }

    /**
     * Организация в реестре организаций
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getRegOrg() {
        return regOrg;
    }

    /**
     * Sets the value of the regOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getRegOrg()
     */
    public void setRegOrg(RegOrgType value) {
        this.regOrg = value;
    }

    /**
     * Заявка на доступ
     * 
     * Gets the value of the accessRequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessRequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccessRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessRequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the accessRequest property.
     */
    public List<AccessRequest> getAccessRequest() {
        if (accessRequest == null) {
            accessRequest = new ArrayList<>();
        }
        return this.accessRequest;
    }

}
