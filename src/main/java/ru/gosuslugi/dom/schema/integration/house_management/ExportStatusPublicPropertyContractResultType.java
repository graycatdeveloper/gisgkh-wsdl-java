
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта ДОГПОИ
 * 
 * <p>Java class for exportStatusPublicPropertyContractResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportStatusPublicPropertyContractResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PublicPropertyContract" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PublicPropertyContractExportType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *                   <element name="StatusContract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                   <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   <element name="StatusVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="PaymentInterval" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <sequence>
 *                               <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
 *                               <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
 *                             </sequence>
 *                             <element name="Other">
 *                               <simpleType>
 *                                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type">
 *                                   <minLength value="1"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="AgreementPayment" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="DatePeriod">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       <element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Bill">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="10"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Debt">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="10"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Paid">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="10"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="IsGratuitousBasis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "exportStatusPublicPropertyContractResultType", propOrder = {
    "publicPropertyContract"
})
public class ExportStatusPublicPropertyContractResultType {

    /**
     * ДОИ
     * 
     */
    @XmlElement(name = "PublicPropertyContract", required = true)
    protected List<ExportStatusPublicPropertyContractResultType.PublicPropertyContract> publicPropertyContract;

    /**
     * ДОИ
     * 
     * Gets the value of the publicPropertyContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicPropertyContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPublicPropertyContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract }
     * </p>
     * 
     * 
     * @return
     *     The value of the publicPropertyContract property.
     */
    public List<ExportStatusPublicPropertyContractResultType.PublicPropertyContract> getPublicPropertyContract() {
        if (publicPropertyContract == null) {
            publicPropertyContract = new ArrayList<>();
        }
        return this.publicPropertyContract;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PublicPropertyContractExportType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
     *         <element name="StatusContract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *         <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         <element name="StatusVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="PaymentInterval" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <sequence>
     *                     <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
     *                     <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
     *                   </sequence>
     *                   <element name="Other">
     *                     <simpleType>
     *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type">
     *                         <minLength value="1"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="AgreementPayment" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="DatePeriod">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             <element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Bill">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="10"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Debt">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="10"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Paid">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="10"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="IsGratuitousBasis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "contractGUID",
        "statusContract",
        "contractVersionGUID",
        "versionNumber",
        "statusVersion",
        "paymentInterval",
        "agreementPayment",
        "isGratuitousBasis"
    })
    public static class PublicPropertyContract
        extends PublicPropertyContractExportType
    {

        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "ContractGUID", required = true)
        protected String contractGUID;
        /**
         * Состояние договора
         * 
         */
        @XmlElement(name = "StatusContract", required = true)
        protected String statusContract;
        /**
         * Идентификатор версии договора
         * 
         */
        @XmlElement(name = "ContractVersionGUID", required = true)
        protected String contractVersionGUID;
        /**
         * Номер версии
         * 
         */
        @XmlElement(name = "VersionNumber", required = true)
        protected BigInteger versionNumber;
        /**
         * Статус версии
         * 
         */
        @XmlElement(name = "StatusVersion", required = true)
        protected String statusVersion;
        /**
         * Период внесения платы по договору о предоставлении в пользование части общего имущества собственников помещений в многоквартирном доме
         * 
         */
        @XmlElement(name = "PaymentInterval")
        protected ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval paymentInterval;
        /**
         * Сведения о внесении платы и задолженности по такой плате
         * 
         */
        @XmlElement(name = "AgreementPayment")
        protected List<ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment> agreementPayment;
        /**
         * Договор заключен на безвозмездной основе?
         * 
         */
        @XmlElement(name = "IsGratuitousBasis")
        protected Boolean isGratuitousBasis;

        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractGUID() {
            return contractGUID;
        }

        /**
         * Sets the value of the contractGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractGUID()
         */
        public void setContractGUID(String value) {
            this.contractGUID = value;
        }

        /**
         * Состояние договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusContract() {
            return statusContract;
        }

        /**
         * Sets the value of the statusContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getStatusContract()
         */
        public void setStatusContract(String value) {
            this.statusContract = value;
        }

        /**
         * Идентификатор версии договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractVersionGUID() {
            return contractVersionGUID;
        }

        /**
         * Sets the value of the contractVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractVersionGUID()
         */
        public void setContractVersionGUID(String value) {
            this.contractVersionGUID = value;
        }

        /**
         * Номер версии
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getVersionNumber() {
            return versionNumber;
        }

        /**
         * Sets the value of the versionNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getVersionNumber()
         */
        public void setVersionNumber(BigInteger value) {
            this.versionNumber = value;
        }

        /**
         * Статус версии
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusVersion() {
            return statusVersion;
        }

        /**
         * Sets the value of the statusVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getStatusVersion()
         */
        public void setStatusVersion(String value) {
            this.statusVersion = value;
        }

        /**
         * Период внесения платы по договору о предоставлении в пользование части общего имущества собственников помещений в многоквартирном доме
         * 
         * @return
         *     possible object is
         *     {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval }
         *     
         */
        public ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval getPaymentInterval() {
            return paymentInterval;
        }

        /**
         * Sets the value of the paymentInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval }
         *     
         * @see #getPaymentInterval()
         */
        public void setPaymentInterval(ExportStatusPublicPropertyContractResultType.PublicPropertyContract.PaymentInterval value) {
            this.paymentInterval = value;
        }

        /**
         * Сведения о внесении платы и задолженности по такой плате
         * 
         * Gets the value of the agreementPayment property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agreementPayment property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAgreementPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment }
         * </p>
         * 
         * 
         * @return
         *     The value of the agreementPayment property.
         */
        public List<ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment> getAgreementPayment() {
            if (agreementPayment == null) {
                agreementPayment = new ArrayList<>();
            }
            return this.agreementPayment;
        }

        /**
         * Договор заключен на безвозмездной основе?
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsGratuitousBasis() {
            return isGratuitousBasis;
        }

        /**
         * Sets the value of the isGratuitousBasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsGratuitousBasis()
         */
        public void setIsGratuitousBasis(Boolean value) {
            this.isGratuitousBasis = value;
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
         *         <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="DatePeriod">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   <element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Bill">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="10"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Debt">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="10"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Paid">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="10"/>
         *               <fractionDigits value="2"/>
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
            "agreementPaymentVersionGUID",
            "datePeriod",
            "bill",
            "debt",
            "paid"
        })
        public static class AgreementPayment {

            /**
             * Идентификатор версии сведений о внесении платы в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "AgreementPaymentVersionGUID", required = true)
            protected String agreementPaymentVersionGUID;
            /**
             * Период
             * 
             */
            @XmlElement(name = "DatePeriod", required = true)
            protected ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod datePeriod;
            /**
             * Начислено за период
             * 
             */
            @XmlElement(name = "Bill", required = true)
            protected BigDecimal bill;
            /**
             * Размер задолженности (-)/переплаты (+) за период
             * 
             */
            @XmlElement(name = "Debt", required = true)
            protected BigDecimal debt;
            /**
             * Оплачено за период
             * 
             */
            @XmlElement(name = "Paid", required = true)
            protected BigDecimal paid;

            /**
             * Идентификатор версии сведений о внесении платы в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgreementPaymentVersionGUID() {
                return agreementPaymentVersionGUID;
            }

            /**
             * Sets the value of the agreementPaymentVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAgreementPaymentVersionGUID()
             */
            public void setAgreementPaymentVersionGUID(String value) {
                this.agreementPaymentVersionGUID = value;
            }

            /**
             * Период
             * 
             * @return
             *     possible object is
             *     {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod }
             *     
             */
            public ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod getDatePeriod() {
                return datePeriod;
            }

            /**
             * Sets the value of the datePeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod }
             *     
             * @see #getDatePeriod()
             */
            public void setDatePeriod(ExportStatusPublicPropertyContractResultType.PublicPropertyContract.AgreementPayment.DatePeriod value) {
                this.datePeriod = value;
            }

            /**
             * Начислено за период
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getBill() {
                return bill;
            }

            /**
             * Sets the value of the bill property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getBill()
             */
            public void setBill(BigDecimal value) {
                this.bill = value;
            }

            /**
             * Размер задолженности (-)/переплаты (+) за период
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDebt() {
                return debt;
            }

            /**
             * Sets the value of the debt property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getDebt()
             */
            public void setDebt(BigDecimal value) {
                this.debt = value;
            }

            /**
             * Оплачено за период
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPaid() {
                return paid;
            }

            /**
             * Sets the value of the paid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getPaid()
             */
            public void setPaid(BigDecimal value) {
                this.paid = value;
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
             *         <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         <element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "dateFrom",
                "dateTo"
            })
            public static class DatePeriod {

                @XmlElement(name = "DateFrom", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateFrom;
                @XmlElement(name = "DateTo", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateTo;

                /**
                 * Gets the value of the dateFrom property.
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
                 */
                public void setDateFrom(XMLGregorianCalendar value) {
                    this.dateFrom = value;
                }

                /**
                 * Gets the value of the dateTo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateTo() {
                    return dateTo;
                }

                /**
                 * Sets the value of the dateTo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDateTo(XMLGregorianCalendar value) {
                    this.dateTo = value;
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
         *       <choice>
         *         <sequence>
         *           <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
         *           <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionExportType" minOccurs="0"/>
         *         </sequence>
         *         <element name="Other">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type">
         *               <minLength value="1"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
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
            "startDate",
            "endDate",
            "other"
        })
        public static class PaymentInterval {

            /**
             * Начало периода
             * 
             */
            @XmlElement(name = "StartDate")
            protected DaySelectionExportType startDate;
            /**
             * Окончание периода
             * 
             */
            @XmlElement(name = "EndDate")
            protected DaySelectionExportType endDate;
            /**
             * Иное
             * 
             */
            @XmlElement(name = "Other")
            protected String other;

            /**
             * Начало периода
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
             * Окончание периода
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

            /**
             * Иное
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOther() {
                return other;
            }

            /**
             * Sets the value of the other property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOther()
             */
            public void setOther(String value) {
                this.other = value;
            }

        }

    }

}
