
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Да/Нет" для элемента справочника.
 * 
 * <p>Java class for NsiElementBooleanFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementBooleanFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementBooleanFieldType", propOrder = {
    "value"
})
public class NsiElementBooleanFieldType
    extends NsiElementFieldType
{

    /**
     * Значение поля элемента справочника типа "Да/Нет".
     * 
     */
    @XmlElement(name = "Value")
    protected Boolean value;

    /**
     * Значение поля элемента справочника типа "Да/Нет".
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isValue()
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

}
