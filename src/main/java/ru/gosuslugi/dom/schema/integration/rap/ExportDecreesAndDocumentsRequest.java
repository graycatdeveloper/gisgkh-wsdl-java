
package ru.gosuslugi.dom.schema.integration.rap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="DecreeGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <sequence>
 *           <element name="ProceedingDateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="ProceedingDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.10.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "decreeGUID",
    "proceedingDateFrom",
    "proceedingDateTo"
})
@XmlRootElement(name = "ExportDecreesAndDocumentsRequest")
public class ExportDecreesAndDocumentsRequest
    extends BaseType
{

    /**
     * Идентификатор постановления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "DecreeGUID")
    protected List<String> decreeGUID;
    /**
     * Дата привлечения к административной ответственности С
     * 
     */
    @XmlElement(name = "ProceedingDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar proceedingDateFrom;
    /**
     * Дата привлечения к административной ответственности ПО
     * 
     */
    @XmlElement(name = "ProceedingDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar proceedingDateTo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор постановления в ГИС ЖКХ
     * 
     * Gets the value of the decreeGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decreeGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecreeGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the decreeGUID property.
     */
    public List<String> getDecreeGUID() {
        if (decreeGUID == null) {
            decreeGUID = new ArrayList<>();
        }
        return this.decreeGUID;
    }

    /**
     * Дата привлечения к административной ответственности С
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProceedingDateFrom() {
        return proceedingDateFrom;
    }

    /**
     * Sets the value of the proceedingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getProceedingDateFrom()
     */
    public void setProceedingDateFrom(XMLGregorianCalendar value) {
        this.proceedingDateFrom = value;
    }

    /**
     * Дата привлечения к административной ответственности ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProceedingDateTo() {
        return proceedingDateTo;
    }

    /**
     * Sets the value of the proceedingDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getProceedingDateTo()
     */
    public void setProceedingDateTo(XMLGregorianCalendar value) {
        this.proceedingDateTo = value;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.10.0.2";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
