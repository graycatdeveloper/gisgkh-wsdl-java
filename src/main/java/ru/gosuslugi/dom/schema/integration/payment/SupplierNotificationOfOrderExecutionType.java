
package ru.gosuslugi.dom.schema.integration.payment;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Извещение о принятии к исполнению распоряжения, размещаемое исполнителем
 * 
 * <p>Java class for SupplierNotificationOfOrderExecutionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SupplierNotificationOfOrderExecutionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="OrderPeriod" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
 *         </choice>
 *         <element name="Amount">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType">
 *               <totalDigits value="13"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="OnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierNotificationOfOrderExecutionType", propOrder = {
    "orderDate",
    "orderPeriod",
    "paymentDocumentID",
    "serviceID",
    "amount",
    "onlinePayment"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.payment.ImportSupplierNotificationsOfOrderExecutionRequest.SupplierNotificationOfOrderExecution.class
})
public class SupplierNotificationOfOrderExecutionType {

    /**
     * Дата внесения платы (в случае отсутствия: дата поступления средств)
     * 
     */
    @XmlElement(name = "OrderDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    /**
     * Период, за который вносится плата
     * 
     */
    @XmlElement(name = "OrderPeriod")
    protected SupplierNotificationOfOrderExecutionType.OrderPeriod orderPeriod;
    /**
     * Идентификатор платежного документа
     * 
     */
    @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
    protected String paymentDocumentID;
    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected String serviceID;
    /**
     * Сумма
     * 
     */
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    /**
     * Признак онлайн-оплаты
     * 
     */
    @XmlElement(name = "OnlinePayment")
    protected Boolean onlinePayment;

    /**
     * Дата внесения платы (в случае отсутствия: дата поступления средств)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOrderDate()
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Период, за который вносится плата
     * 
     * @return
     *     possible object is
     *     {@link SupplierNotificationOfOrderExecutionType.OrderPeriod }
     *     
     */
    public SupplierNotificationOfOrderExecutionType.OrderPeriod getOrderPeriod() {
        return orderPeriod;
    }

    /**
     * Sets the value of the orderPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierNotificationOfOrderExecutionType.OrderPeriod }
     *     
     * @see #getOrderPeriod()
     */
    public void setOrderPeriod(SupplierNotificationOfOrderExecutionType.OrderPeriod value) {
        this.orderPeriod = value;
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
     * Сумма
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAmount()
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Признак онлайн-оплаты
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlinePayment() {
        return onlinePayment;
    }

    /**
     * Sets the value of the onlinePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOnlinePayment()
     */
    public void setOnlinePayment(Boolean value) {
        this.onlinePayment = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
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
        "month",
        "year"
    })
    public static class OrderPeriod {

        /**
         * Месяц
         * 
         */
        @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected int month;
        /**
         * Год
         * 
         */
        @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected short year;

        /**
         * Месяц
         * 
         */
        public int getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         */
        public void setMonth(int value) {
            this.month = value;
        }

        /**
         * Год
         * 
         */
        public short getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         */
        public void setYear(short value) {
            this.year = value;
        }

    }

}
