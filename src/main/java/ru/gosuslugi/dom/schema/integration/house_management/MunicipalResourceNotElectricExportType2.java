
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Данные однотарифного ПУ: коммунальный ресурс, последнее полученное показание в единицах измерения ПУ и (если отличается) в единицах измерения коммунального ресурса по умолчанию, источник данных о показаниях ПУ. Используется при экспорте данных ПУ
 * 
 * <p>Java class for MunicipalResourceNotElectricExportType2 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalResourceNotElectricExportType2">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}MunicipalResourceNotElectricBaseType">
 *       <sequence minOccurs="0">
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
 *         <element name="ReadingsSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orgPPAGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MunicipalResourceNotElectricExportType2", propOrder = {
    "meteringValueInDefaultUnit",
    "readingsSource",
    "orgPPAGUID"
})
public class MunicipalResourceNotElectricExportType2
    extends MunicipalResourceNotElectricBaseType
{

    /**
     * Значение показания ПУ, выраженное в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     */
    @XmlElement(name = "MeteringValueInDefaultUnit")
    protected MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit meteringValueInDefaultUnit;
    /**
     * Кем внесено
     * 
     */
    @XmlElement(name = "ReadingsSource")
    protected String readingsSource;
    /**
     * Идентификатор организации, которая ввела показания в Систему. Не заполняется, если показания были введены гражданином
     * 
     */
    protected String orgPPAGUID;

    /**
     * Значение показания ПУ, выраженное в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     * @return
     *     possible object is
     *     {@link MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit }
     *     
     */
    public MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit getMeteringValueInDefaultUnit() {
        return meteringValueInDefaultUnit;
    }

    /**
     * Sets the value of the meteringValueInDefaultUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit }
     *     
     * @see #getMeteringValueInDefaultUnit()
     */
    public void setMeteringValueInDefaultUnit(MunicipalResourceNotElectricExportType2 .MeteringValueInDefaultUnit value) {
        this.meteringValueInDefaultUnit = value;
    }

    /**
     * Кем внесено
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingsSource() {
        return readingsSource;
    }

    /**
     * Sets the value of the readingsSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReadingsSource()
     */
    public void setReadingsSource(String value) {
        this.readingsSource = value;
    }

    /**
     * Идентификатор организации, которая ввела показания в Систему. Не заполняется, если показания были введены гражданином
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
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
