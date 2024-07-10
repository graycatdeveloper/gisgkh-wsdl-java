
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус периода регистрации (Draft - Проект, Placed - Информация размещена, Annulled - Информация аннулирована)
 * 
 * <p>Java class for RegistrationPeriodStateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="RegistrationPeriodStateType">
 *   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *     <enumeration value="Draft"/>
 *     <enumeration value="Placed"/>
 *     <enumeration value="Annulled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RegistrationPeriodStateType")
@XmlEnum
public enum RegistrationPeriodStateType {

    @XmlEnumValue("Draft")
    DRAFT("Draft"),
    @XmlEnumValue("Placed")
    PLACED("Placed"),
    @XmlEnumValue("Annulled")
    ANNULLED("Annulled");
    private final String value;

    RegistrationPeriodStateType(String v) {
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
    public static RegistrationPeriodStateType fromValue(String v) {
        for (RegistrationPeriodStateType c: RegistrationPeriodStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
