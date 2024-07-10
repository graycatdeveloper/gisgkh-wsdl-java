
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Ссылка на элемент справочника ФИАС" для элемента справочника.
 * 
 * <p>Java class for NsiElementFiasAddressRefFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementFiasAddressRefFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="NsiRef" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="aoGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "NsiElementFiasAddressRefFieldType", propOrder = {
    "nsiRef"
})
public class NsiElementFiasAddressRefFieldType
    extends NsiElementFieldType
{

    /**
     * Ссылка на элемент справочника ФИАС.
     * 
     */
    @XmlElement(name = "NsiRef")
    protected NsiElementFiasAddressRefFieldType.NsiRef nsiRef;

    /**
     * Ссылка на элемент справочника ФИАС.
     * 
     * @return
     *     possible object is
     *     {@link NsiElementFiasAddressRefFieldType.NsiRef }
     *     
     */
    public NsiElementFiasAddressRefFieldType.NsiRef getNsiRef() {
        return nsiRef;
    }

    /**
     * Sets the value of the nsiRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiElementFiasAddressRefFieldType.NsiRef }
     *     
     * @see #getNsiRef()
     */
    public void setNsiRef(NsiElementFiasAddressRefFieldType.NsiRef value) {
        this.nsiRef = value;
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
     *         <element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="aoGuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "aoGuid"
    })
    public static class NsiRef {

        /**
         * Идентификационный код позиции в справочнике ФИАС.
         * 
         */
        @XmlElement(name = "Guid", required = true)
        protected String guid;
        /**
         * Глобально-уникальный идентификатор адресного объекта в справочнике ФИАС.
         * 
         */
        @XmlElement(required = true)
        protected String aoGuid;

        /**
         * Идентификационный код позиции в справочнике ФИАС.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuid() {
            return guid;
        }

        /**
         * Sets the value of the guid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getGuid()
         */
        public void setGuid(String value) {
            this.guid = value;
        }

        /**
         * Глобально-уникальный идентификатор адресного объекта в справочнике ФИАС.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAoGuid() {
            return aoGuid;
        }

        /**
         * Sets the value of the aoGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAoGuid()
         */
        public void setAoGuid(String value) {
            this.aoGuid = value;
        }

    }

}
