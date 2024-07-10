
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


/**
 * Нормативный правовой акт
 * 
 * <p>Java class for ActType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocNumber" type="{http://dom.gosuslugi.ru/schema/integration/msp/}String255Type" minOccurs="0"/>
 *         <element name="AcceptanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/msp/}String1000Type"/>
 *         <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActType", propOrder = {
    "docNumber",
    "acceptanceDate",
    "name",
    "attachment"
})
public class ActType {

    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "DocNumber")
    protected String docNumber;
    /**
     * Дата принятия документа органом власти
     * 
     */
    @XmlElement(name = "AcceptanceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acceptanceDate;
    /**
     * Наименование документа
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Файлы
     * 
     */
    @XmlElement(name = "Attachment", required = true)
    protected List<AttachmentType> attachment;

    /**
     * Номер документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocNumber()
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Дата принятия документа органом власти
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * Sets the value of the acceptanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAcceptanceDate()
     */
    public void setAcceptanceDate(XMLGregorianCalendar value) {
        this.acceptanceDate = value;
    }

    /**
     * Наименование документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Файлы
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
