
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Импортируемый документ программы (плана)
 * 
 * <p>Java class for ImportDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImportDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="DocumentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <choice>
 *           <element name="LoadDocument">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="DeleteDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ImportDocumentType", propOrder = {
    "transportGuid",
    "documentGuid",
    "loadDocument",
    "deleteDocument"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportPlanRequest.ImportPlan.PlanDocument.class,
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportRegionalProgramRequest.ImportRegionalProgram.RegionalProgramDocument.class
})
public class ImportDocumentType {

    /**
     * Транспортный идентификатор для выполнения операции с документами программы/плана
     * 
     */
    @XmlElement(name = "TransportGuid", required = true)
    protected String transportGuid;
    /**
     * Идентификатор документа программы/плана. Заполняется при изменении либо удалении документа
     * 
     */
    @XmlElement(name = "DocumentGuid")
    protected String documentGuid;
    /**
     * Добавить/Изменить документ программы/плана
     * 
     */
    @XmlElement(name = "LoadDocument")
    protected ImportDocumentType.LoadDocument loadDocument;
    /**
     * Удалить документ программы/плана
     * 
     */
    @XmlElement(name = "DeleteDocument")
    protected Boolean deleteDocument;

    /**
     * Транспортный идентификатор для выполнения операции с документами программы/плана
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
     * Идентификатор документа программы/плана. Заполняется при изменении либо удалении документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGuid() {
        return documentGuid;
    }

    /**
     * Sets the value of the documentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentGuid()
     */
    public void setDocumentGuid(String value) {
        this.documentGuid = value;
    }

    /**
     * Добавить/Изменить документ программы/плана
     * 
     * @return
     *     possible object is
     *     {@link ImportDocumentType.LoadDocument }
     *     
     */
    public ImportDocumentType.LoadDocument getLoadDocument() {
        return loadDocument;
    }

    /**
     * Sets the value of the loadDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDocumentType.LoadDocument }
     *     
     * @see #getLoadDocument()
     */
    public void setLoadDocument(ImportDocumentType.LoadDocument value) {
        this.loadDocument = value;
    }

    /**
     * Удалить документ программы/плана
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteDocument() {
        return deleteDocument;
    }

    /**
     * Sets the value of the deleteDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDeleteDocument()
     */
    public void setDeleteDocument(Boolean value) {
        this.deleteDocument = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LoadDocument
        extends DocumentType
    {


    }

}
