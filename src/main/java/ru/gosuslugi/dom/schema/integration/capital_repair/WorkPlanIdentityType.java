
package ru.gosuslugi.dom.schema.integration.capital_repair;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Прикладной идентификатор работы в КПР, РАПКР, МАПКР
 * 
 * <p>Java class for WorkPlanIdentityType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkPlanIdentityType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="WorkKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
@XmlType(name = "WorkPlanIdentityType", propOrder = {
    "fiasHouseGUID",
    "workKind",
    "endMonthYear"
})
@XmlSeeAlso({
    WorkPlanType.class
})
public class WorkPlanIdentityType {

    /**
     * Многоквартирный дом
     * 
     */
    @XmlElement(name = "FiasHouseGUID", required = true)
    protected String fiasHouseGUID;
    /**
     * Вид работ капитального ремонта (НСИ 219)
     * 
     */
    @XmlElement(name = "WorkKind", required = true)
    protected NsiRef workKind;
    /**
     * Месяц и год окончания работ
     * 
     */
    @XmlElement(name = "EndMonthYear", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar endMonthYear;

    /**
     * Многоквартирный дом
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFiasHouseGUID()
     */
    public void setFiasHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Вид работ капитального ремонта (НСИ 219)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getWorkKind() {
        return workKind;
    }

    /**
     * Sets the value of the workKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getWorkKind()
     */
    public void setWorkKind(NsiRef value) {
        this.workKind = value;
    }

    /**
     * Месяц и год окончания работ
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
