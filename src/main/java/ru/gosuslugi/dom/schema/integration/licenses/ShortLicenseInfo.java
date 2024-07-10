
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Краткая информация о лицензии
 * 
 * <p>Java class for ShortLicenseInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ShortLicenseInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ErulNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulNumberType" minOccurs="0"/>
 *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortLicenseInfo", propOrder = {
    "licenseGUID",
    "erulNumber",
    "licenseNumber"
})
public class ShortLicenseInfo {

    /**
     * Корневой идентификатор лицензии, с которой выполнено объединение
     * 
     */
    @XmlElement(name = "LicenseGUID", required = true)
    protected String licenseGUID;
    /**
     * Номер лицензии по ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulNumber")
    protected String erulNumber;
    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     */
    @XmlElement(name = "LicenseNumber", required = true)
    protected String licenseNumber;

    /**
     * Корневой идентификатор лицензии, с которой выполнено объединение
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseGUID() {
        return licenseGUID;
    }

    /**
     * Sets the value of the licenseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicenseGUID()
     */
    public void setLicenseGUID(String value) {
        this.licenseGUID = value;
    }

    /**
     * Номер лицензии по ЕРУЛ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErulNumber() {
        return erulNumber;
    }

    /**
     * Sets the value of the erulNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErulNumber()
     */
    public void setErulNumber(String value) {
        this.erulNumber = value;
    }

    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLicenseNumber()
     */
    public void setLicenseNumber(String value) {
        this.licenseNumber = value;
    }

}
