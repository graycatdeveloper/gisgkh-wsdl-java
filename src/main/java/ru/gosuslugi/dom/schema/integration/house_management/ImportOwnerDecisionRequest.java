
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
 *         <element name="OwnerDecision" maxOccurs="10000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="ProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
 *                   <element name="RootOwnerDecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="Decision" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerDecisionType"/>
 *                     <element name="AnnulDecision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.0.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ownerDecision"
})
@XmlRootElement(name = "importOwnerDecisionRequest")
public class ImportOwnerDecisionRequest
    extends BaseType
{

    /**
     * Решение собственника по вопросам голосования
     * 
     */
    @XmlElement(name = "OwnerDecision", required = true)
    protected List<ImportOwnerDecisionRequest.OwnerDecision> ownerDecision;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Решение собственника по вопросам голосования
     * 
     * Gets the value of the ownerDecision property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerDecision property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOwnerDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOwnerDecisionRequest.OwnerDecision }
     * </p>
     * 
     * 
     * @return
     *     The value of the ownerDecision property.
     */
    public List<ImportOwnerDecisionRequest.OwnerDecision> getOwnerDecision() {
        if (ownerDecision == null) {
            ownerDecision = new ArrayList<>();
        }
        return this.ownerDecision;
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
            return "13.0.0.2";
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
     *           <element name="ProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
     *         <element name="RootOwnerDecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="Decision" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}OwnerDecisionType"/>
     *           <element name="AnnulDecision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "protocolGUID",
        "messageGUID",
        "rootOwnerDecisionGUID",
        "decision",
        "annulDecision"
    })
    public static class OwnerDecision {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Идентификатор версии протокола ОСС в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ProtocolGUID")
        protected String protocolGUID;
        /**
         * Идентификатор сообщения о проведении ОСС в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "MessageGUID")
        protected String messageGUID;
        /**
         * Корневой идентификатор решения собственника по вопросам голосования
         * 
         */
        @XmlElement(name = "RootOwnerDecisionGUID")
        protected String rootOwnerDecisionGUID;
        /**
         * Создание/Изменение решения
         * 
         */
        @XmlElement(name = "Decision")
        protected OwnerDecisionType decision;
        /**
         * Аннулировать решение
         * 
         */
        @XmlElement(name = "AnnulDecision")
        protected Boolean annulDecision;

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
         * Идентификатор версии протокола ОСС в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolGUID() {
            return protocolGUID;
        }

        /**
         * Sets the value of the protocolGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getProtocolGUID()
         */
        public void setProtocolGUID(String value) {
            this.protocolGUID = value;
        }

        /**
         * Идентификатор сообщения о проведении ОСС в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageGUID() {
            return messageGUID;
        }

        /**
         * Sets the value of the messageGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getMessageGUID()
         */
        public void setMessageGUID(String value) {
            this.messageGUID = value;
        }

        /**
         * Корневой идентификатор решения собственника по вопросам голосования
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRootOwnerDecisionGUID() {
            return rootOwnerDecisionGUID;
        }

        /**
         * Sets the value of the rootOwnerDecisionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRootOwnerDecisionGUID()
         */
        public void setRootOwnerDecisionGUID(String value) {
            this.rootOwnerDecisionGUID = value;
        }

        /**
         * Создание/Изменение решения
         * 
         * @return
         *     possible object is
         *     {@link OwnerDecisionType }
         *     
         */
        public OwnerDecisionType getDecision() {
            return decision;
        }

        /**
         * Sets the value of the decision property.
         * 
         * @param value
         *     allowed object is
         *     {@link OwnerDecisionType }
         *     
         * @see #getDecision()
         */
        public void setDecision(OwnerDecisionType value) {
            this.decision = value;
        }

        /**
         * Аннулировать решение
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAnnulDecision() {
            return annulDecision;
        }

        /**
         * Sets the value of the annulDecision property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isAnnulDecision()
         */
        public void setAnnulDecision(Boolean value) {
            this.annulDecision = value;
        }

    }

}
