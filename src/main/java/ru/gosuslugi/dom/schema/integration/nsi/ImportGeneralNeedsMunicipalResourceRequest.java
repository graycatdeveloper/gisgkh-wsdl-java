
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
 *       <choice>
 *         <sequence>
 *           <element name="TopLevelMunicipalResource" maxOccurs="unbounded" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="ParentCode">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                           <enumeration value="1"/>
 *                           <enumeration value="2"/>
 *                           <enumeration value="3"/>
 *                           <enumeration value="8"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ImportGeneralMunicipalResource" maxOccurs="1000" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi/}importGeneralNeedsMunicipalResourceType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="RecoverGeneralMunicipalResource" maxOccurs="1000" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="DeleteGeneralMunicipalResource" maxOccurs="1000" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="12.2.2.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topLevelMunicipalResource",
    "recoverGeneralMunicipalResource",
    "deleteGeneralMunicipalResource"
})
@XmlRootElement(name = "importGeneralNeedsMunicipalResourceRequest")
public class ImportGeneralNeedsMunicipalResourceRequest
    extends BaseType
{

    /**
     * Для записей 2-го уровня иерархии сссылка на родитльскую запись. Поскольку записи 1-го уровня иерархии добавляются всем поставщикам и их неввозможно изменить/удалить, ссылка ннх представлена реестровым номером записи из справочника "Вид коммунального ресурса" (см описание ParentCode). В ответе на запрос вместе с указанным TransportGuid возвращается GUID записи.
     * 
     */
    @XmlElement(name = "TopLevelMunicipalResource")
    protected List<ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource> topLevelMunicipalResource;
    /**
     * Восстановление главного коммунального ресурса (ветки).
     * 
     */
    @XmlElement(name = "RecoverGeneralMunicipalResource")
    protected List<ImportGeneralNeedsMunicipalResourceRequest.RecoverGeneralMunicipalResource> recoverGeneralMunicipalResource;
    /**
     * Удаление  главного коммунального ресурса (ветки).
     * 
     */
    @XmlElement(name = "DeleteGeneralMunicipalResource")
    protected List<ImportGeneralNeedsMunicipalResourceRequest.DeleteGeneralMunicipalResource> deleteGeneralMunicipalResource;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Для записей 2-го уровня иерархии сссылка на родитльскую запись. Поскольку записи 1-го уровня иерархии добавляются всем поставщикам и их неввозможно изменить/удалить, ссылка ннх представлена реестровым номером записи из справочника "Вид коммунального ресурса" (см описание ParentCode). В ответе на запрос вместе с указанным TransportGuid возвращается GUID записи.
     * 
     * Gets the value of the topLevelMunicipalResource property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topLevelMunicipalResource property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTopLevelMunicipalResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource }
     * </p>
     * 
     * 
     * @return
     *     The value of the topLevelMunicipalResource property.
     */
    public List<ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource> getTopLevelMunicipalResource() {
        if (topLevelMunicipalResource == null) {
            topLevelMunicipalResource = new ArrayList<>();
        }
        return this.topLevelMunicipalResource;
    }

    /**
     * Восстановление главного коммунального ресурса (ветки).
     * 
     * Gets the value of the recoverGeneralMunicipalResource property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverGeneralMunicipalResource property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecoverGeneralMunicipalResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportGeneralNeedsMunicipalResourceRequest.RecoverGeneralMunicipalResource }
     * </p>
     * 
     * 
     * @return
     *     The value of the recoverGeneralMunicipalResource property.
     */
    public List<ImportGeneralNeedsMunicipalResourceRequest.RecoverGeneralMunicipalResource> getRecoverGeneralMunicipalResource() {
        if (recoverGeneralMunicipalResource == null) {
            recoverGeneralMunicipalResource = new ArrayList<>();
        }
        return this.recoverGeneralMunicipalResource;
    }

    /**
     * Удаление  главного коммунального ресурса (ветки).
     * 
     * Gets the value of the deleteGeneralMunicipalResource property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteGeneralMunicipalResource property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteGeneralMunicipalResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportGeneralNeedsMunicipalResourceRequest.DeleteGeneralMunicipalResource }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteGeneralMunicipalResource property.
     */
    public List<ImportGeneralNeedsMunicipalResourceRequest.DeleteGeneralMunicipalResource> getDeleteGeneralMunicipalResource() {
        if (deleteGeneralMunicipalResource == null) {
            deleteGeneralMunicipalResource = new ArrayList<>();
        }
        return this.deleteGeneralMunicipalResource;
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
            return "12.2.2.1";
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
    public static class DeleteGeneralMunicipalResource {

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
    public static class RecoverGeneralMunicipalResource {

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
     *         <element name="ParentCode">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               <enumeration value="1"/>
     *               <enumeration value="2"/>
     *               <enumeration value="3"/>
     *               <enumeration value="8"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="ImportGeneralMunicipalResource" maxOccurs="1000" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi/}importGeneralNeedsMunicipalResourceType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "parentCode",
        "transportGUID",
        "importGeneralMunicipalResource"
    })
    public static class TopLevelMunicipalResource {

        /**
         * Код родительской записи верхнего уровня. Может быть:
         *  1 - Холодная вода
         *  2 - Горячая вода
         *  3 - Электрическая энергия
         *  8 - Сточные воды
         * 
         */
        @XmlElement(name = "ParentCode")
        protected byte parentCode;
        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Создание/изменение главного коммунального ресурса (ветки)
         * 
         */
        @XmlElement(name = "ImportGeneralMunicipalResource")
        protected List<ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource.ImportGeneralMunicipalResource> importGeneralMunicipalResource;

        /**
         * Код родительской записи верхнего уровня. Может быть:
         *  1 - Холодная вода
         *  2 - Горячая вода
         *  3 - Электрическая энергия
         *  8 - Сточные воды
         * 
         */
        public byte getParentCode() {
            return parentCode;
        }

        /**
         * Sets the value of the parentCode property.
         * 
         */
        public void setParentCode(byte value) {
            this.parentCode = value;
        }

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
         * Создание/изменение главного коммунального ресурса (ветки)
         * 
         * Gets the value of the importGeneralMunicipalResource property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importGeneralMunicipalResource property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getImportGeneralMunicipalResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource.ImportGeneralMunicipalResource }
         * </p>
         * 
         * 
         * @return
         *     The value of the importGeneralMunicipalResource property.
         */
        public List<ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource.ImportGeneralMunicipalResource> getImportGeneralMunicipalResource() {
            if (importGeneralMunicipalResource == null) {
                importGeneralMunicipalResource = new ArrayList<>();
            }
            return this.importGeneralMunicipalResource;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi/}importGeneralNeedsMunicipalResourceType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ImportGeneralMunicipalResource
            extends ImportGeneralNeedsMunicipalResourceType
        {


        }

    }

}
