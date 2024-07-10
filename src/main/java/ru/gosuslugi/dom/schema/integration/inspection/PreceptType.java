
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
 * Предписание.
 * 
 * <p>Java class for PreceptType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PreceptType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *         <element name="Date" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *         <element name="Deadline" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ShortInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *         <element name="IsFulfiledPrecept" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ActualFulfiledPreceptDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType" minOccurs="0"/>
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
@XmlType(name = "PreceptType", propOrder = {
    "number",
    "date",
    "deadline",
    "fiasHouseGUID",
    "shortInfo",
    "isFulfiledPrecept",
    "actualFulfiledPreceptDate",
    "attachmentOrSignedAttachment"
})
public class PreceptType {

    /**
     * Номер документа.
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата документа.
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Срок исполнения требований
     * 
     */
    @XmlElement(name = "Deadline", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deadline;
    /**
     * Адрес дома.
     * 
     */
    @XmlElement(name = "FIASHouseGUID")
    protected List<String> fiasHouseGUID;
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
    @XmlElement(name = "IsFulfiledPrecept")
    protected Boolean isFulfiledPrecept;
    /**
     * Фактическая дата исполнения требований. Обязательно для заполнения, если IsFulfiledPrecept = True
     * 
     */
    @XmlElement(name = "ActualFulfiledPreceptDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualFulfiledPreceptDate;
    @XmlElements({
        @XmlElement(name = "Attachment", type = AttachmentType.class),
        @XmlElement(name = "SignedAttachment", type = SignedAttachmentType.class)
    })
    protected List<Object> attachmentOrSignedAttachment;

    /**
     * Номер документа.
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
     * Дата документа.
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
     * Срок исполнения требований
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadline() {
        return deadline;
    }

    /**
     * Sets the value of the deadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDeadline()
     */
    public void setDeadline(XMLGregorianCalendar value) {
        this.deadline = value;
    }

    /**
     * Адрес дома.
     * 
     * Gets the value of the fiasHouseGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiasHouseGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFIASHouseGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the fiasHouseGUID property.
     */
    public List<String> getFIASHouseGUID() {
        if (fiasHouseGUID == null) {
            fiasHouseGUID = new ArrayList<>();
        }
        return this.fiasHouseGUID;
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
    public Boolean isIsFulfiledPrecept() {
        return isFulfiledPrecept;
    }

    /**
     * Sets the value of the isFulfiledPrecept property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsFulfiledPrecept()
     */
    public void setIsFulfiledPrecept(Boolean value) {
        this.isFulfiledPrecept = value;
    }

    /**
     * Фактическая дата исполнения требований. Обязательно для заполнения, если IsFulfiledPrecept = True
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualFulfiledPreceptDate() {
        return actualFulfiledPreceptDate;
    }

    /**
     * Sets the value of the actualFulfiledPreceptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getActualFulfiledPreceptDate()
     */
    public void setActualFulfiledPreceptDate(XMLGregorianCalendar value) {
        this.actualFulfiledPreceptDate = value;
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

}
