
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип: Адрес
 * 
 * <p>Java class for AddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AddressObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <sequence>
 *           <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="PremiseNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "addressObjectGUID",
    "houseGUID",
    "premiseNumber"
})
public class AddressType {

    /**
     * Глобальный идентификатор адресного объекта ФИАС
     * 
     */
    @XmlElement(name = "AddressObjectGUID")
    protected String addressObjectGUID;
    /**
     * Глобальный идентификатор дома ФИАС
     * 
     */
    @XmlElement(name = "HouseGUID")
    protected String houseGUID;
    /**
     * Номер квартиры/помещения
     * 
     */
    @XmlElement(name = "PremiseNumber")
    protected String premiseNumber;

    /**
     * Глобальный идентификатор адресного объекта ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressObjectGUID() {
        return addressObjectGUID;
    }

    /**
     * Sets the value of the addressObjectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddressObjectGUID()
     */
    public void setAddressObjectGUID(String value) {
        this.addressObjectGUID = value;
    }

    /**
     * Глобальный идентификатор дома ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseGUID() {
        return houseGUID;
    }

    /**
     * Sets the value of the houseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseGUID()
     */
    public void setHouseGUID(String value) {
        this.houseGUID = value;
    }

    /**
     * Номер квартиры/помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseNumber() {
        return premiseNumber;
    }

    /**
     * Sets the value of the premiseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremiseNumber()
     */
    public void setPremiseNumber(String value) {
        this.premiseNumber = value;
    }

}
