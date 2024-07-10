
package ru.gosuslugi.dom.schema.integration.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Результат экспорта плана работ/услуг
 * 
 * <p>Java class for exportWorkingPlanResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportWorkingPlanResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WorkingPlan">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                   <element name="ReportingPeriod" maxOccurs="12">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="MonthYear">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="WorkPlanItem" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="WorkPlanItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ModificationDate"/>
 *                                       <element name="WorkGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                       <element name="workTypeGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                                       <element name="sortIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
 *                                       <choice>
 *                                         <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *                                         <element name="WorkCount" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
 *                                       </choice>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
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
@XmlType(name = "exportWorkingPlanResultType", propOrder = {
    "workingPlan"
})
public class ExportWorkingPlanResultType {

    /**
     * План работ/услуг
     * 
     */
    @XmlElement(name = "WorkingPlan", required = true)
    protected ExportWorkingPlanResultType.WorkingPlan workingPlan;

    /**
     * План работ/услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportWorkingPlanResultType.WorkingPlan }
     *     
     */
    public ExportWorkingPlanResultType.WorkingPlan getWorkingPlan() {
        return workingPlan;
    }

    /**
     * Sets the value of the workingPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportWorkingPlanResultType.WorkingPlan }
     *     
     * @see #getWorkingPlan()
     */
    public void setWorkingPlan(ExportWorkingPlanResultType.WorkingPlan value) {
        this.workingPlan = value;
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
     *         <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *         <element name="ReportingPeriod" maxOccurs="12">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="MonthYear">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="WorkPlanItem" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="WorkPlanItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ModificationDate"/>
     *                             <element name="WorkGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                             <element name="workTypeGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                             <element name="sortIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
     *                             <choice>
     *                               <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
     *                               <element name="WorkCount" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
     *                             </choice>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
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
    @XmlType(name = "", propOrder = {
        "workListGUID",
        "year",
        "fiasHouseGuid",
        "reportingPeriod"
    })
    public static class WorkingPlan {

        /**
         * Идентификатор перечня работ/услуг
         * 
         */
        @XmlElement(name = "WorkListGUID", required = true)
        protected String workListGUID;
        /**
         * Год в рамках периода перечня
         * 
         */
        @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
        protected short year;
        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid", required = true)
        protected String fiasHouseGuid;
        @XmlElement(name = "ReportingPeriod", required = true)
        protected List<ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod> reportingPeriod;

        /**
         * Идентификатор перечня работ/услуг
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
         * Год в рамках периода перечня
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
         * Gets the value of the reportingPeriod property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportingPeriod property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getReportingPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod }
         * </p>
         * 
         * 
         * @return
         *     The value of the reportingPeriod property.
         */
        public List<ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod> getReportingPeriod() {
            if (reportingPeriod == null) {
                reportingPeriod = new ArrayList<>();
            }
            return this.reportingPeriod;
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
         *         <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="MonthYear">
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
         *         <element name="WorkPlanItem" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="WorkPlanItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ModificationDate"/>
         *                   <element name="WorkGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   <element name="workTypeGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *                   <element name="sortIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
         *                   <choice>
         *                     <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
         *                     <element name="WorkCount" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
         *                   </choice>
         *                 </sequence>
         *               </restriction>
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
        @XmlType(name = "", propOrder = {
            "reportingPeriodGuid",
            "monthYear",
            "workPlanItem"
        })
        public static class ReportingPeriod {

            /**
             * Ссылка на период отчётности о выполненных работах
             * 
             */
            @XmlElement(required = true)
            protected String reportingPeriodGuid;
            /**
             * Год и месяц отчетного периода
             * 
             */
            @XmlElement(name = "MonthYear", required = true)
            protected ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear monthYear;
            /**
             * План по работе/услуге
             * 
             */
            @XmlElement(name = "WorkPlanItem")
            protected List<ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem> workPlanItem;

            /**
             * Ссылка на период отчётности о выполненных работах
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingPeriodGuid() {
                return reportingPeriodGuid;
            }

            /**
             * Sets the value of the reportingPeriodGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReportingPeriodGuid()
             */
            public void setReportingPeriodGuid(String value) {
                this.reportingPeriodGuid = value;
            }

            /**
             * Год и месяц отчетного периода
             * 
             * @return
             *     possible object is
             *     {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear }
             *     
             */
            public ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear getMonthYear() {
                return monthYear;
            }

            /**
             * Sets the value of the monthYear property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear }
             *     
             * @see #getMonthYear()
             */
            public void setMonthYear(ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.MonthYear value) {
                this.monthYear = value;
            }

            /**
             * План по работе/услуге
             * 
             * Gets the value of the workPlanItem property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the workPlanItem property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getWorkPlanItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem }
             * </p>
             * 
             * 
             * @return
             *     The value of the workPlanItem property.
             */
            public List<ExportWorkingPlanResultType.WorkingPlan.ReportingPeriod.WorkPlanItem> getWorkPlanItem() {
                if (workPlanItem == null) {
                    workPlanItem = new ArrayList<>();
                }
                return this.workPlanItem;
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
            public static class MonthYear {

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
             *         <element name="WorkPlanItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ModificationDate"/>
             *         <element name="WorkGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         <element name="workTypeGUID" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
             *         <element name="sortIndex" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
             *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
             *         <choice>
             *           <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
             *           <element name="WorkCount" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
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
            @XmlType(name = "", propOrder = {
                "workPlanItemGUID",
                "modificationDate",
                "workGUID",
                "workTypeGUID",
                "sortIndex",
                "okei",
                "workDate",
                "workCount"
            })
            public static class WorkPlanItem {

                /**
                 * Идентификатор работы/услуги перечня
                 * 
                 */
                @XmlElement(name = "WorkPlanItemGUID", required = true)
                protected String workPlanItemGUID;
                /**
                 * Дата модификации объекта
                 * 
                 */
                @XmlElement(name = "ModificationDate", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar modificationDate;
                /**
                 * Ссылка на работу (услугу) в справочнике видов работ и услуг для организации (НСИ 59)
                 * 
                 */
                @XmlElement(name = "WorkGUID", required = true)
                protected NsiRef workGUID;
                /**
                 * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
                 * 
                 */
                protected NsiRef workTypeGUID;
                /**
                 * Порядковый номер строки в перечне
                 * 
                 */
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sortIndex;
                /**
                 * Код ОКЕИ
                 * 
                 */
                @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
                protected String okei;
                /**
                 * Даты начала работ по плану
                 * 
                 */
                @XmlElement(name = "WorkDate")
                @XmlSchemaType(name = "date")
                protected List<XMLGregorianCalendar> workDate;
                /**
                 * Количество работ
                 * 
                 */
                @XmlElement(name = "WorkCount")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected Integer workCount;

                /**
                 * Идентификатор работы/услуги перечня
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWorkPlanItemGUID() {
                    return workPlanItemGUID;
                }

                /**
                 * Sets the value of the workPlanItemGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getWorkPlanItemGUID()
                 */
                public void setWorkPlanItemGUID(String value) {
                    this.workPlanItemGUID = value;
                }

                /**
                 * Дата модификации объекта
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getModificationDate() {
                    return modificationDate;
                }

                /**
                 * Sets the value of the modificationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getModificationDate()
                 */
                public void setModificationDate(XMLGregorianCalendar value) {
                    this.modificationDate = value;
                }

                /**
                 * Ссылка на работу (услугу) в справочнике видов работ и услуг для организации (НСИ 59)
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getWorkGUID() {
                    return workGUID;
                }

                /**
                 * Sets the value of the workGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getWorkGUID()
                 */
                public void setWorkGUID(NsiRef value) {
                    this.workGUID = value;
                }

                /**
                 * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getWorkTypeGUID() {
                    return workTypeGUID;
                }

                /**
                 * Sets the value of the workTypeGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getWorkTypeGUID()
                 */
                public void setWorkTypeGUID(NsiRef value) {
                    this.workTypeGUID = value;
                }

                /**
                 * Порядковый номер строки в перечне
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSortIndex() {
                    return sortIndex;
                }

                /**
                 * Sets the value of the sortIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 * @see #getSortIndex()
                 */
                public void setSortIndex(BigInteger value) {
                    this.sortIndex = value;
                }

                /**
                 * Код ОКЕИ
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOKEI() {
                    return okei;
                }

                /**
                 * Sets the value of the okei property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getOKEI()
                 */
                public void setOKEI(String value) {
                    this.okei = value;
                }

                /**
                 * Даты начала работ по плану
                 * 
                 * Gets the value of the workDate property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the workDate property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getWorkDate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link XMLGregorianCalendar }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the workDate property.
                 */
                public List<XMLGregorianCalendar> getWorkDate() {
                    if (workDate == null) {
                        workDate = new ArrayList<>();
                    }
                    return this.workDate;
                }

                /**
                 * Количество работ
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getWorkCount() {
                    return workCount;
                }

                /**
                 * Sets the value of the workCount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 * @see #getWorkCount()
                 */
                public void setWorkCount(Integer value) {
                    this.workCount = value;
                }

            }

        }

    }

}
