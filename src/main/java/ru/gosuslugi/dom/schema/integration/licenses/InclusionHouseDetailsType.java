
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры записи о включении дома в лицензию
 * 
 * <p>Java class for InclusionHouseDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InclusionHouseDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="HouseAddress" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HouseTextAddressType"/>
 *         <element name="InclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclusionHouseDetailsType", propOrder = {
    "fiasHouseGUID",
    "houseAddress",
    "inclusionDate"
})
public class InclusionHouseDetailsType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGUID", required = true)
    protected String fiasHouseGUID;
    /**
     * Адрес дома
     * 
     */
    @XmlElement(name = "HouseAddress", required = true)
    protected String houseAddress;
    /**
     * Дата включения дома в лицензию
     * 
     */
    @XmlElement(name = "InclusionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inclusionDate;

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
     * Адрес дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * Sets the value of the houseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseAddress()
     */
    public void setHouseAddress(String value) {
        this.houseAddress = value;
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

}
