
package ru.gosuslugi.dom.schema.integration.device_metering;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.YearMonth;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Экспорт показаний и поверок приборов учета. Значения показаний и поверок указываются в единицах измерения (ЕИ), которые назначены прибору учета при его создании. Если ЕИ прибора учета отличается от ЕИ коммунального ресурса (КР) по умолчанию, то дополнительно указываются значения показаний и поверок в ЕИ КР по умолчанию
 * 
 * <p>Java class for exportMeteringDeviceHistoryResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportMeteringDeviceHistoryResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *         <element name="HCSHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <choice>
 *           <element name="OneRateDeviceValue">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="BaseValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3" minOccurs="0"/>
 *                     <element name="Values" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType">
 *                                       <sequence minOccurs="0">
 *                                         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
 *                               <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
 *                                         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
 *                                         <choice>
 *                                           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         </choice>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="ElectricDeviceValue">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="BaseValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType" minOccurs="0"/>
 *                     <element name="Values" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType">
 *                                       <sequence minOccurs="0">
 *                                         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
 *                               <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
 *                                         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
 *                                         <choice>
 *                                           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         </choice>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="VolumeDeviceValue">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportType">
 *                   <sequence>
 *                     <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="ArchivedValues" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ArchivingReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                 </sequence>
 *               </restriction>
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
@XmlType(name = "exportMeteringDeviceHistoryResultType", propOrder = {
    "meteringDeviceRootGUID",
    "hcsHouseGUID",
    "fiasHouseGuid",
    "oneRateDeviceValue",
    "electricDeviceValue",
    "volumeDeviceValue",
    "archivedValues"
})
public class ExportMeteringDeviceHistoryResultType {

    /**
     * Идентификатор ПУ
     * 
     */
    @XmlElement(name = "MeteringDeviceRootGUID", required = true)
    protected String meteringDeviceRootGUID;
    /**
     * Уникальный идентификатор дома-места установки ПУ (в ГИС ЖКХ). Заполняется всегда, кроме случая, когда в запросе exportMeteringDeviceHistoryRequest указан ровно один элемент tns:FIASHouseGuid
     * 
     */
    @XmlElement(name = "HCSHouseGUID")
    protected String hcsHouseGUID;
    /**
     * Уникальный идентификатор дома-места установки ПУ (по ФИАС). Заполняется всегда, кроме случая, когда в запросе exportMeteringDeviceHistoryRequest указан ровно один элемент tns:FIASHouseGuid
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Показания ПУ расхода холодной/горячей воды; газа; тепловой энергии. Указывается только для ПУ, предоставляющих показания
     * 
     */
    @XmlElement(name = "OneRateDeviceValue")
    protected ExportMeteringDeviceHistoryResultType.OneRateDeviceValue oneRateDeviceValue;
    /**
     * Показания ПУ расхода электроэнергии. Указывается только для ПУ, предоставляющих показания
     * 
     */
    @XmlElement(name = "ElectricDeviceValue")
    protected ExportMeteringDeviceHistoryResultType.ElectricDeviceValue electricDeviceValue;
    /**
     * Объемы потребления ресурсов ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих объем потребленного КР
     * 
     */
    @XmlElement(name = "VolumeDeviceValue")
    protected ExportMeteringDeviceHistoryResultType.VolumeDeviceValue volumeDeviceValue;
    /**
     * Данные об архивации ПУ
     * 
     */
    @XmlElement(name = "ArchivedValues")
    protected ExportMeteringDeviceHistoryResultType.ArchivedValues archivedValues;

    /**
     * Идентификатор ПУ
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
     * Уникальный идентификатор дома-места установки ПУ (в ГИС ЖКХ). Заполняется всегда, кроме случая, когда в запросе exportMeteringDeviceHistoryRequest указан ровно один элемент tns:FIASHouseGuid
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHCSHouseGUID() {
        return hcsHouseGUID;
    }

    /**
     * Sets the value of the hcsHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHCSHouseGUID()
     */
    public void setHCSHouseGUID(String value) {
        this.hcsHouseGUID = value;
    }

    /**
     * Уникальный идентификатор дома-места установки ПУ (по ФИАС). Заполняется всегда, кроме случая, когда в запросе exportMeteringDeviceHistoryRequest указан ровно один элемент tns:FIASHouseGuid
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
     * Показания ПУ расхода холодной/горячей воды; газа; тепловой энергии. Указывается только для ПУ, предоставляющих показания
     * 
     * @return
     *     possible object is
     *     {@link ExportMeteringDeviceHistoryResultType.OneRateDeviceValue }
     *     
     */
    public ExportMeteringDeviceHistoryResultType.OneRateDeviceValue getOneRateDeviceValue() {
        return oneRateDeviceValue;
    }

    /**
     * Sets the value of the oneRateDeviceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportMeteringDeviceHistoryResultType.OneRateDeviceValue }
     *     
     * @see #getOneRateDeviceValue()
     */
    public void setOneRateDeviceValue(ExportMeteringDeviceHistoryResultType.OneRateDeviceValue value) {
        this.oneRateDeviceValue = value;
    }

    /**
     * Показания ПУ расхода электроэнергии. Указывается только для ПУ, предоставляющих показания
     * 
     * @return
     *     possible object is
     *     {@link ExportMeteringDeviceHistoryResultType.ElectricDeviceValue }
     *     
     */
    public ExportMeteringDeviceHistoryResultType.ElectricDeviceValue getElectricDeviceValue() {
        return electricDeviceValue;
    }

    /**
     * Sets the value of the electricDeviceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportMeteringDeviceHistoryResultType.ElectricDeviceValue }
     *     
     * @see #getElectricDeviceValue()
     */
    public void setElectricDeviceValue(ExportMeteringDeviceHistoryResultType.ElectricDeviceValue value) {
        this.electricDeviceValue = value;
    }

    /**
     * Объемы потребления ресурсов ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих объем потребленного КР
     * 
     * @return
     *     possible object is
     *     {@link ExportMeteringDeviceHistoryResultType.VolumeDeviceValue }
     *     
     */
    public ExportMeteringDeviceHistoryResultType.VolumeDeviceValue getVolumeDeviceValue() {
        return volumeDeviceValue;
    }

    /**
     * Sets the value of the volumeDeviceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportMeteringDeviceHistoryResultType.VolumeDeviceValue }
     *     
     * @see #getVolumeDeviceValue()
     */
    public void setVolumeDeviceValue(ExportMeteringDeviceHistoryResultType.VolumeDeviceValue value) {
        this.volumeDeviceValue = value;
    }

    /**
     * Данные об архивации ПУ
     * 
     * @return
     *     possible object is
     *     {@link ExportMeteringDeviceHistoryResultType.ArchivedValues }
     *     
     */
    public ExportMeteringDeviceHistoryResultType.ArchivedValues getArchivedValues() {
        return archivedValues;
    }

    /**
     * Sets the value of the archivedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportMeteringDeviceHistoryResultType.ArchivedValues }
     *     
     * @see #getArchivedValues()
     */
    public void setArchivedValues(ExportMeteringDeviceHistoryResultType.ArchivedValues value) {
        this.archivedValues = value;
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
     *         <element name="ArchivingReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "archivingReason"
    })
    public static class ArchivedValues {

        /**
         * Причина архивации. Ссылка на НСИ "Причина архивации прибора учета" (реестровый номер 21).
         * 
         */
        @XmlElement(name = "ArchivingReason", required = true)
        protected NsiRef archivingReason;

        /**
         * Причина архивации. Ссылка на НСИ "Причина архивации прибора учета" (реестровый номер 21).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getArchivingReason() {
            return archivingReason;
        }

        /**
         * Sets the value of the archivingReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getArchivingReason()
         */
        public void setArchivingReason(NsiRef value) {
            this.archivingReason = value;
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
     *         <element name="BaseValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType" minOccurs="0"/>
     *         <element name="Values" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType">
     *                           <sequence minOccurs="0">
     *                             <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
     *                             <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
     *                             <choice>
     *                               <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                             </choice>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
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
        "baseValue",
        "values"
    })
    public static class ElectricDeviceValue {

        /**
         * Базовое показание
         * 
         */
        @XmlElement(name = "BaseValue")
        protected ElectricMeteringValueExportType baseValue;
        /**
         * Показание
         * 
         */
        @XmlElement(name = "Values")
        protected ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values values;

        /**
         * Базовое показание
         * 
         * @return
         *     possible object is
         *     {@link ElectricMeteringValueExportType }
         *     
         */
        public ElectricMeteringValueExportType getBaseValue() {
            return baseValue;
        }

        /**
         * Sets the value of the baseValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElectricMeteringValueExportType }
         *     
         * @see #getBaseValue()
         */
        public void setBaseValue(ElectricMeteringValueExportType value) {
            this.baseValue = value;
        }

        /**
         * Показание
         * 
         * @return
         *     possible object is
         *     {@link ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values }
         *     
         */
        public ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values getValues() {
            return values;
        }

        /**
         * Sets the value of the values property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values }
         *     
         * @see #getValues()
         */
        public void setValues(ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values value) {
            this.values = value;
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
         *         <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType">
         *                 <sequence minOccurs="0">
         *                   <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
         *                   <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
         *                   <choice>
         *                     <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   </choice>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "currentValue",
            "controlValue",
            "verificationValue",
            "excludeISValues"
        })
        public static class Values {

            /**
             * Показания за период
             * 
             */
            @XmlElement(name = "CurrentValue")
            protected List<ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values.CurrentValue> currentValue;
            /**
             * Контрольное показание
             * 
             */
            @XmlElement(name = "ControlValue")
            protected List<ElectricCurrentMeteringValueExportType> controlValue;
            /**
             * Показание поверки, ПУ остается прежним
             * 
             */
            @XmlElement(name = "VerificationValue")
            protected List<ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values.VerificationValue> verificationValue;
            /**
             * Выгрузить показания, поставщик которых не текущая ИС.
             * (Часть показаний может быть внесена не только через ГУИ, а с помощью другой ИС) Если флаг = "истина", то выгружаются показания, созданные через ГУИ и с помощью других ИС, в остальных случаях выгружаются все показания
             * 
             */
            protected Boolean excludeISValues;

            /**
             * Показания за период
             * 
             * Gets the value of the currentValue property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the currentValue property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getCurrentValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values.CurrentValue }
             * </p>
             * 
             * 
             * @return
             *     The value of the currentValue property.
             */
            public List<ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values.CurrentValue> getCurrentValue() {
                if (currentValue == null) {
                    currentValue = new ArrayList<>();
                }
                return this.currentValue;
            }

            /**
             * Контрольное показание
             * 
             * Gets the value of the controlValue property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the controlValue property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getControlValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElectricCurrentMeteringValueExportType }
             * </p>
             * 
             * 
             * @return
             *     The value of the controlValue property.
             */
            public List<ElectricCurrentMeteringValueExportType> getControlValue() {
                if (controlValue == null) {
                    controlValue = new ArrayList<>();
                }
                return this.controlValue;
            }

            /**
             * Показание поверки, ПУ остается прежним
             * 
             * Gets the value of the verificationValue property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the verificationValue property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getVerificationValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values.VerificationValue }
             * </p>
             * 
             * 
             * @return
             *     The value of the verificationValue property.
             */
            public List<ExportMeteringDeviceHistoryResultType.ElectricDeviceValue.Values.VerificationValue> getVerificationValue() {
                if (verificationValue == null) {
                    verificationValue = new ArrayList<>();
                }
                return this.verificationValue;
            }

            /**
             * Выгрузить показания, поставщик которых не текущая ИС.
             * (Часть показаний может быть внесена не только через ГУИ, а с помощью другой ИС) Если флаг = "истина", то выгружаются показания, созданные через ГУИ и с помощью других ИС, в остальных случаях выгружаются все показания
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExcludeISValues() {
                return excludeISValues;
            }

            /**
             * Sets the value of the excludeISValues property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isExcludeISValues()
             */
            public void setExcludeISValues(Boolean value) {
                this.excludeISValues = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricCurrentMeteringValueExportType">
             *       <sequence minOccurs="0">
             *         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "period"
            })
            public static class CurrentValue
                extends ElectricCurrentMeteringValueExportType
            {

                /**
                 * Период, к которому относятся показания
                 * 
                 */
                @XmlElement(name = "Period")
                protected YearMonth period;

                /**
                 * Период, к которому относятся показания
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearMonth }
                 *     
                 */
                public YearMonth getPeriod() {
                    return period;
                }

                /**
                 * Sets the value of the period property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearMonth }
                 *     
                 * @see #getPeriod()
                 */
                public void setPeriod(YearMonth value) {
                    this.period = value;
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
             *         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
             *         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueExportType"/>
             *         <choice>
             *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
                "startDateValue",
                "endDateValue",
                "sealDate",
                "startValue",
                "endValue",
                "plannedVerification",
                "verificationReason"
            })
            public static class VerificationValue {

                /**
                 * Дата начала поверки
                 * 
                 */
                @XmlElement(name = "StartDateValue", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar startDateValue;
                /**
                 * Дата окончания поверки
                 * 
                 */
                @XmlElement(name = "EndDateValue", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar endDateValue;
                /**
                 * Дата опломбиролвания ПУ  после поверки
                 * 
                 */
                @XmlElement(name = "SealDate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar sealDate;
                /**
                 * Показание на начало поверки
                 * 
                 */
                @XmlElement(name = "StartValue", required = true)
                protected ElectricMeteringValueExportType startValue;
                /**
                 * Показание на окончание поверки
                 * 
                 */
                @XmlElement(name = "EndValue", required = true)
                protected ElectricMeteringValueExportType endValue;
                /**
                 * Признак плановой поверки
                 * 
                 */
                @XmlElement(name = "PlannedVerification")
                protected Boolean plannedVerification;
                /**
                 * Причина выхода ПУ из строя (НСИ 224). Вносится при неплановой поверке.
                 * 
                 */
                @XmlElement(name = "VerificationReason")
                protected NsiRef verificationReason;

                /**
                 * Дата начала поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getStartDateValue() {
                    return startDateValue;
                }

                /**
                 * Sets the value of the startDateValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getStartDateValue()
                 */
                public void setStartDateValue(XMLGregorianCalendar value) {
                    this.startDateValue = value;
                }

                /**
                 * Дата окончания поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEndDateValue() {
                    return endDateValue;
                }

                /**
                 * Sets the value of the endDateValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getEndDateValue()
                 */
                public void setEndDateValue(XMLGregorianCalendar value) {
                    this.endDateValue = value;
                }

                /**
                 * Дата опломбиролвания ПУ  после поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getSealDate() {
                    return sealDate;
                }

                /**
                 * Sets the value of the sealDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getSealDate()
                 */
                public void setSealDate(XMLGregorianCalendar value) {
                    this.sealDate = value;
                }

                /**
                 * Показание на начало поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link ElectricMeteringValueExportType }
                 *     
                 */
                public ElectricMeteringValueExportType getStartValue() {
                    return startValue;
                }

                /**
                 * Sets the value of the startValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElectricMeteringValueExportType }
                 *     
                 * @see #getStartValue()
                 */
                public void setStartValue(ElectricMeteringValueExportType value) {
                    this.startValue = value;
                }

                /**
                 * Показание на окончание поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link ElectricMeteringValueExportType }
                 *     
                 */
                public ElectricMeteringValueExportType getEndValue() {
                    return endValue;
                }

                /**
                 * Sets the value of the endValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElectricMeteringValueExportType }
                 *     
                 * @see #getEndValue()
                 */
                public void setEndValue(ElectricMeteringValueExportType value) {
                    this.endValue = value;
                }

                /**
                 * Признак плановой поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPlannedVerification() {
                    return plannedVerification;
                }

                /**
                 * Sets the value of the plannedVerification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isPlannedVerification()
                 */
                public void setPlannedVerification(Boolean value) {
                    this.plannedVerification = value;
                }

                /**
                 * Причина выхода ПУ из строя (НСИ 224). Вносится при неплановой поверке.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getVerificationReason() {
                    return verificationReason;
                }

                /**
                 * Sets the value of the verificationReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getVerificationReason()
                 */
                public void setVerificationReason(NsiRef value) {
                    this.verificationReason = value;
                }

            }

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
     *         <element name="BaseValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3" minOccurs="0"/>
     *         <element name="Values" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType">
     *                           <sequence minOccurs="0">
     *                             <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
     *                             <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
     *                             <choice>
     *                               <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                             </choice>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
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
        "baseValue",
        "values"
    })
    public static class OneRateDeviceValue {

        /**
         * Базовое показание
         * 
         */
        @XmlElement(name = "BaseValue")
        protected List<OneRateMeteringValueExportType> baseValue;
        /**
         * Показание
         * 
         */
        @XmlElement(name = "Values")
        protected ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values values;

        /**
         * Базовое показание
         * 
         * Gets the value of the baseValue property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baseValue property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBaseValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneRateMeteringValueExportType }
         * </p>
         * 
         * 
         * @return
         *     The value of the baseValue property.
         */
        public List<OneRateMeteringValueExportType> getBaseValue() {
            if (baseValue == null) {
                baseValue = new ArrayList<>();
            }
            return this.baseValue;
        }

        /**
         * Показание
         * 
         * @return
         *     possible object is
         *     {@link ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values }
         *     
         */
        public ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values getValues() {
            return values;
        }

        /**
         * Sets the value of the values property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values }
         *     
         * @see #getValues()
         */
        public void setValues(ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values value) {
            this.values = value;
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
         *         <element name="CurrentValue" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType">
         *                 <sequence minOccurs="0">
         *                   <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="VerificationValue" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
         *                   <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
         *                   <choice>
         *                     <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   </choice>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "currentValue",
            "controlValue",
            "verificationValue",
            "excludeISValues"
        })
        public static class Values {

            /**
             * Показание за период
             * 
             */
            @XmlElement(name = "CurrentValue")
            protected List<ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values.CurrentValue> currentValue;
            /**
             * Контрольное показание
             * 
             */
            @XmlElement(name = "ControlValue")
            protected List<OneRateCurrentMeteringValueExportType> controlValue;
            /**
             * Показание поверки, ПУ остается прежним
             * 
             */
            @XmlElement(name = "VerificationValue")
            protected List<ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values.VerificationValue> verificationValue;
            /**
             * Выгрузить показания, поставщик которых не текущая ИС.
             * (Часть показаний может быть внесена не только через ГУИ, а с помощью другой ИС) Если флаг = "истина", то выгружаются показания, созданные через ГУИ и с помощью других ИС, в остальных случаях выгружаются все показания
             * 
             */
            protected Boolean excludeISValues;

            /**
             * Показание за период
             * 
             * Gets the value of the currentValue property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the currentValue property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getCurrentValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values.CurrentValue }
             * </p>
             * 
             * 
             * @return
             *     The value of the currentValue property.
             */
            public List<ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values.CurrentValue> getCurrentValue() {
                if (currentValue == null) {
                    currentValue = new ArrayList<>();
                }
                return this.currentValue;
            }

            /**
             * Контрольное показание
             * 
             * Gets the value of the controlValue property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the controlValue property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getControlValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OneRateCurrentMeteringValueExportType }
             * </p>
             * 
             * 
             * @return
             *     The value of the controlValue property.
             */
            public List<OneRateCurrentMeteringValueExportType> getControlValue() {
                if (controlValue == null) {
                    controlValue = new ArrayList<>();
                }
                return this.controlValue;
            }

            /**
             * Показание поверки, ПУ остается прежним
             * 
             * Gets the value of the verificationValue property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the verificationValue property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getVerificationValue().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values.VerificationValue }
             * </p>
             * 
             * 
             * @return
             *     The value of the verificationValue property.
             */
            public List<ExportMeteringDeviceHistoryResultType.OneRateDeviceValue.Values.VerificationValue> getVerificationValue() {
                if (verificationValue == null) {
                    verificationValue = new ArrayList<>();
                }
                return this.verificationValue;
            }

            /**
             * Выгрузить показания, поставщик которых не текущая ИС.
             * (Часть показаний может быть внесена не только через ГУИ, а с помощью другой ИС) Если флаг = "истина", то выгружаются показания, созданные через ГУИ и с помощью других ИС, в остальных случаях выгружаются все показания
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isExcludeISValues() {
                return excludeISValues;
            }

            /**
             * Sets the value of the excludeISValues property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isExcludeISValues()
             */
            public void setExcludeISValues(Boolean value) {
                this.excludeISValues = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateCurrentMeteringValueExportType">
             *       <sequence minOccurs="0">
             *         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
             *       </sequence>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "period"
            })
            public static class CurrentValue
                extends OneRateCurrentMeteringValueExportType
            {

                /**
                 * Период, к которому относятся показания
                 * 
                 */
                @XmlElement(name = "Period")
                protected YearMonth period;

                /**
                 * Период, к которому относятся показания
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearMonth }
                 *     
                 */
                public YearMonth getPeriod() {
                    return period;
                }

                /**
                 * Sets the value of the period property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearMonth }
                 *     
                 * @see #getPeriod()
                 */
                public void setPeriod(YearMonth value) {
                    this.period = value;
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
             *         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
             *         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueExportType" maxOccurs="3"/>
             *         <choice>
             *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
                "startDateValue",
                "endDateValue",
                "sealDate",
                "startValue",
                "endValue",
                "plannedVerification",
                "verificationReason"
            })
            public static class VerificationValue {

                /**
                 * Дата начала поверки
                 * 
                 */
                @XmlElement(name = "StartDateValue", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar startDateValue;
                /**
                 * Дата окончания поверки
                 * 
                 */
                @XmlElement(name = "EndDateValue", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar endDateValue;
                /**
                 * Дата опломбиролвания ПУ  после поверки
                 * 
                 */
                @XmlElement(name = "SealDate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar sealDate;
                /**
                 * Показание на начало поверки
                 * 
                 */
                @XmlElement(name = "StartValue", required = true)
                protected List<OneRateMeteringValueExportType> startValue;
                /**
                 * Показание на окончание поверки
                 * 
                 */
                @XmlElement(name = "EndValue", required = true)
                protected List<OneRateMeteringValueExportType> endValue;
                /**
                 * Признак плановой поверки
                 * 
                 */
                @XmlElement(name = "PlannedVerification")
                protected Boolean plannedVerification;
                /**
                 * Причина выхода ПУ из строя (НСИ 224). Вносится при неплановой поверке.
                 * 
                 */
                @XmlElement(name = "VerificationReason")
                protected NsiRef verificationReason;

                /**
                 * Дата начала поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getStartDateValue() {
                    return startDateValue;
                }

                /**
                 * Sets the value of the startDateValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getStartDateValue()
                 */
                public void setStartDateValue(XMLGregorianCalendar value) {
                    this.startDateValue = value;
                }

                /**
                 * Дата окончания поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getEndDateValue() {
                    return endDateValue;
                }

                /**
                 * Sets the value of the endDateValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getEndDateValue()
                 */
                public void setEndDateValue(XMLGregorianCalendar value) {
                    this.endDateValue = value;
                }

                /**
                 * Дата опломбиролвания ПУ  после поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getSealDate() {
                    return sealDate;
                }

                /**
                 * Sets the value of the sealDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getSealDate()
                 */
                public void setSealDate(XMLGregorianCalendar value) {
                    this.sealDate = value;
                }

                /**
                 * Показание на начало поверки
                 * 
                 * Gets the value of the startValue property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the startValue property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getStartValue().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OneRateMeteringValueExportType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the startValue property.
                 */
                public List<OneRateMeteringValueExportType> getStartValue() {
                    if (startValue == null) {
                        startValue = new ArrayList<>();
                    }
                    return this.startValue;
                }

                /**
                 * Показание на окончание поверки
                 * 
                 * Gets the value of the endValue property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the endValue property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getEndValue().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OneRateMeteringValueExportType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the endValue property.
                 */
                public List<OneRateMeteringValueExportType> getEndValue() {
                    if (endValue == null) {
                        endValue = new ArrayList<>();
                    }
                    return this.endValue;
                }

                /**
                 * Признак плановой поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPlannedVerification() {
                    return plannedVerification;
                }

                /**
                 * Sets the value of the plannedVerification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isPlannedVerification()
                 */
                public void setPlannedVerification(Boolean value) {
                    this.plannedVerification = value;
                }

                /**
                 * Причина выхода ПУ из строя (НСИ 224). Вносится при неплановой поверке.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getVerificationReason() {
                    return verificationReason;
                }

                /**
                 * Sets the value of the verificationReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getVerificationReason()
                 */
                public void setVerificationReason(NsiRef value) {
                    this.verificationReason = value;
                }

            }

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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportType">
     *       <sequence>
     *         <element name="excludeISValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "excludeISValues"
    })
    public static class VolumeDeviceValue
        extends VolumeMeteringValueExportType
    {

        /**
         * Выгрузить данные, поставщик которых не текущая ИС.
         * (Часть данных может быть внесена не только через ГУИ, а с помощью другой ИС) Если флаг = "истина", то выгружаются данные, созданные через ГУИ и с помощью других ИС, в остальных случаях выгружаются все данные
         * 
         */
        protected Boolean excludeISValues;

        /**
         * Выгрузить данные, поставщик которых не текущая ИС.
         * (Часть данных может быть внесена не только через ГУИ, а с помощью другой ИС) Если флаг = "истина", то выгружаются данные, созданные через ГУИ и с помощью других ИС, в остальных случаях выгружаются все данные
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludeISValues() {
            return excludeISValues;
        }

        /**
         * Sets the value of the excludeISValues property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isExcludeISValues()
         */
        public void setExcludeISValues(Boolean value) {
            this.excludeISValues = value;
        }

    }

}
