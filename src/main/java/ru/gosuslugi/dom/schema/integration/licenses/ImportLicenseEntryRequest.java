
package ru.gosuslugi.dom.schema.integration.licenses;

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
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *           <choice minOccurs="0">
 *             <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="ChangingEntryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           </choice>
 *         </sequence>
 *         <sequence>
 *           <element name="EntryInfoImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EntryInfoImportType"/>
 *           <choice>
 *             <element name="LicenseEntryImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseEntryImportType"/>
 *             <element name="LicenseExtensionDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseExtensionDetailsImportType"/>
 *             <element name="UnionDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}UnionDetailsImportType"/>
 *             <element name="LicenseTerminationDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseTerminationDetailsImportType"/>
 *             <element name="LicenseAnnulationDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseAnnlationDetailsImportType"/>
 *             <element name="DeactualizationDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DeactalizationDetailsImportType"/>
 *             <element name="CancelTerminationDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}CancelTerminationDetailsImportType"/>
 *             <element name="InclusionHouseDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}InclusionHouseDetailsImportType"/>
 *             <element name="ExclusionHouseDetailsImport" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ExclusionHouseDetailsImportType"/>
 *           </choice>
 *         </sequence>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version fixed="14.3.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transportGUID",
    "licenseGUID",
    "changingEntryGuid",
    "entryInfoImport",
    "licenseEntryImport",
    "licenseExtensionDetailsImport",
    "unionDetailsImport",
    "licenseTerminationDetailsImport",
    "licenseAnnulationDetailsImport",
    "deactualizationDetailsImport",
    "cancelTerminationDetailsImport",
    "inclusionHouseDetailsImport",
    "exclusionHouseDetailsImport"
})
@XmlRootElement(name = "importLicenseEntryRequest")
public class ImportLicenseEntryRequest
    extends BaseType
{

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Корневой идентификатор лицензии, в которой выполняется работа с реетсровой записью
     * 
     */
    @XmlElement(name = "LicenseGUID")
    protected String licenseGUID;
    /**
     * Идентификатор записи, исправляемой текущей записью
     * 
     */
    @XmlElement(name = "ChangingEntryGuid")
    protected String changingEntryGuid;
    /**
     * Информация о заверении приказа о предоставлении лицензии или приказа о заверении размещаемой реестровой записи
     * 
     */
    @XmlElement(name = "EntryInfoImport", required = true)
    protected EntryInfoImportType entryInfoImport;
    /**
     * Размещение новой лицензии или внесение изменений в лицензию
     * 
     */
    @XmlElement(name = "LicenseEntryImport")
    protected LicenseEntryImportType licenseEntryImport;
    /**
     * Продление срока действия лицензии
     * 
     */
    @XmlElement(name = "LicenseExtensionDetailsImport")
    protected LicenseExtensionDetailsImportType licenseExtensionDetailsImport;
    /**
     * Объединение лицензий
     * 
     */
    @XmlElement(name = "UnionDetailsImport")
    protected UnionDetailsImportType unionDetailsImport;
    /**
     * Прекращение срока действия лицензии
     * 
     */
    @XmlElement(name = "LicenseTerminationDetailsImport")
    protected LicenseTerminationDetailsImportType licenseTerminationDetailsImport;
    /**
     * Аннулирование лицензии
     * 
     */
    @XmlElement(name = "LicenseAnnulationDetailsImport")
    protected LicenseAnnlationDetailsImportType licenseAnnulationDetailsImport;
    /**
     * Деактуализация реестровой записи или лицензии. 
     * Для деактуализации лицензии необходимо деактуализировать запись о предоставлении такой лицензии.
     * 
     */
    @XmlElement(name = "DeactualizationDetailsImport")
    protected DeactalizationDetailsImportType deactualizationDetailsImport;
    /**
     * Отмена прекращения действия/аннулирования лицензии
     * 
     */
    @XmlElement(name = "CancelTerminationDetailsImport")
    protected CancelTerminationDetailsImportType cancelTerminationDetailsImport;
    /**
     * Включение дома в лицензию
     * 
     */
    @XmlElement(name = "InclusionHouseDetailsImport")
    protected InclusionHouseDetailsImportType inclusionHouseDetailsImport;
    /**
     * Исключение дома из лицензии
     * 
     */
    @XmlElement(name = "ExclusionHouseDetailsImport")
    protected ExclusionHouseDetailsImportType exclusionHouseDetailsImport;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String version;

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
     * Корневой идентификатор лицензии, в которой выполняется работа с реетсровой записью
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseGUID() {
        return licenseGUID;
    }

    /**
     * Sets the value of the licenseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicenseGUID()
     */
    public void setLicenseGUID(String value) {
        this.licenseGUID = value;
    }

    /**
     * Идентификатор записи, исправляемой текущей записью
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangingEntryGuid() {
        return changingEntryGuid;
    }

    /**
     * Sets the value of the changingEntryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChangingEntryGuid()
     */
    public void setChangingEntryGuid(String value) {
        this.changingEntryGuid = value;
    }

    /**
     * Информация о заверении приказа о предоставлении лицензии или приказа о заверении размещаемой реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link EntryInfoImportType }
     *     
     */
    public EntryInfoImportType getEntryInfoImport() {
        return entryInfoImport;
    }

    /**
     * Sets the value of the entryInfoImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryInfoImportType }
     *     
     * @see #getEntryInfoImport()
     */
    public void setEntryInfoImport(EntryInfoImportType value) {
        this.entryInfoImport = value;
    }

    /**
     * Размещение новой лицензии или внесение изменений в лицензию
     * 
     * @return
     *     possible object is
     *     {@link LicenseEntryImportType }
     *     
     */
    public LicenseEntryImportType getLicenseEntryImport() {
        return licenseEntryImport;
    }

    /**
     * Sets the value of the licenseEntryImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseEntryImportType }
     *     
     * @see #getLicenseEntryImport()
     */
    public void setLicenseEntryImport(LicenseEntryImportType value) {
        this.licenseEntryImport = value;
    }

    /**
     * Продление срока действия лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseExtensionDetailsImportType }
     *     
     */
    public LicenseExtensionDetailsImportType getLicenseExtensionDetailsImport() {
        return licenseExtensionDetailsImport;
    }

    /**
     * Sets the value of the licenseExtensionDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseExtensionDetailsImportType }
     *     
     * @see #getLicenseExtensionDetailsImport()
     */
    public void setLicenseExtensionDetailsImport(LicenseExtensionDetailsImportType value) {
        this.licenseExtensionDetailsImport = value;
    }

    /**
     * Объединение лицензий
     * 
     * @return
     *     possible object is
     *     {@link UnionDetailsImportType }
     *     
     */
    public UnionDetailsImportType getUnionDetailsImport() {
        return unionDetailsImport;
    }

    /**
     * Sets the value of the unionDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionDetailsImportType }
     *     
     * @see #getUnionDetailsImport()
     */
    public void setUnionDetailsImport(UnionDetailsImportType value) {
        this.unionDetailsImport = value;
    }

    /**
     * Прекращение срока действия лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseTerminationDetailsImportType }
     *     
     */
    public LicenseTerminationDetailsImportType getLicenseTerminationDetailsImport() {
        return licenseTerminationDetailsImport;
    }

    /**
     * Sets the value of the licenseTerminationDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseTerminationDetailsImportType }
     *     
     * @see #getLicenseTerminationDetailsImport()
     */
    public void setLicenseTerminationDetailsImport(LicenseTerminationDetailsImportType value) {
        this.licenseTerminationDetailsImport = value;
    }

    /**
     * Аннулирование лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseAnnlationDetailsImportType }
     *     
     */
    public LicenseAnnlationDetailsImportType getLicenseAnnulationDetailsImport() {
        return licenseAnnulationDetailsImport;
    }

    /**
     * Sets the value of the licenseAnnulationDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseAnnlationDetailsImportType }
     *     
     * @see #getLicenseAnnulationDetailsImport()
     */
    public void setLicenseAnnulationDetailsImport(LicenseAnnlationDetailsImportType value) {
        this.licenseAnnulationDetailsImport = value;
    }

    /**
     * Деактуализация реестровой записи или лицензии. 
     * Для деактуализации лицензии необходимо деактуализировать запись о предоставлении такой лицензии.
     * 
     * @return
     *     possible object is
     *     {@link DeactalizationDetailsImportType }
     *     
     */
    public DeactalizationDetailsImportType getDeactualizationDetailsImport() {
        return deactualizationDetailsImport;
    }

    /**
     * Sets the value of the deactualizationDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeactalizationDetailsImportType }
     *     
     * @see #getDeactualizationDetailsImport()
     */
    public void setDeactualizationDetailsImport(DeactalizationDetailsImportType value) {
        this.deactualizationDetailsImport = value;
    }

    /**
     * Отмена прекращения действия/аннулирования лицензии
     * 
     * @return
     *     possible object is
     *     {@link CancelTerminationDetailsImportType }
     *     
     */
    public CancelTerminationDetailsImportType getCancelTerminationDetailsImport() {
        return cancelTerminationDetailsImport;
    }

    /**
     * Sets the value of the cancelTerminationDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelTerminationDetailsImportType }
     *     
     * @see #getCancelTerminationDetailsImport()
     */
    public void setCancelTerminationDetailsImport(CancelTerminationDetailsImportType value) {
        this.cancelTerminationDetailsImport = value;
    }

    /**
     * Включение дома в лицензию
     * 
     * @return
     *     possible object is
     *     {@link InclusionHouseDetailsImportType }
     *     
     */
    public InclusionHouseDetailsImportType getInclusionHouseDetailsImport() {
        return inclusionHouseDetailsImport;
    }

    /**
     * Sets the value of the inclusionHouseDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link InclusionHouseDetailsImportType }
     *     
     * @see #getInclusionHouseDetailsImport()
     */
    public void setInclusionHouseDetailsImport(InclusionHouseDetailsImportType value) {
        this.inclusionHouseDetailsImport = value;
    }

    /**
     * Исключение дома из лицензии
     * 
     * @return
     *     possible object is
     *     {@link ExclusionHouseDetailsImportType }
     *     
     */
    public ExclusionHouseDetailsImportType getExclusionHouseDetailsImport() {
        return exclusionHouseDetailsImport;
    }

    /**
     * Sets the value of the exclusionHouseDetailsImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionHouseDetailsImportType }
     *     
     * @see #getExclusionHouseDetailsImport()
     */
    public void setExclusionHouseDetailsImport(ExclusionHouseDetailsImportType value) {
        this.exclusionHouseDetailsImport = value;
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
            return "14.3.0.2";
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
