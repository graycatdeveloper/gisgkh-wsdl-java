
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры записи о деактуализации
 * 
 * <p>Java class for DeactalizationDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeactalizationDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeactualizationEntryGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="DeactualizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="CancelTerminationDocument" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DocumentType" minOccurs="0"/>
 *         <element name="DocumentEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeactalizationDetailsType", propOrder = {
    "deactualizationEntryGUID",
    "deactualizationDate",
    "cancelTerminationDocument",
    "documentEffectiveDate"
})
public class DeactalizationDetailsType {

    /**
     * Идентификатор реестровой записи, для которой выполнялась деактуализация
     * 
     */
    @XmlElement(name = "DeactualizationEntryGUID", required = true)
    protected String deactualizationEntryGUID;
    /**
     * Дата деактуализации записи
     * 
     */
    @XmlElement(name = "DeactualizationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deactualizationDate;
    /**
     * Документ об отмене прекращения действия/аннулирования лицензии
     * 
     */
    @XmlElement(name = "CancelTerminationDocument")
    protected DocumentType cancelTerminationDocument;
    /**
     * Дата вступления в силу документа об отмене прекращения действия/аннулирования лицензии
     * 
     */
    @XmlElement(name = "DocumentEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentEffectiveDate;

    /**
     * Идентификатор реестровой записи, для которой выполнялась деактуализация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeactualizationEntryGUID() {
        return deactualizationEntryGUID;
    }

    /**
     * Sets the value of the deactualizationEntryGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDeactualizationEntryGUID()
     */
    public void setDeactualizationEntryGUID(String value) {
        this.deactualizationEntryGUID = value;
    }

    /**
     * Дата деактуализации записи
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactualizationDate() {
        return deactualizationDate;
    }

    /**
     * Sets the value of the deactualizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDeactualizationDate()
     */
    public void setDeactualizationDate(XMLGregorianCalendar value) {
        this.deactualizationDate = value;
    }

    /**
     * Документ об отмене прекращения действия/аннулирования лицензии
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getCancelTerminationDocument() {
        return cancelTerminationDocument;
    }

    /**
     * Sets the value of the cancelTerminationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     * @see #getCancelTerminationDocument()
     */
    public void setCancelTerminationDocument(DocumentType value) {
        this.cancelTerminationDocument = value;
    }

    /**
     * Дата вступления в силу документа об отмене прекращения действия/аннулирования лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentEffectiveDate() {
        return documentEffectiveDate;
    }

    /**
     * Sets the value of the documentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDocumentEffectiveDate()
     */
    public void setDocumentEffectiveDate(XMLGregorianCalendar value) {
        this.documentEffectiveDate = value;
    }

}
