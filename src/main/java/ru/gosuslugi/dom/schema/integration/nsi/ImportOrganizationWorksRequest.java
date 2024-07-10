
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
 *         <element name="ImportOrganizationWork" type="{http://dom.gosuslugi.ru/schema/integration/nsi/}ImportOrganizationWorkType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="RecoverOrganizationWork" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="HierarchyRecover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DeleteOrganizationWork" maxOccurs="1000" minOccurs="0">
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
    "importOrganizationWork",
    "recoverOrganizationWork",
    "deleteOrganizationWork"
})
@XmlRootElement(name = "importOrganizationWorksRequest")
public class ImportOrganizationWorksRequest
    extends BaseType
{

    /**
     * Создание/изменение элемента справочника работ и услуг
     * 
     */
    @XmlElement(name = "ImportOrganizationWork")
    protected List<ImportOrganizationWorkType> importOrganizationWork;
    /**
     * Восстановление элемент (ветки) справочника работ и услуг организации.
     * 
     */
    @XmlElement(name = "RecoverOrganizationWork")
    protected List<ImportOrganizationWorksRequest.RecoverOrganizationWork> recoverOrganizationWork;
    /**
     * Удаление элемента (ветки) справочника работ и услуг организации.
     * 
     */
    @XmlElement(name = "DeleteOrganizationWork")
    protected List<ImportOrganizationWorksRequest.DeleteOrganizationWork> deleteOrganizationWork;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Создание/изменение элемента справочника работ и услуг
     * 
     * Gets the value of the importOrganizationWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importOrganizationWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportOrganizationWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOrganizationWorkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importOrganizationWork property.
     */
    public List<ImportOrganizationWorkType> getImportOrganizationWork() {
        if (importOrganizationWork == null) {
            importOrganizationWork = new ArrayList<>();
        }
        return this.importOrganizationWork;
    }

    /**
     * Восстановление элемент (ветки) справочника работ и услуг организации.
     * 
     * Gets the value of the recoverOrganizationWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverOrganizationWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecoverOrganizationWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOrganizationWorksRequest.RecoverOrganizationWork }
     * </p>
     * 
     * 
     * @return
     *     The value of the recoverOrganizationWork property.
     */
    public List<ImportOrganizationWorksRequest.RecoverOrganizationWork> getRecoverOrganizationWork() {
        if (recoverOrganizationWork == null) {
            recoverOrganizationWork = new ArrayList<>();
        }
        return this.recoverOrganizationWork;
    }

    /**
     * Удаление элемента (ветки) справочника работ и услуг организации.
     * 
     * Gets the value of the deleteOrganizationWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrganizationWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteOrganizationWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOrganizationWorksRequest.DeleteOrganizationWork }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteOrganizationWork property.
     */
    public List<ImportOrganizationWorksRequest.DeleteOrganizationWork> getDeleteOrganizationWork() {
        if (deleteOrganizationWork == null) {
            deleteOrganizationWork = new ArrayList<>();
        }
        return this.deleteOrganizationWork;
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
    public static class DeleteOrganizationWork {

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
     *         <element name="HierarchyRecover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "hierarchyRecover"
    })
    public static class RecoverOrganizationWork {

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
         * Признак восстановления всех дочерних элементов.
         * 
         */
        @XmlElement(name = "HierarchyRecover")
        protected Boolean hierarchyRecover;

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

        /**
         * Признак восстановления всех дочерних элементов.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHierarchyRecover() {
            return hierarchyRecover;
        }

        /**
         * Sets the value of the hierarchyRecover property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isHierarchyRecover()
         */
        public void setHierarchyRecover(Boolean value) {
            this.hierarchyRecover = value;
        }

    }

}
