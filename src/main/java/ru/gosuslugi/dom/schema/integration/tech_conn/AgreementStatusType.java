
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Статус договора о подключении
 * 
 * <p>Java class for AgreementStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AgreementStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PROJECT"/>
 *     <enumeration value="APPROVAL_WITH_APPLICANT"/>
 *     <enumeration value="PROTOCOL_OF_DISAGREEMENT_RECEIVED"/>
 *     <enumeration value="REFUSAL_TO_SIGN"/>
 *     <enumeration value="SIGNED_BY_APPLICANT"/>
 *     <enumeration value="SIGNING_APPROVED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AgreementStatusType")
@XmlEnum
public enum AgreementStatusType {


    /**
     * Проект
     * 
     */
    PROJECT,

    /**
     * Согласование с заявителем
     * 
     */
    APPROVAL_WITH_APPLICANT,

    /**
     * Получен протокол разногласий
     * 
     */
    PROTOCOL_OF_DISAGREEMENT_RECEIVED,

    /**
     * Отказ от подписания
     * 
     */
    REFUSAL_TO_SIGN,

    /**
     * Подписан заявителем
     * 
     */
    SIGNED_BY_APPLICANT,

    /**
     * Подписание подтверждено
     * 
     */
    SIGNING_APPROVED;

    public String value() {
        return name();
    }

    public static AgreementStatusType fromValue(String v) {
        return valueOf(v);
    }

}
