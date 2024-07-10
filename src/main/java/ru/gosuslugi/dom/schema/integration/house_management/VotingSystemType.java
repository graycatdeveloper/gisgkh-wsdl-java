
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Система, в которой проводится собрание
 * 
 * <p>Java class for VotingSystemType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VotingSystemType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="HCS"/>
 *     <enumeration value="PublicServicesPortal"/>
 *     <enumeration value="Regional"/>
 *     <enumeration value="Other"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VotingSystemType")
@XmlEnum
public enum VotingSystemType {


    /**
     * ГИС ЖКХ
     * 
     */
    HCS("HCS"),

    /**
     * Федеральная государственная информационная система «Единый портал государственных и муниципальных услуг» (ЕПГУ)
     * 
     */
    @XmlEnumValue("PublicServicesPortal")
    PUBLIC_SERVICES_PORTAL("PublicServicesPortal"),

    /**
     * Региональная информационная система
     * 
     */
    @XmlEnumValue("Regional")
    REGIONAL("Regional"),

    /**
     * Иная система
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    VotingSystemType(String v) {
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
    public static VotingSystemType fromValue(String v) {
        for (VotingSystemType c: VotingSystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
