
package ru.gosuslugi.dom.schema.integration.device_metering;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.YearMonth;
import ru.gosuslugi.dom.schema.integration.metering_device_base.ElectricMeteringValueBaseType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.OneRateMeteringValueBaseType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.VolumeMeteringValueBaseType;
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
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="MeteringDevicesValues" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *                     <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *                   </choice>
 *                   <choice>
 *                     <element name="OneRateDeviceValue">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CurrentValue" maxOccurs="3" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType">
 *                                       <sequence minOccurs="0">
 *                                         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType" maxOccurs="3" minOccurs="0"/>
 *                               <element name="VerificationValue" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
 *                                         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
 *                                         <choice>
 *                                           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         </choice>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ElectricDeviceValue">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CurrentValue" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType">
 *                                       <sequence minOccurs="0">
 *                                         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType" minOccurs="0"/>
 *                               <element name="VerificationValue" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
 *                                         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
 *                                         <choice>
 *                                           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         </choice>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="VolumeDeviceValue">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CurrentValue" maxOccurs="3" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType">
 *                                       <sequence minOccurs="0">
 *                                         <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType" maxOccurs="3" minOccurs="0"/>
 *                               <element name="VerificationValue" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
 *                                         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
 *                                         <choice>
 *                                           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         </choice>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fiasHouseGuid",
    "meteringDevicesValues"
})
@XmlRootElement(name = "importMeteringDeviceValuesRequest")
public class ImportMeteringDeviceValuesRequest
    extends BaseType
{

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Показания и объемы потребленных ресурсов ПУ
     * 
     */
    @XmlElement(name = "MeteringDevicesValues", required = true)
    protected List<ImportMeteringDeviceValuesRequest.MeteringDevicesValues> meteringDevicesValues;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

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
     * Показания и объемы потребленных ресурсов ПУ
     * 
     * Gets the value of the meteringDevicesValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteringDevicesValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMeteringDevicesValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues }
     * </p>
     * 
     * 
     * @return
     *     The value of the meteringDevicesValues property.
     */
    public List<ImportMeteringDeviceValuesRequest.MeteringDevicesValues> getMeteringDevicesValues() {
        if (meteringDevicesValues == null) {
            meteringDevicesValues = new ArrayList<>();
        }
        return this.meteringDevicesValues;
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
            return "10.0.1.1";
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
     *         <choice>
     *           <element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
     *           <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
     *         </choice>
     *         <choice>
     *           <element name="OneRateDeviceValue">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="CurrentValue" maxOccurs="3" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType">
     *                             <sequence minOccurs="0">
     *                               <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType" maxOccurs="3" minOccurs="0"/>
     *                     <element name="VerificationValue" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
     *                               <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
     *                               <choice>
     *                                 <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                 <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                               </choice>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
     *                     <element name="CurrentValue" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType">
     *                             <sequence minOccurs="0">
     *                               <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType" minOccurs="0"/>
     *                     <element name="VerificationValue" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
     *                               <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
     *                               <choice>
     *                                 <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                 <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                               </choice>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="CurrentValue" maxOccurs="3" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType">
     *                             <sequence minOccurs="0">
     *                               <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType" maxOccurs="3" minOccurs="0"/>
     *                     <element name="VerificationValue" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
     *                               <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
     *                               <choice>
     *                                 <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                 <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                               </choice>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "meteringDeviceRootGUID",
        "meteringDeviceVersionGUID",
        "oneRateDeviceValue",
        "electricDeviceValue",
        "volumeDeviceValue"
    })
    public static class MeteringDevicesValues {

        /**
         * Идентификатор ПУ
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
         * Показания по ПУ (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих показания
         * 
         */
        @XmlElement(name = "OneRateDeviceValue")
        protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue oneRateDeviceValue;
        /**
         * Показания по ПУ (электрическая энергия). Указывается только для ПУ, предоставляющих показания
         * 
         */
        @XmlElement(name = "ElectricDeviceValue")
        protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue electricDeviceValue;
        /**
         * Объемы потребленных ресурсов по ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих объем потребленного КР
         * 
         */
        @XmlElement(name = "VolumeDeviceValue")
        protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue volumeDeviceValue;

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
         * Показания по ПУ (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих показания
         * 
         * @return
         *     possible object is
         *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue }
         *     
         */
        public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue getOneRateDeviceValue() {
            return oneRateDeviceValue;
        }

        /**
         * Sets the value of the oneRateDeviceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue }
         *     
         * @see #getOneRateDeviceValue()
         */
        public void setOneRateDeviceValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue value) {
            this.oneRateDeviceValue = value;
        }

        /**
         * Показания по ПУ (электрическая энергия). Указывается только для ПУ, предоставляющих показания
         * 
         * @return
         *     possible object is
         *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue }
         *     
         */
        public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue getElectricDeviceValue() {
            return electricDeviceValue;
        }

        /**
         * Sets the value of the electricDeviceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue }
         *     
         * @see #getElectricDeviceValue()
         */
        public void setElectricDeviceValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue value) {
            this.electricDeviceValue = value;
        }

        /**
         * Объемы потребленных ресурсов по ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих объем потребленного КР
         * 
         * @return
         *     possible object is
         *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue }
         *     
         */
        public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue getVolumeDeviceValue() {
            return volumeDeviceValue;
        }

        /**
         * Sets the value of the volumeDeviceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue }
         *     
         * @see #getVolumeDeviceValue()
         */
        public void setVolumeDeviceValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue value) {
            this.volumeDeviceValue = value;
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
         *         <element name="CurrentValue" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType">
         *                 <sequence minOccurs="0">
         *                   <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType" minOccurs="0"/>
         *         <element name="VerificationValue" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
         *                   <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
         *                   <choice>
         *                     <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   </choice>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "currentValue",
            "controlValue",
            "verificationValue"
        })
        public static class ElectricDeviceValue {

            /**
             * Показания за период
             * 
             */
            @XmlElement(name = "CurrentValue")
            protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.CurrentValue currentValue;
            /**
             * Контрольное показание
             * 
             */
            @XmlElement(name = "ControlValue")
            protected ElectricMeteringValueImportType controlValue;
            /**
             * Показание поверки, ПУ остается прежним либо архивируется в случае выхода из строя
             * 
             */
            @XmlElement(name = "VerificationValue")
            protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.VerificationValue verificationValue;

            /**
             * Показания за период
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.CurrentValue }
             *     
             */
            public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.CurrentValue getCurrentValue() {
                return currentValue;
            }

            /**
             * Sets the value of the currentValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.CurrentValue }
             *     
             * @see #getCurrentValue()
             */
            public void setCurrentValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.CurrentValue value) {
                this.currentValue = value;
            }

            /**
             * Контрольное показание
             * 
             * @return
             *     possible object is
             *     {@link ElectricMeteringValueImportType }
             *     
             */
            public ElectricMeteringValueImportType getControlValue() {
                return controlValue;
            }

            /**
             * Sets the value of the controlValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElectricMeteringValueImportType }
             *     
             * @see #getControlValue()
             */
            public void setControlValue(ElectricMeteringValueImportType value) {
                this.controlValue = value;
            }

            /**
             * Показание поверки, ПУ остается прежним либо архивируется в случае выхода из строя
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.VerificationValue }
             *     
             */
            public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.VerificationValue getVerificationValue() {
                return verificationValue;
            }

            /**
             * Sets the value of the verificationValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.VerificationValue }
             *     
             * @see #getVerificationValue()
             */
            public void setVerificationValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.ElectricDeviceValue.VerificationValue value) {
                this.verificationValue = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}ElectricMeteringValueImportType">
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
                extends ElectricMeteringValueImportType
            {

                /**
                 * Период, за который передаются показания.
                 * 
                 * Если не указан, то показания относятся к месяцу Даты снятия показаний
                 * 
                 */
                @XmlElement(name = "Period")
                protected YearMonth period;

                /**
                 * Период, за который передаются показания.
                 * 
                 * Если не указан, то показания относятся к месяцу Даты снятия показаний
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
             *         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
             *         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
             *         <choice>
             *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         </choice>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "verificationReason",
                "transportGUID"
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
                protected ElectricMeteringValueBaseType startValue;
                /**
                 * Показание на окончание поверки
                 * 
                 */
                @XmlElement(name = "EndValue", required = true)
                protected ElectricMeteringValueBaseType endValue;
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
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

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
                 *     {@link ElectricMeteringValueBaseType }
                 *     
                 */
                public ElectricMeteringValueBaseType getStartValue() {
                    return startValue;
                }

                /**
                 * Sets the value of the startValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElectricMeteringValueBaseType }
                 *     
                 * @see #getStartValue()
                 */
                public void setStartValue(ElectricMeteringValueBaseType value) {
                    this.startValue = value;
                }

                /**
                 * Показание на окончание поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link ElectricMeteringValueBaseType }
                 *     
                 */
                public ElectricMeteringValueBaseType getEndValue() {
                    return endValue;
                }

                /**
                 * Sets the value of the endValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElectricMeteringValueBaseType }
                 *     
                 * @see #getEndValue()
                 */
                public void setEndValue(ElectricMeteringValueBaseType value) {
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
         *         <element name="CurrentValue" maxOccurs="3" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType">
         *                 <sequence minOccurs="0">
         *                   <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType" maxOccurs="3" minOccurs="0"/>
         *         <element name="VerificationValue" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
         *                   <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
         *                   <choice>
         *                     <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   </choice>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "currentValue",
            "controlValue",
            "verificationValue"
        })
        public static class OneRateDeviceValue {

            /**
             * Показания за период
             * 
             */
            @XmlElement(name = "CurrentValue")
            protected List<ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.CurrentValue> currentValue;
            /**
             * Контрольное показание
             * 
             */
            @XmlElement(name = "ControlValue")
            protected List<OneRateMeteringValueImportType> controlValue;
            /**
             * Показание поверки, ПУ остается прежним либо архивируется в случае выхода из строя
             * 
             */
            @XmlElement(name = "VerificationValue")
            protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.VerificationValue verificationValue;

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
             * {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.CurrentValue }
             * </p>
             * 
             * 
             * @return
             *     The value of the currentValue property.
             */
            public List<ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.CurrentValue> getCurrentValue() {
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
             * {@link OneRateMeteringValueImportType }
             * </p>
             * 
             * 
             * @return
             *     The value of the controlValue property.
             */
            public List<OneRateMeteringValueImportType> getControlValue() {
                if (controlValue == null) {
                    controlValue = new ArrayList<>();
                }
                return this.controlValue;
            }

            /**
             * Показание поверки, ПУ остается прежним либо архивируется в случае выхода из строя
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.VerificationValue }
             *     
             */
            public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.VerificationValue getVerificationValue() {
                return verificationValue;
            }

            /**
             * Sets the value of the verificationValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.VerificationValue }
             *     
             * @see #getVerificationValue()
             */
            public void setVerificationValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.VerificationValue value) {
                this.verificationValue = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}OneRateMeteringValueImportType">
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
                extends OneRateMeteringValueImportType
            {

                /**
                 * Период, за который передаются показания.
                 * 
                 * Если не указан, то показания относятся к месяцу Даты снятия показаний
                 * 
                 */
                @XmlElement(name = "Period")
                protected YearMonth period;

                /**
                 * Период, за который передаются показания.
                 * 
                 * Если не указан, то показания относятся к месяцу Даты снятия показаний
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
             *         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
             *         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
             *         <choice>
             *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         </choice>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "verificationReason",
                "transportGUID"
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
                protected List<OneRateMeteringValueBaseType> startValue;
                /**
                 * Показание на окончание поверки
                 * 
                 */
                @XmlElement(name = "EndValue", required = true)
                protected List<OneRateMeteringValueBaseType> endValue;
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
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

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
                 * {@link OneRateMeteringValueBaseType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the startValue property.
                 */
                public List<OneRateMeteringValueBaseType> getStartValue() {
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
                 * {@link OneRateMeteringValueBaseType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the endValue property.
                 */
                public List<OneRateMeteringValueBaseType> getEndValue() {
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
         *         <element name="CurrentValue" maxOccurs="3" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType">
         *                 <sequence minOccurs="0">
         *                   <element name="Period" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearMonth"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ControlValue" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType" maxOccurs="3" minOccurs="0"/>
         *         <element name="VerificationValue" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="EndDateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="SealDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
         *                   <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
         *                   <choice>
         *                     <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   </choice>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "currentValue",
            "controlValue",
            "verificationValue"
        })
        public static class VolumeDeviceValue {

            /**
             * Объем потребления за период
             * 
             */
            @XmlElement(name = "CurrentValue")
            protected List<ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.CurrentValue> currentValue;
            /**
             * Контрольный объем
             * 
             */
            @XmlElement(name = "ControlValue")
            protected List<VolumeMeteringValueImportType> controlValue;
            /**
             * Сведения о поверке, ПУ остается прежним либо архивируется в случае выхода из строя
             * 
             */
            @XmlElement(name = "VerificationValue")
            protected ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.VerificationValue verificationValue;

            /**
             * Объем потребления за период
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
             * {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.CurrentValue }
             * </p>
             * 
             * 
             * @return
             *     The value of the currentValue property.
             */
            public List<ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.CurrentValue> getCurrentValue() {
                if (currentValue == null) {
                    currentValue = new ArrayList<>();
                }
                return this.currentValue;
            }

            /**
             * Контрольный объем
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
             * {@link VolumeMeteringValueImportType }
             * </p>
             * 
             * 
             * @return
             *     The value of the controlValue property.
             */
            public List<VolumeMeteringValueImportType> getControlValue() {
                if (controlValue == null) {
                    controlValue = new ArrayList<>();
                }
                return this.controlValue;
            }

            /**
             * Сведения о поверке, ПУ остается прежним либо архивируется в случае выхода из строя
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.VerificationValue }
             *     
             */
            public ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.VerificationValue getVerificationValue() {
                return verificationValue;
            }

            /**
             * Sets the value of the verificationValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.VerificationValue }
             *     
             * @see #getVerificationValue()
             */
            public void setVerificationValue(ImportMeteringDeviceValuesRequest.MeteringDevicesValues.VolumeDeviceValue.VerificationValue value) {
                this.verificationValue = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueImportType">
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
                extends VolumeMeteringValueImportType
            {

                /**
                 * Период, за который передаются показания.
                 * 
                 * Если не указан, то показания относятся к месяцу Даты снятия показаний
                 * 
                 */
                @XmlElement(name = "Period")
                protected YearMonth period;

                /**
                 * Период, за который передаются показания.
                 * 
                 * Если не указан, то показания относятся к месяцу Даты снятия показаний
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
             *         <element name="StartValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
             *         <element name="EndValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3" minOccurs="0"/>
             *         <choice>
             *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="VerificationReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         </choice>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "verificationReason",
                "transportGUID"
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
                 * Объем на начало поверки
                 * 
                 */
                @XmlElement(name = "StartValue")
                protected List<VolumeMeteringValueBaseType> startValue;
                /**
                 * Объем на окончание поверки
                 * 
                 */
                @XmlElement(name = "EndValue")
                protected List<VolumeMeteringValueBaseType> endValue;
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
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

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
                 * Объем на начало поверки
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
                 * {@link VolumeMeteringValueBaseType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the startValue property.
                 */
                public List<VolumeMeteringValueBaseType> getStartValue() {
                    if (startValue == null) {
                        startValue = new ArrayList<>();
                    }
                    return this.startValue;
                }

                /**
                 * Объем на окончание поверки
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
                 * {@link VolumeMeteringValueBaseType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the endValue property.
                 */
                public List<VolumeMeteringValueBaseType> getEndValue() {
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

            }

        }

    }

}
