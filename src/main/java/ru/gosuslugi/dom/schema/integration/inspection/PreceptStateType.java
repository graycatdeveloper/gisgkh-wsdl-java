
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус предписания.
 * 
 * <p>Java class for PreceptStateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="PreceptStateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Active"/>
 *     <enumeration value="Cancelled"/>
 *     <enumeration value="Fulfiled"/>
 *     <enumeration value="NotFilled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PreceptStateType")
@XmlEnum
public enum PreceptStateType {


    /**
     * Не отменено (не отозвано).
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Отменено (отозвано).
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Fulfiled")
    FULFILED("Fulfiled"),
    @XmlEnumValue("NotFilled")
    NOT_FILLED("NotFilled");
    private final String value;

    PreceptStateType(String v) {
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
    public static PreceptStateType fromValue(String v) {
        for (PreceptStateType c: PreceptStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
