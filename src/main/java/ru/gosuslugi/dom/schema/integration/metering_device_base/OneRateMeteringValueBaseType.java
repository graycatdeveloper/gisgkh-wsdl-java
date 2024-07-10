
package ru.gosuslugi.dom.schema.integration.metering_device_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Коммунальный ресурс и показание ПУ для однотарифного ПУ. Используется при импорте показаний поверки и фиксации показаний ПУ при его замене, а также, как базовый класс для других типов
 * 
 * <p>Java class for OneRateMeteringValueBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OneRateMeteringValueBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="MeteringValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneRateMeteringValueBaseType", propOrder = {
    "municipalResource",
    "meteringValue"
})
@XmlSeeAlso({
    OneRateMeteringValueExportType.class
})
public class OneRateMeteringValueBaseType {

    /**
     * Коммунальный ресурс (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)  (НСИ 2)
     * 
     */
    @XmlElement(name = "MunicipalResource", required = true)
    protected NsiRef municipalResource;
    /**
     * Значение
     * 
     */
    @XmlElement(name = "MeteringValue", required = true)
    protected String meteringValue;

    /**
     * Коммунальный ресурс (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)  (НСИ 2)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(NsiRef value) {
        this.municipalResource = value;
    }

    /**
     * Значение
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringValue() {
        return meteringValue;
    }

    /**
     * Sets the value of the meteringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringValue()
     */
    public void setMeteringValue(String value) {
        this.meteringValue = value;
    }

}
