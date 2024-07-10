
package ru.gosuslugi.dom.schema.integration.inspection;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Возвращаемый план проверок.
 * 
 * <p>Java class for exportInspectionPlanResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportInspectionPlanResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InspectionPlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="RegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *         <element name="PlanState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}InspectionPlanStateType"/>
 *         <element name="InspectionPlan">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}URIInformationType">
 *                 <sequence>
 *                   <element name="Year" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PlannedExamination" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="PlannedExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="RegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
 *                   <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationStateType"/>
 *                   <element name="VersionState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationVersionStateType"/>
 *                   <element name="PlannedExaminationInfo">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportPlannedExaminationType">
 *                           <sequence>
 *                             <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportExaminationChangeInfoType" minOccurs="0"/>
 *                             <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
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
@XmlType(name = "exportInspectionPlanResultType", propOrder = {
    "inspectionPlanGuid",
    "registryNumber",
    "planState",
    "inspectionPlan",
    "plannedExamination"
})
public class ExportInspectionPlanResultType {

    /**
     * Идентификатор плана проверок.
     * 
     */
    @XmlElement(name = "InspectionPlanGuid", required = true)
    protected String inspectionPlanGuid;
    /**
     * Реестровый номер плана проверок.
     * 
     */
    @XmlElement(name = "RegistryNumber")
    protected String registryNumber;
    /**
     * Статус плана проверок:
     * Signed - Подписан
     * 
     */
    @XmlElement(name = "PlanState", required = true)
    @XmlSchemaType(name = "token")
    protected InspectionPlanStateType planState;
    /**
     * План проверок.
     * 
     */
    @XmlElement(name = "InspectionPlan", required = true)
    protected ExportInspectionPlanResultType.InspectionPlan inspectionPlan;
    /**
     * Плановая проверка.
     * 
     */
    @XmlElement(name = "PlannedExamination")
    protected List<ExportInspectionPlanResultType.PlannedExamination> plannedExamination;

    /**
     * Идентификатор плана проверок.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInspectionPlanGuid() {
        return inspectionPlanGuid;
    }

    /**
     * Sets the value of the inspectionPlanGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInspectionPlanGuid()
     */
    public void setInspectionPlanGuid(String value) {
        this.inspectionPlanGuid = value;
    }

    /**
     * Реестровый номер плана проверок.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegistryNumber()
     */
    public void setRegistryNumber(String value) {
        this.registryNumber = value;
    }

    /**
     * Статус плана проверок:
     * Signed - Подписан
     * 
     * @return
     *     possible object is
     *     {@link InspectionPlanStateType }
     *     
     */
    public InspectionPlanStateType getPlanState() {
        return planState;
    }

    /**
     * Sets the value of the planState property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionPlanStateType }
     *     
     * @see #getPlanState()
     */
    public void setPlanState(InspectionPlanStateType value) {
        this.planState = value;
    }

    /**
     * План проверок.
     * 
     * @return
     *     possible object is
     *     {@link ExportInspectionPlanResultType.InspectionPlan }
     *     
     */
    public ExportInspectionPlanResultType.InspectionPlan getInspectionPlan() {
        return inspectionPlan;
    }

    /**
     * Sets the value of the inspectionPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportInspectionPlanResultType.InspectionPlan }
     *     
     * @see #getInspectionPlan()
     */
    public void setInspectionPlan(ExportInspectionPlanResultType.InspectionPlan value) {
        this.inspectionPlan = value;
    }

    /**
     * Плановая проверка.
     * 
     * Gets the value of the plannedExamination property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plannedExamination property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPlannedExamination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportInspectionPlanResultType.PlannedExamination }
     * </p>
     * 
     * 
     * @return
     *     The value of the plannedExamination property.
     */
    public List<ExportInspectionPlanResultType.PlannedExamination> getPlannedExamination() {
        if (plannedExamination == null) {
            plannedExamination = new ArrayList<>();
        }
        return this.plannedExamination;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}URIInformationType">
     *       <sequence>
     *         <element name="Year" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType"/>
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
        "year"
    })
    public static class InspectionPlan
        extends URIInformationType
    {

        /**
         * Год плана.
         * 
         */
        @XmlElement(name = "Year")
        protected short year;

        /**
         * Год плана.
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
     *         <element name="PlannedExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="RegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}String255Type" minOccurs="0"/>
     *         <element name="State" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationStateType"/>
     *         <element name="VersionState" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationVersionStateType"/>
     *         <element name="PlannedExaminationInfo">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportPlannedExaminationType">
     *                 <sequence>
     *                   <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportExaminationChangeInfoType" minOccurs="0"/>
     *                   <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "plannedExaminationGuid",
        "registryNumber",
        "state",
        "versionState",
        "plannedExaminationInfo"
    })
    public static class PlannedExamination {

        /**
         * Корневой идентификатор плановой проверки.
         * 
         */
        @XmlElement(name = "PlannedExaminationGuid", required = true)
        protected String plannedExaminationGuid;
        /**
         * Реестровый номер плановой проверки.
         * 
         */
        @XmlElement(name = "RegistryNumber")
        protected String registryNumber;
        /**
         * Статус плановой проверки.
         * Допустимые значения:
         * Planned - Запланировна
         * Cancelled - Отменена
         * Finished - Завершена
         * Annulled - Аннулирована
         * 
         */
        @XmlElement(name = "State", required = true)
        @XmlSchemaType(name = "token")
        protected PlannedExaminationStateType state;
        /**
         * Статус версии плановой проверки.
         * Active - Действующая
         * 
         */
        @XmlElement(name = "VersionState", required = true)
        @XmlSchemaType(name = "token")
        protected PlannedExaminationVersionStateType versionState;
        /**
         * Плановая проверка.
         * 
         */
        @XmlElement(name = "PlannedExaminationInfo", required = true)
        protected ExportInspectionPlanResultType.PlannedExamination.PlannedExaminationInfo plannedExaminationInfo;

        /**
         * Корневой идентификатор плановой проверки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlannedExaminationGuid() {
            return plannedExaminationGuid;
        }

        /**
         * Sets the value of the plannedExaminationGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPlannedExaminationGuid()
         */
        public void setPlannedExaminationGuid(String value) {
            this.plannedExaminationGuid = value;
        }

        /**
         * Реестровый номер плановой проверки.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistryNumber() {
            return registryNumber;
        }

        /**
         * Sets the value of the registryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRegistryNumber()
         */
        public void setRegistryNumber(String value) {
            this.registryNumber = value;
        }

        /**
         * Статус плановой проверки.
         * Допустимые значения:
         * Planned - Запланировна
         * Cancelled - Отменена
         * Finished - Завершена
         * Annulled - Аннулирована
         * 
         * @return
         *     possible object is
         *     {@link PlannedExaminationStateType }
         *     
         */
        public PlannedExaminationStateType getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlannedExaminationStateType }
         *     
         * @see #getState()
         */
        public void setState(PlannedExaminationStateType value) {
            this.state = value;
        }

        /**
         * Статус версии плановой проверки.
         * Active - Действующая
         * 
         * @return
         *     possible object is
         *     {@link PlannedExaminationVersionStateType }
         *     
         */
        public PlannedExaminationVersionStateType getVersionState() {
            return versionState;
        }

        /**
         * Sets the value of the versionState property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlannedExaminationVersionStateType }
         *     
         * @see #getVersionState()
         */
        public void setVersionState(PlannedExaminationVersionStateType value) {
            this.versionState = value;
        }

        /**
         * Плановая проверка.
         * 
         * @return
         *     possible object is
         *     {@link ExportInspectionPlanResultType.PlannedExamination.PlannedExaminationInfo }
         *     
         */
        public ExportInspectionPlanResultType.PlannedExamination.PlannedExaminationInfo getPlannedExaminationInfo() {
            return plannedExaminationInfo;
        }

        /**
         * Sets the value of the plannedExaminationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportInspectionPlanResultType.PlannedExamination.PlannedExaminationInfo }
         *     
         * @see #getPlannedExaminationInfo()
         */
        public void setPlannedExaminationInfo(ExportInspectionPlanResultType.PlannedExamination.PlannedExaminationInfo value) {
            this.plannedExaminationInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/inspection/}exportPlannedExaminationType">
         *       <sequence>
         *         <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportExaminationChangeInfoType" minOccurs="0"/>
         *         <element name="CancelledInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExportCancelledInfoWithAttachmentsType" minOccurs="0"/>
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
            "examinationChangeInfo",
            "cancelledInfo"
        })
        public static class PlannedExaminationInfo
            extends ExportPlannedExaminationType
        {

            /**
             * Информация об изменении плановой провери
             * 
             */
            @XmlElement(name = "ExaminationChangeInfo")
            protected ExportExaminationChangeInfoType examinationChangeInfo;
            /**
             * Информация об отмене проверки.
             * 
             */
            @XmlElement(name = "CancelledInfo")
            protected ExportCancelledInfoWithAttachmentsType cancelledInfo;

            /**
             * Информация об изменении плановой провери
             * 
             * @return
             *     possible object is
             *     {@link ExportExaminationChangeInfoType }
             *     
             */
            public ExportExaminationChangeInfoType getExaminationChangeInfo() {
                return examinationChangeInfo;
            }

            /**
             * Sets the value of the examinationChangeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportExaminationChangeInfoType }
             *     
             * @see #getExaminationChangeInfo()
             */
            public void setExaminationChangeInfo(ExportExaminationChangeInfoType value) {
                this.examinationChangeInfo = value;
            }

            /**
             * Информация об отмене проверки.
             * 
             * @return
             *     possible object is
             *     {@link ExportCancelledInfoWithAttachmentsType }
             *     
             */
            public ExportCancelledInfoWithAttachmentsType getCancelledInfo() {
                return cancelledInfo;
            }

            /**
             * Sets the value of the cancelledInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportCancelledInfoWithAttachmentsType }
             *     
             * @see #getCancelledInfo()
             */
            public void setCancelledInfo(ExportCancelledInfoWithAttachmentsType value) {
                this.cancelledInfo = value;
            }

        }

    }

}
