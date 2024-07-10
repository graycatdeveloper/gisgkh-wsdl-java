
package ru.gosuslugi.dom.schema.integration.msp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Решение
 * 
 * <p>Java class for DecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/msp/}String256Type" minOccurs="0"/>
 *         <element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="DecisionTypeCode" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="DecisionReasonCode" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionType", propOrder = {
    "number",
    "decisionDate",
    "decisionTypeCode",
    "decisionReasonCode",
    "eventDate",
    "attachment"
})
public class DecisionType {

    /**
     * Номер решения
     * 
     */
    @XmlElement(name = "Number")
    protected String number;
    /**
     * Дата решения
     * 
     */
    @XmlElement(name = "DecisionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    /**
     * Тип решения (НСИ 301)
     * 
     */
    @XmlElement(name = "DecisionTypeCode", required = true)
    protected NsiRef decisionTypeCode;
    /**
     * Основание решения (НСИ 302). Под основанием понимается (в зависимости от типа решения):
     * - Основание приостановления
     * - Основание возобновления
     * - Основание прекращения. Обязательно для заполнения для всех типов решений, кроме решений о предоставлении. Для решений о предоставлении поле не заполняется
     * 
     */
    @XmlElement(name = "DecisionReasonCode")
    protected NsiRef decisionReasonCode;
    /**
     * Дата события. Под датой события понимается (в зависимости от типа решения):
     * - Дата приостановления
     * - Дата возобновления
     * - Дата прекращения
     * Обязательно для заполнения для всех типов решений, кроме решений о предоставлении. Для решений о предоставлении поле не заполняется
     * 
     */
    @XmlElement(name = "EventDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    /**
     * Файлы решения
     * 
     */
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;

    /**
     * Номер решения
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
     * Дата решения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDecisionDate()
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Тип решения (НСИ 301)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDecisionTypeCode() {
        return decisionTypeCode;
    }

    /**
     * Sets the value of the decisionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDecisionTypeCode()
     */
    public void setDecisionTypeCode(NsiRef value) {
        this.decisionTypeCode = value;
    }

    /**
     * Основание решения (НСИ 302). Под основанием понимается (в зависимости от типа решения):
     * - Основание приостановления
     * - Основание возобновления
     * - Основание прекращения. Обязательно для заполнения для всех типов решений, кроме решений о предоставлении. Для решений о предоставлении поле не заполняется
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDecisionReasonCode() {
        return decisionReasonCode;
    }

    /**
     * Sets the value of the decisionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDecisionReasonCode()
     */
    public void setDecisionReasonCode(NsiRef value) {
        this.decisionReasonCode = value;
    }

    /**
     * Дата события. Под датой события понимается (в зависимости от типа решения):
     * - Дата приостановления
     * - Дата возобновления
     * - Дата прекращения
     * Обязательно для заполнения для всех типов решений, кроме решений о предоставлении. Для решений о предоставлении поле не заполняется
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEventDate()
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Файлы решения
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

}
