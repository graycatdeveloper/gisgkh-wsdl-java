
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус объекта управления
 * 
 * <p>Java class for StatusMKDType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StatusMKDType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Project"/>
 *     <enumeration value="Rejected"/>
 *     <enumeration value="ApprovalProcess"/>
 *     <enumeration value="Approved"/>
 *     <enumeration value="Locked"/>
 *     <enumeration value="Annul"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatusMKDType")
@XmlEnum
public enum StatusMKDType {

    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("ApprovalProcess")
    APPROVAL_PROCESS("ApprovalProcess"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Annul")
    ANNUL("Annul");
    private final String value;

    StatusMKDType(String v) {
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
    public static StatusMKDType fromValue(String v) {
        for (StatusMKDType c: StatusMKDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
