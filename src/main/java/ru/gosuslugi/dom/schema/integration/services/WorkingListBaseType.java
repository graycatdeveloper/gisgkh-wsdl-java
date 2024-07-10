
package ru.gosuslugi.dom.schema.integration.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Основные сведения по перечню работ/услуг
 * 
 * <p>Java class for WorkingListBaseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkingListBaseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="MonthYearFrom">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MonthYearTo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingListBaseType", propOrder = {
    "workListGUID",
    "fiasHouseGuid",
    "monthYearFrom",
    "monthYearTo",
    "contractGUID"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.services.ImportWorkingListRequest.ApprovedWorkingListData.class,
    ru.gosuslugi.dom.schema.integration.services.ExportWorkingListResultType.WorkingList.class
})
public class WorkingListBaseType {

    /**
     * Идентификатор перечня
     * 
     */
    @XmlElement(name = "WorkListGUID")
    protected String workListGUID;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Период "с"
     * 
     */
    @XmlElement(name = "MonthYearFrom", required = true)
    protected WorkingListBaseType.MonthYearFrom monthYearFrom;
    /**
     * Период "по"
     * 
     */
    @XmlElement(name = "MonthYearTo", required = true)
    protected WorkingListBaseType.MonthYearTo monthYearTo;
    /**
     * Идентификатор договора управления ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID")
    protected String contractGUID;

    /**
     * Идентификатор перечня
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkListGUID() {
        return workListGUID;
    }

    /**
     * Sets the value of the workListGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkListGUID()
     */
    public void setWorkListGUID(String value) {
        this.workListGUID = value;
    }

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Период "с"
     * 
     * @return
     *     possible object is
     *     {@link WorkingListBaseType.MonthYearFrom }
     *     
     */
    public WorkingListBaseType.MonthYearFrom getMonthYearFrom() {
        return monthYearFrom;
    }

    /**
     * Sets the value of the monthYearFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingListBaseType.MonthYearFrom }
     *     
     * @see #getMonthYearFrom()
     */
    public void setMonthYearFrom(WorkingListBaseType.MonthYearFrom value) {
        this.monthYearFrom = value;
    }

    /**
     * Период "по"
     * 
     * @return
     *     possible object is
     *     {@link WorkingListBaseType.MonthYearTo }
     *     
     */
    public WorkingListBaseType.MonthYearTo getMonthYearTo() {
        return monthYearTo;
    }

    /**
     * Sets the value of the monthYearTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkingListBaseType.MonthYearTo }
     *     
     * @see #getMonthYearTo()
     */
    public void setMonthYearTo(WorkingListBaseType.MonthYearTo value) {
        this.monthYearTo = value;
    }

    /**
     * Идентификатор договора управления ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGUID() {
        return contractGUID;
    }

    /**
     * Sets the value of the contractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGUID()
     */
    public void setContractGUID(String value) {
        this.contractGUID = value;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
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
        "month",
        "year"
    })
    public static class MonthYearFrom {

        /**
         * Месяц
         * 
         */
        @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected int month;
        /**
         * Год
         * 
         */
        @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected short year;

        /**
         * Месяц
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

        /**
         * Год
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
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
        "month",
        "year"
    })
    public static class MonthYearTo {

        /**
         * Месяц
         * 
         */
        @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected int month;
        /**
         * Год
         * 
         */
        @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected short year;

        /**
         * Месяц
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

        /**
         * Год
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

    }

}
