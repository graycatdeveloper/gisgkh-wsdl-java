
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ссылка на справочник
 * 
 * <p>Java class for nsiRef complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="nsiRef">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiCodeType"/>
 *         <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Name" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <maxLength value="1200"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiRef", propOrder = {
    "code",
    "guid",
    "name"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.QualityResourcesType.ServiceType.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.QualityResourcesType.MunicipalResource.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.QualityResourcesType.QualityIndicatorResource.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.VolumeResourcesType.ServiceType.class,
    ru.gosuslugi.dom.schema.integration.volume_quality.VolumeResourcesType.MunicipalResource.class
})
public class NsiRef {

    /**
     * Код записи справочника
     * 
     */
    @XmlElement(name = "Code", required = true)
    protected String code;
    /**
     * Идентификатор записи в соответствующем справочнике ГИС ЖКХ
     * 
     */
    @XmlElement(name = "GUID", required = true)
    protected String guid;
    /**
     * Значение
     * 
     */
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Код записи справочника
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Идентификатор записи в соответствующем справочнике ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGUID()
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Значение
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

}
