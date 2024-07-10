
package ru.gosuslugi.dom.schema.integration.bills;

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
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


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
 *                                       <choice>
 *                                         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         <element name="NoContract">
 *                                           <complexType>
 *                                             <complexContent>
 *                                               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 <sequence>
 *                                                   <element name="FirstContractParty" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *                                                   <element name="DocNum" minOccurs="0">
 *                                                     <simpleType>
 *                                                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                                                         <maxLength value="30"/>
 *                                                         <minLength value="1"/>
 *                                                       </restriction>
 *                                                     </simpleType>
 *                                                   </element>
 *                                                   <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 </sequence>
 *                                               </restriction>
 *                                             </complexContent>
 *                                           </complexType>
 *                                         </element>
 *                                       </choice>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="ReportingPeriod" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
 *                                       <choice>
 *                                         <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodIKUInfoType"/>
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
@XmlRootElement(name = "importIKUSettlementsRequest")
public class ImportIKUSettlementsRequest
    extends BaseType
{

    /**
     * Импорт информации о состоянии расчетов
     * 
     */
    @XmlElement(required = true)
    protected List<ImportIKUSettlementsRequest.ImportSettlement> importSettlement;
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
     * {@link ImportIKUSettlementsRequest.ImportSettlement }
     * </p>
     * 
     * 
     * @return
     *     The value of the importSettlement property.
     */
    public List<ImportIKUSettlementsRequest.ImportSettlement> getImportSettlement() {
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
     *                             <choice>
     *                               <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               <element name="NoContract">
     *                                 <complexType>
     *                                   <complexContent>
     *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       <sequence>
     *                                         <element name="FirstContractParty" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
     *                                         <element name="DocNum" minOccurs="0">
     *                                           <simpleType>
     *                                             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                                               <maxLength value="30"/>
     *                                               <minLength value="1"/>
     *                                             </restriction>
     *                                           </simpleType>
     *                                         </element>
     *                                         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       </sequence>
     *                                     </restriction>
     *                                   </complexContent>
     *                                 </complexType>
     *                               </element>
     *                             </choice>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="ReportingPeriod" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
     *                             <choice>
     *                               <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodIKUInfoType"/>
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
         * Идентификатор информации о состоянии расчетов
         * 
         */
        @XmlElement(name = "SettlementGUID")
        protected String settlementGUID;
        /**
         * Создание/изменение информации о состоянии расчетов
         * 
         */
        @XmlElement(name = "Settlement")
        protected ImportIKUSettlementsRequest.ImportSettlement.Settlement settlement;
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
         * Идентификатор информации о состоянии расчетов
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
         *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement }
         *     
         */
        public ImportIKUSettlementsRequest.ImportSettlement.Settlement getSettlement() {
            return settlement;
        }

        /**
         * Sets the value of the settlement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement }
         *     
         * @see #getSettlement()
         */
        public void setSettlement(ImportIKUSettlementsRequest.ImportSettlement.Settlement value) {
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
         *                 <choice>
         *                   <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element name="NoContract">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="FirstContractParty" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
         *                             <element name="DocNum" minOccurs="0">
         *                               <simpleType>
         *                                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
         *                                   <maxLength value="30"/>
         *                                   <minLength value="1"/>
         *                                 </restriction>
         *                               </simpleType>
         *                             </element>
         *                             <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
         *         <element name="ReportingPeriod" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
         *                 <choice>
         *                   <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodIKUInfoType"/>
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
             * Информация о договоре ресурсоснабжения (Заполняется в случаях: 1. При создании информации о состоянии расчетов.        2. При изменения связи между информацией о состоянии расчетов и ДРСО, если прежний ДРСО аннулирован или связь не была установлена)
             * 
             */
            @XmlElement(name = "Contract")
            protected ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract contract;
            /**
             * Отчетный период (не заполняется только при изменении связи между информацией о состоянии расчетов и ДРСО)
             * 
             */
            @XmlElement(name = "ReportingPeriod")
            protected List<ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod> reportingPeriod;

            /**
             * Информация о договоре ресурсоснабжения (Заполняется в случаях: 1. При создании информации о состоянии расчетов.        2. При изменения связи между информацией о состоянии расчетов и ДРСО, если прежний ДРСО аннулирован или связь не была установлена)
             * 
             * @return
             *     possible object is
             *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract }
             *     
             */
            public ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract getContract() {
                return contract;
            }

            /**
             * Sets the value of the contract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract }
             *     
             * @see #getContract()
             */
            public void setContract(ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract value) {
                this.contract = value;
            }

            /**
             * Отчетный период (не заполняется только при изменении связи между информацией о состоянии расчетов и ДРСО)
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
             * {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod }
             * </p>
             * 
             * 
             * @return
             *     The value of the reportingPeriod property.
             */
            public List<ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod> getReportingPeriod() {
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
             *       <choice>
             *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
             *         <element name="NoContract">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="FirstContractParty" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
             *                   <element name="DocNum" minOccurs="0">
             *                     <simpleType>
             *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
             *                         <maxLength value="30"/>
             *                         <minLength value="1"/>
             *                       </restriction>
             *                     </simpleType>
             *                   </element>
             *                   <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                "contractRootGUID",
                "noContract"
            })
            public static class Contract {

                /**
                 * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractRootGUID")
                protected String contractRootGUID;
                /**
                 * Договор отсутствует
                 * 
                 */
                @XmlElement(name = "NoContract")
                protected ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract.NoContract noContract;

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

                /**
                 * Договор отсутствует
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract.NoContract }
                 *     
                 */
                public ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract.NoContract getNoContract() {
                    return noContract;
                }

                /**
                 * Sets the value of the noContract property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract.NoContract }
                 *     
                 * @see #getNoContract()
                 */
                public void setNoContract(ImportIKUSettlementsRequest.ImportSettlement.Settlement.Contract.NoContract value) {
                    this.noContract = value;
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
                 *         <element name="FirstContractParty" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
                 *         <element name="DocNum" minOccurs="0">
                 *           <simpleType>
                 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
                 *               <maxLength value="30"/>
                 *               <minLength value="1"/>
                 *             </restriction>
                 *           </simpleType>
                 *         </element>
                 *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
                    "firstContractParty",
                    "docNum",
                    "signingDate"
                })
                public static class NoContract {

                    /**
                     * Первая сторона договора
                     * 
                     */
                    @XmlElement(name = "FirstContractParty", required = true)
                    protected RegOrgType firstContractParty;
                    /**
                     * Номер документа
                     * 
                     */
                    @XmlElement(name = "DocNum")
                    protected String docNum;
                    /**
                     * Дата заключения
                     * 
                     */
                    @XmlElement(name = "SigningDate")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar signingDate;

                    /**
                     * Первая сторона договора
                     * 
                     * @return
                     *     possible object is
                     *     {@link RegOrgType }
                     *     
                     */
                    public RegOrgType getFirstContractParty() {
                        return firstContractParty;
                    }

                    /**
                     * Sets the value of the firstContractParty property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RegOrgType }
                     *     
                     * @see #getFirstContractParty()
                     */
                    public void setFirstContractParty(RegOrgType value) {
                        this.firstContractParty = value;
                    }

                    /**
                     * Номер документа
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDocNum() {
                        return docNum;
                    }

                    /**
                     * Sets the value of the docNum property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     * @see #getDocNum()
                     */
                    public void setDocNum(String value) {
                        this.docNum = value;
                    }

                    /**
                     * Дата заключения
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getSigningDate() {
                        return signingDate;
                    }

                    /**
                     * Sets the value of the signingDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     * @see #getSigningDate()
                     */
                    public void setSigningDate(XMLGregorianCalendar value) {
                        this.signingDate = value;
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType">
             *       <choice>
             *         <element name="ReportingPeriodInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodIKUInfoType"/>
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
                protected ReportPeriodIKUInfoType reportingPeriodInfo;
                /**
                 * Аннулировать отчетный период
                 * 
                 */
                @XmlElement(name = "AnnulmentReportingPeriod")
                protected ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod annulmentReportingPeriod;

                /**
                 * Создать/изменить отчетный период
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReportPeriodIKUInfoType }
                 *     
                 */
                public ReportPeriodIKUInfoType getReportingPeriodInfo() {
                    return reportingPeriodInfo;
                }

                /**
                 * Sets the value of the reportingPeriodInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReportPeriodIKUInfoType }
                 *     
                 * @see #getReportingPeriodInfo()
                 */
                public void setReportingPeriodInfo(ReportPeriodIKUInfoType value) {
                    this.reportingPeriodInfo = value;
                }

                /**
                 * Аннулировать отчетный период
                 * 
                 * @return
                 *     possible object is
                 *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod }
                 *     
                 */
                public ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod getAnnulmentReportingPeriod() {
                    return annulmentReportingPeriod;
                }

                /**
                 * Sets the value of the annulmentReportingPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod }
                 *     
                 * @see #getAnnulmentReportingPeriod()
                 */
                public void setAnnulmentReportingPeriod(ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod value) {
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
