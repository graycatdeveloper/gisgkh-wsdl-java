
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Статус заявления на получение акта по договору
 * 
 * <p>Java class for ActApplicationStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ActApplicationStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REJECTED"/>
 *     <enumeration value="REGISTERED"/>
 *     <enumeration value="IN_PROGRESS"/>
 *     <enumeration value="DENIED"/>
 *     <enumeration value="AGREEMENT_NOT_FOUND"/>
 *     <enumeration value="ACCEPTANCE_OPERATIONS_IN_PROGRESS"/>
 *     <enumeration value="ACT_SIGNING"/>
 *     <enumeration value="SERVICE_COMPLETED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActApplicationStatusType")
@XmlEnum
public enum ActApplicationStatusType {


    /**
     * Отклонено
     * 
     */
    REJECTED,

    /**
     * Зарегистрировано
     * 
     */
    REGISTERED,

    /**
     * В работе
     * 
     */
    IN_PROGRESS,

    /**
     * Отказ в выдаче акта
     * 
     */
    DENIED,

    /**
     * Договор отсутствует
     * 
     */
    AGREEMENT_NOT_FOUND,

    /**
     * Проведение приемочных работ
     * 
     */
    ACCEPTANCE_OPERATIONS_IN_PROGRESS,

    /**
     * Подписание акта о готовности
     * 
     */
    ACT_SIGNING,

    /**
     * Услуга завершена
     * 
     */
    SERVICE_COMPLETED;

    public String value() {
        return name();
    }

    public static ActApplicationStatusType fromValue(String v) {
        return valueOf(v);
    }

}
