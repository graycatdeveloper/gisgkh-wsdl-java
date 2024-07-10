
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус заявки на предоставление доступа
 * 
 * <p>Java class for AccessRequestStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AccessRequestStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Created"/>
 *     <enumeration value="Accepted"/>
 *     <enumeration value="Declined"/>
 *     <enumeration value="Revoked"/>
 *     <enumeration value="Annulled"/>
 *     <enumeration value="Closed"/>
 *     <enumeration value="Preset"/>
 *     <enumeration value="Waiting_approval"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AccessRequestStatus")
@XmlEnum
public enum AccessRequestStatus {


    /**
     * Создана
     * 
     */
    @XmlEnumValue("Created")
    CREATED("Created"),

    /**
     * Принята
     * 
     */
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),

    /**
     * Отозвана
     * 
     */
    @XmlEnumValue("Revoked")
    REVOKED("Revoked"),
    @XmlEnumValue("Annulled")
    ANNULLED("Annulled"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Preset")
    PRESET("Preset"),
    @XmlEnumValue("Waiting_approval")
    WAITING_APPROVAL("Waiting_approval");
    private final String value;

    AccessRequestStatus(String v) {
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
    public static AccessRequestStatus fromValue(String v) {
        for (AccessRequestStatus c: AccessRequestStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
