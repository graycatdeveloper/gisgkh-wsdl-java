
package ru.gosuslugi.dom.schema.integration.rvuo;

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
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="exportManagingOrganizationResult" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}exportManagingOrganizationResultType"/>
 *         <element name="exportDecisionResult" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}exportDecisionResultType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version fixed="13.1.8.3""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importResult",
    "exportManagingOrganizationResult",
    "exportDecisionResult",
    "errorMessage"
})
@XmlRootElement(name = "getStateResult")
public class GetStateResult
    extends BaseAsyncResponseType
{

    /**
     * Результат импорта
     * 
     */
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;
    /**
     * Результат экспорта информации об управляющих организациях
     * 
     */
    protected ExportManagingOrganizationResultType exportManagingOrganizationResult;
    /**
     * Результат экспорта информации о решении об определении управляющей организации
     * 
     */
    protected ExportDecisionResultType exportDecisionResult;
    /**
     * Описание ошибок контролей или бизнес-процесса
     * 
     */
    @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected ErrorMessageType errorMessage;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String version;

    /**
     * Результат импорта
     * 
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
     * Результат экспорта информации об управляющих организациях
     * 
     * @return
     *     possible object is
     *     {@link ExportManagingOrganizationResultType }
     *     
     */
    public ExportManagingOrganizationResultType getExportManagingOrganizationResult() {
        return exportManagingOrganizationResult;
    }

    /**
     * Sets the value of the exportManagingOrganizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportManagingOrganizationResultType }
     *     
     * @see #getExportManagingOrganizationResult()
     */
    public void setExportManagingOrganizationResult(ExportManagingOrganizationResultType value) {
        this.exportManagingOrganizationResult = value;
    }

    /**
     * Результат экспорта информации о решении об определении управляющей организации
     * 
     * @return
     *     possible object is
     *     {@link ExportDecisionResultType }
     *     
     */
    public ExportDecisionResultType getExportDecisionResult() {
        return exportDecisionResult;
    }

    /**
     * Sets the value of the exportDecisionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDecisionResultType }
     *     
     * @see #getExportDecisionResult()
     */
    public void setExportDecisionResult(ExportDecisionResultType value) {
        this.exportDecisionResult = value;
    }

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
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "13.1.8.3";
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
