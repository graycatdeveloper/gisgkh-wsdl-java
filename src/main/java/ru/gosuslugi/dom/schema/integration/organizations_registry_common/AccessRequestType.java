
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип заявки на предоставление доступа
 * 
 * <p>Java class for AccessRequestType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AccessRequestType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ForInformationSystemOperator"/>
 *     <enumeration value="ForCalculationCenter"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccessRequestType")
@XmlEnum
public enum AccessRequestType {


    /**
     * Для оператора информационной системы
     * 
     */
    @XmlEnumValue("ForInformationSystemOperator")
    FOR_INFORMATION_SYSTEM_OPERATOR("ForInformationSystemOperator"),

    /**
     * Для расчетного центра
     * 
     */
    @XmlEnumValue("ForCalculationCenter")
    FOR_CALCULATION_CENTER("ForCalculationCenter");
    private final String value;

    AccessRequestType(String v) {
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
    public static AccessRequestType fromValue(String v) {
        for (AccessRequestType c: AccessRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
