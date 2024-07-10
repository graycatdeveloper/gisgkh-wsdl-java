
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация об аннулированном объекте жилищного фонда, указанном в записи в реестре сведений о задолженности.
 * 				Запролняется, если судебный акт ссылается на аннулированный в ГИС ЖКХ объект жилищного фонда.
 * 
 * <p>Java class for CancelledAddressType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CancelledAddressType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cancelledAddressText">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="4000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="fiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="HCSHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="HMobjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelledAddressType", propOrder = {
    "cancelledAddressText",
    "fiasHouseGUID",
    "hcsHouseGUID",
    "hMobjectGUID"
})
public class CancelledAddressType {

    /**
     * Адрес аннулированного объекта жилищного фонда.
     * 
     */
    @XmlElement(required = true)
    protected String cancelledAddressText;
    /**
     * Глобальный уникальный идентификатор аннулированного дома по ФИАС
     * 
     */
    protected String fiasHouseGUID;
    /**
     * Идентификационный код аннулированного дома в ГИС ЖКХ.Адреса объектов, добавленных по заявкам на добавление в ФИАС, выгружаются в открытой части ГИС ЖКХ в разделе «Регламенты и инструкции».
     * 
     */
    @XmlElement(name = "HCSHouseGUID")
    protected String hcsHouseGUID;
    /**
     * Глобальный уникальный идентификатор аннулированного объекта жилищного фонда в Реестре адресных объектов ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "HMobjectGUID", required = true)
    protected String hMobjectGUID;

    /**
     * Адрес аннулированного объекта жилищного фонда.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledAddressText() {
        return cancelledAddressText;
    }

    /**
     * Sets the value of the cancelledAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCancelledAddressText()
     */
    public void setCancelledAddressText(String value) {
        this.cancelledAddressText = value;
    }

    /**
     * Глобальный уникальный идентификатор аннулированного дома по ФИАС
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
     * Идентификационный код аннулированного дома в ГИС ЖКХ.Адреса объектов, добавленных по заявкам на добавление в ФИАС, выгружаются в открытой части ГИС ЖКХ в разделе «Регламенты и инструкции».
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHCSHouseGUID() {
        return hcsHouseGUID;
    }

    /**
     * Sets the value of the hcsHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHCSHouseGUID()
     */
    public void setHCSHouseGUID(String value) {
        this.hcsHouseGUID = value;
    }

    /**
     * Глобальный уникальный идентификатор аннулированного объекта жилищного фонда в Реестре адресных объектов ГИС ЖКХ.
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

}
