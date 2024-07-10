
package ru.gosuslugi.dom.schema.integration.inspection;

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
 *         <element name="ExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type"/>
 *         <sequence>
 *           <element name="From" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           <element name="To" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "examinationGuid",
    "registryNumber",
    "from",
    "to"
})
@XmlRootElement(name = "exportExaminationsRequest")
public class ExportExaminationsRequest
    extends BaseType
{

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "ExaminationGuid")
    protected String examinationGuid;
    /**
     * Реестровый номер проверки.
     * 
     */
    @XmlElement(name = "RegistryNumber")
    protected String registryNumber;
    /**
     * Начало периода даты начала проведения проверки (включительно).
     * 
     */
    @XmlElement(name = "From")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar from;
    /**
     * Конец периода даты начала проведения проверки (включительно).
     * 
     */
    @XmlElement(name = "To")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar to;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор проверки в ГИС ЖКХ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationGuid() {
        return examinationGuid;
    }

    /**
     * Sets the value of the examinationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExaminationGuid()
     */
    public void setExaminationGuid(String value) {
        this.examinationGuid = value;
    }

    /**
     * Реестровый номер проверки.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistryNumber()
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Начало периода даты начала проведения проверки (включительно).
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
     * Конец периода даты начала проведения проверки (включительно).
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

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
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
