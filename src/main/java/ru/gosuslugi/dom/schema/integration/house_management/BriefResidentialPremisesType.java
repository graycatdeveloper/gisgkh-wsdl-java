
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Краткая информация о жилом помещении
 * 
 * <p>Java class for BriefResidentialPremisesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BriefResidentialPremisesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="PremisesUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="PremisesNum" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType" minOccurs="0"/>
 *         <element name="FIASChildHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InformationConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceNum"/>
 *           <element name="HasNoEntrance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="LivingRoom" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefLivingRoomType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BriefResidentialPremisesType", propOrder = {
    "premisesGUID",
    "premisesUniqueNumber",
    "premisesNum",
    "fiasChildHouseGuid",
    "terminationDate",
    "annulmentReason",
    "annulmentInfo",
    "informationConfirmed",
    "entranceNum",
    "hasNoEntrance",
    "livingRoom"
})
public class BriefResidentialPremisesType {

    /**
     * Идентификатор помещения
     * 
     */
    @XmlElement(name = "PremisesGUID", required = true)
    protected String premisesGUID;
    /**
     * Уникальный номер помещения
     * 
     */
    @XmlElement(name = "PremisesUniqueNumber", required = true)
    protected String premisesUniqueNumber;
    /**
     * Номер помещения
     * 
     */
    @XmlElement(name = "PremisesNum")
    protected String premisesNum;
    /**
     * ГУИД дочернего дома по ФИАС, к которому относится подъезд для группирующих домов
     * 
     */
    @XmlElement(name = "FIASChildHouseGuid")
    protected String fiasChildHouseGuid;
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
     * Номер подъезда
     * 
     */
    @XmlElement(name = "EntranceNum")
    protected String entranceNum;
    /**
     * Признак отсутствия подъезда
     * 
     */
    @XmlElement(name = "HasNoEntrance")
    protected Boolean hasNoEntrance;
    /**
     * Комната в квартире коммунального заселения
     * 
     */
    @XmlElement(name = "LivingRoom")
    protected List<BriefLivingRoomType> livingRoom;

    /**
     * Идентификатор помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremisesGUID() {
        return premisesGUID;
    }

    /**
     * Sets the value of the premisesGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremisesGUID()
     */
    public void setPremisesGUID(String value) {
        this.premisesGUID = value;
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
     * Номер помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremisesNum() {
        return premisesNum;
    }

    /**
     * Sets the value of the premisesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremisesNum()
     */
    public void setPremisesNum(String value) {
        this.premisesNum = value;
    }

    /**
     * ГУИД дочернего дома по ФИАС, к которому относится подъезд для группирующих домов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASChildHouseGuid() {
        return fiasChildHouseGuid;
    }

    /**
     * Sets the value of the fiasChildHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASChildHouseGuid()
     */
    public void setFIASChildHouseGuid(String value) {
        this.fiasChildHouseGuid = value;
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

    /**
     * Номер подъезда
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntranceNum() {
        return entranceNum;
    }

    /**
     * Sets the value of the entranceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEntranceNum()
     */
    public void setEntranceNum(String value) {
        this.entranceNum = value;
    }

    /**
     * Признак отсутствия подъезда
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNoEntrance() {
        return hasNoEntrance;
    }

    /**
     * Sets the value of the hasNoEntrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isHasNoEntrance()
     */
    public void setHasNoEntrance(Boolean value) {
        this.hasNoEntrance = value;
    }

    /**
     * Комната в квартире коммунального заселения
     * 
     * Gets the value of the livingRoom property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livingRoom property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLivingRoom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BriefLivingRoomType }
     * </p>
     * 
     * 
     * @return
     *     The value of the livingRoom property.
     */
    public List<BriefLivingRoomType> getLivingRoom() {
        if (livingRoom == null) {
            livingRoom = new ArrayList<>();
        }
        return this.livingRoom;
    }

}
