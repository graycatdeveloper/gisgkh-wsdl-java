
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CharterStatusExportType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CharterStatusExportType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Annul"/>
 *     <enumeration value="ApprovalProcess"/>
 *     <enumeration value="Approved"/>
 *     <enumeration value="Project"/>
 *     <enumeration value="Rejected"/>
 *     <enumeration value="Reviewed"/>
 *     <enumeration value="Terminated"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CharterStatusExportType")
@XmlEnum
public enum CharterStatusExportType {

    @XmlEnumValue("Annul")
    ANNUL("Annul"),
    @XmlEnumValue("ApprovalProcess")
    APPROVAL_PROCESS("ApprovalProcess"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Reviewed")
    REVIEWED("Reviewed"),
    @XmlEnumValue("Terminated")
    TERMINATED("Terminated");
    private final String value;

    CharterStatusExportType(String v) {
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
    public static CharterStatusExportType fromValue(String v) {
        for (CharterStatusExportType c: CharterStatusExportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
