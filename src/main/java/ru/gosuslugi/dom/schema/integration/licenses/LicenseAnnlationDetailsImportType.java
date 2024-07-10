
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Параметры для импорта записи об анулировании действия лицензии
 * 
 * <p>Java class for LicenseAnnlationDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseAnnlationDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseAnnulationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="StatusChangeBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="OrgName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DocumentName">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DocumentNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="100"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DocumentAcceptanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="DocumentEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "LicenseAnnlationDetailsImportType", propOrder = {
    "licenseAnnulationDate",
    "statusChangeBase",
    "orgName",
    "documentName",
    "documentNumber",
    "documentAcceptanceDate",
    "documentEffectiveDate",
    "dontSendToErul",
    "dontSendFns"
})
public class LicenseAnnlationDetailsImportType {

    /**
     * Дата аннулирования лицензии
     * 
     */
    @XmlElement(name = "LicenseAnnulationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseAnnulationDate;
    /**
     * Основание изменения статус алицензии (заполяется значением справочника НСИ Вид основания для выполнения размещения информации в реестре лицензий
     * 
     */
    @XmlElement(name = "StatusChangeBase", required = true)
    protected NsiRef statusChangeBase;
    /**
     * Организация,принявшая реешение об аннулировании лицензии
     * 
     */
    @XmlElement(name = "OrgName", required = true)
    protected String orgName;
    /**
     * Наименование документа об аннулировании лицензии
     * 
     */
    @XmlElement(name = "DocumentName", required = true)
    protected String documentName;
    /**
     * Номер документа об аннулировании лицензии
     * 
     */
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    /**
     * Дата принятия документа об аннулировании лицензии
     * 
     */
    @XmlElement(name = "DocumentAcceptanceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentAcceptanceDate;
    /**
     * Дата вступления в силу документа об аннулировании лицензии
     * 
     */
    @XmlElement(name = "DocumentEffectiveDate", required = true)
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
     * Дата аннулирования лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseAnnulationDate() {
        return licenseAnnulationDate;
    }

    /**
     * Sets the value of the licenseAnnulationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLicenseAnnulationDate()
     */
    public void setLicenseAnnulationDate(XMLGregorianCalendar value) {
        this.licenseAnnulationDate = value;
    }

    /**
     * Основание изменения статус алицензии (заполяется значением справочника НСИ Вид основания для выполнения размещения информации в реестре лицензий
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
     * Организация,принявшая реешение об аннулировании лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgName()
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Наименование документа об аннулировании лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentName()
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Номер документа об аннулировании лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentNumber()
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Дата принятия документа об аннулировании лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentAcceptanceDate() {
        return documentAcceptanceDate;
    }

    /**
     * Sets the value of the documentAcceptanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDocumentAcceptanceDate()
     */
    public void setDocumentAcceptanceDate(XMLGregorianCalendar value) {
        this.documentAcceptanceDate = value;
    }

    /**
     * Дата вступления в силу документа об аннулировании лицензии
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
