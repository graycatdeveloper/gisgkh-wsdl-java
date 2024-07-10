
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Статус объекта
 * 
 * <p>Java class for ObjectStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ObjectStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Built"/>
 *     <enumeration value="Established"/>
 *     <enumeration value="Planning"/>
 *     <enumeration value="Construction"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ObjectStatusType")
@XmlEnum
public enum ObjectStatusType {

    @XmlEnumValue("Built")
    BUILT("Built"),
    @XmlEnumValue("Established")
    ESTABLISHED("Established"),
    @XmlEnumValue("Planning")
    PLANNING("Planning"),
    @XmlEnumValue("Construction")
    CONSTRUCTION("Construction");
    private final String value;

    ObjectStatusType(String v) {
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
    public static ObjectStatusType fromValue(String v) {
        for (ObjectStatusType c: ObjectStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
