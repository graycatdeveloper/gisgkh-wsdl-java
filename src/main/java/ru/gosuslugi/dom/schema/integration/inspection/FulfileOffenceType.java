
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Cведения об исполнении протокола
 * 
 * <p>Java class for FulfileOffenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FulfileOffenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActualFulfiledOffenceDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfileOffenceType", propOrder = {
    "actualFulfiledOffenceDate"
})
public class FulfileOffenceType {

    /**
     * Фактическая дата исполнения
     * 
     */
    @XmlElement(name = "ActualFulfiledOffenceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualFulfiledOffenceDate;

    /**
     * Фактическая дата исполнения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualFulfiledOffenceDate() {
        return actualFulfiledOffenceDate;
    }

    /**
     * Sets the value of the actualFulfiledOffenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getActualFulfiledOffenceDate()
     */
    public void setActualFulfiledOffenceDate(XMLGregorianCalendar value) {
        this.actualFulfiledOffenceDate = value;
    }

}
