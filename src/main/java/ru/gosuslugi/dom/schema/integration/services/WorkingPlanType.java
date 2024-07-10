
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * План по перечню работ/услуг
 * 
 * <p>Java class for WorkingPlanType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="WorkingPlanType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *         <element name="WorkPlanItem" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="WorkListItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                   <choice>
 *                     <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded"/>
 *                     <sequence>
 *                       <element name="WorkCount" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
 *                     </sequence>
 *                   </choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingPlanType", propOrder = {
    "workListGUID",
    "year",
    "workPlanItem",
    "transportGUID"
})
public class WorkingPlanType {

    /**
     * Идентификатор перечня работ/услуг
     * 
     */
    @XmlElement(name = "WorkListGUID", required = true)
    protected String workListGUID;
    /**
     * Год
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected short year;
    /**
     * План по работе/услуге
     * 
     */
    @XmlElement(name = "WorkPlanItem", required = true)
    protected List<WorkingPlanType.WorkPlanItem> workPlanItem;
    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;

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
     * {@link WorkingPlanType.WorkPlanItem }
     * </p>
     * 
     * 
     * @return
     *     The value of the workPlanItem property.
     */
    public List<WorkingPlanType.WorkPlanItem> getWorkPlanItem() {
        if (workPlanItem == null) {
            workPlanItem = new ArrayList<>();
        }
        return this.workPlanItem;
    }

    /**
     * Транспортный идентификатор
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportGUID() {
        return transportGUID;
    }

    /**
     * Sets the value of the transportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransportGUID()
     */
    public void setTransportGUID(String value) {
        this.transportGUID = value;
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
     *         <element name="WorkListItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *         <choice>
     *           <element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded"/>
     *           <sequence>
     *             <element name="WorkCount" type="{http://dom.gosuslugi.ru/schema/integration/services/}MonthlyWorkCountType"/>
     *           </sequence>
     *         </choice>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
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
        "workListItemGUID",
        "month",
        "year",
        "workDate",
        "workCount",
        "transportGUID"
    })
    public static class WorkPlanItem {

        /**
         * Идентификатор работы/услуги перечня
         * 
         */
        @XmlElement(name = "WorkListItemGUID", required = true)
        protected String workListItemGUID;
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
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

        /**
         * Идентификатор работы/услуги перечня
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkListItemGUID() {
            return workListItemGUID;
        }

        /**
         * Sets the value of the workListItemGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getWorkListItemGUID()
         */
        public void setWorkListItemGUID(String value) {
            this.workListItemGUID = value;
        }

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

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

    }

}
