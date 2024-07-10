
package ru.gosuslugi.dom.schema.integration.debts;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий статус информации о погашении задолженности. Возможные значения: 
 * 	PAID – Задолженность погашена; 
 * 	UNPAID - Задолженность не погашена.
 * 
 * <p>Java class for RepaimentStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RepaimentStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAID"/>
 *     <enumeration value="UNPAID"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RepaimentStatusType")
@XmlEnum
public enum RepaimentStatusType {

    PAID,
    UNPAID;

    public String value() {
        return name();
    }

    public static RepaimentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
