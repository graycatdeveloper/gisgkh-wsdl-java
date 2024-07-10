
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий статус размещаемой информации в результатах экспорта. Возможные значения: Project - Проект; Placed - Размещена; Annulled - Аннулирована.
 * 
 * <p>Java class for InfoStatusExportType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="InfoStatusExportType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Project"/>
 *     <enumeration value="Placed"/>
 *     <enumeration value="Annulled"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InfoStatusExportType")
@XmlEnum
public enum InfoStatusExportType {

    @XmlEnumValue("Project")
    PROJECT("Project"),
    @XmlEnumValue("Placed")
    PLACED("Placed"),
    @XmlEnumValue("Annulled")
    ANNULLED("Annulled");
    private final String value;

    InfoStatusExportType(String v) {
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
    public static InfoStatusExportType fromValue(String v) {
        for (InfoStatusExportType c: InfoStatusExportType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
