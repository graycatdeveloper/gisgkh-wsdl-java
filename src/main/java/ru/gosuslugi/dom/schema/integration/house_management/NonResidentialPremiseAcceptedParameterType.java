
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NonResidentialPremiseAcceptedParameterType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NonResidentialPremiseAcceptedParameterType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PremisesNum"/>
 *     <enumeration value="Purpose"/>
 *     <enumeration value="Position"/>
 *     <enumeration value="TotalArea"/>
 *     <enumeration value="IsCommonProperty"/>
 *     <enumeration value="TerminationDate"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NonResidentialPremiseAcceptedParameterType")
@XmlEnum
public enum NonResidentialPremiseAcceptedParameterType {

    @XmlEnumValue("PremisesNum")
    PREMISES_NUM("PremisesNum"),
    @XmlEnumValue("Purpose")
    PURPOSE("Purpose"),
    @XmlEnumValue("Position")
    POSITION("Position"),
    @XmlEnumValue("TotalArea")
    TOTAL_AREA("TotalArea"),
    @XmlEnumValue("IsCommonProperty")
    IS_COMMON_PROPERTY("IsCommonProperty"),
    @XmlEnumValue("TerminationDate")
    TERMINATION_DATE("TerminationDate");
    private final String value;

    NonResidentialPremiseAcceptedParameterType(String v) {
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
    public static NonResidentialPremiseAcceptedParameterType fromValue(String v) {
        for (NonResidentialPremiseAcceptedParameterType c: NonResidentialPremiseAcceptedParameterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
