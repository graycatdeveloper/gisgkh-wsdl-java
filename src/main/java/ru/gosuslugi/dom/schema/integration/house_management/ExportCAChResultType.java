
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Ответ на запрос экспорта ДУ/уставов
 * 
 * <p>Java class for exportCAChResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="exportCAChResultType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Contract">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractExportType">
 *                 <sequence>
 *                   <element name="Terminate" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                           <sequence>
 *                             <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ContractStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractStatusExportType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
 *                   <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                           <sequence>
 *                             <element name="ContractObjectVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                             <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                     <sequence>
 *                                       <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                     </sequence>
 *                                   </extension>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                     <sequence>
 *                                       <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                     </sequence>
 *                                   </extension>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Exclusion" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                       <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="StatusObject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}StatusMKDType" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="ContractPaymentsInfo" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoVersionGUID"/>
 *                             <element name="Status">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="P"/>
 *                                   <enumeration value="A"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Charter">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterExportType">
 *                 <sequence>
 *                   <element name="Terminate" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
 *                           <sequence>
 *                             <element name="Reason">
 *                               <simpleType>
 *                                 <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *                                   <maxLength value="255"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="CharterStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterStatusExportType"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
 *                   <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
 *                           <sequence>
 *                             <element name="ContractObjectVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                             <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                             <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                     <sequence>
 *                                       <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                     </sequence>
 *                                   </extension>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="AddService" maxOccurs="unbounded" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
 *                                     <sequence>
 *                                       <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                     </sequence>
 *                                   </extension>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Exclusion" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
 *                                       <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="StatusObject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}StatusMKDType" minOccurs="0"/>
 *                             <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                   <element name="CharterPaymentsInfo" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoType">
 *                           <sequence>
 *                             <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoVersionGUID"/>
 *                             <element name="Status">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <enumeration value="P"/>
 *                                   <enumeration value="A"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </extension>
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
@XmlType(name = "exportCAChResultType", propOrder = {
    "contract",
    "charter"
})
public class ExportCAChResultType {

    /**
     * ДУ
     * 
     */
    @XmlElement(name = "Contract")
    protected ExportCAChResultType.Contract contract;
    /**
     * Устав
     * 
     */
    @XmlElement(name = "Charter")
    protected ExportCAChResultType.Charter charter;

    /**
     * ДУ
     * 
     * @return
     *     possible object is
     *     {@link ExportCAChResultType.Contract }
     *     
     */
    public ExportCAChResultType.Contract getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCAChResultType.Contract }
     *     
     * @see #getContract()
     */
    public void setContract(ExportCAChResultType.Contract value) {
        this.contract = value;
    }

    /**
     * Устав
     * 
     * @return
     *     possible object is
     *     {@link ExportCAChResultType.Charter }
     *     
     */
    public ExportCAChResultType.Charter getCharter() {
        return charter;
    }

    /**
     * Sets the value of the charter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportCAChResultType.Charter }
     *     
     * @see #getCharter()
     */
    public void setCharter(ExportCAChResultType.Charter value) {
        this.charter = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterExportType">
     *       <sequence>
     *         <element name="Terminate" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *                 <sequence>
     *                   <element name="Reason">
     *                     <simpleType>
     *                       <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
     *                         <maxLength value="255"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="CharterStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterStatusExportType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterGUID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterVersionGUID"/>
     *         <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                 <sequence>
     *                   <element name="ContractObjectVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                   <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                           <sequence>
     *                             <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                           <sequence>
     *                             <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Exclusion" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                             <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="StatusObject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}StatusMKDType" minOccurs="0"/>
     *                   <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="CharterPaymentsInfo" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoVersionGUID"/>
     *                   <element name="Status">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="P"/>
     *                         <enumeration value="A"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </extension>
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
        "terminate",
        "charterStatus",
        "charterGUID",
        "charterVersionGUID",
        "contractObject",
        "charterPaymentsInfo"
    })
    public static class Charter
        extends CharterExportType
    {

        /**
         * Информация о прекращении действия устава
         * 
         */
        @XmlElement(name = "Terminate")
        protected ExportCAChResultType.Charter.Terminate terminate;
        /**
         * Статус устава в ГИС ЖКХ:
         *  Project - проект
         *  Reviewed - рассмотрен
         *  ApprovalProcess - на утверждении
         *  Approved - утвержден
         *  Terminated - расторгнут/закрыт
         *  Rejected - отклонен
         *  Annul - аннулирован
         * 
         */
        @XmlElement(name = "CharterStatus", required = true)
        @XmlSchemaType(name = "string")
        protected CharterStatusExportType charterStatus;
        /**
         * Корневой идентификатор устава (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "CharterGUID", required = true)
        protected String charterGUID;
        /**
         * Идентификатор версии устава в ГИС ЖКХ
         * 
         */
        @XmlElement(name = "CharterVersionGUID", required = true)
        protected String charterVersionGUID;
        /**
         * Объект управления
         * 
         */
        @XmlElement(name = "ContractObject")
        protected List<ExportCAChResultType.Charter.ContractObject> contractObject;
        /**
         * Сведения о размере платы
         * 
         */
        @XmlElement(name = "CharterPaymentsInfo")
        protected List<ExportCAChResultType.Charter.CharterPaymentsInfo> charterPaymentsInfo;

        /**
         * Информация о прекращении действия устава
         * 
         * @return
         *     possible object is
         *     {@link ExportCAChResultType.Charter.Terminate }
         *     
         */
        public ExportCAChResultType.Charter.Terminate getTerminate() {
            return terminate;
        }

        /**
         * Sets the value of the terminate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportCAChResultType.Charter.Terminate }
         *     
         * @see #getTerminate()
         */
        public void setTerminate(ExportCAChResultType.Charter.Terminate value) {
            this.terminate = value;
        }

        /**
         * Статус устава в ГИС ЖКХ:
         *  Project - проект
         *  Reviewed - рассмотрен
         *  ApprovalProcess - на утверждении
         *  Approved - утвержден
         *  Terminated - расторгнут/закрыт
         *  Rejected - отклонен
         *  Annul - аннулирован
         * 
         * @return
         *     possible object is
         *     {@link CharterStatusExportType }
         *     
         */
        public CharterStatusExportType getCharterStatus() {
            return charterStatus;
        }

        /**
         * Sets the value of the charterStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link CharterStatusExportType }
         *     
         * @see #getCharterStatus()
         */
        public void setCharterStatus(CharterStatusExportType value) {
            this.charterStatus = value;
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
         * Объект управления
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
         * {@link ExportCAChResultType.Charter.ContractObject }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractObject property.
         */
        public List<ExportCAChResultType.Charter.ContractObject> getContractObject() {
            if (contractObject == null) {
                contractObject = new ArrayList<>();
            }
            return this.contractObject;
        }

        /**
         * Сведения о размере платы
         * 
         * Gets the value of the charterPaymentsInfo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the charterPaymentsInfo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCharterPaymentsInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportCAChResultType.Charter.CharterPaymentsInfo }
         * </p>
         * 
         * 
         * @return
         *     The value of the charterPaymentsInfo property.
         */
        public List<ExportCAChResultType.Charter.CharterPaymentsInfo> getCharterPaymentsInfo() {
            if (charterPaymentsInfo == null) {
                charterPaymentsInfo = new ArrayList<>();
            }
            return this.charterPaymentsInfo;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}CharterPaymentsInfoVersionGUID"/>
         *         <element name="Status">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <enumeration value="P"/>
         *               <enumeration value="A"/>
         *             </restriction>
         *           </simpleType>
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
            "charterPaymentsInfoVersionGUID",
            "status"
        })
        public static class CharterPaymentsInfo
            extends CharterPaymentsInfoType
        {

            /**
             * Идентификатор версии сведений о размере платы по уставу
             * 
             */
            @XmlElement(name = "CharterPaymentsInfoVersionGUID", required = true)
            protected String charterPaymentsInfoVersionGUID;
            /**
             * Статус версии:
             * (P)laced - информация размещена
             * (A)nnulment - инофрмация аннулирована
             * 
             */
            @XmlElement(name = "Status", required = true)
            protected String status;

            /**
             * Идентификатор версии сведений о размере платы по уставу
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCharterPaymentsInfoVersionGUID() {
                return charterPaymentsInfoVersionGUID;
            }

            /**
             * Sets the value of the charterPaymentsInfoVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getCharterPaymentsInfoVersionGUID()
             */
            public void setCharterPaymentsInfoVersionGUID(String value) {
                this.charterPaymentsInfoVersionGUID = value;
            }

            /**
             * Статус версии:
             * (P)laced - информация размещена
             * (A)nnulment - инофрмация аннулирована
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

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *       <sequence>
         *         <element name="ContractObjectVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                 <sequence>
         *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                 <sequence>
         *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Exclusion" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                   <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="StatusObject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}StatusMKDType" minOccurs="0"/>
         *         <element name="IsManagedByContract" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
            "contractObjectVersionGUID",
            "baseMService",
            "houseService",
            "addService",
            "exclusion",
            "statusObject",
            "isManagedByContract"
        })
        public static class ContractObject
            extends ManageObjectType
        {

            /**
             * Идентификатор версии объекта управления  в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "ContractObjectVersionGUID", required = true)
            protected String contractObjectVersionGUID;
            /**
             * Основание
             * 
             */
            @XmlElement(name = "BaseMService", required = true)
            protected BaseServiceType baseMService;
            /**
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             */
            @XmlElement(name = "HouseService")
            protected List<ExportCAChResultType.Charter.ContractObject.HouseService> houseService;
            /**
             * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
             * 
             */
            @XmlElement(name = "AddService")
            protected List<ExportCAChResultType.Charter.ContractObject.AddService> addService;
            /**
             * Сведения об исключении объекта управления из устава
             * 
             */
            @XmlElement(name = "Exclusion")
            protected ExportCAChResultType.Charter.ContractObject.Exclusion exclusion;
            /**
             * Статус в ГИС ЖКХ
             * Допустимые значения:
             * Project-Проект
             * ApprovalProcess-На утверждении
             * Rejected-Отклонен
             * Approved-Утвержден
             * Locked-Заблокирован
             * 
             */
            @XmlElement(name = "StatusObject")
            @XmlSchemaType(name = "string")
            protected StatusMKDType statusObject;
            /**
             * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
             * 
             */
            @XmlElement(name = "IsManagedByContract")
            protected Boolean isManagedByContract;

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
             * Основание
             * 
             * @return
             *     possible object is
             *     {@link BaseServiceType }
             *     
             */
            public BaseServiceType getBaseMService() {
                return baseMService;
            }

            /**
             * Sets the value of the baseMService property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseServiceType }
             *     
             * @see #getBaseMService()
             */
            public void setBaseMService(BaseServiceType value) {
                this.baseMService = value;
            }

            /**
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             * Gets the value of the houseService property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getHouseService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportCAChResultType.Charter.ContractObject.HouseService }
             * </p>
             * 
             * 
             * @return
             *     The value of the houseService property.
             */
            public List<ExportCAChResultType.Charter.ContractObject.HouseService> getHouseService() {
                if (houseService == null) {
                    houseService = new ArrayList<>();
                }
                return this.houseService;
            }

            /**
             * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
             * 
             * Gets the value of the addService property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAddService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportCAChResultType.Charter.ContractObject.AddService }
             * </p>
             * 
             * 
             * @return
             *     The value of the addService property.
             */
            public List<ExportCAChResultType.Charter.ContractObject.AddService> getAddService() {
                if (addService == null) {
                    addService = new ArrayList<>();
                }
                return this.addService;
            }

            /**
             * Сведения об исключении объекта управления из устава
             * 
             * @return
             *     possible object is
             *     {@link ExportCAChResultType.Charter.ContractObject.Exclusion }
             *     
             */
            public ExportCAChResultType.Charter.ContractObject.Exclusion getExclusion() {
                return exclusion;
            }

            /**
             * Sets the value of the exclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportCAChResultType.Charter.ContractObject.Exclusion }
             *     
             * @see #getExclusion()
             */
            public void setExclusion(ExportCAChResultType.Charter.ContractObject.Exclusion value) {
                this.exclusion = value;
            }

            /**
             * Статус в ГИС ЖКХ
             * Допустимые значения:
             * Project-Проект
             * ApprovalProcess-На утверждении
             * Rejected-Отклонен
             * Approved-Утвержден
             * Locked-Заблокирован
             * 
             * @return
             *     possible object is
             *     {@link StatusMKDType }
             *     
             */
            public StatusMKDType getStatusObject() {
                return statusObject;
            }

            /**
             * Sets the value of the statusObject property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusMKDType }
             *     
             * @see #getStatusObject()
             */
            public void setStatusObject(StatusMKDType value) {
                this.statusObject = value;
            }

            /**
             * Управление многоквартирным домом осуществляется управляющей организацией по договору управления
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsManagedByContract() {
                return isManagedByContract;
            }

            /**
             * Sets the value of the isManagedByContract property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             * @see #isIsManagedByContract()
             */
            public void setIsManagedByContract(Boolean value) {
                this.isManagedByContract = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *       <sequence>
             *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
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
                "baseService"
            })
            public static class AddService
                extends ContractServiceType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseService", required = true)
                protected BaseServiceType baseService;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseService() {
                    return baseService;
                }

                /**
                 * Sets the value of the baseService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseService()
                 */
                public void setBaseService(BaseServiceType value) {
                    this.baseService = value;
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
             *         <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *         <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "baseExclusion",
                "dateExclusion"
            })
            public static class Exclusion {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseExclusion", required = true)
                protected BaseServiceType baseExclusion;
                /**
                 * Дата исключения
                 * 
                 */
                @XmlElement(name = "DateExclusion", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateExclusion;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseExclusion() {
                    return baseExclusion;
                }

                /**
                 * Sets the value of the baseExclusion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseExclusion()
                 */
                public void setBaseExclusion(BaseServiceType value) {
                    this.baseExclusion = value;
                }

                /**
                 * Дата исключения
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateExclusion() {
                    return dateExclusion;
                }

                /**
                 * Sets the value of the dateExclusion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getDateExclusion()
                 */
                public void setDateExclusion(XMLGregorianCalendar value) {
                    this.dateExclusion = value;
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *       <sequence>
             *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
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
                "baseService"
            })
            public static class HouseService
                extends ContractServiceType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseService", required = true)
                protected BaseServiceType baseService;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseService() {
                    return baseService;
                }

                /**
                 * Sets the value of the baseService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseService()
                 */
                public void setBaseService(BaseServiceType value) {
                    this.baseService = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
         *       <sequence>
         *         <element name="Reason">
         *           <simpleType>
         *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
         *               <maxLength value="255"/>
         *             </restriction>
         *           </simpleType>
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
            "reason"
        })
        public static class Terminate
            extends TerminateType
        {

            /**
             * Причина прекращения действия устава
             * 
             */
            @XmlElement(name = "Reason", required = true)
            protected String reason;

            /**
             * Причина прекращения действия устава
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getReason()
             */
            public void setReason(String value) {
                this.reason = value;
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractExportType">
     *       <sequence>
     *         <element name="Terminate" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
     *                 <sequence>
     *                   <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ContractStatus" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractStatusExportType"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractGUID"/>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractVersionGUID"/>
     *         <element name="ContractObject" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
     *                 <sequence>
     *                   <element name="ContractObjectVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                   <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                   <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                           <sequence>
     *                             <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="AddService" maxOccurs="unbounded" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
     *                           <sequence>
     *                             <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                           </sequence>
     *                         </extension>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Exclusion" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
     *                             <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="StatusObject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}StatusMKDType" minOccurs="0"/>
     *                 </sequence>
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *         <element name="ContractPaymentsInfo" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoType">
     *                 <sequence>
     *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoVersionGUID"/>
     *                   <element name="Status">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <enumeration value="P"/>
     *                         <enumeration value="A"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
     *                 </sequence>
     *               </extension>
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
        "terminate",
        "contractStatus",
        "contractGUID",
        "contractVersionGUID",
        "contractObject",
        "contractPaymentsInfo"
    })
    public static class Contract
        extends ContractExportType
    {

        /**
         * Информация о расторжении ДУ
         * 
         */
        @XmlElement(name = "Terminate")
        protected ExportCAChResultType.Contract.Terminate terminate;
        /**
         * Статус ДУ в ГИС ЖКХ:
         * Project - проект
         * ApprovalProcess - на утверждении
         * Approved - утвержден
         * Rejected - отклонен
         * Reviewed - рассмотрен
         * Terminated - расторгнут/закрыт
         * Annul - сведения аннулированы
         * 
         */
        @XmlElement(name = "ContractStatus", required = true)
        @XmlSchemaType(name = "string")
        protected ContractStatusExportType contractStatus;
        /**
         * Корневой идентификатор договора (не меняется от версии к версии)
         * 
         */
        @XmlElement(name = "ContractGUID", required = true)
        protected String contractGUID;
        /**
         * Идентификатор версии договора
         * 
         */
        @XmlElement(name = "ContractVersionGUID", required = true)
        protected String contractVersionGUID;
        /**
         * Объект управления
         * 
         */
        @XmlElement(name = "ContractObject")
        protected List<ExportCAChResultType.Contract.ContractObject> contractObject;
        /**
         * Сведения о размере платы
         * 
         */
        @XmlElement(name = "ContractPaymentsInfo")
        protected List<ExportCAChResultType.Contract.ContractPaymentsInfo> contractPaymentsInfo;

        /**
         * Информация о расторжении ДУ
         * 
         * @return
         *     possible object is
         *     {@link ExportCAChResultType.Contract.Terminate }
         *     
         */
        public ExportCAChResultType.Contract.Terminate getTerminate() {
            return terminate;
        }

        /**
         * Sets the value of the terminate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportCAChResultType.Contract.Terminate }
         *     
         * @see #getTerminate()
         */
        public void setTerminate(ExportCAChResultType.Contract.Terminate value) {
            this.terminate = value;
        }

        /**
         * Статус ДУ в ГИС ЖКХ:
         * Project - проект
         * ApprovalProcess - на утверждении
         * Approved - утвержден
         * Rejected - отклонен
         * Reviewed - рассмотрен
         * Terminated - расторгнут/закрыт
         * Annul - сведения аннулированы
         * 
         * @return
         *     possible object is
         *     {@link ContractStatusExportType }
         *     
         */
        public ContractStatusExportType getContractStatus() {
            return contractStatus;
        }

        /**
         * Sets the value of the contractStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContractStatusExportType }
         *     
         * @see #getContractStatus()
         */
        public void setContractStatus(ContractStatusExportType value) {
            this.contractStatus = value;
        }

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
         * Объект управления
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
         * {@link ExportCAChResultType.Contract.ContractObject }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractObject property.
         */
        public List<ExportCAChResultType.Contract.ContractObject> getContractObject() {
            if (contractObject == null) {
                contractObject = new ArrayList<>();
            }
            return this.contractObject;
        }

        /**
         * Сведения о размере платы
         * 
         * Gets the value of the contractPaymentsInfo property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contractPaymentsInfo property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContractPaymentsInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportCAChResultType.Contract.ContractPaymentsInfo }
         * </p>
         * 
         * 
         * @return
         *     The value of the contractPaymentsInfo property.
         */
        public List<ExportCAChResultType.Contract.ContractPaymentsInfo> getContractPaymentsInfo() {
            if (contractPaymentsInfo == null) {
                contractPaymentsInfo = new ArrayList<>();
            }
            return this.contractPaymentsInfo;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ManageObjectType">
         *       <sequence>
         *         <element name="ContractObjectVersionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="BaseMService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *         <element name="HouseService" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                 <sequence>
         *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="AddService" maxOccurs="unbounded" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
         *                 <sequence>
         *                   <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                 </sequence>
         *               </extension>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Exclusion" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
         *                   <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="StatusObject" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}StatusMKDType" minOccurs="0"/>
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
            "contractObjectVersionGUID",
            "baseMService",
            "houseService",
            "addService",
            "exclusion",
            "statusObject"
        })
        public static class ContractObject
            extends ManageObjectType
        {

            /**
             * Идентификатор версии объекта управления  в ГИС ЖКХ
             * 
             */
            @XmlElement(name = "ContractObjectVersionGUID", required = true)
            protected String contractObjectVersionGUID;
            /**
             * Основание
             * 
             */
            @XmlElement(name = "BaseMService", required = true)
            protected BaseServiceType baseMService;
            /**
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             */
            @XmlElement(name = "HouseService")
            protected List<ExportCAChResultType.Contract.ContractObject.HouseService> houseService;
            /**
             * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
             * 
             */
            @XmlElement(name = "AddService")
            protected List<ExportCAChResultType.Contract.ContractObject.AddService> addService;
            /**
             * Сведения об исключении объекта управления из ДУ
             * 
             */
            @XmlElement(name = "Exclusion")
            protected ExportCAChResultType.Contract.ContractObject.Exclusion exclusion;
            /**
             * Статус в ГИС ЖКХ
             * Допустимые значения:
             * Project-Проект
             * ApprovalProcess-На утверждении
             * Rejected-Отклонен
             * Approved-Утвержден
             * Locked-Заблокирован
             * 
             */
            @XmlElement(name = "StatusObject")
            @XmlSchemaType(name = "string")
            protected StatusMKDType statusObject;

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
             * Основание
             * 
             * @return
             *     possible object is
             *     {@link BaseServiceType }
             *     
             */
            public BaseServiceType getBaseMService() {
                return baseMService;
            }

            /**
             * Sets the value of the baseMService property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaseServiceType }
             *     
             * @see #getBaseMService()
             */
            public void setBaseMService(BaseServiceType value) {
                this.baseMService = value;
            }

            /**
             * Виды КУ. Ссылка на НСИ "Вид коммунальной услуги" (реестровый номер 3)
             * 
             * Gets the value of the houseService property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the houseService property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getHouseService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportCAChResultType.Contract.ContractObject.HouseService }
             * </p>
             * 
             * 
             * @return
             *     The value of the houseService property.
             */
            public List<ExportCAChResultType.Contract.ContractObject.HouseService> getHouseService() {
                if (houseService == null) {
                    houseService = new ArrayList<>();
                }
                return this.houseService;
            }

            /**
             * Дополнительные услуги. Ссылка на НСИ "Дополнительные услуги" (реестровый номер 1)
             * 
             * Gets the value of the addService property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addService property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getAddService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExportCAChResultType.Contract.ContractObject.AddService }
             * </p>
             * 
             * 
             * @return
             *     The value of the addService property.
             */
            public List<ExportCAChResultType.Contract.ContractObject.AddService> getAddService() {
                if (addService == null) {
                    addService = new ArrayList<>();
                }
                return this.addService;
            }

            /**
             * Сведения об исключении объекта управления из ДУ
             * 
             * @return
             *     possible object is
             *     {@link ExportCAChResultType.Contract.ContractObject.Exclusion }
             *     
             */
            public ExportCAChResultType.Contract.ContractObject.Exclusion getExclusion() {
                return exclusion;
            }

            /**
             * Sets the value of the exclusion property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportCAChResultType.Contract.ContractObject.Exclusion }
             *     
             * @see #getExclusion()
             */
            public void setExclusion(ExportCAChResultType.Contract.ContractObject.Exclusion value) {
                this.exclusion = value;
            }

            /**
             * Статус в ГИС ЖКХ
             * Допустимые значения:
             * Project-Проект
             * ApprovalProcess-На утверждении
             * Rejected-Отклонен
             * Approved-Утвержден
             * Locked-Заблокирован
             * 
             * @return
             *     possible object is
             *     {@link StatusMKDType }
             *     
             */
            public StatusMKDType getStatusObject() {
                return statusObject;
            }

            /**
             * Sets the value of the statusObject property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusMKDType }
             *     
             * @see #getStatusObject()
             */
            public void setStatusObject(StatusMKDType value) {
                this.statusObject = value;
            }


            /**
             * <p>Java class for anonymous complex type</p>.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *       <sequence>
             *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
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
                "baseService"
            })
            public static class AddService
                extends ContractServiceType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseService", required = true)
                protected BaseServiceType baseService;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseService() {
                    return baseService;
                }

                /**
                 * Sets the value of the baseService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseService()
                 */
                public void setBaseService(BaseServiceType value) {
                    this.baseService = value;
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
             *         <element name="BaseExclusion" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
             *         <element name="DateExclusion" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "baseExclusion",
                "dateExclusion"
            })
            public static class Exclusion {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseExclusion", required = true)
                protected BaseServiceType baseExclusion;
                /**
                 * Дата исключения
                 * 
                 */
                @XmlElement(name = "DateExclusion", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dateExclusion;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseExclusion() {
                    return baseExclusion;
                }

                /**
                 * Sets the value of the baseExclusion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseExclusion()
                 */
                public void setBaseExclusion(BaseServiceType value) {
                    this.baseExclusion = value;
                }

                /**
                 * Дата исключения
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDateExclusion() {
                    return dateExclusion;
                }

                /**
                 * Sets the value of the dateExclusion property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getDateExclusion()
                 */
                public void setDateExclusion(XMLGregorianCalendar value) {
                    this.dateExclusion = value;
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
             *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractServiceType">
             *       <sequence>
             *         <element name="BaseService" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}BaseServiceType"/>
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
                "baseService"
            })
            public static class HouseService
                extends ContractServiceType
            {

                /**
                 * Основание
                 * 
                 */
                @XmlElement(name = "BaseService", required = true)
                protected BaseServiceType baseService;

                /**
                 * Основание
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaseServiceType }
                 *     
                 */
                public BaseServiceType getBaseService() {
                    return baseService;
                }

                /**
                 * Sets the value of the baseService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaseServiceType }
                 *     
                 * @see #getBaseService()
                 */
                public void setBaseService(BaseServiceType value) {
                    this.baseService = value;
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
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoType">
         *       <sequence>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}ContractPaymentsInfoVersionGUID"/>
         *         <element name="Status">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <enumeration value="P"/>
         *               <enumeration value="A"/>
         *             </restriction>
         *           </simpleType>
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
            "contractPaymentsInfoVersionGUID",
            "status"
        })
        public static class ContractPaymentsInfo
            extends ContractPaymentsInfoType
        {

            /**
             * Идентификатор версии сведений о размере платы по ДУ
             * 
             */
            @XmlElement(name = "ContractPaymentsInfoVersionGUID", required = true)
            protected String contractPaymentsInfoVersionGUID;
            /**
             * Статус версии:
             * (P)laced - информация размещена
             * (A)nnulled - инофрмация аннулирована
             * 
             */
            @XmlElement(name = "Status", required = true)
            protected String status;

            /**
             * Идентификатор версии сведений о размере платы по ДУ
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractPaymentsInfoVersionGUID() {
                return contractPaymentsInfoVersionGUID;
            }

            /**
             * Sets the value of the contractPaymentsInfoVersionGUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getContractPaymentsInfoVersionGUID()
             */
            public void setContractPaymentsInfoVersionGUID(String value) {
                this.contractPaymentsInfoVersionGUID = value;
            }

            /**
             * Статус версии:
             * (P)laced - информация размещена
             * (A)nnulled - инофрмация аннулирована
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

        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}TerminateType">
         *       <sequence>
         *         <element name="ReasonRef" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
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
            "reasonRef"
        })
        public static class Terminate
            extends TerminateType
        {

            /**
             * Ссылка на НСИ "54	Причина расторжения договор" (реестровый номер 54)
             * 
             */
            @XmlElement(name = "ReasonRef")
            protected NsiRef reasonRef;

            /**
             * Ссылка на НСИ "54	Причина расторжения договор" (реестровый номер 54)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getReasonRef() {
                return reasonRef;
            }

            /**
             * Sets the value of the reasonRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getReasonRef()
             */
            public void setReasonRef(NsiRef value) {
                this.reasonRef = value;
            }

        }

    }

}
