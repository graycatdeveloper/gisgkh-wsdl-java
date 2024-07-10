
package ru.gosuslugi.dom.schema.integration.metering_device_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Объемы потребленных ресурсов по ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)
 * 
 * <p>Java class for VolumeMeteringValueBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeMeteringValueBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
@XmlType(name = "VolumeMeteringValueBaseType", propOrder = {
    "municipalResource",
    "meteringValueT1",
    "meteringValueT2",
    "meteringValueT3"
})
public class VolumeMeteringValueBaseType {

    /**
     * Коммунальный ресурс (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)  (НСИ 2)
     * 
     */
    @XmlElement(name = "MunicipalResource", required = true)
    protected NsiRef municipalResource;
    /**
     * Объем по тарифу T1
     * 
     */
    @XmlElement(name = "MeteringValueT1", required = true)
    protected String meteringValueT1;
    /**
     * Объем по тарифу T2
     * 
     */
    @XmlElement(name = "MeteringValueT2")
    protected String meteringValueT2;
    /**
     * Объем по тарифу T3
     * 
     */
    @XmlElement(name = "MeteringValueT3")
    protected String meteringValueT3;

    /**
     * Коммунальный ресурс (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды)  (НСИ 2)
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
     * Объем по тарифу T1
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
     * Объем по тарифу T2
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
     * Объем по тарифу T3
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
