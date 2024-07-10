
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Данные отчетного периода (РСО)
 * 
 * <p>Java class for ReportPeriodRSOInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReportPeriodRSOInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Credted">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <maxExclusive value="10000000000"/>
 *               <pattern value="-?\d{0,10}(\.\d{0,2})?"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Receipt">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <maxExclusive value="10000000000"/>
 *               <pattern value="-?\d{0,10}(\.\d{0,2})?"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Debts">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <pattern value="\d{0,10}(\.\d{0,2})?"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Overpayment">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <pattern value="\d{0,10}(\.\d{0,2})?"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Paid" type="{http://dom.gosuslugi.ru/schema/integration/bills/}MoneySettlementsType" minOccurs="0"/>
 *         <element name="SupportingDocuments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPeriodRSOInfoType", propOrder = {
    "credted",
    "receipt",
    "debts",
    "overpayment",
    "paid",
    "supportingDocuments"
})
public class ReportPeriodRSOInfoType {

    /**
     * Начислено
     * 
     */
    @XmlElement(name = "Credted", required = true)
    protected BigDecimal credted;
    /**
     * Поступило
     * 
     */
    @XmlElement(name = "Receipt", required = true)
    protected BigDecimal receipt;
    /**
     * Задолженность
     * 
     */
    @XmlElement(name = "Debts", required = true)
    protected BigDecimal debts;
    /**
     * Переплата
     * 
     */
    @XmlElement(name = "Overpayment", required = true)
    protected BigDecimal overpayment;
    /**
     * Оплачено. Заполняется, если у организации два полномочия: РСО+УО и в ДРСО она является как первой стороной договора, так и Исполнителем КУ.
     * 
     */
    @XmlElement(name = "Paid")
    protected BigDecimal paid;
    /**
     * Сведения о документах, подтверждающих факт поставки ресурсов, выполнения работ, оказания услуг
     * 
     */
    @XmlElement(name = "SupportingDocuments")
    protected List<AttachmentType> supportingDocuments;

    /**
     * Начислено
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCredted() {
        return credted;
    }

    /**
     * Sets the value of the credted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCredted()
     */
    public void setCredted(BigDecimal value) {
        this.credted = value;
    }

    /**
     * Поступило
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReceipt() {
        return receipt;
    }

    /**
     * Sets the value of the receipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getReceipt()
     */
    public void setReceipt(BigDecimal value) {
        this.receipt = value;
    }

    /**
     * Задолженность
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebts() {
        return debts;
    }

    /**
     * Sets the value of the debts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getDebts()
     */
    public void setDebts(BigDecimal value) {
        this.debts = value;
    }

    /**
     * Переплата
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverpayment() {
        return overpayment;
    }

    /**
     * Sets the value of the overpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getOverpayment()
     */
    public void setOverpayment(BigDecimal value) {
        this.overpayment = value;
    }

    /**
     * Оплачено. Заполняется, если у организации два полномочия: РСО+УО и в ДРСО она является как первой стороной договора, так и Исполнителем КУ.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaid()
     */
    public void setPaid(BigDecimal value) {
        this.paid = value;
    }

    /**
     * Сведения о документах, подтверждающих факт поставки ресурсов, выполнения работ, оказания услуг
     * 
     * Gets the value of the supportingDocuments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingDocuments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportingDocuments().add(newItem);
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
     *     The value of the supportingDocuments property.
     */
    public List<AttachmentType> getSupportingDocuments() {
        if (supportingDocuments == null) {
            supportingDocuments = new ArrayList<>();
        }
        return this.supportingDocuments;
    }

}
