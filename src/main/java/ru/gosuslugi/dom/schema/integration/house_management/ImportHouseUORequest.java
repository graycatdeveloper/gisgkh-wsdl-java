
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
 *         <choice>
 *           <element name="ApartmentHouse">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <choice>
 *                       <element name="ApartmentHouseToCreate">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUOType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="ApartmentHouseToUpdate">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateUOType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </choice>
 *                     <sequence>
 *                       <element name="NonResidentialPremiseToCreate" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUOType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="NonResidentialPremiseToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateUOType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                     <sequence>
 *                       <sequence>
 *                         <element name="EntranceToCreate" maxOccurs="unbounded" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUOType">
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 </sequence>
 *                               </extension>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                         <element name="EntranceToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateUOType">
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                   <element name="EntranceGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                 </sequence>
 *                               </extension>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                       </sequence>
 *                       <element name="ResidentialPremises" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <choice>
 *                                   <element name="ResidentialPremisesToCreate">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                   <element name="ResidentialPremisesToUpdate">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                             <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                 </choice>
 *                                 <sequence>
 *                                   <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                   <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                             <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                 </sequence>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <sequence>
 *                         <element name="LiftToCreate" maxOccurs="unbounded" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUOType">
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 </sequence>
 *                               </extension>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                         <element name="LiftToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateUOType">
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                   <element name="LiftGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                 </sequence>
 *                               </extension>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                       </sequence>
 *                     </sequence>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="LivingHouse">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <choice>
 *                       <element name="LivingHouseToCreate">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUOType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="LivingHouseToUpdate">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUpdateUOType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </choice>
 *                     <choice>
 *                       <sequence>
 *                         <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 </sequence>
 *                               </extension>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                         <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                           <complexType>
 *                             <complexContent>
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
 *                                 <sequence>
 *                                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                   <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                 </sequence>
 *                               </extension>
 *                             </complexContent>
 *                           </complexType>
 *                         </element>
 *                       </sequence>
 *                       <element name="Blocks" maxOccurs="unbounded" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <choice>
 *                                   <element name="BlockToCreate">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                   <element name="BlockToUpdate">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                             <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                 </choice>
 *                                 <sequence>
 *                                   <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                   <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
 *                                     <complexType>
 *                                       <complexContent>
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
 *                                           <sequence>
 *                                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                             <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                           </sequence>
 *                                         </extension>
 *                                       </complexContent>
 *                                     </complexType>
 *                                   </element>
 *                                 </sequence>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </choice>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
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
    "livingHouse",
    "inheritMissingValues"
})
@XmlRootElement(name = "importHouseUORequest")
public class ImportHouseUORequest
    extends BaseType
{

    /**
     * Многоквартирный дом
     * 
     */
    @XmlElement(name = "ApartmentHouse")
    protected ImportHouseUORequest.ApartmentHouse apartmentHouse;
    /**
     * Жилой дом
     * 
     */
    @XmlElement(name = "LivingHouse")
    protected ImportHouseUORequest.LivingHouse livingHouse;
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
     *     {@link ImportHouseUORequest.ApartmentHouse }
     *     
     */
    public ImportHouseUORequest.ApartmentHouse getApartmentHouse() {
        return apartmentHouse;
    }

    /**
     * Sets the value of the apartmentHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHouseUORequest.ApartmentHouse }
     *     
     * @see #getApartmentHouse()
     */
    public void setApartmentHouse(ImportHouseUORequest.ApartmentHouse value) {
        this.apartmentHouse = value;
    }

    /**
     * Жилой дом
     * 
     * @return
     *     possible object is
     *     {@link ImportHouseUORequest.LivingHouse }
     *     
     */
    public ImportHouseUORequest.LivingHouse getLivingHouse() {
        return livingHouse;
    }

    /**
     * Sets the value of the livingHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHouseUORequest.LivingHouse }
     *     
     * @see #getLivingHouse()
     */
    public void setLivingHouse(ImportHouseUORequest.LivingHouse value) {
        this.livingHouse = value;
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUOType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="ApartmentHouseToUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateUOType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUOType">
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateUOType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUOType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateUOType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUOType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateUOType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUOType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateUOType">
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
        protected ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate apartmentHouseToCreate;
        /**
         * Изменение данных многоквартирного дома
         * 
         */
        @XmlElement(name = "ApartmentHouseToUpdate")
        protected ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate apartmentHouseToUpdate;
        /**
         * Добавление нежилого помещения
         * 
         */
        @XmlElement(name = "NonResidentialPremiseToCreate")
        protected List<ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate> nonResidentialPremiseToCreate;
        /**
         * Изменение данных нежилого помещения
         * 
         */
        @XmlElement(name = "NonResidentialPremiseToUpdate")
        protected List<ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate> nonResidentialPremiseToUpdate;
        /**
         * Добавление нового подъезда
         * 
         */
        @XmlElement(name = "EntranceToCreate")
        protected List<ImportHouseUORequest.ApartmentHouse.EntranceToCreate> entranceToCreate;
        /**
         * Изменение подъезда
         * 
         */
        @XmlElement(name = "EntranceToUpdate")
        protected List<ImportHouseUORequest.ApartmentHouse.EntranceToUpdate> entranceToUpdate;
        /**
         * Жилое помещение
         * 
         */
        @XmlElement(name = "ResidentialPremises")
        protected List<ImportHouseUORequest.ApartmentHouse.ResidentialPremises> residentialPremises;
        /**
         * Добавление нового лифта
         * 
         */
        @XmlElement(name = "LiftToCreate")
        protected List<ImportHouseUORequest.ApartmentHouse.LiftToCreate> liftToCreate;
        /**
         * Изменение лифта
         * 
         */
        @XmlElement(name = "LiftToUpdate")
        protected List<ImportHouseUORequest.ApartmentHouse.LiftToUpdate> liftToUpdate;

        /**
         * Добавление многоквартирного дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate }
         *     
         */
        public ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate getApartmentHouseToCreate() {
            return apartmentHouseToCreate;
        }

        /**
         * Sets the value of the apartmentHouseToCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate }
         *     
         * @see #getApartmentHouseToCreate()
         */
        public void setApartmentHouseToCreate(ImportHouseUORequest.ApartmentHouse.ApartmentHouseToCreate value) {
            this.apartmentHouseToCreate = value;
        }

        /**
         * Изменение данных многоквартирного дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate }
         *     
         */
        public ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate getApartmentHouseToUpdate() {
            return apartmentHouseToUpdate;
        }

        /**
         * Sets the value of the apartmentHouseToUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate }
         *     
         * @see #getApartmentHouseToUpdate()
         */
        public void setApartmentHouseToUpdate(ImportHouseUORequest.ApartmentHouse.ApartmentHouseToUpdate value) {
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
         * {@link ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremiseToCreate property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToCreate> getNonResidentialPremiseToCreate() {
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
         * {@link ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremiseToUpdate property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.NonResidentialPremiseToUpdate> getNonResidentialPremiseToUpdate() {
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
         * {@link ImportHouseUORequest.ApartmentHouse.EntranceToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the entranceToCreate property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.EntranceToCreate> getEntranceToCreate() {
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
         * {@link ImportHouseUORequest.ApartmentHouse.EntranceToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the entranceToUpdate property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.EntranceToUpdate> getEntranceToUpdate() {
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
         * {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises }
         * </p>
         * 
         * 
         * @return
         *     The value of the residentialPremises property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.ResidentialPremises> getResidentialPremises() {
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
         * {@link ImportHouseUORequest.ApartmentHouse.LiftToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the liftToCreate property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.LiftToCreate> getLiftToCreate() {
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
         * {@link ImportHouseUORequest.ApartmentHouse.LiftToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the liftToUpdate property.
         */
        public List<ImportHouseUORequest.ApartmentHouse.LiftToUpdate> getLiftToUpdate() {
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUOType">
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
        public static class ApartmentHouseToCreate
            extends ApartmentHouseUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateUOType">
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
        public static class ApartmentHouseToUpdate
            extends ApartmentHouseUpdateUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUOType">
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
            extends EntranceUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateUOType">
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
            extends EntranceUpdateUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUOType">
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
            extends LiftUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateUOType">
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
            extends LiftUpdateUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUOType">
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
            extends NonResidentialPremisesUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateUOType">
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
            extends NonResidentialPremisesUpdateUOType
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUOType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateUOType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
            protected ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate residentialPremisesToCreate;
            /**
             * Изменение данных жилого помещения
             * 
             */
            @XmlElement(name = "ResidentialPremisesToUpdate")
            protected ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate residentialPremisesToUpdate;
            /**
             * Добавление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToCreate")
            protected List<ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate> livingRoomToCreate;
            /**
             * Изменение комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToUpdate")
            protected List<ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate> livingRoomToUpdate;

            /**
             * Добавление жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
             *     
             */
            public ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate getResidentialPremisesToCreate() {
                return residentialPremisesToCreate;
            }

            /**
             * Sets the value of the residentialPremisesToCreate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
             *     
             * @see #getResidentialPremisesToCreate()
             */
            public void setResidentialPremisesToCreate(ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate value) {
                this.residentialPremisesToCreate = value;
            }

            /**
             * Изменение данных жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
             *     
             */
            public ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate getResidentialPremisesToUpdate() {
                return residentialPremisesToUpdate;
            }

            /**
             * Sets the value of the residentialPremisesToUpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
             *     
             * @see #getResidentialPremisesToUpdate()
             */
            public void setResidentialPremisesToUpdate(ImportHouseUORequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate value) {
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
             * {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToCreate property.
             */
            public List<ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate> getLivingRoomToCreate() {
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
             * {@link ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToUpdate property.
             */
            public List<ImportHouseUORequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate> getLivingRoomToUpdate() {
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
                extends RoomUOType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
                extends RoomUpdateUOType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUOType">
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
                extends ResidentialPremisesUOType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateUOType">
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
                extends ResidentialPremisesUpdateUOType
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
     *           <element name="LivingHouseToCreate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUOType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="LivingHouseToUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUpdateUOType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <choice>
     *           <sequence>
     *             <element name="LivingRoomToCreate" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     </sequence>
     *                   </extension>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *             <element name="LivingRoomToUpdate" maxOccurs="unbounded" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                       <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     </sequence>
     *                   </extension>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *           </sequence>
     *           <element name="Blocks" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <choice>
     *                       <element name="BlockToCreate">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUOType">
     *                               <sequence>
     *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                               </sequence>
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="BlockToUpdate">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateUOType">
     *                               <sequence>
     *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                                 <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
    @XmlType(name = "", propOrder = {
        "livingHouseToCreate",
        "livingHouseToUpdate",
        "livingRoomToCreate",
        "livingRoomToUpdate",
        "blocks"
    })
    public static class LivingHouse {

        /**
         * Добавление жилого дома
         * 
         */
        @XmlElement(name = "LivingHouseToCreate")
        protected ImportHouseUORequest.LivingHouse.LivingHouseToCreate livingHouseToCreate;
        /**
         * Изменение данных жилого дома
         * 
         */
        @XmlElement(name = "LivingHouseToUpdate")
        protected ImportHouseUORequest.LivingHouse.LivingHouseToUpdate livingHouseToUpdate;
        /**
         * Добавление комнаты
         * 
         */
        @XmlElement(name = "LivingRoomToCreate")
        protected List<ImportHouseUORequest.LivingHouse.LivingRoomToCreate> livingRoomToCreate;
        /**
         * Обновление комнаты
         * 
         */
        @XmlElement(name = "LivingRoomToUpdate")
        protected List<ImportHouseUORequest.LivingHouse.LivingRoomToUpdate> livingRoomToUpdate;
        /**
         * Блоки (для ЖД блокированной застройки)
         * 
         */
        @XmlElement(name = "Blocks")
        protected List<ImportHouseUORequest.LivingHouse.Blocks> blocks;

        /**
         * Добавление жилого дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseUORequest.LivingHouse.LivingHouseToCreate }
         *     
         */
        public ImportHouseUORequest.LivingHouse.LivingHouseToCreate getLivingHouseToCreate() {
            return livingHouseToCreate;
        }

        /**
         * Sets the value of the livingHouseToCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseUORequest.LivingHouse.LivingHouseToCreate }
         *     
         * @see #getLivingHouseToCreate()
         */
        public void setLivingHouseToCreate(ImportHouseUORequest.LivingHouse.LivingHouseToCreate value) {
            this.livingHouseToCreate = value;
        }

        /**
         * Изменение данных жилого дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseUORequest.LivingHouse.LivingHouseToUpdate }
         *     
         */
        public ImportHouseUORequest.LivingHouse.LivingHouseToUpdate getLivingHouseToUpdate() {
            return livingHouseToUpdate;
        }

        /**
         * Sets the value of the livingHouseToUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseUORequest.LivingHouse.LivingHouseToUpdate }
         *     
         * @see #getLivingHouseToUpdate()
         */
        public void setLivingHouseToUpdate(ImportHouseUORequest.LivingHouse.LivingHouseToUpdate value) {
            this.livingHouseToUpdate = value;
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
         * {@link ImportHouseUORequest.LivingHouse.LivingRoomToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the livingRoomToCreate property.
         */
        public List<ImportHouseUORequest.LivingHouse.LivingRoomToCreate> getLivingRoomToCreate() {
            if (livingRoomToCreate == null) {
                livingRoomToCreate = new ArrayList<>();
            }
            return this.livingRoomToCreate;
        }

        /**
         * Обновление комнаты
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
         * {@link ImportHouseUORequest.LivingHouse.LivingRoomToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the livingRoomToUpdate property.
         */
        public List<ImportHouseUORequest.LivingHouse.LivingRoomToUpdate> getLivingRoomToUpdate() {
            if (livingRoomToUpdate == null) {
                livingRoomToUpdate = new ArrayList<>();
            }
            return this.livingRoomToUpdate;
        }

        /**
         * Блоки (для ЖД блокированной застройки)
         * 
         * Gets the value of the blocks property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blocks property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getBlocks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportHouseUORequest.LivingHouse.Blocks }
         * </p>
         * 
         * 
         * @return
         *     The value of the blocks property.
         */
        public List<ImportHouseUORequest.LivingHouse.Blocks> getBlocks() {
            if (blocks == null) {
                blocks = new ArrayList<>();
            }
            return this.blocks;
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
         *           <element name="BlockToCreate">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUOType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                   </sequence>
         *                 </extension>
         *               </complexContent>
         *             </complexType>
         *           </element>
         *           <element name="BlockToUpdate">
         *             <complexType>
         *               <complexContent>
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateUOType">
         *                   <sequence>
         *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                     <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
            "blockToCreate",
            "blockToUpdate",
            "livingRoomToCreate",
            "livingRoomToUpdate"
        })
        public static class Blocks {

            /**
             * Создание блока
             * 
             */
            @XmlElement(name = "BlockToCreate")
            protected ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate blockToCreate;
            /**
             * Обновление блока
             * 
             */
            @XmlElement(name = "BlockToUpdate")
            protected ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate blockToUpdate;
            /**
             * Добавление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToCreate")
            protected List<ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate> livingRoomToCreate;
            /**
             * Обновление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToUpdate")
            protected List<ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate> livingRoomToUpdate;

            /**
             * Создание блока
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate }
             *     
             */
            public ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate getBlockToCreate() {
                return blockToCreate;
            }

            /**
             * Sets the value of the blockToCreate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate }
             *     
             * @see #getBlockToCreate()
             */
            public void setBlockToCreate(ImportHouseUORequest.LivingHouse.Blocks.BlockToCreate value) {
                this.blockToCreate = value;
            }

            /**
             * Обновление блока
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate }
             *     
             */
            public ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate getBlockToUpdate() {
                return blockToUpdate;
            }

            /**
             * Sets the value of the blockToUpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate }
             *     
             * @see #getBlockToUpdate()
             */
            public void setBlockToUpdate(ImportHouseUORequest.LivingHouse.Blocks.BlockToUpdate value) {
                this.blockToUpdate = value;
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
             * {@link ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToCreate property.
             */
            public List<ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToCreate> getLivingRoomToCreate() {
                if (livingRoomToCreate == null) {
                    livingRoomToCreate = new ArrayList<>();
                }
                return this.livingRoomToCreate;
            }

            /**
             * Обновление комнаты
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
             * {@link ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToUpdate property.
             */
            public List<ImportHouseUORequest.LivingHouse.Blocks.LivingRoomToUpdate> getLivingRoomToUpdate() {
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUOType">
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
            public static class BlockToCreate
                extends BlockUOType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateUOType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
             *         <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "blockGUID"
            })
            public static class BlockToUpdate
                extends BlockUpdateUOType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;
                /**
                 * Идентификатор блока жилого дома
                 * 
                 */
                @XmlElement(name = "BlockGUID", required = true)
                protected String blockGUID;

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

            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
                extends RoomUOType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
                extends RoomUpdateUOType
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

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUOType">
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
        public static class LivingHouseToCreate
            extends LivingHouseUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUpdateUOType">
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
        public static class LivingHouseToUpdate
            extends LivingHouseUpdateUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUOType">
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
            extends RoomUOType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateUOType">
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
            extends RoomUpdateUOType
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

    }

}
