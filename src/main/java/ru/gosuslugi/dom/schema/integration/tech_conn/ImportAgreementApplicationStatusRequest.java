
package ru.gosuslugi.dom.schema.integration.tech_conn;

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
 *         <element name="importAgreementApplicationStatus" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <element name="ApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="AssignExecutor">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="TakeToWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="ConfirmCompleteness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="NeedSupplementation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="DenyToConnect" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="NoPossibilityToConnect" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="NeedCoordinationWithRelatedOrganization" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SettingIndividualPaymentValue" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="IncludingToInvestmentProgram" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="ConfirmRefusalOfConnection" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="CancelApplication" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendRefusalOfIncludingToInvestmentProgram" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendAgreement" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateAgreementType"/>
 *                     <element name="ConfirmAgreementSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="AcceptanceOperationsStarted" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendActOfCompleteness" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
 *                     <element name="ConfirmActOfCompletenessSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="DenyToIssueActOfCompleteness" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendActOfConnection">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType">
 *                             <sequence>
 *                               <element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ConfirmActOfConnectionSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="DenyToIssueActOfConnection" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="ExtendExecutionDeadline" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="FinishWorkWithApplication" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendAgreementForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateAgreementType"/>
 *                     <element name="SendActOfCompletenessForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
 *                     <element name="SendActOfConnectionForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version fixed="13.2.5.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importAgreementApplicationStatus"
})
@XmlRootElement(name = "importAgreementApplicationStatusRequest")
public class ImportAgreementApplicationStatusRequest
    extends BaseType
{

    /**
     * Импорт сведений о работе с заявлением
     * 
     */
    @XmlElement(required = true)
    protected List<ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus> importAgreementApplicationStatus;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String version;

    /**
     * Импорт сведений о работе с заявлением
     * 
     * Gets the value of the importAgreementApplicationStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importAgreementApplicationStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportAgreementApplicationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the importAgreementApplicationStatus property.
     */
    public List<ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus> getImportAgreementApplicationStatus() {
        if (importAgreementApplicationStatus == null) {
            importAgreementApplicationStatus = new ArrayList<>();
        }
        return this.importAgreementApplicationStatus;
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
            return "13.2.5.0";
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
     *           <element name="ApplicationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </sequence>
     *         <choice>
     *           <element name="AssignExecutor">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="TakeToWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="ConfirmCompleteness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="NeedSupplementation" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="DenyToConnect" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="NoPossibilityToConnect" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="NeedCoordinationWithRelatedOrganization" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SettingIndividualPaymentValue" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="IncludingToInvestmentProgram" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="ConfirmRefusalOfConnection" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="CancelApplication" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendRefusalOfIncludingToInvestmentProgram" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendAgreement" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateAgreementType"/>
     *           <element name="ConfirmAgreementSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="AcceptanceOperationsStarted" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendActOfCompleteness" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
     *           <element name="ConfirmActOfCompletenessSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="DenyToIssueActOfCompleteness" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendActOfConnection">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType">
     *                   <sequence>
     *                     <element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="ConfirmActOfConnectionSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="DenyToIssueActOfConnection" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="ExtendExecutionDeadline" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="FinishWorkWithApplication" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendAgreementForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateAgreementType"/>
     *           <element name="SendActOfCompletenessForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
     *           <element name="SendActOfConnectionForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
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
        "applicationGUID",
        "assignExecutor",
        "takeToWork",
        "confirmCompleteness",
        "needSupplementation",
        "denyToConnect",
        "noPossibilityToConnect",
        "needCoordinationWithRelatedOrganization",
        "settingIndividualPaymentValue",
        "includingToInvestmentProgram",
        "confirmRefusalOfConnection",
        "cancelApplication",
        "sendRefusalOfIncludingToInvestmentProgram",
        "sendAgreement",
        "confirmAgreementSignment",
        "acceptanceOperationsStarted",
        "sendActOfCompleteness",
        "confirmActOfCompletenessSignment",
        "denyToIssueActOfCompleteness",
        "sendActOfConnection",
        "confirmActOfConnectionSignment",
        "denyToIssueActOfConnection",
        "extendExecutionDeadline",
        "finishWorkWithApplication",
        "sendAgreementForReSigning",
        "sendActOfCompletenessForReSigning",
        "sendActOfConnectionForReSigning"
    })
    public static class ImportAgreementApplicationStatus {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Уникальный корневой идентификатор заявления в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ApplicationGUID", required = true)
        protected String applicationGUID;
        /**
         * Сведения о назначенном исполнителе
         * 
         */
        @XmlElement(name = "AssignExecutor")
        protected ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.AssignExecutor assignExecutor;
        /**
         * Сведения о взятии заявления в работу исполнителем
         * 
         */
        @XmlElement(name = "TakeToWork")
        protected Boolean takeToWork;
        /**
         * Комплектность подтверждена
         * 
         */
        @XmlElement(name = "ConfirmCompleteness")
        protected Boolean confirmCompleteness;
        /**
         * Заявка некомплектна
         * 
         */
        @XmlElement(name = "NeedSupplementation")
        protected CommonAnswerType needSupplementation;
        /**
         * Отказать в подключении
         * 
         */
        @XmlElement(name = "DenyToConnect")
        protected CommonAnswerType denyToConnect;
        /**
         * Отсутствует возможность подключения
         * 
         */
        @XmlElement(name = "NoPossibilityToConnect")
        protected CommonAnswerType noPossibilityToConnect;
        /**
         * Необходимо согласование со смежной организацией
         * 
         */
        @XmlElement(name = "NeedCoordinationWithRelatedOrganization")
        protected CommonAnswerType needCoordinationWithRelatedOrganization;
        /**
         * Установление размера платы в индивидуальном порядке
         * 
         */
        @XmlElement(name = "SettingIndividualPaymentValue")
        protected CommonAnswerType settingIndividualPaymentValue;
        /**
         * Включение в инвестиционную программу
         * 
         */
        @XmlElement(name = "IncludingToInvestmentProgram")
        protected CommonAnswerType includingToInvestmentProgram;
        /**
         * Подтвердить отказ от подключения
         * 
         */
        @XmlElement(name = "ConfirmRefusalOfConnection")
        protected CommonAnswerType confirmRefusalOfConnection;
        /**
         * Аннулировать заявление
         * 
         */
        @XmlElement(name = "CancelApplication")
        protected CommonAnswerType cancelApplication;
        /**
         * Сообщить об отказе включения в инвестпрограмму
         * 
         */
        @XmlElement(name = "SendRefusalOfIncludingToInvestmentProgram")
        protected CommonAnswerType sendRefusalOfIncludingToInvestmentProgram;
        /**
         * Отправить договор заявителю
         * 
         */
        @XmlElement(name = "SendAgreement")
        protected CreateAgreementType sendAgreement;
        /**
         * Подтвердить подписание договора
         * 
         */
        @XmlElement(name = "ConfirmAgreementSignment")
        protected CommonAnswerType confirmAgreementSignment;
        /**
         * Сообщить о проведении приемочных работ по договору
         * 
         */
        @XmlElement(name = "AcceptanceOperationsStarted")
        protected CommonAnswerType acceptanceOperationsStarted;
        /**
         * Отправить акт о готовности заявителю
         * 
         */
        @XmlElement(name = "SendActOfCompleteness")
        protected CreateActType sendActOfCompleteness;
        /**
         * Подтвердить подписание акта о готовности
         * 
         */
        @XmlElement(name = "ConfirmActOfCompletenessSignment")
        protected CommonAnswerType confirmActOfCompletenessSignment;
        /**
         * Отказать в выдаче акта о готовности
         * 
         */
        @XmlElement(name = "DenyToIssueActOfCompleteness")
        protected CommonAnswerType denyToIssueActOfCompleteness;
        /**
         * Отправить акт о подключении заявителю
         * 
         */
        @XmlElement(name = "SendActOfConnection")
        protected ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.SendActOfConnection sendActOfConnection;
        /**
         * Подтвердить подписание акта о подключении
         * 
         */
        @XmlElement(name = "ConfirmActOfConnectionSignment")
        protected CommonAnswerType confirmActOfConnectionSignment;
        /**
         * Отказать в выдаче акта о подключении
         * 
         */
        @XmlElement(name = "DenyToIssueActOfConnection")
        protected CommonAnswerType denyToIssueActOfConnection;
        /**
         * Продлить срок рассмотрения заявления
         * 
         */
        @XmlElement(name = "ExtendExecutionDeadline")
        protected CommonAnswerType extendExecutionDeadline;
        /**
         * Завершить оказание услуги
         * 
         */
        @XmlElement(name = "FinishWorkWithApplication")
        protected CommonAnswerType finishWorkWithApplication;
        /**
         * Отправить договор на повторное подписание заявителю
         * 
         */
        @XmlElement(name = "SendAgreementForReSigning")
        protected CreateAgreementType sendAgreementForReSigning;
        /**
         * Отправить акт о готовности на повторное подписание заявителю
         * 
         */
        @XmlElement(name = "SendActOfCompletenessForReSigning")
        protected CreateActType sendActOfCompletenessForReSigning;
        /**
         * Отправить акт о подключении на повторное подписание заявителю
         * 
         */
        @XmlElement(name = "SendActOfConnectionForReSigning")
        protected CreateActType sendActOfConnectionForReSigning;

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
         * Уникальный корневой идентификатор заявления в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationGUID() {
            return applicationGUID;
        }

        /**
         * Sets the value of the applicationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getApplicationGUID()
         */
        public void setApplicationGUID(String value) {
            this.applicationGUID = value;
        }

        /**
         * Сведения о назначенном исполнителе
         * 
         * @return
         *     possible object is
         *     {@link ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.AssignExecutor }
         *     
         */
        public ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.AssignExecutor getAssignExecutor() {
            return assignExecutor;
        }

        /**
         * Sets the value of the assignExecutor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.AssignExecutor }
         *     
         * @see #getAssignExecutor()
         */
        public void setAssignExecutor(ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.AssignExecutor value) {
            this.assignExecutor = value;
        }

        /**
         * Сведения о взятии заявления в работу исполнителем
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTakeToWork() {
            return takeToWork;
        }

        /**
         * Sets the value of the takeToWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isTakeToWork()
         */
        public void setTakeToWork(Boolean value) {
            this.takeToWork = value;
        }

        /**
         * Комплектность подтверждена
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isConfirmCompleteness() {
            return confirmCompleteness;
        }

        /**
         * Sets the value of the confirmCompleteness property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isConfirmCompleteness()
         */
        public void setConfirmCompleteness(Boolean value) {
            this.confirmCompleteness = value;
        }

        /**
         * Заявка некомплектна
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getNeedSupplementation() {
            return needSupplementation;
        }

        /**
         * Sets the value of the needSupplementation property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getNeedSupplementation()
         */
        public void setNeedSupplementation(CommonAnswerType value) {
            this.needSupplementation = value;
        }

        /**
         * Отказать в подключении
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getDenyToConnect() {
            return denyToConnect;
        }

        /**
         * Sets the value of the denyToConnect property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getDenyToConnect()
         */
        public void setDenyToConnect(CommonAnswerType value) {
            this.denyToConnect = value;
        }

        /**
         * Отсутствует возможность подключения
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getNoPossibilityToConnect() {
            return noPossibilityToConnect;
        }

        /**
         * Sets the value of the noPossibilityToConnect property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getNoPossibilityToConnect()
         */
        public void setNoPossibilityToConnect(CommonAnswerType value) {
            this.noPossibilityToConnect = value;
        }

        /**
         * Необходимо согласование со смежной организацией
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getNeedCoordinationWithRelatedOrganization() {
            return needCoordinationWithRelatedOrganization;
        }

        /**
         * Sets the value of the needCoordinationWithRelatedOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getNeedCoordinationWithRelatedOrganization()
         */
        public void setNeedCoordinationWithRelatedOrganization(CommonAnswerType value) {
            this.needCoordinationWithRelatedOrganization = value;
        }

        /**
         * Установление размера платы в индивидуальном порядке
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getSettingIndividualPaymentValue() {
            return settingIndividualPaymentValue;
        }

        /**
         * Sets the value of the settingIndividualPaymentValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getSettingIndividualPaymentValue()
         */
        public void setSettingIndividualPaymentValue(CommonAnswerType value) {
            this.settingIndividualPaymentValue = value;
        }

        /**
         * Включение в инвестиционную программу
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getIncludingToInvestmentProgram() {
            return includingToInvestmentProgram;
        }

        /**
         * Sets the value of the includingToInvestmentProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getIncludingToInvestmentProgram()
         */
        public void setIncludingToInvestmentProgram(CommonAnswerType value) {
            this.includingToInvestmentProgram = value;
        }

        /**
         * Подтвердить отказ от подключения
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getConfirmRefusalOfConnection() {
            return confirmRefusalOfConnection;
        }

        /**
         * Sets the value of the confirmRefusalOfConnection property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getConfirmRefusalOfConnection()
         */
        public void setConfirmRefusalOfConnection(CommonAnswerType value) {
            this.confirmRefusalOfConnection = value;
        }

        /**
         * Аннулировать заявление
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getCancelApplication() {
            return cancelApplication;
        }

        /**
         * Sets the value of the cancelApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getCancelApplication()
         */
        public void setCancelApplication(CommonAnswerType value) {
            this.cancelApplication = value;
        }

        /**
         * Сообщить об отказе включения в инвестпрограмму
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getSendRefusalOfIncludingToInvestmentProgram() {
            return sendRefusalOfIncludingToInvestmentProgram;
        }

        /**
         * Sets the value of the sendRefusalOfIncludingToInvestmentProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getSendRefusalOfIncludingToInvestmentProgram()
         */
        public void setSendRefusalOfIncludingToInvestmentProgram(CommonAnswerType value) {
            this.sendRefusalOfIncludingToInvestmentProgram = value;
        }

        /**
         * Отправить договор заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateAgreementType }
         *     
         */
        public CreateAgreementType getSendAgreement() {
            return sendAgreement;
        }

        /**
         * Sets the value of the sendAgreement property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateAgreementType }
         *     
         * @see #getSendAgreement()
         */
        public void setSendAgreement(CreateAgreementType value) {
            this.sendAgreement = value;
        }

        /**
         * Подтвердить подписание договора
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getConfirmAgreementSignment() {
            return confirmAgreementSignment;
        }

        /**
         * Sets the value of the confirmAgreementSignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getConfirmAgreementSignment()
         */
        public void setConfirmAgreementSignment(CommonAnswerType value) {
            this.confirmAgreementSignment = value;
        }

        /**
         * Сообщить о проведении приемочных работ по договору
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getAcceptanceOperationsStarted() {
            return acceptanceOperationsStarted;
        }

        /**
         * Sets the value of the acceptanceOperationsStarted property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getAcceptanceOperationsStarted()
         */
        public void setAcceptanceOperationsStarted(CommonAnswerType value) {
            this.acceptanceOperationsStarted = value;
        }

        /**
         * Отправить акт о готовности заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateActType }
         *     
         */
        public CreateActType getSendActOfCompleteness() {
            return sendActOfCompleteness;
        }

        /**
         * Sets the value of the sendActOfCompleteness property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateActType }
         *     
         * @see #getSendActOfCompleteness()
         */
        public void setSendActOfCompleteness(CreateActType value) {
            this.sendActOfCompleteness = value;
        }

        /**
         * Подтвердить подписание акта о готовности
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getConfirmActOfCompletenessSignment() {
            return confirmActOfCompletenessSignment;
        }

        /**
         * Sets the value of the confirmActOfCompletenessSignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getConfirmActOfCompletenessSignment()
         */
        public void setConfirmActOfCompletenessSignment(CommonAnswerType value) {
            this.confirmActOfCompletenessSignment = value;
        }

        /**
         * Отказать в выдаче акта о готовности
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getDenyToIssueActOfCompleteness() {
            return denyToIssueActOfCompleteness;
        }

        /**
         * Sets the value of the denyToIssueActOfCompleteness property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getDenyToIssueActOfCompleteness()
         */
        public void setDenyToIssueActOfCompleteness(CommonAnswerType value) {
            this.denyToIssueActOfCompleteness = value;
        }

        /**
         * Отправить акт о подключении заявителю
         * 
         * @return
         *     possible object is
         *     {@link ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.SendActOfConnection }
         *     
         */
        public ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.SendActOfConnection getSendActOfConnection() {
            return sendActOfConnection;
        }

        /**
         * Sets the value of the sendActOfConnection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.SendActOfConnection }
         *     
         * @see #getSendActOfConnection()
         */
        public void setSendActOfConnection(ImportAgreementApplicationStatusRequest.ImportAgreementApplicationStatus.SendActOfConnection value) {
            this.sendActOfConnection = value;
        }

        /**
         * Подтвердить подписание акта о подключении
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getConfirmActOfConnectionSignment() {
            return confirmActOfConnectionSignment;
        }

        /**
         * Sets the value of the confirmActOfConnectionSignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getConfirmActOfConnectionSignment()
         */
        public void setConfirmActOfConnectionSignment(CommonAnswerType value) {
            this.confirmActOfConnectionSignment = value;
        }

        /**
         * Отказать в выдаче акта о подключении
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getDenyToIssueActOfConnection() {
            return denyToIssueActOfConnection;
        }

        /**
         * Sets the value of the denyToIssueActOfConnection property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getDenyToIssueActOfConnection()
         */
        public void setDenyToIssueActOfConnection(CommonAnswerType value) {
            this.denyToIssueActOfConnection = value;
        }

        /**
         * Продлить срок рассмотрения заявления
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getExtendExecutionDeadline() {
            return extendExecutionDeadline;
        }

        /**
         * Sets the value of the extendExecutionDeadline property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getExtendExecutionDeadline()
         */
        public void setExtendExecutionDeadline(CommonAnswerType value) {
            this.extendExecutionDeadline = value;
        }

        /**
         * Завершить оказание услуги
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getFinishWorkWithApplication() {
            return finishWorkWithApplication;
        }

        /**
         * Sets the value of the finishWorkWithApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getFinishWorkWithApplication()
         */
        public void setFinishWorkWithApplication(CommonAnswerType value) {
            this.finishWorkWithApplication = value;
        }

        /**
         * Отправить договор на повторное подписание заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateAgreementType }
         *     
         */
        public CreateAgreementType getSendAgreementForReSigning() {
            return sendAgreementForReSigning;
        }

        /**
         * Sets the value of the sendAgreementForReSigning property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateAgreementType }
         *     
         * @see #getSendAgreementForReSigning()
         */
        public void setSendAgreementForReSigning(CreateAgreementType value) {
            this.sendAgreementForReSigning = value;
        }

        /**
         * Отправить акт о готовности на повторное подписание заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateActType }
         *     
         */
        public CreateActType getSendActOfCompletenessForReSigning() {
            return sendActOfCompletenessForReSigning;
        }

        /**
         * Sets the value of the sendActOfCompletenessForReSigning property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateActType }
         *     
         * @see #getSendActOfCompletenessForReSigning()
         */
        public void setSendActOfCompletenessForReSigning(CreateActType value) {
            this.sendActOfCompletenessForReSigning = value;
        }

        /**
         * Отправить акт о подключении на повторное подписание заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateActType }
         *     
         */
        public CreateActType getSendActOfConnectionForReSigning() {
            return sendActOfConnectionForReSigning;
        }

        /**
         * Sets the value of the sendActOfConnectionForReSigning property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateActType }
         *     
         * @see #getSendActOfConnectionForReSigning()
         */
        public void setSendActOfConnectionForReSigning(CreateActType value) {
            this.sendActOfConnectionForReSigning = value;
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
         *         <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type"/>
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
            "fio"
        })
        public static class AssignExecutor {

            /**
             * Фамилия И.О. назначенного исполнителя
             * 
             */
            @XmlElement(name = "FIO", required = true)
            protected String fio;

            /**
             * Фамилия И.О. назначенного исполнителя
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFIO() {
                return fio;
            }

            /**
             * Sets the value of the fio property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getFIO()
             */
            public void setFIO(String value) {
                this.fio = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType">
         *       <sequence>
         *         <element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "isSigned"
        })
        public static class SendActOfConnection
            extends CreateActType
        {

            /**
             * Акт о подключении ранее был подписан вне системы
             * 
             */
            @XmlElement(name = "IsSigned")
            protected Boolean isSigned;

            /**
             * Акт о подключении ранее был подписан вне системы
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsSigned() {
                return isSigned;
            }

            /**
             * Sets the value of the isSigned property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsSigned()
             */
            public void setIsSigned(Boolean value) {
                this.isSigned = value;
            }

        }

    }

}
