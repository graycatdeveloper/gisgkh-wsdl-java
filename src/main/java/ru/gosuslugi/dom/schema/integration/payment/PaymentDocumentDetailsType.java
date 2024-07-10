
package ru.gosuslugi.dom.schema.integration.payment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;
import ru.gosuslugi.dom.schema.integration.payments_base.PaymentInformationExportType;


/**
 * Реквизиты и свойства платежного документа
 * 
 * <p>Java class for PaymentDocumentDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentDocumentDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConsumerInformation" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice minOccurs="0">
 *                     <element name="Entpr">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Legal">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Name">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <maxLength value="160"/>
 *                                     <minLength value="1"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                   <element name="address" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             <element name="area" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="120"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="city" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <maxLength value="120"/>
 *                                   <minLength value="1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="place" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="120"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="street" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="120"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="housenum" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="20"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                             <element name="buildnum" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="10"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="strucnum" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="10"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="apartment" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="255"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="placement" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="255"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="address_string">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <maxLength value="2500"/>
 *                                   <minLength value="1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="residential_block" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="255"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="residential_block_room" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="255"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="non_residential_block" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="255"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ExecutorInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                   <choice>
 *                     <element name="Entpr" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
 *                     <element name="Legal">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
 *                               <element name="Name">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <maxLength value="4000"/>
 *                                     <minLength value="1"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                   <element name="PaymentInformation" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
 *                           <sequence>
 *                             <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <element name="Reminder" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
 *                             <choice minOccurs="0">
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *                               <sequence>
 *                                 <element name="DebtOrAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
 *                                 <element name="TotalWithDebtAndAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
 *                               </sequence>
 *                             </choice>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MailingAddress">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1000"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Reminder" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *           <sequence>
 *             <element name="Debt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
 *             <element name="TotalWithDebtAndAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}Purpose" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}PDServiceName" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDocumentDetailsType", propOrder = {
    "consumerInformation",
    "executorInformation",
    "reminder",
    "errorMessage",
    "debt",
    "totalWithDebtAndAdvance",
    "purpose",
    "pdServiceName"
})
public class PaymentDocumentDetailsType {

    /**
     * Сведения о потребителе
     * 
     */
    @XmlElement(name = "ConsumerInformation")
    protected PaymentDocumentDetailsType.ConsumerInformation consumerInformation;
    /**
     * Cведения об исполнителе
     * 
     */
    @XmlElement(name = "ExecutorInformation", required = true)
    protected PaymentDocumentDetailsType.ExecutorInformation executorInformation;
    /**
     * Сумма к оплате за расчетный период по всему платежному документу (в копейках)
     * 
     */
    @XmlElement(name = "Reminder", required = true)
    protected BigDecimal reminder;
    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    /**
     * Задолженность (в копейках)
     * 
     */
    @XmlElement(name = "Debt")
    protected BigDecimal debt;
    /**
     * Итого к оплате c учетом задолженности/переплаты по всему платежному документу (в копейках)
     * 
     */
    @XmlElement(name = "TotalWithDebtAndAdvance")
    protected BigDecimal totalWithDebtAndAdvance;
    /**
     * Назначение платежа
     * 
     */
    @XmlElement(name = "Purpose")
    protected String purpose;
    /**
     * Наименование услуги (работы), оказываемой (выполняемой) исполнителем, штрафной санкции
     * 
     */
    @XmlElement(name = "PDServiceName")
    protected String pdServiceName;

    /**
     * Сведения о потребителе
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentDetailsType.ConsumerInformation }
     *     
     */
    public PaymentDocumentDetailsType.ConsumerInformation getConsumerInformation() {
        return consumerInformation;
    }

    /**
     * Sets the value of the consumerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentDetailsType.ConsumerInformation }
     *     
     * @see #getConsumerInformation()
     */
    public void setConsumerInformation(PaymentDocumentDetailsType.ConsumerInformation value) {
        this.consumerInformation = value;
    }

    /**
     * Cведения об исполнителе
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentDetailsType.ExecutorInformation }
     *     
     */
    public PaymentDocumentDetailsType.ExecutorInformation getExecutorInformation() {
        return executorInformation;
    }

    /**
     * Sets the value of the executorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentDetailsType.ExecutorInformation }
     *     
     * @see #getExecutorInformation()
     */
    public void setExecutorInformation(PaymentDocumentDetailsType.ExecutorInformation value) {
        this.executorInformation = value;
    }

    /**
     * Сумма к оплате за расчетный период по всему платежному документу (в копейках)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReminder() {
        return reminder;
    }

    /**
     * Sets the value of the reminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getReminder()
     */
    public void setReminder(BigDecimal value) {
        this.reminder = value;
    }

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
     * Задолженность (в копейках)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDebt()
     */
    public void setDebt(BigDecimal value) {
        this.debt = value;
    }

    /**
     * Итого к оплате c учетом задолженности/переплаты по всему платежному документу (в копейках)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalWithDebtAndAdvance() {
        return totalWithDebtAndAdvance;
    }

    /**
     * Sets the value of the totalWithDebtAndAdvance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalWithDebtAndAdvance()
     */
    public void setTotalWithDebtAndAdvance(BigDecimal value) {
        this.totalWithDebtAndAdvance = value;
    }

    /**
     * Назначение платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPurpose()
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Наименование услуги (работы), оказываемой (выполняемой) исполнителем, штрафной санкции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDServiceName() {
        return pdServiceName;
    }

    /**
     * Sets the value of the pdServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPDServiceName()
     */
    public void setPDServiceName(String value) {
        this.pdServiceName = value;
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
     *         <choice minOccurs="0">
     *           <element name="Entpr">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Legal">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Name">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <maxLength value="160"/>
     *                           <minLength value="1"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <element name="address" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   <element name="area" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="120"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="city" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="120"/>
     *                         <minLength value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="place" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="120"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="street" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="120"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="housenum" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="20"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *                   <element name="buildnum" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="10"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="strucnum" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="10"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="apartment" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="255"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="placement" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="255"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="address_string">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="2500"/>
     *                         <minLength value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="residential_block" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="255"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="residential_block_room" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="255"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="non_residential_block" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="255"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
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
    @XmlType(name = "", propOrder = {
        "entpr",
        "legal",
        "address"
    })
    public static class ConsumerInformation {

        /**
         * Потребитель-индивидуальный предприниматель
         * 
         */
        @XmlElement(name = "Entpr")
        protected PaymentDocumentDetailsType.ConsumerInformation.Entpr entpr;
        /**
         * Потребитель-юридическое лицо
         * 
         */
        @XmlElement(name = "Legal")
        protected PaymentDocumentDetailsType.ConsumerInformation.Legal legal;
        /**
         * Адрес помещения
         * 
         */
        @XmlElement(required = true)
        protected List<PaymentDocumentDetailsType.ConsumerInformation.Address> address;

        /**
         * Потребитель-индивидуальный предприниматель
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentDetailsType.ConsumerInformation.Entpr }
         *     
         */
        public PaymentDocumentDetailsType.ConsumerInformation.Entpr getEntpr() {
            return entpr;
        }

        /**
         * Sets the value of the entpr property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentDetailsType.ConsumerInformation.Entpr }
         *     
         * @see #getEntpr()
         */
        public void setEntpr(PaymentDocumentDetailsType.ConsumerInformation.Entpr value) {
            this.entpr = value;
        }

        /**
         * Потребитель-юридическое лицо
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentDetailsType.ConsumerInformation.Legal }
         *     
         */
        public PaymentDocumentDetailsType.ConsumerInformation.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentDetailsType.ConsumerInformation.Legal }
         *     
         * @see #getLegal()
         */
        public void setLegal(PaymentDocumentDetailsType.ConsumerInformation.Legal value) {
            this.legal = value;
        }

        /**
         * Адрес помещения
         * 
         * Gets the value of the address property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentDocumentDetailsType.ConsumerInformation.Address }
         * </p>
         * 
         * 
         * @return
         *     The value of the address property.
         */
        public List<PaymentDocumentDetailsType.ConsumerInformation.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<>();
            }
            return this.address;
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
         *         <element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         <element name="area" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="120"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="city" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="120"/>
         *               <minLength value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="place" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="120"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="street" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="120"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="housenum" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="20"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
         *         <element name="buildnum" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="10"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="strucnum" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="10"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="apartment" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="255"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="placement" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="255"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="address_string">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="2500"/>
         *               <minLength value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="residential_block" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="255"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="residential_block_room" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="255"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="non_residential_block" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="255"/>
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
            "region",
            "area",
            "city",
            "place",
            "street",
            "housenum",
            "fiasHouseGuid",
            "buildnum",
            "strucnum",
            "apartment",
            "placement",
            "addressString",
            "residentialBlock",
            "residentialBlockRoom",
            "nonResidentialBlock"
        })
        public static class Address {

            /**
             * Субъект РФ
             * 
             */
            @XmlElement(required = true)
            protected String region;
            /**
             * Район
             * 
             */
            protected String area;
            /**
             * Город
             * 
             */
            protected String city;
            /**
             * Населенный пункт
             * 
             */
            protected String place;
            /**
             * Улица
             * 
             */
            protected String street;
            /**
             * Номер дома
             * 
             */
            protected String housenum;
            /**
             * Глобальный уникальный идентификатор дома по ФИАС
             * 
             */
            @XmlElement(name = "FIASHouseGuid", required = true)
            protected String fiasHouseGuid;
            /**
             * Номер корпуса
             * 
             */
            protected String buildnum;
            /**
             * Номер строения
             * 
             */
            protected String strucnum;
            /**
             * Номер жилого помещения
             * 
             */
            protected String apartment;
            /**
             * Номер комнаты жилого помещения
             * 
             */
            protected String placement;
            /**
             * Неформализованное описание адреса
             * 
             */
            @XmlElement(name = "address_string", required = true)
            protected String addressString;
            /**
             * Номер жилого блока
             * 
             */
            @XmlElement(name = "residential_block")
            protected String residentialBlock;
            /**
             * Номер комнаты жилого блока
             * 
             */
            @XmlElement(name = "residential_block_room")
            protected String residentialBlockRoom;
            /**
             * Номер нежилого блока
             * 
             */
            @XmlElement(name = "non_residential_block")
            protected String nonResidentialBlock;

            /**
             * Субъект РФ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegion() {
                return region;
            }

            /**
             * Sets the value of the region property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getRegion()
             */
            public void setRegion(String value) {
                this.region = value;
            }

            /**
             * Район
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArea() {
                return area;
            }

            /**
             * Sets the value of the area property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getArea()
             */
            public void setArea(String value) {
                this.area = value;
            }

            /**
             * Город
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCity()
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Населенный пункт
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlace() {
                return place;
            }

            /**
             * Sets the value of the place property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPlace()
             */
            public void setPlace(String value) {
                this.place = value;
            }

            /**
             * Улица
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getStreet()
             */
            public void setStreet(String value) {
                this.street = value;
            }

            /**
             * Номер дома
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHousenum() {
                return housenum;
            }

            /**
             * Sets the value of the housenum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getHousenum()
             */
            public void setHousenum(String value) {
                this.housenum = value;
            }

            /**
             * Глобальный уникальный идентификатор дома по ФИАС
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIASHouseGuid() {
                return fiasHouseGuid;
            }

            /**
             * Sets the value of the fiasHouseGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getFIASHouseGuid()
             */
            public void setFIASHouseGuid(String value) {
                this.fiasHouseGuid = value;
            }

            /**
             * Номер корпуса
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildnum() {
                return buildnum;
            }

            /**
             * Sets the value of the buildnum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getBuildnum()
             */
            public void setBuildnum(String value) {
                this.buildnum = value;
            }

            /**
             * Номер строения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStrucnum() {
                return strucnum;
            }

            /**
             * Sets the value of the strucnum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getStrucnum()
             */
            public void setStrucnum(String value) {
                this.strucnum = value;
            }

            /**
             * Номер жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApartment() {
                return apartment;
            }

            /**
             * Sets the value of the apartment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getApartment()
             */
            public void setApartment(String value) {
                this.apartment = value;
            }

            /**
             * Номер комнаты жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlacement() {
                return placement;
            }

            /**
             * Sets the value of the placement property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPlacement()
             */
            public void setPlacement(String value) {
                this.placement = value;
            }

            /**
             * Неформализованное описание адреса
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressString() {
                return addressString;
            }

            /**
             * Sets the value of the addressString property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAddressString()
             */
            public void setAddressString(String value) {
                this.addressString = value;
            }

            /**
             * Номер жилого блока
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidentialBlock() {
                return residentialBlock;
            }

            /**
             * Sets the value of the residentialBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getResidentialBlock()
             */
            public void setResidentialBlock(String value) {
                this.residentialBlock = value;
            }

            /**
             * Номер комнаты жилого блока
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidentialBlockRoom() {
                return residentialBlockRoom;
            }

            /**
             * Sets the value of the residentialBlockRoom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getResidentialBlockRoom()
             */
            public void setResidentialBlockRoom(String value) {
                this.residentialBlockRoom = value;
            }

            /**
             * Номер нежилого блока
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonResidentialBlock() {
                return nonResidentialBlock;
            }

            /**
             * Sets the value of the nonResidentialBlock property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getNonResidentialBlock()
             */
            public void setNonResidentialBlock(String value) {
                this.nonResidentialBlock = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
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
            "inn"
        })
        public static class Entpr {

            /**
             * ИНН
             * 
             */
            @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String inn;

            /**
             * ИНН
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getINN()
             */
            public void setINN(String value) {
                this.inn = value;
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
         *         <element name="Name">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="160"/>
         *               <minLength value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
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
            "name",
            "kpp",
            "inn"
        })
        public static class Legal {

            /**
             * Наименование
             * 
             */
            @XmlElement(name = "Name", required = true)
            protected String name;
            /**
             * КПП
             * 
             */
            @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String kpp;
            /**
             * ИНН
             * 
             */
            @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String inn;

            /**
             * Наименование
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getName()
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * КПП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getKPP()
             */
            public void setKPP(String value) {
                this.kpp = value;
            }

            /**
             * ИНН
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getINN()
             */
            public void setINN(String value) {
                this.inn = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
     *         <choice>
     *           <element name="Entpr" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
     *           <element name="Legal">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
     *                     <element name="Name">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <maxLength value="4000"/>
     *                           <minLength value="1"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <element name="PaymentInformation" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
     *                 <sequence>
     *                   <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <element name="Reminder" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
     *                   <choice minOccurs="0">
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
     *                     <sequence>
     *                       <element name="DebtOrAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
     *                       <element name="TotalWithDebtAndAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
     *                     </sequence>
     *                   </choice>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MailingAddress">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
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
        "inn",
        "entpr",
        "legal",
        "paymentInformation",
        "mailingAddress"
    })
    public static class ExecutorInformation {

        /**
         * ИНН
         * 
         */
        @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
        protected String inn;
        /**
         * Исполнитель-ИП
         * 
         */
        @XmlElement(name = "Entpr")
        protected FIOType entpr;
        /**
         * Исполнитель-ЮЛ
         * 
         */
        @XmlElement(name = "Legal")
        protected PaymentDocumentDetailsType.ExecutorInformation.Legal legal;
        /**
         * Сведения о платежных реквизитах
         * 
         */
        @XmlElement(name = "PaymentInformation", required = true)
        protected List<PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation> paymentInformation;
        /**
         * Почтовый адрес
         * 
         */
        @XmlElement(name = "MailingAddress", required = true)
        protected String mailingAddress;

        /**
         * ИНН
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINN() {
            return inn;
        }

        /**
         * Sets the value of the inn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getINN()
         */
        public void setINN(String value) {
            this.inn = value;
        }

        /**
         * Исполнитель-ИП
         * 
         * @return
         *     possible object is
         *     {@link FIOType }
         *     
         */
        public FIOType getEntpr() {
            return entpr;
        }

        /**
         * Sets the value of the entpr property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIOType }
         *     
         * @see #getEntpr()
         */
        public void setEntpr(FIOType value) {
            this.entpr = value;
        }

        /**
         * Исполнитель-ЮЛ
         * 
         * @return
         *     possible object is
         *     {@link PaymentDocumentDetailsType.ExecutorInformation.Legal }
         *     
         */
        public PaymentDocumentDetailsType.ExecutorInformation.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentDocumentDetailsType.ExecutorInformation.Legal }
         *     
         * @see #getLegal()
         */
        public void setLegal(PaymentDocumentDetailsType.ExecutorInformation.Legal value) {
            this.legal = value;
        }

        /**
         * Сведения о платежных реквизитах
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
         * {@link PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation }
         * </p>
         * 
         * 
         * @return
         *     The value of the paymentInformation property.
         */
        public List<PaymentDocumentDetailsType.ExecutorInformation.PaymentInformation> getPaymentInformation() {
            if (paymentInformation == null) {
                paymentInformation = new ArrayList<>();
            }
            return this.paymentInformation;
        }

        /**
         * Почтовый адрес
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMailingAddress() {
            return mailingAddress;
        }

        /**
         * Sets the value of the mailingAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMailingAddress()
         */
        public void setMailingAddress(String value) {
            this.mailingAddress = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
         *         <element name="Name">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="4000"/>
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
            "kpp",
            "name"
        })
        public static class Legal {

            /**
             * КПП
             * 
             */
            @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String kpp;
            /**
             * Наименование
             * 
             */
            @XmlElement(name = "Name", required = true)
            protected String name;

            /**
             * КПП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getKPP()
             */
            public void setKPP(String value) {
                this.kpp = value;
            }

            /**
             * Наименование
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getName()
             */
            public void setName(String value) {
                this.name = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
         *       <sequence>
         *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <element name="Reminder" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
         *         <choice minOccurs="0">
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
         *           <sequence>
         *             <element name="DebtOrAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
         *             <element name="TotalWithDebtAndAdvance" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckType" minOccurs="0"/>
         *           </sequence>
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
            "paymentInformationGuid",
            "reminder",
            "accountNumber",
            "serviceID",
            "errorMessage",
            "debtOrAdvance",
            "totalWithDebtAndAdvance"
        })
        public static class PaymentInformation
            extends PaymentInformationExportType
        {

            /**
             * Идентификатор платежных реквизитов организации
             * 
             */
            @XmlElement(name = "PaymentInformationGuid")
            protected String paymentInformationGuid;
            /**
             * Сумма к оплате за расчетный период по получателю платежа (в копейках)
             * 
             */
            @XmlElement(name = "Reminder")
            protected BigDecimal reminder;
            /**
             * Номер лицевого счета/Иной идентификатор плательщика
             * 
             */
            @XmlElement(name = "AccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
            protected String accountNumber;
            /**
             * Идентификатор жилищно-коммунальной услуги
             * 
             */
            @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
            protected String serviceID;
            /**
             * Описание ошибок контролей или бизнес-процесса
             * 
             */
            @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected ErrorMessageType errorMessage;
            /**
             * Задолженность за предыдущие периоды/Аванс на начало расчетного периода (учтены платежи, поступившие до 25 числа включительно) по получателю платежа (в копейках)
             * 
             */
            @XmlElement(name = "DebtOrAdvance")
            protected BigDecimal debtOrAdvance;
            /**
             * Итого к оплате c учетом задолженности/переплаты по получателю платежа (в копейках)
             * 
             */
            @XmlElement(name = "TotalWithDebtAndAdvance")
            protected BigDecimal totalWithDebtAndAdvance;

            /**
             * Идентификатор платежных реквизитов организации
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
             * Сумма к оплате за расчетный период по получателю платежа (в копейках)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getReminder() {
                return reminder;
            }

            /**
             * Sets the value of the reminder property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getReminder()
             */
            public void setReminder(BigDecimal value) {
                this.reminder = value;
            }

            /**
             * Номер лицевого счета/Иной идентификатор плательщика
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
             * Задолженность за предыдущие периоды/Аванс на начало расчетного периода (учтены платежи, поступившие до 25 числа включительно) по получателю платежа (в копейках)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebtOrAdvance() {
                return debtOrAdvance;
            }

            /**
             * Sets the value of the debtOrAdvance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDebtOrAdvance()
             */
            public void setDebtOrAdvance(BigDecimal value) {
                this.debtOrAdvance = value;
            }

            /**
             * Итого к оплате c учетом задолженности/переплаты по получателю платежа (в копейках)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalWithDebtAndAdvance() {
                return totalWithDebtAndAdvance;
            }

            /**
             * Sets the value of the totalWithDebtAndAdvance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalWithDebtAndAdvance()
             */
            public void setTotalWithDebtAndAdvance(BigDecimal value) {
                this.totalWithDebtAndAdvance = value;
            }

        }

    }

}
