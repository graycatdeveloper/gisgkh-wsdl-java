
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемый документ программы (плана)
 * 
 * <p>Java class for ExportDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDocumentType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentType">
 *       <sequence>
 *         <element name="DocumentGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDocumentType", propOrder = {
    "documentGUID"
})
public class ExportDocumentType
    extends DocumentType
{

    /**
     * Идентификатор документа в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "DocumentGUID", required = true)
    protected String documentGUID;

    /**
     * Идентификатор документа в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGUID() {
        return documentGUID;
    }

    /**
     * Sets the value of the documentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentGUID()
     */
    public void setDocumentGUID(String value) {
        this.documentGUID = value;
    }

}
