
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Тип данных для решения о выборе способа формирования фонда капитального ремонта
 * 
 * <p>Java class for DecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionCommonType">
 *       <sequence>
 *         <choice>
 *           <element name="Protocol">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ProtocolType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="DecisionDocument" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentDecisionType"/>
 *           <element name="DocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </choice>
 *         <choice>
 *           <element name="FormationFundInSpecialAccount">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="AccountCreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="CreditOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *                     <element name="BIKCredOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType"/>
 *                     <element name="AccountNumber" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountNumberType"/>
 *                     <element name="AccountOpeningDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100"/>
 *                     <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *                     <element name="KBK" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}KBKType" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="FormationFundInRegOperatorAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionType", propOrder = {
    "protocol",
    "decisionDocument",
    "documentGUID",
    "formationFundInSpecialAccount",
    "formationFundInRegOperatorAccount"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportDecisionsFormingFundRequest.ImportDecision.LoadDecision.class,
    ExportDecisionType.class
})
public class DecisionType
    extends DecisionCommonType
{

    /**
     * Протокол общего собрания собственников. Указывается, если основание принятия решения = решение собственников. Для организаций с функцией Региональный оператор капитального ремонта необходимо прикрепить файл протокола, для остальных организаций необходимо указать идентификатор версии протокола.
     * 
     */
    @XmlElement(name = "Protocol")
    protected DecisionType.Protocol protocol;
    /**
     * Документ решения. Указывается, если основание принятия решения = решение ОМС. Доступно для заполнения только для организации с функцией "Региональный оператор капитального ремонта".
     * 
     */
    @XmlElement(name = "DecisionDocument")
    protected DocumentDecisionType decisionDocument;
    /**
     * Идентификатор документа. Указывается, если основание принятия решения = решение ОМС. Доступно для заполнения только для организации с функцией "ОМС".
     * 
     */
    @XmlElement(name = "DocumentGUID")
    protected String documentGUID;
    /**
     * Способ формирования фонда = Формирование фонда капитального ремонта на специальном счете
     * 
     */
    @XmlElement(name = "FormationFundInSpecialAccount")
    protected DecisionType.FormationFundInSpecialAccount formationFundInSpecialAccount;
    /**
     * Способ формирования фонда = Формирование фонда капитального ремонта на счете регионального оператора
     * 
     */
    @XmlElement(name = "FormationFundInRegOperatorAccount")
    protected Boolean formationFundInRegOperatorAccount;

    /**
     * Протокол общего собрания собственников. Указывается, если основание принятия решения = решение собственников. Для организаций с функцией Региональный оператор капитального ремонта необходимо прикрепить файл протокола, для остальных организаций необходимо указать идентификатор версии протокола.
     * 
     * @return
     *     possible object is
     *     {@link DecisionType.Protocol }
     *     
     */
    public DecisionType.Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionType.Protocol }
     *     
     * @see #getProtocol()
     */
    public void setProtocol(DecisionType.Protocol value) {
        this.protocol = value;
    }

    /**
     * Документ решения. Указывается, если основание принятия решения = решение ОМС. Доступно для заполнения только для организации с функцией "Региональный оператор капитального ремонта".
     * 
     * @return
     *     possible object is
     *     {@link DocumentDecisionType }
     *     
     */
    public DocumentDecisionType getDecisionDocument() {
        return decisionDocument;
    }

    /**
     * Sets the value of the decisionDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDecisionType }
     *     
     * @see #getDecisionDocument()
     */
    public void setDecisionDocument(DocumentDecisionType value) {
        this.decisionDocument = value;
    }

    /**
     * Идентификатор документа. Указывается, если основание принятия решения = решение ОМС. Доступно для заполнения только для организации с функцией "ОМС".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGUID() {
        return documentGUID;
    }

    /**
     * Sets the value of the documentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentGUID()
     */
    public void setDocumentGUID(String value) {
        this.documentGUID = value;
    }

    /**
     * Способ формирования фонда = Формирование фонда капитального ремонта на специальном счете
     * 
     * @return
     *     possible object is
     *     {@link DecisionType.FormationFundInSpecialAccount }
     *     
     */
    public DecisionType.FormationFundInSpecialAccount getFormationFundInSpecialAccount() {
        return formationFundInSpecialAccount;
    }

    /**
     * Sets the value of the formationFundInSpecialAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionType.FormationFundInSpecialAccount }
     *     
     * @see #getFormationFundInSpecialAccount()
     */
    public void setFormationFundInSpecialAccount(DecisionType.FormationFundInSpecialAccount value) {
        this.formationFundInSpecialAccount = value;
    }

    /**
     * Способ формирования фонда = Формирование фонда капитального ремонта на счете регионального оператора
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFormationFundInRegOperatorAccount() {
        return formationFundInRegOperatorAccount;
    }

    /**
     * Sets the value of the formationFundInRegOperatorAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFormationFundInRegOperatorAccount()
     */
    public void setFormationFundInRegOperatorAccount(Boolean value) {
        this.formationFundInRegOperatorAccount = value;
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
     *         <element name="AccountCreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="CreditOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
     *         <element name="BIKCredOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType"/>
     *         <element name="AccountNumber" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountNumberType"/>
     *         <element name="AccountOpeningDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100"/>
     *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
     *         <element name="KBK" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}KBKType" minOccurs="0"/>
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
        "accountCreationDate",
        "creditOrganization",
        "bikCredOrg",
        "accountNumber",
        "accountOpeningDocument",
        "oktmo",
        "kbk"
    })
    public static class FormationFundInSpecialAccount {

        /**
         * Дата открытия счета
         * 
         */
        @XmlElement(name = "AccountCreationDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar accountCreationDate;
        /**
         * Кредитная организация
         * 
         */
        @XmlElement(name = "CreditOrganization", required = true)
        protected RegOrgType creditOrganization;
        /**
         * БИК кредитной организации
         * 
         */
        @XmlElement(name = "BIKCredOrg", required = true)
        protected String bikCredOrg;
        /**
         * Номер счета
         * 
         */
        @XmlElement(name = "AccountNumber", required = true)
        protected String accountNumber;
        /**
         * Справка об открытии специального счета
         * 
         */
        @XmlElement(name = "AccountOpeningDocument", required = true)
        protected List<AttachmentType> accountOpeningDocument;
        /**
         * ОКТМО
         * 
         */
        @XmlElement(name = "OKTMO")
        protected OKTMORefType oktmo;
        /**
         * КБК
         * 
         */
        @XmlElement(name = "KBK")
        protected String kbk;

        /**
         * Дата открытия счета
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAccountCreationDate() {
            return accountCreationDate;
        }

        /**
         * Sets the value of the accountCreationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAccountCreationDate()
         */
        public void setAccountCreationDate(XMLGregorianCalendar value) {
            this.accountCreationDate = value;
        }

        /**
         * Кредитная организация
         * 
         * @return
         *     possible object is
         *     {@link RegOrgType }
         *     
         */
        public RegOrgType getCreditOrganization() {
            return creditOrganization;
        }

        /**
         * Sets the value of the creditOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgType }
         *     
         * @see #getCreditOrganization()
         */
        public void setCreditOrganization(RegOrgType value) {
            this.creditOrganization = value;
        }

        /**
         * БИК кредитной организации
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBIKCredOrg() {
            return bikCredOrg;
        }

        /**
         * Sets the value of the bikCredOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBIKCredOrg()
         */
        public void setBIKCredOrg(String value) {
            this.bikCredOrg = value;
        }

        /**
         * Номер счета
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountNumber()
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
        }

        /**
         * Справка об открытии специального счета
         * 
         * Gets the value of the accountOpeningDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accountOpeningDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAccountOpeningDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the accountOpeningDocument property.
         */
        public List<AttachmentType> getAccountOpeningDocument() {
            if (accountOpeningDocument == null) {
                accountOpeningDocument = new ArrayList<>();
            }
            return this.accountOpeningDocument;
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
         * КБК
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKBK() {
            return kbk;
        }

        /**
         * Sets the value of the kbk property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getKBK()
         */
        public void setKBK(String value) {
            this.kbk = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ProtocolType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Protocol
        extends ProtocolType
    {


    }

}
