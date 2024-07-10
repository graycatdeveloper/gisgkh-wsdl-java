
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Объект жилищного фонда в основании
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
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="ApartmentNumber" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}PremisesNumType" minOccurs="0"/>
 *         <element name="BlockNumber" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}PremisesNumType" minOccurs="0"/>
 *         <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}PremisesNumType" minOccurs="0"/>
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
    "fiasHouseGuid",
    "apartmentNumber",
    "blockNumber",
    "roomNumber"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject.ObjectAddress.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.QualityResourcesType.ObjectAddress.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.QualityServicesType.ObjectAddress.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.VolumeResourcesType.ObjectAddress.class
})
public class ObjectAddressType {

    /**
     * Адрес дома
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Номер квартиры (помещения)
     * 
     */
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    /**
     * Номер блока (указывается в случае жилого дома блокированной застройки)
     * 
     */
    @XmlElement(name = "BlockNumber")
    protected String blockNumber;
    /**
     * Номер комнаты (указывается в случае квартиры коммунального заселения)
     * 
     */
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;

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
     * Номер квартиры (помещения)
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
     * Номер блока (указывается в случае жилого дома блокированной застройки)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNumber() {
        return blockNumber;
    }

    /**
     * Sets the value of the blockNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBlockNumber()
     */
    public void setBlockNumber(String value) {
        this.blockNumber = value;
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
