
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
 * Тип информации о размере платы за жилое помещение по уставу
 * 
 * <p>Java class for CharterPaymentsInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CharterPaymentsInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BeginDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="MaintenanceAndRepairsForMembers" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="MaintenanceAndRepairsForMembersPaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
 *                   <element name="MaintenanceAndRepairsForMembersProtocol" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MaintenanceAndRepairsForNonMembersInfo" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="MaintenanceAndRepairsForNonMembersPaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
 *                   <element name="MaintenanceAndRepairsForNonMembersProtocol" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
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
 *         <choice minOccurs="0">
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID"/>
 *           <element name="AllContractObjects" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "CharterPaymentsInfoType", propOrder = {
    "beginDate",
    "endDate",
    "maintenanceAndRepairsForMembers",
    "maintenanceAndRepairsForNonMembersInfo",
    "servicePayment",
    "contractObjectVersionGUID",
    "allContractObjects"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ImportCharterRequest.PlaceCharterPaymentsInfo.class,
    ru.gosuslugi.dom.schema.integration.house_management.ExportCAChResultType.Charter.CharterPaymentsInfo.class
})
public class CharterPaymentsInfoType {

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
     * Информация о размере обязательных платежей и (или) взносов членов товарищества, кооператива,
     * связанных с оплатой расходов на содержание и текущий ремонт общего имущества в МКД
     * 
     */
    @XmlElement(name = "MaintenanceAndRepairsForMembers")
    protected CharterPaymentsInfoType.MaintenanceAndRepairsForMembers maintenanceAndRepairsForMembers;
    /**
     * Информация о размере платы за содержание и ремонт жилого помещения для собственника
     * помещения в МКД, не являющегося членом товарищества, кооператива
     * 
     */
    @XmlElement(name = "MaintenanceAndRepairsForNonMembersInfo")
    protected CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo maintenanceAndRepairsForNonMembersInfo;
    /**
     * Информация о размере платы (цене, тарифе) за содержание и текущий ремонт общего имущества в многоквартирном доме
     * 
     */
    @XmlElement(name = "ServicePayment")
    protected List<CharterPaymentsInfoType.ServicePayment> servicePayment;
    /**
     * Идентификатор версии объекта управления  в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractObjectVersionGUID")
    protected String contractObjectVersionGUID;
    /**
     * Для всех управляемых объектов
     * 
     */
    @XmlElement(name = "AllContractObjects")
    protected Boolean allContractObjects;

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
     * Информация о размере обязательных платежей и (или) взносов членов товарищества, кооператива,
     * связанных с оплатой расходов на содержание и текущий ремонт общего имущества в МКД
     * 
     * @return
     *     possible object is
     *     {@link CharterPaymentsInfoType.MaintenanceAndRepairsForMembers }
     *     
     */
    public CharterPaymentsInfoType.MaintenanceAndRepairsForMembers getMaintenanceAndRepairsForMembers() {
        return maintenanceAndRepairsForMembers;
    }

    /**
     * Sets the value of the maintenanceAndRepairsForMembers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterPaymentsInfoType.MaintenanceAndRepairsForMembers }
     *     
     * @see #getMaintenanceAndRepairsForMembers()
     */
    public void setMaintenanceAndRepairsForMembers(CharterPaymentsInfoType.MaintenanceAndRepairsForMembers value) {
        this.maintenanceAndRepairsForMembers = value;
    }

    /**
     * Информация о размере платы за содержание и ремонт жилого помещения для собственника
     * помещения в МКД, не являющегося членом товарищества, кооператива
     * 
     * @return
     *     possible object is
     *     {@link CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo }
     *     
     */
    public CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo getMaintenanceAndRepairsForNonMembersInfo() {
        return maintenanceAndRepairsForNonMembersInfo;
    }

    /**
     * Sets the value of the maintenanceAndRepairsForNonMembersInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo }
     *     
     * @see #getMaintenanceAndRepairsForNonMembersInfo()
     */
    public void setMaintenanceAndRepairsForNonMembersInfo(CharterPaymentsInfoType.MaintenanceAndRepairsForNonMembersInfo value) {
        this.maintenanceAndRepairsForNonMembersInfo = value;
    }

    /**
     * Информация о размере платы (цене, тарифе) за содержание и текущий ремонт общего имущества в многоквартирном доме
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
     * {@link CharterPaymentsInfoType.ServicePayment }
     * </p>
     * 
     * 
     * @return
     *     The value of the servicePayment property.
     */
    public List<CharterPaymentsInfoType.ServicePayment> getServicePayment() {
        if (servicePayment == null) {
            servicePayment = new ArrayList<>();
        }
        return this.servicePayment;
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
     * Для всех управляемых объектов
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllContractObjects() {
        return allContractObjects;
    }

    /**
     * Sets the value of the allContractObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isAllContractObjects()
     */
    public void setAllContractObjects(Boolean value) {
        this.allContractObjects = value;
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
     *         <element name="MaintenanceAndRepairsForMembersPaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
     *         <element name="MaintenanceAndRepairsForMembersProtocol" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
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
        "maintenanceAndRepairsForMembersPaymentSize",
        "maintenanceAndRepairsForMembersProtocol"
    })
    public static class MaintenanceAndRepairsForMembers {

        /**
         * Размер обязательных платежей и (или) взносов членов товарищества, кооператива
         * 
         */
        @XmlElement(name = "MaintenanceAndRepairsForMembersPaymentSize", required = true)
        protected BigDecimal maintenanceAndRepairsForMembersPaymentSize;
        /**
         * Протокол общего собрания членов товарищества, кооператива об утверждении обязательных платежей и (или) взносов членов товарищества, кооператива
         * 
         */
        @XmlElement(name = "MaintenanceAndRepairsForMembersProtocol", required = true)
        protected List<AttachmentType> maintenanceAndRepairsForMembersProtocol;

        /**
         * Размер обязательных платежей и (или) взносов членов товарищества, кооператива
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaintenanceAndRepairsForMembersPaymentSize() {
            return maintenanceAndRepairsForMembersPaymentSize;
        }

        /**
         * Sets the value of the maintenanceAndRepairsForMembersPaymentSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMaintenanceAndRepairsForMembersPaymentSize()
         */
        public void setMaintenanceAndRepairsForMembersPaymentSize(BigDecimal value) {
            this.maintenanceAndRepairsForMembersPaymentSize = value;
        }

        /**
         * Протокол общего собрания членов товарищества, кооператива об утверждении обязательных платежей и (или) взносов членов товарищества, кооператива
         * 
         * Gets the value of the maintenanceAndRepairsForMembersProtocol property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maintenanceAndRepairsForMembersProtocol property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMaintenanceAndRepairsForMembersProtocol().add(newItem);
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
         *     The value of the maintenanceAndRepairsForMembersProtocol property.
         */
        public List<AttachmentType> getMaintenanceAndRepairsForMembersProtocol() {
            if (maintenanceAndRepairsForMembersProtocol == null) {
                maintenanceAndRepairsForMembersProtocol = new ArrayList<>();
            }
            return this.maintenanceAndRepairsForMembersProtocol;
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
     *         <element name="MaintenanceAndRepairsForNonMembersPaymentSize" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
     *         <element name="MaintenanceAndRepairsForNonMembersProtocol" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
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
        "maintenanceAndRepairsForNonMembersPaymentSize",
        "maintenanceAndRepairsForNonMembersProtocol"
    })
    public static class MaintenanceAndRepairsForNonMembersInfo {

        /**
         * Размер платы за содержание и ремонт жилого помещения для собственника помещения в МКД
         * 
         */
        @XmlElement(name = "MaintenanceAndRepairsForNonMembersPaymentSize", required = true)
        protected BigDecimal maintenanceAndRepairsForNonMembersPaymentSize;
        /**
         * Протокол общего собрания членов товарищества, кооператива об утверждении размера платы за содержание и ремонт жилого помещения для собственника помещения в многоквартирном доме
         * 
         */
        @XmlElement(name = "MaintenanceAndRepairsForNonMembersProtocol", required = true)
        protected List<AttachmentType> maintenanceAndRepairsForNonMembersProtocol;

        /**
         * Размер платы за содержание и ремонт жилого помещения для собственника помещения в МКД
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaintenanceAndRepairsForNonMembersPaymentSize() {
            return maintenanceAndRepairsForNonMembersPaymentSize;
        }

        /**
         * Sets the value of the maintenanceAndRepairsForNonMembersPaymentSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getMaintenanceAndRepairsForNonMembersPaymentSize()
         */
        public void setMaintenanceAndRepairsForNonMembersPaymentSize(BigDecimal value) {
            this.maintenanceAndRepairsForNonMembersPaymentSize = value;
        }

        /**
         * Протокол общего собрания членов товарищества, кооператива об утверждении размера платы за содержание и ремонт жилого помещения для собственника помещения в многоквартирном доме
         * 
         * Gets the value of the maintenanceAndRepairsForNonMembersProtocol property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the maintenanceAndRepairsForNonMembersProtocol property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMaintenanceAndRepairsForNonMembersProtocol().add(newItem);
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
         *     The value of the maintenanceAndRepairsForNonMembersProtocol property.
         */
        public List<AttachmentType> getMaintenanceAndRepairsForNonMembersProtocol() {
            if (maintenanceAndRepairsForNonMembersProtocol == null) {
                maintenanceAndRepairsForNonMembersProtocol = new ArrayList<>();
            }
            return this.maintenanceAndRepairsForNonMembersProtocol;
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
         * Размер платы (цена) за услуги, работы по управлению МКД. В целой части указываются рубли, в вещественной сотые долей копеек.
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
         * Размер платы (цена) за услуги, работы по управлению МКД. В целой части указываются рубли, в вещественной сотые долей копеек.
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
