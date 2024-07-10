
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="R"/>
 *               <enumeration value="E"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RegNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="45"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "regNumber",
    "regDate"
})
@XmlRootElement(name = "RightOrEncumbrance")
public class RightOrEncumbrance {

    /**
     * Тип ключа:
     * (R)ight - право
     * (E)ncumbrance - ограничение/обременение права
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Номер государственной регистрации
     * 
     */
    @XmlElement(name = "RegNumber", required = true)
    protected String regNumber;
    /**
     * Дата государственной регистрации
     * 
     */
    @XmlElement(name = "RegDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regDate;

    /**
     * Тип ключа:
     * (R)ight - право
     * (E)ncumbrance - ограничение/обременение права
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Номер государственной регистрации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegNumber() {
        return regNumber;
    }

    /**
     * Sets the value of the regNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegNumber()
     */
    public void setRegNumber(String value) {
        this.regNumber = value;
    }

    /**
     * Дата государственной регистрации
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getRegDate()
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

}
