
package ru.gosuslugi.dom.schema.integration.payments_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ключ поиска платежных реквизитов организации в ГИС ЖКХ
 * 
 * <p>Java class for PaymentInformationKeyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentInformationKeyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BankBIK" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType"/>
 *         <element name="operatingAccountNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformationKeyType", propOrder = {
    "bankBIK",
    "operatingAccountNumber"
})
public class PaymentInformationKeyType {

    /**
     * БИК банка получателя
     * 
     */
    @XmlElement(name = "BankBIK", required = true)
    protected String bankBIK;
    /**
     * Номер расчетного счета
     * 
     */
    @XmlElement(required = true)
    protected String operatingAccountNumber;

    /**
     * БИК банка получателя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBIK() {
        return bankBIK;
    }

    /**
     * Sets the value of the bankBIK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBankBIK()
     */
    public void setBankBIK(String value) {
        this.bankBIK = value;
    }

    /**
     * Номер расчетного счета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingAccountNumber() {
        return operatingAccountNumber;
    }

    /**
     * Sets the value of the operatingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOperatingAccountNumber()
     */
    public void setOperatingAccountNumber(String value) {
        this.operatingAccountNumber = value;
    }

}
