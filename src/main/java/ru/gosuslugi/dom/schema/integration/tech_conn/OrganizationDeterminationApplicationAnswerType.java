
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.SignedAttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Составной тип. Отправка ответа по заявлению на определение организации для технологического присоединения
 * 
 * <p>Java class for OrganizationDeterminationApplicationAnswerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganizationDeterminationApplicationAnswerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AnswerByNetworkType" maxOccurs="2">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <choice>
 *                     <sequence>
 *                       <element name="NetworkOrganization" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OrganizationInAnswerType" maxOccurs="unbounded"/>
 *                       <element name="SupplyOrganization" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OrganizationInAnswerType" maxOccurs="unbounded"/>
 *                       <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type" minOccurs="0"/>
 *                       <element name="AdditionalDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                     </sequence>
 *                     <sequence>
 *                       <element name="RejectReason" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
 *                       <element name="RejectReasonDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
 *                     </sequence>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDeterminationApplicationAnswerType", propOrder = {
    "answerByNetworkType"
})
public class OrganizationDeterminationApplicationAnswerType {

    /**
     * Ответ по виду централизованной сети
     * 
     */
    @XmlElement(name = "AnswerByNetworkType", required = true)
    protected List<OrganizationDeterminationApplicationAnswerType.AnswerByNetworkType> answerByNetworkType;

    /**
     * Ответ по виду централизованной сети
     * 
     * Gets the value of the answerByNetworkType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the answerByNetworkType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAnswerByNetworkType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationDeterminationApplicationAnswerType.AnswerByNetworkType }
     * </p>
     * 
     * 
     * @return
     *     The value of the answerByNetworkType property.
     */
    public List<OrganizationDeterminationApplicationAnswerType.AnswerByNetworkType> getAnswerByNetworkType() {
        if (answerByNetworkType == null) {
            answerByNetworkType = new ArrayList<>();
        }
        return this.answerByNetworkType;
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
     *         <element name="NetworkType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <choice>
     *           <sequence>
     *             <element name="NetworkOrganization" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OrganizationInAnswerType" maxOccurs="unbounded"/>
     *             <element name="SupplyOrganization" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}OrganizationInAnswerType" maxOccurs="unbounded"/>
     *             <element name="AdditionalInfo" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type" minOccurs="0"/>
     *             <element name="AdditionalDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded" minOccurs="0"/>
     *           </sequence>
     *           <sequence>
     *             <element name="RejectReason" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String500Type"/>
     *             <element name="RejectReasonDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}SignedAttachmentType" maxOccurs="unbounded"/>
     *           </sequence>
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
        "networkType",
        "networkOrganization",
        "supplyOrganization",
        "additionalInfo",
        "additionalDocument",
        "rejectReason",
        "rejectReasonDocument"
    })
    public static class AnswerByNetworkType {

        /**
         * Вид централизованной сети для подключения. Справочник "Вид сетей для технологического присоедиенения"
         * 
         */
        @XmlElement(name = "NetworkType", required = true)
        protected NsiRef networkType;
        /**
         * Сведения о сетевой организации
         * 
         */
        @XmlElement(name = "NetworkOrganization")
        protected List<OrganizationInAnswerType> networkOrganization;
        /**
         * Сведения о сбытовой (ресурсоснабжающей организации)
         * 
         */
        @XmlElement(name = "SupplyOrganization")
        protected List<OrganizationInAnswerType> supplyOrganization;
        /**
         * Дополнительная информация
         * 
         */
        @XmlElement(name = "AdditionalInfo")
        protected String additionalInfo;
        /**
         * Прикладываемый документ
         * 
         */
        @XmlElement(name = "AdditionalDocument")
        protected List<SignedAttachmentType> additionalDocument;
        /**
         * Кратколе описание причины невозможности подключения объекта к централизованной сети
         * 
         */
        @XmlElement(name = "RejectReason")
        protected String rejectReason;
        /**
         * Документ, содержащий описание причины невозможности подключения объекта к централизованной сети
         * 
         */
        @XmlElement(name = "RejectReasonDocument")
        protected List<SignedAttachmentType> rejectReasonDocument;

        /**
         * Вид централизованной сети для подключения. Справочник "Вид сетей для технологического присоедиенения"
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getNetworkType() {
            return networkType;
        }

        /**
         * Sets the value of the networkType property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getNetworkType()
         */
        public void setNetworkType(NsiRef value) {
            this.networkType = value;
        }

        /**
         * Сведения о сетевой организации
         * 
         * Gets the value of the networkOrganization property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkOrganization property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getNetworkOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInAnswerType }
         * </p>
         * 
         * 
         * @return
         *     The value of the networkOrganization property.
         */
        public List<OrganizationInAnswerType> getNetworkOrganization() {
            if (networkOrganization == null) {
                networkOrganization = new ArrayList<>();
            }
            return this.networkOrganization;
        }

        /**
         * Сведения о сбытовой (ресурсоснабжающей организации)
         * 
         * Gets the value of the supplyOrganization property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplyOrganization property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getSupplyOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInAnswerType }
         * </p>
         * 
         * 
         * @return
         *     The value of the supplyOrganization property.
         */
        public List<OrganizationInAnswerType> getSupplyOrganization() {
            if (supplyOrganization == null) {
                supplyOrganization = new ArrayList<>();
            }
            return this.supplyOrganization;
        }

        /**
         * Дополнительная информация
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfo() {
            return additionalInfo;
        }

        /**
         * Sets the value of the additionalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAdditionalInfo()
         */
        public void setAdditionalInfo(String value) {
            this.additionalInfo = value;
        }

        /**
         * Прикладываемый документ
         * 
         * Gets the value of the additionalDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the additionalDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getAdditionalDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SignedAttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the additionalDocument property.
         */
        public List<SignedAttachmentType> getAdditionalDocument() {
            if (additionalDocument == null) {
                additionalDocument = new ArrayList<>();
            }
            return this.additionalDocument;
        }

        /**
         * Кратколе описание причины невозможности подключения объекта к централизованной сети
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRejectReason() {
            return rejectReason;
        }

        /**
         * Sets the value of the rejectReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRejectReason()
         */
        public void setRejectReason(String value) {
            this.rejectReason = value;
        }

        /**
         * Документ, содержащий описание причины невозможности подключения объекта к централизованной сети
         * 
         * Gets the value of the rejectReasonDocument property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rejectReasonDocument property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRejectReasonDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SignedAttachmentType }
         * </p>
         * 
         * 
         * @return
         *     The value of the rejectReasonDocument property.
         */
        public List<SignedAttachmentType> getRejectReasonDocument() {
            if (rejectReasonDocument == null) {
                rejectReasonDocument = new ArrayList<>();
            }
            return this.rejectReasonDocument;
        }

    }

}
