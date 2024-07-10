
package ru.gosuslugi.dom.schema.integration.nsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Элемент справочника работ и услуг организации.
 * 
 * <p>Java class for ImportOrganizationWorkType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportOrganizationWorkType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *           <choice minOccurs="0">
 *             <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="InsertInCopiedWorks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           </choice>
 *         </sequence>
 *         <element name="WorkName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type"/>
 *         <element name="ServiceTypeRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="RequiredServiceRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *         <choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
 *           <element name="StringDimensionUnit" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *         </choice>
 *         <element name="ImportOrganizationWork" type="{http://dom.gosuslugi.ru/schema/integration/nsi/}ImportOrganizationWorkType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportOrganizationWorkType", propOrder = {
    "transportGUID",
    "elementGuid",
    "insertInCopiedWorks",
    "workName",
    "serviceTypeRef",
    "requiredServiceRef",
    "okei",
    "stringDimensionUnit",
    "importOrganizationWork"
})
public class ImportOrganizationWorkType {

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
     * Добавить в запись кодом 0 - "Работы (услуги), скопированные из справочника другой организации", запрещенной для редактирования.
     * 
     */
    @XmlElement(name = "InsertInCopiedWorks")
    protected Boolean insertInCopiedWorks;
    /**
     * Название работы/услуги.
     * 
     */
    @XmlElement(name = "WorkName", required = true)
    protected String workName;
    /**
     * Ссылка на НСИ "Вид работ" (реестровый номер 56).
     * 
     */
    @XmlElement(name = "ServiceTypeRef", required = true)
    protected NsiRef serviceTypeRef;
    /**
     * Ссылка на НСИ "Обязательные работы, обеспечивающие надлежащее содержание МКД" (реестровый номер 67).
     * 
     */
    @XmlElement(name = "RequiredServiceRef", required = true)
    protected List<NsiRef> requiredServiceRef;
    /**
     * Единница измерения из справочника ОКЕИ.
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String okei;
    /**
     * Элемент не рекомендуется использовать. Вместо него следует использовать элемент base:OKEI
     * 
     */
    @XmlElement(name = "StringDimensionUnit")
    protected String stringDimensionUnit;
    /**
     * Дочерний  элемент
     * 
     */
    @XmlElement(name = "ImportOrganizationWork")
    protected List<ImportOrganizationWorkType> importOrganizationWork;

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
     * Добавить в запись кодом 0 - "Работы (услуги), скопированные из справочника другой организации", запрещенной для редактирования.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsertInCopiedWorks() {
        return insertInCopiedWorks;
    }

    /**
     * Sets the value of the insertInCopiedWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInsertInCopiedWorks()
     */
    public void setInsertInCopiedWorks(Boolean value) {
        this.insertInCopiedWorks = value;
    }

    /**
     * Название работы/услуги.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkName() {
        return workName;
    }

    /**
     * Sets the value of the workName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkName()
     */
    public void setWorkName(String value) {
        this.workName = value;
    }

    /**
     * Ссылка на НСИ "Вид работ" (реестровый номер 56).
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getServiceTypeRef() {
        return serviceTypeRef;
    }

    /**
     * Sets the value of the serviceTypeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getServiceTypeRef()
     */
    public void setServiceTypeRef(NsiRef value) {
        this.serviceTypeRef = value;
    }

    /**
     * Ссылка на НСИ "Обязательные работы, обеспечивающие надлежащее содержание МКД" (реестровый номер 67).
     * 
     * Gets the value of the requiredServiceRef property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredServiceRef property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequiredServiceRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the requiredServiceRef property.
     */
    public List<NsiRef> getRequiredServiceRef() {
        if (requiredServiceRef == null) {
            requiredServiceRef = new ArrayList<>();
        }
        return this.requiredServiceRef;
    }

    /**
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
     * Элемент не рекомендуется использовать. Вместо него следует использовать элемент base:OKEI
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

    /**
     * Дочерний  элемент
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

}
