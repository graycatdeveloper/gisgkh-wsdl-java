
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseAsyncResponseType;
import ru.gosuslugi.dom.schema.integration.base.CommonResultType;
import ru.gosuslugi.dom.schema.integration.base.ErrorMessageType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseAsyncResponseType">
 *       <choice minOccurs="0">
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="exportHMServicesTarifsResult" type="{http://dom.gosuslugi.ru/schema/integration/services/}exportHMServicesTarifsResultType" maxOccurs="unbounded"/>
 *         <element name="exportCompletedWorksResult" type="{http://dom.gosuslugi.ru/schema/integration/services/}exportCompletedWorksResultType" maxOccurs="unbounded"/>
 *         <element name="exportWorkingListResult" type="{http://dom.gosuslugi.ru/schema/integration/services/}exportWorkingListResultType" maxOccurs="unbounded"/>
 *         <element name="exportWorkingPlanResult" type="{http://dom.gosuslugi.ru/schema/integration/services/}exportWorkingPlanResultType" maxOccurs="unbounded"/>
 *         <element name="exportQualityAssessmentResult" type="{http://dom.gosuslugi.ru/schema/integration/services/}exportQualityAssessmentExportType" maxOccurs="unbounded"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errorMessage",
    "importResult",
    "exportHMServicesTarifsResult",
    "exportCompletedWorksResult",
    "exportWorkingListResult",
    "exportWorkingPlanResult",
    "exportQualityAssessmentResult"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;
    protected List<ExportHMServicesTarifsResultType> exportHMServicesTarifsResult;
    protected List<ExportCompletedWorksResultType> exportCompletedWorksResult;
    protected List<ExportWorkingListResultType> exportWorkingListResult;
    protected List<ExportWorkingPlanResultType> exportWorkingPlanResult;
    protected List<ExportQualityAssessmentExportType> exportQualityAssessmentResult;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageType }
     *     
     */
    public ErrorMessageType getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageType }
     *     
     * @see #getErrorMessage()
     */
    public void setErrorMessage(ErrorMessageType value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the importResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<CommonResultType> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

    /**
     * Gets the value of the exportHMServicesTarifsResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportHMServicesTarifsResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportHMServicesTarifsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportHMServicesTarifsResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportHMServicesTarifsResult property.
     */
    public List<ExportHMServicesTarifsResultType> getExportHMServicesTarifsResult() {
        if (exportHMServicesTarifsResult == null) {
            exportHMServicesTarifsResult = new ArrayList<>();
        }
        return this.exportHMServicesTarifsResult;
    }

    /**
     * Gets the value of the exportCompletedWorksResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportCompletedWorksResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportCompletedWorksResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCompletedWorksResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportCompletedWorksResult property.
     */
    public List<ExportCompletedWorksResultType> getExportCompletedWorksResult() {
        if (exportCompletedWorksResult == null) {
            exportCompletedWorksResult = new ArrayList<>();
        }
        return this.exportCompletedWorksResult;
    }

    /**
     * Gets the value of the exportWorkingListResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportWorkingListResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportWorkingListResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportWorkingListResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportWorkingListResult property.
     */
    public List<ExportWorkingListResultType> getExportWorkingListResult() {
        if (exportWorkingListResult == null) {
            exportWorkingListResult = new ArrayList<>();
        }
        return this.exportWorkingListResult;
    }

    /**
     * Gets the value of the exportWorkingPlanResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportWorkingPlanResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportWorkingPlanResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportWorkingPlanResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportWorkingPlanResult property.
     */
    public List<ExportWorkingPlanResultType> getExportWorkingPlanResult() {
        if (exportWorkingPlanResult == null) {
            exportWorkingPlanResult = new ArrayList<>();
        }
        return this.exportWorkingPlanResult;
    }

    /**
     * Gets the value of the exportQualityAssessmentResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportQualityAssessmentResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportQualityAssessmentResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportQualityAssessmentExportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportQualityAssessmentResult property.
     */
    public List<ExportQualityAssessmentExportType> getExportQualityAssessmentResult() {
        if (exportQualityAssessmentResult == null) {
            exportQualityAssessmentResult = new ArrayList<>();
        }
        return this.exportQualityAssessmentResult;
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
            return "10.0.1.1";
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
