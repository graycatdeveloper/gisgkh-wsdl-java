
package ru.gosuslugi.dom.schema.integration.outage_report;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий статус информации о перерыве. Возможные значения: 
 * 	PUBLISHED - Информация размещена; 
 * 	CANCELLED - Информация аннулирована.
 * 
 * <p>Java class for StatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PUBLISHED"/>
 *     <enumeration value="CANCELLED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    PUBLISHED,
    CANCELLED;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
