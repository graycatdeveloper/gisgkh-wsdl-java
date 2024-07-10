
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о рассрочке
 * 
 * <p>Java class for InstallmentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InstallmentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PaymentSum" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentInfoType", propOrder = {
    "paymentDate",
    "paymentSum"
})
public class InstallmentInfoType {

    /**
     * Дата платежа
     * 
     */
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;
    /**
     * Сумма платежа
     * 
     */
    @XmlElement(name = "PaymentSum", required = true)
    protected BigDecimal paymentSum;

    /**
     * Дата платежа
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
     * Сумма платежа
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
