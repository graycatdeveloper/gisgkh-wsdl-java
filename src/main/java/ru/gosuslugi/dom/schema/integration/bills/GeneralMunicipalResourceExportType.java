
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for GeneralMunicipalResourceExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GeneralMunicipalResourceExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Consumption" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Volume">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                           <attribute name="type">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <enumeration value="O"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                           <attribute name="determiningMethod">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <length value="1"/>
 *                                 <enumeration value="N"/>
 *                                 <enumeration value="M"/>
 *                                 <enumeration value="O"/>
 *                               </restriction>
 *                             </simpleType>
 *                           </attribute>
 *                         </extension>
 *                       </simpleContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Rate">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="6"/>
 *               <totalDigits value="14"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AmountOfPaymentMunicipalServiceCommunalConsumption" minOccurs="0">
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
 *         <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeImportType" minOccurs="0"/>
 *         <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ServiceInformation" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *                   <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *                   <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PaymentRecalculation" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="recalculationReason">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="500"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="sum">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <fractionDigits value="2"/>
 *                         <minInclusive value="-9999999999.99"/>
 *                         <maxInclusive value="9999999999.99"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TotalPayable" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
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
 *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMunicipalResourceExportType", propOrder = {
    "serviceType",
    "consumption",
    "rate",
    "amountOfPaymentMunicipalServiceCommunalConsumption",
    "accountingPeriodTotal",
    "serviceCharge",
    "municipalServiceCommunalConsumptionPayable",
    "serviceInformation",
    "paymentRecalculation",
    "totalPayable",
    "debtPreviousPeriodsOrAdvanceBillingPeriod",
    "penalties",
    "serviceProviderPenalties",
    "stateFees",
    "courtCosts",
    "totalPayableOverall",
    "orgPPAGUID"
})
public class GeneralMunicipalResourceExportType {

    /**
     * Код главного коммунального ресурса из справочника НСИ 337 "Главный коммунальный ресурс".
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected NsiRef serviceType;
    /**
     * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "Consumption")
    protected GeneralMunicipalResourceExportType.Consumption consumption;
    /**
     * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;
    /**
     * Размер платы за коммунальные услуги, общедомовые нужды.
     * Ссылка на пост. 924 – Приложение 2, п. 18
     * 
     */
    @XmlElement(name = "AmountOfPaymentMunicipalServiceCommunalConsumption")
    protected BigDecimal amountOfPaymentMunicipalServiceCommunalConsumption;
    /**
     * Начислено за расчетный период, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "AccountingPeriodTotal")
    protected BigDecimal accountingPeriodTotal;
    /**
     * Перерасчеты, льготы, субсидии
     * 
     */
    @XmlElement(name = "ServiceCharge")
    protected ServiceChargeImportType serviceCharge;
    /**
     * К оплате за коммунальный ресурс потребления при содержании общего имущества, руб. 
     * Ссылка на пост. 924 – Приложение 2, п. 19
     * 
     */
    @XmlElement(name = "MunicipalServiceCommunalConsumptionPayable")
    protected BigDecimal municipalServiceCommunalConsumptionPayable;
    /**
     * Справочная информация.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
     * 
     */
    @XmlElement(name = "ServiceInformation")
    protected GeneralMunicipalResourceExportType.ServiceInformation serviceInformation;
    /**
     * Сведения о перерасчетах (доначислении +, уменьшении -).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД.
     * 
     */
    @XmlElement(name = "PaymentRecalculation")
    protected GeneralMunicipalResourceExportType.PaymentRecalculation paymentRecalculation;
    /**
     * К оплате за расчетный период, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayable")
    protected BigDecimal totalPayable;
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
     * ИТОГО К ОПЛАТЕ (с учетом задолженности/аванса, неустоек и судебных расходов). Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayableOverall")
    protected BigDecimal totalPayableOverall;
    /**
     * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
     * 
     */
    protected String orgPPAGUID;

    /**
     * Код главного коммунального ресурса из справочника НСИ 337 "Главный коммунальный ресурс".
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
     * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link GeneralMunicipalResourceExportType.Consumption }
     *     
     */
    public GeneralMunicipalResourceExportType.Consumption getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMunicipalResourceExportType.Consumption }
     *     
     * @see #getConsumption()
     */
    public void setConsumption(GeneralMunicipalResourceExportType.Consumption value) {
        this.consumption = value;
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
     * Размер платы за коммунальные услуги, общедомовые нужды.
     * Ссылка на пост. 924 – Приложение 2, п. 18
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOfPaymentMunicipalServiceCommunalConsumption() {
        return amountOfPaymentMunicipalServiceCommunalConsumption;
    }

    /**
     * Sets the value of the amountOfPaymentMunicipalServiceCommunalConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAmountOfPaymentMunicipalServiceCommunalConsumption()
     */
    public void setAmountOfPaymentMunicipalServiceCommunalConsumption(BigDecimal value) {
        this.amountOfPaymentMunicipalServiceCommunalConsumption = value;
    }

    /**
     * Начислено за расчетный период, руб.
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
     * Перерасчеты, льготы, субсидии
     * 
     * @return
     *     possible object is
     *     {@link ServiceChargeImportType }
     *     
     */
    public ServiceChargeImportType getServiceCharge() {
        return serviceCharge;
    }

    /**
     * Sets the value of the serviceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceChargeImportType }
     *     
     * @see #getServiceCharge()
     */
    public void setServiceCharge(ServiceChargeImportType value) {
        this.serviceCharge = value;
    }

    /**
     * К оплате за коммунальный ресурс потребления при содержании общего имущества, руб. 
     * Ссылка на пост. 924 – Приложение 2, п. 19
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMunicipalServiceCommunalConsumptionPayable() {
        return municipalServiceCommunalConsumptionPayable;
    }

    /**
     * Sets the value of the municipalServiceCommunalConsumptionPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMunicipalServiceCommunalConsumptionPayable()
     */
    public void setMunicipalServiceCommunalConsumptionPayable(BigDecimal value) {
        this.municipalServiceCommunalConsumptionPayable = value;
    }

    /**
     * Справочная информация.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link GeneralMunicipalResourceExportType.ServiceInformation }
     *     
     */
    public GeneralMunicipalResourceExportType.ServiceInformation getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMunicipalResourceExportType.ServiceInformation }
     *     
     * @see #getServiceInformation()
     */
    public void setServiceInformation(GeneralMunicipalResourceExportType.ServiceInformation value) {
        this.serviceInformation = value;
    }

    /**
     * Сведения о перерасчетах (доначислении +, уменьшении -).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMunicipalResourceExportType.PaymentRecalculation }
     *     
     */
    public GeneralMunicipalResourceExportType.PaymentRecalculation getPaymentRecalculation() {
        return paymentRecalculation;
    }

    /**
     * Sets the value of the paymentRecalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMunicipalResourceExportType.PaymentRecalculation }
     *     
     * @see #getPaymentRecalculation()
     */
    public void setPaymentRecalculation(GeneralMunicipalResourceExportType.PaymentRecalculation value) {
        this.paymentRecalculation = value;
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
     * ИТОГО К ОПЛАТЕ (с учетом задолженности/аванса, неустоек и судебных расходов). Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Volume">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
     *                 <attribute name="type">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <enumeration value="O"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *                 <attribute name="determiningMethod">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <length value="1"/>
     *                       <enumeration value="N"/>
     *                       <enumeration value="M"/>
     *                       <enumeration value="O"/>
     *                     </restriction>
     *                   </simpleType>
     *                 </attribute>
     *               </extension>
     *             </simpleContent>
     *           </complexType>
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
    @XmlType(name = "", propOrder = {
        "volume"
    })
    public static class Consumption {

        /**
         * Объем
         * 
         */
        @XmlElement(name = "Volume", required = true)
        protected GeneralMunicipalResourceExportType.Consumption.Volume volume;

        /**
         * Объем
         * 
         * @return
         *     possible object is
         *     {@link GeneralMunicipalResourceExportType.Consumption.Volume }
         *     
         */
        public GeneralMunicipalResourceExportType.Consumption.Volume getVolume() {
            return volume;
        }

        /**
         * Sets the value of the volume property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeneralMunicipalResourceExportType.Consumption.Volume }
         *     
         * @see #getVolume()
         */
        public void setVolume(GeneralMunicipalResourceExportType.Consumption.Volume value) {
            this.volume = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <simpleContent>
         *     <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
         *       <attribute name="type">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <enumeration value="O"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *       <attribute name="determiningMethod">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <length value="1"/>
         *             <enumeration value="N"/>
         *             <enumeration value="M"/>
         *             <enumeration value="O"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *     </extension>
         *   </simpleContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Volume {

            /**
             * Тип объема потребления КУ
             * 
             */
            @XmlValue
            protected BigDecimal value;
            /**
             * Тип:
             * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
             * 
             */
            @XmlAttribute(name = "type")
            protected String type;
            /**
             * Способ определения объемов КУ:
             * (N)orm - Норматив
             * (M)etering device - Прибор учета
             * (O)ther - Иное
             * 
             */
            @XmlAttribute(name = "determiningMethod")
            protected String determiningMethod;

            /**
             * Тип объема потребления КУ
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getValue()
             */
            public void setValue(BigDecimal value) {
                this.value = value;
            }

            /**
             * Тип:
             * house(O)verallNeeds - объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getType()
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Способ определения объемов КУ:
             * (N)orm - Норматив
             * (M)etering device - Прибор учета
             * (O)ther - Иное
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeterminingMethod() {
                return determiningMethod;
            }

            /**
             * Sets the value of the determiningMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDeterminingMethod()
             */
            public void setDeterminingMethod(String value) {
                this.determiningMethod = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="recalculationReason">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="500"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="sum">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <fractionDigits value="2"/>
     *               <minInclusive value="-9999999999.99"/>
     *               <maxInclusive value="9999999999.99"/>
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
    @XmlType(name = "", propOrder = {
        "recalculationReason",
        "sum"
    })
    public static class PaymentRecalculation {

        /**
         * Основания перерасчётов
         * 
         */
        @XmlElement(required = true)
        protected String recalculationReason;
        /**
         * Сумма
         * 
         */
        @XmlElement(required = true)
        protected BigDecimal sum;

        /**
         * Основания перерасчётов
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecalculationReason() {
            return recalculationReason;
        }

        /**
         * Sets the value of the recalculationReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRecalculationReason()
         */
        public void setRecalculationReason(String value) {
            this.recalculationReason = value;
        }

        /**
         * Сумма
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getSum()
         */
        public void setSum(BigDecimal value) {
            this.sum = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="houseOverallNeedsNorm" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
     *         <element name="houseOverallNeedsCurrentValue" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
     *         <element name="houseTotalHouseOverallNeeds" type="{http://dom.gosuslugi.ru/schema/integration/bills/}VolumePDType" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "houseOverallNeedsNorm",
        "houseOverallNeedsCurrentValue",
        "houseTotalHouseOverallNeeds"
    })
    public static class ServiceInformation {

        /**
         * Норматив потребления коммунальных ресурсов в целях использования и содержания общего имущества в многоквартирном доме.
         * 
         */
        protected BigDecimal houseOverallNeedsNorm;
        /**
         * Текущие показания приборов учёта
         * коммунальных ресурсов - коллективных (общедомовых).
         * 
         */
        protected BigDecimal houseOverallNeedsCurrentValue;
        /**
         * Суммарный объём коммунальных ресурсов в многоквартирном доме - в целях содержания общего имущества в многоквартирном доме.
         * 
         */
        protected BigDecimal houseTotalHouseOverallNeeds;

        /**
         * Норматив потребления коммунальных ресурсов в целях использования и содержания общего имущества в многоквартирном доме.
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
         * Текущие показания приборов учёта
         * коммунальных ресурсов - коллективных (общедомовых).
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
         * Суммарный объём коммунальных ресурсов в многоквартирном доме - в целях содержания общего имущества в многоквартирном доме.
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

}
