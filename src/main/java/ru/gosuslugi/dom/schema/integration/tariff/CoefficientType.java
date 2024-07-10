
package ru.gosuslugi.dom.schema.integration.tariff;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Коэффициент тарифа
 * 
 * <p>Java class for CoefficientType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CoefficientType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CoefficientValue" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CoefficientValueType"/>
 *         <element name="CoefficientDescription" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoefficientType", propOrder = {
    "coefficientValue",
    "coefficientDescription"
})
public class CoefficientType {

    /**
     * Значение коэффициента
     * 
     */
    @XmlElement(name = "CoefficientValue", required = true)
    protected BigDecimal coefficientValue;
    /**
     * Описание коэффициента
     * 
     */
    @XmlElement(name = "CoefficientDescription", required = true)
    protected String coefficientDescription;

    /**
     * Значение коэффициента
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoefficientValue() {
        return coefficientValue;
    }

    /**
     * Sets the value of the coefficientValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCoefficientValue()
     */
    public void setCoefficientValue(BigDecimal value) {
        this.coefficientValue = value;
    }

    /**
     * Описание коэффициента
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoefficientDescription() {
        return coefficientDescription;
    }

    /**
     * Sets the value of the coefficientDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCoefficientDescription()
     */
    public void setCoefficientDescription(String value) {
        this.coefficientDescription = value;
    }

}
