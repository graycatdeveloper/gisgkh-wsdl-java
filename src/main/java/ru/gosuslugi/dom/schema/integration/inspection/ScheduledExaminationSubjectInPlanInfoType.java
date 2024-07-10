
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Сведения о субъекте проверки для плановой проверки в плане
 * 
 * <p>Java class for ScheduledExaminationSubjectInPlanInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ScheduledExaminationSubjectInPlanInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Organization">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                 <sequence>
 *                   <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String6000Type"/>
 *                   <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Individual">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                 <sequence>
 *                   <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
 *                   <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 </sequence>
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
@XmlType(name = "ScheduledExaminationSubjectInPlanInfoType", propOrder = {
    "organization",
    "individual"
})
public class ScheduledExaminationSubjectInPlanInfoType {

    /**
     * Юридическое лицо.
     * 
     */
    @XmlElement(name = "Organization")
    protected ScheduledExaminationSubjectInPlanInfoType.Organization organization;
    /**
     * Индивидуальный предприниматель.
     * 
     */
    @XmlElement(name = "Individual")
    protected ScheduledExaminationSubjectInPlanInfoType.Individual individual;

    /**
     * Юридическое лицо.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledExaminationSubjectInPlanInfoType.Organization }
     *     
     */
    public ScheduledExaminationSubjectInPlanInfoType.Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledExaminationSubjectInPlanInfoType.Organization }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(ScheduledExaminationSubjectInPlanInfoType.Organization value) {
        this.organization = value;
    }

    /**
     * Индивидуальный предприниматель.
     * 
     * @return
     *     possible object is
     *     {@link ScheduledExaminationSubjectInPlanInfoType.Individual }
     *     
     */
    public ScheduledExaminationSubjectInPlanInfoType.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduledExaminationSubjectInPlanInfoType.Individual }
     *     
     * @see #getIndividual()
     */
    public void setIndividual(ScheduledExaminationSubjectInPlanInfoType.Individual value) {
        this.individual = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *       <sequence>
     *         <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type"/>
     *         <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "actualActivityPlace",
        "smallBusiness"
    })
    public static class Individual
        extends RegOrgType
    {

        /**
         * Место фактического осуществления деятельности.
         * 
         */
        @XmlElement(name = "ActualActivityPlace", required = true)
        protected String actualActivityPlace;
        /**
         * Субъект малого предпринимательства
         * 
         */
        @XmlElement(name = "SmallBusiness")
        protected boolean smallBusiness;

        /**
         * Место фактического осуществления деятельности.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActualActivityPlace() {
            return actualActivityPlace;
        }

        /**
         * Sets the value of the actualActivityPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getActualActivityPlace()
         */
        public void setActualActivityPlace(String value) {
            this.actualActivityPlace = value;
        }

        /**
         * Субъект малого предпринимательства
         * 
         */
        public boolean isSmallBusiness() {
            return smallBusiness;
        }

        /**
         * Sets the value of the smallBusiness property.
         * 
         */
        public void setSmallBusiness(boolean value) {
            this.smallBusiness = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
     *       <sequence>
     *         <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String6000Type"/>
     *         <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "actualActivityPlace",
        "smallBusiness"
    })
    public static class Organization
        extends RegOrgType
    {

        /**
         * Место фактического осуществления деятельности.
         * 
         */
        @XmlElement(name = "ActualActivityPlace", required = true)
        protected String actualActivityPlace;
        /**
         * Субъект малого предпринимательства
         * 
         */
        @XmlElement(name = "SmallBusiness")
        protected boolean smallBusiness;

        /**
         * Место фактического осуществления деятельности.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActualActivityPlace() {
            return actualActivityPlace;
        }

        /**
         * Sets the value of the actualActivityPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getActualActivityPlace()
         */
        public void setActualActivityPlace(String value) {
            this.actualActivityPlace = value;
        }

        /**
         * Субъект малого предпринимательства
         * 
         */
        public boolean isSmallBusiness() {
            return smallBusiness;
        }

        /**
         * Sets the value of the smallBusiness property.
         * 
         */
        public void setSmallBusiness(boolean value) {
            this.smallBusiness = value;
        }

    }

}
