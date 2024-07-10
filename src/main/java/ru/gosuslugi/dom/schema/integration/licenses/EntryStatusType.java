
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статусы реестровой записи
 * 
 * <p>Java class for EntryStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EntryStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PUBLISHED"/>
 *     <enumeration value="PUBLISHED_WITHOUT_ERUL_NUMBER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EntryStatusType")
@XmlEnum
public enum EntryStatusType {


    /**
     * Размещена
     * 
     */
    PUBLISHED,

    /**
     * Размещена без полученного номера из ЕРУЛ
     * 
     */
    PUBLISHED_WITHOUT_ERUL_NUMBER;

    public String value() {
        return name();
    }

    public static EntryStatusType fromValue(String v) {
        return valueOf(v);
    }

}
