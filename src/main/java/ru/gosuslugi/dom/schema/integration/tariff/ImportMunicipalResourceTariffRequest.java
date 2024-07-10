
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
 *         <element name="importMunicipalResourceTariff" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadMunicipalResourceTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}MunicipalResourceTariffType"/>
 *                     <element name="CancelMunicipalResourceTariff">
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
    "importMunicipalResourceTariff"
})
@XmlRootElement(name = "importMunicipalResourceTariffRequest")
public class ImportMunicipalResourceTariffRequest
    extends BaseType
{

    /**
     * Импортируемая информация о тарифах на оплату коммунальных ресурсов
     * 
     */
    @XmlElement(required = true)
    protected List<ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff> importMunicipalResourceTariff;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая информация о тарифах на оплату коммунальных ресурсов
     * 
     * Gets the value of the importMunicipalResourceTariff property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importMunicipalResourceTariff property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportMunicipalResourceTariff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff }
     * </p>
     * 
     * 
     * @return
     *     The value of the importMunicipalResourceTariff property.
     */
    public List<ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff> getImportMunicipalResourceTariff() {
        if (importMunicipalResourceTariff == null) {
            importMunicipalResourceTariff = new ArrayList<>();
        }
        return this.importMunicipalResourceTariff;
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
     *           <element name="LoadMunicipalResourceTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}MunicipalResourceTariffType"/>
     *           <element name="CancelMunicipalResourceTariff">
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
        "loadMunicipalResourceTariff",
        "cancelMunicipalResourceTariff"
    })
    public static class ImportMunicipalResourceTariff {

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о тарифах на оплату коммунальных ресурсов
         * 
         */
        @XmlElement(name = "TransportGUID", required = true)
        protected String transportGUID;
        /**
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о тарифах на оплату коммунальных ресурсов
         * 
         */
        @XmlElement(name = "TariffGUID")
        protected String tariffGUID;
        /**
         * Создать/изменить информацию о тарифах на оплату коммунальных ресурсов. При изменении информации о тарифах на оплату коммунальных ресурсов необходимо указать все  актуальные сведения.
         * 
         */
        @XmlElement(name = "LoadMunicipalResourceTariff")
        protected MunicipalResourceTariffType loadMunicipalResourceTariff;
        /**
         * Аннулировать информацию о тарифах на оплату коммунальных ресурсов
         * 
         */
        @XmlElement(name = "CancelMunicipalResourceTariff")
        protected ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff.CancelMunicipalResourceTariff cancelMunicipalResourceTariff;

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о тарифах на оплату коммунальных ресурсов
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
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о тарифах на оплату коммунальных ресурсов
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
         * Создать/изменить информацию о тарифах на оплату коммунальных ресурсов. При изменении информации о тарифах на оплату коммунальных ресурсов необходимо указать все  актуальные сведения.
         * 
         * @return
         *     possible object is
         *     {@link MunicipalResourceTariffType }
         *     
         */
        public MunicipalResourceTariffType getLoadMunicipalResourceTariff() {
            return loadMunicipalResourceTariff;
        }

        /**
         * Sets the value of the loadMunicipalResourceTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link MunicipalResourceTariffType }
         *     
         * @see #getLoadMunicipalResourceTariff()
         */
        public void setLoadMunicipalResourceTariff(MunicipalResourceTariffType value) {
            this.loadMunicipalResourceTariff = value;
        }

        /**
         * Аннулировать информацию о тарифах на оплату коммунальных ресурсов
         * 
         * @return
         *     possible object is
         *     {@link ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff.CancelMunicipalResourceTariff }
         *     
         */
        public ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff.CancelMunicipalResourceTariff getCancelMunicipalResourceTariff() {
            return cancelMunicipalResourceTariff;
        }

        /**
         * Sets the value of the cancelMunicipalResourceTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff.CancelMunicipalResourceTariff }
         *     
         * @see #getCancelMunicipalResourceTariff()
         */
        public void setCancelMunicipalResourceTariff(ImportMunicipalResourceTariffRequest.ImportMunicipalResourceTariff.CancelMunicipalResourceTariff value) {
            this.cancelMunicipalResourceTariff = value;
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
        public static class CancelMunicipalResourceTariff {

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
