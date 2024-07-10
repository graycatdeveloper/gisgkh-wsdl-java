
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта сообщений о проведении ОСС
 * 
 * <p>Java class for exportVotingMessageResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportVotingMessageResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}MessageExportType">
 *       <sequence>
 *         <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="MessageStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}MessageStatusType"/>
 *         <element name="PublishDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportVotingMessageResultType", propOrder = {
    "messageGUID",
    "messageStatus",
    "publishDate",
    "modificationDate"
})
public class ExportVotingMessageResultType
    extends MessageExportType
{

    /**
     * Идентификатор сообщения о проведении голосования
     * 
     */
    @XmlElement(name = "MessageGUID", required = true)
    protected String messageGUID;
    /**
     * Статус сообщения о проведении ОСС
     * Допустимые значения:
     * - Posted - Размещено
     * - Goes - Голосование идет
     * - Finished - Голосование завершено
     * - MeetingCancelled - Собрание не состоялось
     * - Cancelled - Аннулирован
     * 
     */
    @XmlElement(name = "MessageStatus", required = true)
    @XmlSchemaType(name = "string")
    protected MessageStatusType messageStatus;
    /**
     * Дата и время размещения версии сообщения
     * 
     */
    @XmlElement(name = "PublishDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publishDate;
    /**
     * Дата и время последнего изменения версии сообщения
     * 
     */
    @XmlElement(name = "ModificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modificationDate;

    /**
     * Идентификатор сообщения о проведении голосования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageGUID()
     */
    public void setMessageGUID(String value) {
        this.messageGUID = value;
    }

    /**
     * Статус сообщения о проведении ОСС
     * Допустимые значения:
     * - Posted - Размещено
     * - Goes - Голосование идет
     * - Finished - Голосование завершено
     * - MeetingCancelled - Собрание не состоялось
     * - Cancelled - Аннулирован
     * 
     * @return
     *     possible object is
     *     {@link MessageStatusType }
     *     
     */
    public MessageStatusType getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStatusType }
     *     
     * @see #getMessageStatus()
     */
    public void setMessageStatus(MessageStatusType value) {
        this.messageStatus = value;
    }

    /**
     * Дата и время размещения версии сообщения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPublishDate()
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * Дата и время последнего изменения версии сообщения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getModificationDate()
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

}
