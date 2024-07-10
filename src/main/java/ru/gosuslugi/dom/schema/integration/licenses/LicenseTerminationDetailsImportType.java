
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Параметры для импорта записи о прекращении действия лицензии
 * 
 * <p>Java class for LicenseTerminationDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseTerminationDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="StatusChangeBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="TerminationDocument" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DocumentType" minOccurs="0"/>
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
@XmlType(name = "LicenseTerminationDetailsImportType", propOrder = {
    "licenseTerminationDate",
    "statusChangeBase",
    "terminationDocument",
    "documentEffectiveDate",
    "dontSendToErul",
    "dontSendFns"
})
public class LicenseTerminationDetailsImportType {

    /**
     * Дата прекращения действия лицензии
     * 
     */
    @XmlElement(name = "LicenseTerminationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseTerminationDate;
    /**
     * Основание изменения статуса лицензии (заполяется значением справочника НСИ Вид основания для выполнения размещения информации в реестре лицензий
     * 
     */
    @XmlElement(name = "StatusChangeBase", required = true)
    protected NsiRef statusChangeBase;
    /**
     * Документ о прекращении действия лицензии
     * 
     */
    @XmlElement(name = "TerminationDocument")
    protected DocumentType terminationDocument;
    /**
     * Дата вступления в силу документа о прекращении действия лицензии
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
     * Дата прекращения действия лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseTerminationDate() {
        return licenseTerminationDate;
    }

    /**
     * Sets the value of the licenseTerminationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLicenseTerminationDate()
     */
    public void setLicenseTerminationDate(XMLGregorianCalendar value) {
        this.licenseTerminationDate = value;
    }

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
     * Документ о прекращении действия лицензии
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getTerminationDocument() {
        return terminationDocument;
    }

    /**
     * Sets the value of the terminationDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     * @see #getTerminationDocument()
     */
    public void setTerminationDocument(DocumentType value) {
        this.terminationDocument = value;
    }

    /**
     * Дата вступления в силу документа о прекращении действия лицензии
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
