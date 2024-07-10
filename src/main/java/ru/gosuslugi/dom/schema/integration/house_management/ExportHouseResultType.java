
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Ответ на экспорт информации о доме.
 * 
 * <p>Java class for exportHouseResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportHouseResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HouseUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <choice>
 *           <element name="ApartmentHouse">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseExportType">
 *                   <sequence>
 *                     <element name="Entrance" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceExportType">
 *                             <sequence>
 *                               <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               <element name="EntranceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ResidentialPremises" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesExportType">
 *                             <sequence>
 *                               <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
 *                                       <sequence>
 *                                         <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                         <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Lift" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftExportType">
 *                             <sequence>
 *                               <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               <element name="LiftGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="NonResidentialPremises" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesExportType">
 *                             <sequence>
 *                               <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                               <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="LivingHouse">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseExportType">
 *                   <sequence>
 *                     <choice>
 *                       <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
 *                               <sequence>
 *                                 <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                 <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                 <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="Block" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockExportType">
 *                               <sequence>
 *                                 <element name="BlockUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                 <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                 <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                 <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
 *                                         <sequence>
 *                                           <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                           <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                           <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </choice>
 *                     <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlType(name = "exportHouseResultType", propOrder = {
    "houseUniqueNumber",
    "modificationDate",
    "apartmentHouse",
    "livingHouse"
})
public class ExportHouseResultType {

    /**
     * Уникальный номер дома
     * 
     */
    @XmlElement(name = "HouseUniqueNumber", required = true)
    protected String houseUniqueNumber;
    /**
     * Дата модификации данных дома
     * 
     */
    @XmlElement(name = "ModificationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    /**
     * Многоквартирный дом
     * 
     */
    @XmlElement(name = "ApartmentHouse")
    protected ExportHouseResultType.ApartmentHouse apartmentHouse;
    /**
     * Жилой дом
     * 
     */
    @XmlElement(name = "LivingHouse")
    protected ExportHouseResultType.LivingHouse livingHouse;

    /**
     * Уникальный номер дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseUniqueNumber() {
        return houseUniqueNumber;
    }

    /**
     * Sets the value of the houseUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseUniqueNumber()
     */
    public void setHouseUniqueNumber(String value) {
        this.houseUniqueNumber = value;
    }

    /**
     * Дата модификации данных дома
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getModificationDate()
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Многоквартирный дом
     * 
     * @return
     *     possible object is
     *     {@link ExportHouseResultType.ApartmentHouse }
     *     
     */
    public ExportHouseResultType.ApartmentHouse getApartmentHouse() {
        return apartmentHouse;
    }

    /**
     * Sets the value of the apartmentHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHouseResultType.ApartmentHouse }
     *     
     * @see #getApartmentHouse()
     */
    public void setApartmentHouse(ExportHouseResultType.ApartmentHouse value) {
        this.apartmentHouse = value;
    }

    /**
     * Жилой дом
     * 
     * @return
     *     possible object is
     *     {@link ExportHouseResultType.LivingHouse }
     *     
     */
    public ExportHouseResultType.LivingHouse getLivingHouse() {
        return livingHouse;
    }

    /**
     * Sets the value of the livingHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHouseResultType.LivingHouse }
     *     
     * @see #getLivingHouse()
     */
    public void setLivingHouse(ExportHouseResultType.LivingHouse value) {
        this.livingHouse = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseExportType">
     *       <sequence>
     *         <element name="Entrance" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceExportType">
     *                 <sequence>
     *                   <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   <element name="EntranceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ResidentialPremises" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesExportType">
     *                 <sequence>
     *                   <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
     *                           <sequence>
     *                             <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                             <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Lift" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftExportType">
     *                 <sequence>
     *                   <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   <element name="LiftGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="NonResidentialPremises" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesExportType">
     *                 <sequence>
     *                   <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
        "entrance",
        "residentialPremises",
        "lift",
        "nonResidentialPremises",
        "houseManagementType"
    })
    public static class ApartmentHouse
        extends ApartmentHouseExportType
    {

        /**
         * Подъезд
         * 
         */
        @XmlElement(name = "Entrance")
        protected List<ExportHouseResultType.ApartmentHouse.Entrance> entrance;
        /**
         * Жилое помещение
         * 
         */
        @XmlElement(name = "ResidentialPremises")
        protected List<ExportHouseResultType.ApartmentHouse.ResidentialPremises> residentialPremises;
        /**
         * Лифты
         * 
         */
        @XmlElement(name = "Lift")
        protected List<ExportHouseResultType.ApartmentHouse.Lift> lift;
        /**
         * Нежилое помещение
         * 
         */
        @XmlElement(name = "NonResidentialPremises")
        protected List<ExportHouseResultType.ApartmentHouse.NonResidentialPremises> nonResidentialPremises;
        /**
         * Cпособ управления домом (НСИ 25).
         * 
         */
        @XmlElement(name = "HouseManagementType")
        protected NsiRef houseManagementType;

        /**
         * Подъезд
         * 
         * Gets the value of the entrance property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entrance property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEntrance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportHouseResultType.ApartmentHouse.Entrance }
         * </p>
         * 
         * 
         * @return
         *     The value of the entrance property.
         */
        public List<ExportHouseResultType.ApartmentHouse.Entrance> getEntrance() {
            if (entrance == null) {
                entrance = new ArrayList<>();
            }
            return this.entrance;
        }

        /**
         * Жилое помещение
         * 
         * Gets the value of the residentialPremises property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the residentialPremises property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getResidentialPremises().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportHouseResultType.ApartmentHouse.ResidentialPremises }
         * </p>
         * 
         * 
         * @return
         *     The value of the residentialPremises property.
         */
        public List<ExportHouseResultType.ApartmentHouse.ResidentialPremises> getResidentialPremises() {
            if (residentialPremises == null) {
                residentialPremises = new ArrayList<>();
            }
            return this.residentialPremises;
        }

        /**
         * Лифты
         * 
         * Gets the value of the lift property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lift property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLift().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportHouseResultType.ApartmentHouse.Lift }
         * </p>
         * 
         * 
         * @return
         *     The value of the lift property.
         */
        public List<ExportHouseResultType.ApartmentHouse.Lift> getLift() {
            if (lift == null) {
                lift = new ArrayList<>();
            }
            return this.lift;
        }

        /**
         * Нежилое помещение
         * 
         * Gets the value of the nonResidentialPremises property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nonResidentialPremises property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNonResidentialPremises().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportHouseResultType.ApartmentHouse.NonResidentialPremises }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremises property.
         */
        public List<ExportHouseResultType.ApartmentHouse.NonResidentialPremises> getNonResidentialPremises() {
            if (nonResidentialPremises == null) {
                nonResidentialPremises = new ArrayList<>();
            }
            return this.nonResidentialPremises;
        }

        /**
         * Cпособ управления домом (НСИ 25).
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getHouseManagementType() {
            return houseManagementType;
        }

        /**
         * Sets the value of the houseManagementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getHouseManagementType()
         */
        public void setHouseManagementType(NsiRef value) {
            this.houseManagementType = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceExportType">
         *       <sequence>
         *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         <element name="EntranceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "modificationDate",
            "entranceGUID"
        })
        public static class Entrance
            extends EntranceExportType
        {

            /**
             * Дата модификации данных подъезда
             * 
             */
            @XmlElement(name = "ModificationDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modificationDate;
            /**
             * Идентификатор подъезда
             * 
             */
            @XmlElement(name = "EntranceGUID", required = true)
            protected String entranceGUID;

            /**
             * Дата модификации данных подъезда
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Sets the value of the modificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getModificationDate()
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
            }

            /**
             * Идентификатор подъезда
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntranceGUID() {
                return entranceGUID;
            }

            /**
             * Sets the value of the entranceGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getEntranceGUID()
             */
            public void setEntranceGUID(String value) {
                this.entranceGUID = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftExportType">
         *       <sequence>
         *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         <element name="LiftGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "modificationDate",
            "liftGUID"
        })
        public static class Lift
            extends LiftExportType
        {

            /**
             * Дата модификации данных лифта
             * 
             */
            @XmlElement(name = "ModificationDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modificationDate;
            /**
             * Идентификатор лифта
             * 
             */
            @XmlElement(name = "LiftGUID", required = true)
            protected String liftGUID;

            /**
             * Дата модификации данных лифта
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Sets the value of the modificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getModificationDate()
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
            }

            /**
             * Идентификатор лифта
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLiftGUID() {
                return liftGUID;
            }

            /**
             * Sets the value of the liftGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getLiftGUID()
             */
            public void setLiftGUID(String value) {
                this.liftGUID = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesExportType">
         *       <sequence>
         *         <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "premisesUniqueNumber",
            "modificationDate",
            "premisesGUID"
        })
        public static class NonResidentialPremises
            extends NonResidentialPremisesExportType
        {

            /**
             * Уникальный номер помещения
             * 
             */
            @XmlElement(name = "PremisesUniqueNumber", required = true)
            protected String premisesUniqueNumber;
            /**
             * Дата модификации данных помещения
             * 
             */
            @XmlElement(name = "ModificationDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modificationDate;
            /**
             * Идентификатор помещения
             * 
             */
            @XmlElement(name = "PremisesGUID", required = true)
            protected String premisesGUID;

            /**
             * Уникальный номер помещения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremisesUniqueNumber() {
                return premisesUniqueNumber;
            }

            /**
             * Sets the value of the premisesUniqueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPremisesUniqueNumber()
             */
            public void setPremisesUniqueNumber(String value) {
                this.premisesUniqueNumber = value;
            }

            /**
             * Дата модификации данных помещения
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Sets the value of the modificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getModificationDate()
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
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

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesExportType">
         *       <sequence>
         *         <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
         *                 <sequence>
         *                   <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "premisesUniqueNumber",
            "modificationDate",
            "livingRoom",
            "premisesGUID"
        })
        public static class ResidentialPremises
            extends ResidentialPremisesExportType
        {

            /**
             * Уникальный номер помещения
             * 
             */
            @XmlElement(name = "PremisesUniqueNumber", required = true)
            protected String premisesUniqueNumber;
            /**
             * Дата модификации данных помещения
             * 
             */
            @XmlElement(name = "ModificationDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modificationDate;
            /**
             * Комната в квартире коммунального заселения
             * 
             */
            @XmlElement(name = "LivingRoom")
            protected List<ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom> livingRoom;
            /**
             * Идентификатор помещения
             * 
             */
            @XmlElement(name = "PremisesGUID", required = true)
            protected String premisesGUID;

            /**
             * Уникальный номер помещения
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremisesUniqueNumber() {
                return premisesUniqueNumber;
            }

            /**
             * Sets the value of the premisesUniqueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getPremisesUniqueNumber()
             */
            public void setPremisesUniqueNumber(String value) {
                this.premisesUniqueNumber = value;
            }

            /**
             * Дата модификации данных помещения
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Sets the value of the modificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getModificationDate()
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
            }

            /**
             * Комната в квартире коммунального заселения
             * 
             * Gets the value of the livingRoom property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the livingRoom property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLivingRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoom property.
             */
            public List<ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom> getLivingRoom() {
                if (livingRoom == null) {
                    livingRoom = new ArrayList<>();
                }
                return this.livingRoom;
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
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
             *       <sequence>
             *         <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "livingRoomUniqueNumber",
                "modificationDate",
                "livingRoomGUID"
            })
            public static class LivingRoom
                extends RoomExportType
            {

                /**
                 * Уникальный номер комнаты
                 * 
                 */
                @XmlElement(name = "LivingRoomUniqueNumber", required = true)
                protected String livingRoomUniqueNumber;
                /**
                 * Дата модификации данных комнаты
                 * 
                 */
                @XmlElement(name = "ModificationDate", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar modificationDate;
                /**
                 * Идентификатор комнаты
                 * 
                 */
                @XmlElement(name = "LivingRoomGUID", required = true)
                protected String livingRoomGUID;

                /**
                 * Уникальный номер комнаты
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLivingRoomUniqueNumber() {
                    return livingRoomUniqueNumber;
                }

                /**
                 * Sets the value of the livingRoomUniqueNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getLivingRoomUniqueNumber()
                 */
                public void setLivingRoomUniqueNumber(String value) {
                    this.livingRoomUniqueNumber = value;
                }

                /**
                 * Дата модификации данных комнаты
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getModificationDate() {
                    return modificationDate;
                }

                /**
                 * Sets the value of the modificationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getModificationDate()
                 */
                public void setModificationDate(XMLGregorianCalendar value) {
                    this.modificationDate = value;
                }

                /**
                 * Идентификатор комнаты
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLivingRoomGUID() {
                    return livingRoomGUID;
                }

                /**
                 * Sets the value of the livingRoomGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getLivingRoomGUID()
                 */
                public void setLivingRoomGUID(String value) {
                    this.livingRoomGUID = value;
                }

            }

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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseExportType">
     *       <sequence>
     *         <choice>
     *           <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
     *                   <sequence>
     *                     <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                     <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Block" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockExportType">
     *                   <sequence>
     *                     <element name="BlockUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                     <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
     *                             <sequence>
     *                               <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                               <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                               <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <element name="HouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "livingRoom",
        "block",
        "houseGUID"
    })
    public static class LivingHouse
        extends LivingHouseExportType
    {

        /**
         * Комнаты (для обычного жилого дома)
         * 
         */
        @XmlElement(name = "LivingRoom")
        protected List<ExportHouseResultType.LivingHouse.LivingRoom> livingRoom;
        /**
         * Блоки (для жилого дома блокированной застройки)
         * 
         */
        @XmlElement(name = "Block")
        protected List<ExportHouseResultType.LivingHouse.Block> block;
        /**
         * Актуальная версия сведений о доме
         * 
         */
        @XmlElement(name = "HouseGUID", required = true)
        protected String houseGUID;

        /**
         * Комнаты (для обычного жилого дома)
         * 
         * Gets the value of the livingRoom property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the livingRoom property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLivingRoom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportHouseResultType.LivingHouse.LivingRoom }
         * </p>
         * 
         * 
         * @return
         *     The value of the livingRoom property.
         */
        public List<ExportHouseResultType.LivingHouse.LivingRoom> getLivingRoom() {
            if (livingRoom == null) {
                livingRoom = new ArrayList<>();
            }
            return this.livingRoom;
        }

        /**
         * Блоки (для жилого дома блокированной застройки)
         * 
         * Gets the value of the block property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the block property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportHouseResultType.LivingHouse.Block }
         * </p>
         * 
         * 
         * @return
         *     The value of the block property.
         */
        public List<ExportHouseResultType.LivingHouse.Block> getBlock() {
            if (block == null) {
                block = new ArrayList<>();
            }
            return this.block;
        }

        /**
         * Актуальная версия сведений о доме
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
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockExportType">
         *       <sequence>
         *         <element name="BlockUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="LivingRoom" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
         *                 <sequence>
         *                   <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *                   <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "blockUniqueNumber",
            "modificationDate",
            "blockGUID",
            "livingRoom"
        })
        public static class Block
            extends BlockExportType
        {

            /**
             * Уникальный номер блока
             * 
             */
            @XmlElement(name = "BlockUniqueNumber", required = true)
            protected String blockUniqueNumber;
            /**
             * Дата модификации данных блока
             * 
             */
            @XmlElement(name = "ModificationDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modificationDate;
            /**
             * Идентификатор блока жилого дома
             * 
             */
            @XmlElement(name = "BlockGUID", required = true)
            protected String blockGUID;
            /**
             * Комната в блоке
             * 
             */
            @XmlElement(name = "LivingRoom")
            protected List<ExportHouseResultType.LivingHouse.Block.LivingRoom> livingRoom;

            /**
             * Уникальный номер блока
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBlockUniqueNumber() {
                return blockUniqueNumber;
            }

            /**
             * Sets the value of the blockUniqueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getBlockUniqueNumber()
             */
            public void setBlockUniqueNumber(String value) {
                this.blockUniqueNumber = value;
            }

            /**
             * Дата модификации данных блока
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Sets the value of the modificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getModificationDate()
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
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
             * Комната в блоке
             * 
             * Gets the value of the livingRoom property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the livingRoom property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLivingRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportHouseResultType.LivingHouse.Block.LivingRoom }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoom property.
             */
            public List<ExportHouseResultType.LivingHouse.Block.LivingRoom> getLivingRoom() {
                if (livingRoom == null) {
                    livingRoom = new ArrayList<>();
                }
                return this.livingRoom;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
             *       <sequence>
             *         <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
             *         <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "livingRoomUniqueNumber",
                "modificationDate",
                "livingRoomGUID"
            })
            public static class LivingRoom
                extends RoomExportType
            {

                /**
                 * Уникальный номер комнаты
                 * 
                 */
                @XmlElement(name = "LivingRoomUniqueNumber", required = true)
                protected String livingRoomUniqueNumber;
                /**
                 * Дата модификации данных комнаты
                 * 
                 */
                @XmlElement(name = "ModificationDate", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar modificationDate;
                /**
                 * Идентификатор комнаты
                 * 
                 */
                @XmlElement(name = "LivingRoomGUID", required = true)
                protected String livingRoomGUID;

                /**
                 * Уникальный номер комнаты
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLivingRoomUniqueNumber() {
                    return livingRoomUniqueNumber;
                }

                /**
                 * Sets the value of the livingRoomUniqueNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getLivingRoomUniqueNumber()
                 */
                public void setLivingRoomUniqueNumber(String value) {
                    this.livingRoomUniqueNumber = value;
                }

                /**
                 * Дата модификации данных комнаты
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getModificationDate() {
                    return modificationDate;
                }

                /**
                 * Sets the value of the modificationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getModificationDate()
                 */
                public void setModificationDate(XMLGregorianCalendar value) {
                    this.modificationDate = value;
                }

                /**
                 * Идентификатор комнаты
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLivingRoomGUID() {
                    return livingRoomGUID;
                }

                /**
                 * Sets the value of the livingRoomGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getLivingRoomGUID()
                 */
                public void setLivingRoomGUID(String value) {
                    this.livingRoomGUID = value;
                }

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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomExportType">
         *       <sequence>
         *         <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "livingRoomUniqueNumber",
            "modificationDate",
            "livingRoomGUID"
        })
        public static class LivingRoom
            extends RoomExportType
        {

            /**
             * Уникальный номер комнаты
             * 
             */
            @XmlElement(name = "LivingRoomUniqueNumber", required = true)
            protected String livingRoomUniqueNumber;
            /**
             * Дата модификации данных комнаты
             * 
             */
            @XmlElement(name = "ModificationDate", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar modificationDate;
            /**
             * Идентификатор комнаты
             * 
             */
            @XmlElement(name = "LivingRoomGUID", required = true)
            protected String livingRoomGUID;

            /**
             * Уникальный номер комнаты
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLivingRoomUniqueNumber() {
                return livingRoomUniqueNumber;
            }

            /**
             * Sets the value of the livingRoomUniqueNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getLivingRoomUniqueNumber()
             */
            public void setLivingRoomUniqueNumber(String value) {
                this.livingRoomUniqueNumber = value;
            }

            /**
             * Дата модификации данных комнаты
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Sets the value of the modificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getModificationDate()
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
            }

            /**
             * Идентификатор комнаты
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLivingRoomGUID() {
                return livingRoomGUID;
            }

            /**
             * Sets the value of the livingRoomGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getLivingRoomGUID()
             */
            public void setLivingRoomGUID(String value) {
                this.livingRoomGUID = value;
            }

        }

    }

}
