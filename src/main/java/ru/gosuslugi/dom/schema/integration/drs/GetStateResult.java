
package ru.gosuslugi.dom.schema.integration.drs;

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
 *         <element name="importResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *         <element name="exportDRsResult" type="{http://dom.gosuslugi.ru/schema/integration/drs/}exportDRsResultType"/>
 *         <element name="exportDSRsResult" type="{http://dom.gosuslugi.ru/schema/integration/drs/}exportDSRsResultType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
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
    "importResult",
    "exportDRsResult",
    "exportDSRsResult",
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
    protected List<CommonResultType> importResult;
    /**
     * Результат выполнения запроса на экспорт из ГИС ЖКХ запросов о наличии задолженности за ЖКУ
     * 
     */
    protected ExportDRsResultType exportDRsResult;
    /**
     * Результат выполнения запроса на экспорт подзапросов о наличии задолженности за ЖКУ, сформированных ГИС ЖКХ
     * 
     */
    protected ExportDSRsResultType exportDSRsResult;
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
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
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
     * Результат выполнения запроса на экспорт из ГИС ЖКХ запросов о наличии задолженности за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link ExportDRsResultType }
     *     
     */
    public ExportDRsResultType getExportDRsResult() {
        return exportDRsResult;
    }

    /**
     * Sets the value of the exportDRsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDRsResultType }
     *     
     * @see #getExportDRsResult()
     */
    public void setExportDRsResult(ExportDRsResultType value) {
        this.exportDRsResult = value;
    }

    /**
     * Результат выполнения запроса на экспорт подзапросов о наличии задолженности за ЖКУ, сформированных ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link ExportDSRsResultType }
     *     
     */
    public ExportDSRsResultType getExportDSRsResult() {
        return exportDSRsResult;
    }

    /**
     * Sets the value of the exportDSRsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDSRsResultType }
     *     
     * @see #getExportDSRsResult()
     */
    public void setExportDSRsResult(ExportDSRsResultType value) {
        this.exportDSRsResult = value;
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