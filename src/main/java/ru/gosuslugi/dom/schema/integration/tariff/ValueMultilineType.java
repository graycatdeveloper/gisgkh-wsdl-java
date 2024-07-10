
package ru.gosuslugi.dom.schema.integration.tariff;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Критерий дифференциации многострокового типа
 * 
 * <p>Java class for ValueMultilineType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ValueMultilineType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String500Type"/>
 *         <element name="Value" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String2000Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueMultilineType", propOrder = {
    "name",
    "value"
})
public class ValueMultilineType {

    /**
     * Наименование критерия
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Значение
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected String value;

    /**
     * Наименование критерия
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Значение
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getValue()
     */
    public void setValue(String value) {
        this.value = value;
    }

}
