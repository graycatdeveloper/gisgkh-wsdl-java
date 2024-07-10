
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий запрос на экспорт краткой базовой информации об одном доме
 * 
 * <p>Java class for ExportBriefBasicHouseRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportBriefBasicHouseRequestType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *         <element name="Criteria" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportBriefBasicCriteriaType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportBriefBasicHouseRequestType", propOrder = {
    "transportGUID",
    "criteria"
})
public class ExportBriefBasicHouseRequestType {

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Критерий поиска
     * 
     */
    @XmlElement(name = "Criteria", required = true)
    protected ExportBriefBasicCriteriaType criteria;

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
     * Критерий поиска
     * 
     * @return
     *     possible object is
     *     {@link ExportBriefBasicCriteriaType }
     *     
     */
    public ExportBriefBasicCriteriaType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportBriefBasicCriteriaType }
     *     
     * @see #getCriteria()
     */
    public void setCriteria(ExportBriefBasicCriteriaType value) {
        this.criteria = value;
    }

}
