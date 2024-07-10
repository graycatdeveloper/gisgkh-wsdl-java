
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 *         <element name="ContractGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="importCertificate" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="CertificateGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadCertificate">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}CertificateType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CancelCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contractGuid",
    "importCertificate"
})
@XmlRootElement(name = "importCertificatesRequest")
public class ImportCertificatesRequest
    extends BaseType
{

    /**
     * Идентификатор договора в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGuid", required = true)
    protected String contractGuid;
    /**
     * Импорт акта
     * 
     */
    @XmlElement(required = true)
    protected List<ImportCertificatesRequest.ImportCertificate> importCertificate;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор договора в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGuid() {
        return contractGuid;
    }

    /**
     * Sets the value of the contractGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGuid()
     */
    public void setContractGuid(String value) {
        this.contractGuid = value;
    }

    /**
     * Импорт акта
     * 
     * Gets the value of the importCertificate property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importCertificate property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCertificatesRequest.ImportCertificate }
     * </p>
     * 
     * 
     * @return
     *     The value of the importCertificate property.
     */
    public List<ImportCertificatesRequest.ImportCertificate> getImportCertificate() {
        if (importCertificate == null) {
            importCertificate = new ArrayList<>();
        }
        return this.importCertificate;
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
            return "11.0.0.1";
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
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="CertificateGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadCertificate">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}CertificateType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CancelCertificate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "transportGuid",
        "certificateGuid",
        "loadCertificate",
        "cancelCertificate"
    })
    public static class ImportCertificate {

        /**
         * Транспортный идентификатор для выполнения операции с актом
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор акта в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CertificateGuid")
        protected String certificateGuid;
        /**
         * Создание/Изменение Акта выполненной работы (оказанных услуг). При редактировании акта необходимо присылать всю актуальную информацию по нему, в том числе присылать актуальный список работ, учтенных в акте
         * 
         */
        @XmlElement(name = "LoadCertificate")
        protected ImportCertificatesRequest.ImportCertificate.LoadCertificate loadCertificate;
        /**
         * Аннулировать акт
         * 
         */
        @XmlElement(name = "CancelCertificate")
        protected Boolean cancelCertificate;

        /**
         * Транспортный идентификатор для выполнения операции с актом
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
         * Идентификатор акта в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCertificateGuid() {
            return certificateGuid;
        }

        /**
         * Sets the value of the certificateGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCertificateGuid()
         */
        public void setCertificateGuid(String value) {
            this.certificateGuid = value;
        }

        /**
         * Создание/Изменение Акта выполненной работы (оказанных услуг). При редактировании акта необходимо присылать всю актуальную информацию по нему, в том числе присылать актуальный список работ, учтенных в акте
         * 
         * @return
         *     possible object is
         *     {@link ImportCertificatesRequest.ImportCertificate.LoadCertificate }
         *     
         */
        public ImportCertificatesRequest.ImportCertificate.LoadCertificate getLoadCertificate() {
            return loadCertificate;
        }

        /**
         * Sets the value of the loadCertificate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportCertificatesRequest.ImportCertificate.LoadCertificate }
         *     
         * @see #getLoadCertificate()
         */
        public void setLoadCertificate(ImportCertificatesRequest.ImportCertificate.LoadCertificate value) {
            this.loadCertificate = value;
        }

        /**
         * Аннулировать акт
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelCertificate() {
            return cancelCertificate;
        }

        /**
         * Sets the value of the cancelCertificate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelCertificate()
         */
        public void setCancelCertificate(Boolean value) {
            this.cancelCertificate = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}CertificateType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LoadCertificate
            extends CertificateType
        {


        }

    }

}
