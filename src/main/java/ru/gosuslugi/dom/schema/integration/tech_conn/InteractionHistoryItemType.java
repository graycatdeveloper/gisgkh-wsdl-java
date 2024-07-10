
package ru.gosuslugi.dom.schema.integration.tech_conn;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип: Сведения о сообщении в рамках взаимодействия с заявителем
 * 
 * <p>Java class for InteractionHistoryItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InteractionHistoryItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <choice>
 *           <element name="AuthorApplicant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="AuthorExecutor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="MessageTitle" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String100Type"/>
 *         <element name="MessageDescription" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *         <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String4000Type" minOccurs="0"/>
 *         <element name="Documents" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractionHistoryItemType", propOrder = {
    "created",
    "authorApplicant",
    "authorExecutor",
    "messageTitle",
    "messageDescription",
    "comment",
    "documents"
})
public class InteractionHistoryItemType {

    /**
     * Дата и время отправки/получения информации
     * 
     */
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    /**
     * Автор сообщения - заявитель
     * 
     */
    @XmlElement(name = "AuthorApplicant")
    protected Boolean authorApplicant;
    /**
     * Автор сообщения - исполнитель
     * 
     */
    @XmlElement(name = "AuthorExecutor")
    protected Boolean authorExecutor;
    /**
     * Заголовок сообщения
     * 
     */
    @XmlElement(name = "MessageTitle", required = true)
    protected String messageTitle;
    /**
     * Описание сообщения
     * 
     */
    @XmlElement(name = "MessageDescription", required = true)
    protected String messageDescription;
    /**
     * Текст сообщения
     * 
     */
    @XmlElement(name = "Comment")
    protected String comment;
    /**
     * Прикрепленные к сообщению файлы
     * 
     */
    @XmlElement(name = "Documents")
    protected AttachedDocumentType documents;

    /**
     * Дата и время отправки/получения информации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreated()
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Автор сообщения - заявитель
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorApplicant() {
        return authorApplicant;
    }

    /**
     * Sets the value of the authorApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAuthorApplicant()
     */
    public void setAuthorApplicant(Boolean value) {
        this.authorApplicant = value;
    }

    /**
     * Автор сообщения - исполнитель
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorExecutor() {
        return authorExecutor;
    }

    /**
     * Sets the value of the authorExecutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAuthorExecutor()
     */
    public void setAuthorExecutor(Boolean value) {
        this.authorExecutor = value;
    }

    /**
     * Заголовок сообщения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTitle() {
        return messageTitle;
    }

    /**
     * Sets the value of the messageTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageTitle()
     */
    public void setMessageTitle(String value) {
        this.messageTitle = value;
    }

    /**
     * Описание сообщения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDescription() {
        return messageDescription;
    }

    /**
     * Sets the value of the messageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageDescription()
     */
    public void setMessageDescription(String value) {
        this.messageDescription = value;
    }

    /**
     * Текст сообщения
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
     * Прикрепленные к сообщению файлы
     * 
     * @return
     *     possible object is
     *     {@link AttachedDocumentType }
     *     
     */
    public AttachedDocumentType getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedDocumentType }
     *     
     * @see #getDocuments()
     */
    public void setDocuments(AttachedDocumentType value) {
        this.documents = value;
    }

}
