
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="FundSizeInfoGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <sequence>
 *           <choice>
 *             <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *             <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="1000"/>
 *           </choice>
 *           <element name="QuarterPeriodFrom" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/>
 *           <element name="QuarterPeriodTo" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="12.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fundSizeInfoGuid",
    "oktmo",
    "fiasHouseGuid",
    "quarterPeriodFrom",
    "quarterPeriodTo"
})
@XmlRootElement(name = "exportFundSizeInfoRequest")
public class ExportFundSizeInfoRequest
    extends BaseType
{

    /**
     * Идентификатор информации о размере фондов капитального ремонта
     * 
     */
    @XmlElement(name = "FundSizeInfoGuid")
    protected List<String> fundSizeInfoGuid;
    /**
     * ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO")
    protected OKTMORefType oktmo;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected List<String> fiasHouseGuid;
    /**
     * Отчетный период - с
     * 
     */
    @XmlElement(name = "QuarterPeriodFrom")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar quarterPeriodFrom;
    /**
     * Отчетный период - по
     * 
     */
    @XmlElement(name = "QuarterPeriodTo")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar quarterPeriodTo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор информации о размере фондов капитального ремонта
     * 
     * Gets the value of the fundSizeInfoGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundSizeInfoGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFundSizeInfoGuid().add(newItem);
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
     *     The value of the fundSizeInfoGuid property.
     */
    public List<String> getFundSizeInfoGuid() {
        if (fundSizeInfoGuid == null) {
            fundSizeInfoGuid = new ArrayList<>();
        }
        return this.fundSizeInfoGuid;
    }

    /**
     * ОКТМО
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
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * Gets the value of the fiasHouseGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFIASHouseGuid().add(newItem);
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
     *     The value of the fiasHouseGuid property.
     */
    public List<String> getFIASHouseGuid() {
        if (fiasHouseGuid == null) {
            fiasHouseGuid = new ArrayList<>();
        }
        return this.fiasHouseGuid;
    }

    /**
     * Отчетный период - с
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuarterPeriodFrom() {
        return quarterPeriodFrom;
    }

    /**
     * Sets the value of the quarterPeriodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getQuarterPeriodFrom()
     */
    public void setQuarterPeriodFrom(XMLGregorianCalendar value) {
        this.quarterPeriodFrom = value;
    }

    /**
     * Отчетный период - по
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuarterPeriodTo() {
        return quarterPeriodTo;
    }

    /**
     * Sets the value of the quarterPeriodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getQuarterPeriodTo()
     */
    public void setQuarterPeriodTo(XMLGregorianCalendar value) {
        this.quarterPeriodTo = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "12.0.0.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
