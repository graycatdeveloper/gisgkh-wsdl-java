
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ResidentialPremiseAcceptedParameterType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ResidentialPremiseAcceptedParameterType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PremisesNum"/>
 *     <enumeration value="EntranceNum"/>
 *     <enumeration value="PremisesCharacteristic"/>
 *     <enumeration value="RoomsNum"/>
 *     <enumeration value="TotalArea"/>
 *     <enumeration value="GrossArea"/>
 *     <enumeration value="ResidentialHouseType"/>
 *     <enumeration value="TerminationDate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResidentialPremiseAcceptedParameterType")
@XmlEnum
public enum ResidentialPremiseAcceptedParameterType {

    @XmlEnumValue("PremisesNum")
    PREMISES_NUM("PremisesNum"),
    @XmlEnumValue("EntranceNum")
    ENTRANCE_NUM("EntranceNum"),
    @XmlEnumValue("PremisesCharacteristic")
    PREMISES_CHARACTERISTIC("PremisesCharacteristic"),
    @XmlEnumValue("RoomsNum")
    ROOMS_NUM("RoomsNum"),
    @XmlEnumValue("TotalArea")
    TOTAL_AREA("TotalArea"),
    @XmlEnumValue("GrossArea")
    GROSS_AREA("GrossArea"),
    @XmlEnumValue("ResidentialHouseType")
    RESIDENTIAL_HOUSE_TYPE("ResidentialHouseType"),
    @XmlEnumValue("TerminationDate")
    TERMINATION_DATE("TerminationDate");
    private final String value;

    ResidentialPremiseAcceptedParameterType(String v) {
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
    public static ResidentialPremiseAcceptedParameterType fromValue(String v) {
        for (ResidentialPremiseAcceptedParameterType c: ResidentialPremiseAcceptedParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
