
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Финансирование работы капитального ремонта
 * 
 * <p>Java class for WorkFinancingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkFinancingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Fund" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveShortType"/>
 *         <element name="RegionBudget" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveShortType"/>
 *         <element name="MunicipalBudget" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveShortType"/>
 *         <element name="Owners" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveShortType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkFinancingType", propOrder = {
    "fund",
    "regionBudget",
    "municipalBudget",
    "owners"
})
public class WorkFinancingType {

    /**
     * За счет средств Фонда содействия реформированию ЖКХ (с копейками)
     * 
     */
    @XmlElement(name = "Fund", required = true)
    protected BigDecimal fund;
    /**
     * За счет средств бюджета субъекта РФ (с копейками)
     * 
     */
    @XmlElement(name = "RegionBudget", required = true)
    protected BigDecimal regionBudget;
    /**
     * За счет средств местного бюджета (с копейками)
     * 
     */
    @XmlElement(name = "MunicipalBudget", required = true)
    protected BigDecimal municipalBudget;
    /**
     * За счет средств собственников (с копейками)
     * 
     */
    @XmlElement(name = "Owners", required = true)
    protected BigDecimal owners;

    /**
     * За счет средств Фонда содействия реформированию ЖКХ (с копейками)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFund() {
        return fund;
    }

    /**
     * Sets the value of the fund property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getFund()
     */
    public void setFund(BigDecimal value) {
        this.fund = value;
    }

    /**
     * За счет средств бюджета субъекта РФ (с копейками)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegionBudget() {
        return regionBudget;
    }

    /**
     * Sets the value of the regionBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRegionBudget()
     */
    public void setRegionBudget(BigDecimal value) {
        this.regionBudget = value;
    }

    /**
     * За счет средств местного бюджета (с копейками)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMunicipalBudget() {
        return municipalBudget;
    }

    /**
     * Sets the value of the municipalBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMunicipalBudget()
     */
    public void setMunicipalBudget(BigDecimal value) {
        this.municipalBudget = value;
    }

    /**
     * За счет средств собственников (с копейками)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwners() {
        return owners;
    }

    /**
     * Sets the value of the owners property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOwners()
     */
    public void setOwners(BigDecimal value) {
        this.owners = value;
    }

}
