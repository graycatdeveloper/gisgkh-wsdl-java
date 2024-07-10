
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Параметры иных документов
 * 
 * <p>Java class for OtherDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OtherDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocumentType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="StatusChangeBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DocumentType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherDetailsType", propOrder = {
    "documentType",
    "statusChangeBase",
    "document"
})
public class OtherDetailsType {

    /**
     * Тип документа НСИ 63
     * 
     */
    @XmlElement(name = "DocumentType", required = true)
    protected NsiRef documentType;
    /**
     * Основание внесения документа НСИ 11
     * 
     */
    @XmlElement(name = "StatusChangeBase", required = true)
    protected NsiRef statusChangeBase;
    /**
     * Документ
     * 
     */
    @XmlElement(name = "Document")
    protected DocumentType document;

    /**
     * Тип документа НСИ 63
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDocumentType()
     */
    public void setDocumentType(NsiRef value) {
        this.documentType = value;
    }

    /**
     * Основание внесения документа НСИ 11
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getStatusChangeBase() {
        return statusChangeBase;
    }

    /**
     * Sets the value of the statusChangeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getStatusChangeBase()
     */
    public void setStatusChangeBase(NsiRef value) {
        this.statusChangeBase = value;
    }

    /**
     * Документ
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     * @see #getDocument()
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

}
