
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Категория помещения для блока
 * 
 * <p>Java class for BlockCategoryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="BlockCategoryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Residential"/>
 *     <enumeration value="NonResidential"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BlockCategoryType")
@XmlEnum
public enum BlockCategoryType {


    /**
     * Жилое
     * 
     */
    @XmlEnumValue("Residential")
    RESIDENTIAL("Residential"),

    /**
     * Нежилое
     * 
     */
    @XmlEnumValue("NonResidential")
    NON_RESIDENTIAL("NonResidential");
    private final String value;

    BlockCategoryType(String v) {
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
    public static BlockCategoryType fromValue(String v) {
        for (BlockCategoryType c: BlockCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
