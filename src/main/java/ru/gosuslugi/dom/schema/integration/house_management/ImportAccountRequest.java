
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="Account" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
 *                   <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <element name="AccountReasons" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountReasonsImportType" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "account"
})
@XmlRootElement(name = "importAccountRequest")
public class ImportAccountRequest
    extends BaseType
{

    /**
     * Перечень ЛС
     * 
     */
    @XmlElement(name = "Account", required = true)
    protected List<ImportAccountRequest.Account> account;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Перечень ЛС
     * 
     * Gets the value of the account property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAccountRequest.Account }
     * </p>
     * 
     * 
     * @return
     *     The value of the account property.
     */
    public List<ImportAccountRequest.Account> getAccount() {
        if (account == null) {
            account = new ArrayList<>();
        }
        return this.account;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "10.0.1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" minOccurs="0"/>
     *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <element name="AccountReasons" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountReasonsImportType" minOccurs="0"/>
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
        "transportGUID",
        "accountNumber",
        "accountGUID",
        "accountReasons"
    })
    public static class Account
        extends AccountType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Номер лицевого счета/Иной идентификатор плательщика
         * 
         */
        @XmlElement(name = "AccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
        protected String accountNumber;
        /**
         * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
         * 
         */
        @XmlElement(name = "AccountGUID")
        protected String accountGUID;
        /**
         * Конкретизация оснований ЛС (договоров ресурсоснабжения, договоров социального найма, договоров по обращению с ТКО)
         * 
         */
        @XmlElement(name = "AccountReasons")
        protected AccountReasonsImportType accountReasons;

        /**
         * Транспортный идентификатор
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGUID() {
            return transportGUID;
        }

        /**
         * Sets the value of the transportGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGUID()
         */
        public void setTransportGUID(String value) {
            this.transportGUID = value;
        }

        /**
         * Номер лицевого счета/Иной идентификатор плательщика
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
         * Конкретизация оснований ЛС (договоров ресурсоснабжения, договоров социального найма, договоров по обращению с ТКО)
         * 
         * @return
         *     possible object is
         *     {@link AccountReasonsImportType }
         *     
         */
        public AccountReasonsImportType getAccountReasons() {
            return accountReasons;
        }

        /**
         * Sets the value of the accountReasons property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountReasonsImportType }
         *     
         * @see #getAccountReasons()
         */
        public void setAccountReasons(AccountReasonsImportType value) {
            this.accountReasons = value;
        }

    }

}
