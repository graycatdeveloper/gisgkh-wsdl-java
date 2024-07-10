
package ru.gosuslugi.dom.schema.integration.device_metering;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.OneRateMeteringValueBaseType;


/**
 * Показание однотарифного ПУ. Используется при импорте текущих и контрольных показаний ПУ
 * 
 * <p>Java class for OneRateMeteringValueImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OneRateMeteringValueImportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType">
 *       <sequence>
 *         <element name="DateValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "OneRateMeteringValueImportType", propOrder = {
    "dateValue",
    "transportGUID"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.device_metering.ImportMeteringDeviceValuesRequest.MeteringDevicesValues.OneRateDeviceValue.CurrentValue.class
})
public class OneRateMeteringValueImportType
    extends OneRateMeteringValueBaseType
{

    /**
     * Дата снятия показания
     * 
     */
    @XmlElement(name = "DateValue", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValue;
    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;

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

}
