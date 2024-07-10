
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Многоквартирный дом (обновление данных для ЕСП)
 * 
 * <p>Java class for ApartmentHouseUpdateESPType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApartmentHouseUpdateESPType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicUpdateESPType"/>
 *         <element name="UndergroundFloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UndergroundFloorType" minOccurs="0"/>
 *         <element name="MinFloorCount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <maxInclusive value="999"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApartmentHouseUpdateESPType", propOrder = {
    "basicCharacteristicts",
    "undergroundFloorCount",
    "minFloorCount"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate.class
})
public class ApartmentHouseUpdateESPType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected HouseBasicUpdateESPType basicCharacteristicts;
    /**
     * Количество подземных этажей
     * 
     */
    @XmlElement(name = "UndergroundFloorCount")
    protected Byte undergroundFloorCount;
    /**
     * Количество этажей, наименьшее (значение игнорируется при обработке)
     * 
     */
    @XmlElement(name = "MinFloorCount")
    protected Integer minFloorCount;

    /**
     * Основные характеристики
     * 
     * @return
     *     possible object is
     *     {@link HouseBasicUpdateESPType }
     *     
     */
    public HouseBasicUpdateESPType getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseBasicUpdateESPType }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(HouseBasicUpdateESPType value) {
        this.basicCharacteristicts = value;
    }

    /**
     * Количество подземных этажей
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getUndergroundFloorCount() {
        return undergroundFloorCount;
    }

    /**
     * Sets the value of the undergroundFloorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     * @see #getUndergroundFloorCount()
     */
    public void setUndergroundFloorCount(Byte value) {
        this.undergroundFloorCount = value;
    }

    /**
     * Количество этажей, наименьшее (значение игнорируется при обработке)
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinFloorCount() {
        return minFloorCount;
    }

    /**
     * Sets the value of the minFloorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMinFloorCount()
     */
    public void setMinFloorCount(Integer value) {
        this.minFloorCount = value;
    }

}
