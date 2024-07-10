
package ru.gosuslugi.dom.schema.integration.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип данных, описывающий оценку качества в результатах экспорта
 * 
 * <p>Java class for exportQualityAssessmentExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportQualityAssessmentExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Works" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Work" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="DayCount" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         <minInclusive value="1"/>
 *                         <maxInclusive value="31"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Cost" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="10"/>
 *                         <fractionDigits value="2"/>
 *                         <minInclusive value="0"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="CalendarDaysCount" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                         <minInclusive value="1"/>
 *                         <maxInclusive value="31"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="CostReductionSize" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <totalDigits value="10"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Acts" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsExportType" maxOccurs="unbounded"/>
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
@XmlType(name = "exportQualityAssessmentExportType", propOrder = {
    "reportingPeriodGuid",
    "works"
})
public class ExportQualityAssessmentExportType {

    /**
     * Ссылка на период отчётности о выполненных работах
     * 
     */
    @XmlElement(required = true)
    protected String reportingPeriodGuid;
    /**
     * Выполненные работы, оказанные услуги, для котрых размещена информация об оцеке качества
     * 
     */
    @XmlElement(name = "Works", required = true)
    protected List<ExportQualityAssessmentExportType.Works> works;

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
     * Выполненные работы, оказанные услуги, для котрых размещена информация об оцеке качества
     * 
     * Gets the value of the works property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the works property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWorks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportQualityAssessmentExportType.Works }
     * </p>
     * 
     * 
     * @return
     *     The value of the works property.
     */
    public List<ExportQualityAssessmentExportType.Works> getWorks() {
        if (works == null) {
            works = new ArrayList<>();
        }
        return this.works;
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
     *         <element name="Work" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="DayCount" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               <minInclusive value="1"/>
     *               <maxInclusive value="31"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Cost" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="10"/>
     *               <fractionDigits value="2"/>
     *               <minInclusive value="0"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="CalendarDaysCount" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *               <minInclusive value="1"/>
     *               <maxInclusive value="31"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="CostReductionSize" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <totalDigits value="10"/>
     *               <fractionDigits value="2"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Acts" type="{http://dom.gosuslugi.ru/schema/integration/services/}ActDetailsExportType" maxOccurs="unbounded"/>
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
        "work",
        "workType",
        "dayCount",
        "cost",
        "calendarDaysCount",
        "costReductionSize",
        "acts"
    })
    public static class Works {

        /**
         * Выполненная работа, оказанная услуга
         * 
         */
        @XmlElement(name = "Work", required = true)
        protected NsiRef work;
        /**
         * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
         * 
         */
        @XmlElement(name = "WorkType", required = true)
        protected NsiRef workType;
        /**
         * Количество дней, в течение которых выполнялась (оказывалась) работа (услуга) ненадлежащего качества. 
         * Элемент доступен и обязателен для заполнения, если по данной работе имеется акт нарушения качества.
         * 
         */
        @XmlElement(name = "DayCount")
        protected Integer dayCount;
        /**
         * Стоимость в составе ежемесячной платы за содержание и ремонт жилого помещения (рублей)
         * 
         */
        @XmlElement(name = "Cost")
        protected BigDecimal cost;
        /**
         * Количество календарных дней в месяце
         * 
         */
        @XmlElement(name = "CalendarDaysCount")
        protected Integer calendarDaysCount;
        /**
         * Размер уменьшения платы за содержание и ремонт жилого помещения (рублей)
         * 
         */
        @XmlElement(name = "CostReductionSize")
        protected BigDecimal costReductionSize;
        @XmlElement(name = "Acts", required = true)
        protected List<ActDetailsExportType> acts;

        /**
         * Выполненная работа, оказанная услуга
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getWork() {
            return work;
        }

        /**
         * Sets the value of the work property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getWork()
         */
        public void setWork(NsiRef value) {
            this.work = value;
        }

        /**
         * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getWorkType() {
            return workType;
        }

        /**
         * Sets the value of the workType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getWorkType()
         */
        public void setWorkType(NsiRef value) {
            this.workType = value;
        }

        /**
         * Количество дней, в течение которых выполнялась (оказывалась) работа (услуга) ненадлежащего качества. 
         * Элемент доступен и обязателен для заполнения, если по данной работе имеется акт нарушения качества.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDayCount() {
            return dayCount;
        }

        /**
         * Sets the value of the dayCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getDayCount()
         */
        public void setDayCount(Integer value) {
            this.dayCount = value;
        }

        /**
         * Стоимость в составе ежемесячной платы за содержание и ремонт жилого помещения (рублей)
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCost() {
            return cost;
        }

        /**
         * Sets the value of the cost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCost()
         */
        public void setCost(BigDecimal value) {
            this.cost = value;
        }

        /**
         * Количество календарных дней в месяце
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCalendarDaysCount() {
            return calendarDaysCount;
        }

        /**
         * Sets the value of the calendarDaysCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         * @see #getCalendarDaysCount()
         */
        public void setCalendarDaysCount(Integer value) {
            this.calendarDaysCount = value;
        }

        /**
         * Размер уменьшения платы за содержание и ремонт жилого помещения (рублей)
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCostReductionSize() {
            return costReductionSize;
        }

        /**
         * Sets the value of the costReductionSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getCostReductionSize()
         */
        public void setCostReductionSize(BigDecimal value) {
            this.costReductionSize = value;
        }

        /**
         * Gets the value of the acts property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acts property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getActs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActDetailsExportType }
         * </p>
         * 
         * 
         * @return
         *     The value of the acts property.
         */
        public List<ActDetailsExportType> getActs() {
            if (acts == null) {
                acts = new ArrayList<>();
            }
            return this.acts;
        }

    }

}
