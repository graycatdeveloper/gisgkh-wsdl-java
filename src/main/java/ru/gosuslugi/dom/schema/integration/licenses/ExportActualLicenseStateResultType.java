
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат экспорта информации о лицензиях из реестровой модели лицензий
 * 
 * <p>Java class for exportActualLicenseStateResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportActualLicenseStateResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/licenses/}ActualLicenseStateType">
 *       <sequence>
 *         <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="EsiaSentInfo" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EsiaSentInfoType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportActualLicenseStateResultType", propOrder = {
    "licenseGUID",
    "esiaSentInfo"
})
public class ExportActualLicenseStateResultType
    extends ActualLicenseStateType
{

    /**
     * Корневой идентификатор лицензии в системе
     * 
     */
    @XmlElement(name = "LicenseGUID", required = true)
    protected String licenseGUID;
    /**
     * Статус размещения лицензии (изменений в лицензии) в ЕСИА
     * 
     */
    @XmlElement(name = "EsiaSentInfo")
    protected EsiaSentInfoType esiaSentInfo;

    /**
     * Корневой идентификатор лицензии в системе
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
     * Статус размещения лицензии (изменений в лицензии) в ЕСИА
     * 
     * @return
     *     possible object is
     *     {@link EsiaSentInfoType }
     *     
     */
    public EsiaSentInfoType getEsiaSentInfo() {
        return esiaSentInfo;
    }

    /**
     * Sets the value of the esiaSentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsiaSentInfoType }
     *     
     * @see #getEsiaSentInfo()
     */
    public void setEsiaSentInfo(EsiaSentInfoType value) {
        this.esiaSentInfo = value;
    }

}
