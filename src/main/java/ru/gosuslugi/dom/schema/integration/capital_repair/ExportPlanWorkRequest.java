
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="PlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="FilterByEndYearMonth" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="StartPeriodYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *                   <element name="EndPeriodYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FilterByTerritory" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="1000"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FilterByWorkType" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="1000"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FilterByHouseAddress" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="1000"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.10""/>
 *       <attribute name="Offset" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <minInclusive value="0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Limit" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <maxInclusive value="1000"/>
 *             <minExclusive value="0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "planGuid",
    "filterByEndYearMonth",
    "filterByTerritory",
    "filterByWorkType",
    "filterByHouseAddress"
})
@XmlRootElement(name = "exportPlanWorkRequest")
public class ExportPlanWorkRequest
    extends BaseType
{

    /**
     * Идентификатор программы/плана в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "PlanGuid", required = true)
    protected String planGuid;
    /**
     * Отобрать работы по месяцу окончания работы
     * 
     */
    @XmlElement(name = "FilterByEndYearMonth")
    protected ExportPlanWorkRequest.FilterByEndYearMonth filterByEndYearMonth;
    /**
     * Отобрать работы по территории
     * 
     */
    @XmlElement(name = "FilterByTerritory")
    protected ExportPlanWorkRequest.FilterByTerritory filterByTerritory;
    /**
     * Отобрать работы по виду работ
     * 
     */
    @XmlElement(name = "FilterByWorkType")
    protected ExportPlanWorkRequest.FilterByWorkType filterByWorkType;
    /**
     * Отобрать работы по адресу дома
     * 
     */
    @XmlElement(name = "FilterByHouseAddress")
    protected ExportPlanWorkRequest.FilterByHouseAddress filterByHouseAddress;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;
    /**
     * Сдвиг относительно первого элемента (первый элемент имеет позицию 0)
     * 
     */
    @XmlAttribute(name = "Offset", required = true)
    protected int offset;
    /**
     * Количество строк с информацией о работах, которые необходимо экспортировать
     * 
     */
    @XmlAttribute(name = "Limit", required = true)
    protected int limit;

    /**
     * Идентификатор программы/плана в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGuid() {
        return planGuid;
    }

    /**
     * Sets the value of the planGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlanGuid()
     */
    public void setPlanGuid(String value) {
        this.planGuid = value;
    }

    /**
     * Отобрать работы по месяцу окончания работы
     * 
     * @return
     *     possible object is
     *     {@link ExportPlanWorkRequest.FilterByEndYearMonth }
     *     
     */
    public ExportPlanWorkRequest.FilterByEndYearMonth getFilterByEndYearMonth() {
        return filterByEndYearMonth;
    }

    /**
     * Sets the value of the filterByEndYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPlanWorkRequest.FilterByEndYearMonth }
     *     
     * @see #getFilterByEndYearMonth()
     */
    public void setFilterByEndYearMonth(ExportPlanWorkRequest.FilterByEndYearMonth value) {
        this.filterByEndYearMonth = value;
    }

    /**
     * Отобрать работы по территории
     * 
     * @return
     *     possible object is
     *     {@link ExportPlanWorkRequest.FilterByTerritory }
     *     
     */
    public ExportPlanWorkRequest.FilterByTerritory getFilterByTerritory() {
        return filterByTerritory;
    }

    /**
     * Sets the value of the filterByTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPlanWorkRequest.FilterByTerritory }
     *     
     * @see #getFilterByTerritory()
     */
    public void setFilterByTerritory(ExportPlanWorkRequest.FilterByTerritory value) {
        this.filterByTerritory = value;
    }

    /**
     * Отобрать работы по виду работ
     * 
     * @return
     *     possible object is
     *     {@link ExportPlanWorkRequest.FilterByWorkType }
     *     
     */
    public ExportPlanWorkRequest.FilterByWorkType getFilterByWorkType() {
        return filterByWorkType;
    }

    /**
     * Sets the value of the filterByWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPlanWorkRequest.FilterByWorkType }
     *     
     * @see #getFilterByWorkType()
     */
    public void setFilterByWorkType(ExportPlanWorkRequest.FilterByWorkType value) {
        this.filterByWorkType = value;
    }

    /**
     * Отобрать работы по адресу дома
     * 
     * @return
     *     possible object is
     *     {@link ExportPlanWorkRequest.FilterByHouseAddress }
     *     
     */
    public ExportPlanWorkRequest.FilterByHouseAddress getFilterByHouseAddress() {
        return filterByHouseAddress;
    }

    /**
     * Sets the value of the filterByHouseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportPlanWorkRequest.FilterByHouseAddress }
     *     
     * @see #getFilterByHouseAddress()
     */
    public void setFilterByHouseAddress(ExportPlanWorkRequest.FilterByHouseAddress value) {
        this.filterByHouseAddress = value;
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
            return "11.2.0.10";
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
     * Сдвиг относительно первого элемента (первый элемент имеет позицию 0)
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Количество строк с информацией о работах, которые необходимо экспортировать
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
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
     *         <element name="StartPeriodYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
     *         <element name="EndPeriodYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/>
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
        "startPeriodYearMonth",
        "endPeriodYearMonth"
    })
    public static class FilterByEndYearMonth {

        /**
         * Месяц и год начала периода
         * 
         */
        @XmlElement(name = "StartPeriodYearMonth", required = true)
        @XmlSchemaType(name = "gYearMonth")
        protected XMLGregorianCalendar startPeriodYearMonth;
        /**
         * Месяц и год окончания периода
         * 
         */
        @XmlElement(name = "EndPeriodYearMonth", required = true)
        @XmlSchemaType(name = "gYearMonth")
        protected XMLGregorianCalendar endPeriodYearMonth;

        /**
         * Месяц и год начала периода
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartPeriodYearMonth() {
            return startPeriodYearMonth;
        }

        /**
         * Sets the value of the startPeriodYearMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getStartPeriodYearMonth()
         */
        public void setStartPeriodYearMonth(XMLGregorianCalendar value) {
            this.startPeriodYearMonth = value;
        }

        /**
         * Месяц и год окончания периода
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndPeriodYearMonth() {
            return endPeriodYearMonth;
        }

        /**
         * Sets the value of the endPeriodYearMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEndPeriodYearMonth()
         */
        public void setEndPeriodYearMonth(XMLGregorianCalendar value) {
            this.endPeriodYearMonth = value;
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
     *         <element name="FiasHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" maxOccurs="1000"/>
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
        "fiasHouseGUID"
    })
    public static class FilterByHouseAddress {

        /**
         * Идентификатор дома в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "FiasHouseGUID", required = true)
        protected List<String> fiasHouseGUID;

        /**
         * Идентификатор дома в ГИС ЖКХ
         * 
         * Gets the value of the fiasHouseGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fiasHouseGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getFiasHouseGUID().add(newItem);
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
         *     The value of the fiasHouseGUID property.
         */
        public List<String> getFiasHouseGUID() {
            if (fiasHouseGUID == null) {
                fiasHouseGUID = new ArrayList<>();
            }
            return this.fiasHouseGUID;
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
     *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="1000"/>
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
        "oktmo"
    })
    public static class FilterByTerritory {

        /**
         * Территория расположеная домов, в которых выполняются работы. В результатах экспорта отображаются также и дома на дочерних территориях
         * 
         */
        @XmlElement(name = "OKTMO", required = true)
        protected List<OKTMORefType> oktmo;

        /**
         * Территория расположеная домов, в которых выполняются работы. В результатах экспорта отображаются также и дома на дочерних территориях
         * 
         * Gets the value of the oktmo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oktmo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOKTMO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OKTMORefType }
         * </p>
         * 
         * 
         * @return
         *     The value of the oktmo property.
         */
        public List<OKTMORefType> getOKTMO() {
            if (oktmo == null) {
                oktmo = new ArrayList<>();
            }
            return this.oktmo;
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
     *         <element name="WorkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="1000"/>
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
        "workType"
    })
    public static class FilterByWorkType {

        /**
         * Вид работы капитального ремонта (НСИ 219)
         * 
         */
        @XmlElement(name = "WorkType", required = true)
        protected List<NsiRef> workType;

        /**
         * Вид работы капитального ремонта (НСИ 219)
         * 
         * Gets the value of the workType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getWorkType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NsiRef }
         * </p>
         * 
         * 
         * @return
         *     The value of the workType property.
         */
        public List<NsiRef> getWorkType() {
            if (workType == null) {
                workType = new ArrayList<>();
            }
            return this.workType;
        }

    }

}
