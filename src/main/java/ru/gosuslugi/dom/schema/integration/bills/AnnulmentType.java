
package ru.gosuslugi.dom.schema.integration.bills;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Аннулирование информации
 * 
 * <p>Java class for AnnulmentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnnulmentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReasonOfAnnulment">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2000"/>
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
@XmlType(name = "AnnulmentType", propOrder = {
    "reasonOfAnnulment"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.ImportRSOSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod.class,
    ru.gosuslugi.dom.schema.integration.bills.ImportIKUSettlementsRequest.ImportSettlement.Settlement.ReportingPeriod.AnnulmentReportingPeriod.class
})
public class AnnulmentType {

    /**
     * Причина аннулирования
     * 
     */
    @XmlElement(name = "ReasonOfAnnulment", required = true)
    protected String reasonOfAnnulment;

    /**
     * Причина аннулирования
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonOfAnnulment() {
        return reasonOfAnnulment;
    }

    /**
     * Sets the value of the reasonOfAnnulment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getReasonOfAnnulment()
     */
    public void setReasonOfAnnulment(String value) {
        this.reasonOfAnnulment = value;
    }

}
