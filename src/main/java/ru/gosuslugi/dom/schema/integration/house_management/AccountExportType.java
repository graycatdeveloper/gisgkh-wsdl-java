
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgVersionType;


/**
 * <p>Java class for AccountExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AccountExportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="isUOAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="isRSOAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="isCRAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="isRCAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="isOGVorOMSAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="isTKOAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         </choice>
 *         <element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="LivingPersonsNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         <element name="TotalSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
 *         <element name="ResidentialSquare" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
 *         <element name="HeatedArea" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}PremisesAreaExportType" minOccurs="0"/>
 *         <element name="Closed" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ClosedAccountAttributesType" minOccurs="0"/>
 *         <element name="Accommodation" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                     <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
 *                   <element name="SharePercent" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         <minInclusive value="0"/>
 *                         <fractionDigits value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="PayerInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="IsRenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="isAccountsDivided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <choice minOccurs="0">
 *                     <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndExportType"/>
 *                     <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersionType"/>
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
@XmlType(name = "AccountExportType", propOrder = {
    "isUOAccount",
    "isRSOAccount",
    "isCRAccount",
    "isRCAccount",
    "isOGVorOMSAccount",
    "isTKOAccount",
    "creationDate",
    "livingPersonsNumber",
    "totalSquare",
    "residentialSquare",
    "heatedArea",
    "closed",
    "accommodation",
    "payerInfo"
})
@XmlSeeAlso({
    ExportAccountResultType.class
})
public class AccountExportType {

    /**
     * Лицевой счет для оплаты за жилое помещение и коммунальные услуги
     * 
     */
    protected Boolean isUOAccount;
    /**
     * Лицевой счет для оплаты за коммунальные услуги.
     * 
     */
    protected Boolean isRSOAccount;
    /**
     * Лицевой счет для оплаты капитального ремонта
     * 
     */
    protected Boolean isCRAccount;
    /**
     * Лицевой счет РКЦ
     * 
     */
    protected Boolean isRCAccount;
    /**
     * Лицевой счет ОГВ/ОМС
     * 
     */
    protected Boolean isOGVorOMSAccount;
    /**
     * Лицевой счет ТКО
     * 
     */
    protected Boolean isTKOAccount;
    /**
     * Дата создания ЛС в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    /**
     * Количество проживающих
     * 
     */
    @XmlElement(name = "LivingPersonsNumber")
    protected BigInteger livingPersonsNumber;
    /**
     * Общая площадь для ЛС
     * 
     */
    @XmlElement(name = "TotalSquare")
    protected BigDecimal totalSquare;
    /**
     * Жилая площадь
     * 
     */
    @XmlElement(name = "ResidentialSquare")
    protected BigDecimal residentialSquare;
    /**
     * Отапливаемая площадь
     * 
     */
    @XmlElement(name = "HeatedArea")
    protected BigDecimal heatedArea;
    /**
     * Счет закрыт
     * 
     */
    @XmlElement(name = "Closed")
    protected ClosedAccountAttributesType closed;
    /**
     * Помещение
     * 
     */
    @XmlElement(name = "Accommodation", required = true)
    protected List<AccountExportType.Accommodation> accommodation;
    /**
     * Сведения о платильщике
     * 
     */
    @XmlElement(name = "PayerInfo", required = true)
    protected AccountExportType.PayerInfo payerInfo;

    /**
     * Лицевой счет для оплаты за жилое помещение и коммунальные услуги
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUOAccount() {
        return isUOAccount;
    }

    /**
     * Sets the value of the isUOAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsUOAccount()
     */
    public void setIsUOAccount(Boolean value) {
        this.isUOAccount = value;
    }

    /**
     * Лицевой счет для оплаты за коммунальные услуги.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRSOAccount() {
        return isRSOAccount;
    }

    /**
     * Sets the value of the isRSOAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRSOAccount()
     */
    public void setIsRSOAccount(Boolean value) {
        this.isRSOAccount = value;
    }

    /**
     * Лицевой счет для оплаты капитального ремонта
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCRAccount() {
        return isCRAccount;
    }

    /**
     * Sets the value of the isCRAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsCRAccount()
     */
    public void setIsCRAccount(Boolean value) {
        this.isCRAccount = value;
    }

    /**
     * Лицевой счет РКЦ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRCAccount() {
        return isRCAccount;
    }

    /**
     * Sets the value of the isRCAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsRCAccount()
     */
    public void setIsRCAccount(Boolean value) {
        this.isRCAccount = value;
    }

    /**
     * Лицевой счет ОГВ/ОМС
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOGVorOMSAccount() {
        return isOGVorOMSAccount;
    }

    /**
     * Sets the value of the isOGVorOMSAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsOGVorOMSAccount()
     */
    public void setIsOGVorOMSAccount(Boolean value) {
        this.isOGVorOMSAccount = value;
    }

    /**
     * Лицевой счет ТКО
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTKOAccount() {
        return isTKOAccount;
    }

    /**
     * Sets the value of the isTKOAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isIsTKOAccount()
     */
    public void setIsTKOAccount(Boolean value) {
        this.isTKOAccount = value;
    }

    /**
     * Дата создания ЛС в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreationDate()
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Количество проживающих
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLivingPersonsNumber() {
        return livingPersonsNumber;
    }

    /**
     * Sets the value of the livingPersonsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getLivingPersonsNumber()
     */
    public void setLivingPersonsNumber(BigInteger value) {
        this.livingPersonsNumber = value;
    }

    /**
     * Общая площадь для ЛС
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSquare() {
        return totalSquare;
    }

    /**
     * Sets the value of the totalSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getTotalSquare()
     */
    public void setTotalSquare(BigDecimal value) {
        this.totalSquare = value;
    }

    /**
     * Жилая площадь
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getResidentialSquare() {
        return residentialSquare;
    }

    /**
     * Sets the value of the residentialSquare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getResidentialSquare()
     */
    public void setResidentialSquare(BigDecimal value) {
        this.residentialSquare = value;
    }

    /**
     * Отапливаемая площадь
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeatedArea() {
        return heatedArea;
    }

    /**
     * Sets the value of the heatedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getHeatedArea()
     */
    public void setHeatedArea(BigDecimal value) {
        this.heatedArea = value;
    }

    /**
     * Счет закрыт
     * 
     * @return
     *     possible object is
     *     {@link ClosedAccountAttributesType }
     *     
     */
    public ClosedAccountAttributesType getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedAccountAttributesType }
     *     
     * @see #getClosed()
     */
    public void setClosed(ClosedAccountAttributesType value) {
        this.closed = value;
    }

    /**
     * Помещение
     * 
     * Gets the value of the accommodation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountExportType.Accommodation }
     * </p>
     * 
     * 
     * @return
     *     The value of the accommodation property.
     */
    public List<AccountExportType.Accommodation> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<>();
        }
        return this.accommodation;
    }

    /**
     * Сведения о платильщике
     * 
     * @return
     *     possible object is
     *     {@link AccountExportType.PayerInfo }
     *     
     */
    public AccountExportType.PayerInfo getPayerInfo() {
        return payerInfo;
    }

    /**
     * Sets the value of the payerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountExportType.PayerInfo }
     *     
     * @see #getPayerInfo()
     */
    public void setPayerInfo(AccountExportType.PayerInfo value) {
        this.payerInfo = value;
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
     *           <element name="PremisesGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *           <element name="LivingRoomGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
     *         <element name="SharePercent" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               <minInclusive value="0"/>
     *               <fractionDigits value="2"/>
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
        "premisesGUID",
        "fiasHouseGuid",
        "livingRoomGUID",
        "sharePercent"
    })
    public static class Accommodation {

        /**
         * Идентификатор помещения
         * 
         */
        @XmlElement(name = "PremisesGUID")
        protected String premisesGUID;
        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid")
        protected String fiasHouseGuid;
        /**
         * Идентификатор комнаты
         * 
         */
        @XmlElement(name = "LivingRoomGUID")
        protected String livingRoomGUID;
        /**
         * Доля внесения платы, размер доли в %
         * 
         */
        @XmlElement(name = "SharePercent")
        protected BigDecimal sharePercent;

        /**
         * Идентификатор помещения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPremisesGUID() {
            return premisesGUID;
        }

        /**
         * Sets the value of the premisesGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPremisesGUID()
         */
        public void setPremisesGUID(String value) {
            this.premisesGUID = value;
        }

        /**
         * Глобальный уникальный идентификатор дома по ФИАС
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
         * Идентификатор комнаты
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLivingRoomGUID() {
            return livingRoomGUID;
        }

        /**
         * Sets the value of the livingRoomGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLivingRoomGUID()
         */
        public void setLivingRoomGUID(String value) {
            this.livingRoomGUID = value;
        }

        /**
         * Доля внесения платы, размер доли в %
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSharePercent() {
            return sharePercent;
        }

        /**
         * Sets the value of the sharePercent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         * @see #getSharePercent()
         */
        public void setSharePercent(BigDecimal value) {
            this.sharePercent = value;
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
     *         <element name="IsRenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="isAccountsDivided" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <choice minOccurs="0">
     *           <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndExportType"/>
     *           <element name="Org" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgVersionType"/>
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
        "isRenter",
        "isAccountsDivided",
        "ind",
        "org"
    })
    public static class PayerInfo {

        /**
         * Является нанимателем?
         * 
         */
        @XmlElement(name = "IsRenter")
        protected Boolean isRenter;
        /**
         * Лицевые счета на помещение(я) разделены?
         * 
         */
        protected Boolean isAccountsDivided;
        /**
         * Физическое лицо/индивидуальный предприниматель.
         * 
         */
        @XmlElement(name = "Ind")
        protected AccountIndExportType ind;
        /**
         * Организация. ЮЛ/ИП/ОП. Ссылка на реестр организаций
         * 
         */
        @XmlElement(name = "Org")
        protected RegOrgVersionType org;

        /**
         * Является нанимателем?
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRenter() {
            return isRenter;
        }

        /**
         * Sets the value of the isRenter property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsRenter()
         */
        public void setIsRenter(Boolean value) {
            this.isRenter = value;
        }

        /**
         * Лицевые счета на помещение(я) разделены?
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsAccountsDivided() {
            return isAccountsDivided;
        }

        /**
         * Sets the value of the isAccountsDivided property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsAccountsDivided()
         */
        public void setIsAccountsDivided(Boolean value) {
            this.isAccountsDivided = value;
        }

        /**
         * Физическое лицо/индивидуальный предприниматель.
         * 
         * @return
         *     possible object is
         *     {@link AccountIndExportType }
         *     
         */
        public AccountIndExportType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountIndExportType }
         *     
         * @see #getInd()
         */
        public void setInd(AccountIndExportType value) {
            this.ind = value;
        }

        /**
         * Организация. ЮЛ/ИП/ОП. Ссылка на реестр организаций
         * 
         * @return
         *     possible object is
         *     {@link RegOrgVersionType }
         *     
         */
        public RegOrgVersionType getOrg() {
            return org;
        }

        /**
         * Sets the value of the org property.
         * 
         * @param value
         *     allowed object is
         *     {@link RegOrgVersionType }
         *     
         * @see #getOrg()
         */
        public void setOrg(RegOrgVersionType value) {
            this.org = value;
        }

    }

}
