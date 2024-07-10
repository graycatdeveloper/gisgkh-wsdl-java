
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Объект жилищного фонда
 * 
 * <p>Java class for ObjectAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObjectAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HouseType" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="MKD"/>
 *               <enumeration value="ZHD"/>
 *               <enumeration value="ZHDBlockZastroyki"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="ApartmentNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *         <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectAddressType", propOrder = {
    "houseType",
    "fiasHouseGuid",
    "apartmentNumber",
    "roomNumber"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportSupplyResourceContractObjectAddressRequest.ObjectAddress.LoadObject.class,
    ru.gosuslugi.dom.schema.integration.house_management.SupplyResourceContractType.ObjectAddress.class,
    ExportSupplyResourceContractObjectAddressResultType.class
})
public class ObjectAddressType {

    /**
     * Тип дома:                          MKD - Многоквартирный дом                                   ZHD - Жилой дом                ZHDBlockZastroyki - Жилой дом блокированной застройки
     * 
     */
    @XmlElement(name = "HouseType")
    protected String houseType;
    /**
     * Адрес дома
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Номер квартиры (помещения) / Номер блока
     * 
     */
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    /**
     * Номер комнаты (указывается в случае квартиры коммунального заселения)
     * 
     */
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;

    /**
     * Тип дома:                          MKD - Многоквартирный дом                                   ZHD - Жилой дом                ZHDBlockZastroyki - Жилой дом блокированной застройки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseType() {
        return houseType;
    }

    /**
     * Sets the value of the houseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseType()
     */
    public void setHouseType(String value) {
        this.houseType = value;
    }

    /**
     * Адрес дома
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Номер квартиры (помещения) / Номер блока
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApartmentNumber()
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Номер комнаты (указывается в случае квартиры коммунального заселения)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRoomNumber()
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

}
