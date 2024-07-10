
package ru.gosuslugi.dom.schema.integration.device_metering;

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
 *         <sequence>
 *           <element name="exportMeteringDeviceHistoryResult" type="{http://dom.gosuslugi.ru/schema/integration/device-metering/}exportMeteringDeviceHistoryResultType" maxOccurs="unbounded"/>
 *           <element name="PagedOutput" minOccurs="0">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="ExportMeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="LastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </sequence>
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
    "exportMeteringDeviceHistoryResult",
    "pagedOutput"
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
    protected List<ExportMeteringDeviceHistoryResultType> exportMeteringDeviceHistoryResult;
    /**
     * Параметры, используемые для выгрузки показаний и поверок ПУ блоками, содержащими не более 1000 ПУ в каждом блоке. Заполняется всегда, кроме случая, когда в запросе exportMeteringDeviceHistoryRequest указан ровно один элемент tns:FIASHouseGuid
     * 
     */
    @XmlElement(name = "PagedOutput")
    protected GetStateResult.PagedOutput pagedOutput;
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
     * Gets the value of the exportMeteringDeviceHistoryResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportMeteringDeviceHistoryResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportMeteringDeviceHistoryResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportMeteringDeviceHistoryResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportMeteringDeviceHistoryResult property.
     */
    public List<ExportMeteringDeviceHistoryResultType> getExportMeteringDeviceHistoryResult() {
        if (exportMeteringDeviceHistoryResult == null) {
            exportMeteringDeviceHistoryResult = new ArrayList<>();
        }
        return this.exportMeteringDeviceHistoryResult;
    }

    /**
     * Параметры, используемые для выгрузки показаний и поверок ПУ блоками, содержащими не более 1000 ПУ в каждом блоке. Заполняется всегда, кроме случая, когда в запросе exportMeteringDeviceHistoryRequest указан ровно один элемент tns:FIASHouseGuid
     * 
     * @return
     *     possible object is
     *     {@link GetStateResult.PagedOutput }
     *     
     */
    public GetStateResult.PagedOutput getPagedOutput() {
        return pagedOutput;
    }

    /**
     * Sets the value of the pagedOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateResult.PagedOutput }
     *     
     * @see #getPagedOutput()
     */
    public void setPagedOutput(GetStateResult.PagedOutput value) {
        this.pagedOutput = value;
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="ExportMeteringDeviceRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="LastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exportMeteringDeviceRootGUID",
        "lastPage"
    })
    public static class PagedOutput {

        /**
         * Корневой идентификатор ПУ в ГИС ЖКХ для получения следующего блока запроса
         * 
         */
        @XmlElement(name = "ExportMeteringDeviceRootGUID")
        protected String exportMeteringDeviceRootGUID;
        /**
         * Признак последнего блока запроса
         * 
         */
        @XmlElement(name = "LastPage")
        protected Boolean lastPage;

        /**
         * Корневой идентификатор ПУ в ГИС ЖКХ для получения следующего блока запроса
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExportMeteringDeviceRootGUID() {
            return exportMeteringDeviceRootGUID;
        }

        /**
         * Sets the value of the exportMeteringDeviceRootGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getExportMeteringDeviceRootGUID()
         */
        public void setExportMeteringDeviceRootGUID(String value) {
            this.exportMeteringDeviceRootGUID = value;
        }

        /**
         * Признак последнего блока запроса
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLastPage() {
            return lastPage;
        }

        /**
         * Sets the value of the lastPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isLastPage()
         */
        public void setLastPage(Boolean value) {
            this.lastPage = value;
        }

    }

}
