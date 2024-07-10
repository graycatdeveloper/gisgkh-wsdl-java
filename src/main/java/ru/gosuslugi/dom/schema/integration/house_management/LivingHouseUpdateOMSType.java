
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Жилой дом (обновление данных ОМС)
 * 
 * <p>Java class for LivingHouseUpdateOMSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LivingHouseUpdateOMSType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicUpdateOMSType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivingHouseUpdateOMSType", propOrder = {
    "basicCharacteristicts"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate.class
})
public class LivingHouseUpdateOMSType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected HouseBasicUpdateOMSType basicCharacteristicts;

    /**
     * Основные характеристики
     * 
     * @return
     *     possible object is
     *     {@link HouseBasicUpdateOMSType }
     *     
     */
    public HouseBasicUpdateOMSType getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseBasicUpdateOMSType }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(HouseBasicUpdateOMSType value) {
        this.basicCharacteristicts = value;
    }

}
