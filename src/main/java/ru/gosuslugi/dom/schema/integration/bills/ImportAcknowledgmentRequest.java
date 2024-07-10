
package ru.gosuslugi.dom.schema.integration.bills;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.payments_base.AcknowledgmentRequestInfoType;


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
 *         <element name="AcknowledgmentRequestInfo" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}AcknowledgmentRequestInfoType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AckCancellation" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
 *                     <sequence>
 *                       <choice>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderID"/>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDMultipurpose"/>
 *                       </choice>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}orgPPAGUID"/>
 *                     </sequence>
 *                   </choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acknowledgmentRequestInfo",
    "ackCancellation"
})
@XmlRootElement(name = "importAcknowledgmentRequest")
public class ImportAcknowledgmentRequest
    extends BaseType
{

    @XmlElement(name = "AcknowledgmentRequestInfo")
    protected List<ImportAcknowledgmentRequest.AcknowledgmentRequestInfo> acknowledgmentRequestInfo;
    /**
     * Отмена квитирования
     * 
     */
    @XmlElement(name = "AckCancellation")
    protected List<ImportAcknowledgmentRequest.AckCancellation> ackCancellation;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Gets the value of the acknowledgmentRequestInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgmentRequestInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAcknowledgmentRequestInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAcknowledgmentRequest.AcknowledgmentRequestInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the acknowledgmentRequestInfo property.
     */
    public List<ImportAcknowledgmentRequest.AcknowledgmentRequestInfo> getAcknowledgmentRequestInfo() {
        if (acknowledgmentRequestInfo == null) {
            acknowledgmentRequestInfo = new ArrayList<>();
        }
        return this.acknowledgmentRequestInfo;
    }

    /**
     * Отмена квитирования
     * 
     * Gets the value of the ackCancellation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ackCancellation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAckCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAcknowledgmentRequest.AckCancellation }
     * </p>
     * 
     * 
     * @return
     *     The value of the ackCancellation property.
     */
    public List<ImportAcknowledgmentRequest.AckCancellation> getAckCancellation() {
        if (ackCancellation == null) {
            ackCancellation = new ArrayList<>();
        }
        return this.ackCancellation;
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
            return "11.0.0.2";
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <choice>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
     *           <sequence>
     *             <choice>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderID"/>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDMultipurpose"/>
     *             </choice>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}orgPPAGUID"/>
     *           </sequence>
     *         </choice>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "notificationsOfOrderExecutionGUID",
        "orderID",
        "orderIDMultipurpose",
        "orgPPAGUID",
        "paymentDocumentID",
        "transportGUID"
    })
    public static class AckCancellation {

        /**
         * Идентификатор извещения о принятии к исполнению распоряжения
         * 
         */
        @XmlElement(name = "NotificationsOfOrderExecutionGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/payments-base/")
        protected String notificationsOfOrderExecutionGUID;
        /**
         * Уникальный номер платежа (идентификатор операции)
         * 
         */
        @XmlElement(name = "OrderID", namespace = "http://dom.gosuslugi.ru/schema/integration/payments-base/")
        protected String orderID;
        /**
         * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0
         * 
         */
        @XmlElement(name = "OrderIDMultipurpose", namespace = "http://dom.gosuslugi.ru/schema/integration/payments-base/")
        protected String orderIDMultipurpose;
        /**
         * Идентификатор зарегистрированной организации
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected String orgPPAGUID;
        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/", required = true)
        protected String paymentDocumentID;
        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

        /**
         * Идентификатор извещения о принятии к исполнению распоряжения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNotificationsOfOrderExecutionGUID() {
            return notificationsOfOrderExecutionGUID;
        }

        /**
         * Sets the value of the notificationsOfOrderExecutionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNotificationsOfOrderExecutionGUID()
         */
        public void setNotificationsOfOrderExecutionGUID(String value) {
            this.notificationsOfOrderExecutionGUID = value;
        }

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
         * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderIDMultipurpose() {
            return orderIDMultipurpose;
        }

        /**
         * Sets the value of the orderIDMultipurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrderIDMultipurpose()
         */
        public void setOrderIDMultipurpose(String value) {
            this.orderIDMultipurpose = value;
        }

        /**
         * Идентификатор зарегистрированной организации
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}AcknowledgmentRequestInfoType">
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
    public static class AcknowledgmentRequestInfo
        extends AcknowledgmentRequestInfoType
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

}
