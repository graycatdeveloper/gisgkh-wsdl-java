
package ru.gosuslugi.dom.schema.integration.payment;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
 *         <sequence>
 *           <element name="PaymentDocumentDetails" type="{http://dom.gosuslugi.ru/schema/integration/payment/}PaymentDocumentDetailsType"/>
 *         </sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month" minOccurs="0"/>
 *         <element name="PaymentDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
    "paymentDocumentID",
    "paymentDocumentNumber",
    "unifiedAccountNumber",
    "accountNumber",
    "serviceID",
    "paymentDocumentDetails",
    "year",
    "month",
    "paymentDocumentGUID"
})
@XmlRootElement(name = "PaymentDocument")
public class PaymentDocument {

    /**
     * Идентификатор платежного документа
     * 
     */
    @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
    protected String paymentDocumentID;
    /**
     * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
     * 
     */
    @XmlElement(name = "PaymentDocumentNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
    protected String paymentDocumentNumber;
    /**
     * Единый лицевой счет
     * 
     */
    @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected String unifiedAccountNumber;
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
     * Платежный документ
     * 
     */
    @XmlElement(name = "PaymentDocumentDetails", required = true)
    protected PaymentDocumentDetailsType paymentDocumentDetails;
    /**
     * Год
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Short year;
    /**
     * Месяц
     * 
     */
    @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Integer month;
    /**
     * GUID платежного документа
     * 
     */
    @XmlElement(name = "PaymentDocumentGUID")
    protected String paymentDocumentGUID;

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
     * Единый лицевой счет
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnifiedAccountNumber() {
        return unifiedAccountNumber;
    }

    /**
     * Sets the value of the unifiedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnifiedAccountNumber()
     */
    public void setUnifiedAccountNumber(String value) {
        this.unifiedAccountNumber = value;
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
     * Платежный документ
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocumentDetailsType }
     *     
     */
    public PaymentDocumentDetailsType getPaymentDocumentDetails() {
        return paymentDocumentDetails;
    }

    /**
     * Sets the value of the paymentDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocumentDetailsType }
     *     
     * @see #getPaymentDocumentDetails()
     */
    public void setPaymentDocumentDetails(PaymentDocumentDetailsType value) {
        this.paymentDocumentDetails = value;
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
     * GUID платежного документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDocumentGUID() {
        return paymentDocumentGUID;
    }

    /**
     * Sets the value of the paymentDocumentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentDocumentGUID()
     */
    public void setPaymentDocumentGUID(String value) {
        this.paymentDocumentGUID = value;
    }

}
