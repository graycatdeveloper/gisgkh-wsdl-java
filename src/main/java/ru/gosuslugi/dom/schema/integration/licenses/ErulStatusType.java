
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус отправки информации в ЕРУЛ
 * 
 * <p>Java class for ErulStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ErulStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOT_PUBLISHED"/>
 *     <enumeration value="NOT_SENT"/>
 *     <enumeration value="PROCESSING"/>
 *     <enumeration value="SENT"/>
 *     <enumeration value="PUBLISHED"/>
 *     <enumeration value="SENDING_IS_NOT_REQUIRED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ErulStatusType")
@XmlEnum
public enum ErulStatusType {


    /**
     * Не размещено в ЕРУЛ
     * 
     */
    NOT_PUBLISHED,

    /**
     * Не отправлено
     * 
     */
    NOT_SENT,

    /**
     * В процессе оформления в ЕРУЛ
     * 
     */
    PROCESSING,

    /**
     * Отправлено в ЕРУЛ
     * 
     */
    SENT,

    /**
     * Размещено в ЕРУЛ
     * 
     */
    PUBLISHED,

    /**
     * Не требуется отправка в ЕРУЛ
     * 
     */
    SENDING_IS_NOT_REQUIRED;

    public String value() {
        return name();
    }

    public static ErulStatusType fromValue(String v) {
        return valueOf(v);
    }

}
