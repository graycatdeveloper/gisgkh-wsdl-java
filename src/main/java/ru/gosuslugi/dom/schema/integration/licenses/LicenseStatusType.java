
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статусы лицензии
 * 
 * <p>Java class for LicenseStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LicenseStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Active"/>
 *     <enumeration value="Expired"/>
 *     <enumeration value="Canceled"/>
 *     <enumeration value="Terminated"/>
 *     <enumeration value="Deactualized"/>
 *     <enumeration value="Project"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LicenseStatusType")
@XmlEnum
public enum LicenseStatusType {


    /**
     * Действующая
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * Истек срок действия
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * Лицензия аннулирована
     * 
     */
    @XmlEnumValue("Canceled")
    CANCELED("Canceled"),

    /**
     * Действие прекращено
     * 
     */
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated"),

    /**
     * Лицензия деактуализирована
     * 
     */
    @XmlEnumValue("Deactualized")
    DEACTUALIZED("Deactualized"),

    /**
     * Проект
     * 
     */
    @XmlEnumValue("Project")
    PROJECT("Project");
    private final String value;

    LicenseStatusType(String v) {
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
    public static LicenseStatusType fromValue(String v) {
        for (LicenseStatusType c: LicenseStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
