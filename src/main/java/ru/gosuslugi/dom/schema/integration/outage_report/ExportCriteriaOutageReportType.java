
package ru.gosuslugi.dom.schema.integration.outage_report;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.PeriodOpen;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип данных, описывающий критерии экспорта сведений о перерывах в предоставлении коммунальных услуг
 * 
 * <p>Java class for ExportCriteriaOutageReportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportCriteriaOutageReportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OutagePeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}PeriodOpen"/>
 *         <element name="OutageReportPlacingPeriod" type="{http://dom.gosuslugi.ru/schema/integration/base/}PeriodOpen"/>
 *         <element name="OutageTypes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OutageType" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageTypeType" maxOccurs="3"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Statuses" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}StatusType" maxOccurs="2"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ServiceCodes" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ServiceCodeType" maxOccurs="7"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OutageReasons" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="OutageReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="OutageReportObject" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ExportOutageReportObjectRequestType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportCriteriaOutageReportType", propOrder = {
    "outagePeriod",
    "outageReportPlacingPeriod",
    "outageTypes",
    "statuses",
    "serviceCodes",
    "outageReasons",
    "outageReportObject"
})
public class ExportCriteriaOutageReportType {

    /**
     * Период перерыва в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutagePeriod", required = true)
    protected PeriodOpen outagePeriod;
    /**
     * Период размещения сведений о перерывах в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutageReportPlacingPeriod", required = true)
    protected PeriodOpen outageReportPlacingPeriod;
    /**
     * Список типов перерыва
     * 
     */
    @XmlElement(name = "OutageTypes")
    protected ExportCriteriaOutageReportType.OutageTypes outageTypes;
    /**
     * Список статусов сведений о перерывах в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "Statuses")
    protected ExportCriteriaOutageReportType.Statuses statuses;
    /**
     * Список кодов вида коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceCodes")
    protected ExportCriteriaOutageReportType.ServiceCodes serviceCodes;
    /**
     * Список причин перерыва
     * 
     */
    @XmlElement(name = "OutageReasons")
    protected ExportCriteriaOutageReportType.OutageReasons outageReasons;
    /**
     * Объект жилого фонда, по которому планируется перерыв в предоставлении коммунальных услуг
     * 
     */
    @XmlElement(name = "OutageReportObject")
    protected ExportOutageReportObjectRequestType outageReportObject;

    /**
     * Период перерыва в предоставлении коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *     
     */
    public PeriodOpen getOutagePeriod() {
        return outagePeriod;
    }

    /**
     * Sets the value of the outagePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *     
     * @see #getOutagePeriod()
     */
    public void setOutagePeriod(PeriodOpen value) {
        this.outagePeriod = value;
    }

    /**
     * Период размещения сведений о перерывах в предоставлении коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link PeriodOpen }
     *     
     */
    public PeriodOpen getOutageReportPlacingPeriod() {
        return outageReportPlacingPeriod;
    }

    /**
     * Sets the value of the outageReportPlacingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodOpen }
     *     
     * @see #getOutageReportPlacingPeriod()
     */
    public void setOutageReportPlacingPeriod(PeriodOpen value) {
        this.outageReportPlacingPeriod = value;
    }

    /**
     * Список типов перерыва
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaOutageReportType.OutageTypes }
     *     
     */
    public ExportCriteriaOutageReportType.OutageTypes getOutageTypes() {
        return outageTypes;
    }

    /**
     * Sets the value of the outageTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaOutageReportType.OutageTypes }
     *     
     * @see #getOutageTypes()
     */
    public void setOutageTypes(ExportCriteriaOutageReportType.OutageTypes value) {
        this.outageTypes = value;
    }

    /**
     * Список статусов сведений о перерывах в предоставлении коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaOutageReportType.Statuses }
     *     
     */
    public ExportCriteriaOutageReportType.Statuses getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaOutageReportType.Statuses }
     *     
     * @see #getStatuses()
     */
    public void setStatuses(ExportCriteriaOutageReportType.Statuses value) {
        this.statuses = value;
    }

    /**
     * Список кодов вида коммунальной услуги
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaOutageReportType.ServiceCodes }
     *     
     */
    public ExportCriteriaOutageReportType.ServiceCodes getServiceCodes() {
        return serviceCodes;
    }

    /**
     * Sets the value of the serviceCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaOutageReportType.ServiceCodes }
     *     
     * @see #getServiceCodes()
     */
    public void setServiceCodes(ExportCriteriaOutageReportType.ServiceCodes value) {
        this.serviceCodes = value;
    }

    /**
     * Список причин перерыва
     * 
     * @return
     *     possible object is
     *     {@link ExportCriteriaOutageReportType.OutageReasons }
     *     
     */
    public ExportCriteriaOutageReportType.OutageReasons getOutageReasons() {
        return outageReasons;
    }

    /**
     * Sets the value of the outageReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCriteriaOutageReportType.OutageReasons }
     *     
     * @see #getOutageReasons()
     */
    public void setOutageReasons(ExportCriteriaOutageReportType.OutageReasons value) {
        this.outageReasons = value;
    }

    /**
     * Объект жилого фонда, по которому планируется перерыв в предоставлении коммунальных услуг
     * 
     * @return
     *     possible object is
     *     {@link ExportOutageReportObjectRequestType }
     *     
     */
    public ExportOutageReportObjectRequestType getOutageReportObject() {
        return outageReportObject;
    }

    /**
     * Sets the value of the outageReportObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportOutageReportObjectRequestType }
     *     
     * @see #getOutageReportObject()
     */
    public void setOutageReportObject(ExportOutageReportObjectRequestType value) {
        this.outageReportObject = value;
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
     *         <element name="OutageReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
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
        "outageReason"
    })
    public static class OutageReasons {

        /**
         * Причина перерыва. Указываются значения из справочника №360 "Причины перерывов в предоставлении коммунальных услуг", для которых в атрибуте «Вид перерыва» указано значение «Плановый»
         * 
         */
        @XmlElement(name = "OutageReason", required = true)
        protected List<NsiRef> outageReason;

        /**
         * Причина перерыва. Указываются значения из справочника №360 "Причины перерывов в предоставлении коммунальных услуг", для которых в атрибуте «Вид перерыва» указано значение «Плановый»
         * 
         * Gets the value of the outageReason property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outageReason property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOutageReason().add(newItem);
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
         *     The value of the outageReason property.
         */
        public List<NsiRef> getOutageReason() {
            if (outageReason == null) {
                outageReason = new ArrayList<>();
            }
            return this.outageReason;
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
     *         <element name="OutageType" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}OutageTypeType" maxOccurs="3"/>
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
        "outageType"
    })
    public static class OutageTypes {

        /**
         * Тип перерыва. Возможные значения:
         * PAUSE - Перерыв в предоставлении коммунальной услуги;
         * LIMITATION - Ограничение в предоставлении коммунальной услуги;
         * SUSPENSION - Приостановление предоставления коммунальной услуги.
         * 
         */
        @XmlElement(name = "OutageType", required = true)
        @XmlSchemaType(name = "string")
        protected List<OutageTypeType> outageType;

        /**
         * Тип перерыва. Возможные значения:
         * PAUSE - Перерыв в предоставлении коммунальной услуги;
         * LIMITATION - Ограничение в предоставлении коммунальной услуги;
         * SUSPENSION - Приостановление предоставления коммунальной услуги.
         * 
         * Gets the value of the outageType property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the outageType property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getOutageType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OutageTypeType }
         * </p>
         * 
         * 
         * @return
         *     The value of the outageType property.
         */
        public List<OutageTypeType> getOutageType() {
            if (outageType == null) {
                outageType = new ArrayList<>();
            }
            return this.outageType;
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
     *         <element name="ServiceCode" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}ServiceCodeType" maxOccurs="7"/>
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
        "serviceCode"
    })
    public static class ServiceCodes {

        /**
         * Код вида коммунальной услуги. Возможные значения: 
         *  1 - Холодное водоснабжение; 
         *  2 - Горячее водоснабжение;
         *  3 - Отведение сточных вод; 
         *  4 – Электроснабжение; 
         *  5 – Газоснабжение; 
         *  6 – Отопление; 
         *  7 – Обращение с твердыми коммунальными отходами.
         * 
         */
        @XmlElement(name = "ServiceCode", type = Byte.class)
        protected List<Byte> serviceCode;

        /**
         * Код вида коммунальной услуги. Возможные значения: 
         *  1 - Холодное водоснабжение; 
         *  2 - Горячее водоснабжение;
         *  3 - Отведение сточных вод; 
         *  4 – Электроснабжение; 
         *  5 – Газоснабжение; 
         *  6 – Отопление; 
         *  7 – Обращение с твердыми коммунальными отходами.
         * 
         * Gets the value of the serviceCode property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCode property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getServiceCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Byte }
         * </p>
         * 
         * 
         * @return
         *     The value of the serviceCode property.
         */
        public List<Byte> getServiceCode() {
            if (serviceCode == null) {
                serviceCode = new ArrayList<>();
            }
            return this.serviceCode;
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
     *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/outage-report/}StatusType" maxOccurs="2"/>
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
    public static class Statuses {

        /**
         * Статус сведений о перерыве. Возможные значения: 
         * PUBLISHED – Информация размещена; 
         * CANCELLED - Информация аннулирована.
         * 
         */
        @XmlElement(name = "Status", required = true)
        @XmlSchemaType(name = "string")
        protected List<StatusType> status;

        /**
         * Статус сведений о перерыве. Возможные значения: 
         * PUBLISHED – Информация размещена; 
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
