
package ru.gosuslugi.dom.schema.integration.rvuo;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.Period;


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
 *         <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="BusinessProperties" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}BusinessPropertiesType" minOccurs="0"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type" minOccurs="0"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMOType" minOccurs="0"/>
 *         <choice>
 *           <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *           <element name="Address" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <minLength value="1"/>
 *                 <maxLength value="2500"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </choice>
 *         <choice minOccurs="0">
 *           <element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="DecisionPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period"/>
 *         </choice>
 *         <element name="InfoStatus" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}InfoStatusExportType" minOccurs="0"/>
 *         <element name="ManagementPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *         <element name="CreatePeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
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
    "decisionGUID",
    "orgGUID",
    "businessProperties",
    "number",
    "oktmo",
    "fiasHouseGUID",
    "address",
    "decisionDate",
    "decisionPeriod",
    "infoStatus",
    "managementPeriod",
    "createPeriod",
    "placingPeriod",
    "exportRequestGUID"
})
@XmlRootElement(name = "exportDecisionRequest")
public class ExportDecisionRequest
    extends BaseType
{

    /**
     * Уникальный идентификатор решения об определении управляющей организации
     * 
     */
    @XmlElement(name = "DecisionGUID")
    protected String decisionGUID;
    /**
     * Уникальный идентификатор управляющей организации
     * 
     */
    @XmlElement(name = "OrgGUID")
    protected String orgGUID;
    /**
     * Реквизиты управляющей организации
     * 
     */
    @XmlElement(name = "BusinessProperties")
    protected BusinessPropertiesType businessProperties;
    /**
     * Номер решения
     * 
     */
    @XmlElement(name = "Number")
    protected String number;
    /**
     * Код ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO")
    protected String oktmo;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "FIASHouseGUID")
    protected String fiasHouseGUID;
    /**
     * Неформализованное описание адреса
     * 
     */
    @XmlElement(name = "Address")
    protected String address;
    /**
     * Дата принятия решения. Используется для поиска решений по дате принятия. Значение содержит одну дату. В результирующую выборку попадут решения, у которых дата принятия входит в диапазон с 00:00:00 до 23:59:59 часов даты, указанной в элементе
     * 
     */
    @XmlElement(name = "DecisionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    /**
     * Период принятия решения. Используется для поиска решений по дате принятия. Значение содержит временной период
     * 
     */
    @XmlElement(name = "DecisionPeriod")
    protected Period decisionPeriod;
    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена; Annulled - Аннулирована.
     * 
     */
    @XmlElement(name = "InfoStatus")
    @XmlSchemaType(name = "string")
    protected InfoStatusExportType infoStatus;
    /**
     * Период управления
     * 
     */
    @XmlElement(name = "ManagementPeriod")
    protected Period managementPeriod;
    /**
     * Период создания сведений
     * 
     */
    @XmlElement(name = "CreatePeriod")
    protected Period createPeriod;
    /**
     * Период размещения сведений
     * 
     */
    @XmlElement(name = "PlacingPeriod")
    protected Period placingPeriod;
    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * Если в элементе exportDecisionRequest указаны условия отбора по атрибутам запроса, то экспорт запросов осуществляется блоками по 1000 запросов в каждом блоке (последний блок может содержать меньшее число запросов).
     * 
     * Для экспорта первого блока данных элемент не указывается. Для экспорта каждого следующего блока данных в элементе должно указываться значение элемента getStateResult/ exportDecisionResult/ ExportDecisionGUID, полученное при экспорте предыдущего блока данных
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
     * Уникальный идентификатор решения об определении управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionGUID() {
        return decisionGUID;
    }

    /**
     * Sets the value of the decisionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDecisionGUID()
     */
    public void setDecisionGUID(String value) {
        this.decisionGUID = value;
    }

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
     * Номер решения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGUID()
     */
    public void setFIASHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Неформализованное описание адреса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddress()
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Дата принятия решения. Используется для поиска решений по дате принятия. Значение содержит одну дату. В результирующую выборку попадут решения, у которых дата принятия входит в диапазон с 00:00:00 до 23:59:59 часов даты, указанной в элементе
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDecisionDate()
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Период принятия решения. Используется для поиска решений по дате принятия. Значение содержит временной период
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getDecisionPeriod() {
        return decisionPeriod;
    }

    /**
     * Sets the value of the decisionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getDecisionPeriod()
     */
    public void setDecisionPeriod(Period value) {
        this.decisionPeriod = value;
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
     * Период управления
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getManagementPeriod() {
        return managementPeriod;
    }

    /**
     * Sets the value of the managementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getManagementPeriod()
     */
    public void setManagementPeriod(Period value) {
        this.managementPeriod = value;
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
     * Если в элементе exportDecisionRequest указаны условия отбора по атрибутам запроса, то экспорт запросов осуществляется блоками по 1000 запросов в каждом блоке (последний блок может содержать меньшее число запросов).
     * 
     * Для экспорта первого блока данных элемент не указывается. Для экспорта каждого следующего блока данных в элементе должно указываться значение элемента getStateResult/ exportDecisionResult/ ExportDecisionGUID, полученное при экспорте предыдущего блока данных
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
