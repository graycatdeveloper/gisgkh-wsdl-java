
package ru.gosuslugi.dom.schema.integration.nsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип позиции справочника 337 "Коммунальные ресурсы, потребляемые при использовании и содержании общего имущества в многоквартирном доме".
 * 
 * <p>Java class for importGeneralNeedsMunicipalResourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="importGeneralNeedsMunicipalResourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *         <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="GeneralMunicipalResourceName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *         <element name="MunicipalResourceRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
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
@XmlType(name = "importGeneralNeedsMunicipalResourceType", propOrder = {
    "transportGUID",
    "elementGuid",
    "generalMunicipalResourceName",
    "municipalResourceRef",
    "okei",
    "sortOrder",
    "sortOrderNotDefined"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.nsi.ImportGeneralNeedsMunicipalResourceRequest.TopLevelMunicipalResource.ImportGeneralMunicipalResource.class
})
public class ImportGeneralNeedsMunicipalResourceType {

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Идентификатор существующего элемента справочника 2-го уровня иерархии и ниже
     * 
     */
    @XmlElement(name = "ElementGuid")
    protected String elementGuid;
    /**
     * Наименование главного коммунального ресурса.
     * 
     */
    @XmlElement(name = "GeneralMunicipalResourceName", required = true)
    protected String generalMunicipalResourceName;
    /**
     * Вид коммунального ресурса (НСИ №2 "Вид коммунального ресурса").
     * 
     */
    @XmlElement(name = "MunicipalResourceRef", required = true)
    protected NsiRef municipalResourceRef;
    /**
     * (не используется)
     * Единница измерения из справочника ОКЕИ.
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
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
     * Идентификатор существующего элемента справочника 2-го уровня иерархии и ниже
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
     * Наименование главного коммунального ресурса.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralMunicipalResourceName() {
        return generalMunicipalResourceName;
    }

    /**
     * Sets the value of the generalMunicipalResourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGeneralMunicipalResourceName()
     */
    public void setGeneralMunicipalResourceName(String value) {
        this.generalMunicipalResourceName = value;
    }

    /**
     * Вид коммунального ресурса (НСИ №2 "Вид коммунального ресурса").
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
