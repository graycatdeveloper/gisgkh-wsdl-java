
package ru.gosuslugi.dom.schema.integration.metering_device_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Показания ПУ электрической энергии. Используется при импорте показаний поверки и фиксации показаний ПУ при его замене, а также, как базовый класс для других типов
 * 
 * <p>Java class for ElectricMeteringValueBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElectricMeteringValueBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MeteringValueT1" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType"/>
 *         <element name="MeteringValueT2" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType" minOccurs="0"/>
 *         <element name="MeteringValueT3" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricMeteringValueBaseType", propOrder = {
    "meteringValueT1",
    "meteringValueT2",
    "meteringValueT3"
})
@XmlSeeAlso({
    ElectricMeteringValueExportType.class
})
public class ElectricMeteringValueBaseType {

    /**
     * Значение по тарифу T1
     * 
     */
    @XmlElement(name = "MeteringValueT1", required = true)
    protected String meteringValueT1;
    /**
     * Значение по тарифу T2
     * 
     */
    @XmlElement(name = "MeteringValueT2")
    protected String meteringValueT2;
    /**
     * Значение по тарифу T3
     * 
     */
    @XmlElement(name = "MeteringValueT3")
    protected String meteringValueT3;

    /**
     * Значение по тарифу T1
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringValueT1() {
        return meteringValueT1;
    }

    /**
     * Sets the value of the meteringValueT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringValueT1()
     */
    public void setMeteringValueT1(String value) {
        this.meteringValueT1 = value;
    }

    /**
     * Значение по тарифу T2
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringValueT2() {
        return meteringValueT2;
    }

    /**
     * Sets the value of the meteringValueT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringValueT2()
     */
    public void setMeteringValueT2(String value) {
        this.meteringValueT2 = value;
    }

    /**
     * Значение по тарифу T3
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringValueT3() {
        return meteringValueT3;
    }

    /**
     * Sets the value of the meteringValueT3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringValueT3()
     */
    public void setMeteringValueT3(String value) {
        this.meteringValueT3 = value;
    }

}
