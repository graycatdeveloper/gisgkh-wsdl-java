
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры записи о прекращении действия/аннулировании лицензии
 * 
 * <p>Java class for LicenseTerminationDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseTerminationDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LicenseTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="TerminationDocument" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DocumentType" minOccurs="0"/>
 *         <element name="DocumentEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseTerminationDetailsType", propOrder = {
    "licenseTerminationDate",
    "terminationDocument",
    "documentEffectiveDate"
})
public class LicenseTerminationDetailsType {

    /**
     * Дата прекращения действия/аннулирования лицензии
     * 
     */
    @XmlElement(name = "LicenseTerminationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar licenseTerminationDate;
    /**
     * Документ о прекращении действия/аннулировании лицензии
     * 
     */
    @XmlElement(name = "TerminationDocument")
    protected DocumentType terminationDocument;
    /**
     * Дата вступления в силу документа о прекращении действия/аннулировании лицензии
     * При внесении сведений об аннулировании лицензии обязательно к заполнению
     * 
     */
    @XmlElement(name = "DocumentEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentEffectiveDate;

    /**
     * Дата прекращения действия/аннулирования лицензии
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
     * Документ о прекращении действия/аннулировании лицензии
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
     * Дата вступления в силу документа о прекращении действия/аннулировании лицензии
     * При внесении сведений об аннулировании лицензии обязательно к заполнению
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

}
