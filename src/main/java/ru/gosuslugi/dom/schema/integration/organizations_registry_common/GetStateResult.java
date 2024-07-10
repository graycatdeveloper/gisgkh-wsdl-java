
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

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
 *       <sequence minOccurs="0">
 *         <choice minOccurs="0">
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *           <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType" maxOccurs="unbounded"/>
 *           <element name="exportOrgRegistryResult" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}exportOrgRegistryResultType" maxOccurs="unbounded"/>
 *           <element name="exportDataProviderResult" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}exportDataProviderResultType" maxOccurs="unbounded"/>
 *           <element name="exportDelegatedAccessResult" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}exportDelegatedAccessType" maxOccurs="unbounded"/>
 *           <element name="exportObjectsDelegatedAccessResult" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}ObjectsDelegatedAccessRightType" maxOccurs="unbounded"/>
 *           <element name="exportTerritoryDelegatedAccess" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-common/}TerritoryDelegatedAccessRightType" maxOccurs="unbounded"/>
 *         </choice>
 *         <element name="IsNextPage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.2.1""/>
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
    "exportOrgRegistryResult",
    "exportDataProviderResult",
    "exportDelegatedAccessResult",
    "exportObjectsDelegatedAccessResult",
    "exportTerritoryDelegatedAccess",
    "isNextPage"
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
    protected List<ExportOrgRegistryResultType> exportOrgRegistryResult;
    protected List<ExportDataProviderResultType> exportDataProviderResult;
    protected List<ExportDelegatedAccessType> exportDelegatedAccessResult;
    protected List<ObjectsDelegatedAccessRightType> exportObjectsDelegatedAccessResult;
    protected List<TerritoryDelegatedAccessRightType> exportTerritoryDelegatedAccess;
    /**
     * Признак того, что выгружены не все данные. Необходимо выполнить еще один запрос, увеличив Page на 1.
     * 
     */
    @XmlElement(name = "IsNextPage")
    protected Boolean isNextPage;
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
     * Gets the value of the exportOrgRegistryResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOrgRegistryResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportOrgRegistryResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOrgRegistryResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportOrgRegistryResult property.
     */
    public List<ExportOrgRegistryResultType> getExportOrgRegistryResult() {
        if (exportOrgRegistryResult == null) {
            exportOrgRegistryResult = new ArrayList<>();
        }
        return this.exportOrgRegistryResult;
    }

    /**
     * Gets the value of the exportDataProviderResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportDataProviderResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportDataProviderResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDataProviderResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportDataProviderResult property.
     */
    public List<ExportDataProviderResultType> getExportDataProviderResult() {
        if (exportDataProviderResult == null) {
            exportDataProviderResult = new ArrayList<>();
        }
        return this.exportDataProviderResult;
    }

    /**
     * Gets the value of the exportDelegatedAccessResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportDelegatedAccessResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportDelegatedAccessResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDelegatedAccessType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportDelegatedAccessResult property.
     */
    public List<ExportDelegatedAccessType> getExportDelegatedAccessResult() {
        if (exportDelegatedAccessResult == null) {
            exportDelegatedAccessResult = new ArrayList<>();
        }
        return this.exportDelegatedAccessResult;
    }

    /**
     * Gets the value of the exportObjectsDelegatedAccessResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportObjectsDelegatedAccessResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportObjectsDelegatedAccessResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectsDelegatedAccessRightType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportObjectsDelegatedAccessResult property.
     */
    public List<ObjectsDelegatedAccessRightType> getExportObjectsDelegatedAccessResult() {
        if (exportObjectsDelegatedAccessResult == null) {
            exportObjectsDelegatedAccessResult = new ArrayList<>();
        }
        return this.exportObjectsDelegatedAccessResult;
    }

    /**
     * Gets the value of the exportTerritoryDelegatedAccess property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportTerritoryDelegatedAccess property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportTerritoryDelegatedAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerritoryDelegatedAccessRightType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportTerritoryDelegatedAccess property.
     */
    public List<TerritoryDelegatedAccessRightType> getExportTerritoryDelegatedAccess() {
        if (exportTerritoryDelegatedAccess == null) {
            exportTerritoryDelegatedAccess = new ArrayList<>();
        }
        return this.exportTerritoryDelegatedAccess;
    }

    /**
     * Признак того, что выгружены не все данные. Необходимо выполнить еще один запрос, увеличив Page на 1.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNextPage() {
        return isNextPage;
    }

    /**
     * Sets the value of the isNextPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsNextPage()
     */
    public void setIsNextPage(Boolean value) {
        this.isNextPage = value;
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
            return "10.0.2.1";
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
