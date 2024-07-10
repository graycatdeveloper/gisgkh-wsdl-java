
package ru.gosuslugi.dom.schema.integration.capital_repair;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Импортируемый паспорт РПКР
 * 
 * <p>Java class for RegionalProgramPasportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RegionalProgramPasportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProgramName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="StartYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         <element name="EndYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalProgramPasportType", propOrder = {
    "programName",
    "startYear",
    "endYear"
})
@XmlSeeAlso({
    ExportRegionalProgramType.class
})
public class RegionalProgramPasportType {

    /**
     * Наименование программы
     * 
     */
    @XmlElement(name = "ProgramName", required = true)
    protected String programName;
    /**
     * Год начала периода реализации
     * 
     */
    @XmlElement(name = "StartYear", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar startYear;
    /**
     * Год окончания периода реализации
     * 
     */
    @XmlElement(name = "EndYear", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar endYear;

    /**
     * Наименование программы
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProgramName()
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Год начала периода реализации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartYear()
     */
    public void setStartYear(XMLGregorianCalendar value) {
        this.startYear = value;
    }

    /**
     * Год окончания периода реализации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndYear()
     */
    public void setEndYear(XMLGregorianCalendar value) {
        this.endYear = value;
    }

}
