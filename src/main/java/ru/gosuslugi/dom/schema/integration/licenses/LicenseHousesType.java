
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация о домах в лицензии
 * 
 * <p>Java class for LicenseHousesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseHousesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="HouseAddress" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HouseTextAddressType"/>
 *         <element name="LicenseHouseStatus" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseHouseStatusType"/>
 *         <element name="InclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="InclusionEntryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ExclusionEntryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseHousesType", propOrder = {
    "fiasHouseGUID",
    "houseAddress",
    "licenseHouseStatus",
    "inclusionDate",
    "exclusionDate",
    "inclusionEntryGuid",
    "exclusionEntryGuid"
})
public class LicenseHousesType {

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
     * Статус дома в лицензии:
     * INCLUDED - Включен в лицензию
     * EXCLUDED - Исключен из лицензии
     * 
     */
    @XmlElement(name = "LicenseHouseStatus", required = true)
    @XmlSchemaType(name = "string")
    protected LicenseHouseStatusType licenseHouseStatus;
    /**
     * Дата включения дома в лицензию
     * 
     */
    @XmlElement(name = "InclusionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inclusionDate;
    /**
     * Дата исключения дома
     * 
     */
    @XmlElement(name = "ExclusionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exclusionDate;
    /**
     * Идентификатор записи о включении
     * 
     */
    @XmlElement(name = "InclusionEntryGuid", required = true)
    protected String inclusionEntryGuid;
    /**
     * Идентификатор записи об исключении
     * 
     */
    @XmlElement(name = "ExclusionEntryGuid")
    protected String exclusionEntryGuid;

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
     * Статус дома в лицензии:
     * INCLUDED - Включен в лицензию
     * EXCLUDED - Исключен из лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseHouseStatusType }
     *     
     */
    public LicenseHouseStatusType getLicenseHouseStatus() {
        return licenseHouseStatus;
    }

    /**
     * Sets the value of the licenseHouseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseHouseStatusType }
     *     
     * @see #getLicenseHouseStatus()
     */
    public void setLicenseHouseStatus(LicenseHouseStatusType value) {
        this.licenseHouseStatus = value;
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
     * Дата исключения дома
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExclusionDate() {
        return exclusionDate;
    }

    /**
     * Sets the value of the exclusionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExclusionDate()
     */
    public void setExclusionDate(XMLGregorianCalendar value) {
        this.exclusionDate = value;
    }

    /**
     * Идентификатор записи о включении
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionEntryGuid() {
        return inclusionEntryGuid;
    }

    /**
     * Sets the value of the inclusionEntryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInclusionEntryGuid()
     */
    public void setInclusionEntryGuid(String value) {
        this.inclusionEntryGuid = value;
    }

    /**
     * Идентификатор записи об исключении
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionEntryGuid() {
        return exclusionEntryGuid;
    }

    /**
     * Sets the value of the exclusionEntryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExclusionEntryGuid()
     */
    public void setExclusionEntryGuid(String value) {
        this.exclusionEntryGuid = value;
    }

}
