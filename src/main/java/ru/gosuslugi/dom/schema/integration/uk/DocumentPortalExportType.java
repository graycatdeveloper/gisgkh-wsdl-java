
package ru.gosuslugi.dom.schema.integration.uk;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Базовый тип документа для экспорта
 * 
 * <p>Java class for DocumentPortalExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentPortalExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DocNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ApproveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *         <element name="DocumentType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPortalExportType", propOrder = {
    "name",
    "docNumber",
    "approveDate",
    "attachment",
    "documentType"
})
@XmlSeeAlso({
    DocumentMunicipalExportType.class,
    DocumentRegionExportType.class,
    DocumentFederalExportType.class
})
public class DocumentPortalExportType {

    /**
     * Наименование документа
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "DocNumber")
    protected String docNumber;
    /**
     * Дата принятия документа органом власти
     * 
     */
    @XmlElement(name = "ApproveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approveDate;
    /**
     * Вложение
     * 
     */
    @XmlElement(name = "Attachment", required = true)
    protected AttachmentType attachment;
    /**
     * Вид документа. (Ссылка на справочник "Вид закона и нормативного акта"). НСИ 324
     * 
     */
    @XmlElement(name = "DocumentType")
    protected NsiRef documentType;

    /**
     * Наименование документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Номер документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocNumber()
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Дата принятия документа органом власти
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDate() {
        return approveDate;
    }

    /**
     * Sets the value of the approveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getApproveDate()
     */
    public void setApproveDate(XMLGregorianCalendar value) {
        this.approveDate = value;
    }

    /**
     * Вложение
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     * @see #getAttachment()
     */
    public void setAttachment(AttachmentType value) {
        this.attachment = value;
    }

    /**
     * Вид документа. (Ссылка на справочник "Вид закона и нормативного акта"). НСИ 324
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

}
