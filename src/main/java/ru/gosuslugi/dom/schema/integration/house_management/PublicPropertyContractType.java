
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.individual_registry_base.IndType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * <p>Java class for PublicPropertyContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PublicPropertyContractType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="Organization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="Entrepreneur" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}IndType"/>
 *         </choice>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ContractNumber" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractNumberType"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ContractObject" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Comments" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Payment" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType" minOccurs="0"/>
 *         <element name="MoneySpentDirection" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <maxLength value="255"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ContractAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *         <element name="RentAgrConfirmationDocument" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="ProtocolMeetingOwners" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ProtocolNum">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <maxLength value="30"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             <element name="TrustDocAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="IsGratuitousBasis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicPropertyContractType", propOrder = {
    "organization",
    "entrepreneur",
    "fiasHouseGuid",
    "contractNumber",
    "date",
    "startDate",
    "endDate",
    "contractObject",
    "comments",
    "payment",
    "moneySpentDirection",
    "contractAttachment",
    "rentAgrConfirmationDocument",
    "isGratuitousBasis"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportPublicPropertyContractRequest.Contract.PublicPropertyContract.class
})
public class PublicPropertyContractType {

    /**
     * Организация
     * 
     */
    @XmlElement(name = "Organization")
    protected RegOrgType organization;
    /**
     * Физическое лицо
     * 
     */
    @XmlElement(name = "Entrepreneur")
    protected IndType entrepreneur;
    /**
     * Адрес. Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid", required = true)
    protected String fiasHouseGuid;
    /**
     * Номер договора
     * 
     */
    @XmlElement(name = "ContractNumber", required = true)
    protected String contractNumber;
    /**
     * Дата договора
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Дата начала действия договора
     * 
     */
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    /**
     * Планируемая дата окончания действия договора
     * 
     */
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    /**
     * Предмет договора
     * 
     */
    @XmlElement(name = "ContractObject")
    protected String contractObject;
    /**
     * Комментарий
     * 
     */
    @XmlElement(name = "Comments")
    protected String comments;
    /**
     * Размер платы за предоставление в пользование части общего имущества собственников помещений в МКД в месяц
     * 
     */
    @XmlElement(name = "Payment")
    protected BigDecimal payment;
    /**
     * Направление расходования средств, внесенных за пользование частью общего имущества
     * 
     */
    @XmlElement(name = "MoneySpentDirection")
    protected String moneySpentDirection;
    /**
     * Документы договора (Договор/дополнительные соглашения)
     * 
     */
    @XmlElement(name = "ContractAttachment", required = true)
    protected List<AttachmentType> contractAttachment;
    /**
     * Протокол собрания собственников
     * 
     */
    @XmlElement(name = "RentAgrConfirmationDocument", required = true)
    protected List<PublicPropertyContractType.RentAgrConfirmationDocument> rentAgrConfirmationDocument;
    /**
     * Договор заключен на безвозмездной основе?
     * 
     */
    @XmlElement(name = "IsGratuitousBasis")
    protected Boolean isGratuitousBasis;

    /**
     * Организация
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
     * Физическое лицо
     * 
     * @return
     *     possible object is
     *     {@link IndType }
     *     
     */
    public IndType getEntrepreneur() {
        return entrepreneur;
    }

    /**
     * Sets the value of the entrepreneur property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndType }
     *     
     * @see #getEntrepreneur()
     */
    public void setEntrepreneur(IndType value) {
        this.entrepreneur = value;
    }

    /**
     * Адрес. Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGuid() {
        return fiasHouseGuid;
    }

    /**
     * Sets the value of the fiasHouseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGuid()
     */
    public void setFIASHouseGuid(String value) {
        this.fiasHouseGuid = value;
    }

    /**
     * Номер договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractNumber()
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Дата договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Дата начала действия договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Планируемая дата окончания действия договора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Предмет договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractObject() {
        return contractObject;
    }

    /**
     * Sets the value of the contractObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractObject()
     */
    public void setContractObject(String value) {
        this.contractObject = value;
    }

    /**
     * Комментарий
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComments()
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Размер платы за предоставление в пользование части общего имущества собственников помещений в МКД в месяц
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPayment()
     */
    public void setPayment(BigDecimal value) {
        this.payment = value;
    }

    /**
     * Направление расходования средств, внесенных за пользование частью общего имущества
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneySpentDirection() {
        return moneySpentDirection;
    }

    /**
     * Sets the value of the moneySpentDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMoneySpentDirection()
     */
    public void setMoneySpentDirection(String value) {
        this.moneySpentDirection = value;
    }

    /**
     * Документы договора (Договор/дополнительные соглашения)
     * 
     * Gets the value of the contractAttachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractAttachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractAttachment property.
     */
    public List<AttachmentType> getContractAttachment() {
        if (contractAttachment == null) {
            contractAttachment = new ArrayList<>();
        }
        return this.contractAttachment;
    }

    /**
     * Протокол собрания собственников
     * 
     * Gets the value of the rentAgrConfirmationDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rentAgrConfirmationDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRentAgrConfirmationDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicPropertyContractType.RentAgrConfirmationDocument }
     * </p>
     * 
     * 
     * @return
     *     The value of the rentAgrConfirmationDocument property.
     */
    public List<PublicPropertyContractType.RentAgrConfirmationDocument> getRentAgrConfirmationDocument() {
        if (rentAgrConfirmationDocument == null) {
            rentAgrConfirmationDocument = new ArrayList<>();
        }
        return this.rentAgrConfirmationDocument;
    }

    /**
     * Договор заключен на безвозмездной основе?
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGratuitousBasis() {
        return isGratuitousBasis;
    }

    /**
     * Sets the value of the isGratuitousBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsGratuitousBasis()
     */
    public void setIsGratuitousBasis(Boolean value) {
        this.isGratuitousBasis = value;
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
     *         <element name="ProtocolMeetingOwners" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ProtocolNum">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <maxLength value="30"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   <element name="TrustDocAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
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
        "protocolMeetingOwners",
        "protocolGUID"
    })
    public static class RentAgrConfirmationDocument {

        /**
         * Протокол собрания собственников (Добавление нового протокола)
         * 
         */
        @XmlElement(name = "ProtocolMeetingOwners")
        protected List<PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners> protocolMeetingOwners;
        /**
         * Идентификатор версии протокола собрания собственников в ГИС ЖКХ  (Добавление протокола из реестра сведений о голосовании)
         * 
         */
        @XmlElement(name = "ProtocolGUID")
        protected List<String> protocolGUID;

        /**
         * Протокол собрания собственников (Добавление нового протокола)
         * 
         * Gets the value of the protocolMeetingOwners property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolMeetingOwners property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProtocolMeetingOwners().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners }
         * </p>
         * 
         * 
         * @return
         *     The value of the protocolMeetingOwners property.
         */
        public List<PublicPropertyContractType.RentAgrConfirmationDocument.ProtocolMeetingOwners> getProtocolMeetingOwners() {
            if (protocolMeetingOwners == null) {
                protocolMeetingOwners = new ArrayList<>();
            }
            return this.protocolMeetingOwners;
        }

        /**
         * Идентификатор версии протокола собрания собственников в ГИС ЖКХ  (Добавление протокола из реестра сведений о голосовании)
         * 
         * Gets the value of the protocolGUID property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolGUID property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getProtocolGUID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         * 
         * 
         * @return
         *     The value of the protocolGUID property.
         */
        public List<String> getProtocolGUID() {
            if (protocolGUID == null) {
                protocolGUID = new ArrayList<>();
            }
            return this.protocolGUID;
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
         *         <element name="ProtocolNum">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <maxLength value="30"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="ProtocolDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         <element name="TrustDocAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
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
            "protocolNum",
            "protocolDate",
            "trustDocAttachment"
        })
        public static class ProtocolMeetingOwners {

            /**
             * Номер протокола
             * 
             */
            @XmlElement(name = "ProtocolNum", required = true)
            protected String protocolNum;
            /**
             * Дата составления протокола
             * 
             */
            @XmlElement(name = "ProtocolDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar protocolDate;
            /**
             * Документы, подтверждающие полномочия заключать договор
             * 
             */
            @XmlElement(name = "TrustDocAttachment", required = true)
            protected List<AttachmentType> trustDocAttachment;

            /**
             * Номер протокола
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProtocolNum() {
                return protocolNum;
            }

            /**
             * Sets the value of the protocolNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getProtocolNum()
             */
            public void setProtocolNum(String value) {
                this.protocolNum = value;
            }

            /**
             * Дата составления протокола
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getProtocolDate() {
                return protocolDate;
            }

            /**
             * Sets the value of the protocolDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getProtocolDate()
             */
            public void setProtocolDate(XMLGregorianCalendar value) {
                this.protocolDate = value;
            }

            /**
             * Документы, подтверждающие полномочия заключать договор
             * 
             * Gets the value of the trustDocAttachment property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trustDocAttachment property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getTrustDocAttachment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AttachmentType }
             * </p>
             * 
             * 
             * @return
             *     The value of the trustDocAttachment property.
             */
            public List<AttachmentType> getTrustDocAttachment() {
                if (trustDocAttachment == null) {
                    trustDocAttachment = new ArrayList<>();
                }
                return this.trustDocAttachment;
            }

        }

    }

}
