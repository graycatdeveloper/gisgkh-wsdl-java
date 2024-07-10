
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Вид коммунальной услуги
 * 
 * <p>Java class for TypeMunicipalServiceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TypeMunicipalServiceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Consumption" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Volume" maxOccurs="2">
 *                     <complexType>
 *                       <simpleContent>
 *                         <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                           <attribute name="type">
 *                             <simpleType>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 <enumeration value="I"/>
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
 *         <element name="Rate" minOccurs="0">
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
 *         <element name="AmountOfPaymentMunicipalServiceIndividualConsumption" minOccurs="0">
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
 *         <element name="MultiplyingFactor" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Ratio">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="5"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="AmountOfExcessFees" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="13"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ServiceCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceChargeImportType" minOccurs="0"/>
 *         <element name="TotalPayable">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MunicipalServiceIndividualConsumptionPayable" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MunicipalServiceCommunalConsumptionPayable" minOccurs="0">
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
 *         <element name="CalcExplanation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="4000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}PiecemealPayment" minOccurs="0"/>
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
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceInformation" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeMunicipalServiceType", propOrder = {
    "serviceType",
    "consumption",
    "rate",
    "amountOfPaymentMunicipalServiceCommunalConsumption",
    "amountOfPaymentMunicipalServiceIndividualConsumption",
    "accountingPeriodTotal",
    "multiplyingFactor",
    "serviceCharge",
    "totalPayable",
    "municipalServiceIndividualConsumptionPayable",
    "municipalServiceCommunalConsumptionPayable",
    "debtPreviousPeriodsOrAdvanceBillingPeriod",
    "penalties",
    "serviceProviderPenalties",
    "stateFees",
    "courtCosts",
    "totalPayableOverall",
    "calcExplanation",
    "orgPPAGUID",
    "piecemealPayment",
    "paymentRecalculation",
    "serviceInformation"
})
public class TypeMunicipalServiceType {

    /**
     * Код вида коммунальной услуги из справочника НСИ 3 "Вид коммунальной услуги".
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
    protected TypeMunicipalServiceType.Consumption consumption;
    /**
     * Тариф / Размер платы на кв.м, руб. / Размер взноса на кв.м, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    /**
     * Размер платы за коммунальные услуги, общедомовые нужды.
     * Ссылка на пост. 924 – Приложение 2, п. 18.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
     * 
     */
    @XmlElement(name = "AmountOfPaymentMunicipalServiceCommunalConsumption")
    protected BigDecimal amountOfPaymentMunicipalServiceCommunalConsumption;
    /**
     * Размер платы за коммунальные услуги, индивидуальное потребление.
     * Ссылка на пост. 924 – Приложение 2, п. 18.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
     * 
     */
    @XmlElement(name = "AmountOfPaymentMunicipalServiceIndividualConsumption")
    protected BigDecimal amountOfPaymentMunicipalServiceIndividualConsumption;
    /**
     * Начислено за расчетный период (без перерасчетов и льгот), руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "AccountingPeriodTotal")
    protected BigDecimal accountingPeriodTotal;
    /**
     * Повышающий коэффициент.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "MultiplyingFactor")
    protected TypeMunicipalServiceType.MultiplyingFactor multiplyingFactor;
    /**
     * Перерасчеты, льготы, субсидии
     * 
     */
    @XmlElement(name = "ServiceCharge")
    protected ServiceChargeImportType serviceCharge;
    /**
     * К оплате за расчетный период, руб.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayable", required = true)
    protected BigDecimal totalPayable;
    /**
     * К оплате за индивидуальное потребление коммунальной услуги, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 23.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
     * 
     */
    @XmlElement(name = "MunicipalServiceIndividualConsumptionPayable")
    protected BigDecimal municipalServiceIndividualConsumptionPayable;
    /**
     * К оплате за общедомовое потребление коммунальной услуги, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 23.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
     * 
     */
    @XmlElement(name = "MunicipalServiceCommunalConsumptionPayable")
    protected BigDecimal municipalServiceCommunalConsumptionPayable;
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
     * Расчет суммы к оплате с учетом рассрочки платежа.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
     * 
     */
    @XmlElement(name = "PiecemealPayment")
    protected PiecemealPayment piecemealPayment;
    /**
     * Сведения о перерасчетах (доначислении +, уменьшении -).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
     * 
     */
    @XmlElement(name = "PaymentRecalculation")
    protected TypeMunicipalServiceType.PaymentRecalculation paymentRecalculation;
    /**
     * Справочная информация.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
     * 
     */
    @XmlElement(name = "ServiceInformation")
    protected ServiceInformation serviceInformation;

    /**
     * Код вида коммунальной услуги из справочника НСИ 3 "Вид коммунальной услуги".
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
     *     {@link TypeMunicipalServiceType.Consumption }
     *     
     */
    public TypeMunicipalServiceType.Consumption getConsumption() {
        return consumption;
    }

    /**
     * Sets the value of the consumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMunicipalServiceType.Consumption }
     *     
     * @see #getConsumption()
     */
    public void setConsumption(TypeMunicipalServiceType.Consumption value) {
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
     * Ссылка на пост. 924 – Приложение 2, п. 18.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
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
     * Размер платы за коммунальные услуги, индивидуальное потребление.
     * Ссылка на пост. 924 – Приложение 2, п. 18.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountOfPaymentMunicipalServiceIndividualConsumption() {
        return amountOfPaymentMunicipalServiceIndividualConsumption;
    }

    /**
     * Sets the value of the amountOfPaymentMunicipalServiceIndividualConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAmountOfPaymentMunicipalServiceIndividualConsumption()
     */
    public void setAmountOfPaymentMunicipalServiceIndividualConsumption(BigDecimal value) {
        this.amountOfPaymentMunicipalServiceIndividualConsumption = value;
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
     * Повышающий коэффициент.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link TypeMunicipalServiceType.MultiplyingFactor }
     *     
     */
    public TypeMunicipalServiceType.MultiplyingFactor getMultiplyingFactor() {
        return multiplyingFactor;
    }

    /**
     * Sets the value of the multiplyingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMunicipalServiceType.MultiplyingFactor }
     *     
     * @see #getMultiplyingFactor()
     */
    public void setMultiplyingFactor(TypeMunicipalServiceType.MultiplyingFactor value) {
        this.multiplyingFactor = value;
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
     * К оплате за индивидуальное потребление коммунальной услуги, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 23.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMunicipalServiceIndividualConsumptionPayable() {
        return municipalServiceIndividualConsumptionPayable;
    }

    /**
     * Sets the value of the municipalServiceIndividualConsumptionPayable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getMunicipalServiceIndividualConsumptionPayable()
     */
    public void setMunicipalServiceIndividualConsumptionPayable(BigDecimal value) {
        this.municipalServiceIndividualConsumptionPayable = value;
    }

    /**
     * К оплате за общедомовое потребление коммунальной услуги, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 23.
     * Не обрабатывается Системой в связи с вступлением в силу приказа Минстроя РФ от 26.01.2018 N 43/пр
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
     * Расчет суммы к оплате с учетом рассрочки платежа.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link PiecemealPayment }
     *     
     */
    public PiecemealPayment getPiecemealPayment() {
        return piecemealPayment;
    }

    /**
     * Sets the value of the piecemealPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PiecemealPayment }
     *     
     * @see #getPiecemealPayment()
     */
    public void setPiecemealPayment(PiecemealPayment value) {
        this.piecemealPayment = value;
    }

    /**
     * Сведения о перерасчетах (доначислении +, уменьшении -).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 6 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link TypeMunicipalServiceType.PaymentRecalculation }
     *     
     */
    public TypeMunicipalServiceType.PaymentRecalculation getPaymentRecalculation() {
        return paymentRecalculation;
    }

    /**
     * Sets the value of the paymentRecalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMunicipalServiceType.PaymentRecalculation }
     *     
     * @see #getPaymentRecalculation()
     */
    public void setPaymentRecalculation(TypeMunicipalServiceType.PaymentRecalculation value) {
        this.paymentRecalculation = value;
    }

    /**
     * Справочная информация.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link ServiceInformation }
     *     
     */
    public ServiceInformation getServiceInformation() {
        return serviceInformation;
    }

    /**
     * Sets the value of the serviceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInformation }
     *     
     * @see #getServiceInformation()
     */
    public void setServiceInformation(ServiceInformation value) {
        this.serviceInformation = value;
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
     *         <element name="Volume" maxOccurs="2">
     *           <complexType>
     *             <simpleContent>
     *               <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
     *                 <attribute name="type">
     *                   <simpleType>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       <enumeration value="I"/>
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
        protected List<TypeMunicipalServiceType.Consumption.Volume> volume;

        /**
         * Объем
         * 
         * Gets the value of the volume property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the volume property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getVolume().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeMunicipalServiceType.Consumption.Volume }
         * </p>
         * 
         * 
         * @return
         *     The value of the volume property.
         */
        public List<TypeMunicipalServiceType.Consumption.Volume> getVolume() {
            if (volume == null) {
                volume = new ArrayList<>();
            }
            return this.volume;
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
         *             <enumeration value="I"/>
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
             * (I)ndividualConsumption - объем коммунальных услуг
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
             * (I)ndividualConsumption - объем коммунальных услуг
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
     *         <element name="Ratio">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="5"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AmountOfExcessFees" minOccurs="0">
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
    @XmlType(name = "", propOrder = {
        "ratio",
        "amountOfExcessFees"
    })
    public static class MultiplyingFactor {

        /**
         * Размер повышающего коэффициента
         * 
         */
        @XmlElement(name = "Ratio", required = true)
        protected BigDecimal ratio;
        /**
         * Размер превышения платы, рассчитанной с применением повышающего коэффициента над размером платы, рассчитанной без учета повышающего коэффициента, руб
         * 
         */
        @XmlElement(name = "AmountOfExcessFees")
        protected BigDecimal amountOfExcessFees;

        /**
         * Размер повышающего коэффициента
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRatio() {
            return ratio;
        }

        /**
         * Sets the value of the ratio property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getRatio()
         */
        public void setRatio(BigDecimal value) {
            this.ratio = value;
        }

        /**
         * Размер превышения платы, рассчитанной с применением повышающего коэффициента над размером платы, рассчитанной без учета повышающего коэффициента, руб
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmountOfExcessFees() {
            return amountOfExcessFees;
        }

        /**
         * Sets the value of the amountOfExcessFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAmountOfExcessFees()
         */
        public void setAmountOfExcessFees(BigDecimal value) {
            this.amountOfExcessFees = value;
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

}
