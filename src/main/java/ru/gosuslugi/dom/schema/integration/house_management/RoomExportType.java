
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Комната (для экспорта)
 * 
 * <p>Java class for RoomExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RoomExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyType">
 *       <sequence>
 *         <element name="RoomNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *         <element name="Square" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminationDate" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RoomExportType", propOrder = {
    "roomNumber",
    "square",
    "floor",
    "ogfData",
    "terminationDate",
    "annulmentReason",
    "annulmentInfo",
    "informationConfirmed"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ExportHouseResultType.ApartmentHouse.ResidentialPremises.LivingRoom.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportHouseResultType.LivingHouse.LivingRoom.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportHouseResultType.LivingHouse.Block.LivingRoom.class
})
public class RoomExportType
    extends GKNEGRPKeyType
{

    /**
     * Номер комнаты
     * 
     */
    @XmlElement(name = "RoomNumber")
    protected String roomNumber;
    /**
     * Площадь
     * 
     */
    @XmlElement(name = "Square")
    protected BigDecimal square;
    /**
     * Этаж
     * 
     */
    @XmlElement(name = "Floor")
    protected String floor;
    /**
     * Данные ОЖФ
     * 
     */
    @XmlElement(name = "OGFData")
    protected List<OGFData> ogfData;
    /**
     * Дата аннулирования объекта в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "TerminationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminationDate;
    /**
     * Причина аннулирования объекта жилищного фонда (НСИ 330)
     * 
     */
    @XmlElement(name = "AnnulmentReason")
    protected NsiRef annulmentReason;
    /**
     * Причина аннулирования.Дополнительная информация
     * 
     */
    @XmlElement(name = "AnnulmentInfo")
    protected String annulmentInfo;
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
     * Этаж
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFloor()
     */
    public void setFloor(String value) {
        this.floor = value;
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
     * Дата аннулирования объекта в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminationDate() {
        return terminationDate;
    }

    /**
     * Sets the value of the terminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTerminationDate()
     */
    public void setTerminationDate(XMLGregorianCalendar value) {
        this.terminationDate = value;
    }

    /**
     * Причина аннулирования объекта жилищного фонда (НСИ 330)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getAnnulmentReason() {
        return annulmentReason;
    }

    /**
     * Sets the value of the annulmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getAnnulmentReason()
     */
    public void setAnnulmentReason(NsiRef value) {
        this.annulmentReason = value;
    }

    /**
     * Причина аннулирования.Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentInfo() {
        return annulmentInfo;
    }

    /**
     * Sets the value of the annulmentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnnulmentInfo()
     */
    public void setAnnulmentInfo(String value) {
        this.annulmentInfo = value;
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
