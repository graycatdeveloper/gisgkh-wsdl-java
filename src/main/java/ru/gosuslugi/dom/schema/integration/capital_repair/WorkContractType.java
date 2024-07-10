
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Работа в договоре на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for WorkContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkContractType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkContractIdentityType">
 *       <sequence>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Cost" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveVeryShortType"/>
 *         <element name="CostPlan" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <element name="Volume">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <minInclusive value="0"/>
 *               <fractionDigits value="3"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI"/>
 *           <element name="OtherUnit" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String500Type"/>
 *         </choice>
 *         <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String1024Type" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkContractType", propOrder = {
    "startDate",
    "endDate",
    "cost",
    "costPlan",
    "volume",
    "okei",
    "otherUnit",
    "additionalInfo"
})
public class WorkContractType
    extends WorkContractIdentityType
{

    /**
     * Дата начала выполнения работы
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата окончания выполнения работы
     * 
     */
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    /**
     * Стоимость работы в договоре
     * 
     */
    @XmlElement(name = "Cost", required = true)
    protected BigDecimal cost;
    /**
     * Соответствующая сумма в КПР
     * 
     */
    @XmlElement(name = "CostPlan", required = true)
    protected BigDecimal costPlan;
    /**
     * Объем работы
     * 
     */
    @XmlElement(name = "Volume", required = true)
    protected BigDecimal volume;
    /**
     * Код ОКЕИ
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String okei;
    /**
     * Другая единица измерения
     * 
     */
    @XmlElement(name = "OtherUnit")
    protected String otherUnit;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Дата начала выполнения работы
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата окончания выполнения работы
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Стоимость работы в договоре
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCost()
     */
    public void setCost(BigDecimal value) {
        this.cost = value;
    }

    /**
     * Соответствующая сумма в КПР
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPlan() {
        return costPlan;
    }

    /**
     * Sets the value of the costPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCostPlan()
     */
    public void setCostPlan(BigDecimal value) {
        this.costPlan = value;
    }

    /**
     * Объем работы
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVolume()
     */
    public void setVolume(BigDecimal value) {
        this.volume = value;
    }

    /**
     * Код ОКЕИ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKEI()
     */
    public void setOKEI(String value) {
        this.okei = value;
    }

    /**
     * Другая единица измерения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherUnit() {
        return otherUnit;
    }

    /**
     * Sets the value of the otherUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOtherUnit()
     */
    public void setOtherUnit(String value) {
        this.otherUnit = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
