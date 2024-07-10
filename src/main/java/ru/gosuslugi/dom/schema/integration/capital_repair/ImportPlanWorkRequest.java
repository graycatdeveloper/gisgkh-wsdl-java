
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
 *         <element name="PlanGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="importPlanWork" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="WorkGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadPlanWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkPlanType"/>
 *                     <element name="DeletePlanWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "planGUID",
    "importPlanWork"
})
@XmlRootElement(name = "importPlanWorkRequest")
public class ImportPlanWorkRequest
    extends BaseType
{

    /**
     * Идентификатор программы/плана ГИС ЖКХ
     * 
     */
    @XmlElement(name = "PlanGUID", required = true)
    protected String planGUID;
    /**
     * Сведения о домах и работах программы/плана
     * 
     */
    @XmlElement(required = true)
    protected List<ImportPlanWorkRequest.ImportPlanWork> importPlanWork;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор программы/плана ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanGUID() {
        return planGUID;
    }

    /**
     * Sets the value of the planGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPlanGUID()
     */
    public void setPlanGUID(String value) {
        this.planGUID = value;
    }

    /**
     * Сведения о домах и работах программы/плана
     * 
     * Gets the value of the importPlanWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importPlanWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportPlanWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportPlanWorkRequest.ImportPlanWork }
     * </p>
     * 
     * 
     * @return
     *     The value of the importPlanWork property.
     */
    public List<ImportPlanWorkRequest.ImportPlanWork> getImportPlanWork() {
        if (importPlanWork == null) {
            importPlanWork = new ArrayList<>();
        }
        return this.importPlanWork;
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
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="WorkGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadPlanWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}WorkPlanType"/>
     *           <element name="DeletePlanWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "workGuid",
        "loadPlanWork",
        "deletePlanWork"
    })
    public static class ImportPlanWork {

        /**
         * Транспортный идентификатор для выполнения операции со сведениями о домах и работах программы/плана
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор работы в  программе/плане. Заполняется при изменении либо удалении работы в доме
         * 
         */
        @XmlElement(name = "WorkGuid")
        protected String workGuid;
        /**
         * Добавить дома и работы в программу/план
         * 
         */
        @XmlElement(name = "LoadPlanWork")
        protected WorkPlanType loadPlanWork;
        /**
         * Удалить работу в программе/плане
         * 
         */
        @XmlElement(name = "DeletePlanWork")
        protected Boolean deletePlanWork;

        /**
         * Транспортный идентификатор для выполнения операции со сведениями о домах и работах программы/плана
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
         * Идентификатор работы в  программе/плане. Заполняется при изменении либо удалении работы в доме
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkGuid() {
            return workGuid;
        }

        /**
         * Sets the value of the workGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getWorkGuid()
         */
        public void setWorkGuid(String value) {
            this.workGuid = value;
        }

        /**
         * Добавить дома и работы в программу/план
         * 
         * @return
         *     possible object is
         *     {@link WorkPlanType }
         *     
         */
        public WorkPlanType getLoadPlanWork() {
            return loadPlanWork;
        }

        /**
         * Sets the value of the loadPlanWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link WorkPlanType }
         *     
         * @see #getLoadPlanWork()
         */
        public void setLoadPlanWork(WorkPlanType value) {
            this.loadPlanWork = value;
        }

        /**
         * Удалить работу в программе/плане
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeletePlanWork() {
            return deletePlanWork;
        }

        /**
         * Sets the value of the deletePlanWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeletePlanWork()
         */
        public void setDeletePlanWork(Boolean value) {
            this.deletePlanWork = value;
        }

    }

}
