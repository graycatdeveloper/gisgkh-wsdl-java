
package ru.gosuslugi.dom.schema.integration.volume_quality;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="importVolumeAndQualityInformation">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="Base">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}BaseType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="RegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *                   <choice>
 *                     <element name="RegistrationPeriodInformation">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}RegistrationPeriodType">
 *                             <sequence>
 *                               <element name="QualityResources" maxOccurs="1000" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityResourcesType">
 *                                       <sequence>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="QualityServices" maxOccurs="1000" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityServicesType">
 *                                       <sequence>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="VolumeResources" maxOccurs="1000" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourcesType">
 *                                       <sequence>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="PlacingRegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="AnnulmentRegistrationPeriod">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="ReasonOfAnnulment">
 *                                 <simpleType>
 *                                   <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ReasonOfAnnulmentType">
 *                                     <minLength value="1"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="DeleteProjectRegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="DeleteAddressObject">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="ObjectAddress" maxOccurs="1000">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
 *                                       <sequence>
 *                                         <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                                         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                                       </sequence>
 *                                     </extension>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.11.0.4""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importVolumeAndQualityInformation"
})
@XmlRootElement(name = "importVolumeAndQualityInformationRequest")
public class ImportVolumeAndQualityInformationRequest
    extends ru.gosuslugi.dom.schema.integration.base.BaseType
{

    /**
     * Информация об объеме и качестве КР и КУ
     * 
     */
    @XmlElement(required = true)
    protected ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation importVolumeAndQualityInformation;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Информация об объеме и качестве КР и КУ
     * 
     * @return
     *     possible object is
     *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation }
     *     
     */
    public ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation getImportVolumeAndQualityInformation() {
        return importVolumeAndQualityInformation;
    }

    /**
     * Sets the value of the importVolumeAndQualityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation }
     *     
     * @see #getImportVolumeAndQualityInformation()
     */
    public void setImportVolumeAndQualityInformation(ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation value) {
        this.importVolumeAndQualityInformation = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.11.0.4";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="Base">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}BaseType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="RegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
     *         <choice>
     *           <element name="RegistrationPeriodInformation">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}RegistrationPeriodType">
     *                   <sequence>
     *                     <element name="QualityResources" maxOccurs="1000" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityResourcesType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="QualityServices" maxOccurs="1000" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityServicesType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="VolumeResources" maxOccurs="1000" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourcesType">
     *                             <sequence>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="PlacingRegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="AnnulmentRegistrationPeriod">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="ReasonOfAnnulment">
     *                       <simpleType>
     *                         <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ReasonOfAnnulmentType">
     *                           <minLength value="1"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="DeleteProjectRegistrationPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="DeleteAddressObject">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="ObjectAddress" maxOccurs="1000">
     *                       <complexType>
     *                         <complexContent>
     *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
     *                             <sequence>
     *                               <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                             </sequence>
     *                           </extension>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "base",
        "registrationPeriod",
        "registrationPeriodInformation",
        "placingRegistrationPeriod",
        "annulmentRegistrationPeriod",
        "deleteProjectRegistrationPeriod",
        "deleteAddressObject"
    })
    public static class ImportVolumeAndQualityInformation {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Основание
         * 
         */
        @XmlElement(name = "Base", required = true)
        protected ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.Base base;
        /**
         * Период регистрации (месяц и год)
         * 
         */
        @XmlElement(name = "RegistrationPeriod", required = true)
        @XmlSchemaType(name = "gYearMonth")
        protected XMLGregorianCalendar registrationPeriod;
        /**
         * Добавление/изменение периода регистрации
         * 
         */
        @XmlElement(name = "RegistrationPeriodInformation")
        protected ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation registrationPeriodInformation;
        /**
         * Размещение периода регистрации
         * 
         */
        @XmlElement(name = "PlacingRegistrationPeriod")
        protected Boolean placingRegistrationPeriod;
        /**
         * Аннулирование периода регистрации
         * 
         */
        @XmlElement(name = "AnnulmentRegistrationPeriod")
        protected ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.AnnulmentRegistrationPeriod annulmentRegistrationPeriod;
        /**
         * Удаление проекта периода регистрации
         * 
         */
        @XmlElement(name = "DeleteProjectRegistrationPeriod")
        protected Boolean deleteProjectRegistrationPeriod;
        /**
         * Удаление информации об объекте жилищного фонда из периода регистрации
         * 
         */
        @XmlElement(name = "DeleteAddressObject")
        protected ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject deleteAddressObject;

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
         * Основание
         * 
         * @return
         *     possible object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.Base }
         *     
         */
        public ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.Base getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.Base }
         *     
         * @see #getBase()
         */
        public void setBase(ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.Base value) {
            this.base = value;
        }

        /**
         * Период регистрации (месяц и год)
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRegistrationPeriod() {
            return registrationPeriod;
        }

        /**
         * Sets the value of the registrationPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getRegistrationPeriod()
         */
        public void setRegistrationPeriod(XMLGregorianCalendar value) {
            this.registrationPeriod = value;
        }

        /**
         * Добавление/изменение периода регистрации
         * 
         * @return
         *     possible object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation }
         *     
         */
        public ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation getRegistrationPeriodInformation() {
            return registrationPeriodInformation;
        }

        /**
         * Sets the value of the registrationPeriodInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation }
         *     
         * @see #getRegistrationPeriodInformation()
         */
        public void setRegistrationPeriodInformation(ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation value) {
            this.registrationPeriodInformation = value;
        }

        /**
         * Размещение периода регистрации
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPlacingRegistrationPeriod() {
            return placingRegistrationPeriod;
        }

        /**
         * Sets the value of the placingRegistrationPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPlacingRegistrationPeriod()
         */
        public void setPlacingRegistrationPeriod(Boolean value) {
            this.placingRegistrationPeriod = value;
        }

        /**
         * Аннулирование периода регистрации
         * 
         * @return
         *     possible object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.AnnulmentRegistrationPeriod }
         *     
         */
        public ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.AnnulmentRegistrationPeriod getAnnulmentRegistrationPeriod() {
            return annulmentRegistrationPeriod;
        }

        /**
         * Sets the value of the annulmentRegistrationPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.AnnulmentRegistrationPeriod }
         *     
         * @see #getAnnulmentRegistrationPeriod()
         */
        public void setAnnulmentRegistrationPeriod(ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.AnnulmentRegistrationPeriod value) {
            this.annulmentRegistrationPeriod = value;
        }

        /**
         * Удаление проекта периода регистрации
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeleteProjectRegistrationPeriod() {
            return deleteProjectRegistrationPeriod;
        }

        /**
         * Sets the value of the deleteProjectRegistrationPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeleteProjectRegistrationPeriod()
         */
        public void setDeleteProjectRegistrationPeriod(Boolean value) {
            this.deleteProjectRegistrationPeriod = value;
        }

        /**
         * Удаление информации об объекте жилищного фонда из периода регистрации
         * 
         * @return
         *     possible object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject }
         *     
         */
        public ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject getDeleteAddressObject() {
            return deleteAddressObject;
        }

        /**
         * Sets the value of the deleteAddressObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject }
         *     
         * @see #getDeleteAddressObject()
         */
        public void setDeleteAddressObject(ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject value) {
            this.deleteAddressObject = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="ReasonOfAnnulment">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ReasonOfAnnulmentType">
         *               <minLength value="1"/>
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
        @XmlType(name = "", propOrder = {
            "reasonOfAnnulment"
        })
        public static class AnnulmentRegistrationPeriod {

            /**
             * Причина аннулирования
             * 
             */
            @XmlElement(name = "ReasonOfAnnulment", required = true)
            protected String reasonOfAnnulment;

            /**
             * Причина аннулирования
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonOfAnnulment() {
                return reasonOfAnnulment;
            }

            /**
             * Sets the value of the reasonOfAnnulment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReasonOfAnnulment()
             */
            public void setReasonOfAnnulment(String value) {
                this.reasonOfAnnulment = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}BaseType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Base
            extends ru.gosuslugi.dom.schema.integration.volume_quality.BaseType
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
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="ObjectAddress" maxOccurs="1000">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}ObjectAddressType">
         *                 <sequence>
         *                   <element name="NotFromContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
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
        @XmlType(name = "", propOrder = {
            "objectAddress"
        })
        public static class DeleteAddressObject {

            /**
             * ОЖФ
             * 
             */
            @XmlElement(name = "ObjectAddress", required = true)
            protected List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject.ObjectAddress> objectAddress;

            /**
             * ОЖФ
             * 
             * Gets the value of the objectAddress property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the objectAddress property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getObjectAddress().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject.ObjectAddress }
             * </p>
             * 
             * 
             * @return
             *     The value of the objectAddress property.
             */
            public List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.DeleteAddressObject.ObjectAddress> getObjectAddress() {
                if (objectAddress == null) {
                    objectAddress = new ArrayList<>();
                }
                return this.objectAddress;
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
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "notFromContract",
                "transportGUID"
            })
            public static class ObjectAddress
                extends ObjectAddressType
            {

                /**
                 * Помещение/блок или комната не из договора (основания).
                 * 
                 */
                @XmlElement(name = "NotFromContract")
                protected Boolean notFromContract;
                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

                /**
                 * Помещение/блок или комната не из договора (основания).
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}RegistrationPeriodType">
         *       <sequence>
         *         <element name="QualityResources" maxOccurs="1000" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityResourcesType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="QualityServices" maxOccurs="1000" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityServicesType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="VolumeResources" maxOccurs="1000" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourcesType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
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
            "qualityResources",
            "qualityServices",
            "volumeResources"
        })
        public static class RegistrationPeriodInformation
            extends RegistrationPeriodType
        {

            /**
             * Показатели качестве КР. Заполняется, только если в основании  указан договор ресурсоснабжения или договор ТКО
             * 
             */
            @XmlElement(name = "QualityResources")
            protected List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityResources> qualityResources;
            /**
             * Показатели качества КУ. Заполняется только если в основании указан договор ресурсоснабжения или договор управления (устав)
             * 
             */
            @XmlElement(name = "QualityServices")
            protected List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityServices> qualityServices;
            /**
             * Объем КР. Заполняется только если в основании информации об объеме и качестве КУ указан договор ресурсоснабжения или договор управления (устав)
             * 
             */
            @XmlElement(name = "VolumeResources")
            protected List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.VolumeResources> volumeResources;

            /**
             * Показатели качестве КР. Заполняется, только если в основании  указан договор ресурсоснабжения или договор ТКО
             * 
             * Gets the value of the qualityResources property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the qualityResources property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getQualityResources().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityResources }
             * </p>
             * 
             * 
             * @return
             *     The value of the qualityResources property.
             */
            public List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityResources> getQualityResources() {
                if (qualityResources == null) {
                    qualityResources = new ArrayList<>();
                }
                return this.qualityResources;
            }

            /**
             * Показатели качества КУ. Заполняется только если в основании указан договор ресурсоснабжения или договор управления (устав)
             * 
             * Gets the value of the qualityServices property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the qualityServices property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getQualityServices().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityServices }
             * </p>
             * 
             * 
             * @return
             *     The value of the qualityServices property.
             */
            public List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.QualityServices> getQualityServices() {
                if (qualityServices == null) {
                    qualityServices = new ArrayList<>();
                }
                return this.qualityServices;
            }

            /**
             * Объем КР. Заполняется только если в основании информации об объеме и качестве КУ указан договор ресурсоснабжения или договор управления (устав)
             * 
             * Gets the value of the volumeResources property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the volumeResources property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getVolumeResources().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.VolumeResources }
             * </p>
             * 
             * 
             * @return
             *     The value of the volumeResources property.
             */
            public List<ImportVolumeAndQualityInformationRequest.ImportVolumeAndQualityInformation.RegistrationPeriodInformation.VolumeResources> getVolumeResources() {
                if (volumeResources == null) {
                    volumeResources = new ArrayList<>();
                }
                return this.volumeResources;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityResourcesType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "transportGUID"
            })
            public static class QualityResources
                extends QualityResourcesType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

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

            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}QualityServicesType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "transportGUID"
            })
            public static class QualityServices
                extends QualityServicesType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

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

            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}VolumeResourcesType">
             *       <sequence>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
                "transportGUID"
            })
            public static class VolumeResources
                extends VolumeResourcesType
            {

                /**
                 * Транспортный идентификатор
                 * 
                 */
                @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                protected String transportGUID;

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

            }

        }

    }

}
