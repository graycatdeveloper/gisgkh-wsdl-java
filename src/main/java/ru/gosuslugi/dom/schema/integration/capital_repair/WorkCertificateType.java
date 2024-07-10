
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Работа в акте выполненных работ (оказанных услуг)
 * 
 * <p>Java class for WorkCertificateType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkCertificateType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WorkInContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkContractIdentityType"/>
 *         <element name="WorkCost" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyShortType"/>
 *         <element name="WorkValue">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               <fractionDigits value="3"/>
 *               <minInclusive value="0"/>
 *               <totalDigits value="20"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice>
 *           <element name="AppForUse">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="StartDateGuarantee" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="EndDateGuarantee" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="NotAppForUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkCertificateType", propOrder = {
    "workInContract",
    "workCost",
    "workValue",
    "appForUse",
    "notAppForUse"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.CertificateType.Work.class,
    ru.gosuslugi.dom.schema.integration.capital_repair.ExportCertificateType.Work.class
})
public class WorkCertificateType {

    /**
     * Работа в договоре
     * 
     */
    @XmlElement(name = "WorkInContract", required = true)
    protected WorkContractIdentityType workInContract;
    /**
     * Стоимость работ
     * 
     */
    @XmlElement(name = "WorkCost", required = true)
    protected BigDecimal workCost;
    /**
     * Объем работ
     * 
     */
    @XmlElement(name = "WorkValue", required = true)
    protected BigDecimal workValue;
    /**
     * Принят в эксплуатацию
     * 
     */
    @XmlElement(name = "AppForUse")
    protected WorkCertificateType.AppForUse appForUse;
    /**
     * Не принят в эксплуатацию
     * 
     */
    @XmlElement(name = "NotAppForUse")
    protected Boolean notAppForUse;

    /**
     * Работа в договоре
     * 
     * @return
     *     possible object is
     *     {@link WorkContractIdentityType }
     *     
     */
    public WorkContractIdentityType getWorkInContract() {
        return workInContract;
    }

    /**
     * Sets the value of the workInContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkContractIdentityType }
     *     
     * @see #getWorkInContract()
     */
    public void setWorkInContract(WorkContractIdentityType value) {
        this.workInContract = value;
    }

    /**
     * Стоимость работ
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkCost() {
        return workCost;
    }

    /**
     * Sets the value of the workCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getWorkCost()
     */
    public void setWorkCost(BigDecimal value) {
        this.workCost = value;
    }

    /**
     * Объем работ
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWorkValue() {
        return workValue;
    }

    /**
     * Sets the value of the workValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getWorkValue()
     */
    public void setWorkValue(BigDecimal value) {
        this.workValue = value;
    }

    /**
     * Принят в эксплуатацию
     * 
     * @return
     *     possible object is
     *     {@link WorkCertificateType.AppForUse }
     *     
     */
    public WorkCertificateType.AppForUse getAppForUse() {
        return appForUse;
    }

    /**
     * Sets the value of the appForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkCertificateType.AppForUse }
     *     
     * @see #getAppForUse()
     */
    public void setAppForUse(WorkCertificateType.AppForUse value) {
        this.appForUse = value;
    }

    /**
     * Не принят в эксплуатацию
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotAppForUse() {
        return notAppForUse;
    }

    /**
     * Sets the value of the notAppForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isNotAppForUse()
     */
    public void setNotAppForUse(Boolean value) {
        this.notAppForUse = value;
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
     *         <element name="StartDateGuarantee" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="EndDateGuarantee" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
        "startDateGuarantee",
        "endDateGuarantee"
    })
    public static class AppForUse {

        /**
         * Дата начала гарантийного срока
         * 
         */
        @XmlElement(name = "StartDateGuarantee", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDateGuarantee;
        /**
         * Дата окончания гарантийного срока
         * 
         */
        @XmlElement(name = "EndDateGuarantee", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDateGuarantee;

        /**
         * Дата начала гарантийного срока
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDateGuarantee() {
            return startDateGuarantee;
        }

        /**
         * Sets the value of the startDateGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getStartDateGuarantee()
         */
        public void setStartDateGuarantee(XMLGregorianCalendar value) {
            this.startDateGuarantee = value;
        }

        /**
         * Дата окончания гарантийного срока
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDateGuarantee() {
            return endDateGuarantee;
        }

        /**
         * Sets the value of the endDateGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEndDateGuarantee()
         */
        public void setEndDateGuarantee(XMLGregorianCalendar value) {
            this.endDateGuarantee = value;
        }

    }

}
