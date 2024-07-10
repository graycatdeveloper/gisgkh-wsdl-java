
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Жилое помещение (обновление данных для ОМС)
 * 
 * <p>Java class for ResidentialPremisesUpdateOMSType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResidentialPremisesUpdateOMSType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesBasicUpdateOMSType">
 *       <sequence>
 *         <choice>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}EntranceNum"/>
 *           <element name="HasNoEntrance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="FIASChildHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="PremisesCharacteristic" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="GrossArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType"/>
 *           <element name="NoGrossArea" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="TotalArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentialPremisesUpdateOMSType", propOrder = {
    "entranceNum",
    "hasNoEntrance",
    "fiasChildHouseGuid",
    "premisesCharacteristic",
    "grossArea",
    "noGrossArea",
    "totalArea"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportHouseOMSRequest.ApartmentHouse.ResidentialPremises.ResidentialPremisesToUpdate.class
})
public class ResidentialPremisesUpdateOMSType
    extends PremisesBasicUpdateOMSType
{

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
     * ГУИД дочернего дома по ФИАС, к которому относится подъезд для группирующих домов
     * 
     */
    @XmlElement(name = "FIASChildHouseGuid")
    protected String fiasChildHouseGuid;
    /**
     * Характеристика помещения (НСИ 30)
     * 
     */
    @XmlElement(name = "PremisesCharacteristic")
    protected NsiRef premisesCharacteristic;
    /**
     * Жилая площадь жилого помещения по паспорту помещения
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
     * Общая площадь жилого помещения по паспорту помещения
     * 
     */
    @XmlElement(name = "TotalArea")
    protected BigDecimal totalArea;

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
     * Жилая площадь жилого помещения по паспорту помещения
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
     * Общая площадь жилого помещения по паспорту помещения
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

}
