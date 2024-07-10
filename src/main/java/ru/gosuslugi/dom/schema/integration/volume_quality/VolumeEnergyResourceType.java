
package ru.gosuslugi.dom.schema.integration.volume_quality;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Объем ресурса "Электрическая энергия"
 * 
 * <p>Java class for VolumeEnergyResourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeEnergyResourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MeteringDeviceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <sequence>
 *           <element name="VolumeT1" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourceType"/>
 *           <element name="VolumeT2" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourceType" minOccurs="0"/>
 *           <element name="VolumeT3" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourceType" minOccurs="0"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeEnergyResourceType", propOrder = {
    "meteringDeviceType",
    "volumeT1",
    "volumeT2",
    "volumeT3",
    "okei"
})
public class VolumeEnergyResourceType {

    /**
     * Вид прибора учета по количеству тарифов. Ссылка на НСИ "Вид прибора учета по количеству тарифов" (реестровый номер 4)
     * 
     */
    @XmlElement(name = "MeteringDeviceType", required = true)
    protected NsiRef meteringDeviceType;
    @XmlElement(name = "VolumeT1", required = true)
    protected BigDecimal volumeT1;
    /**
     * Обязательно для заполнения, если Вид ПУ = "Двухтарифный" или "Трехтарифный"
     * 
     */
    @XmlElement(name = "VolumeT2")
    protected BigDecimal volumeT2;
    /**
     * Обязательно для заполнения, если Вид ПУ = "Трехтарифный"
     * 
     */
    @XmlElement(name = "VolumeT3")
    protected BigDecimal volumeT3;
    /**
     * Код ОКЕИ
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String okei;

    /**
     * Вид прибора учета по количеству тарифов. Ссылка на НСИ "Вид прибора учета по количеству тарифов" (реестровый номер 4)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMeteringDeviceType() {
        return meteringDeviceType;
    }

    /**
     * Sets the value of the meteringDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMeteringDeviceType()
     */
    public void setMeteringDeviceType(NsiRef value) {
        this.meteringDeviceType = value;
    }

    /**
     * Gets the value of the volumeT1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeT1() {
        return volumeT1;
    }

    /**
     * Sets the value of the volumeT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeT1(BigDecimal value) {
        this.volumeT1 = value;
    }

    /**
     * Обязательно для заполнения, если Вид ПУ = "Двухтарифный" или "Трехтарифный"
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeT2() {
        return volumeT2;
    }

    /**
     * Sets the value of the volumeT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVolumeT2()
     */
    public void setVolumeT2(BigDecimal value) {
        this.volumeT2 = value;
    }

    /**
     * Обязательно для заполнения, если Вид ПУ = "Трехтарифный"
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeT3() {
        return volumeT3;
    }

    /**
     * Sets the value of the volumeT3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVolumeT3()
     */
    public void setVolumeT3(BigDecimal value) {
        this.volumeT3 = value;
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

}
