
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Составной тип: Экспорт данных заявления на получение акта по договору
 * 
 * <p>Java class for ActApplicationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActApplicationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplicationOverview">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActApplicationStatusType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *         <element name="ApplicantCategory" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType"/>
 *         <element name="Applicant" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicantType"/>
 *         <element name="ObjectAddressInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ObjectAddressInfoType"/>
 *         <element name="Representative" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}RepresentativeType" minOccurs="0"/>
 *         <element name="AgreementNumber" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String50Type"/>
 *         <element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ActKind" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActKindType"/>
 *         <element name="Documents">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PaymentDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AgreementApplicationVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActApplicationType", propOrder = {
    "applicationOverview",
    "networkType",
    "applicantCategory",
    "applicant",
    "objectAddressInfo",
    "representative",
    "agreementNumber",
    "agreementDate",
    "actKind",
    "documents",
    "agreementApplicationVersionGUID"
})
public class ActApplicationType {

    /**
     * Общие сведения о заявлении
     * 
     */
    @XmlElement(name = "ApplicationOverview", required = true)
    protected ActApplicationType.ApplicationOverview applicationOverview;
    /**
     * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
     * 
     */
    @XmlElement(name = "NetworkType", required = true)
    protected List<NsiRef> networkType;
    /**
     * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
     * 
     */
    @XmlElement(name = "ApplicantCategory", required = true)
    protected EsnsiItemType applicantCategory;
    /**
     * Сведения о заявителе
     * 
     */
    @XmlElement(name = "Applicant", required = true)
    protected ApplicantType applicant;
    /**
     * Информация об адресе подключаемого объекта
     * 
     */
    @XmlElement(name = "ObjectAddressInfo", required = true)
    protected ObjectAddressInfoType objectAddressInfo;
    /**
     * Сведения о представителе заявителя
     * 
     */
    @XmlElement(name = "Representative")
    protected RepresentativeType representative;
    /**
     * Номер договора о подключении
     * 
     */
    @XmlElement(name = "AgreementNumber", required = true)
    protected String agreementNumber;
    /**
     * Дата договора о подключении
     * 
     */
    @XmlElement(name = "AgreementDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    /**
     * Вид запрашиваемого акта
     * 
     */
    @XmlElement(name = "ActKind", required = true)
    @XmlSchemaType(name = "string")
    protected ActKindType actKind;
    /**
     * Документы, приложенные к заявлению
     * 
     */
    @XmlElement(name = "Documents", required = true)
    protected ActApplicationType.Documents documents;
    /**
     * Версионный идентификатор заявления на заключение договора о подключении. Заполняется, если в текущем заявлении указана ссылка на заявление, в рамках которого был заключен договор
     * 
     */
    @XmlElement(name = "AgreementApplicationVersionGUID")
    protected String agreementApplicationVersionGUID;

    /**
     * Общие сведения о заявлении
     * 
     * @return
     *     possible object is
     *     {@link ActApplicationType.ApplicationOverview }
     *     
     */
    public ActApplicationType.ApplicationOverview getApplicationOverview() {
        return applicationOverview;
    }

    /**
     * Sets the value of the applicationOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActApplicationType.ApplicationOverview }
     *     
     * @see #getApplicationOverview()
     */
    public void setApplicationOverview(ActApplicationType.ApplicationOverview value) {
        this.applicationOverview = value;
    }

    /**
     * Вид сети для технологического присоединения. Справочник "Виды сетей для технологического присоединения"
     * 
     * Gets the value of the networkType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNetworkType().add(newItem);
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
     *     The value of the networkType property.
     */
    public List<NsiRef> getNetworkType() {
        if (networkType == null) {
            networkType = new ArrayList<>();
        }
        return this.networkType;
    }

    /**
     * Категория заявителя. Справочник "Лица, которым доступна возможность отправки заявления по подключению объектов капитального строительства к централизованным системам" ЕСНСИ
     * 
     * @return
     *     possible object is
     *     {@link EsnsiItemType }
     *     
     */
    public EsnsiItemType getApplicantCategory() {
        return applicantCategory;
    }

    /**
     * Sets the value of the applicantCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsnsiItemType }
     *     
     * @see #getApplicantCategory()
     */
    public void setApplicantCategory(EsnsiItemType value) {
        this.applicantCategory = value;
    }

    /**
     * Сведения о заявителе
     * 
     * @return
     *     possible object is
     *     {@link ApplicantType }
     *     
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantType }
     *     
     * @see #getApplicant()
     */
    public void setApplicant(ApplicantType value) {
        this.applicant = value;
    }

    /**
     * Информация об адресе подключаемого объекта
     * 
     * @return
     *     possible object is
     *     {@link ObjectAddressInfoType }
     *     
     */
    public ObjectAddressInfoType getObjectAddressInfo() {
        return objectAddressInfo;
    }

    /**
     * Sets the value of the objectAddressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAddressInfoType }
     *     
     * @see #getObjectAddressInfo()
     */
    public void setObjectAddressInfo(ObjectAddressInfoType value) {
        this.objectAddressInfo = value;
    }

    /**
     * Сведения о представителе заявителя
     * 
     * @return
     *     possible object is
     *     {@link RepresentativeType }
     *     
     */
    public RepresentativeType getRepresentative() {
        return representative;
    }

    /**
     * Sets the value of the representative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentativeType }
     *     
     * @see #getRepresentative()
     */
    public void setRepresentative(RepresentativeType value) {
        this.representative = value;
    }

    /**
     * Номер договора о подключении
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgreementNumber()
     */
    public void setAgreementNumber(String value) {
        this.agreementNumber = value;
    }

    /**
     * Дата договора о подключении
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAgreementDate()
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

    /**
     * Вид запрашиваемого акта
     * 
     * @return
     *     possible object is
     *     {@link ActKindType }
     *     
     */
    public ActKindType getActKind() {
        return actKind;
    }

    /**
     * Sets the value of the actKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActKindType }
     *     
     * @see #getActKind()
     */
    public void setActKind(ActKindType value) {
        this.actKind = value;
    }

    /**
     * Документы, приложенные к заявлению
     * 
     * @return
     *     possible object is
     *     {@link ActApplicationType.Documents }
     *     
     */
    public ActApplicationType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActApplicationType.Documents }
     *     
     * @see #getDocuments()
     */
    public void setDocuments(ActApplicationType.Documents value) {
        this.documents = value;
    }

    /**
     * Версионный идентификатор заявления на заключение договора о подключении. Заполняется, если в текущем заявлении указана ссылка на заявление, в рамках которого был заключен договор
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementApplicationVersionGUID() {
        return agreementApplicationVersionGUID;
    }

    /**
     * Sets the value of the agreementApplicationVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAgreementApplicationVersionGUID()
     */
    public void setAgreementApplicationVersionGUID(String value) {
        this.agreementApplicationVersionGUID = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ApplicationOverviewType">
     *       <sequence>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}ActApplicationStatusType"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status"
    })
    public static class ApplicationOverview
        extends ApplicationOverviewType
    {

        /**
         * Статус заявления
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "string")
        protected ActApplicationStatusType status;

        /**
         * Статус заявления
         * 
         * @return
         *     possible object is
         *     {@link ActApplicationStatusType }
         *     
         */
        public ActApplicationStatusType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActApplicationStatusType }
         *     
         * @see #getStatus()
         */
        public void setStatus(ActApplicationStatusType value) {
            this.status = value;
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
     *         <element name="PaymentDocument" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}AttachedDocumentType" minOccurs="0"/>
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
        "paymentDocument"
    })
    public static class Documents {

        /**
         * Документы о полной оплате услуг по договору
         * 
         */
        @XmlElement(name = "PaymentDocument")
        protected AttachedDocumentType paymentDocument;

        /**
         * Документы о полной оплате услуг по договору
         * 
         * @return
         *     possible object is
         *     {@link AttachedDocumentType }
         *     
         */
        public AttachedDocumentType getPaymentDocument() {
            return paymentDocument;
        }

        /**
         * Sets the value of the paymentDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachedDocumentType }
         *     
         * @see #getPaymentDocument()
         */
        public void setPaymentDocument(AttachedDocumentType value) {
            this.paymentDocument = value;
        }

    }

}
