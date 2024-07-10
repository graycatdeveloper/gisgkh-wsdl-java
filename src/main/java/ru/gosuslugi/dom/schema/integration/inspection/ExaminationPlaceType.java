
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Место проведения проверки.
 * 
 * <p>Java class for ExaminationPlaceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExaminationPlaceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}NumberType"/>
 *         <element name="PlaceAddressType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="PlaceObjectType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExaminationPlaceType", propOrder = {
    "orderNumber",
    "placeAddressType",
    "placeObjectType",
    "fiasHouseGuid",
    "additionalInfo"
})
public class ExaminationPlaceType {

    /**
     * Порядковый номер.
     * 
     */
    @XmlElement(name = "OrderNumber")
    protected int orderNumber;
    /**
     * Тип адреса
     * 
     * Обязательно к заполнению, если заполнен tns:FIASHouseGuid.
     * 
     * НСИ "Типы адресов объекта"
     * 
     */
    @XmlElement(name = "PlaceAddressType")
    protected NsiRef placeAddressType;
    /**
     * Тип объекта
     * 
     * Обязательно к заполнению, если заполнен tns:FIASHouseGuid.
     * 
     * НСИ "Тип объекта проведения ФГИС ЕРП"
     * 
     */
    @XmlElement(name = "PlaceObjectType")
    protected NsiRef placeObjectType;
    /**
     * Адрес дома.
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Дополнительная информция.
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;

    /**
     * Порядковый номер.
     * 
     */
    public int getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     */
    public void setOrderNumber(int value) {
        this.orderNumber = value;
    }

    /**
     * Тип адреса
     * 
     * Обязательно к заполнению, если заполнен tns:FIASHouseGuid.
     * 
     * НСИ "Типы адресов объекта"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getPlaceAddressType() {
        return placeAddressType;
    }

    /**
     * Sets the value of the placeAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getPlaceAddressType()
     */
    public void setPlaceAddressType(NsiRef value) {
        this.placeAddressType = value;
    }

    /**
     * Тип объекта
     * 
     * Обязательно к заполнению, если заполнен tns:FIASHouseGuid.
     * 
     * НСИ "Тип объекта проведения ФГИС ЕРП"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getPlaceObjectType() {
        return placeObjectType;
    }

    /**
     * Sets the value of the placeObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getPlaceObjectType()
     */
    public void setPlaceObjectType(NsiRef value) {
        this.placeObjectType = value;
    }

    /**
     * Адрес дома.
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

    /**
     * Дополнительная информция.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

}
