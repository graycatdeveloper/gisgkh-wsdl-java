
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformationType">
 *       <sequence>
 *         <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *         <element name="individualConsumptionNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "houseOverallNeedsNorm",
    "individualConsumptionNorm"
})
@XmlRootElement(name = "ServiceInformation")
public class ServiceInformation
    extends ServiceInformationType
{

    /**
     * Норматив потребления коммунальных ресурсов в целях использования и содержания общего имущества в многоквартирном доме
     * 
     */
    protected BigDecimal houseOverallNeedsNorm;
    /**
     * Норматив потребления коммунальных услуг
     * 
     */
    protected BigDecimal individualConsumptionNorm;

    /**
     * Норматив потребления коммунальных ресурсов в целях использования и содержания общего имущества в многоквартирном доме
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseOverallNeedsNorm() {
        return houseOverallNeedsNorm;
    }

    /**
     * Sets the value of the houseOverallNeedsNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHouseOverallNeedsNorm()
     */
    public void setHouseOverallNeedsNorm(BigDecimal value) {
        this.houseOverallNeedsNorm = value;
    }

    /**
     * Норматив потребления коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualConsumptionNorm() {
        return individualConsumptionNorm;
    }

    /**
     * Sets the value of the individualConsumptionNorm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIndividualConsumptionNorm()
     */
    public void setIndividualConsumptionNorm(BigDecimal value) {
        this.individualConsumptionNorm = value;
    }

}
