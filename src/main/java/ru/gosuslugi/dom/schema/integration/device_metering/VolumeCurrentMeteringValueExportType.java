
package ru.gosuslugi.dom.schema.integration.device_metering;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Данные текущих показаний ПУ, измеряющего объем потребляемого коммунального ресурса: расширяет базовый тип датой снятия показаний. Используется при экспорте текущих и контрольных показаний
 * 
 * <p>Java class for VolumeCurrentMeteringValueExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeCurrentMeteringValueExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/device-metering/}VolumeMeteringValueExportBaseType">
 *       <sequence>
 *         <element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCurrentMeteringValueExportType", propOrder = {
    "dateValue"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.device_metering.VolumeMeteringValueExportType.CurrentValue.class
})
public class VolumeCurrentMeteringValueExportType
    extends VolumeMeteringValueExportBaseType
{

    /**
     * Дата снятия показания
     * 
     */
    @XmlElement(name = "DateValue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateValue;

    /**
     * Дата снятия показания
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateValue()
     */
    public void setDateValue(XMLGregorianCalendar value) {
        this.dateValue = value;
    }

}
