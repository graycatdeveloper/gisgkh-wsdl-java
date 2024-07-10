
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Задолженность услугам в ПД при импорте
 * 
 * <p>Java class for PDServiceDebtImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PDServiceDebtImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="HousingService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
 *                 <sequence minOccurs="0">
 *                   <element name="MunicipalResource" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             <element name="TotalPayable">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                             <element name="GeneralMunicipalResource" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                       <element name="TotalPayable">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             <totalDigits value="13"/>
 *                                             <fractionDigits value="2"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
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
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="MunicipalService">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
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
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *                             <element name="TotalPayable">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   <totalDigits value="13"/>
 *                                   <fractionDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="MunicipalService" maxOccurs="unbounded">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
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
@XmlType(name = "PDServiceDebtImportType", propOrder = {
    "housingService",
    "additionalService",
    "municipalService",
    "groupMunicipalService"
})
public class PDServiceDebtImportType {

    /**
     * Жилищная услуга
     * 
     */
    @XmlElement(name = "HousingService")
    protected PDServiceDebtImportType.HousingService housingService;
    /**
     * Дополнительная услуга
     * 
     */
    @XmlElement(name = "AdditionalService")
    protected PDServiceDebtImportType.AdditionalService additionalService;
    /**
     * Главная коммунальная услуга
     * 
     */
    @XmlElement(name = "MunicipalService")
    protected PDServiceDebtImportType.MunicipalService municipalService;
    /**
     * Блок главных коммунальных услуг, сгруппированных по виду коммунальной услуги.
     * Заполняется, если для расчета итоговой суммы начислений по коммунальной услуге используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
     * 
     */
    @XmlElement(name = "GroupMunicipalService")
    protected PDServiceDebtImportType.GroupMunicipalService groupMunicipalService;

    /**
     * Жилищная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtImportType.HousingService }
     *     
     */
    public PDServiceDebtImportType.HousingService getHousingService() {
        return housingService;
    }

    /**
     * Sets the value of the housingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtImportType.HousingService }
     *     
     * @see #getHousingService()
     */
    public void setHousingService(PDServiceDebtImportType.HousingService value) {
        this.housingService = value;
    }

    /**
     * Дополнительная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtImportType.AdditionalService }
     *     
     */
    public PDServiceDebtImportType.AdditionalService getAdditionalService() {
        return additionalService;
    }

    /**
     * Sets the value of the additionalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtImportType.AdditionalService }
     *     
     * @see #getAdditionalService()
     */
    public void setAdditionalService(PDServiceDebtImportType.AdditionalService value) {
        this.additionalService = value;
    }

    /**
     * Главная коммунальная услуга
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtImportType.MunicipalService }
     *     
     */
    public PDServiceDebtImportType.MunicipalService getMunicipalService() {
        return municipalService;
    }

    /**
     * Sets the value of the municipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtImportType.MunicipalService }
     *     
     * @see #getMunicipalService()
     */
    public void setMunicipalService(PDServiceDebtImportType.MunicipalService value) {
        this.municipalService = value;
    }

    /**
     * Блок главных коммунальных услуг, сгруппированных по виду коммунальной услуги.
     * Заполняется, если для расчета итоговой суммы начислений по коммунальной услуге используются двухкомпонентные тарифы или тарифы (цены), отличные от одноставочных тарифов (цен)
     * 
     * @return
     *     possible object is
     *     {@link PDServiceDebtImportType.GroupMunicipalService }
     *     
     */
    public PDServiceDebtImportType.GroupMunicipalService getGroupMunicipalService() {
        return groupMunicipalService;
    }

    /**
     * Sets the value of the groupMunicipalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDServiceDebtImportType.GroupMunicipalService }
     *     
     * @see #getGroupMunicipalService()
     */
    public void setGroupMunicipalService(PDServiceDebtImportType.GroupMunicipalService value) {
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
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
        extends ServiceDebtImportType
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
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
     *                   <element name="TotalPayable">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="MunicipalService" maxOccurs="unbounded">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
     *               </extension>
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
        "typeMunicipalService",
        "municipalService"
    })
    public static class GroupMunicipalService {

        /**
         * Вид коммунальной услуги
         * 
         */
        @XmlElement(name = "TypeMunicipalService", required = true)
        protected PDServiceDebtImportType.GroupMunicipalService.TypeMunicipalService typeMunicipalService;
        /**
         * Главная коммунальная услуга
         * 
         */
        @XmlElement(name = "MunicipalService", required = true)
        protected List<PDServiceDebtImportType.GroupMunicipalService.MunicipalService> municipalService;

        /**
         * Вид коммунальной услуги
         * 
         * @return
         *     possible object is
         *     {@link PDServiceDebtImportType.GroupMunicipalService.TypeMunicipalService }
         *     
         */
        public PDServiceDebtImportType.GroupMunicipalService.TypeMunicipalService getTypeMunicipalService() {
            return typeMunicipalService;
        }

        /**
         * Sets the value of the typeMunicipalService property.
         * 
         * @param value
         *     allowed object is
         *     {@link PDServiceDebtImportType.GroupMunicipalService.TypeMunicipalService }
         *     
         * @see #getTypeMunicipalService()
         */
        public void setTypeMunicipalService(PDServiceDebtImportType.GroupMunicipalService.TypeMunicipalService value) {
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
         * {@link PDServiceDebtImportType.GroupMunicipalService.MunicipalService }
         * </p>
         * 
         * 
         * @return
         *     The value of the municipalService property.
         */
        public List<PDServiceDebtImportType.GroupMunicipalService.MunicipalService> getMunicipalService() {
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
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
            extends ServiceDebtImportType
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
         *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
         *         <element name="TotalPayable">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
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
            protected int month;
            /**
             * Год
             * 
             */
            @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
            protected short year;
            /**
             * К оплате за расчетный период, руб.
             * 
             */
            @XmlElement(name = "TotalPayable", required = true)
            protected BigDecimal totalPayable;
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
             */
            public int getMonth() {
                return month;
            }

            /**
             * Sets the value of the month property.
             * 
             */
            public void setMonth(int value) {
                this.month = value;
            }

            /**
             * Год
             * 
             */
            public short getYear() {
                return year;
            }

            /**
             * Sets the value of the year property.
             * 
             */
            public void setYear(short value) {
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
     *       <sequence minOccurs="0">
     *         <element name="MunicipalResource" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   <element name="TotalPayable">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         <totalDigits value="13"/>
     *                         <fractionDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *                   <element name="GeneralMunicipalResource" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                             <element name="TotalPayable">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   <totalDigits value="13"/>
     *                                   <fractionDigits value="2"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
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
        extends ServiceDebtImportType
    {

        /**
         * Виды коммунальных ресурсов, потребляемых при использовании и содержании общего имущества в многоквартирном доме
         * 
         */
        @XmlElement(name = "MunicipalResource")
        protected List<PDServiceDebtImportType.HousingService.MunicipalResource> municipalResource;

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
         * {@link PDServiceDebtImportType.HousingService.MunicipalResource }
         * </p>
         * 
         * 
         * @return
         *     The value of the municipalResource property.
         */
        public List<PDServiceDebtImportType.HousingService.MunicipalResource> getMunicipalResource() {
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
         *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element name="TotalPayable">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               <totalDigits value="13"/>
         *               <fractionDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
         *         <element name="GeneralMunicipalResource" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   <element name="TotalPayable">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         <totalDigits value="13"/>
         *                         <fractionDigits value="2"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
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
            "serviceType",
            "totalPayable",
            "orgPPAGUID",
            "generalMunicipalResource"
        })
        public static class MunicipalResource {

            /**
             * Код коммунального ресурса при содержании общего имущества из справочника НСИ 2 "Вид коммунального ресурса"
             * 
             */
            @XmlElement(name = "ServiceType", required = true)
            protected NsiRef serviceType;
            /**
             * К оплате за расчетный период, руб.
             * 
             */
            @XmlElement(name = "TotalPayable", required = true)
            protected BigDecimal totalPayable;
            /**
             * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
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
            protected List<PDServiceDebtImportType.HousingService.MunicipalResource.GeneralMunicipalResource> generalMunicipalResource;

            /**
             * Код коммунального ресурса при содержании общего имущества из справочника НСИ 2 "Вид коммунального ресурса"
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
             * {@link PDServiceDebtImportType.HousingService.MunicipalResource.GeneralMunicipalResource }
             * </p>
             * 
             * 
             * @return
             *     The value of the generalMunicipalResource property.
             */
            public List<PDServiceDebtImportType.HousingService.MunicipalResource.GeneralMunicipalResource> getGeneralMunicipalResource() {
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
             *         <element name="TotalPayable">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               <totalDigits value="13"/>
             *               <fractionDigits value="2"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
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
                "orgPPAGUID"
            })
            public static class GeneralMunicipalResource {

                /**
                 * Код главного коммунального ресурса из справочника НСИ 337 "Главный коммунальный ресурс"
                 * 
                 */
                @XmlElement(name = "ServiceType", required = true)
                protected NsiRef serviceType;
                /**
                 * К оплате за расчетный период, руб.
                 * 
                 */
                @XmlElement(name = "TotalPayable", required = true)
                protected BigDecimal totalPayable;
                /**
                 * Поставщик услуги. Идентификатор зарегистрированной организации. Обязателен, если тип ЛС "ЛС РЦ" (isRCAccount), запрещен для заполнения для остальных типов лицевых счетов
                 * 
                 */
                protected String orgPPAGUID;

                /**
                 * Код главного коммунального ресурса из справочника НСИ 337 "Главный коммунальный ресурс"
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}ServiceDebtImportType">
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
        extends ServiceDebtImportType
    {


    }

}
