
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
 *         <element name="importRegionalProgram">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="RegionalProgramGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="LoadRegionalProgram" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}RegionalProgramPasportType" minOccurs="0"/>
 *                   <element name="RegionalProgramDocument" maxOccurs="1000" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ImportDocumentType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <choice minOccurs="0">
 *                     <element name="DeleteRegionalProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="PublishRegionalProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="CancelRegionalProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.10""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importRegionalProgram"
})
@XmlRootElement(name = "importRegionalProgramRequest")
public class ImportRegionalProgramRequest
    extends BaseType
{

    /**
     * Импортируемая региональная программа капитального ремонта
     * 
     */
    @XmlElement(required = true)
    protected ImportRegionalProgramRequest.ImportRegionalProgram importRegionalProgram;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая региональная программа капитального ремонта
     * 
     * @return
     *     possible object is
     *     {@link ImportRegionalProgramRequest.ImportRegionalProgram }
     *     
     */
    public ImportRegionalProgramRequest.ImportRegionalProgram getImportRegionalProgram() {
        return importRegionalProgram;
    }

    /**
     * Sets the value of the importRegionalProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportRegionalProgramRequest.ImportRegionalProgram }
     *     
     * @see #getImportRegionalProgram()
     */
    public void setImportRegionalProgram(ImportRegionalProgramRequest.ImportRegionalProgram value) {
        this.importRegionalProgram = value;
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
            return "11.2.0.10";
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
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="RegionalProgramGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="LoadRegionalProgram" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}RegionalProgramPasportType" minOccurs="0"/>
     *         <element name="RegionalProgramDocument" maxOccurs="1000" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ImportDocumentType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <choice minOccurs="0">
     *           <element name="DeleteRegionalProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="PublishRegionalProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="CancelRegionalProgram" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "regionalProgramGuid",
        "loadRegionalProgram",
        "regionalProgramDocument",
        "deleteRegionalProgram",
        "publishRegionalProgram",
        "cancelRegionalProgram"
    })
    public static class ImportRegionalProgram {

        /**
         * Транспортный идентификатор для выполнения операции с региональной программой капитального ремонта
         * 
         */
        @XmlElement(name = "TransportGuid")
        protected String transportGuid;
        /**
         * Идентификатор РПКР в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "RegionalProgramGuid")
        protected String regionalProgramGuid;
        /**
         * Создание/Изменение паспорта РПКР
         * 
         */
        @XmlElement(name = "LoadRegionalProgram")
        protected RegionalProgramPasportType loadRegionalProgram;
        /**
         * Документы РПКР
         * 
         */
        @XmlElement(name = "RegionalProgramDocument")
        protected List<ImportRegionalProgramRequest.ImportRegionalProgram.RegionalProgramDocument> regionalProgramDocument;
        /**
         * Удалить программу в статусе "Проект"
         * 
         */
        @XmlElement(name = "DeleteRegionalProgram")
        protected Boolean deleteRegionalProgram;
        /**
         * Признак указывает на необходимость размещения РПКР в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "PublishRegionalProgram")
        protected Boolean publishRegionalProgram;
        /**
         * Аннулировать программу
         * 
         */
        @XmlElement(name = "CancelRegionalProgram")
        protected Boolean cancelRegionalProgram;

        /**
         * Транспортный идентификатор для выполнения операции с региональной программой капитального ремонта
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
         * Идентификатор РПКР в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegionalProgramGuid() {
            return regionalProgramGuid;
        }

        /**
         * Sets the value of the regionalProgramGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRegionalProgramGuid()
         */
        public void setRegionalProgramGuid(String value) {
            this.regionalProgramGuid = value;
        }

        /**
         * Создание/Изменение паспорта РПКР
         * 
         * @return
         *     possible object is
         *     {@link RegionalProgramPasportType }
         *     
         */
        public RegionalProgramPasportType getLoadRegionalProgram() {
            return loadRegionalProgram;
        }

        /**
         * Sets the value of the loadRegionalProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegionalProgramPasportType }
         *     
         * @see #getLoadRegionalProgram()
         */
        public void setLoadRegionalProgram(RegionalProgramPasportType value) {
            this.loadRegionalProgram = value;
        }

        /**
         * Документы РПКР
         * 
         * Gets the value of the regionalProgramDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the regionalProgramDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRegionalProgramDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportRegionalProgramRequest.ImportRegionalProgram.RegionalProgramDocument }
         * </p>
         * 
         * 
         * @return
         *     The value of the regionalProgramDocument property.
         */
        public List<ImportRegionalProgramRequest.ImportRegionalProgram.RegionalProgramDocument> getRegionalProgramDocument() {
            if (regionalProgramDocument == null) {
                regionalProgramDocument = new ArrayList<>();
            }
            return this.regionalProgramDocument;
        }

        /**
         * Удалить программу в статусе "Проект"
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeleteRegionalProgram() {
            return deleteRegionalProgram;
        }

        /**
         * Sets the value of the deleteRegionalProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeleteRegionalProgram()
         */
        public void setDeleteRegionalProgram(Boolean value) {
            this.deleteRegionalProgram = value;
        }

        /**
         * Признак указывает на необходимость размещения РПКР в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPublishRegionalProgram() {
            return publishRegionalProgram;
        }

        /**
         * Sets the value of the publishRegionalProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPublishRegionalProgram()
         */
        public void setPublishRegionalProgram(Boolean value) {
            this.publishRegionalProgram = value;
        }

        /**
         * Аннулировать программу
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelRegionalProgram() {
            return cancelRegionalProgram;
        }

        /**
         * Sets the value of the cancelRegionalProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelRegionalProgram()
         */
        public void setCancelRegionalProgram(Boolean value) {
            this.cancelRegionalProgram = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ImportDocumentType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RegionalProgramDocument
            extends ImportDocumentType
        {


        }

    }

}
