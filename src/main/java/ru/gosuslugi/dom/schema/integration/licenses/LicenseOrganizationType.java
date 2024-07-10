
package ru.gosuslugi.dom.schema.integration.licenses;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.EntpsType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.LegalType;


/**
 * Информация о лицензиате
 * 
 * <p>Java class for LicenseOrganizationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseOrganizationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Legal">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Entrp">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseOrganizationType", propOrder = {
    "legal",
    "entrp"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.licenses.LicenseInfoType.LicenseOrganization.class,
    ru.gosuslugi.dom.schema.integration.licenses.LicenseEntryType.LicenseOrganization.class
})
public class LicenseOrganizationType {

    /**
     * Юридическое лицо
     * 
     */
    @XmlElement(name = "Legal")
    protected LicenseOrganizationType.Legal legal;
    /**
     * ИП
     * 
     */
    @XmlElement(name = "Entrp")
    protected LicenseOrganizationType.Entrp entrp;

    /**
     * Юридическое лицо
     * 
     * @return
     *     possible object is
     *     {@link LicenseOrganizationType.Legal }
     *     
     */
    public LicenseOrganizationType.Legal getLegal() {
        return legal;
    }

    /**
     * Sets the value of the legal property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseOrganizationType.Legal }
     *     
     * @see #getLegal()
     */
    public void setLegal(LicenseOrganizationType.Legal value) {
        this.legal = value;
    }

    /**
     * ИП
     * 
     * @return
     *     possible object is
     *     {@link LicenseOrganizationType.Entrp }
     *     
     */
    public LicenseOrganizationType.Entrp getEntrp() {
        return entrp;
    }

    /**
     * Sets the value of the entrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseOrganizationType.Entrp }
     *     
     * @see #getEntrp()
     */
    public void setEntrp(LicenseOrganizationType.Entrp value) {
        this.entrp = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}EntpsType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Entrp
        extends EntpsType
    {


    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}LegalType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Legal
        extends LegalType
    {


    }

}
