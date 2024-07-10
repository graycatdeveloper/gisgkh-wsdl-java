
package ru.gosuslugi.dom.schema.integration.bills;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.payments_base.AcknowledgmentRequestInfoExportType;
import ru.gosuslugi.dom.schema.integration.payments_base.NotificationOfOrderExecutionExportType;


/**
 * Тип данных для ответа на запрос экспорта извещений о принятии к исполнению распоряжений (квитанций об оплате) с результатами квитирования
 * 
 * <p>Java class for exportNotificationsOfOrderExecutionResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportNotificationsOfOrderExecutionResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NotificationOfOrderExecutionWithStatus" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecutionExportType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}AckStatus"/>
 *                   <element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   <element name="AcknowledgmentRequestsList">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="AcknowledgmentRequest" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}AcknowledgmentRequestInfoExportType">
 *                                     <sequence>
 *                                       <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
 *                                     </sequence>
 *                                   </extension>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AcknowledgmentAmount" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}AmountType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
 *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </extension>
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
@XmlType(name = "exportNotificationsOfOrderExecutionResultType", propOrder = {
    "notificationOfOrderExecutionWithStatus"
})
public class ExportNotificationsOfOrderExecutionResultType {

    @XmlElement(name = "NotificationOfOrderExecutionWithStatus")
    protected List<ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus> notificationOfOrderExecutionWithStatus;

    /**
     * Gets the value of the notificationOfOrderExecutionWithStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationOfOrderExecutionWithStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotificationOfOrderExecutionWithStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the notificationOfOrderExecutionWithStatus property.
     */
    public List<ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus> getNotificationOfOrderExecutionWithStatus() {
        if (notificationOfOrderExecutionWithStatus == null) {
            notificationOfOrderExecutionWithStatus = new ArrayList<>();
        }
        return this.notificationOfOrderExecutionWithStatus;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecutionExportType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}AckStatus"/>
     *         <element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         <element name="AcknowledgmentRequestsList">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="AcknowledgmentRequest" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}AcknowledgmentRequestInfoExportType">
     *                           <sequence>
     *                             <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AcknowledgmentAmount" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}AmountType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
     *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "ackStatus",
        "creationDate",
        "acknowledgmentRequestsList",
        "acknowledgmentAmount",
        "notificationsOfOrderExecutionGUID",
        "orgPPAGUID"
    })
    public static class NotificationOfOrderExecutionWithStatus
        extends NotificationOfOrderExecutionExportType
    {

        /**
         * Статус квитирования:
         *  0 - Новый (не проходил квитирование)
         *  1 - Аннулирован
         *  2 - Сквитирован
         *  3 - Частично сквитирован
         *  4 - Предварительно сквитирован
         *  5 - Отсутствует возможность сквитировать
         * 
         */
        @XmlElement(name = "AckStatus")
        protected byte ackStatus;
        /**
         * Дата создания документа в системе
         * 
         */
        @XmlElement(name = "CreationDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar creationDate;
        /**
         * Список результатов квитирования
         * 
         */
        @XmlElement(name = "AcknowledgmentRequestsList", required = true)
        protected ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList acknowledgmentRequestsList;
        /**
         * Сумма квитирования (в копейках)
         * 
         */
        @XmlElement(name = "AcknowledgmentAmount")
        protected long acknowledgmentAmount;
        /**
         * Идентификатор извещения о принятии к исполнению распоряжения
         * 
         */
        @XmlElement(name = "NotificationsOfOrderExecutionGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/payments-base/", required = true)
        protected String notificationsOfOrderExecutionGUID;
        /**
         * Идентификатор организации, принявшей платеж
         * 
         */
        @XmlElement(required = true)
        protected String orgPPAGUID;

        /**
         * Статус квитирования:
         *  0 - Новый (не проходил квитирование)
         *  1 - Аннулирован
         *  2 - Сквитирован
         *  3 - Частично сквитирован
         *  4 - Предварительно сквитирован
         *  5 - Отсутствует возможность сквитировать
         * 
         */
        public byte getAckStatus() {
            return ackStatus;
        }

        /**
         * Sets the value of the ackStatus property.
         * 
         */
        public void setAckStatus(byte value) {
            this.ackStatus = value;
        }

        /**
         * Дата создания документа в системе
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreationDate() {
            return creationDate;
        }

        /**
         * Sets the value of the creationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getCreationDate()
         */
        public void setCreationDate(XMLGregorianCalendar value) {
            this.creationDate = value;
        }

        /**
         * Список результатов квитирования
         * 
         * @return
         *     possible object is
         *     {@link ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList }
         *     
         */
        public ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList getAcknowledgmentRequestsList() {
            return acknowledgmentRequestsList;
        }

        /**
         * Sets the value of the acknowledgmentRequestsList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList }
         *     
         * @see #getAcknowledgmentRequestsList()
         */
        public void setAcknowledgmentRequestsList(ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList value) {
            this.acknowledgmentRequestsList = value;
        }

        /**
         * Сумма квитирования (в копейках)
         * 
         */
        public long getAcknowledgmentAmount() {
            return acknowledgmentAmount;
        }

        /**
         * Sets the value of the acknowledgmentAmount property.
         * 
         */
        public void setAcknowledgmentAmount(long value) {
            this.acknowledgmentAmount = value;
        }

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
         * Идентификатор организации, принявшей платеж
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
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="AcknowledgmentRequest" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}AcknowledgmentRequestInfoExportType">
         *                 <sequence>
         *                   <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
         *                 </sequence>
         *               </extension>
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
            "acknowledgmentRequest"
        })
        public static class AcknowledgmentRequestsList {

            /**
             * Результат квитирования по услуге
             * 
             */
            @XmlElement(name = "AcknowledgmentRequest")
            protected List<ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList.AcknowledgmentRequest> acknowledgmentRequest;

            /**
             * Результат квитирования по услуге
             * 
             * Gets the value of the acknowledgmentRequest property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the acknowledgmentRequest property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAcknowledgmentRequest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList.AcknowledgmentRequest }
             * </p>
             * 
             * 
             * @return
             *     The value of the acknowledgmentRequest property.
             */
            public List<ExportNotificationsOfOrderExecutionResultType.NotificationOfOrderExecutionWithStatus.AcknowledgmentRequestsList.AcknowledgmentRequest> getAcknowledgmentRequest() {
                if (acknowledgmentRequest == null) {
                    acknowledgmentRequest = new ArrayList<>();
                }
                return this.acknowledgmentRequest;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}AcknowledgmentRequestInfoExportType">
             *       <sequence>
             *         <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
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
                "orderID"
            })
            public static class AcknowledgmentRequest
                extends AcknowledgmentRequestInfoExportType
            {

                /**
                 * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0 (тип)
                 * 
                 */
                @XmlElement(name = "OrderID", required = true)
                protected String orderID;

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

            }

        }

    }

}
