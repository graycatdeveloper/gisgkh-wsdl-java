
package ru.gosuslugi.dom.schema.integration.rap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Вложение
 * 
 * <p>Java class for ExportAttachmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportAttachmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Name" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Description" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Attachment">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AttachmentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
@XmlType(name = "ExportAttachmentType", propOrder = {
    "name",
    "description",
    "attachment",
    "attachmentHASH"
})
public class ExportAttachmentType {

    /**
     * Наименование вложения
     * 
     */
    @XmlElement(name = "Name")
    protected String name;
    /**
     * Описание вложения
     * 
     */
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Attachment", required = true)
    protected ExportAttachmentType.Attachment attachment;
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
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link ExportAttachmentType.Attachment }
     *     
     */
    public ExportAttachmentType.Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAttachmentType.Attachment }
     *     
     */
    public void setAttachment(ExportAttachmentType.Attachment value) {
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
    public static class Attachment {

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

}
