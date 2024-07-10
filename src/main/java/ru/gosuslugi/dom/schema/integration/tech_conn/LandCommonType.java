
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Общие сведения о земельном участке
 * 
 * <p>Java class for LandCommonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LandCommonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="CadastralNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}CadastralNumberType"/>
 *           <element name="OtherNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OtherNumberType"/>
 *         </choice>
 *         <element name="LandRightsRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LandCommonType", propOrder = {
    "cadastralNumber",
    "otherNumber",
    "landRightsRegistered"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportOrganizationDeterminationApplicationType.Land.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportTechnicalSpecificationApplicationType.Land.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.ExportConnectionPossibilityApplicationType.Land.class,
    ru.gosuslugi.dom.schema.integration.tech_conn.AgreementApplicationType.ApplicationVersion.Land.class
})
public class LandCommonType {

    /**
     * Кадастровый номер земельного участка
     * 
     */
    @XmlElement(name = "CadastralNumber")
    protected String cadastralNumber;
    /**
     * Условный номер земельного участка
     * 
     */
    @XmlElement(name = "OtherNumber")
    protected String otherNumber;
    /**
     * Права на земельный участок зарегистрированы в Росреестре
     * 
     */
    @XmlElement(name = "LandRightsRegistered")
    protected boolean landRightsRegistered;

    /**
     * Кадастровый номер земельного участка
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
     * Условный номер земельного участка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNumber() {
        return otherNumber;
    }

    /**
     * Sets the value of the otherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOtherNumber()
     */
    public void setOtherNumber(String value) {
        this.otherNumber = value;
    }

    /**
     * Права на земельный участок зарегистрированы в Росреестре
     * 
     */
    public boolean isLandRightsRegistered() {
        return landRightsRegistered;
    }

    /**
     * Sets the value of the landRightsRegistered property.
     * 
     */
    public void setLandRightsRegistered(boolean value) {
        this.landRightsRegistered = value;
    }

}
