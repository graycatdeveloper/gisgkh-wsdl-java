
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Блок дома блокированной застройки  (обновление данных для ОМС)
 * 
 * <p>Java class for BlockUpdateOMSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BlockUpdateOMSType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyType">
 *       <sequence>
 *         <element name="BlockNum" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType"/>
 *         <element name="PremisesCharacteristic" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="TotalArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="GrossArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType"/>
 *           <element name="NoGrossArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="AnnulmentInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OGFData" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFData" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InformationConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Category" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BlockCategoryType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockUpdateOMSType", propOrder = {
    "blockNum",
    "premisesCharacteristic",
    "totalArea",
    "grossArea",
    "noGrossArea",
    "annulmentReason",
    "annulmentInfo",
    "ogfData",
    "informationConfirmed",
    "category"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest.LivingHouse.Blocks.BlockToUpdate.class
})
public class BlockUpdateOMSType
    extends GKNEGRPKeyType
{

    /**
     * Номер блока
     * 
     */
    @XmlElement(name = "BlockNum", required = true)
    protected String blockNum;
    /**
     * Характеристика помещения (НСИ 30)
     * 
     */
    @XmlElement(name = "PremisesCharacteristic")
    protected NsiRef premisesCharacteristic;
    /**
     * Общая площадь помещения по паспорту помещения
     * 
     */
    @XmlElement(name = "TotalArea")
    protected BigDecimal totalArea;
    /**
     * Жилая площадь помещения по паспорту помещения
     * 
     */
    @XmlElement(name = "GrossArea")
    protected BigDecimal grossArea;
    /**
     * Отсутствует значение жилой площади
     * 
     */
    @XmlElement(name = "NoGrossArea")
    protected Boolean noGrossArea;
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
     * Категория помещения
     * (если не задано, считается как жилое)
     * 
     */
    @XmlElement(name = "Category")
    @XmlSchemaType(name = "string")
    protected BlockCategoryType category;

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
     * Характеристика помещения (НСИ 30)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getPremisesCharacteristic() {
        return premisesCharacteristic;
    }

    /**
     * Sets the value of the premisesCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getPremisesCharacteristic()
     */
    public void setPremisesCharacteristic(NsiRef value) {
        this.premisesCharacteristic = value;
    }

    /**
     * Общая площадь помещения по паспорту помещения
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalArea() {
        return totalArea;
    }

    /**
     * Sets the value of the totalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalArea()
     */
    public void setTotalArea(BigDecimal value) {
        this.totalArea = value;
    }

    /**
     * Жилая площадь помещения по паспорту помещения
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossArea() {
        return grossArea;
    }

    /**
     * Sets the value of the grossArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getGrossArea()
     */
    public void setGrossArea(BigDecimal value) {
        this.grossArea = value;
    }

    /**
     * Отсутствует значение жилой площади
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoGrossArea() {
        return noGrossArea;
    }

    /**
     * Sets the value of the noGrossArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoGrossArea()
     */
    public void setNoGrossArea(Boolean value) {
        this.noGrossArea = value;
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

}
