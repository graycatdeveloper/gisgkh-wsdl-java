
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Тип дней
 * 
 * <p>Java class for DaysTypeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DaysTypeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CALENDAR"/>
 *     <enumeration value="WORK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DaysTypeType")
@XmlEnum
public enum DaysTypeType {


    /**
     * Календарный
     * 
     */
    CALENDAR,

    /**
     * Рабочий
     * 
     */
    WORK;

    public String value() {
        return name();
    }

    public static DaysTypeType fromValue(String v) {
        return valueOf(v);
    }

}
