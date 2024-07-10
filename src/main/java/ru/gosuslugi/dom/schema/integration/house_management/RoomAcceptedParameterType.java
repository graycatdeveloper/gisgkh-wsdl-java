
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for RoomAcceptedParameterType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RoomAcceptedParameterType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RoomNumber"/>
 *     <enumeration value="Square"/>
 *     <enumeration value="ResidentialHouseType"/>
 *     <enumeration value="TerminationDate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RoomAcceptedParameterType")
@XmlEnum
public enum RoomAcceptedParameterType {

    @XmlEnumValue("RoomNumber")
    ROOM_NUMBER("RoomNumber"),
    @XmlEnumValue("Square")
    SQUARE("Square"),
    @XmlEnumValue("ResidentialHouseType")
    RESIDENTIAL_HOUSE_TYPE("ResidentialHouseType"),
    @XmlEnumValue("TerminationDate")
    TERMINATION_DATE("TerminationDate");
    private final String value;

    RoomAcceptedParameterType(String v) {
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
    public static RoomAcceptedParameterType fromValue(String v) {
        for (RoomAcceptedParameterType c: RoomAcceptedParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
