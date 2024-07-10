
package ru.gosuslugi.dom.schema.integration.nsi_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Дата" для элемента справочника.
 * 
 * <p>Java class for NsiElementDateFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementDateFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementDateFieldType", propOrder = {
    "value"
})
public class NsiElementDateFieldType
    extends NsiElementFieldType
{

    /**
     * Значение поля элемента справочника типа "Дата".
     * 
     */
    @XmlElement(name = "Value")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar value;

    /**
     * Значение поля элемента справочника типа "Дата".
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getValue()
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

}
