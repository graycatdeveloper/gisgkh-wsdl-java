
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Срок представления платежных документов
 * 
 * <p>Java class for TermForGrantingType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TermForGrantingType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COINCIDES"/>
 *     <enumeration value="OTHER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TermForGrantingType")
@XmlEnum
public enum TermForGrantingType {


    /**
     * совпадает со сроком, установленным для представления платежных документов на оплату за жилое помещение и коммунальные услуги
     * 
     */
    COINCIDES,

    /**
     * иной срок
     * 
     */
    OTHER;

    public String value() {
        return name();
    }

    public static TermForGrantingType fromValue(String v) {
        return valueOf(v);
    }

}
