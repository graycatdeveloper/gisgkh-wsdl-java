
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статус проверки.
 * 
 * <p>Java class for ExaminationStateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ExaminationStateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <enumeration value="Planned"/>
 *     <enumeration value="Assigned"/>
 *     <enumeration value="Finished"/>
 *     <enumeration value="Cancelled"/>
 *     <enumeration value="Annulled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExaminationStateType")
@XmlEnum
public enum ExaminationStateType {


    /**
     * Выполняется.
     * 
     */
    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("Assigned")
    ASSIGNED("Assigned"),

    /**
     * Завершена.
     * 
     */
    @XmlEnumValue("Finished")
    FINISHED("Finished"),

    /**
     * Отменена.
     * 
     */
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Annulled")
    ANNULLED("Annulled");
    private final String value;

    ExaminationStateType(String v) {
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
    public static ExaminationStateType fromValue(String v) {
        for (ExaminationStateType c: ExaminationStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
