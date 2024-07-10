
package ru.gosuslugi.dom.schema.integration.tech_conn;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * Составной тип. Запрос на экспорт заявления в рамках технологического присоединения
 * 
 * <p>Java class for commonExportApplicationRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="commonExportApplicationRequest">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="ApplicationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="GISHCSNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String20Type"/>
 *         <sequence>
 *           <element name="From" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="To" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commonExportApplicationRequest", propOrder = {
    "applicationGuid",
    "gishcsNumber",
    "from",
    "to"
})
@XmlSeeAlso({
    ExportConnectionPossibilityApplicationRequest.class,
    ExportTechnicalSpecificationApplicationRequest.class,
    ExportOrganizationDeterminationApplicationRequest.class
})
public class CommonExportApplicationRequest
    extends BaseType
{

    /**
     * Идентификатор заявления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ApplicationGuid")
    protected String applicationGuid;
    /**
     * Номер заявления в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "GISHCSNumber")
    protected String gishcsNumber;
    /**
     * Дата регистрации заявления - с (включительно)
     * 
     */
    @XmlElement(name = "From")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar from;
    /**
     * Дата регистрации заявления - по (включительно)
     * 
     */
    @XmlElement(name = "To")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar to;

    /**
     * Идентификатор заявления в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationGuid() {
        return applicationGuid;
    }

    /**
     * Sets the value of the applicationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getApplicationGuid()
     */
    public void setApplicationGuid(String value) {
        this.applicationGuid = value;
    }

    /**
     * Номер заявления в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGISHCSNumber() {
        return gishcsNumber;
    }

    /**
     * Sets the value of the gishcsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGISHCSNumber()
     */
    public void setGISHCSNumber(String value) {
        this.gishcsNumber = value;
    }

    /**
     * Дата регистрации заявления - с (включительно)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFrom()
     */
    public void setFrom(XMLGregorianCalendar value) {
        this.from = value;
    }

    /**
     * Дата регистрации заявления - по (включительно)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getTo()
     */
    public void setTo(XMLGregorianCalendar value) {
        this.to = value;
    }

}
