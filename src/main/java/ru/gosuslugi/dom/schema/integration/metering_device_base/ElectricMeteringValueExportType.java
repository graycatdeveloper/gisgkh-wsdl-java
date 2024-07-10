
package ru.gosuslugi.dom.schema.integration.metering_device_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Данные многотарифного ПУ: коммунальный ресурс, последние полученные показания в единицах измерения ПУ, источник данных о показаниях ПУ. Используется при экспорте данных ПУ
 * 
 * <p>Java class for ElectricMeteringValueExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ElectricMeteringValueExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType">
 *       <sequence minOccurs="0">
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
@XmlType(name = "ElectricMeteringValueExportType", propOrder = {
    "readingsSource",
    "orgPPAGUID"
})
@XmlSeeAlso({
    ElectricMeteringValueExportWithTSType.class
})
public class ElectricMeteringValueExportType
    extends ElectricMeteringValueBaseType
{

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

}
