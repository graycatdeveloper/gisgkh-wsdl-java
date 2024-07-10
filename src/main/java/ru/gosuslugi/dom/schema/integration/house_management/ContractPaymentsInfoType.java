
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
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Тип информации о размере платы за жилое помещение по ДУ
 * 
 * <p>Java class for ContractPaymentsInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ContractPaymentsInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="HouseManagementPaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
 *         <choice>
 *           <element name="Protocol" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *           <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </choice>
 *         <element name="ServicePayment" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Service" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                   <element name="ServicePaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}CaCHPaymentsMoneyType" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Type">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <length value="1"/>
 *               <enumeration value="P"/>
 *               <enumeration value="C"/>
 *               <enumeration value="A"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractPaymentsInfoType", propOrder = {
    "beginDate",
    "endDate",
    "houseManagementPaymentSize",
    "protocol",
    "votingProtocolGUID",
    "servicePayment",
    "type",
    "contractObjectVersionGUID"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportContractRequest.Contract.PlaceContractPaymentsInfo.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Contract.ContractPaymentsInfo.class
})
public class ContractPaymentsInfoType {

    /**
     * Дата начала периода
     * 
     */
    @XmlElement(name = "BeginDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    /**
     * Дата окончания периода
     * 
     */
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    /**
     * Размер платы (цена) за услуги, работы по управлению МКД (если утверждена протоколом обшего собрания собственников)/Размер платы за содержание жилого помещения, установленный по результатам открытого конкурса (если утверждена протоколом открытого конкурса)
     * 
     */
    @XmlElement(name = "HouseManagementPaymentSize", required = true)
    protected BigDecimal houseManagementPaymentSize;
    /**
     * Протокол общего собрания собственников помещений в многоквартирном доме об установлении размера платы за содержание жилого помещения
     * 
     */
    @XmlElement(name = "Protocol")
    protected List<AttachmentType> protocol;
    /**
     * Идентификатор версии протокола голосования с решением с типом 12.1 «Текущий ремонт общего имущества» и(или) с типом 15.1 «Другие вопросы» адресом объекта управления.
     * 
     */
    @XmlElement(name = "VotingProtocolGUID")
    protected String votingProtocolGUID;
    /**
     * Информация о размере платы (цене, тарифе) за содержание и текущий ремонт общего имущества в многоквартирном доме/Информация о размере платы за содержание жилого помещения, установленном по результатам открытого конкурса по отбору управляющей организации для управления многоквартирным домом
     * 
     */
    @XmlElement(name = "ServicePayment")
    protected List<ContractPaymentsInfoType.ServicePayment> servicePayment;
    /**
     * Тип размера платы:
     * (P)rotocol - утвержденный протоколом общего собрания собственников
     * (С)ompetition - установленный по результатам открытого конкурса
     * (A)uthority - установленный органом местного самоуправления
     * 
     */
    @XmlElement(name = "Type", required = true)
    protected String type;
    /**
     * Идентификатор версии объекта управления  в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractObjectVersionGUID")
    protected String contractObjectVersionGUID;

    /**
     * Дата начала периода
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getBeginDate()
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Дата окончания периода
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
     * Размер платы (цена) за услуги, работы по управлению МКД (если утверждена протоколом обшего собрания собственников)/Размер платы за содержание жилого помещения, установленный по результатам открытого конкурса (если утверждена протоколом открытого конкурса)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseManagementPaymentSize() {
        return houseManagementPaymentSize;
    }

    /**
     * Sets the value of the houseManagementPaymentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHouseManagementPaymentSize()
     */
    public void setHouseManagementPaymentSize(BigDecimal value) {
        this.houseManagementPaymentSize = value;
    }

    /**
     * Протокол общего собрания собственников помещений в многоквартирном доме об установлении размера платы за содержание жилого помещения
     * 
     * Gets the value of the protocol property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocol property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProtocol().add(newItem);
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
     *     The value of the protocol property.
     */
    public List<AttachmentType> getProtocol() {
        if (protocol == null) {
            protocol = new ArrayList<>();
        }
        return this.protocol;
    }

    /**
     * Идентификатор версии протокола голосования с решением с типом 12.1 «Текущий ремонт общего имущества» и(или) с типом 15.1 «Другие вопросы» адресом объекта управления.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingProtocolGUID() {
        return votingProtocolGUID;
    }

    /**
     * Sets the value of the votingProtocolGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingProtocolGUID()
     */
    public void setVotingProtocolGUID(String value) {
        this.votingProtocolGUID = value;
    }

    /**
     * Информация о размере платы (цене, тарифе) за содержание и текущий ремонт общего имущества в многоквартирном доме/Информация о размере платы за содержание жилого помещения, установленном по результатам открытого конкурса по отбору управляющей организации для управления многоквартирным домом
     * 
     * Gets the value of the servicePayment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePayment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServicePayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractPaymentsInfoType.ServicePayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the servicePayment property.
     */
    public List<ContractPaymentsInfoType.ServicePayment> getServicePayment() {
        if (servicePayment == null) {
            servicePayment = new ArrayList<>();
        }
        return this.servicePayment;
    }

    /**
     * Тип размера платы:
     * (P)rotocol - утвержденный протоколом общего собрания собственников
     * (С)ompetition - установленный по результатам открытого конкурса
     * (A)uthority - установленный органом местного самоуправления
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getType()
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Идентификатор версии объекта управления  в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractObjectVersionGUID() {
        return contractObjectVersionGUID;
    }

    /**
     * Sets the value of the contractObjectVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractObjectVersionGUID()
     */
    public void setContractObjectVersionGUID(String value) {
        this.contractObjectVersionGUID = value;
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
     *         <element name="Service" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *         <element name="ServicePaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}CaCHPaymentsMoneyType" minOccurs="0"/>
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
        "service",
        "servicePaymentSize"
    })
    public static class ServicePayment {

        /**
         * Работа/услуга организации (НСИ №59)
         * 
         */
        @XmlElement(name = "Service", required = true)
        protected NsiRef service;
        /**
         * Размер платы (цены, тарифа) за работы (услуги)/Размер платы за работы (услуги), в целой части указываются рубли, в вещественной - до сотых долей копеек.
         * 
         */
        @XmlElement(name = "ServicePaymentSize")
        protected BigDecimal servicePaymentSize;

        /**
         * Работа/услуга организации (НСИ №59)
         * 
         * @return
         *     possible object is
         *     {@link NsiRef }
         *     
         */
        public NsiRef getService() {
            return service;
        }

        /**
         * Sets the value of the service property.
         * 
         * @param value
         *     allowed object is
         *     {@link NsiRef }
         *     
         * @see #getService()
         */
        public void setService(NsiRef value) {
            this.service = value;
        }

        /**
         * Размер платы (цены, тарифа) за работы (услуги)/Размер платы за работы (услуги), в целой части указываются рубли, в вещественной - до сотых долей копеек.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getServicePaymentSize() {
            return servicePaymentSize;
        }

        /**
         * Sets the value of the servicePaymentSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getServicePaymentSize()
         */
        public void setServicePaymentSize(BigDecimal value) {
            this.servicePaymentSize = value;
        }

    }

}
