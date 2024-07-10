
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Простой тип. Вид основания (DRSO - ДРСО, ManagementContract - Договор управления, Charter - Устав)
 * 
 * <p>Java class for BaseKindShortType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BaseKindShortType">
 *   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *     <enumeration value="DRSO"/>
 *     <enumeration value="ManagementContract"/>
 *     <enumeration value="Charter"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BaseKindShortType")
@XmlEnum
public enum BaseKindShortType {

    DRSO("DRSO"),
    @XmlEnumValue("ManagementContract")
    MANAGEMENT_CONTRACT("ManagementContract"),
    @XmlEnumValue("Charter")
    CHARTER("Charter");
    private final String value;

    BaseKindShortType(String v) {
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
    public static BaseKindShortType fromValue(String v) {
        for (BaseKindShortType c: BaseKindShortType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
