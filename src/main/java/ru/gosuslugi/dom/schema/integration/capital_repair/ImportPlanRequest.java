
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 *         <element name="importPlan">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="PlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="LoadPlan" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}PlanPassportType" minOccurs="0"/>
 *                   <element name="PlanDocument" maxOccurs="1000" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ImportDocumentType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <choice minOccurs="0">
 *                     <element name="DeletePlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="PublishPlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="CancelPlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.10""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importPlan"
})
@XmlRootElement(name = "importPlanRequest")
public class ImportPlanRequest
    extends BaseType
{

    /**
     * Импортируемая программа/план
     * 
     */
    @XmlElement(required = true)
    protected ImportPlanRequest.ImportPlan importPlan;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемая программа/план
     * 
     * @return
     *     possible object is
     *     {@link ImportPlanRequest.ImportPlan }
     *     
     */
    public ImportPlanRequest.ImportPlan getImportPlan() {
        return importPlan;
    }

    /**
     * Sets the value of the importPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportPlanRequest.ImportPlan }
     *     
     * @see #getImportPlan()
     */
    public void setImportPlan(ImportPlanRequest.ImportPlan value) {
        this.importPlan = value;
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
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="PlanGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="LoadPlan" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}PlanPassportType" minOccurs="0"/>
     *         <element name="PlanDocument" maxOccurs="1000" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ImportDocumentType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <choice minOccurs="0">
     *           <element name="DeletePlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="PublishPlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="CancelPlan" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "transportGuid",
        "planGuid",
        "loadPlan",
        "planDocument",
        "deletePlan",
        "publishPlan",
        "cancelPlan"
    })
    public static class ImportPlan {

        /**
         * Транспортный идентификатор для выполнения операции с программой/планом
         * 
         */
        @XmlElement(name = "TransportGuid")
        protected String transportGuid;
        /**
         * Идентификатор программы/плана в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "PlanGuid")
        protected String planGuid;
        /**
         * Создание/Изменение паспорта программы/плана.
         * 
         */
        @XmlElement(name = "LoadPlan")
        protected PlanPassportType loadPlan;
        /**
         * Документы программы/плана
         * 
         */
        @XmlElement(name = "PlanDocument")
        protected List<ImportPlanRequest.ImportPlan.PlanDocument> planDocument;
        /**
         * Удалить программу/план в статусе "Проект"
         * 
         */
        @XmlElement(name = "DeletePlan")
        protected Boolean deletePlan;
        /**
         * Признак указывает на необходимость размещения программы/плана в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "PublishPlan")
        protected Boolean publishPlan;
        /**
         * Аннулировать программу/план
         * 
         */
        @XmlElement(name = "CancelPlan")
        protected Boolean cancelPlan;

        /**
         * Транспортный идентификатор для выполнения операции с программой/планом
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGuid() {
            return transportGuid;
        }

        /**
         * Sets the value of the transportGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGuid()
         */
        public void setTransportGuid(String value) {
            this.transportGuid = value;
        }

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
         * Создание/Изменение паспорта программы/плана.
         * 
         * @return
         *     possible object is
         *     {@link PlanPassportType }
         *     
         */
        public PlanPassportType getLoadPlan() {
            return loadPlan;
        }

        /**
         * Sets the value of the loadPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link PlanPassportType }
         *     
         * @see #getLoadPlan()
         */
        public void setLoadPlan(PlanPassportType value) {
            this.loadPlan = value;
        }

        /**
         * Документы программы/плана
         * 
         * Gets the value of the planDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the planDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPlanDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImportPlanRequest.ImportPlan.PlanDocument }
         * </p>
         * 
         * 
         * @return
         *     The value of the planDocument property.
         */
        public List<ImportPlanRequest.ImportPlan.PlanDocument> getPlanDocument() {
            if (planDocument == null) {
                planDocument = new ArrayList<>();
            }
            return this.planDocument;
        }

        /**
         * Удалить программу/план в статусе "Проект"
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeletePlan() {
            return deletePlan;
        }

        /**
         * Sets the value of the deletePlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeletePlan()
         */
        public void setDeletePlan(Boolean value) {
            this.deletePlan = value;
        }

        /**
         * Признак указывает на необходимость размещения программы/плана в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPublishPlan() {
            return publishPlan;
        }

        /**
         * Sets the value of the publishPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPublishPlan()
         */
        public void setPublishPlan(Boolean value) {
            this.publishPlan = value;
        }

        /**
         * Аннулировать программу/план
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelPlan() {
            return cancelPlan;
        }

        /**
         * Sets the value of the cancelPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelPlan()
         */
        public void setCancelPlan(Boolean value) {
            this.cancelPlan = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ImportDocumentType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PlanDocument
            extends ImportDocumentType
        {


        }

    }

}
