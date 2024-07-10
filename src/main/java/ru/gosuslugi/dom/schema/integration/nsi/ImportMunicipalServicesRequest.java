
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
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


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
 *         <element name="ImportMainMunicipalService" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="MunicipalServiceRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="GeneralNeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="SelfProduced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="MainMunicipalServiceName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *                   <element name="MunicipalResourceRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
 *                   <choice>
 *                     <element name="SortOrder">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="3"/>
 *                           <minLength value="1"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SortOrderNotDefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RecoverMainMunicipalService" maxOccurs="1000" minOccurs="0">
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
 *         <element name="DeleteMainMunicipalService" maxOccurs="1000" minOccurs="0">
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.4""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importMainMunicipalService",
    "recoverMainMunicipalService",
    "deleteMainMunicipalService"
})
@XmlRootElement(name = "importMunicipalServicesRequest")
public class ImportMunicipalServicesRequest
    extends BaseType
{

    /**
     * Уровень 2. Создание/изменение главной коммунальной услуги.
     * 
     */
    @XmlElement(name = "ImportMainMunicipalService")
    protected List<ImportMunicipalServicesRequest.ImportMainMunicipalService> importMainMunicipalService;
    /**
     * Уровень 2. Восстановление главной коммунальной услуги (ветки).
     * 
     */
    @XmlElement(name = "RecoverMainMunicipalService")
    protected List<ImportMunicipalServicesRequest.RecoverMainMunicipalService> recoverMainMunicipalService;
    /**
     * Уровень 2. Удаление главной коммунальной услуги (ветки).
     * 
     */
    @XmlElement(name = "DeleteMainMunicipalService")
    protected List<ImportMunicipalServicesRequest.DeleteMainMunicipalService> deleteMainMunicipalService;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Уровень 2. Создание/изменение главной коммунальной услуги.
     * 
     * Gets the value of the importMainMunicipalService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importMainMunicipalService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportMainMunicipalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportMunicipalServicesRequest.ImportMainMunicipalService }
     * </p>
     * 
     * 
     * @return
     *     The value of the importMainMunicipalService property.
     */
    public List<ImportMunicipalServicesRequest.ImportMainMunicipalService> getImportMainMunicipalService() {
        if (importMainMunicipalService == null) {
            importMainMunicipalService = new ArrayList<>();
        }
        return this.importMainMunicipalService;
    }

    /**
     * Уровень 2. Восстановление главной коммунальной услуги (ветки).
     * 
     * Gets the value of the recoverMainMunicipalService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recoverMainMunicipalService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRecoverMainMunicipalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportMunicipalServicesRequest.RecoverMainMunicipalService }
     * </p>
     * 
     * 
     * @return
     *     The value of the recoverMainMunicipalService property.
     */
    public List<ImportMunicipalServicesRequest.RecoverMainMunicipalService> getRecoverMainMunicipalService() {
        if (recoverMainMunicipalService == null) {
            recoverMainMunicipalService = new ArrayList<>();
        }
        return this.recoverMainMunicipalService;
    }

    /**
     * Уровень 2. Удаление главной коммунальной услуги (ветки).
     * 
     * Gets the value of the deleteMainMunicipalService property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteMainMunicipalService property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeleteMainMunicipalService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportMunicipalServicesRequest.DeleteMainMunicipalService }
     * </p>
     * 
     * 
     * @return
     *     The value of the deleteMainMunicipalService property.
     */
    public List<ImportMunicipalServicesRequest.DeleteMainMunicipalService> getDeleteMainMunicipalService() {
        if (deleteMainMunicipalService == null) {
            deleteMainMunicipalService = new ArrayList<>();
        }
        return this.deleteMainMunicipalService;
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
            return "11.0.0.4";
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
    public static class DeleteMainMunicipalService {

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
     *         <element name="MunicipalServiceRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="GeneralNeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="SelfProduced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="MainMunicipalServiceName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
     *         <element name="MunicipalResourceRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
     *         <choice>
     *           <element name="SortOrder">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <maxLength value="3"/>
     *                 <minLength value="1"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="SortOrderNotDefined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "municipalServiceRef",
        "generalNeeds",
        "selfProduced",
        "mainMunicipalServiceName",
        "municipalResourceRef",
        "okei",
        "sortOrder",
        "sortOrderNotDefined"
    })
    public static class ImportMainMunicipalService {

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
        @XmlElement(name = "ElementGuid")
        protected String elementGuid;
        /**
         * Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3).
         * 
         */
        @XmlElement(name = "MunicipalServiceRef", required = true)
        protected NsiRef municipalServiceRef;
        /**
         * (не используется) Признак "Услуга предоставляется на общедомовые нужды"
         * 
         */
        @XmlElement(name = "GeneralNeeds")
        protected Boolean generalNeeds;
        /**
         * (не используется) Признак "Самостоятельное производство коммунальной услуги"
         * 
         */
        @XmlElement(name = "SelfProduced")
        protected Boolean selfProduced;
        /**
         * Наименование главной коммунальной услуги.
         * 
         */
        @XmlElement(name = "MainMunicipalServiceName", required = true)
        protected String mainMunicipalServiceName;
        /**
         * Ссылка на НСИ "Вид коммунального ресурса" (реестровый номер 2)
         * 
         */
        @XmlElement(name = "MunicipalResourceRef", required = true)
        protected NsiRef municipalResourceRef;
        /**
         * (не используется)
         * Единница измерения из справочника ОКЕИ.
         * 
         */
        @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected String okei;
        /**
         * Порядок сортировки.
         * 
         */
        @XmlElement(name = "SortOrder")
        protected String sortOrder;
        /**
         * Порядок сортировки не задан
         * 
         */
        @XmlElement(name = "SortOrderNotDefined")
        protected Boolean sortOrderNotDefined;

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

        /**
         * Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getMunicipalServiceRef() {
            return municipalServiceRef;
        }

        /**
         * Sets the value of the municipalServiceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getMunicipalServiceRef()
         */
        public void setMunicipalServiceRef(NsiRef value) {
            this.municipalServiceRef = value;
        }

        /**
         * (не используется) Признак "Услуга предоставляется на общедомовые нужды"
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGeneralNeeds() {
            return generalNeeds;
        }

        /**
         * Sets the value of the generalNeeds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isGeneralNeeds()
         */
        public void setGeneralNeeds(Boolean value) {
            this.generalNeeds = value;
        }

        /**
         * (не используется) Признак "Самостоятельное производство коммунальной услуги"
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelfProduced() {
            return selfProduced;
        }

        /**
         * Sets the value of the selfProduced property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isSelfProduced()
         */
        public void setSelfProduced(Boolean value) {
            this.selfProduced = value;
        }

        /**
         * Наименование главной коммунальной услуги.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMainMunicipalServiceName() {
            return mainMunicipalServiceName;
        }

        /**
         * Sets the value of the mainMunicipalServiceName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMainMunicipalServiceName()
         */
        public void setMainMunicipalServiceName(String value) {
            this.mainMunicipalServiceName = value;
        }

        /**
         * Ссылка на НСИ "Вид коммунального ресурса" (реестровый номер 2)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getMunicipalResourceRef() {
            return municipalResourceRef;
        }

        /**
         * Sets the value of the municipalResourceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getMunicipalResourceRef()
         */
        public void setMunicipalResourceRef(NsiRef value) {
            this.municipalResourceRef = value;
        }

        /**
         * (не используется)
         * Единница измерения из справочника ОКЕИ.
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
         * Порядок сортировки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSortOrder() {
            return sortOrder;
        }

        /**
         * Sets the value of the sortOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSortOrder()
         */
        public void setSortOrder(String value) {
            this.sortOrder = value;
        }

        /**
         * Порядок сортировки не задан
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSortOrderNotDefined() {
            return sortOrderNotDefined;
        }

        /**
         * Sets the value of the sortOrderNotDefined property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isSortOrderNotDefined()
         */
        public void setSortOrderNotDefined(Boolean value) {
            this.sortOrderNotDefined = value;
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
    public static class RecoverMainMunicipalService {

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
