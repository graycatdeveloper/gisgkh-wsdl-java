
package ru.gosuslugi.dom.schema.integration.device_metering;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.ElectricMeteringValueExportWithTSType;


/**
 * Показания многотарифного ПУ: значения показаний в единицах измерения ПУ и (если отличается) в единицах измерения коммунального ресурса по умолчанию, источник данных о показаниях ПУ, дата-время внесения в Систему. Используется при экспорте базовых показаний ПУ и показаний на начало / окончание поверки
 * 
 * <p>Java class for ElectricMeteringValueExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElectricMeteringValueExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueExportWithTSType">
 *       <sequence minOccurs="0">
 *         <element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MeteringValueInDefaultUnit" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="MeteringValueT1" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType"/>
 *                   <element name="MeteringValueT2" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType" minOccurs="0"/>
 *                   <element name="MeteringValueT3" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType" minOccurs="0"/>
 *                   <element name="DefaultUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "ElectricMeteringValueExportType", propOrder = {
    "unit",
    "meteringValueInDefaultUnit"
})
@XmlSeeAlso({
    ElectricCurrentMeteringValueExportType.class
})
public class ElectricMeteringValueExportType
    extends ElectricMeteringValueExportWithTSType
{

    /**
     * Код единицы измерения показаний ПУ (из расширенного классификатора ОКЕИ). Заполняется, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
     * 
     */
    @XmlElement(name = "Unit")
    protected String unit;
    /**
     * Значения показаний ПУ, выраженные в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     */
    @XmlElement(name = "MeteringValueInDefaultUnit")
    protected ElectricMeteringValueExportType.MeteringValueInDefaultUnit meteringValueInDefaultUnit;

    /**
     * Код единицы измерения показаний ПУ (из расширенного классификатора ОКЕИ). Заполняется, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
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
     * Значения показаний ПУ, выраженные в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     * @return
     *     possible object is
     *     {@link ElectricMeteringValueExportType.MeteringValueInDefaultUnit }
     *     
     */
    public ElectricMeteringValueExportType.MeteringValueInDefaultUnit getMeteringValueInDefaultUnit() {
        return meteringValueInDefaultUnit;
    }

    /**
     * Sets the value of the meteringValueInDefaultUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricMeteringValueExportType.MeteringValueInDefaultUnit }
     *     
     * @see #getMeteringValueInDefaultUnit()
     */
    public void setMeteringValueInDefaultUnit(ElectricMeteringValueExportType.MeteringValueInDefaultUnit value) {
        this.meteringValueInDefaultUnit = value;
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
     *         <element name="MeteringValueT1" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType"/>
     *         <element name="MeteringValueT2" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType" minOccurs="0"/>
     *         <element name="MeteringValueT3" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType" minOccurs="0"/>
     *         <element name="DefaultUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "meteringValueT1",
        "meteringValueT2",
        "meteringValueT3",
        "defaultUnit"
    })
    public static class MeteringValueInDefaultUnit {

        /**
         * Значение по тарифу T1
         * 
         */
        @XmlElement(name = "MeteringValueT1", required = true)
        protected String meteringValueT1;
        /**
         * Значение по тарифу T2
         * 
         */
        @XmlElement(name = "MeteringValueT2")
        protected String meteringValueT2;
        /**
         * Значение по тарифу T3
         * 
         */
        @XmlElement(name = "MeteringValueT3")
        protected String meteringValueT3;
        /**
         * Единица измерения коммунального ресурса по умолчанию
         * 
         */
        @XmlElement(name = "DefaultUnit", required = true)
        protected String defaultUnit;

        /**
         * Значение по тарифу T1
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeteringValueT1() {
            return meteringValueT1;
        }

        /**
         * Sets the value of the meteringValueT1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMeteringValueT1()
         */
        public void setMeteringValueT1(String value) {
            this.meteringValueT1 = value;
        }

        /**
         * Значение по тарифу T2
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeteringValueT2() {
            return meteringValueT2;
        }

        /**
         * Sets the value of the meteringValueT2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMeteringValueT2()
         */
        public void setMeteringValueT2(String value) {
            this.meteringValueT2 = value;
        }

        /**
         * Значение по тарифу T3
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeteringValueT3() {
            return meteringValueT3;
        }

        /**
         * Sets the value of the meteringValueT3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMeteringValueT3()
         */
        public void setMeteringValueT3(String value) {
            this.meteringValueT3 = value;
        }

        /**
         * Единица измерения коммунального ресурса по умолчанию
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultUnit() {
            return defaultUnit;
        }

        /**
         * Sets the value of the defaultUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDefaultUnit()
         */
        public void setDefaultUnit(String value) {
            this.defaultUnit = value;
        }

    }

}
