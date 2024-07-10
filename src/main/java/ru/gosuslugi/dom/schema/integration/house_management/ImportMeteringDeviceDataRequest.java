
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *         <element name="MeteringDevice" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="DeviceDataToCreate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationType"/>
 *                     <element name="DeviceDataToUpdate">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *                               <choice>
 *                                 <element name="UpdateBeforeDevicesValues" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationType"/>
 *                                 <element name="UpdateAfterDevicesValues" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceToUpdateAfterDevicesValuesType"/>
 *                                 <element name="LinkedWithMetering">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="ArchiveDevice">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="ArchivingReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="ReplaceDevice">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="VerificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                           <choice>
 *                                             <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                             <element name="ReasonVerification" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                           </choice>
 *                                           <choice minOccurs="0">
 *                                             <element name="DeviceValueMunicipalResourceNotElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
 *                                             <element name="DeviceValueMunicipalResourceElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
 *                                             <element name="VolumeDeviceValues" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3"/>
 *                                           </choice>
 *                                           <element name="ReplacingMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </choice>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.1.0.8""/>
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
    "meteringDevice"
})
@XmlRootElement(name = "importMeteringDeviceDataRequest")
public class ImportMeteringDeviceDataRequest
    extends BaseType
{

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Приборы учета
     * 
     */
    @XmlElement(name = "MeteringDevice", required = true)
    protected List<ImportMeteringDeviceDataRequest.MeteringDevice> meteringDevice;
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
     * Приборы учета
     * 
     * Gets the value of the meteringDevice property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meteringDevice property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMeteringDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportMeteringDeviceDataRequest.MeteringDevice }
     * </p>
     * 
     * 
     * @return
     *     The value of the meteringDevice property.
     */
    public List<ImportMeteringDeviceDataRequest.MeteringDevice> getMeteringDevice() {
        if (meteringDevice == null) {
            meteringDevice = new ArrayList<>();
        }
        return this.meteringDevice;
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
            return "11.1.0.8";
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
     *         <choice>
     *           <element name="DeviceDataToCreate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationType"/>
     *           <element name="DeviceDataToUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
     *                     <choice>
     *                       <element name="UpdateBeforeDevicesValues" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationType"/>
     *                       <element name="UpdateAfterDevicesValues" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceToUpdateAfterDevicesValuesType"/>
     *                       <element name="LinkedWithMetering">
     *                         <complexType>
     *                           <complexContent>
     *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               <sequence>
     *                                 <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10"/>
     *                               </sequence>
     *                             </restriction>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="ArchiveDevice">
     *                         <complexType>
     *                           <complexContent>
     *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               <sequence>
     *                                 <element name="ArchivingReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                               </sequence>
     *                             </restriction>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="ReplaceDevice">
     *                         <complexType>
     *                           <complexContent>
     *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               <sequence>
     *                                 <element name="VerificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                 <choice>
     *                                   <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                   <element name="ReasonVerification" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                                 </choice>
     *                                 <choice minOccurs="0">
     *                                   <element name="DeviceValueMunicipalResourceNotElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
     *                                   <element name="DeviceValueMunicipalResourceElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
     *                                   <element name="VolumeDeviceValues" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3"/>
     *                                 </choice>
     *                                 <element name="ReplacingMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
     *                               </sequence>
     *                             </restriction>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                     </choice>
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
        "transportGUID",
        "deviceDataToCreate",
        "deviceDataToUpdate"
    })
    public static class MeteringDevice {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Данные ПУ для добавления  в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "DeviceDataToCreate")
        protected MeteringDeviceFullInformationType deviceDataToCreate;
        /**
         * Изменение существующего в ГИС ЖКХ ПУ  (в том числе замена ПУ, архивация ПУ)
         * 
         */
        @XmlElement(name = "DeviceDataToUpdate")
        protected ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate deviceDataToUpdate;

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
         * Данные ПУ для добавления  в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link MeteringDeviceFullInformationType }
         *     
         */
        public MeteringDeviceFullInformationType getDeviceDataToCreate() {
            return deviceDataToCreate;
        }

        /**
         * Sets the value of the deviceDataToCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeteringDeviceFullInformationType }
         *     
         * @see #getDeviceDataToCreate()
         */
        public void setDeviceDataToCreate(MeteringDeviceFullInformationType value) {
            this.deviceDataToCreate = value;
        }

        /**
         * Изменение существующего в ГИС ЖКХ ПУ  (в том числе замена ПУ, архивация ПУ)
         * 
         * @return
         *     possible object is
         *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate }
         *     
         */
        public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate getDeviceDataToUpdate() {
            return deviceDataToUpdate;
        }

        /**
         * Sets the value of the deviceDataToUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate }
         *     
         * @see #getDeviceDataToUpdate()
         */
        public void setDeviceDataToUpdate(ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate value) {
            this.deviceDataToUpdate = value;
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
         *         <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
         *         <choice>
         *           <element name="UpdateBeforeDevicesValues" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationType"/>
         *           <element name="UpdateAfterDevicesValues" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceToUpdateAfterDevicesValuesType"/>
         *           <element name="LinkedWithMetering">
         *             <complexType>
         *               <complexContent>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   <sequence>
         *                     <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10"/>
         *                   </sequence>
         *                 </restriction>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="ArchiveDevice">
         *             <complexType>
         *               <complexContent>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   <sequence>
         *                     <element name="ArchivingReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   </sequence>
         *                 </restriction>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="ReplaceDevice">
         *             <complexType>
         *               <complexContent>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   <sequence>
         *                     <element name="VerificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                     <choice>
         *                       <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                       <element name="ReasonVerification" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                     </choice>
         *                     <choice minOccurs="0">
         *                       <element name="DeviceValueMunicipalResourceNotElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
         *                       <element name="DeviceValueMunicipalResourceElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
         *                       <element name="VolumeDeviceValues" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3"/>
         *                     </choice>
         *                     <element name="ReplacingMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
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
            "meteringDeviceVersionGUID",
            "updateBeforeDevicesValues",
            "updateAfterDevicesValues",
            "linkedWithMetering",
            "archiveDevice",
            "replaceDevice"
        })
        public static class DeviceDataToUpdate {

            /**
             * Идентификатор версии ПУ (для обновления данных)
             * 
             */
            @XmlElement(name = "MeteringDeviceVersionGUID", required = true)
            protected String meteringDeviceVersionGUID;
            /**
             * Обновление характеристик ПУ до начала внесения показаний. Необходимо прислать  все актуальные сведения по ПУ
             * 
             */
            @XmlElement(name = "UpdateBeforeDevicesValues")
            protected MeteringDeviceFullInformationType updateBeforeDevicesValues;
            /**
             * Обновление характеристик ПУ после начала внесения показаний
             * 
             */
            @XmlElement(name = "UpdateAfterDevicesValues")
            protected MeteringDeviceToUpdateAfterDevicesValuesType updateAfterDevicesValues;
            /**
             * Связать ПУ с другими заведенными в ГИС ЖКХ ПУ. Операция возможна только, если для текущего ПУ установлен признак "Объем ресурса(ов) определяется с помощью нескольких приборов учета". Необходимо присылать актуальную коллекцию связанных ПУ
             * 
             */
            @XmlElement(name = "LinkedWithMetering")
            protected ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering linkedWithMetering;
            /**
             * Архивация ПУ без замены на другой ПУ
             * 
             */
            @XmlElement(name = "ArchiveDevice")
            protected ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice archiveDevice;
            /**
             * Архивация ПУ с заменой на другой ПУ
             * 
             */
            @XmlElement(name = "ReplaceDevice")
            protected ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice replaceDevice;

            /**
             * Идентификатор версии ПУ (для обновления данных)
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
             * Обновление характеристик ПУ до начала внесения показаний. Необходимо прислать  все актуальные сведения по ПУ
             * 
             * @return
             *     possible object is
             *     {@link MeteringDeviceFullInformationType }
             *     
             */
            public MeteringDeviceFullInformationType getUpdateBeforeDevicesValues() {
                return updateBeforeDevicesValues;
            }

            /**
             * Sets the value of the updateBeforeDevicesValues property.
             * 
             * @param value
             *     allowed object is
             *     {@link MeteringDeviceFullInformationType }
             *     
             * @see #getUpdateBeforeDevicesValues()
             */
            public void setUpdateBeforeDevicesValues(MeteringDeviceFullInformationType value) {
                this.updateBeforeDevicesValues = value;
            }

            /**
             * Обновление характеристик ПУ после начала внесения показаний
             * 
             * @return
             *     possible object is
             *     {@link MeteringDeviceToUpdateAfterDevicesValuesType }
             *     
             */
            public MeteringDeviceToUpdateAfterDevicesValuesType getUpdateAfterDevicesValues() {
                return updateAfterDevicesValues;
            }

            /**
             * Sets the value of the updateAfterDevicesValues property.
             * 
             * @param value
             *     allowed object is
             *     {@link MeteringDeviceToUpdateAfterDevicesValuesType }
             *     
             * @see #getUpdateAfterDevicesValues()
             */
            public void setUpdateAfterDevicesValues(MeteringDeviceToUpdateAfterDevicesValuesType value) {
                this.updateAfterDevicesValues = value;
            }

            /**
             * Связать ПУ с другими заведенными в ГИС ЖКХ ПУ. Операция возможна только, если для текущего ПУ установлен признак "Объем ресурса(ов) определяется с помощью нескольких приборов учета". Необходимо присылать актуальную коллекцию связанных ПУ
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering }
             *     
             */
            public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering getLinkedWithMetering() {
                return linkedWithMetering;
            }

            /**
             * Sets the value of the linkedWithMetering property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering }
             *     
             * @see #getLinkedWithMetering()
             */
            public void setLinkedWithMetering(ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.LinkedWithMetering value) {
                this.linkedWithMetering = value;
            }

            /**
             * Архивация ПУ без замены на другой ПУ
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice }
             *     
             */
            public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice getArchiveDevice() {
                return archiveDevice;
            }

            /**
             * Sets the value of the archiveDevice property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice }
             *     
             * @see #getArchiveDevice()
             */
            public void setArchiveDevice(ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ArchiveDevice value) {
                this.archiveDevice = value;
            }

            /**
             * Архивация ПУ с заменой на другой ПУ
             * 
             * @return
             *     possible object is
             *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice }
             *     
             */
            public ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice getReplaceDevice() {
                return replaceDevice;
            }

            /**
             * Sets the value of the replaceDevice property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice }
             *     
             * @see #getReplaceDevice()
             */
            public void setReplaceDevice(ImportMeteringDeviceDataRequest.MeteringDevice.DeviceDataToUpdate.ReplaceDevice value) {
                this.replaceDevice = value;
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
            public static class ArchiveDevice {

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
             *         <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10"/>
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
                "linkedMeteringDeviceVersionGUID"
            })
            public static class LinkedWithMetering {

                /**
                 * Идентификатор версии ПУ, заведенного в ГИС ЖКХ, с которым требуется установить связь текущего ПУ
                 * 
                 */
                @XmlElement(name = "LinkedMeteringDeviceVersionGUID", required = true)
                protected List<String> linkedMeteringDeviceVersionGUID;

                /**
                 * Идентификатор версии ПУ, заведенного в ГИС ЖКХ, с которым требуется установить связь текущего ПУ
                 * 
                 * Gets the value of the linkedMeteringDeviceVersionGUID property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the linkedMeteringDeviceVersionGUID property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getLinkedMeteringDeviceVersionGUID().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the linkedMeteringDeviceVersionGUID property.
                 */
                public List<String> getLinkedMeteringDeviceVersionGUID() {
                    if (linkedMeteringDeviceVersionGUID == null) {
                        linkedMeteringDeviceVersionGUID = new ArrayList<>();
                    }
                    return this.linkedMeteringDeviceVersionGUID;
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
             *         <element name="VerificationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <choice>
             *           <element name="PlannedVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="ReasonVerification" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         </choice>
             *         <choice minOccurs="0">
             *           <element name="DeviceValueMunicipalResourceNotElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType" maxOccurs="3"/>
             *           <element name="DeviceValueMunicipalResourceElectric" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType"/>
             *           <element name="VolumeDeviceValues" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType" maxOccurs="3"/>
             *         </choice>
             *         <element name="ReplacingMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
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
                "verificationDate",
                "plannedVerification",
                "reasonVerification",
                "deviceValueMunicipalResourceNotElectric",
                "deviceValueMunicipalResourceElectric",
                "volumeDeviceValues",
                "replacingMeteringDeviceVersionGUID"
            })
            public static class ReplaceDevice {

                /**
                 * Дата поверки
                 * 
                 */
                @XmlElement(name = "VerificationDate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar verificationDate;
                /**
                 * Замена в рамках плановой поверки
                 * 
                 */
                @XmlElement(name = "PlannedVerification")
                protected Boolean plannedVerification;
                /**
                 * Замена в рамках неплановой поверки - указывается Причина выхода ПУ из строя (НСИ 224).
                 * 
                 */
                @XmlElement(name = "ReasonVerification")
                protected NsiRef reasonVerification;
                /**
                 * Показания по ПУ  (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих показания
                 * 
                 */
                @XmlElement(name = "DeviceValueMunicipalResourceNotElectric")
                protected List<OneRateMeteringValueBaseType> deviceValueMunicipalResourceNotElectric;
                /**
                 * Показания по ПУ (электрическая энергия). Указывается только для ПУ, предоставляющих показания
                 * 
                 */
                @XmlElement(name = "DeviceValueMunicipalResourceElectric")
                protected ElectricMeteringValueBaseType deviceValueMunicipalResourceElectric;
                /**
                 * Объемы по ПУ. Указывается только для ПУ, предоставляющих объемы потребления КР
                 * 
                 */
                @XmlElement(name = "VolumeDeviceValues")
                protected List<VolumeMeteringValueBaseType> volumeDeviceValues;
                /**
                 * Заменить на существующий (идентификатор версии ПУ в ГИС ЖКХ)
                 * 
                 */
                @XmlElement(name = "ReplacingMeteringDeviceVersionGUID", required = true)
                protected String replacingMeteringDeviceVersionGUID;

                /**
                 * Дата поверки
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getVerificationDate() {
                    return verificationDate;
                }

                /**
                 * Sets the value of the verificationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getVerificationDate()
                 */
                public void setVerificationDate(XMLGregorianCalendar value) {
                    this.verificationDate = value;
                }

                /**
                 * Замена в рамках плановой поверки
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
                 * Замена в рамках неплановой поверки - указывается Причина выхода ПУ из строя (НСИ 224).
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getReasonVerification() {
                    return reasonVerification;
                }

                /**
                 * Sets the value of the reasonVerification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getReasonVerification()
                 */
                public void setReasonVerification(NsiRef value) {
                    this.reasonVerification = value;
                }

                /**
                 * Показания по ПУ  (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих показания
                 * 
                 * Gets the value of the deviceValueMunicipalResourceNotElectric property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the deviceValueMunicipalResourceNotElectric property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getDeviceValueMunicipalResourceNotElectric().add(newItem);
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
                 *     The value of the deviceValueMunicipalResourceNotElectric property.
                 */
                public List<OneRateMeteringValueBaseType> getDeviceValueMunicipalResourceNotElectric() {
                    if (deviceValueMunicipalResourceNotElectric == null) {
                        deviceValueMunicipalResourceNotElectric = new ArrayList<>();
                    }
                    return this.deviceValueMunicipalResourceNotElectric;
                }

                /**
                 * Показания по ПУ (электрическая энергия). Указывается только для ПУ, предоставляющих показания
                 * 
                 * @return
                 *     possible object is
                 *     {@link ElectricMeteringValueBaseType }
                 *     
                 */
                public ElectricMeteringValueBaseType getDeviceValueMunicipalResourceElectric() {
                    return deviceValueMunicipalResourceElectric;
                }

                /**
                 * Sets the value of the deviceValueMunicipalResourceElectric property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElectricMeteringValueBaseType }
                 *     
                 * @see #getDeviceValueMunicipalResourceElectric()
                 */
                public void setDeviceValueMunicipalResourceElectric(ElectricMeteringValueBaseType value) {
                    this.deviceValueMunicipalResourceElectric = value;
                }

                /**
                 * Объемы по ПУ. Указывается только для ПУ, предоставляющих объемы потребления КР
                 * 
                 * Gets the value of the volumeDeviceValues property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the volumeDeviceValues property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getVolumeDeviceValues().add(newItem);
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
                 *     The value of the volumeDeviceValues property.
                 */
                public List<VolumeMeteringValueBaseType> getVolumeDeviceValues() {
                    if (volumeDeviceValues == null) {
                        volumeDeviceValues = new ArrayList<>();
                    }
                    return this.volumeDeviceValues;
                }

                /**
                 * Заменить на существующий (идентификатор версии ПУ в ГИС ЖКХ)
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReplacingMeteringDeviceVersionGUID() {
                    return replacingMeteringDeviceVersionGUID;
                }

                /**
                 * Sets the value of the replacingMeteringDeviceVersionGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getReplacingMeteringDeviceVersionGUID()
                 */
                public void setReplacingMeteringDeviceVersionGUID(String value) {
                    this.replacingMeteringDeviceVersionGUID = value;
                }

            }

        }

    }

}
