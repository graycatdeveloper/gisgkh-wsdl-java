
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Операция по счету
 * 
 * <p>Java class for OperationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OperationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="PaymentPurpose" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="Source" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="PaymentInfoGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="CreditContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Amount" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationType", propOrder = {
    "type",
    "paymentPurpose",
    "source",
    "paymentInfoGUID",
    "creditContractGUID",
    "date",
    "amount"
})
public class OperationType {

    /**
     * Тип операции (НСИ 217)
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected NsiRef type;
    /**
     * Назначение денежных средств (НСИ 215) Обязателен для типа операции Списание денежных средств.
     * 
     */
    @XmlElement(name = "PaymentPurpose")
    protected NsiRef paymentPurpose;
    /**
     * Источник зачисленных денежных средств (НСИ 321) Обязателен для типа операции Зачисление денежных средств
     * 
     */
    @XmlElement(name = "Source")
    protected NsiRef source;
    /**
     * Идентификатор сведений об оплате по договору на выполнение работ в ГИС ЖКХ (обязательно для НСИ 215 с кодом 1, 2, 3 И для НСИ 321 с кодом 8)
     * 
     */
    @XmlElement(name = "PaymentInfoGUID")
    protected String paymentInfoGUID;
    /**
     * Идентификатор кредитного договора/договора займа. Заполняется только Региональным оператором капитального ремонта (обязательно для НСИ 215 с кодом 4, 6, 7)
     * 
     */
    @XmlElement(name = "CreditContractGUID")
    protected String creditContractGUID;
    /**
     * Дата операции
     * 
     */
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Сумма операции
     * 
     */
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;

    /**
     * Тип операции (НСИ 217)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getType()
     */
    public void setType(NsiRef value) {
        this.type = value;
    }

    /**
     * Назначение денежных средств (НСИ 215) Обязателен для типа операции Списание денежных средств.
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getPaymentPurpose() {
        return paymentPurpose;
    }

    /**
     * Sets the value of the paymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getPaymentPurpose()
     */
    public void setPaymentPurpose(NsiRef value) {
        this.paymentPurpose = value;
    }

    /**
     * Источник зачисленных денежных средств (НСИ 321) Обязателен для типа операции Зачисление денежных средств
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getSource()
     */
    public void setSource(NsiRef value) {
        this.source = value;
    }

    /**
     * Идентификатор сведений об оплате по договору на выполнение работ в ГИС ЖКХ (обязательно для НСИ 215 с кодом 1, 2, 3 И для НСИ 321 с кодом 8)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfoGUID() {
        return paymentInfoGUID;
    }

    /**
     * Sets the value of the paymentInfoGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentInfoGUID()
     */
    public void setPaymentInfoGUID(String value) {
        this.paymentInfoGUID = value;
    }

    /**
     * Идентификатор кредитного договора/договора займа. Заполняется только Региональным оператором капитального ремонта (обязательно для НСИ 215 с кодом 4, 6, 7)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditContractGUID() {
        return creditContractGUID;
    }

    /**
     * Sets the value of the creditContractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreditContractGUID()
     */
    public void setCreditContractGUID(String value) {
        this.creditContractGUID = value;
    }

    /**
     * Дата операции
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
     * Сумма операции
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

}
