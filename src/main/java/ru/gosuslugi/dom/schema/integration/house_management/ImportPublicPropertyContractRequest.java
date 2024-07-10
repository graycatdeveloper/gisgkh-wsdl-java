
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
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
 *       <choice>
 *         <element name="Contract" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ContractVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="PublicPropertyContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PublicPropertyContractType">
 *                             <sequence>
 *                               <element name="PaymentInterval" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <choice>
 *                                         <sequence>
 *                                           <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
 *                                           <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
 *                                         </sequence>
 *                                         <element name="Other">
 *                                           <simpleType>
 *                                             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type">
 *                                               <minLength value="1"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AddAgreementPayment" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="ContractVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
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
 *                   <element name="Bill" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
 *                   <element name="Debt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyType"/>
 *                   <element name="Paid" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnnulAgreementPayment" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DelAgreementPayment" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.10""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contract",
    "addAgreementPayment",
    "annulAgreementPayment",
    "delAgreementPayment"
})
@XmlRootElement(name = "importPublicPropertyContractRequest")
public class ImportPublicPropertyContractRequest
    extends BaseType
{

    @XmlElement(name = "Contract")
    protected List<ImportPublicPropertyContractRequest.Contract> contract;
    /**
     * Заполнение сведений о внесении платы
     * 
     */
    @XmlElement(name = "AddAgreementPayment")
    protected List<ImportPublicPropertyContractRequest.AddAgreementPayment> addAgreementPayment;
    /**
     * Аннулирование  сведений о внесении платы
     * 
     */
    @XmlElement(name = "AnnulAgreementPayment")
    protected List<ImportPublicPropertyContractRequest.AnnulAgreementPayment> annulAgreementPayment;
    /**
     * Удаление сведений о внесении платы
     * 
     */
    @XmlElement(name = "DelAgreementPayment")
    protected List<ImportPublicPropertyContractRequest.DelAgreementPayment> delAgreementPayment;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Gets the value of the contract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPublicPropertyContractRequest.Contract }
     * </p>
     * 
     * 
     * @return
     *     The value of the contract property.
     */
    public List<ImportPublicPropertyContractRequest.Contract> getContract() {
        if (contract == null) {
            contract = new ArrayList<>();
        }
        return this.contract;
    }

    /**
     * Заполнение сведений о внесении платы
     * 
     * Gets the value of the addAgreementPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addAgreementPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddAgreementPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPublicPropertyContractRequest.AddAgreementPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the addAgreementPayment property.
     */
    public List<ImportPublicPropertyContractRequest.AddAgreementPayment> getAddAgreementPayment() {
        if (addAgreementPayment == null) {
            addAgreementPayment = new ArrayList<>();
        }
        return this.addAgreementPayment;
    }

    /**
     * Аннулирование  сведений о внесении платы
     * 
     * Gets the value of the annulAgreementPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annulAgreementPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnnulAgreementPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPublicPropertyContractRequest.AnnulAgreementPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the annulAgreementPayment property.
     */
    public List<ImportPublicPropertyContractRequest.AnnulAgreementPayment> getAnnulAgreementPayment() {
        if (annulAgreementPayment == null) {
            annulAgreementPayment = new ArrayList<>();
        }
        return this.annulAgreementPayment;
    }

    /**
     * Удаление сведений о внесении платы
     * 
     * Gets the value of the delAgreementPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delAgreementPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDelAgreementPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPublicPropertyContractRequest.DelAgreementPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the delAgreementPayment property.
     */
    public List<ImportPublicPropertyContractRequest.DelAgreementPayment> getDelAgreementPayment() {
        if (delAgreementPayment == null) {
            delAgreementPayment = new ArrayList<>();
        }
        return this.delAgreementPayment;
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
            return "11.2.0.10";
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="ContractVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
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
     *         <element name="Bill" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
     *         <element name="Debt" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyType"/>
     *         <element name="Paid" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
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
        "transportGUID",
        "contractVersionGUID",
        "agreementPaymentVersionGUID",
        "datePeriod",
        "bill",
        "debt",
        "paid"
    })
    public static class AddAgreementPayment {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор версии ДОГПОИ в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractVersionGUID")
        protected String contractVersionGUID;
        /**
         * Идентификатор версии сведений о внесении платы в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AgreementPaymentVersionGUID")
        protected String agreementPaymentVersionGUID;
        /**
         * Период
         * 
         */
        @XmlElement(name = "DatePeriod", required = true)
        protected ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod datePeriod;
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

        /**
         * Идентификатор версии ДОГПОИ в ГИС ЖКХ
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
         *     {@link ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod }
         *     
         */
        public ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod getDatePeriod() {
            return datePeriod;
        }

        /**
         * Sets the value of the datePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod }
         *     
         * @see #getDatePeriod()
         */
        public void setDatePeriod(ImportPublicPropertyContractRequest.AddAgreementPayment.DatePeriod value) {
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "transportGUID",
        "agreementPaymentVersionGUID"
    })
    public static class AnnulAgreementPayment
        extends AnnulmentType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор версии сведений о внесении платы в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AgreementPaymentVersionGUID", required = true)
        protected String agreementPaymentVersionGUID;

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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="ContractVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <choice>
     *           <element name="PublicPropertyContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PublicPropertyContractType">
     *                   <sequence>
     *                     <element name="PaymentInterval" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <choice>
     *                               <sequence>
     *                                 <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
     *                                 <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
     *                               </sequence>
     *                               <element name="Other">
     *                                 <simpleType>
     *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type">
     *                                     <minLength value="1"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </choice>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType"/>
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
        "transportGUID",
        "contractVersionGUID",
        "publicPropertyContract",
        "annulmentContract"
    })
    public static class Contract {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор версии ДОГПОИ в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractVersionGUID")
        protected String contractVersionGUID;
        /**
         * Создание\изменение ДОГПОИ
         * 
         */
        @XmlElement(name = "PublicPropertyContract")
        protected ImportPublicPropertyContractRequest.Contract.PublicPropertyContract publicPropertyContract;
        /**
         * Аннулирование ДПОИ
         * 
         */
        @XmlElement(name = "AnnulmentContract")
        protected AnnulmentType annulmentContract;

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

        /**
         * Идентификатор версии ДОГПОИ в ГИС ЖКХ
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
         * Создание\изменение ДОГПОИ
         * 
         * @return
         *     possible object is
         *     {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract }
         *     
         */
        public ImportPublicPropertyContractRequest.Contract.PublicPropertyContract getPublicPropertyContract() {
            return publicPropertyContract;
        }

        /**
         * Sets the value of the publicPropertyContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract }
         *     
         * @see #getPublicPropertyContract()
         */
        public void setPublicPropertyContract(ImportPublicPropertyContractRequest.Contract.PublicPropertyContract value) {
            this.publicPropertyContract = value;
        }

        /**
         * Аннулирование ДПОИ
         * 
         * @return
         *     possible object is
         *     {@link AnnulmentType }
         *     
         */
        public AnnulmentType getAnnulmentContract() {
            return annulmentContract;
        }

        /**
         * Sets the value of the annulmentContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnnulmentType }
         *     
         * @see #getAnnulmentContract()
         */
        public void setAnnulmentContract(AnnulmentType value) {
            this.annulmentContract = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PublicPropertyContractType">
         *       <sequence>
         *         <element name="PaymentInterval" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <choice>
         *                   <sequence>
         *                     <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
         *                     <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
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
            "paymentInterval"
        })
        public static class PublicPropertyContract
            extends PublicPropertyContractType
        {

            /**
             * Период внесения платы по договору о предоставлении в пользование части общего имущества собственников помещений в многоквартирном доме
             * 
             */
            @XmlElement(name = "PaymentInterval")
            protected ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval paymentInterval;

            /**
             * Период внесения платы по договору о предоставлении в пользование части общего имущества собственников помещений в многоквартирном доме
             * 
             * @return
             *     possible object is
             *     {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval }
             *     
             */
            public ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval getPaymentInterval() {
                return paymentInterval;
            }

            /**
             * Sets the value of the paymentInterval property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval }
             *     
             * @see #getPaymentInterval()
             */
            public void setPaymentInterval(ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.PaymentInterval value) {
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
             *       <choice>
             *         <sequence>
             *           <element name="StartDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
             *           <element name="EndDate" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}DaySelectionType"/>
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
                protected DaySelectionType startDate;
                /**
                 * Окончание периода
                 * 
                 */
                @XmlElement(name = "EndDate")
                protected DaySelectionType endDate;
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
                 *     {@link DaySelectionType }
                 *     
                 */
                public DaySelectionType getStartDate() {
                    return startDate;
                }

                /**
                 * Sets the value of the startDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DaySelectionType }
                 *     
                 * @see #getStartDate()
                 */
                public void setStartDate(DaySelectionType value) {
                    this.startDate = value;
                }

                /**
                 * Окончание периода
                 * 
                 * @return
                 *     possible object is
                 *     {@link DaySelectionType }
                 *     
                 */
                public DaySelectionType getEndDate() {
                    return endDate;
                }

                /**
                 * Sets the value of the endDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DaySelectionType }
                 *     
                 * @see #getEndDate()
                 */
                public void setEndDate(DaySelectionType value) {
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="AgreementPaymentVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "transportGUID",
        "agreementPaymentVersionGUID"
    })
    public static class DelAgreementPayment {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор версии сведений о внесении платы в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AgreementPaymentVersionGUID", required = true)
        protected String agreementPaymentVersionGUID;

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

    }

}
