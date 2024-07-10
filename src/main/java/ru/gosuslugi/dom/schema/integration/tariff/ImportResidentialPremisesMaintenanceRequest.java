
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
 *         <element name="importResidentialPremisesMaintenance" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadResidentialPremisesMaintenance" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesMaintenanceType"/>
 *                     <element name="CancelResidentialPremisesMaintenance">
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.2.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importResidentialPremisesMaintenance"
})
@XmlRootElement(name = "importResidentialPremisesMaintenanceRequest")
public class ImportResidentialPremisesMaintenanceRequest
    extends BaseType
{

    /**
     * Импортируемая информация о размерах платы за содержание жилого помещения
     * 
     */
    @XmlElement(required = true)
    protected List<ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance> importResidentialPremisesMaintenance;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая информация о размерах платы за содержание жилого помещения
     * 
     * Gets the value of the importResidentialPremisesMaintenance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResidentialPremisesMaintenance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResidentialPremisesMaintenance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResidentialPremisesMaintenance property.
     */
    public List<ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance> getImportResidentialPremisesMaintenance() {
        if (importResidentialPremisesMaintenance == null) {
            importResidentialPremisesMaintenance = new ArrayList<>();
        }
        return this.importResidentialPremisesMaintenance;
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
            return "13.2.0.1";
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
     *           <element name="LoadResidentialPremisesMaintenance" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesMaintenanceType"/>
     *           <element name="CancelResidentialPremisesMaintenance">
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
        "loadResidentialPremisesMaintenance",
        "cancelResidentialPremisesMaintenance"
    })
    public static class ImportResidentialPremisesMaintenance {

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о размерах платы за содержание жилого помещения
         * 
         */
        @XmlElement(name = "TransportGUID", required = true)
        protected String transportGUID;
        /**
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о размерах платы за содержание жилого помещения
         * 
         */
        @XmlElement(name = "TariffGUID")
        protected String tariffGUID;
        /**
         * Создать/изменить информацию о размерах платы за содержание жилого помещения. При изменении информации о размерах платы за содержание жилого помещения необходимо указать все  актуальные сведения.
         * 
         */
        @XmlElement(name = "LoadResidentialPremisesMaintenance")
        protected ResidentialPremisesMaintenanceType loadResidentialPremisesMaintenance;
        /**
         * Аннулировать информацию о размерах платы за содержание жилого помещения
         * 
         */
        @XmlElement(name = "CancelResidentialPremisesMaintenance")
        protected ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance.CancelResidentialPremisesMaintenance cancelResidentialPremisesMaintenance;

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о размерах платы за содержание жилого помещения
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
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о размерах платы за содержание жилого помещения
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
         * Создать/изменить информацию о размерах платы за содержание жилого помещения. При изменении информации о размерах платы за содержание жилого помещения необходимо указать все  актуальные сведения.
         * 
         * @return
         *     possible object is
         *     {@link ResidentialPremisesMaintenanceType }
         *     
         */
        public ResidentialPremisesMaintenanceType getLoadResidentialPremisesMaintenance() {
            return loadResidentialPremisesMaintenance;
        }

        /**
         * Sets the value of the loadResidentialPremisesMaintenance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentialPremisesMaintenanceType }
         *     
         * @see #getLoadResidentialPremisesMaintenance()
         */
        public void setLoadResidentialPremisesMaintenance(ResidentialPremisesMaintenanceType value) {
            this.loadResidentialPremisesMaintenance = value;
        }

        /**
         * Аннулировать информацию о размерах платы за содержание жилого помещения
         * 
         * @return
         *     possible object is
         *     {@link ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance.CancelResidentialPremisesMaintenance }
         *     
         */
        public ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance.CancelResidentialPremisesMaintenance getCancelResidentialPremisesMaintenance() {
            return cancelResidentialPremisesMaintenance;
        }

        /**
         * Sets the value of the cancelResidentialPremisesMaintenance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance.CancelResidentialPremisesMaintenance }
         *     
         * @see #getCancelResidentialPremisesMaintenance()
         */
        public void setCancelResidentialPremisesMaintenance(ImportResidentialPremisesMaintenanceRequest.ImportResidentialPremisesMaintenance.CancelResidentialPremisesMaintenance value) {
            this.cancelResidentialPremisesMaintenance = value;
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
        public static class CancelResidentialPremisesMaintenance {

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
