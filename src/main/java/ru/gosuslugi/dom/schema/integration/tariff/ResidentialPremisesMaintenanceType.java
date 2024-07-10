
package ru.gosuslugi.dom.schema.integration.tariff;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Размер платы за содержание жилого помещения
 * 
 * <p>Java class for ResidentialPremisesMaintenanceType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ResidentialPremisesMaintenanceType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/tariff/}TariffCommonType">
 *       <sequence>
 *         <element name="Usage" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="100"/>
 *         <element name="Price" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}PriceType" minOccurs="0"/>
 *         <choice>
 *           <element name="DifferentiationNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Differentiation" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}DifferentiationType" maxOccurs="1000"/>
 *         </choice>
 *         <choice>
 *           <element name="CoefficientsNotSet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Coefficient" type="{http://dom.gosuslugi.ru/schema/integration/tariff/}CoefficientType" maxOccurs="1000"/>
 *         </choice>
 *         <choice>
 *           <element name="WithoutJobs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Job" maxOccurs="100">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
 *                   <sequence>
 *                     <element name="Price" minOccurs="0">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                           <totalDigits value="18"/>
 *                           <fractionDigits value="6"/>
 *                           <minExclusive value="0"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResidentialPremisesMaintenanceType", propOrder = {
    "usage",
    "price",
    "differentiationNotSet",
    "differentiation",
    "coefficientsNotSet",
    "coefficient",
    "withoutJobs",
    "job"
})
public class ResidentialPremisesMaintenanceType
    extends TariffCommonType
{

    /**
     * НСИ 307 (Установленный размер применяется)
     * 
     */
    @XmlElement(name = "Usage", required = true)
    protected List<NsiRef> usage;
    /**
     * Величина (руб./кв.метр). Если не заполнено, то размер платы установлен в разрезе работ (услуг)
     * 
     */
    @XmlElement(name = "Price")
    protected BigDecimal price;
    /**
     * Критерии дифференциации не установлены
     * 
     */
    @XmlElement(name = "DifferentiationNotSet")
    protected Boolean differentiationNotSet;
    /**
     * Критерии дифференциации
     * 
     */
    @XmlElement(name = "Differentiation")
    protected List<DifferentiationType> differentiation;
    /**
     * Коэффициенты тарифа не установлены
     * 
     */
    @XmlElement(name = "CoefficientsNotSet")
    protected Boolean coefficientsNotSet;
    /**
     * Коэффициент тарифа
     * 
     */
    @XmlElement(name = "Coefficient")
    protected List<CoefficientType> coefficient;
    /**
     * Без детализации по видам работ (услуг)
     * 
     */
    @XmlElement(name = "WithoutJobs")
    protected Boolean withoutJobs;
    /**
     * НСИ 13 (Классификатор видов работ (услуг))
     * 
     */
    @XmlElement(name = "Job")
    protected List<ResidentialPremisesMaintenanceType.Job> job;

    /**
     * НСИ 307 (Установленный размер применяется)
     * 
     * Gets the value of the usage property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the usage property.
     */
    public List<NsiRef> getUsage() {
        if (usage == null) {
            usage = new ArrayList<>();
        }
        return this.usage;
    }

    /**
     * Величина (руб./кв.метр). Если не заполнено, то размер платы установлен в разрезе работ (услуг)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPrice()
     */
    public void setPrice(BigDecimal value) {
        this.price = value;
    }

    /**
     * Критерии дифференциации не установлены
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDifferentiationNotSet() {
        return differentiationNotSet;
    }

    /**
     * Sets the value of the differentiationNotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDifferentiationNotSet()
     */
    public void setDifferentiationNotSet(Boolean value) {
        this.differentiationNotSet = value;
    }

    /**
     * Критерии дифференциации
     * 
     * Gets the value of the differentiation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the differentiation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDifferentiation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DifferentiationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the differentiation property.
     */
    public List<DifferentiationType> getDifferentiation() {
        if (differentiation == null) {
            differentiation = new ArrayList<>();
        }
        return this.differentiation;
    }

    /**
     * Коэффициенты тарифа не установлены
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoefficientsNotSet() {
        return coefficientsNotSet;
    }

    /**
     * Sets the value of the coefficientsNotSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCoefficientsNotSet()
     */
    public void setCoefficientsNotSet(Boolean value) {
        this.coefficientsNotSet = value;
    }

    /**
     * Коэффициент тарифа
     * 
     * Gets the value of the coefficient property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coefficient property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCoefficient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoefficientType }
     * </p>
     * 
     * 
     * @return
     *     The value of the coefficient property.
     */
    public List<CoefficientType> getCoefficient() {
        if (coefficient == null) {
            coefficient = new ArrayList<>();
        }
        return this.coefficient;
    }

    /**
     * Без детализации по видам работ (услуг)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithoutJobs() {
        return withoutJobs;
    }

    /**
     * Sets the value of the withoutJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isWithoutJobs()
     */
    public void setWithoutJobs(Boolean value) {
        this.withoutJobs = value;
    }

    /**
     * НСИ 13 (Классификатор видов работ (услуг))
     * 
     * Gets the value of the job property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidentialPremisesMaintenanceType.Job }
     * </p>
     * 
     * 
     * @return
     *     The value of the job property.
     */
    public List<ResidentialPremisesMaintenanceType.Job> getJob() {
        if (job == null) {
            job = new ArrayList<>();
        }
        return this.job;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef">
     *       <sequence>
     *         <element name="Price" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="18"/>
     *               <fractionDigits value="6"/>
     *               <minExclusive value="0"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
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
        "price"
    })
    public static class Job
        extends NsiRef
    {

        /**
         * Величина, руб.
         * 
         */
        @XmlElement(name = "Price")
        protected BigDecimal price;

        /**
         * Величина, руб.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getPrice()
         */
        public void setPrice(BigDecimal value) {
            this.price = value;
        }

    }

}
