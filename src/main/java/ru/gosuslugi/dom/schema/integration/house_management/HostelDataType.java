
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Данные общежития
 * 
 * <p>Java class for HostelDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HostelDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element name="IsRegionProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element name="IsMunicipalProperty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         </sequence>
 *         <element name="HostelType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostelDataType", propOrder = {
    "isRegionProperty",
    "isMunicipalProperty",
    "hostelType"
})
public class HostelDataType {

    /**
     * Дом находится в собственности субъекта Российской Федерации и в полном объеме используется в качестве общежития
     * 
     */
    @XmlElement(name = "IsRegionProperty")
    protected Boolean isRegionProperty;
    /**
     * Дом находится в муниципальной собственности и в полном объеме используется в качестве общежития
     * 
     */
    @XmlElement(name = "IsMunicipalProperty")
    protected Boolean isMunicipalProperty;
    /**
     * Тип общежития (заполняется значениями из справочника НСИ 362)
     * 
     */
    @XmlElement(name = "HostelType")
    protected NsiRef hostelType;

    /**
     * Дом находится в собственности субъекта Российской Федерации и в полном объеме используется в качестве общежития
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegionProperty() {
        return isRegionProperty;
    }

    /**
     * Sets the value of the isRegionProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRegionProperty()
     */
    public void setIsRegionProperty(Boolean value) {
        this.isRegionProperty = value;
    }

    /**
     * Дом находится в муниципальной собственности и в полном объеме используется в качестве общежития
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMunicipalProperty() {
        return isMunicipalProperty;
    }

    /**
     * Sets the value of the isMunicipalProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsMunicipalProperty()
     */
    public void setIsMunicipalProperty(Boolean value) {
        this.isMunicipalProperty = value;
    }

    /**
     * Тип общежития (заполняется значениями из справочника НСИ 362)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getHostelType() {
        return hostelType;
    }

    /**
     * Sets the value of the hostelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getHostelType()
     */
    public void setHostelType(NsiRef value) {
        this.hostelType = value;
    }

}
