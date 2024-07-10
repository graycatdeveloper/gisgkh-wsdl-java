
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImprintAgreementExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ImprintAgreementExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AgreementNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImprintAgreementExportType", propOrder = {
    "agreementNumber",
    "agreementDate"
})
public class ImprintAgreementExportType {

    /**
     * Номер
     * 
     */
    @XmlElement(name = "AgreementNumber")
    protected String agreementNumber;
    /**
     * Дата
     * 
     */
    @XmlElement(name = "AgreementDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;

    /**
     * Номер
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgreementNumber()
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Дата
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAgreementDate()
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

}
