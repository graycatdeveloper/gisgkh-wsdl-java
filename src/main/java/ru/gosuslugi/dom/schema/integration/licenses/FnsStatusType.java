
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус отправки информации в ФНС
 * 
 * <p>Java class for FnsStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="FnsStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOT_SENT"/>
 *     <enumeration value="SCHEDULED_TO_PUBLISH"/>
 *     <enumeration value="SCHEDULED_TO_EXCLUDE"/>
 *     <enumeration value="SENT_TO_PUBLISH"/>
 *     <enumeration value="SENT_TO_EXCLUDE"/>
 *     <enumeration value="PUBLISHED"/>
 *     <enumeration value="EXCLUDED"/>
 *     <enumeration value="NOT_PUBLISHED"/>
 *     <enumeration value="NOT_EXCLUDED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FnsStatusType")
@XmlEnum
public enum FnsStatusType {


    /**
     * Не отправлено
     * 
     */
    NOT_SENT,

    /**
     * Планируется к отправке
     * 
     */
    SCHEDULED_TO_PUBLISH,

    /**
     * Планируется к исключению
     * 
     */
    SCHEDULED_TO_EXCLUDE,

    /**
     * Отправлено
     * 
     */
    SENT_TO_PUBLISH,

    /**
     * Отправлено для исключения
     * 
     */
    SENT_TO_EXCLUDE,

    /**
     * Размещено
     * 
     */
    PUBLISHED,

    /**
     * Исключено
     * 
     */
    EXCLUDED,

    /**
     * Не размещено
     * 
     */
    NOT_PUBLISHED,

    /**
     * Не исключено
     * 
     */
    NOT_EXCLUDED;

    public String value() {
        return name();
    }

    public static FnsStatusType fromValue(String v) {
        return valueOf(v);
    }

}
