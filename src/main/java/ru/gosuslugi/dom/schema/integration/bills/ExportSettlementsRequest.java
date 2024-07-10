
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
 *       <choice>
 *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *         <element name="SettlementGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *         <sequence>
 *           <element name="ContractNumber" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                 <maxLength value="20"/>
 *                 <minLength value="1"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="OtherContractParty" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *           <element name="Period" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="PeriodFrom" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType" minOccurs="0"/>
 *                     <element name="PeriodTo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
 *       </choice>
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
    "contractRootGUID",
    "settlementGUID",
    "contractNumber",
    "otherContractParty",
    "period"
})
@XmlRootElement(name = "exportSettlementsRequest")
public class ExportSettlementsRequest
    extends BaseType
{

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID")
    protected List<String> contractRootGUID;
    /**
     * Идентификатор информации о состоянии расчетов
     * 
     */
    @XmlElement(name = "SettlementGUID")
    protected List<String> settlementGUID;
    /**
     * Номер договора ресурсоснабжения
     * 
     */
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    /**
     * Другая сторона договора (РСО указывает вторую сторону договора, исполнитель коммунальных услуг - первую сторону)
     * 
     */
    @XmlElement(name = "OtherContractParty")
    protected RegOrgType otherContractParty;
    /**
     * Период
     * 
     */
    @XmlElement(name = "Period")
    protected ExportSettlementsRequest.Period period;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     * Gets the value of the contractRootGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractRootGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractRootGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractRootGUID property.
     */
    public List<String> getContractRootGUID() {
        if (contractRootGUID == null) {
            contractRootGUID = new ArrayList<>();
        }
        return this.contractRootGUID;
    }

    /**
     * Идентификатор информации о состоянии расчетов
     * 
     * Gets the value of the settlementGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSettlementGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the settlementGUID property.
     */
    public List<String> getSettlementGUID() {
        if (settlementGUID == null) {
            settlementGUID = new ArrayList<>();
        }
        return this.settlementGUID;
    }

    /**
     * Номер договора ресурсоснабжения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractNumber()
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Другая сторона договора (РСО указывает вторую сторону договора, исполнитель коммунальных услуг - первую сторону)
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOtherContractParty() {
        return otherContractParty;
    }

    /**
     * Sets the value of the otherContractParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOtherContractParty()
     */
    public void setOtherContractParty(RegOrgType value) {
        this.otherContractParty = value;
    }

    /**
     * Период
     * 
     * @return
     *     possible object is
     *     {@link ExportSettlementsRequest.Period }
     *     
     */
    public ExportSettlementsRequest.Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSettlementsRequest.Period }
     *     
     * @see #getPeriod()
     */
    public void setPeriod(ExportSettlementsRequest.Period value) {
        this.period = value;
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
     *         <element name="PeriodFrom" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType" minOccurs="0"/>
     *         <element name="PeriodTo" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ReportPeriodType" minOccurs="0"/>
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
        "periodFrom",
        "periodTo"
    })
    public static class Period {

        /**
         * Период с (Если не заполнено, то без ограничения начального периода)
         * 
         */
        @XmlElement(name = "PeriodFrom")
        protected ReportPeriodType periodFrom;
        /**
         * Период по (Если не заполнено, то без ограничения конечного периода)
         * 
         */
        @XmlElement(name = "PeriodTo")
        protected ReportPeriodType periodTo;

        /**
         * Период с (Если не заполнено, то без ограничения начального периода)
         * 
         * @return
         *     possible object is
         *     {@link ReportPeriodType }
         *     
         */
        public ReportPeriodType getPeriodFrom() {
            return periodFrom;
        }

        /**
         * Sets the value of the periodFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportPeriodType }
         *     
         * @see #getPeriodFrom()
         */
        public void setPeriodFrom(ReportPeriodType value) {
            this.periodFrom = value;
        }

        /**
         * Период по (Если не заполнено, то без ограничения конечного периода)
         * 
         * @return
         *     possible object is
         *     {@link ReportPeriodType }
         *     
         */
        public ReportPeriodType getPeriodTo() {
            return periodTo;
        }

        /**
         * Sets the value of the periodTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReportPeriodType }
         *     
         * @see #getPeriodTo()
         */
        public void setPeriodTo(ReportPeriodType value) {
            this.periodTo = value;
        }

    }

}
