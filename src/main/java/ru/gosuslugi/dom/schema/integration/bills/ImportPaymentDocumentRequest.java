
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.payments_base.PaymentInformationKeyType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <sequence>
 *           <element name="ConfirmAmountsCorrect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *           <element name="PaymentInformation" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationKeyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="PaymentDocument" maxOccurs="500">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PaymentDocumentType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
 *                     <choice>
 *                       <sequence>
 *                         <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                         <element name="PaymentInformationDetails" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 <sequence>
 *                                   <element name="TotalPayableByPaymentInformation">
 *                                     <simpleType>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                         <totalDigits value="18"/>
 *                                         <fractionDigits value="2"/>
 *                                       </restriction>
 *                                     </simpleType>
 *                                   </element>
 *                                   <element name="AccountNumber" minOccurs="0">
 *                                     <simpleType>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                         <minLength value="1"/>
 *                                         <maxLength value="30"/>
 *                                       </restriction>
 *                                     </simpleType>
 *                                   </element>
 *                                   <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
 *                                     <simpleType>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                         <totalDigits value="13"/>
 *                                         <fractionDigits value="2"/>
 *                                       </restriction>
 *                                     </simpleType>
 *                                   </element>
 *                                   <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
 *                                     <simpleType>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                         <totalDigits value="13"/>
 *                                         <fractionDigits value="2"/>
 *                                       </restriction>
 *                                     </simpleType>
 *                                   </element>
 *                                 </sequence>
 *                               </restriction>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                       </sequence>
 *                       <element name="DetailsPaymentInformation" maxOccurs="unbounded">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                 <element name="TotalPayableByPaymentInformation">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                       <totalDigits value="18"/>
 *                                       <fractionDigits value="2"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                                 <element name="AccountNumber" minOccurs="0">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                       <minLength value="1"/>
 *                                       <maxLength value="30"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                                 <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                       <totalDigits value="13"/>
 *                                       <fractionDigits value="2"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                                 <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                       <totalDigits value="13"/>
 *                                       <fractionDigits value="2"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </choice>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="PaymentProviderInformation" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *         <element name="WithdrawPaymentDocument" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.16""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "confirmAmountsCorrect",
    "month",
    "year",
    "paymentInformation",
    "paymentDocument",
    "paymentProviderInformation",
    "withdrawPaymentDocument"
})
@XmlRootElement(name = "importPaymentDocumentRequest")
public class ImportPaymentDocumentRequest
    extends BaseType
{

    /**
     * True = Передаваемые данные платежных документов, следует считать верными, даже если они отличаются от автоматически рассчитанных Системой значений.
     * 
     * В том случае, если параметр не заполнен, то ГИС ЖХК будет проводить автоматическую проверку рассчитываемых сумм по ПД. (например: 
     * - проверка на то что сумма, указанная в TotalPayableByChargeInfo равна сумме всех вложений в блоках ChargeInfo, Insurance, CapitalRepairCharge (или CapitalRepairYearCharge) по полю TotalPayable; 
     * - проверка AccountingPeriodTotal = сумма по всем (Consumption/ tns:Volume * Rate).
     * Проверка осуществляется только для заполненных полей (например, если TotalPayableByPD не заполнено, то ГИС ЖКХ автоматически рассчитает итоговую сумму по ПД, и проверка данной суммы не будет проводиться).
     * 
     */
    @XmlElement(name = "ConfirmAmountsCorrect")
    protected Boolean confirmAmountsCorrect;
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
     * Сведения о платежных реквизитах получателя платежа - бизнес-ключ поиска размещенных платежных реквизитов в ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "PaymentInformation")
    protected List<ImportPaymentDocumentRequest.PaymentInformation> paymentInformation;
    /**
     * Размещаемый платежный документ
     * 
     */
    @XmlElement(name = "PaymentDocument")
    protected List<ImportPaymentDocumentRequest.PaymentDocument> paymentDocument;
    /**
     * Сведения об исполнителе услуг платежного документа.
     * Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
     * 
     */
    @XmlElement(name = "PaymentProviderInformation")
    protected ImportPaymentDocumentRequest.PaymentProviderInformation paymentProviderInformation;
    /**
     * Отзываемые платежные документы
     * 
     */
    @XmlElement(name = "WithdrawPaymentDocument")
    protected List<ImportPaymentDocumentRequest.WithdrawPaymentDocument> withdrawPaymentDocument;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * True = Передаваемые данные платежных документов, следует считать верными, даже если они отличаются от автоматически рассчитанных Системой значений.
     * 
     * В том случае, если параметр не заполнен, то ГИС ЖХК будет проводить автоматическую проверку рассчитываемых сумм по ПД. (например: 
     * - проверка на то что сумма, указанная в TotalPayableByChargeInfo равна сумме всех вложений в блоках ChargeInfo, Insurance, CapitalRepairCharge (или CapitalRepairYearCharge) по полю TotalPayable; 
     * - проверка AccountingPeriodTotal = сумма по всем (Consumption/ tns:Volume * Rate).
     * Проверка осуществляется только для заполненных полей (например, если TotalPayableByPD не заполнено, то ГИС ЖКХ автоматически рассчитает итоговую сумму по ПД, и проверка данной суммы не будет проводиться).
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfirmAmountsCorrect() {
        return confirmAmountsCorrect;
    }

    /**
     * Sets the value of the confirmAmountsCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isConfirmAmountsCorrect()
     */
    public void setConfirmAmountsCorrect(Boolean value) {
        this.confirmAmountsCorrect = value;
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
     * Сведения о платежных реквизитах получателя платежа - бизнес-ключ поиска размещенных платежных реквизитов в ГИС ЖКХ.
     * 
     * Gets the value of the paymentInformation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPaymentDocumentRequest.PaymentInformation }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentInformation property.
     */
    public List<ImportPaymentDocumentRequest.PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<>();
        }
        return this.paymentInformation;
    }

    /**
     * Размещаемый платежный документ
     * 
     * Gets the value of the paymentDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPaymentDocumentRequest.PaymentDocument }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentDocument property.
     */
    public List<ImportPaymentDocumentRequest.PaymentDocument> getPaymentDocument() {
        if (paymentDocument == null) {
            paymentDocument = new ArrayList<>();
        }
        return this.paymentDocument;
    }

    /**
     * Сведения об исполнителе услуг платежного документа.
     * Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
     * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 1 примерной формы ПД
     * 
     * @return
     *     possible object is
     *     {@link ImportPaymentDocumentRequest.PaymentProviderInformation }
     *     
     */
    public ImportPaymentDocumentRequest.PaymentProviderInformation getPaymentProviderInformation() {
        return paymentProviderInformation;
    }

    /**
     * Sets the value of the paymentProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPaymentDocumentRequest.PaymentProviderInformation }
     *     
     * @see #getPaymentProviderInformation()
     */
    public void setPaymentProviderInformation(ImportPaymentDocumentRequest.PaymentProviderInformation value) {
        this.paymentProviderInformation = value;
    }

    /**
     * Отзываемые платежные документы
     * 
     * Gets the value of the withdrawPaymentDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withdrawPaymentDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWithdrawPaymentDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPaymentDocumentRequest.WithdrawPaymentDocument }
     * </p>
     * 
     * 
     * @return
     *     The value of the withdrawPaymentDocument property.
     */
    public List<ImportPaymentDocumentRequest.WithdrawPaymentDocument> getWithdrawPaymentDocument() {
        if (withdrawPaymentDocument == null) {
            withdrawPaymentDocument = new ArrayList<>();
        }
        return this.withdrawPaymentDocument;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.2.0.16";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PaymentDocumentType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
     *         <choice>
     *           <sequence>
     *             <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *             <element name="PaymentInformationDetails" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     <sequence>
     *                       <element name="TotalPayableByPaymentInformation">
     *                         <simpleType>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                             <totalDigits value="18"/>
     *                             <fractionDigits value="2"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                       <element name="AccountNumber" minOccurs="0">
     *                         <simpleType>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                             <minLength value="1"/>
     *                             <maxLength value="30"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                       <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
     *                         <simpleType>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                             <totalDigits value="13"/>
     *                             <fractionDigits value="2"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                       <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
     *                         <simpleType>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                             <totalDigits value="13"/>
     *                             <fractionDigits value="2"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                     </sequence>
     *                   </restriction>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *           </sequence>
     *           <element name="DetailsPaymentInformation" maxOccurs="unbounded">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="TotalPayableByPaymentInformation">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           <totalDigits value="18"/>
     *                           <fractionDigits value="2"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="AccountNumber" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="30"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           <totalDigits value="13"/>
     *                           <fractionDigits value="2"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           <totalDigits value="13"/>
     *                           <fractionDigits value="2"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
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
        "transportGUID",
        "paymentDocumentID",
        "paymentInformationKey",
        "paymentInformationDetails",
        "detailsPaymentInformation"
    })
    public static class PaymentDocument
        extends PaymentDocumentType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
        protected String paymentDocumentID;
        /**
         * Ссылка на платежные реквизиты. Заполняется, если в ПД только один платежный реквизит
         * 
         */
        @XmlElement(name = "PaymentInformationKey")
        protected String paymentInformationKey;
        /**
         * Детализация информации о начислениях по платежному реквизиту
         * 
         */
        @XmlElement(name = "PaymentInformationDetails")
        protected ImportPaymentDocumentRequest.PaymentDocument.PaymentInformationDetails paymentInformationDetails;
        /**
         * Заполняется, если в ПД несколько платежных реквизитов для отражения детальной информации о начислениях по каждому из них
         * 
         */
        @XmlElement(name = "DetailsPaymentInformation")
        protected List<ImportPaymentDocumentRequest.PaymentDocument.DetailsPaymentInformation> detailsPaymentInformation;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Идентификатор платежного документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentDocumentID() {
            return paymentDocumentID;
        }

        /**
         * Sets the value of the paymentDocumentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentDocumentID()
         */
        public void setPaymentDocumentID(String value) {
            this.paymentDocumentID = value;
        }

        /**
         * Ссылка на платежные реквизиты. Заполняется, если в ПД только один платежный реквизит
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
         * Детализация информации о начислениях по платежному реквизиту
         * 
         * @return
         *     possible object is
         *     {@link ImportPaymentDocumentRequest.PaymentDocument.PaymentInformationDetails }
         *     
         */
        public ImportPaymentDocumentRequest.PaymentDocument.PaymentInformationDetails getPaymentInformationDetails() {
            return paymentInformationDetails;
        }

        /**
         * Sets the value of the paymentInformationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportPaymentDocumentRequest.PaymentDocument.PaymentInformationDetails }
         *     
         * @see #getPaymentInformationDetails()
         */
        public void setPaymentInformationDetails(ImportPaymentDocumentRequest.PaymentDocument.PaymentInformationDetails value) {
            this.paymentInformationDetails = value;
        }

        /**
         * Заполняется, если в ПД несколько платежных реквизитов для отражения детальной информации о начислениях по каждому из них
         * 
         * Gets the value of the detailsPaymentInformation property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsPaymentInformation property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDetailsPaymentInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportPaymentDocumentRequest.PaymentDocument.DetailsPaymentInformation }
         * </p>
         * 
         * 
         * @return
         *     The value of the detailsPaymentInformation property.
         */
        public List<ImportPaymentDocumentRequest.PaymentDocument.DetailsPaymentInformation> getDetailsPaymentInformation() {
            if (detailsPaymentInformation == null) {
                detailsPaymentInformation = new ArrayList<>();
            }
            return this.detailsPaymentInformation;
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
         *         <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="TotalPayableByPaymentInformation">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AccountNumber" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="30"/>
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
         *         <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
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
            "paymentInformationKey",
            "totalPayableByPaymentInformation",
            "accountNumber",
            "debtPreviousPeriodsOrAdvanceBillingPeriod",
            "totalPayableWithDebtAndAdvance"
        })
        public static class DetailsPaymentInformation {

            /**
             * Ссылка на платежные реквизиты
             * 
             */
            @XmlElement(name = "PaymentInformationKey", required = true)
            protected String paymentInformationKey;
            /**
             * Сумма к оплате за расчетный период, руб. (по всем услугам, где указан платежный реквизит)
             * 
             */
            @XmlElement(name = "TotalPayableByPaymentInformation", required = true)
            protected BigDecimal totalPayableByPaymentInformation;
            /**
             * Номер лицевого счета (иной идентификатор плательщика).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken)
             * 
             */
            @XmlElement(name = "DebtPreviousPeriodsOrAdvanceBillingPeriod")
            protected BigDecimal debtPreviousPeriodsOrAdvanceBillingPeriod;
            /**
             * Итого к оплате за расчетный период c учетом задолженности/переплаты, руб. (в рамках платежного реквизита)
             * 
             */
            @XmlElement(name = "TotalPayableWithDebtAndAdvance")
            protected BigDecimal totalPayableWithDebtAndAdvance;

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
             * Сумма к оплате за расчетный период, руб. (по всем услугам, где указан платежный реквизит)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayableByPaymentInformation() {
                return totalPayableByPaymentInformation;
            }

            /**
             * Sets the value of the totalPayableByPaymentInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayableByPaymentInformation()
             */
            public void setTotalPayableByPaymentInformation(BigDecimal value) {
                this.totalPayableByPaymentInformation = value;
            }

            /**
             * Номер лицевого счета (иной идентификатор плательщика).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNumber() {
                return accountNumber;
            }

            /**
             * Sets the value of the accountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAccountNumber()
             */
            public void setAccountNumber(String value) {
                this.accountNumber = value;
            }

            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken)
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
             * Итого к оплате за расчетный период c учетом задолженности/переплаты, руб. (в рамках платежного реквизита)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayableWithDebtAndAdvance() {
                return totalPayableWithDebtAndAdvance;
            }

            /**
             * Sets the value of the totalPayableWithDebtAndAdvance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayableWithDebtAndAdvance()
             */
            public void setTotalPayableWithDebtAndAdvance(BigDecimal value) {
                this.totalPayableWithDebtAndAdvance = value;
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
         *         <element name="TotalPayableByPaymentInformation">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AccountNumber" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="30"/>
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
         *         <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
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
            "totalPayableByPaymentInformation",
            "accountNumber",
            "debtPreviousPeriodsOrAdvanceBillingPeriod",
            "totalPayableWithDebtAndAdvance"
        })
        public static class PaymentInformationDetails {

            /**
             * Сумма к оплате за расчетный период, руб. (в рамках платежного реквизита)
             * 
             */
            @XmlElement(name = "TotalPayableByPaymentInformation", required = true)
            protected BigDecimal totalPayableByPaymentInformation;
            /**
             * Номер лицевого счета (иной идентификатор плательщика).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken)
             * 
             */
            @XmlElement(name = "DebtPreviousPeriodsOrAdvanceBillingPeriod")
            protected BigDecimal debtPreviousPeriodsOrAdvanceBillingPeriod;
            /**
             * Итого к оплате за расчетный период c учетом задолженности/переплаты, руб. (в рамках платежного реквизита)
             * 
             */
            @XmlElement(name = "TotalPayableWithDebtAndAdvance")
            protected BigDecimal totalPayableWithDebtAndAdvance;

            /**
             * Сумма к оплате за расчетный период, руб. (в рамках платежного реквизита)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayableByPaymentInformation() {
                return totalPayableByPaymentInformation;
            }

            /**
             * Sets the value of the totalPayableByPaymentInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayableByPaymentInformation()
             */
            public void setTotalPayableByPaymentInformation(BigDecimal value) {
                this.totalPayableByPaymentInformation = value;
            }

            /**
             * Номер лицевого счета (иной идентификатор плательщика).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccountNumber() {
                return accountNumber;
            }

            /**
             * Sets the value of the accountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAccountNumber()
             */
            public void setAccountNumber(String value) {
                this.accountNumber = value;
            }

            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken)
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
             * Итого к оплате за расчетный период c учетом задолженности/переплаты, руб. (в рамках платежного реквизита)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayableWithDebtAndAdvance() {
                return totalPayableWithDebtAndAdvance;
            }

            /**
             * Sets the value of the totalPayableWithDebtAndAdvance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayableWithDebtAndAdvance()
             */
            public void setTotalPayableWithDebtAndAdvance(BigDecimal value) {
                this.totalPayableWithDebtAndAdvance = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationKeyType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "transportGUID"
    })
    public static class PaymentInformation
        extends PaymentInformationKeyType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
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
        "transportGUID",
        "paymentDocumentID"
    })
    public static class WithdrawPaymentDocument {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/", required = true)
        protected String paymentDocumentID;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Идентификатор платежного документа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentDocumentID() {
            return paymentDocumentID;
        }

        /**
         * Sets the value of the paymentDocumentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentDocumentID()
         */
        public void setPaymentDocumentID(String value) {
            this.paymentDocumentID = value;
        }

    }

}
