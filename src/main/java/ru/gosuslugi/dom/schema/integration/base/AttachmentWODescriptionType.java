
package ru.gosuslugi.dom.schema.integration.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Вложение
 * 
 * <p>Java class for AttachmentWODescriptionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AttachmentWODescriptionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1024"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Description" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="500"/>
 *               <minLength value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Attachment"/>
 *         <element name="AttachmentHASH" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentWODescriptionType", propOrder = {
    "name",
    "description",
    "attachment",
    "attachmentHASH"
})
public class AttachmentWODescriptionType {

    /**
     * Наименование вложения
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Описание вложения
     * 
     */
    @XmlElement(name = "Description")
    protected String description;
    /**
     * Вложение
     * 
     */
    @XmlElement(name = "Attachment", required = true)
    protected Attachment attachment;
    /**
     * Хэш-тег вложения по алгоритму ГОСТ в binhex
     * 
     */
    @XmlElement(name = "AttachmentHASH")
    protected String attachmentHASH;

    /**
     * Наименование вложения
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
     * Описание вложения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Вложение
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     * @see #getAttachment()
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

    /**
     * Хэш-тег вложения по алгоритму ГОСТ в binhex
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentHASH() {
        return attachmentHASH;
    }

    /**
     * Sets the value of the attachmentHASH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAttachmentHASH()
     */
    public void setAttachmentHASH(String value) {
        this.attachmentHASH = value;
    }

}
