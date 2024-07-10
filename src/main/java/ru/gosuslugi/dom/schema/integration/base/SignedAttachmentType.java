
package ru.gosuslugi.dom.schema.integration.base;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый тип, описывающий вложение с открепленными (detached) подписями. В сервисах ГИС ЖКХ, использущих тип SignedAttachmentType, может быть наложено ограничение на максимальное количесво элементов в блоке Signature (см. контроль INT002039).
 * 
 * <p>Java class for SignedAttachmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SignedAttachmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *         <element name="Signature" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentWODescriptionType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedAttachmentType", propOrder = {
    "attachment",
    "signature"
})
public class SignedAttachmentType {

    /**
     * Вложение
     * 
     */
    @XmlElement(name = "Attachment", required = true)
    protected AttachmentType attachment;
    /**
     * Открепленная (detached) подпись
     * 
     */
    @XmlElement(name = "Signature", required = true)
    protected List<AttachmentWODescriptionType> signature;

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
     * Открепленная (detached) подпись
     * 
     * Gets the value of the signature property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentWODescriptionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the signature property.
     */
    public List<AttachmentWODescriptionType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<>();
        }
        return this.signature;
    }

}
