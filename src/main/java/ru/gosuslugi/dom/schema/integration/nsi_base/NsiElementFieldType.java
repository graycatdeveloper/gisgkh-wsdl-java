
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля для элемента справочника. Абстрактный тип.
 * 
 * <p>Java class for NsiElementFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementFieldType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}FieldNameType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementFieldType", propOrder = {
    "name"
})
@XmlSeeAlso({
    NsiElementStringFieldType.class,
    NsiElementBooleanFieldType.class,
    NsiElementFloatFieldType.class,
    NsiElementDateFieldType.class,
    NsiElementIntegerFieldType.class,
    NsiElementEnumFieldType.class,
    NsiElementNsiFieldType.class,
    NsiElementNsiRefFieldType.class,
    NsiElementOkeiRefFieldType.class,
    NsiElementFiasAddressRefFieldType.class,
    NsiElementAttachmentFieldType.class
})
public abstract class NsiElementFieldType {

    /**
     * Наименование поля элемента справочника.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;

    /**
     * Наименование поля элемента справочника.
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

}
