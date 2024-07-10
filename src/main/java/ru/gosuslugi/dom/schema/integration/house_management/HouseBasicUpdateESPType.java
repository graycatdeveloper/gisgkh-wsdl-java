
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Основные характеристики дома (обновление данных для ЕСП)
 * 
 * <p>Java class for HouseBasicUpdateESPType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HouseBasicUpdateESPType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="LifeCycleStage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="UsedYear" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}UsedYearType" minOccurs="0"/>
 *         <element name="FloorCount" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}FloorType" minOccurs="0"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *         <element name="OlsonTZ" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="CulturalHeritage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "HouseBasicUpdateESPType", propOrder = {
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
public class HouseBasicUpdateESPType
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
    @XmlElement(name = "TotalSquare")
    protected BigDecimal totalSquare;
    /**
     * Состояние (НСИ 24)
     * 
     */
    @XmlElement(name = "State")
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
    protected Short usedYear;
    /**
     * Количество этажей
     * 
     */
    @XmlElement(name = "FloorCount")
    protected Integer floorCount;
    /**
     * ОКТМО.Только для ОКТМО не из ФИАС
     * 
     */
    @XmlElement(name = "OKTMO")
    protected OKTMORefType oktmo;
    /**
     * Часовая зона
     * 
     */
    @XmlElement(name = "OlsonTZ")
    protected NsiRef olsonTZ;
    /**
     * Наличие у дома статуса объекта культурного наследия
     * 
     */
    @XmlElement(name = "CulturalHeritage")
    protected Boolean culturalHeritage;
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
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUsedYear() {
        return usedYear;
    }

    /**
     * Sets the value of the usedYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     * @see #getUsedYear()
     */
    public void setUsedYear(Short value) {
        this.usedYear = value;
    }

    /**
     * Количество этажей
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFloorCount() {
        return floorCount;
    }

    /**
     * Sets the value of the floorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFloorCount()
     */
    public void setFloorCount(Integer value) {
        this.floorCount = value;
    }

    /**
     * ОКТМО.Только для ОКТМО не из ФИАС
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
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCulturalHeritage() {
        return culturalHeritage;
    }

    /**
     * Sets the value of the culturalHeritage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCulturalHeritage()
     */
    public void setCulturalHeritage(Boolean value) {
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
