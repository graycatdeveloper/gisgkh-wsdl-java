
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый тип для запланированной или выполненной работы за месяц
 * 
 * <p>Java class for MonthlyWorkType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MonthlyWorkType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="count" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
 *         <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlyWorkType", propOrder = {
    "count",
    "workDate"
})
public class MonthlyWorkType {

    /**
     * Количество работ
     * 
     */
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int count;
    /**
     * Даты начала работ
     * 
     */
    @XmlElement(name = "WorkDate")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> workDate;

    /**
     * Количество работ
     * 
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Даты начала работ
     * 
     * Gets the value of the workDate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workDate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWorkDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * </p>
     * 
     * 
     * @return
     *     The value of the workDate property.
     */
    public List<XMLGregorianCalendar> getWorkDate() {
        if (workDate == null) {
            workDate = new ArrayList<>();
        }
        return this.workDate;
    }

}
