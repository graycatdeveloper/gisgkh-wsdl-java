
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта ПУ
 * 
 * <p>Java class for exportMeteringDeviceDataResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportMeteringDeviceDataResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}MeteringDeviceFullInformationExportType">
 *       <sequence>
 *         <element name="MeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="StatusRootDoc">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Active"/>
 *               <enumeration value="Archival"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="MeteringDeviceVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *         <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="StatusVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="MeteringOwner" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID" maxOccurs="100"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MeteringDeviceGISGKHNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportMeteringDeviceDataResultType", propOrder = {
    "meteringDeviceRootGUID",
    "statusRootDoc",
    "meteringDeviceVersionGUID",
    "versionNumber",
    "statusVersion",
    "updateDateTime",
    "meteringOwner",
    "meteringDeviceGISGKHNumber"
})
public class ExportMeteringDeviceDataResultType
    extends MeteringDeviceFullInformationExportType
{

    /**
     * Идентификатор ПУ в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "MeteringDeviceRootGUID", required = true)
    protected String meteringDeviceRootGUID;
    /**
     * Статус сущности
     * Допустимые значения:
     * Active-Активный
     * Archival-Архивный
     * 
     */
    @XmlElement(name = "StatusRootDoc", required = true)
    protected String statusRootDoc;
    /**
     * Идентификатор версии ПУ
     * 
     */
    @XmlElement(name = "MeteringDeviceVersionGUID", required = true)
    protected String meteringDeviceVersionGUID;
    /**
     * Номер версии
     * 
     */
    @XmlElement(name = "VersionNumber", required = true)
    protected BigInteger versionNumber;
    /**
     * Статус версии
     * 
     */
    @XmlElement(name = "StatusVersion", required = true)
    protected String statusVersion;
    /**
     * Дата модификации
     * 
     */
    @XmlElement(name = "UpdateDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;
    /**
     * Организация, у которой прибор учета находится на праве собственности или на ином законном основании
     * 
     */
    @XmlElement(name = "MeteringOwner")
    protected ExportMeteringDeviceDataResultType.MeteringOwner meteringOwner;
    /**
     * Номер прибора учета в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "MeteringDeviceGISGKHNumber", required = true)
    protected String meteringDeviceGISGKHNumber;

    /**
     * Идентификатор ПУ в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceRootGUID() {
        return meteringDeviceRootGUID;
    }

    /**
     * Sets the value of the meteringDeviceRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceRootGUID()
     */
    public void setMeteringDeviceRootGUID(String value) {
        this.meteringDeviceRootGUID = value;
    }

    /**
     * Статус сущности
     * Допустимые значения:
     * Active-Активный
     * Archival-Архивный
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusRootDoc() {
        return statusRootDoc;
    }

    /**
     * Sets the value of the statusRootDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusRootDoc()
     */
    public void setStatusRootDoc(String value) {
        this.statusRootDoc = value;
    }

    /**
     * Идентификатор версии ПУ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceVersionGUID() {
        return meteringDeviceVersionGUID;
    }

    /**
     * Sets the value of the meteringDeviceVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceVersionGUID()
     */
    public void setMeteringDeviceVersionGUID(String value) {
        this.meteringDeviceVersionGUID = value;
    }

    /**
     * Номер версии
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getVersionNumber()
     */
    public void setVersionNumber(BigInteger value) {
        this.versionNumber = value;
    }

    /**
     * Статус версии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVersion() {
        return statusVersion;
    }

    /**
     * Sets the value of the statusVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusVersion()
     */
    public void setStatusVersion(String value) {
        this.statusVersion = value;
    }

    /**
     * Дата модификации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getUpdateDateTime()
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

    /**
     * Организация, у которой прибор учета находится на праве собственности или на ином законном основании
     * 
     * @return
     *     possible object is
     *     {@link ExportMeteringDeviceDataResultType.MeteringOwner }
     *     
     */
    public ExportMeteringDeviceDataResultType.MeteringOwner getMeteringOwner() {
        return meteringOwner;
    }

    /**
     * Sets the value of the meteringOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportMeteringDeviceDataResultType.MeteringOwner }
     *     
     * @see #getMeteringOwner()
     */
    public void setMeteringOwner(ExportMeteringDeviceDataResultType.MeteringOwner value) {
        this.meteringOwner = value;
    }

    /**
     * Номер прибора учета в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringDeviceGISGKHNumber() {
        return meteringDeviceGISGKHNumber;
    }

    /**
     * Sets the value of the meteringDeviceGISGKHNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeteringDeviceGISGKHNumber()
     */
    public void setMeteringDeviceGISGKHNumber(String value) {
        this.meteringDeviceGISGKHNumber = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID" maxOccurs="100"/>
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
        "orgRootEntityGUID"
    })
    public static class MeteringOwner {

        /**
         * Идентификатор корневой сущности организации в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/", required = true)
        protected List<String> orgRootEntityGUID;

        /**
         * Идентификатор корневой сущности организации в реестре организаций
         * 
         * Gets the value of the orgRootEntityGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orgRootEntityGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOrgRootEntityGUID().add(newItem);
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
         *     The value of the orgRootEntityGUID property.
         */
        public List<String> getOrgRootEntityGUID() {
            if (orgRootEntityGUID == null) {
                orgRootEntityGUID = new ArrayList<>();
            }
            return this.orgRootEntityGUID;
        }

    }

}
