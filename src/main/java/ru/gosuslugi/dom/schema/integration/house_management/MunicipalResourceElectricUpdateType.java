
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.metering_device_base.ElectricMeteringValueBaseType;


/**
 * Последние полученные показания (электрическая энергия) и изменяемые сведения о ПУ (коэфф. трансформации). В зависимости от количества показаний, заданных при создании ПУ, определяется его вид по количеству тарифов.
 * 
 * <p>Java class for MunicipalResourceElectricUpdateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalResourceElectricUpdateType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}ElectricMeteringValueBaseType">
 *       <sequence minOccurs="0">
 *         <element name="TransformationRatio" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="4"/>
 *               <minExclusive value="0"/>
 *               <maxInclusive value="9999999999.9999"/>
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
@XmlType(name = "MunicipalResourceElectricUpdateType", propOrder = {
    "transformationRatio"
})
public class MunicipalResourceElectricUpdateType
    extends ElectricMeteringValueBaseType
{

    /**
     * Коэффициент трансформации
     * 
     */
    @XmlElement(name = "TransformationRatio")
    protected BigDecimal transformationRatio;

    /**
     * Коэффициент трансформации
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransformationRatio() {
        return transformationRatio;
    }

    /**
     * Sets the value of the transformationRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTransformationRatio()
     */
    public void setTransformationRatio(BigDecimal value) {
        this.transformationRatio = value;
    }

}
