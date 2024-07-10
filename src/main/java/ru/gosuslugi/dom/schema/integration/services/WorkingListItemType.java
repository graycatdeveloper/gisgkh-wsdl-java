
package ru.gosuslugi.dom.schema.integration.services;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Работа/услуга в перечне
 * 
 * <p>Java class for WorkingListItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkingListItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <element name="Price" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkPriceType" minOccurs="0"/>
 *             <element name="Amount" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkAmountType" minOccurs="0"/>
 *             <element name="Count" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkCountType" minOccurs="0"/>
 *             <element name="TotalCost" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkCostType" minOccurs="0"/>
 *           </sequence>
 *           <element name="Excluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="WorkItemNSI" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Index" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               <minInclusive value="1"/>
 *               <maxInclusive value="9999"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingListItemType", propOrder = {
    "price",
    "amount",
    "count",
    "totalCost",
    "excluded",
    "workItemNSI",
    "index"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.services.ImportWorkingListRequest.ApprovedWorkingListData.WorkListItem.class,
    ru.gosuslugi.dom.schema.integration.services.ExportWorkingListResultType.WorkingList.WorkListItem.class
})
public class WorkingListItemType {

    /**
     * Цена
     * 
     */
    @XmlElement(name = "Price")
    protected BigDecimal price;
    /**
     * Объём
     * 
     */
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    /**
     * Количество
     * 
     */
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer count;
    /**
     * Общая стоимость
     * 
     */
    @XmlElement(name = "TotalCost")
    protected BigDecimal totalCost;
    /**
     * Работа/Услуга исключена из перечня
     * 
     */
    @XmlElement(name = "Excluded")
    protected Boolean excluded;
    /**
     * Ссылка на работу/услугу организации (НСИ 59)
     * 
     */
    @XmlElement(name = "WorkItemNSI", required = true)
    protected NsiRef workItemNSI;
    /**
     * Номер строки в перечне работ и услуг
     * 
     */
    @XmlElement(name = "Index")
    protected Integer index;

    /**
     * Цена
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
     * Объём
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAmount()
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Количество
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getCount()
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Общая стоимость
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalCost()
     */
    public void setTotalCost(BigDecimal value) {
        this.totalCost = value;
    }

    /**
     * Работа/Услуга исключена из перечня
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExcluded()
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Ссылка на работу/услугу организации (НСИ 59)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getWorkItemNSI() {
        return workItemNSI;
    }

    /**
     * Sets the value of the workItemNSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getWorkItemNSI()
     */
    public void setWorkItemNSI(NsiRef value) {
        this.workItemNSI = value;
    }

    /**
     * Номер строки в перечне работ и услуг
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getIndex()
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

}
