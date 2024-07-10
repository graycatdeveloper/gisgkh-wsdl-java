
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *           <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </choice>
 *         <element name="ObjectAddress" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="LoadObject">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ObjectAddressType">
 *                             <sequence>
 *                               <element name="Pair" maxOccurs="100">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
 *                                       <sequence>
 *                                         <element name="HeatingSystemType" minOccurs="0">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="OpenOrNot">
 *                                                     <simpleType>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         <enumeration value="Opened"/>
 *                                                         <enumeration value="Closed"/>
 *                                                       </restriction>
 *                                                     </simpleType>
 *                                                   </element>
 *                                                   <element name="CentralizedOrNot">
 *                                                     <simpleType>
 *                                                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         <enumeration value="Centralized"/>
 *                                                         <enumeration value="Decentralized"/>
 *                                                       </restriction>
 *                                                     </simpleType>
 *                                                   </element>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="NoConnectionToWaterSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               <element name="Quality" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         <element name="QualityIndicator" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                         <element name="IndicatorValue">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
 *                                               </extension>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="OtherQualityIndicator" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
 *                                         <choice>
 *                                           <sequence>
 *                                             <choice>
 *                                               <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
 *                                               <sequence>
 *                                                 <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
 *                                                 <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
 *                                               </sequence>
 *                                             </choice>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
 *                                           </sequence>
 *                                           <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         </choice>
 *                                         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="TemperatureChart" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="OutsideTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         <element name="FlowLineTemperature">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                               <minInclusive value="0"/>
 *                                               <fractionDigits value="1"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="OppositeLineTemperature">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                               <minInclusive value="0"/>
 *                                               <fractionDigits value="1"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="PlannedVolume" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType"/>
 *                                         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
 *                                         <element name="FeedingMode">
 *                                           <simpleType>
 *                                             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type">
 *                                               <maxLength value="250"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="CountingResource" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <enumeration value="R"/>
 *                                     <enumeration value="P"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="MeteringDeviceInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               <element name="Tariff" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Norm" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="DeleteObject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.7.0.3""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contractGUID",
    "contractRootGUID",
    "objectAddress"
})
@XmlRootElement(name = "importSupplyResourceContractObjectAddressRequest")
public class ImportSupplyResourceContractObjectAddressRequest
    extends BaseType
{

    /**
     * Необходимо указать идентификатор последней версии договора
     * 
     */
    @XmlElement(name = "ContractGUID")
    protected String contractGUID;
    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID")
    protected String contractRootGUID;
    @XmlElement(name = "ObjectAddress", required = true)
    protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress> objectAddress;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Необходимо указать идентификатор последней версии договора
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
     * Gets the value of the objectAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getObjectAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the objectAddress property.
     */
    public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress> getObjectAddress() {
        if (objectAddress == null) {
            objectAddress = new ArrayList<>();
        }
        return this.objectAddress;
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
            return "11.7.0.3";
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="ObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <choice>
     *           <element name="LoadObject">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ObjectAddressType">
     *                   <sequence>
     *                     <element name="Pair" maxOccurs="100">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
     *                             <sequence>
     *                               <element name="HeatingSystemType" minOccurs="0">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       <sequence>
     *                                         <element name="OpenOrNot">
     *                                           <simpleType>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               <enumeration value="Opened"/>
     *                                               <enumeration value="Closed"/>
     *                                             </restriction>
     *                                           </simpleType>
     *                                         </element>
     *                                         <element name="CentralizedOrNot">
     *                                           <simpleType>
     *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               <enumeration value="Centralized"/>
     *                                               <enumeration value="Decentralized"/>
     *                                             </restriction>
     *                                           </simpleType>
     *                                         </element>
     *                                       </sequence>
     *                                     </restriction>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="NoConnectionToWaterSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     <element name="Quality" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="QualityIndicator" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                               <element name="IndicatorValue">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueType">
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="OtherQualityIndicator" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
     *                               <choice>
     *                                 <sequence>
     *                                   <choice>
     *                                     <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
     *                                     <sequence>
     *                                       <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
     *                                       <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
     *                                     </sequence>
     *                                   </choice>
     *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
     *                                 </sequence>
     *                                 <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               </choice>
     *                               <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="TemperatureChart" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="OutsideTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                               <element name="FlowLineTemperature">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                     <minInclusive value="0"/>
     *                                     <fractionDigits value="1"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="OppositeLineTemperature">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                     <minInclusive value="0"/>
     *                                     <fractionDigits value="1"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="PlannedVolume" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType"/>
     *                               <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
     *                               <element name="FeedingMode">
     *                                 <simpleType>
     *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type">
     *                                     <maxLength value="250"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="CountingResource" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <enumeration value="R"/>
     *                           <enumeration value="P"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="MeteringDeviceInformation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     <element name="Tariff" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Norm" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="DeleteObject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "objectGUID",
        "loadObject",
        "deleteObject"
    })
    public static class ObjectAddress {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор объекта жилищного фонда в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ObjectGUID")
        protected String objectGUID;
        /**
         * Добавление/изменение информации об ОЖФ
         * 
         */
        @XmlElement(name = "LoadObject")
        protected ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject loadObject;
        /**
         * Удаление ОЖФ из договора ресурсоснабжения
         * 
         */
        @XmlElement(name = "DeleteObject")
        protected Boolean deleteObject;

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
         * Добавление/изменение информации об ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject }
         *     
         */
        public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject getLoadObject() {
            return loadObject;
        }

        /**
         * Sets the value of the loadObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject }
         *     
         * @see #getLoadObject()
         */
        public void setLoadObject(ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject value) {
            this.loadObject = value;
        }

        /**
         * Удаление ОЖФ из договора ресурсоснабжения
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeleteObject() {
            return deleteObject;
        }

        /**
         * Sets the value of the deleteObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeleteObject()
         */
        public void setDeleteObject(Boolean value) {
            this.deleteObject = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ObjectAddressType">
         *       <sequence>
         *         <element name="Pair" maxOccurs="100">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
         *                 <sequence>
         *                   <element name="HeatingSystemType" minOccurs="0">
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
         *         <element name="OtherQualityIndicator" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
         *                   <choice>
         *                     <sequence>
         *                       <choice>
         *                         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
         *                         <sequence>
         *                           <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
         *                           <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
         *                         </sequence>
         *                       </choice>
         *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
         *                     </sequence>
         *                     <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   </choice>
         *                   <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="TemperatureChart" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="OutsideTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   <element name="FlowLineTemperature">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <minInclusive value="0"/>
         *                         <fractionDigits value="1"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="OppositeLineTemperature">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <minInclusive value="0"/>
         *                         <fractionDigits value="1"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
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
         *                   <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType"/>
         *                   <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
         *                   <element name="FeedingMode">
         *                     <simpleType>
         *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type">
         *                         <maxLength value="250"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
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
         *         <element name="Tariff" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Norm" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "pair",
            "noConnectionToWaterSupply",
            "quality",
            "otherQualityIndicator",
            "temperatureChart",
            "plannedVolume",
            "countingResource",
            "meteringDeviceInformation",
            "tariff",
            "norm"
        })
        public static class LoadObject
            extends ObjectAddressType
        {

            /**
             * Коммунальная услуга и коммунальный ресурс, поставляемые в объект жилищного фонда
             * 
             */
            @XmlElement(name = "Pair", required = true)
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair> pair;
            /**
             * Признак "Отсутствие присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения". Может быть указан, только если показатели качества коммунальных ресурсов ведутся в разрезе объектов жилищного фонда и в число поставляемых в объект жилищного фонда коммунальных услуг входит "Холодное водоснабжение" и/или "Горячее водоснабжение"
             * 
             */
            @XmlElement(name = "NoConnectionToWaterSupply")
            protected Boolean noConnectionToWaterSupply;
            /**
             * Показатель качества (содержащийся в справочнике показателей качества). Обязательно для заполнения, если показатели качества ведутся в разрезе ОЖФ                                           Для пары КУ и КР "Горячее водоснабжение" и "Питьевая вода" указываются актуальные показатели, определенные для КР "Горячая вода" в справочнике показателей качества коммунальных ресурсов                                                                      Для пары КУ и КР "Горячее водоснабжение" и "Тепловая энергия" информация о показателях качества не заполняется только в том случае, если для договора (если показатели ведутся в разрезе договора) или ОЖФ в договоре (если показатели ведутся в разрезе ОЖФ) также указана пара КУ и КР "Горячее водоснабжение" и "Питьевая вода"
             * 
             */
            @XmlElement(name = "Quality")
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality> quality;
            /**
             * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества). Могут быть указаны только, если показатели качества ведутся в разрезе ОЖФ
             * 
             */
            @XmlElement(name = "OtherQualityIndicator")
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator> otherQualityIndicator;
            /**
             * Информация о температурном графике. Доступно для заполнения, если  в рамках ОЖФ хотя бы раз встречается ресурс "Тепловая энергия".
             * 
             */
            @XmlElement(name = "TemperatureChart")
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart> temperatureChart;
            /**
             * Плановый объем и режим подачи за год. Может быть заполнено только если плановый объем и режим подачи ведется в разрезе ОЖФ
             * 
             */
            @XmlElement(name = "PlannedVolume")
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume> plannedVolume;
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
             * Информация о применяемом тарифе
             * 
             */
            @XmlElement(name = "Tariff")
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff> tariff;
            /**
             * Информация о нормативе потребления коммунальной услуги
             * 
             */
            @XmlElement(name = "Norm")
            protected List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm> norm;

            /**
             * Коммунальная услуга и коммунальный ресурс, поставляемые в объект жилищного фонда
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
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair }
             * </p>
             * 
             * 
             * @return
             *     The value of the pair property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair> getPair() {
                if (pair == null) {
                    pair = new ArrayList<>();
                }
                return this.pair;
            }

            /**
             * Признак "Отсутствие присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения". Может быть указан, только если показатели качества коммунальных ресурсов ведутся в разрезе объектов жилищного фонда и в число поставляемых в объект жилищного фонда коммунальных услуг входит "Холодное водоснабжение" и/или "Горячее водоснабжение"
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
             * Показатель качества (содержащийся в справочнике показателей качества). Обязательно для заполнения, если показатели качества ведутся в разрезе ОЖФ                                           Для пары КУ и КР "Горячее водоснабжение" и "Питьевая вода" указываются актуальные показатели, определенные для КР "Горячая вода" в справочнике показателей качества коммунальных ресурсов                                                                      Для пары КУ и КР "Горячее водоснабжение" и "Тепловая энергия" информация о показателях качества не заполняется только в том случае, если для договора (если показатели ведутся в разрезе договора) или ОЖФ в договоре (если показатели ведутся в разрезе ОЖФ) также указана пара КУ и КР "Горячее водоснабжение" и "Питьевая вода"
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
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality }
             * </p>
             * 
             * 
             * @return
             *     The value of the quality property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality> getQuality() {
                if (quality == null) {
                    quality = new ArrayList<>();
                }
                return this.quality;
            }

            /**
             * Иной показатель качества коммунального ресурса (не содержащийся в справочнике показателей качества). Могут быть указаны только, если показатели качества ведутся в разрезе ОЖФ
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
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator }
             * </p>
             * 
             * 
             * @return
             *     The value of the otherQualityIndicator property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.OtherQualityIndicator> getOtherQualityIndicator() {
                if (otherQualityIndicator == null) {
                    otherQualityIndicator = new ArrayList<>();
                }
                return this.otherQualityIndicator;
            }

            /**
             * Информация о температурном графике. Доступно для заполнения, если  в рамках ОЖФ хотя бы раз встречается ресурс "Тепловая энергия".
             * 
             * Gets the value of the temperatureChart property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the temperatureChart property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getTemperatureChart().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart }
             * </p>
             * 
             * 
             * @return
             *     The value of the temperatureChart property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.TemperatureChart> getTemperatureChart() {
                if (temperatureChart == null) {
                    temperatureChart = new ArrayList<>();
                }
                return this.temperatureChart;
            }

            /**
             * Плановый объем и режим подачи за год. Может быть заполнено только если плановый объем и режим подачи ведется в разрезе ОЖФ
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
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume }
             * </p>
             * 
             * 
             * @return
             *     The value of the plannedVolume property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.PlannedVolume> getPlannedVolume() {
                if (plannedVolume == null) {
                    plannedVolume = new ArrayList<>();
                }
                return this.plannedVolume;
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
             * Информация о применяемом тарифе
             * 
             * Gets the value of the tariff property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tariff property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getTariff().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff }
             * </p>
             * 
             * 
             * @return
             *     The value of the tariff property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Tariff> getTariff() {
                if (tariff == null) {
                    tariff = new ArrayList<>();
                }
                return this.tariff;
            }

            /**
             * Информация о нормативе потребления коммунальной услуги
             * 
             * Gets the value of the norm property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the norm property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getNorm().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm }
             * </p>
             * 
             * 
             * @return
             *     The value of the norm property.
             */
            public List<ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Norm> getNorm() {
                if (norm == null) {
                    norm = new ArrayList<>();
                }
                return this.norm;
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
             *         <element name="NormGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "normGUID"
            })
            public static class Norm {

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
                 * 
                 */
                @XmlElement(name = "PairKey", required = true)
                protected String pairKey;
                /**
                 * Идентификатор норматива потребления коммунальной услуги
                 * 
                 */
                @XmlElement(name = "NormGUID", required = true)
                protected String normGUID;

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                 * Идентификатор норматива потребления коммунальной услуги
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNormGUID() {
                    return normGUID;
                }

                /**
                 * Sets the value of the normGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNormGUID()
                 */
                public void setNormGUID(String value) {
                    this.normGUID = value;
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
             *         <element name="IndicatorName" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OtherQualityIndicatorNameType"/>
             *         <choice>
             *           <sequence>
             *             <choice>
             *               <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
             *               <sequence>
             *                 <element name="StartRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
             *                 <element name="EndRange" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}IndicatorValueNumberType"/>
             *               </sequence>
             *             </choice>
             *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
             *           </sequence>
             *           <element name="Correspond" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         </choice>
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
                "number",
                "startRange",
                "endRange",
                "okei",
                "correspond",
                "additionalInformation"
            })
            public static class OtherQualityIndicator {

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                 * Число
                 * 
                 */
                @XmlElement(name = "Number")
                protected BigDecimal number;
                /**
                 * Начало диапазона
                 * 
                 */
                @XmlElement(name = "StartRange")
                protected BigDecimal startRange;
                /**
                 * Конец диапазона
                 * 
                 */
                @XmlElement(name = "EndRange")
                protected BigDecimal endRange;
                /**
                 * Код ОКЕИ
                 * 
                 */
                @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
                protected String okei;
                /**
                 * Значение соответствует
                 * 
                 */
                @XmlElement(name = "Correspond")
                protected Boolean correspond;
                /**
                 * Дополнительная информация
                 * 
                 */
                @XmlElement(name = "AdditionalInformation")
                protected String additionalInformation;

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                 * Число
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getNumber()
                 */
                public void setNumber(BigDecimal value) {
                    this.number = value;
                }

                /**
                 * Начало диапазона
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getStartRange() {
                    return startRange;
                }

                /**
                 * Sets the value of the startRange property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getStartRange()
                 */
                public void setStartRange(BigDecimal value) {
                    this.startRange = value;
                }

                /**
                 * Конец диапазона
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getEndRange() {
                    return endRange;
                }

                /**
                 * Sets the value of the endRange property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getEndRange()
                 */
                public void setEndRange(BigDecimal value) {
                    this.endRange = value;
                }

                /**
                 * Код ОКЕИ
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
                 * Значение соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isCorrespond() {
                    return correspond;
                }

                /**
                 * Sets the value of the correspond property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isCorrespond()
                 */
                public void setCorrespond(Boolean value) {
                    this.correspond = value;
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
             *         <element name="HeatingSystemType" minOccurs="0">
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
                protected ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType heatingSystemType;
                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

                /**
                 * Тип системы теплоснабжения (заполняется для коммунальных ресурсов "Тепловая энергия" и "Горячая вода")
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType }
                 *     
                 */
                public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType getHeatingSystemType() {
                    return heatingSystemType;
                }

                /**
                 * Sets the value of the heatingSystemType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType }
                 *     
                 * @see #getHeatingSystemType()
                 */
                public void setHeatingSystemType(ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Pair.HeatingSystemType value) {
                    this.heatingSystemType = value;
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
             *         <element name="Volume" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DRSOVolumeType"/>
             *         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
             *         <element name="FeedingMode">
             *           <simpleType>
             *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String250Type">
             *               <maxLength value="250"/>
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
                "pairKey",
                "volume",
                "unit",
                "feedingMode"
            })
            public static class PlannedVolume {

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
                 * 
                 */
                @XmlElement(name = "PairKey", required = true)
                protected String pairKey;
                /**
                 * Плановый объем
                 * 
                 */
                @XmlElement(name = "Volume", required = true)
                protected BigDecimal volume;
                /**
                 * Единица измерения.
                 * справочника НСИ №236 "Связь вида коммунальной услуги, тарифицируемого ресурса и единиц измерения ставки тарифа"
                 * 
                 */
                @XmlElement(name = "Unit", required = true)
                protected String unit;
                /**
                 * Режим подачи
                 * 
                 */
                @XmlElement(name = "FeedingMode", required = true)
                protected String feedingMode;

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                "qualityIndicator",
                "indicatorValue",
                "additionalInformation"
            })
            public static class Quality {

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                @XmlElement(name = "IndicatorValue", required = true)
                protected ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue indicatorValue;
                /**
                 * Дополнительная информация
                 * 
                 */
                @XmlElement(name = "AdditionalInformation")
                protected String additionalInformation;

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                 * @return
                 *     possible object is
                 *     {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue }
                 *     
                 */
                public ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue getIndicatorValue() {
                    return indicatorValue;
                }

                /**
                 * Sets the value of the indicatorValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue }
                 *     
                 * @see #getIndicatorValue()
                 */
                public void setIndicatorValue(ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.Quality.IndicatorValue value) {
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
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="PairKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
             *         <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "priceGUID"
            })
            public static class Tariff {

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
                 * 
                 */
                @XmlElement(name = "PairKey", required = true)
                protected String pairKey;
                /**
                 * Идентификатор дифференцированной цены тарифа
                 * 
                 */
                @XmlElement(name = "PriceGUID", required = true)
                protected String priceGUID;

                /**
                 * Ссылка на пару из коммунальной услуги и ресурса из предмета договора
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
                 * Идентификатор дифференцированной цены тарифа
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPriceGUID() {
                    return priceGUID;
                }

                /**
                 * Sets the value of the priceGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getPriceGUID()
                 */
                public void setPriceGUID(String value) {
                    this.priceGUID = value;
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
             *         <element name="OutsideTemperature" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         <element name="FlowLineTemperature">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <minInclusive value="0"/>
             *               <fractionDigits value="1"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="OppositeLineTemperature">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <minInclusive value="0"/>
             *               <fractionDigits value="1"/>
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
                "outsideTemperature",
                "flowLineTemperature",
                "oppositeLineTemperature"
            })
            public static class TemperatureChart {

                /**
                 * Температура наружного воздуха
                 * 
                 */
                @XmlElement(name = "OutsideTemperature")
                protected int outsideTemperature;
                /**
                 * Температура теплоносителя в подающем трубопроводе
                 * 
                 */
                @XmlElement(name = "FlowLineTemperature", required = true)
                protected BigDecimal flowLineTemperature;
                /**
                 * Температура теплоносителя в обратном трубопроводе
                 * 
                 */
                @XmlElement(name = "OppositeLineTemperature", required = true)
                protected BigDecimal oppositeLineTemperature;

                /**
                 * Температура наружного воздуха
                 * 
                 */
                public int getOutsideTemperature() {
                    return outsideTemperature;
                }

                /**
                 * Sets the value of the outsideTemperature property.
                 * 
                 */
                public void setOutsideTemperature(int value) {
                    this.outsideTemperature = value;
                }

                /**
                 * Температура теплоносителя в подающем трубопроводе
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getFlowLineTemperature() {
                    return flowLineTemperature;
                }

                /**
                 * Sets the value of the flowLineTemperature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getFlowLineTemperature()
                 */
                public void setFlowLineTemperature(BigDecimal value) {
                    this.flowLineTemperature = value;
                }

                /**
                 * Температура теплоносителя в обратном трубопроводе
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getOppositeLineTemperature() {
                    return oppositeLineTemperature;
                }

                /**
                 * Sets the value of the oppositeLineTemperature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getOppositeLineTemperature()
                 */
                public void setOppositeLineTemperature(BigDecimal value) {
                    this.oppositeLineTemperature = value;
                }

            }

        }

    }

}
