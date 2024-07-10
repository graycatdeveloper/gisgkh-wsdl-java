
package ru.gosuslugi.dom.schema.integration.capital_repair;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Работа в РПКР
 * 
 * <p>Java class for RegionalProgramWorkType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RegionalProgramWorkType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="StartYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *         <element name="EndYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalProgramWorkType", propOrder = {
    "fiasHouseGUID",
    "oktmo",
    "workType",
    "startYearMonth",
    "endYearMonth"
})
@XmlSeeAlso({
    ExportRegionalProgramWorkType.class
})
public class RegionalProgramWorkType {

    /**
     * Адрес дома по ФИАС
     * 
     */
    @XmlElement(name = "FiasHouseGUID", required = true)
    protected String fiasHouseGUID;
    /**
     * Код ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected OKTMORefType oktmo;
    /**
     * Вид работ капитального ремонта (НСИ 219)
     * 
     */
    @XmlElement(name = "WorkType", required = true)
    protected NsiRef workType;
    /**
     * Месяц и год начала работы
     * 
     */
    @XmlElement(name = "StartYearMonth", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar startYearMonth;
    /**
     * Месяц и год окончания работы
     * 
     */
    @XmlElement(name = "EndYearMonth", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar endYearMonth;

    /**
     * Адрес дома по ФИАС
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
     * Код ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Вид работ капитального ремонта (НСИ 219)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getWorkType()
     */
    public void setWorkType(NsiRef value) {
        this.workType = value;
    }

    /**
     * Месяц и год начала работы
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartYearMonth() {
        return startYearMonth;
    }

    /**
     * Sets the value of the startYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartYearMonth()
     */
    public void setStartYearMonth(XMLGregorianCalendar value) {
        this.startYearMonth = value;
    }

    /**
     * Месяц и год окончания работы
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndYearMonth() {
        return endYearMonth;
    }

    /**
     * Sets the value of the endYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndYearMonth()
     */
    public void setEndYearMonth(XMLGregorianCalendar value) {
        this.endYearMonth = value;
    }

}
