
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Справочная информация
 * 
 * <p>Java class for ServiceInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="individualConsumptionCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePD2Type" minOccurs="0"/>
 *         <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePD2Type" minOccurs="0"/>
 *         <element name="houseTotalIndividualConsumption" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePD2Type" minOccurs="0"/>
 *         <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePD2Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInformationType", propOrder = {
    "individualConsumptionCurrentValue",
    "houseOverallNeedsCurrentValue",
    "houseTotalIndividualConsumption",
    "houseTotalHouseOverallNeeds"
})
@XmlSeeAlso({
    ServiceInformation.class
})
public class ServiceInformationType {

    /**
     * Текущие показания приборов учёта
     * коммунальных ресурсов - индивидуальных (квартирных)
     * 
     */
    protected BigDecimal individualConsumptionCurrentValue;
    /**
     * Текущие показания приборов учёта
     * коммунальных ресурсов - коллективных (общедомовых)
     * 
     */
    protected BigDecimal houseOverallNeedsCurrentValue;
    /**
     * Суммарный объём коммунальных ресурсов в многоквартирном доме - в помещениях дома
     * 
     */
    protected BigDecimal houseTotalIndividualConsumption;
    /**
     * Суммарный объём коммунальных ресурсов в многоквартирном доме - в целях содержания общего имущества в многоквартирном доме
     * 
     */
    protected BigDecimal houseTotalHouseOverallNeeds;

    /**
     * Текущие показания приборов учёта
     * коммунальных ресурсов - индивидуальных (квартирных)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndividualConsumptionCurrentValue() {
        return individualConsumptionCurrentValue;
    }

    /**
     * Sets the value of the individualConsumptionCurrentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIndividualConsumptionCurrentValue()
     */
    public void setIndividualConsumptionCurrentValue(BigDecimal value) {
        this.individualConsumptionCurrentValue = value;
    }

    /**
     * Текущие показания приборов учёта
     * коммунальных ресурсов - коллективных (общедомовых)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseOverallNeedsCurrentValue() {
        return houseOverallNeedsCurrentValue;
    }

    /**
     * Sets the value of the houseOverallNeedsCurrentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHouseOverallNeedsCurrentValue()
     */
    public void setHouseOverallNeedsCurrentValue(BigDecimal value) {
        this.houseOverallNeedsCurrentValue = value;
    }

    /**
     * Суммарный объём коммунальных ресурсов в многоквартирном доме - в помещениях дома
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseTotalIndividualConsumption() {
        return houseTotalIndividualConsumption;
    }

    /**
     * Sets the value of the houseTotalIndividualConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHouseTotalIndividualConsumption()
     */
    public void setHouseTotalIndividualConsumption(BigDecimal value) {
        this.houseTotalIndividualConsumption = value;
    }

    /**
     * Суммарный объём коммунальных ресурсов в многоквартирном доме - в целях содержания общего имущества в многоквартирном доме
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseTotalHouseOverallNeeds() {
        return houseTotalHouseOverallNeeds;
    }

    /**
     * Sets the value of the houseTotalHouseOverallNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHouseTotalHouseOverallNeeds()
     */
    public void setHouseTotalHouseOverallNeeds(BigDecimal value) {
        this.houseTotalHouseOverallNeeds = value;
    }

}
