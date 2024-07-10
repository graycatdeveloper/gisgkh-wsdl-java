
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
 *         <element name="importCapitalRepairTariff" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadCapitalRepairTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CapitalRepairTariffType"/>
 *                     <element name="CancelCapitalRepairTariff">
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
    "importCapitalRepairTariff"
})
@XmlRootElement(name = "importCapitalRepairTariffRequest")
public class ImportCapitalRepairTariffRequest
    extends BaseType
{

    /**
     * Импортируемая информация о минимальных размерах взносов на капитальный ремонт
     * 
     */
    @XmlElement(required = true)
    protected List<ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff> importCapitalRepairTariff;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая информация о минимальных размерах взносов на капитальный ремонт
     * 
     * Gets the value of the importCapitalRepairTariff property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importCapitalRepairTariff property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportCapitalRepairTariff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff }
     * </p>
     * 
     * 
     * @return
     *     The value of the importCapitalRepairTariff property.
     */
    public List<ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff> getImportCapitalRepairTariff() {
        if (importCapitalRepairTariff == null) {
            importCapitalRepairTariff = new ArrayList<>();
        }
        return this.importCapitalRepairTariff;
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
     *           <element name="LoadCapitalRepairTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CapitalRepairTariffType"/>
     *           <element name="CancelCapitalRepairTariff">
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
        "loadCapitalRepairTariff",
        "cancelCapitalRepairTariff"
    })
    public static class ImportCapitalRepairTariff {

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о минимальных размерах взносов на капитальный ремонт
         * 
         */
        @XmlElement(name = "TransportGUID", required = true)
        protected String transportGUID;
        /**
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о минимальных размерах взносов на капитальный ремонт
         * 
         */
        @XmlElement(name = "TariffGUID")
        protected String tariffGUID;
        /**
         * Создать/изменить информацию о минимальных размерах взносов на капитальный ремонт. При изменении информации о минимальных размерах взносов на капитальный ремонт необходимо указать все  актуальные сведения.
         * 
         */
        @XmlElement(name = "LoadCapitalRepairTariff")
        protected CapitalRepairTariffType loadCapitalRepairTariff;
        /**
         * Аннулировать информацию о минимальных размерах взносов на капитальный ремонт
         * 
         */
        @XmlElement(name = "CancelCapitalRepairTariff")
        protected ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff.CancelCapitalRepairTariff cancelCapitalRepairTariff;

        /**
         * Транспортный идентификатор  для выполнения операции с информацией о минимальных размерах взносов на капитальный ремонт
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
         * Идентификатор тарифа, заполняется при изменении и аннулировании информации о минимальных размерах взносов на капитальный ремонт
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
         * Создать/изменить информацию о минимальных размерах взносов на капитальный ремонт. При изменении информации о минимальных размерах взносов на капитальный ремонт необходимо указать все  актуальные сведения.
         * 
         * @return
         *     possible object is
         *     {@link CapitalRepairTariffType }
         *     
         */
        public CapitalRepairTariffType getLoadCapitalRepairTariff() {
            return loadCapitalRepairTariff;
        }

        /**
         * Sets the value of the loadCapitalRepairTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link CapitalRepairTariffType }
         *     
         * @see #getLoadCapitalRepairTariff()
         */
        public void setLoadCapitalRepairTariff(CapitalRepairTariffType value) {
            this.loadCapitalRepairTariff = value;
        }

        /**
         * Аннулировать информацию о минимальных размерах взносов на капитальный ремонт
         * 
         * @return
         *     possible object is
         *     {@link ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff.CancelCapitalRepairTariff }
         *     
         */
        public ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff.CancelCapitalRepairTariff getCancelCapitalRepairTariff() {
            return cancelCapitalRepairTariff;
        }

        /**
         * Sets the value of the cancelCapitalRepairTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff.CancelCapitalRepairTariff }
         *     
         * @see #getCancelCapitalRepairTariff()
         */
        public void setCancelCapitalRepairTariff(ImportCapitalRepairTariffRequest.ImportCapitalRepairTariff.CancelCapitalRepairTariff value) {
            this.cancelCapitalRepairTariff = value;
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
        public static class CancelCapitalRepairTariff {

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
