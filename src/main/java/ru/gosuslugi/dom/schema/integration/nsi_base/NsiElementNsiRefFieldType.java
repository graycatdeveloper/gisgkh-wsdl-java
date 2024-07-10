
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Ссылка на элемент внутреннего справочника" для элемента справочника.
 * 
 * <p>Java class for NsiElementNsiRefFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementNsiRefFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="NsiRef" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NsiItemRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemRegistryNumberType"/>
 *                   <element name="Ref" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
@XmlType(name = "NsiElementNsiRefFieldType", propOrder = {
    "nsiRef"
})
public class NsiElementNsiRefFieldType
    extends NsiElementFieldType
{

    /**
     * Ссылка на элемент внутреннего справочника.
     * 
     */
    @XmlElement(name = "NsiRef")
    protected NsiElementNsiRefFieldType.NsiRef nsiRef;

    /**
     * Ссылка на элемент внутреннего справочника.
     * 
     * @return
     *     possible object is
     *     {@link NsiElementNsiRefFieldType.NsiRef }
     *     
     */
    public NsiElementNsiRefFieldType.NsiRef getNsiRef() {
        return nsiRef;
    }

    /**
     * Sets the value of the nsiRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiElementNsiRefFieldType.NsiRef }
     *     
     * @see #getNsiRef()
     */
    public void setNsiRef(NsiElementNsiRefFieldType.NsiRef value) {
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
     *         <element name="Ref" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "ref"
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
         * Ссылка на элемент справочника.
         * 
         */
        @XmlElement(name = "Ref", required = true)
        protected ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef ref;

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
         * Ссылка на элемент справочника.
         * 
         * @return
         *     possible object is
         *     {@link ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef }
         *     
         */
        public ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef }
         *     
         * @see #getRef()
         */
        public void setRef(ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef value) {
            this.ref = value;
        }

    }

}
