
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * Результат запроса краткой информации о жилом доме.
 * 
 * <p>Java class for ExportBriefLivingHouseResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportBriefLivingHouseResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="LivingHouseInfo" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefLivingHouseType"/>
 *           <element name="Error" type="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessageType" maxOccurs="unbounded"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportBriefLivingHouseResultType", propOrder = {
    "transportGUID",
    "livingHouseInfo",
    "error"
})
public class ExportBriefLivingHouseResultType {

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", required = true)
    protected String transportGUID;
    /**
     * Базовая информация о доме
     * 
     */
    @XmlElement(name = "LivingHouseInfo")
    protected BriefLivingHouseType livingHouseInfo;
    /**
     * Описание ошибки
     * 
     */
    @XmlElement(name = "Error")
    protected List<ErrorMessageType> error;

    /**
     * Транспортный идентификатор
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportGUID() {
        return transportGUID;
    }

    /**
     * Sets the value of the transportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransportGUID()
     */
    public void setTransportGUID(String value) {
        this.transportGUID = value;
    }

    /**
     * Базовая информация о доме
     * 
     * @return
     *     possible object is
     *     {@link BriefLivingHouseType }
     *     
     */
    public BriefLivingHouseType getLivingHouseInfo() {
        return livingHouseInfo;
    }

    /**
     * Sets the value of the livingHouseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefLivingHouseType }
     *     
     * @see #getLivingHouseInfo()
     */
    public void setLivingHouseInfo(BriefLivingHouseType value) {
        this.livingHouseInfo = value;
    }

    /**
     * Описание ошибки
     * 
     * Gets the value of the error property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorMessageType }
     * </p>
     * 
     * 
     * @return
     *     The value of the error property.
     */
    public List<ErrorMessageType> getError() {
        if (error == null) {
            error = new ArrayList<>();
        }
        return this.error;
    }

}
