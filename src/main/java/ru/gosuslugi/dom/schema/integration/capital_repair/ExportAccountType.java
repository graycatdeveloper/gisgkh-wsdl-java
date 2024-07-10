
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Экспортируемые счета регионального оператора/специальные счета
 * 
 * <p>Java class for ExportAccountType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportAccountType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="AccountKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Details" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountType">
 *                 <sequence>
 *                   <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType" minOccurs="0"/>
 *         <element name="DocForAccountOpening" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100" minOccurs="0"/>
 *         <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Status">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Published"/>
 *               <enumeration value="Canceled"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice minOccurs="0">
 *           <element name="OperationAndBalance" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportOperationAndBalanceType" maxOccurs="unbounded"/>
 *           <element name="OperationAndBalanceIsAbsent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "ExportAccountType", propOrder = {
    "accountGuid",
    "accountKind",
    "openDate",
    "details",
    "fiasHouseGuid",
    "docForAccountOpening",
    "closeDate",
    "status",
    "operationAndBalance",
    "operationAndBalanceIsAbsent"
})
public class ExportAccountType {

    /**
     * Идентификатор счета
     * 
     */
    @XmlElement(name = "AccountGuid", required = true)
    protected String accountGuid;
    /**
     * Вид счета (ссылка на НСИ "Вид счета" Код 62)
     * 
     */
    @XmlElement(name = "AccountKind", required = true)
    protected NsiRef accountKind;
    /**
     * Дата открытия счета
     * 
     */
    @XmlElement(name = "OpenDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openDate;
    /**
     * Реквизиты счета
     * 
     */
    @XmlElement(name = "Details", required = true)
    protected List<ExportAccountType.Details> details;
    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Справка об открытии специального счета
     * 
     */
    @XmlElement(name = "DocForAccountOpening")
    protected List<AttachmentType> docForAccountOpening;
    /**
     * Дата закрытия специального счета/счета регионального оператора
     * 
     */
    @XmlElement(name = "CloseDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closeDate;
    /**
     * Статус
     * 
     */
    @XmlElement(name = "Status", required = true)
    protected String status;
    /**
     * Информация о совершенных операциях и остатках по счету
     * 
     */
    @XmlElement(name = "OperationAndBalance")
    protected List<ExportOperationAndBalanceType> operationAndBalance;
    /**
     * За указанный период нформация  о совершенных операциях и остатках по счету отсутствует
     * 
     */
    @XmlElement(name = "OperationAndBalanceIsAbsent")
    protected Boolean operationAndBalanceIsAbsent;

    /**
     * Идентификатор счета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountGuid() {
        return accountGuid;
    }

    /**
     * Sets the value of the accountGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountGuid()
     */
    public void setAccountGuid(String value) {
        this.accountGuid = value;
    }

    /**
     * Вид счета (ссылка на НСИ "Вид счета" Код 62)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getAccountKind() {
        return accountKind;
    }

    /**
     * Sets the value of the accountKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getAccountKind()
     */
    public void setAccountKind(NsiRef value) {
        this.accountKind = value;
    }

    /**
     * Дата открытия счета
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOpenDate()
     */
    public void setOpenDate(XMLGregorianCalendar value) {
        this.openDate = value;
    }

    /**
     * Реквизиты счета
     * 
     * Gets the value of the details property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportAccountType.Details }
     * </p>
     * 
     * 
     * @return
     *     The value of the details property.
     */
    public List<ExportAccountType.Details> getDetails() {
        if (details == null) {
            details = new ArrayList<>();
        }
        return this.details;
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
     * Справка об открытии специального счета
     * 
     * Gets the value of the docForAccountOpening property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docForAccountOpening property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocForAccountOpening().add(newItem);
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
     *     The value of the docForAccountOpening property.
     */
    public List<AttachmentType> getDocForAccountOpening() {
        if (docForAccountOpening == null) {
            docForAccountOpening = new ArrayList<>();
        }
        return this.docForAccountOpening;
    }

    /**
     * Дата закрытия специального счета/счета регионального оператора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCloseDate() {
        return closeDate;
    }

    /**
     * Sets the value of the closeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCloseDate()
     */
    public void setCloseDate(XMLGregorianCalendar value) {
        this.closeDate = value;
    }

    /**
     * Статус
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Информация о совершенных операциях и остатках по счету
     * 
     * Gets the value of the operationAndBalance property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationAndBalance property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOperationAndBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOperationAndBalanceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the operationAndBalance property.
     */
    public List<ExportOperationAndBalanceType> getOperationAndBalance() {
        if (operationAndBalance == null) {
            operationAndBalance = new ArrayList<>();
        }
        return this.operationAndBalance;
    }

    /**
     * За указанный период нформация  о совершенных операциях и остатках по счету отсутствует
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOperationAndBalanceIsAbsent() {
        return operationAndBalanceIsAbsent;
    }

    /**
     * Sets the value of the operationAndBalanceIsAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isOperationAndBalanceIsAbsent()
     */
    public void setOperationAndBalanceIsAbsent(Boolean value) {
        this.operationAndBalanceIsAbsent = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountType">
     *       <sequence>
     *         <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="Current" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "changeDate",
        "current"
    })
    public static class Details
        extends AccountType
    {

        /**
         * Дата изменения реквизитов счета
         * 
         */
        @XmlElement(name = "ChangeDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar changeDate;
        /**
         * Являются текущими реквизитами
         * 
         */
        @XmlElement(name = "Current")
        protected boolean current;

        /**
         * Дата изменения реквизитов счета
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getChangeDate() {
            return changeDate;
        }

        /**
         * Sets the value of the changeDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getChangeDate()
         */
        public void setChangeDate(XMLGregorianCalendar value) {
            this.changeDate = value;
        }

        /**
         * Являются текущими реквизитами
         * 
         */
        public boolean isCurrent() {
            return current;
        }

        /**
         * Sets the value of the current property.
         * 
         */
        public void setCurrent(boolean value) {
            this.current = value;
        }

    }

}
