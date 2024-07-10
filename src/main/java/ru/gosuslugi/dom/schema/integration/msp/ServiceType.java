
package ru.gosuslugi.dom.schema.integration.msp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации. ColdWater - Холодное водоснабжение, HotWater - Горячее водоснабжение, Sewerage - Отведение сточных вод, Electricity - Электроснабжение, Gas - Газоснабжение, SolidFuel - Твердое топливо, LiquidGas - Газ в баллонах, Heating - Отопление, Waste - Обращение с твердыми коммунальными отходами, Maintenance - Содержание жилого помещения, Repairs - Взносы на капитальный ремонт, Rent - Наем жилого помещения, CollectiveHotWater - Горячая вода на содержание общего имущества, CollectiveColdWater - Холодная вода на содержание общего имущества, CollectiveElectricity - Электрическая энергия на содержание общего имущества, CollectiveSewerage - Отведение сточных вод на содержание общего имущества
 * 
 * <p>Java class for ServiceType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ServiceType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ColdWater"/>
 *     <enumeration value="HotWater"/>
 *     <enumeration value="Sewerage"/>
 *     <enumeration value="Electricity"/>
 *     <enumeration value="Gas"/>
 *     <enumeration value="SolidFuel"/>
 *     <enumeration value="LiquidGas"/>
 *     <enumeration value="Heating"/>
 *     <enumeration value="Waste"/>
 *     <enumeration value="Maintenance"/>
 *     <enumeration value="Repairs"/>
 *     <enumeration value="Rent"/>
 *     <enumeration value="CollectiveHotWater"/>
 *     <enumeration value="CollectiveColdWater"/>
 *     <enumeration value="CollectiveElectricity"/>
 *     <enumeration value="CollectiveSewerage"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceType")
@XmlEnum
public enum ServiceType {

    @XmlEnumValue("ColdWater")
    COLD_WATER("ColdWater"),
    @XmlEnumValue("HotWater")
    HOT_WATER("HotWater"),
    @XmlEnumValue("Sewerage")
    SEWERAGE("Sewerage"),
    @XmlEnumValue("Electricity")
    ELECTRICITY("Electricity"),
    @XmlEnumValue("Gas")
    GAS("Gas"),
    @XmlEnumValue("SolidFuel")
    SOLID_FUEL("SolidFuel"),
    @XmlEnumValue("LiquidGas")
    LIQUID_GAS("LiquidGas"),
    @XmlEnumValue("Heating")
    HEATING("Heating"),
    @XmlEnumValue("Waste")
    WASTE("Waste"),
    @XmlEnumValue("Maintenance")
    MAINTENANCE("Maintenance"),
    @XmlEnumValue("Repairs")
    REPAIRS("Repairs"),
    @XmlEnumValue("Rent")
    RENT("Rent"),
    @XmlEnumValue("CollectiveHotWater")
    COLLECTIVE_HOT_WATER("CollectiveHotWater"),
    @XmlEnumValue("CollectiveColdWater")
    COLLECTIVE_COLD_WATER("CollectiveColdWater"),
    @XmlEnumValue("CollectiveElectricity")
    COLLECTIVE_ELECTRICITY("CollectiveElectricity"),
    @XmlEnumValue("CollectiveSewerage")
    COLLECTIVE_SEWERAGE("CollectiveSewerage");
    private final String value;

    ServiceType(String v) {
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
    public static ServiceType fromValue(String v) {
        for (ServiceType c: ServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
