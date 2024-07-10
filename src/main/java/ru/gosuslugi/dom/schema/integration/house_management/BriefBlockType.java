
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
 * Краткая информация о блоке в жилом доме блокированной застройки
 * 
 * <p>Java class for BriefBlockType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BriefBlockType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BlockGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="BlockUniqueNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="BlockNum" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType"/>
 *         <element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InformationConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Category" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockCategoryType" minOccurs="0"/>
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
@XmlType(name = "BriefBlockType", propOrder = {
    "blockGUID",
    "blockUniqueNumber",
    "blockNum",
    "terminationDate",
    "annulmentReason",
    "annulmentInfo",
    "informationConfirmed",
    "category",
    "livingRoom"
})
public class BriefBlockType {

    /**
     * Идентификатор блока
     * 
     */
    @XmlElement(name = "BlockGUID", required = true)
    protected String blockGUID;
    /**
     * Уникальный номер блока
     * 
     */
    @XmlElement(name = "BlockUniqueNumber", required = true)
    protected String blockUniqueNumber;
    /**
     * Номер блока
     * 
     */
    @XmlElement(name = "BlockNum", required = true)
    protected String blockNum;
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
     * Категория помещения
     * (если не задано, считается как жилое)
     * 
     */
    @XmlElement(name = "Category")
    @XmlSchemaType(name = "string")
    protected BlockCategoryType category;
    /**
     * Комната в квартире коммунального заселения
     * 
     */
    @XmlElement(name = "LivingRoom")
    protected List<BriefLivingRoomType> livingRoom;

    /**
     * Идентификатор блока
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockGUID() {
        return blockGUID;
    }

    /**
     * Sets the value of the blockGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBlockGUID()
     */
    public void setBlockGUID(String value) {
        this.blockGUID = value;
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
     * Номер блока
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNum() {
        return blockNum;
    }

    /**
     * Sets the value of the blockNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBlockNum()
     */
    public void setBlockNum(String value) {
        this.blockNum = value;
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
     * Категория помещения
     * (если не задано, считается как жилое)
     * 
     * @return
     *     possible object is
     *     {@link BlockCategoryType }
     *     
     */
    public BlockCategoryType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockCategoryType }
     *     
     * @see #getCategory()
     */
    public void setCategory(BlockCategoryType value) {
        this.category = value;
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
