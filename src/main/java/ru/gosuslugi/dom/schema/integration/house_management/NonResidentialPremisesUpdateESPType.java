
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Нежилое помещение (обновление данных для ЕСП)
 * 
 * <p>Java class for NonResidentialPremisesUpdateESPType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NonResidentialPremisesUpdateESPType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesBasicUpdateESPType">
 *       <sequence>
 *         <element name="FIASChildHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="TotalArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="IsCommonProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonResidentialPremisesUpdateESPType", propOrder = {
    "fiasChildHouseGuid",
    "totalArea",
    "isCommonProperty"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate.class
})
public class NonResidentialPremisesUpdateESPType
    extends PremisesBasicUpdateESPType
{

    /**
     * ГУИД дочернего дома по ФИАС, к которому относится подъезд для группирующих домов
     * 
     */
    @XmlElement(name = "FIASChildHouseGuid")
    protected String fiasChildHouseGuid;
    /**
     * Общая площадь нежилого помещения по паспорту помещения
     * 
     */
    @XmlElement(name = "TotalArea")
    protected BigDecimal totalArea;
    /**
     * Помещение, составляющее общее имущество в многоквартирном доме
     * 
     */
    @XmlElement(name = "IsCommonProperty")
    protected Boolean isCommonProperty;

    /**
     * ГУИД дочернего дома по ФИАС, к которому относится подъезд для группирующих домов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASChildHouseGuid() {
        return fiasChildHouseGuid;
    }

    /**
     * Sets the value of the fiasChildHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASChildHouseGuid()
     */
    public void setFIASChildHouseGuid(String value) {
        this.fiasChildHouseGuid = value;
    }

    /**
     * Общая площадь нежилого помещения по паспорту помещения
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalArea()
     */
    public void setTotalArea(BigDecimal value) {
        this.totalArea = value;
    }

    /**
     * Помещение, составляющее общее имущество в многоквартирном доме
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommonProperty() {
        return isCommonProperty;
    }

    /**
     * Sets the value of the isCommonProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsCommonProperty()
     */
    public void setIsCommonProperty(Boolean value) {
        this.isCommonProperty = value;
    }

}
