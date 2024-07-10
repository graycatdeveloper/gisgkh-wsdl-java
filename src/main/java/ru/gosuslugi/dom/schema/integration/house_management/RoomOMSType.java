
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Комната (для импорта от ОМС)
 * 
 * <p>Java class for RoomOMSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoomOMSType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyType">
 *       <sequence>
 *         <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType"/>
 *         <element name="Square" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InformationConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomOMSType", propOrder = {
    "roomNumber",
    "square",
    "ogfData",
    "informationConfirmed"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.LivingRoomToCreate.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest.LivingHouse.LivingRoomToCreate.class,
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest.LivingHouse.Blocks.LivingRoomToCreate.class
})
public class RoomOMSType
    extends GKNEGRPKeyType
{

    /**
     * Номер комнаты
     * 
     */
    @XmlElement(name = "RoomNumber", required = true)
    protected String roomNumber;
    /**
     * Площадь
     * 
     */
    @XmlElement(name = "Square")
    protected BigDecimal square;
    /**
     * Данные ОЖФ
     * 
     */
    @XmlElement(name = "OGFData")
    protected List<OGFData> ogfData;
    /**
     * Информация подтверждена поставщиком
     * 
     */
    @XmlElement(name = "InformationConfirmed")
    protected Boolean informationConfirmed;

    /**
     * Номер комнаты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRoomNumber()
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Площадь
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSquare() {
        return square;
    }

    /**
     * Sets the value of the square property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSquare()
     */
    public void setSquare(BigDecimal value) {
        this.square = value;
    }

    /**
     * Данные ОЖФ
     * 
     * Gets the value of the ogfData property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ogfData property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOGFData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OGFData }
     * </p>
     * 
     * 
     * @return
     *     The value of the ogfData property.
     */
    public List<OGFData> getOGFData() {
        if (ogfData == null) {
            ogfData = new ArrayList<>();
        }
        return this.ogfData;
    }

    /**
     * Информация подтверждена поставщиком
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationConfirmed() {
        return informationConfirmed;
    }

    /**
     * Sets the value of the informationConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isInformationConfirmed()
     */
    public void setInformationConfirmed(Boolean value) {
        this.informationConfirmed = value;
    }

}
