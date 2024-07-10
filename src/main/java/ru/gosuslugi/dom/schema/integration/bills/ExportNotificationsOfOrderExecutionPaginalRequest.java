
package ru.gosuslugi.dom.schema.integration.bills;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <choice>
 *           <element name="SupplierIDs">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *                     <sequence>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year" minOccurs="0"/>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month" minOccurs="0"/>
 *                       <choice>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
 *                         <sequence>
 *                           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                           <choice>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber"/>
 *                           </choice>
 *                         </sequence>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
 *                       </choice>
 *                     </sequence>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Notifications">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
 *                     <sequence>
 *                       <element name="DaysInterval">
 *                         <simpleType>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                             <minInclusive value="1"/>
 *                             <maxInclusive value="7"/>
 *                           </restriction>
 *                         </simpleType>
 *                       </element>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}AckStatus" maxOccurs="6"/>
 *                       <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     </sequence>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="ExportNotificationsOfOrderExecutionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="PageSize" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               <maxInclusive value="1000"/>
 *               <minInclusive value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierIDs",
    "notifications",
    "exportNotificationsOfOrderExecutionGUID",
    "pageSize"
})
@XmlRootElement(name = "exportNotificationsOfOrderExecutionPaginalRequest")
public class ExportNotificationsOfOrderExecutionPaginalRequest
    extends BaseType
{

    /**
     * По реквизитам начислений
     * 
     */
    @XmlElement(name = "SupplierIDs")
    protected ExportNotificationsOfOrderExecutionPaginalRequest.SupplierIDs supplierIDs;
    /**
     * По реквизитам извещений
     * 
     */
    @XmlElement(name = "Notifications")
    protected ExportNotificationsOfOrderExecutionPaginalRequest.Notifications notifications;
    /**
     * Идентификатор извещения о принятии к исполнению распоряжения в ГИС ЖКХ.
     * Для экспорта следующей страницы с результатами поиска передаётся значение из результатов экспорта текущей страницы.
     * При первом обращении к сервису не заполняется.
     * 
     */
    @XmlElement(name = "ExportNotificationsOfOrderExecutionGUID")
    protected String exportNotificationsOfOrderExecutionGUID;
    /**
     * Размер страницы.
     * Устанавливает максимальное количество элементов, возвращаемых в результате экспорта (по умолчанию - 1000).
     * 
     */
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * По реквизитам начислений
     * 
     * @return
     *     possible object is
     *     {@link ExportNotificationsOfOrderExecutionPaginalRequest.SupplierIDs }
     *     
     */
    public ExportNotificationsOfOrderExecutionPaginalRequest.SupplierIDs getSupplierIDs() {
        return supplierIDs;
    }

    /**
     * Sets the value of the supplierIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportNotificationsOfOrderExecutionPaginalRequest.SupplierIDs }
     *     
     * @see #getSupplierIDs()
     */
    public void setSupplierIDs(ExportNotificationsOfOrderExecutionPaginalRequest.SupplierIDs value) {
        this.supplierIDs = value;
    }

    /**
     * По реквизитам извещений
     * 
     * @return
     *     possible object is
     *     {@link ExportNotificationsOfOrderExecutionPaginalRequest.Notifications }
     *     
     */
    public ExportNotificationsOfOrderExecutionPaginalRequest.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportNotificationsOfOrderExecutionPaginalRequest.Notifications }
     *     
     * @see #getNotifications()
     */
    public void setNotifications(ExportNotificationsOfOrderExecutionPaginalRequest.Notifications value) {
        this.notifications = value;
    }

    /**
     * Идентификатор извещения о принятии к исполнению распоряжения в ГИС ЖКХ.
     * Для экспорта следующей страницы с результатами поиска передаётся значение из результатов экспорта текущей страницы.
     * При первом обращении к сервису не заполняется.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportNotificationsOfOrderExecutionGUID() {
        return exportNotificationsOfOrderExecutionGUID;
    }

    /**
     * Sets the value of the exportNotificationsOfOrderExecutionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportNotificationsOfOrderExecutionGUID()
     */
    public void setExportNotificationsOfOrderExecutionGUID(String value) {
        this.exportNotificationsOfOrderExecutionGUID = value;
    }

    /**
     * Размер страницы.
     * Устанавливает максимальное количество элементов, возвращаемых в результате экспорта (по умолчанию - 1000).
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getPageSize()
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
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
        return version;
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
     *       <choice>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
     *         <sequence>
     *           <element name="DaysInterval">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                 <minInclusive value="1"/>
     *                 <maxInclusive value="7"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}AckStatus" maxOccurs="6"/>
     *           <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         </sequence>
     *       </choice>
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
        "daysInterval",
        "ackStatus",
        "dateFrom"
    })
    public static class Notifications {

        /**
         * Идентификатор извещения о принятии к исполнению распоряжения
         * 
         */
        @XmlElement(name = "NotificationsOfOrderExecutionGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/payments-base/")
        protected String notificationsOfOrderExecutionGUID;
        /**
         * Кол-во дней, за которую формируется выборка
         * 
         */
        @XmlElement(name = "DaysInterval")
        protected Byte daysInterval;
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
        @XmlElement(name = "AckStatus", type = Byte.class)
        protected List<Byte> ackStatus;
        /**
         * Дата нижней границы выборки
         * 
         */
        @XmlElement(name = "DateFrom")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateFrom;

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
         * Кол-во дней, за которую формируется выборка
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getDaysInterval() {
            return daysInterval;
        }

        /**
         * Sets the value of the daysInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         * @see #getDaysInterval()
         */
        public void setDaysInterval(Byte value) {
            this.daysInterval = value;
        }

        /**
         * Статус квитирования:
         *  0 - Новый (не проходил квитирование)
         *  1 - Аннулирован
         *  2 - Сквитирован
         *  3 - Частично сквитирован
         *  4 - Предварительно сквитирован
         *  5 - Отсутствует возможность сквитировать
         * 
         * Gets the value of the ackStatus property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ackStatus property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAckStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Byte }
         * </p>
         * 
         * 
         * @return
         *     The value of the ackStatus property.
         */
        public List<Byte> getAckStatus() {
            if (ackStatus == null) {
                ackStatus = new ArrayList<>();
            }
            return this.ackStatus;
        }

        /**
         * Дата нижней границы выборки
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateFrom() {
            return dateFrom;
        }

        /**
         * Sets the value of the dateFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateFrom()
         */
        public void setDateFrom(XMLGregorianCalendar value) {
            this.dateFrom = value;
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
     *       <choice>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year" minOccurs="0"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month" minOccurs="0"/>
     *           <choice>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
     *             <sequence>
     *               <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *               <choice>
     *                 <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber"/>
     *                 <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber"/>
     *               </choice>
     *             </sequence>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
     *           </choice>
     *         </sequence>
     *       </choice>
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
        "year",
        "month",
        "unifiedAccountNumber",
        "fiasHouseGuid",
        "accountNumber",
        "paymentDocumentNumber",
        "serviceID"
    })
    public static class SupplierIDs {

        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
        protected String paymentDocumentID;
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
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid")
        protected String fiasHouseGuid;
        /**
         * Номер лицевого счета/Иной идентификатор плательщика
         * 
         */
        @XmlElement(name = "AccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
        protected String accountNumber;
        /**
         * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
         * 
         */
        @XmlElement(name = "PaymentDocumentNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
        protected String paymentDocumentNumber;
        /**
         * Идентификатор жилищно-коммунальной услуги
         * 
         */
        @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
        protected String serviceID;

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

    }

}
