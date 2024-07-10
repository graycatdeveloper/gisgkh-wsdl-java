
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статусы домов в лицензии
 * 
 * <p>Java class for LicenseHouseStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LicenseHouseStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="INCLUDED"/>
 *     <enumeration value="EXCLUDED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LicenseHouseStatusType")
@XmlEnum
public enum LicenseHouseStatusType {


    /**
     * Включен
     * 
     */
    INCLUDED,

    /**
     * Исключен
     * 
     */
    EXCLUDED;

    public String value() {
        return name();
    }

    public static LicenseHouseStatusType fromValue(String v) {
        return valueOf(v);
    }

}
