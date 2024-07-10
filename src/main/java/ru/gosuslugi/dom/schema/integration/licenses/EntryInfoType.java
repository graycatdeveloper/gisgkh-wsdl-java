
package ru.gosuslugi.dom.schema.integration.licenses;

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


/**
 * Общая информация о реестровой записи
 * 
 * <p>Java class for EntryInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntryInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntryNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EntryNumberType"/>
 *         <element name="EntryType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="EntryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="EntryStatus" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EntryStatusType"/>
 *         <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="AuthorOrg" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="4000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AuthorFio" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CreationBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="ChangingEntryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="AdditionalInformation" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="OrderNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}OrderNumberType"/>
 *           <element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         </sequence>
 *         <element name="DontSendToErul" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DontSendToFns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <sequence minOccurs="0">
 *           <element name="OrderAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="SignedOrderAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *         <sequence minOccurs="0">
 *           <element name="AccompanyingAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="SignedAccompanyingAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryInfoType", propOrder = {
    "entryNumber",
    "entryType",
    "entryGuid",
    "entryStatus",
    "isActual",
    "publishDate",
    "authorOrg",
    "authorFio",
    "creationBase",
    "changingEntryGuid",
    "additionalInformation",
    "orderNumber",
    "orderDate",
    "dontSendToErul",
    "dontSendToFns",
    "orderAttachments",
    "signedOrderAttachments",
    "accompanyingAttachments",
    "signedAccompanyingAttachments"
})
public class EntryInfoType {

    /**
     * Номер реестровой записи
     * 
     */
    @XmlElement(name = "EntryNumber")
    protected int entryNumber;
    /**
     * Тип реестровой записи (НСИ 215)
     * 
     */
    @XmlElement(name = "EntryType", required = true)
    protected NsiRef entryType;
    /**
     * Идентификатор реестровой записи
     * 
     */
    @XmlElement(name = "EntryGuid", required = true)
    protected String entryGuid;
    /**
     * Статус реестровой записи
     * PUBLISHED - Реестровая запись размещена
     * PUBLISHED_WITHOUT_ERUL_NUMBER - Реестровая запись размещена, но номер из ЕРУЛ еще не получен
     * 
     */
    @XmlElement(name = "EntryStatus", required = true)
    @XmlSchemaType(name = "string")
    protected EntryStatusType entryStatus;
    /**
     * Актуальность реестровой записи
     * 
     */
    @XmlElement(name = "IsActual")
    protected boolean isActual;
    /**
     * Дата и время размещения реестровой записи
     * 
     */
    @XmlElement(name = "PublishDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;
    /**
     * Организация, внесшая реестровую запись
     * 
     */
    @XmlElement(name = "AuthorOrg")
    protected String authorOrg;
    /**
     * Сотрудник, внесший реестровую запись
     * 
     */
    @XmlElement(name = "AuthorFio")
    protected String authorFio;
    /**
     * Основание внесения реестровой записи НСИ 216
     * 
     */
    @XmlElement(name = "CreationBase")
    protected NsiRef creationBase;
    /**
     * Идентификатор записи, исправляемой текущей записью
     * 
     */
    @XmlElement(name = "ChangingEntryGuid")
    protected String changingEntryGuid;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Номер приказа о заверении реестровой записи
     * 
     */
    @XmlElement(name = "OrderNumber")
    protected String orderNumber;
    /**
     * Дата приказа о заверении реестровой записи
     * 
     */
    @XmlElement(name = "OrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderDate;
    /**
     * Не отправлять реестровую запись в единый реестру учета лицензий
     * 
     */
    @XmlElement(name = "DontSendToErul")
    protected Boolean dontSendToErul;
    /**
     * Не отправлять реестровую запись в ФНС (ЕГРЮЛ/ЕГРИП)
     * 
     */
    @XmlElement(name = "DontSendToFns")
    protected Boolean dontSendToFns;
    /**
     * Документ, заверяющий реестровую запись
     * 
     */
    @XmlElement(name = "OrderAttachments")
    protected List<AttachmentType> orderAttachments;
    /**
     * Документ, заверяющий реестровую запись с электронной подписью
     * 
     */
    @XmlElement(name = "SignedOrderAttachments")
    protected List<SignedAttachmentType> signedOrderAttachments;
    /**
     * Сопроводительные документы
     * 
     */
    @XmlElement(name = "AccompanyingAttachments")
    protected List<AttachmentType> accompanyingAttachments;
    /**
     * Сопроводительные документы с электронной подписью
     * 
     */
    @XmlElement(name = "SignedAccompanyingAttachments")
    protected List<SignedAttachmentType> signedAccompanyingAttachments;

    /**
     * Номер реестровой записи
     * 
     */
    public int getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     */
    public void setEntryNumber(int value) {
        this.entryNumber = value;
    }

    /**
     * Тип реестровой записи (НСИ 215)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getEntryType()
     */
    public void setEntryType(NsiRef value) {
        this.entryType = value;
    }

    /**
     * Идентификатор реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryGuid() {
        return entryGuid;
    }

    /**
     * Sets the value of the entryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEntryGuid()
     */
    public void setEntryGuid(String value) {
        this.entryGuid = value;
    }

    /**
     * Статус реестровой записи
     * PUBLISHED - Реестровая запись размещена
     * PUBLISHED_WITHOUT_ERUL_NUMBER - Реестровая запись размещена, но номер из ЕРУЛ еще не получен
     * 
     * @return
     *     possible object is
     *     {@link EntryStatusType }
     *     
     */
    public EntryStatusType getEntryStatus() {
        return entryStatus;
    }

    /**
     * Sets the value of the entryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryStatusType }
     *     
     * @see #getEntryStatus()
     */
    public void setEntryStatus(EntryStatusType value) {
        this.entryStatus = value;
    }

    /**
     * Актуальность реестровой записи
     * 
     */
    public boolean isIsActual() {
        return isActual;
    }

    /**
     * Sets the value of the isActual property.
     * 
     */
    public void setIsActual(boolean value) {
        this.isActual = value;
    }

    /**
     * Дата и время размещения реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublishDate() {
        return publishDate;
    }

    /**
     * Sets the value of the publishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPublishDate()
     */
    public void setPublishDate(XMLGregorianCalendar value) {
        this.publishDate = value;
    }

    /**
     * Организация, внесшая реестровую запись
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorOrg() {
        return authorOrg;
    }

    /**
     * Sets the value of the authorOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuthorOrg()
     */
    public void setAuthorOrg(String value) {
        this.authorOrg = value;
    }

    /**
     * Сотрудник, внесший реестровую запись
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorFio() {
        return authorFio;
    }

    /**
     * Sets the value of the authorFio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAuthorFio()
     */
    public void setAuthorFio(String value) {
        this.authorFio = value;
    }

    /**
     * Основание внесения реестровой записи НСИ 216
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getCreationBase() {
        return creationBase;
    }

    /**
     * Sets the value of the creationBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getCreationBase()
     */
    public void setCreationBase(NsiRef value) {
        this.creationBase = value;
    }

    /**
     * Идентификатор записи, исправляемой текущей записью
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangingEntryGuid() {
        return changingEntryGuid;
    }

    /**
     * Sets the value of the changingEntryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChangingEntryGuid()
     */
    public void setChangingEntryGuid(String value) {
        this.changingEntryGuid = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInformation()
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Номер приказа о заверении реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderNumber()
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Дата приказа о заверении реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOrderDate()
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * Не отправлять реестровую запись в единый реестру учета лицензий
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontSendToErul() {
        return dontSendToErul;
    }

    /**
     * Sets the value of the dontSendToErul property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDontSendToErul()
     */
    public void setDontSendToErul(Boolean value) {
        this.dontSendToErul = value;
    }

    /**
     * Не отправлять реестровую запись в ФНС (ЕГРЮЛ/ЕГРИП)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontSendToFns() {
        return dontSendToFns;
    }

    /**
     * Sets the value of the dontSendToFns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDontSendToFns()
     */
    public void setDontSendToFns(Boolean value) {
        this.dontSendToFns = value;
    }

    /**
     * Документ, заверяющий реестровую запись
     * 
     * Gets the value of the orderAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrderAttachments().add(newItem);
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
     *     The value of the orderAttachments property.
     */
    public List<AttachmentType> getOrderAttachments() {
        if (orderAttachments == null) {
            orderAttachments = new ArrayList<>();
        }
        return this.orderAttachments;
    }

    /**
     * Документ, заверяющий реестровую запись с электронной подписью
     * 
     * Gets the value of the signedOrderAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedOrderAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignedOrderAttachments().add(newItem);
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
     *     The value of the signedOrderAttachments property.
     */
    public List<SignedAttachmentType> getSignedOrderAttachments() {
        if (signedOrderAttachments == null) {
            signedOrderAttachments = new ArrayList<>();
        }
        return this.signedOrderAttachments;
    }

    /**
     * Сопроводительные документы
     * 
     * Gets the value of the accompanyingAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accompanyingAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccompanyingAttachments().add(newItem);
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
     *     The value of the accompanyingAttachments property.
     */
    public List<AttachmentType> getAccompanyingAttachments() {
        if (accompanyingAttachments == null) {
            accompanyingAttachments = new ArrayList<>();
        }
        return this.accompanyingAttachments;
    }

    /**
     * Сопроводительные документы с электронной подписью
     * 
     * Gets the value of the signedAccompanyingAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedAccompanyingAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSignedAccompanyingAttachments().add(newItem);
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
     *     The value of the signedAccompanyingAttachments property.
     */
    public List<SignedAttachmentType> getSignedAccompanyingAttachments() {
        if (signedAccompanyingAttachments == null) {
            signedAccompanyingAttachments = new ArrayList<>();
        }
        return this.signedAccompanyingAttachments;
    }

}
