
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cведения об исполнении предписания
 * 
 * <p>Java class for FulfilePreceptType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FulfilePreceptType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActualFulfiledPreceptDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfilePreceptType", propOrder = {
    "actualFulfiledPreceptDate"
})
public class FulfilePreceptType {

    /**
     * Фактическая дата исполнения требований
     * 
     */
    @XmlElement(name = "ActualFulfiledPreceptDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualFulfiledPreceptDate;

    /**
     * Фактическая дата исполнения требований
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualFulfiledPreceptDate() {
        return actualFulfiledPreceptDate;
    }

    /**
     * Sets the value of the actualFulfiledPreceptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getActualFulfiledPreceptDate()
     */
    public void setActualFulfiledPreceptDate(XMLGregorianCalendar value) {
        this.actualFulfiledPreceptDate = value;
    }

}
