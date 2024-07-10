
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
 * Сведения об изменении проверки (импорт)
 * 
 * <p>Java class for ExaminationChangeInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExaminationChangeInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChangeReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="ChangeDecisionNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *         <element name="ChangeDate" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedDateType"/>
 *         <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *         <element name="AdditionChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
@XmlType(name = "ExaminationChangeInfoType", propOrder = {
    "changeReason",
    "changeDecisionNumber",
    "changeDate",
    "organization",
    "additionChangeInfo",
    "attachments",
    "signedAttachments"
})
public class ExaminationChangeInfoType {

    /**
     * Причина изменения (НСИ 271)
     * 
     */
    @XmlElement(name = "ChangeReason", required = true)
    protected NsiRef changeReason;
    /**
     * Номер решения об изменении (обязательно, если «Причина изменения» = «Решение суда» или «Решение уполномоченного органа / вышестоящей организации»)
     * 
     */
    @XmlElement(name = "ChangeDecisionNumber")
    protected String changeDecisionNumber;
    /**
     * Дата изменения проверки
     * 
     */
    @XmlElement(name = "ChangeDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar changeDate;
    /**
     * Организация, принявшая решение
     * 
     */
    @XmlElement(name = "Organization")
    protected RegOrgType organization;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionChangeInfo")
    protected String additionChangeInfo;
    /**
     * Прикрепленные файлы
     * 
     */
    @XmlElement(name = "Attachments")
    protected List<AttachmentType> attachments;
    /**
     * Электронные документы с открепленной (detached) подписью
     * 
     */
    @XmlElement(name = "SignedAttachments")
    protected List<SignedAttachmentType> signedAttachments;

    /**
     * Причина изменения (НСИ 271)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getChangeReason()
     */
    public void setChangeReason(NsiRef value) {
        this.changeReason = value;
    }

    /**
     * Номер решения об изменении (обязательно, если «Причина изменения» = «Решение суда» или «Решение уполномоченного органа / вышестоящей организации»)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeDecisionNumber() {
        return changeDecisionNumber;
    }

    /**
     * Sets the value of the changeDecisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChangeDecisionNumber()
     */
    public void setChangeDecisionNumber(String value) {
        this.changeDecisionNumber = value;
    }

    /**
     * Дата изменения проверки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeDate() {
        return changeDate;
    }

    /**
     * Sets the value of the changeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getChangeDate()
     */
    public void setChangeDate(XMLGregorianCalendar value) {
        this.changeDate = value;
    }

    /**
     * Организация, принявшая решение
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(RegOrgType value) {
        this.organization = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionChangeInfo() {
        return additionChangeInfo;
    }

    /**
     * Sets the value of the additionChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionChangeInfo()
     */
    public void setAdditionChangeInfo(String value) {
        this.additionChangeInfo = value;
    }

    /**
     * Прикрепленные файлы
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
     * Электронные документы с открепленной (detached) подписью
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
