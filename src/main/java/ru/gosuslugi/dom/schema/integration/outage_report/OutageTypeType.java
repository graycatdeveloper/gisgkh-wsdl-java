
package ru.gosuslugi.dom.schema.integration.outage_report;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий тип перерыва. Возможные значения: 
 * PAUSE - Перерыв в предоставлении коммунальной услуги; 
 * LIMITATION  - Ограничение в предоставлении коммунальной услуги; 
 * SUSPENSION - Приостановление предоставления коммунальной услуги.
 * 
 * <p>Java class for OutageTypeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OutageTypeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PAUSE"/>
 *     <enumeration value="LIMITATION"/>
 *     <enumeration value="SUSPENSION"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OutageTypeType")
@XmlEnum
public enum OutageTypeType {

    PAUSE,
    LIMITATION,
    SUSPENSION;

    public String value() {
        return name();
    }

    public static OutageTypeType fromValue(String v) {
        return valueOf(v);
    }

}
