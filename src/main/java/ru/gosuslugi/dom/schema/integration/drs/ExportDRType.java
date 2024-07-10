
package ru.gosuslugi.dom.schema.integration.drs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.Period;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Данные запроса о наличии задолженности за ЖКУ для экспорта из ГИС ЖКХ
 * 
 * <p>Java class for ExportDRType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDRType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="requestGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="requestNumber" type="{http://dom.gosuslugi.ru/schema/integration/drs/}RequestNumberType"/>
 *         <element name="applicantInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ApplicantInfoType"/>
 *         <element name="housingFundObject" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExportHousingFundObjectInfoType"/>
 *         <element name="period" type="{http://dom.gosuslugi.ru/schema/integration/base/}Period" minOccurs="0"/>
 *         <element name="organization" type="{http://dom.gosuslugi.ru/schema/integration/drs/}OrganizationInfoType"/>
 *         <element name="executorInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExecutorInfoType"/>
 *         <element name="status" type="{http://dom.gosuslugi.ru/schema/integration/drs/}AllRequestStatusesType"/>
 *         <element name="result" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="sentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="responseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="subrequest" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="organization" type="{http://dom.gosuslugi.ru/schema/integration/drs/}OrganizationInfoType"/>
 *                   <element name="response" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="type" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ResponseType"/>
 *                             <element name="hasDebt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             <element name="debtInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExportDebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                             <element name="additionalFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                             <element name="description" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <maxLength value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="executorInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExecutorInfoType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDRType", propOrder = {
    "requestGUID",
    "requestNumber",
    "applicantInfo",
    "housingFundObject",
    "period",
    "organization",
    "executorInfo",
    "status",
    "result",
    "creationDate",
    "sentDate",
    "responseDate",
    "subrequest"
})
public class ExportDRType {

    /**
     * Идентификатор запроса, присвоенный в ГИС ЖКХ
     * 
     */
    @XmlElement(required = true)
    protected String requestGUID;
    /**
     * Номер запроса, присвоенный в ГИС ЖКХ
     * 
     */
    @XmlElement(required = true)
    protected String requestNumber;
    /**
     * Информация о заявителе
     * 
     */
    @XmlElement(required = true)
    protected ApplicantInfoType applicantInfo;
    /**
     * Сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
     * 
     */
    @XmlElement(required = true)
    protected ExportHousingFundObjectInfoType housingFundObject;
    /**
     * Период, за который запрашивается задолженность
     * 
     */
    protected Period period;
    /**
     * Организация,
     * 						сформировавшая запрос
     * 
     */
    @XmlElement(required = true)
    protected OrganizationInfoType organization;
    /**
     * Информация о сотруднике, сформировавшем запрос
     * 
     */
    @XmlElement(required = true)
    protected ExecutorInfoType executorInfo;
    /**
     * Статус запроса в ГИС ЖКХ.
     * 
     * 						Допустимые значения:
     * 						Draft - Проект;
     * 						Processing - В обработке;
     * 						Sent - Направлен поставщикам ЖКУ;
     * 						Processed - Получен ответ;
     * 						Revoked - Отозван
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AllRequestStatusesType status;
    /**
     * Результат выполнения запроса.
     * 
     * 						Допускаются любые значения из справочника ГИС ЖКХ "Результат запроса о наличии или отсутствии
     * 						задолженности за ЖКУ" (НСИ #345). Aктуальными
     * 						являются следующие значения:
     * 						1 - Запрос не отправлен
     * 						2 - Запрос ожидает ответа
     * 						3 - Имеется информация о задолженности
     * 						4 - Задолженности нет
     * 						5 - Отсутствует размещенная информация в ГИС ЖКХ
     * 						6 - Информация о задолженности отсутствует
     * 						7 - Информация о задолженности не подтверждена поставщиком
     * 
     */
    @XmlElement(required = true)
    protected NsiRef result;
    /**
     * Дата создания запроса
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar creationDate;
    /**
     * Дата направления запроса поставщикам ЖКУ
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sentDate;
    /**
     * Крайний срок ответа на запрос
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseDate;
    /**
     * Запросы организациям, предоставляющим ЖКУ
     * 
     */
    protected List<ExportDRType.Subrequest> subrequest;

    /**
     * Идентификатор запроса, присвоенный в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestGUID() {
        return requestGUID;
    }

    /**
     * Sets the value of the requestGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestGUID()
     */
    public void setRequestGUID(String value) {
        this.requestGUID = value;
    }

    /**
     * Номер запроса, присвоенный в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestNumber() {
        return requestNumber;
    }

    /**
     * Sets the value of the requestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRequestNumber()
     */
    public void setRequestNumber(String value) {
        this.requestNumber = value;
    }

    /**
     * Информация о заявителе
     * 
     * @return
     *     possible object is
     *     {@link ApplicantInfoType }
     *     
     */
    public ApplicantInfoType getApplicantInfo() {
        return applicantInfo;
    }

    /**
     * Sets the value of the applicantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantInfoType }
     *     
     * @see #getApplicantInfo()
     */
    public void setApplicantInfo(ApplicantInfoType value) {
        this.applicantInfo = value;
    }

    /**
     * Сведения об объекте жилищного фонда (ОЖФ), по которому осуществляется запрос
     * 
     * @return
     *     possible object is
     *     {@link ExportHousingFundObjectInfoType }
     *     
     */
    public ExportHousingFundObjectInfoType getHousingFundObject() {
        return housingFundObject;
    }

    /**
     * Sets the value of the housingFundObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportHousingFundObjectInfoType }
     *     
     * @see #getHousingFundObject()
     */
    public void setHousingFundObject(ExportHousingFundObjectInfoType value) {
        this.housingFundObject = value;
    }

    /**
     * Период, за который запрашивается задолженность
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     * @see #getPeriod()
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Организация,
     * 						сформировавшая запрос
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInfoType }
     *     
     */
    public OrganizationInfoType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInfoType }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(OrganizationInfoType value) {
        this.organization = value;
    }

    /**
     * Информация о сотруднике, сформировавшем запрос
     * 
     * @return
     *     possible object is
     *     {@link ExecutorInfoType }
     *     
     */
    public ExecutorInfoType getExecutorInfo() {
        return executorInfo;
    }

    /**
     * Sets the value of the executorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutorInfoType }
     *     
     * @see #getExecutorInfo()
     */
    public void setExecutorInfo(ExecutorInfoType value) {
        this.executorInfo = value;
    }

    /**
     * Статус запроса в ГИС ЖКХ.
     * 
     * 						Допустимые значения:
     * 						Draft - Проект;
     * 						Processing - В обработке;
     * 						Sent - Направлен поставщикам ЖКУ;
     * 						Processed - Получен ответ;
     * 						Revoked - Отозван
     * 
     * @return
     *     possible object is
     *     {@link AllRequestStatusesType }
     *     
     */
    public AllRequestStatusesType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllRequestStatusesType }
     *     
     * @see #getStatus()
     */
    public void setStatus(AllRequestStatusesType value) {
        this.status = value;
    }

    /**
     * Результат выполнения запроса.
     * 
     * 						Допускаются любые значения из справочника ГИС ЖКХ "Результат запроса о наличии или отсутствии
     * 						задолженности за ЖКУ" (НСИ #345). Aктуальными
     * 						являются следующие значения:
     * 						1 - Запрос не отправлен
     * 						2 - Запрос ожидает ответа
     * 						3 - Имеется информация о задолженности
     * 						4 - Задолженности нет
     * 						5 - Отсутствует размещенная информация в ГИС ЖКХ
     * 						6 - Информация о задолженности отсутствует
     * 						7 - Информация о задолженности не подтверждена поставщиком
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getResult()
     */
    public void setResult(NsiRef value) {
        this.result = value;
    }

    /**
     * Дата создания запроса
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreationDate()
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Дата направления запроса поставщикам ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSentDate() {
        return sentDate;
    }

    /**
     * Sets the value of the sentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getSentDate()
     */
    public void setSentDate(XMLGregorianCalendar value) {
        this.sentDate = value;
    }

    /**
     * Крайний срок ответа на запрос
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getResponseDate()
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Запросы организациям, предоставляющим ЖКУ
     * 
     * Gets the value of the subrequest property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subrequest property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSubrequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDRType.Subrequest }
     * </p>
     * 
     * 
     * @return
     *     The value of the subrequest property.
     */
    public List<ExportDRType.Subrequest> getSubrequest() {
        if (subrequest == null) {
            subrequest = new ArrayList<>();
        }
        return this.subrequest;
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
     *         <element name="organization" type="{http://dom.gosuslugi.ru/schema/integration/drs/}OrganizationInfoType"/>
     *         <element name="response" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="type" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ResponseType"/>
     *                   <element name="hasDebt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   <element name="debtInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExportDebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="additionalFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   <element name="description" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="executorInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExecutorInfoType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "organization",
        "response"
    })
    public static class Subrequest {

        /**
         * Организация,
         * 									предоставляющая ЖКУ
         * 
         */
        @XmlElement(required = true)
        protected OrganizationInfoType organization;
        /**
         * Ответ организации
         * 
         */
        protected ExportDRType.Subrequest.Response response;

        /**
         * Организация,
         * 									предоставляющая ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link OrganizationInfoType }
         *     
         */
        public OrganizationInfoType getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationInfoType }
         *     
         * @see #getOrganization()
         */
        public void setOrganization(OrganizationInfoType value) {
            this.organization = value;
        }

        /**
         * Ответ организации
         * 
         * @return
         *     possible object is
         *     {@link ExportDRType.Subrequest.Response }
         *     
         */
        public ExportDRType.Subrequest.Response getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDRType.Subrequest.Response }
         *     
         * @see #getResponse()
         */
        public void setResponse(ExportDRType.Subrequest.Response value) {
            this.response = value;
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
         *         <element name="type" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ResponseType"/>
         *         <element name="hasDebt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         <element name="debtInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExportDebtInfoType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="additionalFile" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
         *         <element name="description" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="executorInfo" type="{http://dom.gosuslugi.ru/schema/integration/drs/}ExecutorInfoType" minOccurs="0"/>
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
            "type",
            "hasDebt",
            "debtInfo",
            "additionalFile",
            "description",
            "executorInfo"
        })
        public static class Response {

            /**
             * Способ формирования ответа.
             * 
             * 												Допустимые значения:
             * 												Provided - Предоставлен организацией
             * 												AutoGenerated - Сформирован автоматически
             * 
             */
            @XmlElement(required = true)
            @XmlSchemaType(name = "string")
            protected ResponseType type;
            /**
             * Признак наличия задолженности, подтвержденной судебным актом
             * 
             */
            protected Boolean hasDebt;
            /**
             * Информация о непогашенной задолженности, подтвержденной судебным актом
             * 
             */
            protected List<ExportDebtInfoType> debtInfo;
            /**
             * Дополнительный файл
             * 
             */
            protected List<AttachmentType> additionalFile;
            /**
             * Дополнительная информация
             * 
             */
            protected String description;
            /**
             * Информация о сотруднике, сформировавшем ответ
             * 
             */
            protected ExecutorInfoType executorInfo;

            /**
             * Способ формирования ответа.
             * 
             * 												Допустимые значения:
             * 												Provided - Предоставлен организацией
             * 												AutoGenerated - Сформирован автоматически
             * 
             * @return
             *     possible object is
             *     {@link ResponseType }
             *     
             */
            public ResponseType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponseType }
             *     
             * @see #getType()
             */
            public void setType(ResponseType value) {
                this.type = value;
            }

            /**
             * Признак наличия задолженности, подтвержденной судебным актом
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHasDebt() {
                return hasDebt;
            }

            /**
             * Sets the value of the hasDebt property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isHasDebt()
             */
            public void setHasDebt(Boolean value) {
                this.hasDebt = value;
            }

            /**
             * Информация о непогашенной задолженности, подтвержденной судебным актом
             * 
             * Gets the value of the debtInfo property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the debtInfo property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getDebtInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportDebtInfoType }
             * </p>
             * 
             * 
             * @return
             *     The value of the debtInfo property.
             */
            public List<ExportDebtInfoType> getDebtInfo() {
                if (debtInfo == null) {
                    debtInfo = new ArrayList<>();
                }
                return this.debtInfo;
            }

            /**
             * Дополнительный файл
             * 
             * Gets the value of the additionalFile property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the additionalFile property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAdditionalFile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the additionalFile property.
             */
            public List<AttachmentType> getAdditionalFile() {
                if (additionalFile == null) {
                    additionalFile = new ArrayList<>();
                }
                return this.additionalFile;
            }

            /**
             * Дополнительная информация
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDescription()
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Информация о сотруднике, сформировавшем ответ
             * 
             * @return
             *     possible object is
             *     {@link ExecutorInfoType }
             *     
             */
            public ExecutorInfoType getExecutorInfo() {
                return executorInfo;
            }

            /**
             * Sets the value of the executorInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExecutorInfoType }
             *     
             * @see #getExecutorInfo()
             */
            public void setExecutorInfo(ExecutorInfoType value) {
                this.executorInfo = value;
            }

        }

    }

}
