
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Вещественное" для элемента справочника.
 * 
 * <p>Java class for NsiElementFloatFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementFloatFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementFloatFieldType", propOrder = {
    "value"
})
public class NsiElementFloatFieldType
    extends NsiElementFieldType
{

    /**
     * Значение поля элемента справочника типа "Вещественное".
     * 
     */
    @XmlElement(name = "Value")
    protected Float value;

    /**
     * Значение поля элемента справочника типа "Вещественное".
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     * @see #getValue()
     */
    public void setValue(Float value) {
        this.value = value;
    }

}
