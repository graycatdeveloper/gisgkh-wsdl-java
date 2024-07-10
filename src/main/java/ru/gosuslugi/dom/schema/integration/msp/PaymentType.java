
package ru.gosuslugi.dom.schema.integration.msp;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Выплата гражданину, получающему субсидии/компенсации расходов
 * 
 * <p>Java class for PaymentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentType">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               <enumeration value="Payment"/>
 *               <enumeration value="Refund"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PaymentSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyPositiveType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", propOrder = {
    "paymentType",
    "paymentDate",
    "paymentSum"
})
@XmlSeeAlso({
    ExportPaymentType.class
})
public class PaymentType {

    /**
     * Тип выплаты. Требуется указать одно из двух возможных значений: Payment - выплата гражданину, Refund - возврат гражданином излишне полученной суммы
     * 
     */
    @XmlElement(name = "PaymentType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentType;
    /**
     * Дата выплаты
     * 
     */
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    /**
     * Сумма выплаты, руб.
     * 
     */
    @XmlElement(name = "PaymentSum", required = true)
    protected BigDecimal paymentSum;

    /**
     * Тип выплаты. Требуется указать одно из двух возможных значений: Payment - выплата гражданину, Refund - возврат гражданином излишне полученной суммы
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentType()
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Дата выплаты
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPaymentDate()
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Сумма выплаты, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentSum() {
        return paymentSum;
    }

    /**
     * Sets the value of the paymentSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaymentSum()
     */
    public void setPaymentSum(BigDecimal value) {
        this.paymentSum = value;
    }

}
