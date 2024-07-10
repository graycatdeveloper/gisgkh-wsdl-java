
package ru.gosuslugi.dom.schema.integration.inspection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Сведения о результатах проверки
 * 
 * <p>Java class for ResultsInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResultsInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinishedInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Result" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationResultType"/>
 *                   <choice maxOccurs="unbounded">
 *                     <element name="OtherDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *                     <element name="SignedOtherDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FamiliarizationInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="NotFamiliarize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <sequence>
 *                     <element name="PersonRefused" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   </sequence>
 *                   <sequence>
 *                     <element name="FamiliarizationDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *                     <element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     <element name="FamiliarizedPerson" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   </sequence>
 *                 </choice>
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
@XmlType(name = "ResultsInfoType", propOrder = {
    "finishedInfo",
    "familiarizationInfo"
})
public class ResultsInfoType {

    /**
     * Информация о результате проверки.
     * 
     */
    @XmlElement(name = "FinishedInfo", required = true)
    protected ResultsInfoType.FinishedInfo finishedInfo;
    /**
     * Информация об ознакомлении с результатами проверки
     * 
     */
    @XmlElement(name = "FamiliarizationInfo", required = true)
    protected ResultsInfoType.FamiliarizationInfo familiarizationInfo;

    /**
     * Информация о результате проверки.
     * 
     * @return
     *     possible object is
     *     {@link ResultsInfoType.FinishedInfo }
     *     
     */
    public ResultsInfoType.FinishedInfo getFinishedInfo() {
        return finishedInfo;
    }

    /**
     * Sets the value of the finishedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsInfoType.FinishedInfo }
     *     
     * @see #getFinishedInfo()
     */
    public void setFinishedInfo(ResultsInfoType.FinishedInfo value) {
        this.finishedInfo = value;
    }

    /**
     * Информация об ознакомлении с результатами проверки
     * 
     * @return
     *     possible object is
     *     {@link ResultsInfoType.FamiliarizationInfo }
     *     
     */
    public ResultsInfoType.FamiliarizationInfo getFamiliarizationInfo() {
        return familiarizationInfo;
    }

    /**
     * Sets the value of the familiarizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsInfoType.FamiliarizationInfo }
     *     
     * @see #getFamiliarizationInfo()
     */
    public void setFamiliarizationInfo(ResultsInfoType.FamiliarizationInfo value) {
        this.familiarizationInfo = value;
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
     *       <choice>
     *         <element name="NotFamiliarize" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <sequence>
     *           <element name="PersonRefused" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         </sequence>
     *         <sequence>
     *           <element name="FamiliarizationDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
     *           <element name="IsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *           <element name="FamiliarizedPerson" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         </sequence>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notFamiliarize",
        "personRefused",
        "familiarizationDate",
        "isSigned",
        "familiarizedPerson"
    })
    public static class FamiliarizationInfo {

        /**
         * Не ознакомлен
         * 
         */
        @XmlElement(name = "NotFamiliarize")
        protected Boolean notFamiliarize;
        /**
         * ФИО должностного лица, отказавшегося от ознакомления с актом проверки
         * 
         */
        @XmlElement(name = "PersonRefused")
        protected String personRefused;
        /**
         * Дата ознакомления
         * 
         */
        @XmlElement(name = "FamiliarizationDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar familiarizationDate;
        /**
         * Наличие подписи
         * 
         */
        @XmlElement(name = "IsSigned")
        protected Boolean isSigned;
        /**
         * ФИО должностного лица, ознакомившегося с актом проверки
         * 
         */
        @XmlElement(name = "FamiliarizedPerson")
        protected String familiarizedPerson;

        /**
         * Не ознакомлен
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNotFamiliarize() {
            return notFamiliarize;
        }

        /**
         * Sets the value of the notFamiliarize property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isNotFamiliarize()
         */
        public void setNotFamiliarize(Boolean value) {
            this.notFamiliarize = value;
        }

        /**
         * ФИО должностного лица, отказавшегося от ознакомления с актом проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonRefused() {
            return personRefused;
        }

        /**
         * Sets the value of the personRefused property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPersonRefused()
         */
        public void setPersonRefused(String value) {
            this.personRefused = value;
        }

        /**
         * Дата ознакомления
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFamiliarizationDate() {
            return familiarizationDate;
        }

        /**
         * Sets the value of the familiarizationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getFamiliarizationDate()
         */
        public void setFamiliarizationDate(XMLGregorianCalendar value) {
            this.familiarizationDate = value;
        }

        /**
         * Наличие подписи
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsSigned() {
            return isSigned;
        }

        /**
         * Sets the value of the isSigned property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsSigned()
         */
        public void setIsSigned(Boolean value) {
            this.isSigned = value;
        }

        /**
         * ФИО должностного лица, ознакомившегося с актом проверки
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFamiliarizedPerson() {
            return familiarizedPerson;
        }

        /**
         * Sets the value of the familiarizedPerson property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFamiliarizedPerson()
         */
        public void setFamiliarizedPerson(String value) {
            this.familiarizedPerson = value;
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
     *         <element name="Result" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationResultType"/>
     *         <choice maxOccurs="unbounded">
     *           <element name="OtherDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
     *           <element name="SignedOtherDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType"/>
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
        "result",
        "otherDocumentOrSignedOtherDocument"
    })
    public static class FinishedInfo {

        /**
         * Сведения о результате проверки.
         * 
         */
        @XmlElement(name = "Result", required = true)
        protected ExaminationResultType result;
        @XmlElements({
            @XmlElement(name = "OtherDocument", type = AttachmentType.class),
            @XmlElement(name = "SignedOtherDocument", type = SignedAttachmentType.class)
        })
        protected List<Object> otherDocumentOrSignedOtherDocument;

        /**
         * Сведения о результате проверки.
         * 
         * @return
         *     possible object is
         *     {@link ExaminationResultType }
         *     
         */
        public ExaminationResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExaminationResultType }
         *     
         * @see #getResult()
         */
        public void setResult(ExaminationResultType value) {
            this.result = value;
        }

        /**
         * Gets the value of the otherDocumentOrSignedOtherDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherDocumentOrSignedOtherDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOtherDocumentOrSignedOtherDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentType }
         * {@link SignedAttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the otherDocumentOrSignedOtherDocument property.
         */
        public List<Object> getOtherDocumentOrSignedOtherDocument() {
            if (otherDocumentOrSignedOtherDocument == null) {
                otherDocumentOrSignedOtherDocument = new ArrayList<>();
            }
            return this.otherDocumentOrSignedOtherDocument;
        }

    }

}
