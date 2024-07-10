
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Жилой дом (обновление данных для РСО)
 * 
 * <p>Java class for LivingHouseUpdateRSOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LivingHouseUpdateRSOType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicUpdateRSOType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivingHouseUpdateRSOType", propOrder = {
    "basicCharacteristicts"
})
public class LivingHouseUpdateRSOType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected HouseBasicUpdateRSOType basicCharacteristicts;

    /**
     * Основные характеристики
     * 
     * @return
     *     possible object is
     *     {@link HouseBasicUpdateRSOType }
     *     
     */
    public HouseBasicUpdateRSOType getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseBasicUpdateRSOType }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(HouseBasicUpdateRSOType value) {
        this.basicCharacteristicts = value;
    }

}
