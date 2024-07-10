
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип собрания
 * 
 * <p>Java class for MeetingTypeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MeetingTypeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Owners"/>
 *     <enumeration value="Homeowners"/>
 *     <enumeration value="Cooperative"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MeetingTypeType")
@XmlEnum
public enum MeetingTypeType {

    @XmlEnumValue("Owners")
    OWNERS("Owners"),
    @XmlEnumValue("Homeowners")
    HOMEOWNERS("Homeowners"),
    @XmlEnumValue("Cooperative")
    COOPERATIVE("Cooperative");
    private final String value;

    MeetingTypeType(String v) {
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
    public static MeetingTypeType fromValue(String v) {
        for (MeetingTypeType c: MeetingTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
