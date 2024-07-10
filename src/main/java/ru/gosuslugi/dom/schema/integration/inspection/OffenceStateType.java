
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус протокола.
 * 
 * <p>Java class for OffenceStateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OffenceStateType">
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
@XmlType(name = "OffenceStateType")
@XmlEnum
public enum OffenceStateType {


    /**
     * Не отменен.
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Отменен.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Fulfiled")
    FULFILED("Fulfiled"),
    @XmlEnumValue("NotFilled")
    NOT_FILLED("NotFilled");
    private final String value;

    OffenceStateType(String v) {
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
    public static OffenceStateType fromValue(String v) {
        for (OffenceStateType c: OffenceStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
