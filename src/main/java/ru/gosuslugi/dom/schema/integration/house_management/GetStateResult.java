
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *         <element name="ImportResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
 *                   <element name="CommonResult" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType">
 *                           <choice minOccurs="0">
 *                             <element name="ImportHouseUO" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
 *                             <element name="ImportHouseOMS" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
 *                             <element name="ImportHouseESP" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
 *                             <element name="importContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}importContractResultType"/>
 *                             <element name="importCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}importCharterResultType"/>
 *                             <element name="importMeteringDevice">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="MeteringDeviceGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ImportAccount">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ImportSupplyResourceContractObjectAddress">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ImportSupplyResourceContract">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                       <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ImportSupplyResourceContractProject">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </choice>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *                 <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportHouseResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportHouseResultType"/>
 *         <element name="exportBriefBasicHouseResult">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ResultItem" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportBriefBasicHouseResultType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportBriefApartmentHouseResult">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ApartmentHouseInfo" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefApartmentHouseType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportBriefLivingHouseResult">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ResultItem" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportBriefLivingHouseResultType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportMeteringDeviceDataResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportMeteringDeviceDataResultType" maxOccurs="unbounded"/>
 *         <element name="exportStatusCAChResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportStatusCAChResultType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="exportCAChResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportCAChResultType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="exportStatusPublicPropertyContractResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportStatusPublicPropertyContractResultType" maxOccurs="unbounded"/>
 *         <element name="exportAccountResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportAccountResultType" maxOccurs="unbounded"/>
 *         <element name="VotingProtocol" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportVotingProtocolResultType" maxOccurs="unbounded"/>
 *         <element name="VotingMessage" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportVotingMessageResultType" maxOccurs="unbounded"/>
 *         <element name="exportSupplyResourceContractResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Contract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportSupplyResourceContractResultType" maxOccurs="1000"/>
 *                   <choice>
 *                     <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="ExportContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportSupplyResourceContractObjectAddress" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ObjectAddress" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportSupplyResourceContractObjectAddressResultType" maxOccurs="1000"/>
 *                   <choice>
 *                     <element name="ExportObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportBriefSupplyResourceContractResult" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Contract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportBriefSupplyResourceContractResultType" maxOccurs="unbounded"/>
 *                   <choice>
 *                     <sequence>
 *                       <element name="NextPageContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="NextPageObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                     </sequence>
 *                     <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="exportAccountIndividualServicesResult" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportAccountIndividualServicesResultType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="rolloverCAChStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportRolloverStatusCAChResultType"/>
 *         <element name="exportBriefSocialHireContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportBriefSocialHireContractResultType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="exportOwnerDecision" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportOwnerDecisionResultType" maxOccurs="unbounded"/>
 *         <element name="exportOwnerRefusal" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerRefusalExportType" maxOccurs="unbounded"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
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
    "exportHouseResult",
    "exportBriefBasicHouseResult",
    "exportBriefApartmentHouseResult",
    "exportBriefLivingHouseResult",
    "exportMeteringDeviceDataResult",
    "exportStatusCAChResult",
    "exportCAChResult",
    "exportStatusPublicPropertyContractResult",
    "exportAccountResult",
    "votingProtocol",
    "votingMessage",
    "exportSupplyResourceContractResult",
    "exportSupplyResourceContractObjectAddress",
    "exportBriefSupplyResourceContractResult",
    "exportAccountIndividualServicesResult",
    "rolloverCAChStatus",
    "exportBriefSocialHireContract",
    "exportOwnerDecision",
    "exportOwnerRefusal"
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
    protected List<GetStateResult.ImportResult> importResult;
    protected ExportHouseResultType exportHouseResult;
    /**
     * Запрос на экспорт краткой базовой информации о доме
     * 
     */
    protected GetStateResult.ExportBriefBasicHouseResult exportBriefBasicHouseResult;
    /**
     * Запрос на экспорт краткой базовой информации о доме
     * 
     */
    protected GetStateResult.ExportBriefApartmentHouseResult exportBriefApartmentHouseResult;
    /**
     * Запрос на экспорт краткой базовой информации о доме
     * 
     */
    protected GetStateResult.ExportBriefLivingHouseResult exportBriefLivingHouseResult;
    protected List<ExportMeteringDeviceDataResultType> exportMeteringDeviceDataResult;
    protected List<ExportStatusCAChResultType> exportStatusCAChResult;
    protected List<ExportCAChResultType> exportCAChResult;
    protected List<ExportStatusPublicPropertyContractResultType> exportStatusPublicPropertyContractResult;
    protected List<ExportAccountResultType> exportAccountResult;
    @XmlElement(name = "VotingProtocol")
    protected List<ExportVotingProtocolResultType> votingProtocol;
    @XmlElement(name = "VotingMessage")
    protected List<ExportVotingMessageResultType> votingMessage;
    protected List<GetStateResult.ExportSupplyResourceContractResult> exportSupplyResourceContractResult;
    /**
     * Объект жилищного фонда в договоре ресурсоснабжения
     * 
     */
    protected List<GetStateResult.ExportSupplyResourceContractObjectAddress> exportSupplyResourceContractObjectAddress;
    /**
     * Результат экспорта сокращенного состава информации о договоре ресурсоснабжения
     * 
     */
    protected List<GetStateResult.ExportBriefSupplyResourceContractResult> exportBriefSupplyResourceContractResult;
    protected List<ExportAccountIndividualServicesResultType> exportAccountIndividualServicesResult;
    /**
     * Статус пролонгации ДУ/уставов
     * 
     */
    protected ExportRolloverStatusCAChResultType rolloverCAChStatus;
    protected List<ExportBriefSocialHireContractResultType> exportBriefSocialHireContract;
    /**
     * Решение собственника по вопросам голосования
     * 
     */
    protected List<ExportOwnerDecisionResultType> exportOwnerDecision;
    /**
     * Письменные отказы собственников
     * 
     */
    protected List<OwnerRefusalExportType> exportOwnerRefusal;
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
     * {@link GetStateResult.ImportResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the importResult property.
     */
    public List<GetStateResult.ImportResult> getImportResult() {
        if (importResult == null) {
            importResult = new ArrayList<>();
        }
        return this.importResult;
    }

    /**
     * Gets the value of the exportHouseResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExportHouseResultType }
     *     
     */
    public ExportHouseResultType getExportHouseResult() {
        return exportHouseResult;
    }

    /**
     * Sets the value of the exportHouseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHouseResultType }
     *     
     */
    public void setExportHouseResult(ExportHouseResultType value) {
        this.exportHouseResult = value;
    }

    /**
     * Запрос на экспорт краткой базовой информации о доме
     * 
     * @return
     *     possible object is
     *     {@link GetStateResult.ExportBriefBasicHouseResult }
     *     
     */
    public GetStateResult.ExportBriefBasicHouseResult getExportBriefBasicHouseResult() {
        return exportBriefBasicHouseResult;
    }

    /**
     * Sets the value of the exportBriefBasicHouseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateResult.ExportBriefBasicHouseResult }
     *     
     * @see #getExportBriefBasicHouseResult()
     */
    public void setExportBriefBasicHouseResult(GetStateResult.ExportBriefBasicHouseResult value) {
        this.exportBriefBasicHouseResult = value;
    }

    /**
     * Запрос на экспорт краткой базовой информации о доме
     * 
     * @return
     *     possible object is
     *     {@link GetStateResult.ExportBriefApartmentHouseResult }
     *     
     */
    public GetStateResult.ExportBriefApartmentHouseResult getExportBriefApartmentHouseResult() {
        return exportBriefApartmentHouseResult;
    }

    /**
     * Sets the value of the exportBriefApartmentHouseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateResult.ExportBriefApartmentHouseResult }
     *     
     * @see #getExportBriefApartmentHouseResult()
     */
    public void setExportBriefApartmentHouseResult(GetStateResult.ExportBriefApartmentHouseResult value) {
        this.exportBriefApartmentHouseResult = value;
    }

    /**
     * Запрос на экспорт краткой базовой информации о доме
     * 
     * @return
     *     possible object is
     *     {@link GetStateResult.ExportBriefLivingHouseResult }
     *     
     */
    public GetStateResult.ExportBriefLivingHouseResult getExportBriefLivingHouseResult() {
        return exportBriefLivingHouseResult;
    }

    /**
     * Sets the value of the exportBriefLivingHouseResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStateResult.ExportBriefLivingHouseResult }
     *     
     * @see #getExportBriefLivingHouseResult()
     */
    public void setExportBriefLivingHouseResult(GetStateResult.ExportBriefLivingHouseResult value) {
        this.exportBriefLivingHouseResult = value;
    }

    /**
     * Gets the value of the exportMeteringDeviceDataResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportMeteringDeviceDataResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportMeteringDeviceDataResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportMeteringDeviceDataResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportMeteringDeviceDataResult property.
     */
    public List<ExportMeteringDeviceDataResultType> getExportMeteringDeviceDataResult() {
        if (exportMeteringDeviceDataResult == null) {
            exportMeteringDeviceDataResult = new ArrayList<>();
        }
        return this.exportMeteringDeviceDataResult;
    }

    /**
     * Gets the value of the exportStatusCAChResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportStatusCAChResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportStatusCAChResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportStatusCAChResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportStatusCAChResult property.
     */
    public List<ExportStatusCAChResultType> getExportStatusCAChResult() {
        if (exportStatusCAChResult == null) {
            exportStatusCAChResult = new ArrayList<>();
        }
        return this.exportStatusCAChResult;
    }

    /**
     * Gets the value of the exportCAChResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportCAChResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportCAChResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCAChResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportCAChResult property.
     */
    public List<ExportCAChResultType> getExportCAChResult() {
        if (exportCAChResult == null) {
            exportCAChResult = new ArrayList<>();
        }
        return this.exportCAChResult;
    }

    /**
     * Gets the value of the exportStatusPublicPropertyContractResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportStatusPublicPropertyContractResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportStatusPublicPropertyContractResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportStatusPublicPropertyContractResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportStatusPublicPropertyContractResult property.
     */
    public List<ExportStatusPublicPropertyContractResultType> getExportStatusPublicPropertyContractResult() {
        if (exportStatusPublicPropertyContractResult == null) {
            exportStatusPublicPropertyContractResult = new ArrayList<>();
        }
        return this.exportStatusPublicPropertyContractResult;
    }

    /**
     * Gets the value of the exportAccountResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportAccountResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportAccountResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAccountResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportAccountResult property.
     */
    public List<ExportAccountResultType> getExportAccountResult() {
        if (exportAccountResult == null) {
            exportAccountResult = new ArrayList<>();
        }
        return this.exportAccountResult;
    }

    /**
     * Gets the value of the votingProtocol property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the votingProtocol property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVotingProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportVotingProtocolResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the votingProtocol property.
     */
    public List<ExportVotingProtocolResultType> getVotingProtocol() {
        if (votingProtocol == null) {
            votingProtocol = new ArrayList<>();
        }
        return this.votingProtocol;
    }

    /**
     * Gets the value of the votingMessage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the votingMessage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVotingMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportVotingMessageResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the votingMessage property.
     */
    public List<ExportVotingMessageResultType> getVotingMessage() {
        if (votingMessage == null) {
            votingMessage = new ArrayList<>();
        }
        return this.votingMessage;
    }

    /**
     * Gets the value of the exportSupplyResourceContractResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportSupplyResourceContractResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportSupplyResourceContractResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportSupplyResourceContractResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportSupplyResourceContractResult property.
     */
    public List<GetStateResult.ExportSupplyResourceContractResult> getExportSupplyResourceContractResult() {
        if (exportSupplyResourceContractResult == null) {
            exportSupplyResourceContractResult = new ArrayList<>();
        }
        return this.exportSupplyResourceContractResult;
    }

    /**
     * Объект жилищного фонда в договоре ресурсоснабжения
     * 
     * Gets the value of the exportSupplyResourceContractObjectAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportSupplyResourceContractObjectAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportSupplyResourceContractObjectAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportSupplyResourceContractObjectAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportSupplyResourceContractObjectAddress property.
     */
    public List<GetStateResult.ExportSupplyResourceContractObjectAddress> getExportSupplyResourceContractObjectAddress() {
        if (exportSupplyResourceContractObjectAddress == null) {
            exportSupplyResourceContractObjectAddress = new ArrayList<>();
        }
        return this.exportSupplyResourceContractObjectAddress;
    }

    /**
     * Результат экспорта сокращенного состава информации о договоре ресурсоснабжения
     * 
     * Gets the value of the exportBriefSupplyResourceContractResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportBriefSupplyResourceContractResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportBriefSupplyResourceContractResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetStateResult.ExportBriefSupplyResourceContractResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportBriefSupplyResourceContractResult property.
     */
    public List<GetStateResult.ExportBriefSupplyResourceContractResult> getExportBriefSupplyResourceContractResult() {
        if (exportBriefSupplyResourceContractResult == null) {
            exportBriefSupplyResourceContractResult = new ArrayList<>();
        }
        return this.exportBriefSupplyResourceContractResult;
    }

    /**
     * Gets the value of the exportAccountIndividualServicesResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportAccountIndividualServicesResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportAccountIndividualServicesResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAccountIndividualServicesResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportAccountIndividualServicesResult property.
     */
    public List<ExportAccountIndividualServicesResultType> getExportAccountIndividualServicesResult() {
        if (exportAccountIndividualServicesResult == null) {
            exportAccountIndividualServicesResult = new ArrayList<>();
        }
        return this.exportAccountIndividualServicesResult;
    }

    /**
     * Статус пролонгации ДУ/уставов
     * 
     * @return
     *     possible object is
     *     {@link ExportRolloverStatusCAChResultType }
     *     
     */
    public ExportRolloverStatusCAChResultType getRolloverCAChStatus() {
        return rolloverCAChStatus;
    }

    /**
     * Sets the value of the rolloverCAChStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportRolloverStatusCAChResultType }
     *     
     * @see #getRolloverCAChStatus()
     */
    public void setRolloverCAChStatus(ExportRolloverStatusCAChResultType value) {
        this.rolloverCAChStatus = value;
    }

    /**
     * Gets the value of the exportBriefSocialHireContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportBriefSocialHireContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportBriefSocialHireContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportBriefSocialHireContractResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportBriefSocialHireContract property.
     */
    public List<ExportBriefSocialHireContractResultType> getExportBriefSocialHireContract() {
        if (exportBriefSocialHireContract == null) {
            exportBriefSocialHireContract = new ArrayList<>();
        }
        return this.exportBriefSocialHireContract;
    }

    /**
     * Решение собственника по вопросам голосования
     * 
     * Gets the value of the exportOwnerDecision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOwnerDecision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportOwnerDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOwnerDecisionResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportOwnerDecision property.
     */
    public List<ExportOwnerDecisionResultType> getExportOwnerDecision() {
        if (exportOwnerDecision == null) {
            exportOwnerDecision = new ArrayList<>();
        }
        return this.exportOwnerDecision;
    }

    /**
     * Письменные отказы собственников
     * 
     * Gets the value of the exportOwnerRefusal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportOwnerRefusal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportOwnerRefusal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnerRefusalExportType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportOwnerRefusal property.
     */
    public List<OwnerRefusalExportType> getExportOwnerRefusal() {
        if (exportOwnerRefusal == null) {
            exportOwnerRefusal = new ArrayList<>();
        }
        return this.exportOwnerRefusal;
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
            return "11.0.0.1";
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
     *         <element name="ApartmentHouseInfo" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BriefApartmentHouseType"/>
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
        "apartmentHouseInfo"
    })
    public static class ExportBriefApartmentHouseResult {

        /**
         * Краткая информация о МКД
         * 
         */
        @XmlElement(name = "ApartmentHouseInfo", required = true)
        protected BriefApartmentHouseType apartmentHouseInfo;

        /**
         * Краткая информация о МКД
         * 
         * @return
         *     possible object is
         *     {@link BriefApartmentHouseType }
         *     
         */
        public BriefApartmentHouseType getApartmentHouseInfo() {
            return apartmentHouseInfo;
        }

        /**
         * Sets the value of the apartmentHouseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BriefApartmentHouseType }
         *     
         * @see #getApartmentHouseInfo()
         */
        public void setApartmentHouseInfo(BriefApartmentHouseType value) {
            this.apartmentHouseInfo = value;
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
     *         <element name="ResultItem" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportBriefBasicHouseResultType" maxOccurs="unbounded"/>
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
        "resultItem"
    })
    public static class ExportBriefBasicHouseResult {

        /**
         * Результат поиска дома по критерию.
         * 
         */
        @XmlElement(name = "ResultItem", required = true)
        protected List<ExportBriefBasicHouseResultType> resultItem;

        /**
         * Результат поиска дома по критерию.
         * 
         * Gets the value of the resultItem property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resultItem property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getResultItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportBriefBasicHouseResultType }
         * </p>
         * 
         * 
         * @return
         *     The value of the resultItem property.
         */
        public List<ExportBriefBasicHouseResultType> getResultItem() {
            if (resultItem == null) {
                resultItem = new ArrayList<>();
            }
            return this.resultItem;
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
     *         <element name="ResultItem" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExportBriefLivingHouseResultType" maxOccurs="unbounded"/>
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
        "resultItem"
    })
    public static class ExportBriefLivingHouseResult {

        /**
         * Результат поиска дома по критерию.
         * 
         */
        @XmlElement(name = "ResultItem", required = true)
        protected List<ExportBriefLivingHouseResultType> resultItem;

        /**
         * Результат поиска дома по критерию.
         * 
         * Gets the value of the resultItem property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the resultItem property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getResultItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportBriefLivingHouseResultType }
         * </p>
         * 
         * 
         * @return
         *     The value of the resultItem property.
         */
        public List<ExportBriefLivingHouseResultType> getResultItem() {
            if (resultItem == null) {
                resultItem = new ArrayList<>();
            }
            return this.resultItem;
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
     *         <element name="Contract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportBriefSupplyResourceContractResultType" maxOccurs="unbounded"/>
     *         <choice>
     *           <sequence>
     *             <element name="NextPageContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *             <element name="NextPageObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *           </sequence>
     *           <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
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
        "contract",
        "nextPageContractRootGUID",
        "nextPageObjectGUID",
        "isLastPage"
    })
    public static class ExportBriefSupplyResourceContractResult {

        @XmlElement(name = "Contract", required = true)
        protected List<ExportBriefSupplyResourceContractResultType> contract;
        /**
         * Идентификатор договора ресурсоснабжения для  экспорта следующей страницы договоров
         * 
         */
        @XmlElement(name = "NextPageContractRootGUID")
        protected String nextPageContractRootGUID;
        /**
         * Идентификатор объекта жилищного фонда в ГИС ЖКХ для экспорта следующей страницы ОЖФ
         * 
         */
        @XmlElement(name = "NextPageObjectGUID")
        protected String nextPageObjectGUID;
        /**
         * Последняя страница экспорта
         * 
         */
        @XmlElement(name = "IsLastPage")
        protected Boolean isLastPage;

        /**
         * Gets the value of the contract property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contract property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContract().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportBriefSupplyResourceContractResultType }
         * </p>
         * 
         * 
         * @return
         *     The value of the contract property.
         */
        public List<ExportBriefSupplyResourceContractResultType> getContract() {
            if (contract == null) {
                contract = new ArrayList<>();
            }
            return this.contract;
        }

        /**
         * Идентификатор договора ресурсоснабжения для  экспорта следующей страницы договоров
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextPageContractRootGUID() {
            return nextPageContractRootGUID;
        }

        /**
         * Sets the value of the nextPageContractRootGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNextPageContractRootGUID()
         */
        public void setNextPageContractRootGUID(String value) {
            this.nextPageContractRootGUID = value;
        }

        /**
         * Идентификатор объекта жилищного фонда в ГИС ЖКХ для экспорта следующей страницы ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNextPageObjectGUID() {
            return nextPageObjectGUID;
        }

        /**
         * Sets the value of the nextPageObjectGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNextPageObjectGUID()
         */
        public void setNextPageObjectGUID(String value) {
            this.nextPageObjectGUID = value;
        }

        /**
         * Последняя страница экспорта
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsLastPage() {
            return isLastPage;
        }

        /**
         * Sets the value of the isLastPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsLastPage()
         */
        public void setIsLastPage(Boolean value) {
            this.isLastPage = value;
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
     *         <element name="ObjectAddress" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportSupplyResourceContractObjectAddressResultType" maxOccurs="1000"/>
     *         <choice>
     *           <element name="ExportObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </choice>
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
        "objectAddress",
        "exportObjectGUID",
        "isLastPage"
    })
    public static class ExportSupplyResourceContractObjectAddress {

        /**
         * Объект жилищного фонда в договоре ресурсоснабжения
         * 
         */
        @XmlElement(name = "ObjectAddress", required = true)
        protected List<ExportSupplyResourceContractObjectAddressResultType> objectAddress;
        /**
         * Идентификатор объекта жилищного фонда в ГИС ЖКХ для установки экспорта следующей 1000 ОЖФ
         * 
         */
        @XmlElement(name = "ExportObjectGUID")
        protected String exportObjectGUID;
        /**
         * Последняя страница экспорта
         * 
         */
        @XmlElement(name = "IsLastPage")
        protected Boolean isLastPage;

        /**
         * Объект жилищного фонда в договоре ресурсоснабжения
         * 
         * Gets the value of the objectAddress property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectAddress property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getObjectAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportSupplyResourceContractObjectAddressResultType }
         * </p>
         * 
         * 
         * @return
         *     The value of the objectAddress property.
         */
        public List<ExportSupplyResourceContractObjectAddressResultType> getObjectAddress() {
            if (objectAddress == null) {
                objectAddress = new ArrayList<>();
            }
            return this.objectAddress;
        }

        /**
         * Идентификатор объекта жилищного фонда в ГИС ЖКХ для установки экспорта следующей 1000 ОЖФ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExportObjectGUID() {
            return exportObjectGUID;
        }

        /**
         * Sets the value of the exportObjectGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getExportObjectGUID()
         */
        public void setExportObjectGUID(String value) {
            this.exportObjectGUID = value;
        }

        /**
         * Последняя страница экспорта
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsLastPage() {
            return isLastPage;
        }

        /**
         * Sets the value of the isLastPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsLastPage()
         */
        public void setIsLastPage(Boolean value) {
            this.isLastPage = value;
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
     *         <element name="Contract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}exportSupplyResourceContractResultType" maxOccurs="1000"/>
     *         <choice>
     *           <element name="IsLastPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="ExportContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
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
        "contract",
        "isLastPage",
        "exportContractRootGUID"
    })
    public static class ExportSupplyResourceContractResult {

        /**
         * Договор ресурсоснабжения
         * 
         */
        @XmlElement(name = "Contract", required = true)
        protected List<ExportSupplyResourceContractResultType> contract;
        /**
         * Последняя страница экспорта
         * 
         */
        @XmlElement(name = "IsLastPage")
        protected Boolean isLastPage;
        /**
         * Идентификатор договора ресурсоснабжения для  экспорта следующей 1000 договоров
         * 
         */
        @XmlElement(name = "ExportContractRootGUID")
        protected String exportContractRootGUID;

        /**
         * Договор ресурсоснабжения
         * 
         * Gets the value of the contract property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contract property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContract().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportSupplyResourceContractResultType }
         * </p>
         * 
         * 
         * @return
         *     The value of the contract property.
         */
        public List<ExportSupplyResourceContractResultType> getContract() {
            if (contract == null) {
                contract = new ArrayList<>();
            }
            return this.contract;
        }

        /**
         * Последняя страница экспорта
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsLastPage() {
            return isLastPage;
        }

        /**
         * Sets the value of the isLastPage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsLastPage()
         */
        public void setIsLastPage(Boolean value) {
            this.isLastPage = value;
        }

        /**
         * Идентификатор договора ресурсоснабжения для  экспорта следующей 1000 договоров
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExportContractRootGUID() {
            return exportContractRootGUID;
        }

        /**
         * Sets the value of the exportContractRootGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getExportContractRootGUID()
         */
        public void setExportContractRootGUID(String value) {
            this.exportContractRootGUID = value;
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
     *       <choice>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ErrorMessage"/>
     *         <element name="CommonResult" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType">
     *                 <choice minOccurs="0">
     *                   <element name="ImportHouseUO" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
     *                   <element name="ImportHouseOMS" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
     *                   <element name="ImportHouseESP" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
     *                   <element name="importContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}importContractResultType"/>
     *                   <element name="importCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}importCharterResultType"/>
     *                   <element name="importMeteringDevice">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="MeteringDeviceGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ImportAccount">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ImportSupplyResourceContractObjectAddress">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ImportSupplyResourceContract">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                             <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ImportSupplyResourceContractProject">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </choice>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </choice>
     *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "errorMessage",
        "commonResult"
    })
    public static class ImportResult {

        /**
         * Описание ошибок контролей или бизнес-процесса
         * 
         */
        @XmlElement(name = "ErrorMessage", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected ErrorMessageType errorMessage;
        @XmlElement(name = "CommonResult")
        protected List<GetStateResult.ImportResult.CommonResult> commonResult;
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
         * {@link GetStateResult.ImportResult.CommonResult }
         * </p>
         * 
         * 
         * @return
         *     The value of the commonResult property.
         */
        public List<GetStateResult.ImportResult.CommonResult> getCommonResult() {
            if (commonResult == null) {
                commonResult = new ArrayList<>();
            }
            return this.commonResult;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType">
         *       <choice minOccurs="0">
         *         <element name="ImportHouseUO" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
         *         <element name="ImportHouseOMS" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
         *         <element name="ImportHouseESP" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OGFImportStatusType"/>
         *         <element name="importContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}importContractResultType"/>
         *         <element name="importCharter" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}importCharterResultType"/>
         *         <element name="importMeteringDevice">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="MeteringDeviceGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ImportAccount">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ImportSupplyResourceContractObjectAddress">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ImportSupplyResourceContract">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ImportSupplyResourceContractProject">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *       </choice>
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "importHouseUO",
            "importHouseOMS",
            "importHouseESP",
            "importContract",
            "importCharter",
            "importMeteringDevice",
            "importAccount",
            "importSupplyResourceContractObjectAddress",
            "importSupplyResourceContract",
            "importSupplyResourceContractProject"
        })
        public static class CommonResult
            extends CommonResultType
        {

            /**
             * Расширенный ответ по импорту объекта жилищного фонда для УО
             * 
             */
            @XmlElement(name = "ImportHouseUO")
            protected OGFImportStatusType importHouseUO;
            /**
             * Расширенный ответ по импорту объекта жилищного фонда для ОМС
             * 
             */
            @XmlElement(name = "ImportHouseOMS")
            protected OGFImportStatusType importHouseOMS;
            /**
             * Расширенный ответ по импорту объекта жилищного фонда для ЕСП
             * 
             */
            @XmlElement(name = "ImportHouseESP")
            protected OGFImportStatusType importHouseESP;
            /**
             * Заполняется для операции importContract статусом размещения ДУ в ГИС ЖКХ
             * 
             */
            protected ImportContractResultType importContract;
            /**
             * Заполняется для операции importCharter статусом размещения устава в ГИС ЖКХ
             * 
             */
            protected ImportCharterResultType importCharter;
            /**
             * Заполняется для операции importMeteringDevice
             * 
             */
            protected GetStateResult.ImportResult.CommonResult.ImportMeteringDevice importMeteringDevice;
            /**
             * Заполняется для операции importAccount
             * 
             */
            @XmlElement(name = "ImportAccount")
            protected GetStateResult.ImportResult.CommonResult.ImportAccount importAccount;
            /**
             * Заполняется для операции importSuppleResourceContractObjectAddress
             * 
             */
            @XmlElement(name = "ImportSupplyResourceContractObjectAddress")
            protected GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress importSupplyResourceContractObjectAddress;
            /**
             * Заполняется для операции importSuppleResourceContract
             * 
             */
            @XmlElement(name = "ImportSupplyResourceContract")
            protected GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract importSupplyResourceContract;
            /**
             * Заполняется для операции importSupplyResourceContractProject
             * 
             */
            @XmlElement(name = "ImportSupplyResourceContractProject")
            protected GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject importSupplyResourceContractProject;

            /**
             * Расширенный ответ по импорту объекта жилищного фонда для УО
             * 
             * @return
             *     possible object is
             *     {@link OGFImportStatusType }
             *     
             */
            public OGFImportStatusType getImportHouseUO() {
                return importHouseUO;
            }

            /**
             * Sets the value of the importHouseUO property.
             * 
             * @param value
             *     allowed object is
             *     {@link OGFImportStatusType }
             *     
             * @see #getImportHouseUO()
             */
            public void setImportHouseUO(OGFImportStatusType value) {
                this.importHouseUO = value;
            }

            /**
             * Расширенный ответ по импорту объекта жилищного фонда для ОМС
             * 
             * @return
             *     possible object is
             *     {@link OGFImportStatusType }
             *     
             */
            public OGFImportStatusType getImportHouseOMS() {
                return importHouseOMS;
            }

            /**
             * Sets the value of the importHouseOMS property.
             * 
             * @param value
             *     allowed object is
             *     {@link OGFImportStatusType }
             *     
             * @see #getImportHouseOMS()
             */
            public void setImportHouseOMS(OGFImportStatusType value) {
                this.importHouseOMS = value;
            }

            /**
             * Расширенный ответ по импорту объекта жилищного фонда для ЕСП
             * 
             * @return
             *     possible object is
             *     {@link OGFImportStatusType }
             *     
             */
            public OGFImportStatusType getImportHouseESP() {
                return importHouseESP;
            }

            /**
             * Sets the value of the importHouseESP property.
             * 
             * @param value
             *     allowed object is
             *     {@link OGFImportStatusType }
             *     
             * @see #getImportHouseESP()
             */
            public void setImportHouseESP(OGFImportStatusType value) {
                this.importHouseESP = value;
            }

            /**
             * Заполняется для операции importContract статусом размещения ДУ в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link ImportContractResultType }
             *     
             */
            public ImportContractResultType getImportContract() {
                return importContract;
            }

            /**
             * Sets the value of the importContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportContractResultType }
             *     
             * @see #getImportContract()
             */
            public void setImportContract(ImportContractResultType value) {
                this.importContract = value;
            }

            /**
             * Заполняется для операции importCharter статусом размещения устава в ГИС ЖКХ
             * 
             * @return
             *     possible object is
             *     {@link ImportCharterResultType }
             *     
             */
            public ImportCharterResultType getImportCharter() {
                return importCharter;
            }

            /**
             * Sets the value of the importCharter property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportCharterResultType }
             *     
             * @see #getImportCharter()
             */
            public void setImportCharter(ImportCharterResultType value) {
                this.importCharter = value;
            }

            /**
             * Заполняется для операции importMeteringDevice
             * 
             * @return
             *     possible object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportMeteringDevice }
             *     
             */
            public GetStateResult.ImportResult.CommonResult.ImportMeteringDevice getImportMeteringDevice() {
                return importMeteringDevice;
            }

            /**
             * Sets the value of the importMeteringDevice property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportMeteringDevice }
             *     
             * @see #getImportMeteringDevice()
             */
            public void setImportMeteringDevice(GetStateResult.ImportResult.CommonResult.ImportMeteringDevice value) {
                this.importMeteringDevice = value;
            }

            /**
             * Заполняется для операции importAccount
             * 
             * @return
             *     possible object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportAccount }
             *     
             */
            public GetStateResult.ImportResult.CommonResult.ImportAccount getImportAccount() {
                return importAccount;
            }

            /**
             * Sets the value of the importAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportAccount }
             *     
             * @see #getImportAccount()
             */
            public void setImportAccount(GetStateResult.ImportResult.CommonResult.ImportAccount value) {
                this.importAccount = value;
            }

            /**
             * Заполняется для операции importSuppleResourceContractObjectAddress
             * 
             * @return
             *     possible object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress }
             *     
             */
            public GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress getImportSupplyResourceContractObjectAddress() {
                return importSupplyResourceContractObjectAddress;
            }

            /**
             * Sets the value of the importSupplyResourceContractObjectAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress }
             *     
             * @see #getImportSupplyResourceContractObjectAddress()
             */
            public void setImportSupplyResourceContractObjectAddress(GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractObjectAddress value) {
                this.importSupplyResourceContractObjectAddress = value;
            }

            /**
             * Заполняется для операции importSuppleResourceContract
             * 
             * @return
             *     possible object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract }
             *     
             */
            public GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract getImportSupplyResourceContract() {
                return importSupplyResourceContract;
            }

            /**
             * Sets the value of the importSupplyResourceContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract }
             *     
             * @see #getImportSupplyResourceContract()
             */
            public void setImportSupplyResourceContract(GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContract value) {
                this.importSupplyResourceContract = value;
            }

            /**
             * Заполняется для операции importSupplyResourceContractProject
             * 
             * @return
             *     possible object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject }
             *     
             */
            public GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject getImportSupplyResourceContractProject() {
                return importSupplyResourceContractProject;
            }

            /**
             * Sets the value of the importSupplyResourceContractProject property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject }
             *     
             * @see #getImportSupplyResourceContractProject()
             */
            public void setImportSupplyResourceContractProject(GetStateResult.ImportResult.CommonResult.ImportSupplyResourceContractProject value) {
                this.importSupplyResourceContractProject = value;
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
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID"/>
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
                "unifiedAccountNumber",
                "serviceID"
            })
            public static class ImportAccount {

                /**
                 * Единый лицевой счет
                 * 
                 */
                @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
                protected String unifiedAccountNumber;
                /**
                 * Идентификатор жилищно-коммунальной услуги
                 * 
                 */
                @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
                protected String serviceID;

                /**
                 * Единый лицевой счет
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnifiedAccountNumber() {
                    return unifiedAccountNumber;
                }

                /**
                 * Sets the value of the unifiedAccountNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getUnifiedAccountNumber()
                 */
                public void setUnifiedAccountNumber(String value) {
                    this.unifiedAccountNumber = value;
                }

                /**
                 * Идентификатор жилищно-коммунальной услуги
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceID() {
                    return serviceID;
                }

                /**
                 * Sets the value of the serviceID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getServiceID()
                 */
                public void setServiceID(String value) {
                    this.serviceID = value;
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
             *         <element name="MeteringDeviceGUID" type="{http://dom.gosuslugi.ru/schema/integration/metering-device-base/}MeteringDeviceGUIDType"/>
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
                "meteringDeviceGUID"
            })
            public static class ImportMeteringDevice {

                /**
                 * Идентификатор ПУ
                 * 
                 */
                @XmlElement(name = "MeteringDeviceGUID", required = true)
                protected String meteringDeviceGUID;

                /**
                 * Идентификатор ПУ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMeteringDeviceGUID() {
                    return meteringDeviceGUID;
                }

                /**
                 * Sets the value of the meteringDeviceGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getMeteringDeviceGUID()
                 */
                public void setMeteringDeviceGUID(String value) {
                    this.meteringDeviceGUID = value;
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
             *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
             *         <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "contractGUID",
                "contractRootGUID"
            })
            public static class ImportSupplyResourceContract {

                /**
                 * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractGUID", required = true)
                protected String contractGUID;
                /**
                 * Корневой идентификатор договора ресурсоснабжения (не меняется от версии к версии)
                 * 
                 */
                @XmlElement(name = "ContractRootGUID", required = true)
                protected String contractRootGUID;

                /**
                 * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractGUID() {
                    return contractGUID;
                }

                /**
                 * Sets the value of the contractGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractGUID()
                 */
                public void setContractGUID(String value) {
                    this.contractGUID = value;
                }

                /**
                 * Корневой идентификатор договора ресурсоснабжения (не меняется от версии к версии)
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractRootGUID() {
                    return contractRootGUID;
                }

                /**
                 * Sets the value of the contractRootGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractRootGUID()
                 */
                public void setContractRootGUID(String value) {
                    this.contractRootGUID = value;
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
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
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
                "contractGUID"
            })
            public static class ImportSupplyResourceContractObjectAddress {

                /**
                 * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractGUID", required = true)
                protected String contractGUID;

                /**
                 * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractGUID() {
                    return contractGUID;
                }

                /**
                 * Sets the value of the contractGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractGUID()
                 */
                public void setContractGUID(String value) {
                    this.contractGUID = value;
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
             *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
                "contractGUID"
            })
            public static class ImportSupplyResourceContractProject {

                /**
                 * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 */
                @XmlElement(name = "ContractGUID", required = true)
                protected String contractGUID;

                /**
                 * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContractGUID() {
                    return contractGUID;
                }

                /**
                 * Sets the value of the contractGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getContractGUID()
                 */
                public void setContractGUID(String value) {
                    this.contractGUID = value;
                }

            }

        }

    }

}
