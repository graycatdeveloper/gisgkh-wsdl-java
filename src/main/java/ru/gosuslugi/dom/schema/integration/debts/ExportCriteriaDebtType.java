
package ru.gosuslugi.dom.schema.integration.debts;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.PeriodOpen;


/**
 * Тип данных, описывающий критерии экспорта сведений о задолженностях за ЖКУ
 * 
 * <p>Java class for ExportCriteriaDebtType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCriteriaDebtType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DebtPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}PeriodOpen" minOccurs="0"/>
 *         <element name="DebtPlacingPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}PeriodOpen" minOccurs="0"/>
 *         <element name="DebtRepaymentPlacingPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}PeriodOpen" minOccurs="0"/>
 *         <element name="DebtStatuses" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/debts/}StatusType" maxOccurs="2"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DebtRepaymentStatuses" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/debts/}RepaimentStatusType" maxOccurs="2"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="DebtObject" type="{http://dom.gosuslugi.ru/schema/integration/debts/}ExportDebtObjectRequestType" minOccurs="0"/>
 *         <element name="JudicalActNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebtorData" type="{http://dom.gosuslugi.ru/schema/integration/debts/}ExportDebtorRequestType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCriteriaDebtType", propOrder = {
    "debtPeriod",
    "debtPlacingPeriod",
    "debtRepaymentPlacingPeriod",
    "debtStatuses",
    "debtRepaymentStatuses",
    "debtObject",
    "judicalActNumber",
    "debtorData"
})
public class ExportCriteriaDebtType {

    /**
     * Дата вступления в силу судебного акта
     * 
     */
    @XmlElement(name = "DebtPeriod")
    protected PeriodOpen debtPeriod;
    /**
     * Период размещения сведений о задолженностях за ЖКУ
     * 
     */
    @XmlElement(name = "DebtPlacingPeriod")
    protected PeriodOpen debtPlacingPeriod;
    /**
     * Период размещения сведений о погашении задолженностях за ЖКУ
     * 
     */
    @XmlElement(name = "DebtRepaymentPlacingPeriod")
    protected PeriodOpen debtRepaymentPlacingPeriod;
    /**
     * Список статусов сведений о задолженностях за ЖКУ
     * 
     */
    @XmlElement(name = "DebtStatuses")
    protected ExportCriteriaDebtType.DebtStatuses debtStatuses;
    /**
     * Список статусов сведений о погашении задолженности за ЖКУ
     * 
     */
    @XmlElement(name = "DebtRepaymentStatuses")
    protected ExportCriteriaDebtType.DebtRepaymentStatuses debtRepaymentStatuses;
    /**
     * Объект жилищного фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "DebtObject")
    protected ExportDebtObjectRequestType debtObject;
    /**
     * Номер судебного акта
     * 
     */
    @XmlElement(name = "JudicalActNumber")
    protected String judicalActNumber;
    /**
     * Cведения о гражданине, у которого имеется задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "DebtorData")
    protected ExportDebtorRequestType debtorData;

    /**
     * Дата вступления в силу судебного акта
     * 
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *     
     */
    public PeriodOpen getDebtPeriod() {
        return debtPeriod;
    }

    /**
     * Sets the value of the debtPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *     
     * @see #getDebtPeriod()
     */
    public void setDebtPeriod(PeriodOpen value) {
        this.debtPeriod = value;
    }

    /**
     * Период размещения сведений о задолженностях за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *     
     */
    public PeriodOpen getDebtPlacingPeriod() {
        return debtPlacingPeriod;
    }

    /**
     * Sets the value of the debtPlacingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *     
     * @see #getDebtPlacingPeriod()
     */
    public void setDebtPlacingPeriod(PeriodOpen value) {
        this.debtPlacingPeriod = value;
    }

    /**
     * Период размещения сведений о погашении задолженностях за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *     
     */
    public PeriodOpen getDebtRepaymentPlacingPeriod() {
        return debtRepaymentPlacingPeriod;
    }

    /**
     * Sets the value of the debtRepaymentPlacingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *     
     * @see #getDebtRepaymentPlacingPeriod()
     */
    public void setDebtRepaymentPlacingPeriod(PeriodOpen value) {
        this.debtRepaymentPlacingPeriod = value;
    }

    /**
     * Список статусов сведений о задолженностях за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaDebtType.DebtStatuses }
     *     
     */
    public ExportCriteriaDebtType.DebtStatuses getDebtStatuses() {
        return debtStatuses;
    }

    /**
     * Sets the value of the debtStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaDebtType.DebtStatuses }
     *     
     * @see #getDebtStatuses()
     */
    public void setDebtStatuses(ExportCriteriaDebtType.DebtStatuses value) {
        this.debtStatuses = value;
    }

    /**
     * Список статусов сведений о погашении задолженности за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaDebtType.DebtRepaymentStatuses }
     *     
     */
    public ExportCriteriaDebtType.DebtRepaymentStatuses getDebtRepaymentStatuses() {
        return debtRepaymentStatuses;
    }

    /**
     * Sets the value of the debtRepaymentStatuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaDebtType.DebtRepaymentStatuses }
     *     
     * @see #getDebtRepaymentStatuses()
     */
    public void setDebtRepaymentStatuses(ExportCriteriaDebtType.DebtRepaymentStatuses value) {
        this.debtRepaymentStatuses = value;
    }

    /**
     * Объект жилищного фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtObjectRequestType }
     *     
     */
    public ExportDebtObjectRequestType getDebtObject() {
        return debtObject;
    }

    /**
     * Sets the value of the debtObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtObjectRequestType }
     *     
     * @see #getDebtObject()
     */
    public void setDebtObject(ExportDebtObjectRequestType value) {
        this.debtObject = value;
    }

    /**
     * Номер судебного акта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudicalActNumber() {
        return judicalActNumber;
    }

    /**
     * Sets the value of the judicalActNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getJudicalActNumber()
     */
    public void setJudicalActNumber(String value) {
        this.judicalActNumber = value;
    }

    /**
     * Cведения о гражданине, у которого имеется задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtorRequestType }
     *     
     */
    public ExportDebtorRequestType getDebtorData() {
        return debtorData;
    }

    /**
     * Sets the value of the debtorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtorRequestType }
     *     
     * @see #getDebtorData()
     */
    public void setDebtorData(ExportDebtorRequestType value) {
        this.debtorData = value;
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
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/debts/}RepaimentStatusType" maxOccurs="2"/>
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
        "status"
    })
    public static class DebtRepaymentStatuses {

        /**
         * Статус сведений о погашении задолженности. Возможные значения: 
         * PAID – Задолженность погашена; 
         * UNPAID - Задолженность не погашена.
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "string")
        protected List<RepaimentStatusType> status;

        /**
         * Статус сведений о погашении задолженности. Возможные значения: 
         * PAID – Задолженность погашена; 
         * UNPAID - Задолженность не погашена.
         * 
         * Gets the value of the status property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RepaimentStatusType }
         * </p>
         * 
         * 
         * @return
         *     The value of the status property.
         */
        public List<RepaimentStatusType> getStatus() {
            if (status == null) {
                status = new ArrayList<>();
            }
            return this.status;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/debts/}StatusType" maxOccurs="2"/>
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
        "status"
    })
    public static class DebtStatuses {

        /**
         * Статус сведений о задолженности. Возможные значения: 
         * PUBLISHED - Информация размещена; 
         * CANCELLED - Информация аннулирована.
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "string")
        protected List<StatusType> status;

        /**
         * Статус сведений о задолженности. Возможные значения: 
         * PUBLISHED - Информация размещена; 
         * CANCELLED - Информация аннулирована.
         * 
         * Gets the value of the status property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusType }
         * </p>
         * 
         * 
         * @return
         *     The value of the status property.
         */
        public List<StatusType> getStatus() {
            if (status == null) {
                status = new ArrayList<>();
            }
            return this.status;
        }

    }

}
