
package ru.gosuslugi.dom.schema.integration.outage_report;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий объекты жилого фонда, по которым планируется перерыв в предоставлении коммунальных услуг
 * 
 * <p>Java class for OutageReportObjectType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OutageReportObjectType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Houses">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="unbounded"/>
 *                   <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
 *                   <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
 *                   <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
@XmlType(name = "OutageReportObjectType", propOrder = {
    "houses",
    "premises",
    "rooms"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.outage_report.ImportOutageReportRequest.OutageReport.PlacingOutageReport.OutageReportObjects.class,
    ru.gosuslugi.dom.schema.integration.outage_report.ImportOutageReportRequest.OutageReport.EditOutageReport.OutageReportObjects.class
})
public class OutageReportObjectType {

    /**
     * Дома, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     */
    @XmlElement(name = "Houses")
    protected OutageReportObjectType.Houses houses;
    /**
     * Помещения/блоки, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     */
    @XmlElement(name = "Premises")
    protected OutageReportObjectType.Premises premises;
    /**
     * Комнаты, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     */
    @XmlElement(name = "Rooms")
    protected OutageReportObjectType.Rooms rooms;

    /**
     * Дома, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link OutageReportObjectType.Houses }
     *     
     */
    public OutageReportObjectType.Houses getHouses() {
        return houses;
    }

    /**
     * Sets the value of the houses property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReportObjectType.Houses }
     *     
     * @see #getHouses()
     */
    public void setHouses(OutageReportObjectType.Houses value) {
        this.houses = value;
    }

    /**
     * Помещения/блоки, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link OutageReportObjectType.Premises }
     *     
     */
    public OutageReportObjectType.Premises getPremises() {
        return premises;
    }

    /**
     * Sets the value of the premises property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReportObjectType.Premises }
     *     
     * @see #getPremises()
     */
    public void setPremises(OutageReportObjectType.Premises value) {
        this.premises = value;
    }

    /**
     * Комнаты, по которым планируется перерыв в
     * предоставлении  коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link OutageReportObjectType.Rooms }
     *     
     */
    public OutageReportObjectType.Rooms getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutageReportObjectType.Rooms }
     *     
     * @see #getRooms()
     */
    public void setRooms(OutageReportObjectType.Rooms value) {
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
     *         <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="unbounded"/>
     *         <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
        protected List<String> fiasHouseGUID;
        /**
         * Идентификатор дома в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         */
        @XmlElement(name = "HouseGUID")
        protected List<String> houseGUID;

        /**
         * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
         * 
         * Gets the value of the fiasHouseGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fiasHouseGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFiasHouseGUID().add(newItem);
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
         *     The value of the fiasHouseGUID property.
         */
        public List<String> getFiasHouseGUID() {
            if (fiasHouseGUID == null) {
                fiasHouseGUID = new ArrayList<>();
            }
            return this.fiasHouseGUID;
        }

        /**
         * Идентификатор дома в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         * Gets the value of the houseGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the houseGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHouseGUID().add(newItem);
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
         *     The value of the houseGUID property.
         */
        public List<String> getHouseGUID() {
            if (houseGUID == null) {
                houseGUID = new ArrayList<>();
            }
            return this.houseGUID;
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
     *         <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
        protected List<String> premiseGUID;

        /**
         * Идентификатор помещения/блока в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         * Gets the value of the premiseGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the premiseGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPremiseGUID().add(newItem);
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
         *     The value of the premiseGUID property.
         */
        public List<String> getPremiseGUID() {
            if (premiseGUID == null) {
                premiseGUID = new ArrayList<>();
            }
            return this.premiseGUID;
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
     *         <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
        protected List<String> roomGUID;

        /**
         * Идентификатор комнаты в реестре объектов жилищного фонда ГИС ЖКХ
         * 
         * Gets the value of the roomGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRoomGUID().add(newItem);
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
         *     The value of the roomGUID property.
         */
        public List<String> getRoomGUID() {
            if (roomGUID == null) {
                roomGUID = new ArrayList<>();
            }
            return this.roomGUID;
        }

    }

}
