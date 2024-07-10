
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Многоквартирный дом (для импорта от УО)
 * 
 * <p>Java class for ApartmentHouseUOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApartmentHouseUOType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicUOType">
 *                 <sequence>
 *                   <choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CadastralNumber"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}No_RSO_GKN_EGRP_Registered"/>
 *                     <sequence>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}NoCadastralNumber" minOccurs="0"/>
 *                       <choice minOccurs="0">
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ConditionalNumber"/>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}RightOrEncumbrance" maxOccurs="unbounded"/>
 *                       </choice>
 *                     </sequence>
 *                   </choice>
 *                   <sequence>
 *                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                     <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType"/>
 *                     <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                     <element name="LifeCycleStage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                     <element name="UsedYear" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UsedYearType"/>
 *                     <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}FloorType"/>
 *                     <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *                     <element name="OlsonTZ" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                     <element name="CulturalHeritage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
 *                     <element name="IsMunicipalProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     <element name="IsRegionProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   </sequence>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="UndergroundFloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UndergroundFloorType"/>
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
@XmlType(name = "ApartmentHouseUOType", propOrder = {
    "basicCharacteristicts",
    "undergroundFloorCount",
    "minFloorCount"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate.class
})
public class ApartmentHouseUOType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected ApartmentHouseUOType.BasicCharacteristicts basicCharacteristicts;
    /**
     * Количество подземных этажей
     * 
     */
    @XmlElement(name = "UndergroundFloorCount")
    protected byte undergroundFloorCount;
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
     *     {@link ApartmentHouseUOType.BasicCharacteristicts }
     *     
     */
    public ApartmentHouseUOType.BasicCharacteristicts getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentHouseUOType.BasicCharacteristicts }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(ApartmentHouseUOType.BasicCharacteristicts value) {
        this.basicCharacteristicts = value;
    }

    /**
     * Количество подземных этажей
     * 
     */
    public byte getUndergroundFloorCount() {
        return undergroundFloorCount;
    }

    /**
     * Sets the value of the undergroundFloorCount property.
     * 
     */
    public void setUndergroundFloorCount(byte value) {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicUOType">
     *       <sequence>
     *         <choice>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CadastralNumber"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}No_RSO_GKN_EGRP_Registered"/>
     *           <sequence>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}NoCadastralNumber" minOccurs="0"/>
     *             <choice minOccurs="0">
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ConditionalNumber"/>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}RightOrEncumbrance" maxOccurs="unbounded"/>
     *             </choice>
     *           </sequence>
     *         </choice>
     *         <sequence>
     *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *           <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType"/>
     *           <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *           <element name="LifeCycleStage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *           <element name="UsedYear" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UsedYearType"/>
     *           <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}FloorType"/>
     *           <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
     *           <element name="OlsonTZ" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *           <element name="CulturalHeritage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
     *           <element name="IsMunicipalProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *           <element name="IsRegionProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    @XmlType(name = "")
    public static class BasicCharacteristicts
        extends HouseBasicUOType
    {


    }

}
