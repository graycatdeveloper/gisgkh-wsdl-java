
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Импортируемые сведения об объекте жилищного фонда (ОЖФ) в запросе
 * 
 * <p>Java class for ImportHousingFundObjectInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportHousingFundObjectInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <sequence>
 *           <element name="houseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="addressDetails" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="255"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *         <choice>
 *           <sequence>
 *             <element name="HMObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="AddressType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}AdressType"/>
 *           </sequence>
 *           <element name="fiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </choice>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportHousingFundObjectInfoType", propOrder = {
    "houseGUID",
    "addressDetails",
    "hmObjectGUID",
    "addressType",
    "fiasHouseGUID"
})
public class ImportHousingFundObjectInfoType {

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
     * Идентификатор объекта жилищного фонда в Реестре адресных объектов ГИС ЖКХ. Обязателен для заполнения для всех типов, кроме жилой дом. Если тип = жилой дом. то может быть заполнен, либо HMObjectGUID, либо fiasHouseGUID
     * 
     */
    @XmlElement(name = "HMObjectGUID")
    protected String hmObjectGUID;
    /**
     * Тип объекта.
     * 						Возможные значения:
     * 						Apartment - Помещение/блок,
     * 						Room - Комната,
     * 						House - Жилой дом
     * 
     */
    @XmlElement(name = "AddressType")
    protected String addressType;
    /**
     * Идентификатор ФИАС. Может быть заполнен, если тип объекта = жилой дом
     * 
     */
    protected String fiasHouseGUID;

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
     * Идентификатор объекта жилищного фонда в Реестре адресных объектов ГИС ЖКХ. Обязателен для заполнения для всех типов, кроме жилой дом. Если тип = жилой дом. то может быть заполнен, либо HMObjectGUID, либо fiasHouseGUID
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMObjectGUID() {
        return hmObjectGUID;
    }

    /**
     * Sets the value of the hmObjectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHMObjectGUID()
     */
    public void setHMObjectGUID(String value) {
        this.hmObjectGUID = value;
    }

    /**
     * Тип объекта.
     * 						Возможные значения:
     * 						Apartment - Помещение/блок,
     * 						Room - Комната,
     * 						House - Жилой дом
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAddressType()
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Идентификатор ФИАС. Может быть заполнен, если тип объекта = жилой дом
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

}
