
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Общий тип задолженности
 * 
 * <p>Java class for DebtType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DebtType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *           <element name="TotalPayable">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                 <totalDigits value="18"/>
 *                 <fractionDigits value="2"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <element name="TotalSumDebtPayable">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="18"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtType", propOrder = {
    "month",
    "year",
    "totalPayable",
    "orgPPAGUID",
    "totalSumDebtPayable"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.PaymentDocumentExportType.CapitalRepairDebt.class,
    ServiceDebtType.class
})
public class DebtType {

    /**
     * Месяц
     * 
     */
    @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Integer month;
    /**
     * Год
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Short year;
    /**
     * К оплате за расчетный период, руб.
     * 
     */
    @XmlElement(name = "TotalPayable")
    protected BigDecimal totalPayable;
    /**
     * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
     * 
     */
    protected String orgPPAGUID;
    /**
     * Итого к оплате за расчетный период платежного документа, руб.
     * 
     */
    @XmlElement(name = "TotalSumDebtPayable")
    protected BigDecimal totalSumDebtPayable;

    /**
     * Месяц
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getMonth()
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    /**
     * Год
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     * @see #getYear()
     */
    public void setYear(Short value) {
        this.year = value;
    }

    /**
     * К оплате за расчетный период, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPayable() {
        return totalPayable;
    }

    /**
     * Sets the value of the totalPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPayable()
     */
    public void setTotalPayable(BigDecimal value) {
        this.totalPayable = value;
    }

    /**
     * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
    }

    /**
     * Итого к оплате за расчетный период платежного документа, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSumDebtPayable() {
        return totalSumDebtPayable;
    }

    /**
     * Sets the value of the totalSumDebtPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalSumDebtPayable()
     */
    public void setTotalSumDebtPayable(BigDecimal value) {
        this.totalSumDebtPayable = value;
    }

}
