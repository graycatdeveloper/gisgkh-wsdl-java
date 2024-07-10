
package ru.gosuslugi.dom.schema.integration.services;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <sequence>
 *           <element name="MonthYearFrom">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="MonthYearTo">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/services/}WorkListStatus" minOccurs="0"/>
 *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         </sequence>
 *         <element name="WorkListGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.1.0.8""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "monthYearFrom",
    "monthYearTo",
    "workListStatus",
    "fiasHouseGuid",
    "workListGUID"
})
@XmlRootElement(name = "exportWorkingListRequest")
public class ExportWorkingListRequest
    extends BaseType
{

    /**
     * Период "с"
     * 
     */
    @XmlElement(name = "MonthYearFrom")
    protected ExportWorkingListRequest.MonthYearFrom monthYearFrom;
    /**
     * Период "с"
     * 
     */
    @XmlElement(name = "MonthYearTo")
    protected ExportWorkingListRequest.MonthYearTo monthYearTo;
    /**
     * Статус:
     * (A)PPROVED - Утверждён
     * (C)ANCELLED - Отменён
     * 
     */
    @XmlElement(name = "WorkListStatus")
    protected String workListStatus;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Идентификатор перечня
     * 
     */
    @XmlElement(name = "WorkListGUID")
    protected List<String> workListGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Период "с"
     * 
     * @return
     *     possible object is
     *     {@link ExportWorkingListRequest.MonthYearFrom }
     *     
     */
    public ExportWorkingListRequest.MonthYearFrom getMonthYearFrom() {
        return monthYearFrom;
    }

    /**
     * Sets the value of the monthYearFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportWorkingListRequest.MonthYearFrom }
     *     
     * @see #getMonthYearFrom()
     */
    public void setMonthYearFrom(ExportWorkingListRequest.MonthYearFrom value) {
        this.monthYearFrom = value;
    }

    /**
     * Период "с"
     * 
     * @return
     *     possible object is
     *     {@link ExportWorkingListRequest.MonthYearTo }
     *     
     */
    public ExportWorkingListRequest.MonthYearTo getMonthYearTo() {
        return monthYearTo;
    }

    /**
     * Sets the value of the monthYearTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportWorkingListRequest.MonthYearTo }
     *     
     * @see #getMonthYearTo()
     */
    public void setMonthYearTo(ExportWorkingListRequest.MonthYearTo value) {
        this.monthYearTo = value;
    }

    /**
     * Статус:
     * (A)PPROVED - Утверждён
     * (C)ANCELLED - Отменён
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkListStatus() {
        return workListStatus;
    }

    /**
     * Sets the value of the workListStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getWorkListStatus()
     */
    public void setWorkListStatus(String value) {
        this.workListStatus = value;
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
     * Идентификатор перечня
     * 
     * Gets the value of the workListGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workListGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getWorkListGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the workListGUID property.
     */
    public List<String> getWorkListGUID() {
        if (workListGUID == null) {
            workListGUID = new ArrayList<>();
        }
        return this.workListGUID;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.1.0.8";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
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
