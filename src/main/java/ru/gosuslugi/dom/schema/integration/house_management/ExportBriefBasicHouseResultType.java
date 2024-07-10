
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * Результат экпорта краткой базовой информации об одном доме.
 * 
 * <p>Java class for ExportBriefBasicHouseResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportBriefBasicHouseResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="BasicHouseInfo" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefBasicHouseType"/>
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
@XmlType(name = "ExportBriefBasicHouseResultType", propOrder = {
    "transportGUID",
    "basicHouseInfo",
    "error"
})
public class ExportBriefBasicHouseResultType {

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
    @XmlElement(name = "BasicHouseInfo")
    protected BriefBasicHouseType basicHouseInfo;
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
     *     {@link BriefBasicHouseType }
     *     
     */
    public BriefBasicHouseType getBasicHouseInfo() {
        return basicHouseInfo;
    }

    /**
     * Sets the value of the basicHouseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BriefBasicHouseType }
     *     
     * @see #getBasicHouseInfo()
     */
    public void setBasicHouseInfo(BriefBasicHouseType value) {
        this.basicHouseInfo = value;
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
