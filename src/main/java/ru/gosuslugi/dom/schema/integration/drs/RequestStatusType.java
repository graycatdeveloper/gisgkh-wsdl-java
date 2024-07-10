
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус запроса, направленного в ГИС ЖКХ.
 * 
 * 				Допустимые значения:
 * 				Sent - Направлен;
 * 				Processed - Получен ответ
 * 
 * <p>Java class for RequestStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RequestStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Sent"/>
 *     <enumeration value="Processed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RequestStatusType")
@XmlEnum
public enum RequestStatusType {

    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed");
    private final String value;

    RequestStatusType(String v) {
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
    public static RequestStatusType fromValue(String v) {
        for (RequestStatusType c: RequestStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
