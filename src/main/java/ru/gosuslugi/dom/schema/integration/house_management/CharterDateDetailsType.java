
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharterDateDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CharterDateDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PeriodMetering" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeviceMeteringsDaySelectionType"/>
 *                   <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeviceMeteringsDaySelectionType"/>
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
 *                           <maxInclusive value="30"/>
 *                           <minInclusive value="1"/>
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
 *                           <maxInclusive value="30"/>
 *                           <minInclusive value="1"/>
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
@XmlType(name = "CharterDateDetailsType", propOrder = {
    "periodMetering",
    "paymentDocumentInterval",
    "paymentInterval"
})
public class CharterDateDetailsType {

    /**
     * Сроки передачи показаний индивидуальных и общих (квартирных) приборов учета с указанием даты начала и даты окончания периода передачи показаний
     * 
     */
    @XmlElement(name = "PeriodMetering")
    protected CharterDateDetailsType.PeriodMetering periodMetering;
    /**
     * Срок представления (выставления) платежных документов для внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     */
    @XmlElement(name = "PaymentDocumentInterval")
    protected CharterDateDetailsType.PaymentDocumentInterval paymentDocumentInterval;
    /**
     * Срок внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     */
    @XmlElement(name = "PaymentInterval")
    protected CharterDateDetailsType.PaymentInterval paymentInterval;

    /**
     * Сроки передачи показаний индивидуальных и общих (квартирных) приборов учета с указанием даты начала и даты окончания периода передачи показаний
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsType.PeriodMetering }
     *     
     */
    public CharterDateDetailsType.PeriodMetering getPeriodMetering() {
        return periodMetering;
    }

    /**
     * Sets the value of the periodMetering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsType.PeriodMetering }
     *     
     * @see #getPeriodMetering()
     */
    public void setPeriodMetering(CharterDateDetailsType.PeriodMetering value) {
        this.periodMetering = value;
    }

    /**
     * Срок представления (выставления) платежных документов для внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsType.PaymentDocumentInterval }
     *     
     */
    public CharterDateDetailsType.PaymentDocumentInterval getPaymentDocumentInterval() {
        return paymentDocumentInterval;
    }

    /**
     * Sets the value of the paymentDocumentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsType.PaymentDocumentInterval }
     *     
     * @see #getPaymentDocumentInterval()
     */
    public void setPaymentDocumentInterval(CharterDateDetailsType.PaymentDocumentInterval value) {
        this.paymentDocumentInterval = value;
    }

    /**
     * Срок внесения платы за жилое помещение и (или) коммунальные услуги
     * 
     * @return
     *     possible object is
     *     {@link CharterDateDetailsType.PaymentInterval }
     *     
     */
    public CharterDateDetailsType.PaymentInterval getPaymentInterval() {
        return paymentInterval;
    }

    /**
     * Sets the value of the paymentInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterDateDetailsType.PaymentInterval }
     *     
     * @see #getPaymentInterval()
     */
    public void setPaymentInterval(CharterDateDetailsType.PaymentInterval value) {
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
     *                 <maxInclusive value="30"/>
     *                 <minInclusive value="1"/>
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
     *                 <maxInclusive value="30"/>
     *                 <minInclusive value="1"/>
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
     *         <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeviceMeteringsDaySelectionType"/>
     *         <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DeviceMeteringsDaySelectionType"/>
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
        @XmlElement(name = "StartDate", required = true)
        protected DeviceMeteringsDaySelectionType startDate;
        /**
         * Окончание периода ввода показаний ПУ
         * 
         */
        @XmlElement(name = "EndDate", required = true)
        protected DeviceMeteringsDaySelectionType endDate;

        /**
         * Начало периода ввода показаний ПУ
         * 
         * @return
         *     possible object is
         *     {@link DeviceMeteringsDaySelectionType }
         *     
         */
        public DeviceMeteringsDaySelectionType getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceMeteringsDaySelectionType }
         *     
         * @see #getStartDate()
         */
        public void setStartDate(DeviceMeteringsDaySelectionType value) {
            this.startDate = value;
        }

        /**
         * Окончание периода ввода показаний ПУ
         * 
         * @return
         *     possible object is
         *     {@link DeviceMeteringsDaySelectionType }
         *     
         */
        public DeviceMeteringsDaySelectionType getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link DeviceMeteringsDaySelectionType }
         *     
         * @see #getEndDate()
         */
        public void setEndDate(DeviceMeteringsDaySelectionType value) {
            this.endDate = value;
        }

    }

}
