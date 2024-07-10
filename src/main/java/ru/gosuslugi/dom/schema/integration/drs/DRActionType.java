
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Типы операций с запросами о наличии задолженности за ЖКУ.
 * 
 * 				Допустимые значения:
 * 				Send - Направить запрос поставщикам ЖКУ;
 * 				Revoke - Отозвать запрос, ранее направленный поставщикам ЖКУ
 * 
 * <p>Java class for DRActionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DRActionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Send"/>
 *     <enumeration value="Revoke"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DRActionType")
@XmlEnum
public enum DRActionType {

    @XmlEnumValue("Send")
    SEND("Send"),
    @XmlEnumValue("Revoke")
    REVOKE("Revoke");
    private final String value;

    DRActionType(String v) {
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
    public static DRActionType fromValue(String v) {
        for (DRActionType c: DRActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
