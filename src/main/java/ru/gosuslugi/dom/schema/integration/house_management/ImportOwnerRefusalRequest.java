
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="OwnerRefusal" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="Publish">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="OwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Edit">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OwnerRefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="OwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Annulment">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OwnerRefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.1.8.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ownerRefusal"
})
@XmlRootElement(name = "importOwnerRefusalRequest")
public class ImportOwnerRefusalRequest
    extends BaseType
{

    /**
     * Письменные отказы собственников
     * 
     */
    @XmlElement(name = "OwnerRefusal", required = true)
    protected List<ImportOwnerRefusalRequest.OwnerRefusal> ownerRefusal;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Письменные отказы собственников
     * 
     * Gets the value of the ownerRefusal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerRefusal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOwnerRefusal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOwnerRefusalRequest.OwnerRefusal }
     * </p>
     * 
     * 
     * @return
     *     The value of the ownerRefusal property.
     */
    public List<ImportOwnerRefusalRequest.OwnerRefusal> getOwnerRefusal() {
        if (ownerRefusal == null) {
            ownerRefusal = new ArrayList<>();
        }
        return this.ownerRefusal;
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
            return "13.1.8.1";
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         </sequence>
     *         <choice>
     *           <element name="Publish">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="OwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Edit">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OwnerRefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="OwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Annulment">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OwnerRefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "publish",
        "edit",
        "annulment"
    })
    public static class OwnerRefusal {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Разместить письменный отказ собственника
         * 
         */
        @XmlElement(name = "Publish")
        protected ImportOwnerRefusalRequest.OwnerRefusal.Publish publish;
        /**
         * Внести изменения в ранее размещенный письменный отказ собственника
         * 
         */
        @XmlElement(name = "Edit")
        protected ImportOwnerRefusalRequest.OwnerRefusal.Edit edit;
        /**
         * Аннулировать письменный отказ собственника
         * 
         */
        @XmlElement(name = "Annulment")
        protected ImportOwnerRefusalRequest.OwnerRefusal.Annulment annulment;

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
         * Разместить письменный отказ собственника
         * 
         * @return
         *     possible object is
         *     {@link ImportOwnerRefusalRequest.OwnerRefusal.Publish }
         *     
         */
        public ImportOwnerRefusalRequest.OwnerRefusal.Publish getPublish() {
            return publish;
        }

        /**
         * Sets the value of the publish property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOwnerRefusalRequest.OwnerRefusal.Publish }
         *     
         * @see #getPublish()
         */
        public void setPublish(ImportOwnerRefusalRequest.OwnerRefusal.Publish value) {
            this.publish = value;
        }

        /**
         * Внести изменения в ранее размещенный письменный отказ собственника
         * 
         * @return
         *     possible object is
         *     {@link ImportOwnerRefusalRequest.OwnerRefusal.Edit }
         *     
         */
        public ImportOwnerRefusalRequest.OwnerRefusal.Edit getEdit() {
            return edit;
        }

        /**
         * Sets the value of the edit property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOwnerRefusalRequest.OwnerRefusal.Edit }
         *     
         * @see #getEdit()
         */
        public void setEdit(ImportOwnerRefusalRequest.OwnerRefusal.Edit value) {
            this.edit = value;
        }

        /**
         * Аннулировать письменный отказ собственника
         * 
         * @return
         *     possible object is
         *     {@link ImportOwnerRefusalRequest.OwnerRefusal.Annulment }
         *     
         */
        public ImportOwnerRefusalRequest.OwnerRefusal.Annulment getAnnulment() {
            return annulment;
        }

        /**
         * Sets the value of the annulment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOwnerRefusalRequest.OwnerRefusal.Annulment }
         *     
         * @see #getAnnulment()
         */
        public void setAnnulment(ImportOwnerRefusalRequest.OwnerRefusal.Annulment value) {
            this.annulment = value;
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
         *         <element name="OwnerRefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "ownerRefusalGUID"
        })
        public static class Annulment {

            /**
             * Корневой идентификатор письменного отказа собственника в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "OwnerRefusalGUID", required = true)
            protected String ownerRefusalGUID;

            /**
             * Корневой идентификатор письменного отказа собственника в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerRefusalGUID() {
                return ownerRefusalGUID;
            }

            /**
             * Sets the value of the ownerRefusalGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOwnerRefusalGUID()
             */
            public void setOwnerRefusalGUID(String value) {
                this.ownerRefusalGUID = value;
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
         *         <element name="OwnerRefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="OwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalType"/>
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
            "ownerRefusalGUID",
            "ownerRefusal"
        })
        public static class Edit {

            /**
             * Корневой идентификатор письменного отказа собственника в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "OwnerRefusalGUID", required = true)
            protected String ownerRefusalGUID;
            /**
             * Письменный отказ собственника
             * 
             */
            @XmlElement(name = "OwnerRefusal", required = true)
            protected OwnerRefusalType ownerRefusal;

            /**
             * Корневой идентификатор письменного отказа собственника в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerRefusalGUID() {
                return ownerRefusalGUID;
            }

            /**
             * Sets the value of the ownerRefusalGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOwnerRefusalGUID()
             */
            public void setOwnerRefusalGUID(String value) {
                this.ownerRefusalGUID = value;
            }

            /**
             * Письменный отказ собственника
             * 
             * @return
             *     possible object is
             *     {@link OwnerRefusalType }
             *     
             */
            public OwnerRefusalType getOwnerRefusal() {
                return ownerRefusal;
            }

            /**
             * Sets the value of the ownerRefusal property.
             * 
             * @param value
             *     allowed object is
             *     {@link OwnerRefusalType }
             *     
             * @see #getOwnerRefusal()
             */
            public void setOwnerRefusal(OwnerRefusalType value) {
                this.ownerRefusal = value;
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
         *         <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="OwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalType"/>
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
            "messageGUID",
            "ownerRefusal"
        })
        public static class Publish {

            /**
             * Корневой идентификатор сообщения о проведении общего собрания собственников
             * 
             */
            @XmlElement(name = "MessageGUID", required = true)
            protected String messageGUID;
            /**
             * Письменный отказ собственника
             * 
             */
            @XmlElement(name = "OwnerRefusal", required = true)
            protected OwnerRefusalType ownerRefusal;

            /**
             * Корневой идентификатор сообщения о проведении общего собрания собственников
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageGUID() {
                return messageGUID;
            }

            /**
             * Sets the value of the messageGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getMessageGUID()
             */
            public void setMessageGUID(String value) {
                this.messageGUID = value;
            }

            /**
             * Письменный отказ собственника
             * 
             * @return
             *     possible object is
             *     {@link OwnerRefusalType }
             *     
             */
            public OwnerRefusalType getOwnerRefusal() {
                return ownerRefusal;
            }

            /**
             * Sets the value of the ownerRefusal property.
             * 
             * @param value
             *     allowed object is
             *     {@link OwnerRefusalType }
             *     
             * @see #getOwnerRefusal()
             */
            public void setOwnerRefusal(OwnerRefusalType value) {
                this.ownerRefusal = value;
            }

        }

    }

}
