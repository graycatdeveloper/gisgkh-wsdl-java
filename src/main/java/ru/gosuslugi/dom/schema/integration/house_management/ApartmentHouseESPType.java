
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Многоквартирный дом (для импорта от ЕСП)
 * 
 * <p>Java class for ApartmentHouseESPType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApartmentHouseESPType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyType">
 *                 <sequence>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                   <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType"/>
 *                   <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="LifeCycleStage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   <element name="UsedYear" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UsedYearType"/>
 *                   <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}FloorType"/>
 *                   <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *                   <element name="OlsonTZ" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="CulturalHeritage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="IsMunicipalProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="IsRegionProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
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
@XmlType(name = "ApartmentHouseESPType", propOrder = {
    "basicCharacteristicts",
    "undergroundFloorCount",
    "minFloorCount"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate.class
})
public class ApartmentHouseESPType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected ApartmentHouseESPType.BasicCharacteristicts basicCharacteristicts;
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
     *     {@link ApartmentHouseESPType.BasicCharacteristicts }
     *     
     */
    public ApartmentHouseESPType.BasicCharacteristicts getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApartmentHouseESPType.BasicCharacteristicts }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(ApartmentHouseESPType.BasicCharacteristicts value) {
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyType">
     *       <sequence>
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *         <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType"/>
     *         <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="LifeCycleStage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *         <element name="UsedYear" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UsedYearType"/>
     *         <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}FloorType"/>
     *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
     *         <element name="OlsonTZ" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="CulturalHeritage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="IsMunicipalProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="IsRegionProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fiasHouseGuid",
        "totalSquare",
        "state",
        "lifeCycleStage",
        "usedYear",
        "floorCount",
        "oktmo",
        "olsonTZ",
        "culturalHeritage",
        "ogfData",
        "isMunicipalProperty",
        "isRegionProperty"
    })
    public static class BasicCharacteristicts
        extends GKNEGRPKeyType
    {

        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid", required = true)
        protected String fiasHouseGuid;
        /**
         * Общая площадь
         * 
         */
        @XmlElement(name = "TotalSquare", required = true)
        protected BigDecimal totalSquare;
        /**
         * Состояние (НСИ 24)
         * 
         */
        @XmlElement(name = "State", required = true)
        protected NsiRef state;
        /**
         * Стадия жизненного цикла (НСИ 338)
         * 
         */
        @XmlElement(name = "LifeCycleStage")
        protected NsiRef lifeCycleStage;
        /**
         * Год ввода в эксплуатацию
         * 
         */
        @XmlElement(name = "UsedYear")
        protected short usedYear;
        /**
         * Количество этажей
         * 
         */
        @XmlElement(name = "FloorCount")
        protected int floorCount;
        /**
         * ОКТМО (обязательное для всех территорий, за исключением города и космодрома "Байконур"). Значение из ФИАС при наличии.
         * 
         */
        @XmlElement(name = "OKTMO", required = true)
        protected OKTMORefType oktmo;
        /**
         * Часовая зона
         * 
         */
        @XmlElement(name = "OlsonTZ", required = true)
        protected NsiRef olsonTZ;
        /**
         * Наличие у дома статуса объекта культурного наследия
         * 
         */
        @XmlElement(name = "CulturalHeritage")
        protected boolean culturalHeritage;
        /**
         * Данные ОЖФ
         * 
         */
        @XmlElement(name = "OGFData")
        protected List<OGFData> ogfData;
        /**
         * Дом находится в муниципальной собственности и в полном объеме используется в качестве общежития
         * 
         */
        @XmlElement(name = "IsMunicipalProperty")
        protected Boolean isMunicipalProperty;
        /**
         * Дом находится в cобственности субъекта РФ и в полном объеме используется в качестве общежития
         * 
         */
        @XmlElement(name = "IsRegionProperty")
        protected Boolean isRegionProperty;

        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIASHouseGuid() {
            return fiasHouseGuid;
        }

        /**
         * Sets the value of the fiasHouseGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFIASHouseGuid()
         */
        public void setFIASHouseGuid(String value) {
            this.fiasHouseGuid = value;
        }

        /**
         * Общая площадь
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalSquare() {
            return totalSquare;
        }

        /**
         * Sets the value of the totalSquare property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalSquare()
         */
        public void setTotalSquare(BigDecimal value) {
            this.totalSquare = value;
        }

        /**
         * Состояние (НСИ 24)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getState()
         */
        public void setState(NsiRef value) {
            this.state = value;
        }

        /**
         * Стадия жизненного цикла (НСИ 338)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getLifeCycleStage() {
            return lifeCycleStage;
        }

        /**
         * Sets the value of the lifeCycleStage property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getLifeCycleStage()
         */
        public void setLifeCycleStage(NsiRef value) {
            this.lifeCycleStage = value;
        }

        /**
         * Год ввода в эксплуатацию
         * 
         */
        public short getUsedYear() {
            return usedYear;
        }

        /**
         * Sets the value of the usedYear property.
         * 
         */
        public void setUsedYear(short value) {
            this.usedYear = value;
        }

        /**
         * Количество этажей
         * 
         */
        public int getFloorCount() {
            return floorCount;
        }

        /**
         * Sets the value of the floorCount property.
         * 
         */
        public void setFloorCount(int value) {
            this.floorCount = value;
        }

        /**
         * ОКТМО (обязательное для всех территорий, за исключением города и космодрома "Байконур"). Значение из ФИАС при наличии.
         * 
         * @return
         *     possible object is
         *     {@link OKTMORefType }
         *     
         */
        public OKTMORefType getOKTMO() {
            return oktmo;
        }

        /**
         * Sets the value of the oktmo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKTMORefType }
         *     
         * @see #getOKTMO()
         */
        public void setOKTMO(OKTMORefType value) {
            this.oktmo = value;
        }

        /**
         * Часовая зона
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getOlsonTZ() {
            return olsonTZ;
        }

        /**
         * Sets the value of the olsonTZ property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getOlsonTZ()
         */
        public void setOlsonTZ(NsiRef value) {
            this.olsonTZ = value;
        }

        /**
         * Наличие у дома статуса объекта культурного наследия
         * 
         */
        public boolean isCulturalHeritage() {
            return culturalHeritage;
        }

        /**
         * Sets the value of the culturalHeritage property.
         * 
         */
        public void setCulturalHeritage(boolean value) {
            this.culturalHeritage = value;
        }

        /**
         * Данные ОЖФ
         * 
         * Gets the value of the ogfData property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ogfData property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOGFData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OGFData }
         * </p>
         * 
         * 
         * @return
         *     The value of the ogfData property.
         */
        public List<OGFData> getOGFData() {
            if (ogfData == null) {
                ogfData = new ArrayList<>();
            }
            return this.ogfData;
        }

        /**
         * Дом находится в муниципальной собственности и в полном объеме используется в качестве общежития
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsMunicipalProperty() {
            return isMunicipalProperty;
        }

        /**
         * Sets the value of the isMunicipalProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsMunicipalProperty()
         */
        public void setIsMunicipalProperty(Boolean value) {
            this.isMunicipalProperty = value;
        }

        /**
         * Дом находится в cобственности субъекта РФ и в полном объеме используется в качестве общежития
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRegionProperty() {
            return isRegionProperty;
        }

        /**
         * Sets the value of the isRegionProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsRegionProperty()
         */
        public void setIsRegionProperty(Boolean value) {
            this.isRegionProperty = value;
        }

    }

}
