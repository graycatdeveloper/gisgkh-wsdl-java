
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
 * Экспортирумые сведения о гражданине, получающем субсидии
 * 
 * <p>Java class for ExportCitizenSubsidyType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCitizenSubsidyType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Overview">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyOverviewType">
 *                 <sequence>
 *                   <element name="CitizenSubsidyGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/msp/}Status"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Calculation" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportCitizenSubsidyCalculationType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="Payment" maxOccurs="1000" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportPaymentType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCitizenSubsidyType", propOrder = {
    "overview",
    "calculation",
    "payment"
})
public class ExportCitizenSubsidyType {

    /**
     * Общие сведения
     * 
     */
    @XmlElement(name = "Overview", required = true)
    protected ExportCitizenSubsidyType.Overview overview;
    /**
     * Расчеты и перерасчеты
     * 
     */
    @XmlElement(name = "Calculation")
    protected List<ExportCitizenSubsidyCalculationType> calculation;
    /**
     * Выплаты
     * 
     */
    @XmlElement(name = "Payment")
    protected List<ExportCitizenSubsidyType.Payment> payment;

    /**
     * Общие сведения
     * 
     * @return
     *     possible object is
     *     {@link ExportCitizenSubsidyType.Overview }
     *     
     */
    public ExportCitizenSubsidyType.Overview getOverview() {
        return overview;
    }

    /**
     * Sets the value of the overview property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCitizenSubsidyType.Overview }
     *     
     * @see #getOverview()
     */
    public void setOverview(ExportCitizenSubsidyType.Overview value) {
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
     * {@link ExportCitizenSubsidyCalculationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the calculation property.
     */
    public List<ExportCitizenSubsidyCalculationType> getCalculation() {
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
     * {@link ExportCitizenSubsidyType.Payment }
     * </p>
     * 
     * 
     * @return
     *     The value of the payment property.
     */
    public List<ExportCitizenSubsidyType.Payment> getPayment() {
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}CitizenSubsidyOverviewType">
     *       <sequence>
     *         <element name="CitizenSubsidyGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "citizenSubsidyGuid",
        "status"
    })
    public static class Overview
        extends CitizenSubsidyOverviewType
    {

        /**
         * Идентификатор информации о гражданине, получающем субсидии
         * 
         */
        @XmlElement(name = "CitizenSubsidyGuid", required = true)
        protected String citizenSubsidyGuid;
        /**
         * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String status;

        /**
         * Идентификатор информации о гражданине, получающем субсидии
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCitizenSubsidyGuid() {
            return citizenSubsidyGuid;
        }

        /**
         * Sets the value of the citizenSubsidyGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getCitizenSubsidyGuid()
         */
        public void setCitizenSubsidyGuid(String value) {
            this.citizenSubsidyGuid = value;
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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}ExportPaymentType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Payment
        extends ExportPaymentType
    {


    }

}
