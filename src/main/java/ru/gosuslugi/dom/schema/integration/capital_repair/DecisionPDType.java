
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Тип данных для Решение/информация о порядке представления платежных документов
 * 
 * <p>Java class for DecisionPDType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionPDType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DecisionCommonType">
 *       <sequence>
 *         <element name="Reason">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="Protocol">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ProtocolType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="DecisionDocument">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentDecisionType"/>
 *                             <element name="DocumentIsAbsent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                           </choice>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Model" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ModelType"/>
 *         <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *         <element name="TermForGranting" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}TermForGrantingType" minOccurs="0"/>
 *         <element name="TermDay" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}TermDayType" minOccurs="0"/>
 *         <element name="TermQualification" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}TermQualificationType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionPDType", propOrder = {
    "reason",
    "model",
    "organization",
    "termForGranting",
    "termDay",
    "termQualification"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportDecisionsOrderOfProvidingPDRequest.ImportDecision.LoadDecision.class,
    ExportDecisionPDType.class
})
public class DecisionPDType
    extends DecisionCommonType
{

    /**
     * Основание
     * 
     */
    @XmlElement(name = "Reason", required = true)
    protected DecisionPDType.Reason reason;
    /**
     * Модель выставления платежных документов
     * 
     */
    @XmlElement(name = "Model", required = true)
    @XmlSchemaType(name = "token")
    protected ModelType model;
    /**
     * Организация, уполномоченная на выставление платежных документов
     * 
     */
    @XmlElement(name = "Organization", required = true)
    protected RegOrgType organization;
    /**
     * Срок представления платежных документов
     * 
     */
    @XmlElement(name = "TermForGranting")
    @XmlSchemaType(name = "string")
    protected TermForGrantingType termForGranting;
    /**
     * Число к сроку предоставления
     * 
     */
    @XmlElement(name = "TermDay")
    @XmlSchemaType(name = "positiveInteger")
    protected Integer termDay;
    /**
     * Уточнение к сроку предоставления
     * 
     */
    @XmlElement(name = "TermQualification")
    @XmlSchemaType(name = "string")
    protected TermQualificationType termQualification;

    /**
     * Основание
     * 
     * @return
     *     possible object is
     *     {@link DecisionPDType.Reason }
     *     
     */
    public DecisionPDType.Reason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionPDType.Reason }
     *     
     * @see #getReason()
     */
    public void setReason(DecisionPDType.Reason value) {
        this.reason = value;
    }

    /**
     * Модель выставления платежных документов
     * 
     * @return
     *     possible object is
     *     {@link ModelType }
     *     
     */
    public ModelType getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelType }
     *     
     * @see #getModel()
     */
    public void setModel(ModelType value) {
        this.model = value;
    }

    /**
     * Организация, уполномоченная на выставление платежных документов
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getOrganization()
     */
    public void setOrganization(RegOrgType value) {
        this.organization = value;
    }

    /**
     * Срок представления платежных документов
     * 
     * @return
     *     possible object is
     *     {@link TermForGrantingType }
     *     
     */
    public TermForGrantingType getTermForGranting() {
        return termForGranting;
    }

    /**
     * Sets the value of the termForGranting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermForGrantingType }
     *     
     * @see #getTermForGranting()
     */
    public void setTermForGranting(TermForGrantingType value) {
        this.termForGranting = value;
    }

    /**
     * Число к сроку предоставления
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTermDay() {
        return termDay;
    }

    /**
     * Sets the value of the termDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTermDay()
     */
    public void setTermDay(Integer value) {
        this.termDay = value;
    }

    /**
     * Уточнение к сроку предоставления
     * 
     * @return
     *     possible object is
     *     {@link TermQualificationType }
     *     
     */
    public TermQualificationType getTermQualification() {
        return termQualification;
    }

    /**
     * Sets the value of the termQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermQualificationType }
     *     
     * @see #getTermQualification()
     */
    public void setTermQualification(TermQualificationType value) {
        this.termQualification = value;
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
     *       <choice>
     *         <element name="Protocol">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ProtocolType">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="DecisionDocument">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentDecisionType"/>
     *                   <element name="DocumentIsAbsent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                 </choice>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "protocol",
        "decisionDocument"
    })
    public static class Reason {

        /**
         * Протокол общего собрания собственников. Заполняется при импорте решений о порядке представления платежных документов. Для организаций с функцией Региональный оператор капитального ремонта необходимо прикрепить файл протокола, для остальных организаций необходимо указать идентификатор версии протокола.
         * 
         */
        @XmlElement(name = "Protocol")
        protected DecisionPDType.Reason.Protocol protocol;
        /**
         * Подтверждающий документ. Заполняется при импорте информации о порядке представления платежных документов
         * 
         */
        @XmlElement(name = "DecisionDocument")
        protected DecisionPDType.Reason.DecisionDocument decisionDocument;

        /**
         * Протокол общего собрания собственников. Заполняется при импорте решений о порядке представления платежных документов. Для организаций с функцией Региональный оператор капитального ремонта необходимо прикрепить файл протокола, для остальных организаций необходимо указать идентификатор версии протокола.
         * 
         * @return
         *     possible object is
         *     {@link DecisionPDType.Reason.Protocol }
         *     
         */
        public DecisionPDType.Reason.Protocol getProtocol() {
            return protocol;
        }

        /**
         * Sets the value of the protocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecisionPDType.Reason.Protocol }
         *     
         * @see #getProtocol()
         */
        public void setProtocol(DecisionPDType.Reason.Protocol value) {
            this.protocol = value;
        }

        /**
         * Подтверждающий документ. Заполняется при импорте информации о порядке представления платежных документов
         * 
         * @return
         *     possible object is
         *     {@link DecisionPDType.Reason.DecisionDocument }
         *     
         */
        public DecisionPDType.Reason.DecisionDocument getDecisionDocument() {
            return decisionDocument;
        }

        /**
         * Sets the value of the decisionDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link DecisionPDType.Reason.DecisionDocument }
         *     
         * @see #getDecisionDocument()
         */
        public void setDecisionDocument(DecisionPDType.Reason.DecisionDocument value) {
            this.decisionDocument = value;
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
         *       <choice>
         *         <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}DocumentDecisionType"/>
         *         <element name="DocumentIsAbsent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *       </choice>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "document",
            "documentIsAbsent"
        })
        public static class DecisionDocument {

            /**
             * Документ
             * 
             */
            @XmlElement(name = "Document")
            protected DocumentDecisionType document;
            /**
             * Документ отсутствует
             * 
             */
            @XmlElement(name = "DocumentIsAbsent")
            protected Boolean documentIsAbsent;

            /**
             * Документ
             * 
             * @return
             *     possible object is
             *     {@link DocumentDecisionType }
             *     
             */
            public DocumentDecisionType getDocument() {
                return document;
            }

            /**
             * Sets the value of the document property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentDecisionType }
             *     
             * @see #getDocument()
             */
            public void setDocument(DocumentDecisionType value) {
                this.document = value;
            }

            /**
             * Документ отсутствует
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDocumentIsAbsent() {
                return documentIsAbsent;
            }

            /**
             * Sets the value of the documentIsAbsent property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isDocumentIsAbsent()
             */
            public void setDocumentIsAbsent(Boolean value) {
                this.documentIsAbsent = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ProtocolType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Protocol
            extends ProtocolType
        {


        }

    }

}
