
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Перечислимый" для элемента справочника.
 * 
 * <p>Java class for NsiElementEnumFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementEnumFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Position" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="GUID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementEnumFieldType", propOrder = {
    "position"
})
public class NsiElementEnumFieldType
    extends NsiElementFieldType
{

    /**
     * Запись элемента справочника типа "Перечислимый".
     * 
     */
    @XmlElement(name = "Position")
    protected List<NsiElementEnumFieldType.Position> position;

    /**
     * Запись элемента справочника типа "Перечислимый".
     * 
     * Gets the value of the position property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiElementEnumFieldType.Position }
     * </p>
     * 
     * 
     * @return
     *     The value of the position property.
     */
    public List<NsiElementEnumFieldType.Position> getPosition() {
        if (position == null) {
            position = new ArrayList<>();
        }
        return this.position;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="GUID" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         <element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guid",
        "value"
    })
    public static class Position {

        /**
         * Код поля элемента справочника типа "Перечислимый".
         * 
         */
        @XmlElement(name = "GUID", required = true)
        protected Object guid;
        /**
         * Значение поля элемента справочника типа "Перечислимый".
         * 
         */
        @XmlElement(name = "Value", required = true)
        protected String value;

        /**
         * Код поля элемента справочника типа "Перечислимый".
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getGUID() {
            return guid;
        }

        /**
         * Sets the value of the guid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         * @see #getGUID()
         */
        public void setGUID(Object value) {
            this.guid = value;
        }

        /**
         * Значение поля элемента справочника типа "Перечислимый".
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

}
