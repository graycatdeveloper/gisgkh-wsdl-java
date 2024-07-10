
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.OneRateMeteringValueBaseType;


/**
 * Сведения о коммунальном ресурсе ПУ и последнее полученное показание (холодная вода, горячая вода, тепловая энергия, газ, сточные бытовые воды). Используется при создании / изменении ПУ для определения КР
 * 
 * <p>Java class for MunicipalResourceNotElectricBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalResourceNotElectricBaseType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}OneRateMeteringValueBaseType">
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
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MunicipalResourceNotElectricBaseType", propOrder = {
    "unit"
})
@XmlSeeAlso({
    MunicipalResourceNotElectricExportType2 .class
})
public class MunicipalResourceNotElectricBaseType
    extends OneRateMeteringValueBaseType
{

    /**
     * Код единицы измерения показаний ПУ (из расширенного классификатора ОКЕИ). Обязателен для заполнения, если ЕИ показаний ПУ отличается от ЕИ коммунального ресурса по умолчанию
     * 
     */
    @XmlElement(name = "Unit")
    protected String unit;

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

}
