
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ApartmentHouseAcceptedParameterType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApartmentHouseAcceptedParameterType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FiasHouseGuid"/>
 *     <enumeration value="TotalSquare"/>
 *     <enumeration value="State"/>
 *     <enumeration value="InnerWallMaterial"/>
 *     <enumeration value="ProjectSeries"/>
 *     <enumeration value="ProjectType"/>
 *     <enumeration value="BuildingYear"/>
 *     <enumeration value="UsedYear"/>
 *     <enumeration value="TotalWear"/>
 *     <enumeration value="FloorCount"/>
 *     <enumeration value="Energy"/>
 *     <enumeration value="OKTMO"/>
 *     <enumeration value="OlsonTZ"/>
 *     <enumeration value="ResidentialSquare"/>
 *     <enumeration value="CulturalHeritage"/>
 *     <enumeration value="BuiltUpArea"/>
 *     <enumeration value="UndergroundFloorCount"/>
 *     <enumeration value="MinFloorCount"/>
 *     <enumeration value="OverhaulYear"/>
 *     <enumeration value="OverhaulFormingKind"/>
 *     <enumeration value="NonResidentialSquare"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ApartmentHouseAcceptedParameterType")
@XmlEnum
public enum ApartmentHouseAcceptedParameterType {

    @XmlEnumValue("FiasHouseGuid")
    FIAS_HOUSE_GUID("FiasHouseGuid"),
    @XmlEnumValue("TotalSquare")
    TOTAL_SQUARE("TotalSquare"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("InnerWallMaterial")
    INNER_WALL_MATERIAL("InnerWallMaterial"),
    @XmlEnumValue("ProjectSeries")
    PROJECT_SERIES("ProjectSeries"),
    @XmlEnumValue("ProjectType")
    PROJECT_TYPE("ProjectType"),
    @XmlEnumValue("BuildingYear")
    BUILDING_YEAR("BuildingYear"),
    @XmlEnumValue("UsedYear")
    USED_YEAR("UsedYear"),
    @XmlEnumValue("TotalWear")
    TOTAL_WEAR("TotalWear"),
    @XmlEnumValue("FloorCount")
    FLOOR_COUNT("FloorCount"),
    @XmlEnumValue("Energy")
    ENERGY("Energy"),
    OKTMO("OKTMO"),
    @XmlEnumValue("OlsonTZ")
    OLSON_TZ("OlsonTZ"),
    @XmlEnumValue("ResidentialSquare")
    RESIDENTIAL_SQUARE("ResidentialSquare"),
    @XmlEnumValue("CulturalHeritage")
    CULTURAL_HERITAGE("CulturalHeritage"),
    @XmlEnumValue("BuiltUpArea")
    BUILT_UP_AREA("BuiltUpArea"),
    @XmlEnumValue("UndergroundFloorCount")
    UNDERGROUND_FLOOR_COUNT("UndergroundFloorCount"),
    @XmlEnumValue("MinFloorCount")
    MIN_FLOOR_COUNT("MinFloorCount"),
    @XmlEnumValue("OverhaulYear")
    OVERHAUL_YEAR("OverhaulYear"),
    @XmlEnumValue("OverhaulFormingKind")
    OVERHAUL_FORMING_KIND("OverhaulFormingKind"),
    @XmlEnumValue("NonResidentialSquare")
    NON_RESIDENTIAL_SQUARE("NonResidentialSquare");
    private final String value;

    ApartmentHouseAcceptedParameterType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static ApartmentHouseAcceptedParameterType fromValue(String v) {
        for (ApartmentHouseAcceptedParameterType c: ApartmentHouseAcceptedParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
