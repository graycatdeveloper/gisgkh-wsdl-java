
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Статус заявления на заключение договора о подключении
 * 
 * <p>Java class for AgreementApplicationStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AgreementApplicationStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="REJECTED"/>
 *     <enumeration value="REGISTERED"/>
 *     <enumeration value="IN_PROGRESS"/>
 *     <enumeration value="SUPPLEMENTATION"/>
 *     <enumeration value="DENIED_TC"/>
 *     <enumeration value="IN_PROGRESS_TC_CAPABILITY_CHECK"/>
 *     <enumeration value="TC_CAPABILITY_SELECTION"/>
 *     <enumeration value="ANSWER_WITH_TC_METHOD_IS_RECEIVED"/>
 *     <enumeration value="FEE_SETTING_INDIVIDUALLY"/>
 *     <enumeration value="INCLUSION_TO_INVESTMENT_PROGRAM"/>
 *     <enumeration value="DENIED_INCLUSION_TO_INVESTMENT_PROGRAM"/>
 *     <enumeration value="REJECTED_BY_APPLICANT"/>
 *     <enumeration value="COORDINATION_WITH_RELATED_ORG"/>
 *     <enumeration value="AGREEMENT_CONCLUSION"/>
 *     <enumeration value="REFUSAL_TO_SIGN_AGREEMENT"/>
 *     <enumeration value="WORKS_IN_PROGRESS"/>
 *     <enumeration value="ACT_OF_COMPLETENESS_IS_REQUESTED"/>
 *     <enumeration value="ACCEPTANCE_OPERATIONS_IN_PROGRESS"/>
 *     <enumeration value="ACT_OF_COMPLETENESS_SIGNING"/>
 *     <enumeration value="ACT_OF_TC_IS_REQUESTED"/>
 *     <enumeration value="ACT_OF_TC_SIGNING"/>
 *     <enumeration value="SERVICE_COMPLETED"/>
 *     <enumeration value="CANCELLED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgreementApplicationStatusType")
@XmlEnum
public enum AgreementApplicationStatusType {


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
     * Доукомплектование заявления
     * 
     */
    SUPPLEMENTATION,

    /**
     * Отказано в подключении
     * 
     */
    DENIED_TC,

    /**
     * В работе (проверка технической возможности)
     * 
     */
    IN_PROGRESS_TC_CAPABILITY_CHECK,

    /**
     * Выбор способа осуществления технической возможности подключения
     * 
     */
    TC_CAPABILITY_SELECTION,

    /**
     * Получен ответ о выборе способа подключения
     * 
     */
    ANSWER_WITH_TC_METHOD_IS_RECEIVED,

    /**
     * Установление платы в индивидуальном порядке
     * 
     */
    FEE_SETTING_INDIVIDUALLY,

    /**
     * Включение в инвестиционную программу
     * 
     */
    INCLUSION_TO_INVESTMENT_PROGRAM,

    /**
     * Отказано во включении в инвестиционную программу
     * 
     */
    DENIED_INCLUSION_TO_INVESTMENT_PROGRAM,

    /**
     * Заявитель отказался от подключения
     * 
     */
    REJECTED_BY_APPLICANT,

    /**
     * Согласование со смежной организацией
     * 
     */
    COORDINATION_WITH_RELATED_ORG,

    /**
     * Заключение договора
     * 
     */
    AGREEMENT_CONCLUSION,

    /**
     * Отказ от подписания договора (услуга завершена)
     * 
     */
    REFUSAL_TO_SIGN_AGREEMENT,

    /**
     * Выполняются работы по договору
     * 
     */
    WORKS_IN_PROGRESS,

    /**
     * Запрос акта о готовности
     * 
     */
    ACT_OF_COMPLETENESS_IS_REQUESTED,

    /**
     * Ведутся приемочные работы по договору
     * 
     */
    ACCEPTANCE_OPERATIONS_IN_PROGRESS,

    /**
     * Подписание акта о готовности
     * 
     */
    ACT_OF_COMPLETENESS_SIGNING,

    /**
     * Запрос акта о подключении
     * 
     */
    ACT_OF_TC_IS_REQUESTED,

    /**
     * Подписание акта о подключении
     * 
     */
    ACT_OF_TC_SIGNING,

    /**
     * Услуга завершена
     * 
     */
    SERVICE_COMPLETED,

    /**
     * Аннулировано
     * 
     */
    CANCELLED;

    public String value() {
        return name();
    }

    public static AgreementApplicationStatusType fromValue(String v) {
        return valueOf(v);
    }

}
