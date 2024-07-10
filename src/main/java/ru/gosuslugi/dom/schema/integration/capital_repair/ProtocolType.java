
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 * Общий тип для протокола общего собрания собственников
 * 
 * <p>Java class for ProtocolType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProtocolType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <sequence>
 *           <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type"/>
 *           <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <choice>
 *             <element name="Attachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100"/>
 *             <element name="DocumentIsNotAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           </choice>
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
@XmlType(name = "ProtocolType", propOrder = {
    "votingProtocolGUID",
    "number",
    "date",
    "attachment",
    "documentIsNotAvailable"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.DecisionType.Protocol.class,
    ru.gosuslugi.dom.schema.integration.capital_repair.DecisionPDType.Reason.Protocol.class
})
public class ProtocolType {

    /**
     * Идентификатор версии протокола
     * 
     */
    @XmlElement(name = "VotingProtocolGUID")
    protected String votingProtocolGUID;
    /**
     * Номер протокола
     * 
     */
    @XmlElement(name = "Number")
    protected String number;
    /**
     * Дата протокола
     * 
     */
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Файлы протокола
     * 
     */
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    /**
     * Файлы протокола отсутствуют
     * 
     */
    @XmlElement(name = "DocumentIsNotAvailable")
    protected Boolean documentIsNotAvailable;

    /**
     * Идентификатор версии протокола
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingProtocolGUID() {
        return votingProtocolGUID;
    }

    /**
     * Sets the value of the votingProtocolGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingProtocolGUID()
     */
    public void setVotingProtocolGUID(String value) {
        this.votingProtocolGUID = value;
    }

    /**
     * Номер протокола
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
     * Дата протокола
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
     * Файлы протокола
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
     * Файлы протокола отсутствуют
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentIsNotAvailable() {
        return documentIsNotAvailable;
    }

    /**
     * Sets the value of the documentIsNotAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDocumentIsNotAvailable()
     */
    public void setDocumentIsNotAvailable(Boolean value) {
        this.documentIsNotAvailable = value;
    }

}
