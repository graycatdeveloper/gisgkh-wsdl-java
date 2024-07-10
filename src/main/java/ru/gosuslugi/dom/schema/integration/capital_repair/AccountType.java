
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Общий тип счета регионального оператора/специального счета
 * 
 * <p>Java class for AccountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CredOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         <element name="BIKCredOrg">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}BIKType">
 *               <pattern value="\d{9}"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountNumberType"/>
 *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *         <element name="KBK" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}KBKType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "credOrganization",
    "bikCredOrg",
    "number",
    "oktmo",
    "kbk"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.LoadAccountRegOperator.class,
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportAccountSpecialRequest.ImportAccountSpecial.LoadChangeAccountSpecial.class,
    ru.gosuslugi.dom.schema.integration.capital_repair.ExportAccountType.Details.class
})
public class AccountType {

    /**
     * Кредитная организация
     * 
     */
    @XmlElement(name = "CredOrganization", required = true)
    protected RegOrgType credOrganization;
    /**
     * БИК кредитной организации
     * 
     */
    @XmlElement(name = "BIKCredOrg", required = true)
    protected String bikCredOrg;
    /**
     * Номер счета
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Код ОКТМО
     * 
     */
    @XmlElement(name = "OKTMO")
    protected OKTMORefType oktmo;
    /**
     * КБК
     * 
     */
    @XmlElement(name = "KBK")
    protected String kbk;

    /**
     * Кредитная организация
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getCredOrganization() {
        return credOrganization;
    }

    /**
     * Sets the value of the credOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getCredOrganization()
     */
    public void setCredOrganization(RegOrgType value) {
        this.credOrganization = value;
    }

    /**
     * БИК кредитной организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIKCredOrg() {
        return bikCredOrg;
    }

    /**
     * Sets the value of the bikCredOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBIKCredOrg()
     */
    public void setBIKCredOrg(String value) {
        this.bikCredOrg = value;
    }

    /**
     * Номер счета
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
     * Код ОКТМО
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * КБК
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKBK() {
        return kbk;
    }

    /**
     * Sets the value of the kbk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKBK()
     */
    public void setKBK(String value) {
        this.kbk = value;
    }

}
