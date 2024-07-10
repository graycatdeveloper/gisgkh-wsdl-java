
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Задолженность услугам в ПД
 * 
 * <p>Java class for PDServiceDebtType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PDServiceDebtType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="HousingService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType">
 *                 <sequence minOccurs="0">
 *                   <element name="MunicipalResource" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <choice>
 *                               <element name="TotalPayable">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                     <totalDigits value="18"/>
 *                                     <fractionDigits value="2"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="TotalSumDebtPayable">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                     <totalDigits value="18"/>
 *                                     <fractionDigits value="2"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </choice>
 *                             <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <element name="GeneralMunicipalResource" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                       <choice>
 *                                         <element name="TotalPayable">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                               <totalDigits value="18"/>
 *                                               <fractionDigits value="2"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="TotalSumDebtPayable">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                               <totalDigits value="18"/>
 *                                               <fractionDigits value="2"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                       </choice>
 *                                       <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AdditionalService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MunicipalService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="GroupMunicipalService">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TypeMunicipalService">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             <choice>
 *                               <sequence>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                                 <element name="TotalPayable">
 *                                   <simpleType>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                       <totalDigits value="13"/>
 *                                       <fractionDigits value="2"/>
 *                                     </restriction>
 *                                   </simpleType>
 *                                 </element>
 *                               </sequence>
 *                               <element name="TotalSumDebtPayable">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                     <totalDigits value="18"/>
 *                                     <fractionDigits value="2"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </choice>
 *                             <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MunicipalService" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
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
@XmlType(name = "PDServiceDebtType", propOrder = {
    "housingService",
    "additionalService",
    "municipalService",
    "groupMunicipalService"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.PaymentDocumentExportType.ChargeDebt.class
})
public class PDServiceDebtType {

    /**
     * Жилищная услуга
     * 
     */
    @XmlElement(name = "HousingService")
    protected PDServiceDebtType.HousingService housingService;
    /**
     * Дополнительная услуга
     * 
     */
    @XmlElement(name = "AdditionalService")
    protected PDServiceDebtType.AdditionalService additionalService;
    /**
     * Главная коммунальная услуга
     * 
     */
    @XmlElement(name = "MunicipalService")
    protected PDServiceDebtType.MunicipalService municipalService;
    /**
     * Блок главных коммунальных услуг, сгруппированных по виду коммунальной услуги.
     * Заполняется, если для расчета итоговой суммы начислений по коммунальной услуге используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
     * 
     */
    @XmlElement(name = "GroupMunicipalService")
    protected PDServiceDebtType.GroupMunicipalService groupMunicipalService;

    /**
     * Жилищная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtType.HousingService }
     *     
     */
    public PDServiceDebtType.HousingService getHousingService() {
        return housingService;
    }

    /**
     * Sets the value of the housingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtType.HousingService }
     *     
     * @see #getHousingService()
     */
    public void setHousingService(PDServiceDebtType.HousingService value) {
        this.housingService = value;
    }

    /**
     * Дополнительная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtType.AdditionalService }
     *     
     */
    public PDServiceDebtType.AdditionalService getAdditionalService() {
        return additionalService;
    }

    /**
     * Sets the value of the additionalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtType.AdditionalService }
     *     
     * @see #getAdditionalService()
     */
    public void setAdditionalService(PDServiceDebtType.AdditionalService value) {
        this.additionalService = value;
    }

    /**
     * Главная коммунальная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtType.MunicipalService }
     *     
     */
    public PDServiceDebtType.MunicipalService getMunicipalService() {
        return municipalService;
    }

    /**
     * Sets the value of the municipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtType.MunicipalService }
     *     
     * @see #getMunicipalService()
     */
    public void setMunicipalService(PDServiceDebtType.MunicipalService value) {
        this.municipalService = value;
    }

    /**
     * Блок главных коммунальных услуг, сгруппированных по виду коммунальной услуги.
     * Заполняется, если для расчета итоговой суммы начислений по коммунальной услуге используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtType.GroupMunicipalService }
     *     
     */
    public PDServiceDebtType.GroupMunicipalService getGroupMunicipalService() {
        return groupMunicipalService;
    }

    /**
     * Sets the value of the groupMunicipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtType.GroupMunicipalService }
     *     
     * @see #getGroupMunicipalService()
     */
    public void setGroupMunicipalService(PDServiceDebtType.GroupMunicipalService value) {
        this.groupMunicipalService = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalService
        extends ServiceDebtType
    {


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
     *         <element name="TypeMunicipalService">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   <choice>
     *                     <sequence>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *                       <element name="TotalPayable">
     *                         <simpleType>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                             <totalDigits value="13"/>
     *                             <fractionDigits value="2"/>
     *                           </restriction>
     *                         </simpleType>
     *                       </element>
     *                     </sequence>
     *                     <element name="TotalSumDebtPayable">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           <totalDigits value="18"/>
     *                           <fractionDigits value="2"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </choice>
     *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MunicipalService" type="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType" maxOccurs="unbounded" minOccurs="0"/>
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
        "typeMunicipalService",
        "municipalService"
    })
    public static class GroupMunicipalService {

        /**
         * Вид коммунальной услуги
         * 
         */
        @XmlElement(name = "TypeMunicipalService", required = true)
        protected PDServiceDebtType.GroupMunicipalService.TypeMunicipalService typeMunicipalService;
        /**
         * Главная коммунальная услуга
         * 
         */
        @XmlElement(name = "MunicipalService")
        protected List<ServiceDebtType> municipalService;

        /**
         * Вид коммунальной услуги
         * 
         * @return
         *     possible object is
         *     {@link PDServiceDebtType.GroupMunicipalService.TypeMunicipalService }
         *     
         */
        public PDServiceDebtType.GroupMunicipalService.TypeMunicipalService getTypeMunicipalService() {
            return typeMunicipalService;
        }

        /**
         * Sets the value of the typeMunicipalService property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceDebtType.GroupMunicipalService.TypeMunicipalService }
         *     
         * @see #getTypeMunicipalService()
         */
        public void setTypeMunicipalService(PDServiceDebtType.GroupMunicipalService.TypeMunicipalService value) {
            this.typeMunicipalService = value;
        }

        /**
         * Главная коммунальная услуга
         * 
         * Gets the value of the municipalService property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the municipalService property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMunicipalService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceDebtType }
         * </p>
         * 
         * 
         * @return
         *     The value of the municipalService property.
         */
        public List<ServiceDebtType> getMunicipalService() {
            if (municipalService == null) {
                municipalService = new ArrayList<>();
            }
            return this.municipalService;
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
         *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <choice>
         *           <sequence>
         *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
         *             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
         *             <element name="TotalPayable">
         *               <simpleType>
         *                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                   <totalDigits value="13"/>
         *                   <fractionDigits value="2"/>
         *                 </restriction>
         *               </simpleType>
         *             </element>
         *           </sequence>
         *           <element name="TotalSumDebtPayable">
         *             <simpleType>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                 <totalDigits value="18"/>
         *                 <fractionDigits value="2"/>
         *               </restriction>
         *             </simpleType>
         *           </element>
         *         </choice>
         *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
            "serviceType",
            "month",
            "year",
            "totalPayable",
            "totalSumDebtPayable",
            "orgPPAGUID"
        })
        public static class TypeMunicipalService {

            /**
             * Код вида коммунальной услуги из справочника НСИ 3 "Вид коммунальной услуги"
             * 
             */
            @XmlElement(name = "ServiceType", required = true)
            protected NsiRef serviceType;
            /**
             * Месяц
             * 
             */
            @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected Integer month;
            /**
             * Год
             * 
             */
            @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected Short year;
            /**
             * К оплате за расчетный период, руб.
             * 
             */
            @XmlElement(name = "TotalPayable")
            protected BigDecimal totalPayable;
            /**
             * Итого к оплате за расчетный период платежного документа, руб.
             * 
             */
            @XmlElement(name = "TotalSumDebtPayable")
            protected BigDecimal totalSumDebtPayable;
            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
             * 
             */
            protected String orgPPAGUID;

            /**
             * Код вида коммунальной услуги из справочника НСИ 3 "Вид коммунальной услуги"
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getServiceType() {
                return serviceType;
            }

            /**
             * Sets the value of the serviceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getServiceType()
             */
            public void setServiceType(NsiRef value) {
                this.serviceType = value;
            }

            /**
             * Месяц
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMonth() {
                return month;
            }

            /**
             * Sets the value of the month property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             * @see #getMonth()
             */
            public void setMonth(Integer value) {
                this.month = value;
            }

            /**
             * Год
             * 
             * @return
             *     possible object is
             *     {@link Short }
             *     
             */
            public Short getYear() {
                return year;
            }

            /**
             * Sets the value of the year property.
             * 
             * @param value
             *     allowed object is
             *     {@link Short }
             *     
             * @see #getYear()
             */
            public void setYear(Short value) {
                this.year = value;
            }

            /**
             * К оплате за расчетный период, руб.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayable() {
                return totalPayable;
            }

            /**
             * Sets the value of the totalPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayable()
             */
            public void setTotalPayable(BigDecimal value) {
                this.totalPayable = value;
            }

            /**
             * Итого к оплате за расчетный период платежного документа, руб.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalSumDebtPayable() {
                return totalSumDebtPayable;
            }

            /**
             * Sets the value of the totalSumDebtPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalSumDebtPayable()
             */
            public void setTotalSumDebtPayable(BigDecimal value) {
                this.totalSumDebtPayable = value;
            }

            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgPPAGUID() {
                return orgPPAGUID;
            }

            /**
             * Sets the value of the orgPPAGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgPPAGUID()
             */
            public void setOrgPPAGUID(String value) {
                this.orgPPAGUID = value;
            }

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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType">
     *       <sequence minOccurs="0">
     *         <element name="MunicipalResource" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <choice>
     *                     <element name="TotalPayable">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           <totalDigits value="18"/>
     *                           <fractionDigits value="2"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="TotalSumDebtPayable">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                           <totalDigits value="18"/>
     *                           <fractionDigits value="2"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </choice>
     *                   <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <element name="GeneralMunicipalResource" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                             <choice>
     *                               <element name="TotalPayable">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                     <totalDigits value="18"/>
     *                                     <fractionDigits value="2"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="TotalSumDebtPayable">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                     <totalDigits value="18"/>
     *                                     <fractionDigits value="2"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                             </choice>
     *                             <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "municipalResource"
    })
    public static class HousingService
        extends ServiceDebtType
    {

        /**
         * Виды коммунальных ресурсов, потребляемых при использовании и содержании общего имущества в многоквартирном доме
         * 
         */
        @XmlElement(name = "MunicipalResource")
        protected List<PDServiceDebtType.HousingService.MunicipalResource> municipalResource;

        /**
         * Виды коммунальных ресурсов, потребляемых при использовании и содержании общего имущества в многоквартирном доме
         * 
         * Gets the value of the municipalResource property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the municipalResource property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getMunicipalResource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PDServiceDebtType.HousingService.MunicipalResource }
         * </p>
         * 
         * 
         * @return
         *     The value of the municipalResource property.
         */
        public List<PDServiceDebtType.HousingService.MunicipalResource> getMunicipalResource() {
            if (municipalResource == null) {
                municipalResource = new ArrayList<>();
            }
            return this.municipalResource;
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
         *         <choice>
         *           <element name="TotalPayable">
         *             <simpleType>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                 <totalDigits value="18"/>
         *                 <fractionDigits value="2"/>
         *               </restriction>
         *             </simpleType>
         *           </element>
         *           <element name="TotalSumDebtPayable">
         *             <simpleType>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                 <totalDigits value="18"/>
         *                 <fractionDigits value="2"/>
         *               </restriction>
         *             </simpleType>
         *           </element>
         *         </choice>
         *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <element name="GeneralMunicipalResource" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   <choice>
         *                     <element name="TotalPayable">
         *                       <simpleType>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                           <totalDigits value="18"/>
         *                           <fractionDigits value="2"/>
         *                         </restriction>
         *                       </simpleType>
         *                     </element>
         *                     <element name="TotalSumDebtPayable">
         *                       <simpleType>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                           <totalDigits value="18"/>
         *                           <fractionDigits value="2"/>
         *                         </restriction>
         *                       </simpleType>
         *                     </element>
         *                   </choice>
         *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "totalPayable",
            "totalSumDebtPayable",
            "serviceType",
            "orgPPAGUID",
            "generalMunicipalResource"
        })
        public static class MunicipalResource {

            /**
             * К оплате за расчетный период, руб. Если Жилищная услуга детализирована по периоду (Month и Year заполнены)
             * 
             */
            @XmlElement(name = "TotalPayable")
            protected BigDecimal totalPayable;
            /**
             * Итого к оплате за расчетный период платежного документа, руб. Если для Жилищной услуги заполнен элемент Итого к оплате за расчетный период платежного документа, руб. (TotalSumDebtPayable)
             * 
             */
            @XmlElement(name = "TotalSumDebtPayable")
            protected BigDecimal totalSumDebtPayable;
            /**
             * Код коммунального ресурса при содержании общего имущества. НСИ 2 "Вид коммунального ресурса"
             * 
             */
            @XmlElement(name = "ServiceType", required = true)
            protected NsiRef serviceType;
            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
             * 
             */
            protected String orgPPAGUID;
            /**
             * Главные коммунальные ресурсы потребляемые при использовании и содержании общего имущества в многоквартирном доме. 
             * Группируются по виду коммунального ресурса.
             * Заполняются, если для расчета итоговой суммы начислений по виду коммунального ресурса используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
             * 
             */
            @XmlElement(name = "GeneralMunicipalResource")
            protected List<PDServiceDebtType.HousingService.MunicipalResource.GeneralMunicipalResource> generalMunicipalResource;

            /**
             * К оплате за расчетный период, руб. Если Жилищная услуга детализирована по периоду (Month и Year заполнены)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalPayable() {
                return totalPayable;
            }

            /**
             * Sets the value of the totalPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalPayable()
             */
            public void setTotalPayable(BigDecimal value) {
                this.totalPayable = value;
            }

            /**
             * Итого к оплате за расчетный период платежного документа, руб. Если для Жилищной услуги заполнен элемент Итого к оплате за расчетный период платежного документа, руб. (TotalSumDebtPayable)
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalSumDebtPayable() {
                return totalSumDebtPayable;
            }

            /**
             * Sets the value of the totalSumDebtPayable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             * @see #getTotalSumDebtPayable()
             */
            public void setTotalSumDebtPayable(BigDecimal value) {
                this.totalSumDebtPayable = value;
            }

            /**
             * Код коммунального ресурса при содержании общего имущества. НСИ 2 "Вид коммунального ресурса"
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getServiceType() {
                return serviceType;
            }

            /**
             * Sets the value of the serviceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getServiceType()
             */
            public void setServiceType(NsiRef value) {
                this.serviceType = value;
            }

            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrgPPAGUID() {
                return orgPPAGUID;
            }

            /**
             * Sets the value of the orgPPAGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOrgPPAGUID()
             */
            public void setOrgPPAGUID(String value) {
                this.orgPPAGUID = value;
            }

            /**
             * Главные коммунальные ресурсы потребляемые при использовании и содержании общего имущества в многоквартирном доме. 
             * Группируются по виду коммунального ресурса.
             * Заполняются, если для расчета итоговой суммы начислений по виду коммунального ресурса используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
             * 
             * Gets the value of the generalMunicipalResource property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the generalMunicipalResource property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getGeneralMunicipalResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PDServiceDebtType.HousingService.MunicipalResource.GeneralMunicipalResource }
             * </p>
             * 
             * 
             * @return
             *     The value of the generalMunicipalResource property.
             */
            public List<PDServiceDebtType.HousingService.MunicipalResource.GeneralMunicipalResource> getGeneralMunicipalResource() {
                if (generalMunicipalResource == null) {
                    generalMunicipalResource = new ArrayList<>();
                }
                return this.generalMunicipalResource;
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
             *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         <choice>
             *           <element name="TotalPayable">
             *             <simpleType>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                 <totalDigits value="18"/>
             *                 <fractionDigits value="2"/>
             *               </restriction>
             *             </simpleType>
             *           </element>
             *           <element name="TotalSumDebtPayable">
             *             <simpleType>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                 <totalDigits value="18"/>
             *                 <fractionDigits value="2"/>
             *               </restriction>
             *             </simpleType>
             *           </element>
             *         </choice>
             *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
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
                "serviceType",
                "totalPayable",
                "totalSumDebtPayable",
                "orgPPAGUID"
            })
            public static class GeneralMunicipalResource {

                /**
                 * Код главного коммунального ресурса (НСИ)
                 * 
                 */
                @XmlElement(name = "ServiceType", required = true)
                protected NsiRef serviceType;
                /**
                 * К оплате за расчетный период, руб. Если Жилищная услуга детализирована по периоду (Month и Year заполнены)
                 * 
                 */
                @XmlElement(name = "TotalPayable")
                protected BigDecimal totalPayable;
                /**
                 * Итого к оплате за расчетный период платежного документа, руб. Если для Жилищной услуги заполнен элемент Итого к оплате за расчетный период платежного документа, руб. (TotalSumDebtPayable)
                 * 
                 */
                @XmlElement(name = "TotalSumDebtPayable")
                protected BigDecimal totalSumDebtPayable;
                /**
                 * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
                 * 
                 */
                protected String orgPPAGUID;

                /**
                 * Код главного коммунального ресурса (НСИ)
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getServiceType() {
                    return serviceType;
                }

                /**
                 * Sets the value of the serviceType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getServiceType()
                 */
                public void setServiceType(NsiRef value) {
                    this.serviceType = value;
                }

                /**
                 * К оплате за расчетный период, руб. Если Жилищная услуга детализирована по периоду (Month и Year заполнены)
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalPayable() {
                    return totalPayable;
                }

                /**
                 * Sets the value of the totalPayable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getTotalPayable()
                 */
                public void setTotalPayable(BigDecimal value) {
                    this.totalPayable = value;
                }

                /**
                 * Итого к оплате за расчетный период платежного документа, руб. Если для Жилищной услуги заполнен элемент Итого к оплате за расчетный период платежного документа, руб. (TotalSumDebtPayable)
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalSumDebtPayable() {
                    return totalSumDebtPayable;
                }

                /**
                 * Sets the value of the totalSumDebtPayable property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 * @see #getTotalSumDebtPayable()
                 */
                public void setTotalSumDebtPayable(BigDecimal value) {
                    this.totalSumDebtPayable = value;
                }

                /**
                 * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrgPPAGUID() {
                    return orgPPAGUID;
                }

                /**
                 * Sets the value of the orgPPAGUID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getOrgPPAGUID()
                 */
                public void setOrgPPAGUID(String value) {
                    this.orgPPAGUID = value;
                }

            }

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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtType">
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MunicipalService
        extends ServiceDebtType
    {


    }

}
