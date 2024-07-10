
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Параметры для импорта отмены прекращения действия/аннулирования лицензии
 * 
 * <p>Java class for CancelTerminationDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CancelTerminationDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StatusChangeBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="CancelTerminationDocument" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DocumentType" minOccurs="0"/>
 *         <element name="DocumentEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="DontSendToErul" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DontSendFns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelTerminationDetailsImportType", propOrder = {
    "statusChangeBase",
    "cancelTerminationDocument",
    "documentEffectiveDate",
    "dontSendToErul",
    "dontSendFns"
})
public class CancelTerminationDetailsImportType {

    /**
     * Основание изменения статуса лицензии (заполяется значением справочника НСИ Вид основания для выполнения размещения информации в реестре лицензий
     * 
     */
    @XmlElement(name = "StatusChangeBase", required = true)
    protected NsiRef statusChangeBase;
    /**
     * Документ об отмене прекращения действия/аннулирования лицензии
     * 
     */
    @XmlElement(name = "CancelTerminationDocument")
    protected DocumentType cancelTerminationDocument;
    /**
     * Дата вступления в силу документа об отмене прекращения действия/аннулирования лицензии
     * 
     */
    @XmlElement(name = "DocumentEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentEffectiveDate;
    /**
     * Не отправлять реестровую запись в единый реестру цчета лицензий
     * 
     */
    @XmlElement(name = "DontSendToErul")
    protected Boolean dontSendToErul;
    /**
     * Не отправлять реестровую в ЕГРЮЛ/ЕГРИП
     * 
     */
    @XmlElement(name = "DontSendFns")
    protected Boolean dontSendFns;

    /**
     * Основание изменения статуса лицензии (заполяется значением справочника НСИ Вид основания для выполнения размещения информации в реестре лицензий
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getStatusChangeBase() {
        return statusChangeBase;
    }

    /**
     * Sets the value of the statusChangeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getStatusChangeBase()
     */
    public void setStatusChangeBase(NsiRef value) {
        this.statusChangeBase = value;
    }

    /**
     * Документ об отмене прекращения действия/аннулирования лицензии
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getCancelTerminationDocument() {
        return cancelTerminationDocument;
    }

    /**
     * Sets the value of the cancelTerminationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     * @see #getCancelTerminationDocument()
     */
    public void setCancelTerminationDocument(DocumentType value) {
        this.cancelTerminationDocument = value;
    }

    /**
     * Дата вступления в силу документа об отмене прекращения действия/аннулирования лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentEffectiveDate() {
        return documentEffectiveDate;
    }

    /**
     * Sets the value of the documentEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDocumentEffectiveDate()
     */
    public void setDocumentEffectiveDate(XMLGregorianCalendar value) {
        this.documentEffectiveDate = value;
    }

    /**
     * Не отправлять реестровую запись в единый реестру цчета лицензий
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
     * Не отправлять реестровую в ЕГРЮЛ/ЕГРИП
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontSendFns() {
        return dontSendFns;
    }

    /**
     * Sets the value of the dontSendFns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDontSendFns()
     */
    public void setDontSendFns(Boolean value) {
        this.dontSendFns = value;
    }

}
