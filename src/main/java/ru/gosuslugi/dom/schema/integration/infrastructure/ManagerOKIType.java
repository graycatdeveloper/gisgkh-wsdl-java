
package ru.gosuslugi.dom.schema.integration.infrastructure;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagerOKIType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ManagerOKIType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RSO">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="RSOOrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}eTextType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Municipalities" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagerOKIType", propOrder = {
    "rso",
    "municipalities"
})
public class ManagerOKIType {

    /**
     * РСО
     * 
     */
    @XmlElement(name = "RSO")
    protected ManagerOKIType.RSO rso;
    /**
     * На балансе муниципального образования
     * 
     */
    @XmlElement(name = "Municipalities")
    protected Boolean municipalities;

    /**
     * РСО
     * 
     * @return
     *     possible object is
     *     {@link ManagerOKIType.RSO }
     *     
     */
    public ManagerOKIType.RSO getRSO() {
        return rso;
    }

    /**
     * Sets the value of the rso property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagerOKIType.RSO }
     *     
     * @see #getRSO()
     */
    public void setRSO(ManagerOKIType.RSO value) {
        this.rso = value;
    }

    /**
     * На балансе муниципального образования
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMunicipalities() {
        return municipalities;
    }

    /**
     * Sets the value of the municipalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isMunicipalities()
     */
    public void setMunicipalities(Boolean value) {
        this.municipalities = value;
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
     *         <element name="RSOOrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/infrastructure/}eTextType" minOccurs="0"/>
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
        "rsoOrganizationGUID",
        "name"
    })
    public static class RSO {

        /**
         * Идентификатор РСО
         * 
         */
        @XmlElement(name = "RSOOrganizationGUID", required = true)
        protected String rsoOrganizationGUID;
        /**
         * Наименование РСО
         * 
         */
        @XmlElement(name = "Name")
        protected String name;

        /**
         * Идентификатор РСО
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRSOOrganizationGUID() {
            return rsoOrganizationGUID;
        }

        /**
         * Sets the value of the rsoOrganizationGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRSOOrganizationGUID()
         */
        public void setRSOOrganizationGUID(String value) {
            this.rsoOrganizationGUID = value;
        }

        /**
         * Наименование РСО
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getName()
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
