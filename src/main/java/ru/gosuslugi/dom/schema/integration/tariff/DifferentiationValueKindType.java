
package ru.gosuslugi.dom.schema.integration.tariff;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип значения критерия дифференциации
 * 
 * <p>Java class for DifferentiationValueKindType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DifferentiationValueKindType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Enumeration"/>
 *     <enumeration value="FIAS"/>
 *     <enumeration value="Date"/>
 *     <enumeration value="Year"/>
 *     <enumeration value="Real"/>
 *     <enumeration value="Integer"/>
 *     <enumeration value="Boolean"/>
 *     <enumeration value="String"/>
 *     <enumeration value="Multiline"/>
 *     <enumeration value="OKTMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DifferentiationValueKindType")
@XmlEnum
public enum DifferentiationValueKindType {


    /**
     * Перечислимый
     * 
     */
    @XmlEnumValue("Enumeration")
    ENUMERATION("Enumeration"),

    /**
     * FIAS-перечислимый (выбор из справочника ФИАС)
     * 
     */
    FIAS("FIAS"),

    /**
     * Дата
     * 
     */
    @XmlEnumValue("Date")
    DATE("Date"),

    /**
     * Год
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * Вещественное число
     * 
     */
    @XmlEnumValue("Real")
    REAL("Real"),

    /**
     * Целое число
     * 
     */
    @XmlEnumValue("Integer")
    INTEGER("Integer"),

    /**
     * Логическое значение
     * 
     */
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),

    /**
     * Строка
     * 
     */
    @XmlEnumValue("String")
    STRING("String"),

    /**
     * Многострочный
     * 
     */
    @XmlEnumValue("Multiline")
    MULTILINE("Multiline"),

    /**
     * OKTMO-перечислимый (выбор из справочника ОКТМО)
     * 
     */
    OKTMO("OKTMO");
    private final String value;

    DifferentiationValueKindType(String v) {
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
    public static DifferentiationValueKindType fromValue(String v) {
        for (DifferentiationValueKindType c: DifferentiationValueKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
