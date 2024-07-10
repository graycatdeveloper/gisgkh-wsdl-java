
package ru.gosuslugi.dom.schema.integration.payment;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;
import ru.gosuslugi.dom.schema.integration.payments_base.PaymentInformationExportType;


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
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
 *         <element name="ServiceIDGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ExecutorInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                   <choice>
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
 *                   </choice>
 *                   <element name="PaymentInformation" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
 *                           <sequence>
 *                             <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MailingAddress">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1000"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}Purpose" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/payment/}PDServiceName" minOccurs="0"/>
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
    "unifiedAccountNumber",
    "accountNumber",
    "serviceID",
    "serviceIDGuid",
    "executorInformation",
    "purpose",
    "pdServiceName"
})
@XmlRootElement(name = "Service")
public class Service {

    /**
     * Единый лицевой счет
     * 
     */
    @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
    protected String unifiedAccountNumber;
    /**
     * Номер лицевого счета/Иной идентификатор плательщика
     * 
     */
    @XmlElement(name = "AccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected String accountNumber;
    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
    protected String serviceID;
    /**
     * GUID жилищно-коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceIDGuid", required = true)
    protected String serviceIDGuid;
    /**
     * Cведения об исполнителе
     * 
     */
    @XmlElement(name = "ExecutorInformation", required = true)
    protected Service.ExecutorInformation executorInformation;
    /**
     * Назначение платежа
     * 
     */
    @XmlElement(name = "Purpose")
    protected String purpose;
    /**
     * Наименование услуги (работы), оказываемой (выполняемой) исполнителем, штрафной санкции
     * 
     */
    @XmlElement(name = "PDServiceName")
    protected String pdServiceName;

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
     * GUID жилищно-коммунальной услуги
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIDGuid() {
        return serviceIDGuid;
    }

    /**
     * Sets the value of the serviceIDGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceIDGuid()
     */
    public void setServiceIDGuid(String value) {
        this.serviceIDGuid = value;
    }

    /**
     * Cведения об исполнителе
     * 
     * @return
     *     possible object is
     *     {@link Service.ExecutorInformation }
     *     
     */
    public Service.ExecutorInformation getExecutorInformation() {
        return executorInformation;
    }

    /**
     * Sets the value of the executorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Service.ExecutorInformation }
     *     
     * @see #getExecutorInformation()
     */
    public void setExecutorInformation(Service.ExecutorInformation value) {
        this.executorInformation = value;
    }

    /**
     * Назначение платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPurpose()
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Наименование услуги (работы), оказываемой (выполняемой) исполнителем, штрафной санкции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDServiceName() {
        return pdServiceName;
    }

    /**
     * Sets the value of the pdServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPDServiceName()
     */
    public void setPDServiceName(String value) {
        this.pdServiceName = value;
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
     *         <choice>
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
     *         </choice>
     *         <element name="PaymentInformation" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
     *                 <sequence>
     *                   <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MailingAddress">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
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
        "inn",
        "entpr",
        "legal",
        "paymentInformation",
        "mailingAddress"
    })
    public static class ExecutorInformation {

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
        protected Service.ExecutorInformation.Legal legal;
        /**
         * Сведения о платежных реквизитах организации
         * 
         */
        @XmlElement(name = "PaymentInformation", required = true)
        protected List<Service.ExecutorInformation.PaymentInformation> paymentInformation;
        /**
         * Почтовый адрес
         * 
         */
        @XmlElement(name = "MailingAddress", required = true)
        protected String mailingAddress;

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
         *     {@link Service.ExecutorInformation.Legal }
         *     
         */
        public Service.ExecutorInformation.Legal getLegal() {
            return legal;
        }

        /**
         * Sets the value of the legal property.
         * 
         * @param value
         *     allowed object is
         *     {@link Service.ExecutorInformation.Legal }
         *     
         * @see #getLegal()
         */
        public void setLegal(Service.ExecutorInformation.Legal value) {
            this.legal = value;
        }

        /**
         * Сведения о платежных реквизитах организации
         * 
         * Gets the value of the paymentInformation property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPaymentInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Service.ExecutorInformation.PaymentInformation }
         * </p>
         * 
         * 
         * @return
         *     The value of the paymentInformation property.
         */
        public List<Service.ExecutorInformation.PaymentInformation> getPaymentInformation() {
            if (paymentInformation == null) {
                paymentInformation = new ArrayList<>();
            }
            return this.paymentInformation;
        }

        /**
         * Почтовый адрес
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMailingAddress() {
            return mailingAddress;
        }

        /**
         * Sets the value of the mailingAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMailingAddress()
         */
        public void setMailingAddress(String value) {
            this.mailingAddress = value;
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


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}PaymentInformationExportType">
         *       <sequence>
         *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
            "paymentInformationGuid"
        })
        public static class PaymentInformation
            extends PaymentInformationExportType
        {

            /**
             * Идентификатор платежных реквизитов организации
             * 
             */
            @XmlElement(name = "PaymentInformationGuid")
            protected String paymentInformationGuid;

            /**
             * Идентификатор платежных реквизитов организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentInformationGuid() {
                return paymentInformationGuid;
            }

            /**
             * Sets the value of the paymentInformationGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPaymentInformationGuid()
             */
            public void setPaymentInformationGuid(String value) {
                this.paymentInformationGuid = value;
            }

        }

    }

}
