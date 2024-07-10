
package ru.gosuslugi.dom.schema.integration.metering_device_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Данные однотарифного ПУ: коммунальный ресурс, последнее полученное показание в единицах измерения ПУ, источник данных о показаниях ПУ, время внесения в Систему. Используется при экспорте показаний ПУ
 * 
 * <p>Java class for OneRateMeteringValueExportWithTSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OneRateMeteringValueExportWithTSType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueExportType">
 *       <sequence>
 *         <element name="EnterIntoSystem" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneRateMeteringValueExportWithTSType", propOrder = {
    "enterIntoSystem"
})
public class OneRateMeteringValueExportWithTSType
    extends OneRateMeteringValueExportType
{

    /**
     * Дата и время внесения в Систему
     * 
     */
    @XmlElement(name = "EnterIntoSystem", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enterIntoSystem;

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

}
