
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
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseOMSType">
 *                               <sequence>
 *                                 <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="ApartmentHouseToUpdate">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateOMSType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesOMSType">
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
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateOMSType">
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
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceOMSType">
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
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftOMSType">
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
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateOMSType">
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
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseOMSType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                               </sequence>
 *                             </extension>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="LivingHouseToUpdate">
 *                         <complexType>
 *                           <complexContent>
 *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUpdateOMSType">
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                 <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
 *                               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
 *                                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
@XmlRootElement(name = "importHouseOMSRequest")
public class ImportHouseOMSRequest
    extends BaseType
{

    /**
     * Многоквартирный дом
     * 
     */
    @XmlElement(name = "ApartmentHouse")
    protected ImportHouseOMSRequest.ApartmentHouse apartmentHouse;
    /**
     * Жилой дом
     * 
     */
    @XmlElement(name = "LivingHouse")
    protected ImportHouseOMSRequest.LivingHouse livingHouse;
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
     *     {@link ImportHouseOMSRequest.ApartmentHouse }
     *     
     */
    public ImportHouseOMSRequest.ApartmentHouse getApartmentHouse() {
        return apartmentHouse;
    }

    /**
     * Sets the value of the apartmentHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHouseOMSRequest.ApartmentHouse }
     *     
     * @see #getApartmentHouse()
     */
    public void setApartmentHouse(ImportHouseOMSRequest.ApartmentHouse value) {
        this.apartmentHouse = value;
    }

    /**
     * Жилой дом
     * 
     * @return
     *     possible object is
     *     {@link ImportHouseOMSRequest.LivingHouse }
     *     
     */
    public ImportHouseOMSRequest.LivingHouse getLivingHouse() {
        return livingHouse;
    }

    /**
     * Sets the value of the livingHouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportHouseOMSRequest.LivingHouse }
     *     
     * @see #getLivingHouse()
     */
    public void setLivingHouse(ImportHouseOMSRequest.LivingHouse value) {
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseOMSType">
     *                   <sequence>
     *                     <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="ApartmentHouseToUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateOMSType">
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesOMSType">
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateOMSType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceOMSType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftOMSType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateOMSType">
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
        protected ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate apartmentHouseToCreate;
        /**
         * Изменение данных многоквартирного дома
         * 
         */
        @XmlElement(name = "ApartmentHouseToUpdate")
        protected ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate apartmentHouseToUpdate;
        /**
         * Добавление нежилого помещения
         * 
         */
        @XmlElement(name = "NonResidentialPremiseToCreate")
        protected List<ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate> nonResidentialPremiseToCreate;
        /**
         * Изменение данных нежилого помещения
         * 
         */
        @XmlElement(name = "NonResidentialPremiseToUpdate")
        protected List<ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate> nonResidentialPremiseToUpdate;
        /**
         * Добавление нового подъезда
         * 
         */
        @XmlElement(name = "EntranceToCreate")
        protected List<ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate> entranceToCreate;
        /**
         * Изменение подъезда
         * 
         */
        @XmlElement(name = "EntranceToUpdate")
        protected List<ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate> entranceToUpdate;
        /**
         * Жилое помещение
         * 
         */
        @XmlElement(name = "ResidentialPremises")
        protected List<ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises> residentialPremises;
        /**
         * Добавление нового лифта
         * 
         */
        @XmlElement(name = "LiftToCreate")
        protected List<ImportHouseOMSRequest.ApartmentHouse.LiftToCreate> liftToCreate;
        /**
         * Изменение лифта
         * 
         */
        @XmlElement(name = "LiftToUpdate")
        protected List<ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate> liftToUpdate;

        /**
         * Добавление многоквартирного дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate }
         *     
         */
        public ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate getApartmentHouseToCreate() {
            return apartmentHouseToCreate;
        }

        /**
         * Sets the value of the apartmentHouseToCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate }
         *     
         * @see #getApartmentHouseToCreate()
         */
        public void setApartmentHouseToCreate(ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToCreate value) {
            this.apartmentHouseToCreate = value;
        }

        /**
         * Изменение данных многоквартирного дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate }
         *     
         */
        public ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate getApartmentHouseToUpdate() {
            return apartmentHouseToUpdate;
        }

        /**
         * Sets the value of the apartmentHouseToUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate }
         *     
         * @see #getApartmentHouseToUpdate()
         */
        public void setApartmentHouseToUpdate(ImportHouseOMSRequest.ApartmentHouse.ApartmentHouseToUpdate value) {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremiseToCreate property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToCreate> getNonResidentialPremiseToCreate() {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the nonResidentialPremiseToUpdate property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.NonResidentialPremiseToUpdate> getNonResidentialPremiseToUpdate() {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the entranceToCreate property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.EntranceToCreate> getEntranceToCreate() {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the entranceToUpdate property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.EntranceToUpdate> getEntranceToUpdate() {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises }
         * </p>
         * 
         * 
         * @return
         *     The value of the residentialPremises property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises> getResidentialPremises() {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.LiftToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the liftToCreate property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.LiftToCreate> getLiftToCreate() {
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
         * {@link ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the liftToUpdate property.
         */
        public List<ImportHouseOMSRequest.ApartmentHouse.LiftToUpdate> getLiftToUpdate() {
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseOMSType">
         *       <sequence>
         *         <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
            "houseManagementType",
            "transportGUID"
        })
        public static class ApartmentHouseToCreate
            extends ApartmentHouseOMSType
        {

            /**
             * Cпособ управления домом (НСИ 25). Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
             * - Не выбран
             * - Непосредственное управление.
             * 
             */
            @XmlElement(name = "HouseManagementType")
            protected NsiRef houseManagementType;
            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;

            /**
             * Cпособ управления домом (НСИ 25). Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseUpdateOMSType">
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
            extends ApartmentHouseUpdateOMSType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Cпособ управления домом (НСИ 25). Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
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
             * Cпособ управления домом (НСИ 25). Разрешено предавать параметр только при отсутствии информации об управлении МКД (отсутствует запись в РИСУ и/или не размещён договор управления/устав):
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceOMSType">
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
            extends EntranceOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceUpdateOMSType">
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
            extends EntranceUpdateOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftOMSType">
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
            extends LiftOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LiftUpdateOMSType">
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
            extends LiftUpdateOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesOMSType">
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
            extends NonResidentialPremisesOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremisesUpdateOMSType">
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
            extends NonResidentialPremisesUpdateOMSType
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesOMSType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateOMSType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
            protected ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate residentialPremisesToCreate;
            /**
             * Изменение данных жилого помещения
             * 
             */
            @XmlElement(name = "ResidentialPremisesToUpdate")
            protected ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate residentialPremisesToUpdate;
            /**
             * Добавление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToCreate")
            protected List<ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate> livingRoomToCreate;
            /**
             * Изменение комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToUpdate")
            protected List<ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate> livingRoomToUpdate;

            /**
             * Добавление жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
             *     
             */
            public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate getResidentialPremisesToCreate() {
                return residentialPremisesToCreate;
            }

            /**
             * Sets the value of the residentialPremisesToCreate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate }
             *     
             * @see #getResidentialPremisesToCreate()
             */
            public void setResidentialPremisesToCreate(ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToCreate value) {
                this.residentialPremisesToCreate = value;
            }

            /**
             * Изменение данных жилого помещения
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
             *     
             */
            public ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate getResidentialPremisesToUpdate() {
                return residentialPremisesToUpdate;
            }

            /**
             * Sets the value of the residentialPremisesToUpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate }
             *     
             * @see #getResidentialPremisesToUpdate()
             */
            public void setResidentialPremisesToUpdate(ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate value) {
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
             * {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToCreate property.
             */
            public List<ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate> getLivingRoomToCreate() {
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
             * {@link ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToUpdate property.
             */
            public List<ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToUpdate> getLivingRoomToUpdate() {
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
                extends RoomOMSType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
                extends RoomUpdateOMSType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesOMSType">
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
                extends ResidentialPremisesOMSType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremisesUpdateOMSType">
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
                extends ResidentialPremisesUpdateOMSType
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
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseOMSType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="LivingHouseToUpdate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUpdateOMSType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     <element name="HouseManagementType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
     *                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
        protected ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate livingHouseToCreate;
        /**
         * Изменение данных жилого дома
         * 
         */
        @XmlElement(name = "LivingHouseToUpdate")
        protected ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate livingHouseToUpdate;
        /**
         * Добавление комнаты
         * 
         */
        @XmlElement(name = "LivingRoomToCreate")
        protected List<ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate> livingRoomToCreate;
        /**
         * Обновление комнаты
         * 
         */
        @XmlElement(name = "LivingRoomToUpdate")
        protected List<ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate> livingRoomToUpdate;
        /**
         * Блоки (для ЖД блокированной застройки)
         * 
         */
        @XmlElement(name = "Blocks")
        protected List<ImportHouseOMSRequest.LivingHouse.Blocks> blocks;

        /**
         * Добавление жилого дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate }
         *     
         */
        public ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate getLivingHouseToCreate() {
            return livingHouseToCreate;
        }

        /**
         * Sets the value of the livingHouseToCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate }
         *     
         * @see #getLivingHouseToCreate()
         */
        public void setLivingHouseToCreate(ImportHouseOMSRequest.LivingHouse.LivingHouseToCreate value) {
            this.livingHouseToCreate = value;
        }

        /**
         * Изменение данных жилого дома
         * 
         * @return
         *     possible object is
         *     {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate }
         *     
         */
        public ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate getLivingHouseToUpdate() {
            return livingHouseToUpdate;
        }

        /**
         * Sets the value of the livingHouseToUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate }
         *     
         * @see #getLivingHouseToUpdate()
         */
        public void setLivingHouseToUpdate(ImportHouseOMSRequest.LivingHouse.LivingHouseToUpdate value) {
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
         * {@link ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate }
         * </p>
         * 
         * 
         * @return
         *     The value of the livingRoomToCreate property.
         */
        public List<ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate> getLivingRoomToCreate() {
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
         * {@link ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate }
         * </p>
         * 
         * 
         * @return
         *     The value of the livingRoomToUpdate property.
         */
        public List<ImportHouseOMSRequest.LivingHouse.LivingRoomToUpdate> getLivingRoomToUpdate() {
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
         * {@link ImportHouseOMSRequest.LivingHouse.Blocks }
         * </p>
         * 
         * 
         * @return
         *     The value of the blocks property.
         */
        public List<ImportHouseOMSRequest.LivingHouse.Blocks> getBlocks() {
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockOMSType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateOMSType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
         *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
            protected ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate blockToCreate;
            /**
             * Обновление блока
             * 
             */
            @XmlElement(name = "BlockToUpdate")
            protected ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate blockToUpdate;
            /**
             * Добавление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToCreate")
            protected List<ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate> livingRoomToCreate;
            /**
             * Обновление комнаты
             * 
             */
            @XmlElement(name = "LivingRoomToUpdate")
            protected List<ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate> livingRoomToUpdate;

            /**
             * Создание блока
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate }
             *     
             */
            public ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate getBlockToCreate() {
                return blockToCreate;
            }

            /**
             * Sets the value of the blockToCreate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate }
             *     
             * @see #getBlockToCreate()
             */
            public void setBlockToCreate(ImportHouseOMSRequest.LivingHouse.Blocks.BlockToCreate value) {
                this.blockToCreate = value;
            }

            /**
             * Обновление блока
             * 
             * @return
             *     possible object is
             *     {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate }
             *     
             */
            public ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate getBlockToUpdate() {
                return blockToUpdate;
            }

            /**
             * Sets the value of the blockToUpdate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate }
             *     
             * @see #getBlockToUpdate()
             */
            public void setBlockToUpdate(ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate value) {
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
             * {@link ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToCreate property.
             */
            public List<ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate> getLivingRoomToCreate() {
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
             * {@link ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate }
             * </p>
             * 
             * 
             * @return
             *     The value of the livingRoomToUpdate property.
             */
            public List<ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToUpdate> getLivingRoomToUpdate() {
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockOMSType">
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
                extends BlockOMSType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockUpdateOMSType">
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
                extends BlockUpdateOMSType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
                extends RoomOMSType
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
                extends RoomUpdateOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseOMSType">
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
        public static class LivingHouseToCreate
            extends LivingHouseOMSType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Не применимо для ЖД
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
             * Не применимо для ЖД
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseUpdateOMSType">
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
        public static class LivingHouseToUpdate
            extends LivingHouseUpdateOMSType
        {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Не применимо для ЖД
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
             * Не применимо для ЖД
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomOMSType">
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
            extends RoomOMSType
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomUpdateOMSType">
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
            extends RoomUpdateOMSType
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
