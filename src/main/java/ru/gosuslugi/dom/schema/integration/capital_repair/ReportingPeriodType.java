
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Отчетный период
 * 
 * <p>Java class for ReportingPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReportingPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Quarter">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="1"/>
 *               <enumeration value="2"/>
 *               <enumeration value="3"/>
 *               <enumeration value="4"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingPeriodType", propOrder = {
    "quarter",
    "year"
})
public class ReportingPeriodType {

    /**
     * Квартал
     * 
     */
    @XmlElement(name = "Quarter", required = true)
    protected String quarter;
    /**
     * Год
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected short year;

    /**
     * Квартал
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarter() {
        return quarter;
    }

    /**
     * Sets the value of the quarter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getQuarter()
     */
    public void setQuarter(String value) {
        this.quarter = value;
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

}
