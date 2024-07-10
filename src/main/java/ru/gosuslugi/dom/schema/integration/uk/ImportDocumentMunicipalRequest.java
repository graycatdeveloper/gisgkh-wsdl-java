
package ru.gosuslugi.dom.schema.integration.uk;

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
 *         <element name="Document" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="importDocument">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentMunicipalType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentGUID" minOccurs="0"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentDocument">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentGUID"/>
 *                               <element name="ReasonOfAnnulment">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <maxLength value="500"/>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document"
})
@XmlRootElement(name = "importDocumentMunicipalRequest")
public class ImportDocumentMunicipalRequest
    extends BaseType
{

    /**
     * Документ
     * 
     */
    @XmlElement(name = "Document", required = true)
    protected List<ImportDocumentMunicipalRequest.Document> document;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Документ
     * 
     * Gets the value of the document property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDocumentMunicipalRequest.Document }
     * </p>
     * 
     * 
     * @return
     *     The value of the document property.
     */
    public List<ImportDocumentMunicipalRequest.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<>();
        }
        return this.document;
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
            return "11.2.0.2";
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
     *         <choice>
     *           <element name="importDocument">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentMunicipalType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentGUID" minOccurs="0"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentDocument">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentGUID"/>
     *                     <element name="ReasonOfAnnulment">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <maxLength value="500"/>
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
        "transportGUID",
        "importDocument",
        "annulmentDocument"
    })
    public static class Document {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Добавление/изменение документа
         * 
         */
        protected ImportDocumentMunicipalRequest.Document.ImportDocument importDocument;
        /**
         * Аннулирование документа
         * 
         */
        @XmlElement(name = "AnnulmentDocument")
        protected ImportDocumentMunicipalRequest.Document.AnnulmentDocument annulmentDocument;

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
         * Добавление/изменение документа
         * 
         * @return
         *     possible object is
         *     {@link ImportDocumentMunicipalRequest.Document.ImportDocument }
         *     
         */
        public ImportDocumentMunicipalRequest.Document.ImportDocument getImportDocument() {
            return importDocument;
        }

        /**
         * Sets the value of the importDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDocumentMunicipalRequest.Document.ImportDocument }
         *     
         * @see #getImportDocument()
         */
        public void setImportDocument(ImportDocumentMunicipalRequest.Document.ImportDocument value) {
            this.importDocument = value;
        }

        /**
         * Аннулирование документа
         * 
         * @return
         *     possible object is
         *     {@link ImportDocumentMunicipalRequest.Document.AnnulmentDocument }
         *     
         */
        public ImportDocumentMunicipalRequest.Document.AnnulmentDocument getAnnulmentDocument() {
            return annulmentDocument;
        }

        /**
         * Sets the value of the annulmentDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDocumentMunicipalRequest.Document.AnnulmentDocument }
         *     
         * @see #getAnnulmentDocument()
         */
        public void setAnnulmentDocument(ImportDocumentMunicipalRequest.Document.AnnulmentDocument value) {
            this.annulmentDocument = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentGUID"/>
         *         <element name="ReasonOfAnnulment">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="500"/>
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
            "documentGUID",
            "reasonOfAnnulment"
        })
        public static class AnnulmentDocument {

            /**
             * Идентификатор документа
             * 
             */
            @XmlElement(name = "DocumentGUID", required = true)
            protected String documentGUID;
            /**
             * Причина аннулировани
             * 
             */
            @XmlElement(name = "ReasonOfAnnulment", required = true)
            protected String reasonOfAnnulment;

            /**
             * Идентификатор документа
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentGUID() {
                return documentGUID;
            }

            /**
             * Sets the value of the documentGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDocumentGUID()
             */
            public void setDocumentGUID(String value) {
                this.documentGUID = value;
            }

            /**
             * Причина аннулировани
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentMunicipalType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentGUID" minOccurs="0"/>
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
            "documentGUID"
        })
        public static class ImportDocument
            extends DocumentMunicipalType
        {

            /**
             * Идентификатор документа
             * 
             */
            @XmlElement(name = "DocumentGUID")
            protected String documentGUID;

            /**
             * Идентификатор документа
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentGUID() {
                return documentGUID;
            }

            /**
             * Sets the value of the documentGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDocumentGUID()
             */
            public void setDocumentGUID(String value) {
                this.documentGUID = value;
            }

        }

    }

}
