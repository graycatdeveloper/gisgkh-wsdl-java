
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
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Кредитный договор/договор займа
 * 
 * <p>Java class for CreditContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreditContractType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="CreditAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="LoanAgreement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="Creditor" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element name="BIKCredOrg" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType">
 *               <pattern value="\d{9}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Lender" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <choice>
 *           <element name="Term">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                 <minExclusive value="0"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="Termless" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <choice>
 *           <element name="InterestRate">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                 <minExclusive value="0"/>
 *                 <fractionDigits value="2"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="InterestFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="InterestRateNote" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String1024Type" minOccurs="0"/>
 *         <element name="Amount">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyType">
 *               <minExclusive value="0"/>
 *               <fractionDigits value="2"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AmountNote" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String1024Type" minOccurs="0"/>
 *         <element name="AttachContract" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditContractType", propOrder = {
    "creditAgreement",
    "loanAgreement",
    "creditor",
    "bikCredOrg",
    "lender",
    "number",
    "date",
    "term",
    "termless",
    "interestRate",
    "interestFree",
    "interestRateNote",
    "amount",
    "amountNote",
    "attachContract"
})
@XmlSeeAlso({
    ExportCreditContractType.class
})
public class CreditContractType {

    /**
     * Кредитный договор
     * 
     */
    @XmlElement(name = "CreditAgreement")
    protected Boolean creditAgreement;
    /**
     * Договор займа
     * 
     */
    @XmlElement(name = "LoanAgreement")
    protected Boolean loanAgreement;
    /**
     * Кредитор
     * 
     */
    @XmlElement(name = "Creditor")
    protected RegOrgType creditor;
    /**
     * БИК
     * 
     */
    @XmlElement(name = "BIKCredOrg")
    protected String bikCredOrg;
    /**
     * Займодавец
     * 
     */
    @XmlElement(name = "Lender")
    protected RegOrgType lender;
    /**
     * Номер договора
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата договора
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Срок договора в месяцах
     * 
     */
    @XmlElement(name = "Term")
    protected Integer term;
    /**
     * Бессрочный
     * 
     */
    @XmlElement(name = "Termless")
    protected Boolean termless;
    /**
     * Поцентная ставка
     * 
     */
    @XmlElement(name = "InterestRate")
    protected BigDecimal interestRate;
    /**
     * Беспроцентный
     * 
     */
    @XmlElement(name = "InterestFree")
    protected Boolean interestFree;
    /**
     * Примечание к процентной ставке
     * 
     */
    @XmlElement(name = "InterestRateNote")
    protected String interestRateNote;
    /**
     * Размер
     * 
     */
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    /**
     * Примечание к размеру
     * 
     */
    @XmlElement(name = "AmountNote")
    protected String amountNote;
    /**
     * Файлы договора
     * 
     */
    @XmlElement(name = "AttachContract", required = true)
    protected List<AttachmentType> attachContract;

    /**
     * Кредитный договор
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditAgreement() {
        return creditAgreement;
    }

    /**
     * Sets the value of the creditAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCreditAgreement()
     */
    public void setCreditAgreement(Boolean value) {
        this.creditAgreement = value;
    }

    /**
     * Договор займа
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoanAgreement() {
        return loanAgreement;
    }

    /**
     * Sets the value of the loanAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLoanAgreement()
     */
    public void setLoanAgreement(Boolean value) {
        this.loanAgreement = value;
    }

    /**
     * Кредитор
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getCreditor() {
        return creditor;
    }

    /**
     * Sets the value of the creditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getCreditor()
     */
    public void setCreditor(RegOrgType value) {
        this.creditor = value;
    }

    /**
     * БИК
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
     * Займодавец
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getLender() {
        return lender;
    }

    /**
     * Sets the value of the lender property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getLender()
     */
    public void setLender(RegOrgType value) {
        this.lender = value;
    }

    /**
     * Номер договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Срок договора в месяцах
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTerm()
     */
    public void setTerm(Integer value) {
        this.term = value;
    }

    /**
     * Бессрочный
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTermless() {
        return termless;
    }

    /**
     * Sets the value of the termless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTermless()
     */
    public void setTermless(Boolean value) {
        this.termless = value;
    }

    /**
     * Поцентная ставка
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * Sets the value of the interestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getInterestRate()
     */
    public void setInterestRate(BigDecimal value) {
        this.interestRate = value;
    }

    /**
     * Беспроцентный
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterestFree() {
        return interestFree;
    }

    /**
     * Sets the value of the interestFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInterestFree()
     */
    public void setInterestFree(Boolean value) {
        this.interestFree = value;
    }

    /**
     * Примечание к процентной ставке
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestRateNote() {
        return interestRateNote;
    }

    /**
     * Sets the value of the interestRateNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInterestRateNote()
     */
    public void setInterestRateNote(String value) {
        this.interestRateNote = value;
    }

    /**
     * Размер
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAmount()
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Примечание к размеру
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountNote() {
        return amountNote;
    }

    /**
     * Sets the value of the amountNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAmountNote()
     */
    public void setAmountNote(String value) {
        this.amountNote = value;
    }

    /**
     * Файлы договора
     * 
     * Gets the value of the attachContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachContract().add(newItem);
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
     *     The value of the attachContract property.
     */
    public List<AttachmentType> getAttachContract() {
        if (attachContract == null) {
            attachContract = new ArrayList<>();
        }
        return this.attachContract;
    }

}
