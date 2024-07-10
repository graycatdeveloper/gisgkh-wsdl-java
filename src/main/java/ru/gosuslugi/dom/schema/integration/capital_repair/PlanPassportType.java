
package ru.gosuslugi.dom.schema.integration.capital_repair;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Паспорт программы/плана
 * 
 * <p>Java class for PlanPassportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PlanPassportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String1000Type">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Territory" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="Type">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type">
 *               <enumeration value="Plan"/>
 *               <enumeration value="MunicipalAddressProgram"/>
 *               <enumeration value="RegionalAddressProgram"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="StartMonthYear" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         <element name="EndMonthYear" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanPassportType", propOrder = {
    "name",
    "territory",
    "type",
    "startMonthYear",
    "endMonthYear"
})
@XmlSeeAlso({
    ExportPlanPassportType.class
})
public class PlanPassportType {

    /**
     * Наименование программы/плана
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Территория реализации программы/плана. Для регионального КПР и РАПКР должно быть прислано ОКТМО уровня региона. Для муниципального КПР и МАПКР должно быть прислано ОКТМО уровня муниципального образования.
     * 
     */
    @XmlElement(name = "Territory", required = true)
    protected OKTMORefType territory;
    /**
     * Вид программы, Plan - КПР, MunicipalAddressProgram - МАПКР, RegionalAddressProgram - РАПКР
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Месяц и год начала периода реализации
     * 
     */
    @XmlElement(name = "StartMonthYear", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar startMonthYear;
    /**
     * Месяц и год  окончания периода реализации
     * 
     */
    @XmlElement(name = "EndMonthYear", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar endMonthYear;

    /**
     * Наименование программы/плана
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Территория реализации программы/плана. Для регионального КПР и РАПКР должно быть прислано ОКТМО уровня региона. Для муниципального КПР и МАПКР должно быть прислано ОКТМО уровня муниципального образования.
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getTerritory()
     */
    public void setTerritory(OKTMORefType value) {
        this.territory = value;
    }

    /**
     * Вид программы, Plan - КПР, MunicipalAddressProgram - МАПКР, RegionalAddressProgram - РАПКР
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Месяц и год начала периода реализации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartMonthYear() {
        return startMonthYear;
    }

    /**
     * Sets the value of the startMonthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartMonthYear()
     */
    public void setStartMonthYear(XMLGregorianCalendar value) {
        this.startMonthYear = value;
    }

    /**
     * Месяц и год  окончания периода реализации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndMonthYear() {
        return endMonthYear;
    }

    /**
     * Sets the value of the endMonthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndMonthYear()
     */
    public void setEndMonthYear(XMLGregorianCalendar value) {
        this.endMonthYear = value;
    }

}
