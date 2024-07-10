
package ru.gosuslugi.dom.schema.integration.licenses;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Информация о доме
 * 
 * <p>Java class for HouseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HouseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FIASHouseGUID" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element name="HouseAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="Contract" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="DocNum">
 *                     <simpleType>
 *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                         <maxLength value="255"/>
 *                         <minLength value="1"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *                   <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="PlanDateComptetion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="Validity">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Month" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   <totalDigits value="2"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                             <element name="Year" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   <totalDigits value="4"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <sequence>
 *                     <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   </sequence>
 *                   <element name="Terminate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "HouseType", propOrder = {
    "fiasHouseGUID",
    "houseAddress",
    "contract"
})
public class HouseType {

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGUID", required = true)
    protected String fiasHouseGUID;
    /**
     * Адрес дома
     * 
     */
    @XmlElement(name = "HouseAddress", required = true)
    protected String houseAddress;
    /**
     * Информация о договоре управления
     * 
     */
    @XmlElement(name = "Contract")
    protected HouseType.Contract contract;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASHouseGUID() {
        return fiasHouseGUID;
    }

    /**
     * Sets the value of the fiasHouseGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFIASHouseGUID()
     */
    public void setFIASHouseGUID(String value) {
        this.fiasHouseGUID = value;
    }

    /**
     * Адрес дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseAddress() {
        return houseAddress;
    }

    /**
     * Sets the value of the houseAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseAddress()
     */
    public void setHouseAddress(String value) {
        this.houseAddress = value;
    }

    /**
     * Информация о договоре управления
     * 
     * @return
     *     possible object is
     *     {@link HouseType.Contract }
     *     
     */
    public HouseType.Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseType.Contract }
     *     
     * @see #getContract()
     */
    public void setContract(HouseType.Contract value) {
        this.contract = value;
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
     *         <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="DocNum">
     *           <simpleType>
     *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *               <maxLength value="255"/>
     *               <minLength value="1"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
     *         <element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="PlanDateComptetion" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Validity">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Month" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         <totalDigits value="2"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                   <element name="Year" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         <totalDigits value="4"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <sequence>
     *           <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *           <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         </sequence>
     *         <element name="Terminate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "contractGUID",
        "docNum",
        "signingDate",
        "org",
        "effectiveDate",
        "planDateComptetion",
        "validity",
        "startDate",
        "endDate",
        "terminate"
    })
    public static class Contract {

        /**
         * Идентификатор ДУ в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractGUID", required = true)
        protected String contractGUID;
        /**
         * Номер договора из ДУ по дому
         * 
         */
        @XmlElement(name = "DocNum", required = true)
        protected String docNum;
        /**
         * Дата заключения договора из ДУ по дому
         * 
         */
        @XmlElement(name = "SigningDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDate;
        /**
         * Управляющая организация из ДУ
         * 
         */
        @XmlElement(name = "Org", required = true)
        protected RegOrgType org;
        /**
         * Дата вступления в силу из ДУ
         * 
         */
        @XmlElement(name = "EffectiveDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        /**
         * Планируемая дата окончания из ДУ
         * 
         */
        @XmlElement(name = "PlanDateComptetion", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar planDateComptetion;
        /**
         * Срок действия (рассчитывается автоматически)
         * 
         */
        @XmlElement(name = "Validity", required = true)
        protected HouseType.Contract.Validity validity;
        /**
         * Дата начала осуществления полномочий из ДУ
         * 
         */
        @XmlElement(name = "StartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        /**
         * Дата окончания осуществления полномочий из ДУ
         * 
         */
        @XmlElement(name = "EndDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        /**
         * Дата расторжения из ДУ
         * 
         */
        @XmlElement(name = "Terminate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar terminate;

        /**
         * Идентификатор ДУ в ГИС ЖКХ
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

        /**
         * Номер договора из ДУ по дому
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNum() {
            return docNum;
        }

        /**
         * Sets the value of the docNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getDocNum()
         */
        public void setDocNum(String value) {
            this.docNum = value;
        }

        /**
         * Дата заключения договора из ДУ по дому
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSigningDate() {
            return signingDate;
        }

        /**
         * Sets the value of the signingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getSigningDate()
         */
        public void setSigningDate(XMLGregorianCalendar value) {
            this.signingDate = value;
        }

        /**
         * Управляющая организация из ДУ
         * 
         * @return
         *     possible object is
         *     {@link RegOrgType }
         *     
         */
        public RegOrgType getOrg() {
            return org;
        }

        /**
         * Sets the value of the org property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgType }
         *     
         * @see #getOrg()
         */
        public void setOrg(RegOrgType value) {
            this.org = value;
        }

        /**
         * Дата вступления в силу из ДУ
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getEffectiveDate()
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * Планируемая дата окончания из ДУ
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPlanDateComptetion() {
            return planDateComptetion;
        }

        /**
         * Sets the value of the planDateComptetion property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getPlanDateComptetion()
         */
        public void setPlanDateComptetion(XMLGregorianCalendar value) {
            this.planDateComptetion = value;
        }

        /**
         * Срок действия (рассчитывается автоматически)
         * 
         * @return
         *     possible object is
         *     {@link HouseType.Contract.Validity }
         *     
         */
        public HouseType.Contract.Validity getValidity() {
            return validity;
        }

        /**
         * Sets the value of the validity property.
         * 
         * @param value
         *     allowed object is
         *     {@link HouseType.Contract.Validity }
         *     
         * @see #getValidity()
         */
        public void setValidity(HouseType.Contract.Validity value) {
            this.validity = value;
        }

        /**
         * Дата начала осуществления полномочий из ДУ
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
         * Дата окончания осуществления полномочий из ДУ
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
         * Дата расторжения из ДУ
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTerminate() {
            return terminate;
        }

        /**
         * Sets the value of the terminate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getTerminate()
         */
        public void setTerminate(XMLGregorianCalendar value) {
            this.terminate = value;
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
         *         <element name="Month" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               <totalDigits value="2"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="Year" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               <totalDigits value="4"/>
         *             </restriction>
         *           </simpleType>
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
            "month",
            "year"
        })
        public static class Validity {

            /**
             * Месяц
             * 
             */
            @XmlElement(name = "Month")
            protected BigInteger month;
            /**
             * год/лет
             * 
             */
            @XmlElement(name = "Year")
            protected BigInteger year;

            /**
             * Месяц
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMonth() {
                return month;
            }

            /**
             * Sets the value of the month property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getMonth()
             */
            public void setMonth(BigInteger value) {
                this.month = value;
            }

            /**
             * год/лет
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getYear() {
                return year;
            }

            /**
             * Sets the value of the year property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             * @see #getYear()
             */
            public void setYear(BigInteger value) {
                this.year = value;
            }

        }

    }

}
