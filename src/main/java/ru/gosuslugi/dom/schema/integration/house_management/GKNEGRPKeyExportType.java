
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения из ГКН и ЕГРП для экспорта
 * 
 * <p>Java class for GKN_EGRP_KeyExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GKN_EGRP_KeyExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CadastralNumber"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}No_RSO_GKN_EGRP_Registered"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}No_RSO_GKN_EGRP_Data"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GKN_EGRP_KeyExportType", propOrder = {
    "cadastralNumber",
    "noRSOGKNEGRPRegistered",
    "noRSOGKNEGRPData"
})
@XmlSeeAlso({
    OGFExportStatusType.class
})
public class GKNEGRPKeyExportType {

    /**
     * Объект в ГИС ЖКХ привязан к ГКН.
     * 
     */
    @XmlElement(name = "CadastralNumber")
    protected String cadastralNumber;
    /**
     * Объект в ГИС ЖКХ не привязан к ГКН (у объекта отсутствует кадастровый номер или информация из Росреестра об объекте не размещена в ГИС ЖКХ). Объект может быть привязан к ЕГРП.
     * 
     */
    @XmlElement(name = "No_RSO_GKN_EGRP_Registered")
    protected Boolean noRSOGKNEGRPRegistered;
    /**
     * Не используется, оставлен для совместимости.
     * 
     */
    @XmlElement(name = "No_RSO_GKN_EGRP_Data")
    protected Boolean noRSOGKNEGRPData;

    /**
     * Объект в ГИС ЖКХ привязан к ГКН.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadastralNumber() {
        return cadastralNumber;
    }

    /**
     * Sets the value of the cadastralNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCadastralNumber()
     */
    public void setCadastralNumber(String value) {
        this.cadastralNumber = value;
    }

    /**
     * Объект в ГИС ЖКХ не привязан к ГКН (у объекта отсутствует кадастровый номер или информация из Росреестра об объекте не размещена в ГИС ЖКХ). Объект может быть привязан к ЕГРП.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRSOGKNEGRPRegistered() {
        return noRSOGKNEGRPRegistered;
    }

    /**
     * Sets the value of the noRSOGKNEGRPRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoRSOGKNEGRPRegistered()
     */
    public void setNoRSOGKNEGRPRegistered(Boolean value) {
        this.noRSOGKNEGRPRegistered = value;
    }

    /**
     * Не используется, оставлен для совместимости.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRSOGKNEGRPData() {
        return noRSOGKNEGRPData;
    }

    /**
     * Sets the value of the noRSOGKNEGRPData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNoRSOGKNEGRPData()
     */
    public void setNoRSOGKNEGRPData(Boolean value) {
        this.noRSOGKNEGRPData = value;
    }

}
