
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Экспортируемый КПР
 * 
 * <p>Java class for ExportPlanPassportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportPlanPassportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}PlanPassportType">
 *       <sequence>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusExtendedType"/>
 *         <element name="PlanGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportDocumentType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPlanPassportType", propOrder = {
    "status",
    "planGUID",
    "document"
})
public class ExportPlanPassportType
    extends PlanPassportType
{

    /**
     * Статус программы/плана
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusExtendedType status;
    /**
     * Идентификатор программы/плана в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "PlanGUID", required = true)
    protected String planGUID;
    /**
     * Документы программы/плана
     * 
     */
    @XmlElement(name = "Document")
    protected List<ExportDocumentType> document;

    /**
     * Статус программы/плана
     * 
     * @return
     *     possible object is
     *     {@link StatusExtendedType }
     *     
     */
    public StatusExtendedType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusExtendedType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusExtendedType value) {
        this.status = value;
    }

    /**
     * Идентификатор программы/плана в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGUID() {
        return planGUID;
    }

    /**
     * Sets the value of the planGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlanGUID()
     */
    public void setPlanGUID(String value) {
        this.planGUID = value;
    }

    /**
     * Документы программы/плана
     * 
     * Gets the value of the document property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDocumentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the document property.
     */
    public List<ExportDocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<>();
        }
        return this.document;
    }

}
