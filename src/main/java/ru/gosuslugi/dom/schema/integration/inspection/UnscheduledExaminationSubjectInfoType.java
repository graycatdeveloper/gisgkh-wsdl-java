
package ru.gosuslugi.dom.schema.integration.inspection;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Сведения о субъекте проверки для внеплановой проверки в реестре
 * 
 * <p>Java class for UnscheduledExaminationSubjectInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnscheduledExaminationSubjectInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Organization">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType">
 *                 <sequence>
 *                   <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String6000Type"/>
 *                   <element name="OtherPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
 *                   <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String6000Type"/>
 *                   <element name="OtherPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Citizen" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CitizenInfoType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnscheduledExaminationSubjectInfoType", propOrder = {
    "organization",
    "individual",
    "citizen"
})
public class UnscheduledExaminationSubjectInfoType {

    /**
     * Юридическое лицо.
     * 
     */
    @XmlElement(name = "Organization")
    protected UnscheduledExaminationSubjectInfoType.Organization organization;
    /**
     * Индивидуальный предприниматель.
     * 
     */
    @XmlElement(name = "Individual")
    protected UnscheduledExaminationSubjectInfoType.Individual individual;
    /**
     * Гражданин.
     * 
     */
    @XmlElement(name = "Citizen")
    protected CitizenInfoType citizen;

    /**
     * Юридическое лицо.
     * 
     * @return
     *     possible object is
     *     {@link UnscheduledExaminationSubjectInfoType.Organization }
     *     
     */
    public UnscheduledExaminationSubjectInfoType.Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnscheduledExaminationSubjectInfoType.Organization }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(UnscheduledExaminationSubjectInfoType.Organization value) {
        this.organization = value;
    }

    /**
     * Индивидуальный предприниматель.
     * 
     * @return
     *     possible object is
     *     {@link UnscheduledExaminationSubjectInfoType.Individual }
     *     
     */
    public UnscheduledExaminationSubjectInfoType.Individual getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnscheduledExaminationSubjectInfoType.Individual }
     *     
     * @see #getIndividual()
     */
    public void setIndividual(UnscheduledExaminationSubjectInfoType.Individual value) {
        this.individual = value;
    }

    /**
     * Гражданин.
     * 
     * @return
     *     possible object is
     *     {@link CitizenInfoType }
     *     
     */
    public CitizenInfoType getCitizen() {
        return citizen;
    }

    /**
     * Sets the value of the citizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenInfoType }
     *     
     * @see #getCitizen()
     */
    public void setCitizen(CitizenInfoType value) {
        this.citizen = value;
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
     *         <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String6000Type"/>
     *         <element name="OtherPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
        "smallBusiness",
        "actualActivityPlace",
        "otherPersons"
    })
    public static class Individual
        extends RegOrgType
    {

        /**
         * Субъект малого предпринимательства
         * 
         */
        @XmlElement(name = "SmallBusiness")
        protected boolean smallBusiness;
        /**
         * Место фактического осуществления деятельности.
         * 
         */
        @XmlElement(name = "ActualActivityPlace", required = true)
        protected String actualActivityPlace;
        /**
         * Другие физические лица, в отношении которых проводится проверка
         * 
         */
        @XmlElement(name = "OtherPersons")
        protected String otherPersons;

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
         * Другие физические лица, в отношении которых проводится проверка
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherPersons() {
            return otherPersons;
        }

        /**
         * Sets the value of the otherPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOtherPersons()
         */
        public void setOtherPersons(String value) {
            this.otherPersons = value;
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
     *         <element name="SmallBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         <element name="ActualActivityPlace" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String6000Type"/>
     *         <element name="OtherPersons" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String2000Type" minOccurs="0"/>
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
        "smallBusiness",
        "actualActivityPlace",
        "otherPersons"
    })
    public static class Organization
        extends RegOrgType
    {

        /**
         * Субъект малого предпринимательства
         * 
         */
        @XmlElement(name = "SmallBusiness")
        protected boolean smallBusiness;
        /**
         * Место фактического осуществления деятельности.
         * 
         */
        @XmlElement(name = "ActualActivityPlace", required = true)
        protected String actualActivityPlace;
        /**
         * Другие физические лица, в отношении которых проводится проверка
         * 
         */
        @XmlElement(name = "OtherPersons")
        protected String otherPersons;

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
         * Другие физические лица, в отношении которых проводится проверка
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherPersons() {
            return otherPersons;
        }

        /**
         * Sets the value of the otherPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOtherPersons()
         */
        public void setOtherPersons(String value) {
            this.otherPersons = value;
        }

    }

}
