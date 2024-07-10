
package ru.gosuslugi.dom.schema.integration.inspection;

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
 *       <sequence>
 *         <element name="ImportInspectionPlan" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   </sequence>
 *                   <choice>
 *                     <element name="InspectionPlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="InspectionPlan" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}InspectionPlanType"/>
 *                   </choice>
 *                   <element name="ImportPlannedExamination" maxOccurs="1000">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                               <element name="PlannedExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             </sequence>
 *                             <choice>
 *                               <sequence>
 *                                 <element name="PlannedExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationType"/>
 *                                 <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationChangeInfoType" minOccurs="0"/>
 *                               </sequence>
 *                               <element name="CancelPlannedExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
 *                               <element name="AnnulPlannedExamination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.5.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importInspectionPlan"
})
@XmlRootElement(name = "importInspectionPlanRequest")
public class ImportInspectionPlanRequest
    extends BaseType
{

    /**
     * Импорт плана проверок и плановых проверок
     * 
     */
    @XmlElement(name = "ImportInspectionPlan", required = true)
    protected List<ImportInspectionPlanRequest.ImportInspectionPlan> importInspectionPlan;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт плана проверок и плановых проверок
     * 
     * Gets the value of the importInspectionPlan property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importInspectionPlan property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportInspectionPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportInspectionPlanRequest.ImportInspectionPlan }
     * </p>
     * 
     * 
     * @return
     *     The value of the importInspectionPlan property.
     */
    public List<ImportInspectionPlanRequest.ImportInspectionPlan> getImportInspectionPlan() {
        if (importInspectionPlan == null) {
            importInspectionPlan = new ArrayList<>();
        }
        return this.importInspectionPlan;
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
            return "11.5.0.1";
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
     *         <sequence>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         </sequence>
     *         <choice>
     *           <element name="InspectionPlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="InspectionPlan" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}InspectionPlanType"/>
     *         </choice>
     *         <element name="ImportPlannedExamination" maxOccurs="1000">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *                     <element name="PlannedExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   </sequence>
     *                   <choice>
     *                     <sequence>
     *                       <element name="PlannedExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationType"/>
     *                       <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationChangeInfoType" minOccurs="0"/>
     *                     </sequence>
     *                     <element name="CancelPlannedExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
     *                     <element name="AnnulPlannedExamination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "transportGUID",
        "inspectionPlanGuid",
        "inspectionPlan",
        "importPlannedExamination"
    })
    public static class ImportInspectionPlan {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор плана проверок в ГИС ЖКХ.
         * 
         */
        @XmlElement(name = "InspectionPlanGuid")
        protected String inspectionPlanGuid;
        /**
         * Добавляемый план проверок.
         * 
         */
        @XmlElement(name = "InspectionPlan")
        protected InspectionPlanType inspectionPlan;
        /**
         * Действия с плановыми проверками в плане проверок
         * 
         */
        @XmlElement(name = "ImportPlannedExamination", required = true)
        protected List<ImportInspectionPlanRequest.ImportInspectionPlan.ImportPlannedExamination> importPlannedExamination;

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
         * Идентификатор плана проверок в ГИС ЖКХ.
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
         * Добавляемый план проверок.
         * 
         * @return
         *     possible object is
         *     {@link InspectionPlanType }
         *     
         */
        public InspectionPlanType getInspectionPlan() {
            return inspectionPlan;
        }

        /**
         * Sets the value of the inspectionPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link InspectionPlanType }
         *     
         * @see #getInspectionPlan()
         */
        public void setInspectionPlan(InspectionPlanType value) {
            this.inspectionPlan = value;
        }

        /**
         * Действия с плановыми проверками в плане проверок
         * 
         * Gets the value of the importPlannedExamination property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the importPlannedExamination property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getImportPlannedExamination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportInspectionPlanRequest.ImportInspectionPlan.ImportPlannedExamination }
         * </p>
         * 
         * 
         * @return
         *     The value of the importPlannedExamination property.
         */
        public List<ImportInspectionPlanRequest.ImportInspectionPlan.ImportPlannedExamination> getImportPlannedExamination() {
            if (importPlannedExamination == null) {
                importPlannedExamination = new ArrayList<>();
            }
            return this.importPlannedExamination;
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
         *         <sequence>
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
         *           <element name="PlannedExaminationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         </sequence>
         *         <choice>
         *           <sequence>
         *             <element name="PlannedExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}PlannedExaminationType"/>
         *             <element name="ExaminationChangeInfo" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}ExaminationChangeInfoType" minOccurs="0"/>
         *           </sequence>
         *           <element name="CancelPlannedExamination" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}CancelledInfoWithAttachmentsType"/>
         *           <element name="AnnulPlannedExamination" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
            "transportGUID",
            "plannedExaminationGuid",
            "plannedExamination",
            "examinationChangeInfo",
            "cancelPlannedExamination",
            "annulPlannedExamination"
        })
        public static class ImportPlannedExamination {

            /**
             * Транспортный идентификатор
             * 
             */
            @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
            protected String transportGUID;
            /**
             * Идентификатор плановой проверки в ГИС ЖКХ.
             * 
             */
            @XmlElement(name = "PlannedExaminationGuid")
            protected String plannedExaminationGuid;
            /**
             * Создание / изменение плановой проверки
             * 
             */
            @XmlElement(name = "PlannedExamination")
            protected PlannedExaminationType plannedExamination;
            /**
             * Информация об изменении плановой провери (обязательно заполняется только при изменении плановой проверки в подписанном плане).
             * 
             */
            @XmlElement(name = "ExaminationChangeInfo")
            protected ExaminationChangeInfoType examinationChangeInfo;
            /**
             * Отмена плановой проверки.
             * 
             */
            @XmlElement(name = "CancelPlannedExamination")
            protected CancelledInfoWithAttachmentsType cancelPlannedExamination;
            /**
             * Аннулирование плановой проверки.
             * 
             */
            @XmlElement(name = "AnnulPlannedExamination")
            protected Boolean annulPlannedExamination;

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
             * Идентификатор плановой проверки в ГИС ЖКХ.
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
             * Создание / изменение плановой проверки
             * 
             * @return
             *     possible object is
             *     {@link PlannedExaminationType }
             *     
             */
            public PlannedExaminationType getPlannedExamination() {
                return plannedExamination;
            }

            /**
             * Sets the value of the plannedExamination property.
             * 
             * @param value
             *     allowed object is
             *     {@link PlannedExaminationType }
             *     
             * @see #getPlannedExamination()
             */
            public void setPlannedExamination(PlannedExaminationType value) {
                this.plannedExamination = value;
            }

            /**
             * Информация об изменении плановой провери (обязательно заполняется только при изменении плановой проверки в подписанном плане).
             * 
             * @return
             *     possible object is
             *     {@link ExaminationChangeInfoType }
             *     
             */
            public ExaminationChangeInfoType getExaminationChangeInfo() {
                return examinationChangeInfo;
            }

            /**
             * Sets the value of the examinationChangeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExaminationChangeInfoType }
             *     
             * @see #getExaminationChangeInfo()
             */
            public void setExaminationChangeInfo(ExaminationChangeInfoType value) {
                this.examinationChangeInfo = value;
            }

            /**
             * Отмена плановой проверки.
             * 
             * @return
             *     possible object is
             *     {@link CancelledInfoWithAttachmentsType }
             *     
             */
            public CancelledInfoWithAttachmentsType getCancelPlannedExamination() {
                return cancelPlannedExamination;
            }

            /**
             * Sets the value of the cancelPlannedExamination property.
             * 
             * @param value
             *     allowed object is
             *     {@link CancelledInfoWithAttachmentsType }
             *     
             * @see #getCancelPlannedExamination()
             */
            public void setCancelPlannedExamination(CancelledInfoWithAttachmentsType value) {
                this.cancelPlannedExamination = value;
            }

            /**
             * Аннулирование плановой проверки.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnnulPlannedExamination() {
                return annulPlannedExamination;
            }

            /**
             * Sets the value of the annulPlannedExamination property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isAnnulPlannedExamination()
             */
            public void setAnnulPlannedExamination(Boolean value) {
                this.annulPlannedExamination = value;
            }

        }

    }

}
