
package ru.gosuslugi.dom.schema.integration.rvuo;

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
 *         <element name="Decision" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="PlacingDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="DecisionData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionType"/>
 *                               <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedDecisionDocumentType" maxOccurs="100"/>
 *                               <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="EditDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="DecisionData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionType"/>
 *                               <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedDecisionDocumentType" maxOccurs="100"/>
 *                               <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="DeleteDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="PublishDecision">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.1.8.3""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "decision"
})
@XmlRootElement(name = "importDecisionRequest")
public class ImportDecisionRequest
    extends BaseType
{

    /**
     * Решение об определении управляющей организации
     * 
     */
    @XmlElement(name = "Decision", required = true)
    protected List<ImportDecisionRequest.Decision> decision;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Решение об определении управляющей организации
     * 
     * Gets the value of the decision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDecisionRequest.Decision }
     * </p>
     * 
     * 
     * @return
     *     The value of the decision property.
     */
    public List<ImportDecisionRequest.Decision> getDecision() {
        if (decision == null) {
            decision = new ArrayList<>();
        }
        return this.decision;
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
            return "13.1.8.3";
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="PlacingDecision">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="DecisionData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionType"/>
     *                     <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedDecisionDocumentType" maxOccurs="100"/>
     *                     <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="EditDecision">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="DecisionData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionType"/>
     *                     <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedDecisionDocumentType" maxOccurs="100"/>
     *                     <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentDecision">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="DeleteDecision">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="PublishDecision">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "transportGUID",
        "placingDecision",
        "editDecision",
        "annulmentDecision",
        "deleteDecision",
        "publishDecision"
    })
    public static class Decision {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Размещение решения об определении управляющей организации
         * 
         */
        @XmlElement(name = "PlacingDecision")
        protected ImportDecisionRequest.Decision.PlacingDecision placingDecision;
        /**
         * Редактирование решения об определении управляющей организации
         * 
         */
        @XmlElement(name = "EditDecision")
        protected ImportDecisionRequest.Decision.EditDecision editDecision;
        /**
         * Аннулирование решения об определении управляющей организации
         * 
         */
        @XmlElement(name = "AnnulmentDecision")
        protected ImportDecisionRequest.Decision.AnnulmentDecision annulmentDecision;
        /**
         * Удаление решения об определении управляющей организации
         * 
         */
        @XmlElement(name = "DeleteDecision")
        protected ImportDecisionRequest.Decision.DeleteDecision deleteDecision;
        /**
         * Изменение решения об определении управляющей организации в статусе "Проект" на статус "Размещена"
         * 
         */
        @XmlElement(name = "PublishDecision")
        protected ImportDecisionRequest.Decision.PublishDecision publishDecision;

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
         * Размещение решения об определении управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionRequest.Decision.PlacingDecision }
         *     
         */
        public ImportDecisionRequest.Decision.PlacingDecision getPlacingDecision() {
            return placingDecision;
        }

        /**
         * Sets the value of the placingDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionRequest.Decision.PlacingDecision }
         *     
         * @see #getPlacingDecision()
         */
        public void setPlacingDecision(ImportDecisionRequest.Decision.PlacingDecision value) {
            this.placingDecision = value;
        }

        /**
         * Редактирование решения об определении управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionRequest.Decision.EditDecision }
         *     
         */
        public ImportDecisionRequest.Decision.EditDecision getEditDecision() {
            return editDecision;
        }

        /**
         * Sets the value of the editDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionRequest.Decision.EditDecision }
         *     
         * @see #getEditDecision()
         */
        public void setEditDecision(ImportDecisionRequest.Decision.EditDecision value) {
            this.editDecision = value;
        }

        /**
         * Аннулирование решения об определении управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionRequest.Decision.AnnulmentDecision }
         *     
         */
        public ImportDecisionRequest.Decision.AnnulmentDecision getAnnulmentDecision() {
            return annulmentDecision;
        }

        /**
         * Sets the value of the annulmentDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionRequest.Decision.AnnulmentDecision }
         *     
         * @see #getAnnulmentDecision()
         */
        public void setAnnulmentDecision(ImportDecisionRequest.Decision.AnnulmentDecision value) {
            this.annulmentDecision = value;
        }

        /**
         * Удаление решения об определении управляющей организации
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionRequest.Decision.DeleteDecision }
         *     
         */
        public ImportDecisionRequest.Decision.DeleteDecision getDeleteDecision() {
            return deleteDecision;
        }

        /**
         * Sets the value of the deleteDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionRequest.Decision.DeleteDecision }
         *     
         * @see #getDeleteDecision()
         */
        public void setDeleteDecision(ImportDecisionRequest.Decision.DeleteDecision value) {
            this.deleteDecision = value;
        }

        /**
         * Изменение решения об определении управляющей организации в статусе "Проект" на статус "Размещена"
         * 
         * @return
         *     possible object is
         *     {@link ImportDecisionRequest.Decision.PublishDecision }
         *     
         */
        public ImportDecisionRequest.Decision.PublishDecision getPublishDecision() {
            return publishDecision;
        }

        /**
         * Sets the value of the publishDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDecisionRequest.Decision.PublishDecision }
         *     
         * @see #getPublishDecision()
         */
        public void setPublishDecision(ImportDecisionRequest.Decision.PublishDecision value) {
            this.publishDecision = value;
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
         *         <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
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
            "decisionGUID",
            "reason"
        })
        public static class AnnulmentDecision {

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "DecisionGUID", required = true)
            protected String decisionGUID;
            /**
             * Причина аннулирования управляющей организации
             * 
             */
            @XmlElement(name = "Reason", required = true)
            protected String reason;

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecisionGUID() {
                return decisionGUID;
            }

            /**
             * Sets the value of the decisionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDecisionGUID()
             */
            public void setDecisionGUID(String value) {
                this.decisionGUID = value;
            }

            /**
             * Причина аннулирования управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReason()
             */
            public void setReason(String value) {
                this.reason = value;
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
         *         <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "decisionGUID"
        })
        public static class DeleteDecision {

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "DecisionGUID", required = true)
            protected String decisionGUID;

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecisionGUID() {
                return decisionGUID;
            }

            /**
             * Sets the value of the decisionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDecisionGUID()
             */
            public void setDecisionGUID(String value) {
                this.decisionGUID = value;
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
         *         <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="DecisionData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionType"/>
         *         <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedDecisionDocumentType" maxOccurs="100"/>
         *         <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100" minOccurs="0"/>
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
            "decisionGUID",
            "decisionData",
            "attachedDocument",
            "house"
        })
        public static class EditDecision {

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "DecisionGUID", required = true)
            protected String decisionGUID;
            /**
             * Информация о решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "DecisionData", required = true)
            protected DecisionType decisionData;
            /**
             * Документ прилагаемый к информации о решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "AttachedDocument", required = true)
            protected List<AttachedDecisionDocumentType> attachedDocument;
            /**
             * Дом в решении об определении управляющей организации
             * 
             */
            @XmlElement(name = "House")
            protected List<HouseType> house;

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecisionGUID() {
                return decisionGUID;
            }

            /**
             * Sets the value of the decisionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDecisionGUID()
             */
            public void setDecisionGUID(String value) {
                this.decisionGUID = value;
            }

            /**
             * Информация о решения об определении управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link DecisionType }
             *     
             */
            public DecisionType getDecisionData() {
                return decisionData;
            }

            /**
             * Sets the value of the decisionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link DecisionType }
             *     
             * @see #getDecisionData()
             */
            public void setDecisionData(DecisionType value) {
                this.decisionData = value;
            }

            /**
             * Документ прилагаемый к информации о решения об определении управляющей организации
             * 
             * Gets the value of the attachedDocument property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachedDocument property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAttachedDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachedDecisionDocumentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the attachedDocument property.
             */
            public List<AttachedDecisionDocumentType> getAttachedDocument() {
                if (attachedDocument == null) {
                    attachedDocument = new ArrayList<>();
                }
                return this.attachedDocument;
            }

            /**
             * Дом в решении об определении управляющей организации
             * 
             * Gets the value of the house property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the house property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getHouse().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HouseType }
             * </p>
             * 
             * 
             * @return
             *     The value of the house property.
             */
            public List<HouseType> getHouse() {
                if (house == null) {
                    house = new ArrayList<>();
                }
                return this.house;
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
         *         <element name="OrgGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="DecisionData" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}DecisionType"/>
         *         <element name="AttachedDocument" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}AttachedDecisionDocumentType" maxOccurs="100"/>
         *         <element name="House" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}HouseType" maxOccurs="100" minOccurs="0"/>
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
            "orgGUID",
            "decisionData",
            "attachedDocument",
            "house"
        })
        public static class PlacingDecision {

            /**
             * Уникальный идентификатор управляющей организации
             * 
             */
            @XmlElement(name = "OrgGUID", required = true)
            protected String orgGUID;
            /**
             * Информация о решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "DecisionData", required = true)
            protected DecisionType decisionData;
            /**
             * Документ прилагаемый к информации о решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "AttachedDocument", required = true)
            protected List<AttachedDecisionDocumentType> attachedDocument;
            /**
             * Дом в решении об определении управляющей организации
             * 
             */
            @XmlElement(name = "House")
            protected List<HouseType> house;

            /**
             * Уникальный идентификатор управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgGUID() {
                return orgGUID;
            }

            /**
             * Sets the value of the orgGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgGUID()
             */
            public void setOrgGUID(String value) {
                this.orgGUID = value;
            }

            /**
             * Информация о решения об определении управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link DecisionType }
             *     
             */
            public DecisionType getDecisionData() {
                return decisionData;
            }

            /**
             * Sets the value of the decisionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link DecisionType }
             *     
             * @see #getDecisionData()
             */
            public void setDecisionData(DecisionType value) {
                this.decisionData = value;
            }

            /**
             * Документ прилагаемый к информации о решения об определении управляющей организации
             * 
             * Gets the value of the attachedDocument property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attachedDocument property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAttachedDocument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachedDecisionDocumentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the attachedDocument property.
             */
            public List<AttachedDecisionDocumentType> getAttachedDocument() {
                if (attachedDocument == null) {
                    attachedDocument = new ArrayList<>();
                }
                return this.attachedDocument;
            }

            /**
             * Дом в решении об определении управляющей организации
             * 
             * Gets the value of the house property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the house property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getHouse().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link HouseType }
             * </p>
             * 
             * 
             * @return
             *     The value of the house property.
             */
            public List<HouseType> getHouse() {
                if (house == null) {
                    house = new ArrayList<>();
                }
                return this.house;
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
         *         <element name="DecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "decisionGUID"
        })
        public static class PublishDecision {

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             */
            @XmlElement(name = "DecisionGUID", required = true)
            protected String decisionGUID;

            /**
             * Уникальный идентификатор решения об определении управляющей организации
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDecisionGUID() {
                return decisionGUID;
            }

            /**
             * Sets the value of the decisionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getDecisionGUID()
             */
            public void setDecisionGUID(String value) {
                this.decisionGUID = value;
            }

        }

    }

}
