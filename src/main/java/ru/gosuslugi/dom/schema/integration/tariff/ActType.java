
package ru.gosuslugi.dom.schema.integration.tariff;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Нормативный правовой акт
 * 
 * <p>Java class for ActType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocNumber" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String255Type"/>
 *         <element name="AcceptanceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActType", propOrder = {
    "docNumber",
    "acceptanceDate"
})
public class ActType {

    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "DocNumber", required = true)
    protected String docNumber;
    /**
     * Дата принятия документа органом власти
     * 
     */
    @XmlElement(name = "AcceptanceDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acceptanceDate;

    /**
     * Номер документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocNumber()
     */
    public void setDocNumber(String value) {
        this.docNumber = value;
    }

    /**
     * Дата принятия документа органом власти
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptanceDate() {
        return acceptanceDate;
    }

    /**
     * Sets the value of the acceptanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAcceptanceDate()
     */
    public void setAcceptanceDate(XMLGregorianCalendar value) {
        this.acceptanceDate = value;
    }

}
