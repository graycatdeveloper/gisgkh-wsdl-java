
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Многоквартирный дом (для экспорта)
 * 
 * <p>Java class for ApartmentHouseExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ApartmentHouseExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicCharacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}HouseBasicExportType"/>
 *         <element name="UndergroundFloorCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OverhaulFormingKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApartmentHouseExportType", propOrder = {
    "basicCharacteristicts",
    "undergroundFloorCount",
    "overhaulFormingKind"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ExportHouseResultType.ApartmentHouse.class
})
public class ApartmentHouseExportType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected HouseBasicExportType basicCharacteristicts;
    /**
     * Количество подземных этажей
     * 
     */
    @XmlElement(name = "UndergroundFloorCount")
    protected String undergroundFloorCount;
    /**
     * Вид счета\Способ формирования фонда (НСИ 62)
     * 
     */
    @XmlElement(name = "OverhaulFormingKind")
    protected NsiRef overhaulFormingKind;

    /**
     * Основные характеристики
     * 
     * @return
     *     possible object is
     *     {@link HouseBasicExportType }
     *     
     */
    public HouseBasicExportType getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseBasicExportType }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(HouseBasicExportType value) {
        this.basicCharacteristicts = value;
    }

    /**
     * Количество подземных этажей
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndergroundFloorCount() {
        return undergroundFloorCount;
    }

    /**
     * Sets the value of the undergroundFloorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUndergroundFloorCount()
     */
    public void setUndergroundFloorCount(String value) {
        this.undergroundFloorCount = value;
    }

    /**
     * Вид счета\Способ формирования фонда (НСИ 62)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getOverhaulFormingKind() {
        return overhaulFormingKind;
    }

    /**
     * Sets the value of the overhaulFormingKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getOverhaulFormingKind()
     */
    public void setOverhaulFormingKind(NsiRef value) {
        this.overhaulFormingKind = value;
    }

}
