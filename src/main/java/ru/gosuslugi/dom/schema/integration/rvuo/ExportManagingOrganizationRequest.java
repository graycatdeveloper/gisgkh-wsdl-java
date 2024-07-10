
package ru.gosuslugi.dom.schema.integration.rvuo;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.Period;
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
 *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="BaseForInclude" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="2" minOccurs="0"/>
 *         <element name="BusinessProperties" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}BusinessPropertiesType" minOccurs="0"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMOType" minOccurs="0"/>
 *         <element name="OrgState" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}OrgStateType" minOccurs="0"/>
 *         <element name="InfoStatus" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}InfoStatusExportType" minOccurs="0"/>
 *         <element name="CreatePeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *         <element name="IncludePeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *         <element name="ExcludePeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *         <element name="PlacingPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *         <element name="exportRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.1.8.3""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orgGUID",
    "baseForInclude",
    "businessProperties",
    "oktmo",
    "orgState",
    "infoStatus",
    "createPeriod",
    "includePeriod",
    "excludePeriod",
    "placingPeriod",
    "exportRequestGUID"
})
@XmlRootElement(name = "exportManagingOrganizationRequest")
public class ExportManagingOrganizationRequest
    extends BaseType
{

    /**
     * Уникальный идентификатор управляющей организации
     * 
     */
    @XmlElement(name = "OrgGUID")
    protected String orgGUID;
    /**
     * Основание включения сведений. Ссылка на НСИ "Вид основания для включения в перечень УО" (реестровый номер 204)
     * 
     */
    @XmlElement(name = "BaseForInclude")
    protected List<NsiRef> baseForInclude;
    /**
     * Реквизиты управляющей организации
     * 
     */
    @XmlElement(name = "BusinessProperties")
    protected BusinessPropertiesType businessProperties;
    /**
     * Код ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO")
    protected String oktmo;
    /**
     * Состояние организации. Возможные значения: Excluded - Исключена; Included - Включена.
     * 
     */
    @XmlElement(name = "OrgState")
    @XmlSchemaType(name = "string")
    protected OrgStateType orgState;
    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена; Annulled - Аннулирована.
     * 
     */
    @XmlElement(name = "InfoStatus")
    @XmlSchemaType(name = "string")
    protected InfoStatusExportType infoStatus;
    /**
     * Период создания сведений
     * 
     */
    @XmlElement(name = "CreatePeriod")
    protected Period createPeriod;
    /**
     * Период включения сведений
     * 
     */
    @XmlElement(name = "IncludePeriod")
    protected Period includePeriod;
    /**
     * Период исключения сведений
     * 
     */
    @XmlElement(name = "ExcludePeriod")
    protected Period excludePeriod;
    /**
     * Период размещения сведений
     * 
     */
    @XmlElement(name = "PlacingPeriod")
    protected Period placingPeriod;
    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * Если в элементе exportManagingOrganizationRequest указаны условия отбора по атрибутам запроса, то экспорт запросов осуществляется блоками по 1000 запросов в каждом блоке (последний блок может содержать меньшее число запросов).
     * 
     * Для экспорта первого блока данных элемент не указывается. Для экспорта каждого следующего блока данных в элементе должно указываться значение элемента getStateResult/ exportManagingOrganizationResult/ ExportOrgGUID, полученное при экспорте предыдущего блока данных
     * 
     */
    protected String exportRequestGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Уникальный идентификатор управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgGUID() {
        return orgGUID;
    }

    /**
     * Sets the value of the orgGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgGUID()
     */
    public void setOrgGUID(String value) {
        this.orgGUID = value;
    }

    /**
     * Основание включения сведений. Ссылка на НСИ "Вид основания для включения в перечень УО" (реестровый номер 204)
     * 
     * Gets the value of the baseForInclude property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseForInclude property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBaseForInclude().add(newItem);
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
     *     The value of the baseForInclude property.
     */
    public List<NsiRef> getBaseForInclude() {
        if (baseForInclude == null) {
            baseForInclude = new ArrayList<>();
        }
        return this.baseForInclude;
    }

    /**
     * Реквизиты управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link BusinessPropertiesType }
     *     
     */
    public BusinessPropertiesType getBusinessProperties() {
        return businessProperties;
    }

    /**
     * Sets the value of the businessProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPropertiesType }
     *     
     * @see #getBusinessProperties()
     */
    public void setBusinessProperties(BusinessPropertiesType value) {
        this.businessProperties = value;
    }

    /**
     * Код ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

    /**
     * Состояние организации. Возможные значения: Excluded - Исключена; Included - Включена.
     * 
     * @return
     *     possible object is
     *     {@link OrgStateType }
     *     
     */
    public OrgStateType getOrgState() {
        return orgState;
    }

    /**
     * Sets the value of the orgState property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgStateType }
     *     
     * @see #getOrgState()
     */
    public void setOrgState(OrgStateType value) {
        this.orgState = value;
    }

    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена; Annulled - Аннулирована.
     * 
     * @return
     *     possible object is
     *     {@link InfoStatusExportType }
     *     
     */
    public InfoStatusExportType getInfoStatus() {
        return infoStatus;
    }

    /**
     * Sets the value of the infoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoStatusExportType }
     *     
     * @see #getInfoStatus()
     */
    public void setInfoStatus(InfoStatusExportType value) {
        this.infoStatus = value;
    }

    /**
     * Период создания сведений
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getCreatePeriod() {
        return createPeriod;
    }

    /**
     * Sets the value of the createPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getCreatePeriod()
     */
    public void setCreatePeriod(Period value) {
        this.createPeriod = value;
    }

    /**
     * Период включения сведений
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getIncludePeriod() {
        return includePeriod;
    }

    /**
     * Sets the value of the includePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getIncludePeriod()
     */
    public void setIncludePeriod(Period value) {
        this.includePeriod = value;
    }

    /**
     * Период исключения сведений
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getExcludePeriod() {
        return excludePeriod;
    }

    /**
     * Sets the value of the excludePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getExcludePeriod()
     */
    public void setExcludePeriod(Period value) {
        this.excludePeriod = value;
    }

    /**
     * Период размещения сведений
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPlacingPeriod() {
        return placingPeriod;
    }

    /**
     * Sets the value of the placingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getPlacingPeriod()
     */
    public void setPlacingPeriod(Period value) {
        this.placingPeriod = value;
    }

    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * Если в элементе exportManagingOrganizationRequest указаны условия отбора по атрибутам запроса, то экспорт запросов осуществляется блоками по 1000 запросов в каждом блоке (последний блок может содержать меньшее число запросов).
     * 
     * Для экспорта первого блока данных элемент не указывается. Для экспорта каждого следующего блока данных в элементе должно указываться значение элемента getStateResult/ exportManagingOrganizationResult/ ExportOrgGUID, полученное при экспорте предыдущего блока данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportRequestGUID() {
        return exportRequestGUID;
    }

    /**
     * Sets the value of the exportRequestGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportRequestGUID()
     */
    public void setExportRequestGUID(String value) {
        this.exportRequestGUID = value;
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
            return "13.1.8.3";
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

}
