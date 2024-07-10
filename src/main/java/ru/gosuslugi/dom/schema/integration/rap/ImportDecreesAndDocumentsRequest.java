
package ru.gosuslugi.dom.schema.integration.rap;

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
 *         <element name="importDecreesAndDocuments" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="DecreeGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   </sequence>
 *                   <choice>
 *                     <sequence>
 *                       <element name="Decree" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <element name="DecreeInfo">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeInfoType">
 *                                       </extension>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                       <element name="ChangeReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ChangeReasonType" minOccurs="0"/>
 *                       <element name="ImportProceduralDocuments" maxOccurs="100" minOccurs="0">
 *                         <complexType>
 *                           <complexContent>
 *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               <sequence>
 *                                 <sequence>
 *                                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                   <element name="ProceduralDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                                 </sequence>
 *                                 <choice>
 *                                   <element name="ProceduralDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ProceduralDocumentType"/>
 *                                   <element name="DeleteProceduralDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                                 </choice>
 *                               </sequence>
 *                             </restriction>
 *                           </complexContent>
 *                         </complexType>
 *                       </element>
 *                     </sequence>
 *                     <element name="CancelDecree">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}CancelReasonType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulDecree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.10.0.5""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importDecreesAndDocuments"
})
@XmlRootElement(name = "ImportDecreesAndDocumentsRequest")
public class ImportDecreesAndDocumentsRequest
    extends BaseType
{

    /**
     * Постановления и процессуальные документы
     * 
     */
    @XmlElement(required = true)
    protected List<ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments> importDecreesAndDocuments;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Постановления и процессуальные документы
     * 
     * Gets the value of the importDecreesAndDocuments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importDecreesAndDocuments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportDecreesAndDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments }
     * </p>
     * 
     * 
     * @return
     *     The value of the importDecreesAndDocuments property.
     */
    public List<ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments> getImportDecreesAndDocuments() {
        if (importDecreesAndDocuments == null) {
            importDecreesAndDocuments = new ArrayList<>();
        }
        return this.importDecreesAndDocuments;
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
            return "11.10.0.5";
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
     *         <sequence>
     *           <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="DecreeGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         </sequence>
     *         <choice>
     *           <sequence>
     *             <element name="Decree" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     <sequence>
     *                       <element name="DecreeInfo">
     *                         <complexType>
     *                           <complexContent>
     *                             <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeInfoType">
     *                             </extension>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                     </sequence>
     *                   </restriction>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *             <element name="ChangeReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ChangeReasonType" minOccurs="0"/>
     *             <element name="ImportProceduralDocuments" maxOccurs="100" minOccurs="0">
     *               <complexType>
     *                 <complexContent>
     *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                     <sequence>
     *                       <sequence>
     *                         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                         <element name="ProceduralDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                       </sequence>
     *                       <choice>
     *                         <element name="ProceduralDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ProceduralDocumentType"/>
     *                         <element name="DeleteProceduralDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                       </choice>
     *                     </sequence>
     *                   </restriction>
     *                 </complexContent>
     *               </complexType>
     *             </element>
     *           </sequence>
     *           <element name="CancelDecree">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}CancelReasonType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulDecree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "decreeGuid",
        "decree",
        "changeReason",
        "importProceduralDocuments",
        "cancelDecree",
        "annulDecree"
    })
    public static class ImportDecreesAndDocuments {

        /**
         * Транспортный идентификатор для выполнения операций с постановлением
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор постановления в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "DecreeGuid")
        protected String decreeGuid;
        /**
         * Создание, изменение постановления
         * 
         */
        @XmlElement(name = "Decree")
        protected ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree decree;
        /**
         * Причина изменения сведений (не заполняется для операций "добавление постановления" и "добавление процессуального документа")
         * 
         */
        @XmlElement(name = "ChangeReason")
        protected ChangeReasonType changeReason;
        /**
         * Другие процессуальные документы.    Доступны для указания виды документов: Постановление, Протокол, Подтверждение принятых мер, Другой документ
         * 
         */
        @XmlElement(name = "ImportProceduralDocuments")
        protected List<ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.ImportProceduralDocuments> importProceduralDocuments;
        /**
         * Отмена постановления
         * 
         */
        @XmlElement(name = "CancelDecree")
        protected ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.CancelDecree cancelDecree;
        /**
         * Аннулирование постановления
         * 
         */
        @XmlElement(name = "AnnulDecree")
        protected Boolean annulDecree;

        /**
         * Транспортный идентификатор для выполнения операций с постановлением
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
         * Идентификатор постановления в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDecreeGuid() {
            return decreeGuid;
        }

        /**
         * Sets the value of the decreeGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDecreeGuid()
         */
        public void setDecreeGuid(String value) {
            this.decreeGuid = value;
        }

        /**
         * Создание, изменение постановления
         * 
         * @return
         *     possible object is
         *     {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree }
         *     
         */
        public ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree getDecree() {
            return decree;
        }

        /**
         * Sets the value of the decree property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree }
         *     
         * @see #getDecree()
         */
        public void setDecree(ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree value) {
            this.decree = value;
        }

        /**
         * Причина изменения сведений (не заполняется для операций "добавление постановления" и "добавление процессуального документа")
         * 
         * @return
         *     possible object is
         *     {@link ChangeReasonType }
         *     
         */
        public ChangeReasonType getChangeReason() {
            return changeReason;
        }

        /**
         * Sets the value of the changeReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ChangeReasonType }
         *     
         * @see #getChangeReason()
         */
        public void setChangeReason(ChangeReasonType value) {
            this.changeReason = value;
        }

        /**
         * Другие процессуальные документы.    Доступны для указания виды документов: Постановление, Протокол, Подтверждение принятых мер, Другой документ
         * 
         * Gets the value of the importProceduralDocuments property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importProceduralDocuments property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getImportProceduralDocuments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.ImportProceduralDocuments }
         * </p>
         * 
         * 
         * @return
         *     The value of the importProceduralDocuments property.
         */
        public List<ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.ImportProceduralDocuments> getImportProceduralDocuments() {
            if (importProceduralDocuments == null) {
                importProceduralDocuments = new ArrayList<>();
            }
            return this.importProceduralDocuments;
        }

        /**
         * Отмена постановления
         * 
         * @return
         *     possible object is
         *     {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.CancelDecree }
         *     
         */
        public ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.CancelDecree getCancelDecree() {
            return cancelDecree;
        }

        /**
         * Sets the value of the cancelDecree property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.CancelDecree }
         *     
         * @see #getCancelDecree()
         */
        public void setCancelDecree(ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.CancelDecree value) {
            this.cancelDecree = value;
        }

        /**
         * Аннулирование постановления
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnnulDecree() {
            return annulDecree;
        }

        /**
         * Sets the value of the annulDecree property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isAnnulDecree()
         */
        public void setAnnulDecree(Boolean value) {
            this.annulDecree = value;
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
         *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/rap/}CancelReasonType"/>
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
        public static class CancelDecree {

            /**
             * Причина отмены сведений
             * 
             */
            @XmlElement(name = "CancelReason", required = true)
            protected CancelReasonType cancelReason;

            /**
             * Причина отмены сведений
             * 
             * @return
             *     possible object is
             *     {@link CancelReasonType }
             *     
             */
            public CancelReasonType getCancelReason() {
                return cancelReason;
            }

            /**
             * Sets the value of the cancelReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link CancelReasonType }
             *     
             * @see #getCancelReason()
             */
            public void setCancelReason(CancelReasonType value) {
                this.cancelReason = value;
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
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="DecreeInfo">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeInfoType">
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
            "decreeInfo"
        })
        public static class Decree {

            /**
             * Данные постановления
             * 
             */
            @XmlElement(name = "DecreeInfo", required = true)
            protected ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree.DecreeInfo decreeInfo;

            /**
             * Данные постановления
             * 
             * @return
             *     possible object is
             *     {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree.DecreeInfo }
             *     
             */
            public ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree.DecreeInfo getDecreeInfo() {
                return decreeInfo;
            }

            /**
             * Sets the value of the decreeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree.DecreeInfo }
             *     
             * @see #getDecreeInfo()
             */
            public void setDecreeInfo(ImportDecreesAndDocumentsRequest.ImportDecreesAndDocuments.Decree.DecreeInfo value) {
                this.decreeInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/rap/}DecreeInfoType">
             *     </extension>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DecreeInfo
                extends DecreeInfoType
            {


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
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <sequence>
         *           <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *           <element name="ProceduralDocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         </sequence>
         *         <choice>
         *           <element name="ProceduralDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ProceduralDocumentType"/>
         *           <element name="DeleteProceduralDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "proceduralDocumentGUID",
            "proceduralDocument",
            "deleteProceduralDocument"
        })
        public static class ImportProceduralDocuments {

            /**
             * Транспортный идентификатор для выполнения операции с процессуальным документом
             * 
             */
            @XmlElement(name = "TransportGuid", required = true)
            protected String transportGuid;
            /**
             * Идентификатор процессуального документа в ГИС ЖКХ (обязателен при изменении/удалении  существующего документа)
             * 
             */
            @XmlElement(name = "ProceduralDocumentGUID")
            protected String proceduralDocumentGUID;
            /**
             * Добавление / изменение процессуального документа
             * 
             */
            @XmlElement(name = "ProceduralDocument")
            protected ProceduralDocumentType proceduralDocument;
            /**
             * Удаление процессуального документа
             * 
             */
            @XmlElement(name = "DeleteProceduralDocument")
            protected Boolean deleteProceduralDocument;

            /**
             * Транспортный идентификатор для выполнения операции с процессуальным документом
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
             * Идентификатор процессуального документа в ГИС ЖКХ (обязателен при изменении/удалении  существующего документа)
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProceduralDocumentGUID() {
                return proceduralDocumentGUID;
            }

            /**
             * Sets the value of the proceduralDocumentGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getProceduralDocumentGUID()
             */
            public void setProceduralDocumentGUID(String value) {
                this.proceduralDocumentGUID = value;
            }

            /**
             * Добавление / изменение процессуального документа
             * 
             * @return
             *     possible object is
             *     {@link ProceduralDocumentType }
             *     
             */
            public ProceduralDocumentType getProceduralDocument() {
                return proceduralDocument;
            }

            /**
             * Sets the value of the proceduralDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProceduralDocumentType }
             *     
             * @see #getProceduralDocument()
             */
            public void setProceduralDocument(ProceduralDocumentType value) {
                this.proceduralDocument = value;
            }

            /**
             * Удаление процессуального документа
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDeleteProceduralDocument() {
                return deleteProceduralDocument;
            }

            /**
             * Sets the value of the deleteProceduralDocument property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isDeleteProceduralDocument()
             */
            public void setDeleteProceduralDocument(Boolean value) {
                this.deleteProceduralDocument = value;
            }

        }

    }

}
