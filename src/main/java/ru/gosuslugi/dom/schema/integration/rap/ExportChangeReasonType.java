
package ru.gosuslugi.dom.schema.integration.rap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Причина изменения постановления (экспорт)
 * 
 * <p>Java class for ExportChangeReasonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportChangeReasonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="ChangeBaseDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportProceduralDocumentType" minOccurs="0"/>
 *         <element name="ChangeShortDescription" type="{http://dom.gosuslugi.ru/schema/integration/base/}String2000Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportChangeReasonType", propOrder = {
    "reason",
    "changeBaseDocument",
    "changeShortDescription"
})
public class ExportChangeReasonType {

    /**
     * Основание внесения изменений в информацию (НСИ-271)
     * 
     */
    @XmlElement(name = "Reason", required = true)
    protected NsiRef reason;
    /**
     * Документ-основание для внесения изменений
     * 
     */
    @XmlElement(name = "ChangeBaseDocument")
    protected ExportProceduralDocumentType changeBaseDocument;
    /**
     * Краткое описание изменений сведений
     * 
     */
    @XmlElement(name = "ChangeShortDescription")
    protected String changeShortDescription;

    /**
     * Основание внесения изменений в информацию (НСИ-271)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getReason()
     */
    public void setReason(NsiRef value) {
        this.reason = value;
    }

    /**
     * Документ-основание для внесения изменений
     * 
     * @return
     *     possible object is
     *     {@link ExportProceduralDocumentType }
     *     
     */
    public ExportProceduralDocumentType getChangeBaseDocument() {
        return changeBaseDocument;
    }

    /**
     * Sets the value of the changeBaseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportProceduralDocumentType }
     *     
     * @see #getChangeBaseDocument()
     */
    public void setChangeBaseDocument(ExportProceduralDocumentType value) {
        this.changeBaseDocument = value;
    }

    /**
     * Краткое описание изменений сведений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeShortDescription() {
        return changeShortDescription;
    }

    /**
     * Sets the value of the changeShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getChangeShortDescription()
     */
    public void setChangeShortDescription(String value) {
        this.changeShortDescription = value;
    }

}
