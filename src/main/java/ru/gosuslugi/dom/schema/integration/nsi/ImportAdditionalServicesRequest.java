
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
 *         <element name="ImportAdditionalServiceType" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="AdditionalServiceTypeName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *                   <choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
 *                     <element name="StringDimensionUnit">
 *                       <simpleType>
 *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RecoverAdditionalServiceType" maxOccurs="1000" minOccurs="0">
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
 *         <element name="DeleteAdditionalServiceType" maxOccurs="1000" minOccurs="0">
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importAdditionalServiceType",
    "recoverAdditionalServiceType",
    "deleteAdditionalServiceType"
})
@XmlRootElement(name = "importAdditionalServicesRequest")
public class ImportAdditionalServicesRequest
    extends BaseType
{

    /**
     * Создание/изменение вида дополнительной услуги.
     * 
     */
    @XmlElement(name = "ImportAdditionalServiceType")
    protected List<ImportAdditionalServicesRequest.ImportAdditionalServiceType> importAdditionalServiceType;
    /**
     * Восстановление вида дополнительной услуги.
     * 
     */
    @XmlElement(name = "RecoverAdditionalServiceType")
    protected List<ImportAdditionalServicesRequest.RecoverAdditionalServiceType> recoverAdditionalServiceType;
    /**
     * Удаление вида дополнительной услуги.
     * 
     */
    @XmlElement(name = "DeleteAdditionalServiceType")
    protected List<ImportAdditionalServicesRequest.DeleteAdditionalServiceType> deleteAdditionalServiceType;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Создание/изменение вида дополнительной услуги.
     * 
     * Gets the value of the importAdditionalServiceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importAdditionalServiceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportAdditionalServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAdditionalServicesRequest.ImportAdditionalServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importAdditionalServiceType property.
     */
    public List<ImportAdditionalServicesRequest.ImportAdditionalServiceType> getImportAdditionalServiceType() {
        if (importAdditionalServiceType == null) {
            importAdditionalServiceType = new ArrayList<>();
        }
        return this.importAdditionalServiceType;
    }

    /**
     * Восстановление вида дополнительной услуги.
     * 
     * Gets the value of the recoverAdditionalServiceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverAdditionalServiceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecoverAdditionalServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAdditionalServicesRequest.RecoverAdditionalServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the recoverAdditionalServiceType property.
     */
    public List<ImportAdditionalServicesRequest.RecoverAdditionalServiceType> getRecoverAdditionalServiceType() {
        if (recoverAdditionalServiceType == null) {
            recoverAdditionalServiceType = new ArrayList<>();
        }
        return this.recoverAdditionalServiceType;
    }

    /**
     * Удаление вида дополнительной услуги.
     * 
     * Gets the value of the deleteAdditionalServiceType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteAdditionalServiceType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteAdditionalServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAdditionalServicesRequest.DeleteAdditionalServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteAdditionalServiceType property.
     */
    public List<ImportAdditionalServicesRequest.DeleteAdditionalServiceType> getDeleteAdditionalServiceType() {
        if (deleteAdditionalServiceType == null) {
            deleteAdditionalServiceType = new ArrayList<>();
        }
        return this.deleteAdditionalServiceType;
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
            return "10.0.1.2";
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
    public static class DeleteAdditionalServiceType {

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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <element name="AdditionalServiceTypeName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
     *         <choice>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
     *           <element name="StringDimensionUnit">
     *             <simpleType>
     *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
     *                 <minLength value="1"/>
     *               </restriction>
     *             </simpleType>
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
        "elementGuid",
        "additionalServiceTypeName",
        "okei",
        "stringDimensionUnit"
    })
    public static class ImportAdditionalServiceType {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор существующего элемента справочника
         * 
         */
        @XmlElement(name = "ElementGuid")
        protected String elementGuid;
        /**
         * Наименование вида дополнительной услуги.
         * 
         */
        @XmlElement(name = "AdditionalServiceTypeName", required = true)
        protected String additionalServiceTypeName;
        /**
         * Единица измерения из справочника ОКЕИ.
         * 
         */
        @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected String okei;
        /**
         * (параметр более не поддерживается)
         * Другая единица измерения.
         * 
         */
        @XmlElement(name = "StringDimensionUnit")
        protected String stringDimensionUnit;

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
         * Идентификатор существующего элемента справочника
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

        /**
         * Наименование вида дополнительной услуги.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalServiceTypeName() {
            return additionalServiceTypeName;
        }

        /**
         * Sets the value of the additionalServiceTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalServiceTypeName()
         */
        public void setAdditionalServiceTypeName(String value) {
            this.additionalServiceTypeName = value;
        }

        /**
         * Единица измерения из справочника ОКЕИ.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOKEI() {
            return okei;
        }

        /**
         * Sets the value of the okei property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOKEI()
         */
        public void setOKEI(String value) {
            this.okei = value;
        }

        /**
         * (параметр более не поддерживается)
         * Другая единица измерения.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStringDimensionUnit() {
            return stringDimensionUnit;
        }

        /**
         * Sets the value of the stringDimensionUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getStringDimensionUnit()
         */
        public void setStringDimensionUnit(String value) {
            this.stringDimensionUnit = value;
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
    public static class RecoverAdditionalServiceType {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор ранее существовавшего  элемента справочника.
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
         * Идентификатор ранее существовавшего  элемента справочника.
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
