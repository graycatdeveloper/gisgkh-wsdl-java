
package ru.gosuslugi.dom.schema.integration.msp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.base.RegionType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Экспортируемые сведения об отдельной категории граждан
 * 
 * <p>Java class for ExportCategoryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCategoryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CategoryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Territory">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
 *                   <element name="Municipality" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="NsiCategory" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="BudgetLevel">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Federal"/>
 *               <enumeration value="Regional"/>
 *               <enumeration value="Municipal"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="PayoutTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProvisionDocuments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="DenialReasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SuspensionReasons" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="TerminationReasons" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="ResumptionReasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RecalculationReasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RefundReasons" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ActType" maxOccurs="1000"/>
 *         <choice>
 *           <sequence>
 *             <element name="FixedCompensationSum" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}MoneyPositiveType"/>
 *             <element name="FixedSumEstablishmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           </sequence>
 *           <sequence>
 *             <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           </sequence>
 *           <element name="Actual" maxOccurs="unbounded">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="Service" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ServiceType"/>
 *                     <element name="Housing" maxOccurs="3">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <enumeration value="PrivateHousing"/>
 *                           <enumeration value="MunicipalHousing"/>
 *                           <enumeration value="StateHousing"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="Privatized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                     <element name="NsiDiscountAmountLimitationCode" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                     <element name="AppliesToAllFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="DiscountSize">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           <minInclusive value="0"/>
 *                           <maxInclusive value="100"/>
 *                           <fractionDigits value="2"/>
 *                           <totalDigits value="5"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
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
@XmlType(name = "ExportCategoryType", propOrder = {
    "categoryGuid",
    "fromDate",
    "toDate",
    "territory",
    "categoryName",
    "nsiCategory",
    "budgetLevel",
    "payoutTerm",
    "provisionDocuments",
    "denialReasons",
    "suspensionReasons",
    "terminationReasons",
    "resumptionReasons",
    "recalculationReasons",
    "refundReasons",
    "act",
    "fixedCompensationSum",
    "fixedSumEstablishmentDate",
    "comment",
    "description",
    "actual"
})
public class ExportCategoryType {

    /**
     * Идентификатор отдельной категории граждан
     * 
     */
    @XmlElement(name = "CategoryGuid", required = true)
    protected String categoryGuid;
    /**
     * Дата начала предоставления компенсаций расходов
     * 
     */
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    /**
     * Дата окончания предоставления компенсаций расходов
     * 
     */
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    /**
     * Территория предоставления компенсации расходов
     * 
     */
    @XmlElement(name = "Territory", required = true)
    protected ExportCategoryType.Territory territory;
    /**
     * Наименование отдельной категории граждан
     * 
     */
    @XmlElement(name = "CategoryName", required = true)
    protected String categoryName;
    /**
     * Ссылка на справочник НСИ 154 "Отдельные категории граждан, имеющие право на получение компенсаций расходов"
     * 
     */
    @XmlElement(name = "NsiCategory")
    protected NsiRef nsiCategory;
    /**
     * Бюджет, за счет которого осуществляются выплаты. Возможные значения: Federal - Федеральный, Regional -  Региональный, Municipal - Муниципальный
     * 
     */
    @XmlElement(name = "BudgetLevel", required = true)
    protected String budgetLevel;
    /**
     * Срок перечисления компенсации
     * 
     */
    @XmlElement(name = "PayoutTerm")
    protected String payoutTerm;
    /**
     * Перечень документов, необходимых для получения компенсации
     * 
     */
    @XmlElement(name = "ProvisionDocuments", required = true)
    protected String provisionDocuments;
    /**
     * Основания для отказа в предоставлении компенсации
     * 
     */
    @XmlElement(name = "DenialReasons")
    protected String denialReasons;
    /**
     * Основания для приостановления предоставления компенсации
     * 
     */
    @XmlElement(name = "SuspensionReasons", required = true)
    protected String suspensionReasons;
    /**
     * Основания для прекращения предоставления компенсации
     * 
     */
    @XmlElement(name = "TerminationReasons", required = true)
    protected String terminationReasons;
    /**
     * Основания для возобновления предоставления компенсации
     * 
     */
    @XmlElement(name = "ResumptionReasons")
    protected String resumptionReasons;
    /**
     * Основания для перерасчета компенсации
     * 
     */
    @XmlElement(name = "RecalculationReasons")
    protected String recalculationReasons;
    /**
     * Основания возврата излишне полученной суммы компенсации
     * 
     */
    @XmlElement(name = "RefundReasons")
    protected String refundReasons;
    /**
     * Нормативные правовые акты
     * 
     */
    @XmlElement(name = "Act", required = true)
    protected List<ActType> act;
    /**
     * Фиксированный размер денежной выплаты, руб.
     * 
     */
    @XmlElement(name = "FixedCompensationSum")
    protected BigDecimal fixedCompensationSum;
    /**
     * Дата установления фиксированного размера
     * 
     */
    @XmlElement(name = "FixedSumEstablishmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fixedSumEstablishmentDate;
    /**
     * Примечание
     * 
     */
    @XmlElement(name = "Comment")
    protected String comment;
    /**
     * Описание порядка расчета
     * 
     */
    @XmlElement(name = "Description")
    protected String description;
    /**
     * От фактических расходов на оплату жилищно-коммунальных услуг
     * 
     */
    @XmlElement(name = "Actual")
    protected List<ExportCategoryType.Actual> actual;

    /**
     * Идентификатор отдельной категории граждан
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryGuid() {
        return categoryGuid;
    }

    /**
     * Sets the value of the categoryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategoryGuid()
     */
    public void setCategoryGuid(String value) {
        this.categoryGuid = value;
    }

    /**
     * Дата начала предоставления компенсаций расходов
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFromDate()
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Дата окончания предоставления компенсаций расходов
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getToDate()
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Территория предоставления компенсации расходов
     * 
     * @return
     *     possible object is
     *     {@link ExportCategoryType.Territory }
     *     
     */
    public ExportCategoryType.Territory getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCategoryType.Territory }
     *     
     * @see #getTerritory()
     */
    public void setTerritory(ExportCategoryType.Territory value) {
        this.territory = value;
    }

    /**
     * Наименование отдельной категории граждан
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategoryName()
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Ссылка на справочник НСИ 154 "Отдельные категории граждан, имеющие право на получение компенсаций расходов"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getNsiCategory() {
        return nsiCategory;
    }

    /**
     * Sets the value of the nsiCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getNsiCategory()
     */
    public void setNsiCategory(NsiRef value) {
        this.nsiCategory = value;
    }

    /**
     * Бюджет, за счет которого осуществляются выплаты. Возможные значения: Federal - Федеральный, Regional -  Региональный, Municipal - Муниципальный
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBudgetLevel() {
        return budgetLevel;
    }

    /**
     * Sets the value of the budgetLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBudgetLevel()
     */
    public void setBudgetLevel(String value) {
        this.budgetLevel = value;
    }

    /**
     * Срок перечисления компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayoutTerm() {
        return payoutTerm;
    }

    /**
     * Sets the value of the payoutTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPayoutTerm()
     */
    public void setPayoutTerm(String value) {
        this.payoutTerm = value;
    }

    /**
     * Перечень документов, необходимых для получения компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionDocuments() {
        return provisionDocuments;
    }

    /**
     * Sets the value of the provisionDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProvisionDocuments()
     */
    public void setProvisionDocuments(String value) {
        this.provisionDocuments = value;
    }

    /**
     * Основания для отказа в предоставлении компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenialReasons() {
        return denialReasons;
    }

    /**
     * Sets the value of the denialReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDenialReasons()
     */
    public void setDenialReasons(String value) {
        this.denialReasons = value;
    }

    /**
     * Основания для приостановления предоставления компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspensionReasons() {
        return suspensionReasons;
    }

    /**
     * Sets the value of the suspensionReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSuspensionReasons()
     */
    public void setSuspensionReasons(String value) {
        this.suspensionReasons = value;
    }

    /**
     * Основания для прекращения предоставления компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminationReasons() {
        return terminationReasons;
    }

    /**
     * Sets the value of the terminationReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTerminationReasons()
     */
    public void setTerminationReasons(String value) {
        this.terminationReasons = value;
    }

    /**
     * Основания для возобновления предоставления компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumptionReasons() {
        return resumptionReasons;
    }

    /**
     * Sets the value of the resumptionReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getResumptionReasons()
     */
    public void setResumptionReasons(String value) {
        this.resumptionReasons = value;
    }

    /**
     * Основания для перерасчета компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecalculationReasons() {
        return recalculationReasons;
    }

    /**
     * Sets the value of the recalculationReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRecalculationReasons()
     */
    public void setRecalculationReasons(String value) {
        this.recalculationReasons = value;
    }

    /**
     * Основания возврата излишне полученной суммы компенсации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundReasons() {
        return refundReasons;
    }

    /**
     * Sets the value of the refundReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefundReasons()
     */
    public void setRefundReasons(String value) {
        this.refundReasons = value;
    }

    /**
     * Нормативные правовые акты
     * 
     * Gets the value of the act property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the act property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActType }
     * </p>
     * 
     * 
     * @return
     *     The value of the act property.
     */
    public List<ActType> getAct() {
        if (act == null) {
            act = new ArrayList<>();
        }
        return this.act;
    }

    /**
     * Фиксированный размер денежной выплаты, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedCompensationSum() {
        return fixedCompensationSum;
    }

    /**
     * Sets the value of the fixedCompensationSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getFixedCompensationSum()
     */
    public void setFixedCompensationSum(BigDecimal value) {
        this.fixedCompensationSum = value;
    }

    /**
     * Дата установления фиксированного размера
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFixedSumEstablishmentDate() {
        return fixedSumEstablishmentDate;
    }

    /**
     * Sets the value of the fixedSumEstablishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFixedSumEstablishmentDate()
     */
    public void setFixedSumEstablishmentDate(XMLGregorianCalendar value) {
        this.fixedSumEstablishmentDate = value;
    }

    /**
     * Примечание
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComment()
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Описание порядка расчета
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
     * От фактических расходов на оплату жилищно-коммунальных услуг
     * 
     * Gets the value of the actual property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actual property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getActual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCategoryType.Actual }
     * </p>
     * 
     * 
     * @return
     *     The value of the actual property.
     */
    public List<ExportCategoryType.Actual> getActual() {
        if (actual == null) {
            actual = new ArrayList<>();
        }
        return this.actual;
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
     *         <element name="Service" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ServiceType"/>
     *         <element name="Housing" maxOccurs="3">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="PrivateHousing"/>
     *               <enumeration value="MunicipalHousing"/>
     *               <enumeration value="StateHousing"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Privatized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="NsiDiscountAmountLimitationCode" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="AppliesToAllFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="DiscountSize">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <minInclusive value="0"/>
     *               <maxInclusive value="100"/>
     *               <fractionDigits value="2"/>
     *               <totalDigits value="5"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="ValidFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="ValidTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "service",
        "housing",
        "privatized",
        "nsiDiscountAmountLimitationCode",
        "appliesToAllFamilyMembers",
        "discountSize",
        "validFrom",
        "validTo",
        "comment"
    })
    public static class Actual {

        /**
         * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации
         * 
         */
        @XmlElement(name = "Service", required = true)
        @XmlSchemaType(name = "string")
        protected ServiceType service;
        /**
         * Тип жилищного фонда. PrivateHousing - Частный, MunicipalHousing - Муниципальный, StateHousing - Государственный
         * 
         */
        @XmlElement(name = "Housing", required = true)
        protected List<String> housing;
        /**
         * Жилое помещение приватизировано
         * 
         */
        @XmlElement(name = "Privatized")
        protected Boolean privatized;
        /**
         * Норматив для начисления компенсации. Код из справочника "Ограничение объема предоставляемой компенсации расходов" (НСИ)
         * 
         */
        @XmlElement(name = "NsiDiscountAmountLimitationCode", required = true)
        protected NsiRef nsiDiscountAmountLimitationCode;
        /**
         * Распространяется на всех членов семьи?
         * 
         */
        @XmlElement(name = "AppliesToAllFamilyMembers")
        protected boolean appliesToAllFamilyMembers;
        /**
         * Размер, предоставляемой компенсации
         * 
         */
        @XmlElement(name = "DiscountSize", required = true)
        protected BigDecimal discountSize;
        /**
         * Дата начала предоставления компенсации
         * 
         */
        @XmlElement(name = "ValidFrom", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar validFrom;
        /**
         * Дата окончания предоставления компенсации
         * 
         */
        @XmlElement(name = "ValidTo")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar validTo;
        /**
         * Примечание
         * 
         */
        @XmlElement(name = "Comment")
        protected String comment;

        /**
         * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации
         * 
         * @return
         *     possible object is
         *     {@link ServiceType }
         *     
         */
        public ServiceType getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceType }
         *     
         * @see #getService()
         */
        public void setService(ServiceType value) {
            this.service = value;
        }

        /**
         * Тип жилищного фонда. PrivateHousing - Частный, MunicipalHousing - Муниципальный, StateHousing - Государственный
         * 
         * Gets the value of the housing property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the housing property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getHousing().add(newItem);
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
         *     The value of the housing property.
         */
        public List<String> getHousing() {
            if (housing == null) {
                housing = new ArrayList<>();
            }
            return this.housing;
        }

        /**
         * Жилое помещение приватизировано
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrivatized() {
            return privatized;
        }

        /**
         * Sets the value of the privatized property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPrivatized()
         */
        public void setPrivatized(Boolean value) {
            this.privatized = value;
        }

        /**
         * Норматив для начисления компенсации. Код из справочника "Ограничение объема предоставляемой компенсации расходов" (НСИ)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getNsiDiscountAmountLimitationCode() {
            return nsiDiscountAmountLimitationCode;
        }

        /**
         * Sets the value of the nsiDiscountAmountLimitationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getNsiDiscountAmountLimitationCode()
         */
        public void setNsiDiscountAmountLimitationCode(NsiRef value) {
            this.nsiDiscountAmountLimitationCode = value;
        }

        /**
         * Распространяется на всех членов семьи?
         * 
         */
        public boolean isAppliesToAllFamilyMembers() {
            return appliesToAllFamilyMembers;
        }

        /**
         * Sets the value of the appliesToAllFamilyMembers property.
         * 
         */
        public void setAppliesToAllFamilyMembers(boolean value) {
            this.appliesToAllFamilyMembers = value;
        }

        /**
         * Размер, предоставляемой компенсации
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDiscountSize() {
            return discountSize;
        }

        /**
         * Sets the value of the discountSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getDiscountSize()
         */
        public void setDiscountSize(BigDecimal value) {
            this.discountSize = value;
        }

        /**
         * Дата начала предоставления компенсации
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getValidFrom()
         */
        public void setValidFrom(XMLGregorianCalendar value) {
            this.validFrom = value;
        }

        /**
         * Дата окончания предоставления компенсации
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValidTo() {
            return validTo;
        }

        /**
         * Sets the value of the validTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getValidTo()
         */
        public void setValidTo(XMLGregorianCalendar value) {
            this.validTo = value;
        }

        /**
         * Примечание
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getComment()
         */
        public void setComment(String value) {
            this.comment = value;
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
     *         <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType"/>
     *         <element name="Municipality" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
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
        "region",
        "municipality"
    })
    public static class Territory {

        /**
         * Субъект РФ
         * 
         */
        @XmlElement(name = "Region")
        protected RegionType region;
        /**
         * Муниципальное образование
         * 
         */
        @XmlElement(name = "Municipality")
        protected OKTMORefType municipality;

        /**
         * Субъект РФ
         * 
         * @return
         *     possible object is
         *     {@link RegionType }
         *     
         */
        public RegionType getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegionType }
         *     
         * @see #getRegion()
         */
        public void setRegion(RegionType value) {
            this.region = value;
        }

        /**
         * Муниципальное образование
         * 
         * @return
         *     possible object is
         *     {@link OKTMORefType }
         *     
         */
        public OKTMORefType getMunicipality() {
            return municipality;
        }

        /**
         * Sets the value of the municipality property.
         * 
         * @param value
         *     allowed object is
         *     {@link OKTMORefType }
         *     
         * @see #getMunicipality()
         */
        public void setMunicipality(OKTMORefType value) {
            this.municipality = value;
        }

    }

}
