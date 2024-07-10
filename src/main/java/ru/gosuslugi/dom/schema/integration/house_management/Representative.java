
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
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
 *       <sequence>
 *         <choice>
 *           <element name="RepresentativeInd">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}DecisionIndType">
 *                   <sequence minOccurs="0">
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}SNILS" minOccurs="0"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}DecisionIndID" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="RepresentativeOrg" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgRootAndVersionType"/>
 *         </choice>
 *         <element name="Notarized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RepresentativeAttachments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
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
    "representativeInd",
    "representativeOrg",
    "notarized",
    "representativeAttachments"
})
@XmlRootElement(name = "Representative")
public class Representative {

    /**
     * Физическое лицо (представитель)
     * 
     */
    @XmlElement(name = "RepresentativeInd")
    protected Representative.RepresentativeInd representativeInd;
    /**
     * Организация представитель ИП или Юр. лицо
     * 
     */
    @XmlElement(name = "RepresentativeOrg")
    protected RegOrgRootAndVersionType representativeOrg;
    /**
     * Представитель собственника действует на основании  доверенности, удостоверенной нотариально
     * 
     */
    @XmlElement(name = "Notarized")
    protected boolean notarized;
    /**
     * Документ, подтверждающий законное представительство собственника помещения
     * 
     */
    @XmlElement(name = "RepresentativeAttachments")
    protected List<AttachmentType> representativeAttachments;

    /**
     * Физическое лицо (представитель)
     * 
     * @return
     *     possible object is
     *     {@link Representative.RepresentativeInd }
     *     
     */
    public Representative.RepresentativeInd getRepresentativeInd() {
        return representativeInd;
    }

    /**
     * Sets the value of the representativeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Representative.RepresentativeInd }
     *     
     * @see #getRepresentativeInd()
     */
    public void setRepresentativeInd(Representative.RepresentativeInd value) {
        this.representativeInd = value;
    }

    /**
     * Организация представитель ИП или Юр. лицо
     * 
     * @return
     *     possible object is
     *     {@link RegOrgRootAndVersionType }
     *     
     */
    public RegOrgRootAndVersionType getRepresentativeOrg() {
        return representativeOrg;
    }

    /**
     * Sets the value of the representativeOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgRootAndVersionType }
     *     
     * @see #getRepresentativeOrg()
     */
    public void setRepresentativeOrg(RegOrgRootAndVersionType value) {
        this.representativeOrg = value;
    }

    /**
     * Представитель собственника действует на основании  доверенности, удостоверенной нотариально
     * 
     */
    public boolean isNotarized() {
        return notarized;
    }

    /**
     * Sets the value of the notarized property.
     * 
     */
    public void setNotarized(boolean value) {
        this.notarized = value;
    }

    /**
     * Документ, подтверждающий законное представительство собственника помещения
     * 
     * Gets the value of the representativeAttachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the representativeAttachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRepresentativeAttachments().add(newItem);
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
     *     The value of the representativeAttachments property.
     */
    public List<AttachmentType> getRepresentativeAttachments() {
        if (representativeAttachments == null) {
            representativeAttachments = new ArrayList<>();
        }
        return this.representativeAttachments;
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
    public static class RepresentativeInd
        extends DecisionIndType
    {

        /**
         * СНИЛС
         * 
         */
        @XmlElement(name = "SNILS", namespace = "http://dom.gosuslugi.ru/schema/integration/individual-registry-base/")
        protected String snils;
        /**
         * Удостоверение личности представителя
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
         * Удостоверение личности представителя
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
