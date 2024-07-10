
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Работа в КПР
 * 
 * <p>Java class for WorkPlanType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkPlanType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkPlanIdentityType">
 *       <sequence>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="Financing" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkFinancingType"/>
 *         <element name="SpecificCost" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType" minOccurs="0"/>
 *         <element name="MaximumCost" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkPlanType", propOrder = {
    "oktmo",
    "financing",
    "specificCost",
    "maximumCost"
})
@XmlSeeAlso({
    ExportWorkPlanType.class
})
public class WorkPlanType
    extends WorkPlanIdentityType
{

    /**
     * Код ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected OKTMORefType oktmo;
    /**
     * Финансирование работы в программе/плане
     * 
     */
    @XmlElement(name = "Financing", required = true)
    protected WorkFinancingType financing;
    /**
     * Удельная стоимость работы (с копейками). Заполняется только для РАПКР/МАПКР
     * 
     */
    @XmlElement(name = "SpecificCost")
    protected BigDecimal specificCost;
    /**
     * Предельная стоимость работы (с копейками). Заполняется только для РАПКР/МАПКР
     * 
     */
    @XmlElement(name = "MaximumCost")
    protected BigDecimal maximumCost;

    /**
     * Код ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Финансирование работы в программе/плане
     * 
     * @return
     *     possible object is
     *     {@link WorkFinancingType }
     *     
     */
    public WorkFinancingType getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkFinancingType }
     *     
     * @see #getFinancing()
     */
    public void setFinancing(WorkFinancingType value) {
        this.financing = value;
    }

    /**
     * Удельная стоимость работы (с копейками). Заполняется только для РАПКР/МАПКР
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecificCost() {
        return specificCost;
    }

    /**
     * Sets the value of the specificCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSpecificCost()
     */
    public void setSpecificCost(BigDecimal value) {
        this.specificCost = value;
    }

    /**
     * Предельная стоимость работы (с копейками). Заполняется только для РАПКР/МАПКР
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumCost() {
        return maximumCost;
    }

    /**
     * Sets the value of the maximumCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMaximumCost()
     */
    public void setMaximumCost(BigDecimal value) {
        this.maximumCost = value;
    }

}
