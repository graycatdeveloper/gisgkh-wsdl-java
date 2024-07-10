
package ru.gosuslugi.dom.schema.integration.tariff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Дифференцированная цена тарифа на оплату коммунальных ресурсов
 * 
 * <p>Java class for MunicipalResourceTariffPriceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalResourceTariffPriceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PriceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="TariffStructure" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Description" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type"/>
 *         <element name="Price" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}PriceType"/>
 *         <element name="Unit" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKEIType"/>
 *         <choice>
 *           <element name="DifferentiationNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Differentiation" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}DifferentiationType" maxOccurs="1000"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MunicipalResourceTariffPriceType", propOrder = {
    "priceGUID",
    "tariffStructure",
    "description",
    "price",
    "unit",
    "differentiationNotSet",
    "differentiation"
})
public class MunicipalResourceTariffPriceType {

    /**
     * Идентификатор дифференцированной цены тарифа (заполняется только при изменении ранее добавленной цены)
     * 
     */
    @XmlElement(name = "PriceGUID")
    protected String priceGUID;
    /**
     * НСИ 262 (Состав тарифа) - компонент/ставка
     * 
     */
    @XmlElement(name = "TariffStructure", required = true)
    protected NsiRef tariffStructure;
    /**
     * Описание
     * 
     */
    @XmlElement(name = "Description", required = true)
    protected String description;
    /**
     * Величина тарифа (ставки тарифа)
     * 
     */
    @XmlElement(name = "Price", required = true)
    protected BigDecimal price;
    /**
     * Единицы измерения (руб./единицу измерения)
     * 
     */
    @XmlElement(name = "Unit", required = true)
    protected String unit;
    /**
     * Критерии дифференциации не установлены
     * 
     */
    @XmlElement(name = "DifferentiationNotSet")
    protected Boolean differentiationNotSet;
    /**
     * Критерии дифференциации
     * 
     */
    @XmlElement(name = "Differentiation")
    protected List<DifferentiationType> differentiation;

    /**
     * Идентификатор дифференцированной цены тарифа (заполняется только при изменении ранее добавленной цены)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceGUID() {
        return priceGUID;
    }

    /**
     * Sets the value of the priceGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPriceGUID()
     */
    public void setPriceGUID(String value) {
        this.priceGUID = value;
    }

    /**
     * НСИ 262 (Состав тарифа) - компонент/ставка
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getTariffStructure() {
        return tariffStructure;
    }

    /**
     * Sets the value of the tariffStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getTariffStructure()
     */
    public void setTariffStructure(NsiRef value) {
        this.tariffStructure = value;
    }

    /**
     * Описание
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Величина тарифа (ставки тарифа)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPrice()
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Единицы измерения (руб./единицу измерения)
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
     * Критерии дифференциации не установлены
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDifferentiationNotSet() {
        return differentiationNotSet;
    }

    /**
     * Sets the value of the differentiationNotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDifferentiationNotSet()
     */
    public void setDifferentiationNotSet(Boolean value) {
        this.differentiationNotSet = value;
    }

    /**
     * Критерии дифференциации
     * 
     * Gets the value of the differentiation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the differentiation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDifferentiation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DifferentiationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the differentiation property.
     */
    public List<DifferentiationType> getDifferentiation() {
        if (differentiation == null) {
            differentiation = new ArrayList<>();
        }
        return this.differentiation;
    }

}
