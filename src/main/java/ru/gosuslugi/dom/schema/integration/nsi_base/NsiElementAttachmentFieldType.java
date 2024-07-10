
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Составной тип. Наименование и значение поля "Вложение"
 * 
 * <p>Java class for NsiElementAttachmentFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementAttachmentFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementAttachmentFieldType", propOrder = {
    "document"
})
public class NsiElementAttachmentFieldType
    extends NsiElementFieldType
{

    /**
     * Документ
     * 
     */
    @XmlElement(name = "Document", required = true)
    protected AttachmentType document;

    /**
     * Документ
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     * @see #getDocument()
     */
    public void setDocument(AttachmentType value) {
        this.document = value;
    }

}
