
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Тип данных, описывающий документ в запросе на импорт информации о решении об определении управляющей организации
 * 
 * <p>Java class for AttachedDecisionDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AttachedDecisionDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *         <element name="DocumentBlockInfoType" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionDocumentBlockInfoType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedDecisionDocumentType", propOrder = {
    "attachment",
    "documentBlockInfoType"
})
public class AttachedDecisionDocumentType {

    /**
     * Прикрепленный файл
     * 
     */
    @XmlElement(name = "Attachment", required = true)
    protected AttachmentType attachment;
    /**
     * Тип блока информации для документа. Возможные значения: DecisionInfo - Информация о решении; AdditionalInfo - Дополнительна информация; ServicesInfo - Перечень работ и услуг.
     * 
     */
    @XmlElement(name = "DocumentBlockInfoType", required = true)
    @XmlSchemaType(name = "string")
    protected DecisionDocumentBlockInfoType documentBlockInfoType;

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
     * Тип блока информации для документа. Возможные значения: DecisionInfo - Информация о решении; AdditionalInfo - Дополнительна информация; ServicesInfo - Перечень работ и услуг.
     * 
     * @return
     *     possible object is
     *     {@link DecisionDocumentBlockInfoType }
     *     
     */
    public DecisionDocumentBlockInfoType getDocumentBlockInfoType() {
        return documentBlockInfoType;
    }

    /**
     * Sets the value of the documentBlockInfoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionDocumentBlockInfoType }
     *     
     * @see #getDocumentBlockInfoType()
     */
    public void setDocumentBlockInfoType(DecisionDocumentBlockInfoType value) {
        this.documentBlockInfoType = value;
    }

}
