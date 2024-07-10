
package ru.gosuslugi.dom.schema.integration.bills;

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
 *         <element name="importSettlement" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="SettlementGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="Settlement">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Contract" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ReportingPeriod" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
 *                                       <choice>
 *                                         <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodRSOInfoType"/>
 *                                         <element name="AnnulmentReportingPeriod">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType">
 *                                               </extension>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                       </choice>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentSettlement" type="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.2.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importSettlement"
})
@XmlRootElement(name = "importRSOSettlementsRequest")
public class ImportRSOSettlementsRequest
    extends BaseType
{

    /**
     * Импорт информации о состоянии расчетов
     * 
     */
    @XmlElement(required = true)
    protected List<ImportRSOSettlementsRequest.ImportSettlement> importSettlement;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт информации о состоянии расчетов
     * 
     * Gets the value of the importSettlement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importSettlement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportRSOSettlementsRequest.ImportSettlement }
     * </p>
     * 
     * 
     * @return
     *     The value of the importSettlement property.
     */
    public List<ImportRSOSettlementsRequest.ImportSettlement> getImportSettlement() {
        if (importSettlement == null) {
            importSettlement = new ArrayList<>();
        }
        return this.importSettlement;
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
            return "10.0.2.1";
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <element name="SettlementGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <choice>
     *           <element name="Settlement">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Contract" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="ReportingPeriod" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
     *                             <choice>
     *                               <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodRSOInfoType"/>
     *                               <element name="AnnulmentReportingPeriod">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType">
     *                                     </extension>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                             </choice>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentSettlement" type="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType"/>
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
        "settlementGUID",
        "settlement",
        "annulmentSettlement"
    })
    public static class ImportSettlement {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор информации о состоянии расчетов (обязателен при изменении или аннулировании информации о состоянии расчетов)
         * 
         */
        @XmlElement(name = "SettlementGUID")
        protected String settlementGUID;
        /**
         * Создание/изменение информации о состоянии расчетов
         * 
         */
        @XmlElement(name = "Settlement")
        protected ImportRSOSettlementsRequest.ImportSettlement.Settlement settlement;
        /**
         * Аннулировать информацию о расчетах
         * 
         */
        @XmlElement(name = "AnnulmentSettlement")
        protected AnnulmentType annulmentSettlement;

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
         * Идентификатор информации о состоянии расчетов (обязателен при изменении или аннулировании информации о состоянии расчетов)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSettlementGUID() {
            return settlementGUID;
        }

        /**
         * Sets the value of the settlementGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSettlementGUID()
         */
        public void setSettlementGUID(String value) {
            this.settlementGUID = value;
        }

        /**
         * Создание/изменение информации о состоянии расчетов
         * 
         * @return
         *     possible object is
         *     {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement }
         *     
         */
        public ImportRSOSettlementsRequest.ImportSettlement.Settlement getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement }
         *     
         * @see #getSettlement()
         */
        public void setSettlement(ImportRSOSettlementsRequest.ImportSettlement.Settlement value) {
            this.settlement = value;
        }

        /**
         * Аннулировать информацию о расчетах
         * 
         * @return
         *     possible object is
         *     {@link AnnulmentType }
         *     
         */
        public AnnulmentType getAnnulmentSettlement() {
            return annulmentSettlement;
        }

        /**
         * Sets the value of the annulmentSettlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnnulmentType }
         *     
         * @see #getAnnulmentSettlement()
         */
        public void setAnnulmentSettlement(AnnulmentType value) {
            this.annulmentSettlement = value;
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
         *         <element name="Contract" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ReportingPeriod" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
         *                 <choice>
         *                   <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodRSOInfoType"/>
         *                   <element name="AnnulmentReportingPeriod">
         *                     <complexType>
         *                       <complexContent>
         *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType">
         *                         </extension>
         *                       </complexContent>
         *                     </complexType>
         *                   </element>
         *                 </choice>
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
        @XmlType(name = "", propOrder = {
            "contract",
            "reportingPeriod"
        })
        public static class Settlement {

            /**
             * Информация о договоре (заполняется при создании информации о состоянии расчетов или необходимости изменения связи с аннулированным ДРСО)
             * 
             */
            @XmlElement(name = "Contract")
            protected ImportRSOSettlementsRequest.ImportSettlement.Settlement.Contract contract;
            /**
             * Отчетный период (не обязателен только при изменении связи между информацией о состоянии расчетов и ДРСО)
             * 
             */
            @XmlElement(name = "ReportingPeriod")
            protected List<ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod> reportingPeriod;

            /**
             * Информация о договоре (заполняется при создании информации о состоянии расчетов или необходимости изменения связи с аннулированным ДРСО)
             * 
             * @return
             *     possible object is
             *     {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement.Contract }
             *     
             */
            public ImportRSOSettlementsRequest.ImportSettlement.Settlement.Contract getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement.Contract }
             *     
             * @see #getContract()
             */
            public void setContract(ImportRSOSettlementsRequest.ImportSettlement.Settlement.Contract value) {
                this.contract = value;
            }

            /**
             * Отчетный период (не обязателен только при изменении связи между информацией о состоянии расчетов и ДРСО)
             * 
             * Gets the value of the reportingPeriod property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reportingPeriod property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getReportingPeriod().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod }
             * </p>
             * 
             * 
             * @return
             *     The value of the reportingPeriod property.
             */
            public List<ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod> getReportingPeriod() {
                if (reportingPeriod == null) {
                    reportingPeriod = new ArrayList<>();
                }
                return this.reportingPeriod;
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
             *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "contractRootGUID"
            })
            public static class Contract {

                /**
                 * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractRootGUID", required = true)
                protected String contractRootGUID;

                /**
                 * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractRootGUID() {
                    return contractRootGUID;
                }

                /**
                 * Sets the value of the contractRootGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractRootGUID()
                 */
                public void setContractRootGUID(String value) {
                    this.contractRootGUID = value;
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
             *       <choice>
             *         <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodRSOInfoType"/>
             *         <element name="AnnulmentReportingPeriod">
             *           <complexType>
             *             <complexContent>
             *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType">
             *               </extension>
             *             </complexContent>
             *           </complexType>
             *         </element>
             *       </choice>
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reportingPeriodInfo",
                "annulmentReportingPeriod"
            })
            public static class ReportingPeriod
                extends ReportPeriodType
            {

                /**
                 * Создать/изменить отчетный период
                 * 
                 */
                @XmlElement(name = "ReportingPeriodInfo")
                protected ReportPeriodRSOInfoType reportingPeriodInfo;
                /**
                 * Аннулировать отчетный период
                 * 
                 */
                @XmlElement(name = "AnnulmentReportingPeriod")
                protected ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod annulmentReportingPeriod;

                /**
                 * Создать/изменить отчетный период
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportPeriodRSOInfoType }
                 *     
                 */
                public ReportPeriodRSOInfoType getReportingPeriodInfo() {
                    return reportingPeriodInfo;
                }

                /**
                 * Sets the value of the reportingPeriodInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportPeriodRSOInfoType }
                 *     
                 * @see #getReportingPeriodInfo()
                 */
                public void setReportingPeriodInfo(ReportPeriodRSOInfoType value) {
                    this.reportingPeriodInfo = value;
                }

                /**
                 * Аннулировать отчетный период
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod }
                 *     
                 */
                public ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod getAnnulmentReportingPeriod() {
                    return annulmentReportingPeriod;
                }

                /**
                 * Sets the value of the annulmentReportingPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod }
                 *     
                 * @see #getAnnulmentReportingPeriod()
                 */
                public void setAnnulmentReportingPeriod(ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod value) {
                    this.annulmentReportingPeriod = value;
                }


                /**
                 * <p>Java class for anonymous complex type</p>.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.</p>
                 * 
                 * <pre>{@code
                 * <complexType>
                 *   <complexContent>
                 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}AnnulmentType">
                 *     </extension>
                 *   </complexContent>
                 * </complexType>
                 * }</pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class AnnulmentReportingPeriod
                    extends AnnulmentType
                {


                }

            }

        }

    }

}
