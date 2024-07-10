
package ru.gosuslugi.dom.schema.integration.account_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Основание для обязательств по оплате
 * 
 * <p>Java class for PaymentReasonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentReasonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ContractDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ContractEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReasonType", propOrder = {
    "contractNumber",
    "contractDate",
    "contractEndDate"
})
public class PaymentReasonType {

    /**
     * Номер договора
     * 
     */
    @XmlElement(name = "ContractNumber", required = true)
    protected String contractNumber;
    /**
     * Дата заключения договора
     * 
     */
    @XmlElement(name = "ContractDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractDate;
    /**
     * Срок окончания действия договора
     * 
     */
    @XmlElement(name = "ContractEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;

    /**
     * Номер договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractNumber()
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Дата заключения договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractDate() {
        return contractDate;
    }

    /**
     * Sets the value of the contractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getContractDate()
     */
    public void setContractDate(XMLGregorianCalendar value) {
        this.contractDate = value;
    }

    /**
     * Срок окончания действия договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Sets the value of the contractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getContractEndDate()
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

}
