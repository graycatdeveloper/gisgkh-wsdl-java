
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Иной показатель качества КР
 * 
 * <p>Java class for OtherQualityIndicatorType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OtherQualityIndicatorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type"/>
 *         <element name="IndicatorValue" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorValueType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherQualityIndicatorType", propOrder = {
    "indicatorName",
    "indicatorValue"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.QualityResourcesType.OtherQualityIndicatorResource.class
})
public class OtherQualityIndicatorType {

    /**
     * Наименование показателя
     * 
     */
    @XmlElement(name = "IndicatorName", required = true)
    protected String indicatorName;
    /**
     * Значение показателя качества. Для основания с типом "ДТКО" обязательно для заполнения. Для основания с типом "ДРСО" доступно и обязательно, если присылается tns:IsSignedAct
     * 
     */
    @XmlElement(name = "IndicatorValue")
    protected IndicatorValueType indicatorValue;

    /**
     * Наименование показателя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatorName() {
        return indicatorName;
    }

    /**
     * Sets the value of the indicatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getIndicatorName()
     */
    public void setIndicatorName(String value) {
        this.indicatorName = value;
    }

    /**
     * Значение показателя качества. Для основания с типом "ДТКО" обязательно для заполнения. Для основания с типом "ДРСО" доступно и обязательно, если присылается tns:IsSignedAct
     * 
     * @return
     *     possible object is
     *     {@link IndicatorValueType }
     *     
     */
    public IndicatorValueType getIndicatorValue() {
        return indicatorValue;
    }

    /**
     * Sets the value of the indicatorValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorValueType }
     *     
     * @see #getIndicatorValue()
     */
    public void setIndicatorValue(IndicatorValueType value) {
        this.indicatorValue = value;
    }

}
