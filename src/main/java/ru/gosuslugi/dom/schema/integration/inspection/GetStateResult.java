
package ru.gosuslugi.dom.schema.integration.inspection;

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
 *         <element name="CommonResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="exportInspectionPlanResult" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportInspectionPlanResultType" maxOccurs="unbounded"/>
 *         <element name="exportExaminationResult" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportExaminationResultType" maxOccurs="unbounded"/>
 *         <element name="exportURIExaminationStateResult" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportExaminationURIStateResultType" maxOccurs="unbounded"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.2""/>
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
    "commonResult",
    "exportInspectionPlanResult",
    "exportExaminationResult",
    "exportURIExaminationStateResult"
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
    @XmlElement(name = "CommonResult")
    protected List<CommonResultType> commonResult;
    protected List<ExportInspectionPlanResultType> exportInspectionPlanResult;
    protected List<ExportExaminationResultType> exportExaminationResult;
    /**
     * Статус размещения проверки в ЕРП
     * 
     */
    protected List<ExportExaminationURIStateResultType> exportURIExaminationStateResult;
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
     * Gets the value of the commonResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCommonResult().add(newItem);
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
     *     The value of the commonResult property.
     */
    public List<CommonResultType> getCommonResult() {
        if (commonResult == null) {
            commonResult = new ArrayList<>();
        }
        return this.commonResult;
    }

    /**
     * Gets the value of the exportInspectionPlanResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportInspectionPlanResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportInspectionPlanResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportInspectionPlanResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportInspectionPlanResult property.
     */
    public List<ExportInspectionPlanResultType> getExportInspectionPlanResult() {
        if (exportInspectionPlanResult == null) {
            exportInspectionPlanResult = new ArrayList<>();
        }
        return this.exportInspectionPlanResult;
    }

    /**
     * Gets the value of the exportExaminationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportExaminationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportExaminationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportExaminationResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportExaminationResult property.
     */
    public List<ExportExaminationResultType> getExportExaminationResult() {
        if (exportExaminationResult == null) {
            exportExaminationResult = new ArrayList<>();
        }
        return this.exportExaminationResult;
    }

    /**
     * Статус размещения проверки в ЕРП
     * 
     * Gets the value of the exportURIExaminationStateResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportURIExaminationStateResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportURIExaminationStateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportExaminationURIStateResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportURIExaminationStateResult property.
     */
    public List<ExportExaminationURIStateResultType> getExportURIExaminationStateResult() {
        if (exportURIExaminationStateResult == null) {
            exportURIExaminationStateResult = new ArrayList<>();
        }
        return this.exportURIExaminationStateResult;
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
            return "10.0.1.2";
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
