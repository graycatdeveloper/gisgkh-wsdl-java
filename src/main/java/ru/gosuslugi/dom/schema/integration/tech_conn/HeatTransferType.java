
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Сведния о теплоносителе
 * 
 * <p>Java class for HeatTransferType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HeatTransferType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type"/>
 *         <element name="Pressure">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="10"/>
 *               <fractionDigits value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Temperature" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatTransferType", propOrder = {
    "name",
    "pressure",
    "temperature"
})
public class HeatTransferType {

    /**
     * Наименование вида теплоносителя
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Давление вида теплоносителя (МПа)
     * 
     */
    @XmlElement(name = "Pressure", required = true)
    protected BigDecimal pressure;
    /**
     * Температура вида теплоносителя
     * 
     */
    @XmlElement(name = "Temperature")
    protected String temperature;

    /**
     * Наименование вида теплоносителя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Давление вида теплоносителя (МПа)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPressure()
     */
    public void setPressure(BigDecimal value) {
        this.pressure = value;
    }

    /**
     * Температура вида теплоносителя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTemperature()
     */
    public void setTemperature(String value) {
        this.temperature = value;
    }

}
