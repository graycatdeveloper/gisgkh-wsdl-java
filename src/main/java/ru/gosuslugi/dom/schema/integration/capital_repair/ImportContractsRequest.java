
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
 *         <element name="importContract" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="ContractGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ContractType"/>
 *                     <element name="DissolveContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DissolveContractType"/>
 *                     <element name="CancelContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.10.0.3""/>
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
    "importContract"
})
@XmlRootElement(name = "importContractsRequest")
public class ImportContractsRequest
    extends BaseType
{

    /**
     * Идентификатор КПР в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "PlanGUID", required = true)
    protected String planGUID;
    /**
     * Импортируемый договор (создание/редактирование договора, расторжение договора, аннулирование договора)
     * 
     */
    @XmlElement(required = true)
    protected List<ImportContractsRequest.ImportContract> importContract;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор КПР в ГИС ЖКХ
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
     * Импортируемый договор (создание/редактирование договора, расторжение договора, аннулирование договора)
     * 
     * Gets the value of the importContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportContractsRequest.ImportContract }
     * </p>
     * 
     * 
     * @return
     *     The value of the importContract property.
     */
    public List<ImportContractsRequest.ImportContract> getImportContract() {
        if (importContract == null) {
            importContract = new ArrayList<>();
        }
        return this.importContract;
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
            return "11.10.0.3";
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
     *         <element name="ContractGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ContractType"/>
     *           <element name="DissolveContract" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DissolveContractType"/>
     *           <element name="CancelContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "contractGuid",
        "loadContract",
        "dissolveContract",
        "cancelContract"
    })
    public static class ImportContract {

        /**
         * Транспортный идентификатор для выполнения операции с договором
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор договора в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractGuid")
        protected String contractGuid;
        /**
         * Создать/Редактировать договор. При редактировании договора необходимо присылать всю актуальную информацию по договору
         * 
         */
        @XmlElement(name = "LoadContract")
        protected ContractType loadContract;
        /**
         * Расторгнуть договор
         * 
         */
        @XmlElement(name = "DissolveContract")
        protected DissolveContractType dissolveContract;
        /**
         * Аннулировать договор
         * 
         */
        @XmlElement(name = "CancelContract")
        protected Boolean cancelContract;

        /**
         * Транспортный идентификатор для выполнения операции с договором
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
         * Идентификатор договора в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractGuid() {
            return contractGuid;
        }

        /**
         * Sets the value of the contractGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractGuid()
         */
        public void setContractGuid(String value) {
            this.contractGuid = value;
        }

        /**
         * Создать/Редактировать договор. При редактировании договора необходимо присылать всю актуальную информацию по договору
         * 
         * @return
         *     possible object is
         *     {@link ContractType }
         *     
         */
        public ContractType getLoadContract() {
            return loadContract;
        }

        /**
         * Sets the value of the loadContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractType }
         *     
         * @see #getLoadContract()
         */
        public void setLoadContract(ContractType value) {
            this.loadContract = value;
        }

        /**
         * Расторгнуть договор
         * 
         * @return
         *     possible object is
         *     {@link DissolveContractType }
         *     
         */
        public DissolveContractType getDissolveContract() {
            return dissolveContract;
        }

        /**
         * Sets the value of the dissolveContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link DissolveContractType }
         *     
         * @see #getDissolveContract()
         */
        public void setDissolveContract(DissolveContractType value) {
            this.dissolveContract = value;
        }

        /**
         * Аннулировать договор
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelContract() {
            return cancelContract;
        }

        /**
         * Sets the value of the cancelContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelContract()
         */
        public void setCancelContract(Boolean value) {
            this.cancelContract = value;
        }

    }

}
