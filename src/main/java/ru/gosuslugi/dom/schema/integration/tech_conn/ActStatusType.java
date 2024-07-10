
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Статус акта по договору
 * 
 * <p>Java class for ActStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ActStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROJECT"/>
 *     <enumeration value="ON_APPROVAL"/>
 *     <enumeration value="SIGNED_OUTSIDE"/>
 *     <enumeration value="COMPLAINTS_RECEIVED"/>
 *     <enumeration value="REJECTED"/>
 *     <enumeration value="SIGNED"/>
 *     <enumeration value="APPROVED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActStatusType")
@XmlEnum
public enum ActStatusType {


    /**
     * Проект
     * 
     */
    PROJECT,

    /**
     * Согласование с заявителем
     * 
     */
    ON_APPROVAL,

    /**
     * Акт подписан вне системы
     * 
     */
    SIGNED_OUTSIDE,

    /**
     * Получены замечания
     * 
     */
    COMPLAINTS_RECEIVED,

    /**
     * Отказ от подписания
     * 
     */
    REJECTED,

    /**
     * Подписан заявителем
     * 
     */
    SIGNED,

    /**
     * Подписание подтверждено
     * 
     */
    APPROVED;

    public String value() {
        return name();
    }

    public static ActStatusType fromValue(String v) {
        return valueOf(v);
    }

}
