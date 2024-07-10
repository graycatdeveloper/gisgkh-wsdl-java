
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Способы подачи заявления
 * 
 * <p>Java class for ApplicationMethodType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ApplicationMethodType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EPGU"/>
 *     <enumeration value="OnPaper"/>
 *     <enumeration value="InformationSystem"/>
 *     <enumeration value="ElectronicDocument"/>
 *     <enumeration value="RegisteredMail"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ApplicationMethodType")
@XmlEnum
public enum ApplicationMethodType {


    /**
     * С использованием ЕПГУ
     * 
     */
    EPGU("EPGU"),

    /**
     * На бумажном носителе
     * 
     */
    @XmlEnumValue("OnPaper")
    ON_PAPER("OnPaper"),

    /**
     * С использованием ВИС
     * 
     */
    @XmlEnumValue("InformationSystem")
    INFORMATION_SYSTEM("InformationSystem"),

    /**
     * В форме электронного документа
     * 
     */
    @XmlEnumValue("ElectronicDocument")
    ELECTRONIC_DOCUMENT("ElectronicDocument"),

    /**
     * Заказным почтовым отправлением
     * 
     */
    @XmlEnumValue("RegisteredMail")
    REGISTERED_MAIL("RegisteredMail");
    private final String value;

    ApplicationMethodType(String v) {
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
    public static ApplicationMethodType fromValue(String v) {
        for (ApplicationMethodType c: ApplicationMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
