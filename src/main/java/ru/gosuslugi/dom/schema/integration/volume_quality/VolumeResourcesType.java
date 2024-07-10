
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип для информации об объеме КР
 * 
 * <p>Java class for VolumeResourcesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VolumeResourcesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ObjectAddress">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ServiceType">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element name="MunicipalResource">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="CommunalResource" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         </choice>
 *         <choice>
 *           <element name="VolumeNotEnergyResource" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeNotEnergyResourceType"/>
 *           <element name="VolumeEnergyResource" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeEnergyResourceType"/>
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
@XmlType(name = "VolumeResourcesType", propOrder = {
    "objectAddress",
    "serviceType",
    "municipalResource",
    "communalResource",
    "volumeNotEnergyResource",
    "volumeEnergyResource"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.VolumeResources.class
})
public class VolumeResourcesType {

    /**
     * ОЖФ
     * 
     */
    @XmlElement(name = "ObjectAddress", required = true)
    protected VolumeResourcesType.ObjectAddress objectAddress;
    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected VolumeResourcesType.ServiceType serviceType;
    /**
     * Тарифицируемый  ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239). Заполняется, если в основании указан ДРСО
     * 
     */
    @XmlElement(name = "MunicipalResource")
    protected VolumeResourcesType.MunicipalResource municipalResource;
    /**
     * Вид коммунального ресурса. Ссылка на НСИ "Вид коммунального ресурса" (реестровый номер 2). Заполняется, если в основании указан ДУ (устав)
     * 
     */
    @XmlElement(name = "CommunalResource")
    protected NsiRef communalResource;
    /**
     * Объем ресурса. Указывается для всех ресурсов, кроме "Электрическая энергия"
     * 
     */
    @XmlElement(name = "VolumeNotEnergyResource")
    protected VolumeNotEnergyResourceType volumeNotEnergyResource;
    /**
     * Объем ресурса "Электрическая энергия"
     * 
     */
    @XmlElement(name = "VolumeEnergyResource")
    protected VolumeEnergyResourceType volumeEnergyResource;

    /**
     * ОЖФ
     * 
     * @return
     *     possible object is
     *     {@link VolumeResourcesType.ObjectAddress }
     *     
     */
    public VolumeResourcesType.ObjectAddress getObjectAddress() {
        return objectAddress;
    }

    /**
     * Sets the value of the objectAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeResourcesType.ObjectAddress }
     *     
     * @see #getObjectAddress()
     */
    public void setObjectAddress(VolumeResourcesType.ObjectAddress value) {
        this.objectAddress = value;
    }

    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
     * 
     * @return
     *     possible object is
     *     {@link VolumeResourcesType.ServiceType }
     *     
     */
    public VolumeResourcesType.ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeResourcesType.ServiceType }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(VolumeResourcesType.ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Тарифицируемый  ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239). Заполняется, если в основании указан ДРСО
     * 
     * @return
     *     possible object is
     *     {@link VolumeResourcesType.MunicipalResource }
     *     
     */
    public VolumeResourcesType.MunicipalResource getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeResourcesType.MunicipalResource }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(VolumeResourcesType.MunicipalResource value) {
        this.municipalResource = value;
    }

    /**
     * Вид коммунального ресурса. Ссылка на НСИ "Вид коммунального ресурса" (реестровый номер 2). Заполняется, если в основании указан ДУ (устав)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getCommunalResource() {
        return communalResource;
    }

    /**
     * Sets the value of the communalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getCommunalResource()
     */
    public void setCommunalResource(NsiRef value) {
        this.communalResource = value;
    }

    /**
     * Объем ресурса. Указывается для всех ресурсов, кроме "Электрическая энергия"
     * 
     * @return
     *     possible object is
     *     {@link VolumeNotEnergyResourceType }
     *     
     */
    public VolumeNotEnergyResourceType getVolumeNotEnergyResource() {
        return volumeNotEnergyResource;
    }

    /**
     * Sets the value of the volumeNotEnergyResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeNotEnergyResourceType }
     *     
     * @see #getVolumeNotEnergyResource()
     */
    public void setVolumeNotEnergyResource(VolumeNotEnergyResourceType value) {
        this.volumeNotEnergyResource = value;
    }

    /**
     * Объем ресурса "Электрическая энергия"
     * 
     * @return
     *     possible object is
     *     {@link VolumeEnergyResourceType }
     *     
     */
    public VolumeEnergyResourceType getVolumeEnergyResource() {
        return volumeEnergyResource;
    }

    /**
     * Sets the value of the volumeEnergyResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeEnergyResourceType }
     *     
     * @see #getVolumeEnergyResource()
     */
    public void setVolumeEnergyResource(VolumeEnergyResourceType value) {
        this.volumeEnergyResource = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MunicipalResource
        extends NsiRef
    {


    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ObjectAddress
        extends ObjectAddressType
    {


    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ServiceType
        extends NsiRef
    {


    }

}
