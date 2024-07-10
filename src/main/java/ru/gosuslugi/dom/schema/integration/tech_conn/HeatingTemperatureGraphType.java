
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Сведения о температурном графике
 * 
 * <p>Java class for HeatingTemperatureGraphType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HeatingTemperatureGraphType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GvsAverage" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *         <element name="GvsMax" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *         <element name="Heating" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *         <element name="Ventilation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *         <element name="Conditioning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *         <element name="Other" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatingTemperatureGraphType", propOrder = {
    "gvsAverage",
    "gvsMax",
    "heating",
    "ventilation",
    "conditioning",
    "other"
})
public class HeatingTemperatureGraphType {

    /**
     * Горячее водоснабжение - средняя, ГКал/час
     * 
     */
    @XmlElement(name = "GvsAverage")
    protected String gvsAverage;
    /**
     * Горячее водоснабжение - максимальная, ГКал/час
     * 
     */
    @XmlElement(name = "GvsMax")
    protected String gvsMax;
    /**
     * Теплоснабжение, ГКал/час
     * 
     */
    @XmlElement(name = "Heating")
    protected String heating;
    /**
     * Вентиляция, ГКал/час
     * 
     */
    @XmlElement(name = "Ventilation")
    protected String ventilation;
    /**
     * Кондиционирование, ГКал/час
     * 
     */
    @XmlElement(name = "Conditioning")
    protected String conditioning;
    /**
     * Прочая, ГКал/час
     * 
     */
    @XmlElement(name = "Other")
    protected String other;

    /**
     * Горячее водоснабжение - средняя, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvsAverage() {
        return gvsAverage;
    }

    /**
     * Sets the value of the gvsAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGvsAverage()
     */
    public void setGvsAverage(String value) {
        this.gvsAverage = value;
    }

    /**
     * Горячее водоснабжение - максимальная, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvsMax() {
        return gvsMax;
    }

    /**
     * Sets the value of the gvsMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGvsMax()
     */
    public void setGvsMax(String value) {
        this.gvsMax = value;
    }

    /**
     * Теплоснабжение, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeating() {
        return heating;
    }

    /**
     * Sets the value of the heating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHeating()
     */
    public void setHeating(String value) {
        this.heating = value;
    }

    /**
     * Вентиляция, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentilation() {
        return ventilation;
    }

    /**
     * Sets the value of the ventilation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVentilation()
     */
    public void setVentilation(String value) {
        this.ventilation = value;
    }

    /**
     * Кондиционирование, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditioning() {
        return conditioning;
    }

    /**
     * Sets the value of the conditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getConditioning()
     */
    public void setConditioning(String value) {
        this.conditioning = value;
    }

    /**
     * Прочая, ГКал/час
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOther()
     */
    public void setOther(String value) {
        this.other = value;
    }

}
