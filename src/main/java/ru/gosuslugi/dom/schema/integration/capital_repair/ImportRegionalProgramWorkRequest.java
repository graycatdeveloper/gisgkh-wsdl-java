
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
 *         <element name="RegionalProgramGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="importRegionalProgramWork" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="WorkGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadRegionalProgramWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}RegionalProgramWorkType"/>
 *                     <element name="DeleteRegionalProgramWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "regionalProgramGuid",
    "importRegionalProgramWork"
})
@XmlRootElement(name = "importRegionalProgramWorkRequest")
public class ImportRegionalProgramWorkRequest
    extends BaseType
{

    /**
     * Идентификатор РПКР в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "RegionalProgramGuid", required = true)
    protected String regionalProgramGuid;
    /**
     * Сведения о домах и работах региональной программы капитального ремонта
     * 
     */
    @XmlElement(required = true)
    protected List<ImportRegionalProgramWorkRequest.ImportRegionalProgramWork> importRegionalProgramWork;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор РПКР в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalProgramGuid() {
        return regionalProgramGuid;
    }

    /**
     * Sets the value of the regionalProgramGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegionalProgramGuid()
     */
    public void setRegionalProgramGuid(String value) {
        this.regionalProgramGuid = value;
    }

    /**
     * Сведения о домах и работах региональной программы капитального ремонта
     * 
     * Gets the value of the importRegionalProgramWork property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importRegionalProgramWork property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportRegionalProgramWork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportRegionalProgramWorkRequest.ImportRegionalProgramWork }
     * </p>
     * 
     * 
     * @return
     *     The value of the importRegionalProgramWork property.
     */
    public List<ImportRegionalProgramWorkRequest.ImportRegionalProgramWork> getImportRegionalProgramWork() {
        if (importRegionalProgramWork == null) {
            importRegionalProgramWork = new ArrayList<>();
        }
        return this.importRegionalProgramWork;
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
     *         <element name="WorkGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadRegionalProgramWork" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}RegionalProgramWorkType"/>
     *           <element name="DeleteRegionalProgramWork" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "loadRegionalProgramWork",
        "deleteRegionalProgramWork"
    })
    public static class ImportRegionalProgramWork {

        /**
         * Транспортный идентификатор для выполнения операции c работой в РПКР
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор работы в РПКР
         * 
         */
        @XmlElement(name = "WorkGuid")
        protected String workGuid;
        /**
         * Добавить/Изменить дома и виды работ в РПКР
         * 
         */
        @XmlElement(name = "LoadRegionalProgramWork")
        protected RegionalProgramWorkType loadRegionalProgramWork;
        /**
         * Удалить работу из РПКР
         * 
         */
        @XmlElement(name = "DeleteRegionalProgramWork")
        protected Boolean deleteRegionalProgramWork;

        /**
         * Транспортный идентификатор для выполнения операции c работой в РПКР
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
         * Идентификатор работы в РПКР
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
         * Добавить/Изменить дома и виды работ в РПКР
         * 
         * @return
         *     possible object is
         *     {@link RegionalProgramWorkType }
         *     
         */
        public RegionalProgramWorkType getLoadRegionalProgramWork() {
            return loadRegionalProgramWork;
        }

        /**
         * Sets the value of the loadRegionalProgramWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegionalProgramWorkType }
         *     
         * @see #getLoadRegionalProgramWork()
         */
        public void setLoadRegionalProgramWork(RegionalProgramWorkType value) {
            this.loadRegionalProgramWork = value;
        }

        /**
         * Удалить работу из РПКР
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeleteRegionalProgramWork() {
            return deleteRegionalProgramWork;
        }

        /**
         * Sets the value of the deleteRegionalProgramWork property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeleteRegionalProgramWork()
         */
        public void setDeleteRegionalProgramWork(Boolean value) {
            this.deleteRegionalProgramWork = value;
        }

    }

}
