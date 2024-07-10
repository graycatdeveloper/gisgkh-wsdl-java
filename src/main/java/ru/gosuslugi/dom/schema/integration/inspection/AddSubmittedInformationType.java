
package ru.gosuslugi.dom.schema.integration.inspection;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Протокол. Добавить сведения о передаче материалов по делу об административном правонарушении в суд.
 * 
 * <p>Java class for AddSubmittedInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AddSubmittedInformationType">
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
@XmlType(name = "AddSubmittedInformationType", propOrder = {
    "courtName",
    "submittedDate",
    "submittedNumber"
})
public class AddSubmittedInformationType {

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
