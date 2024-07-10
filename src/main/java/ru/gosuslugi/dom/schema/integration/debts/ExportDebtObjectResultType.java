
package ru.gosuslugi.dom.schema.integration.debts;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип данных, описывающий объект жилого фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
 * 
 * <p>Java class for ExportDebtObjectResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDebtObjectResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ObjectGUID">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="House">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                             <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="PremiseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="RoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ObjectStatus" type="{http://dom.gosuslugi.ru/schema/integration/debts/}ObjectStatusType" minOccurs="0"/>
 *         <element name="ObjectStatusDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <choice>
 *           <element name="ObjectDemolishedReason" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <minLength value="1"/>
 *                 <maxLength value="500"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="ObjectAnnuledReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDebtObjectResultType", propOrder = {
    "objectGUID",
    "objectStatus",
    "objectStatusDate",
    "objectDemolishedReason",
    "objectAnnuledReason"
})
public class ExportDebtObjectResultType {

    /**
     * Объект жилого фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "ObjectGUID", required = true)
    protected ExportDebtObjectResultType.ObjectGUID objectGUID;
    /**
     * Статус объекта жилищного фонда. Возможные значения:
     * DEMOLISHED - снесен;
     * ANNULED - аннулирован.
     * Если статус объекта жилищного фонда отличен от данных значений, то элемент не заполняется.
     * 
     */
    @XmlElement(name = "ObjectStatus")
    @XmlSchemaType(name = "string")
    protected ObjectStatusType objectStatus;
    /**
     * Дата изменения статуса объекта жилищного фонда. Заполняется только заполнен элемент tns:ObjectStatus
     * 
     */
    @XmlElement(name = "ObjectStatusDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objectStatusDate;
    /**
     * Причина изменения статуса объекта жилищного фонда на статус Снесен
     * 
     */
    @XmlElement(name = "ObjectDemolishedReason")
    protected String objectDemolishedReason;
    /**
     * Причина изменения статуса объекта жилищного фонда на статус Аннулирован
     * 
     */
    @XmlElement(name = "ObjectAnnuledReason")
    protected NsiRef objectAnnuledReason;

    /**
     * Объект жилого фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtObjectResultType.ObjectGUID }
     *     
     */
    public ExportDebtObjectResultType.ObjectGUID getObjectGUID() {
        return objectGUID;
    }

    /**
     * Sets the value of the objectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtObjectResultType.ObjectGUID }
     *     
     * @see #getObjectGUID()
     */
    public void setObjectGUID(ExportDebtObjectResultType.ObjectGUID value) {
        this.objectGUID = value;
    }

    /**
     * Статус объекта жилищного фонда. Возможные значения:
     * DEMOLISHED - снесен;
     * ANNULED - аннулирован.
     * Если статус объекта жилищного фонда отличен от данных значений, то элемент не заполняется.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStatusType }
     *     
     */
    public ObjectStatusType getObjectStatus() {
        return objectStatus;
    }

    /**
     * Sets the value of the objectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStatusType }
     *     
     * @see #getObjectStatus()
     */
    public void setObjectStatus(ObjectStatusType value) {
        this.objectStatus = value;
    }

    /**
     * Дата изменения статуса объекта жилищного фонда. Заполняется только заполнен элемент tns:ObjectStatus
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjectStatusDate() {
        return objectStatusDate;
    }

    /**
     * Sets the value of the objectStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getObjectStatusDate()
     */
    public void setObjectStatusDate(XMLGregorianCalendar value) {
        this.objectStatusDate = value;
    }

    /**
     * Причина изменения статуса объекта жилищного фонда на статус Снесен
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectDemolishedReason() {
        return objectDemolishedReason;
    }

    /**
     * Sets the value of the objectDemolishedReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getObjectDemolishedReason()
     */
    public void setObjectDemolishedReason(String value) {
        this.objectDemolishedReason = value;
    }

    /**
     * Причина изменения статуса объекта жилищного фонда на статус Аннулирован
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getObjectAnnuledReason() {
        return objectAnnuledReason;
    }

    /**
     * Sets the value of the objectAnnuledReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getObjectAnnuledReason()
     */
    public void setObjectAnnuledReason(NsiRef value) {
        this.objectAnnuledReason = value;
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
     *         <element name="House">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *                   <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
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
    @XmlType(name = "", propOrder = {
        "house",
        "premiseGUID",
        "roomGUID"
    })
    public static class ObjectGUID {

        /**
         * Дом, по которому имеется непогашенная задолженность, подтвержденная судебным актом
         * 
         */
        @XmlElement(name = "House")
        protected ExportDebtObjectResultType.ObjectGUID.House house;
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
         *     {@link ExportDebtObjectResultType.ObjectGUID.House }
         *     
         */
        public ExportDebtObjectResultType.ObjectGUID.House getHouse() {
            return house;
        }

        /**
         * Sets the value of the house property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDebtObjectResultType.ObjectGUID.House }
         *     
         * @see #getHouse()
         */
        public void setHouse(ExportDebtObjectResultType.ObjectGUID.House value) {
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
         *       <sequence>
         *         <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
         *         <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "fiasHouseGUID",
            "houseGUID"
        })
        public static class House {

            /**
             * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "FiasHouseGUID", required = true)
            protected String fiasHouseGUID;
            /**
             * Идентификатор дома в реестре объектов жилищного фонда ГИС ЖКХ
             * 
             */
            @XmlElement(name = "HouseGUID", required = true)
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

}
