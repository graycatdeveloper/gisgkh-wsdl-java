
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapitalRepairMonthlyImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CapitalRepairMonthlyImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Contribution">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
 *               <totalDigits value="17"/>
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AccountingPeriodTotal" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
 *               <totalDigits value="17"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MoneyRecalculation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="17"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MoneyDiscount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <minInclusive value="0"/>
 *               <totalDigits value="17"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalPayable">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="17"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CalcExplanation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="2000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Penalties" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ServiceProviderPenalties" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="StateFees" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CourtCosts" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalPayableOverall" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
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
@XmlType(name = "CapitalRepairMonthlyImportType", propOrder = {
    "contribution",
    "accountingPeriodTotal",
    "moneyRecalculation",
    "moneyDiscount",
    "totalPayable",
    "calcExplanation",
    "debtPreviousPeriodsOrAdvanceBillingPeriod",
    "penalties",
    "serviceProviderPenalties",
    "stateFees",
    "courtCosts",
    "totalPayableOverall"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.CapitalRepairYearImportType.CapitalRepairMonthlyCharge.class,
    ru.gosuslugi.dom.schema.integration.bills.CapitalRepairYearExportType.CapitalRepairMonthlyCharge.class
})
public class CapitalRepairMonthlyImportType {

    /**
     * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "Contribution", required = true)
    protected BigDecimal contribution;
    /**
     * Начислено за расчетный период (без перерасчетов и льгот), руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "AccountingPeriodTotal")
    protected BigDecimal accountingPeriodTotal;
    /**
     * Перерасчеты всего, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "MoneyRecalculation")
    protected BigDecimal moneyRecalculation;
    /**
     * Льготы, субсидии, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "MoneyDiscount")
    protected BigDecimal moneyDiscount;
    /**
     * К оплате за расчетный период, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayable", required = true)
    protected BigDecimal totalPayable;
    /**
     * Порядок расчетов
     * 
     */
    @XmlElement(name = "CalcExplanation")
    protected String calcExplanation;
    /**
     * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "DebtPreviousPeriodsOrAdvanceBillingPeriod")
    protected BigDecimal debtPreviousPeriodsOrAdvanceBillingPeriod;
    /**
     * Неустойка (штраф, пеня).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "Penalties")
    protected BigDecimal penalties;
    /**
     * Штраф исполнителя работ (услуг).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "ServiceProviderPenalties")
    protected BigDecimal serviceProviderPenalties;
    /**
     * Государственные пошлины.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "StateFees")
    protected BigDecimal stateFees;
    /**
     * Судебные издержки.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "CourtCosts")
    protected BigDecimal courtCosts;
    /**
     * ИТОГО К ОПЛАТЕ (с учетом задолженности/аванса, неустоек и судебных расходов).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayableOverall")
    protected BigDecimal totalPayableOverall;

    /**
     * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContribution() {
        return contribution;
    }

    /**
     * Sets the value of the contribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getContribution()
     */
    public void setContribution(BigDecimal value) {
        this.contribution = value;
    }

    /**
     * Начислено за расчетный период (без перерасчетов и льгот), руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountingPeriodTotal() {
        return accountingPeriodTotal;
    }

    /**
     * Sets the value of the accountingPeriodTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAccountingPeriodTotal()
     */
    public void setAccountingPeriodTotal(BigDecimal value) {
        this.accountingPeriodTotal = value;
    }

    /**
     * Перерасчеты всего, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoneyRecalculation() {
        return moneyRecalculation;
    }

    /**
     * Sets the value of the moneyRecalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMoneyRecalculation()
     */
    public void setMoneyRecalculation(BigDecimal value) {
        this.moneyRecalculation = value;
    }

    /**
     * Льготы, субсидии, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoneyDiscount() {
        return moneyDiscount;
    }

    /**
     * Sets the value of the moneyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMoneyDiscount()
     */
    public void setMoneyDiscount(BigDecimal value) {
        this.moneyDiscount = value;
    }

    /**
     * К оплате за расчетный период, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
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
     * Порядок расчетов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcExplanation() {
        return calcExplanation;
    }

    /**
     * Sets the value of the calcExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCalcExplanation()
     */
    public void setCalcExplanation(String value) {
        this.calcExplanation = value;
    }

    /**
     * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtPreviousPeriodsOrAdvanceBillingPeriod() {
        return debtPreviousPeriodsOrAdvanceBillingPeriod;
    }

    /**
     * Sets the value of the debtPreviousPeriodsOrAdvanceBillingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDebtPreviousPeriodsOrAdvanceBillingPeriod()
     */
    public void setDebtPreviousPeriodsOrAdvanceBillingPeriod(BigDecimal value) {
        this.debtPreviousPeriodsOrAdvanceBillingPeriod = value;
    }

    /**
     * Неустойка (штраф, пеня).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenalties() {
        return penalties;
    }

    /**
     * Sets the value of the penalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPenalties()
     */
    public void setPenalties(BigDecimal value) {
        this.penalties = value;
    }

    /**
     * Штраф исполнителя работ (услуг).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceProviderPenalties() {
        return serviceProviderPenalties;
    }

    /**
     * Sets the value of the serviceProviderPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getServiceProviderPenalties()
     */
    public void setServiceProviderPenalties(BigDecimal value) {
        this.serviceProviderPenalties = value;
    }

    /**
     * Государственные пошлины.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStateFees() {
        return stateFees;
    }

    /**
     * Sets the value of the stateFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getStateFees()
     */
    public void setStateFees(BigDecimal value) {
        this.stateFees = value;
    }

    /**
     * Судебные издержки.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourtCosts() {
        return courtCosts;
    }

    /**
     * Sets the value of the courtCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCourtCosts()
     */
    public void setCourtCosts(BigDecimal value) {
        this.courtCosts = value;
    }

    /**
     * ИТОГО К ОПЛАТЕ (с учетом задолженности/аванса, неустоек и судебных расходов).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPayableOverall() {
        return totalPayableOverall;
    }

    /**
     * Sets the value of the totalPayableOverall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPayableOverall()
     */
    public void setTotalPayableOverall(BigDecimal value) {
        this.totalPayableOverall = value;
    }

}
