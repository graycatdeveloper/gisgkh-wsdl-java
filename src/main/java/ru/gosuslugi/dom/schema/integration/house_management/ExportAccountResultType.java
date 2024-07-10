
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта лицевых счетов
 * 
 * <p>Java class for exportAccountResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportAccountResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountExportType">
 *       <sequence>
 *         <element name="AccountReasons" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountReasonsImportType">
 *                 <sequence minOccurs="0">
 *                   <element name="Contract" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="Charter" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="OverhaulFormingKindProtocol" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="OverhaulFormingKindProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="OverhaulFormingKindOMSDescision" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="OverhaulFormingKindOMSDescisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
 *         <element name="AccountNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="30"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportAccountResultType", propOrder = {
    "accountReasons",
    "accountNumber",
    "accountGUID",
    "unifiedAccountNumber",
    "serviceID"
})
public class ExportAccountResultType
    extends AccountExportType
{

    /**
     * Основания ЛС
     * 
     */
    @XmlElement(name = "AccountReasons")
    protected ExportAccountResultType.AccountReasons accountReasons;
    /**
     * Номер лицевого счета/Иной идентификтатор плательщика
     * 
     */
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     */
    @XmlElement(name = "AccountGUID", required = true)
    protected String accountGUID;
    /**
     * Единый лицевой счет
     * 
     */
    @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/", required = true)
    protected String unifiedAccountNumber;
    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected String serviceID;

    /**
     * Основания ЛС
     * 
     * @return
     *     possible object is
     *     {@link ExportAccountResultType.AccountReasons }
     *     
     */
    public ExportAccountResultType.AccountReasons getAccountReasons() {
        return accountReasons;
    }

    /**
     * Sets the value of the accountReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportAccountResultType.AccountReasons }
     *     
     * @see #getAccountReasons()
     */
    public void setAccountReasons(ExportAccountResultType.AccountReasons value) {
        this.accountReasons = value;
    }

    /**
     * Номер лицевого счета/Иной идентификтатор плательщика
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountNumber()
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountGUID() {
        return accountGUID;
    }

    /**
     * Sets the value of the accountGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountGUID()
     */
    public void setAccountGUID(String value) {
        this.accountGUID = value;
    }

    /**
     * Единый лицевой счет
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnifiedAccountNumber() {
        return unifiedAccountNumber;
    }

    /**
     * Sets the value of the unifiedAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnifiedAccountNumber()
     */
    public void setUnifiedAccountNumber(String value) {
        this.unifiedAccountNumber = value;
    }

    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getServiceID()
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountReasonsImportType">
     *       <sequence minOccurs="0">
     *         <element name="Contract" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="Charter" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="OverhaulFormingKindProtocol" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="OverhaulFormingKindProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="OverhaulFormingKindOMSDescision" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="OverhaulFormingKindOMSDescisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "contract",
        "charter",
        "overhaulFormingKindProtocol",
        "overhaulFormingKindOMSDescision"
    })
    public static class AccountReasons
        extends AccountReasonsImportType
    {

        @XmlElement(name = "Contract")
        protected ExportAccountResultType.AccountReasons.Contract contract;
        @XmlElement(name = "Charter")
        protected ExportAccountResultType.AccountReasons.Charter charter;
        /**
         * Протокол решения собственников о выбранном способе формирования фонда капитального ремонта
         * 
         */
        @XmlElement(name = "OverhaulFormingKindProtocol")
        protected ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol overhaulFormingKindProtocol;
        /**
         * Решение ОМС о выбранном способе формирования фонда капитального ремонта
         * 
         */
        @XmlElement(name = "OverhaulFormingKindOMSDescision")
        protected ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision overhaulFormingKindOMSDescision;

        /**
         * Gets the value of the contract property.
         * 
         * @return
         *     possible object is
         *     {@link ExportAccountResultType.AccountReasons.Contract }
         *     
         */
        public ExportAccountResultType.AccountReasons.Contract getContract() {
            return contract;
        }

        /**
         * Sets the value of the contract property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAccountResultType.AccountReasons.Contract }
         *     
         */
        public void setContract(ExportAccountResultType.AccountReasons.Contract value) {
            this.contract = value;
        }

        /**
         * Gets the value of the charter property.
         * 
         * @return
         *     possible object is
         *     {@link ExportAccountResultType.AccountReasons.Charter }
         *     
         */
        public ExportAccountResultType.AccountReasons.Charter getCharter() {
            return charter;
        }

        /**
         * Sets the value of the charter property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAccountResultType.AccountReasons.Charter }
         *     
         */
        public void setCharter(ExportAccountResultType.AccountReasons.Charter value) {
            this.charter = value;
        }

        /**
         * Протокол решения собственников о выбранном способе формирования фонда капитального ремонта
         * 
         * @return
         *     possible object is
         *     {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol }
         *     
         */
        public ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol getOverhaulFormingKindProtocol() {
            return overhaulFormingKindProtocol;
        }

        /**
         * Sets the value of the overhaulFormingKindProtocol property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol }
         *     
         * @see #getOverhaulFormingKindProtocol()
         */
        public void setOverhaulFormingKindProtocol(ExportAccountResultType.AccountReasons.OverhaulFormingKindProtocol value) {
            this.overhaulFormingKindProtocol = value;
        }

        /**
         * Решение ОМС о выбранном способе формирования фонда капитального ремонта
         * 
         * @return
         *     possible object is
         *     {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision }
         *     
         */
        public ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision getOverhaulFormingKindOMSDescision() {
            return overhaulFormingKindOMSDescision;
        }

        /**
         * Sets the value of the overhaulFormingKindOMSDescision property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision }
         *     
         * @see #getOverhaulFormingKindOMSDescision()
         */
        public void setOverhaulFormingKindOMSDescision(ExportAccountResultType.AccountReasons.OverhaulFormingKindOMSDescision value) {
            this.overhaulFormingKindOMSDescision = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
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
            "charterGUID"
        })
        public static class Charter {

            /**
             * Корневой идентификатор устава (не меняется от версии к версии)
             * 
             */
            @XmlElement(name = "CharterGUID", required = true)
            protected String charterGUID;

            /**
             * Корневой идентификатор устава (не меняется от версии к версии)
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCharterGUID() {
                return charterGUID;
            }

            /**
             * Sets the value of the charterGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCharterGUID()
             */
            public void setCharterGUID(String value) {
                this.charterGUID = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
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
            "contractGUID"
        })
        public static class Contract {

            /**
             * Корневой идентификатор договора (не меняется от версии к версии)
             * 
             */
            @XmlElement(name = "ContractGUID", required = true)
            protected String contractGUID;

            /**
             * Корневой идентификатор договора (не меняется от версии к версии)
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractGUID() {
                return contractGUID;
            }

            /**
             * Sets the value of the contractGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractGUID()
             */
            public void setContractGUID(String value) {
                this.contractGUID = value;
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
         *         <element name="OverhaulFormingKindOMSDescisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "overhaulFormingKindOMSDescisionGUID"
        })
        public static class OverhaulFormingKindOMSDescision {

            /**
             * Идентификатор решения ОМС о выбранном способе формирования фонда капитального ремонта
             * 
             */
            @XmlElement(name = "OverhaulFormingKindOMSDescisionGUID", required = true)
            protected String overhaulFormingKindOMSDescisionGUID;

            /**
             * Идентификатор решения ОМС о выбранном способе формирования фонда капитального ремонта
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverhaulFormingKindOMSDescisionGUID() {
                return overhaulFormingKindOMSDescisionGUID;
            }

            /**
             * Sets the value of the overhaulFormingKindOMSDescisionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOverhaulFormingKindOMSDescisionGUID()
             */
            public void setOverhaulFormingKindOMSDescisionGUID(String value) {
                this.overhaulFormingKindOMSDescisionGUID = value;
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
         *         <element name="OverhaulFormingKindProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
            "overhaulFormingKindProtocolGUID"
        })
        public static class OverhaulFormingKindProtocol {

            /**
             * Идентификатор протокола решения собственников о выбранном способе формирования фонда капитального ремонта
             * 
             */
            @XmlElement(name = "OverhaulFormingKindProtocolGUID", required = true)
            protected String overhaulFormingKindProtocolGUID;

            /**
             * Идентификатор протокола решения собственников о выбранном способе формирования фонда капитального ремонта
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverhaulFormingKindProtocolGUID() {
                return overhaulFormingKindProtocolGUID;
            }

            /**
             * Sets the value of the overhaulFormingKindProtocolGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOverhaulFormingKindProtocolGUID()
             */
            public void setOverhaulFormingKindProtocolGUID(String value) {
                this.overhaulFormingKindProtocolGUID = value;
            }

        }

    }

}
