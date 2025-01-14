
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус письменного отказа собственника
 * 
 * <p>Java class for OwnerRefusalStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OwnerRefusalStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Published"/>
 *     <enumeration value="Canceled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OwnerRefusalStatusType")
@XmlEnum
public enum OwnerRefusalStatusType {


    /**
     * Размещен
     * 
     */
    @XmlEnumValue("Published")
    PUBLISHED("Published"),

    /**
     * Аннулирован
     * 
     */
    @XmlEnumValue("Canceled")
    CANCELED("Canceled");
    private final String value;

    OwnerRefusalStatusType(String v) {
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
    public static OwnerRefusalStatusType fromValue(String v) {
        for (OwnerRefusalStatusType c: OwnerRefusalStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
