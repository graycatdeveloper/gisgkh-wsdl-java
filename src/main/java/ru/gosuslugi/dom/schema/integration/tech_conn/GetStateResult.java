
package ru.gosuslugi.dom.schema.integration.tech_conn;

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
 *         <element name="ExportOrganizationDeterminationApplicationResult" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}exportOrganizationDeterminationApplicationType" maxOccurs="unbounded"/>
 *         <element name="ExportTechnicalSpecificationApplicationResult" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}exportTechnicalSpecificationApplicationType" maxOccurs="unbounded"/>
 *         <element name="ExportConnectionPossibilityApplicationResult" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}exportConnectionPossibilityApplicationType" maxOccurs="unbounded"/>
 *         <element name="ExportAgreementApplicationResult" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}exportAgreementApplicationType" maxOccurs="unbounded"/>
 *         <element name="ExportActApplicationResult" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}exportActApplicationType" maxOccurs="unbounded"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.2.5.0""/>
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
    "exportOrganizationDeterminationApplicationResult",
    "exportTechnicalSpecificationApplicationResult",
    "exportConnectionPossibilityApplicationResult",
    "exportAgreementApplicationResult",
    "exportActApplicationResult"
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
    /**
     * Резульат запроса на импорт
     * 
     */
    @XmlElement(name = "CommonResult")
    protected List<CommonResultType> commonResult;
    /**
     * Результат запроса на экспорт заявлений на определение организации для технологического присоединения
     * 
     */
    @XmlElement(name = "ExportOrganizationDeterminationApplicationResult")
    protected List<ExportOrganizationDeterminationApplicationType> exportOrganizationDeterminationApplicationResult;
    /**
     * Результат запроса на экспорт заявлений на предоставление технических условий подключения
     * 
     */
    @XmlElement(name = "ExportTechnicalSpecificationApplicationResult")
    protected List<ExportTechnicalSpecificationApplicationType> exportTechnicalSpecificationApplicationResult;
    /**
     * Результат запроса на экспорт заявлений на предоставление информации о возможности подключения
     * 
     */
    @XmlElement(name = "ExportConnectionPossibilityApplicationResult")
    protected List<ExportConnectionPossibilityApplicationType> exportConnectionPossibilityApplicationResult;
    /**
     * Результат запроса на экспорт заявлений заключение договора о подключении
     * 
     */
    @XmlElement(name = "ExportAgreementApplicationResult")
    protected List<ExportAgreementApplicationType> exportAgreementApplicationResult;
    /**
     * Результат запроса на экспорт заявлений на получение актов по договорам
     * 
     */
    @XmlElement(name = "ExportActApplicationResult")
    protected List<ExportActApplicationType> exportActApplicationResult;
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
     * Резульат запроса на импорт
     * 
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
     * Результат запроса на экспорт заявлений на определение организации для технологического присоединения
     * 
     * Gets the value of the exportOrganizationDeterminationApplicationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOrganizationDeterminationApplicationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportOrganizationDeterminationApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOrganizationDeterminationApplicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportOrganizationDeterminationApplicationResult property.
     */
    public List<ExportOrganizationDeterminationApplicationType> getExportOrganizationDeterminationApplicationResult() {
        if (exportOrganizationDeterminationApplicationResult == null) {
            exportOrganizationDeterminationApplicationResult = new ArrayList<>();
        }
        return this.exportOrganizationDeterminationApplicationResult;
    }

    /**
     * Результат запроса на экспорт заявлений на предоставление технических условий подключения
     * 
     * Gets the value of the exportTechnicalSpecificationApplicationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportTechnicalSpecificationApplicationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportTechnicalSpecificationApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportTechnicalSpecificationApplicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportTechnicalSpecificationApplicationResult property.
     */
    public List<ExportTechnicalSpecificationApplicationType> getExportTechnicalSpecificationApplicationResult() {
        if (exportTechnicalSpecificationApplicationResult == null) {
            exportTechnicalSpecificationApplicationResult = new ArrayList<>();
        }
        return this.exportTechnicalSpecificationApplicationResult;
    }

    /**
     * Результат запроса на экспорт заявлений на предоставление информации о возможности подключения
     * 
     * Gets the value of the exportConnectionPossibilityApplicationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportConnectionPossibilityApplicationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportConnectionPossibilityApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportConnectionPossibilityApplicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportConnectionPossibilityApplicationResult property.
     */
    public List<ExportConnectionPossibilityApplicationType> getExportConnectionPossibilityApplicationResult() {
        if (exportConnectionPossibilityApplicationResult == null) {
            exportConnectionPossibilityApplicationResult = new ArrayList<>();
        }
        return this.exportConnectionPossibilityApplicationResult;
    }

    /**
     * Результат запроса на экспорт заявлений заключение договора о подключении
     * 
     * Gets the value of the exportAgreementApplicationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportAgreementApplicationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportAgreementApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAgreementApplicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportAgreementApplicationResult property.
     */
    public List<ExportAgreementApplicationType> getExportAgreementApplicationResult() {
        if (exportAgreementApplicationResult == null) {
            exportAgreementApplicationResult = new ArrayList<>();
        }
        return this.exportAgreementApplicationResult;
    }

    /**
     * Результат запроса на экспорт заявлений на получение актов по договорам
     * 
     * Gets the value of the exportActApplicationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportActApplicationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportActApplicationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportActApplicationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportActApplicationResult property.
     */
    public List<ExportActApplicationType> getExportActApplicationResult() {
        if (exportActApplicationResult == null) {
            exportActApplicationResult = new ArrayList<>();
        }
        return this.exportActApplicationResult;
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
            return "13.2.5.0";
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
