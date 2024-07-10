
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Жилой дом (для импорта от УО)
 * 
 * <p>Java class for LivingHouseUOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LivingHouseUOType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicUOType"/>
 *         <element name="HasBlocks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="HasMultipleHousesWithSameAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LivingHouseUOType", propOrder = {
    "basicCharacteristicts",
    "hasBlocks",
    "hasMultipleHousesWithSameAddress"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseUORequest.LivingHouse.LivingHouseToCreate.class
})
public class LivingHouseUOType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected HouseBasicUOType basicCharacteristicts;
    /**
     * Жилой дом блокированной застройки
     * (Если не указан - аналог false).
     * 
     */
    @XmlElement(name = "HasBlocks")
    protected Boolean hasBlocks;
    /**
     * Несколько жилых домов с одинаковым адресом
     * (Если не указан - аналог false)
     * 
     */
    @XmlElement(name = "HasMultipleHousesWithSameAddress")
    protected Boolean hasMultipleHousesWithSameAddress;

    /**
     * Основные характеристики
     * 
     * @return
     *     possible object is
     *     {@link HouseBasicUOType }
     *     
     */
    public HouseBasicUOType getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseBasicUOType }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(HouseBasicUOType value) {
        this.basicCharacteristicts = value;
    }

    /**
     * Жилой дом блокированной застройки
     * (Если не указан - аналог false).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBlocks() {
        return hasBlocks;
    }

    /**
     * Sets the value of the hasBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasBlocks()
     */
    public void setHasBlocks(Boolean value) {
        this.hasBlocks = value;
    }

    /**
     * Несколько жилых домов с одинаковым адресом
     * (Если не указан - аналог false)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMultipleHousesWithSameAddress() {
        return hasMultipleHousesWithSameAddress;
    }

    /**
     * Sets the value of the hasMultipleHousesWithSameAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasMultipleHousesWithSameAddress()
     */
    public void setHasMultipleHousesWithSameAddress(Boolean value) {
        this.hasMultipleHousesWithSameAddress = value;
    }

}
