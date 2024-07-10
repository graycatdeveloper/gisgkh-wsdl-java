
package ru.gosuslugi.dom.schema.integration.rap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Причина отмены постановления (экспорт)
 * 
 * <p>Java class for ExportCancelReasonType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCancelReasonType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="CancelBaseDocument" type="{http://dom.gosuslugi.ru/schema/integration/rap/}ExportProceduralDocumentType"/>
 *         <element name="CancelShortDescription" type="{http://dom.gosuslugi.ru/schema/integration/base/}String2000Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCancelReasonType", propOrder = {
    "reason",
    "cancelBaseDocument",
    "cancelShortDescription"
})
public class ExportCancelReasonType {

    /**
     * Основание внесения изменений или отмены информации (НСИ-271)
     * 
     */
    @XmlElement(name = "Reason", required = true)
    protected NsiRef reason;
    /**
     * Документ-основание для отмены
     * 
     */
    @XmlElement(name = "CancelBaseDocument", required = true)
    protected ExportProceduralDocumentType cancelBaseDocument;
    /**
     * Краткое описание отмены сведений
     * 
     */
    @XmlElement(name = "CancelShortDescription", required = true)
    protected String cancelShortDescription;

    /**
     * Основание внесения изменений или отмены информации (НСИ-271)
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
     * Документ-основание для отмены
     * 
     * @return
     *     possible object is
     *     {@link ExportProceduralDocumentType }
     *     
     */
    public ExportProceduralDocumentType getCancelBaseDocument() {
        return cancelBaseDocument;
    }

    /**
     * Sets the value of the cancelBaseDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportProceduralDocumentType }
     *     
     * @see #getCancelBaseDocument()
     */
    public void setCancelBaseDocument(ExportProceduralDocumentType value) {
        this.cancelBaseDocument = value;
    }

    /**
     * Краткое описание отмены сведений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelShortDescription() {
        return cancelShortDescription;
    }

    /**
     * Sets the value of the cancelShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCancelShortDescription()
     */
    public void setCancelShortDescription(String value) {
        this.cancelShortDescription = value;
    }

}
