
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;
import ru.gosuslugi.dom.schema.integration.payments_base.PaymentInformationExportType;


/**
 * Тип данных для ответа на запрос экспорта платежных документов
 * 
 * <p>Java class for exportPaymentDocumentResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportPaymentDocumentResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="PaymentDocument">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PaymentDocumentExportType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *                   <element name="PaymentInformation" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
 *                           <sequence minOccurs="0">
 *                             <element name="TotalPayableByPaymentInformation" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="18"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <element name="AccountNumber" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="30"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
 *                             <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "exportPaymentDocumentResultType", propOrder = {
    "errorMessage",
    "paymentDocument"
})
public class ExportPaymentDocumentResultType {

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    @XmlElement(name = "PaymentDocument")
    protected ExportPaymentDocumentResultType.PaymentDocument paymentDocument;

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the paymentDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ExportPaymentDocumentResultType.PaymentDocument }
     *     
     */
    public ExportPaymentDocumentResultType.PaymentDocument getPaymentDocument() {
        return paymentDocument;
    }

    /**
     * Sets the value of the paymentDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPaymentDocumentResultType.PaymentDocument }
     *     
     */
    public void setPaymentDocument(ExportPaymentDocumentResultType.PaymentDocument value) {
        this.paymentDocument = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}PaymentDocumentExportType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
     *         <element name="PaymentInformation" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
     *                 <sequence minOccurs="0">
     *                   <element name="TotalPayableByPaymentInformation" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="18"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <element name="AccountNumber" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="30"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
     *                   <element name="DebtPreviousPeriodsOrAdvanceBillingPeriod" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="TotalPayableWithDebtAndAdvance" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </extension>
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
        "paymentDocumentID",
        "paymentInformation"
    })
    public static class PaymentDocument
        extends PaymentDocumentExportType
    {

        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/", required = true)
        protected String paymentDocumentID;
        /**
         * Сведения о платежных реквизитах получателя платежа
         * 
         */
        @XmlElement(name = "PaymentInformation", required = true)
        protected List<ExportPaymentDocumentResultType.PaymentDocument.PaymentInformation> paymentInformation;

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
         * Сведения о платежных реквизитах получателя платежа
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
         * {@link ExportPaymentDocumentResultType.PaymentDocument.PaymentInformation }
         * </p>
         * 
         * 
         * @return
         *     The value of the paymentInformation property.
         */
        public List<ExportPaymentDocumentResultType.PaymentDocument.PaymentInformation> getPaymentInformation() {
            if (paymentInformation == null) {
                paymentInformation = new ArrayList<>();
            }
            return this.paymentInformation;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
         *       <sequence minOccurs="0">
         *         <element name="TotalPayableByPaymentInformation" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="18"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <element name="AccountNumber" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="30"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
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
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "totalPayableByPaymentInformation",
            "paymentInformationGuid",
            "accountNumber",
            "serviceID",
            "debtPreviousPeriodsOrAdvanceBillingPeriod",
            "totalPayableWithDebtAndAdvance"
        })
        public static class PaymentInformation
            extends PaymentInformationExportType
        {

            /**
             * Сумма к оплате за расчетный период,руб. (в рамках платежного реквизита)
             * 
             */
            @XmlElement(name = "TotalPayableByPaymentInformation")
            protected BigDecimal totalPayableByPaymentInformation;
            /**
             * Идентификатор платежных реквизитов в платежном документе
             * 
             */
            @XmlElement(name = "PaymentInformationGuid")
            protected String paymentInformationGuid;
            /**
             * Номер лицевого счета (иной идентификатор плательщика).
             * Ссылка на приложение к приказу Минстроя РФ от 26.01.2018 N 43/пр - Раздел 3 примерной формы ПД
             * 
             */
            @XmlElement(name = "AccountNumber")
            protected String accountNumber;
            /**
             * Идентификатор жилищно-коммунальной услуги
             * 
             */
            @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
            protected String serviceID;
            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken).
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
             * Сумма к оплате за расчетный период,руб. (в рамках платежного реквизита)
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
             * Идентификатор платежных реквизитов в платежном документе
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
             * Идентификатор жилищно-коммунальной услуги
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceID() {
                return serviceID;
            }

            /**
             * Sets the value of the serviceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getServiceID()
             */
            public void setServiceID(String value) {
                this.serviceID = value;
            }

            /**
             * Задолженность за предыдущие периоды / Аванс на начало расчетного периода (учтены платежи, поступившие включительно до числа расчетного периода, указанного в tns:PaymentDocument/tns:PaymentsTaken).
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

}
