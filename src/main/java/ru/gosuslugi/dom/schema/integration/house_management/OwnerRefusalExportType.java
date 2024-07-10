
package ru.gosuslugi.dom.schema.integration.house_management;

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
 * Письменный отказ собственника (для экспорта)
 * 
 * <p>Java class for OwnerRefusalExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OwnerRefusalExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RefusalGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Owner"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportPropertyDetails" maxOccurs="unbounded"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Representative" minOccurs="0"/>
 *         <element name="RefusalAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RefusalStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalStatusType"/>
 *         <element name="PublishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerRefusalExportType", propOrder = {
    "messageGUID",
    "refusalGUID",
    "owner",
    "exportPropertyDetails",
    "representative",
    "refusalAttachments",
    "refusalStatus",
    "publishDate"
})
public class OwnerRefusalExportType {

    /**
     * Корневой идентификатор сообщения о проведении общего собрания
     * 
     */
    @XmlElement(name = "MessageGUID", required = true)
    protected String messageGUID;
    /**
     * Корневой идентификатор письменного отказа собственника
     * 
     */
    @XmlElement(name = "RefusalGUID", required = true)
    protected String refusalGUID;
    /**
     * Сведения о собственнике
     * 
     */
    @XmlElement(name = "Owner", required = true)
    protected Owner owner;
    /**
     * Сведения о собственности для экспорта
     * 
     */
    @XmlElement(required = true)
    protected List<ExportPropertyDetails> exportPropertyDetails;
    /**
     * Сведения о представителе. Заполняется, если отказ внесён представителем собственника
     * 
     */
    @XmlElement(name = "Representative")
    protected Representative representative;
    /**
     * Электронный образ отказа собственника
     * 
     */
    @XmlElement(name = "RefusalAttachments")
    protected List<AttachmentType> refusalAttachments;
    /**
     * Статус письменного отказа собственника.
     * Допустимые значения:
     * -Posted-Размещен
     * -Annuled-Аннулирован
     * 
     */
    @XmlElement(name = "RefusalStatus", required = true)
    @XmlSchemaType(name = "string")
    protected OwnerRefusalStatusType refusalStatus;
    /**
     * Дата и время размещения письменного отказа
     * 
     */
    @XmlElement(name = "PublishDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publishDate;

    /**
     * Корневой идентификатор сообщения о проведении общего собрания
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageGUID()
     */
    public void setMessageGUID(String value) {
        this.messageGUID = value;
    }

    /**
     * Корневой идентификатор письменного отказа собственника
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefusalGUID() {
        return refusalGUID;
    }

    /**
     * Sets the value of the refusalGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefusalGUID()
     */
    public void setRefusalGUID(String value) {
        this.refusalGUID = value;
    }

    /**
     * Сведения о собственнике
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     * @see #getOwner()
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Сведения о собственности для экспорта
     * 
     * Gets the value of the exportPropertyDetails property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportPropertyDetails property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportPropertyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportPropertyDetails }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportPropertyDetails property.
     */
    public List<ExportPropertyDetails> getExportPropertyDetails() {
        if (exportPropertyDetails == null) {
            exportPropertyDetails = new ArrayList<>();
        }
        return this.exportPropertyDetails;
    }

    /**
     * Сведения о представителе. Заполняется, если отказ внесён представителем собственника
     * 
     * @return
     *     possible object is
     *     {@link Representative }
     *     
     */
    public Representative getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Representative }
     *     
     * @see #getRepresentative()
     */
    public void setRepresentative(Representative value) {
        this.representative = value;
    }

    /**
     * Электронный образ отказа собственника
     * 
     * Gets the value of the refusalAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refusalAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRefusalAttachments().add(newItem);
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
     *     The value of the refusalAttachments property.
     */
    public List<AttachmentType> getRefusalAttachments() {
        if (refusalAttachments == null) {
            refusalAttachments = new ArrayList<>();
        }
        return this.refusalAttachments;
    }

    /**
     * Статус письменного отказа собственника.
     * Допустимые значения:
     * -Posted-Размещен
     * -Annuled-Аннулирован
     * 
     * @return
     *     possible object is
     *     {@link OwnerRefusalStatusType }
     *     
     */
    public OwnerRefusalStatusType getRefusalStatus() {
        return refusalStatus;
    }

    /**
     * Sets the value of the refusalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerRefusalStatusType }
     *     
     * @see #getRefusalStatus()
     */
    public void setRefusalStatus(OwnerRefusalStatusType value) {
        this.refusalStatus = value;
    }

    /**
     * Дата и время размещения письменного отказа
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

}
