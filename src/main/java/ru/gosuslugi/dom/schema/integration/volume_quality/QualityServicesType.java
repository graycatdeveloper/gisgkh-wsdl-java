
package ru.gosuslugi.dom.schema.integration.volume_quality;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип для информации о показателях качества КУ
 * 
 * <p>Java class for QualityServicesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QualityServicesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ObjectAddress">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
 *                 <sequence>
 *                   <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element name="ColdWater">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="IsSignedAct">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="ColdWaterConformity">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <sequence>
 *                                           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="NotConformityDays">
 *                                             <simpleType>
 *                                               <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType">
 *                                               </restriction>
 *                                             </simpleType>
 *                                           </element>
 *                                         </sequence>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
 *                               <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="HotWater">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="IsSignedAct">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="TemperatureConformity">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <sequence>
 *                                           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="NotConformityTemperature" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}NotConformityTemperatureHotWaterType"/>
 *                                         </sequence>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="DurationDeg40" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
 *                               <element name="VolumeDeg40" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
 *                               <element name="HotWaterConformity">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <sequence>
 *                                           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
 *                                         </sequence>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
 *                               <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Electricity">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="IsSignedAct">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="ElectricityConformity">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <sequence>
 *                                           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
 *                                         </sequence>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Gas">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="IsSignedAct">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="GasConformity">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <sequence>
 *                                           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
 *                                         </sequence>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
 *                               <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Heating">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="IsSignedAct">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="HeatingConformity">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                         <sequence>
 *                                           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                           <element name="NotConformityTemperature">
 *                                             <complexType>
 *                                               <complexContent>
 *                                                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   <sequence>
 *                                                     <element name="TemperatureExcess" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
 *                                                     <element name="TemperatureDecline" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
 *                                                   </sequence>
 *                                                 </restriction>
 *                                               </complexContent>
 *                                             </complexType>
 *                                           </element>
 *                                           <element name="NotConformityHours" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
 *                                         </sequence>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
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
@XmlType(name = "QualityServicesType", propOrder = {
    "objectAddress",
    "coldWater",
    "hotWater",
    "electricity",
    "gas",
    "heating"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityServices.class
})
public class QualityServicesType {

    /**
     * Объект жилищного фонда
     * 
     */
    @XmlElement(name = "ObjectAddress", required = true)
    protected QualityServicesType.ObjectAddress objectAddress;
    /**
     * Показатели качества КУ "Холодное водоснабжение"
     * 
     */
    @XmlElement(name = "ColdWater")
    protected QualityServicesType.ColdWater coldWater;
    /**
     * Показатели качества КУ "Горячее водоснабжение"
     * 
     */
    @XmlElement(name = "HotWater")
    protected QualityServicesType.HotWater hotWater;
    /**
     * Показатели качества КУ "Электроснабжение"
     * 
     */
    @XmlElement(name = "Electricity")
    protected QualityServicesType.Electricity electricity;
    /**
     * Показатели качества КУ "Газоснабжение"
     * 
     */
    @XmlElement(name = "Gas")
    protected QualityServicesType.Gas gas;
    /**
     * Показатели качества КУ "Отопление"
     * 
     */
    @XmlElement(name = "Heating")
    protected QualityServicesType.Heating heating;

    /**
     * Объект жилищного фонда
     * 
     * @return
     *     possible object is
     *     {@link QualityServicesType.ObjectAddress }
     *     
     */
    public QualityServicesType.ObjectAddress getObjectAddress() {
        return objectAddress;
    }

    /**
     * Sets the value of the objectAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityServicesType.ObjectAddress }
     *     
     * @see #getObjectAddress()
     */
    public void setObjectAddress(QualityServicesType.ObjectAddress value) {
        this.objectAddress = value;
    }

    /**
     * Показатели качества КУ "Холодное водоснабжение"
     * 
     * @return
     *     possible object is
     *     {@link QualityServicesType.ColdWater }
     *     
     */
    public QualityServicesType.ColdWater getColdWater() {
        return coldWater;
    }

    /**
     * Sets the value of the coldWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityServicesType.ColdWater }
     *     
     * @see #getColdWater()
     */
    public void setColdWater(QualityServicesType.ColdWater value) {
        this.coldWater = value;
    }

    /**
     * Показатели качества КУ "Горячее водоснабжение"
     * 
     * @return
     *     possible object is
     *     {@link QualityServicesType.HotWater }
     *     
     */
    public QualityServicesType.HotWater getHotWater() {
        return hotWater;
    }

    /**
     * Sets the value of the hotWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityServicesType.HotWater }
     *     
     * @see #getHotWater()
     */
    public void setHotWater(QualityServicesType.HotWater value) {
        this.hotWater = value;
    }

    /**
     * Показатели качества КУ "Электроснабжение"
     * 
     * @return
     *     possible object is
     *     {@link QualityServicesType.Electricity }
     *     
     */
    public QualityServicesType.Electricity getElectricity() {
        return electricity;
    }

    /**
     * Sets the value of the electricity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityServicesType.Electricity }
     *     
     * @see #getElectricity()
     */
    public void setElectricity(QualityServicesType.Electricity value) {
        this.electricity = value;
    }

    /**
     * Показатели качества КУ "Газоснабжение"
     * 
     * @return
     *     possible object is
     *     {@link QualityServicesType.Gas }
     *     
     */
    public QualityServicesType.Gas getGas() {
        return gas;
    }

    /**
     * Sets the value of the gas property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityServicesType.Gas }
     *     
     * @see #getGas()
     */
    public void setGas(QualityServicesType.Gas value) {
        this.gas = value;
    }

    /**
     * Показатели качества КУ "Отопление"
     * 
     * @return
     *     possible object is
     *     {@link QualityServicesType.Heating }
     *     
     */
    public QualityServicesType.Heating getHeating() {
        return heating;
    }

    /**
     * Sets the value of the heating property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityServicesType.Heating }
     *     
     * @see #getHeating()
     */
    public void setHeating(QualityServicesType.Heating value) {
        this.heating = value;
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
     *       <choice>
     *         <element name="IsSignedAct">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ColdWaterConformity">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             <sequence>
     *                               <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="NotConformityDays">
     *                                 <simpleType>
     *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType">
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </sequence>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
     *                   <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isSignedAct",
        "isNotSignedAct"
    })
    public static class ColdWater {

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsSignedAct")
        protected QualityServicesType.ColdWater.IsSignedAct isSignedAct;
        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsNotSignedAct")
        protected Boolean isNotSignedAct;

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link QualityServicesType.ColdWater.IsSignedAct }
         *     
         */
        public QualityServicesType.ColdWater.IsSignedAct getIsSignedAct() {
            return isSignedAct;
        }

        /**
         * Sets the value of the isSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualityServicesType.ColdWater.IsSignedAct }
         *     
         * @see #getIsSignedAct()
         */
        public void setIsSignedAct(QualityServicesType.ColdWater.IsSignedAct value) {
            this.isSignedAct = value;
        }

        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsNotSignedAct() {
            return isNotSignedAct;
        }

        /**
         * Sets the value of the isNotSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsNotSignedAct()
         */
        public void setIsNotSignedAct(Boolean value) {
            this.isNotSignedAct = value;
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
         *         <element name="ColdWaterConformity">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <sequence>
         *                     <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="NotConformityDays">
         *                       <simpleType>
         *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType">
         *                         </restriction>
         *                       </simpleType>
         *                     </element>
         *                   </sequence>
         *                 </choice>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
         *         <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType" minOccurs="0"/>
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
            "coldWaterConformity",
            "durationPressure25",
            "daysPressure25"
        })
        public static class IsSignedAct {

            /**
             * Соответствие (несоответствие) состава и свойств холодной воды требованиям законодательства Российской Федерации о техническом регулировании
             * 
             */
            @XmlElement(name = "ColdWaterConformity", required = true)
            protected QualityServicesType.ColdWater.IsSignedAct.ColdWaterConformity coldWaterConformity;
            /**
             * Продолжительность предоставления холодного водоснабжения в часах суммарно в течение расчетного периода при давлении, отличающемся от установленного до 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             */
            @XmlElement(name = "DurationPressure25")
            protected BigDecimal durationPressure25;
            /**
             * Количество дней предоставления холодного водоснабжения суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             */
            @XmlElement(name = "DaysPressure25")
            protected BigDecimal daysPressure25;

            /**
             * Соответствие (несоответствие) состава и свойств холодной воды требованиям законодательства Российской Федерации о техническом регулировании
             * 
             * @return
             *     possible object is
             *     {@link QualityServicesType.ColdWater.IsSignedAct.ColdWaterConformity }
             *     
             */
            public QualityServicesType.ColdWater.IsSignedAct.ColdWaterConformity getColdWaterConformity() {
                return coldWaterConformity;
            }

            /**
             * Sets the value of the coldWaterConformity property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityServicesType.ColdWater.IsSignedAct.ColdWaterConformity }
             *     
             * @see #getColdWaterConformity()
             */
            public void setColdWaterConformity(QualityServicesType.ColdWater.IsSignedAct.ColdWaterConformity value) {
                this.coldWaterConformity = value;
            }

            /**
             * Продолжительность предоставления холодного водоснабжения в часах суммарно в течение расчетного периода при давлении, отличающемся от установленного до 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDurationPressure25() {
                return durationPressure25;
            }

            /**
             * Sets the value of the durationPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDurationPressure25()
             */
            public void setDurationPressure25(BigDecimal value) {
                this.durationPressure25 = value;
            }

            /**
             * Количество дней предоставления холодного водоснабжения суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDaysPressure25() {
                return daysPressure25;
            }

            /**
             * Sets the value of the daysPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDaysPressure25()
             */
            public void setDaysPressure25(BigDecimal value) {
                this.daysPressure25 = value;
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
             *       <choice>
             *         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <sequence>
             *           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="NotConformityDays">
             *             <simpleType>
             *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType">
             *               </restriction>
             *             </simpleType>
             *           </element>
             *         </sequence>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conformed",
                "notConformed",
                "notConformityDays"
            })
            public static class ColdWaterConformity {

                /**
                 * Соответствует
                 * 
                 */
                @XmlElement(name = "Conformed")
                protected Boolean conformed;
                /**
                 * Не соответствует
                 * 
                 */
                @XmlElement(name = "NotConformed")
                protected Boolean notConformed;
                /**
                 * Количество дней предоставления услуги холодного водоснабжения при несоответствии состава и свойств холодной воды требованиям законодательства Российской Федерации о техническом регулировании в расчетном периоде суммарно в течение расчетного месяца.
                 * 
                 */
                @XmlElement(name = "NotConformityDays")
                protected BigDecimal notConformityDays;

                /**
                 * Соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isConformed() {
                    return conformed;
                }

                /**
                 * Sets the value of the conformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isConformed()
                 */
                public void setConformed(Boolean value) {
                    this.conformed = value;
                }

                /**
                 * Не соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConformed() {
                    return notConformed;
                }

                /**
                 * Sets the value of the notConformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isNotConformed()
                 */
                public void setNotConformed(Boolean value) {
                    this.notConformed = value;
                }

                /**
                 * Количество дней предоставления услуги холодного водоснабжения при несоответствии состава и свойств холодной воды требованиям законодательства Российской Федерации о техническом регулировании в расчетном периоде суммарно в течение расчетного месяца.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNotConformityDays() {
                    return notConformityDays;
                }

                /**
                 * Sets the value of the notConformityDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getNotConformityDays()
                 */
                public void setNotConformityDays(BigDecimal value) {
                    this.notConformityDays = value;
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
     *       <choice>
     *         <element name="IsSignedAct">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ElectricityConformity">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             <sequence>
     *                               <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
     *                             </sequence>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isSignedAct",
        "isNotSignedAct"
    })
    public static class Electricity {

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsSignedAct")
        protected QualityServicesType.Electricity.IsSignedAct isSignedAct;
        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsNotSignedAct")
        protected Boolean isNotSignedAct;

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link QualityServicesType.Electricity.IsSignedAct }
         *     
         */
        public QualityServicesType.Electricity.IsSignedAct getIsSignedAct() {
            return isSignedAct;
        }

        /**
         * Sets the value of the isSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualityServicesType.Electricity.IsSignedAct }
         *     
         * @see #getIsSignedAct()
         */
        public void setIsSignedAct(QualityServicesType.Electricity.IsSignedAct value) {
            this.isSignedAct = value;
        }

        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsNotSignedAct() {
            return isNotSignedAct;
        }

        /**
         * Sets the value of the isNotSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsNotSignedAct()
         */
        public void setIsNotSignedAct(Boolean value) {
            this.isNotSignedAct = value;
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
         *         <element name="ElectricityConformity">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <sequence>
         *                     <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
         *                   </sequence>
         *                 </choice>
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
            "electricityConformity"
        })
        public static class IsSignedAct {

            /**
             * Соответствие (несоответствие) напряжения и частоты электрического тока требованиям законодательства Российской Федерации о техническом регулировании
             * 
             */
            @XmlElement(name = "ElectricityConformity", required = true)
            protected QualityServicesType.Electricity.IsSignedAct.ElectricityConformity electricityConformity;

            /**
             * Соответствие (несоответствие) напряжения и частоты электрического тока требованиям законодательства Российской Федерации о техническом регулировании
             * 
             * @return
             *     possible object is
             *     {@link QualityServicesType.Electricity.IsSignedAct.ElectricityConformity }
             *     
             */
            public QualityServicesType.Electricity.IsSignedAct.ElectricityConformity getElectricityConformity() {
                return electricityConformity;
            }

            /**
             * Sets the value of the electricityConformity property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityServicesType.Electricity.IsSignedAct.ElectricityConformity }
             *     
             * @see #getElectricityConformity()
             */
            public void setElectricityConformity(QualityServicesType.Electricity.IsSignedAct.ElectricityConformity value) {
                this.electricityConformity = value;
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
             *       <choice>
             *         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <sequence>
             *           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
             *         </sequence>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conformed",
                "notConformed",
                "notConformityDays"
            })
            public static class ElectricityConformity {

                /**
                 * Соответствует
                 * 
                 */
                @XmlElement(name = "Conformed")
                protected Boolean conformed;
                /**
                 * Не соответствует
                 * 
                 */
                @XmlElement(name = "NotConformed")
                protected Boolean notConformed;
                /**
                 * Продолжительность снабжения электрической энергией, несоответствующей требованиям законодательства Российской Федерации о техническом регулировании, в часах суммарно в течение расчетного периода
                 * 
                 */
                @XmlElement(name = "NotConformityDays")
                protected BigDecimal notConformityDays;

                /**
                 * Соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isConformed() {
                    return conformed;
                }

                /**
                 * Sets the value of the conformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isConformed()
                 */
                public void setConformed(Boolean value) {
                    this.conformed = value;
                }

                /**
                 * Не соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConformed() {
                    return notConformed;
                }

                /**
                 * Sets the value of the notConformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isNotConformed()
                 */
                public void setNotConformed(Boolean value) {
                    this.notConformed = value;
                }

                /**
                 * Продолжительность снабжения электрической энергией, несоответствующей требованиям законодательства Российской Федерации о техническом регулировании, в часах суммарно в течение расчетного периода
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNotConformityDays() {
                    return notConformityDays;
                }

                /**
                 * Sets the value of the notConformityDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getNotConformityDays()
                 */
                public void setNotConformityDays(BigDecimal value) {
                    this.notConformityDays = value;
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
     *       <choice>
     *         <element name="IsSignedAct">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="GasConformity">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             <sequence>
     *                               <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
     *                             </sequence>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
     *                   <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isSignedAct",
        "isNotSignedAct"
    })
    public static class Gas {

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsSignedAct")
        protected QualityServicesType.Gas.IsSignedAct isSignedAct;
        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsNotSignedAct")
        protected Boolean isNotSignedAct;

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link QualityServicesType.Gas.IsSignedAct }
         *     
         */
        public QualityServicesType.Gas.IsSignedAct getIsSignedAct() {
            return isSignedAct;
        }

        /**
         * Sets the value of the isSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualityServicesType.Gas.IsSignedAct }
         *     
         * @see #getIsSignedAct()
         */
        public void setIsSignedAct(QualityServicesType.Gas.IsSignedAct value) {
            this.isSignedAct = value;
        }

        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsNotSignedAct() {
            return isNotSignedAct;
        }

        /**
         * Sets the value of the isNotSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsNotSignedAct()
         */
        public void setIsNotSignedAct(Boolean value) {
            this.isNotSignedAct = value;
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
         *         <element name="GasConformity">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <sequence>
         *                     <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
         *                   </sequence>
         *                 </choice>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
         *         <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
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
            "gasConformity",
            "durationPressure25",
            "daysPressure25"
        })
        public static class IsSignedAct {

            /**
             * Соответствие (несоответствие) свойств подаваемого газа требованиям законодательства Российской Федерации о техническом регулировании
             * 
             */
            @XmlElement(name = "GasConformity", required = true)
            protected QualityServicesType.Gas.IsSignedAct.GasConformity gasConformity;
            /**
             * Продолжительность предоставления услуги газоснабжения в часах суммарно в течение расчетного периода при давлении, отличающемся от установленного до 25 процентов
             * 
             */
            @XmlElement(name = "DurationPressure25", required = true)
            protected BigDecimal durationPressure25;
            /**
             * Количество дней предоставления услуги газоснабжения суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов
             * 
             */
            @XmlElement(name = "DaysPressure25", required = true)
            protected BigDecimal daysPressure25;

            /**
             * Соответствие (несоответствие) свойств подаваемого газа требованиям законодательства Российской Федерации о техническом регулировании
             * 
             * @return
             *     possible object is
             *     {@link QualityServicesType.Gas.IsSignedAct.GasConformity }
             *     
             */
            public QualityServicesType.Gas.IsSignedAct.GasConformity getGasConformity() {
                return gasConformity;
            }

            /**
             * Sets the value of the gasConformity property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityServicesType.Gas.IsSignedAct.GasConformity }
             *     
             * @see #getGasConformity()
             */
            public void setGasConformity(QualityServicesType.Gas.IsSignedAct.GasConformity value) {
                this.gasConformity = value;
            }

            /**
             * Продолжительность предоставления услуги газоснабжения в часах суммарно в течение расчетного периода при давлении, отличающемся от установленного до 25 процентов
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDurationPressure25() {
                return durationPressure25;
            }

            /**
             * Sets the value of the durationPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDurationPressure25()
             */
            public void setDurationPressure25(BigDecimal value) {
                this.durationPressure25 = value;
            }

            /**
             * Количество дней предоставления услуги газоснабжения суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDaysPressure25() {
                return daysPressure25;
            }

            /**
             * Sets the value of the daysPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDaysPressure25()
             */
            public void setDaysPressure25(BigDecimal value) {
                this.daysPressure25 = value;
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
             *       <choice>
             *         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <sequence>
             *           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
             *         </sequence>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conformed",
                "notConformed",
                "notConformityDays"
            })
            public static class GasConformity {

                /**
                 * Соответствует
                 * 
                 */
                @XmlElement(name = "Conformed")
                protected Boolean conformed;
                /**
                 * Не соответствует
                 * 
                 */
                @XmlElement(name = "NotConformed")
                protected Boolean notConformed;
                /**
                 * Количество дней предоставления услуги газоснабжения при несоответствии свойств подаваемого газа требованиям законодательства Российской Федерации о техническом регулировании в расчетном периоде, суммарно в течение расчетного периода
                 * 
                 */
                @XmlElement(name = "NotConformityDays")
                protected BigDecimal notConformityDays;

                /**
                 * Соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isConformed() {
                    return conformed;
                }

                /**
                 * Sets the value of the conformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isConformed()
                 */
                public void setConformed(Boolean value) {
                    this.conformed = value;
                }

                /**
                 * Не соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConformed() {
                    return notConformed;
                }

                /**
                 * Sets the value of the notConformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isNotConformed()
                 */
                public void setNotConformed(Boolean value) {
                    this.notConformed = value;
                }

                /**
                 * Количество дней предоставления услуги газоснабжения при несоответствии свойств подаваемого газа требованиям законодательства Российской Федерации о техническом регулировании в расчетном периоде, суммарно в течение расчетного периода
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNotConformityDays() {
                    return notConformityDays;
                }

                /**
                 * Sets the value of the notConformityDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getNotConformityDays()
                 */
                public void setNotConformityDays(BigDecimal value) {
                    this.notConformityDays = value;
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
     *       <choice>
     *         <element name="IsSignedAct">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="HeatingConformity">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             <sequence>
     *                               <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="NotConformityTemperature">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       <sequence>
     *                                         <element name="TemperatureExcess" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
     *                                         <element name="TemperatureDecline" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
     *                                       </sequence>
     *                                     </restriction>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                               <element name="NotConformityHours" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
     *                             </sequence>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isSignedAct",
        "isNotSignedAct"
    })
    public static class Heating {

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsSignedAct")
        protected QualityServicesType.Heating.IsSignedAct isSignedAct;
        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsNotSignedAct")
        protected Boolean isNotSignedAct;

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link QualityServicesType.Heating.IsSignedAct }
         *     
         */
        public QualityServicesType.Heating.IsSignedAct getIsSignedAct() {
            return isSignedAct;
        }

        /**
         * Sets the value of the isSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualityServicesType.Heating.IsSignedAct }
         *     
         * @see #getIsSignedAct()
         */
        public void setIsSignedAct(QualityServicesType.Heating.IsSignedAct value) {
            this.isSignedAct = value;
        }

        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsNotSignedAct() {
            return isNotSignedAct;
        }

        /**
         * Sets the value of the isNotSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsNotSignedAct()
         */
        public void setIsNotSignedAct(Boolean value) {
            this.isNotSignedAct = value;
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
         *         <element name="HeatingConformity">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <sequence>
         *                     <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="NotConformityTemperature">
         *                       <complexType>
         *                         <complexContent>
         *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             <sequence>
         *                               <element name="TemperatureExcess" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
         *                               <element name="TemperatureDecline" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
         *                             </sequence>
         *                           </restriction>
         *                         </complexContent>
         *                       </complexType>
         *                     </element>
         *                     <element name="NotConformityHours" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
         *                   </sequence>
         *                 </choice>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
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
            "heatingConformity",
            "daysPressure25"
        })
        public static class IsSignedAct {

            /**
             * Соответствие (несоответствие) обеспечения нормативной температуры воздуха в помещениях многоквартирных домов, жилых домов в соответствии с требованиями законодательства Российской Федерации о техническом регулировании
             * 
             */
            @XmlElement(name = "HeatingConformity", required = true)
            protected QualityServicesType.Heating.IsSignedAct.HeatingConformity heatingConformity;
            /**
             * Количество дней предоставления услуги отопления суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов
             * 
             */
            @XmlElement(name = "DaysPressure25", required = true)
            protected BigDecimal daysPressure25;

            /**
             * Соответствие (несоответствие) обеспечения нормативной температуры воздуха в помещениях многоквартирных домов, жилых домов в соответствии с требованиями законодательства Российской Федерации о техническом регулировании
             * 
             * @return
             *     possible object is
             *     {@link QualityServicesType.Heating.IsSignedAct.HeatingConformity }
             *     
             */
            public QualityServicesType.Heating.IsSignedAct.HeatingConformity getHeatingConformity() {
                return heatingConformity;
            }

            /**
             * Sets the value of the heatingConformity property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityServicesType.Heating.IsSignedAct.HeatingConformity }
             *     
             * @see #getHeatingConformity()
             */
            public void setHeatingConformity(QualityServicesType.Heating.IsSignedAct.HeatingConformity value) {
                this.heatingConformity = value;
            }

            /**
             * Количество дней предоставления услуги отопления суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDaysPressure25() {
                return daysPressure25;
            }

            /**
             * Sets the value of the daysPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDaysPressure25()
             */
            public void setDaysPressure25(BigDecimal value) {
                this.daysPressure25 = value;
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
             *       <choice>
             *         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <sequence>
             *           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="NotConformityTemperature">
             *             <complexType>
             *               <complexContent>
             *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   <sequence>
             *                     <element name="TemperatureExcess" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
             *                     <element name="TemperatureDecline" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
             *                   </sequence>
             *                 </restriction>
             *               </complexContent>
             *             </complexType>
             *           </element>
             *           <element name="NotConformityHours" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
             *         </sequence>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conformed",
                "notConformed",
                "notConformityTemperature",
                "notConformityHours"
            })
            public static class HeatingConformity {

                /**
                 * Соответствует
                 * 
                 */
                @XmlElement(name = "Conformed")
                protected Boolean conformed;
                /**
                 * Не соответствует
                 * 
                 */
                @XmlElement(name = "NotConformed")
                protected Boolean notConformed;
                /**
                 * Продолжительность отопления при отклонении температуры воздуха в помещениях многоквартирных домов, жилых домах в часах суммарно за расчетный период.                                                                                                    Необходимо заполнить хотя бы одно из указанных полей: tns:TemperatureExcess, tns:TemperatureDecline.
                 * 
                 */
                @XmlElement(name = "NotConformityTemperature")
                protected QualityServicesType.Heating.IsSignedAct.HeatingConformity.NotConformityTemperature notConformityTemperature;
                /**
                 * Количество часов отклонения температуры воздуха в помещениях многоквартирных домов, жилых домах в часах суммарно за расчетный период
                 * 
                 */
                @XmlElement(name = "NotConformityHours")
                protected BigDecimal notConformityHours;

                /**
                 * Соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isConformed() {
                    return conformed;
                }

                /**
                 * Sets the value of the conformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isConformed()
                 */
                public void setConformed(Boolean value) {
                    this.conformed = value;
                }

                /**
                 * Не соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConformed() {
                    return notConformed;
                }

                /**
                 * Sets the value of the notConformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isNotConformed()
                 */
                public void setNotConformed(Boolean value) {
                    this.notConformed = value;
                }

                /**
                 * Продолжительность отопления при отклонении температуры воздуха в помещениях многоквартирных домов, жилых домах в часах суммарно за расчетный период.                                                                                                    Необходимо заполнить хотя бы одно из указанных полей: tns:TemperatureExcess, tns:TemperatureDecline.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QualityServicesType.Heating.IsSignedAct.HeatingConformity.NotConformityTemperature }
                 *     
                 */
                public QualityServicesType.Heating.IsSignedAct.HeatingConformity.NotConformityTemperature getNotConformityTemperature() {
                    return notConformityTemperature;
                }

                /**
                 * Sets the value of the notConformityTemperature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QualityServicesType.Heating.IsSignedAct.HeatingConformity.NotConformityTemperature }
                 *     
                 * @see #getNotConformityTemperature()
                 */
                public void setNotConformityTemperature(QualityServicesType.Heating.IsSignedAct.HeatingConformity.NotConformityTemperature value) {
                    this.notConformityTemperature = value;
                }

                /**
                 * Количество часов отклонения температуры воздуха в помещениях многоквартирных домов, жилых домах в часах суммарно за расчетный период
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNotConformityHours() {
                    return notConformityHours;
                }

                /**
                 * Sets the value of the notConformityHours property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getNotConformityHours()
                 */
                public void setNotConformityHours(BigDecimal value) {
                    this.notConformityHours = value;
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
                 *         <element name="TemperatureExcess" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
                 *         <element name="TemperatureDecline" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
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
                    "temperatureExcess",
                    "temperatureDecline"
                })
                public static class NotConformityTemperature {

                    /**
                     * Превышение нормативной температуры воздуха в помещениях многоквартирных домов, жилых домах сверх допустимого уровня
                     * 
                     */
                    @XmlElement(name = "TemperatureExcess")
                    protected BigDecimal temperatureExcess;
                    /**
                     * Снижение нормативной температуры воздуха в помещениях многоквартирных домов, жилых домах сверх допустимого уровня
                     * 
                     */
                    @XmlElement(name = "TemperatureDecline")
                    protected BigDecimal temperatureDecline;

                    /**
                     * Превышение нормативной температуры воздуха в помещениях многоквартирных домов, жилых домах сверх допустимого уровня
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getTemperatureExcess() {
                        return temperatureExcess;
                    }

                    /**
                     * Sets the value of the temperatureExcess property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getTemperatureExcess()
                     */
                    public void setTemperatureExcess(BigDecimal value) {
                        this.temperatureExcess = value;
                    }

                    /**
                     * Снижение нормативной температуры воздуха в помещениях многоквартирных домов, жилых домах сверх допустимого уровня
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getTemperatureDecline() {
                        return temperatureDecline;
                    }

                    /**
                     * Sets the value of the temperatureDecline property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     * @see #getTemperatureDecline()
                     */
                    public void setTemperatureDecline(BigDecimal value) {
                        this.temperatureDecline = value;
                    }

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
     *       <choice>
     *         <element name="IsSignedAct">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="TemperatureConformity">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             <sequence>
     *                               <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="NotConformityTemperature" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}NotConformityTemperatureHotWaterType"/>
     *                             </sequence>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="DurationDeg40" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
     *                   <element name="VolumeDeg40" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
     *                   <element name="HotWaterConformity">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <choice>
     *                             <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                             <sequence>
     *                               <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                               <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
     *                             </sequence>
     *                           </choice>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
     *                   <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsNotSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isSignedAct",
        "isNotSignedAct"
    })
    public static class HotWater {

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsSignedAct")
        protected QualityServicesType.HotWater.IsSignedAct isSignedAct;
        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         */
        @XmlElement(name = "IsNotSignedAct")
        protected Boolean isNotSignedAct;

        /**
         * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link QualityServicesType.HotWater.IsSignedAct }
         *     
         */
        public QualityServicesType.HotWater.IsSignedAct getIsSignedAct() {
            return isSignedAct;
        }

        /**
         * Sets the value of the isSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualityServicesType.HotWater.IsSignedAct }
         *     
         * @see #getIsSignedAct()
         */
        public void setIsSignedAct(QualityServicesType.HotWater.IsSignedAct value) {
            this.isSignedAct = value;
        }

        /**
         * Отсутствие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsNotSignedAct() {
            return isNotSignedAct;
        }

        /**
         * Sets the value of the isNotSignedAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsNotSignedAct()
         */
        public void setIsNotSignedAct(Boolean value) {
            this.isNotSignedAct = value;
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
         *         <element name="TemperatureConformity">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <sequence>
         *                     <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="NotConformityTemperature" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}NotConformityTemperatureHotWaterType"/>
         *                   </sequence>
         *                 </choice>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="DurationDeg40" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
         *         <element name="VolumeDeg40" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType"/>
         *         <element name="HotWaterConformity">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                   <sequence>
         *                     <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                     <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
         *                   </sequence>
         *                 </choice>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="DurationPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceNumberType" minOccurs="0"/>
         *         <element name="DaysPressure25" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType" minOccurs="0"/>
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
            "temperatureConformity",
            "durationDeg40",
            "volumeDeg40",
            "hotWaterConformity",
            "durationPressure25",
            "daysPressure25"
        })
        public static class IsSignedAct {

            /**
             * Соответствие (несоответствие) температуры горячей воды требованиям законодательства Российской Федерации о техническом регулировании
             * 
             */
            @XmlElement(name = "TemperatureConformity", required = true)
            protected QualityServicesType.HotWater.IsSignedAct.TemperatureConformity temperatureConformity;
            /**
             * Продолжительность предоставления горячего водоснабжения при температуре ниже 40°С в часах суммарно в течение расчетного периода
             * 
             */
            @XmlElement(name = "DurationDeg40", required = true)
            protected BigDecimal durationDeg40;
            /**
             * Объем горячей воды, поставленной при температуре ниже 40°С суммарно в течение расчетного периода
             * 
             */
            @XmlElement(name = "VolumeDeg40", required = true)
            protected BigDecimal volumeDeg40;
            /**
             * Соответствие (несоответствие) состава и свойств горячей воды требованиям законодательства Российской Федерации о техническом регулировании
             * 
             */
            @XmlElement(name = "HotWaterConformity", required = true)
            protected QualityServicesType.HotWater.IsSignedAct.HotWaterConformity hotWaterConformity;
            /**
             * Продолжительность предоставления услуги горячего водоснабжения в часах суммарно в течение расчетного периода при давлении, отличающемся от установленного до 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             */
            @XmlElement(name = "DurationPressure25")
            protected BigDecimal durationPressure25;
            /**
             * Количество дней предоставления услуги горячего водоснабжения суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             */
            @XmlElement(name = "DaysPressure25")
            protected BigDecimal daysPressure25;

            /**
             * Соответствие (несоответствие) температуры горячей воды требованиям законодательства Российской Федерации о техническом регулировании
             * 
             * @return
             *     possible object is
             *     {@link QualityServicesType.HotWater.IsSignedAct.TemperatureConformity }
             *     
             */
            public QualityServicesType.HotWater.IsSignedAct.TemperatureConformity getTemperatureConformity() {
                return temperatureConformity;
            }

            /**
             * Sets the value of the temperatureConformity property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityServicesType.HotWater.IsSignedAct.TemperatureConformity }
             *     
             * @see #getTemperatureConformity()
             */
            public void setTemperatureConformity(QualityServicesType.HotWater.IsSignedAct.TemperatureConformity value) {
                this.temperatureConformity = value;
            }

            /**
             * Продолжительность предоставления горячего водоснабжения при температуре ниже 40°С в часах суммарно в течение расчетного периода
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDurationDeg40() {
                return durationDeg40;
            }

            /**
             * Sets the value of the durationDeg40 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDurationDeg40()
             */
            public void setDurationDeg40(BigDecimal value) {
                this.durationDeg40 = value;
            }

            /**
             * Объем горячей воды, поставленной при температуре ниже 40°С суммарно в течение расчетного периода
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVolumeDeg40() {
                return volumeDeg40;
            }

            /**
             * Sets the value of the volumeDeg40 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getVolumeDeg40()
             */
            public void setVolumeDeg40(BigDecimal value) {
                this.volumeDeg40 = value;
            }

            /**
             * Соответствие (несоответствие) состава и свойств горячей воды требованиям законодательства Российской Федерации о техническом регулировании
             * 
             * @return
             *     possible object is
             *     {@link QualityServicesType.HotWater.IsSignedAct.HotWaterConformity }
             *     
             */
            public QualityServicesType.HotWater.IsSignedAct.HotWaterConformity getHotWaterConformity() {
                return hotWaterConformity;
            }

            /**
             * Sets the value of the hotWaterConformity property.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityServicesType.HotWater.IsSignedAct.HotWaterConformity }
             *     
             * @see #getHotWaterConformity()
             */
            public void setHotWaterConformity(QualityServicesType.HotWater.IsSignedAct.HotWaterConformity value) {
                this.hotWaterConformity = value;
            }

            /**
             * Продолжительность предоставления услуги горячего водоснабжения в часах суммарно в течение расчетного периода при давлении, отличающемся от установленного до 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDurationPressure25() {
                return durationPressure25;
            }

            /**
             * Sets the value of the durationPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDurationPressure25()
             */
            public void setDurationPressure25(BigDecimal value) {
                this.durationPressure25 = value;
            }

            /**
             * Количество дней предоставления услуги горячего водоснабжения суммарно в течение расчетного периода при давлении, отличающемся от установленного более чем на 25 процентов.
             * 
             * Не указывается для объекта жилищного фонда, для которого в договоре ресурсоснабжения установлен признак «Отсутствуют присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения». В остальных случаях обязательно
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDaysPressure25() {
                return daysPressure25;
            }

            /**
             * Sets the value of the daysPressure25 property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDaysPressure25()
             */
            public void setDaysPressure25(BigDecimal value) {
                this.daysPressure25 = value;
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
             *       <choice>
             *         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <sequence>
             *           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="NotConformityDays" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorServiceDaysType"/>
             *         </sequence>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conformed",
                "notConformed",
                "notConformityDays"
            })
            public static class HotWaterConformity {

                /**
                 * Соответствует
                 * 
                 */
                @XmlElement(name = "Conformed")
                protected Boolean conformed;
                /**
                 * Не соответствует
                 * 
                 */
                @XmlElement(name = "NotConformed")
                protected Boolean notConformed;
                /**
                 * Количество дней предоставления услуги горячего водоснабжения при несоответствии состава и свойств горячей воды требованиям законодательства Российской Федерации о техническом регулировании в расчетном периоде суммарно в течение расчетного периода
                 * 
                 */
                @XmlElement(name = "NotConformityDays")
                protected BigDecimal notConformityDays;

                /**
                 * Соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isConformed() {
                    return conformed;
                }

                /**
                 * Sets the value of the conformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isConformed()
                 */
                public void setConformed(Boolean value) {
                    this.conformed = value;
                }

                /**
                 * Не соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConformed() {
                    return notConformed;
                }

                /**
                 * Sets the value of the notConformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isNotConformed()
                 */
                public void setNotConformed(Boolean value) {
                    this.notConformed = value;
                }

                /**
                 * Количество дней предоставления услуги горячего водоснабжения при несоответствии состава и свойств горячей воды требованиям законодательства Российской Федерации о техническом регулировании в расчетном периоде суммарно в течение расчетного периода
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNotConformityDays() {
                    return notConformityDays;
                }

                /**
                 * Sets the value of the notConformityDays property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getNotConformityDays()
                 */
                public void setNotConformityDays(BigDecimal value) {
                    this.notConformityDays = value;
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
             *       <choice>
             *         <element name="Conformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *         <sequence>
             *           <element name="NotConformed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *           <element name="NotConformityTemperature" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}NotConformityTemperatureHotWaterType"/>
             *         </sequence>
             *       </choice>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "conformed",
                "notConformed",
                "notConformityTemperature"
            })
            public static class TemperatureConformity {

                /**
                 * Соответствует
                 * 
                 */
                @XmlElement(name = "Conformed")
                protected Boolean conformed;
                /**
                 * Не соответствует
                 * 
                 */
                @XmlElement(name = "NotConformed")
                protected Boolean notConformed;
                /**
                 * Информация о продолжительности предоставления услуги горячего водоснабжения при отклонении температуры горячей воды от установленной законодательством Российской Федерации о техническом регулировании (в часах суммарно в течение расчетного периода).                                                                          Необходимо заполнить хотя бы одно из указанных  полей
                 * 
                 */
                @XmlElement(name = "NotConformityTemperature")
                protected NotConformityTemperatureHotWaterType notConformityTemperature;

                /**
                 * Соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isConformed() {
                    return conformed;
                }

                /**
                 * Sets the value of the conformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isConformed()
                 */
                public void setConformed(Boolean value) {
                    this.conformed = value;
                }

                /**
                 * Не соответствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNotConformed() {
                    return notConformed;
                }

                /**
                 * Sets the value of the notConformed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 * @see #isNotConformed()
                 */
                public void setNotConformed(Boolean value) {
                    this.notConformed = value;
                }

                /**
                 * Информация о продолжительности предоставления услуги горячего водоснабжения при отклонении температуры горячей воды от установленной законодательством Российской Федерации о техническом регулировании (в часах суммарно в течение расчетного периода).                                                                          Необходимо заполнить хотя бы одно из указанных  полей
                 * 
                 * @return
                 *     possible object is
                 *     {@link NotConformityTemperatureHotWaterType }
                 *     
                 */
                public NotConformityTemperatureHotWaterType getNotConformityTemperature() {
                    return notConformityTemperature;
                }

                /**
                 * Sets the value of the notConformityTemperature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NotConformityTemperatureHotWaterType }
                 *     
                 * @see #getNotConformityTemperature()
                 */
                public void setNotConformityTemperature(NotConformityTemperatureHotWaterType value) {
                    this.notConformityTemperature = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
     *       <sequence>
     *         <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "notFromContract"
    })
    public static class ObjectAddress
        extends ObjectAddressType
    {

        /**
         * Помещение/блок или комната не из договора (основания).                         Присылается, если импортируется помещение/блок или комната, отсутствующее в указанном основании
         * 
         */
        @XmlElement(name = "NotFromContract")
        protected Boolean notFromContract;

        /**
         * Помещение/блок или комната не из договора (основания).                         Присылается, если импортируется помещение/блок или комната, отсутствующее в указанном основании
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotFromContract() {
            return notFromContract;
        }

        /**
         * Sets the value of the notFromContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNotFromContract()
         */
        public void setNotFromContract(Boolean value) {
            this.notFromContract = value;
        }

    }

}
