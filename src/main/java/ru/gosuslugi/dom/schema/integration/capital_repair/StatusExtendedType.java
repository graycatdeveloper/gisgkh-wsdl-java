
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус объекта (расширенный)
 * 
 * <p>Java class for StatusExtendedType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StatusExtendedType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Project"/>
 *     <enumeration value="Published"/>
 *     <enumeration value="Canceled"/>
 *     <enumeration value="PublishedAndProject"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatusExtendedType")
@XmlEnum
public enum StatusExtendedType {


    /**
     * Проект
     * 
     */
    @XmlEnumValue("Project")
    PROJECT("Project"),

    /**
     * Опубликован
     * 
     */
    @XmlEnumValue("Published")
    PUBLISHED("Published"),

    /**
     * Аннулирован
     * 
     */
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),
    @XmlEnumValue("PublishedAndProject")
    PUBLISHED_AND_PROJECT("PublishedAndProject");
    private final String value;

    StatusExtendedType(String v) {
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
    public static StatusExtendedType fromValue(String v) {
        for (StatusExtendedType c: StatusExtendedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
