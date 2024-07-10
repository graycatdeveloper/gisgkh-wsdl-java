
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Ссылка на справочник" для элемента справочника.
 * 
 * <p>Java class for NsiElementNsiFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementNsiFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="NsiRef" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NsiItemRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemRegistryNumberType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}ListGroup"/>
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
@XmlType(name = "NsiElementNsiFieldType", propOrder = {
    "nsiRef"
})
public class NsiElementNsiFieldType
    extends NsiElementFieldType
{

    /**
     * Ссылка на справочник.
     * 
     */
    @XmlElement(name = "NsiRef")
    protected NsiElementNsiFieldType.NsiRef nsiRef;

    /**
     * Ссылка на справочник.
     * 
     * @return
     *     possible object is
     *     {@link NsiElementNsiFieldType.NsiRef }
     *     
     */
    public NsiElementNsiFieldType.NsiRef getNsiRef() {
        return nsiRef;
    }

    /**
     * Sets the value of the nsiRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiElementNsiFieldType.NsiRef }
     *     
     * @see #getNsiRef()
     */
    public void setNsiRef(NsiElementNsiFieldType.NsiRef value) {
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
     *         <element name="NsiItemRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemRegistryNumberType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}ListGroup"/>
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
        "nsiItemRegistryNumber",
        "listGroup"
    })
    public static class NsiRef {

        /**
         * Реестровый номер справочника.
         * 
         */
        @XmlElement(name = "NsiItemRegistryNumber", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger nsiItemRegistryNumber;
        /**
         * Группа справочника:
         * NSI - (по умолчанию) общесистемный 
         * NSIRAO - ОЖФ
         * 
         */
        @XmlElement(name = "ListGroup", required = true)
        protected String listGroup;

        /**
         * Реестровый номер справочника.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNsiItemRegistryNumber() {
            return nsiItemRegistryNumber;
        }

        /**
         * Sets the value of the nsiItemRegistryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getNsiItemRegistryNumber()
         */
        public void setNsiItemRegistryNumber(BigInteger value) {
            this.nsiItemRegistryNumber = value;
        }

        /**
         * Группа справочника:
         * NSI - (по умолчанию) общесистемный 
         * NSIRAO - ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListGroup() {
            return listGroup;
        }

        /**
         * Sets the value of the listGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getListGroup()
         */
        public void setListGroup(String value) {
            this.listGroup = value;
        }

    }

}
