
package ru.gosuslugi.dom.schema.integration.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Выполненная работа за период
 * 
 * <p>Java class for CompletedWorksByPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CompletedWorksByPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="reportingPeriodGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="PlannedWork" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}CompletedWorkType">
 *                 <sequence>
 *                   <element name="WorkPlanItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="plannedCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="UnplannedWork" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}CompletedWorkType">
 *                 <sequence>
 *                   <choice minOccurs="0">
 *                     <element name="Accident">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="accidentObjectKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                               <element name="accidentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                             </sequence>
 *                             <attribute name="workType">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="3"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </attribute>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="DeliveryRestriction">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                               <element name="OrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
 *                             </sequence>
 *                             <attribute name="workType">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="5"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </attribute>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                   <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="Work" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="workType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                 </sequence>
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
@XmlType(name = "CompletedWorksByPeriodType", propOrder = {
    "reportingPeriodGuid",
    "plannedWork",
    "unplannedWork"
})
public class CompletedWorksByPeriodType {

    /**
     * Ссылка на период отчётности о выполненных работах/услугах
     * 
     */
    @XmlElement(required = true)
    protected String reportingPeriodGuid;
    /**
     * Выполненная плановая работа/услуга
     * 
     */
    @XmlElement(name = "PlannedWork")
    protected List<CompletedWorksByPeriodType.PlannedWork> plannedWork;
    /**
     * Выполненная внеплановая работа/услуга
     * 
     */
    @XmlElement(name = "UnplannedWork")
    protected List<CompletedWorksByPeriodType.UnplannedWork> unplannedWork;

    /**
     * Ссылка на период отчётности о выполненных работах/услугах
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
     * Выполненная плановая работа/услуга
     * 
     * Gets the value of the plannedWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlannedWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompletedWorksByPeriodType.PlannedWork }
     * </p>
     * 
     * 
     * @return
     *     The value of the plannedWork property.
     */
    public List<CompletedWorksByPeriodType.PlannedWork> getPlannedWork() {
        if (plannedWork == null) {
            plannedWork = new ArrayList<>();
        }
        return this.plannedWork;
    }

    /**
     * Выполненная внеплановая работа/услуга
     * 
     * Gets the value of the unplannedWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unplannedWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnplannedWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompletedWorksByPeriodType.UnplannedWork }
     * </p>
     * 
     * 
     * @return
     *     The value of the unplannedWork property.
     */
    public List<CompletedWorksByPeriodType.UnplannedWork> getUnplannedWork() {
        if (unplannedWork == null) {
            unplannedWork = new ArrayList<>();
        }
        return this.unplannedWork;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}CompletedWorkType">
     *       <sequence>
     *         <element name="WorkPlanItemGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="plannedCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
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
        "workPlanItemGUID",
        "plannedCount"
    })
    public static class PlannedWork
        extends CompletedWorkType
    {

        /**
         * Идентификатор работы/услуги перечня
         * 
         */
        @XmlElement(name = "WorkPlanItemGUID", required = true)
        protected String workPlanItemGUID;
        /**
         * Количество работ по плану
         * 
         */
        @XmlElement(required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger plannedCount;

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
         * Количество работ по плану
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPlannedCount() {
            return plannedCount;
        }

        /**
         * Sets the value of the plannedCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         * @see #getPlannedCount()
         */
        public void setPlannedCount(BigInteger value) {
            this.plannedCount = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/services/}CompletedWorkType">
     *       <sequence>
     *         <choice minOccurs="0">
     *           <element name="Accident">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="accidentObjectKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                     <element name="accidentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                     <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                   </sequence>
     *                   <attribute name="workType">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="3"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </attribute>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="DeliveryRestriction">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                     <element name="OrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
     *                   </sequence>
     *                   <attribute name="workType">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="5"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </attribute>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *         </choice>
     *         <element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="Work" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="workType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
        "accident",
        "deliveryRestriction",
        "comment",
        "work",
        "workType"
    })
    public static class UnplannedWork
        extends CompletedWorkType
    {

        /**
         * Аварийные работы (tns:UnplannedWork/workType/Code=3)
         * 
         */
        @XmlElement(name = "Accident")
        protected CompletedWorksByPeriodType.UnplannedWork.Accident accident;
        /**
         * По ограничениям поставки (tns:UnplannedWork/workType/Code=5)
         * 
         */
        @XmlElement(name = "DeliveryRestriction")
        protected CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction deliveryRestriction;
        /**
         * Комментарий
         * 
         */
        @XmlElement(name = "Comment")
        protected String comment;
        /**
         * Ссылка на работу (услугу) в справочнике видов работ и услуг для организации (НСИ 59)
         * 
         */
        @XmlElement(name = "Work", required = true)
        protected NsiRef work;
        /**
         * Ссылка на вид работы (услуги) в справочнике видов работ и услуг (НСИ 56)
         * 
         */
        @XmlElement(required = true)
        protected NsiRef workType;

        /**
         * Аварийные работы (tns:UnplannedWork/workType/Code=3)
         * 
         * @return
         *     possible object is
         *     {@link CompletedWorksByPeriodType.UnplannedWork.Accident }
         *     
         */
        public CompletedWorksByPeriodType.UnplannedWork.Accident getAccident() {
            return accident;
        }

        /**
         * Sets the value of the accident property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompletedWorksByPeriodType.UnplannedWork.Accident }
         *     
         * @see #getAccident()
         */
        public void setAccident(CompletedWorksByPeriodType.UnplannedWork.Accident value) {
            this.accident = value;
        }

        /**
         * По ограничениям поставки (tns:UnplannedWork/workType/Code=5)
         * 
         * @return
         *     possible object is
         *     {@link CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction }
         *     
         */
        public CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction getDeliveryRestriction() {
            return deliveryRestriction;
        }

        /**
         * Sets the value of the deliveryRestriction property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction }
         *     
         * @see #getDeliveryRestriction()
         */
        public void setDeliveryRestriction(CompletedWorksByPeriodType.UnplannedWork.DeliveryRestriction value) {
            this.deliveryRestriction = value;
        }

        /**
         * Комментарий
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getComment()
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Ссылка на работу (услугу) в справочнике видов работ и услуг для организации (НСИ 59)
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
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="accidentObjectKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *         <element name="accidentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *       </sequence>
         *       <attribute name="workType">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <enumeration value="3"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "accidentObjectKind",
            "accidentReason",
            "msType"
        })
        public static class Accident {

            /**
             * Ссылка на объект аварии (НСИ №57)
             * 
             */
            protected NsiRef accidentObjectKind;
            /**
             * Причина аварии
             * 
             */
            protected String accidentReason;
            /**
             * Вид КУ (НСИ 3) для объектов аварии:
             * - Объект инженерной инфраструктуры
             * - Объект коммунальной инфраструктуры
             * 
             */
            @XmlElement(name = "MSType")
            protected NsiRef msType;
            @XmlAttribute(name = "workType")
            protected String workType;

            /**
             * Ссылка на объект аварии (НСИ №57)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getAccidentObjectKind() {
                return accidentObjectKind;
            }

            /**
             * Sets the value of the accidentObjectKind property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getAccidentObjectKind()
             */
            public void setAccidentObjectKind(NsiRef value) {
                this.accidentObjectKind = value;
            }

            /**
             * Причина аварии
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccidentReason() {
                return accidentReason;
            }

            /**
             * Sets the value of the accidentReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAccidentReason()
             */
            public void setAccidentReason(String value) {
                this.accidentReason = value;
            }

            /**
             * Вид КУ (НСИ 3) для объектов аварии:
             * - Объект инженерной инфраструктуры
             * - Объект коммунальной инфраструктуры
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getMSType() {
                return msType;
            }

            /**
             * Sets the value of the msType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getMSType()
             */
            public void setMSType(NsiRef value) {
                this.msType = value;
            }

            /**
             * Gets the value of the workType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkType() {
                return workType;
            }

            /**
             * Sets the value of the workType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkType(String value) {
                this.workType = value;
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
         *         <element name="MSType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
         *         <element name="OrganizationGUID" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType" minOccurs="0"/>
         *       </sequence>
         *       <attribute name="workType">
         *         <simpleType>
         *           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             <enumeration value="5"/>
         *           </restriction>
         *         </simpleType>
         *       </attribute>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "msType",
            "organizationGUID"
        })
        public static class DeliveryRestriction {

            /**
             * Вид КУ (НСИ 3)
             * 
             */
            @XmlElement(name = "MSType")
            protected NsiRef msType;
            /**
             * Поставщик коммунального ресурса
             * 
             */
            @XmlElement(name = "OrganizationGUID")
            protected RegOrgType organizationGUID;
            @XmlAttribute(name = "workType")
            protected String workType;

            /**
             * Вид КУ (НСИ 3)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getMSType() {
                return msType;
            }

            /**
             * Sets the value of the msType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getMSType()
             */
            public void setMSType(NsiRef value) {
                this.msType = value;
            }

            /**
             * Поставщик коммунального ресурса
             * 
             * @return
             *     possible object is
             *     {@link RegOrgType }
             *     
             */
            public RegOrgType getOrganizationGUID() {
                return organizationGUID;
            }

            /**
             * Sets the value of the organizationGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link RegOrgType }
             *     
             * @see #getOrganizationGUID()
             */
            public void setOrganizationGUID(RegOrgType value) {
                this.organizationGUID = value;
            }

            /**
             * Gets the value of the workType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkType() {
                return workType;
            }

            /**
             * Sets the value of the workType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkType(String value) {
                this.workType = value;
            }

        }

    }

}
