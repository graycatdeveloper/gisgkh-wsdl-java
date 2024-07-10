
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.OneRateMeteringValueExportType;


/**
 * Сведения о коммунальном ресурсе ПУ и последнее полученное показание (холодная вода, горячая вода, тепловая энергия, газ, сточные бытовые воды). Используется при создании / изменении ПУ для определения КР
 * 
 * <p>Java class for MunicipalResourceNotElectricExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalResourceNotElectricExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueExportType">
 *       <sequence minOccurs="0">
 *         <element name="Unit" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="112"/>
 *               <enumeration value="113"/>
 *               <enumeration value="233"/>
 *               <enumeration value="245"/>
 *               <enumeration value="246"/>
 *               <enumeration value="271"/>
 *               <enumeration value="A056"/>
 *               <enumeration value="A058"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MeteringValueInDefaultUnit" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="MeteringValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType"/>
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
@XmlType(name = "MunicipalResourceNotElectricExportType", propOrder = {
    "unit",
    "meteringValueInDefaultUnit"
})
public class MunicipalResourceNotElectricExportType
    extends OneRateMeteringValueExportType
{

    /**
     * Код единицы измерения показаний ПУ (из расширенного классификатора ОКЕИ). Обязателен для заполнения, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
     * 
     */
    @XmlElement(name = "Unit")
    protected String unit;
    /**
     * Значение показания ПУ, выраженное в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     */
    @XmlElement(name = "MeteringValueInDefaultUnit")
    protected MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit meteringValueInDefaultUnit;

    /**
     * Код единицы измерения показаний ПУ (из расширенного классификатора ОКЕИ). Обязателен для заполнения, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
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
     * Значение показания ПУ, выраженное в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     * @return
     *     possible object is
     *     {@link MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit }
     *     
     */
    public MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit getMeteringValueInDefaultUnit() {
        return meteringValueInDefaultUnit;
    }

    /**
     * Sets the value of the meteringValueInDefaultUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit }
     *     
     * @see #getMeteringValueInDefaultUnit()
     */
    public void setMeteringValueInDefaultUnit(MunicipalResourceNotElectricExportType.MeteringValueInDefaultUnit value) {
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
     *         <element name="MeteringValue" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringValueType"/>
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
        "meteringValue",
        "defaultUnit"
    })
    public static class MeteringValueInDefaultUnit {

        /**
         * Значение
         * 
         */
        @XmlElement(name = "MeteringValue", required = true)
        protected String meteringValue;
        /**
         * Единица измерения коммунального ресурса по умолчанию
         * 
         */
        @XmlElement(name = "DefaultUnit", required = true)
        protected String defaultUnit;

        /**
         * Значение
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeteringValue() {
            return meteringValue;
        }

        /**
         * Sets the value of the meteringValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMeteringValue()
         */
        public void setMeteringValue(String value) {
            this.meteringValue = value;
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
