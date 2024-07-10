
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *       <sequence>
 *         <element name="DateTo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="DateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}orgPPAGUID" maxOccurs="1000"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.12.0.7""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateTo",
    "dateFrom",
    "orgPPAGUID"
})
@XmlRootElement(name = "exportRolloverStatusCAChRequest")
public class ExportRolloverStatusCAChRequest
    extends BaseType
{

    /**
     * Выгрузить сведения о пролонгации до указанной даты
     * 
     */
    @XmlElement(name = "DateTo", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    /**
     * Выгрузить сведения о пролонгации от указанной даты
     * 
     */
    @XmlElement(name = "DateFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    /**
     * Идентификатор зарегистрированной организации
     * 
     */
    @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected List<String> orgPPAGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Выгрузить сведения о пролонгации до указанной даты
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateTo()
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Выгрузить сведения о пролонгации от указанной даты
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateFrom()
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Идентификатор зарегистрированной организации
     * 
     * Gets the value of the orgPPAGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgPPAGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrgPPAGUID().add(newItem);
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
     *     The value of the orgPPAGUID property.
     */
    public List<String> getOrgPPAGUID() {
        if (orgPPAGUID == null) {
            orgPPAGUID = new ArrayList<>();
        }
        return this.orgPPAGUID;
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
            return "11.12.0.7";
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
