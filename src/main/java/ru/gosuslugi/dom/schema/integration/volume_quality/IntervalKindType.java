
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Простой тип. Вид перерыва (IntervalInProviding - Перерыв в предоставлении коммунальной услуги, RestrictionInProviding - Ограничение в предоставлении коммунальной услуги, SuspensionOfProviding - Приостановление предоставления коммунальной услуги)
 * 
 * <p>Java class for IntervalKindType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="IntervalKindType">
 *   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *     <enumeration value="IntervalInProviding"/>
 *     <enumeration value="RestrictionInProviding"/>
 *     <enumeration value="SuspensionOfProviding"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IntervalKindType")
@XmlEnum
public enum IntervalKindType {

    @XmlEnumValue("IntervalInProviding")
    INTERVAL_IN_PROVIDING("IntervalInProviding"),
    @XmlEnumValue("RestrictionInProviding")
    RESTRICTION_IN_PROVIDING("RestrictionInProviding"),
    @XmlEnumValue("SuspensionOfProviding")
    SUSPENSION_OF_PROVIDING("SuspensionOfProviding");
    private final String value;

    IntervalKindType(String v) {
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
    public static IntervalKindType fromValue(String v) {
        for (IntervalKindType c: IntervalKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
