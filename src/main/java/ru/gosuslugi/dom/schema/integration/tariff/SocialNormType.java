
package ru.gosuslugi.dom.schema.integration.tariff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Социальная норма потребления электрической энергии
 * 
 * <p>Java class for SocialNormType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SocialNormType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tariff/}TariffCommonType">
 *       <sequence>
 *         <element name="Price" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}PriceType"/>
 *         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ElectricalEnergyUnitType"/>
 *         <choice>
 *           <element name="Differentiation" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}DifferentiationType" maxOccurs="1000"/>
 *           <element name="DifferentiationNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <choice>
 *           <element name="Coefficient" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CoefficientType" maxOccurs="1000"/>
 *           <element name="CoefficientsNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialNormType", propOrder = {
    "price",
    "unit",
    "differentiation",
    "differentiationNotSet",
    "coefficient",
    "coefficientsNotSet"
})
public class SocialNormType
    extends TariffCommonType
{

    /**
     * Величина
     * 
     */
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    /**
     * Код единицы измерения.  Доступные значения 245 – Киловатт-час, 243 Ватт-час
     * 
     */
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    /**
     * Критерии дифференциации социальной нормы потребления электрической энергии
     * 
     */
    @XmlElement(name = "Differentiation")
    protected List<DifferentiationType> differentiation;
    /**
     * Критерии дифференциации социальной нормы потребления электрической энергии не установлены
     * 
     */
    @XmlElement(name = "DifferentiationNotSet")
    protected Boolean differentiationNotSet;
    /**
     * Коэффициент тарифа
     * 
     */
    @XmlElement(name = "Coefficient")
    protected List<CoefficientType> coefficient;
    /**
     * Коэффициенты тарифа не установлены
     * 
     */
    @XmlElement(name = "CoefficientsNotSet")
    protected Boolean coefficientsNotSet;

    /**
     * Величина
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPrice()
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Код единицы измерения.  Доступные значения 245 – Киловатт-час, 243 Ватт-час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnit()
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Критерии дифференциации социальной нормы потребления электрической энергии
     * 
     * Gets the value of the differentiation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the differentiation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDifferentiation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DifferentiationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the differentiation property.
     */
    public List<DifferentiationType> getDifferentiation() {
        if (differentiation == null) {
            differentiation = new ArrayList<>();
        }
        return this.differentiation;
    }

    /**
     * Критерии дифференциации социальной нормы потребления электрической энергии не установлены
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDifferentiationNotSet() {
        return differentiationNotSet;
    }

    /**
     * Sets the value of the differentiationNotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDifferentiationNotSet()
     */
    public void setDifferentiationNotSet(Boolean value) {
        this.differentiationNotSet = value;
    }

    /**
     * Коэффициент тарифа
     * 
     * Gets the value of the coefficient property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coefficient property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCoefficient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoefficientType }
     * </p>
     * 
     * 
     * @return
     *     The value of the coefficient property.
     */
    public List<CoefficientType> getCoefficient() {
        if (coefficient == null) {
            coefficient = new ArrayList<>();
        }
        return this.coefficient;
    }

    /**
     * Коэффициенты тарифа не установлены
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoefficientsNotSet() {
        return coefficientsNotSet;
    }

    /**
     * Sets the value of the coefficientsNotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCoefficientsNotSet()
     */
    public void setCoefficientsNotSet(Boolean value) {
        this.coefficientsNotSet = value;
    }

}
