
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус ответа на подзапрос, сформированный ГИС ЖКХ.
 * 
 * 				Допустимые значения:
 * 				NotSent - Не отправлен;
 * 				Sent - Отправлен;
 * 				AutoGenerated - Сформирован автоматически
 * 
 * <p>Java class for ResponseStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ResponseStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotSent"/>
 *     <enumeration value="Sent"/>
 *     <enumeration value="AutoGenerated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResponseStatusType")
@XmlEnum
public enum ResponseStatusType {

    @XmlEnumValue("NotSent")
    NOT_SENT("NotSent"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("AutoGenerated")
    AUTO_GENERATED("AutoGenerated");
    private final String value;

    ResponseStatusType(String v) {
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
    public static ResponseStatusType fromValue(String v) {
        for (ResponseStatusType c: ResponseStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
