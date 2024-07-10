
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *         <element name="Contract" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <sequence>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                     <choice minOccurs="0">
 *                       <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     </choice>
 *                   </sequence>
 *                   <choice>
 *                     <element name="ContractProject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}SupplyResourceContractProjectType"/>
 *                     <element name="DeleteContractProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                     <element name="PlacingContractProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.7.0.3""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contract"
})
@XmlRootElement(name = "importSupplyResourceContractProjectRequest")
public class ImportSupplyResourceContractProjectRequest
    extends BaseType
{

    /**
     * Договор ресурсоснабжения
     * 
     */
    @XmlElement(name = "Contract", required = true)
    protected List<ImportSupplyResourceContractProjectRequest.Contract> contract;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Договор ресурсоснабжения
     * 
     * Gets the value of the contract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportSupplyResourceContractProjectRequest.Contract }
     * </p>
     * 
     * 
     * @return
     *     The value of the contract property.
     */
    public List<ImportSupplyResourceContractProjectRequest.Contract> getContract() {
        if (contract == null) {
            contract = new ArrayList<>();
        }
        return this.contract;
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
            return "11.7.0.3";
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
     *           <choice minOccurs="0">
     *             <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *             <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           </choice>
     *         </sequence>
     *         <choice>
     *           <element name="ContractProject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}SupplyResourceContractProjectType"/>
     *           <element name="DeleteContractProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *           <element name="PlacingContractProject" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "contractGUID",
        "contractRootGUID",
        "contractProject",
        "deleteContractProject",
        "placingContractProject"
    })
    public static class Contract {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ             Необходимо указать идентификатор последней версии договора
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractRootGUID")
        protected String contractRootGUID;
        /**
         * Создание/изменение проекта договора ресурсоснабжения
         * 
         */
        @XmlElement(name = "ContractProject")
        protected SupplyResourceContractProjectType contractProject;
        /**
         * Удаление проекта договора ресурсоснабжения. У размещенных договоров ресурсоснабжения удаляется последняя версия договора в статусе "Проект"
         * 
         */
        @XmlElement(name = "DeleteContractProject")
        protected Boolean deleteContractProject;
        /**
         * Размещение проекта договора ресурсоснабжения
         * 
         */
        @XmlElement(name = "PlacingContractProject")
        protected Boolean placingContractProject;

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
         * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ             Необходимо указать идентификатор последней версии договора
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractGUID() {
            return contractGUID;
        }

        /**
         * Sets the value of the contractGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractGUID()
         */
        public void setContractGUID(String value) {
            this.contractGUID = value;
        }

        /**
         * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractRootGUID() {
            return contractRootGUID;
        }

        /**
         * Sets the value of the contractRootGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractRootGUID()
         */
        public void setContractRootGUID(String value) {
            this.contractRootGUID = value;
        }

        /**
         * Создание/изменение проекта договора ресурсоснабжения
         * 
         * @return
         *     possible object is
         *     {@link SupplyResourceContractProjectType }
         *     
         */
        public SupplyResourceContractProjectType getContractProject() {
            return contractProject;
        }

        /**
         * Sets the value of the contractProject property.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyResourceContractProjectType }
         *     
         * @see #getContractProject()
         */
        public void setContractProject(SupplyResourceContractProjectType value) {
            this.contractProject = value;
        }

        /**
         * Удаление проекта договора ресурсоснабжения. У размещенных договоров ресурсоснабжения удаляется последняя версия договора в статусе "Проект"
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeleteContractProject() {
            return deleteContractProject;
        }

        /**
         * Sets the value of the deleteContractProject property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDeleteContractProject()
         */
        public void setDeleteContractProject(Boolean value) {
            this.deleteContractProject = value;
        }

        /**
         * Размещение проекта договора ресурсоснабжения
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPlacingContractProject() {
            return placingContractProject;
        }

        /**
         * Sets the value of the placingContractProject property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPlacingContractProject()
         */
        public void setPlacingContractProject(Boolean value) {
            this.placingContractProject = value;
        }

    }

}
