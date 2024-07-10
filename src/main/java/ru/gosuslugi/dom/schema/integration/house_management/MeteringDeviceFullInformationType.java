
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип для создания ПУ, редактирования ПУ до начала внесения показаний, а также для экспорта сведений о ПУ
 * 
 * <p>Java class for MeteringDeviceFullInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeteringDeviceFullInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BasicChatacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceBasicCharacteristicsType"/>
 *         <choice>
 *           <element name="NotLinkedWithMetering" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="LinkedWithMetering">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="InstallationPlace">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="in"/>
 *                           <enumeration value="out"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <choice>
 *           <element name="MunicipalResourceNotEnergy" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MunicipalResourceNotElectricBaseType" maxOccurs="3"/>
 *           <element name="MunicipalResourceEnergy" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MunicipalResourceElectricBaseType"/>
 *           <element name="MunicipalResources" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeviceMunicipalResourceType" maxOccurs="3"/>
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
@XmlType(name = "MeteringDeviceFullInformationType", propOrder = {
    "basicChatacteristicts",
    "notLinkedWithMetering",
    "linkedWithMetering",
    "municipalResourceNotEnergy",
    "municipalResourceEnergy",
    "municipalResources"
})
public class MeteringDeviceFullInformationType {

    /**
     * Основные характеристики
     * 
     */
    @XmlElement(name = "BasicChatacteristicts", required = true)
    protected MeteringDeviceBasicCharacteristicsType basicChatacteristicts;
    /**
     * Объем ресурса(ов) определяется только с помощью текущего ПУ (связей с другими ПУ нет)
     * 
     */
    @XmlElement(name = "NotLinkedWithMetering")
    protected Boolean notLinkedWithMetering;
    /**
     * Объем ресурса(ов) определяется с помощью нескольких приборов учета
     * 
     */
    @XmlElement(name = "LinkedWithMetering")
    protected MeteringDeviceFullInformationType.LinkedWithMetering linkedWithMetering;
    /**
     * Сведения о коммунальном ресурсе и последние полученные показания ПУ  (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих показания
     * 
     */
    @XmlElement(name = "MunicipalResourceNotEnergy")
    protected List<MunicipalResourceNotElectricBaseType> municipalResourceNotEnergy;
    /**
     * Последние полученные показания и коэффициент трансформации для ПУ, измеряющего электроэнергию. Указывается только для ПУ, предоставляющих показания
     * 
     */
    @XmlElement(name = "MunicipalResourceEnergy")
    protected MunicipalResourceElectricBaseType municipalResourceEnergy;
    /**
     * Сведения о коммунальных ресурсах ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих объем потребленного КР
     * 
     */
    @XmlElement(name = "MunicipalResources")
    protected List<DeviceMunicipalResourceType> municipalResources;

    /**
     * Основные характеристики
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceBasicCharacteristicsType }
     *     
     */
    public MeteringDeviceBasicCharacteristicsType getBasicChatacteristicts() {
        return basicChatacteristicts;
    }

    /**
     * Sets the value of the basicChatacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceBasicCharacteristicsType }
     *     
     * @see #getBasicChatacteristicts()
     */
    public void setBasicChatacteristicts(MeteringDeviceBasicCharacteristicsType value) {
        this.basicChatacteristicts = value;
    }

    /**
     * Объем ресурса(ов) определяется только с помощью текущего ПУ (связей с другими ПУ нет)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotLinkedWithMetering() {
        return notLinkedWithMetering;
    }

    /**
     * Sets the value of the notLinkedWithMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNotLinkedWithMetering()
     */
    public void setNotLinkedWithMetering(Boolean value) {
        this.notLinkedWithMetering = value;
    }

    /**
     * Объем ресурса(ов) определяется с помощью нескольких приборов учета
     * 
     * @return
     *     possible object is
     *     {@link MeteringDeviceFullInformationType.LinkedWithMetering }
     *     
     */
    public MeteringDeviceFullInformationType.LinkedWithMetering getLinkedWithMetering() {
        return linkedWithMetering;
    }

    /**
     * Sets the value of the linkedWithMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeteringDeviceFullInformationType.LinkedWithMetering }
     *     
     * @see #getLinkedWithMetering()
     */
    public void setLinkedWithMetering(MeteringDeviceFullInformationType.LinkedWithMetering value) {
        this.linkedWithMetering = value;
    }

    /**
     * Сведения о коммунальном ресурсе и последние полученные показания ПУ  (тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих показания
     * 
     * Gets the value of the municipalResourceNotEnergy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipalResourceNotEnergy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMunicipalResourceNotEnergy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MunicipalResourceNotElectricBaseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the municipalResourceNotEnergy property.
     */
    public List<MunicipalResourceNotElectricBaseType> getMunicipalResourceNotEnergy() {
        if (municipalResourceNotEnergy == null) {
            municipalResourceNotEnergy = new ArrayList<>();
        }
        return this.municipalResourceNotEnergy;
    }

    /**
     * Последние полученные показания и коэффициент трансформации для ПУ, измеряющего электроэнергию. Указывается только для ПУ, предоставляющих показания
     * 
     * @return
     *     possible object is
     *     {@link MunicipalResourceElectricBaseType }
     *     
     */
    public MunicipalResourceElectricBaseType getMunicipalResourceEnergy() {
        return municipalResourceEnergy;
    }

    /**
     * Sets the value of the municipalResourceEnergy property.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipalResourceElectricBaseType }
     *     
     * @see #getMunicipalResourceEnergy()
     */
    public void setMunicipalResourceEnergy(MunicipalResourceElectricBaseType value) {
        this.municipalResourceEnergy = value;
    }

    /**
     * Сведения о коммунальных ресурсах ПУ (электроэнергия, тепловая энергия, газ, горячая вода, холодная вода, сточные бытовые воды). Указывается только для ПУ, предоставляющих объем потребленного КР
     * 
     * Gets the value of the municipalResources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipalResources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMunicipalResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceMunicipalResourceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the municipalResources property.
     */
    public List<DeviceMunicipalResourceType> getMunicipalResources() {
        if (municipalResources == null) {
            municipalResources = new ArrayList<>();
        }
        return this.municipalResources;
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
     *         <element name="InstallationPlace">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="in"/>
     *               <enumeration value="out"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="LinkedMeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType" maxOccurs="10" minOccurs="0"/>
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
        "installationPlace",
        "linkedMeteringDeviceVersionGUID"
    })
    public static class LinkedWithMetering {

        /**
         * Место установки текущего прибора учета. Возможные значения: in - На входе/На подающем трубопроводе, out - На выходе/На обратном трубопроводе. Если прибор учета измеряет электрическую энергию, то ПУ устанавливается на входе/на выходе; если прибор учета измеряет коммунальный ресурс, отличный от электрической энергии, то ПУ устанавливается на подающем трубопроводе / на обратном трубопроводе
         * 
         */
        @XmlElement(name = "InstallationPlace", required = true)
        protected String installationPlace;
        /**
         * Идентификатор версии ПУ, заведенного в ГИС ЖКХ, с которым требуется установить связь текущего ПУ
         * 
         */
        @XmlElement(name = "LinkedMeteringDeviceVersionGUID")
        protected List<String> linkedMeteringDeviceVersionGUID;

        /**
         * Место установки текущего прибора учета. Возможные значения: in - На входе/На подающем трубопроводе, out - На выходе/На обратном трубопроводе. Если прибор учета измеряет электрическую энергию, то ПУ устанавливается на входе/на выходе; если прибор учета измеряет коммунальный ресурс, отличный от электрической энергии, то ПУ устанавливается на подающем трубопроводе / на обратном трубопроводе
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstallationPlace() {
            return installationPlace;
        }

        /**
         * Sets the value of the installationPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInstallationPlace()
         */
        public void setInstallationPlace(String value) {
            this.installationPlace = value;
        }

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

}
