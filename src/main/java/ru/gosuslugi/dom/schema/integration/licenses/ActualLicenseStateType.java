
package ru.gosuslugi.dom.schema.integration.licenses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Полная информация о лицензии
 * 
 * <p>Java class for ActualLicenseStateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActualLicenseStateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseInfo" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseInfoType"/>
 *         <element name="LicenseRegistryEntries" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseRegistryEntriesType" maxOccurs="unbounded"/>
 *         <element name="LicenseHouses" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseHousesType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualLicenseStateType", propOrder = {
    "licenseInfo",
    "licenseRegistryEntries",
    "licenseHouses"
})
@XmlSeeAlso({
    ExportActualLicenseStateResultType.class
})
public class ActualLicenseStateType {

    /**
     * Общая информация о лицензии
     * 
     */
    @XmlElement(name = "LicenseInfo", required = true)
    protected LicenseInfoType licenseInfo;
    /**
     * Информация о реестровых записях, добавленных в лицензию
     * 
     */
    @XmlElement(name = "LicenseRegistryEntries", required = true)
    protected List<LicenseRegistryEntriesType> licenseRegistryEntries;
    /**
     * Информация о домах, добавленных в лицензию
     * 
     */
    @XmlElement(name = "LicenseHouses", required = true)
    protected List<LicenseHousesType> licenseHouses;

    /**
     * Общая информация о лицензии
     * 
     * @return
     *     possible object is
     *     {@link LicenseInfoType }
     *     
     */
    public LicenseInfoType getLicenseInfo() {
        return licenseInfo;
    }

    /**
     * Sets the value of the licenseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseInfoType }
     *     
     * @see #getLicenseInfo()
     */
    public void setLicenseInfo(LicenseInfoType value) {
        this.licenseInfo = value;
    }

    /**
     * Информация о реестровых записях, добавленных в лицензию
     * 
     * Gets the value of the licenseRegistryEntries property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseRegistryEntries property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicenseRegistryEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseRegistryEntriesType }
     * </p>
     * 
     * 
     * @return
     *     The value of the licenseRegistryEntries property.
     */
    public List<LicenseRegistryEntriesType> getLicenseRegistryEntries() {
        if (licenseRegistryEntries == null) {
            licenseRegistryEntries = new ArrayList<>();
        }
        return this.licenseRegistryEntries;
    }

    /**
     * Информация о домах, добавленных в лицензию
     * 
     * Gets the value of the licenseHouses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseHouses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicenseHouses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseHousesType }
     * </p>
     * 
     * 
     * @return
     *     The value of the licenseHouses property.
     */
    public List<LicenseHousesType> getLicenseHouses() {
        if (licenseHouses == null) {
            licenseHouses = new ArrayList<>();
        }
        return this.licenseHouses;
    }

}
