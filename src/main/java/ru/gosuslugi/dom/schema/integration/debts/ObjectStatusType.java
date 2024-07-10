
package ru.gosuslugi.dom.schema.integration.debts;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий статус информации об объекте, по которому имеется непогашенная задолженность, подтвержденная судебным актом Возможные значения: 
 * 	DEMOLISHED - снесен;
 * 	ANNULED - аннулирован.
 * 
 * <p>Java class for ObjectStatusType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ObjectStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEMOLISHED"/>
 *     <enumeration value="ANNULED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ObjectStatusType")
@XmlEnum
public enum ObjectStatusType {

    DEMOLISHED,
    ANNULED;

    public String value() {
        return name();
    }

    public static ObjectStatusType fromValue(String v) {
        return valueOf(v);
    }

}
