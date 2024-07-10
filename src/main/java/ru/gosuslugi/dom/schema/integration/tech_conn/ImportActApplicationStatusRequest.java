
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
 *         <element name="importActApplicationStatus" maxOccurs="100">
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
 *                     <element name="DenyToIssueAct" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="AgreementNotFound" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="AcceptanceOperationsStarted" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendAct" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
 *                     <element name="ConfirmActSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
 *                     <element name="SendActForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
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
    "importActApplicationStatus"
})
@XmlRootElement(name = "importActApplicationStatusRequest")
public class ImportActApplicationStatusRequest
    extends BaseType
{

    /**
     * Импорт сведений о работе с заявлением
     * 
     */
    @XmlElement(required = true)
    protected List<ImportActApplicationStatusRequest.ImportActApplicationStatus> importActApplicationStatus;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String version;

    /**
     * Импорт сведений о работе с заявлением
     * 
     * Gets the value of the importActApplicationStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importActApplicationStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportActApplicationStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportActApplicationStatusRequest.ImportActApplicationStatus }
     * </p>
     * 
     * 
     * @return
     *     The value of the importActApplicationStatus property.
     */
    public List<ImportActApplicationStatusRequest.ImportActApplicationStatus> getImportActApplicationStatus() {
        if (importActApplicationStatus == null) {
            importActApplicationStatus = new ArrayList<>();
        }
        return this.importActApplicationStatus;
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
     *           <element name="DenyToIssueAct" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="AgreementNotFound" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="AcceptanceOperationsStarted" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendAct" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
     *           <element name="ConfirmActSignment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CommonAnswerType"/>
     *           <element name="SendActForReSigning" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CreateActType"/>
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
        "denyToIssueAct",
        "agreementNotFound",
        "acceptanceOperationsStarted",
        "sendAct",
        "confirmActSignment",
        "sendActForReSigning"
    })
    public static class ImportActApplicationStatus {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Уникальный идентификатор заявления в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ApplicationGUID", required = true)
        protected String applicationGUID;
        /**
         * Сведения о назначенном исполнителе
         * 
         */
        @XmlElement(name = "AssignExecutor")
        protected ImportActApplicationStatusRequest.ImportActApplicationStatus.AssignExecutor assignExecutor;
        /**
         * Сведения о взятии заявления в работу исполнителем
         * 
         */
        @XmlElement(name = "TakeToWork")
        protected Boolean takeToWork;
        /**
         * Отказать в выдаче акта
         * 
         */
        @XmlElement(name = "DenyToIssueAct")
        protected CommonAnswerType denyToIssueAct;
        /**
         * Договор не найден
         * 
         */
        @XmlElement(name = "AgreementNotFound")
        protected CommonAnswerType agreementNotFound;
        /**
         * Сообщить о проведении приемочных работ
         * 
         */
        @XmlElement(name = "AcceptanceOperationsStarted")
        protected CommonAnswerType acceptanceOperationsStarted;
        /**
         * Отправить акт заявителю
         * 
         */
        @XmlElement(name = "SendAct")
        protected CreateActType sendAct;
        /**
         * Подтвердить подписание акта
         * 
         */
        @XmlElement(name = "ConfirmActSignment")
        protected CommonAnswerType confirmActSignment;
        /**
         * Отправить акт на повторное подписание заявителю
         * 
         */
        @XmlElement(name = "SendActForReSigning")
        protected CreateActType sendActForReSigning;

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
         * Уникальный идентификатор заявления в ГИС ЖКХ
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
         *     {@link ImportActApplicationStatusRequest.ImportActApplicationStatus.AssignExecutor }
         *     
         */
        public ImportActApplicationStatusRequest.ImportActApplicationStatus.AssignExecutor getAssignExecutor() {
            return assignExecutor;
        }

        /**
         * Sets the value of the assignExecutor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportActApplicationStatusRequest.ImportActApplicationStatus.AssignExecutor }
         *     
         * @see #getAssignExecutor()
         */
        public void setAssignExecutor(ImportActApplicationStatusRequest.ImportActApplicationStatus.AssignExecutor value) {
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
         * Отказать в выдаче акта
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getDenyToIssueAct() {
            return denyToIssueAct;
        }

        /**
         * Sets the value of the denyToIssueAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getDenyToIssueAct()
         */
        public void setDenyToIssueAct(CommonAnswerType value) {
            this.denyToIssueAct = value;
        }

        /**
         * Договор не найден
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getAgreementNotFound() {
            return agreementNotFound;
        }

        /**
         * Sets the value of the agreementNotFound property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getAgreementNotFound()
         */
        public void setAgreementNotFound(CommonAnswerType value) {
            this.agreementNotFound = value;
        }

        /**
         * Сообщить о проведении приемочных работ
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
         * Отправить акт заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateActType }
         *     
         */
        public CreateActType getSendAct() {
            return sendAct;
        }

        /**
         * Sets the value of the sendAct property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateActType }
         *     
         * @see #getSendAct()
         */
        public void setSendAct(CreateActType value) {
            this.sendAct = value;
        }

        /**
         * Подтвердить подписание акта
         * 
         * @return
         *     possible object is
         *     {@link CommonAnswerType }
         *     
         */
        public CommonAnswerType getConfirmActSignment() {
            return confirmActSignment;
        }

        /**
         * Sets the value of the confirmActSignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommonAnswerType }
         *     
         * @see #getConfirmActSignment()
         */
        public void setConfirmActSignment(CommonAnswerType value) {
            this.confirmActSignment = value;
        }

        /**
         * Отправить акт на повторное подписание заявителю
         * 
         * @return
         *     possible object is
         *     {@link CreateActType }
         *     
         */
        public CreateActType getSendActForReSigning() {
            return sendActForReSigning;
        }

        /**
         * Sets the value of the sendActForReSigning property.
         * 
         * @param value
         *     allowed object is
         *     {@link CreateActType }
         *     
         * @see #getSendActForReSigning()
         */
        public void setSendActForReSigning(CreateActType value) {
            this.sendActForReSigning = value;
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

    }

}
