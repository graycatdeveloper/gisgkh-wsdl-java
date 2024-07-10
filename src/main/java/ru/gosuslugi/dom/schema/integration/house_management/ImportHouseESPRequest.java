
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="ApartmentHouse">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="ApartmentHouseToCreate">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseESPType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="ApartmentHouseToUpdate">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateESPType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                   <sequence>
 *                     <element name="NonResidentialPremiseToCreate" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesESPType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="NonResidentialPremiseToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateESPType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                   <sequence>
 *                     <sequence>
 *                       <element name="EntranceToCreate" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceESPType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="EntranceToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateESPType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 <element name="EntranceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                     <element name="ResidentialPremises" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <choice>
 *                                 <element name="ResidentialPremisesToCreate">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesESPType">
 *                                         <sequence>
 *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="ResidentialPremisesToUpdate">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateESPType">
 *                                         <sequence>
 *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                           <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </choice>
 *                               <sequence>
 *                                 <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomESPType">
 *                                         <sequence>
 *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateESPType">
 *                                         <sequence>
 *                                           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                           <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                         </sequence>
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <sequence>
 *                       <element name="LiftToCreate" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftESPType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="LiftToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateESPType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 <element name="LiftGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                   </sequence>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}InheritMissingValues" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apartmentHouse",
    "inheritMissingValues"
})
@XmlRootElement(name = "importHouseESPRequest")
public class ImportHouseESPRequest
    extends BaseType
{

    /**
     * Многоквартирный дом
     * 
     */
    @XmlElement(name = "ApartmentHouse", required = true)
    protected ImportHouseESPRequest.ApartmentHouse apartmentHouse;
    /**
     * Если флаг указан для запроса с обновлением данных, то отсутствующие в дельте значения будут подгружены из предыдущей версии сущности. В противном случае отсутствующие значения будут сброшены в NULL.
     * 
     */
    @XmlElement(name = "InheritMissingValues")
    protected Boolean inheritMissingValues;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Многоквартирный дом
     * 
     * @return
     *     possible object is
     *     {@link ImportHouseESPRequest.ApartmentHouse }
     *     
     */
    public ImportHouseESPRequest.ApartmentHouse getApartmentHouse() {
        return apartmentHouse;
    }

    /**
     * Sets the value of the apartmentHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHouseESPRequest.ApartmentHouse }
     *     
     * @see #getApartmentHouse()
     */
    public void setApartmentHouse(ImportHouseESPRequest.ApartmentHouse value) {
        this.apartmentHouse = value;
    }

    /**
     * Если флаг указан для запроса с обновлением данных, то отсутствующие в дельте значения будут подгружены из предыдущей версии сущности. В противном случае отсутствующие значения будут сброшены в NULL.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInheritMissingValues() {
        return inheritMissingValues;
    }

    /**
     * Sets the value of the inheritMissingValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInheritMissingValues()
     */
    public void setInheritMissingValues(Boolean value) {
        this.inheritMissingValues = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <choice>
     *           <element name="ApartmentHouseToCreate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseESPType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="ApartmentHouseToUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateESPType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <sequence>
     *           <element name="NonResidentialPremiseToCreate" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesESPType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="NonResidentialPremiseToUpdate" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateESPType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </sequence>
     *         <sequence>
     *           <sequence>
     *             <element name="EntranceToCreate" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceESPType">
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     </sequence>
     *                   </extension>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *             <element name="EntranceToUpdate" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateESPType">
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                       <element name="EntranceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     </sequence>
     *                   </extension>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *           </sequence>
     *           <element name="ResidentialPremises" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <choice>
     *                       <element name="ResidentialPremisesToCreate">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesESPType">
     *                               <sequence>
     *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                               </sequence>
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="ResidentialPremisesToUpdate">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateESPType">
     *                               <sequence>
     *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                                 <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               </sequence>
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                     </choice>
     *                     <sequence>
     *                       <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomESPType">
     *                               <sequence>
     *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                               </sequence>
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateESPType">
     *                               <sequence>
     *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                                 <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                               </sequence>
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                     </sequence>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <sequence>
     *             <element name="LiftToCreate" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftESPType">
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     </sequence>
     *                   </extension>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *             <element name="LiftToUpdate" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateESPType">
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                       <element name="LiftGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     </sequence>
     *                   </extension>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *           </sequence>
     *         </sequence>
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
        "apartmentHouseToCreate",
        "apartmentHouseToUpdate",
        "nonResidentialPremiseToCreate",
        "nonResidentialPremiseToUpdate",
        "entranceToCreate",
        "entranceToUpdate",
        "residentialPremises",
        "liftToCreate",
        "liftToUpdate"
    })
    public static class ApartmentHouse {

        /**
         * Добавление многоквартирного дома
         * 
         */
        @XmlElement(name = "ApartmentHouseToCreate")
        protected ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate apartmentHouseToCreate;
        /**
         * Изменение данных многоквартирного дома
         * 
         */
        @XmlElement(name = "ApartmentHouseToUpdate")
        protected ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate apartmentHouseToUpdate;
        /**
         * Добавление нежилого помещения
         * 
         */
        @XmlElement(name = "NonResidentialPremiseToCreate")
        protected List<ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate> nonResidentialPremiseToCreate;
        /**
         * Изменение данных нежилого помещения
         * 
         */
        @XmlElement(name = "NonResidentialPremiseToUpdate")
        protected List<ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate> nonResidentialPremiseToUpdate;
        /**
         * Добавление нового подъезда
         * 
         */
        @XmlElement(name = "EntranceToCreate")
        protected List<ImportHouseESPRequest.ApartmentHouse.EntranceToCreate> entranceToCreate;
        /**
         * Изменение подъезда
         * 
         */
        @XmlElement(name = "EntranceToUpdate")
        protected List<ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate> entranceToUpdate;
        /**
         * Жилое помещение
         * 
         */
        @XmlElement(name = "ResidentialPremises")
        protected List<ImportHouseESPRequest.ApartmentHouse.ResidentialPremises> residentialPremises;
        /**
         * Добавление нового лифта
         * 
         */
        @XmlElement(name = "LiftToCreate")
        protected List<ImportHouseESPRequest.ApartmentHouse.LiftToCreate> liftToCreate;
        /**
         * Изменение лифта
         * 
         */
        @XmlElement(name = "LiftToUpdate")
        protected List<ImportHouseESPRequest.ApartmentHouse.LiftToUpdate> liftToUpdate;

        /**
         * Добавление многоквартирного дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate }
         *     
         */
        public ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate getApartmentHouseToCreate() {
            return apartmentHouseToCreate;
        }

        /**
         * Sets the value of the apartmentHouseToCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate }
         *     
         * @see #getApartmentHouseToCreate()
         */
        public void setApartmentHouseToCreate(ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToCreate value) {
            this.apartmentHouseToCreate = value;
        }

        /**
         * Изменение данных многоквартирного дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate }
         *     
         */
        public ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate getApartmentHouseToUpdate() {
            return apartmentHouseToUpdate;
        }

        /**
         * Sets the value of the apartmentHouseToUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate }
         *     
         * @see #getApartmentHouseToUpdate()
         */
        public void setApartmentHouseToUpdate(ImportHouseESPRequest.ApartmentHouse.ApartmentHouseToUpdate value) {
            this.apartmentHouseToUpdate = value;
        }

        /**
         * Добавление нежилого помещения
         * 
         * Gets the value of the nonResidentialPremiseToCreate property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nonResidentialPremiseToCreate property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNonResidentialPremiseToCreate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremiseToCreate property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToCreate> getNonResidentialPremiseToCreate() {
            if (nonResidentialPremiseToCreate == null) {
                nonResidentialPremiseToCreate = new ArrayList<>();
            }
            return this.nonResidentialPremiseToCreate;
        }

        /**
         * Изменение данных нежилого помещения
         * 
         * Gets the value of the nonResidentialPremiseToUpdate property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nonResidentialPremiseToUpdate property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNonResidentialPremiseToUpdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremiseToUpdate property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.NonResidentialPremiseToUpdate> getNonResidentialPremiseToUpdate() {
            if (nonResidentialPremiseToUpdate == null) {
                nonResidentialPremiseToUpdate = new ArrayList<>();
            }
            return this.nonResidentialPremiseToUpdate;
        }

        /**
         * Добавление нового подъезда
         * 
         * Gets the value of the entranceToCreate property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entranceToCreate property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEntranceToCreate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseESPRequest.ApartmentHouse.EntranceToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the entranceToCreate property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.EntranceToCreate> getEntranceToCreate() {
            if (entranceToCreate == null) {
                entranceToCreate = new ArrayList<>();
            }
            return this.entranceToCreate;
        }

        /**
         * Изменение подъезда
         * 
         * Gets the value of the entranceToUpdate property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entranceToUpdate property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEntranceToUpdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the entranceToUpdate property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.EntranceToUpdate> getEntranceToUpdate() {
            if (entranceToUpdate == null) {
                entranceToUpdate = new ArrayList<>();
            }
            return this.entranceToUpdate;
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
         * {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises }
         * </p>
         * 
         * 
         * @return
         *     The value of the residentialPremises property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.ResidentialPremises> getResidentialPremises() {
            if (residentialPremises == null) {
                residentialPremises = new ArrayList<>();
            }
            return this.residentialPremises;
        }

        /**
         * Добавление нового лифта
         * 
         * Gets the value of the liftToCreate property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the liftToCreate property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLiftToCreate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseESPRequest.ApartmentHouse.LiftToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the liftToCreate property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.LiftToCreate> getLiftToCreate() {
            if (liftToCreate == null) {
                liftToCreate = new ArrayList<>();
            }
            return this.liftToCreate;
        }

        /**
         * Изменение лифта
         * 
         * Gets the value of the liftToUpdate property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the liftToUpdate property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getLiftToUpdate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseESPRequest.ApartmentHouse.LiftToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the liftToUpdate property.
         */
        public List<ImportHouseESPRequest.ApartmentHouse.LiftToUpdate> getLiftToUpdate() {
            if (liftToUpdate == null) {
                liftToUpdate = new ArrayList<>();
            }
            return this.liftToUpdate;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseESPType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "transportGUID",
            "houseManagementType"
        })
        public static class ApartmentHouseToCreate
            extends ApartmentHouseESPType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
             * - Не выбран
             * - Непосредственное управление.
             * 
             */
            @XmlElement(name = "HouseManagementType")
            protected NsiRef houseManagementType;

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

            /**
             * Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
             * - Не выбран
             * - Непосредственное управление.
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

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateESPType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "transportGUID",
            "houseManagementType"
        })
        public static class ApartmentHouseToUpdate
            extends ApartmentHouseUpdateESPType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
             * - Не выбран
             * - Непосредственное управление.
             * 
             */
            @XmlElement(name = "HouseManagementType")
            protected NsiRef houseManagementType;

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

            /**
             * Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
             * - Не выбран
             * - Непосредственное управление.
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

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceESPType">
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
        public static class EntranceToCreate
            extends EntranceESPType
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


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateESPType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "transportGUID",
            "entranceGUID"
        })
        public static class EntranceToUpdate
            extends EntranceUpdateESPType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор подъезда
             * 
             */
            @XmlElement(name = "EntranceGUID", required = true)
            protected String entranceGUID;

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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftESPType">
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
        public static class LiftToCreate
            extends LiftESPType
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


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateESPType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "transportGUID",
            "liftGUID"
        })
        public static class LiftToUpdate
            extends LiftUpdateESPType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор лифта
             * 
             */
            @XmlElement(name = "LiftGUID", required = true)
            protected String liftGUID;

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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesESPType">
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
        public static class NonResidentialPremiseToCreate
            extends NonResidentialPremisesESPType
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


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateESPType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
            "transportGUID",
            "premisesGUID"
        })
        public static class NonResidentialPremiseToUpdate
            extends NonResidentialPremisesUpdateESPType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор помещения
             * 
             */
            @XmlElement(name = "PremisesGUID", required = true)
            protected String premisesGUID;

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
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <choice>
         *           <element name="ResidentialPremisesToCreate">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesESPType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="ResidentialPremisesToUpdate">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateESPType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                     <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *         </choice>
         *         <sequence>
         *           <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomESPType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateESPType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                     <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *         </sequence>
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
            "residentialPremisesToCreate",
            "residentialPremisesToUpdate",
            "livingRoomToCreate",
            "livingRoomToUpdate"
        })
        public static class ResidentialPremises {

            /**
             * Добавление жилого помещения
             * 
             */
            @XmlElement(name = "ResidentialPremisesToCreate")
            protected ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate residentialPremisesToCreate;
            /**
             * Изменение данных жилого помещения
             * 
             */
            @XmlElement(name = "ResidentialPremisesToUpdate")
            protected ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate residentialPremisesToUpdate;
            /**
             * Добавление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToCreate")
            protected List<ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate> livingRoomToCreate;
            /**
             * Изменение комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToUpdate")
            protected List<ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate> livingRoomToUpdate;

            /**
             * Добавление жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
             *     
             */
            public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate getResidentialPremisesToCreate() {
                return residentialPremisesToCreate;
            }

            /**
             * Sets the value of the residentialPremisesToCreate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
             *     
             * @see #getResidentialPremisesToCreate()
             */
            public void setResidentialPremisesToCreate(ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate value) {
                this.residentialPremisesToCreate = value;
            }

            /**
             * Изменение данных жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
             *     
             */
            public ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate getResidentialPremisesToUpdate() {
                return residentialPremisesToUpdate;
            }

            /**
             * Sets the value of the residentialPremisesToUpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
             *     
             * @see #getResidentialPremisesToUpdate()
             */
            public void setResidentialPremisesToUpdate(ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate value) {
                this.residentialPremisesToUpdate = value;
            }

            /**
             * Добавление комнаты
             * 
             * Gets the value of the livingRoomToCreate property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the livingRoomToCreate property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLivingRoomToCreate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToCreate property.
             */
            public List<ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate> getLivingRoomToCreate() {
                if (livingRoomToCreate == null) {
                    livingRoomToCreate = new ArrayList<>();
                }
                return this.livingRoomToCreate;
            }

            /**
             * Изменение комнаты
             * 
             * Gets the value of the livingRoomToUpdate property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the livingRoomToUpdate property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getLivingRoomToUpdate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToUpdate property.
             */
            public List<ImportHouseESPRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate> getLivingRoomToUpdate() {
                if (livingRoomToUpdate == null) {
                    livingRoomToUpdate = new ArrayList<>();
                }
                return this.livingRoomToUpdate;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomESPType">
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
            public static class LivingRoomToCreate
                extends RoomESPType
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


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateESPType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "transportGUID",
                "livingRoomGUID"
            })
            public static class LivingRoomToUpdate
                extends RoomUpdateESPType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;
                /**
                 * Идентификатор комнаты
                 * 
                 */
                @XmlElement(name = "LivingRoomGUID", required = true)
                protected String livingRoomGUID;

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


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesESPType">
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
            public static class ResidentialPremisesToCreate
                extends ResidentialPremisesESPType
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


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateESPType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "transportGUID",
                "premisesGUID"
            })
            public static class ResidentialPremisesToUpdate
                extends ResidentialPremisesUpdateESPType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;
                /**
                 * Идентификатор помещения
                 * 
                 */
                @XmlElement(name = "PremisesGUID", required = true)
                protected String premisesGUID;

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

        }

    }

}
