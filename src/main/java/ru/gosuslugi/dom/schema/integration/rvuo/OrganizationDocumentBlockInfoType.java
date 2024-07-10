
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий блок информации для документа. Возможные значения: IncludedInfo - Информация о включении; AdditionalInfo - Дополнительна информация; ExcludedInfo - Информация об исключении.
 * 
 * <p>Java class for OrganizationDocumentBlockInfoType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="OrganizationDocumentBlockInfoType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IncludedInfo"/>
 *     <enumeration value="AdditionalInfo"/>
 *     <enumeration value="ExcludedInfo"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OrganizationDocumentBlockInfoType")
@XmlEnum
public enum OrganizationDocumentBlockInfoType {

    @XmlEnumValue("IncludedInfo")
    INCLUDED_INFO("IncludedInfo"),
    @XmlEnumValue("AdditionalInfo")
    ADDITIONAL_INFO("AdditionalInfo"),
    @XmlEnumValue("ExcludedInfo")
    EXCLUDED_INFO("ExcludedInfo");
    private final String value;

    OrganizationDocumentBlockInfoType(String v) {
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
    public static OrganizationDocumentBlockInfoType fromValue(String v) {
        for (OrganizationDocumentBlockInfoType c: OrganizationDocumentBlockInfoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
