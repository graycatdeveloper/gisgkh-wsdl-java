
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Сведения о нагрузке по водоснабжению и водоотведению
 * 
 * <p>Java class for WaterSupplyPowerDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WaterSupplyPowerDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HotWaterSupply" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="GCalPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <element name="LitrePerSecond" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <element name="CbmPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ColdWaterSupply" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="LitrePerSecond" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <element name="CbmPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <element name="CbmPerDay" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <sequence minOccurs="0">
 *                     <element name="InternalFirefightingCapacity" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType" minOccurs="0"/>
 *                     <element name="OutdoorFirefightingCapacity" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType" minOccurs="0"/>
 *                     <element name="AutomaticFirefightingCapacity" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType" minOccurs="0"/>
 *                     <element name="FireHydrantsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   </sequence>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Sewage" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="LitrePerSecond" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <element name="CbmPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
 *                   <element name="CbmPerDay" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
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
@XmlType(name = "WaterSupplyPowerDetailsType", propOrder = {
    "hotWaterSupply",
    "coldWaterSupply",
    "sewage"
})
public class WaterSupplyPowerDetailsType {

    /**
     * Нагрузка по горячему водоснабжению
     * 
     */
    @XmlElement(name = "HotWaterSupply")
    protected WaterSupplyPowerDetailsType.HotWaterSupply hotWaterSupply;
    /**
     * Нагрузка по холодному водоснабжению
     * 
     */
    @XmlElement(name = "ColdWaterSupply")
    protected WaterSupplyPowerDetailsType.ColdWaterSupply coldWaterSupply;
    /**
     * Нагрузка по водоотведению
     * 
     */
    @XmlElement(name = "Sewage")
    protected WaterSupplyPowerDetailsType.Sewage sewage;

    /**
     * Нагрузка по горячему водоснабжению
     * 
     * @return
     *     possible object is
     *     {@link WaterSupplyPowerDetailsType.HotWaterSupply }
     *     
     */
    public WaterSupplyPowerDetailsType.HotWaterSupply getHotWaterSupply() {
        return hotWaterSupply;
    }

    /**
     * Sets the value of the hotWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSupplyPowerDetailsType.HotWaterSupply }
     *     
     * @see #getHotWaterSupply()
     */
    public void setHotWaterSupply(WaterSupplyPowerDetailsType.HotWaterSupply value) {
        this.hotWaterSupply = value;
    }

    /**
     * Нагрузка по холодному водоснабжению
     * 
     * @return
     *     possible object is
     *     {@link WaterSupplyPowerDetailsType.ColdWaterSupply }
     *     
     */
    public WaterSupplyPowerDetailsType.ColdWaterSupply getColdWaterSupply() {
        return coldWaterSupply;
    }

    /**
     * Sets the value of the coldWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSupplyPowerDetailsType.ColdWaterSupply }
     *     
     * @see #getColdWaterSupply()
     */
    public void setColdWaterSupply(WaterSupplyPowerDetailsType.ColdWaterSupply value) {
        this.coldWaterSupply = value;
    }

    /**
     * Нагрузка по водоотведению
     * 
     * @return
     *     possible object is
     *     {@link WaterSupplyPowerDetailsType.Sewage }
     *     
     */
    public WaterSupplyPowerDetailsType.Sewage getSewage() {
        return sewage;
    }

    /**
     * Sets the value of the sewage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaterSupplyPowerDetailsType.Sewage }
     *     
     * @see #getSewage()
     */
    public void setSewage(WaterSupplyPowerDetailsType.Sewage value) {
        this.sewage = value;
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
     *         <element name="LitrePerSecond" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <element name="CbmPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <element name="CbmPerDay" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <sequence minOccurs="0">
     *           <element name="InternalFirefightingCapacity" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType" minOccurs="0"/>
     *           <element name="OutdoorFirefightingCapacity" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType" minOccurs="0"/>
     *           <element name="AutomaticFirefightingCapacity" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType" minOccurs="0"/>
     *           <element name="FireHydrantsNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         </sequence>
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
        "litrePerSecond",
        "cbmPerHour",
        "cbmPerDay",
        "internalFirefightingCapacity",
        "outdoorFirefightingCapacity",
        "automaticFirefightingCapacity",
        "fireHydrantsNumber"
    })
    public static class ColdWaterSupply {

        /**
         * Потребление - л/с
         * 
         */
        @XmlElement(name = "LitrePerSecond", required = true)
        protected BigDecimal litrePerSecond;
        /**
         * Потребление - куб.м/час
         * 
         */
        @XmlElement(name = "CbmPerHour", required = true)
        protected BigDecimal cbmPerHour;
        /**
         * Потребление - куб.м/сутки
         * 
         */
        @XmlElement(name = "CbmPerDay", required = true)
        protected BigDecimal cbmPerDay;
        /**
         * Потребление холодной воды на нужды внутреннего пожаротушения - л/с
         * 
         */
        @XmlElement(name = "InternalFirefightingCapacity")
        protected BigDecimal internalFirefightingCapacity;
        /**
         * Потребление холодной воды на нужды наружного пожаротушения - л/с
         * 
         */
        @XmlElement(name = "OutdoorFirefightingCapacity")
        protected BigDecimal outdoorFirefightingCapacity;
        /**
         * Потребление холодной воды на нужды автоматического пожаротушения - л/с
         * 
         */
        @XmlElement(name = "AutomaticFirefightingCapacity")
        protected BigDecimal automaticFirefightingCapacity;
        /**
         * Количество пожарных кранов - шт.
         * 
         */
        @XmlElement(name = "FireHydrantsNumber")
        protected Integer fireHydrantsNumber;

        /**
         * Потребление - л/с
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLitrePerSecond() {
            return litrePerSecond;
        }

        /**
         * Sets the value of the litrePerSecond property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getLitrePerSecond()
         */
        public void setLitrePerSecond(BigDecimal value) {
            this.litrePerSecond = value;
        }

        /**
         * Потребление - куб.м/час
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCbmPerHour() {
            return cbmPerHour;
        }

        /**
         * Sets the value of the cbmPerHour property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCbmPerHour()
         */
        public void setCbmPerHour(BigDecimal value) {
            this.cbmPerHour = value;
        }

        /**
         * Потребление - куб.м/сутки
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCbmPerDay() {
            return cbmPerDay;
        }

        /**
         * Sets the value of the cbmPerDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCbmPerDay()
         */
        public void setCbmPerDay(BigDecimal value) {
            this.cbmPerDay = value;
        }

        /**
         * Потребление холодной воды на нужды внутреннего пожаротушения - л/с
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInternalFirefightingCapacity() {
            return internalFirefightingCapacity;
        }

        /**
         * Sets the value of the internalFirefightingCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getInternalFirefightingCapacity()
         */
        public void setInternalFirefightingCapacity(BigDecimal value) {
            this.internalFirefightingCapacity = value;
        }

        /**
         * Потребление холодной воды на нужды наружного пожаротушения - л/с
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOutdoorFirefightingCapacity() {
            return outdoorFirefightingCapacity;
        }

        /**
         * Sets the value of the outdoorFirefightingCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getOutdoorFirefightingCapacity()
         */
        public void setOutdoorFirefightingCapacity(BigDecimal value) {
            this.outdoorFirefightingCapacity = value;
        }

        /**
         * Потребление холодной воды на нужды автоматического пожаротушения - л/с
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAutomaticFirefightingCapacity() {
            return automaticFirefightingCapacity;
        }

        /**
         * Sets the value of the automaticFirefightingCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAutomaticFirefightingCapacity()
         */
        public void setAutomaticFirefightingCapacity(BigDecimal value) {
            this.automaticFirefightingCapacity = value;
        }

        /**
         * Количество пожарных кранов - шт.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFireHydrantsNumber() {
            return fireHydrantsNumber;
        }

        /**
         * Sets the value of the fireHydrantsNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getFireHydrantsNumber()
         */
        public void setFireHydrantsNumber(Integer value) {
            this.fireHydrantsNumber = value;
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
     *         <element name="GCalPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <element name="LitrePerSecond" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <element name="CbmPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
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
        "gCalPerHour",
        "litrePerSecond",
        "cbmPerHour"
    })
    public static class HotWaterSupply {

        /**
         * Потребление - ГКал/час
         * 
         */
        @XmlElement(name = "GCalPerHour", required = true)
        protected BigDecimal gCalPerHour;
        /**
         * Потребление - л/с
         * 
         */
        @XmlElement(name = "LitrePerSecond", required = true)
        protected BigDecimal litrePerSecond;
        /**
         * Потребление - куб.м/час
         * 
         */
        @XmlElement(name = "CbmPerHour", required = true)
        protected BigDecimal cbmPerHour;

        /**
         * Потребление - ГКал/час
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGCalPerHour() {
            return gCalPerHour;
        }

        /**
         * Sets the value of the gCalPerHour property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getGCalPerHour()
         */
        public void setGCalPerHour(BigDecimal value) {
            this.gCalPerHour = value;
        }

        /**
         * Потребление - л/с
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLitrePerSecond() {
            return litrePerSecond;
        }

        /**
         * Sets the value of the litrePerSecond property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getLitrePerSecond()
         */
        public void setLitrePerSecond(BigDecimal value) {
            this.litrePerSecond = value;
        }

        /**
         * Потребление - куб.м/час
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCbmPerHour() {
            return cbmPerHour;
        }

        /**
         * Sets the value of the cbmPerHour property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCbmPerHour()
         */
        public void setCbmPerHour(BigDecimal value) {
            this.cbmPerHour = value;
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
     *         <element name="LitrePerSecond" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <element name="CbmPerHour" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
     *         <element name="CbmPerDay" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}VolumeType"/>
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
        "litrePerSecond",
        "cbmPerHour",
        "cbmPerDay"
    })
    public static class Sewage {

        /**
         * Потребление - л/с
         * 
         */
        @XmlElement(name = "LitrePerSecond", required = true)
        protected BigDecimal litrePerSecond;
        /**
         * Потребление - куб.м/час
         * 
         */
        @XmlElement(name = "CbmPerHour", required = true)
        protected BigDecimal cbmPerHour;
        /**
         * Потребление - куб.м/сутки
         * 
         */
        @XmlElement(name = "CbmPerDay", required = true)
        protected BigDecimal cbmPerDay;

        /**
         * Потребление - л/с
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLitrePerSecond() {
            return litrePerSecond;
        }

        /**
         * Sets the value of the litrePerSecond property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getLitrePerSecond()
         */
        public void setLitrePerSecond(BigDecimal value) {
            this.litrePerSecond = value;
        }

        /**
         * Потребление - куб.м/час
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCbmPerHour() {
            return cbmPerHour;
        }

        /**
         * Sets the value of the cbmPerHour property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCbmPerHour()
         */
        public void setCbmPerHour(BigDecimal value) {
            this.cbmPerHour = value;
        }

        /**
         * Потребление - куб.м/сутки
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCbmPerDay() {
            return cbmPerDay;
        }

        /**
         * Sets the value of the cbmPerDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCbmPerDay()
         */
        public void setCbmPerDay(BigDecimal value) {
            this.cbmPerDay = value;
        }

    }

}
