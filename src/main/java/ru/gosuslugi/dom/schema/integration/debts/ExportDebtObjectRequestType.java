
package ru.gosuslugi.dom.schema.integration.debts;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий критерии экспорта объектов жилого фонда, по которым имеется непогашенная задолженность, подтвержденная судебным актом
 * 
 * <p>Java class for ExportDebtObjectRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDebtObjectRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="House">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                   <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDebtObjectRequestType", propOrder = {
    "house",
    "premiseGUID",
    "roomGUID"
})
public class ExportDebtObjectRequestType {

    /**
     * Дом, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "House")
    protected ExportDebtObjectRequestType.House house;
    /**
     * Идентификатор помещения/блока в реестре объектов жилищного фонда ГИС ЖКХ, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "PremiseGUID")
    protected String premiseGUID;
    /**
     * Идентификатор комнаты в реестре объектов жилищного фонда ГИС ЖКХ, по которой имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "RoomGUID")
    protected String roomGUID;

    /**
     * Дом, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtObjectRequestType.House }
     *     
     */
    public ExportDebtObjectRequestType.House getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtObjectRequestType.House }
     *     
     * @see #getHouse()
     */
    public void setHouse(ExportDebtObjectRequestType.House value) {
        this.house = value;
    }

    /**
     * Идентификатор помещения/блока в реестре объектов жилищного фонда ГИС ЖКХ, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiseGUID() {
        return premiseGUID;
    }

    /**
     * Sets the value of the premiseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremiseGUID()
     */
    public void setPremiseGUID(String value) {
        this.premiseGUID = value;
    }

    /**
     * Идентификатор комнаты в реестре объектов жилищного фонда ГИС ЖКХ, по которой имеется непогашенная задолженность, подтвержденная судебным актом
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *         <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fiasHouseGUID",
        "houseGUID"
    })
    public static class House {

        /**
         * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "FiasHouseGUID")
        protected String fiasHouseGUID;
        /**
         * Идентификатор дома в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         */
        @XmlElement(name = "HouseGUID")
        protected String houseGUID;

        /**
         * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
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
         * Идентификатор дома в реестре объектов жилищного фонда ГИС ЖКХ
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

    }

}
