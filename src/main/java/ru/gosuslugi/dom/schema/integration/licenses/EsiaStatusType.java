
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cтатус отправки информации в ЕСИА
 * 
 * <p>Java class for EsiaStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EsiaStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SENT"/>
 *     <enumeration value="SUCCEEDED"/>
 *     <enumeration value="FAULT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EsiaStatusType")
@XmlEnum
public enum EsiaStatusType {


    /**
     * Запрос отправлен
     * 
     */
    SENT,
    SUCCEEDED,
    FAULT;

    public String value() {
        return name();
    }

    public static EsiaStatusType fromValue(String v) {
        return valueOf(v);
    }

}
