
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Критерии поиска дома
 * 
 * <p>Java class for ExportBriefBasicCriteriaType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportBriefBasicCriteriaType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="HouseUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="LivingRoomUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BlockUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportBriefBasicCriteriaType", propOrder = {
    "houseUniqueNumber",
    "premisesUniqueNumber",
    "livingRoomUniqueNumber",
    "blockUniqueNumber",
    "fiasHouseGuid"
})
public class ExportBriefBasicCriteriaType {

    /**
     * Уникальный номер дома
     * 
     */
    @XmlElement(name = "HouseUniqueNumber")
    protected String houseUniqueNumber;
    /**
     * Уникальный номер помещения
     * 
     */
    @XmlElement(name = "PremisesUniqueNumber")
    protected String premisesUniqueNumber;
    /**
     * Уникальный номер комнаты
     * 
     */
    @XmlElement(name = "LivingRoomUniqueNumber")
    protected String livingRoomUniqueNumber;
    /**
     * Уникальный номер блока
     * 
     */
    @XmlElement(name = "BlockUniqueNumber")
    protected String blockUniqueNumber;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;

    /**
     * Уникальный номер дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseUniqueNumber() {
        return houseUniqueNumber;
    }

    /**
     * Sets the value of the houseUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseUniqueNumber()
     */
    public void setHouseUniqueNumber(String value) {
        this.houseUniqueNumber = value;
    }

    /**
     * Уникальный номер помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremisesUniqueNumber() {
        return premisesUniqueNumber;
    }

    /**
     * Sets the value of the premisesUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremisesUniqueNumber()
     */
    public void setPremisesUniqueNumber(String value) {
        this.premisesUniqueNumber = value;
    }

    /**
     * Уникальный номер комнаты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingRoomUniqueNumber() {
        return livingRoomUniqueNumber;
    }

    /**
     * Sets the value of the livingRoomUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLivingRoomUniqueNumber()
     */
    public void setLivingRoomUniqueNumber(String value) {
        this.livingRoomUniqueNumber = value;
    }

    /**
     * Уникальный номер блока
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockUniqueNumber() {
        return blockUniqueNumber;
    }

    /**
     * Sets the value of the blockUniqueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBlockUniqueNumber()
     */
    public void setBlockUniqueNumber(String value) {
        this.blockUniqueNumber = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

}
