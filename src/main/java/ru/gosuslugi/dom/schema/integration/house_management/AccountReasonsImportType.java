
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип импорта оснований ЛС
 * 
 * <p>Java class for AccountReasonsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountReasonsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SupplyResourceContract" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID" minOccurs="0"/>
 *                   <sequence>
 *                     <element name="ContractNumber">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="100"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </sequence>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SocialHireContract" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID" minOccurs="0"/>
 *                   <sequence>
 *                     <element name="ContractNumber">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="255"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="Type">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <length value="1"/>
 *                           <enumeration value="D"/>
 *                           <enumeration value="M"/>
 *                           <enumeration value="S"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                   </sequence>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TKOContract" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID" minOccurs="0"/>
 *                   <sequence>
 *                     <element name="ContractNumber">
 *                       <simpleType>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                           <minLength value="1"/>
 *                           <maxLength value="30"/>
 *                         </restriction>
 *                       </simpleType>
 *                     </element>
 *                     <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                     <element name="DateEntry" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   </sequence>
 *                 </choice>
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
@XmlType(name = "AccountReasonsImportType", propOrder = {
    "supplyResourceContract",
    "socialHireContract",
    "tkoContract"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.house_management.ExportAccountResultType.AccountReasons.class
})
public class AccountReasonsImportType {

    /**
     * Договор ресурсоснабжения
     * 
     */
    @XmlElement(name = "SupplyResourceContract")
    protected List<AccountReasonsImportType.SupplyResourceContract> supplyResourceContract;
    /**
     * Договор найма жилого помещения
     * 
     */
    @XmlElement(name = "SocialHireContract")
    protected AccountReasonsImportType.SocialHireContract socialHireContract;
    @XmlElement(name = "TKOContract")
    protected List<AccountReasonsImportType.TKOContract> tkoContract;

    /**
     * Договор ресурсоснабжения
     * 
     * Gets the value of the supplyResourceContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyResourceContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupplyResourceContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountReasonsImportType.SupplyResourceContract }
     * </p>
     * 
     * 
     * @return
     *     The value of the supplyResourceContract property.
     */
    public List<AccountReasonsImportType.SupplyResourceContract> getSupplyResourceContract() {
        if (supplyResourceContract == null) {
            supplyResourceContract = new ArrayList<>();
        }
        return this.supplyResourceContract;
    }

    /**
     * Договор найма жилого помещения
     * 
     * @return
     *     possible object is
     *     {@link AccountReasonsImportType.SocialHireContract }
     *     
     */
    public AccountReasonsImportType.SocialHireContract getSocialHireContract() {
        return socialHireContract;
    }

    /**
     * Sets the value of the socialHireContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReasonsImportType.SocialHireContract }
     *     
     * @see #getSocialHireContract()
     */
    public void setSocialHireContract(AccountReasonsImportType.SocialHireContract value) {
        this.socialHireContract = value;
    }

    /**
     * Gets the value of the tkoContract property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tkoContract property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTKOContract().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountReasonsImportType.TKOContract }
     * </p>
     * 
     * 
     * @return
     *     The value of the tkoContract property.
     */
    public List<AccountReasonsImportType.TKOContract> getTKOContract() {
        if (tkoContract == null) {
            tkoContract = new ArrayList<>();
        }
        return this.tkoContract;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID" minOccurs="0"/>
     *         <sequence>
     *           <element name="ContractNumber">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <minLength value="1"/>
     *                 <maxLength value="255"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *           <element name="Type">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <length value="1"/>
     *                 <enumeration value="D"/>
     *                 <enumeration value="M"/>
     *                 <enumeration value="S"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *         </sequence>
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
        "contractGUID",
        "contractNumber",
        "signingDate",
        "type"
    })
    public static class SocialHireContract {

        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Номер договора
         * 
         */
        @XmlElement(name = "ContractNumber")
        protected String contractNumber;
        /**
         * Дата заключения
         * 
         */
        @XmlElement(name = "SigningDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDate;
        /**
         * Тип:
         * (D)WELLING_APARTMENT - Договор социального найма жилого помещения
         * STATE_(M)UNICIPAL_FUND - Договор найма жилого помещения государственного или муниципального жилищного фонда
         * (S)OCIAL_FUND - Договор найма жилого помещения жилищного фонда социального использования
         * 
         */
        @XmlElement(name = "Type")
        protected String type;

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
         * Дата заключения
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
         * Тип:
         * (D)WELLING_APARTMENT - Договор социального найма жилого помещения
         * STATE_(M)UNICIPAL_FUND - Договор найма жилого помещения государственного или муниципального жилищного фонда
         * (S)OCIAL_FUND - Договор найма жилого помещения жилищного фонда социального использования
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID" minOccurs="0"/>
     *         <sequence>
     *           <element name="ContractNumber">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <minLength value="1"/>
     *                 <maxLength value="100"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *           <element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         </sequence>
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
        "contractGUID",
        "contractNumber",
        "signingDate",
        "isContract"
    })
    public static class SupplyResourceContract {

        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Номер договора
         * 
         */
        @XmlElement(name = "ContractNumber")
        protected String contractNumber;
        /**
         * Дата заключения
         * 
         */
        @XmlElement(name = "SigningDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDate;
        /**
         * True, если договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме.
         * 
         */
        @XmlElement(name = "IsContract")
        protected Boolean isContract;

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
         * Дата заключения
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
         * True, если договор не является публичным и/или присутствует заключенный на бумажном носителе или в электронной форме.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsContract() {
            return isContract;
        }

        /**
         * Sets the value of the isContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsContract()
         */
        public void setIsContract(Boolean value) {
            this.isContract = value;
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
     *       <choice>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID" minOccurs="0"/>
     *         <sequence>
     *           <element name="ContractNumber">
     *             <simpleType>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                 <minLength value="1"/>
     *                 <maxLength value="30"/>
     *               </restriction>
     *             </simpleType>
     *           </element>
     *           <element name="SigningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *           <element name="DateEntry" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         </sequence>
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
        "contractGUID",
        "contractNumber",
        "signingDate",
        "dateEntry"
    })
    public static class TKOContract {

        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "ContractGUID")
        protected String contractGUID;
        /**
         * Номер договора
         * 
         */
        @XmlElement(name = "ContractNumber")
        protected String contractNumber;
        /**
         * Дата заключения
         * 
         */
        @XmlElement(name = "SigningDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signingDate;
        /**
         * Дата вступления в силу
         * 
         */
        @XmlElement(name = "DateEntry")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateEntry;

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
         * Дата заключения
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
         * Дата вступления в силу
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateEntry() {
            return dateEntry;
        }

        /**
         * Sets the value of the dateEntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateEntry()
         */
        public void setDateEntry(XMLGregorianCalendar value) {
            this.dateEntry = value;
        }

    }

}
