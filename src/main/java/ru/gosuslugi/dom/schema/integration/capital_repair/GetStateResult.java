
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseAsyncResponseType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseAsyncResponseType">
 *       <choice minOccurs="0">
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}CapRemCommonResultType" maxOccurs="unbounded"/>
 *         <element name="Contract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}exportFullContractType" maxOccurs="1000"/>
 *         <element name="Account" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportAccountType" maxOccurs="5000"/>
 *         <element name="Decision" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}exportDecisionType" maxOccurs="1000"/>
 *         <element name="CreditContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportCreditContractType" maxOccurs="unbounded"/>
 *         <element name="FundSizeInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}exportFundSizeInfoType" maxOccurs="unbounded"/>
 *         <element name="Plan" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportPlanPassportType" maxOccurs="1000"/>
 *         <element name="PlanWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportWorkPlanType" maxOccurs="1000"/>
 *         <element name="RegionalProgram" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportRegionalProgramType" maxOccurs="1000"/>
 *         <element name="RegionalProgramWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportRegionalProgramWorkType" maxOccurs="1000"/>
 *         <element name="DecisionPD" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportDecisionPDType" maxOccurs="1000"/>
 *       </choice>
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
    "errorMessage",
    "importResult",
    "contract",
    "account",
    "decision",
    "creditContract",
    "fundSizeInfo",
    "plan",
    "planWork",
    "regionalProgram",
    "regionalProgramWork",
    "decisionPD"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    /**
     * Результат импорта
     * 
     */
    @XmlElement(name = "ImportResult")
    protected List<CapRemCommonResultType> importResult;
    /**
     * Экспортируемый договор
     * 
     */
    @XmlElement(name = "Contract")
    protected List<ExportFullContractType> contract;
    /**
     * Информация о счетах регионального оператора/специальных счетах
     * 
     */
    @XmlElement(name = "Account")
    protected List<ExportAccountType> account;
    /**
     * Экспортируемое решение о выборе способа формирования фонда капитального ремонта
     * 
     */
    @XmlElement(name = "Decision")
    protected List<ExportDecisionType> decision;
    /**
     * Экспортируемый кредитный договор/договор займа
     * 
     */
    @XmlElement(name = "CreditContract")
    protected List<ExportCreditContractType> creditContract;
    /**
     * Экспортируемая информация о размере фондов капитального ремонта
     * 
     */
    @XmlElement(name = "FundSizeInfo")
    protected List<ExportFundSizeInfoType> fundSizeInfo;
    /**
     * Экспортируемый КПР/РАПКР/МАПКР
     * 
     */
    @XmlElement(name = "Plan")
    protected List<ExportPlanPassportType> plan;
    /**
     * Экспортируемые сведения о домах и работах КПР/РАПКР/МАПКР
     * 
     */
    @XmlElement(name = "PlanWork")
    protected List<ExportWorkPlanType> planWork;
    /**
     * Экспортируемая РПКР
     * 
     */
    @XmlElement(name = "RegionalProgram")
    protected List<ExportRegionalProgramType> regionalProgram;
    /**
     * Экспортируемые сведения о домах и работах РПКР
     * 
     */
    @XmlElement(name = "RegionalProgramWork")
    protected List<ExportRegionalProgramWorkType> regionalProgramWork;
    /**
     * Информация о порядке представления платежных документов
     * 
     */
    @XmlElement(name = "DecisionPD")
    protected List<ExportDecisionPDType> decisionPD;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    /**
     * Результат импорта
     * 
     * Gets the value of the importResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapRemCommonResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<CapRemCommonResultType> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

    /**
     * Экспортируемый договор
     * 
     * Gets the value of the contract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportFullContractType }
     * </p>
     * 
     * 
     * @return
     *     The value of the contract property.
     */
    public List<ExportFullContractType> getContract() {
        if (contract == null) {
            contract = new ArrayList<>();
        }
        return this.contract;
    }

    /**
     * Информация о счетах регионального оператора/специальных счетах
     * 
     * Gets the value of the account property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAccountType }
     * </p>
     * 
     * 
     * @return
     *     The value of the account property.
     */
    public List<ExportAccountType> getAccount() {
        if (account == null) {
            account = new ArrayList<>();
        }
        return this.account;
    }

    /**
     * Экспортируемое решение о выборе способа формирования фонда капитального ремонта
     * 
     * Gets the value of the decision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDecisionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the decision property.
     */
    public List<ExportDecisionType> getDecision() {
        if (decision == null) {
            decision = new ArrayList<>();
        }
        return this.decision;
    }

    /**
     * Экспортируемый кредитный договор/договор займа
     * 
     * Gets the value of the creditContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCreditContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCreditContractType }
     * </p>
     * 
     * 
     * @return
     *     The value of the creditContract property.
     */
    public List<ExportCreditContractType> getCreditContract() {
        if (creditContract == null) {
            creditContract = new ArrayList<>();
        }
        return this.creditContract;
    }

    /**
     * Экспортируемая информация о размере фондов капитального ремонта
     * 
     * Gets the value of the fundSizeInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundSizeInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFundSizeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportFundSizeInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the fundSizeInfo property.
     */
    public List<ExportFundSizeInfoType> getFundSizeInfo() {
        if (fundSizeInfo == null) {
            fundSizeInfo = new ArrayList<>();
        }
        return this.fundSizeInfo;
    }

    /**
     * Экспортируемый КПР/РАПКР/МАПКР
     * 
     * Gets the value of the plan property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportPlanPassportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the plan property.
     */
    public List<ExportPlanPassportType> getPlan() {
        if (plan == null) {
            plan = new ArrayList<>();
        }
        return this.plan;
    }

    /**
     * Экспортируемые сведения о домах и работах КПР/РАПКР/МАПКР
     * 
     * Gets the value of the planWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlanWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportWorkPlanType }
     * </p>
     * 
     * 
     * @return
     *     The value of the planWork property.
     */
    public List<ExportWorkPlanType> getPlanWork() {
        if (planWork == null) {
            planWork = new ArrayList<>();
        }
        return this.planWork;
    }

    /**
     * Экспортируемая РПКР
     * 
     * Gets the value of the regionalProgram property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionalProgram property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRegionalProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportRegionalProgramType }
     * </p>
     * 
     * 
     * @return
     *     The value of the regionalProgram property.
     */
    public List<ExportRegionalProgramType> getRegionalProgram() {
        if (regionalProgram == null) {
            regionalProgram = new ArrayList<>();
        }
        return this.regionalProgram;
    }

    /**
     * Экспортируемые сведения о домах и работах РПКР
     * 
     * Gets the value of the regionalProgramWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionalProgramWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRegionalProgramWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportRegionalProgramWorkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the regionalProgramWork property.
     */
    public List<ExportRegionalProgramWorkType> getRegionalProgramWork() {
        if (regionalProgramWork == null) {
            regionalProgramWork = new ArrayList<>();
        }
        return this.regionalProgramWork;
    }

    /**
     * Информация о порядке представления платежных документов
     * 
     * Gets the value of the decisionPD property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionPD property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecisionPD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDecisionPDType }
     * </p>
     * 
     * 
     * @return
     *     The value of the decisionPD property.
     */
    public List<ExportDecisionPDType> getDecisionPD() {
        if (decisionPD == null) {
            decisionPD = new ArrayList<>();
        }
        return this.decisionPD;
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

}
