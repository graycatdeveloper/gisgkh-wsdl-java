
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Скалярный тип. Вид акта по договору о подключении
 * 
 * <p>Java class for ActKindType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ActKindType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IntermediateCertificate"/>
 *     <enumeration value="FinalCertificate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ActKindType")
@XmlEnum
public enum ActKindType {


    /**
     * Акт о готовности
     * 
     */
    @XmlEnumValue("IntermediateCertificate")
    INTERMEDIATE_CERTIFICATE("IntermediateCertificate"),

    /**
     * Акт о подключении
     * 
     */
    @XmlEnumValue("FinalCertificate")
    FINAL_CERTIFICATE("FinalCertificate");
    private final String value;

    ActKindType(String v) {
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
    public static ActKindType fromValue(String v) {
        for (ActKindType c: ActKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
