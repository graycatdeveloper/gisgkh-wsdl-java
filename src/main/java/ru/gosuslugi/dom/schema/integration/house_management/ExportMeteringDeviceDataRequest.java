
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <choice>
 *           <element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *           <sequence>
 *             <element name="IsCurrentOrganization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *             <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *             <choice minOccurs="0">
 *               <element name="MeteringDeviceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *               <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *             </choice>
 *             <element name="ArchiveDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             <element name="ArchiveDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             <element name="SearchArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *             <element name="CommissioningDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *             <element name="CommissioningDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <element name="IncludeFIASHouseGuid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.1.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meteringDeviceRootGUID",
    "meteringDeviceVersionGUID",
    "isCurrentOrganization",
    "fiasHouseGuid",
    "updateDateTime",
    "meteringDeviceType",
    "municipalResource",
    "archiveDateTo",
    "archiveDateFrom",
    "searchArchived",
    "commissioningDateTo",
    "commissioningDateFrom",
    "includeFIASHouseGuid"
})
@XmlRootElement(name = "exportMeteringDeviceDataRequest")
public class ExportMeteringDeviceDataRequest
    extends BaseType
{

    /**
     * Идентификатор ПУ в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "MeteringDeviceRootGUID")
    protected String meteringDeviceRootGUID;
    /**
     * Идентификатор версии ПУ
     * 
     */
    @XmlElement(name = "MeteringDeviceVersionGUID")
    protected String meteringDeviceVersionGUID;
    /**
     * Выгружать ПУ, находящиеся в собственности или на ином законном основании только текущей организации (критерий применяется только для ОДПУ) (если признак не установлен, то будут выгружены все ОДПУ, доступные текущей организации для просмотра)
     * 
     */
    @XmlElement(name = "IsCurrentOrganization")
    protected Boolean isCurrentOrganization;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Дата модификации
     * 
     */
    @XmlElement(name = "UpdateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;
    /**
     * Вид прибора учета (НСИ 27)
     * 
     */
    @XmlElement(name = "MeteringDeviceType")
    protected NsiRef meteringDeviceType;
    /**
     * Коммунальный ресурс (НСИ 2)
     * 
     */
    @XmlElement(name = "MunicipalResource")
    protected NsiRef municipalResource;
    /**
     * Дата архивации «По»
     * 
     */
    @XmlElement(name = "ArchiveDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archiveDateTo;
    /**
     * Дата архивации «С»
     * 
     */
    @XmlElement(name = "ArchiveDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar archiveDateFrom;
    /**
     * Выгружать архивированные
     * 
     */
    @XmlElement(name = "SearchArchived")
    protected Boolean searchArchived;
    /**
     * Дата ввода в эксплуатацию «По»
     * 
     */
    @XmlElement(name = "CommissioningDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commissioningDateTo;
    /**
     * Дата ввода в эксплуатацию «С»
     * 
     */
    @XmlElement(name = "CommissioningDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar commissioningDateFrom;
    /**
     * Включать в выгрузку для МКД и ЖД глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "IncludeFIASHouseGuid")
    protected Boolean includeFIASHouseGuid;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор ПУ в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceRootGUID() {
        return meteringDeviceRootGUID;
    }

    /**
     * Sets the value of the meteringDeviceRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceRootGUID()
     */
    public void setMeteringDeviceRootGUID(String value) {
        this.meteringDeviceRootGUID = value;
    }

    /**
     * Идентификатор версии ПУ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceVersionGUID() {
        return meteringDeviceVersionGUID;
    }

    /**
     * Sets the value of the meteringDeviceVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceVersionGUID()
     */
    public void setMeteringDeviceVersionGUID(String value) {
        this.meteringDeviceVersionGUID = value;
    }

    /**
     * Выгружать ПУ, находящиеся в собственности или на ином законном основании только текущей организации (критерий применяется только для ОДПУ) (если признак не установлен, то будут выгружены все ОДПУ, доступные текущей организации для просмотра)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCurrentOrganization() {
        return isCurrentOrganization;
    }

    /**
     * Sets the value of the isCurrentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsCurrentOrganization()
     */
    public void setIsCurrentOrganization(Boolean value) {
        this.isCurrentOrganization = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Дата модификации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getUpdateDateTime()
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

    /**
     * Вид прибора учета (НСИ 27)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMeteringDeviceType() {
        return meteringDeviceType;
    }

    /**
     * Sets the value of the meteringDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMeteringDeviceType()
     */
    public void setMeteringDeviceType(NsiRef value) {
        this.meteringDeviceType = value;
    }

    /**
     * Коммунальный ресурс (НСИ 2)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(NsiRef value) {
        this.municipalResource = value;
    }

    /**
     * Дата архивации «По»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateTo() {
        return archiveDateTo;
    }

    /**
     * Sets the value of the archiveDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getArchiveDateTo()
     */
    public void setArchiveDateTo(XMLGregorianCalendar value) {
        this.archiveDateTo = value;
    }

    /**
     * Дата архивации «С»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArchiveDateFrom() {
        return archiveDateFrom;
    }

    /**
     * Sets the value of the archiveDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getArchiveDateFrom()
     */
    public void setArchiveDateFrom(XMLGregorianCalendar value) {
        this.archiveDateFrom = value;
    }

    /**
     * Выгружать архивированные
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchArchived() {
        return searchArchived;
    }

    /**
     * Sets the value of the searchArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isSearchArchived()
     */
    public void setSearchArchived(Boolean value) {
        this.searchArchived = value;
    }

    /**
     * Дата ввода в эксплуатацию «По»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissioningDateTo() {
        return commissioningDateTo;
    }

    /**
     * Sets the value of the commissioningDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCommissioningDateTo()
     */
    public void setCommissioningDateTo(XMLGregorianCalendar value) {
        this.commissioningDateTo = value;
    }

    /**
     * Дата ввода в эксплуатацию «С»
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommissioningDateFrom() {
        return commissioningDateFrom;
    }

    /**
     * Sets the value of the commissioningDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCommissioningDateFrom()
     */
    public void setCommissioningDateFrom(XMLGregorianCalendar value) {
        this.commissioningDateFrom = value;
    }

    /**
     * Включать в выгрузку для МКД и ЖД глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFIASHouseGuid() {
        return includeFIASHouseGuid;
    }

    /**
     * Sets the value of the includeFIASHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIncludeFIASHouseGuid()
     */
    public void setIncludeFIASHouseGuid(Boolean value) {
        this.includeFIASHouseGuid = value;
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
            return "11.1.0.2";
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
