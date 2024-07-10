
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GKNRelationshipStatusType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GKNRelationshipStatusType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Status">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="1"/>
 *               <enumeration value="C"/>
 *               <enumeration value="D"/>
 *               <enumeration value="N"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element name="AppartmentHouseAcceptedParameter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ApartmentHouseAcceptedParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="LivingHouseAcceptedParameter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}LivingHouseAcceptedParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="NonResidentialPremiseAcceptedParameter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}NonResidentialPremiseAcceptedParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="ResidentialPremiseAcceptedParameter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ResidentialPremiseAcceptedParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="RoomAcceptedParameter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}RoomAcceptedParameterType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GKNRelationshipStatusType", propOrder = {
    "status",
    "appartmentHouseAcceptedParameter",
    "livingHouseAcceptedParameter",
    "nonResidentialPremiseAcceptedParameter",
    "residentialPremiseAcceptedParameter",
    "roomAcceptedParameter"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.OGFImportStatusType.GKNRelationshipStatus.class
})
public class GKNRelationshipStatusType {

    /**
     * Статус связи объекта с ГКН:
     * (C)reated - связь с ГНК установлена
     * (D)roped - связь разорвана
     * (N)o relationship - связь с ГКН не устанавливалась
     * 
     */
    @XmlElement(name = "Status", required = true)
    protected String status;
    /**
     * Пользовательский параметр МКД, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     */
    @XmlElement(name = "AppartmentHouseAcceptedParameter")
    @XmlSchemaType(name = "string")
    protected List<ApartmentHouseAcceptedParameterType> appartmentHouseAcceptedParameter;
    /**
     * Пользовательский параметр ЖД, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     */
    @XmlElement(name = "LivingHouseAcceptedParameter")
    @XmlSchemaType(name = "string")
    protected List<LivingHouseAcceptedParameterType> livingHouseAcceptedParameter;
    /**
     * Пользовательский параметр нежилого помещения, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     */
    @XmlElement(name = "NonResidentialPremiseAcceptedParameter")
    @XmlSchemaType(name = "string")
    protected List<NonResidentialPremiseAcceptedParameterType> nonResidentialPremiseAcceptedParameter;
    /**
     * Пользовательский параметр жилого помещения, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     */
    @XmlElement(name = "ResidentialPremiseAcceptedParameter")
    @XmlSchemaType(name = "string")
    protected List<ResidentialPremiseAcceptedParameterType> residentialPremiseAcceptedParameter;
    /**
     * Пользовательский параметр комнаты, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     */
    @XmlElement(name = "RoomAcceptedParameter")
    @XmlSchemaType(name = "string")
    protected List<RoomAcceptedParameterType> roomAcceptedParameter;

    /**
     * Статус связи объекта с ГКН:
     * (C)reated - связь с ГНК установлена
     * (D)roped - связь разорвана
     * (N)o relationship - связь с ГКН не устанавливалась
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Пользовательский параметр МКД, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     * Gets the value of the appartmentHouseAcceptedParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appartmentHouseAcceptedParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAppartmentHouseAcceptedParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApartmentHouseAcceptedParameterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the appartmentHouseAcceptedParameter property.
     */
    public List<ApartmentHouseAcceptedParameterType> getAppartmentHouseAcceptedParameter() {
        if (appartmentHouseAcceptedParameter == null) {
            appartmentHouseAcceptedParameter = new ArrayList<>();
        }
        return this.appartmentHouseAcceptedParameter;
    }

    /**
     * Пользовательский параметр ЖД, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     * Gets the value of the livingHouseAcceptedParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingHouseAcceptedParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLivingHouseAcceptedParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LivingHouseAcceptedParameterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the livingHouseAcceptedParameter property.
     */
    public List<LivingHouseAcceptedParameterType> getLivingHouseAcceptedParameter() {
        if (livingHouseAcceptedParameter == null) {
            livingHouseAcceptedParameter = new ArrayList<>();
        }
        return this.livingHouseAcceptedParameter;
    }

    /**
     * Пользовательский параметр нежилого помещения, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     * Gets the value of the nonResidentialPremiseAcceptedParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonResidentialPremiseAcceptedParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNonResidentialPremiseAcceptedParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonResidentialPremiseAcceptedParameterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nonResidentialPremiseAcceptedParameter property.
     */
    public List<NonResidentialPremiseAcceptedParameterType> getNonResidentialPremiseAcceptedParameter() {
        if (nonResidentialPremiseAcceptedParameter == null) {
            nonResidentialPremiseAcceptedParameter = new ArrayList<>();
        }
        return this.nonResidentialPremiseAcceptedParameter;
    }

    /**
     * Пользовательский параметр жилого помещения, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     * Gets the value of the residentialPremiseAcceptedParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the residentialPremiseAcceptedParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getResidentialPremiseAcceptedParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidentialPremiseAcceptedParameterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the residentialPremiseAcceptedParameter property.
     */
    public List<ResidentialPremiseAcceptedParameterType> getResidentialPremiseAcceptedParameter() {
        if (residentialPremiseAcceptedParameter == null) {
            residentialPremiseAcceptedParameter = new ArrayList<>();
        }
        return this.residentialPremiseAcceptedParameter;
    }

    /**
     * Пользовательский параметр комнаты, принятый ГИС ЖКХ после установления связи с ГКН
     * 
     * Gets the value of the roomAcceptedParameter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomAcceptedParameter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRoomAcceptedParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomAcceptedParameterType }
     * </p>
     * 
     * 
     * @return
     *     The value of the roomAcceptedParameter property.
     */
    public List<RoomAcceptedParameterType> getRoomAcceptedParameter() {
        if (roomAcceptedParameter == null) {
            roomAcceptedParameter = new ArrayList<>();
        }
        return this.roomAcceptedParameter;
    }

}
