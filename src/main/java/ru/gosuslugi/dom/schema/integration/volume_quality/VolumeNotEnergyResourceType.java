
package ru.gosuslugi.dom.schema.integration.volume_quality;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Объем ресурса
 * 
 * <p>Java class for VolumeNotEnergyResourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeNotEnergyResourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourceType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeNotEnergyResourceType", propOrder = {
    "volume",
    "okei"
})
public class VolumeNotEnergyResourceType {

    /**
     * Значение объема
     * 
     */
    @XmlElement(name = "Volume", required = true)
    protected BigDecimal volume;
    /**
     * Код ОКЕИ
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String okei;

    /**
     * Значение объема
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVolume()
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
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
