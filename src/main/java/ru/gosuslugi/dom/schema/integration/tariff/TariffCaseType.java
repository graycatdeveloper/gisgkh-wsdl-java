
package ru.gosuslugi.dom.schema.integration.tariff;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип тарифа
 * 
 * <p>Java class for TariffCaseType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TariffCaseType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MunicipalResourceTariff"/>
 *     <enumeration value="ResidentialPremisesMaintenance"/>
 *     <enumeration value="CapitalRepairTariff"/>
 *     <enumeration value="SocialNorm"/>
 *     <enumeration value="ResidentialPremisesUsage"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TariffCaseType")
@XmlEnum
public enum TariffCaseType {


    /**
     * Тариф на оплату коммунальных ресурсов
     * 
     */
    @XmlEnumValue("MunicipalResourceTariff")
    MUNICIPAL_RESOURCE_TARIFF("MunicipalResourceTariff"),

    /**
     * Размер платы за содержание жилого помещения
     * 
     */
    @XmlEnumValue("ResidentialPremisesMaintenance")
    RESIDENTIAL_PREMISES_MAINTENANCE("ResidentialPremisesMaintenance"),

    /**
     * Минимальный размер взноса на капитальный ремонт
     * 
     */
    @XmlEnumValue("CapitalRepairTariff")
    CAPITAL_REPAIR_TARIFF("CapitalRepairTariff"),

    /**
     * Социальная норма потребления электрической энергии
     * 
     */
    @XmlEnumValue("SocialNorm")
    SOCIAL_NORM("SocialNorm"),

    /**
     * Размер платы за пользование жилым помещением
     * 
     */
    @XmlEnumValue("ResidentialPremisesUsage")
    RESIDENTIAL_PREMISES_USAGE("ResidentialPremisesUsage");
    private final String value;

    TariffCaseType(String v) {
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
    public static TariffCaseType fromValue(String v) {
        for (TariffCaseType c: TariffCaseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
