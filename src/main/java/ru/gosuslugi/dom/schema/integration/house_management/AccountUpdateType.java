
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.IndType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Характеристика ЛС
 * 
 * <p>Java class for AccountUpdateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountUpdateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LivingPersonsNumber">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *               <maxInclusive value="99"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element name="OwnerInd" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}IndType"/>
 *           <element name="OwnerOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="RenterInd" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}IndType"/>
 *           <element name="RenterOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         </choice>
 *         <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="ResidentialSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="NonResidentialSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaType" minOccurs="0"/>
 *         <element name="Closed" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ClosedAccountAttributesType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountUpdateType", propOrder = {
    "livingPersonsNumber",
    "ownerInd",
    "ownerOrg",
    "renterInd",
    "renterOrg",
    "totalSquare",
    "residentialSquare",
    "nonResidentialSquare",
    "closed"
})
public class AccountUpdateType {

    /**
     * Количество проживающих
     * 
     */
    @XmlElement(name = "LivingPersonsNumber")
    protected byte livingPersonsNumber;
    /**
     * Собственник ФЛ. Ссылка на физлицо в реестре физлиц
     * 
     */
    @XmlElement(name = "OwnerInd")
    protected IndType ownerInd;
    /**
     * Собственник ЮЛ/ИП/ОП. Ссылка га реестр организаций
     * 
     */
    @XmlElement(name = "OwnerOrg")
    protected RegOrgType ownerOrg;
    /**
     * ФЛ по договору социального наема. Ссылка на физлицо в реестре физлиц
     * 
     */
    @XmlElement(name = "RenterInd")
    protected IndType renterInd;
    /**
     * Собственник ЮЛ/ИП/ОП. Ссылка га реестр организаций
     * 
     */
    @XmlElement(name = "RenterOrg")
    protected RegOrgType renterOrg;
    /**
     * Нежилая площадь
     * 
     */
    @XmlElement(name = "TotalSquare")
    protected BigDecimal totalSquare;
    /**
     * Нежилая площадь
     * 
     */
    @XmlElement(name = "ResidentialSquare")
    protected BigDecimal residentialSquare;
    /**
     * Нежилая площадь
     * 
     */
    @XmlElement(name = "NonResidentialSquare")
    protected BigDecimal nonResidentialSquare;
    /**
     * Счет закрыт
     * 
     */
    @XmlElement(name = "Closed")
    protected ClosedAccountAttributesType closed;

    /**
     * Количество проживающих
     * 
     */
    public byte getLivingPersonsNumber() {
        return livingPersonsNumber;
    }

    /**
     * Sets the value of the livingPersonsNumber property.
     * 
     */
    public void setLivingPersonsNumber(byte value) {
        this.livingPersonsNumber = value;
    }

    /**
     * Собственник ФЛ. Ссылка на физлицо в реестре физлиц
     * 
     * @return
     *     possible object is
     *     {@link IndType }
     *     
     */
    public IndType getOwnerInd() {
        return ownerInd;
    }

    /**
     * Sets the value of the ownerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndType }
     *     
     * @see #getOwnerInd()
     */
    public void setOwnerInd(IndType value) {
        this.ownerInd = value;
    }

    /**
     * Собственник ЮЛ/ИП/ОП. Ссылка га реестр организаций
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOwnerOrg() {
        return ownerOrg;
    }

    /**
     * Sets the value of the ownerOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOwnerOrg()
     */
    public void setOwnerOrg(RegOrgType value) {
        this.ownerOrg = value;
    }

    /**
     * ФЛ по договору социального наема. Ссылка на физлицо в реестре физлиц
     * 
     * @return
     *     possible object is
     *     {@link IndType }
     *     
     */
    public IndType getRenterInd() {
        return renterInd;
    }

    /**
     * Sets the value of the renterInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndType }
     *     
     * @see #getRenterInd()
     */
    public void setRenterInd(IndType value) {
        this.renterInd = value;
    }

    /**
     * Собственник ЮЛ/ИП/ОП. Ссылка га реестр организаций
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getRenterOrg() {
        return renterOrg;
    }

    /**
     * Sets the value of the renterOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getRenterOrg()
     */
    public void setRenterOrg(RegOrgType value) {
        this.renterOrg = value;
    }

    /**
     * Нежилая площадь
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSquare() {
        return totalSquare;
    }

    /**
     * Sets the value of the totalSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalSquare()
     */
    public void setTotalSquare(BigDecimal value) {
        this.totalSquare = value;
    }

    /**
     * Нежилая площадь
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidentialSquare() {
        return residentialSquare;
    }

    /**
     * Sets the value of the residentialSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getResidentialSquare()
     */
    public void setResidentialSquare(BigDecimal value) {
        this.residentialSquare = value;
    }

    /**
     * Нежилая площадь
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonResidentialSquare() {
        return nonResidentialSquare;
    }

    /**
     * Sets the value of the nonResidentialSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getNonResidentialSquare()
     */
    public void setNonResidentialSquare(BigDecimal value) {
        this.nonResidentialSquare = value;
    }

    /**
     * Счет закрыт
     * 
     * @return
     *     possible object is
     *     {@link ClosedAccountAttributesType }
     *     
     */
    public ClosedAccountAttributesType getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedAccountAttributesType }
     *     
     * @see #getClosed()
     */
    public void setClosed(ClosedAccountAttributesType value) {
        this.closed = value;
    }

}
