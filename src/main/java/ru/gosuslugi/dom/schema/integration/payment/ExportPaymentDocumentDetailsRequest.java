
package ru.gosuslugi.dom.schema.integration.payment;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID"/>
 *           <sequence>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year" minOccurs="0"/>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month" minOccurs="0"/>
 *             <choice>
 *               <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
 *               <sequence>
 *                 <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                 <choice minOccurs="0">
 *                   <sequence>
 *                     <element name="ResidentialPremise">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="255"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="ResidentialPremiseRoom" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="255"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="ResidentialBlock">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="255"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="ResidentialBlockRoom" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="255"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                   <element name="NonResidentialApartment">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="255"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="NonResidentialBlock">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="255"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </choice>
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber"/>
 *                 </choice>
 *               </sequence>
 *               <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
 *             </choice>
 *           </sequence>
 *         </choice>
 *         <element name="AmountRequired" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}Individual"/>
 *                   <element name="Legal">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
    "paymentDocumentID",
    "year",
    "month",
    "unifiedAccountNumber",
    "fiasHouseGuid",
    "residentialPremise",
    "residentialPremiseRoom",
    "residentialBlock",
    "residentialBlockRoom",
    "nonResidentialApartment",
    "nonResidentialBlock",
    "accountNumber",
    "paymentDocumentNumber",
    "serviceID",
    "amountRequired"
})
@XmlRootElement(name = "exportPaymentDocumentDetailsRequest")
public class ExportPaymentDocumentDetailsRequest
    extends BaseType
{

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
     * Номер жилого помещения
     * 
     */
    @XmlElement(name = "ResidentialPremise")
    protected String residentialPremise;
    /**
     * Номер комнаты жилого помещения
     * 
     */
    @XmlElement(name = "ResidentialPremiseRoom")
    protected String residentialPremiseRoom;
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
     * Номер нежилого помещения
     * 
     */
    @XmlElement(name = "NonResidentialApartment")
    protected String nonResidentialApartment;
    /**
     * Номер нежилого блока
     * 
     */
    @XmlElement(name = "NonResidentialBlock")
    protected String nonResidentialBlock;
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
     * Сведения о потребителе, необходимые для получения информации о сумме начислений/задолженности
     * 
     */
    @XmlElement(name = "AmountRequired")
    protected ExportPaymentDocumentDetailsRequest.AmountRequired amountRequired;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

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
     * Номер жилого помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialPremise() {
        return residentialPremise;
    }

    /**
     * Sets the value of the residentialPremise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResidentialPremise()
     */
    public void setResidentialPremise(String value) {
        this.residentialPremise = value;
    }

    /**
     * Номер комнаты жилого помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentialPremiseRoom() {
        return residentialPremiseRoom;
    }

    /**
     * Sets the value of the residentialPremiseRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResidentialPremiseRoom()
     */
    public void setResidentialPremiseRoom(String value) {
        this.residentialPremiseRoom = value;
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
     * Номер нежилого помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonResidentialApartment() {
        return nonResidentialApartment;
    }

    /**
     * Sets the value of the nonResidentialApartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNonResidentialApartment()
     */
    public void setNonResidentialApartment(String value) {
        this.nonResidentialApartment = value;
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

    /**
     * Сведения о потребителе, необходимые для получения информации о сумме начислений/задолженности
     * 
     * @return
     *     possible object is
     *     {@link ExportPaymentDocumentDetailsRequest.AmountRequired }
     *     
     */
    public ExportPaymentDocumentDetailsRequest.AmountRequired getAmountRequired() {
        return amountRequired;
    }

    /**
     * Sets the value of the amountRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPaymentDocumentDetailsRequest.AmountRequired }
     *     
     * @see #getAmountRequired()
     */
    public void setAmountRequired(ExportPaymentDocumentDetailsRequest.AmountRequired value) {
        this.amountRequired = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}Individual"/>
     *         <element name="Legal">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
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
        "individual",
        "legal"
    })
    public static class AmountRequired {

        /**
         * Потребитель-физическое лицо, в том числе индивидуальный предприниматель
         * 
         */
        @XmlElement(name = "Individual")
        protected Individual individual;
        /**
         * Юридическое лицо
         * 
         */
        @XmlElement(name = "Legal")
        protected ExportPaymentDocumentDetailsRequest.AmountRequired.Legal legal;

        /**
         * Потребитель-физическое лицо, в том числе индивидуальный предприниматель
         * 
         * @return
         *     possible object is
         *     {@link Individual }
         *     
         */
        public Individual getIndividual() {
            return individual;
        }

        /**
         * Sets the value of the individual property.
         * 
         * @param value
         *     allowed object is
         *     {@link Individual }
         *     
         * @see #getIndividual()
         */
        public void setIndividual(Individual value) {
            this.individual = value;
        }

        /**
         * Юридическое лицо
         * 
         * @return
         *     possible object is
         *     {@link ExportPaymentDocumentDetailsRequest.AmountRequired.Legal }
         *     
         */
        public ExportPaymentDocumentDetailsRequest.AmountRequired.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportPaymentDocumentDetailsRequest.AmountRequired.Legal }
         *     
         * @see #getLegal()
         */
        public void setLegal(ExportPaymentDocumentDetailsRequest.AmountRequired.Legal value) {
            this.legal = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
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
            "kpp"
        })
        public static class Legal {

            /**
             * ИНН
             * 
             */
            @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String inn;
            /**
             * КПП
             * 
             */
            @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String kpp;

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

        }

    }

}
