
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Сведения об адресе подключаемого объекта
 * 
 * <p>Java class for ObjectAddressInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ObjectAddressInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AddressType"/>
 *         <element name="AdditionalAddressInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectAddressInfoType", propOrder = {
    "fiasAddress",
    "additionalAddressInfo"
})
public class ObjectAddressInfoType {

    /**
     * Сведения об адресе из ФИАС
     * 
     */
    @XmlElement(name = "FIASAddress", required = true)
    protected AddressType fiasAddress;
    /**
     * Дополнительная информация об адресе подключаемого объекта
     * 
     */
    @XmlElement(name = "AdditionalAddressInfo")
    protected String additionalAddressInfo;

    /**
     * Сведения об адресе из ФИАС
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getFIASAddress() {
        return fiasAddress;
    }

    /**
     * Sets the value of the fiasAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     * @see #getFIASAddress()
     */
    public void setFIASAddress(AddressType value) {
        this.fiasAddress = value;
    }

    /**
     * Дополнительная информация об адресе подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAddressInfo() {
        return additionalAddressInfo;
    }

    /**
     * Sets the value of the additionalAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalAddressInfo()
     */
    public void setAdditionalAddressInfo(String value) {
        this.additionalAddressInfo = value;
    }

}
