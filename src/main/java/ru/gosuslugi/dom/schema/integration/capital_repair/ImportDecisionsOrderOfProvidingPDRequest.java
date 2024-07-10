
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
 *         <element name="importDecision" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <choice>
 *                     <element name="LoadDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionPDType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CancelDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DecisionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.10.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importDecision"
})
@XmlRootElement(name = "importDecisionsOrderOfProvidingPDRequest")
public class ImportDecisionsOrderOfProvidingPDRequest
    extends BaseType
{

    /**
     * Импортируемые сведения о решении/информации о порядке представления платежных документов
     * 
     */
    @XmlElement(required = true)
    protected List<ImportDecisionsOrderOfProvidingPDRequest.ImportDecision> importDecision;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемые сведения о решении/информации о порядке представления платежных документов
     * 
     * Gets the value of the importDecision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importDecision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDecisionsOrderOfProvidingPDRequest.ImportDecision }
     * </p>
     * 
     * 
     * @return
     *     The value of the importDecision property.
     */
    public List<ImportDecisionsOrderOfProvidingPDRequest.ImportDecision> getImportDecision() {
        if (importDecision == null) {
            importDecision = new ArrayList<>();
        }
        return this.importDecision;
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
            return "11.10.0.2";
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
     *         <choice>
     *           <element name="LoadDecision">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionPDType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CancelDecision">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DecisionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
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
        "loadDecision",
        "cancelDecision"
    })
    public static class ImportDecision {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Создание решения/информации о порядке представления платежных документов с последующим размещением в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "LoadDecision")
        protected ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.LoadDecision loadDecision;
        /**
         * Аннулирование решения/информации о порядке представления платежных документов
         * 
         */
        @XmlElement(name = "CancelDecision")
        protected ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.CancelDecision cancelDecision;

        /**
         * Транспортный идентификатор
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
         * Создание решения/информации о порядке представления платежных документов с последующим размещением в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.LoadDecision }
         *     
         */
        public ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.LoadDecision getLoadDecision() {
            return loadDecision;
        }

        /**
         * Sets the value of the loadDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.LoadDecision }
         *     
         * @see #getLoadDecision()
         */
        public void setLoadDecision(ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.LoadDecision value) {
            this.loadDecision = value;
        }

        /**
         * Аннулирование решения/информации о порядке представления платежных документов
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.CancelDecision }
         *     
         */
        public ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.CancelDecision getCancelDecision() {
            return cancelDecision;
        }

        /**
         * Sets the value of the cancelDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.CancelDecision }
         *     
         * @see #getCancelDecision()
         */
        public void setCancelDecision(ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.CancelDecision value) {
            this.cancelDecision = value;
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
         *         <element name="DecisionGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "decisionGuid"
        })
        public static class CancelDecision {

            /**
             * Идентификатор решения/информации о порядке представления платежных документов
             * 
             */
            @XmlElement(name = "DecisionGuid", required = true)
            protected String decisionGuid;

            /**
             * Идентификатор решения/информации о порядке представления платежных документов
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecisionGuid() {
                return decisionGuid;
            }

            /**
             * Sets the value of the decisionGuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDecisionGuid()
             */
            public void setDecisionGuid(String value) {
                this.decisionGuid = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionPDType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LoadDecision
            extends DecisionPDType
        {


        }

    }

}
