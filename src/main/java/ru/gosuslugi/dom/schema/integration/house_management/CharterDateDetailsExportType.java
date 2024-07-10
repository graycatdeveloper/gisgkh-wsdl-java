
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharterDateDetailsExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CharterDateDetailsExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PeriodMetering" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
 *                   <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PaymentDocumentInterval" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="StartDate">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="LastDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                   <choice>
 *                     <element name="CurrentMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="NextMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PaymentInterval" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="StartDate">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="LastDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                   <choice>
 *                     <element name="CurrentMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="NextMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
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
@XmlType(name = "CharterDateDetailsExportType", propOrder = {
    "periodMetering",
    "paymentDocumentInterval",
    "paymentInterval"
})
public class CharterDateDetailsExportType {

    /**
     * Сроки передачи показаний индивидуальных и общих (квартирных) приборов учета с указанием даты начала и даты окончания периода передачи показаний
     * 
     */
    @XmlElement(name = "PeriodMetering")
    protected CharterDateDetailsExportType.PeriodMetering periodMetering;
    /**
     * Срок представления (выставления) платежных документов для внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     */
    @XmlElement(name = "PaymentDocumentInterval")
    protected CharterDateDetailsExportType.PaymentDocumentInterval paymentDocumentInterval;
    /**
     * Срок внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     */
    @XmlElement(name = "PaymentInterval")
    protected CharterDateDetailsExportType.PaymentInterval paymentInterval;

    /**
     * Сроки передачи показаний индивидуальных и общих (квартирных) приборов учета с указанием даты начала и даты окончания периода передачи показаний
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsExportType.PeriodMetering }
     *     
     */
    public CharterDateDetailsExportType.PeriodMetering getPeriodMetering() {
        return periodMetering;
    }

    /**
     * Sets the value of the periodMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsExportType.PeriodMetering }
     *     
     * @see #getPeriodMetering()
     */
    public void setPeriodMetering(CharterDateDetailsExportType.PeriodMetering value) {
        this.periodMetering = value;
    }

    /**
     * Срок представления (выставления) платежных документов для внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsExportType.PaymentDocumentInterval }
     *     
     */
    public CharterDateDetailsExportType.PaymentDocumentInterval getPaymentDocumentInterval() {
        return paymentDocumentInterval;
    }

    /**
     * Sets the value of the paymentDocumentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsExportType.PaymentDocumentInterval }
     *     
     * @see #getPaymentDocumentInterval()
     */
    public void setPaymentDocumentInterval(CharterDateDetailsExportType.PaymentDocumentInterval value) {
        this.paymentDocumentInterval = value;
    }

    /**
     * Срок внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsExportType.PaymentInterval }
     *     
     */
    public CharterDateDetailsExportType.PaymentInterval getPaymentInterval() {
        return paymentInterval;
    }

    /**
     * Sets the value of the paymentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsExportType.PaymentInterval }
     *     
     * @see #getPaymentInterval()
     */
    public void setPaymentInterval(CharterDateDetailsExportType.PaymentInterval value) {
        this.paymentInterval = value;
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
     *           <element name="StartDate">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="LastDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
     *         <choice>
     *           <element name="CurrentMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="NextMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "startDate",
        "lastDay",
        "currentMounth",
        "nextMounth"
    })
    public static class PaymentDocumentInterval {

        /**
         * День месяца (от 1-30)
         * 
         */
        @XmlElement(name = "StartDate")
        protected Byte startDate;
        /**
         * Последний день месяца
         * 
         */
        @XmlElement(name = "LastDay")
        protected Boolean lastDay;
        /**
         * Текущего месяца
         * 
         */
        @XmlElement(name = "CurrentMounth")
        protected Boolean currentMounth;
        /**
         * Следующего месяца
         * 
         */
        @XmlElement(name = "NextMounth")
        protected Boolean nextMounth;

        /**
         * День месяца (от 1-30)
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         * @see #getStartDate()
         */
        public void setStartDate(Byte value) {
            this.startDate = value;
        }

        /**
         * Последний день месяца
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLastDay() {
            return lastDay;
        }

        /**
         * Sets the value of the lastDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isLastDay()
         */
        public void setLastDay(Boolean value) {
            this.lastDay = value;
        }

        /**
         * Текущего месяца
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCurrentMounth() {
            return currentMounth;
        }

        /**
         * Sets the value of the currentMounth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCurrentMounth()
         */
        public void setCurrentMounth(Boolean value) {
            this.currentMounth = value;
        }

        /**
         * Следующего месяца
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNextMounth() {
            return nextMounth;
        }

        /**
         * Sets the value of the nextMounth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNextMounth()
         */
        public void setNextMounth(Boolean value) {
            this.nextMounth = value;
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
     *         <choice>
     *           <element name="StartDate">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="LastDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
     *         <choice>
     *           <element name="CurrentMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="NextMounth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "startDate",
        "lastDay",
        "currentMounth",
        "nextMounth"
    })
    public static class PaymentInterval {

        /**
         * День месяца (от 1-30)
         * 
         */
        @XmlElement(name = "StartDate")
        protected Byte startDate;
        /**
         * Последний день месяца
         * 
         */
        @XmlElement(name = "LastDay")
        protected Boolean lastDay;
        /**
         * Текущего месяца
         * 
         */
        @XmlElement(name = "CurrentMounth")
        protected Boolean currentMounth;
        /**
         * Следующего месяца
         * 
         */
        @XmlElement(name = "NextMounth")
        protected Boolean nextMounth;

        /**
         * День месяца (от 1-30)
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         * @see #getStartDate()
         */
        public void setStartDate(Byte value) {
            this.startDate = value;
        }

        /**
         * Последний день месяца
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLastDay() {
            return lastDay;
        }

        /**
         * Sets the value of the lastDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isLastDay()
         */
        public void setLastDay(Boolean value) {
            this.lastDay = value;
        }

        /**
         * Текущего месяца
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCurrentMounth() {
            return currentMounth;
        }

        /**
         * Sets the value of the currentMounth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCurrentMounth()
         */
        public void setCurrentMounth(Boolean value) {
            this.currentMounth = value;
        }

        /**
         * Следующего месяца
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNextMounth() {
            return nextMounth;
        }

        /**
         * Sets the value of the nextMounth property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNextMounth()
         */
        public void setNextMounth(Boolean value) {
            this.nextMounth = value;
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
     *         <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
     *         <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
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
        "startDate",
        "endDate"
    })
    public static class PeriodMetering {

        /**
         * Начало периода ввода показаний ПУ
         * 
         */
        @XmlElement(name = "StartDate")
        protected DaySelectionExportType startDate;
        /**
         * Окончание периода ввода показаний ПУ
         * 
         */
        @XmlElement(name = "EndDate")
        protected DaySelectionExportType endDate;

        /**
         * Начало периода ввода показаний ПУ
         * 
         * @return
         *     possible object is
         *     {@link DaySelectionExportType }
         *     
         */
        public DaySelectionExportType getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DaySelectionExportType }
         *     
         * @see #getStartDate()
         */
        public void setStartDate(DaySelectionExportType value) {
            this.startDate = value;
        }

        /**
         * Окончание периода ввода показаний ПУ
         * 
         * @return
         *     possible object is
         *     {@link DaySelectionExportType }
         *     
         */
        public DaySelectionExportType getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DaySelectionExportType }
         *     
         * @see #getEndDate()
         */
        public void setEndDate(DaySelectionExportType value) {
            this.endDate = value;
        }

    }

}
