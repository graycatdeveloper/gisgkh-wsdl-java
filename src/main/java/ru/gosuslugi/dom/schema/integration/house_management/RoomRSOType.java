
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Комната (для импорта от РСО)
 * 
 * <p>Java class for RoomRSOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoomRSOType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyRSOType">
 *       <sequence>
 *         <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType"/>
 *         <element name="Square" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomRSOType", propOrder = {
    "roomNumber",
    "square"
})
public class RoomRSOType
    extends GKNEGRPKeyRSOType
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

}
