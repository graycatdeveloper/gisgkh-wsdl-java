
package ru.gosuslugi.dom.schema.integration.msp;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Расчеты и перерасчеты для гражданина, получающего субсидии
 * 
 * <p>Java class for CitizenSubsidyCalculationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CitizenSubsidyCalculationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PeriodDate" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         <element name="CalculationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="FamilySize">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ActualExpensesSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType"/>
 *         <element name="SubsidySum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType" minOccurs="0"/>
 *         <element name="RecalculationSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType" minOccurs="0"/>
 *         <element name="TotalSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenSubsidyCalculationType", propOrder = {
    "periodDate",
    "calculationDate",
    "familySize",
    "actualExpensesSum",
    "subsidySum",
    "recalculationSum",
    "totalSum"
})
@XmlSeeAlso({
    ExportCitizenSubsidyCalculationType.class
})
public class CitizenSubsidyCalculationType {

    /**
     * Период, за который выполнен расчет субсидии
     * 
     */
    @XmlElement(name = "PeriodDate", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar periodDate;
    /**
     * Дата расчета
     * 
     */
    @XmlElement(name = "CalculationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calculationDate;
    /**
     * Количество членов семьи, на которых распространяется предоставление субсидии
     * 
     */
    @XmlElement(name = "FamilySize")
    protected int familySize;
    /**
     * Размер фактических расходов, руб.
     * 
     */
    @XmlElement(name = "ActualExpensesSum", required = true)
    protected BigDecimal actualExpensesSum;
    /**
     * Размер субсидии, руб.
     * 
     */
    @XmlElement(name = "SubsidySum")
    protected BigDecimal subsidySum;
    /**
     * Размер перерасчета за прошлые периоды, руб.
     * 
     */
    @XmlElement(name = "RecalculationSum")
    protected BigDecimal recalculationSum;
    /**
     * Размер предоставляемой субсидии, руб.
     * 
     */
    @XmlElement(name = "TotalSum", required = true)
    protected BigDecimal totalSum;

    /**
     * Период, за который выполнен расчет субсидии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodDate() {
        return periodDate;
    }

    /**
     * Sets the value of the periodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPeriodDate()
     */
    public void setPeriodDate(XMLGregorianCalendar value) {
        this.periodDate = value;
    }

    /**
     * Дата расчета
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculationDate() {
        return calculationDate;
    }

    /**
     * Sets the value of the calculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCalculationDate()
     */
    public void setCalculationDate(XMLGregorianCalendar value) {
        this.calculationDate = value;
    }

    /**
     * Количество членов семьи, на которых распространяется предоставление субсидии
     * 
     */
    public int getFamilySize() {
        return familySize;
    }

    /**
     * Sets the value of the familySize property.
     * 
     */
    public void setFamilySize(int value) {
        this.familySize = value;
    }

    /**
     * Размер фактических расходов, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActualExpensesSum() {
        return actualExpensesSum;
    }

    /**
     * Sets the value of the actualExpensesSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getActualExpensesSum()
     */
    public void setActualExpensesSum(BigDecimal value) {
        this.actualExpensesSum = value;
    }

    /**
     * Размер субсидии, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubsidySum() {
        return subsidySum;
    }

    /**
     * Sets the value of the subsidySum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSubsidySum()
     */
    public void setSubsidySum(BigDecimal value) {
        this.subsidySum = value;
    }

    /**
     * Размер перерасчета за прошлые периоды, руб.
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

    /**
     * Размер предоставляемой субсидии, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSum() {
        return totalSum;
    }

    /**
     * Sets the value of the totalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalSum()
     */
    public void setTotalSum(BigDecimal value) {
        this.totalSum = value;
    }

}
