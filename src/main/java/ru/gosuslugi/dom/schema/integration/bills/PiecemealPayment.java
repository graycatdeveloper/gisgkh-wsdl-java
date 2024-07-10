
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="paymentPeriodPiecemealPaymentSum" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <totalDigits value="13"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="pastPaymentPeriodPiecemealPaymentSum" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <totalDigits value="13"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="piecemealPaymentPercentRub">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <totalDigits value="13"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="piecemealPaymentPercent">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <minInclusive value="0"/>
 *               <fractionDigits value="2"/>
 *               <totalDigits value="5"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="piecemealPaymentSum">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <totalDigits value="13"/>
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
@XmlType(name = "", propOrder = {
    "paymentPeriodPiecemealPaymentSum",
    "pastPaymentPeriodPiecemealPaymentSum",
    "piecemealPaymentPercentRub",
    "piecemealPaymentPercent",
    "piecemealPaymentSum"
})
@XmlRootElement(name = "PiecemealPayment")
public class PiecemealPayment {

    /**
     * Сумма платы с учётом рассрочки платежа - от платы за расчётный период, руб.
     * 
     */
    protected BigDecimal paymentPeriodPiecemealPaymentSum;
    /**
     * Сумма платы с учётом рассрочки платежа - от платы за предыдущие расчётные периоды, руб.
     * 
     */
    protected BigDecimal pastPaymentPeriodPiecemealPaymentSum;
    /**
     * Плата за рассрочку, руб.
     * 
     */
    @XmlElement(required = true)
    protected BigDecimal piecemealPaymentPercentRub;
    /**
     * Плата за рассрочку, %
     * 
     */
    @XmlElement(required = true)
    protected BigDecimal piecemealPaymentPercent;
    /**
     * Сумма к оплате с учётом рассрочки платежа и процентов за рассрочку, руб.
     * 
     */
    @XmlElement(required = true)
    protected BigDecimal piecemealPaymentSum;

    /**
     * Сумма платы с учётом рассрочки платежа - от платы за расчётный период, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentPeriodPiecemealPaymentSum() {
        return paymentPeriodPiecemealPaymentSum;
    }

    /**
     * Sets the value of the paymentPeriodPiecemealPaymentSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaymentPeriodPiecemealPaymentSum()
     */
    public void setPaymentPeriodPiecemealPaymentSum(BigDecimal value) {
        this.paymentPeriodPiecemealPaymentSum = value;
    }

    /**
     * Сумма платы с учётом рассрочки платежа - от платы за предыдущие расчётные периоды, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastPaymentPeriodPiecemealPaymentSum() {
        return pastPaymentPeriodPiecemealPaymentSum;
    }

    /**
     * Sets the value of the pastPaymentPeriodPiecemealPaymentSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPastPaymentPeriodPiecemealPaymentSum()
     */
    public void setPastPaymentPeriodPiecemealPaymentSum(BigDecimal value) {
        this.pastPaymentPeriodPiecemealPaymentSum = value;
    }

    /**
     * Плата за рассрочку, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPiecemealPaymentPercentRub() {
        return piecemealPaymentPercentRub;
    }

    /**
     * Sets the value of the piecemealPaymentPercentRub property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPiecemealPaymentPercentRub()
     */
    public void setPiecemealPaymentPercentRub(BigDecimal value) {
        this.piecemealPaymentPercentRub = value;
    }

    /**
     * Плата за рассрочку, %
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPiecemealPaymentPercent() {
        return piecemealPaymentPercent;
    }

    /**
     * Sets the value of the piecemealPaymentPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPiecemealPaymentPercent()
     */
    public void setPiecemealPaymentPercent(BigDecimal value) {
        this.piecemealPaymentPercent = value;
    }

    /**
     * Сумма к оплате с учётом рассрочки платежа и процентов за рассрочку, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPiecemealPaymentSum() {
        return piecemealPaymentSum;
    }

    /**
     * Sets the value of the piecemealPaymentSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPiecemealPaymentSum()
     */
    public void setPiecemealPaymentSum(BigDecimal value) {
        this.piecemealPaymentSum = value;
    }

}
