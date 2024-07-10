
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Потребление по услуге
 * 
 * <p>Java class for ServicePDImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServicePDImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Rate">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="6"/>
 *               <totalDigits value="14"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalPayable">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AccountingPeriodTotal" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CalcExplanation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="4000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
@XmlType(name = "ServicePDImportType", propOrder = {
    "serviceType",
    "rate",
    "totalPayable",
    "accountingPeriodTotal",
    "calcExplanation",
    "orgPPAGUID",
    "paymentInformationKey",
    "debtPreviousPeriodsOrAdvanceBillingPeriod",
    "penalties",
    "serviceProviderPenalties",
    "stateFees",
    "courtCosts",
    "totalPayableOverall"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.PDServiceChargeType.HousingService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceChargeType.AdditionalService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceChargeType.MunicipalService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceChargeType.GroupMunicipalService.MunicipalService.class
})
public class ServicePDImportType {

    /**
     * Код услуги из справочника:
     * - для ЖУ - НСИ 50 "Вид жилищной услуги";
     * - для вида КУ - НСИ 3 "Вид коммунальной услуги"; 
     * - для главной КУ - НСИ 51 "Главная коммунальная услуга" (справочник исполнителя);
     * - для ДУ - НСИ 1 "Вид дополнительной услуги" (справочник исполнителя).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected NsiRef serviceType;
    /**
     * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    /**
     * К оплате за расчетный период, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayable", required = true)
    protected BigDecimal totalPayable;
    /**
     * Начислено за расчетный период (без перерасчетов и льгот), руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "AccountingPeriodTotal")
    protected BigDecimal accountingPeriodTotal;
    /**
     * Порядок расчетов
     * 
     */
    @XmlElement(name = "CalcExplanation")
    protected String calcExplanation;
    /**
     * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
     * 
     */
    protected String orgPPAGUID;
    /**
     * Ссылка на платежные реквизиты
     * 
     */
    @XmlElement(name = "PaymentInformationKey")
    protected String paymentInformationKey;
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
     * Код услуги из справочника:
     * - для ЖУ - НСИ 50 "Вид жилищной услуги";
     * - для вида КУ - НСИ 3 "Вид коммунальной услуги"; 
     * - для главной КУ - НСИ 51 "Главная коммунальная услуга" (справочник исполнителя);
     * - для ДУ - НСИ 1 "Вид дополнительной услуги" (справочник исполнителя).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(NsiRef value) {
        this.serviceType = value;
    }

    /**
     * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRate()
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
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
     * Ссылка на платежные реквизиты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationKey() {
        return paymentInformationKey;
    }

    /**
     * Sets the value of the paymentInformationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentInformationKey()
     */
    public void setPaymentInformationKey(String value) {
        this.paymentInformationKey = value;
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
