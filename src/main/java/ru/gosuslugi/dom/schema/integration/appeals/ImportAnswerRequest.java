
package ru.gosuslugi.dom.schema.integration.appeals;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="AnswerAction" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <choice>
 *                       <element name="AppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="AppealNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealNumberType"/>
 *                     </choice>
 *                   </sequence>
 *                   <element name="Answer" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                             <element name="AnswerGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <choice>
 *                               <sequence>
 *                                 <element name="LoadAnswer" minOccurs="0">
 *                                   <complexType>
 *                                     <complexContent>
 *                                       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         <sequence>
 *                                           <element name="AnswerText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
 *                                           <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                                           <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                                         </sequence>
 *                                       </restriction>
 *                                     </complexContent>
 *                                   </complexType>
 *                                 </element>
 *                                 <element name="SendAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                               </sequence>
 *                               <element name="DeleteAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             </choice>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AppealAction" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="AppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="AppealNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealNumberType"/>
 *                   </choice>
 *                   <sequence>
 *                     <element name="Performer" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="DateOfAppointment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="Executed" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="RedirectAppeal" maxOccurs="unbounded" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RedirectAppealType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="RollOverAppeal" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RollOverAppealType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnswerIsNotRequired" minOccurs="0">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="Cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </sequence>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerAction",
    "appealAction"
})
@XmlRootElement(name = "importAnswerRequest")
public class ImportAnswerRequest
    extends BaseType
{

    /**
     * Действия с ответами на обращения
     * 
     */
    @XmlElement(name = "AnswerAction")
    protected List<ImportAnswerRequest.AnswerAction> answerAction;
    /**
     * Действия с обращениями
     * 
     */
    @XmlElement(name = "AppealAction")
    protected List<ImportAnswerRequest.AppealAction> appealAction;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Действия с ответами на обращения
     * 
     * Gets the value of the answerAction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerAction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnswerAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAnswerRequest.AnswerAction }
     * </p>
     * 
     * 
     * @return
     *     The value of the answerAction property.
     */
    public List<ImportAnswerRequest.AnswerAction> getAnswerAction() {
        if (answerAction == null) {
            answerAction = new ArrayList<>();
        }
        return this.answerAction;
    }

    /**
     * Действия с обращениями
     * 
     * Gets the value of the appealAction property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appealAction property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAppealAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAnswerRequest.AppealAction }
     * </p>
     * 
     * 
     * @return
     *     The value of the appealAction property.
     */
    public List<ImportAnswerRequest.AppealAction> getAppealAction() {
        if (appealAction == null) {
            appealAction = new ArrayList<>();
        }
        return this.appealAction;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *           <choice>
     *             <element name="AppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *             <element name="AppealNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealNumberType"/>
     *           </choice>
     *         </sequence>
     *         <element name="Answer" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                   <element name="AnswerGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <choice>
     *                     <sequence>
     *                       <element name="LoadAnswer" minOccurs="0">
     *                         <complexType>
     *                           <complexContent>
     *                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                               <sequence>
     *                                 <element name="AnswerText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
     *                                 <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                                 <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                               </sequence>
     *                             </restriction>
     *                           </complexContent>
     *                         </complexType>
     *                       </element>
     *                       <element name="SendAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                     </sequence>
     *                     <element name="DeleteAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   </choice>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
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
    @XmlType(name = "", propOrder = {
        "transportGUID",
        "appealGUID",
        "appealNumber",
        "answer"
    })
    public static class AnswerAction {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор обращения в системе ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AppealGUID")
        protected String appealGUID;
        /**
         * Номер обращения
         * 
         */
        @XmlElement(name = "AppealNumber")
        protected String appealNumber;
        /**
         * Ответ на обращение
         * 
         */
        @XmlElement(name = "Answer", required = true)
        protected List<ImportAnswerRequest.AnswerAction.Answer> answer;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Идентификатор обращения в системе ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppealGUID() {
            return appealGUID;
        }

        /**
         * Sets the value of the appealGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAppealGUID()
         */
        public void setAppealGUID(String value) {
            this.appealGUID = value;
        }

        /**
         * Номер обращения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppealNumber() {
            return appealNumber;
        }

        /**
         * Sets the value of the appealNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAppealNumber()
         */
        public void setAppealNumber(String value) {
            this.appealNumber = value;
        }

        /**
         * Ответ на обращение
         * 
         * Gets the value of the answer property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the answer property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAnswer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportAnswerRequest.AnswerAction.Answer }
         * </p>
         * 
         * 
         * @return
         *     The value of the answer property.
         */
        public List<ImportAnswerRequest.AnswerAction.Answer> getAnswer() {
            if (answer == null) {
                answer = new ArrayList<>();
            }
            return this.answer;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *         <element name="AnswerGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <choice>
         *           <sequence>
         *             <element name="LoadAnswer" minOccurs="0">
         *               <complexType>
         *                 <complexContent>
         *                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                     <sequence>
         *                       <element name="AnswerText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
         *                       <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *                       <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *                     </sequence>
         *                   </restriction>
         *                 </complexContent>
         *               </complexType>
         *             </element>
         *             <element name="SendAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *           </sequence>
         *           <element name="DeleteAnswer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        @XmlType(name = "", propOrder = {
            "transportGUID",
            "answerGUID",
            "answererGUID",
            "loadAnswer",
            "sendAnswer",
            "deleteAnswer"
        })
        public static class Answer {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор ответа. Заполняется при изменении ранее созданного ответа
             * 
             */
            @XmlElement(name = "AnswerGUID")
            protected String answerGUID;
            /**
             * Идентификатор исполнителя по обращению
             * 
             */
            @XmlElement(name = "AnswererGUID", required = true)
            protected String answererGUID;
            /**
             * Создание / изменение  ответа
             * 
             */
            @XmlElement(name = "LoadAnswer")
            protected ImportAnswerRequest.AnswerAction.Answer.LoadAnswer loadAnswer;
            /**
             * Отправка ответа
             * 
             */
            @XmlElement(name = "SendAnswer")
            protected Boolean sendAnswer;
            /**
             * Удаление ответа
             * 
             */
            @XmlElement(name = "DeleteAnswer")
            protected Boolean deleteAnswer;

            /**
             * Транспортный идентификатор
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransportGUID() {
                return transportGUID;
            }

            /**
             * Sets the value of the transportGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getTransportGUID()
             */
            public void setTransportGUID(String value) {
                this.transportGUID = value;
            }

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
             * Создание / изменение  ответа
             * 
             * @return
             *     possible object is
             *     {@link ImportAnswerRequest.AnswerAction.Answer.LoadAnswer }
             *     
             */
            public ImportAnswerRequest.AnswerAction.Answer.LoadAnswer getLoadAnswer() {
                return loadAnswer;
            }

            /**
             * Sets the value of the loadAnswer property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportAnswerRequest.AnswerAction.Answer.LoadAnswer }
             *     
             * @see #getLoadAnswer()
             */
            public void setLoadAnswer(ImportAnswerRequest.AnswerAction.Answer.LoadAnswer value) {
                this.loadAnswer = value;
            }

            /**
             * Отправка ответа
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSendAnswer() {
                return sendAnswer;
            }

            /**
             * Sets the value of the sendAnswer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isSendAnswer()
             */
            public void setSendAnswer(Boolean value) {
                this.sendAnswer = value;
            }

            /**
             * Удаление ответа
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDeleteAnswer() {
                return deleteAnswer;
            }

            /**
             * Sets the value of the deleteAnswer property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isDeleteAnswer()
             */
            public void setDeleteAnswer(Boolean value) {
                this.deleteAnswer = value;
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
             *         <element name="AnswerText" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}String10000Type"/>
             *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
             *         <element name="SignedAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
                "answerText",
                "attachment",
                "signedAttachments"
            })
            public static class LoadAnswer {

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
                 * Прикрепленные файлы с открепленной (detached) подписью
                 * 
                 */
                @XmlElement(name = "SignedAttachments")
                protected List<SignedAttachmentType> signedAttachments;

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
                 * Прикрепленные файлы с открепленной (detached) подписью
                 * 
                 * Gets the value of the signedAttachments property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the signedAttachments property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getSignedAttachments().add(newItem);
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
                 *     The value of the signedAttachments property.
                 */
                public List<SignedAttachmentType> getSignedAttachments() {
                    if (signedAttachments == null) {
                        signedAttachments = new ArrayList<>();
                    }
                    return this.signedAttachments;
                }

            }

        }

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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="AppealGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="AppealNumber" type="{http://dom.gosuslugi.ru/schema/integration/appeals/}AppealNumberType"/>
     *         </choice>
     *         <sequence>
     *           <element name="Performer" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="DateOfAppointment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="Executed" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="RedirectAppeal" maxOccurs="unbounded" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RedirectAppealType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="RollOverAppeal" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RollOverAppealType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnswerIsNotRequired" minOccurs="0">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="Cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                     <element name="AnswererGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </sequence>
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
        "transportGUID",
        "appealGUID",
        "appealNumber",
        "performer",
        "executed",
        "redirectAppeal",
        "rollOverAppeal",
        "answerIsNotRequired"
    })
    public static class AppealAction {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор обращения в системе ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AppealGUID")
        protected String appealGUID;
        /**
         * Номер обращения
         * 
         */
        @XmlElement(name = "AppealNumber")
        protected String appealNumber;
        /**
         * Назначить/ изменить исполнителя по обращению
         * 
         */
        @XmlElement(name = "Performer")
        protected ImportAnswerRequest.AppealAction.Performer performer;
        /**
         * Проставить для обращения статус "Исполнено"
         * 
         */
        @XmlElement(name = "Executed")
        protected ImportAnswerRequest.AppealAction.Executed executed;
        /**
         * Переадресация обращения другой организации
         * 
         */
        @XmlElement(name = "RedirectAppeal")
        protected List<ImportAnswerRequest.AppealAction.RedirectAppeal> redirectAppeal;
        /**
         * Продление срока рассмотрения обращения
         * 
         */
        @XmlElement(name = "RollOverAppeal")
        protected ImportAnswerRequest.AppealAction.RollOverAppeal rollOverAppeal;
        /**
         * Ответ на обращение не требуется
         * 
         */
        @XmlElement(name = "AnswerIsNotRequired")
        protected ImportAnswerRequest.AppealAction.AnswerIsNotRequired answerIsNotRequired;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Идентификатор обращения в системе ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppealGUID() {
            return appealGUID;
        }

        /**
         * Sets the value of the appealGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAppealGUID()
         */
        public void setAppealGUID(String value) {
            this.appealGUID = value;
        }

        /**
         * Номер обращения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppealNumber() {
            return appealNumber;
        }

        /**
         * Sets the value of the appealNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAppealNumber()
         */
        public void setAppealNumber(String value) {
            this.appealNumber = value;
        }

        /**
         * Назначить/ изменить исполнителя по обращению
         * 
         * @return
         *     possible object is
         *     {@link ImportAnswerRequest.AppealAction.Performer }
         *     
         */
        public ImportAnswerRequest.AppealAction.Performer getPerformer() {
            return performer;
        }

        /**
         * Sets the value of the performer property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAnswerRequest.AppealAction.Performer }
         *     
         * @see #getPerformer()
         */
        public void setPerformer(ImportAnswerRequest.AppealAction.Performer value) {
            this.performer = value;
        }

        /**
         * Проставить для обращения статус "Исполнено"
         * 
         * @return
         *     possible object is
         *     {@link ImportAnswerRequest.AppealAction.Executed }
         *     
         */
        public ImportAnswerRequest.AppealAction.Executed getExecuted() {
            return executed;
        }

        /**
         * Sets the value of the executed property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAnswerRequest.AppealAction.Executed }
         *     
         * @see #getExecuted()
         */
        public void setExecuted(ImportAnswerRequest.AppealAction.Executed value) {
            this.executed = value;
        }

        /**
         * Переадресация обращения другой организации
         * 
         * Gets the value of the redirectAppeal property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the redirectAppeal property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRedirectAppeal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportAnswerRequest.AppealAction.RedirectAppeal }
         * </p>
         * 
         * 
         * @return
         *     The value of the redirectAppeal property.
         */
        public List<ImportAnswerRequest.AppealAction.RedirectAppeal> getRedirectAppeal() {
            if (redirectAppeal == null) {
                redirectAppeal = new ArrayList<>();
            }
            return this.redirectAppeal;
        }

        /**
         * Продление срока рассмотрения обращения
         * 
         * @return
         *     possible object is
         *     {@link ImportAnswerRequest.AppealAction.RollOverAppeal }
         *     
         */
        public ImportAnswerRequest.AppealAction.RollOverAppeal getRollOverAppeal() {
            return rollOverAppeal;
        }

        /**
         * Sets the value of the rollOverAppeal property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAnswerRequest.AppealAction.RollOverAppeal }
         *     
         * @see #getRollOverAppeal()
         */
        public void setRollOverAppeal(ImportAnswerRequest.AppealAction.RollOverAppeal value) {
            this.rollOverAppeal = value;
        }

        /**
         * Ответ на обращение не требуется
         * 
         * @return
         *     possible object is
         *     {@link ImportAnswerRequest.AppealAction.AnswerIsNotRequired }
         *     
         */
        public ImportAnswerRequest.AppealAction.AnswerIsNotRequired getAnswerIsNotRequired() {
            return answerIsNotRequired;
        }

        /**
         * Sets the value of the answerIsNotRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAnswerRequest.AppealAction.AnswerIsNotRequired }
         *     
         * @see #getAnswerIsNotRequired()
         */
        public void setAnswerIsNotRequired(ImportAnswerRequest.AppealAction.AnswerIsNotRequired value) {
            this.answerIsNotRequired = value;
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
         *         <element name="Cause" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "cause",
            "answererGUID"
        })
        public static class AnswerIsNotRequired {

            /**
             * Причина, по которой ответ на обращение не требуется
             * 
             */
            @XmlElement(name = "Cause", required = true)
            protected String cause;
            /**
             * Идентификатор исполнителя по обращению
             * 
             */
            @XmlElement(name = "AnswererGUID", required = true)
            protected String answererGUID;

            /**
             * Причина, по которой ответ на обращение не требуется
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCause() {
                return cause;
            }

            /**
             * Sets the value of the cause property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCause()
             */
            public void setCause(String value) {
                this.cause = value;
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
        public static class Executed {

            /**
             * Идентификатор исполнителя по обращению
             * 
             */
            @XmlElement(name = "AnswererGUID", required = true)
            protected String answererGUID;

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
         *         <element name="DateOfAppointment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "answererGUID",
            "dateOfAppointment"
        })
        public static class Performer {

            /**
             * Идентификатор исполнителя по обращению
             * 
             */
            @XmlElement(name = "AnswererGUID", required = true)
            protected String answererGUID;
            /**
             * Плановая дата исполнения
             * Заполняется при первичном назначении исполнителя
             * 
             */
            @XmlElement(name = "DateOfAppointment")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateOfAppointment;

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
             * Плановая дата исполнения
             * Заполняется при первичном назначении исполнителя
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateOfAppointment() {
                return dateOfAppointment;
            }

            /**
             * Sets the value of the dateOfAppointment property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getDateOfAppointment()
             */
            public void setDateOfAppointment(XMLGregorianCalendar value) {
                this.dateOfAppointment = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RedirectAppealType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RedirectAppeal
            extends RedirectAppealType
        {


        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/appeals/}RollOverAppealType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RollOverAppeal
            extends RollOverAppealType
        {


        }

    }

}
