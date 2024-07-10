
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Тип информации о размере фонда капитального ремонта
 * 
 * <p>Java class for FundSizeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FundSizeInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="QuarterPeriod" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         <element name="StartBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *         <element name="EndBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *         <element name="SentOnCapitalRepair" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="DebtForPerformedWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="PremisesInfo" maxOccurs="5000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AccountGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="StartBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyType"/>
 *                   <element name="AccruedContribution" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *                   <element name="AccruedPenalty" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *                   <element name="PaidContribution" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *                   <element name="PaidPenalty" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *                   <element name="EndBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyType"/>
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
@XmlType(name = "FundSizeInfoType", propOrder = {
    "fiasHouseGuid",
    "oktmo",
    "quarterPeriod",
    "startBalance",
    "endBalance",
    "sentOnCapitalRepair",
    "debtForPerformedWork",
    "premisesInfo"
})
@XmlSeeAlso({
    ExportFundSizeInfoType.class
})
public class FundSizeInfoType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected OKTMORefType oktmo;
    /**
     * Отчетный период
     * 
     */
    @XmlElement(name = "QuarterPeriod", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar quarterPeriod;
    /**
     * Размер фонда на начало отчетного периода
     * 
     */
    @XmlElement(name = "StartBalance", required = true)
    protected BigDecimal startBalance;
    /**
     * Размер фонда на конец отчетного периода
     * 
     */
    @XmlElement(name = "EndBalance", required = true)
    protected BigDecimal endBalance;
    /**
     * Размер средств, направленных на капитальный ремонт за отчетный период
     * 
     */
    @XmlElement(name = "SentOnCapitalRepair", required = true)
    protected BigDecimal sentOnCapitalRepair;
    /**
     * Размер задолженности за выполненные работы по капитальному ремонту по состояния на конец отчетного периода
     * 
     */
    @XmlElement(name = "DebtForPerformedWork", required = true)
    protected BigDecimal debtForPerformedWork;
    /**
     * Информация по помещениям. При изменении информации о размере фонда необходимо присылать всю информацию по помещениям в актуальном состоянии
     * 
     */
    @XmlElement(name = "PremisesInfo")
    protected List<FundSizeInfoType.PremisesInfo> premisesInfo;

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
     * ОКТМО
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuarterPeriod() {
        return quarterPeriod;
    }

    /**
     * Sets the value of the quarterPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getQuarterPeriod()
     */
    public void setQuarterPeriod(XMLGregorianCalendar value) {
        this.quarterPeriod = value;
    }

    /**
     * Размер фонда на начало отчетного периода
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartBalance() {
        return startBalance;
    }

    /**
     * Sets the value of the startBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getStartBalance()
     */
    public void setStartBalance(BigDecimal value) {
        this.startBalance = value;
    }

    /**
     * Размер фонда на конец отчетного периода
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndBalance() {
        return endBalance;
    }

    /**
     * Sets the value of the endBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getEndBalance()
     */
    public void setEndBalance(BigDecimal value) {
        this.endBalance = value;
    }

    /**
     * Размер средств, направленных на капитальный ремонт за отчетный период
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSentOnCapitalRepair() {
        return sentOnCapitalRepair;
    }

    /**
     * Sets the value of the sentOnCapitalRepair property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSentOnCapitalRepair()
     */
    public void setSentOnCapitalRepair(BigDecimal value) {
        this.sentOnCapitalRepair = value;
    }

    /**
     * Размер задолженности за выполненные работы по капитальному ремонту по состояния на конец отчетного периода
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebtForPerformedWork() {
        return debtForPerformedWork;
    }

    /**
     * Sets the value of the debtForPerformedWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDebtForPerformedWork()
     */
    public void setDebtForPerformedWork(BigDecimal value) {
        this.debtForPerformedWork = value;
    }

    /**
     * Информация по помещениям. При изменении информации о размере фонда необходимо присылать всю информацию по помещениям в актуальном состоянии
     * 
     * Gets the value of the premisesInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPremisesInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundSizeInfoType.PremisesInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the premisesInfo property.
     */
    public List<FundSizeInfoType.PremisesInfo> getPremisesInfo() {
        if (premisesInfo == null) {
            premisesInfo = new ArrayList<>();
        }
        return this.premisesInfo;
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
     *         <element name="AccountGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="StartBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyType"/>
     *         <element name="AccruedContribution" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
     *         <element name="AccruedPenalty" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
     *         <element name="PaidContribution" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
     *         <element name="PaidPenalty" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
     *         <element name="EndBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyType"/>
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
        "accountGuid",
        "startBalance",
        "accruedContribution",
        "accruedPenalty",
        "paidContribution",
        "paidPenalty",
        "endBalance"
    })
    public static class PremisesInfo {

        /**
         * Идентификатор лицевого счета
         * 
         */
        @XmlElement(name = "AccountGuid", required = true)
        protected String accountGuid;
        /**
         * Задолженность/переплата на начало периода (отрицательная сумма - задолженность, положительная - переплата)
         * 
         */
        @XmlElement(name = "StartBalance", required = true)
        protected BigDecimal startBalance;
        /**
         * Начислено взносов за период
         * 
         */
        @XmlElement(name = "AccruedContribution", required = true)
        protected BigDecimal accruedContribution;
        /**
         * Начислено пени за период
         * 
         */
        @XmlElement(name = "AccruedPenalty", required = true)
        protected BigDecimal accruedPenalty;
        /**
         * Уплачено взносов за период
         * 
         */
        @XmlElement(name = "PaidContribution", required = true)
        protected BigDecimal paidContribution;
        /**
         * Уплачено пени за период
         * 
         */
        @XmlElement(name = "PaidPenalty", required = true)
        protected BigDecimal paidPenalty;
        /**
         * Задолженность/переплата на конец периода (отрицательная сумма - задолженность, положительная - переплата)
         * 
         */
        @XmlElement(name = "EndBalance", required = true)
        protected BigDecimal endBalance;

        /**
         * Идентификатор лицевого счета
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountGuid() {
            return accountGuid;
        }

        /**
         * Sets the value of the accountGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountGuid()
         */
        public void setAccountGuid(String value) {
            this.accountGuid = value;
        }

        /**
         * Задолженность/переплата на начало периода (отрицательная сумма - задолженность, положительная - переплата)
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getStartBalance() {
            return startBalance;
        }

        /**
         * Sets the value of the startBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getStartBalance()
         */
        public void setStartBalance(BigDecimal value) {
            this.startBalance = value;
        }

        /**
         * Начислено взносов за период
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAccruedContribution() {
            return accruedContribution;
        }

        /**
         * Sets the value of the accruedContribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAccruedContribution()
         */
        public void setAccruedContribution(BigDecimal value) {
            this.accruedContribution = value;
        }

        /**
         * Начислено пени за период
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAccruedPenalty() {
            return accruedPenalty;
        }

        /**
         * Sets the value of the accruedPenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getAccruedPenalty()
         */
        public void setAccruedPenalty(BigDecimal value) {
            this.accruedPenalty = value;
        }

        /**
         * Уплачено взносов за период
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPaidContribution() {
            return paidContribution;
        }

        /**
         * Sets the value of the paidContribution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getPaidContribution()
         */
        public void setPaidContribution(BigDecimal value) {
            this.paidContribution = value;
        }

        /**
         * Уплачено пени за период
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPaidPenalty() {
            return paidPenalty;
        }

        /**
         * Sets the value of the paidPenalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getPaidPenalty()
         */
        public void setPaidPenalty(BigDecimal value) {
            this.paidPenalty = value;
        }

        /**
         * Задолженность/переплата на конец периода (отрицательная сумма - задолженность, положительная - переплата)
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEndBalance() {
            return endBalance;
        }

        /**
         * Sets the value of the endBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getEndBalance()
         */
        public void setEndBalance(BigDecimal value) {
            this.endBalance = value;
        }

    }

}
