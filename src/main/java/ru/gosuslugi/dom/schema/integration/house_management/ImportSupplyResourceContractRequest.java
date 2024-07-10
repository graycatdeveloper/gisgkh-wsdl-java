
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *                     <element name="SupplyResourceContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}SupplyResourceContractType"/>
 *                     <element name="TerminateContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                             <sequence>
 *                               <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="RollOverContract">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="RollOverDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.3.0.5""/>
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
@XmlRootElement(name = "importSupplyResourceContractRequest")
public class ImportSupplyResourceContractRequest
    extends BaseType
{

    /**
     * Договор ресурсоснабжения
     * 
     */
    @XmlElement(name = "Contract", required = true)
    protected List<ImportSupplyResourceContractRequest.Contract> contract;
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
     * {@link ImportSupplyResourceContractRequest.Contract }
     * </p>
     * 
     * 
     * @return
     *     The value of the contract property.
     */
    public List<ImportSupplyResourceContractRequest.Contract> getContract() {
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
            return "11.3.0.5";
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
     *           <element name="SupplyResourceContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}SupplyResourceContractType"/>
     *           <element name="TerminateContract">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *                   <sequence>
     *                     <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="RollOverContract">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="RollOverDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentContract" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentType"/>
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
        "supplyResourceContract",
        "terminateContract",
        "rollOverContract",
        "annulmentContract"
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
         * Создание/изменение
         * 
         */
        @XmlElement(name = "SupplyResourceContract")
        protected SupplyResourceContractType supplyResourceContract;
        /**
         * Расторжение
         * 
         */
        @XmlElement(name = "TerminateContract")
        protected ImportSupplyResourceContractRequest.Contract.TerminateContract terminateContract;
        /**
         * Пролонгация
         * 
         */
        @XmlElement(name = "RollOverContract")
        protected ImportSupplyResourceContractRequest.Contract.RollOverContract rollOverContract;
        /**
         * Аннулирование
         * 
         */
        @XmlElement(name = "AnnulmentContract")
        protected AnnulmentType annulmentContract;

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
         * Создание/изменение
         * 
         * @return
         *     possible object is
         *     {@link SupplyResourceContractType }
         *     
         */
        public SupplyResourceContractType getSupplyResourceContract() {
            return supplyResourceContract;
        }

        /**
         * Sets the value of the supplyResourceContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link SupplyResourceContractType }
         *     
         * @see #getSupplyResourceContract()
         */
        public void setSupplyResourceContract(SupplyResourceContractType value) {
            this.supplyResourceContract = value;
        }

        /**
         * Расторжение
         * 
         * @return
         *     possible object is
         *     {@link ImportSupplyResourceContractRequest.Contract.TerminateContract }
         *     
         */
        public ImportSupplyResourceContractRequest.Contract.TerminateContract getTerminateContract() {
            return terminateContract;
        }

        /**
         * Sets the value of the terminateContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportSupplyResourceContractRequest.Contract.TerminateContract }
         *     
         * @see #getTerminateContract()
         */
        public void setTerminateContract(ImportSupplyResourceContractRequest.Contract.TerminateContract value) {
            this.terminateContract = value;
        }

        /**
         * Пролонгация
         * 
         * @return
         *     possible object is
         *     {@link ImportSupplyResourceContractRequest.Contract.RollOverContract }
         *     
         */
        public ImportSupplyResourceContractRequest.Contract.RollOverContract getRollOverContract() {
            return rollOverContract;
        }

        /**
         * Sets the value of the rollOverContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportSupplyResourceContractRequest.Contract.RollOverContract }
         *     
         * @see #getRollOverContract()
         */
        public void setRollOverContract(ImportSupplyResourceContractRequest.Contract.RollOverContract value) {
            this.rollOverContract = value;
        }

        /**
         * Аннулирование
         * 
         * @return
         *     possible object is
         *     {@link AnnulmentType }
         *     
         */
        public AnnulmentType getAnnulmentContract() {
            return annulmentContract;
        }

        /**
         * Sets the value of the annulmentContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link AnnulmentType }
         *     
         * @see #getAnnulmentContract()
         */
        public void setAnnulmentContract(AnnulmentType value) {
            this.annulmentContract = value;
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
         *         <element name="RollOverDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "rollOverDate"
        })
        public static class RollOverContract {

            /**
             * Дата окончания пролонгации
             * 
             */
            @XmlElement(name = "RollOverDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar rollOverDate;

            /**
             * Дата окончания пролонгации
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRollOverDate() {
                return rollOverDate;
            }

            /**
             * Sets the value of the rollOverDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getRollOverDate()
             */
            public void setRollOverDate(XMLGregorianCalendar value) {
                this.rollOverDate = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
         *       <sequence>
         *         <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
            "reasonRef"
        })
        public static class TerminateContract
            extends TerminateType
        {

            /**
             * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
             * 
             */
            @XmlElement(name = "ReasonRef", required = true)
            protected NsiRef reasonRef;

            /**
             * Ссылка на НСИ "54	Причина расторжения договора" (реестровый номер 54)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getReasonRef() {
                return reasonRef;
            }

            /**
             * Sets the value of the reasonRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getReasonRef()
             */
            public void setReasonRef(NsiRef value) {
                this.reasonRef = value;
            }

        }

    }

}
