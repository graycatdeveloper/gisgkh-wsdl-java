
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Уточнение к сроку предоставления
 * 
 * <p>Java class for TermQualificationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TermQualificationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CURRENTMONTH"/>
 *     <enumeration value="NEXTMONTH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TermQualificationType")
@XmlEnum
public enum TermQualificationType {


    /**
     * текущего расчетного месяца
     * 
     */
    CURRENTMONTH,

    /**
     * следующего месяца за расчетным
     * 
     */
    NEXTMONTH;

    public String value() {
        return name();
    }

    public static TermQualificationType fromValue(String v) {
        return valueOf(v);
    }

}
