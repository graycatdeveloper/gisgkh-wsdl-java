
package ru.gosuslugi.dom.schema.integration.payments_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о платежных реквизитах организации
 * 
 * <p>Java class for PaymentInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RecipientINN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
 *         <element name="RecipientKPP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPPType" minOccurs="0"/>
 *         <element name="BankName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="255"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="PaymentRecipient">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="4000"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="BankBIK" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType"/>
 *         <element name="operatingAccountNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CorrespondentBankAccount" type="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountType" minOccurs="0"/>
 *         <element name="KBK" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="20"/>
 *               <pattern value="[0-9]{20}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMOImportType" minOccurs="0"/>
 *         <element name="NumberBudgetaryAccount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="30"/>
 *               <minLength value="1"/>
 *               <pattern value="[0-9]{1,30}"/>
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
@XmlType(name = "PaymentInformationType", propOrder = {
    "recipientINN",
    "recipientKPP",
    "bankName",
    "paymentRecipient",
    "bankBIK",
    "operatingAccountNumber",
    "correspondentBankAccount",
    "kbk",
    "oktmo",
    "numberBudgetaryAccount"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.payments_base.NotificationOfOrderExecutionType.RecipientInfo.PaymentInformation.class
})
public class PaymentInformationType {

    /**
     * ИНН получателя платежа
     * 
     */
    @XmlElement(name = "RecipientINN", required = true)
    protected String recipientINN;
    /**
     * КПП получателя платежа
     * 
     */
    @XmlElement(name = "RecipientKPP")
    protected String recipientKPP;
    /**
     * Наименование банка получателя платежа
     * 
     */
    @XmlElement(name = "BankName", required = true)
    protected String bankName;
    /**
     * Наименование получателя
     * 
     */
    @XmlElement(name = "PaymentRecipient", required = true)
    protected String paymentRecipient;
    /**
     * БИК банка получателя
     * 
     */
    @XmlElement(name = "BankBIK", required = true)
    protected String bankBIK;
    /**
     * Номер расчетного счета
     * 
     */
    @XmlElement(required = true)
    protected String operatingAccountNumber;
    /**
     * Корр. счет банка получателя
     * 
     */
    @XmlElement(name = "CorrespondentBankAccount")
    protected String correspondentBankAccount;
    /**
     * Код из Классификатора доходов в бюджет
     * 
     */
    @XmlElement(name = "KBK")
    protected String kbk;
    /**
     * Код из Общероссийского классификатора территорий муниципальных образований
     * 
     */
    @XmlElement(name = "OKTMO")
    protected String oktmo;
    /**
     * Номер лицевого счета, открытый в органах Федерального казначейства (финансовых органах)
     * 
     */
    @XmlElement(name = "NumberBudgetaryAccount")
    protected String numberBudgetaryAccount;

    /**
     * ИНН получателя платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientINN() {
        return recipientINN;
    }

    /**
     * Sets the value of the recipientINN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecipientINN()
     */
    public void setRecipientINN(String value) {
        this.recipientINN = value;
    }

    /**
     * КПП получателя платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientKPP() {
        return recipientKPP;
    }

    /**
     * Sets the value of the recipientKPP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecipientKPP()
     */
    public void setRecipientKPP(String value) {
        this.recipientKPP = value;
    }

    /**
     * Наименование банка получателя платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankName()
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Наименование получателя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRecipient() {
        return paymentRecipient;
    }

    /**
     * Sets the value of the paymentRecipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentRecipient()
     */
    public void setPaymentRecipient(String value) {
        this.paymentRecipient = value;
    }

    /**
     * БИК банка получателя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBIK() {
        return bankBIK;
    }

    /**
     * Sets the value of the bankBIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankBIK()
     */
    public void setBankBIK(String value) {
        this.bankBIK = value;
    }

    /**
     * Номер расчетного счета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAccountNumber() {
        return operatingAccountNumber;
    }

    /**
     * Sets the value of the operatingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingAccountNumber()
     */
    public void setOperatingAccountNumber(String value) {
        this.operatingAccountNumber = value;
    }

    /**
     * Корр. счет банка получателя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondentBankAccount() {
        return correspondentBankAccount;
    }

    /**
     * Sets the value of the correspondentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCorrespondentBankAccount()
     */
    public void setCorrespondentBankAccount(String value) {
        this.correspondentBankAccount = value;
    }

    /**
     * Код из Классификатора доходов в бюджет
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

    /**
     * Код из Общероссийского классификатора территорий муниципальных образований
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(String value) {
        this.oktmo = value;
    }

    /**
     * Номер лицевого счета, открытый в органах Федерального казначейства (финансовых органах)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberBudgetaryAccount() {
        return numberBudgetaryAccount;
    }

    /**
     * Sets the value of the numberBudgetaryAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumberBudgetaryAccount()
     */
    public void setNumberBudgetaryAccount(String value) {
        this.numberBudgetaryAccount = value;
    }

}
