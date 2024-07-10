
package ru.gosuslugi.dom.schema.integration.appeals;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Ответ на обращение
 * 
 * <p>Java class for AppealAnswerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AppealAnswerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnswerGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="AnswerText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
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
@XmlType(name = "AppealAnswerType", propOrder = {
    "answerGUID",
    "answerText",
    "attachment",
    "answererGUID"
})
public class AppealAnswerType {

    /**
     * Идентификатор ответа. Заполняется при изменении ранее созданного ответа
     * 
     */
    @XmlElement(name = "AnswerGUID")
    protected String answerGUID;
    /**
     * Текст ответа
     * 
     */
    @XmlElement(name = "AnswerText", required = true)
    protected String answerText;
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
     * Идентификатор ответа. Заполняется при изменении ранее созданного ответа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerGUID() {
        return answerGUID;
    }

    /**
     * Sets the value of the answerGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnswerGUID()
     */
    public void setAnswerGUID(String value) {
        this.answerGUID = value;
    }

    /**
     * Текст ответа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerText() {
        return answerText;
    }

    /**
     * Sets the value of the answerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnswerText()
     */
    public void setAnswerText(String value) {
        this.answerText = value;
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

}
