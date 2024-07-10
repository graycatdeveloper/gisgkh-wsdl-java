
package ru.gosuslugi.dom.schema.integration.house_management;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Параметры закрытого ЛС
 * 
 * <p>Java class for ClosedAccountAttributesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ClosedAccountAttributesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CloseReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Description" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="250"/>
 *               <minLength value="1"/>
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
@XmlType(name = "ClosedAccountAttributesType", propOrder = {
    "closeReason",
    "closeDate",
    "description"
})
public class ClosedAccountAttributesType {

    /**
     * Причина закрытия (НСИ 22)
     * 
     */
    @XmlElement(name = "CloseReason", required = true)
    protected NsiRef closeReason;
    /**
     * Дата закрытия
     * 
     */
    @XmlElement(name = "CloseDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDate;
    /**
     * Примечание
     * 
     */
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Причина закрытия (НСИ 22)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getCloseReason() {
        return closeReason;
    }

    /**
     * Sets the value of the closeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getCloseReason()
     */
    public void setCloseReason(NsiRef value) {
        this.closeReason = value;
    }

    /**
     * Дата закрытия
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCloseDate()
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Примечание
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDescription()
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
