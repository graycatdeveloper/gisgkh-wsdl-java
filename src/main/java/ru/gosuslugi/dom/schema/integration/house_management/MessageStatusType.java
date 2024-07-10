
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус сообщения о проведении общего собрания
 * 
 * <p>Java class for MessageStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MessageStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Posted"/>
 *     <enumeration value="Goes"/>
 *     <enumeration value="Finished"/>
 *     <enumeration value="MeetingCancelled"/>
 *     <enumeration value="Cancelled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MessageStatusType")
@XmlEnum
public enum MessageStatusType {

    @XmlEnumValue("Posted")
    POSTED("Posted"),
    @XmlEnumValue("Goes")
    GOES("Goes"),
    @XmlEnumValue("Finished")
    FINISHED("Finished"),
    @XmlEnumValue("MeetingCancelled")
    MEETING_CANCELLED("MeetingCancelled"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    MessageStatusType(String v) {
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
    public static MessageStatusType fromValue(String v) {
        for (MessageStatusType c: MessageStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
