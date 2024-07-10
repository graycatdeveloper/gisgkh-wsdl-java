
package ru.gosuslugi.dom.schema.integration.appeals;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Переадресация обращения
 * 
 * <p>Java class for RedirectAppealType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RedirectAppealType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Receiver">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String1000Type" minOccurs="0"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedirectAppealType", propOrder = {
    "receiver",
    "comment",
    "attachment",
    "answererGUID"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.appeals.ImportAnswerRequest.AppealAction.RedirectAppeal.class
})
public class RedirectAppealType {

    /**
     * Адресат обращения
     * 
     */
    @XmlElement(name = "Receiver", required = true)
    protected RedirectAppealType.Receiver receiver;
    /**
     * Комментарий
     * 
     */
    @XmlElement(name = "Comment")
    protected String comment;
    /**
     * Прикрепленные файлы
     * 
     */
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    /**
     * Идентификатор исполнителя по обращению
     * 
     */
    @XmlElement(name = "AnswererGUID", required = true)
    protected String answererGUID;

    /**
     * Адресат обращения
     * 
     * @return
     *     possible object is
     *     {@link RedirectAppealType.Receiver }
     *     
     */
    public RedirectAppealType.Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectAppealType.Receiver }
     *     
     * @see #getReceiver()
     */
    public void setReceiver(RedirectAppealType.Receiver value) {
        this.receiver = value;
    }

    /**
     * Комментарий
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComment()
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Прикрепленные файлы
     * 
     * Gets the value of the attachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachment property.
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<>();
        }
        return this.attachment;
    }

    /**
     * Идентификатор исполнителя по обращению
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswererGUID() {
        return answererGUID;
    }

    /**
     * Sets the value of the answererGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnswererGUID()
     */
    public void setAnswererGUID(String value) {
        this.answererGUID = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Receiver
        extends RegOrgType
    {


    }

}
