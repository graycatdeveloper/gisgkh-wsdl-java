
package ru.gosuslugi.dom.schema.integration.device_metering;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.VolumeMeteringValueBaseType;


/**
 * Данные текущих показаний ПУ, измеряющего объем потребляемого коммунального ресурса: коммунальный ресурс, значение показания в единицах измерения ПУ и (если отличается) в единицах измерения коммунального ресурса по умолчанию, источник данных о показаниях ПУ. Используется при экспорте показаний на начало / окончание поверки
 * 
 * <p>Java class for VolumeMeteringValueExportBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeMeteringValueExportBaseType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}VolumeMeteringValueBaseType">
 *       <sequence minOccurs="0">
 *         <element name="ReadingsSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="orgPPAGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EnterIntoSystem" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "VolumeMeteringValueExportBaseType", propOrder = {
    "readingsSource",
    "orgPPAGUID",
    "enterIntoSystem",
    "unit",
    "meteringValueInDefaultUnit"
})
@XmlSeeAlso({
    VolumeCurrentMeteringValueExportType.class
})
public class VolumeMeteringValueExportBaseType
    extends VolumeMeteringValueBaseType
{

    /**
     * Кем внесено
     * 
     */
    @XmlElement(name = "ReadingsSource")
    protected String readingsSource;
    /**
     * Идентификатор организации, которая ввела данные в Систему. Не заполняется, если данные были введены гражданином
     * 
     */
    protected String orgPPAGUID;
    /**
     * Дата и время внесения в Систему
     * 
     */
    @XmlElement(name = "EnterIntoSystem")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enterIntoSystem;
    /**
     * Код единицы измерения объемов потребления (из расширенного классификатора ОКЕИ). Заполняется, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
     * 
     */
    @XmlElement(name = "Unit")
    protected String unit;
    /**
     * Значения объемов потребления ПУ, выраженные в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     */
    @XmlElement(name = "MeteringValueInDefaultUnit")
    protected VolumeMeteringValueExportBaseType.MeteringValueInDefaultUnit meteringValueInDefaultUnit;

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
     * Идентификатор организации, которая ввела данные в Систему. Не заполняется, если данные были введены гражданином
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
     * Дата и время внесения в Систему
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnterIntoSystem() {
        return enterIntoSystem;
    }

    /**
     * Sets the value of the enterIntoSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEnterIntoSystem()
     */
    public void setEnterIntoSystem(XMLGregorianCalendar value) {
        this.enterIntoSystem = value;
    }

    /**
     * Код единицы измерения объемов потребления (из расширенного классификатора ОКЕИ). Заполняется, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
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
     * Значения объемов потребления ПУ, выраженные в единицах измерения коммунального ресурса по умолчанию. Заполняется, если ЕИ показаний ПУ отличается от ЕИ КР по умолчанию
     * 
     * @return
     *     possible object is
     *     {@link VolumeMeteringValueExportBaseType.MeteringValueInDefaultUnit }
     *     
     */
    public VolumeMeteringValueExportBaseType.MeteringValueInDefaultUnit getMeteringValueInDefaultUnit() {
        return meteringValueInDefaultUnit;
    }

    /**
     * Sets the value of the meteringValueInDefaultUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeteringValueExportBaseType.MeteringValueInDefaultUnit }
     *     
     * @see #getMeteringValueInDefaultUnit()
     */
    public void setMeteringValueInDefaultUnit(VolumeMeteringValueExportBaseType.MeteringValueInDefaultUnit value) {
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
