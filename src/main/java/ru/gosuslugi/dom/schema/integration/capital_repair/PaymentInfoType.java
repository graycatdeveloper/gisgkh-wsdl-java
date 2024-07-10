
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Оплата по договорам на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for PaymentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PaymentInfoType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ShortPaymentInfoType">
 *       <sequence>
 *         <element name="WorkInPayment" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="WorkInContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkContractIdentityType"/>
 *                   <element name="ExpenseofOwners" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType" minOccurs="0"/>
 *                   <element name="MeansofSupport" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "PaymentInfoType", propOrder = {
    "workInPayment"
})
public class PaymentInfoType
    extends ShortPaymentInfoType
{

    /**
     * Работа в оплате
     * 
     */
    @XmlElement(name = "WorkInPayment", required = true)
    protected List<PaymentInfoType.WorkInPayment> workInPayment;

    /**
     * Работа в оплате
     * 
     * Gets the value of the workInPayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workInPayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWorkInPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfoType.WorkInPayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the workInPayment property.
     */
    public List<PaymentInfoType.WorkInPayment> getWorkInPayment() {
        if (workInPayment == null) {
            workInPayment = new ArrayList<>();
        }
        return this.workInPayment;
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
     *         <element name="WorkInContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkContractIdentityType"/>
     *         <element name="ExpenseofOwners" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType" minOccurs="0"/>
     *         <element name="MeansofSupport" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}MoneyPositiveType" minOccurs="0"/>
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
        "workInContract",
        "expenseofOwners",
        "meansofSupport"
    })
    public static class WorkInPayment {

        /**
         * Работа в договоре (Работа должна быть в том же договоре, на который ссылается объект "Оплата")
         * 
         */
        @XmlElement(name = "WorkInContract", required = true)
        protected WorkContractIdentityType workInContract;
        /**
         * Сумма оплаты за счет средств собственников
         * 
         */
        @XmlElement(name = "ExpenseofOwners")
        protected BigDecimal expenseofOwners;
        /**
         * Сумма оплаты за счет средств поддержки
         * 
         */
        @XmlElement(name = "MeansofSupport")
        protected BigDecimal meansofSupport;

        /**
         * Работа в договоре (Работа должна быть в том же договоре, на который ссылается объект "Оплата")
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
         * Сумма оплаты за счет средств собственников
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getExpenseofOwners() {
            return expenseofOwners;
        }

        /**
         * Sets the value of the expenseofOwners property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getExpenseofOwners()
         */
        public void setExpenseofOwners(BigDecimal value) {
            this.expenseofOwners = value;
        }

        /**
         * Сумма оплаты за счет средств поддержки
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeansofSupport() {
            return meansofSupport;
        }

        /**
         * Sets the value of the meansofSupport property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMeansofSupport()
         */
        public void setMeansofSupport(BigDecimal value) {
            this.meansofSupport = value;
        }

    }

}
