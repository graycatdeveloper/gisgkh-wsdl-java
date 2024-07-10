
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;


/**
 * Составной тип. Сведения о новой версии договора для отправки заявителю
 * 
 * <p>Java class for CreateAgreementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CreateAgreementType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="AgreementFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
 *         <element name="MessageToApplicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String2000Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateAgreementType", propOrder = {
    "number",
    "date",
    "agreementFile",
    "messageToApplicant"
})
public class CreateAgreementType {

    /**
     * Номер договора
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата договора
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Файл договора, подписанный со стороны исполнителя
     * 
     */
    @XmlElement(name = "AgreementFile", required = true)
    protected List<SignedAttachmentType> agreementFile;
    /**
     * Сообщение заявителю
     * 
     */
    @XmlElement(name = "MessageToApplicant", required = true)
    protected String messageToApplicant;

    /**
     * Номер договора
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
     * Дата договора
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
     * Файл договора, подписанный со стороны исполнителя
     * 
     * Gets the value of the agreementFile property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementFile property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAgreementFile().add(newItem);
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
     *     The value of the agreementFile property.
     */
    public List<SignedAttachmentType> getAgreementFile() {
        if (agreementFile == null) {
            agreementFile = new ArrayList<>();
        }
        return this.agreementFile;
    }

    /**
     * Сообщение заявителю
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageToApplicant() {
        return messageToApplicant;
    }

    /**
     * Sets the value of the messageToApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageToApplicant()
     */
    public void setMessageToApplicant(String value) {
        this.messageToApplicant = value;
    }

}
