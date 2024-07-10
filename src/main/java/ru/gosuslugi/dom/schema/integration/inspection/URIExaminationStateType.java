
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cтатус размещения проверки в ЕРП
 * 
 * <p>Java class for URIExaminationStateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="URIExaminationStateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Placed"/>
 *     <enumeration value="NotPlaced"/>
 *     <enumeration value="Sent"/>
 *     <enumeration value="NotSent"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "URIExaminationStateType")
@XmlEnum
public enum URIExaminationStateType {

    @XmlEnumValue("Placed")
    PLACED("Placed"),
    @XmlEnumValue("NotPlaced")
    NOT_PLACED("NotPlaced"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("NotSent")
    NOT_SENT("NotSent");
    private final String value;

    URIExaminationStateType(String v) {
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
    public static URIExaminationStateType fromValue(String v) {
        for (URIExaminationStateType c: URIExaminationStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
