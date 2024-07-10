
package ru.gosuslugi.dom.schema.integration.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Базовый тип выполненной работы
 * 
 * <p>Java class for CompletedWorkType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CompletedWorkType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="photos" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MonthlyWork" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkType" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="ActTransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </choice>
 *         <element name="Price" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkPriceType" minOccurs="0"/>
 *         <element name="Amount" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkAmountType" minOccurs="0"/>
 *         <element name="TotalCost" type="{http://dom.gosuslugi.ru/schema/integration/services/}WorkCostType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletedWorkType", propOrder = {
    "photos",
    "monthlyWork",
    "actTransportGUID",
    "actGUID",
    "price",
    "amount",
    "totalCost"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.services.CompletedWorksByPeriodType.PlannedWork.class,
    ru.gosuslugi.dom.schema.integration.services.CompletedWorksByPeriodType.UnplannedWork.class
})
public class CompletedWorkType {

    /**
     * Фото выполненной работы/услуги
     * 
     */
    protected List<AttachmentType> photos;
    /**
     * Количество выполненных работ (если не было указано в плане или изменилось)
     * 
     */
    @XmlElement(name = "MonthlyWork")
    protected MonthlyWorkType monthlyWork;
    /**
     * Описание работы в новом приложенном акте
     * 
     */
    @XmlElement(name = "ActTransportGUID")
    protected String actTransportGUID;
    /**
     * Описание работы в ранее загруженном акте
     * 
     */
    @XmlElement(name = "ActGUID")
    protected String actGUID;
    /**
     * Фактическая цена (если не была указана в плане или изменилась).
     * 
     */
    @XmlElement(name = "Price")
    protected BigDecimal price;
    /**
     * Фактический объём (если не был указан в плане или изменился)
     * 
     */
    @XmlElement(name = "Amount")
    protected BigDecimal amount;
    /**
     * Фактическая стоимость выполненных работ (если не была указана в плане или изменилась)
     * 
     */
    @XmlElement(name = "TotalCost")
    protected BigDecimal totalCost;

    /**
     * Фото выполненной работы/услуги
     * 
     * Gets the value of the photos property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the photos property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPhotos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the photos property.
     */
    public List<AttachmentType> getPhotos() {
        if (photos == null) {
            photos = new ArrayList<>();
        }
        return this.photos;
    }

    /**
     * Количество выполненных работ (если не было указано в плане или изменилось)
     * 
     * @return
     *     possible object is
     *     {@link MonthlyWorkType }
     *     
     */
    public MonthlyWorkType getMonthlyWork() {
        return monthlyWork;
    }

    /**
     * Sets the value of the monthlyWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthlyWorkType }
     *     
     * @see #getMonthlyWork()
     */
    public void setMonthlyWork(MonthlyWorkType value) {
        this.monthlyWork = value;
    }

    /**
     * Описание работы в новом приложенном акте
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActTransportGUID() {
        return actTransportGUID;
    }

    /**
     * Sets the value of the actTransportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActTransportGUID()
     */
    public void setActTransportGUID(String value) {
        this.actTransportGUID = value;
    }

    /**
     * Описание работы в ранее загруженном акте
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActGUID() {
        return actGUID;
    }

    /**
     * Sets the value of the actGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getActGUID()
     */
    public void setActGUID(String value) {
        this.actGUID = value;
    }

    /**
     * Фактическая цена (если не была указана в плане или изменилась).
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
     * Фактический объём (если не был указан в плане или изменился)
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
     * Фактическая стоимость выполненных работ (если не была указана в плане или изменилась)
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

}
