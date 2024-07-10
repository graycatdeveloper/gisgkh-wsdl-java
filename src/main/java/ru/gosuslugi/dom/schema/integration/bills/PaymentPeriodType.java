
package ru.gosuslugi.dom.schema.integration.bills;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *         <choice>
 *           <element name="isUO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="isRSO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPeriodType", propOrder = {
    "month",
    "year",
    "isUO",
    "isRSO"
})
public class PaymentPeriodType {

    /**
     * Месяц
     * 
     */
    @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected int month;
    /**
     * Год
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected short year;
    /**
     * для полномочия "УО"
     * 
     */
    protected Boolean isUO;
    /**
     * для полномочия "УО"
     * 
     */
    protected Boolean isRSO;

    /**
     * Месяц
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Год
     * 
     */
    public short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(short value) {
        this.year = value;
    }

    /**
     * для полномочия "УО"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUO() {
        return isUO;
    }

    /**
     * Sets the value of the isUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsUO()
     */
    public void setIsUO(Boolean value) {
        this.isUO = value;
    }

    /**
     * для полномочия "УО"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRSO() {
        return isRSO;
    }

    /**
     * Sets the value of the isRSO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRSO()
     */
    public void setIsRSO(Boolean value) {
        this.isRSO = value;
    }

}
