
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспорт объектов жилищного фонда из договора ресурсоснабжения
 * 
 * <p>Java class for ObjectAddressBriefType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObjectAddressBriefType">
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
 *         <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="Pair" maxOccurs="100" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NoConnectionToWaterSupply" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectAddressBriefType", propOrder = {
    "houseType",
    "fiasHouseGuid",
    "apartmentNumber",
    "roomNumber",
    "premisesGUID",
    "blockGUID",
    "roomGUID",
    "pair",
    "noConnectionToWaterSupply"
})
public class ObjectAddressBriefType {

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
     * Номер квартиры (помещения) /  номер блока
     * 
     */
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    /**
     * Номер комнаты
     * 
     */
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    /**
     * Идентификатор помещения
     * 
     */
    @XmlElement(name = "PremisesGUID")
    protected String premisesGUID;
    /**
     * Идентификатор блока жилого дома
     * 
     */
    @XmlElement(name = "BlockGUID")
    protected String blockGUID;
    /**
     * Идентификатор комнаты
     * 
     */
    @XmlElement(name = "RoomGUID")
    protected String roomGUID;
    /**
     * Информация о КУ и КР по ОЖФ
     * 
     */
    @XmlElement(name = "Pair")
    protected List<ObjectAddressBriefType.Pair> pair;
    /**
     * Признак "Отсутствие присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения"
     * 
     */
    @XmlElement(name = "NoConnectionToWaterSupply")
    protected Boolean noConnectionToWaterSupply;

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
     * Номер квартиры (помещения) /  номер блока
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
     * Номер комнаты
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

    /**
     * Идентификатор помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremisesGUID() {
        return premisesGUID;
    }

    /**
     * Sets the value of the premisesGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremisesGUID()
     */
    public void setPremisesGUID(String value) {
        this.premisesGUID = value;
    }

    /**
     * Идентификатор блока жилого дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockGUID() {
        return blockGUID;
    }

    /**
     * Sets the value of the blockGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBlockGUID()
     */
    public void setBlockGUID(String value) {
        this.blockGUID = value;
    }

    /**
     * Идентификатор комнаты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomGUID() {
        return roomGUID;
    }

    /**
     * Sets the value of the roomGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRoomGUID()
     */
    public void setRoomGUID(String value) {
        this.roomGUID = value;
    }

    /**
     * Информация о КУ и КР по ОЖФ
     * 
     * Gets the value of the pair property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pair property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPair().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectAddressBriefType.Pair }
     * </p>
     * 
     * 
     * @return
     *     The value of the pair property.
     */
    public List<ObjectAddressBriefType.Pair> getPair() {
        if (pair == null) {
            pair = new ArrayList<>();
        }
        return this.pair;
    }

    /**
     * Признак "Отсутствие присоединения сетей объекта жилищного фонда к централизованной системе водоснабжения"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoConnectionToWaterSupply() {
        return noConnectionToWaterSupply;
    }

    /**
     * Sets the value of the noConnectionToWaterSupply property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoConnectionToWaterSupply()
     */
    public void setNoConnectionToWaterSupply(Boolean value) {
        this.noConnectionToWaterSupply = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractSubjectObjectAdressType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transportGUID"
    })
    public static class Pair
        extends ContractSubjectObjectAdressType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

    }

}
