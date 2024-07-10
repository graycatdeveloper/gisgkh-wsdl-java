
package ru.gosuslugi.dom.schema.integration.bills;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Тип для экспорта информации о состоянии расчетов
 * 
 * <p>Java class for ExportSettlementResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportSettlementResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SettlementGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Contract">
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
 *                 <sequence>
 *                   <choice>
 *                     <element name="ReportPeriodRSOInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodRSOInfoType"/>
 *                     <element name="ReportPeriodIKUInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodIKUInfoType"/>
 *                   </choice>
 *                   <element name="ReportPeriodStatus">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Status">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="Posted"/>
 *                                   <enumeration value="Draft"/>
 *                                   <enumeration value="Annul"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="ReasonOfAnnulment" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <maxLength value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Annuled" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ReasonOfAnnulment">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <maxLength value="1000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
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
@XmlType(name = "ExportSettlementResultType", propOrder = {
    "settlementGUID",
    "contract",
    "reportingPeriod",
    "annuled"
})
public class ExportSettlementResultType {

    /**
     * Идентификатор информации о состоянии расчетов
     * 
     */
    @XmlElement(name = "SettlementGUID", required = true)
    protected String settlementGUID;
    /**
     * Информация о договоре ресурсоснабжения
     * 
     */
    @XmlElement(name = "Contract", required = true)
    protected ExportSettlementResultType.Contract contract;
    /**
     * Отчетный период
     * 
     */
    @XmlElement(name = "ReportingPeriod")
    protected List<ExportSettlementResultType.ReportingPeriod> reportingPeriod;
    /**
     * Информация о состоянии расчетов аннулирована
     * 
     */
    @XmlElement(name = "Annuled")
    protected ExportSettlementResultType.Annuled annuled;

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
     * Информация о договоре ресурсоснабжения
     * 
     * @return
     *     possible object is
     *     {@link ExportSettlementResultType.Contract }
     *     
     */
    public ExportSettlementResultType.Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSettlementResultType.Contract }
     *     
     * @see #getContract()
     */
    public void setContract(ExportSettlementResultType.Contract value) {
        this.contract = value;
    }

    /**
     * Отчетный период
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
     * {@link ExportSettlementResultType.ReportingPeriod }
     * </p>
     * 
     * 
     * @return
     *     The value of the reportingPeriod property.
     */
    public List<ExportSettlementResultType.ReportingPeriod> getReportingPeriod() {
        if (reportingPeriod == null) {
            reportingPeriod = new ArrayList<>();
        }
        return this.reportingPeriod;
    }

    /**
     * Информация о состоянии расчетов аннулирована
     * 
     * @return
     *     possible object is
     *     {@link ExportSettlementResultType.Annuled }
     *     
     */
    public ExportSettlementResultType.Annuled getAnnuled() {
        return annuled;
    }

    /**
     * Sets the value of the annuled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSettlementResultType.Annuled }
     *     
     * @see #getAnnuled()
     */
    public void setAnnuled(ExportSettlementResultType.Annuled value) {
        this.annuled = value;
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
     *         <element name="ReasonOfAnnulment">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <maxLength value="1000"/>
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
        "reasonOfAnnulment"
    })
    public static class Annuled {

        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "ReasonOfAnnulment", required = true)
        protected String reasonOfAnnulment;

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonOfAnnulment() {
            return reasonOfAnnulment;
        }

        /**
         * Sets the value of the reasonOfAnnulment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getReasonOfAnnulment()
         */
        public void setReasonOfAnnulment(String value) {
            this.reasonOfAnnulment = value;
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
        protected ExportSettlementResultType.Contract.NoContract noContract;

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
         *     {@link ExportSettlementResultType.Contract.NoContract }
         *     
         */
        public ExportSettlementResultType.Contract.NoContract getNoContract() {
            return noContract;
        }

        /**
         * Sets the value of the noContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSettlementResultType.Contract.NoContract }
         *     
         * @see #getNoContract()
         */
        public void setNoContract(ExportSettlementResultType.Contract.NoContract value) {
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
     *       <sequence>
     *         <choice>
     *           <element name="ReportPeriodRSOInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodRSOInfoType"/>
     *           <element name="ReportPeriodIKUInfo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodIKUInfoType"/>
     *         </choice>
     *         <element name="ReportPeriodStatus">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Status">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="Posted"/>
     *                         <enumeration value="Draft"/>
     *                         <enumeration value="Annul"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="ReasonOfAnnulment" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
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
        "reportPeriodRSOInfo",
        "reportPeriodIKUInfo",
        "reportPeriodStatus"
    })
    public static class ReportingPeriod
        extends ReportPeriodType
    {

        /**
         * Информация от РСО
         * 
         */
        @XmlElement(name = "ReportPeriodRSOInfo")
        protected ReportPeriodRSOInfoType reportPeriodRSOInfo;
        /**
         * Информация от исполнителя КУ
         * 
         */
        @XmlElement(name = "ReportPeriodIKUInfo")
        protected ReportPeriodIKUInfoType reportPeriodIKUInfo;
        /**
         * Статус отчетного периода
         * 
         */
        @XmlElement(name = "ReportPeriodStatus", required = true)
        protected ExportSettlementResultType.ReportingPeriod.ReportPeriodStatus reportPeriodStatus;

        /**
         * Информация от РСО
         * 
         * @return
         *     possible object is
         *     {@link ReportPeriodRSOInfoType }
         *     
         */
        public ReportPeriodRSOInfoType getReportPeriodRSOInfo() {
            return reportPeriodRSOInfo;
        }

        /**
         * Sets the value of the reportPeriodRSOInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportPeriodRSOInfoType }
         *     
         * @see #getReportPeriodRSOInfo()
         */
        public void setReportPeriodRSOInfo(ReportPeriodRSOInfoType value) {
            this.reportPeriodRSOInfo = value;
        }

        /**
         * Информация от исполнителя КУ
         * 
         * @return
         *     possible object is
         *     {@link ReportPeriodIKUInfoType }
         *     
         */
        public ReportPeriodIKUInfoType getReportPeriodIKUInfo() {
            return reportPeriodIKUInfo;
        }

        /**
         * Sets the value of the reportPeriodIKUInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportPeriodIKUInfoType }
         *     
         * @see #getReportPeriodIKUInfo()
         */
        public void setReportPeriodIKUInfo(ReportPeriodIKUInfoType value) {
            this.reportPeriodIKUInfo = value;
        }

        /**
         * Статус отчетного периода
         * 
         * @return
         *     possible object is
         *     {@link ExportSettlementResultType.ReportingPeriod.ReportPeriodStatus }
         *     
         */
        public ExportSettlementResultType.ReportingPeriod.ReportPeriodStatus getReportPeriodStatus() {
            return reportPeriodStatus;
        }

        /**
         * Sets the value of the reportPeriodStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportSettlementResultType.ReportingPeriod.ReportPeriodStatus }
         *     
         * @see #getReportPeriodStatus()
         */
        public void setReportPeriodStatus(ExportSettlementResultType.ReportingPeriod.ReportPeriodStatus value) {
            this.reportPeriodStatus = value;
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
         *         <element name="Status">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <enumeration value="Posted"/>
         *               <enumeration value="Draft"/>
         *               <enumeration value="Annul"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="ReasonOfAnnulment" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="1000"/>
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
            "status",
            "reasonOfAnnulment"
        })
        public static class ReportPeriodStatus {

            /**
             * Статус
             * 
             */
            @XmlElement(name = "Status", required = true)
            protected String status;
            /**
             * Причина аннулирования
             * 
             */
            @XmlElement(name = "ReasonOfAnnulment")
            protected String reasonOfAnnulment;

            /**
             * Статус
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getStatus()
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Причина аннулирования
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonOfAnnulment() {
                return reasonOfAnnulment;
            }

            /**
             * Sets the value of the reasonOfAnnulment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReasonOfAnnulment()
             */
            public void setReasonOfAnnulment(String value) {
                this.reasonOfAnnulment = value;
            }

        }

    }

}
