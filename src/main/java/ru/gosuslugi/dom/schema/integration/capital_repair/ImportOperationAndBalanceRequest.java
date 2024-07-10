
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 *         <element name="ImportOperationAndBalance" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="OperationAndBalanceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <sequence>
 *                       <element name="AccountRegOperatorGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                       <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                     </sequence>
 *                     <sequence>
 *                       <element name="AccountSpecialGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                     </sequence>
 *                   </choice>
 *                   <choice>
 *                     <element name="OperationAndBalanceInfo">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}OperationAndBalanceInfoType">
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CancelOperationAndBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="12.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importOperationAndBalance"
})
@XmlRootElement(name = "importOperationAndBalanceRequest")
public class ImportOperationAndBalanceRequest
    extends BaseType
{

    /**
     * Импорт информации о совершенных операциях и остатках по счету
     * 
     */
    @XmlElement(name = "ImportOperationAndBalance", required = true)
    protected List<ImportOperationAndBalanceRequest.ImportOperationAndBalance> importOperationAndBalance;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импорт информации о совершенных операциях и остатках по счету
     * 
     * Gets the value of the importOperationAndBalance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importOperationAndBalance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportOperationAndBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportOperationAndBalanceRequest.ImportOperationAndBalance }
     * </p>
     * 
     * 
     * @return
     *     The value of the importOperationAndBalance property.
     */
    public List<ImportOperationAndBalanceRequest.ImportOperationAndBalance> getImportOperationAndBalance() {
        if (importOperationAndBalance == null) {
            importOperationAndBalance = new ArrayList<>();
        }
        return this.importOperationAndBalance;
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
            return "12.0.0.1";
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="OperationAndBalanceGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <sequence>
     *             <element name="AccountRegOperatorGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *             <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *           </sequence>
     *           <sequence>
     *             <element name="AccountSpecialGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *           </sequence>
     *         </choice>
     *         <choice>
     *           <element name="OperationAndBalanceInfo">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}OperationAndBalanceInfoType">
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CancelOperationAndBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "transportGuid",
        "operationAndBalanceGuid",
        "accountRegOperatorGuid",
        "fiasHouseGuid",
        "accountSpecialGuid",
        "operationAndBalanceInfo",
        "cancelOperationAndBalance"
    })
    public static class ImportOperationAndBalance {

        /**
         * Транспортный идентификатор для импорта информации о совершенных операциях и остатках по счету
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор информации о совершенных операциях и остатках по счету (обязателен в случае внесения изменений или аннулирования информации)
         * 
         */
        @XmlElement(name = "OperationAndBalanceGuid")
        protected String operationAndBalanceGuid;
        /**
         * Идентификатор счета регионального оператора в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "AccountRegOperatorGuid")
        protected String accountRegOperatorGuid;
        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid")
        protected String fiasHouseGuid;
        /**
         * Идентификатор  специального счета
         * 
         */
        @XmlElement(name = "AccountSpecialGuid")
        protected String accountSpecialGuid;
        /**
         * Добавление/внесение изменений в информацию о совершенных операциях и остатках по счету
         * 
         */
        @XmlElement(name = "OperationAndBalanceInfo")
        protected ImportOperationAndBalanceRequest.ImportOperationAndBalance.OperationAndBalanceInfo operationAndBalanceInfo;
        /**
         * Аннулировать информацию о совершенных операциях и остатках по счету
         * 
         */
        @XmlElement(name = "CancelOperationAndBalance")
        protected Boolean cancelOperationAndBalance;

        /**
         * Транспортный идентификатор для импорта информации о совершенных операциях и остатках по счету
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransportGuid() {
            return transportGuid;
        }

        /**
         * Sets the value of the transportGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getTransportGuid()
         */
        public void setTransportGuid(String value) {
            this.transportGuid = value;
        }

        /**
         * Идентификатор информации о совершенных операциях и остатках по счету (обязателен в случае внесения изменений или аннулирования информации)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationAndBalanceGuid() {
            return operationAndBalanceGuid;
        }

        /**
         * Sets the value of the operationAndBalanceGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOperationAndBalanceGuid()
         */
        public void setOperationAndBalanceGuid(String value) {
            this.operationAndBalanceGuid = value;
        }

        /**
         * Идентификатор счета регионального оператора в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountRegOperatorGuid() {
            return accountRegOperatorGuid;
        }

        /**
         * Sets the value of the accountRegOperatorGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountRegOperatorGuid()
         */
        public void setAccountRegOperatorGuid(String value) {
            this.accountRegOperatorGuid = value;
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
         * Идентификатор  специального счета
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountSpecialGuid() {
            return accountSpecialGuid;
        }

        /**
         * Sets the value of the accountSpecialGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getAccountSpecialGuid()
         */
        public void setAccountSpecialGuid(String value) {
            this.accountSpecialGuid = value;
        }

        /**
         * Добавление/внесение изменений в информацию о совершенных операциях и остатках по счету
         * 
         * @return
         *     possible object is
         *     {@link ImportOperationAndBalanceRequest.ImportOperationAndBalance.OperationAndBalanceInfo }
         *     
         */
        public ImportOperationAndBalanceRequest.ImportOperationAndBalance.OperationAndBalanceInfo getOperationAndBalanceInfo() {
            return operationAndBalanceInfo;
        }

        /**
         * Sets the value of the operationAndBalanceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportOperationAndBalanceRequest.ImportOperationAndBalance.OperationAndBalanceInfo }
         *     
         * @see #getOperationAndBalanceInfo()
         */
        public void setOperationAndBalanceInfo(ImportOperationAndBalanceRequest.ImportOperationAndBalance.OperationAndBalanceInfo value) {
            this.operationAndBalanceInfo = value;
        }

        /**
         * Аннулировать информацию о совершенных операциях и остатках по счету
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelOperationAndBalance() {
            return cancelOperationAndBalance;
        }

        /**
         * Sets the value of the cancelOperationAndBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelOperationAndBalance()
         */
        public void setCancelOperationAndBalance(Boolean value) {
            this.cancelOperationAndBalance = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}OperationAndBalanceInfoType">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OperationAndBalanceInfo
            extends OperationAndBalanceInfoType
        {


        }

    }

}
