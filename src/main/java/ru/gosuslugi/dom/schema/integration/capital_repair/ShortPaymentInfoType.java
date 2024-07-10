
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Оплата по договорам на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for ShortPaymentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShortPaymentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentKind">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Prepaid"/>
 *               <enumeration value="PaymentForPerfomedWork"/>
 *               <enumeration value="PaymentReturn"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Recipient" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         <element name="Payer" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Sum" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortPaymentInfoType", propOrder = {
    "paymentKind",
    "recipient",
    "payer",
    "date",
    "sum"
})
@XmlSeeAlso({
    PaymentInfoType.class,
    ExportPaymentInfoType.class
})
public class ShortPaymentInfoType {

    /**
     * Вид оплаты. Требуется указать одно из трех значений: Prepaid - Аванс, PaymentForPerfomedWork - Оплата выполненных работ, PaymentReturn - Возврат оплаты.
     * 
     */
    @XmlElement(name = "PaymentKind", required = true, defaultValue = "PaymentForPerfomedWork")
    protected String paymentKind;
    /**
     * Получатель
     * 
     */
    @XmlElement(name = "Recipient", required = true)
    protected RegOrgType recipient;
    /**
     * Плательщик
     * 
     */
    @XmlElement(name = "Payer", required = true)
    protected RegOrgType payer;
    /**
     * Дата оплаты
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Сумма оплаты
     * 
     */
    @XmlElement(name = "Sum", required = true)
    protected BigDecimal sum;

    /**
     * Вид оплаты. Требуется указать одно из трех значений: Prepaid - Аванс, PaymentForPerfomedWork - Оплата выполненных работ, PaymentReturn - Возврат оплаты.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentKind() {
        return paymentKind;
    }

    /**
     * Sets the value of the paymentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentKind()
     */
    public void setPaymentKind(String value) {
        this.paymentKind = value;
    }

    /**
     * Получатель
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getRecipient()
     */
    public void setRecipient(RegOrgType value) {
        this.recipient = value;
    }

    /**
     * Плательщик
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getPayer()
     */
    public void setPayer(RegOrgType value) {
        this.payer = value;
    }

    /**
     * Дата оплаты
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
     * Сумма оплаты
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSum()
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

}
