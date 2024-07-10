
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Общие сведения об объекте недвижимости
 * 
 * <p>Java class for FacilityCommonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FacilityCommonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ObjectName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
 *         <element name="ObjectPurpose" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" minOccurs="0"/>
 *         <element name="OtherObjectPurpose" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type" minOccurs="0"/>
 *         <element name="ObjectOfIndividualHousingConstruction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ObjectStatus" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ObjectStatusType"/>
 *         <choice minOccurs="0">
 *           <element name="CadastralNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CadastralNumberType"/>
 *           <element name="OtherNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OtherNumberType"/>
 *         </choice>
 *         <element name="ObjectRightsRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityCommonType", propOrder = {
    "objectName",
    "objectPurpose",
    "otherObjectPurpose",
    "objectOfIndividualHousingConstruction",
    "objectStatus",
    "cadastralNumber",
    "otherNumber",
    "objectRightsRegistered"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportOrganizationDeterminationApplicationType.Facility.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportTechnicalSpecificationApplicationType.Facility.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportConnectionPossibilityApplicationType.Facility.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.AgreementApplicationType.ApplicationVersion.Facility.class
})
public class FacilityCommonType {

    /**
     * Наименование подключаемого объекта
     * 
     */
    @XmlElement(name = "ObjectName", required = true)
    protected String objectName;
    /**
     * Назначение подключаемого объекта. Справочник "Назначение подключаемого объекта" ЕСНСИ
     * 
     */
    @XmlElement(name = "ObjectPurpose")
    protected EsnsiItemType objectPurpose;
    /**
     * Иное назначение подключаемого объекта
     * 
     */
    @XmlElement(name = "OtherObjectPurpose")
    protected String otherObjectPurpose;
    /**
     * Объект относится к ИЖС
     * 
     */
    @XmlElement(name = "ObjectOfIndividualHousingConstruction")
    protected boolean objectOfIndividualHousingConstruction;
    /**
     * Статус объекта
     * 
     */
    @XmlElement(name = "ObjectStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ObjectStatusType objectStatus;
    /**
     * Кадастровый номер объекта
     * 
     */
    @XmlElement(name = "CadastralNumber")
    protected String cadastralNumber;
    /**
     * Условный номер объекта
     * 
     */
    @XmlElement(name = "OtherNumber")
    protected String otherNumber;
    /**
     * Права на подключаемый объект зарегистрированы в Росреестре
     * 
     */
    @XmlElement(name = "ObjectRightsRegistered")
    protected Boolean objectRightsRegistered;

    /**
     * Наименование подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getObjectName()
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Назначение подключаемого объекта. Справочник "Назначение подключаемого объекта" ЕСНСИ
     * 
     * @return
     *     possible object is
     *     {@link EsnsiItemType }
     *     
     */
    public EsnsiItemType getObjectPurpose() {
        return objectPurpose;
    }

    /**
     * Sets the value of the objectPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsnsiItemType }
     *     
     * @see #getObjectPurpose()
     */
    public void setObjectPurpose(EsnsiItemType value) {
        this.objectPurpose = value;
    }

    /**
     * Иное назначение подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherObjectPurpose() {
        return otherObjectPurpose;
    }

    /**
     * Sets the value of the otherObjectPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOtherObjectPurpose()
     */
    public void setOtherObjectPurpose(String value) {
        this.otherObjectPurpose = value;
    }

    /**
     * Объект относится к ИЖС
     * 
     */
    public boolean isObjectOfIndividualHousingConstruction() {
        return objectOfIndividualHousingConstruction;
    }

    /**
     * Sets the value of the objectOfIndividualHousingConstruction property.
     * 
     */
    public void setObjectOfIndividualHousingConstruction(boolean value) {
        this.objectOfIndividualHousingConstruction = value;
    }

    /**
     * Статус объекта
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
     * Кадастровый номер объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralNumber() {
        return cadastralNumber;
    }

    /**
     * Sets the value of the cadastralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCadastralNumber()
     */
    public void setCadastralNumber(String value) {
        this.cadastralNumber = value;
    }

    /**
     * Условный номер объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNumber() {
        return otherNumber;
    }

    /**
     * Sets the value of the otherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOtherNumber()
     */
    public void setOtherNumber(String value) {
        this.otherNumber = value;
    }

    /**
     * Права на подключаемый объект зарегистрированы в Росреестре
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObjectRightsRegistered() {
        return objectRightsRegistered;
    }

    /**
     * Sets the value of the objectRightsRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isObjectRightsRegistered()
     */
    public void setObjectRightsRegistered(Boolean value) {
        this.objectRightsRegistered = value;
    }

}
