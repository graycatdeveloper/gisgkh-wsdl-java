
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.Period;
import ru.gosuslugi.dom.schema.integration.base.PeriodOpen;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="requestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
 *         <element name="requestNumber" type="{http://dom.gosuslugi.ru/schema/integration/drs/}RequestNumberType" maxOccurs="100"/>
 *         <sequence>
 *           <element name="requestCreationPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period"/>
 *           <element name="periodOfSendingRequest" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *           <element name="periodOfResponseDate" type="{http://dom.gosuslugi.ru/schema/integration/base/}PeriodOpen" minOccurs="0"/>
 *           <element name="applicantInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ApplicantInfoRequestType" minOccurs="0"/>
 *           <choice minOccurs="0">
 *             <element name="exportHMObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExportHMObjectInfoType" maxOccurs="100" minOccurs="0"/>
 *             <element name="houseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100" minOccurs="0"/>
 *           </choice>
 *           <element name="requestStatus" type="{http://dom.gosuslugi.ru/schema/integration/drs/}AllRequestStatusesType" maxOccurs="4" minOccurs="0"/>
 *           <element name="requestResult" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="exportRequestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
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
    "requestGUID",
    "requestNumber",
    "requestCreationPeriod",
    "periodOfSendingRequest",
    "periodOfResponseDate",
    "applicantInfo",
    "exportHMObjectGUID",
    "houseGUID",
    "requestStatus",
    "requestResult",
    "exportRequestGUID"
})
@XmlRootElement(name = "exportDRsRequest")
public class ExportDRsRequest
    extends BaseType
{

    /**
     * Идентификатор запроса о наличии задолженности за ЖКУ
     * 
     */
    protected List<String> requestGUID;
    /**
     * Номер запроса, присвоенный ГИС ЖКХ
     * 
     */
    protected List<String> requestNumber;
    /**
     * Период создания запроса в ГИС ЖКХ.
     * 
     * 										Указываемый период не должен превышать 6-ти месяцев
     * 
     */
    protected Period requestCreationPeriod;
    /**
     * Период направления запроса поставщикам ЖКУ.
     * 
     * 										Указываемый период не должен превышать 6-ти месяцев
     * 
     */
    protected Period periodOfSendingRequest;
    /**
     * Период крайнего срока ответа на запрос
     * 
     */
    protected PeriodOpen periodOfResponseDate;
    /**
     * Информация о заявителе
     * 
     */
    protected ApplicantInfoRequestType applicantInfo;
    /**
     * Идентификатор дома/помещения/комнаты в Реестре адресных объектов ГИС ЖКХ и Тип ОЖФ.
     * Указывается для версии 14.0.0.0
     * 
     */
    protected List<ExportHMObjectInfoType> exportHMObjectGUID;
    /**
     * Идентификатор дома в Реестре адресных объектов ГИС ЖКХ, по которому осуществляется запрос.
     * Указывается для версии 13.1.10.1
     * 
     */
    protected List<String> houseGUID;
    /**
     * Статус запроса в ГИС ЖКХ.
     * 
     * 										Допустимые значения:
     * 										Draft - Проект;
     * 										Processing - В обработке;
     * 										Sent - Направлен поставщикам ЖКУ;
     * 										Processed - Получен ответ;
     * 										Revoked - Отозван
     * 
     */
    @XmlSchemaType(name = "string")
    protected List<AllRequestStatusesType> requestStatus;
    /**
     * Результат выполнения запроса о наличии задолженности за ЖКУ (НСИ #357)
     * 
     */
    protected List<NsiRef> requestResult;
    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * 										Если в элементе exportDRsRequest указаны условия отбора по атрибутам запроса, то экспорт запросов осуществляется блоками по 100 запросов в каждом блоке (последний блок может содержать меньшее число запросов).
     * 
     * 										Для экспорта первого блока данных элемент не указывается. Для экспорта каждого следующего блока данных в элементе должно указываться значение элемента getStateResult/ exportDRsResult/ pagedOutput/ nextRequestGUID, полученное при экспорте предыдущего блока данных
     * 
     */
    protected String exportRequestGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор запроса о наличии задолженности за ЖКУ
     * 
     * Gets the value of the requestGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequestGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the requestGUID property.
     */
    public List<String> getRequestGUID() {
        if (requestGUID == null) {
            requestGUID = new ArrayList<>();
        }
        return this.requestGUID;
    }

    /**
     * Номер запроса, присвоенный ГИС ЖКХ
     * 
     * Gets the value of the requestNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequestNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the requestNumber property.
     */
    public List<String> getRequestNumber() {
        if (requestNumber == null) {
            requestNumber = new ArrayList<>();
        }
        return this.requestNumber;
    }

    /**
     * Период создания запроса в ГИС ЖКХ.
     * 
     * 										Указываемый период не должен превышать 6-ти месяцев
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getRequestCreationPeriod() {
        return requestCreationPeriod;
    }

    /**
     * Sets the value of the requestCreationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getRequestCreationPeriod()
     */
    public void setRequestCreationPeriod(Period value) {
        this.requestCreationPeriod = value;
    }

    /**
     * Период направления запроса поставщикам ЖКУ.
     * 
     * 										Указываемый период не должен превышать 6-ти месяцев
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriodOfSendingRequest() {
        return periodOfSendingRequest;
    }

    /**
     * Sets the value of the periodOfSendingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getPeriodOfSendingRequest()
     */
    public void setPeriodOfSendingRequest(Period value) {
        this.periodOfSendingRequest = value;
    }

    /**
     * Период крайнего срока ответа на запрос
     * 
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *     
     */
    public PeriodOpen getPeriodOfResponseDate() {
        return periodOfResponseDate;
    }

    /**
     * Sets the value of the periodOfResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *     
     * @see #getPeriodOfResponseDate()
     */
    public void setPeriodOfResponseDate(PeriodOpen value) {
        this.periodOfResponseDate = value;
    }

    /**
     * Информация о заявителе
     * 
     * @return
     *     possible object is
     *     {@link ApplicantInfoRequestType }
     *     
     */
    public ApplicantInfoRequestType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantInfoRequestType }
     *     
     * @see #getApplicantInfo()
     */
    public void setApplicantInfo(ApplicantInfoRequestType value) {
        this.applicantInfo = value;
    }

    /**
     * Идентификатор дома/помещения/комнаты в Реестре адресных объектов ГИС ЖКХ и Тип ОЖФ.
     * Указывается для версии 14.0.0.0
     * 
     * Gets the value of the exportHMObjectGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportHMObjectGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExportHMObjectGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportHMObjectInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the exportHMObjectGUID property.
     */
    public List<ExportHMObjectInfoType> getExportHMObjectGUID() {
        if (exportHMObjectGUID == null) {
            exportHMObjectGUID = new ArrayList<>();
        }
        return this.exportHMObjectGUID;
    }

    /**
     * Идентификатор дома в Реестре адресных объектов ГИС ЖКХ, по которому осуществляется запрос.
     * Указывается для версии 13.1.10.1
     * 
     * Gets the value of the houseGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houseGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getHouseGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the houseGUID property.
     */
    public List<String> getHouseGUID() {
        if (houseGUID == null) {
            houseGUID = new ArrayList<>();
        }
        return this.houseGUID;
    }

    /**
     * Статус запроса в ГИС ЖКХ.
     * 
     * 										Допустимые значения:
     * 										Draft - Проект;
     * 										Processing - В обработке;
     * 										Sent - Направлен поставщикам ЖКУ;
     * 										Processed - Получен ответ;
     * 										Revoked - Отозван
     * 
     * Gets the value of the requestStatus property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestStatus property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequestStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllRequestStatusesType }
     * </p>
     * 
     * 
     * @return
     *     The value of the requestStatus property.
     */
    public List<AllRequestStatusesType> getRequestStatus() {
        if (requestStatus == null) {
            requestStatus = new ArrayList<>();
        }
        return this.requestStatus;
    }

    /**
     * Результат выполнения запроса о наличии задолженности за ЖКУ (НСИ #357)
     * 
     * Gets the value of the requestResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequestResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the requestResult property.
     */
    public List<NsiRef> getRequestResult() {
        if (requestResult == null) {
            requestResult = new ArrayList<>();
        }
        return this.requestResult;
    }

    /**
     * Идентификатор, используемый для экспорта 2-го и последующих блоков данных.
     * 
     * 										Если в элементе exportDRsRequest указаны условия отбора по атрибутам запроса, то экспорт запросов осуществляется блоками по 100 запросов в каждом блоке (последний блок может содержать меньшее число запросов).
     * 
     * 										Для экспорта первого блока данных элемент не указывается. Для экспорта каждого следующего блока данных в элементе должно указываться значение элемента getStateResult/ exportDRsResult/ pagedOutput/ nextRequestGUID, полученное при экспорте предыдущего блока данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportRequestGUID() {
        return exportRequestGUID;
    }

    /**
     * Sets the value of the exportRequestGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportRequestGUID()
     */
    public void setExportRequestGUID(String value) {
        this.exportRequestGUID = value;
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
