
package ru.gosuslugi.dom.schema.integration.volume_quality;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип для информации о показателях качества КР
 * 
 * <p>Java class for QualityResourcesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="QualityResourcesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ObjectAddress">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
 *                 <sequence>
 *                   <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ServiceType" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MunicipalResource" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="IsSignedAct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <choice>
 *           <element name="QualityIndicatorResource">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                   <sequence>
 *                     <element name="IndicatorValue" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorValueType" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="OtherQualityIndicatorResource">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}OtherQualityIndicatorType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlType(name = "QualityResourcesType", propOrder = {
    "objectAddress",
    "serviceType",
    "municipalResource",
    "isSignedAct",
    "qualityIndicatorResource",
    "otherQualityIndicatorResource"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.volume_quality.ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityResources.class
})
public class QualityResourcesType {

    /**
     * Объект жилищного фонда
     * 
     */
    @XmlElement(name = "ObjectAddress", required = true)
    protected QualityResourcesType.ObjectAddress objectAddress;
    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3) Заполняется только для основания с типом "ДРСО"
     * 
     */
    @XmlElement(name = "ServiceType")
    protected QualityResourcesType.ServiceType serviceType;
    /**
     * Тарифицируемый  ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239). Заполняется только для основания с типом "ДРСО"
     * 
     */
    @XmlElement(name = "MunicipalResource")
    protected QualityResourcesType.MunicipalResource municipalResource;
    /**
     * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда. Доступно для заполнения только для основания с типом "ДРСО"
     * 
     */
    @XmlElement(name = "IsSignedAct")
    protected Boolean isSignedAct;
    /**
     * Справочный показатель качества КР. Ссылка на НСИ "Показатели качества коммунальных ресурсов" (реестровый номер 276). Заполняется только основания с типом "ДРСО"
     * 
     */
    @XmlElement(name = "QualityIndicatorResource")
    protected QualityResourcesType.QualityIndicatorResource qualityIndicatorResource;
    /**
     * Иной показатель качества КР
     * 
     */
    @XmlElement(name = "OtherQualityIndicatorResource")
    protected QualityResourcesType.OtherQualityIndicatorResource otherQualityIndicatorResource;

    /**
     * Объект жилищного фонда
     * 
     * @return
     *     possible object is
     *     {@link QualityResourcesType.ObjectAddress }
     *     
     */
    public QualityResourcesType.ObjectAddress getObjectAddress() {
        return objectAddress;
    }

    /**
     * Sets the value of the objectAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityResourcesType.ObjectAddress }
     *     
     * @see #getObjectAddress()
     */
    public void setObjectAddress(QualityResourcesType.ObjectAddress value) {
        this.objectAddress = value;
    }

    /**
     * Вид КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3) Заполняется только для основания с типом "ДРСО"
     * 
     * @return
     *     possible object is
     *     {@link QualityResourcesType.ServiceType }
     *     
     */
    public QualityResourcesType.ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityResourcesType.ServiceType }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(QualityResourcesType.ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Тарифицируемый  ресурс. Ссылка на НСИ "Тарифицируемый ресурс" (реестровый номер 239). Заполняется только для основания с типом "ДРСО"
     * 
     * @return
     *     possible object is
     *     {@link QualityResourcesType.MunicipalResource }
     *     
     */
    public QualityResourcesType.MunicipalResource getMunicipalResource() {
        return municipalResource;
    }

    /**
     * Sets the value of the municipalResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityResourcesType.MunicipalResource }
     *     
     * @see #getMunicipalResource()
     */
    public void setMunicipalResource(QualityResourcesType.MunicipalResource value) {
        this.municipalResource = value;
    }

    /**
     * Наличие подписанного акта проверки предоставления коммунальных услуг для данного объекта жилищного фонда. Доступно для заполнения только для основания с типом "ДРСО"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSignedAct() {
        return isSignedAct;
    }

    /**
     * Sets the value of the isSignedAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsSignedAct()
     */
    public void setIsSignedAct(Boolean value) {
        this.isSignedAct = value;
    }

    /**
     * Справочный показатель качества КР. Ссылка на НСИ "Показатели качества коммунальных ресурсов" (реестровый номер 276). Заполняется только основания с типом "ДРСО"
     * 
     * @return
     *     possible object is
     *     {@link QualityResourcesType.QualityIndicatorResource }
     *     
     */
    public QualityResourcesType.QualityIndicatorResource getQualityIndicatorResource() {
        return qualityIndicatorResource;
    }

    /**
     * Sets the value of the qualityIndicatorResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityResourcesType.QualityIndicatorResource }
     *     
     * @see #getQualityIndicatorResource()
     */
    public void setQualityIndicatorResource(QualityResourcesType.QualityIndicatorResource value) {
        this.qualityIndicatorResource = value;
    }

    /**
     * Иной показатель качества КР
     * 
     * @return
     *     possible object is
     *     {@link QualityResourcesType.OtherQualityIndicatorResource }
     *     
     */
    public QualityResourcesType.OtherQualityIndicatorResource getOtherQualityIndicatorResource() {
        return otherQualityIndicatorResource;
    }

    /**
     * Sets the value of the otherQualityIndicatorResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityResourcesType.OtherQualityIndicatorResource }
     *     
     * @see #getOtherQualityIndicatorResource()
     */
    public void setOtherQualityIndicatorResource(QualityResourcesType.OtherQualityIndicatorResource value) {
        this.otherQualityIndicatorResource = value;
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
     *       <sequence>
     *         <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notFromContract"
    })
    public static class ObjectAddress
        extends ObjectAddressType
    {

        /**
         * Помещение/блок или комната не из договора (основания).                         Присылается, если импортируется помещение/блок или комната, отсутствующее в указанном основании
         * 
         */
        @XmlElement(name = "NotFromContract")
        protected Boolean notFromContract;

        /**
         * Помещение/блок или комната не из договора (основания).                         Присылается, если импортируется помещение/блок или комната, отсутствующее в указанном основании
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotFromContract() {
            return notFromContract;
        }

        /**
         * Sets the value of the notFromContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNotFromContract()
         */
        public void setNotFromContract(Boolean value) {
            this.notFromContract = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}OtherQualityIndicatorType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OtherQualityIndicatorResource
        extends OtherQualityIndicatorType
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
     *       <sequence>
     *         <element name="IndicatorValue" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IndicatorValueType" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "indicatorValue"
    })
    public static class QualityIndicatorResource
        extends NsiRef
    {

        /**
         * Значение показателя качества.                           Заполняется, только если присылается tns:IsSignedAct
         * 
         */
        @XmlElement(name = "IndicatorValue")
        protected IndicatorValueType indicatorValue;

        /**
         * Значение показателя качества.                           Заполняется, только если присылается tns:IsSignedAct
         * 
         * @return
         *     possible object is
         *     {@link IndicatorValueType }
         *     
         */
        public IndicatorValueType getIndicatorValue() {
            return indicatorValue;
        }

        /**
         * Sets the value of the indicatorValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndicatorValueType }
         *     
         * @see #getIndicatorValue()
         */
        public void setIndicatorValue(IndicatorValueType value) {
            this.indicatorValue = value;
        }

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
