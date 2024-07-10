
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Информация о режиме теплопотребления объекта
 * 
 * <p>Java class for HeatingConsumptionInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HeatingConsumptionInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HeatConsumptionType" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *         <element name="CustomHeatConsumptionType" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeatingConsumptionInfoType", propOrder = {
    "heatConsumptionType",
    "customHeatConsumptionType"
})
public class HeatingConsumptionInfoType {

    /**
     * Режим теплопотребления. Справочник "Режим теплопотребления подключаемого объекта" ЕСНСИ
     * 
     */
    @XmlElement(name = "HeatConsumptionType", required = true)
    protected EsnsiItemType heatConsumptionType;
    /**
     * Свой вариант режима теплопотребления
     * 
     */
    @XmlElement(name = "CustomHeatConsumptionType")
    protected String customHeatConsumptionType;

    /**
     * Режим теплопотребления. Справочник "Режим теплопотребления подключаемого объекта" ЕСНСИ
     * 
     * @return
     *     possible object is
     *     {@link EsnsiItemType }
     *     
     */
    public EsnsiItemType getHeatConsumptionType() {
        return heatConsumptionType;
    }

    /**
     * Sets the value of the heatConsumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsnsiItemType }
     *     
     * @see #getHeatConsumptionType()
     */
    public void setHeatConsumptionType(EsnsiItemType value) {
        this.heatConsumptionType = value;
    }

    /**
     * Свой вариант режима теплопотребления
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomHeatConsumptionType() {
        return customHeatConsumptionType;
    }

    /**
     * Sets the value of the customHeatConsumptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCustomHeatConsumptionType()
     */
    public void setCustomHeatConsumptionType(String value) {
        this.customHeatConsumptionType = value;
    }

}
