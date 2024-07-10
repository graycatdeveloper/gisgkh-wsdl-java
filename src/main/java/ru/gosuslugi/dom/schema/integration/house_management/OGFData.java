
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Строка данных для объекта ЖФ
 * 
 * <p>Java class for OGFData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OGFData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Value" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFDataValue"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OGFData", propOrder = {
    "code",
    "value"
})
public class OGFData {

    /**
     * Код строки в справочнике Форма описания объектов ЖФ
     * 
     */
    @XmlElement(name = "Code", required = true)
    protected String code;
    /**
     * Значение показателя
     * 
     */
    @XmlElement(name = "Value", required = true)
    protected OGFDataValue value;

    /**
     * Код строки в справочнике Форма описания объектов ЖФ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Значение показателя
     * 
     * @return
     *     possible object is
     *     {@link OGFDataValue }
     *     
     */
    public OGFDataValue getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link OGFDataValue }
     *     
     * @see #getValue()
     */
    public void setValue(OGFDataValue value) {
        this.value = value;
    }

}
