
package ru.gosuslugi.dom.schema.integration.bills;

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
 *         <element name="exportPaymentDocResult" type="{http://dom.gosuslugi.ru/schema/integration/bills/}exportPaymentDocumentResultType" maxOccurs="unbounded"/>
 *         <sequence>
 *           <element name="exportNotificationsOfOrderExecutionResult" type="{http://dom.gosuslugi.ru/schema/integration/bills/}exportNotificationsOfOrderExecutionResultType" maxOccurs="unbounded"/>
 *           <element name="ExportNotificationsOfOrderExecutionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <element name="InsuranceProduct" type="{http://dom.gosuslugi.ru/schema/integration/bills/}InsuranceProductType" maxOccurs="unbounded"/>
 *         <element name="Settlement" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ExportSettlementResultType" maxOccurs="unbounded"/>
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
    "exportPaymentDocResult",
    "exportNotificationsOfOrderExecutionResult",
    "exportNotificationsOfOrderExecutionGUID",
    "insuranceProduct",
    "settlement"
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
    protected List<ExportPaymentDocumentResultType> exportPaymentDocResult;
    protected List<ExportNotificationsOfOrderExecutionResultType> exportNotificationsOfOrderExecutionResult;
    /**
     * Идентификатор извещения о принятии к исполнению распоряжения в ГИС ЖКХ, необходим для проведения экспорта следующих 1000 извещений.
     * Если элемент не заполнен, то это свидетельствует о том, что все запрашиваемые данные были выгружены
     * 
     */
    @XmlElement(name = "ExportNotificationsOfOrderExecutionGUID")
    protected String exportNotificationsOfOrderExecutionGUID;
    /**
     * Страховой продукт
     * 
     */
    @XmlElement(name = "InsuranceProduct")
    protected List<InsuranceProductType> insuranceProduct;
    /**
     * Информация о состоянии расчетов
     * 
     */
    @XmlElement(name = "Settlement")
    protected List<ExportSettlementResultType> settlement;
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
     * Gets the value of the exportPaymentDocResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportPaymentDocResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportPaymentDocResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportPaymentDocumentResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportPaymentDocResult property.
     */
    public List<ExportPaymentDocumentResultType> getExportPaymentDocResult() {
        if (exportPaymentDocResult == null) {
            exportPaymentDocResult = new ArrayList<>();
        }
        return this.exportPaymentDocResult;
    }

    /**
     * Gets the value of the exportNotificationsOfOrderExecutionResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportNotificationsOfOrderExecutionResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportNotificationsOfOrderExecutionResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportNotificationsOfOrderExecutionResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportNotificationsOfOrderExecutionResult property.
     */
    public List<ExportNotificationsOfOrderExecutionResultType> getExportNotificationsOfOrderExecutionResult() {
        if (exportNotificationsOfOrderExecutionResult == null) {
            exportNotificationsOfOrderExecutionResult = new ArrayList<>();
        }
        return this.exportNotificationsOfOrderExecutionResult;
    }

    /**
     * Идентификатор извещения о принятии к исполнению распоряжения в ГИС ЖКХ, необходим для проведения экспорта следующих 1000 извещений.
     * Если элемент не заполнен, то это свидетельствует о том, что все запрашиваемые данные были выгружены
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportNotificationsOfOrderExecutionGUID() {
        return exportNotificationsOfOrderExecutionGUID;
    }

    /**
     * Sets the value of the exportNotificationsOfOrderExecutionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportNotificationsOfOrderExecutionGUID()
     */
    public void setExportNotificationsOfOrderExecutionGUID(String value) {
        this.exportNotificationsOfOrderExecutionGUID = value;
    }

    /**
     * Страховой продукт
     * 
     * Gets the value of the insuranceProduct property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceProduct property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInsuranceProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceProductType }
     * </p>
     * 
     * 
     * @return
     *     The value of the insuranceProduct property.
     */
    public List<InsuranceProductType> getInsuranceProduct() {
        if (insuranceProduct == null) {
            insuranceProduct = new ArrayList<>();
        }
        return this.insuranceProduct;
    }

    /**
     * Информация о состоянии расчетов
     * 
     * Gets the value of the settlement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSettlement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportSettlementResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the settlement property.
     */
    public List<ExportSettlementResultType> getSettlement() {
        if (settlement == null) {
            settlement = new ArrayList<>();
        }
        return this.settlement;
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
