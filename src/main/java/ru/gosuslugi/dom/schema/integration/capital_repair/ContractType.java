
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Договор на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for ContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContractType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String512Type"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Sum" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType"/>
 *         <choice>
 *           <element name="Customer" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="Individual">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}IndividualType">
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *         <element name="Performer" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         <element name="Work" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkContractType" maxOccurs="10000"/>
 *         <element name="AttachContract" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *         <choice>
 *           <element name="WarrantyMonthCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *           <element name="WarrantyNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <choice>
 *           <element name="AttachOutlay" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *           <element name="OutlayMissing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <choice>
 *           <element name="TenderInetAddress" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String512Type"/>
 *           <element name="TenderNotProvided" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="Dissolve" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DissolveContractType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractType", propOrder = {
    "number",
    "date",
    "startDate",
    "endDate",
    "sum",
    "customer",
    "individual",
    "performer",
    "work",
    "attachContract",
    "warrantyMonthCount",
    "warrantyNotSet",
    "attachOutlay",
    "outlayMissing",
    "tenderInetAddress",
    "tenderNotProvided",
    "dissolve"
})
public class ContractType {

    /**
     * Номер договора
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата договора
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Дата начала выполнения работ
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата окончания выполнения работ
     * 
     */
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    /**
     * Сумма договора
     * 
     */
    @XmlElement(name = "Sum", required = true)
    protected BigDecimal sum;
    /**
     * Заказчиком является Юридическое лицо / ИП
     * 
     */
    @XmlElement(name = "Customer")
    protected RegOrgType customer;
    /**
     * Заказчиком является Физическое лицо
     * 
     */
    @XmlElement(name = "Individual")
    protected ContractType.Individual individual;
    /**
     * Исполнитель
     * 
     */
    @XmlElement(name = "Performer", required = true)
    protected RegOrgType performer;
    /**
     * Список работ договора
     * 
     */
    @XmlElement(name = "Work", required = true)
    protected List<WorkContractType> work;
    /**
     * Файлы договора
     * 
     */
    @XmlElement(name = "AttachContract", required = true)
    protected List<AttachmentType> attachContract;
    /**
     * Гарантийный срок (месяцев)
     * 
     */
    @XmlElement(name = "WarrantyMonthCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger warrantyMonthCount;
    /**
     * Гарантийный срок не установлен
     * 
     */
    @XmlElement(name = "WarrantyNotSet")
    protected Boolean warrantyNotSet;
    /**
     * Файлы сметной документации
     * 
     */
    @XmlElement(name = "AttachOutlay")
    protected List<AttachmentType> attachOutlay;
    /**
     * Сметная документация отсутсвует
     * 
     */
    @XmlElement(name = "OutlayMissing")
    protected Boolean outlayMissing;
    /**
     * Адрес страницы в сети Интернет, на которой размещена информация об отборе подрядных организаций
     * 
     */
    @XmlElement(name = "TenderInetAddress")
    protected String tenderInetAddress;
    /**
     * Проведение отбора не предусмотрено законодательством
     * 
     */
    @XmlElement(name = "TenderNotProvided")
    protected Boolean tenderNotProvided;
    /**
     * Сведения о расторжении
     * 
     */
    @XmlElement(name = "Dissolve")
    protected DissolveContractType dissolve;

    /**
     * Номер договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Дата начала выполнения работ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата окончания выполнения работ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Сумма договора
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSum()
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Заказчиком является Юридическое лицо / ИП
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getCustomer()
     */
    public void setCustomer(RegOrgType value) {
        this.customer = value;
    }

    /**
     * Заказчиком является Физическое лицо
     * 
     * @return
     *     possible object is
     *     {@link ContractType.Individual }
     *     
     */
    public ContractType.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractType.Individual }
     *     
     * @see #getIndividual()
     */
    public void setIndividual(ContractType.Individual value) {
        this.individual = value;
    }

    /**
     * Исполнитель
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getPerformer() {
        return performer;
    }

    /**
     * Sets the value of the performer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getPerformer()
     */
    public void setPerformer(RegOrgType value) {
        this.performer = value;
    }

    /**
     * Список работ договора
     * 
     * Gets the value of the work property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the work property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkContractType }
     * </p>
     * 
     * 
     * @return
     *     The value of the work property.
     */
    public List<WorkContractType> getWork() {
        if (work == null) {
            work = new ArrayList<>();
        }
        return this.work;
    }

    /**
     * Файлы договора
     * 
     * Gets the value of the attachContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachContract().add(newItem);
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
     *     The value of the attachContract property.
     */
    public List<AttachmentType> getAttachContract() {
        if (attachContract == null) {
            attachContract = new ArrayList<>();
        }
        return this.attachContract;
    }

    /**
     * Гарантийный срок (месяцев)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWarrantyMonthCount() {
        return warrantyMonthCount;
    }

    /**
     * Sets the value of the warrantyMonthCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getWarrantyMonthCount()
     */
    public void setWarrantyMonthCount(BigInteger value) {
        this.warrantyMonthCount = value;
    }

    /**
     * Гарантийный срок не установлен
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarrantyNotSet() {
        return warrantyNotSet;
    }

    /**
     * Sets the value of the warrantyNotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWarrantyNotSet()
     */
    public void setWarrantyNotSet(Boolean value) {
        this.warrantyNotSet = value;
    }

    /**
     * Файлы сметной документации
     * 
     * Gets the value of the attachOutlay property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachOutlay property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachOutlay().add(newItem);
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
     *     The value of the attachOutlay property.
     */
    public List<AttachmentType> getAttachOutlay() {
        if (attachOutlay == null) {
            attachOutlay = new ArrayList<>();
        }
        return this.attachOutlay;
    }

    /**
     * Сметная документация отсутсвует
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutlayMissing() {
        return outlayMissing;
    }

    /**
     * Sets the value of the outlayMissing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOutlayMissing()
     */
    public void setOutlayMissing(Boolean value) {
        this.outlayMissing = value;
    }

    /**
     * Адрес страницы в сети Интернет, на которой размещена информация об отборе подрядных организаций
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderInetAddress() {
        return tenderInetAddress;
    }

    /**
     * Sets the value of the tenderInetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTenderInetAddress()
     */
    public void setTenderInetAddress(String value) {
        this.tenderInetAddress = value;
    }

    /**
     * Проведение отбора не предусмотрено законодательством
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTenderNotProvided() {
        return tenderNotProvided;
    }

    /**
     * Sets the value of the tenderNotProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isTenderNotProvided()
     */
    public void setTenderNotProvided(Boolean value) {
        this.tenderNotProvided = value;
    }

    /**
     * Сведения о расторжении
     * 
     * @return
     *     possible object is
     *     {@link DissolveContractType }
     *     
     */
    public DissolveContractType getDissolve() {
        return dissolve;
    }

    /**
     * Sets the value of the dissolve property.
     * 
     * @param value
     *     allowed object is
     *     {@link DissolveContractType }
     *     
     * @see #getDissolve()
     */
    public void setDissolve(DissolveContractType value) {
        this.dissolve = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}IndividualType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Individual
        extends IndividualType
    {


    }

}
