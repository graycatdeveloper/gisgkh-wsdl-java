
package ru.gosuslugi.dom.schema.integration.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="AttachmentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
    "attachmentGUID"
})
@XmlRootElement(name = "Attachment")
public class Attachment {

    /**
     * Идентификатор сохраненного вложения
     * 
     */
    @XmlElement(name = "AttachmentGUID", required = true)
    protected String attachmentGUID;

    /**
     * Идентификатор сохраненного вложения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentGUID() {
        return attachmentGUID;
    }

    /**
     * Sets the value of the attachmentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAttachmentGUID()
     */
    public void setAttachmentGUID(String value) {
        this.attachmentGUID = value;
    }

}
