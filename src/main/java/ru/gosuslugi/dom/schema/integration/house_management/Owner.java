
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
 *         <element name="OwnerInd">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}DecisionIndType">
 *                 <sequence minOccurs="0">
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS" minOccurs="0"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}DecisionIndID" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OwnerOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgRootAndVersionType"/>
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
    "ownerInd",
    "ownerOrg"
})
@XmlRootElement(name = "Owner")
public class Owner {

    /**
     * Физическое лицо (собственник помещений)
     * 
     */
    @XmlElement(name = "OwnerInd")
    protected Owner.OwnerInd ownerInd;
    /**
     * Организация собственник ИП или Юр. лицо (УО)
     * 
     */
    @XmlElement(name = "OwnerOrg")
    protected RegOrgRootAndVersionType ownerOrg;

    /**
     * Физическое лицо (собственник помещений)
     * 
     * @return
     *     possible object is
     *     {@link Owner.OwnerInd }
     *     
     */
    public Owner.OwnerInd getOwnerInd() {
        return ownerInd;
    }

    /**
     * Sets the value of the ownerInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner.OwnerInd }
     *     
     * @see #getOwnerInd()
     */
    public void setOwnerInd(Owner.OwnerInd value) {
        this.ownerInd = value;
    }

    /**
     * Организация собственник ИП или Юр. лицо (УО)
     * 
     * @return
     *     possible object is
     *     {@link RegOrgRootAndVersionType }
     *     
     */
    public RegOrgRootAndVersionType getOwnerOrg() {
        return ownerOrg;
    }

    /**
     * Sets the value of the ownerOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgRootAndVersionType }
     *     
     * @see #getOwnerOrg()
     */
    public void setOwnerOrg(RegOrgRootAndVersionType value) {
        this.ownerOrg = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}DecisionIndType">
     *       <sequence minOccurs="0">
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS" minOccurs="0"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}DecisionIndID" minOccurs="0"/>
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
        "snils",
        "decisionIndID"
    })
    public static class OwnerInd
        extends DecisionIndType
    {

        /**
         * СНИЛС
         * 
         */
        @XmlElement(name = "SNILS", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
        protected String snils;
        /**
         * Удостоверение личности собственника
         * 
         */
        @XmlElement(name = "DecisionIndID")
        protected DecisionIndID decisionIndID;

        /**
         * СНИЛС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNILS() {
            return snils;
        }

        /**
         * Sets the value of the snils property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getSNILS()
         */
        public void setSNILS(String value) {
            this.snils = value;
        }

        /**
         * Удостоверение личности собственника
         * 
         * @return
         *     possible object is
         *     {@link DecisionIndID }
         *     
         */
        public DecisionIndID getDecisionIndID() {
            return decisionIndID;
        }

        /**
         * Sets the value of the decisionIndID property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecisionIndID }
         *     
         * @see #getDecisionIndID()
         */
        public void setDecisionIndID(DecisionIndID value) {
            this.decisionIndID = value;
        }

    }

}
