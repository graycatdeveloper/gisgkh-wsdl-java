
package ru.gosuslugi.dom.schema.integration.volume_quality;

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
 *         <element name="importInterval" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}BaseShortType"/>
 *                   <element name="IntervalGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <choice>
 *                     <element name="LoadInterval" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IntervalType"/>
 *                     <element name="AnnulmentInterval">
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
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.11.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importInterval"
})
@XmlRootElement(name = "importIntervalRequest")
public class ImportIntervalRequest
    extends BaseType
{

    /**
     * Импорт сведений о перерывах
     * 
     */
    @XmlElement(required = true)
    protected List<ImportIntervalRequest.ImportInterval> importInterval;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт сведений о перерывах
     * 
     * Gets the value of the importInterval property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importInterval property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportIntervalRequest.ImportInterval }
     * </p>
     * 
     * 
     * @return
     *     The value of the importInterval property.
     */
    public List<ImportIntervalRequest.ImportInterval> getImportInterval() {
        if (importInterval == null) {
            importInterval = new ArrayList<>();
        }
        return this.importInterval;
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
            return "11.11.0.1";
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
     *         <element name="Base" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}BaseShortType"/>
     *         <element name="IntervalGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <choice>
     *           <element name="LoadInterval" type="{http://dom.gosuslugi.ru/schema/integration/volume-quality/}IntervalType"/>
     *           <element name="AnnulmentInterval">
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
        "base",
        "intervalGuid",
        "transportGuid",
        "loadInterval",
        "annulmentInterval"
    })
    public static class ImportInterval {

        /**
         * Основание
         * 
         */
        @XmlElement(name = "Base", required = true)
        protected BaseShortType base;
        /**
         * Идентификатор информации о перерыве в ГИС ЖКХ. Заполняется при изменении ранее загруженных сведений о перерывах
         * 
         */
        @XmlElement(name = "IntervalGuid")
        protected String intervalGuid;
        /**
         * Транспортный идентификатор для выполнения операции с информацией о перерывах
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Добавить/Изменить общую информацию о перерывах. При изменении необходимо присылать всю информацию о перерыве в актуальном состоянии.
         * 
         */
        @XmlElement(name = "LoadInterval")
        protected IntervalType loadInterval;
        /**
         * Аннулировать информацию о перерыве
         * 
         */
        @XmlElement(name = "AnnulmentInterval")
        protected ImportIntervalRequest.ImportInterval.AnnulmentInterval annulmentInterval;

        /**
         * Основание
         * 
         * @return
         *     possible object is
         *     {@link BaseShortType }
         *     
         */
        public BaseShortType getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseShortType }
         *     
         * @see #getBase()
         */
        public void setBase(BaseShortType value) {
            this.base = value;
        }

        /**
         * Идентификатор информации о перерыве в ГИС ЖКХ. Заполняется при изменении ранее загруженных сведений о перерывах
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntervalGuid() {
            return intervalGuid;
        }

        /**
         * Sets the value of the intervalGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getIntervalGuid()
         */
        public void setIntervalGuid(String value) {
            this.intervalGuid = value;
        }

        /**
         * Транспортный идентификатор для выполнения операции с информацией о перерывах
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGuid() {
            return transportGuid;
        }

        /**
         * Sets the value of the transportGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGuid()
         */
        public void setTransportGuid(String value) {
            this.transportGuid = value;
        }

        /**
         * Добавить/Изменить общую информацию о перерывах. При изменении необходимо присылать всю информацию о перерыве в актуальном состоянии.
         * 
         * @return
         *     possible object is
         *     {@link IntervalType }
         *     
         */
        public IntervalType getLoadInterval() {
            return loadInterval;
        }

        /**
         * Sets the value of the loadInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntervalType }
         *     
         * @see #getLoadInterval()
         */
        public void setLoadInterval(IntervalType value) {
            this.loadInterval = value;
        }

        /**
         * Аннулировать информацию о перерыве
         * 
         * @return
         *     possible object is
         *     {@link ImportIntervalRequest.ImportInterval.AnnulmentInterval }
         *     
         */
        public ImportIntervalRequest.ImportInterval.AnnulmentInterval getAnnulmentInterval() {
            return annulmentInterval;
        }

        /**
         * Sets the value of the annulmentInterval property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportIntervalRequest.ImportInterval.AnnulmentInterval }
         *     
         * @see #getAnnulmentInterval()
         */
        public void setAnnulmentInterval(ImportIntervalRequest.ImportInterval.AnnulmentInterval value) {
            this.annulmentInterval = value;
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
        public static class AnnulmentInterval {

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

    }

}
