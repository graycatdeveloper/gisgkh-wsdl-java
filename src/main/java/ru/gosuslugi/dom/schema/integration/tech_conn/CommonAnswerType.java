
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Составной тип. Ответ заявителю - универсальный набор сведений
 * 
 * <p>Java class for CommonAnswerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CommonAnswerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Comment" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String4000Type"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <choice minOccurs="0">
 *           <element name="NewExecutionDeadline" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <sequence>
 *             <element name="DaysCount">
 *               <simpleType>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   <minInclusive value="1"/>
 *                   <maxInclusive value="30"/>
 *                 </restriction>
 *               </simpleType>
 *             </element>
 *             <element name="DaysType" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}DaysTypeType"/>
 *           </sequence>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonAnswerType", propOrder = {
    "comment",
    "attachment",
    "newExecutionDeadline",
    "daysCount",
    "daysType"
})
public class CommonAnswerType {

    /**
     * Сообщение заявителю
     * 
     */
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    /**
     * Прикрепленный файл
     * 
     */
    @XmlElement(name = "Attachment")
    protected List<SignedAttachmentType> attachment;
    /**
     * Новый срок исполнения
     * 
     */
    @XmlElement(name = "NewExecutionDeadline")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newExecutionDeadline;
    /**
     * Количество дней
     * 
     */
    @XmlElement(name = "DaysCount")
    protected Integer daysCount;
    /**
     * Тип дней для увеличения срока
     * 
     */
    @XmlElement(name = "DaysType")
    @XmlSchemaType(name = "string")
    protected DaysTypeType daysType;

    /**
     * Сообщение заявителю
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
     * Прикрепленный файл
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
     * {@link SignedAttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachment property.
     */
    public List<SignedAttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<>();
        }
        return this.attachment;
    }

    /**
     * Новый срок исполнения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewExecutionDeadline() {
        return newExecutionDeadline;
    }

    /**
     * Sets the value of the newExecutionDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getNewExecutionDeadline()
     */
    public void setNewExecutionDeadline(XMLGregorianCalendar value) {
        this.newExecutionDeadline = value;
    }

    /**
     * Количество дней
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysCount() {
        return daysCount;
    }

    /**
     * Sets the value of the daysCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getDaysCount()
     */
    public void setDaysCount(Integer value) {
        this.daysCount = value;
    }

    /**
     * Тип дней для увеличения срока
     * 
     * @return
     *     possible object is
     *     {@link DaysTypeType }
     *     
     */
    public DaysTypeType getDaysType() {
        return daysType;
    }

    /**
     * Sets the value of the daysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaysTypeType }
     *     
     * @see #getDaysType()
     */
    public void setDaysType(DaysTypeType value) {
        this.daysType = value;
    }

}
