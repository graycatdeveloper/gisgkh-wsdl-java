
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Блок дома блокированной застройки  (для импорта от РСО)
 * 
 * <p>Java class for BlockRSOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BlockRSOType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyRSOType">
 *       <sequence>
 *         <element name="BlockNum" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType"/>
 *         <element name="PremisesCharacteristic" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="TotalArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
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
@XmlType(name = "BlockRSOType", propOrder = {
    "blockNum",
    "premisesCharacteristic",
    "totalArea",
    "category"
})
public class BlockRSOType
    extends GKNEGRPKeyRSOType
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
