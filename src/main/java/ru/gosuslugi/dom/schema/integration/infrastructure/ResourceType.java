
package ru.gosuslugi.dom.schema.integration.infrastructure;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Ресурс
 * 
 * <p>Java class for ResourceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResourceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MunicipalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="TotalLoad" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
 *         <element name="IndustrialLoad" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
 *         <element name="SocialLoad" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
 *         <element name="PopulationLoad" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}PowerType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceType", propOrder = {
    "municipalResource",
    "totalLoad",
    "industrialLoad",
    "socialLoad",
    "populationLoad"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.infrastructure.InfrastructureType.ObjectProperty.Resources.class,
    ru.gosuslugi.dom.schema.integration.infrastructure.InfrastructureType.ObjectProperty.TransportationResources.class
})
public class ResourceType {

    /**
     * Ссылка на НСИ "Вид коммунального ресурса" (реестровый номер 2)
     * 
     */
    @XmlElement(name = "MunicipalResource", required = true)
    protected NsiRef municipalResource;
    /**
     * Присоединенная нагрузка, в т.ч.:
     * 
     */
    @XmlElement(name = "TotalLoad")
    protected BigDecimal totalLoad;
    /**
     * Промышленность
     * 
     */
    @XmlElement(name = "IndustrialLoad")
    protected BigDecimal industrialLoad;
    /**
     * Социальная сфера
     * 
     */
    @XmlElement(name = "SocialLoad")
    protected BigDecimal socialLoad;
    /**
     * Население
     * 
     */
    @XmlElement(name = "PopulationLoad")
    protected BigDecimal populationLoad;

    /**
     * Ссылка на НСИ "Вид коммунального ресурса" (реестровый номер 2)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(NsiRef value) {
        this.municipalResource = value;
    }

    /**
     * Присоединенная нагрузка, в т.ч.:
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalLoad() {
        return totalLoad;
    }

    /**
     * Sets the value of the totalLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalLoad()
     */
    public void setTotalLoad(BigDecimal value) {
        this.totalLoad = value;
    }

    /**
     * Промышленность
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndustrialLoad() {
        return industrialLoad;
    }

    /**
     * Sets the value of the industrialLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getIndustrialLoad()
     */
    public void setIndustrialLoad(BigDecimal value) {
        this.industrialLoad = value;
    }

    /**
     * Социальная сфера
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSocialLoad() {
        return socialLoad;
    }

    /**
     * Sets the value of the socialLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSocialLoad()
     */
    public void setSocialLoad(BigDecimal value) {
        this.socialLoad = value;
    }

    /**
     * Население
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPopulationLoad() {
        return populationLoad;
    }

    /**
     * Sets the value of the populationLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPopulationLoad()
     */
    public void setPopulationLoad(BigDecimal value) {
        this.populationLoad = value;
    }

}
