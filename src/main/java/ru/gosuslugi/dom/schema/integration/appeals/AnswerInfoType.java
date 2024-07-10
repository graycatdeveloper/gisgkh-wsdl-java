
package ru.gosuslugi.dom.schema.integration.appeals;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Информация об ответе
 * 
 * <p>Java class for AnswerInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnswerInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnswerGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="AnswerNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AnswerNumberType" minOccurs="0"/>
 *         <element name="SendAnswerDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Answerer">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnswerText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerInfoType", propOrder = {
    "answerGUID",
    "answerNumber",
    "sendAnswerDate",
    "answerer",
    "answerText",
    "attachment"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.appeals.ExportAppealResultType.AppealHistory.Answer.class
})
public class AnswerInfoType {

    /**
     * Идентификатор ответа
     * 
     */
    @XmlElement(name = "AnswerGUID")
    protected String answerGUID;
    /**
     * Номер ответа на обращение
     * 
     */
    @XmlElement(name = "AnswerNumber")
    protected String answerNumber;
    /**
     * Дата отправки ответа на обращение
     * 
     */
    @XmlElement(name = "SendAnswerDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sendAnswerDate;
    /**
     * Лицо - исполнитель обращения
     * 
     */
    @XmlElement(name = "Answerer", required = true)
    protected AnswerInfoType.Answerer answerer;
    /**
     * Текст ответа на обращение
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
     * Идентификатор ответа
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
     * Номер ответа на обращение
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerNumber() {
        return answerNumber;
    }

    /**
     * Sets the value of the answerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnswerNumber()
     */
    public void setAnswerNumber(String value) {
        this.answerNumber = value;
    }

    /**
     * Дата отправки ответа на обращение
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendAnswerDate() {
        return sendAnswerDate;
    }

    /**
     * Sets the value of the sendAnswerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getSendAnswerDate()
     */
    public void setSendAnswerDate(XMLGregorianCalendar value) {
        this.sendAnswerDate = value;
    }

    /**
     * Лицо - исполнитель обращения
     * 
     * @return
     *     possible object is
     *     {@link AnswerInfoType.Answerer }
     *     
     */
    public AnswerInfoType.Answerer getAnswerer() {
        return answerer;
    }

    /**
     * Sets the value of the answerer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnswerInfoType.Answerer }
     *     
     * @see #getAnswerer()
     */
    public void setAnswerer(AnswerInfoType.Answerer value) {
        this.answerer = value;
    }

    /**
     * Текст ответа на обращение
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
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
    @XmlType(name = "", propOrder = {
        "answererGUID"
    })
    public static class Answerer {

        /**
         * Идентификатор исполнителя
         * 
         */
        @XmlElement(name = "AnswererGUID", required = true)
        protected String answererGUID;

        /**
         * Идентификатор исполнителя
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

}
