
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Экспортируемое решение о выборе способа формирования фонда капитального ремонта
 * 
 * <p>Java class for exportDecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDecisionType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionType">
 *       <sequence>
 *         <element name="DecisionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusType"/>
 *         <element name="AccountSpecialGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="DecisionsOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDecisionType", propOrder = {
    "decisionGuid",
    "status",
    "accountSpecialGuid",
    "decisionsOrganization"
})
public class ExportDecisionType
    extends DecisionType
{

    /**
     * Идентификатор решения о выборе способа формирования фонда капитального ремонта
     * 
     */
    @XmlElement(name = "DecisionGuid", required = true)
    protected String decisionGuid;
    /**
     * Статус решения
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;
    /**
     * Идентификатор  специального счета
     * 
     */
    @XmlElement(name = "AccountSpecialGuid")
    protected String accountSpecialGuid;
    /**
     * Организация, разместившая решение
     * 
     */
    @XmlElement(name = "DecisionsOrganization", required = true)
    protected RegOrgType decisionsOrganization;

    /**
     * Идентификатор решения о выборе способа формирования фонда капитального ремонта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionGuid() {
        return decisionGuid;
    }

    /**
     * Sets the value of the decisionGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionGuid()
     */
    public void setDecisionGuid(String value) {
        this.decisionGuid = value;
    }

    /**
     * Статус решения
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Идентификатор  специального счета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSpecialGuid() {
        return accountSpecialGuid;
    }

    /**
     * Sets the value of the accountSpecialGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountSpecialGuid()
     */
    public void setAccountSpecialGuid(String value) {
        this.accountSpecialGuid = value;
    }

    /**
     * Организация, разместившая решение
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getDecisionsOrganization() {
        return decisionsOrganization;
    }

    /**
     * Sets the value of the decisionsOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getDecisionsOrganization()
     */
    public void setDecisionsOrganization(RegOrgType value) {
        this.decisionsOrganization = value;
    }

}
