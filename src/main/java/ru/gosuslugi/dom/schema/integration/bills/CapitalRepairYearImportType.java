
package ru.gosuslugi.dom.schema.integration.bills;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapitalRepairYearImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CapitalRepairYearImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CapitalRepairMonthlyCharge" maxOccurs="12" minOccurs="12">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}CapitalRepairMonthlyImportType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapitalRepairYearImportType", propOrder = {
    "capitalRepairMonthlyCharge",
    "year",
    "orgPPAGUID",
    "paymentInformationKey"
})
public class CapitalRepairYearImportType {

    @XmlElement(name = "CapitalRepairMonthlyCharge", required = true)
    protected List<CapitalRepairYearImportType.CapitalRepairMonthlyCharge> capitalRepairMonthlyCharge;
    /**
     * Год расчетного периода
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected short year;
    /**
     * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
     * 
     */
    protected String orgPPAGUID;
    /**
     * Ссылка на платежные реквизиты
     * 
     */
    @XmlElement(name = "PaymentInformationKey")
    protected String paymentInformationKey;

    /**
     * Gets the value of the capitalRepairMonthlyCharge property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capitalRepairMonthlyCharge property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCapitalRepairMonthlyCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapitalRepairYearImportType.CapitalRepairMonthlyCharge }
     * </p>
     * 
     * 
     * @return
     *     The value of the capitalRepairMonthlyCharge property.
     */
    public List<CapitalRepairYearImportType.CapitalRepairMonthlyCharge> getCapitalRepairMonthlyCharge() {
        if (capitalRepairMonthlyCharge == null) {
            capitalRepairMonthlyCharge = new ArrayList<>();
        }
        return this.capitalRepairMonthlyCharge;
    }

    /**
     * Год расчетного периода
     * 
     */
    public short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(short value) {
        this.year = value;
    }

    /**
     * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPPAGUID() {
        return orgPPAGUID;
    }

    /**
     * Sets the value of the orgPPAGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrgPPAGUID()
     */
    public void setOrgPPAGUID(String value) {
        this.orgPPAGUID = value;
    }

    /**
     * Ссылка на платежные реквизиты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationKey() {
        return paymentInformationKey;
    }

    /**
     * Sets the value of the paymentInformationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentInformationKey()
     */
    public void setPaymentInformationKey(String value) {
        this.paymentInformationKey = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}CapitalRepairMonthlyImportType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
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
        "month"
    })
    public static class CapitalRepairMonthlyCharge
        extends CapitalRepairMonthlyImportType
    {

        /**
         * Месяц расчетного периода
         * 
         */
        @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected int month;

        /**
         * Месяц расчетного периода
         * 
         */
        public int getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         */
        public void setMonth(int value) {
            this.month = value;
        }

    }

}
