
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип выбора дня
 * 
 * <p>Java class for DaySelectionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DaySelectionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Date">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                 <maxInclusive value="31"/>
 *                 <minInclusive value="1"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="LastDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="IsNextMonth" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaySelectionType", propOrder = {
    "date",
    "lastDay",
    "isNextMonth"
})
@XmlSeeAlso({
    DeviceMeteringsDaySelectionType.class
})
public class DaySelectionType {

    /**
     * День месяца
     * 
     */
    @XmlElement(name = "Date")
    protected Byte date;
    /**
     * Последний день месяца
     * 
     */
    @XmlElement(name = "LastDay")
    protected Boolean lastDay;
    /**
     * Следующего месяца?
     * 
     */
    @XmlElement(name = "IsNextMonth")
    protected boolean isNextMonth;

    /**
     * День месяца
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     * @see #getDate()
     */
    public void setDate(Byte value) {
        this.date = value;
    }

    /**
     * Последний день месяца
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastDay() {
        return lastDay;
    }

    /**
     * Sets the value of the lastDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isLastDay()
     */
    public void setLastDay(Boolean value) {
        this.lastDay = value;
    }

    /**
     * Следующего месяца?
     * 
     */
    public boolean isIsNextMonth() {
        return isNextMonth;
    }

    /**
     * Sets the value of the isNextMonth property.
     * 
     */
    public void setIsNextMonth(boolean value) {
        this.isNextMonth = value;
    }

}
