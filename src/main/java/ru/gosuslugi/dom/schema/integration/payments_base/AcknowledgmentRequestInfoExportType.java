
package ru.gosuslugi.dom.schema.integration.payments_base;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Запрос на квитирование для экспорта
 * 
 * <p>Java class for AcknowledgmentRequestInfoExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AcknowledgmentRequestInfoExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationsOfOrderExecutionGUID"/>
 *         <choice>
 *           <element name="PaymentDocumentAck">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *                     <choice>
 *                       <element name="HSType" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="ASType" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="PServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                       <element name="TMSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                     </choice>
 *                     <element name="Amount">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           <totalDigits value="13"/>
 *                           <fractionDigits value="2"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber" minOccurs="0"/>
 *                     <element name="DelayPeriod" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CapitalRepairYearAckPeriod" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="AckImpossible">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
 *                     <element name="Reason" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <maxLength value="210"/>
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
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgmentRequestInfoExportType", propOrder = {
    "notificationsOfOrderExecutionGUID",
    "paymentDocumentAck",
    "ackImpossible"
})
public class AcknowledgmentRequestInfoExportType {

    /**
     * Идентификатор извещения о принятии к исполнению распоряжения
     * 
     */
    @XmlElement(name = "NotificationsOfOrderExecutionGUID", required = true)
    protected String notificationsOfOrderExecutionGUID;
    /**
     * Cквитировано с платежным документом
     * 
     */
    @XmlElement(name = "PaymentDocumentAck")
    protected AcknowledgmentRequestInfoExportType.PaymentDocumentAck paymentDocumentAck;
    /**
     * Квитирование невозможно
     * 
     */
    @XmlElement(name = "AckImpossible")
    protected AcknowledgmentRequestInfoExportType.AckImpossible ackImpossible;

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
     * Cквитировано с платежным документом
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgmentRequestInfoExportType.PaymentDocumentAck }
     *     
     */
    public AcknowledgmentRequestInfoExportType.PaymentDocumentAck getPaymentDocumentAck() {
        return paymentDocumentAck;
    }

    /**
     * Sets the value of the paymentDocumentAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgmentRequestInfoExportType.PaymentDocumentAck }
     *     
     * @see #getPaymentDocumentAck()
     */
    public void setPaymentDocumentAck(AcknowledgmentRequestInfoExportType.PaymentDocumentAck value) {
        this.paymentDocumentAck = value;
    }

    /**
     * Квитирование невозможно
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgmentRequestInfoExportType.AckImpossible }
     *     
     */
    public AcknowledgmentRequestInfoExportType.AckImpossible getAckImpossible() {
        return ackImpossible;
    }

    /**
     * Sets the value of the ackImpossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgmentRequestInfoExportType.AckImpossible }
     *     
     * @see #getAckImpossible()
     */
    public void setAckImpossible(AcknowledgmentRequestInfoExportType.AckImpossible value) {
        this.ackImpossible = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" minOccurs="0"/>
     *         <element name="Reason" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="210"/>
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
        "paymentDocumentID",
        "reason"
    })
    public static class AckImpossible {

        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
        protected String paymentDocumentID;
        /**
         * Причина, по которой отсутствует возможность сопоставления
         * 
         */
        @XmlElement(name = "Reason")
        protected String reason;

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
         * Причина, по которой отсутствует возможность сопоставления
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getReason()
         */
        public void setReason(String value) {
            this.reason = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
     *         <choice>
     *           <element name="HSType" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="ASType" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="PServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *           <element name="TMSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         </choice>
     *         <element name="Amount">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="13"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber" minOccurs="0"/>
     *         <element name="DelayPeriod" minOccurs="0">
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
     *         <element name="CapitalRepairYearAckPeriod" minOccurs="0">
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
        "hsType",
        "msType",
        "asType",
        "pServiceType",
        "tmsType",
        "amount",
        "paymentDocumentNumber",
        "delayPeriod",
        "capitalRepairYearAckPeriod"
    })
    public static class PaymentDocumentAck {

        /**
         * Идентификатор платежного документа
         * 
         */
        @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/", required = true)
        protected String paymentDocumentID;
        /**
         * Вид ЖУ (справочник "Классификатор видов работ (услуг)")
         * 
         */
        @XmlElement(name = "HSType")
        protected String hsType;
        /**
         * Вид ГКУ (справочник "Главная коммунальная услуга")
         * 
         */
        @XmlElement(name = "MSType")
        protected String msType;
        /**
         * Вид ДУ (справочник "Вид дополнительной услуги")
         * 
         */
        @XmlElement(name = "ASType")
        protected String asType;
        /**
         * Вид неустойки и судебных расходов. НСИ 329 "Неустойки и судебные расходы":
         * - Пени
         * - Штрафы
         * - Государственные пошлины
         * - Судебные издержки.
         * 
         */
        @XmlElement(name = "PServiceType")
        protected NsiRef pServiceType;
        /**
         * Вид коммунальной услуги. НСИ 3
         * 
         */
        @XmlElement(name = "TMSType")
        protected NsiRef tmsType;
        /**
         * Сумма квитирования (в копейках)
         * 
         */
        @XmlElement(name = "Amount", required = true)
        protected BigDecimal amount;
        /**
         * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
         * 
         */
        @XmlElement(name = "PaymentDocumentNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
        protected String paymentDocumentNumber;
        /**
         * Период просрочки, с которым выполняется квитирование (только для квитирования с долговым ПД)
         * 
         */
        @XmlElement(name = "DelayPeriod")
        protected AcknowledgmentRequestInfoExportType.PaymentDocumentAck.DelayPeriod delayPeriod;
        /**
         * Периода расчета начисления услуги по капитальному ремонту (только для ПД с типом "текущий" с указанием КР на год)
         * 
         */
        @XmlElement(name = "CapitalRepairYearAckPeriod")
        protected AcknowledgmentRequestInfoExportType.PaymentDocumentAck.CapitalRepairYearAckPeriod capitalRepairYearAckPeriod;

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
         * Вид ЖУ (справочник "Классификатор видов работ (услуг)")
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHSType() {
            return hsType;
        }

        /**
         * Sets the value of the hsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getHSType()
         */
        public void setHSType(String value) {
            this.hsType = value;
        }

        /**
         * Вид ГКУ (справочник "Главная коммунальная услуга")
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMSType() {
            return msType;
        }

        /**
         * Sets the value of the msType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMSType()
         */
        public void setMSType(String value) {
            this.msType = value;
        }

        /**
         * Вид ДУ (справочник "Вид дополнительной услуги")
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getASType() {
            return asType;
        }

        /**
         * Sets the value of the asType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getASType()
         */
        public void setASType(String value) {
            this.asType = value;
        }

        /**
         * Вид неустойки и судебных расходов. НСИ 329 "Неустойки и судебные расходы":
         * - Пени
         * - Штрафы
         * - Государственные пошлины
         * - Судебные издержки.
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getPServiceType() {
            return pServiceType;
        }

        /**
         * Sets the value of the pServiceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getPServiceType()
         */
        public void setPServiceType(NsiRef value) {
            this.pServiceType = value;
        }

        /**
         * Вид коммунальной услуги. НСИ 3
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getTMSType() {
            return tmsType;
        }

        /**
         * Sets the value of the tmsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getTMSType()
         */
        public void setTMSType(NsiRef value) {
            this.tmsType = value;
        }

        /**
         * Сумма квитирования (в копейках)
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
         * Период просрочки, с которым выполняется квитирование (только для квитирования с долговым ПД)
         * 
         * @return
         *     possible object is
         *     {@link AcknowledgmentRequestInfoExportType.PaymentDocumentAck.DelayPeriod }
         *     
         */
        public AcknowledgmentRequestInfoExportType.PaymentDocumentAck.DelayPeriod getDelayPeriod() {
            return delayPeriod;
        }

        /**
         * Sets the value of the delayPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcknowledgmentRequestInfoExportType.PaymentDocumentAck.DelayPeriod }
         *     
         * @see #getDelayPeriod()
         */
        public void setDelayPeriod(AcknowledgmentRequestInfoExportType.PaymentDocumentAck.DelayPeriod value) {
            this.delayPeriod = value;
        }

        /**
         * Периода расчета начисления услуги по капитальному ремонту (только для ПД с типом "текущий" с указанием КР на год)
         * 
         * @return
         *     possible object is
         *     {@link AcknowledgmentRequestInfoExportType.PaymentDocumentAck.CapitalRepairYearAckPeriod }
         *     
         */
        public AcknowledgmentRequestInfoExportType.PaymentDocumentAck.CapitalRepairYearAckPeriod getCapitalRepairYearAckPeriod() {
            return capitalRepairYearAckPeriod;
        }

        /**
         * Sets the value of the capitalRepairYearAckPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link AcknowledgmentRequestInfoExportType.PaymentDocumentAck.CapitalRepairYearAckPeriod }
         *     
         * @see #getCapitalRepairYearAckPeriod()
         */
        public void setCapitalRepairYearAckPeriod(AcknowledgmentRequestInfoExportType.PaymentDocumentAck.CapitalRepairYearAckPeriod value) {
            this.capitalRepairYearAckPeriod = value;
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
        public static class CapitalRepairYearAckPeriod {

            /**
             * Год расчетного периода
             * 
             */
            @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected short year;
            /**
             * Месяц расчетного периода
             * 
             */
            @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected int month;

            /**
             * Год расчетного периода
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
             * Месяц расчетного периода
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
        public static class DelayPeriod {

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
