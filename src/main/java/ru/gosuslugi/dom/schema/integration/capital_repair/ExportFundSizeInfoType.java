
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемая информация о размере фондов капитального ремонта
 * 
 * <p>Java class for exportFundSizeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportFundSizeInfoType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}FundSizeInfoType">
 *       <sequence>
 *         <element name="FundSizeInfoGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportFundSizeInfoType", propOrder = {
    "fundSizeInfoGuid",
    "status"
})
public class ExportFundSizeInfoType
    extends FundSizeInfoType
{

    /**
     * Идентификатор информации о размере фондов капитального ремонта
     * 
     */
    @XmlElement(name = "FundSizeInfoGuid", required = true)
    protected String fundSizeInfoGuid;
    /**
     * Статус версии
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusType status;

    /**
     * Идентификатор информации о размере фондов капитального ремонта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundSizeInfoGuid() {
        return fundSizeInfoGuid;
    }

    /**
     * Sets the value of the fundSizeInfoGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFundSizeInfoGuid()
     */
    public void setFundSizeInfoGuid(String value) {
        this.fundSizeInfoGuid = value;
    }

    /**
     * Статус версии
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
