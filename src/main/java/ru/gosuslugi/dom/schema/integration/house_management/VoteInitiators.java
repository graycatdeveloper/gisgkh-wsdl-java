
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgRootAndVersionType;


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
 *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingInitiatorIndType"/>
 *         <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgRootAndVersionType"/>
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
    "ind",
    "org"
})
@XmlRootElement(name = "VoteInitiators")
public class VoteInitiators {

    /**
     * Физическое лицо (собственник помещений)
     * 
     */
    @XmlElement(name = "Ind")
    protected VotingInitiatorIndType ind;
    /**
     * Организация инициатор собрания ИП или Юр. лицо (УО)
     * 
     */
    @XmlElement(name = "Org")
    protected RegOrgRootAndVersionType org;

    /**
     * Физическое лицо (собственник помещений)
     * 
     * @return
     *     possible object is
     *     {@link VotingInitiatorIndType }
     *     
     */
    public VotingInitiatorIndType getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link VotingInitiatorIndType }
     *     
     * @see #getInd()
     */
    public void setInd(VotingInitiatorIndType value) {
        this.ind = value;
    }

    /**
     * Организация инициатор собрания ИП или Юр. лицо (УО)
     * 
     * @return
     *     possible object is
     *     {@link RegOrgRootAndVersionType }
     *     
     */
    public RegOrgRootAndVersionType getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgRootAndVersionType }
     *     
     * @see #getOrg()
     */
    public void setOrg(RegOrgRootAndVersionType value) {
        this.org = value;
    }

}
