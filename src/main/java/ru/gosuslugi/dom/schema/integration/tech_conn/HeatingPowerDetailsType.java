
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Сведения о нагрузке по теплоснабжению
 * 
 * <p>Java class for HeatingPowerDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HeatingPowerDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GvsAverage" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}Digits10Type"/>
 *         <element name="GvsMax" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}Digits10Type"/>
 *         <element name="Heating" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}Digits10Type"/>
 *         <element name="Ventilation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}Digits10Type"/>
 *         <element name="Conditioning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}Digits10Type"/>
 *         <element name="Other" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}Digits10Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatingPowerDetailsType", propOrder = {
    "gvsAverage",
    "gvsMax",
    "heating",
    "ventilation",
    "conditioning",
    "other"
})
public class HeatingPowerDetailsType {

    /**
     * Горячее водоснабжение - средняя, ГКал/час
     * 
     */
    @XmlElement(name = "GvsAverage", required = true)
    protected BigDecimal gvsAverage;
    /**
     * Горячее водоснабжение - максимальная, ГКал/час
     * 
     */
    @XmlElement(name = "GvsMax", required = true)
    protected BigDecimal gvsMax;
    /**
     * Теплоснабжение, ГКал/час
     * 
     */
    @XmlElement(name = "Heating", required = true)
    protected BigDecimal heating;
    /**
     * Вентиляция, ГКал/час
     * 
     */
    @XmlElement(name = "Ventilation", required = true)
    protected BigDecimal ventilation;
    /**
     * Кондиционирование, ГКал/час
     * 
     */
    @XmlElement(name = "Conditioning", required = true)
    protected BigDecimal conditioning;
    /**
     * Прочая, ГКал/час
     * 
     */
    @XmlElement(name = "Other")
    protected BigDecimal other;

    /**
     * Горячее водоснабжение - средняя, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGvsAverage() {
        return gvsAverage;
    }

    /**
     * Sets the value of the gvsAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getGvsAverage()
     */
    public void setGvsAverage(BigDecimal value) {
        this.gvsAverage = value;
    }

    /**
     * Горячее водоснабжение - максимальная, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGvsMax() {
        return gvsMax;
    }

    /**
     * Sets the value of the gvsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getGvsMax()
     */
    public void setGvsMax(BigDecimal value) {
        this.gvsMax = value;
    }

    /**
     * Теплоснабжение, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeating() {
        return heating;
    }

    /**
     * Sets the value of the heating property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHeating()
     */
    public void setHeating(BigDecimal value) {
        this.heating = value;
    }

    /**
     * Вентиляция, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentilation() {
        return ventilation;
    }

    /**
     * Sets the value of the ventilation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVentilation()
     */
    public void setVentilation(BigDecimal value) {
        this.ventilation = value;
    }

    /**
     * Кондиционирование, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConditioning() {
        return conditioning;
    }

    /**
     * Sets the value of the conditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getConditioning()
     */
    public void setConditioning(BigDecimal value) {
        this.conditioning = value;
    }

    /**
     * Прочая, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOther()
     */
    public void setOther(BigDecimal value) {
        this.other = value;
    }

}
