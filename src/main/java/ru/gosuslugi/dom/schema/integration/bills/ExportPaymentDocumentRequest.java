
package ru.gosuslugi.dom.schema.integration.bills;

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
 *       <choice>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentID" maxOccurs="1000"/>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Year"/>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}Month"/>
 *           <choice>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber" maxOccurs="1000"/>
 *             <sequence>
 *               <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *               <choice>
 *                 <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountNumber" maxOccurs="1000"/>
 *                 <element ref="{http://dom.gosuslugi.ru/schema/integration/bills-base/}PaymentDocumentNumber" maxOccurs="1000"/>
 *               </choice>
 *             </sequence>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" maxOccurs="1000"/>
 *             <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *           </choice>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paymentDocumentID",
    "year",
    "month",
    "unifiedAccountNumber",
    "fiasHouseGuid",
    "accountNumber",
    "paymentDocumentNumber",
    "serviceID",
    "accountGUID"
})
@XmlRootElement(name = "exportPaymentDocumentRequest")
public class ExportPaymentDocumentRequest
    extends BaseType
{

    /**
     * Идентификатор платежного документа
     * 
     */
    @XmlElement(name = "PaymentDocumentID", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
    protected List<String> paymentDocumentID;
    /**
     * Год
     * 
     */
    @XmlElement(name = "Year", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Short year;
    /**
     * Месяц
     * 
     */
    @XmlElement(name = "Month", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected Integer month;
    /**
     * Единый лицевой счет
     * 
     */
    @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected List<String> unifiedAccountNumber;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Номер лицевого счета/Иной идентификатор плательщика
     * 
     */
    @XmlElement(name = "AccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected List<String> accountNumber;
    /**
     * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
     * 
     */
    @XmlElement(name = "PaymentDocumentNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/bills-base/")
    protected List<String> paymentDocumentNumber;
    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected List<String> serviceID;
    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     */
    @XmlElement(name = "AccountGUID")
    protected List<String> accountGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор платежного документа
     * 
     * Gets the value of the paymentDocumentID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDocumentID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentDocumentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentDocumentID property.
     */
    public List<String> getPaymentDocumentID() {
        if (paymentDocumentID == null) {
            paymentDocumentID = new ArrayList<>();
        }
        return this.paymentDocumentID;
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
     * Единый лицевой счет
     * 
     * Gets the value of the unifiedAccountNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unifiedAccountNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnifiedAccountNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the unifiedAccountNumber property.
     */
    public List<String> getUnifiedAccountNumber() {
        if (unifiedAccountNumber == null) {
            unifiedAccountNumber = new ArrayList<>();
        }
        return this.unifiedAccountNumber;
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
     * Номер лицевого счета/Иной идентификатор плательщика
     * 
     * Gets the value of the accountNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountNumber property.
     */
    public List<String> getAccountNumber() {
        if (accountNumber == null) {
            accountNumber = new ArrayList<>();
        }
        return this.accountNumber;
    }

    /**
     * Номер платежного документа, по которому внесена плата, присвоенный такому документу исполнителем в целях осуществления расчетов по внесению платы
     * 
     * Gets the value of the paymentDocumentNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDocumentNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPaymentDocumentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the paymentDocumentNumber property.
     */
    public List<String> getPaymentDocumentNumber() {
        if (paymentDocumentNumber == null) {
            paymentDocumentNumber = new ArrayList<>();
        }
        return this.paymentDocumentNumber;
    }

    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     * Gets the value of the serviceID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the serviceID property.
     */
    public List<String> getServiceID() {
        if (serviceID == null) {
            serviceID = new ArrayList<>();
        }
        return this.serviceID;
    }

    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     * Gets the value of the accountGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the accountGUID property.
     */
    public List<String> getAccountGUID() {
        if (accountGUID == null) {
            accountGUID = new ArrayList<>();
        }
        return this.accountGUID;
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
        return version;
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

}
