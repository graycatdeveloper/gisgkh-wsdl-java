
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
 *         <element name="importResidentialPremisesUsage" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadResidentialPremisesUsage" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesUsageType"/>
 *                     <element name="CancelResidentialPremisesUsage">
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
    "importResidentialPremisesUsage"
})
@XmlRootElement(name = "importResidentialPremisesUsageRequest")
public class ImportResidentialPremisesUsageRequest
    extends BaseType
{

    /**
     * Импортируемая информация о размерах платы за пользование жилым помещением
     * 
     */
    @XmlElement(required = true)
    protected List<ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage> importResidentialPremisesUsage;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая информация о размерах платы за пользование жилым помещением
     * 
     * Gets the value of the importResidentialPremisesUsage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResidentialPremisesUsage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResidentialPremisesUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResidentialPremisesUsage property.
     */
    public List<ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage> getImportResidentialPremisesUsage() {
        if (importResidentialPremisesUsage == null) {
            importResidentialPremisesUsage = new ArrayList<>();
        }
        return this.importResidentialPremisesUsage;
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
     *           <element name="LoadResidentialPremisesUsage" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesUsageType"/>
     *           <element name="CancelResidentialPremisesUsage">
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
        "loadResidentialPremisesUsage",
        "cancelResidentialPremisesUsage"
    })
    public static class ImportResidentialPremisesUsage {

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о размерах платы за пользование жилым помещением
         * 
         */
        @XmlElement(name = "TransportGUID", required = true)
        protected String transportGUID;
        /**
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о размерах платы за пользование жилым помещением
         * 
         */
        @XmlElement(name = "TariffGUID")
        protected String tariffGUID;
        /**
         * Создать/изменить информацию о размерах платы за пользование жилым помещением. При изменении информации о размерах платы за пользование жилым помещением необходимо указать все  актуальные сведения.
         * 
         */
        @XmlElement(name = "LoadResidentialPremisesUsage")
        protected ResidentialPremisesUsageType loadResidentialPremisesUsage;
        /**
         * Аннулировать информацию о размерах платы за пользование жилым помещением
         * 
         */
        @XmlElement(name = "CancelResidentialPremisesUsage")
        protected ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage.CancelResidentialPremisesUsage cancelResidentialPremisesUsage;

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о размерах платы за пользование жилым помещением
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
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о размерах платы за пользование жилым помещением
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
         * Создать/изменить информацию о размерах платы за пользование жилым помещением. При изменении информации о размерах платы за пользование жилым помещением необходимо указать все  актуальные сведения.
         * 
         * @return
         *     possible object is
         *     {@link ResidentialPremisesUsageType }
         *     
         */
        public ResidentialPremisesUsageType getLoadResidentialPremisesUsage() {
            return loadResidentialPremisesUsage;
        }

        /**
         * Sets the value of the loadResidentialPremisesUsage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentialPremisesUsageType }
         *     
         * @see #getLoadResidentialPremisesUsage()
         */
        public void setLoadResidentialPremisesUsage(ResidentialPremisesUsageType value) {
            this.loadResidentialPremisesUsage = value;
        }

        /**
         * Аннулировать информацию о размерах платы за пользование жилым помещением
         * 
         * @return
         *     possible object is
         *     {@link ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage.CancelResidentialPremisesUsage }
         *     
         */
        public ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage.CancelResidentialPremisesUsage getCancelResidentialPremisesUsage() {
            return cancelResidentialPremisesUsage;
        }

        /**
         * Sets the value of the cancelResidentialPremisesUsage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage.CancelResidentialPremisesUsage }
         *     
         * @see #getCancelResidentialPremisesUsage()
         */
        public void setCancelResidentialPremisesUsage(ImportResidentialPremisesUsageRequest.ImportResidentialPremisesUsage.CancelResidentialPremisesUsage value) {
            this.cancelResidentialPremisesUsage = value;
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
        public static class CancelResidentialPremisesUsage {

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
