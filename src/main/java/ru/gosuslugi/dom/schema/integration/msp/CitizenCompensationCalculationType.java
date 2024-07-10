
package ru.gosuslugi.dom.schema.integration.msp;

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


/**
 * Расчеты и перерасчеты для гражданина, получающего компенсации расходов
 * 
 * <p>Java class for CitizenCompensationCalculationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CitizenCompensationCalculationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PeriodFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PeriodTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="CalculationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="CompensationSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType"/>
 *         <sequence>
 *           <element name="Actual" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ActualCompensationType" maxOccurs="16" minOccurs="0"/>
 *           <element name="Standard" type="{http://dom.gosuslugi.ru/schema/integration/msp/}StandardCompensationType" minOccurs="0"/>
 *           <element name="Fixed" type="{http://dom.gosuslugi.ru/schema/integration/msp/}FixedCompensationType" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenCompensationCalculationType", propOrder = {
    "periodFrom",
    "periodTo",
    "calculationDate",
    "compensationSum",
    "actual",
    "standard",
    "fixed"
})
@XmlSeeAlso({
    ExportCitizenCompensationCalculationType.class
})
public class CitizenCompensationCalculationType {

    /**
     * Дата начала периода, за который выполнен расчет компенсации
     * 
     */
    @XmlElement(name = "PeriodFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodFrom;
    /**
     * Дата окончания периода, за который выполнен расчет компенсации
     * 
     */
    @XmlElement(name = "PeriodTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodTo;
    /**
     * Дата расчета
     * 
     */
    @XmlElement(name = "CalculationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar calculationDate;
    /**
     * Размер компенсационной выплаты, руб.
     * 
     */
    @XmlElement(name = "CompensationSum", required = true)
    protected BigDecimal compensationSum;
    /**
     * Расчет компенсации от фактических расходов на оплату жилищно-коммунальных услуг
     * 
     */
    @XmlElement(name = "Actual")
    protected List<ActualCompensationType> actual;
    /**
     * Расчет компенсации по стандартам стоимости жилищно-коммунальных услуг
     * 
     */
    @XmlElement(name = "Standard")
    protected StandardCompensationType standard;
    /**
     * Расчет компенсации в виде фиксированного размера денежной выплаты
     * 
     */
    @XmlElement(name = "Fixed")
    protected FixedCompensationType fixed;

    /**
     * Дата начала периода, за который выполнен расчет компенсации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodFrom() {
        return periodFrom;
    }

    /**
     * Sets the value of the periodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPeriodFrom()
     */
    public void setPeriodFrom(XMLGregorianCalendar value) {
        this.periodFrom = value;
    }

    /**
     * Дата окончания периода, за который выполнен расчет компенсации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodTo() {
        return periodTo;
    }

    /**
     * Sets the value of the periodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPeriodTo()
     */
    public void setPeriodTo(XMLGregorianCalendar value) {
        this.periodTo = value;
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
     * Размер компенсационной выплаты, руб.
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
     * Расчет компенсации от фактических расходов на оплату жилищно-коммунальных услуг
     * 
     * Gets the value of the actual property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actual property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActualCompensationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the actual property.
     */
    public List<ActualCompensationType> getActual() {
        if (actual == null) {
            actual = new ArrayList<>();
        }
        return this.actual;
    }

    /**
     * Расчет компенсации по стандартам стоимости жилищно-коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link StandardCompensationType }
     *     
     */
    public StandardCompensationType getStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardCompensationType }
     *     
     * @see #getStandard()
     */
    public void setStandard(StandardCompensationType value) {
        this.standard = value;
    }

    /**
     * Расчет компенсации в виде фиксированного размера денежной выплаты
     * 
     * @return
     *     possible object is
     *     {@link FixedCompensationType }
     *     
     */
    public FixedCompensationType getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedCompensationType }
     *     
     * @see #getFixed()
     */
    public void setFixed(FixedCompensationType value) {
        this.fixed = value;
    }

}
