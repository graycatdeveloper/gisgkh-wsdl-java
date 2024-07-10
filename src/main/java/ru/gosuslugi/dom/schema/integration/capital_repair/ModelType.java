
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип модели выставления ПД
 * 
 * <p>Java class for ModelType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ModelType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="SeparatePD"/>
 *     <enumeration value="UnifiedPD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ModelType")
@XmlEnum
public enum ModelType {


    /**
     * Отдельным платежным документом
     * 
     */
    @XmlEnumValue("SeparatePD")
    SEPARATE_PD("SeparatePD"),

    /**
     * В составе единого платежного документа
     * 
     */
    @XmlEnumValue("UnifiedPD")
    UNIFIED_PD("UnifiedPD");
    private final String value;

    ModelType(String v) {
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
    public static ModelType fromValue(String v) {
        for (ModelType c: ModelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
