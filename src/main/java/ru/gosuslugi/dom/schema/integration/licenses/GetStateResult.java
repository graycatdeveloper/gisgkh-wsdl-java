
package ru.gosuslugi.dom.schema.integration.licenses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseAsyncResponseType;
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
 *         <element name="ImportResult" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}LicenseCommonResultType" maxOccurs="unbounded"/>
 *         <element name="License" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}exportLicenseResultType" maxOccurs="unbounded"/>
 *         <element name="DisqualifiedPersonResult" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DisqualifiedPersonType" maxOccurs="unbounded"/>
 *         <element name="exportActualLicenseStateResult" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}exportActualLicenseStateResultType" maxOccurs="unbounded"/>
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
    "errorMessage",
    "importResult",
    "license",
    "disqualifiedPersonResult",
    "exportActualLicenseStateResult"
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
    protected List<LicenseCommonResultType> importResult;
    @XmlElement(name = "License")
    protected List<ExportLicenseResultType> license;
    @XmlElement(name = "DisqualifiedPersonResult")
    protected List<DisqualifiedPersonType> disqualifiedPersonResult;
    protected List<ExportActualLicenseStateResultType> exportActualLicenseStateResult;
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
     * {@link LicenseCommonResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<LicenseCommonResultType> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

    /**
     * Gets the value of the license property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the license property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportLicenseResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the license property.
     */
    public List<ExportLicenseResultType> getLicense() {
        if (license == null) {
            license = new ArrayList<>();
        }
        return this.license;
    }

    /**
     * Gets the value of the disqualifiedPersonResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disqualifiedPersonResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisqualifiedPersonResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisqualifiedPersonType }
     * </p>
     * 
     * 
     * @return
     *     The value of the disqualifiedPersonResult property.
     */
    public List<DisqualifiedPersonType> getDisqualifiedPersonResult() {
        if (disqualifiedPersonResult == null) {
            disqualifiedPersonResult = new ArrayList<>();
        }
        return this.disqualifiedPersonResult;
    }

    /**
     * Gets the value of the exportActualLicenseStateResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportActualLicenseStateResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportActualLicenseStateResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportActualLicenseStateResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportActualLicenseStateResult property.
     */
    public List<ExportActualLicenseStateResultType> getExportActualLicenseStateResult() {
        if (exportActualLicenseStateResult == null) {
            exportActualLicenseStateResult = new ArrayList<>();
        }
        return this.exportActualLicenseStateResult;
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
