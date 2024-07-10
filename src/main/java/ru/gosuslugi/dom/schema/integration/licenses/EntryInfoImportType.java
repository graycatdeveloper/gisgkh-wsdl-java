
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
 * Информация для импорта общих сведений о реестровой записи
 * 
 * <p>Java class for EntryInfoImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EntryInfoImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CreationBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="AssuranceOrderNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AssuranceOrderDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="AdditionalInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <sequence minOccurs="0">
 *           <element name="OrderAttachments" maxOccurs="unbounded" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlType(name = "EntryInfoImportType", propOrder = {
    "creationBase",
    "assuranceOrderNumber",
    "assuranceOrderDate",
    "additionalInfo",
    "orderAttachments",
    "signedOrderAttachments",
    "accompanyingAttachments",
    "signedAccompanyingAttachments"
})
public class EntryInfoImportType {

    /**
     * Основание внесения реестровой записи. Заполняется значением из справочника №370 "Основания внесения реестровых записей
     * 
     */
    @XmlElement(name = "CreationBase", required = true)
    protected NsiRef creationBase;
    /**
     * Номер приказа о заверении реестровой записи
     * 
     */
    @XmlElement(name = "AssuranceOrderNumber")
    protected String assuranceOrderNumber;
    /**
     * Дата приказа о заверени реестровой записи
     * 
     */
    @XmlElement(name = "AssuranceOrderDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assuranceOrderDate;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    /**
     * Документ, заверяющий реестровую запись
     * 
     */
    @XmlElement(name = "OrderAttachments")
    protected List<EntryInfoImportType.OrderAttachments> orderAttachments;
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
     * Основание внесения реестровой записи. Заполняется значением из справочника №370 "Основания внесения реестровых записей
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
     * Номер приказа о заверении реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssuranceOrderNumber() {
        return assuranceOrderNumber;
    }

    /**
     * Sets the value of the assuranceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAssuranceOrderNumber()
     */
    public void setAssuranceOrderNumber(String value) {
        this.assuranceOrderNumber = value;
    }

    /**
     * Дата приказа о заверени реестровой записи
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssuranceOrderDate() {
        return assuranceOrderDate;
    }

    /**
     * Sets the value of the assuranceOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAssuranceOrderDate()
     */
    public void setAssuranceOrderDate(XMLGregorianCalendar value) {
        this.assuranceOrderDate = value;
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
     * {@link EntryInfoImportType.OrderAttachments }
     * </p>
     * 
     * 
     * @return
     *     The value of the orderAttachments property.
     */
    public List<EntryInfoImportType.OrderAttachments> getOrderAttachments() {
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OrderAttachments
        extends AttachmentType
    {


    }

}
