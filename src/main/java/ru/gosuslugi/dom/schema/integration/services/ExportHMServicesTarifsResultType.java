
package ru.gosuslugi.dom.schema.integration.services;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Результат экспорта тарифов ЖКУ
 * 
 * <p>Java class for exportHMServicesTarifsResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportHMServicesTarifsResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}HMServicesTarifsDocType">
 *       <sequence>
 *         <element name="ServicesTarifDocGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportHMServicesTarifsResultType", propOrder = {
    "servicesTarifDocGUID",
    "creationDate"
})
public class ExportHMServicesTarifsResultType
    extends HMServicesTarifsDocType
{

    /**
     * Идентификатор документа тарифа в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ServicesTarifDocGUID", required = true)
    protected String servicesTarifDocGUID;
    /**
     * Дата создания документа в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CreationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;

    /**
     * Идентификатор документа тарифа в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesTarifDocGUID() {
        return servicesTarifDocGUID;
    }

    /**
     * Sets the value of the servicesTarifDocGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServicesTarifDocGUID()
     */
    public void setServicesTarifDocGUID(String value) {
        this.servicesTarifDocGUID = value;
    }

    /**
     * Дата создания документа в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreationDate()
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

}
