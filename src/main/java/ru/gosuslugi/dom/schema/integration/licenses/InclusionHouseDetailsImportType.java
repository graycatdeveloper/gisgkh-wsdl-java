
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры для импорта записи о включении дома в лицензию
 * 
 * <p>Java class for InclusionHouseDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InclusionHouseDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="InclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="AnnulPeriodLater" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionHouseDetailsImportType", propOrder = {
    "fiasHouseGUID",
    "inclusionDate",
    "annulPeriodLater"
})
public class InclusionHouseDetailsImportType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGUID", required = true)
    protected String fiasHouseGUID;
    /**
     * Дата включения дома в лицензию
     * 
     */
    @XmlElement(name = "InclusionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inclusionDate;
    /**
     * Признак обозначает необходимость аннулировать периодны управления домами другими организациями, позже включаемого периода, при наличии таких периодов. 
     * 
     *  1) Если таких периодов нет, то признак не влияет на внесение информации.
     *  2) Если такие периоды есть и признак выставлен, то информация об управлении другими организациями, позже даты InclusionDate будет аннулирована.
     *  3) Если периоды есть и признак не выставлен, то при размещении сведений о включении дома будет автоматически добавлена информация об окончании периода управления и исключении дома из лицензии с датой на 1 день меньше ближайшего периода управления другой организацией.
     * 
     */
    @XmlElement(name = "AnnulPeriodLater")
    protected Boolean annulPeriodLater;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGUID()
     */
    public void setFIASHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Дата включения дома в лицензию
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInclusionDate() {
        return inclusionDate;
    }

    /**
     * Sets the value of the inclusionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getInclusionDate()
     */
    public void setInclusionDate(XMLGregorianCalendar value) {
        this.inclusionDate = value;
    }

    /**
     * Признак обозначает необходимость аннулировать периодны управления домами другими организациями, позже включаемого периода, при наличии таких периодов. 
     * 
     *  1) Если таких периодов нет, то признак не влияет на внесение информации.
     *  2) Если такие периоды есть и признак выставлен, то информация об управлении другими организациями, позже даты InclusionDate будет аннулирована.
     *  3) Если периоды есть и признак не выставлен, то при размещении сведений о включении дома будет автоматически добавлена информация об окончании периода управления и исключении дома из лицензии с датой на 1 день меньше ближайшего периода управления другой организацией.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnulPeriodLater() {
        return annulPeriodLater;
    }

    /**
     * Sets the value of the annulPeriodLater property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAnnulPeriodLater()
     */
    public void setAnnulPeriodLater(Boolean value) {
        this.annulPeriodLater = value;
    }

}
