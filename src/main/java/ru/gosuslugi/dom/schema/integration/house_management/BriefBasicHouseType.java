
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Кратка базовая информация о доме
 * 
 * <p>Java class for BriefBasicHouseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BriefBasicHouseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LocationInfo" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefLocationType"/>
 *         <element name="BasicCharacteristicts" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefBasicCharactericticsType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BriefBasicHouseType", propOrder = {
    "locationInfo",
    "basicCharacteristicts"
})
public class BriefBasicHouseType {

    /**
     * Информация о расположении дома
     * 
     */
    @XmlElement(name = "LocationInfo", required = true)
    protected BriefLocationType locationInfo;
    /**
     * Базовые характеристики дома в реестре адресных объектов ГИС ЖКХ
     * 
     */
    @XmlElement(name = "BasicCharacteristicts", required = true)
    protected BriefBasicCharactericticsType basicCharacteristicts;

    /**
     * Информация о расположении дома
     * 
     * @return
     *     possible object is
     *     {@link BriefLocationType }
     *     
     */
    public BriefLocationType getLocationInfo() {
        return locationInfo;
    }

    /**
     * Sets the value of the locationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefLocationType }
     *     
     * @see #getLocationInfo()
     */
    public void setLocationInfo(BriefLocationType value) {
        this.locationInfo = value;
    }

    /**
     * Базовые характеристики дома в реестре адресных объектов ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link BriefBasicCharactericticsType }
     *     
     */
    public BriefBasicCharactericticsType getBasicCharacteristicts() {
        return basicCharacteristicts;
    }

    /**
     * Sets the value of the basicCharacteristicts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefBasicCharactericticsType }
     *     
     * @see #getBasicCharacteristicts()
     */
    public void setBasicCharacteristicts(BriefBasicCharactericticsType value) {
        this.basicCharacteristicts = value;
    }

}
