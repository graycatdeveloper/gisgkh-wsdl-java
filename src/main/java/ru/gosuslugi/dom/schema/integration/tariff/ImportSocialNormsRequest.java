
package ru.gosuslugi.dom.schema.integration.tariff;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


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
 *         <element name="importSocialNorm" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadSocialNorm" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}SocialNormType"/>
 *                     <element name="CancelSocialNorm">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type"/>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.14.0.5""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importSocialNorm"
})
@XmlRootElement(name = "importSocialNormsRequest")
public class ImportSocialNormsRequest
    extends BaseType
{

    /**
     * Импортируемая информации о социальной норме потребления электрической энергии
     * 
     */
    @XmlElement(required = true)
    protected List<ImportSocialNormsRequest.ImportSocialNorm> importSocialNorm;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая информации о социальной норме потребления электрической энергии
     * 
     * Gets the value of the importSocialNorm property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importSocialNorm property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportSocialNorm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportSocialNormsRequest.ImportSocialNorm }
     * </p>
     * 
     * 
     * @return
     *     The value of the importSocialNorm property.
     */
    public List<ImportSocialNormsRequest.ImportSocialNorm> getImportSocialNorm() {
        if (importSocialNorm == null) {
            importSocialNorm = new ArrayList<>();
        }
        return this.importSocialNorm;
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
            return "11.14.0.5";
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
     *         <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadSocialNorm" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}SocialNormType"/>
     *           <element name="CancelSocialNorm">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type"/>
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
        "tariffGUID",
        "loadSocialNorm",
        "cancelSocialNorm"
    })
    public static class ImportSocialNorm {

        /**
         * Транспортный идентификатор  для выполнения операции с социальной норме потребления электрической энергии
         * 
         */
        @XmlElement(name = "TransportGUID", required = true)
        protected String transportGUID;
        /**
         * Идентификатор социальной нормы потребления электрической энергии, заполняется при изменении и аннулировании информации о социальной норме потребления электрической энергии
         * 
         */
        @XmlElement(name = "TariffGUID")
        protected String tariffGUID;
        /**
         * Создать/изменить информацию о социальной норме потребления электрической энергии. При изменении информации о социальной норме потребления электрической энергии необходимо указывать все  актуальные сведения.
         * 
         */
        @XmlElement(name = "LoadSocialNorm")
        protected SocialNormType loadSocialNorm;
        /**
         * Аннулировать информацию о социальной норме потребления электрической энергии
         * 
         */
        @XmlElement(name = "CancelSocialNorm")
        protected ImportSocialNormsRequest.ImportSocialNorm.CancelSocialNorm cancelSocialNorm;

        /**
         * Транспортный идентификатор  для выполнения операции с социальной норме потребления электрической энергии
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
         * Идентификатор социальной нормы потребления электрической энергии, заполняется при изменении и аннулировании информации о социальной норме потребления электрической энергии
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTariffGUID() {
            return tariffGUID;
        }

        /**
         * Sets the value of the tariffGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTariffGUID()
         */
        public void setTariffGUID(String value) {
            this.tariffGUID = value;
        }

        /**
         * Создать/изменить информацию о социальной норме потребления электрической энергии. При изменении информации о социальной норме потребления электрической энергии необходимо указывать все  актуальные сведения.
         * 
         * @return
         *     possible object is
         *     {@link SocialNormType }
         *     
         */
        public SocialNormType getLoadSocialNorm() {
            return loadSocialNorm;
        }

        /**
         * Sets the value of the loadSocialNorm property.
         * 
         * @param value
         *     allowed object is
         *     {@link SocialNormType }
         *     
         * @see #getLoadSocialNorm()
         */
        public void setLoadSocialNorm(SocialNormType value) {
            this.loadSocialNorm = value;
        }

        /**
         * Аннулировать информацию о социальной норме потребления электрической энергии
         * 
         * @return
         *     possible object is
         *     {@link ImportSocialNormsRequest.ImportSocialNorm.CancelSocialNorm }
         *     
         */
        public ImportSocialNormsRequest.ImportSocialNorm.CancelSocialNorm getCancelSocialNorm() {
            return cancelSocialNorm;
        }

        /**
         * Sets the value of the cancelSocialNorm property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportSocialNormsRequest.ImportSocialNorm.CancelSocialNorm }
         *     
         * @see #getCancelSocialNorm()
         */
        public void setCancelSocialNorm(ImportSocialNormsRequest.ImportSocialNorm.CancelSocialNorm value) {
            this.cancelSocialNorm = value;
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
         *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type"/>
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
            "cancelReason"
        })
        public static class CancelSocialNorm {

            /**
             * Причина аннулирования
             * 
             */
            @XmlElement(name = "CancelReason", required = true)
            protected String cancelReason;

            /**
             * Причина аннулирования
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelReason() {
                return cancelReason;
            }

            /**
             * Sets the value of the cancelReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCancelReason()
             */
            public void setCancelReason(String value) {
                this.cancelReason = value;
            }

        }

    }

}
