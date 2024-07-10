
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
 *         <element name="ImportCommunalInfrastructureSystem" type="{http://dom.gosuslugi.ru/schema/integration/nsi/}importCommunalInfrastructureSystemType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="RecoverCommunalInfrastructureSystem" maxOccurs="1000" minOccurs="0">
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
 *         <element name="DeleteCommunalInfrastructureSystem" maxOccurs="1000" minOccurs="0">
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.5.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importCommunalInfrastructureSystem",
    "recoverCommunalInfrastructureSystem",
    "deleteCommunalInfrastructureSystem"
})
@XmlRootElement(name = "importCommunalInfrastructureSystemRequest")
public class ImportCommunalInfrastructureSystemRequest
    extends BaseType
{

    /**
     * Создание/изменение элемента справочника коммунальной инфраструктуры
     * 
     */
    @XmlElement(name = "ImportCommunalInfrastructureSystem")
    protected List<ImportCommunalInfrastructureSystemType> importCommunalInfrastructureSystem;
    /**
     * Восстановление элемента справочника коммунальной инфраструктуры
     * 
     */
    @XmlElement(name = "RecoverCommunalInfrastructureSystem")
    protected List<ImportCommunalInfrastructureSystemRequest.RecoverCommunalInfrastructureSystem> recoverCommunalInfrastructureSystem;
    /**
     * Удаление элемента справочника коммунальной инфраструктуры
     * 
     */
    @XmlElement(name = "DeleteCommunalInfrastructureSystem")
    protected List<ImportCommunalInfrastructureSystemRequest.DeleteCommunalInfrastructureSystem> deleteCommunalInfrastructureSystem;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Создание/изменение элемента справочника коммунальной инфраструктуры
     * 
     * Gets the value of the importCommunalInfrastructureSystem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importCommunalInfrastructureSystem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportCommunalInfrastructureSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCommunalInfrastructureSystemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importCommunalInfrastructureSystem property.
     */
    public List<ImportCommunalInfrastructureSystemType> getImportCommunalInfrastructureSystem() {
        if (importCommunalInfrastructureSystem == null) {
            importCommunalInfrastructureSystem = new ArrayList<>();
        }
        return this.importCommunalInfrastructureSystem;
    }

    /**
     * Восстановление элемента справочника коммунальной инфраструктуры
     * 
     * Gets the value of the recoverCommunalInfrastructureSystem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverCommunalInfrastructureSystem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecoverCommunalInfrastructureSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCommunalInfrastructureSystemRequest.RecoverCommunalInfrastructureSystem }
     * </p>
     * 
     * 
     * @return
     *     The value of the recoverCommunalInfrastructureSystem property.
     */
    public List<ImportCommunalInfrastructureSystemRequest.RecoverCommunalInfrastructureSystem> getRecoverCommunalInfrastructureSystem() {
        if (recoverCommunalInfrastructureSystem == null) {
            recoverCommunalInfrastructureSystem = new ArrayList<>();
        }
        return this.recoverCommunalInfrastructureSystem;
    }

    /**
     * Удаление элемента справочника коммунальной инфраструктуры
     * 
     * Gets the value of the deleteCommunalInfrastructureSystem property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteCommunalInfrastructureSystem property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteCommunalInfrastructureSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCommunalInfrastructureSystemRequest.DeleteCommunalInfrastructureSystem }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteCommunalInfrastructureSystem property.
     */
    public List<ImportCommunalInfrastructureSystemRequest.DeleteCommunalInfrastructureSystem> getDeleteCommunalInfrastructureSystem() {
        if (deleteCommunalInfrastructureSystem == null) {
            deleteCommunalInfrastructureSystem = new ArrayList<>();
        }
        return this.deleteCommunalInfrastructureSystem;
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
            return "11.5.0.2";
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
    public static class DeleteCommunalInfrastructureSystem {

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
    public static class RecoverCommunalInfrastructureSystem {

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
