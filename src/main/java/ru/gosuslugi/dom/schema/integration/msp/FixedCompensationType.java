
package ru.gosuslugi.dom.schema.integration.msp;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Расчет компенсации в виде фиксированного размера денежной выплаты
 * 
 * <p>Java class for FixedCompensationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FixedCompensationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FamilySize" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="PaymentSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType" minOccurs="0"/>
 *         <element name="CompensationSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyNonNegativeType" minOccurs="0"/>
 *         <element name="RecalculationSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedCompensationType", propOrder = {
    "familySize",
    "paymentSum",
    "compensationSum",
    "recalculationSum"
})
public class FixedCompensationType {

    /**
     * Количество членов семьи, на которых распространяется предоставление компенсации расходов
     * 
     */
    @XmlElement(name = "FamilySize")
    protected Integer familySize;
    /**
     * Размер платы, руб.
     * 
     */
    @XmlElement(name = "PaymentSum")
    protected BigDecimal paymentSum;
    /**
     * Размер компенсации расходов, руб.
     * 
     */
    @XmlElement(name = "CompensationSum")
    protected BigDecimal compensationSum;
    /**
     * Размер перерасчета компенсации расходов за прошлые периоды, руб.
     * 
     */
    @XmlElement(name = "RecalculationSum")
    protected BigDecimal recalculationSum;

    /**
     * Количество членов семьи, на которых распространяется предоставление компенсации расходов
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFamilySize() {
        return familySize;
    }

    /**
     * Sets the value of the familySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getFamilySize()
     */
    public void setFamilySize(Integer value) {
        this.familySize = value;
    }

    /**
     * Размер платы, руб.
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

    /**
     * Размер компенсации расходов, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompensationSum() {
        return compensationSum;
    }

    /**
     * Sets the value of the compensationSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCompensationSum()
     */
    public void setCompensationSum(BigDecimal value) {
        this.compensationSum = value;
    }

    /**
     * Размер перерасчета компенсации расходов за прошлые периоды, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecalculationSum() {
        return recalculationSum;
    }

    /**
     * Sets the value of the recalculationSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRecalculationSum()
     */
    public void setRecalculationSum(BigDecimal value) {
        this.recalculationSum = value;
    }

}
