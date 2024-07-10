
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Все статусы запроса в ГИС ЖКХ.
 *  
 * 				Допустимые значения:
 * 				Draft - Проект;
 * 				Processing - В обработке;
 * 				Sent - Направлен поставщикам ЖКУ;
 * 				Processed - Получен ответ;
 * 				Revoked - Отозван
 * 
 * <p>Java class for AllRequestStatusesType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AllRequestStatusesType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Draft"/>
 *     <enumeration value="Processing"/>
 *     <enumeration value="Sent"/>
 *     <enumeration value="Processed"/>
 *     <enumeration value="Revoked"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AllRequestStatusesType")
@XmlEnum
public enum AllRequestStatusesType {

    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Processed")
    PROCESSED("Processed"),
    @XmlEnumValue("Revoked")
    REVOKED("Revoked");
    private final String value;

    AllRequestStatusesType(String v) {
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
    public static AllRequestStatusesType fromValue(String v) {
        for (AllRequestStatusesType c: AllRequestStatusesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
