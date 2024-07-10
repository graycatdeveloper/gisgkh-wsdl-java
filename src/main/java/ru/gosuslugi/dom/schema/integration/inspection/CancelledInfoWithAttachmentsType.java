
package ru.gosuslugi.dom.schema.integration.inspection;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Сведения об отмене (импорт)
 * 
 * <p>Java class for CancelledInfoWithAttachmentsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CancelledInfoWithAttachmentsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Date" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *         <element name="Number" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Organisation" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *         <element name="Attachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "CancelledInfoWithAttachmentsType", propOrder = {
    "reason",
    "date",
    "number",
    "organisation",
    "additionalInfo",
    "attachments",
    "signedAttachments"
})
public class CancelledInfoWithAttachmentsType {

    /**
     * Причина отмены (НСИ 271)
     * 
     */
    @XmlElement(name = "Reason", required = true)
    protected NsiRef reason;
    /**
     * Дата отмены
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Номер решения об отмене.
     * 
     */
    @XmlElement(name = "Number")
    protected String number;
    /**
     * Организация, принявшая решение
     * 
     */
    @XmlElement(name = "Organisation")
    protected RegOrgType organisation;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    /**
     * Документы по отмене. Поле является обязательным, если причина отмены = Решение суда
     * 
     */
    @XmlElement(name = "Attachments")
    protected List<AttachmentType> attachments;
    /**
     * Электронные документы по отмене с открепленной (detached) подписью
     * 
     */
    @XmlElement(name = "SignedAttachments")
    protected List<SignedAttachmentType> signedAttachments;

    /**
     * Причина отмены (НСИ 271)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getReason()
     */
    public void setReason(NsiRef value) {
        this.reason = value;
    }

    /**
     * Дата отмены
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
     * Номер решения об отмене.
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
     * Организация, принявшая решение
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrganisation() {
        return organisation;
    }

    /**
     * Sets the value of the organisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrganisation()
     */
    public void setOrganisation(RegOrgType value) {
        this.organisation = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Документы по отмене. Поле является обязательным, если причина отмены = Решение суда
     * 
     * Gets the value of the attachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachments().add(newItem);
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
     *     The value of the attachments property.
     */
    public List<AttachmentType> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        return this.attachments;
    }

    /**
     * Электронные документы по отмене с открепленной (detached) подписью
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
