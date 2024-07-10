
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об объекте жилищного фонда (ОЖФ) для запроса экспорта запросов/подзапросов (версия 14.0.0.0)
 * 
 * <p>Java class for ExportHMObjectInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportHMObjectInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HMobjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="adressType" type="{http://dom.gosuslugi.ru/schema/integration/drs/}AdressType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportHMObjectInfoType", propOrder = {
    "hMobjectGUID",
    "adressType"
})
public class ExportHMObjectInfoType {

    /**
     * Идентификатор дома/помещения/комнаты в Реестре адресных объектов ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "HMobjectGUID", required = true)
    protected String hMobjectGUID;
    /**
     * Тип объекта.
     * 						Возможные значения:
     * 						Apartment - Помещение/блок,
     * 						Room - Комната,
     * 						House - Жилой дом
     * 
     */
    @XmlElement(required = true)
    protected String adressType;

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
     * 						Apartment - Помещение/блок,
     * 						Room - Комната,
     * 						House - Жилой дом
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

}
