
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <choice>
 *           <element name="AccountGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *           <element name="CredOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" maxOccurs="100"/>
 *           <element name="BIKCredOrg" maxOccurs="100">
 *             <simpleType>
 *               <restriction base="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType">
 *                 <pattern value="\d{9}"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <sequence>
 *             <element name="OpenDateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             <element name="OpenDateTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *         <choice>
 *           <element name="WithoutOperationAndBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <sequence>
 *             <element name="ReportingPeriodFrom" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ReportingPeriodType"/>
 *             <element name="ReportingPeriodTo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ReportingPeriodType" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="12.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountGuid",
    "credOrganization",
    "bikCredOrg",
    "openDateFrom",
    "openDateTo",
    "withoutOperationAndBalance",
    "reportingPeriodFrom",
    "reportingPeriodTo"
})
@XmlRootElement(name = "exportAccountRequest")
public class ExportAccountRequest
    extends BaseType
{

    /**
     * Идентификатор счета
     * 
     */
    @XmlElement(name = "AccountGuid")
    protected List<String> accountGuid;
    /**
     * Кредитная организация
     * 
     */
    @XmlElement(name = "CredOrganization")
    protected List<RegOrgType> credOrganization;
    /**
     * БИК кредитной организации
     * 
     */
    @XmlElement(name = "BIKCredOrg")
    protected List<String> bikCredOrg;
    /**
     * Дата открытия счета С
     * 
     */
    @XmlElement(name = "OpenDateFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDateFrom;
    /**
     * Дата открытия счета ПО
     * 
     */
    @XmlElement(name = "OpenDateTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDateTo;
    /**
     * Не отображать
     * 
     */
    @XmlElement(name = "WithoutOperationAndBalance")
    protected Boolean withoutOperationAndBalance;
    /**
     * Отчетный период с
     * 
     */
    @XmlElement(name = "ReportingPeriodFrom")
    protected ReportingPeriodType reportingPeriodFrom;
    /**
     * Отчетный период по
     * 
     */
    @XmlElement(name = "ReportingPeriodTo")
    protected ReportingPeriodType reportingPeriodTo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор счета
     * 
     * Gets the value of the accountGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountGuid().add(newItem);
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
     *     The value of the accountGuid property.
     */
    public List<String> getAccountGuid() {
        if (accountGuid == null) {
            accountGuid = new ArrayList<>();
        }
        return this.accountGuid;
    }

    /**
     * Кредитная организация
     * 
     * Gets the value of the credOrganization property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credOrganization property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCredOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegOrgType }
     * </p>
     * 
     * 
     * @return
     *     The value of the credOrganization property.
     */
    public List<RegOrgType> getCredOrganization() {
        if (credOrganization == null) {
            credOrganization = new ArrayList<>();
        }
        return this.credOrganization;
    }

    /**
     * БИК кредитной организации
     * 
     * Gets the value of the bikCredOrg property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bikCredOrg property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBIKCredOrg().add(newItem);
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
     *     The value of the bikCredOrg property.
     */
    public List<String> getBIKCredOrg() {
        if (bikCredOrg == null) {
            bikCredOrg = new ArrayList<>();
        }
        return this.bikCredOrg;
    }

    /**
     * Дата открытия счета С
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDateFrom() {
        return openDateFrom;
    }

    /**
     * Sets the value of the openDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOpenDateFrom()
     */
    public void setOpenDateFrom(XMLGregorianCalendar value) {
        this.openDateFrom = value;
    }

    /**
     * Дата открытия счета ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDateTo() {
        return openDateTo;
    }

    /**
     * Sets the value of the openDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOpenDateTo()
     */
    public void setOpenDateTo(XMLGregorianCalendar value) {
        this.openDateTo = value;
    }

    /**
     * Не отображать
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithoutOperationAndBalance() {
        return withoutOperationAndBalance;
    }

    /**
     * Sets the value of the withoutOperationAndBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWithoutOperationAndBalance()
     */
    public void setWithoutOperationAndBalance(Boolean value) {
        this.withoutOperationAndBalance = value;
    }

    /**
     * Отчетный период с
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriodType }
     *     
     */
    public ReportingPeriodType getReportingPeriodFrom() {
        return reportingPeriodFrom;
    }

    /**
     * Sets the value of the reportingPeriodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriodType }
     *     
     * @see #getReportingPeriodFrom()
     */
    public void setReportingPeriodFrom(ReportingPeriodType value) {
        this.reportingPeriodFrom = value;
    }

    /**
     * Отчетный период по
     * 
     * @return
     *     possible object is
     *     {@link ReportingPeriodType }
     *     
     */
    public ReportingPeriodType getReportingPeriodTo() {
        return reportingPeriodTo;
    }

    /**
     * Sets the value of the reportingPeriodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingPeriodType }
     *     
     * @see #getReportingPeriodTo()
     */
    public void setReportingPeriodTo(ReportingPeriodType value) {
        this.reportingPeriodTo = value;
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
            return "12.0.0.1";
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
