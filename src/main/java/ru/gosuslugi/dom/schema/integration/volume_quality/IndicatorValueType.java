
package ru.gosuslugi.dom.schema.integration.volume_quality;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Показатель качества КР
 * 
 * <p>Java class for IndicatorValueType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IndicatorValueType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <choice>
 *             <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorValueNumberType"/>
 *             <sequence>
 *               <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorValueNumberType"/>
 *               <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorValueNumberType"/>
 *             </sequence>
 *           </choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
 *         </sequence>
 *         <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicatorValueType", propOrder = {
    "number",
    "startRange",
    "endRange",
    "okei",
    "correspond"
})
public class IndicatorValueType {

    /**
     * Число
     * 
     */
    @XmlElement(name = "Number")
    protected BigDecimal number;
    /**
     * Начало диапазона
     * 
     */
    @XmlElement(name = "StartRange")
    protected BigDecimal startRange;
    /**
     * Конец диапазона
     * 
     */
    @XmlElement(name = "EndRange")
    protected BigDecimal endRange;
    /**
     * Код ОКЕИ
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String okei;
    /**
     * Значение соответствует
     * 
     */
    @XmlElement(name = "Correspond")
    protected Boolean correspond;

    /**
     * Число
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getNumber()
     */
    public void setNumber(BigDecimal value) {
        this.number = value;
    }

    /**
     * Начало диапазона
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartRange() {
        return startRange;
    }

    /**
     * Sets the value of the startRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getStartRange()
     */
    public void setStartRange(BigDecimal value) {
        this.startRange = value;
    }

    /**
     * Конец диапазона
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndRange() {
        return endRange;
    }

    /**
     * Sets the value of the endRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getEndRange()
     */
    public void setEndRange(BigDecimal value) {
        this.endRange = value;
    }

    /**
     * Код ОКЕИ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKEI()
     */
    public void setOKEI(String value) {
        this.okei = value;
    }

    /**
     * Значение соответствует
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespond() {
        return correspond;
    }

    /**
     * Sets the value of the correspond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCorrespond()
     */
    public void setCorrespond(Boolean value) {
        this.correspond = value;
    }

}
