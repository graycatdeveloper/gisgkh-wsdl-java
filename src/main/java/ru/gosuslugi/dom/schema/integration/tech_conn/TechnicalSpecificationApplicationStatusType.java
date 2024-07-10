
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Статус заявления на предоставление технических условий подключения
 * 
 * <p>Java class for TechnicalSpecificationApplicationStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TechnicalSpecificationApplicationStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REGISTERED"/>
 *     <enumeration value="IN_PROGRESS"/>
 *     <enumeration value="ANSWER_ADDED"/>
 *     <enumeration value="ANSWER_SENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TechnicalSpecificationApplicationStatusType")
@XmlEnum
public enum TechnicalSpecificationApplicationStatusType {


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
     * В работе (добавлен ответ)
     * 
     */
    ANSWER_ADDED,

    /**
     * Отправлен ответ
     * 
     */
    ANSWER_SENT;

    public String value() {
        return name();
    }

    public static TechnicalSpecificationApplicationStatusType fromValue(String v) {
        return valueOf(v);
    }

}
