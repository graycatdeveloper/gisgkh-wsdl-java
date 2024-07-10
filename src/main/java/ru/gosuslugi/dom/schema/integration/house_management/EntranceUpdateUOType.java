
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Подъезд (обновление данных для УО)
 * 
 * <p>Java class for EntranceUpdateUOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntranceUpdateUOType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceNum"/>
 *         <element name="FIASChildHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="StoreysCount" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="1"/>
 *               <maxInclusive value="999"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CreationYear" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InformationConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntranceUpdateUOType", propOrder = {
    "entranceNum",
    "fiasChildHouseGuid",
    "storeysCount",
    "creationYear",
    "annulmentReason",
    "annulmentInfo",
    "informationConfirmed"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseUORequest.ApartmentHouse.EntranceToUpdate.class
})
public class EntranceUpdateUOType {

    /**
     * Номер подъезда
     * 
     */
    @XmlElement(name = "EntranceNum", required = true)
    protected String entranceNum;
    /**
     * ГУИД дочернего дома по ФИАС, к которому относится подъезд для группирующих домов
     * 
     */
    @XmlElement(name = "FIASChildHouseGuid")
    protected String fiasChildHouseGuid;
    /**
     * Этажность
     * 
     */
    @XmlElement(name = "StoreysCount")
    protected Integer storeysCount;
    /**
     * Год постройки
     * 
     */
    @XmlElement(name = "CreationYear")
    protected Short creationYear;
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
     * Этажность
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStoreysCount() {
        return storeysCount;
    }

    /**
     * Sets the value of the storeysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getStoreysCount()
     */
    public void setStoreysCount(Integer value) {
        this.storeysCount = value;
    }

    /**
     * Год постройки
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCreationYear() {
        return creationYear;
    }

    /**
     * Sets the value of the creationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     * @see #getCreationYear()
     */
    public void setCreationYear(Short value) {
        this.creationYear = value;
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
