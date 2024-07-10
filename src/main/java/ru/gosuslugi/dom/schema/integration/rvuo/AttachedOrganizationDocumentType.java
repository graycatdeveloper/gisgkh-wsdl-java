
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Тип данных, описывающий документ прилагаемый к информации об управляющей организации
 * 
 * <p>Java class for AttachedOrganizationDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AttachedOrganizationDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *         <element name="DocumentBlockInfoType" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}OrganizationDocumentBlockInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedOrganizationDocumentType", propOrder = {
    "attachment",
    "documentBlockInfoType"
})
public class AttachedOrganizationDocumentType {

    /**
     * Прикрепленный файл
     * 
     */
    @XmlElement(name = "Attachment", required = true)
    protected AttachmentType attachment;
    /**
     * Тип блока информации для документа. Возможные значения: IncludedInfo - Информация о включении; AdditionalInfo - Дополнительна информация; ExcludedInfo - Информация об исключении.
     * 
     */
    @XmlElement(name = "DocumentBlockInfoType", required = true)
    @XmlSchemaType(name = "string")
    protected OrganizationDocumentBlockInfoType documentBlockInfoType;

    /**
     * Прикрепленный файл
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
     * Тип блока информации для документа. Возможные значения: IncludedInfo - Информация о включении; AdditionalInfo - Дополнительна информация; ExcludedInfo - Информация об исключении.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDocumentBlockInfoType }
     *     
     */
    public OrganizationDocumentBlockInfoType getDocumentBlockInfoType() {
        return documentBlockInfoType;
    }

    /**
     * Sets the value of the documentBlockInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDocumentBlockInfoType }
     *     
     * @see #getDocumentBlockInfoType()
     */
    public void setDocumentBlockInfoType(OrganizationDocumentBlockInfoType value) {
        this.documentBlockInfoType = value;
    }

}
