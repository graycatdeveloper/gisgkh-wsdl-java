
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
 *         <element name="importCitizenSubsidy" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CitizenSubsidyGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <sequence minOccurs="0">
 *                     <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <choice>
 *                       <element name="LoadOverview" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyOverviewType"/>
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
 *                               <element name="LoadCalculation" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyCalculationType"/>
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
 *                               <element name="LoadPayment" type="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType"/>
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
    "importCitizenSubsidy"
})
@XmlRootElement(name = "importCitizenSubsidyRequest")
public class ImportCitizenSubsidyRequest
    extends BaseType
{

    /**
     * Импорт сведений о гражданах, получающих субсидии. Импорт расчетов и выплат по гражданам, получающим субсидии
     * 
     */
    @XmlElement(required = true)
    protected List<ImportCitizenSubsidyRequest.ImportCitizenSubsidy> importCitizenSubsidy;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт сведений о гражданах, получающих субсидии. Импорт расчетов и выплат по гражданам, получающим субсидии
     * 
     * Gets the value of the importCitizenSubsidy property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importCitizenSubsidy property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportCitizenSubsidy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCitizenSubsidyRequest.ImportCitizenSubsidy }
     * </p>
     * 
     * 
     * @return
     *     The value of the importCitizenSubsidy property.
     */
    public List<ImportCitizenSubsidyRequest.ImportCitizenSubsidy> getImportCitizenSubsidy() {
        if (importCitizenSubsidy == null) {
            importCitizenSubsidy = new ArrayList<>();
        }
        return this.importCitizenSubsidy;
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
     *         <element name="CitizenSubsidyGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <sequence minOccurs="0">
     *           <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <choice>
     *             <element name="LoadOverview" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyOverviewType"/>
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
     *                     <element name="LoadCalculation" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyCalculationType"/>
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
     *                     <element name="LoadPayment" type="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType"/>
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
        "citizenSubsidyGuid",
        "transportGuid",
        "loadOverview",
        "cancel",
        "calculation",
        "payment"
    })
    public static class ImportCitizenSubsidy {

        /**
         * Идентификатор информации о гражданине в ГИС ЖКХ. Заполняется при изменении ранее загруженных общих сведений о гражданине, а также при импорте информации о расчетах и выплатах
         * 
         */
        @XmlElement(name = "CitizenSubsidyGuid")
        protected String citizenSubsidyGuid;
        /**
         * Транспортный идентификатор для выполнения операции с информацией о гражданине
         * 
         */
        @XmlElement(name = "TransportGuid")
        protected String transportGuid;
        /**
         * Добавить/Изменить общую информацию о гражданах, получающих субсидии. При изменении необходимо присылать всю информацию о гражданине в актуальном состоянии.
         * 
         */
        @XmlElement(name = "LoadOverview")
        protected CitizenSubsidyOverviewType loadOverview;
        /**
         * Аннулировать информацию о гражданине, получающем субсидии
         * 
         */
        @XmlElement(name = "Cancel")
        protected Boolean cancel;
        /**
         * Ветка для загрузки расчетов и перерасчетов по гражданину, получающему субсидии (добавление,изменение и аннулирование информации о расчетах и перерасчетах)
         * 
         */
        @XmlElement(name = "Calculation")
        protected List<ImportCitizenSubsidyRequest.ImportCitizenSubsidy.Calculation> calculation;
        /**
         * Ветка для загрузки выплат по гражданину, получающему субсидии (добавление,изменение и аннулирование информации о выплатах)
         * 
         */
        @XmlElement(name = "Payment")
        protected List<ImportCitizenSubsidyRequest.ImportCitizenSubsidy.Payment> payment;

        /**
         * Идентификатор информации о гражданине в ГИС ЖКХ. Заполняется при изменении ранее загруженных общих сведений о гражданине, а также при импорте информации о расчетах и выплатах
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitizenSubsidyGuid() {
            return citizenSubsidyGuid;
        }

        /**
         * Sets the value of the citizenSubsidyGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCitizenSubsidyGuid()
         */
        public void setCitizenSubsidyGuid(String value) {
            this.citizenSubsidyGuid = value;
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
         * Добавить/Изменить общую информацию о гражданах, получающих субсидии. При изменении необходимо присылать всю информацию о гражданине в актуальном состоянии.
         * 
         * @return
         *     possible object is
         *     {@link CitizenSubsidyOverviewType }
         *     
         */
        public CitizenSubsidyOverviewType getLoadOverview() {
            return loadOverview;
        }

        /**
         * Sets the value of the loadOverview property.
         * 
         * @param value
         *     allowed object is
         *     {@link CitizenSubsidyOverviewType }
         *     
         * @see #getLoadOverview()
         */
        public void setLoadOverview(CitizenSubsidyOverviewType value) {
            this.loadOverview = value;
        }

        /**
         * Аннулировать информацию о гражданине, получающем субсидии
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
         * Ветка для загрузки расчетов и перерасчетов по гражданину, получающему субсидии (добавление,изменение и аннулирование информации о расчетах и перерасчетах)
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
         * {@link ImportCitizenSubsidyRequest.ImportCitizenSubsidy.Calculation }
         * </p>
         * 
         * 
         * @return
         *     The value of the calculation property.
         */
        public List<ImportCitizenSubsidyRequest.ImportCitizenSubsidy.Calculation> getCalculation() {
            if (calculation == null) {
                calculation = new ArrayList<>();
            }
            return this.calculation;
        }

        /**
         * Ветка для загрузки выплат по гражданину, получающему субсидии (добавление,изменение и аннулирование информации о выплатах)
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
         * {@link ImportCitizenSubsidyRequest.ImportCitizenSubsidy.Payment }
         * </p>
         * 
         * 
         * @return
         *     The value of the payment property.
         */
        public List<ImportCitizenSubsidyRequest.ImportCitizenSubsidy.Payment> getPayment() {
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
         *           <element name="LoadCalculation" type="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyCalculationType"/>
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
            "loadCalculation",
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
            @XmlElement(name = "LoadCalculation")
            protected CitizenSubsidyCalculationType loadCalculation;
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
             *     {@link CitizenSubsidyCalculationType }
             *     
             */
            public CitizenSubsidyCalculationType getLoadCalculation() {
                return loadCalculation;
            }

            /**
             * Sets the value of the loadCalculation property.
             * 
             * @param value
             *     allowed object is
             *     {@link CitizenSubsidyCalculationType }
             *     
             * @see #getLoadCalculation()
             */
            public void setLoadCalculation(CitizenSubsidyCalculationType value) {
                this.loadCalculation = value;
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
         *           <element name="LoadPayment" type="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType"/>
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
            "loadPayment",
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
            @XmlElement(name = "LoadPayment")
            protected PaymentType loadPayment;
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
            public PaymentType getLoadPayment() {
                return loadPayment;
            }

            /**
             * Sets the value of the loadPayment property.
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentType }
             *     
             * @see #getLoadPayment()
             */
            public void setLoadPayment(PaymentType value) {
                this.loadPayment = value;
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
