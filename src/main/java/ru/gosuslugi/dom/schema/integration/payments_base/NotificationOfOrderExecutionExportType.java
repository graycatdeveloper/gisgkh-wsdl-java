
package ru.gosuslugi.dom.schema.integration.payments_base;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;


/**
 * Извещение о принятии к исполнению распоряжения
 * 
 * <p>Java class for NotificationOfOrderExecutionExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotificationOfOrderExecutionExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SupplierInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="SupplierID" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="25"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="SupplierName" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="160"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="RecipientInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                   <choice minOccurs="0">
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
 *                     <element name="EntprFIO">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="160"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </choice>
 *                   <element name="PaymentInformation" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OrderInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
 *                   <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="OrderNum" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="9"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Amount" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckPositiveType"/>
 *                   <element name="PaymentPurpose" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1000"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="OnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="Comment" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="210"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
 *                     <sequence>
 *                       <element name="PaymentDocumentNumber" minOccurs="0">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                             <minLength value="1"/>
 *                             <maxLength value="30"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <sequence minOccurs="0">
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                       </sequence>
 *                       <sequence>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber" minOccurs="0"/>
 *                         <element name="AddressAndConsumer" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 <sequence>
 *                                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *                                   <choice minOccurs="0">
 *                                     <sequence>
 *                                       <element name="Apartment" minOccurs="0">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="255"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                       <element name="Placement" minOccurs="0">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="255"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                     </sequence>
 *                                     <element name="NonLivingApartment">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="255"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </element>
 *                                     <sequence>
 *                                       <element name="ResidentialBlock" minOccurs="0">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="255"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                       <element name="ResidentialBlockRoom" minOccurs="0">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="255"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                     </sequence>
 *                                     <element name="NonResidentialBlock">
 *                                       <simpleType>
 *                                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           <minLength value="1"/>
 *                                           <maxLength value="255"/>
 *                                         </restriction>
 *                                       </simpleType>
 *                                     </element>
 *                                   </choice>
 *                                   <choice minOccurs="0">
 *                                     <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
 *                                     <element name="INN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
 *                                   </choice>
 *                                 </sequence>
 *                               </restriction>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                         <element name="Service" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                 <sequence>
 *                                   <element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                 </sequence>
 *                               </restriction>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                         <element name="AccountNumber" minOccurs="0">
 *                           <simpleType>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               <minLength value="1"/>
 *                               <maxLength value="30"/>
 *                             </restriction>
 *                           </simpleType>
 *                         </element>
 *                       </sequence>
 *                     </sequence>
 *                   </sequence>
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
@XmlType(name = "NotificationOfOrderExecutionExportType", propOrder = {
    "supplierInfo",
    "recipientInfo",
    "orderInfo"
})
public class NotificationOfOrderExecutionExportType {

    /**
     * Сведения о потребителе
     * 
     */
    @XmlElement(name = "SupplierInfo")
    protected NotificationOfOrderExecutionExportType.SupplierInfo supplierInfo;
    /**
     * Сведения об исполнителе
     * 
     */
    @XmlElement(name = "RecipientInfo")
    protected NotificationOfOrderExecutionExportType.RecipientInfo recipientInfo;
    /**
     * Общие сведения о распоряжении
     * 
     */
    @XmlElement(name = "OrderInfo", required = true)
    protected NotificationOfOrderExecutionExportType.OrderInfo orderInfo;

    /**
     * Сведения о потребителе
     * 
     * @return
     *     possible object is
     *     {@link NotificationOfOrderExecutionExportType.SupplierInfo }
     *     
     */
    public NotificationOfOrderExecutionExportType.SupplierInfo getSupplierInfo() {
        return supplierInfo;
    }

    /**
     * Sets the value of the supplierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOfOrderExecutionExportType.SupplierInfo }
     *     
     * @see #getSupplierInfo()
     */
    public void setSupplierInfo(NotificationOfOrderExecutionExportType.SupplierInfo value) {
        this.supplierInfo = value;
    }

    /**
     * Сведения об исполнителе
     * 
     * @return
     *     possible object is
     *     {@link NotificationOfOrderExecutionExportType.RecipientInfo }
     *     
     */
    public NotificationOfOrderExecutionExportType.RecipientInfo getRecipientInfo() {
        return recipientInfo;
    }

    /**
     * Sets the value of the recipientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOfOrderExecutionExportType.RecipientInfo }
     *     
     * @see #getRecipientInfo()
     */
    public void setRecipientInfo(NotificationOfOrderExecutionExportType.RecipientInfo value) {
        this.recipientInfo = value;
    }

    /**
     * Общие сведения о распоряжении
     * 
     * @return
     *     possible object is
     *     {@link NotificationOfOrderExecutionExportType.OrderInfo }
     *     
     */
    public NotificationOfOrderExecutionExportType.OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationOfOrderExecutionExportType.OrderInfo }
     *     
     * @see #getOrderInfo()
     */
    public void setOrderInfo(NotificationOfOrderExecutionExportType.OrderInfo value) {
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
     *         <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
     *         <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="OrderNum" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="9"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Amount" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyKopeckPositiveType"/>
     *         <element name="PaymentPurpose" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="OnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="Comment" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="210"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
     *           <sequence>
     *             <element name="PaymentDocumentNumber" minOccurs="0">
     *               <simpleType>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   <minLength value="1"/>
     *                   <maxLength value="30"/>
     *                 </restriction>
     *               </simpleType>
     *             </element>
     *             <sequence minOccurs="0">
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *             </sequence>
     *             <sequence>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber" minOccurs="0"/>
     *               <element name="AddressAndConsumer" minOccurs="0">
     *                 <complexType>
     *                   <complexContent>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                       <sequence>
     *                         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
     *                         <choice minOccurs="0">
     *                           <sequence>
     *                             <element name="Apartment" minOccurs="0">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="255"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                             <element name="Placement" minOccurs="0">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="255"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                           </sequence>
     *                           <element name="NonLivingApartment">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="255"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </element>
     *                           <sequence>
     *                             <element name="ResidentialBlock" minOccurs="0">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="255"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                             <element name="ResidentialBlockRoom" minOccurs="0">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="255"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                           </sequence>
     *                           <element name="NonResidentialBlock">
     *                             <simpleType>
     *                               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 <minLength value="1"/>
     *                                 <maxLength value="255"/>
     *                               </restriction>
     *                             </simpleType>
     *                           </element>
     *                         </choice>
     *                         <choice minOccurs="0">
     *                           <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
     *                           <element name="INN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
     *                         </choice>
     *                       </sequence>
     *                     </restriction>
     *                   </complexContent>
     *                 </complexType>
     *               </element>
     *               <element name="Service" minOccurs="0">
     *                 <complexType>
     *                   <complexContent>
     *                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                       <sequence>
     *                         <element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                       </sequence>
     *                     </restriction>
     *                   </complexContent>
     *                 </complexType>
     *               </element>
     *               <element name="AccountNumber" minOccurs="0">
     *                 <simpleType>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                     <minLength value="1"/>
     *                     <maxLength value="30"/>
     *                   </restriction>
     *                 </simpleType>
     *               </element>
     *             </sequence>
     *           </sequence>
     *         </sequence>
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
        "orderNum",
        "amount",
        "paymentPurpose",
        "onlinePayment",
        "comment",
        "paymentDocumentID",
        "paymentDocumentNumber",
        "year",
        "month",
        "unifiedAccountNumber",
        "addressAndConsumer",
        "service",
        "accountNumber"
    })
    public static class OrderInfo {

        /**
         * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0 (тип)
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
         * Номер распоряжения
         * 
         */
        @XmlElement(name = "OrderNum")
        protected String orderNum;
        /**
         * Сумма оплаты (в копейках)
         * 
         */
        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;
        /**
         * Назначение платежа
         * 
         */
        @XmlElement(name = "PaymentPurpose")
        protected String paymentPurpose;
        /**
         * Признак онлайн-оплаты
         * 
         */
        @XmlElement(name = "OnlinePayment")
        protected Boolean onlinePayment;
        /**
         * Произвольный комментарий
         * 
         */
        @XmlElement(name = "Comment")
        protected String comment;
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
        @XmlElement(name = "PaymentDocumentNumber")
        protected String paymentDocumentNumber;
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
         * Единый лицевой счет
         * 
         */
        @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
        protected String unifiedAccountNumber;
        /**
         * Адрес помещения и реквизиты потребителя
         * 
         */
        @XmlElement(name = "AddressAndConsumer")
        protected NotificationOfOrderExecutionExportType.OrderInfo.AddressAndConsumer addressAndConsumer;
        /**
         * Жилищно-коммунальная услуга
         * 
         */
        @XmlElement(name = "Service")
        protected NotificationOfOrderExecutionExportType.OrderInfo.Service service;
        /**
         * Номер лицевого счета/Иной идентификатор плательщика
         * 
         */
        @XmlElement(name = "AccountNumber")
        protected String accountNumber;

        /**
         * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0 (тип)
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
         * Номер распоряжения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderNum() {
            return orderNum;
        }

        /**
         * Sets the value of the orderNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrderNum()
         */
        public void setOrderNum(String value) {
            this.orderNum = value;
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
         * Назначение платежа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentPurpose() {
            return paymentPurpose;
        }

        /**
         * Sets the value of the paymentPurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPaymentPurpose()
         */
        public void setPaymentPurpose(String value) {
            this.paymentPurpose = value;
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
         * Произвольный комментарий
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getComment()
         */
        public void setComment(String value) {
            this.comment = value;
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
         * Адрес помещения и реквизиты потребителя
         * 
         * @return
         *     possible object is
         *     {@link NotificationOfOrderExecutionExportType.OrderInfo.AddressAndConsumer }
         *     
         */
        public NotificationOfOrderExecutionExportType.OrderInfo.AddressAndConsumer getAddressAndConsumer() {
            return addressAndConsumer;
        }

        /**
         * Sets the value of the addressAndConsumer property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationOfOrderExecutionExportType.OrderInfo.AddressAndConsumer }
         *     
         * @see #getAddressAndConsumer()
         */
        public void setAddressAndConsumer(NotificationOfOrderExecutionExportType.OrderInfo.AddressAndConsumer value) {
            this.addressAndConsumer = value;
        }

        /**
         * Жилищно-коммунальная услуга
         * 
         * @return
         *     possible object is
         *     {@link NotificationOfOrderExecutionExportType.OrderInfo.Service }
         *     
         */
        public NotificationOfOrderExecutionExportType.OrderInfo.Service getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationOfOrderExecutionExportType.OrderInfo.Service }
         *     
         * @see #getService()
         */
        public void setService(NotificationOfOrderExecutionExportType.OrderInfo.Service value) {
            this.service = value;
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
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
         *         <choice minOccurs="0">
         *           <sequence>
         *             <element name="Apartment" minOccurs="0">
         *               <simpleType>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                   <minLength value="1"/>
         *                   <maxLength value="255"/>
         *                 </restriction>
         *               </simpleType>
         *             </element>
         *             <element name="Placement" minOccurs="0">
         *               <simpleType>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                   <minLength value="1"/>
         *                   <maxLength value="255"/>
         *                 </restriction>
         *               </simpleType>
         *             </element>
         *           </sequence>
         *           <element name="NonLivingApartment">
         *             <simpleType>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 <minLength value="1"/>
         *                 <maxLength value="255"/>
         *               </restriction>
         *             </simpleType>
         *           </element>
         *           <sequence>
         *             <element name="ResidentialBlock" minOccurs="0">
         *               <simpleType>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                   <minLength value="1"/>
         *                   <maxLength value="255"/>
         *                 </restriction>
         *               </simpleType>
         *             </element>
         *             <element name="ResidentialBlockRoom" minOccurs="0">
         *               <simpleType>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                   <minLength value="1"/>
         *                   <maxLength value="255"/>
         *                 </restriction>
         *               </simpleType>
         *             </element>
         *           </sequence>
         *           <element name="NonResidentialBlock">
         *             <simpleType>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 <minLength value="1"/>
         *                 <maxLength value="255"/>
         *               </restriction>
         *             </simpleType>
         *           </element>
         *         </choice>
         *         <choice minOccurs="0">
         *           <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
         *           <element name="INN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
         *         </choice>
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
            "fiasHouseGuid",
            "apartment",
            "placement",
            "nonLivingApartment",
            "residentialBlock",
            "residentialBlockRoom",
            "nonResidentialBlock",
            "ind",
            "inn"
        })
        public static class AddressAndConsumer {

            /**
             * Глобальный уникальный идентификатор дома по ФИАС
             * 
             */
            @XmlElement(name = "FIASHouseGuid")
            protected String fiasHouseGuid;
            /**
             * Номер жилого помещения
             * 
             */
            @XmlElement(name = "Apartment")
            protected String apartment;
            /**
             * Номер комнаты жилого помещения
             * 
             */
            @XmlElement(name = "Placement")
            protected String placement;
            /**
             * Номер нежилого помещения
             * 
             */
            @XmlElement(name = "NonLivingApartment")
            protected String nonLivingApartment;
            /**
             * Номер жилого блока
             * 
             */
            @XmlElement(name = "ResidentialBlock")
            protected String residentialBlock;
            /**
             * Номер комнаты жилого блока
             * 
             */
            @XmlElement(name = "ResidentialBlockRoom")
            protected String residentialBlockRoom;
            /**
             * Номер нежилого блока
             * 
             */
            @XmlElement(name = "NonResidentialBlock")
            protected String nonResidentialBlock;
            /**
             * Физлицо, не являющееся индивидуальным предпринимателем
             * 
             */
            @XmlElement(name = "Ind")
            protected FIOType ind;
            /**
             * Индивидуальный предприниматель или юридическое лицо
             * 
             */
            @XmlElement(name = "INN")
            protected String inn;

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
             * Номер нежилого помещения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonLivingApartment() {
                return nonLivingApartment;
            }

            /**
             * Sets the value of the nonLivingApartment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getNonLivingApartment()
             */
            public void setNonLivingApartment(String value) {
                this.nonLivingApartment = value;
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

            /**
             * Физлицо, не являющееся индивидуальным предпринимателем
             * 
             * @return
             *     possible object is
             *     {@link FIOType }
             *     
             */
            public FIOType getInd() {
                return ind;
            }

            /**
             * Sets the value of the ind property.
             * 
             * @param value
             *     allowed object is
             *     {@link FIOType }
             *     
             * @see #getInd()
             */
            public void setInd(FIOType value) {
                this.ind = value;
            }

            /**
             * Индивидуальный предприниматель или юридическое лицо
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
         *         <element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "serviceID"
        })
        public static class Service {

            @XmlElement(name = "ServiceID", required = true)
            protected String serviceID;

            /**
             * Gets the value of the serviceID property.
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
             */
            public void setServiceID(String value) {
                this.serviceID = value;
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
     *         <choice minOccurs="0">
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
     *           <element name="EntprFIO">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <minLength value="1"/>
     *                 <maxLength value="160"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *         </choice>
     *         <element name="PaymentInformation" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType" minOccurs="0"/>
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
        "entprFIO",
        "paymentInformation"
    })
    public static class RecipientInfo {

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
        protected NotificationOfOrderExecutionExportType.RecipientInfo.Legal legal;
        /**
         * Наименование ИП одной строкой
         * 
         */
        @XmlElement(name = "EntprFIO")
        protected String entprFIO;
        /**
         * Сведения о платежных реквизитах
         * 
         */
        @XmlElement(name = "PaymentInformation")
        protected PaymentInformationExportType paymentInformation;

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
         *     {@link NotificationOfOrderExecutionExportType.RecipientInfo.Legal }
         *     
         */
        public NotificationOfOrderExecutionExportType.RecipientInfo.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link NotificationOfOrderExecutionExportType.RecipientInfo.Legal }
         *     
         * @see #getLegal()
         */
        public void setLegal(NotificationOfOrderExecutionExportType.RecipientInfo.Legal value) {
            this.legal = value;
        }

        /**
         * Наименование ИП одной строкой
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntprFIO() {
            return entprFIO;
        }

        /**
         * Sets the value of the entprFIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getEntprFIO()
         */
        public void setEntprFIO(String value) {
            this.entprFIO = value;
        }

        /**
         * Сведения о платежных реквизитах
         * 
         * @return
         *     possible object is
         *     {@link PaymentInformationExportType }
         *     
         */
        public PaymentInformationExportType getPaymentInformation() {
            return paymentInformation;
        }

        /**
         * Sets the value of the paymentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentInformationExportType }
         *     
         * @see #getPaymentInformation()
         */
        public void setPaymentInformation(PaymentInformationExportType value) {
            this.paymentInformation = value;
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
     *         <element name="SupplierID" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="25"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="SupplierName" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="160"/>
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
        "supplierID",
        "supplierName"
    })
    public static class SupplierInfo {

        /**
         * Уникальный идентификатор плательщика
         * 
         */
        @XmlElement(name = "SupplierID")
        protected String supplierID;
        /**
         * Наименование плательщика
         * 
         */
        @XmlElement(name = "SupplierName")
        protected String supplierName;

        /**
         * Уникальный идентификатор плательщика
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierID() {
            return supplierID;
        }

        /**
         * Sets the value of the supplierID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSupplierID()
         */
        public void setSupplierID(String value) {
            this.supplierID = value;
        }

        /**
         * Наименование плательщика
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierName() {
            return supplierName;
        }

        /**
         * Sets the value of the supplierName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSupplierName()
         */
        public void setSupplierName(String value) {
            this.supplierName = value;
        }

    }

}
