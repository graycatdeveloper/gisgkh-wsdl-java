
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Платежный документ (ПД)
 * 
 * <p>Java class for PaymentDocumentExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentDocumentExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountGuid"/>
 *         <element name="PaymentDocumentForm" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber" minOccurs="0"/>
 *         <element name="AddressInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="LivingPersonsNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   <element name="ResidentialSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
 *                   <element name="HeatedArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
 *                   <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="IndividualMDReadings" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PDServiceMDReadings">
 *                 <sequence>
 *                   <element name="MDService" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="MDServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/bills/}MDServiceCode"/>
 *                             <element name="MDServiceName">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <maxLength value="80"/>
 *                                   <minLength value="1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <sequence>
 *             <element name="ChargeInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}PDServiceChargeExportType" maxOccurs="unbounded" minOccurs="0"/>
 *             <choice>
 *               <element name="CapitalRepairCharge" minOccurs="0">
 *                 <complexType>
 *                   <complexContent>
 *                     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}CapitalRepairType">
 *                       <sequence>
 *                         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                       </sequence>
 *                     </extension>
 *                   </complexContent>
 *                 </complexType>
 *               </element>
 *               <element name="CapitalRepairYearCharge" type="{http://dom.gosuslugi.ru/schema/integration/bills/}CapitalRepairYearExportType" minOccurs="0"/>
 *             </choice>
 *             <element name="PenaltiesAndCourtCosts" maxOccurs="unbounded" minOccurs="0">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                       <element name="Cause">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <minLength value="1"/>
 *                             <maxLength value="1000"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="TotalPayable">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="18"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                       <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *             <element name="Insurance" minOccurs="0">
 *               <complexType>
 *                 <complexContent>
 *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     <sequence>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID" minOccurs="0"/>
 *                       <element name="Rate">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <fractionDigits value="6"/>
 *                             <totalDigits value="14"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="TotalPayable">
 *                         <simpleType>
 *                           <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
 *                             <totalDigits value="18"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="AccountingPeriodTotal">
 *                         <simpleType>
 *                           <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
 *                             <totalDigits value="18"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="CalcExplanation" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <minLength value="1"/>
 *                             <maxLength value="500"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceCharge" minOccurs="0"/>
 *                       <element name="Consumption" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="Volume" maxOccurs="2">
 *                                   <complexType>
 *                                     <simpleContent>
 *                                       <extension base="<http://dom.gosuslugi.ru/schema/integration/bills/>ConsumptionVolumeType">
 *                                         <attribute name="type">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               <enumeration value="I"/>
 *                                               <enumeration value="O"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </attribute>
 *                                       </extension>
 *                                     </simpleContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="13"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="Penalties" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="13"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="ServiceProviderPenalties" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="13"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="StateFees" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="13"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="CourtCosts" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="13"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="TotalPayableOverall" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                             <totalDigits value="13"/>
 *                             <fractionDigits value="2"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                       <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                   </restriction>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *           </sequence>
 *           <sequence>
 *             <element name="CapitalRepairDebt" maxOccurs="unbounded" minOccurs="0">
 *               <complexType>
 *                 <complexContent>
 *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}DebtType">
 *                     <sequence minOccurs="0">
 *                       <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                   </extension>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *             <element name="ChargeDebt" maxOccurs="unbounded" minOccurs="0">
 *               <complexType>
 *                 <complexContent>
 *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PDServiceDebtType">
 *                   </extension>
 *                 </complexContent>
 *               </complexType>
 *             </element>
 *           </sequence>
 *         </choice>
 *         <choice minOccurs="0">
 *           <element name="Expose" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Withdraw" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="TotalPayableByChargeInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="18"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalPayableOverallByChargeInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="18"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DebtPreviousPeriods" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <minInclusive value="-99999999.99"/>
 *               <maxInclusive value="99999999.99"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AdvanceBllingPeriod" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <minInclusive value="-99999999.99"/>
 *               <maxInclusive value="99999999.99"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="totalPiecemealPaymentSum" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <totalDigits value="18"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="PaymentsTaken" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               <minInclusive value="0"/>
 *               <maxInclusive value="31"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AdditionalInformation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalPayableByPD" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="18"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalByPenaltiesAndCourtCosts" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="18"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="TotalPayableByPDWithDebtAndAdvance" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="18"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ComponentsOfCost" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="nameComponent" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="cost">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="18"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PaidCash" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="13"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DateOfLastReceivedPayment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year" minOccurs="0"/>
 *         <element name="LimitIndex" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <totalDigits value="20"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="SubsidiesCompensationSocialSupport" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <maxExclusive value="100000000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="PaymentProviderInformation" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
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
@XmlType(name = "PaymentDocumentExportType", propOrder = {
    "accountGuid",
    "paymentDocumentForm",
    "paymentDocumentNumber",
    "addressInfo",
    "individualMDReadings",
    "chargeInfo",
    "capitalRepairCharge",
    "capitalRepairYearCharge",
    "penaltiesAndCourtCosts",
    "insurance",
    "capitalRepairDebt",
    "chargeDebt",
    "expose",
    "withdraw",
    "totalPayableByChargeInfo",
    "totalPayableOverallByChargeInfo",
    "debtPreviousPeriods",
    "advanceBllingPeriod",
    "totalPiecemealPaymentSum",
    "paymentsTaken",
    "additionalInformation",
    "totalPayableByPD",
    "totalByPenaltiesAndCourtCosts",
    "totalPayableByPDWithDebtAndAdvance",
    "componentsOfCost",
    "paidCash",
    "dateOfLastReceivedPayment",
    "month",
    "year",
    "limitIndex",
    "subsidiesCompensationSocialSupport",
    "paymentProviderInformation"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.ExportPaymentDocumentResultType.PaymentDocument.class
})
public class PaymentDocumentExportType {

    /**
     * Идентификатор лицевого счета
     * 
     */
    @XmlElement(name = "AccountGuid", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
    protected String accountGuid;
    /**
     * Приказ Минстроя №924/пр - состав данных платежного документа соответствует примерной форме платежного документа, утвержденной приказом Минстроя РФ от 29.12.2014 N 924/пр;
     * Приказ Минстроя №43/пр - состав данных платежного документа соответствует примерной форме платежного документа, утвержденной приказом Минстроя РФ от 26.01.2018 N 43/пр
     * 
     */
    @XmlElement(name = "PaymentDocumentForm")
    protected String paymentDocumentForm;
    /**
     * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
     * 
     */
    @XmlElement(name = "PaymentDocumentNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
    protected String paymentDocumentNumber;
    /**
     * Адресные сведения
     * 
     */
    @XmlElement(name = "AddressInfo")
    protected PaymentDocumentExportType.AddressInfo addressInfo;
    /**
     * Сведения о показаниях индивидуального прибора учета.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     */
    @XmlElement(name = "IndividualMDReadings")
    protected List<PaymentDocumentExportType.IndividualMDReadings> individualMDReadings;
    /**
     * Начисление по услуге
     * 
     */
    @XmlElement(name = "ChargeInfo")
    protected List<PDServiceChargeExportType> chargeInfo;
    /**
     * Начисление за капитальный ремонт
     * 
     */
    @XmlElement(name = "CapitalRepairCharge")
    protected PaymentDocumentExportType.CapitalRepairCharge capitalRepairCharge;
    /**
     * Начисление за капитальный ремонт. Указываются начисления за капремонт за 12 месяцев  календарного года.
     * 
     */
    @XmlElement(name = "CapitalRepairYearCharge")
    protected CapitalRepairYearExportType capitalRepairYearCharge;
    /**
     * Неустойки и судебные расходы
     * 
     */
    @XmlElement(name = "PenaltiesAndCourtCosts")
    protected List<PaymentDocumentExportType.PenaltiesAndCourtCosts> penaltiesAndCourtCosts;
    /**
     * Страхование
     * 
     */
    @XmlElement(name = "Insurance")
    protected PaymentDocumentExportType.Insurance insurance;
    /**
     * Задолженность за капитальный ремонт
     * 
     */
    @XmlElement(name = "CapitalRepairDebt")
    protected List<PaymentDocumentExportType.CapitalRepairDebt> capitalRepairDebt;
    /**
     * Задолженность по услуге
     * 
     */
    @XmlElement(name = "ChargeDebt")
    protected List<PaymentDocumentExportType.ChargeDebt> chargeDebt;
    /**
     * Выставлен на оплату (признак заполняется при экспорте, при импорте необязателен)
     * 
     */
    @XmlElement(name = "Expose")
    protected Boolean expose;
    /**
     * Отозванный (признак заполняется при экспорте, при импорте необязателен)
     * 
     */
    @XmlElement(name = "Withdraw")
    protected Boolean withdraw;
    /**
     * Итого к оплате за расчетный период, руб. (по всем услугам).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayableByChargeInfo")
    protected BigDecimal totalPayableByChargeInfo;
    /**
     * ИТОГО К ОПЛАТЕ, руб. (по всем услугам) 
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     */
    @XmlElement(name = "TotalPayableOverallByChargeInfo")
    protected BigDecimal totalPayableOverallByChargeInfo;
    /**
     * Задолженность за предыдущие периоды, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 10
     * 
     */
    @XmlElement(name = "DebtPreviousPeriods")
    protected BigDecimal debtPreviousPeriods;
    /**
     * Аванс на начало расчетного периода, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 10
     * 
     */
    @XmlElement(name = "AdvanceBllingPeriod")
    protected BigDecimal advanceBllingPeriod;
    /**
     * Сумма к оплате с учетом рассрочки платежа и процентов за рассрочку, руб. (Итого)
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
     * 
     */
    protected BigDecimal totalPiecemealPaymentSum;
    /**
     * Учтены платежи, поступившие до указанного числа расчетного периода включительно
     * 
     */
    @XmlElement(name = "PaymentsTaken")
    protected Byte paymentsTaken;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Сумма к оплате за расчетный период, руб. (по всему платежному документу)
     * 
     */
    @XmlElement(name = "TotalPayableByPD")
    protected BigDecimal totalPayableByPD;
    /**
     * Итого к оплате по неустойкам и судебным издержкам, руб. (итого по всем неустойкам и судебным издержкам).
     * Заполняется только для ПД с типом = Текущий
     * 
     */
    @XmlElement(name = "TotalByPenaltiesAndCourtCosts")
    protected BigDecimal totalByPenaltiesAndCourtCosts;
    /**
     * Итого к оплате за расчетный период c учетом задолженности/переплаты, руб. (по всему платежному документу)
     * 
     */
    @XmlElement(name = "TotalPayableByPDWithDebtAndAdvance")
    protected BigDecimal totalPayableByPDWithDebtAndAdvance;
    /**
     * Справочная информация.
     * Составляющие стоимости электрической энергии.
     * 
     */
    @XmlElement(name = "ComponentsOfCost")
    protected List<PaymentDocumentExportType.ComponentsOfCost> componentsOfCost;
    /**
     * Оплачено денежных средств, руб
     * 
     */
    @XmlElement(name = "PaidCash")
    protected BigDecimal paidCash;
    /**
     * Дата последней поступившей оплаты
     * 
     */
    @XmlElement(name = "DateOfLastReceivedPayment")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfLastReceivedPayment;
    /**
     * Месяц расчетного периода платежного документа.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
     * 
     */
    @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Integer month;
    /**
     * Год расчетного периода платежного документа.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Short year;
    /**
     * Предельный (максимальный) индекс изменения размера платы граждан за коммунальные услуги в муниципальном образовании, %
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
     * 
     */
    @XmlElement(name = "LimitIndex")
    protected BigDecimal limitIndex;
    /**
     * Субсидии, компенсации и иные меры соц. поддержки граждан, руб.
     * 
     */
    @XmlElement(name = "SubsidiesCompensationSocialSupport")
    protected BigDecimal subsidiesCompensationSocialSupport;
    /**
     * Сведения об исполнителе услуг платежного документа.
     * Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
     * 
     */
    @XmlElement(name = "PaymentProviderInformation")
    protected PaymentDocumentExportType.PaymentProviderInformation paymentProviderInformation;

    /**
     * Идентификатор лицевого счета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountGuid() {
        return accountGuid;
    }

    /**
     * Sets the value of the accountGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountGuid()
     */
    public void setAccountGuid(String value) {
        this.accountGuid = value;
    }

    /**
     * Приказ Минстроя №924/пр - состав данных платежного документа соответствует примерной форме платежного документа, утвержденной приказом Минстроя РФ от 29.12.2014 N 924/пр;
     * Приказ Минстроя №43/пр - состав данных платежного документа соответствует примерной форме платежного документа, утвержденной приказом Минстроя РФ от 26.01.2018 N 43/пр
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDocumentForm() {
        return paymentDocumentForm;
    }

    /**
     * Sets the value of the paymentDocumentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentDocumentForm()
     */
    public void setPaymentDocumentForm(String value) {
        this.paymentDocumentForm = value;
    }

    /**
     * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDocumentNumber() {
        return paymentDocumentNumber;
    }

    /**
     * Sets the value of the paymentDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentDocumentNumber()
     */
    public void setPaymentDocumentNumber(String value) {
        this.paymentDocumentNumber = value;
    }

    /**
     * Адресные сведения
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentExportType.AddressInfo }
     *     
     */
    public PaymentDocumentExportType.AddressInfo getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentExportType.AddressInfo }
     *     
     * @see #getAddressInfo()
     */
    public void setAddressInfo(PaymentDocumentExportType.AddressInfo value) {
        this.addressInfo = value;
    }

    /**
     * Сведения о показаниях индивидуального прибора учета.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
     * 
     * Gets the value of the individualMDReadings property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualMDReadings property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualMDReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDocumentExportType.IndividualMDReadings }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualMDReadings property.
     */
    public List<PaymentDocumentExportType.IndividualMDReadings> getIndividualMDReadings() {
        if (individualMDReadings == null) {
            individualMDReadings = new ArrayList<>();
        }
        return this.individualMDReadings;
    }

    /**
     * Начисление по услуге
     * 
     * Gets the value of the chargeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChargeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDServiceChargeExportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the chargeInfo property.
     */
    public List<PDServiceChargeExportType> getChargeInfo() {
        if (chargeInfo == null) {
            chargeInfo = new ArrayList<>();
        }
        return this.chargeInfo;
    }

    /**
     * Начисление за капитальный ремонт
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentExportType.CapitalRepairCharge }
     *     
     */
    public PaymentDocumentExportType.CapitalRepairCharge getCapitalRepairCharge() {
        return capitalRepairCharge;
    }

    /**
     * Sets the value of the capitalRepairCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentExportType.CapitalRepairCharge }
     *     
     * @see #getCapitalRepairCharge()
     */
    public void setCapitalRepairCharge(PaymentDocumentExportType.CapitalRepairCharge value) {
        this.capitalRepairCharge = value;
    }

    /**
     * Начисление за капитальный ремонт. Указываются начисления за капремонт за 12 месяцев  календарного года.
     * 
     * @return
     *     possible object is
     *     {@link CapitalRepairYearExportType }
     *     
     */
    public CapitalRepairYearExportType getCapitalRepairYearCharge() {
        return capitalRepairYearCharge;
    }

    /**
     * Sets the value of the capitalRepairYearCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapitalRepairYearExportType }
     *     
     * @see #getCapitalRepairYearCharge()
     */
    public void setCapitalRepairYearCharge(CapitalRepairYearExportType value) {
        this.capitalRepairYearCharge = value;
    }

    /**
     * Неустойки и судебные расходы
     * 
     * Gets the value of the penaltiesAndCourtCosts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltiesAndCourtCosts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPenaltiesAndCourtCosts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDocumentExportType.PenaltiesAndCourtCosts }
     * </p>
     * 
     * 
     * @return
     *     The value of the penaltiesAndCourtCosts property.
     */
    public List<PaymentDocumentExportType.PenaltiesAndCourtCosts> getPenaltiesAndCourtCosts() {
        if (penaltiesAndCourtCosts == null) {
            penaltiesAndCourtCosts = new ArrayList<>();
        }
        return this.penaltiesAndCourtCosts;
    }

    /**
     * Страхование
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentExportType.Insurance }
     *     
     */
    public PaymentDocumentExportType.Insurance getInsurance() {
        return insurance;
    }

    /**
     * Sets the value of the insurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentExportType.Insurance }
     *     
     * @see #getInsurance()
     */
    public void setInsurance(PaymentDocumentExportType.Insurance value) {
        this.insurance = value;
    }

    /**
     * Задолженность за капитальный ремонт
     * 
     * Gets the value of the capitalRepairDebt property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capitalRepairDebt property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCapitalRepairDebt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDocumentExportType.CapitalRepairDebt }
     * </p>
     * 
     * 
     * @return
     *     The value of the capitalRepairDebt property.
     */
    public List<PaymentDocumentExportType.CapitalRepairDebt> getCapitalRepairDebt() {
        if (capitalRepairDebt == null) {
            capitalRepairDebt = new ArrayList<>();
        }
        return this.capitalRepairDebt;
    }

    /**
     * Задолженность по услуге
     * 
     * Gets the value of the chargeDebt property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDebt property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChargeDebt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDocumentExportType.ChargeDebt }
     * </p>
     * 
     * 
     * @return
     *     The value of the chargeDebt property.
     */
    public List<PaymentDocumentExportType.ChargeDebt> getChargeDebt() {
        if (chargeDebt == null) {
            chargeDebt = new ArrayList<>();
        }
        return this.chargeDebt;
    }

    /**
     * Выставлен на оплату (признак заполняется при экспорте, при импорте необязателен)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpose() {
        return expose;
    }

    /**
     * Sets the value of the expose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExpose()
     */
    public void setExpose(Boolean value) {
        this.expose = value;
    }

    /**
     * Отозванный (признак заполняется при экспорте, при импорте необязателен)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithdraw() {
        return withdraw;
    }

    /**
     * Sets the value of the withdraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWithdraw()
     */
    public void setWithdraw(Boolean value) {
        this.withdraw = value;
    }

    /**
     * Итого к оплате за расчетный период, руб. (по всем услугам).
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPayableByChargeInfo() {
        return totalPayableByChargeInfo;
    }

    /**
     * Sets the value of the totalPayableByChargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPayableByChargeInfo()
     */
    public void setTotalPayableByChargeInfo(BigDecimal value) {
        this.totalPayableByChargeInfo = value;
    }

    /**
     * ИТОГО К ОПЛАТЕ, руб. (по всем услугам) 
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPayableOverallByChargeInfo() {
        return totalPayableOverallByChargeInfo;
    }

    /**
     * Sets the value of the totalPayableOverallByChargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPayableOverallByChargeInfo()
     */
    public void setTotalPayableOverallByChargeInfo(BigDecimal value) {
        this.totalPayableOverallByChargeInfo = value;
    }

    /**
     * Задолженность за предыдущие периоды, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 10
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtPreviousPeriods() {
        return debtPreviousPeriods;
    }

    /**
     * Sets the value of the debtPreviousPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDebtPreviousPeriods()
     */
    public void setDebtPreviousPeriods(BigDecimal value) {
        this.debtPreviousPeriods = value;
    }

    /**
     * Аванс на начало расчетного периода, руб.
     * Ссылка на пост. 924 – Приложение 2, п. 10
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdvanceBllingPeriod() {
        return advanceBllingPeriod;
    }

    /**
     * Sets the value of the advanceBllingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAdvanceBllingPeriod()
     */
    public void setAdvanceBllingPeriod(BigDecimal value) {
        this.advanceBllingPeriod = value;
    }

    /**
     * Сумма к оплате с учетом рассрочки платежа и процентов за рассрочку, руб. (Итого)
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 5 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPiecemealPaymentSum() {
        return totalPiecemealPaymentSum;
    }

    /**
     * Sets the value of the totalPiecemealPaymentSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPiecemealPaymentSum()
     */
    public void setTotalPiecemealPaymentSum(BigDecimal value) {
        this.totalPiecemealPaymentSum = value;
    }

    /**
     * Учтены платежи, поступившие до указанного числа расчетного периода включительно
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPaymentsTaken() {
        return paymentsTaken;
    }

    /**
     * Sets the value of the paymentsTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     * @see #getPaymentsTaken()
     */
    public void setPaymentsTaken(Byte value) {
        this.paymentsTaken = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInformation()
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Сумма к оплате за расчетный период, руб. (по всему платежному документу)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPayableByPD() {
        return totalPayableByPD;
    }

    /**
     * Sets the value of the totalPayableByPD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPayableByPD()
     */
    public void setTotalPayableByPD(BigDecimal value) {
        this.totalPayableByPD = value;
    }

    /**
     * Итого к оплате по неустойкам и судебным издержкам, руб. (итого по всем неустойкам и судебным издержкам).
     * Заполняется только для ПД с типом = Текущий
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalByPenaltiesAndCourtCosts() {
        return totalByPenaltiesAndCourtCosts;
    }

    /**
     * Sets the value of the totalByPenaltiesAndCourtCosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalByPenaltiesAndCourtCosts()
     */
    public void setTotalByPenaltiesAndCourtCosts(BigDecimal value) {
        this.totalByPenaltiesAndCourtCosts = value;
    }

    /**
     * Итого к оплате за расчетный период c учетом задолженности/переплаты, руб. (по всему платежному документу)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPayableByPDWithDebtAndAdvance() {
        return totalPayableByPDWithDebtAndAdvance;
    }

    /**
     * Sets the value of the totalPayableByPDWithDebtAndAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalPayableByPDWithDebtAndAdvance()
     */
    public void setTotalPayableByPDWithDebtAndAdvance(BigDecimal value) {
        this.totalPayableByPDWithDebtAndAdvance = value;
    }

    /**
     * Справочная информация.
     * Составляющие стоимости электрической энергии.
     * 
     * Gets the value of the componentsOfCost property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentsOfCost property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getComponentsOfCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDocumentExportType.ComponentsOfCost }
     * </p>
     * 
     * 
     * @return
     *     The value of the componentsOfCost property.
     */
    public List<PaymentDocumentExportType.ComponentsOfCost> getComponentsOfCost() {
        if (componentsOfCost == null) {
            componentsOfCost = new ArrayList<>();
        }
        return this.componentsOfCost;
    }

    /**
     * Оплачено денежных средств, руб
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaidCash() {
        return paidCash;
    }

    /**
     * Sets the value of the paidCash property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaidCash()
     */
    public void setPaidCash(BigDecimal value) {
        this.paidCash = value;
    }

    /**
     * Дата последней поступившей оплаты
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfLastReceivedPayment() {
        return dateOfLastReceivedPayment;
    }

    /**
     * Sets the value of the dateOfLastReceivedPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateOfLastReceivedPayment()
     */
    public void setDateOfLastReceivedPayment(XMLGregorianCalendar value) {
        this.dateOfLastReceivedPayment = value;
    }

    /**
     * Месяц расчетного периода платежного документа.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
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
     * Год расчетного периода платежного документа.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
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
     * Предельный (максимальный) индекс изменения размера платы граждан за коммунальные услуги в муниципальном образовании, %
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 4 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLimitIndex() {
        return limitIndex;
    }

    /**
     * Sets the value of the limitIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getLimitIndex()
     */
    public void setLimitIndex(BigDecimal value) {
        this.limitIndex = value;
    }

    /**
     * Субсидии, компенсации и иные меры соц. поддержки граждан, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidiesCompensationSocialSupport() {
        return subsidiesCompensationSocialSupport;
    }

    /**
     * Sets the value of the subsidiesCompensationSocialSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSubsidiesCompensationSocialSupport()
     */
    public void setSubsidiesCompensationSocialSupport(BigDecimal value) {
        this.subsidiesCompensationSocialSupport = value;
    }

    /**
     * Сведения об исполнителе услуг платежного документа.
     * Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentExportType.PaymentProviderInformation }
     *     
     */
    public PaymentDocumentExportType.PaymentProviderInformation getPaymentProviderInformation() {
        return paymentProviderInformation;
    }

    /**
     * Sets the value of the paymentProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentExportType.PaymentProviderInformation }
     *     
     * @see #getPaymentProviderInformation()
     */
    public void setPaymentProviderInformation(PaymentDocumentExportType.PaymentProviderInformation value) {
        this.paymentProviderInformation = value;
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
     *         <element name="LivingPersonsNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         <element name="ResidentialSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
     *         <element name="HeatedArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
     *         <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
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
        "livingPersonsNumber",
        "residentialSquare",
        "heatedArea",
        "totalSquare"
    })
    public static class AddressInfo {

        /**
         * Количество проживающих
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         */
        @XmlElement(name = "LivingPersonsNumber")
        protected BigInteger livingPersonsNumber;
        /**
         * Жилая площадь
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         */
        @XmlElement(name = "ResidentialSquare")
        protected BigDecimal residentialSquare;
        /**
         * Отапливаемая площадь
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         */
        @XmlElement(name = "HeatedArea")
        protected BigDecimal heatedArea;
        /**
         * Общая площадь для ЛС
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         */
        @XmlElement(name = "TotalSquare")
        protected BigDecimal totalSquare;

        /**
         * Количество проживающих
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLivingPersonsNumber() {
            return livingPersonsNumber;
        }

        /**
         * Sets the value of the livingPersonsNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getLivingPersonsNumber()
         */
        public void setLivingPersonsNumber(BigInteger value) {
            this.livingPersonsNumber = value;
        }

        /**
         * Жилая площадь
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getResidentialSquare() {
            return residentialSquare;
        }

        /**
         * Sets the value of the residentialSquare property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getResidentialSquare()
         */
        public void setResidentialSquare(BigDecimal value) {
            this.residentialSquare = value;
        }

        /**
         * Отапливаемая площадь
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHeatedArea() {
            return heatedArea;
        }

        /**
         * Sets the value of the heatedArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getHeatedArea()
         */
        public void setHeatedArea(BigDecimal value) {
            this.heatedArea = value;
        }

        /**
         * Общая площадь для ЛС
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalSquare() {
            return totalSquare;
        }

        /**
         * Sets the value of the totalSquare property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getTotalSquare()
         */
        public void setTotalSquare(BigDecimal value) {
            this.totalSquare = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}CapitalRepairType">
     *       <sequence>
     *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentInformationGuid"
    })
    public static class CapitalRepairCharge
        extends CapitalRepairType
    {

        /**
         * Идентификатор платежных реквизитов
         * 
         */
        @XmlElement(name = "PaymentInformationGuid")
        protected String paymentInformationGuid;

        /**
         * Идентификатор платежных реквизитов
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentInformationGuid() {
            return paymentInformationGuid;
        }

        /**
         * Sets the value of the paymentInformationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentInformationGuid()
         */
        public void setPaymentInformationGuid(String value) {
            this.paymentInformationGuid = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}DebtType">
     *       <sequence minOccurs="0">
     *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentInformationGuid"
    })
    public static class CapitalRepairDebt
        extends DebtType
    {

        /**
         * Идентификатор платежных реквизитов
         * 
         */
        @XmlElement(name = "PaymentInformationGuid")
        protected String paymentInformationGuid;

        /**
         * Идентификатор платежных реквизитов
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentInformationGuid() {
            return paymentInformationGuid;
        }

        /**
         * Sets the value of the paymentInformationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentInformationGuid()
         */
        public void setPaymentInformationGuid(String value) {
            this.paymentInformationGuid = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PDServiceDebtType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ChargeDebt
        extends PDServiceDebtType
    {


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
     *         <element name="nameComponent" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="cost">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
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
        "nameComponent",
        "cost"
    })
    public static class ComponentsOfCost {

        /**
         * Наименование составляющей из НСИ 331 "Составляющая тарифа на электрическую энергию"
         * 
         */
        @XmlElement(required = true)
        protected NsiRef nameComponent;
        /**
         * Сумма составляющей, руб.
         * 
         */
        @XmlElement(required = true)
        protected BigDecimal cost;

        /**
         * Наименование составляющей из НСИ 331 "Составляющая тарифа на электрическую энергию"
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getNameComponent() {
            return nameComponent;
        }

        /**
         * Sets the value of the nameComponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getNameComponent()
         */
        public void setNameComponent(NsiRef value) {
            this.nameComponent = value;
        }

        /**
         * Сумма составляющей, руб.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCost() {
            return cost;
        }

        /**
         * Sets the value of the cost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCost()
         */
        public void setCost(BigDecimal value) {
            this.cost = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PDServiceMDReadings">
     *       <sequence>
     *         <element name="MDService" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="MDServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/bills/}MDServiceCode"/>
     *                   <element name="MDServiceName">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="80"/>
     *                         <minLength value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mdService"
    })
    public static class IndividualMDReadings
        extends PDServiceMDReadings
    {

        /**
         * Коммунальная услуга, учет потребления которой осуществляется прибором учета.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
         * 
         */
        @XmlElement(name = "MDService", required = true)
        protected List<PaymentDocumentExportType.IndividualMDReadings.MDService> mdService;

        /**
         * Коммунальная услуга, учет потребления которой осуществляется прибором учета.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 2 примерной формы ПД
         * 
         * Gets the value of the mdService property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mdService property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMDService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentDocumentExportType.IndividualMDReadings.MDService }
         * </p>
         * 
         * 
         * @return
         *     The value of the mdService property.
         */
        public List<PaymentDocumentExportType.IndividualMDReadings.MDService> getMDService() {
            if (mdService == null) {
                mdService = new ArrayList<>();
            }
            return this.mdService;
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
         *         <element name="MDServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/bills/}MDServiceCode"/>
         *         <element name="MDServiceName">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="80"/>
         *               <minLength value="1"/>
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
            "mdServiceCode",
            "mdServiceName"
        })
        public static class MDService {

            /**
             * Код коммунальной услуги
             * 
             */
            @XmlElement(name = "MDServiceCode", required = true)
            protected String mdServiceCode;
            /**
             * Наименование коммунальной услуги
             * 
             */
            @XmlElement(name = "MDServiceName", required = true)
            protected String mdServiceName;

            /**
             * Код коммунальной услуги
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMDServiceCode() {
                return mdServiceCode;
            }

            /**
             * Sets the value of the mdServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getMDServiceCode()
             */
            public void setMDServiceCode(String value) {
                this.mdServiceCode = value;
            }

            /**
             * Наименование коммунальной услуги
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMDServiceName() {
                return mdServiceName;
            }

            /**
             * Sets the value of the mdServiceName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getMDServiceName()
             */
            public void setMDServiceName(String value) {
                this.mdServiceName = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductGUID" minOccurs="0"/>
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
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
     *               <totalDigits value="18"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="AccountingPeriodTotal">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
     *               <totalDigits value="18"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="CalcExplanation" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="500"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceCharge" minOccurs="0"/>
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
     *                         </extension>
     *                       </simpleContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
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
     *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
        "insuranceProductGUID",
        "rate",
        "totalPayable",
        "accountingPeriodTotal",
        "calcExplanation",
        "serviceCharge",
        "consumption",
        "debtPreviousPeriodsOrAdvanceBillingPeriod",
        "penalties",
        "serviceProviderPenalties",
        "stateFees",
        "courtCosts",
        "totalPayableOverall",
        "orgPPAGUID",
        "paymentInformationGuid"
    })
    public static class Insurance {

        /**
         * Идентификатор страхового продукта
         * 
         */
        @XmlElement(name = "InsuranceProductGUID")
        protected String insuranceProductGUID;
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
        @XmlElement(name = "AccountingPeriodTotal", required = true)
        protected BigDecimal accountingPeriodTotal;
        /**
         * Порядок расчетов
         * 
         */
        @XmlElement(name = "CalcExplanation")
        protected String calcExplanation;
        /**
         * Перерасчеты, льготы, субсидии
         * 
         */
        @XmlElement(name = "ServiceCharge")
        protected ServiceChargeType serviceCharge;
        /**
         * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         */
        @XmlElement(name = "Consumption")
        protected PaymentDocumentExportType.Insurance.Consumption consumption;
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
         * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
         * 
         */
        protected String orgPPAGUID;
        /**
         * Идентификатор платежных реквизитов
         * 
         */
        @XmlElement(name = "PaymentInformationGuid")
        protected String paymentInformationGuid;

        /**
         * Идентификатор страхового продукта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceProductGUID() {
            return insuranceProductGUID;
        }

        /**
         * Sets the value of the insuranceProductGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getInsuranceProductGUID()
         */
        public void setInsuranceProductGUID(String value) {
            this.insuranceProductGUID = value;
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
         * Перерасчеты, льготы, субсидии
         * 
         * @return
         *     possible object is
         *     {@link ServiceChargeType }
         *     
         */
        public ServiceChargeType getServiceCharge() {
            return serviceCharge;
        }

        /**
         * Sets the value of the serviceCharge property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceChargeType }
         *     
         * @see #getServiceCharge()
         */
        public void setServiceCharge(ServiceChargeType value) {
            this.serviceCharge = value;
        }

        /**
         * Объем коммунальных услуг / Объем коммунальных ресурсов, потребленных при использовании и содержании общего имущества в многоквартирном доме, или коммунальных услуг на общедомовые нужды.
         * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentExportType.Insurance.Consumption }
         *     
         */
        public PaymentDocumentExportType.Insurance.Consumption getConsumption() {
            return consumption;
        }

        /**
         * Sets the value of the consumption property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentExportType.Insurance.Consumption }
         *     
         * @see #getConsumption()
         */
        public void setConsumption(PaymentDocumentExportType.Insurance.Consumption value) {
            this.consumption = value;
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
         * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
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
         * Идентификатор платежных реквизитов
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentInformationGuid() {
            return paymentInformationGuid;
        }

        /**
         * Sets the value of the paymentInformationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentInformationGuid()
         */
        public void setPaymentInformationGuid(String value) {
            this.paymentInformationGuid = value;
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
            protected List<PaymentDocumentExportType.Insurance.Consumption.Volume> volume;

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
             * {@link PaymentDocumentExportType.Insurance.Consumption.Volume }
             * </p>
             * 
             * 
             * @return
             *     The value of the volume property.
             */
            public List<PaymentDocumentExportType.Insurance.Consumption.Volume> getVolume() {
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
     *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "orgPPAGUID"
    })
    public static class PaymentProviderInformation {

        /**
         * Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
         * 
         */
        @XmlElement(required = true)
        protected String orgPPAGUID;

        /**
         * Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
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
     *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="Cause">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="1000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="TotalPayable">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
        "serviceType",
        "cause",
        "totalPayable",
        "orgPPAGUID",
        "paymentInformationGuid"
    })
    public static class PenaltiesAndCourtCosts {

        /**
         * Вид неустойки и судебных расходов. НСИ 329 "Неустойки и судебные расходы":
         * - Пени
         * - Штрафы
         * - Государственные пошлины
         * - Судебные издержки
         * 
         */
        @XmlElement(name = "ServiceType", required = true)
        protected NsiRef serviceType;
        /**
         * Основания начислений
         * 
         */
        @XmlElement(name = "Cause", required = true)
        protected String cause;
        /**
         * Итого к оплате за расчетный период, руб.
         * 
         */
        @XmlElement(name = "TotalPayable", required = true)
        protected BigDecimal totalPayable;
        /**
         * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
         * 
         */
        protected String orgPPAGUID;
        /**
         * Идентификатор платежных реквизитов
         * 
         */
        @XmlElement(name = "PaymentInformationGuid")
        protected String paymentInformationGuid;

        /**
         * Вид неустойки и судебных расходов. НСИ 329 "Неустойки и судебные расходы":
         * - Пени
         * - Штрафы
         * - Государственные пошлины
         * - Судебные издержки
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
         * Основания начислений
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCause() {
            return cause;
        }

        /**
         * Sets the value of the cause property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCause()
         */
        public void setCause(String value) {
            this.cause = value;
        }

        /**
         * Итого к оплате за расчетный период, руб.
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
         * Идентификатор платежных реквизитов
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentInformationGuid() {
            return paymentInformationGuid;
        }

        /**
         * Sets the value of the paymentInformationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentInformationGuid()
         */
        public void setPaymentInformationGuid(String value) {
            this.paymentInformationGuid = value;
        }

    }

}
