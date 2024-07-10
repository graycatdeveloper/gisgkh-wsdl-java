
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий блок информации для документа. Возможные значения: DecisionInfo - Информация о решении; AdditionalInfo - Дополнительна информация; ServicesInfo - Перечень работ и услуг.
 * 
 * <p>Java class for DecisionDocumentBlockInfoType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DecisionDocumentBlockInfoType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DecisionInfo"/>
 *     <enumeration value="AdditionalInfo"/>
 *     <enumeration value="ServicesInfo"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DecisionDocumentBlockInfoType")
@XmlEnum
public enum DecisionDocumentBlockInfoType {

    @XmlEnumValue("DecisionInfo")
    DECISION_INFO("DecisionInfo"),
    @XmlEnumValue("AdditionalInfo")
    ADDITIONAL_INFO("AdditionalInfo"),
    @XmlEnumValue("ServicesInfo")
    SERVICES_INFO("ServicesInfo");
    private final String value;

    DecisionDocumentBlockInfoType(String v) {
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
    public static DecisionDocumentBlockInfoType fromValue(String v) {
        for (DecisionDocumentBlockInfoType c: DecisionDocumentBlockInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
