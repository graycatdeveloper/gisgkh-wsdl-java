
package ru.gosuslugi.dom.schema.integration.nsi;

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
 *         <element name="ImportBaseDecisionMSP" type="{http://dom.gosuslugi.ru/schema/integration/nsi/}importBaseDecisionMSPType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="RecoverBaseDecisionMSP" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DeleteBaseDecisionMSP" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.1.0.5""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importBaseDecisionMSP",
    "recoverBaseDecisionMSP",
    "deleteBaseDecisionMSP"
})
@XmlRootElement(name = "importBaseDecisionMSPRequest")
public class ImportBaseDecisionMSPRequest
    extends BaseType
{

    /**
     * Создание/изменение элемента справочника оснований принятия решений
     * 
     */
    @XmlElement(name = "ImportBaseDecisionMSP")
    protected List<ImportBaseDecisionMSPType> importBaseDecisionMSP;
    /**
     * Восстановление элемента справочника оснований принятия решений
     * 
     */
    @XmlElement(name = "RecoverBaseDecisionMSP")
    protected List<ImportBaseDecisionMSPRequest.RecoverBaseDecisionMSP> recoverBaseDecisionMSP;
    /**
     * Удаление элемента справочника оснований принятия решений
     * 
     */
    @XmlElement(name = "DeleteBaseDecisionMSP")
    protected List<ImportBaseDecisionMSPRequest.DeleteBaseDecisionMSP> deleteBaseDecisionMSP;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Создание/изменение элемента справочника оснований принятия решений
     * 
     * Gets the value of the importBaseDecisionMSP property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importBaseDecisionMSP property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportBaseDecisionMSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportBaseDecisionMSPType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importBaseDecisionMSP property.
     */
    public List<ImportBaseDecisionMSPType> getImportBaseDecisionMSP() {
        if (importBaseDecisionMSP == null) {
            importBaseDecisionMSP = new ArrayList<>();
        }
        return this.importBaseDecisionMSP;
    }

    /**
     * Восстановление элемента справочника оснований принятия решений
     * 
     * Gets the value of the recoverBaseDecisionMSP property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverBaseDecisionMSP property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecoverBaseDecisionMSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportBaseDecisionMSPRequest.RecoverBaseDecisionMSP }
     * </p>
     * 
     * 
     * @return
     *     The value of the recoverBaseDecisionMSP property.
     */
    public List<ImportBaseDecisionMSPRequest.RecoverBaseDecisionMSP> getRecoverBaseDecisionMSP() {
        if (recoverBaseDecisionMSP == null) {
            recoverBaseDecisionMSP = new ArrayList<>();
        }
        return this.recoverBaseDecisionMSP;
    }

    /**
     * Удаление элемента справочника оснований принятия решений
     * 
     * Gets the value of the deleteBaseDecisionMSP property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteBaseDecisionMSP property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteBaseDecisionMSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportBaseDecisionMSPRequest.DeleteBaseDecisionMSP }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteBaseDecisionMSP property.
     */
    public List<ImportBaseDecisionMSPRequest.DeleteBaseDecisionMSP> getDeleteBaseDecisionMSP() {
        if (deleteBaseDecisionMSP == null) {
            deleteBaseDecisionMSP = new ArrayList<>();
        }
        return this.deleteBaseDecisionMSP;
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
            return "11.1.0.5";
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
     *         <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "elementGuid"
    })
    public static class DeleteBaseDecisionMSP {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор существующего элемента справочника.
         * 
         */
        @XmlElement(name = "ElementGuid", required = true)
        protected String elementGuid;

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
         * Идентификатор существующего элемента справочника.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementGuid() {
            return elementGuid;
        }

        /**
         * Sets the value of the elementGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getElementGuid()
         */
        public void setElementGuid(String value) {
            this.elementGuid = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "elementGuid"
    })
    public static class RecoverBaseDecisionMSP {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор существующего элемента справочника.
         * 
         */
        @XmlElement(name = "ElementGuid", required = true)
        protected String elementGuid;

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
         * Идентификатор существующего элемента справочника.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementGuid() {
            return elementGuid;
        }

        /**
         * Sets the value of the elementGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getElementGuid()
         */
        public void setElementGuid(String value) {
            this.elementGuid = value;
        }

    }

}
