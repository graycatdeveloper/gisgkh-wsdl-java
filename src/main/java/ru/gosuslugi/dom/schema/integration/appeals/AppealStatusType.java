
package ru.gosuslugi.dom.schema.integration.appeals;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус обращения. Send - Отправлено/Получено, Executed - Исполнено, Withdrawn - Отозвано, InWork - В работе
 * 
 * <p>Java class for AppealStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AppealStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Send"/>
 *     <enumeration value="Executed"/>
 *     <enumeration value="Withdrawn"/>
 *     <enumeration value="InWork"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AppealStatusType")
@XmlEnum
public enum AppealStatusType {

    @XmlEnumValue("Send")
    SEND("Send"),
    @XmlEnumValue("Executed")
    EXECUTED("Executed"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),
    @XmlEnumValue("InWork")
    IN_WORK("InWork");
    private final String value;

    AppealStatusType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static AppealStatusType fromValue(String v) {
        for (AppealStatusType c: AppealStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
