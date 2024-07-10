
package ru.gosuslugi.dom.schema.integration.tariff;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Тариф (общий тип)
 * 
 * <p>Java class for TariffCommonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TariffCommonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type"/>
 *         <element name="ActGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="1000"/>
 *         <element name="DateFrom" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}Date1900-3000Type"/>
 *         <element name="DateTo" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}Date1900-3000Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffCommonType", propOrder = {
    "name",
    "actGUID",
    "oktmo",
    "dateFrom",
    "dateTo"
})
@XmlSeeAlso({
    MunicipalResourceTariffType.class,
    ResidentialPremisesMaintenanceType.class,
    CapitalRepairTariffType.class,
    SocialNormType.class,
    ResidentialPremisesUsageType.class
})
public class TariffCommonType {

    /**
     * Наименование
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Идентификатор утверждающего нормативного правового акта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ActGUID", required = true)
    protected List<String> actGUID;
    /**
     * Территория, на которой применяется
     * 
     */
    @XmlElement(name = "OKTMO", required = true)
    protected List<OKTMORefType> oktmo;
    /**
     * Дата начала действия
     * 
     */
    @XmlElement(name = "DateFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    /**
     * Дата окончания действия
     * 
     */
    @XmlElement(name = "DateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;

    /**
     * Наименование
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
     * Идентификатор утверждающего нормативного правового акта в ГИС ЖКХ
     * 
     * Gets the value of the actGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the actGUID property.
     */
    public List<String> getActGUID() {
        if (actGUID == null) {
            actGUID = new ArrayList<>();
        }
        return this.actGUID;
    }

    /**
     * Территория, на которой применяется
     * 
     * Gets the value of the oktmo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oktmo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOKTMO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OKTMORefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the oktmo property.
     */
    public List<OKTMORefType> getOKTMO() {
        if (oktmo == null) {
            oktmo = new ArrayList<>();
        }
        return this.oktmo;
    }

    /**
     * Дата начала действия
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateFrom()
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Дата окончания действия
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateTo()
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

}
