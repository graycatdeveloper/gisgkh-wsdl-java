
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Целое число" для элемента справочника.
 * 
 * <p>Java class for NsiElementIntegerFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementIntegerFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementIntegerFieldType", propOrder = {
    "value"
})
public class NsiElementIntegerFieldType
    extends NsiElementFieldType
{

    /**
     * Значение поля элемента справочника типа "Целое число".
     * 
     */
    @XmlElement(name = "Value")
    protected BigInteger value;

    /**
     * Значение поля элемента справочника типа "Целое число".
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getValue()
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

}
