
package ru.gosuslugi.dom.schema.integration.tariff;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="exportTariffDifferentiationResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Differentiation" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}exportDifferentiationType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportSocialNormsResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
 *                   <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
 *                   <element name="SocialNorms" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}SocialNormType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportResidentialPremisesMaintenanceResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
 *                   <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
 *                   <element name="ResidentialPremisesMaintenance" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesMaintenanceType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportMunicipalResourceTariffResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
 *                   <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
 *                   <element name="MunicipalResourceTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}MunicipalResourceTariffType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportCapitalRepairTariffResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
 *                   <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
 *                   <element name="CapitalRepairTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CapitalRepairTariffType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportResidentialPremisesUsageResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
 *                   <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
 *                   <element name="ResidentialPremisesUsage" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesUsageType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.14.0.5""/>
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
    "exportTariffDifferentiationResult",
    "exportSocialNormsResult",
    "exportResidentialPremisesMaintenanceResult",
    "exportMunicipalResourceTariffResult",
    "exportCapitalRepairTariffResult",
    "exportResidentialPremisesUsageResult"
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
     * Результат импорта
     * 
     */
    @XmlElement(name = "ImportResult")
    protected List<CommonResultType> importResult;
    /**
     * Результат экспорта видов критериев дифференциации
     * 
     */
    protected List<GetStateResult.ExportTariffDifferentiationResult> exportTariffDifferentiationResult;
    /**
     * Результат экспорта информации о социальных нормах потребления электрической энергии
     * 
     */
    protected List<GetStateResult.ExportSocialNormsResult> exportSocialNormsResult;
    /**
     * Результат экспорта информации о размере платы за содержание жилого помещения
     * 
     */
    protected List<GetStateResult.ExportResidentialPremisesMaintenanceResult> exportResidentialPremisesMaintenanceResult;
    /**
     * Результат экспорта информации о тарифах на оплату коммунальных ресурсов
     * 
     */
    protected List<GetStateResult.ExportMunicipalResourceTariffResult> exportMunicipalResourceTariffResult;
    /**
     * Результат экспорта информации о размере взноса на капитальный ремонт
     * 
     */
    protected List<GetStateResult.ExportCapitalRepairTariffResult> exportCapitalRepairTariffResult;
    /**
     * Результат экспорта информации о размере платы за пользование жилым помещением
     * 
     */
    protected List<GetStateResult.ExportResidentialPremisesUsageResult> exportResidentialPremisesUsageResult;
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
     * Результат экспорта видов критериев дифференциации
     * 
     * Gets the value of the exportTariffDifferentiationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportTariffDifferentiationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportTariffDifferentiationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportTariffDifferentiationResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportTariffDifferentiationResult property.
     */
    public List<GetStateResult.ExportTariffDifferentiationResult> getExportTariffDifferentiationResult() {
        if (exportTariffDifferentiationResult == null) {
            exportTariffDifferentiationResult = new ArrayList<>();
        }
        return this.exportTariffDifferentiationResult;
    }

    /**
     * Результат экспорта информации о социальных нормах потребления электрической энергии
     * 
     * Gets the value of the exportSocialNormsResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportSocialNormsResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportSocialNormsResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportSocialNormsResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportSocialNormsResult property.
     */
    public List<GetStateResult.ExportSocialNormsResult> getExportSocialNormsResult() {
        if (exportSocialNormsResult == null) {
            exportSocialNormsResult = new ArrayList<>();
        }
        return this.exportSocialNormsResult;
    }

    /**
     * Результат экспорта информации о размере платы за содержание жилого помещения
     * 
     * Gets the value of the exportResidentialPremisesMaintenanceResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportResidentialPremisesMaintenanceResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportResidentialPremisesMaintenanceResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportResidentialPremisesMaintenanceResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportResidentialPremisesMaintenanceResult property.
     */
    public List<GetStateResult.ExportResidentialPremisesMaintenanceResult> getExportResidentialPremisesMaintenanceResult() {
        if (exportResidentialPremisesMaintenanceResult == null) {
            exportResidentialPremisesMaintenanceResult = new ArrayList<>();
        }
        return this.exportResidentialPremisesMaintenanceResult;
    }

    /**
     * Результат экспорта информации о тарифах на оплату коммунальных ресурсов
     * 
     * Gets the value of the exportMunicipalResourceTariffResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportMunicipalResourceTariffResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportMunicipalResourceTariffResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportMunicipalResourceTariffResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportMunicipalResourceTariffResult property.
     */
    public List<GetStateResult.ExportMunicipalResourceTariffResult> getExportMunicipalResourceTariffResult() {
        if (exportMunicipalResourceTariffResult == null) {
            exportMunicipalResourceTariffResult = new ArrayList<>();
        }
        return this.exportMunicipalResourceTariffResult;
    }

    /**
     * Результат экспорта информации о размере взноса на капитальный ремонт
     * 
     * Gets the value of the exportCapitalRepairTariffResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportCapitalRepairTariffResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportCapitalRepairTariffResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportCapitalRepairTariffResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportCapitalRepairTariffResult property.
     */
    public List<GetStateResult.ExportCapitalRepairTariffResult> getExportCapitalRepairTariffResult() {
        if (exportCapitalRepairTariffResult == null) {
            exportCapitalRepairTariffResult = new ArrayList<>();
        }
        return this.exportCapitalRepairTariffResult;
    }

    /**
     * Результат экспорта информации о размере платы за пользование жилым помещением
     * 
     * Gets the value of the exportResidentialPremisesUsageResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportResidentialPremisesUsageResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportResidentialPremisesUsageResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportResidentialPremisesUsageResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportResidentialPremisesUsageResult property.
     */
    public List<GetStateResult.ExportResidentialPremisesUsageResult> getExportResidentialPremisesUsageResult() {
        if (exportResidentialPremisesUsageResult == null) {
            exportResidentialPremisesUsageResult = new ArrayList<>();
        }
        return this.exportResidentialPremisesUsageResult;
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
            return "11.14.0.5";
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
     *       <sequence>
     *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
     *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
     *         <element name="CapitalRepairTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CapitalRepairTariffType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tariffGUID",
        "status",
        "cancelReason",
        "capitalRepairTariff"
    })
    public static class ExportCapitalRepairTariffResult {

        /**
         * Идентификатор тарифа
         * 
         */
        @XmlElement(name = "TariffGUID", required = true)
        protected String tariffGUID;
        /**
         * Статус информации о тарифе
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "token")
        protected StatusType status;
        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "CancelReason")
        protected String cancelReason;
        /**
         * Экспортируемые сведения о минимальных размерах взносов на капитальный ремонт
         * 
         */
        @XmlElement(name = "CapitalRepairTariff", required = true)
        protected CapitalRepairTariffType capitalRepairTariff;

        /**
         * Идентификатор тарифа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTariffGUID() {
            return tariffGUID;
        }

        /**
         * Sets the value of the tariffGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTariffGUID()
         */
        public void setTariffGUID(String value) {
            this.tariffGUID = value;
        }

        /**
         * Статус информации о тарифе
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelReason() {
            return cancelReason;
        }

        /**
         * Sets the value of the cancelReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCancelReason()
         */
        public void setCancelReason(String value) {
            this.cancelReason = value;
        }

        /**
         * Экспортируемые сведения о минимальных размерах взносов на капитальный ремонт
         * 
         * @return
         *     possible object is
         *     {@link CapitalRepairTariffType }
         *     
         */
        public CapitalRepairTariffType getCapitalRepairTariff() {
            return capitalRepairTariff;
        }

        /**
         * Sets the value of the capitalRepairTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link CapitalRepairTariffType }
         *     
         * @see #getCapitalRepairTariff()
         */
        public void setCapitalRepairTariff(CapitalRepairTariffType value) {
            this.capitalRepairTariff = value;
        }

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
     *       <sequence>
     *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
     *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
     *         <element name="MunicipalResourceTariff" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}MunicipalResourceTariffType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tariffGUID",
        "status",
        "cancelReason",
        "municipalResourceTariff"
    })
    public static class ExportMunicipalResourceTariffResult {

        /**
         * Идентификатор тарифа
         * 
         */
        @XmlElement(name = "TariffGUID", required = true)
        protected String tariffGUID;
        /**
         * Статус информации о тарифе
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "token")
        protected StatusType status;
        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "CancelReason")
        protected String cancelReason;
        /**
         * Экспортируемые сведения о тарифах на оплату коммунальных ресурсов
         * 
         */
        @XmlElement(name = "MunicipalResourceTariff", required = true)
        protected MunicipalResourceTariffType municipalResourceTariff;

        /**
         * Идентификатор тарифа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTariffGUID() {
            return tariffGUID;
        }

        /**
         * Sets the value of the tariffGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTariffGUID()
         */
        public void setTariffGUID(String value) {
            this.tariffGUID = value;
        }

        /**
         * Статус информации о тарифе
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelReason() {
            return cancelReason;
        }

        /**
         * Sets the value of the cancelReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCancelReason()
         */
        public void setCancelReason(String value) {
            this.cancelReason = value;
        }

        /**
         * Экспортируемые сведения о тарифах на оплату коммунальных ресурсов
         * 
         * @return
         *     possible object is
         *     {@link MunicipalResourceTariffType }
         *     
         */
        public MunicipalResourceTariffType getMunicipalResourceTariff() {
            return municipalResourceTariff;
        }

        /**
         * Sets the value of the municipalResourceTariff property.
         * 
         * @param value
         *     allowed object is
         *     {@link MunicipalResourceTariffType }
         *     
         * @see #getMunicipalResourceTariff()
         */
        public void setMunicipalResourceTariff(MunicipalResourceTariffType value) {
            this.municipalResourceTariff = value;
        }

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
     *       <sequence>
     *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
     *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
     *         <element name="ResidentialPremisesMaintenance" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesMaintenanceType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tariffGUID",
        "status",
        "cancelReason",
        "residentialPremisesMaintenance"
    })
    public static class ExportResidentialPremisesMaintenanceResult {

        /**
         * Идентификатор тарифа
         * 
         */
        @XmlElement(name = "TariffGUID", required = true)
        protected String tariffGUID;
        /**
         * Статус информации о тарифе
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "token")
        protected StatusType status;
        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "CancelReason")
        protected String cancelReason;
        /**
         * Экспортируемые сведения о размерах плат за содержание жилого помещения
         * 
         */
        @XmlElement(name = "ResidentialPremisesMaintenance", required = true)
        protected ResidentialPremisesMaintenanceType residentialPremisesMaintenance;

        /**
         * Идентификатор тарифа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTariffGUID() {
            return tariffGUID;
        }

        /**
         * Sets the value of the tariffGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTariffGUID()
         */
        public void setTariffGUID(String value) {
            this.tariffGUID = value;
        }

        /**
         * Статус информации о тарифе
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelReason() {
            return cancelReason;
        }

        /**
         * Sets the value of the cancelReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCancelReason()
         */
        public void setCancelReason(String value) {
            this.cancelReason = value;
        }

        /**
         * Экспортируемые сведения о размерах плат за содержание жилого помещения
         * 
         * @return
         *     possible object is
         *     {@link ResidentialPremisesMaintenanceType }
         *     
         */
        public ResidentialPremisesMaintenanceType getResidentialPremisesMaintenance() {
            return residentialPremisesMaintenance;
        }

        /**
         * Sets the value of the residentialPremisesMaintenance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentialPremisesMaintenanceType }
         *     
         * @see #getResidentialPremisesMaintenance()
         */
        public void setResidentialPremisesMaintenance(ResidentialPremisesMaintenanceType value) {
            this.residentialPremisesMaintenance = value;
        }

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
     *       <sequence>
     *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
     *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
     *         <element name="ResidentialPremisesUsage" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}ResidentialPremisesUsageType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tariffGUID",
        "status",
        "cancelReason",
        "residentialPremisesUsage"
    })
    public static class ExportResidentialPremisesUsageResult {

        /**
         * Идентификатор тарифа
         * 
         */
        @XmlElement(name = "TariffGUID", required = true)
        protected String tariffGUID;
        /**
         * Статус информации о тарифе
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "token")
        protected StatusType status;
        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "CancelReason")
        protected String cancelReason;
        /**
         * Экспортируемые сведения о размерах плат за пользование жилым помещением
         * 
         */
        @XmlElement(name = "ResidentialPremisesUsage", required = true)
        protected ResidentialPremisesUsageType residentialPremisesUsage;

        /**
         * Идентификатор тарифа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTariffGUID() {
            return tariffGUID;
        }

        /**
         * Sets the value of the tariffGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTariffGUID()
         */
        public void setTariffGUID(String value) {
            this.tariffGUID = value;
        }

        /**
         * Статус информации о тарифе
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelReason() {
            return cancelReason;
        }

        /**
         * Sets the value of the cancelReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCancelReason()
         */
        public void setCancelReason(String value) {
            this.cancelReason = value;
        }

        /**
         * Экспортируемые сведения о размерах плат за пользование жилым помещением
         * 
         * @return
         *     possible object is
         *     {@link ResidentialPremisesUsageType }
         *     
         */
        public ResidentialPremisesUsageType getResidentialPremisesUsage() {
            return residentialPremisesUsage;
        }

        /**
         * Sets the value of the residentialPremisesUsage property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResidentialPremisesUsageType }
         *     
         * @see #getResidentialPremisesUsage()
         */
        public void setResidentialPremisesUsage(ResidentialPremisesUsageType value) {
            this.residentialPremisesUsage = value;
        }

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
     *       <sequence>
     *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}StatusType"/>
     *         <element name="CancelReason" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}String4000Type" minOccurs="0"/>
     *         <element name="SocialNorms" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}SocialNormType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tariffGUID",
        "status",
        "cancelReason",
        "socialNorms"
    })
    public static class ExportSocialNormsResult {

        /**
         * Идентификатор тарифа
         * 
         */
        @XmlElement(name = "TariffGUID", required = true)
        protected String tariffGUID;
        /**
         * Статус информации о тарифе
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "token")
        protected StatusType status;
        /**
         * Причина аннулирования
         * 
         */
        @XmlElement(name = "CancelReason")
        protected String cancelReason;
        /**
         * Экспортируемые сведения о социальных нормах потребления электрической энергии
         * 
         */
        @XmlElement(name = "SocialNorms", required = true)
        protected SocialNormType socialNorms;

        /**
         * Идентификатор тарифа
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTariffGUID() {
            return tariffGUID;
        }

        /**
         * Sets the value of the tariffGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTariffGUID()
         */
        public void setTariffGUID(String value) {
            this.tariffGUID = value;
        }

        /**
         * Статус информации о тарифе
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(StatusType value) {
            this.status = value;
        }

        /**
         * Причина аннулирования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelReason() {
            return cancelReason;
        }

        /**
         * Sets the value of the cancelReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCancelReason()
         */
        public void setCancelReason(String value) {
            this.cancelReason = value;
        }

        /**
         * Экспортируемые сведения о социальных нормах потребления электрической энергии
         * 
         * @return
         *     possible object is
         *     {@link SocialNormType }
         *     
         */
        public SocialNormType getSocialNorms() {
            return socialNorms;
        }

        /**
         * Sets the value of the socialNorms property.
         * 
         * @param value
         *     allowed object is
         *     {@link SocialNormType }
         *     
         * @see #getSocialNorms()
         */
        public void setSocialNorms(SocialNormType value) {
            this.socialNorms = value;
        }

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
     *       <sequence>
     *         <element name="Differentiation" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}exportDifferentiationType" maxOccurs="unbounded"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "differentiation"
    })
    public static class ExportTariffDifferentiationResult {

        /**
         * Экспортируемые сведения о видах критериев дифференциации
         * 
         */
        @XmlElement(name = "Differentiation", required = true)
        protected List<ExportDifferentiationType> differentiation;

        /**
         * Экспортируемые сведения о видах критериев дифференциации
         * 
         * Gets the value of the differentiation property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the differentiation property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDifferentiation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportDifferentiationType }
         * </p>
         * 
         * 
         * @return
         *     The value of the differentiation property.
         */
        public List<ExportDifferentiationType> getDifferentiation() {
            if (differentiation == null) {
                differentiation = new ArrayList<>();
            }
            return this.differentiation;
        }

    }

}
