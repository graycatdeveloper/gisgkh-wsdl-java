
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
 * Протокол об административном правонарушении.
 * 
 * <p>Java class for OffenceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OffenceType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *         <element name="Date" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *         <element name="ShortInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *         <element name="IsFulfiledOffence" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsSubmittedToCourt" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="CourtName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *                   <element name="SubmittedDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *                   <element name="SubmittedNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ActualFulfiledOffenceDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
 *         <choice maxOccurs="unbounded">
 *           <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *           <element name="SignedAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType"/>
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
@XmlType(name = "OffenceType", propOrder = {
    "number",
    "date",
    "shortInfo",
    "isFulfiledOffence",
    "isSubmittedToCourt",
    "actualFulfiledOffenceDate",
    "attachmentOrSignedAttachment"
})
public class OffenceType {

    /**
     * Номер протокола.
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата составления протокола.
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Краткая информация.
     * 
     */
    @XmlElement(name = "ShortInfo")
    protected String shortInfo;
    /**
     * Сведения об исполнении True - исполнено, False - не исполнено
     * 
     */
    @XmlElement(name = "IsFulfiledOffence")
    protected Boolean isFulfiledOffence;
    /**
     * Материалы по делу об административном правонарушении переданы в суд
     * 
     */
    @XmlElement(name = "IsSubmittedToCourt")
    protected OffenceType.IsSubmittedToCourt isSubmittedToCourt;
    /**
     * Фактическая дата исполнения
     * 
     */
    @XmlElement(name = "ActualFulfiledOffenceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualFulfiledOffenceDate;
    @XmlElements({
        @XmlElement(name = "Attachment", type = AttachmentType.class),
        @XmlElement(name = "SignedAttachment", type = SignedAttachmentType.class)
    })
    protected List<Object> attachmentOrSignedAttachment;

    /**
     * Номер протокола.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата составления протокола.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Краткая информация.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortInfo() {
        return shortInfo;
    }

    /**
     * Sets the value of the shortInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getShortInfo()
     */
    public void setShortInfo(String value) {
        this.shortInfo = value;
    }

    /**
     * Сведения об исполнении True - исполнено, False - не исполнено
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFulfiledOffence() {
        return isFulfiledOffence;
    }

    /**
     * Sets the value of the isFulfiledOffence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsFulfiledOffence()
     */
    public void setIsFulfiledOffence(Boolean value) {
        this.isFulfiledOffence = value;
    }

    /**
     * Материалы по делу об административном правонарушении переданы в суд
     * 
     * @return
     *     possible object is
     *     {@link OffenceType.IsSubmittedToCourt }
     *     
     */
    public OffenceType.IsSubmittedToCourt getIsSubmittedToCourt() {
        return isSubmittedToCourt;
    }

    /**
     * Sets the value of the isSubmittedToCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenceType.IsSubmittedToCourt }
     *     
     * @see #getIsSubmittedToCourt()
     */
    public void setIsSubmittedToCourt(OffenceType.IsSubmittedToCourt value) {
        this.isSubmittedToCourt = value;
    }

    /**
     * Фактическая дата исполнения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualFulfiledOffenceDate() {
        return actualFulfiledOffenceDate;
    }

    /**
     * Sets the value of the actualFulfiledOffenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getActualFulfiledOffenceDate()
     */
    public void setActualFulfiledOffenceDate(XMLGregorianCalendar value) {
        this.actualFulfiledOffenceDate = value;
    }

    /**
     * Gets the value of the attachmentOrSignedAttachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentOrSignedAttachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachmentOrSignedAttachment().add(newItem);
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
     *     The value of the attachmentOrSignedAttachment property.
     */
    public List<Object> getAttachmentOrSignedAttachment() {
        if (attachmentOrSignedAttachment == null) {
            attachmentOrSignedAttachment = new ArrayList<>();
        }
        return this.attachmentOrSignedAttachment;
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
     *         <element name="CourtName" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
     *         <element name="SubmittedDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
     *         <element name="SubmittedNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
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
        "courtName",
        "submittedDate",
        "submittedNumber"
    })
    public static class IsSubmittedToCourt {

        /**
         * Наименование суда
         * 
         */
        @XmlElement(name = "CourtName", required = true)
        protected String courtName;
        /**
         * Дата
         * *В случае передачи материалов по делу об административном правонарушении в канцелярию суда - дата регистрации.
         * *В случае направления материалов почтовым отправлением - дата отправки.
         * *В случае направления материалов с сопроводительным письмом - дата данного письма.
         * 
         */
        @XmlElement(name = "SubmittedDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar submittedDate;
        /**
         * Номер
         * *В случае передачи материалов по делу об административном правонарушении в канцелярию суда - присвоенный входящий номер.
         * *В случае направления материалов почтовым отправлением - номер отправления либо реестровый номер отправителя.
         * *В случае направления материалов с сопроводительным письмом - исходящий номер данного письма.
         * 
         */
        @XmlElement(name = "SubmittedNumber", required = true)
        protected String submittedNumber;

        /**
         * Наименование суда
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourtName() {
            return courtName;
        }

        /**
         * Sets the value of the courtName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCourtName()
         */
        public void setCourtName(String value) {
            this.courtName = value;
        }

        /**
         * Дата
         * *В случае передачи материалов по делу об административном правонарушении в канцелярию суда - дата регистрации.
         * *В случае направления материалов почтовым отправлением - дата отправки.
         * *В случае направления материалов с сопроводительным письмом - дата данного письма.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSubmittedDate() {
            return submittedDate;
        }

        /**
         * Sets the value of the submittedDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSubmittedDate()
         */
        public void setSubmittedDate(XMLGregorianCalendar value) {
            this.submittedDate = value;
        }

        /**
         * Номер
         * *В случае передачи материалов по делу об административном правонарушении в канцелярию суда - присвоенный входящий номер.
         * *В случае направления материалов почтовым отправлением - номер отправления либо реестровый номер отправителя.
         * *В случае направления материалов с сопроводительным письмом - исходящий номер данного письма.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmittedNumber() {
            return submittedNumber;
        }

        /**
         * Sets the value of the submittedNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSubmittedNumber()
         */
        public void setSubmittedNumber(String value) {
            this.submittedNumber = value;
        }

    }

}
