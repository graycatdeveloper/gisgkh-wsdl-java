
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.Period;


/**
 * Тип данных, описывающий дом в решении
 * 
 * <p>Java class for HouseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HouseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="ManagementPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseType", propOrder = {
    "fiasHouseGuid",
    "managementPeriod"
})
public class HouseType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Период управления
     * 
     */
    @XmlElement(name = "ManagementPeriod", required = true)
    protected Period managementPeriod;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС/Идентификационный код дома в ГИС ЖКХ
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
     * Период управления
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getManagementPeriod() {
        return managementPeriod;
    }

    /**
     * Sets the value of the managementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getManagementPeriod()
     */
    public void setManagementPeriod(Period value) {
        this.managementPeriod = value;
    }

}
