
package ru.gosuslugi.dom.schema.integration.msp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Экспортируемые сведения о гражданине, получающем компансации расходов
 * 
 * <p>Java class for ExportCitizenCompensationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCitizenCompensationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Overview">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationOverviewType">
 *                 <sequence>
 *                   <element name="CitizenCompensationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/msp/}Status"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Calculation" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportCitizenCompensationCalculationType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="Payment" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportPaymentType" maxOccurs="1000" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCitizenCompensationType", propOrder = {
    "overview",
    "calculation",
    "payment"
})
public class ExportCitizenCompensationType {

    /**
     * Общие сведения
     * 
     */
    @XmlElement(name = "Overview", required = true)
    protected ExportCitizenCompensationType.Overview overview;
    /**
     * Расчеты и перерасчеты
     * 
     */
    @XmlElement(name = "Calculation")
    protected List<ExportCitizenCompensationCalculationType> calculation;
    /**
     * Выплаты
     * 
     */
    @XmlElement(name = "Payment")
    protected List<ExportPaymentType> payment;

    /**
     * Общие сведения
     * 
     * @return
     *     possible object is
     *     {@link ExportCitizenCompensationType.Overview }
     *     
     */
    public ExportCitizenCompensationType.Overview getOverview() {
        return overview;
    }

    /**
     * Sets the value of the overview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCitizenCompensationType.Overview }
     *     
     * @see #getOverview()
     */
    public void setOverview(ExportCitizenCompensationType.Overview value) {
        this.overview = value;
    }

    /**
     * Расчеты и перерасчеты
     * 
     * Gets the value of the calculation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCitizenCompensationCalculationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the calculation property.
     */
    public List<ExportCitizenCompensationCalculationType> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<>();
        }
        return this.calculation;
    }

    /**
     * Выплаты
     * 
     * Gets the value of the payment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportPaymentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the payment property.
     */
    public List<ExportPaymentType> getPayment() {
        if (payment == null) {
            payment = new ArrayList<>();
        }
        return this.payment;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenCompensationOverviewType">
     *       <sequence>
     *         <element name="CitizenCompensationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/msp/}Status"/>
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
        "citizenCompensationGuid",
        "status"
    })
    public static class Overview
        extends CitizenCompensationOverviewType
    {

        /**
         * Идентификатор информации о гражданине в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CitizenCompensationGuid", required = true)
        protected String citizenCompensationGuid;
        /**
         * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String status;

        /**
         * Идентификатор информации о гражданине в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitizenCompensationGuid() {
            return citizenCompensationGuid;
        }

        /**
         * Sets the value of the citizenCompensationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCitizenCompensationGuid()
         */
        public void setCitizenCompensationGuid(String value) {
            this.citizenCompensationGuid = value;
        }

        /**
         * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getStatus()
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
