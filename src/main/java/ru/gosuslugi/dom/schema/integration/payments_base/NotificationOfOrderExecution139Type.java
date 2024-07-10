
package ru.gosuslugi.dom.schema.integration.payments_base;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Извещение о принятии к исполнению распоряжения
 * 
 * <p>Java class for NotificationOfOrderExecution139Type complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotificationOfOrderExecution139Type">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrderInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderID"/>
 *                   <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="Amount">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <minInclusive value="0"/>
 *                         <totalDigits value="16"/>
 *                         <fractionDigits value="0"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="OnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="MonthAndYear" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <choice>
 *                     <sequence>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
 *                       <element name="ServiceIDGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     </sequence>
 *                     <sequence>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *                       <element name="PaymentDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     </sequence>
 *                   </choice>
 *                   <element name="PaymentInformationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
@XmlType(name = "NotificationOfOrderExecution139Type", propOrder = {
    "orderInfo"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.payment.ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type.class
})
public class NotificationOfOrderExecution139Type {

    /**
     * Общие сведения о распоряжении
     * 
     */
    @XmlElement(name = "OrderInfo", required = true)
    protected NotificationOfOrderExecution139Type.OrderInfo orderInfo;

    /**
     * Общие сведения о распоряжении
     * 
     * @return
     *     possible object is
     *     {@link NotificationOfOrderExecution139Type.OrderInfo }
     *     
     */
    public NotificationOfOrderExecution139Type.OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOfOrderExecution139Type.OrderInfo }
     *     
     * @see #getOrderInfo()
     */
    public void setOrderInfo(NotificationOfOrderExecution139Type.OrderInfo value) {
        this.orderInfo = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderID"/>
     *         <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Amount">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <minInclusive value="0"/>
     *               <totalDigits value="16"/>
     *               <fractionDigits value="0"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="OnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="MonthAndYear" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <choice>
     *           <sequence>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
     *             <element name="ServiceIDGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           </sequence>
     *           <sequence>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
     *             <element name="PaymentDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           </sequence>
     *         </choice>
     *         <element name="PaymentInformationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
        "orderID",
        "orderDate",
        "amount",
        "onlinePayment",
        "monthAndYear",
        "serviceID",
        "serviceIDGUID",
        "paymentDocumentID",
        "paymentDocumentGUID",
        "paymentInformationGUID"
    })
    public static class OrderInfo {

        /**
         * Уникальный номер платежа (идентификатор операции)
         * 
         */
        @XmlElement(name = "OrderID", required = true)
        protected String orderID;
        /**
         * Дата
         * 
         */
        @XmlElement(name = "OrderDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar orderDate;
        /**
         * Сумма оплаты (в копейках)
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
         * Месяц и год
         * 
         */
        @XmlElement(name = "MonthAndYear")
        protected NotificationOfOrderExecution139Type.OrderInfo.MonthAndYear monthAndYear;
        /**
         * Идентификатор жилищно-коммунальной услуги
         * 
         */
        @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
        protected String serviceID;
        /**
         * GUID жилищно-коммунальной услуги
         * 
         */
        @XmlElement(name = "ServiceIDGUID")
        protected String serviceIDGUID;
        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
        protected String paymentDocumentID;
        /**
         * GUID платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentGUID")
        protected String paymentDocumentGUID;
        /**
         * Идентификатор платежных реквизитов в платежном документе
         * 
         */
        @XmlElement(name = "PaymentInformationGUID")
        protected String paymentInformationGUID;

        /**
         * Уникальный номер платежа (идентификатор операции)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderID() {
            return orderID;
        }

        /**
         * Sets the value of the orderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrderID()
         */
        public void setOrderID(String value) {
            this.orderID = value;
        }

        /**
         * Дата
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
         * Сумма оплаты (в копейках)
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
         * Месяц и год
         * 
         * @return
         *     possible object is
         *     {@link NotificationOfOrderExecution139Type.OrderInfo.MonthAndYear }
         *     
         */
        public NotificationOfOrderExecution139Type.OrderInfo.MonthAndYear getMonthAndYear() {
            return monthAndYear;
        }

        /**
         * Sets the value of the monthAndYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationOfOrderExecution139Type.OrderInfo.MonthAndYear }
         *     
         * @see #getMonthAndYear()
         */
        public void setMonthAndYear(NotificationOfOrderExecution139Type.OrderInfo.MonthAndYear value) {
            this.monthAndYear = value;
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
         * GUID жилищно-коммунальной услуги
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceIDGUID() {
            return serviceIDGUID;
        }

        /**
         * Sets the value of the serviceIDGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getServiceIDGUID()
         */
        public void setServiceIDGUID(String value) {
            this.serviceIDGUID = value;
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

        /**
         * Идентификатор платежных реквизитов в платежном документе
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentInformationGUID() {
            return paymentInformationGUID;
        }

        /**
         * Sets the value of the paymentInformationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentInformationGUID()
         */
        public void setPaymentInformationGUID(String value) {
            this.paymentInformationGUID = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
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
            "year",
            "month"
        })
        public static class MonthAndYear {

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
            @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected int month;

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

        }

    }

}
