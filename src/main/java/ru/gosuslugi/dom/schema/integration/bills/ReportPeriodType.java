
package ru.gosuslugi.dom.schema.integration.bills;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Отчетный период
 * 
 * <p>Java class for ReportPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReportPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
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
@XmlType(name = "ReportPeriodType", propOrder = {
    "month",
    "year"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.class,
    ru.gosuslugi.dom.schema.integration.bills.ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.class,
    ru.gosuslugi.dom.schema.integration.bills.ExportSettlementResultType.ReportingPeriod.class
})
public class ReportPeriodType {

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

}
