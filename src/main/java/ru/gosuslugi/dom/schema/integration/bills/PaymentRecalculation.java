
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
 *         <element name="recalculationReason">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="sum">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="2"/>
 *               <minInclusive value="0"/>
 *               <maxInclusive value="9999999999.99"/>
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
    "recalculationReason",
    "sum"
})
@XmlRootElement(name = "PaymentRecalculation")
public class PaymentRecalculation {

    /**
     * Основания перерасчётов
     * 
     */
    @XmlElement(required = true)
    protected String recalculationReason;
    /**
     * Сумма
     * 
     */
    @XmlElement(required = true)
    protected BigDecimal sum;

    /**
     * Основания перерасчётов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecalculationReason() {
        return recalculationReason;
    }

    /**
     * Sets the value of the recalculationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecalculationReason()
     */
    public void setRecalculationReason(String value) {
        this.recalculationReason = value;
    }

    /**
     * Сумма
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
