
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Информация о совершенных операциях и остатках по счету
 * 
 * <p>Java class for OperationAndBalanceInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OperationAndBalanceInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="ReportingPeriod" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ReportingPeriodType"/>
 *         <element name="PeriodBeginningBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="PeriodEndBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="Operation" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}OperationType" maxOccurs="15000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationAndBalanceInfoType", propOrder = {
    "oktmo",
    "reportingPeriod",
    "periodBeginningBalance",
    "periodEndBalance",
    "operation"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportOperationAndBalanceRequest.ImportOperationAndBalance.OperationAndBalanceInfo.class,
    ExportOperationAndBalanceType.class
})
public class OperationAndBalanceInfoType {

    /**
     * Муниципальное образование
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected OKTMORefType oktmo;
    /**
     * Отчетный период
     * 
     */
    @XmlElement(name = "ReportingPeriod", required = true)
    protected ReportingPeriodType reportingPeriod;
    /**
     * Остаток на начало периода
     * 
     */
    @XmlElement(name = "PeriodBeginningBalance", required = true)
    protected BigDecimal periodBeginningBalance;
    /**
     * Остаток на конец периода
     * 
     */
    @XmlElement(name = "PeriodEndBalance", required = true)
    protected BigDecimal periodEndBalance;
    /**
     * Операция по счету (передаются все актуальные операции)
     * 
     */
    @XmlElement(name = "Operation")
    protected List<OperationType> operation;

    /**
     * Муниципальное образование
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Отчетный период
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriodType }
     *     
     */
    public ReportingPeriodType getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets the value of the reportingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriodType }
     *     
     * @see #getReportingPeriod()
     */
    public void setReportingPeriod(ReportingPeriodType value) {
        this.reportingPeriod = value;
    }

    /**
     * Остаток на начало периода
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodBeginningBalance() {
        return periodBeginningBalance;
    }

    /**
     * Sets the value of the periodBeginningBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPeriodBeginningBalance()
     */
    public void setPeriodBeginningBalance(BigDecimal value) {
        this.periodBeginningBalance = value;
    }

    /**
     * Остаток на конец периода
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodEndBalance() {
        return periodEndBalance;
    }

    /**
     * Sets the value of the periodEndBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPeriodEndBalance()
     */
    public void setPeriodEndBalance(BigDecimal value) {
        this.periodEndBalance = value;
    }

    /**
     * Операция по счету (передаются все актуальные операции)
     * 
     * Gets the value of the operation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the operation property.
     */
    public List<OperationType> getOperation() {
        if (operation == null) {
            operation = new ArrayList<>();
        }
        return this.operation;
    }

}
