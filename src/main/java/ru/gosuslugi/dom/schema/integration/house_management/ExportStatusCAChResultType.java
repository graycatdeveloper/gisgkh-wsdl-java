
package ru.gosuslugi.dom.schema.integration.house_management;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ответ на запрос экспорта ДУ/уставов
 * 
 * <p>Java class for exportStatusCAChResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportStatusCAChResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <sequence>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractStatus"/>
 *           </sequence>
 *           <sequence>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterStatus"/>
 *           </sequence>
 *         </choice>
 *         <element name="State" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="Running"/>
 *               <enumeration value="NotRunning"/>
 *               <enumeration value="Expired"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManagedObjectStatus"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID" minOccurs="0"/>
 *                   <element name="IsConflicted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportStatusCAChResultType", propOrder = {
    "contractGUID",
    "contractVersionGUID",
    "contractStatus",
    "charterGUID",
    "charterVersionGUID",
    "charterStatus",
    "state",
    "contractObject",
    "versionNumber"
})
@XmlSeeAlso({
    ImportContractResultType.class,
    ImportCharterResultType.class
})
public class ExportStatusCAChResultType {

    /**
     * Корневой идентификатор договора (не меняется от версии к версии)
     * 
     */
    @XmlElement(name = "ContractGUID")
    protected String contractGUID;
    /**
     * Идентификатор версии договора
     * 
     */
    @XmlElement(name = "ContractVersionGUID")
    protected String contractVersionGUID;
    /**
     * Статус ДУ:
     *  Project - проект
     *  ApprovalProcess - на утверждении
     *  Approved - утвержден
     *  Rejected- отклонен
     *  Terminated - расторгнут/закрыт
     *  Reviewed - рассмотрен
     *  Annul - сведения аннулированы
     * 
     */
    @XmlElement(name = "ContractStatus")
    @XmlSchemaType(name = "string")
    protected ContractStatusType contractStatus;
    /**
     * Корневой идентификатор устава (не меняется от версии к версии)
     * 
     */
    @XmlElement(name = "CharterGUID")
    protected String charterGUID;
    /**
     * Идентификатор версии устава в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CharterVersionGUID")
    protected String charterVersionGUID;
    /**
     * Статус устава в ГИС ЖКХ:
     *  Project - проект
     *  Approved - утвержден
     *  Terminated - расторгнут/закрыт
     *  Annul - аннулирован
     *  Reviewed - рассмотрен
     *  ApprovalProcess - на утверждении
     *  Rejected - отклонен
     * 
     */
    @XmlElement(name = "CharterStatus")
    @XmlSchemaType(name = "string")
    protected CharterStatusType charterStatus;
    /**
     * Состояние документа:
     *  Running - действующий
     *  NotRunning - не действующий
     *  Expired - истек срок действия
     * 
     */
    @XmlElement(name = "State")
    protected String state;
    /**
     * Управляемый объект
     * 
     */
    @XmlElement(name = "ContractObject")
    protected List<ExportStatusCAChResultType.ContractObject> contractObject;
    /**
     * Номер версии
     * 
     */
    @XmlElement(name = "VersionNumber", required = true)
    protected BigInteger versionNumber;

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
     * Идентификатор версии договора
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractVersionGUID() {
        return contractVersionGUID;
    }

    /**
     * Sets the value of the contractVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractVersionGUID()
     */
    public void setContractVersionGUID(String value) {
        this.contractVersionGUID = value;
    }

    /**
     * Статус ДУ:
     *  Project - проект
     *  ApprovalProcess - на утверждении
     *  Approved - утвержден
     *  Rejected- отклонен
     *  Terminated - расторгнут/закрыт
     *  Reviewed - рассмотрен
     *  Annul - сведения аннулированы
     * 
     * @return
     *     possible object is
     *     {@link ContractStatusType }
     *     
     */
    public ContractStatusType getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractStatusType }
     *     
     * @see #getContractStatus()
     */
    public void setContractStatus(ContractStatusType value) {
        this.contractStatus = value;
    }

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

    /**
     * Идентификатор версии устава в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharterVersionGUID() {
        return charterVersionGUID;
    }

    /**
     * Sets the value of the charterVersionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCharterVersionGUID()
     */
    public void setCharterVersionGUID(String value) {
        this.charterVersionGUID = value;
    }

    /**
     * Статус устава в ГИС ЖКХ:
     *  Project - проект
     *  Approved - утвержден
     *  Terminated - расторгнут/закрыт
     *  Annul - аннулирован
     *  Reviewed - рассмотрен
     *  ApprovalProcess - на утверждении
     *  Rejected - отклонен
     * 
     * @return
     *     possible object is
     *     {@link CharterStatusType }
     *     
     */
    public CharterStatusType getCharterStatus() {
        return charterStatus;
    }

    /**
     * Sets the value of the charterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharterStatusType }
     *     
     * @see #getCharterStatus()
     */
    public void setCharterStatus(CharterStatusType value) {
        this.charterStatus = value;
    }

    /**
     * Состояние документа:
     *  Running - действующий
     *  NotRunning - не действующий
     *  Expired - истек срок действия
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getState()
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Управляемый объект
     * 
     * Gets the value of the contractObject property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractObject property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContractObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportStatusCAChResultType.ContractObject }
     * </p>
     * 
     * 
     * @return
     *     The value of the contractObject property.
     */
    public List<ExportStatusCAChResultType.ContractObject> getContractObject() {
        if (contractObject == null) {
            contractObject = new ArrayList<>();
        }
        return this.contractObject;
    }

    /**
     * Номер версии
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getVersionNumber()
     */
    public void setVersionNumber(BigInteger value) {
        this.versionNumber = value;
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
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManagedObjectStatus"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractObjectVersionGUID" minOccurs="0"/>
     *         <element name="IsConflicted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "fiasHouseGuid",
        "managedObjectStatus",
        "contractObjectVersionGUID",
        "isConflicted",
        "isBlocked"
    })
    public static class ContractObject {

        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid", required = true)
        protected String fiasHouseGuid;
        /**
         * Статус управляемого объекта:
         *  Project - проект
         *  ApprovalProcess - на утверждении
         *  Approved - утвержден
         *  Rejected- отклонен
         *  Terminated - расторгнут
         *  Reviewed - рассмотрен
         *  Locked - заблокирован
         * 
         */
        @XmlElement(name = "ManagedObjectStatus", required = true)
        @XmlSchemaType(name = "string")
        protected StatusMKDType managedObjectStatus;
        /**
         * Идентификатор версии объекта управления  в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "ContractObjectVersionGUID")
        protected String contractObjectVersionGUID;
        /**
         * Признак расхождения с Реестром инфомрации об управлении МКД
         * 
         */
        @XmlElement(name = "IsConflicted")
        protected Boolean isConflicted;
        /**
         * Признак заблокированного дома
         * 
         */
        @XmlElement(name = "IsBlocked")
        protected Boolean isBlocked;

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
         * Статус управляемого объекта:
         *  Project - проект
         *  ApprovalProcess - на утверждении
         *  Approved - утвержден
         *  Rejected- отклонен
         *  Terminated - расторгнут
         *  Reviewed - рассмотрен
         *  Locked - заблокирован
         * 
         * @return
         *     possible object is
         *     {@link StatusMKDType }
         *     
         */
        public StatusMKDType getManagedObjectStatus() {
            return managedObjectStatus;
        }

        /**
         * Sets the value of the managedObjectStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusMKDType }
         *     
         * @see #getManagedObjectStatus()
         */
        public void setManagedObjectStatus(StatusMKDType value) {
            this.managedObjectStatus = value;
        }

        /**
         * Идентификатор версии объекта управления  в ГИС ЖКХ
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContractObjectVersionGUID() {
            return contractObjectVersionGUID;
        }

        /**
         * Sets the value of the contractObjectVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getContractObjectVersionGUID()
         */
        public void setContractObjectVersionGUID(String value) {
            this.contractObjectVersionGUID = value;
        }

        /**
         * Признак расхождения с Реестром инфомрации об управлении МКД
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsConflicted() {
            return isConflicted;
        }

        /**
         * Sets the value of the isConflicted property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsConflicted()
         */
        public void setIsConflicted(Boolean value) {
            this.isConflicted = value;
        }

        /**
         * Признак заблокированного дома
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsBlocked() {
            return isBlocked;
        }

        /**
         * Sets the value of the isBlocked property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsBlocked()
         */
        public void setIsBlocked(Boolean value) {
            this.isBlocked = value;
        }

    }

}
