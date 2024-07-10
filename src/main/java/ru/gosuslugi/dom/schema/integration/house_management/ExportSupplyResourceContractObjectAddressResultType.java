
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Экспорт объектов жилищного фонда из договора ресурсоснабжения
 * 
 * <p>Java class for exportSupplyResourceContractObjectAddressResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportSupplyResourceContractObjectAddressResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ObjectAddressType">
 *       <sequence>
 *         <element name="Pair" maxOccurs="100" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
 *                 <sequence>
 *                   <element name="HeatingSystemType" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="OpenOrNot">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="Opened"/>
 *                                   <enumeration value="Closed"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="CentralizedOrNot">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="Centralized"/>
 *                                   <enumeration value="Decentralized"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NoConnectionToWaterSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Quality" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="QualityIndicator" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="IndicatorValue" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OtherQualityIndicator" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
 *                   <element name="IndicatorValue">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PlannedVolume" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType" minOccurs="0"/>
 *                   <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType" minOccurs="0"/>
 *                   <element name="FeedingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="VersionNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="VersionStatus">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Posted"/>
 *               <enumeration value="Terminated"/>
 *               <enumeration value="Draft"/>
 *               <enumeration value="Annul"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CountingResource" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="R"/>
 *               <enumeration value="P"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MeteringDeviceInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportSupplyResourceContractObjectAddressResultType", propOrder = {
    "pair",
    "noConnectionToWaterSupply",
    "quality",
    "otherQualityIndicator",
    "plannedVolume",
    "objectGUID",
    "contractRootGUID",
    "contractGUID",
    "versionNumber",
    "versionStatus",
    "countingResource",
    "meteringDeviceInformation"
})
public class ExportSupplyResourceContractObjectAddressResultType
    extends ObjectAddressType
{

    /**
     * Информация о КУ и КР по ОЖФ
     * 
     */
    @XmlElement(name = "Pair")
    protected List<ExportSupplyResourceContractObjectAddressResultType.Pair> pair;
    /**
     * Признак "Отсутствие присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения"
     * 
     */
    @XmlElement(name = "NoConnectionToWaterSupply")
    protected Boolean noConnectionToWaterSupply;
    /**
     * Показатель качества (содержащийся в справочнике показателей качества).
     * 
     */
    @XmlElement(name = "Quality")
    protected List<ExportSupplyResourceContractObjectAddressResultType.Quality> quality;
    /**
     * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества).
     * 
     */
    @XmlElement(name = "OtherQualityIndicator")
    protected List<ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator> otherQualityIndicator;
    /**
     * Плановый объем и режим подачи за год.
     * 
     */
    @XmlElement(name = "PlannedVolume")
    protected List<ExportSupplyResourceContractObjectAddressResultType.PlannedVolume> plannedVolume;
    /**
     * Идентификатор объекта жилищного фонда в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ObjectGUID", required = true)
    protected String objectGUID;
    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID", required = true)
    protected String contractRootGUID;
    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID", required = true)
    protected String contractGUID;
    /**
     * Номер версии договора
     * 
     */
    @XmlElement(name = "VersionNumber", required = true)
    protected BigInteger versionNumber;
    /**
     * Статус версии договора
     * 
     */
    @XmlElement(name = "VersionStatus", required = true)
    protected String versionStatus;
    /**
     * Размещение информации о начислениях за коммунальные услуги осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг. Заполняется, если порядок размещения информации о начислениях за коммунальные услуги ведется в разрезе ОЖФ
     * 
     */
    @XmlElement(name = "CountingResource")
    protected String countingResource;
    /**
     * Размещение информации об индивидуальных приборах учета и их показаниях осуществляет ресурсоснабжающая организация. Обязательно для заполнения, если в tns:CountingResource указано"РСО" . В остальных случаях не заполняется.
     * 
     */
    @XmlElement(name = "MeteringDeviceInformation")
    protected Boolean meteringDeviceInformation;

    /**
     * Информация о КУ и КР по ОЖФ
     * 
     * Gets the value of the pair property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pair property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractObjectAddressResultType.Pair }
     * </p>
     * 
     * 
     * @return
     *     The value of the pair property.
     */
    public List<ExportSupplyResourceContractObjectAddressResultType.Pair> getPair() {
        if (pair == null) {
            pair = new ArrayList<>();
        }
        return this.pair;
    }

    /**
     * Признак "Отсутствие присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoConnectionToWaterSupply() {
        return noConnectionToWaterSupply;
    }

    /**
     * Sets the value of the noConnectionToWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoConnectionToWaterSupply()
     */
    public void setNoConnectionToWaterSupply(Boolean value) {
        this.noConnectionToWaterSupply = value;
    }

    /**
     * Показатель качества (содержащийся в справочнике показателей качества).
     * 
     * Gets the value of the quality property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quality property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getQuality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractObjectAddressResultType.Quality }
     * </p>
     * 
     * 
     * @return
     *     The value of the quality property.
     */
    public List<ExportSupplyResourceContractObjectAddressResultType.Quality> getQuality() {
        if (quality == null) {
            quality = new ArrayList<>();
        }
        return this.quality;
    }

    /**
     * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества).
     * 
     * Gets the value of the otherQualityIndicator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherQualityIndicator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherQualityIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherQualityIndicator property.
     */
    public List<ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator> getOtherQualityIndicator() {
        if (otherQualityIndicator == null) {
            otherQualityIndicator = new ArrayList<>();
        }
        return this.otherQualityIndicator;
    }

    /**
     * Плановый объем и режим подачи за год.
     * 
     * Gets the value of the plannedVolume property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedVolume property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlannedVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSupplyResourceContractObjectAddressResultType.PlannedVolume }
     * </p>
     * 
     * 
     * @return
     *     The value of the plannedVolume property.
     */
    public List<ExportSupplyResourceContractObjectAddressResultType.PlannedVolume> getPlannedVolume() {
        if (plannedVolume == null) {
            plannedVolume = new ArrayList<>();
        }
        return this.plannedVolume;
    }

    /**
     * Идентификатор объекта жилищного фонда в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getObjectGUID()
     */
    public void setObjectGUID(String value) {
        this.objectGUID = value;
    }

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRootGUID() {
        return contractRootGUID;
    }

    /**
     * Sets the value of the contractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractRootGUID()
     */
    public void setContractRootGUID(String value) {
        this.contractRootGUID = value;
    }

    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGUID() {
        return contractGUID;
    }

    /**
     * Sets the value of the contractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGUID()
     */
    public void setContractGUID(String value) {
        this.contractGUID = value;
    }

    /**
     * Номер версии договора
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getVersionNumber()
     */
    public void setVersionNumber(BigInteger value) {
        this.versionNumber = value;
    }

    /**
     * Статус версии договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionStatus() {
        return versionStatus;
    }

    /**
     * Sets the value of the versionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersionStatus()
     */
    public void setVersionStatus(String value) {
        this.versionStatus = value;
    }

    /**
     * Размещение информации о начислениях за коммунальные услуги осуществляет:
     * R(SO)- РСО.
     * P(roprietor)-Исполнитель коммунальных услуг. Заполняется, если порядок размещения информации о начислениях за коммунальные услуги ведется в разрезе ОЖФ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountingResource() {
        return countingResource;
    }

    /**
     * Sets the value of the countingResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCountingResource()
     */
    public void setCountingResource(String value) {
        this.countingResource = value;
    }

    /**
     * Размещение информации об индивидуальных приборах учета и их показаниях осуществляет ресурсоснабжающая организация. Обязательно для заполнения, если в tns:CountingResource указано"РСО" . В остальных случаях не заполняется.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeteringDeviceInformation() {
        return meteringDeviceInformation;
    }

    /**
     * Sets the value of the meteringDeviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMeteringDeviceInformation()
     */
    public void setMeteringDeviceInformation(Boolean value) {
        this.meteringDeviceInformation = value;
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
     *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
     *         <element name="IndicatorValue">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
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
        "pairKey",
        "indicatorName",
        "indicatorValue",
        "additionalInformation"
    })
    public static class OtherQualityIndicator {

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из Информации о КУ и КР по ОЖФ
         * 
         */
        @XmlElement(name = "PairKey", required = true)
        protected String pairKey;
        /**
         * Наименование показателя
         * 
         */
        @XmlElement(name = "IndicatorName", required = true)
        protected String indicatorName;
        /**
         * Значение показателя качества
         * 
         */
        @XmlElement(name = "IndicatorValue", required = true)
        protected ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue indicatorValue;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInformation")
        protected String additionalInformation;

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из Информации о КУ и КР по ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairKey() {
            return pairKey;
        }

        /**
         * Sets the value of the pairKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPairKey()
         */
        public void setPairKey(String value) {
            this.pairKey = value;
        }

        /**
         * Наименование показателя
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicatorName() {
            return indicatorName;
        }

        /**
         * Sets the value of the indicatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getIndicatorName()
         */
        public void setIndicatorName(String value) {
            this.indicatorName = value;
        }

        /**
         * Значение показателя качества
         * 
         * @return
         *     possible object is
         *     {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue }
         *     
         */
        public ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue getIndicatorValue() {
            return indicatorValue;
        }

        /**
         * Sets the value of the indicatorValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue }
         *     
         * @see #getIndicatorValue()
         */
        public void setIndicatorValue(ExportSupplyResourceContractObjectAddressResultType.OtherQualityIndicator.IndicatorValue value) {
            this.indicatorValue = value;
        }

        /**
         * Дополнительная информация
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInformation() {
            return additionalInformation;
        }

        /**
         * Sets the value of the additionalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInformation()
         */
        public void setAdditionalInformation(String value) {
            this.additionalInformation = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IndicatorValue
            extends IndicatorValueType
        {


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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
     *       <sequence>
     *         <element name="HeatingSystemType" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="OpenOrNot">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="Opened"/>
     *                         <enumeration value="Closed"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="CentralizedOrNot">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="Centralized"/>
     *                         <enumeration value="Decentralized"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "heatingSystemType",
        "transportGUID"
    })
    public static class Pair
        extends ContractSubjectObjectAdressType
    {

        /**
         * Тип системы теплоснабжения (заполняется для коммунальных ресурсов "Тепловая энергия" и "Горячая вода")
         * 
         */
        @XmlElement(name = "HeatingSystemType")
        protected List<ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType> heatingSystemType;
        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

        /**
         * Тип системы теплоснабжения (заполняется для коммунальных ресурсов "Тепловая энергия" и "Горячая вода")
         * 
         * Gets the value of the heatingSystemType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the heatingSystemType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHeatingSystemType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType }
         * </p>
         * 
         * 
         * @return
         *     The value of the heatingSystemType property.
         */
        public List<ExportSupplyResourceContractObjectAddressResultType.Pair.HeatingSystemType> getHeatingSystemType() {
            if (heatingSystemType == null) {
                heatingSystemType = new ArrayList<>();
            }
            return this.heatingSystemType;
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
         *         <element name="OpenOrNot">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <enumeration value="Opened"/>
         *               <enumeration value="Closed"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="CentralizedOrNot">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <enumeration value="Centralized"/>
         *               <enumeration value="Decentralized"/>
         *             </restriction>
         *           </simpleType>
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
            "openOrNot",
            "centralizedOrNot"
        })
        public static class HeatingSystemType {

            /**
             * Открытая/Закрытая
             * 
             */
            @XmlElement(name = "OpenOrNot", required = true)
            protected String openOrNot;
            /**
             * Централизованная/нецентрализованная
             * 
             */
            @XmlElement(name = "CentralizedOrNot", required = true)
            protected String centralizedOrNot;

            /**
             * Открытая/Закрытая
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpenOrNot() {
                return openOrNot;
            }

            /**
             * Sets the value of the openOrNot property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOpenOrNot()
             */
            public void setOpenOrNot(String value) {
                this.openOrNot = value;
            }

            /**
             * Централизованная/нецентрализованная
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCentralizedOrNot() {
                return centralizedOrNot;
            }

            /**
             * Sets the value of the centralizedOrNot property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCentralizedOrNot()
             */
            public void setCentralizedOrNot(String value) {
                this.centralizedOrNot = value;
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
     *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType" minOccurs="0"/>
     *         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType" minOccurs="0"/>
     *         <element name="FeedingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "pairKey",
        "volume",
        "unit",
        "feedingMode"
    })
    public static class PlannedVolume {

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из Информации о КУ и КР по ОЖФ
         * 
         */
        @XmlElement(name = "PairKey", required = true)
        protected String pairKey;
        /**
         * Плановый объем
         * 
         */
        @XmlElement(name = "Volume")
        protected BigDecimal volume;
        /**
         * Единица измерения.
         * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
         * 
         */
        @XmlElement(name = "Unit")
        protected String unit;
        /**
         * Режим подачи
         * 
         */
        @XmlElement(name = "FeedingMode")
        protected String feedingMode;

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из Информации о КУ и КР по ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairKey() {
            return pairKey;
        }

        /**
         * Sets the value of the pairKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPairKey()
         */
        public void setPairKey(String value) {
            this.pairKey = value;
        }

        /**
         * Плановый объем
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getVolume()
         */
        public void setVolume(BigDecimal value) {
            this.volume = value;
        }

        /**
         * Единица измерения.
         * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getUnit()
         */
        public void setUnit(String value) {
            this.unit = value;
        }

        /**
         * Режим подачи
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFeedingMode() {
            return feedingMode;
        }

        /**
         * Sets the value of the feedingMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFeedingMode()
         */
        public void setFeedingMode(String value) {
            this.feedingMode = value;
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
     *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="QualityIndicator" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="IndicatorValue" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
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
        "pairKey",
        "qualityIndicator",
        "indicatorValue",
        "additionalInformation"
    })
    public static class Quality {

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из Информации о КУ и КР по ОЖФ
         * 
         */
        @XmlElement(name = "PairKey", required = true)
        protected String pairKey;
        /**
         * Показатель качества. Ссылка на НСИ "Показатели качества коммунальных ресурсов" (реестровый номер 276)
         * 
         */
        @XmlElement(name = "QualityIndicator", required = true)
        protected NsiRef qualityIndicator;
        /**
         * Значение показателя качества
         * 
         */
        @XmlElement(name = "IndicatorValue")
        protected List<ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue> indicatorValue;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInformation")
        protected String additionalInformation;

        /**
         * Ссылка на пару из коммунальной услуги и ресурса из Информации о КУ и КР по ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPairKey() {
            return pairKey;
        }

        /**
         * Sets the value of the pairKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPairKey()
         */
        public void setPairKey(String value) {
            this.pairKey = value;
        }

        /**
         * Показатель качества. Ссылка на НСИ "Показатели качества коммунальных ресурсов" (реестровый номер 276)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getQualityIndicator() {
            return qualityIndicator;
        }

        /**
         * Sets the value of the qualityIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getQualityIndicator()
         */
        public void setQualityIndicator(NsiRef value) {
            this.qualityIndicator = value;
        }

        /**
         * Значение показателя качества
         * 
         * Gets the value of the indicatorValue property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the indicatorValue property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getIndicatorValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue }
         * </p>
         * 
         * 
         * @return
         *     The value of the indicatorValue property.
         */
        public List<ExportSupplyResourceContractObjectAddressResultType.Quality.IndicatorValue> getIndicatorValue() {
            if (indicatorValue == null) {
                indicatorValue = new ArrayList<>();
            }
            return this.indicatorValue;
        }

        /**
         * Дополнительная информация
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInformation() {
            return additionalInformation;
        }

        /**
         * Sets the value of the additionalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInformation()
         */
        public void setAdditionalInformation(String value) {
            this.additionalInformation = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IndicatorValue
            extends IndicatorValueType
        {


        }

    }

}
