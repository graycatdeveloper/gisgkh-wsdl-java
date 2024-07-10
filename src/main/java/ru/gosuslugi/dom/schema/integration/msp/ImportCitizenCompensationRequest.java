
package ru.gosuslugi.dom.schema.integration.msp;

import java.util.ArrayList;
import java.util.List;
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
 *         <element name="importCitizenCompensation" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CitizenCompensationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <sequence minOccurs="0">
 *                     <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <choice>
 *                       <element name="LoadOverview" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationOverviewType"/>
 *                       <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     </choice>
 *                   </sequence>
 *                   <element name="Calculation" maxOccurs="1000" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="CalculationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <choice>
 *                               <element name="LoadCalculations" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationCalculationType"/>
 *                               <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             </choice>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Payment" maxOccurs="1000" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="PaymentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <choice>
 *                               <element name="LoadPayments" type="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType"/>
 *                               <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             </choice>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importCitizenCompensation"
})
@XmlRootElement(name = "importCitizenCompensationRequest")
public class ImportCitizenCompensationRequest
    extends BaseType
{

    /**
     * Импорт сведений о гражданах, получающих компенсации расходов. Импорт расчетов и выплат по гражданам, получающим компенсации расходов
     * 
     */
    @XmlElement(required = true)
    protected List<ImportCitizenCompensationRequest.ImportCitizenCompensation> importCitizenCompensation;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт сведений о гражданах, получающих компенсации расходов. Импорт расчетов и выплат по гражданам, получающим компенсации расходов
     * 
     * Gets the value of the importCitizenCompensation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importCitizenCompensation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportCitizenCompensation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCitizenCompensationRequest.ImportCitizenCompensation }
     * </p>
     * 
     * 
     * @return
     *     The value of the importCitizenCompensation property.
     */
    public List<ImportCitizenCompensationRequest.ImportCitizenCompensation> getImportCitizenCompensation() {
        if (importCitizenCompensation == null) {
            importCitizenCompensation = new ArrayList<>();
        }
        return this.importCitizenCompensation;
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
            return "11.0.0.1";
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
     *         <element name="CitizenCompensationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <sequence minOccurs="0">
     *           <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <choice>
     *             <element name="LoadOverview" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationOverviewType"/>
     *             <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           </choice>
     *         </sequence>
     *         <element name="Calculation" maxOccurs="1000" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="CalculationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <choice>
     *                     <element name="LoadCalculations" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationCalculationType"/>
     *                     <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   </choice>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Payment" maxOccurs="1000" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="PaymentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <choice>
     *                     <element name="LoadPayments" type="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType"/>
     *                     <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    @XmlType(name = "", propOrder = {
        "citizenCompensationGuid",
        "transportGuid",
        "loadOverview",
        "cancel",
        "calculation",
        "payment"
    })
    public static class ImportCitizenCompensation {

        /**
         * Идентификатор информации о гражданине в ГИС ЖКХ. Заполняется при изменении ранее загруженных общих сведений о гражданине, а также при импорте информации о расчетах и выплатах
         * 
         */
        @XmlElement(name = "CitizenCompensationGuid")
        protected String citizenCompensationGuid;
        /**
         * Транспортный идентификатор для выполнения операции с информацией о гражданине
         * 
         */
        @XmlElement(name = "TransportGuid")
        protected String transportGuid;
        /**
         * Добавить/Изменить общую информацию о гражданах, получающих компенсации расходов. При изменении необходимо присылать всю информацию о гражданине в актуальном состоянии.
         * 
         */
        @XmlElement(name = "LoadOverview")
        protected CitizenCompensationOverviewType loadOverview;
        /**
         * Аннулировать информацию о гражданине, получающем компенсации расходов
         * 
         */
        @XmlElement(name = "Cancel")
        protected Boolean cancel;
        /**
         * Ветка для загрузки расчетов и перерасчетов по гражданину, получающему компенсации расходов (добавление,изменение и аннулирование информации о расчетах и перерасчетах)
         * 
         */
        @XmlElement(name = "Calculation")
        protected List<ImportCitizenCompensationRequest.ImportCitizenCompensation.Calculation> calculation;
        /**
         * Ветка для загрузки выплат по гражданину, получающему компенсации расходов (добавление,изменение и аннулирование информации о выплатах)
         * 
         */
        @XmlElement(name = "Payment")
        protected List<ImportCitizenCompensationRequest.ImportCitizenCompensation.Payment> payment;

        /**
         * Идентификатор информации о гражданине в ГИС ЖКХ. Заполняется при изменении ранее загруженных общих сведений о гражданине, а также при импорте информации о расчетах и выплатах
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitizenCompensationGuid() {
            return citizenCompensationGuid;
        }

        /**
         * Sets the value of the citizenCompensationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCitizenCompensationGuid()
         */
        public void setCitizenCompensationGuid(String value) {
            this.citizenCompensationGuid = value;
        }

        /**
         * Транспортный идентификатор для выполнения операции с информацией о гражданине
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGuid() {
            return transportGuid;
        }

        /**
         * Sets the value of the transportGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGuid()
         */
        public void setTransportGuid(String value) {
            this.transportGuid = value;
        }

        /**
         * Добавить/Изменить общую информацию о гражданах, получающих компенсации расходов. При изменении необходимо присылать всю информацию о гражданине в актуальном состоянии.
         * 
         * @return
         *     possible object is
         *     {@link CitizenCompensationOverviewType }
         *     
         */
        public CitizenCompensationOverviewType getLoadOverview() {
            return loadOverview;
        }

        /**
         * Sets the value of the loadOverview property.
         * 
         * @param value
         *     allowed object is
         *     {@link CitizenCompensationOverviewType }
         *     
         * @see #getLoadOverview()
         */
        public void setLoadOverview(CitizenCompensationOverviewType value) {
            this.loadOverview = value;
        }

        /**
         * Аннулировать информацию о гражданине, получающем компенсации расходов
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancel() {
            return cancel;
        }

        /**
         * Sets the value of the cancel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancel()
         */
        public void setCancel(Boolean value) {
            this.cancel = value;
        }

        /**
         * Ветка для загрузки расчетов и перерасчетов по гражданину, получающему компенсации расходов (добавление,изменение и аннулирование информации о расчетах и перерасчетах)
         * 
         * Gets the value of the calculation property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the calculation property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCalculation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportCitizenCompensationRequest.ImportCitizenCompensation.Calculation }
         * </p>
         * 
         * 
         * @return
         *     The value of the calculation property.
         */
        public List<ImportCitizenCompensationRequest.ImportCitizenCompensation.Calculation> getCalculation() {
            if (calculation == null) {
                calculation = new ArrayList<>();
            }
            return this.calculation;
        }

        /**
         * Ветка для загрузки выплат по гражданину, получающему компенсации расходов (добавление,изменение и аннулирование информации о выплатах)
         * 
         * Gets the value of the payment property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportCitizenCompensationRequest.ImportCitizenCompensation.Payment }
         * </p>
         * 
         * 
         * @return
         *     The value of the payment property.
         */
        public List<ImportCitizenCompensationRequest.ImportCitizenCompensation.Payment> getPayment() {
            if (payment == null) {
                payment = new ArrayList<>();
            }
            return this.payment;
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
         *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="CalculationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <choice>
         *           <element name="LoadCalculations" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationCalculationType"/>
         *           <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "transportGuid",
            "calculationGuid",
            "loadCalculations",
            "cancel"
        })
        public static class Calculation {

            /**
             * Транспортный идентификатор для выполнения операции с информацией о расчетах и перерасчетах
             * 
             */
            @XmlElement(name = "TransportGuid", required = true)
            protected String transportGuid;
            /**
             * Идентификатор информации о расчетах и перерасчетах гражданина в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "CalculationGuid")
            protected String calculationGuid;
            /**
             * Добавить/Изменить информацию о расчетах и перерасчетах
             * 
             */
            @XmlElement(name = "LoadCalculations")
            protected CitizenCompensationCalculationType loadCalculations;
            /**
             * Аннулировать информацию
             * 
             */
            @XmlElement(name = "Cancel")
            protected Boolean cancel;

            /**
             * Транспортный идентификатор для выполнения операции с информацией о расчетах и перерасчетах
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportGuid() {
                return transportGuid;
            }

            /**
             * Sets the value of the transportGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTransportGuid()
             */
            public void setTransportGuid(String value) {
                this.transportGuid = value;
            }

            /**
             * Идентификатор информации о расчетах и перерасчетах гражданина в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCalculationGuid() {
                return calculationGuid;
            }

            /**
             * Sets the value of the calculationGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCalculationGuid()
             */
            public void setCalculationGuid(String value) {
                this.calculationGuid = value;
            }

            /**
             * Добавить/Изменить информацию о расчетах и перерасчетах
             * 
             * @return
             *     possible object is
             *     {@link CitizenCompensationCalculationType }
             *     
             */
            public CitizenCompensationCalculationType getLoadCalculations() {
                return loadCalculations;
            }

            /**
             * Sets the value of the loadCalculations property.
             * 
             * @param value
             *     allowed object is
             *     {@link CitizenCompensationCalculationType }
             *     
             * @see #getLoadCalculations()
             */
            public void setLoadCalculations(CitizenCompensationCalculationType value) {
                this.loadCalculations = value;
            }

            /**
             * Аннулировать информацию
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCancel() {
                return cancel;
            }

            /**
             * Sets the value of the cancel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isCancel()
             */
            public void setCancel(Boolean value) {
                this.cancel = value;
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
         *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="PaymentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <choice>
         *           <element name="LoadPayments" type="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType"/>
         *           <element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "transportGuid",
            "paymentGuid",
            "loadPayments",
            "cancel"
        })
        public static class Payment {

            /**
             * Транспортный идентификатор для выполнения операции с информацией о выплатах гражданину
             * 
             */
            @XmlElement(name = "TransportGuid", required = true)
            protected String transportGuid;
            /**
             * Идентификатор информации о выплатах гражданину в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "PaymentGuid")
            protected String paymentGuid;
            /**
             * Добавить/Изменить информацию о выплатах
             * 
             */
            @XmlElement(name = "LoadPayments")
            protected PaymentType loadPayments;
            /**
             * Аннулировать информацию о выплатах
             * 
             */
            @XmlElement(name = "Cancel")
            protected Boolean cancel;

            /**
             * Транспортный идентификатор для выполнения операции с информацией о выплатах гражданину
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportGuid() {
                return transportGuid;
            }

            /**
             * Sets the value of the transportGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTransportGuid()
             */
            public void setTransportGuid(String value) {
                this.transportGuid = value;
            }

            /**
             * Идентификатор информации о выплатах гражданину в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentGuid() {
                return paymentGuid;
            }

            /**
             * Sets the value of the paymentGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPaymentGuid()
             */
            public void setPaymentGuid(String value) {
                this.paymentGuid = value;
            }

            /**
             * Добавить/Изменить информацию о выплатах
             * 
             * @return
             *     possible object is
             *     {@link PaymentType }
             *     
             */
            public PaymentType getLoadPayments() {
                return loadPayments;
            }

            /**
             * Sets the value of the loadPayments property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentType }
             *     
             * @see #getLoadPayments()
             */
            public void setLoadPayments(PaymentType value) {
                this.loadPayments = value;
            }

            /**
             * Аннулировать информацию о выплатах
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCancel() {
                return cancel;
            }

            /**
             * Sets the value of the cancel property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isCancel()
             */
            public void setCancel(Boolean value) {
                this.cancel = value;
            }

        }

    }

}
