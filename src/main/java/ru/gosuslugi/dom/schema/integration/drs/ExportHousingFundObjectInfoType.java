
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемые сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
 * 
 * <p>Java class for ExportHousingFundObjectInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportHousingFundObjectInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <element name="houseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="addressDetails" minOccurs="0">
 *               <simpleType>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                   <maxLength value="255"/>
 *                 </restriction>
 *               </simpleType>
 *             </element>
 *           </sequence>
 *           <sequence>
 *             <element name="HMobjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="adressType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}AdressType"/>
 *           </sequence>
 *         </choice>
 *         <sequence>
 *           <element name="fiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <element name="address">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="4000"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportHousingFundObjectInfoType", propOrder = {
    "houseGUID",
    "addressDetails",
    "hMobjectGUID",
    "adressType",
    "fiasHouseGUID",
    "address"
})
public class ExportHousingFundObjectInfoType {

    /**
     * Идентификатор дома (либо в Реестре адресных объектов ГИС ЖКХ, либо в справочнике ФИАС)
     * 
     */
    protected String houseGUID;
    /**
     * Дополнительная информация об ОЖФ (номер квартиры / помещения, комнаты, блока жилого дома).
     * 
     * Обязателен для ОЖФ, имеющих тип многоквартирный дом или жилой дом блокированной застройки. Не указывается для ОЖФ, имеющих тип жилой дом
     * 
     */
    protected String addressDetails;
    /**
     * Идентификатор дома/помещения/комнаты в Реестре адресных объектов ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "HMobjectGUID")
    protected String hMobjectGUID;
    /**
     * Тип объекта.
     * 						Возможные значения:
     * 						Appartment - Помещение/блок,
     * 						Room - Комната,
     * 						House - Жилой дом
     * 						Заполняется только для новой версии
     * 
     */
    protected String adressType;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    protected String fiasHouseGUID;
    /**
     * Адресная строка
     * 
     */
    @XmlElement(required = true)
    protected String address;

    /**
     * Идентификатор дома (либо в Реестре адресных объектов ГИС ЖКХ, либо в справочнике ФИАС)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseGUID() {
        return houseGUID;
    }

    /**
     * Sets the value of the houseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseGUID()
     */
    public void setHouseGUID(String value) {
        this.houseGUID = value;
    }

    /**
     * Дополнительная информация об ОЖФ (номер квартиры / помещения, комнаты, блока жилого дома).
     * 
     * Обязателен для ОЖФ, имеющих тип многоквартирный дом или жилой дом блокированной застройки. Не указывается для ОЖФ, имеющих тип жилой дом
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddressDetails()
     */
    public void setAddressDetails(String value) {
        this.addressDetails = value;
    }

    /**
     * Идентификатор дома/помещения/комнаты в Реестре адресных объектов ГИС ЖКХ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMobjectGUID() {
        return hMobjectGUID;
    }

    /**
     * Sets the value of the hMobjectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHMobjectGUID()
     */
    public void setHMobjectGUID(String value) {
        this.hMobjectGUID = value;
    }

    /**
     * Тип объекта.
     * 						Возможные значения:
     * 						Appartment - Помещение/блок,
     * 						Room - Комната,
     * 						House - Жилой дом
     * 						Заполняется только для новой версии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressType() {
        return adressType;
    }

    /**
     * Sets the value of the adressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdressType()
     */
    public void setAdressType(String value) {
        this.adressType = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiasHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFiasHouseGUID()
     */
    public void setFiasHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Адресная строка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddress()
     */
    public void setAddress(String value) {
        this.address = value;
    }

}
