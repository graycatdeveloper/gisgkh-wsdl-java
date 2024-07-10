
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Сведения о расторжении
 * 
 * <p>Java class for TerminationInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="TerminationInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type" minOccurs="0"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="AttachDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationInfoType", propOrder = {
    "reason",
    "number",
    "date",
    "attachDocument"
})
public class TerminationInfoType {

    /**
     * Причина
     * 
     */
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "Number")
    protected String number;
    /**
     * Дата документа
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Файлы документа
     * 
     */
    @XmlElement(name = "AttachDocument", required = true)
    protected List<AttachmentType> attachDocument;

    /**
     * Причина
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReason()
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Номер документа
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
     * Дата документа
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
     * Файлы документа
     * 
     * Gets the value of the attachDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachDocument().add(newItem);
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
     *     The value of the attachDocument property.
     */
    public List<AttachmentType> getAttachDocument() {
        if (attachDocument == null) {
            attachDocument = new ArrayList<>();
        }
        return this.attachDocument;
    }

}
