
package ru.gosuslugi.dom.schema.integration.uk;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемый документ
 * 
 * <p>Java class for exportDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocumentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="DocumentFederal" type="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentFederalExportType"/>
 *           <element name="DocumentRegion" type="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentRegionExportType"/>
 *           <element name="DocumentMunicipal" type="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentMunicipalExportType"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDocumentType", propOrder = {
    "documentGuid",
    "documentFederal",
    "documentRegion",
    "documentMunicipal"
})
public class ExportDocumentType {

    /**
     * Идентификатор документа в системе ГИС ЖКХ
     * 
     */
    @XmlElement(name = "DocumentGuid", required = true)
    protected String documentGuid;
    /**
     * Реквизиты документа закона/нормативно провавого акта федерального уровня
     * 
     */
    @XmlElement(name = "DocumentFederal")
    protected DocumentFederalExportType documentFederal;
    /**
     * Реквизиты документа закона/нормативно провавого акта регионального уровня
     * 
     */
    @XmlElement(name = "DocumentRegion")
    protected DocumentRegionExportType documentRegion;
    /**
     * Реквизиты документа  закона/нормативно провавого акта уровня муниципальных образований
     * 
     */
    @XmlElement(name = "DocumentMunicipal")
    protected DocumentMunicipalExportType documentMunicipal;

    /**
     * Идентификатор документа в системе ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentGuid() {
        return documentGuid;
    }

    /**
     * Sets the value of the documentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentGuid()
     */
    public void setDocumentGuid(String value) {
        this.documentGuid = value;
    }

    /**
     * Реквизиты документа закона/нормативно провавого акта федерального уровня
     * 
     * @return
     *     possible object is
     *     {@link DocumentFederalExportType }
     *     
     */
    public DocumentFederalExportType getDocumentFederal() {
        return documentFederal;
    }

    /**
     * Sets the value of the documentFederal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFederalExportType }
     *     
     * @see #getDocumentFederal()
     */
    public void setDocumentFederal(DocumentFederalExportType value) {
        this.documentFederal = value;
    }

    /**
     * Реквизиты документа закона/нормативно провавого акта регионального уровня
     * 
     * @return
     *     possible object is
     *     {@link DocumentRegionExportType }
     *     
     */
    public DocumentRegionExportType getDocumentRegion() {
        return documentRegion;
    }

    /**
     * Sets the value of the documentRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentRegionExportType }
     *     
     * @see #getDocumentRegion()
     */
    public void setDocumentRegion(DocumentRegionExportType value) {
        this.documentRegion = value;
    }

    /**
     * Реквизиты документа  закона/нормативно провавого акта уровня муниципальных образований
     * 
     * @return
     *     possible object is
     *     {@link DocumentMunicipalExportType }
     *     
     */
    public DocumentMunicipalExportType getDocumentMunicipal() {
        return documentMunicipal;
    }

    /**
     * Sets the value of the documentMunicipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentMunicipalExportType }
     *     
     * @see #getDocumentMunicipal()
     */
    public void setDocumentMunicipal(DocumentMunicipalExportType value) {
        this.documentMunicipal = value;
    }

}
