
package ru.gosuslugi.dom.schema.integration.bills;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="InsuranceProduct" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="CreateOrUpdate">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Remove">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID"/>
 *                               <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.2.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "insuranceProduct"
})
@XmlRootElement(name = "importInsuranceProductRequest")
public class ImportInsuranceProductRequest
    extends BaseType
{

    /**
     * Страховой продукт
     * 
     */
    @XmlElement(name = "InsuranceProduct", required = true)
    protected List<ImportInsuranceProductRequest.InsuranceProduct> insuranceProduct;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Страховой продукт
     * 
     * Gets the value of the insuranceProduct property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceProduct property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInsuranceProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportInsuranceProductRequest.InsuranceProduct }
     * </p>
     * 
     * 
     * @return
     *     The value of the insuranceProduct property.
     */
    public List<ImportInsuranceProductRequest.InsuranceProduct> getInsuranceProduct() {
        if (insuranceProduct == null) {
            insuranceProduct = new ArrayList<>();
        }
        return this.insuranceProduct;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "10.0.2.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="CreateOrUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Remove">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID"/>
     *                     <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
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
        "transportGUID",
        "createOrUpdate",
        "remove"
    })
    public static class InsuranceProduct {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Создать или изменить существующий страховой продукт
         * 
         */
        @XmlElement(name = "CreateOrUpdate")
        protected ImportInsuranceProductRequest.InsuranceProduct.CreateOrUpdate createOrUpdate;
        /**
         * Удалить страховой продукт
         * 
         */
        @XmlElement(name = "Remove")
        protected ImportInsuranceProductRequest.InsuranceProduct.Remove remove;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Создать или изменить существующий страховой продукт
         * 
         * @return
         *     possible object is
         *     {@link ImportInsuranceProductRequest.InsuranceProduct.CreateOrUpdate }
         *     
         */
        public ImportInsuranceProductRequest.InsuranceProduct.CreateOrUpdate getCreateOrUpdate() {
            return createOrUpdate;
        }

        /**
         * Sets the value of the createOrUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportInsuranceProductRequest.InsuranceProduct.CreateOrUpdate }
         *     
         * @see #getCreateOrUpdate()
         */
        public void setCreateOrUpdate(ImportInsuranceProductRequest.InsuranceProduct.CreateOrUpdate value) {
            this.createOrUpdate = value;
        }

        /**
         * Удалить страховой продукт
         * 
         * @return
         *     possible object is
         *     {@link ImportInsuranceProductRequest.InsuranceProduct.Remove }
         *     
         */
        public ImportInsuranceProductRequest.InsuranceProduct.Remove getRemove() {
            return remove;
        }

        /**
         * Sets the value of the remove property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportInsuranceProductRequest.InsuranceProduct.Remove }
         *     
         * @see #getRemove()
         */
        public void setRemove(ImportInsuranceProductRequest.InsuranceProduct.Remove value) {
            this.remove = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID" minOccurs="0"/>
         *       </sequence>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "insuranceProductGUID"
        })
        public static class CreateOrUpdate
            extends InsuranceProductType
        {

            /**
             * Идентификатор страхового продукта
             * 
             */
            @XmlElement(name = "InsuranceProductGUID")
            protected String insuranceProductGUID;

            /**
             * Идентификатор страхового продукта
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceProductGUID() {
                return insuranceProductGUID;
            }

            /**
             * Sets the value of the insuranceProductGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getInsuranceProductGUID()
             */
            public void setInsuranceProductGUID(String value) {
                this.insuranceProductGUID = value;
            }

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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID"/>
         *         <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "insuranceProductGUID",
            "closeDate"
        })
        public static class Remove {

            /**
             * Идентификатор страхового продукта
             * 
             */
            @XmlElement(name = "InsuranceProductGUID", required = true)
            protected String insuranceProductGUID;
            /**
             * Дата закрытия
             * 
             */
            @XmlElement(name = "CloseDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar closeDate;

            /**
             * Идентификатор страхового продукта
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceProductGUID() {
                return insuranceProductGUID;
            }

            /**
             * Sets the value of the insuranceProductGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getInsuranceProductGUID()
             */
            public void setInsuranceProductGUID(String value) {
                this.insuranceProductGUID = value;
            }

            /**
             * Дата закрытия
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCloseDate() {
                return closeDate;
            }

            /**
             * Sets the value of the closeDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getCloseDate()
             */
            public void setCloseDate(XMLGregorianCalendar value) {
                this.closeDate = value;
            }

        }

    }

}
