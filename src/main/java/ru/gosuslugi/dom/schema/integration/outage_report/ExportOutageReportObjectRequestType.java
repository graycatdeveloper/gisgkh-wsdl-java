
package ru.gosuslugi.dom.schema.integration.outage_report;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий объекты жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг в запросе на экспорт
 * 
 * <p>Java class for ExportOutageReportObjectRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportOutageReportObjectRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Houses">
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
 *         <element name="Premises">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Rooms">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportOutageReportObjectRequestType", propOrder = {
    "houses",
    "premises",
    "rooms"
})
public class ExportOutageReportObjectRequestType {

    /**
     * Дома, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     */
    @XmlElement(name = "Houses")
    protected ExportOutageReportObjectRequestType.Houses houses;
    /**
     * Помещения/блоки, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     */
    @XmlElement(name = "Premises")
    protected ExportOutageReportObjectRequestType.Premises premises;
    /**
     * Комнаты, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     */
    @XmlElement(name = "Rooms")
    protected ExportOutageReportObjectRequestType.Rooms rooms;

    /**
     * Дома, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportOutageReportObjectRequestType.Houses }
     *     
     */
    public ExportOutageReportObjectRequestType.Houses getHouses() {
        return houses;
    }

    /**
     * Sets the value of the houses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOutageReportObjectRequestType.Houses }
     *     
     * @see #getHouses()
     */
    public void setHouses(ExportOutageReportObjectRequestType.Houses value) {
        this.houses = value;
    }

    /**
     * Помещения/блоки, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportOutageReportObjectRequestType.Premises }
     *     
     */
    public ExportOutageReportObjectRequestType.Premises getPremises() {
        return premises;
    }

    /**
     * Sets the value of the premises property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOutageReportObjectRequestType.Premises }
     *     
     * @see #getPremises()
     */
    public void setPremises(ExportOutageReportObjectRequestType.Premises value) {
        this.premises = value;
    }

    /**
     * Комнаты, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportOutageReportObjectRequestType.Rooms }
     *     
     */
    public ExportOutageReportObjectRequestType.Rooms getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOutageReportObjectRequestType.Rooms }
     *     
     * @see #getRooms()
     */
    public void setRooms(ExportOutageReportObjectRequestType.Rooms value) {
        this.rooms = value;
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
    public static class Houses {

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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "premiseGUID"
    })
    public static class Premises {

        /**
         * Идентификатор помещения/блока в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         */
        @XmlElement(name = "PremiseGUID", required = true)
        protected String premiseGUID;

        /**
         * Идентификатор помещения/блока в реестре объектов жилищного фонда ГИС ЖКХ
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
     *       <sequence>
     *         <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomGUID"
    })
    public static class Rooms {

        /**
         * Идентификатор комнаты в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         */
        @XmlElement(name = "RoomGUID", required = true)
        protected String roomGUID;

        /**
         * Идентификатор комнаты в реестре объектов жилищного фонда ГИС ЖКХ
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

    }

}
