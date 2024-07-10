
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Экспортируемый кредитный договор/договор займа
 * 
 * <p>Java class for ExportCreditContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCreditContractType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}CreditContractType">
 *       <sequence>
 *         <element name="Holder" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         <element name="RepaymentStatus" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String50Type"/>
 *         <element name="TerminationInfo" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}TerminationInfoType" minOccurs="0"/>
 *         <element name="Status">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Published"/>
 *               <enumeration value="Canceled"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="CreditContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCreditContractType", propOrder = {
    "holder",
    "repaymentStatus",
    "terminationInfo",
    "status",
    "creditContractGUID"
})
public class ExportCreditContractType
    extends CreditContractType
{

    /**
     * Региональный оператор - владелец
     * 
     */
    @XmlElement(name = "Holder", required = true)
    protected RegOrgType holder;
    /**
     * Статус погашения
     * 
     */
    @XmlElement(name = "RepaymentStatus", required = true)
    protected String repaymentStatus;
    /**
     * Сведения о расторжении
     * 
     */
    @XmlElement(name = "TerminationInfo")
    protected TerminationInfoType terminationInfo;
    /**
     * Статус
     * 
     */
    @XmlElement(name = "Status", required = true)
    protected String status;
    /**
     * Идентификатор кредитного договора/договора займа
     * 
     */
    @XmlElement(name = "CreditContractGUID", required = true)
    protected String creditContractGUID;

    /**
     * Региональный оператор - владелец
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getHolder()
     */
    public void setHolder(RegOrgType value) {
        this.holder = value;
    }

    /**
     * Статус погашения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentStatus() {
        return repaymentStatus;
    }

    /**
     * Sets the value of the repaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRepaymentStatus()
     */
    public void setRepaymentStatus(String value) {
        this.repaymentStatus = value;
    }

    /**
     * Сведения о расторжении
     * 
     * @return
     *     possible object is
     *     {@link TerminationInfoType }
     *     
     */
    public TerminationInfoType getTerminationInfo() {
        return terminationInfo;
    }

    /**
     * Sets the value of the terminationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationInfoType }
     *     
     * @see #getTerminationInfo()
     */
    public void setTerminationInfo(TerminationInfoType value) {
        this.terminationInfo = value;
    }

    /**
     * Статус
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Идентификатор кредитного договора/договора займа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditContractGUID() {
        return creditContractGUID;
    }

    /**
     * Sets the value of the creditContractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCreditContractGUID()
     */
    public void setCreditContractGUID(String value) {
        this.creditContractGUID = value;
    }

}
