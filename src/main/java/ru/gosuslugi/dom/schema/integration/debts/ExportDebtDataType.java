
package ru.gosuslugi.dom.schema.integration.debts;

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
 * Тип данных, описывающий сведения о задолженноси за ЖКУ при экспорте
 * 
 * <p>Java class for ExportDebtDataType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportDebtDataType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="DebtObject" type="{http://dom.gosuslugi.ru/schema/integration/debts/}ExportDebtObjectResultType"/>
 *         <element name="Debtor" type="{http://dom.gosuslugi.ru/schema/integration/debts/}ExportDebtorResultType"/>
 *         <element name="JudicalAct">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="JudicalActNumber">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="255"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="JudicalActDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="JudicalActAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AdditionalInfo" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/debts/}StatusType"/>
 *         <element name="FirstPublishedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="LastPublishedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="RepaymentData">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="RepaymentStatus" type="{http://dom.gosuslugi.ru/schema/integration/debts/}RepaimentStatusType"/>
 *                   <element name="PlacingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="PlacingUserDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="PlacingInfo" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="1000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="RepaymentAnnulmentData" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="RepaymentAnnulmentReason" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="RepaymentAnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                                       <element name="RepaymentAnnulmentTextReason" minOccurs="0">
 *                                         <simpleType>
 *                                           <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             <minLength value="1"/>
 *                                             <maxLength value="1000"/>
 *                                           </restriction>
 *                                         </simpleType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="RepaymentAnnulmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="AnnulmentData" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="AnnulmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   <element name="AnnulmentReason" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="AnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                             <element name="AnnulmentTextReason" minOccurs="0">
 *                               <simpleType>
 *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   <minLength value="1"/>
 *                                   <maxLength value="1000"/>
 *                                 </restriction>
 *                               </simpleType>
 *                             </element>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
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
@XmlType(name = "ExportDebtDataType", propOrder = {
    "debtGUID",
    "debtObject",
    "debtor",
    "judicalAct",
    "act",
    "additionalAttachment",
    "additionalInfo",
    "status",
    "firstPublishedDate",
    "lastPublishedDate",
    "repaymentData",
    "annulmentData"
})
public class ExportDebtDataType {

    /**
     * Уникальный идентификатор  сведений о задолженности за ЖКУ
     * 
     */
    @XmlElement(name = "DebtGUID", required = true)
    protected String debtGUID;
    /**
     * Jбъект жилищного фонда, 
     * по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "DebtObject", required = true)
    protected ExportDebtObjectResultType debtObject;
    /**
     * Сведения о гражданине, у которого имеется задолженность, подтвержденная судебным актом
     * 
     */
    @XmlElement(name = "Debtor", required = true)
    protected ExportDebtorResultType debtor;
    /**
     * Сведения о судебном акте
     * 
     */
    @XmlElement(name = "JudicalAct", required = true)
    protected ExportDebtDataType.JudicalAct judicalAct;
    /**
     * Акт сверки
     * 
     */
    @XmlElement(name = "Act")
    protected List<AttachmentType> act;
    /**
     * Дополнительные файлы
     * 
     */
    @XmlElement(name = "AdditionalAttachment")
    protected List<AttachmentType> additionalAttachment;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    /**
     * Статус сведений о задолженности. Возможные значения: 
     * PUBLISHED – Информация размещена; 
     * CANCELLED - Информация аннулирована.
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected StatusType status;
    /**
     * Дата первого размещения сведений о задолженности
     * 
     */
    @XmlElement(name = "FirstPublishedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPublishedDate;
    /**
     * Дата последнего размещения сведений о задолженности
     * 
     */
    @XmlElement(name = "LastPublishedDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastPublishedDate;
    /**
     * Сведения о погашении задолженности за ЖКУ
     * 
     */
    @XmlElement(name = "RepaymentData", required = true)
    protected ExportDebtDataType.RepaymentData repaymentData;
    /**
     * Сведения об аннулировании
     * 
     */
    @XmlElement(name = "AnnulmentData")
    protected ExportDebtDataType.AnnulmentData annulmentData;

    /**
     * Уникальный идентификатор  сведений о задолженности за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtGUID() {
        return debtGUID;
    }

    /**
     * Sets the value of the debtGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDebtGUID()
     */
    public void setDebtGUID(String value) {
        this.debtGUID = value;
    }

    /**
     * Jбъект жилищного фонда, 
     * по которому имеется непогашенная задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtObjectResultType }
     *     
     */
    public ExportDebtObjectResultType getDebtObject() {
        return debtObject;
    }

    /**
     * Sets the value of the debtObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtObjectResultType }
     *     
     * @see #getDebtObject()
     */
    public void setDebtObject(ExportDebtObjectResultType value) {
        this.debtObject = value;
    }

    /**
     * Сведения о гражданине, у которого имеется задолженность, подтвержденная судебным актом
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtorResultType }
     *     
     */
    public ExportDebtorResultType getDebtor() {
        return debtor;
    }

    /**
     * Sets the value of the debtor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtorResultType }
     *     
     * @see #getDebtor()
     */
    public void setDebtor(ExportDebtorResultType value) {
        this.debtor = value;
    }

    /**
     * Сведения о судебном акте
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtDataType.JudicalAct }
     *     
     */
    public ExportDebtDataType.JudicalAct getJudicalAct() {
        return judicalAct;
    }

    /**
     * Sets the value of the judicalAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtDataType.JudicalAct }
     *     
     * @see #getJudicalAct()
     */
    public void setJudicalAct(ExportDebtDataType.JudicalAct value) {
        this.judicalAct = value;
    }

    /**
     * Акт сверки
     * 
     * Gets the value of the act property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the act property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAct().add(newItem);
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
     *     The value of the act property.
     */
    public List<AttachmentType> getAct() {
        if (act == null) {
            act = new ArrayList<>();
        }
        return this.act;
    }

    /**
     * Дополнительные файлы
     * 
     * Gets the value of the additionalAttachment property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAttachment property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAdditionalAttachment().add(newItem);
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
     *     The value of the additionalAttachment property.
     */
    public List<AttachmentType> getAdditionalAttachment() {
        if (additionalAttachment == null) {
            additionalAttachment = new ArrayList<>();
        }
        return this.additionalAttachment;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInfo()
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Статус сведений о задолженности. Возможные значения: 
     * PUBLISHED – Информация размещена; 
     * CANCELLED - Информация аннулирована.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Дата первого размещения сведений о задолженности
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPublishedDate() {
        return firstPublishedDate;
    }

    /**
     * Sets the value of the firstPublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFirstPublishedDate()
     */
    public void setFirstPublishedDate(XMLGregorianCalendar value) {
        this.firstPublishedDate = value;
    }

    /**
     * Дата последнего размещения сведений о задолженности
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPublishedDate() {
        return lastPublishedDate;
    }

    /**
     * Sets the value of the lastPublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLastPublishedDate()
     */
    public void setLastPublishedDate(XMLGregorianCalendar value) {
        this.lastPublishedDate = value;
    }

    /**
     * Сведения о погашении задолженности за ЖКУ
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtDataType.RepaymentData }
     *     
     */
    public ExportDebtDataType.RepaymentData getRepaymentData() {
        return repaymentData;
    }

    /**
     * Sets the value of the repaymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtDataType.RepaymentData }
     *     
     * @see #getRepaymentData()
     */
    public void setRepaymentData(ExportDebtDataType.RepaymentData value) {
        this.repaymentData = value;
    }

    /**
     * Сведения об аннулировании
     * 
     * @return
     *     possible object is
     *     {@link ExportDebtDataType.AnnulmentData }
     *     
     */
    public ExportDebtDataType.AnnulmentData getAnnulmentData() {
        return annulmentData;
    }

    /**
     * Sets the value of the annulmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDebtDataType.AnnulmentData }
     *     
     * @see #getAnnulmentData()
     */
    public void setAnnulmentData(ExportDebtDataType.AnnulmentData value) {
        this.annulmentData = value;
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
     *         <element name="AnnulmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="AnnulmentReason" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="AnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                   <element name="AnnulmentTextReason" minOccurs="0">
     *                     <simpleType>
     *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         <minLength value="1"/>
     *                         <maxLength value="1000"/>
     *                       </restriction>
     *                     </simpleType>
     *                   </element>
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
    @XmlType(name = "", propOrder = {
        "annulmentDate",
        "annulmentReason"
    })
    public static class AnnulmentData {

        /**
         * Дата аннулирования сведений о задолженности
         * 
         */
        @XmlElement(name = "AnnulmentDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar annulmentDate;
        /**
         * Причина аннулирования сведений о задолженности за ЖКУ
         * 
         */
        @XmlElement(name = "AnnulmentReason")
        protected ExportDebtDataType.AnnulmentData.AnnulmentReason annulmentReason;

        /**
         * Дата аннулирования сведений о задолженности
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAnnulmentDate() {
            return annulmentDate;
        }

        /**
         * Sets the value of the annulmentDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getAnnulmentDate()
         */
        public void setAnnulmentDate(XMLGregorianCalendar value) {
            this.annulmentDate = value;
        }

        /**
         * Причина аннулирования сведений о задолженности за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ExportDebtDataType.AnnulmentData.AnnulmentReason }
         *     
         */
        public ExportDebtDataType.AnnulmentData.AnnulmentReason getAnnulmentReason() {
            return annulmentReason;
        }

        /**
         * Sets the value of the annulmentReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDebtDataType.AnnulmentData.AnnulmentReason }
         *     
         * @see #getAnnulmentReason()
         */
        public void setAnnulmentReason(ExportDebtDataType.AnnulmentData.AnnulmentReason value) {
            this.annulmentReason = value;
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
         *         <element name="AnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *         <element name="AnnulmentTextReason" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="1000"/>
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
            "annulmentNSIReason",
            "annulmentTextReason"
        })
        public static class AnnulmentReason {

            /**
             * Причина аннулирования сведений о задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования записи о задолженности за коммунальные услуги" (реестровый номер 365)
             * 
             */
            @XmlElement(name = "AnnulmentNSIReason", required = true)
            protected NsiRef annulmentNSIReason;
            /**
             * Текстовая причина аннулирования сведений о задолженности за ЖКУ. Заполняется, если Причина аннулирования = 5. Иная
             * 
             */
            @XmlElement(name = "AnnulmentTextReason")
            protected String annulmentTextReason;

            /**
             * Причина аннулирования сведений о задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования записи о задолженности за коммунальные услуги" (реестровый номер 365)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getAnnulmentNSIReason() {
                return annulmentNSIReason;
            }

            /**
             * Sets the value of the annulmentNSIReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getAnnulmentNSIReason()
             */
            public void setAnnulmentNSIReason(NsiRef value) {
                this.annulmentNSIReason = value;
            }

            /**
             * Текстовая причина аннулирования сведений о задолженности за ЖКУ. Заполняется, если Причина аннулирования = 5. Иная
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnulmentTextReason() {
                return annulmentTextReason;
            }

            /**
             * Sets the value of the annulmentTextReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getAnnulmentTextReason()
             */
            public void setAnnulmentTextReason(String value) {
                this.annulmentTextReason = value;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="JudicalActNumber">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="255"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="JudicalActDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="JudicalActAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded"/>
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
        "judicalActNumber",
        "judicalActDate",
        "judicalActAttachment"
    })
    public static class JudicalAct {

        /**
         * Номер судебного акта
         * 
         */
        @XmlElement(name = "JudicalActNumber", required = true)
        protected String judicalActNumber;
        /**
         * Дата вступления в силу судебного акта
         * 
         */
        @XmlElement(name = "JudicalActDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar judicalActDate;
        /**
         * Файл судебного акта
         * 
         */
        @XmlElement(name = "JudicalActAttachment", required = true)
        protected List<AttachmentType> judicalActAttachment;

        /**
         * Номер судебного акта
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJudicalActNumber() {
            return judicalActNumber;
        }

        /**
         * Sets the value of the judicalActNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getJudicalActNumber()
         */
        public void setJudicalActNumber(String value) {
            this.judicalActNumber = value;
        }

        /**
         * Дата вступления в силу судебного акта
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getJudicalActDate() {
            return judicalActDate;
        }

        /**
         * Sets the value of the judicalActDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getJudicalActDate()
         */
        public void setJudicalActDate(XMLGregorianCalendar value) {
            this.judicalActDate = value;
        }

        /**
         * Файл судебного акта
         * 
         * Gets the value of the judicalActAttachment property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the judicalActAttachment property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getJudicalActAttachment().add(newItem);
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
         *     The value of the judicalActAttachment property.
         */
        public List<AttachmentType> getJudicalActAttachment() {
            if (judicalActAttachment == null) {
                judicalActAttachment = new ArrayList<>();
            }
            return this.judicalActAttachment;
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
     *         <element name="RepaymentStatus" type="{http://dom.gosuslugi.ru/schema/integration/debts/}RepaimentStatusType"/>
     *         <element name="PlacingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="PlacingUserDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         <element name="PlacingInfo" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="1000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="RepaymentAnnulmentData" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="RepaymentAnnulmentReason" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="RepaymentAnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                             <element name="RepaymentAnnulmentTextReason" minOccurs="0">
     *                               <simpleType>
     *                                 <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   <minLength value="1"/>
     *                                   <maxLength value="1000"/>
     *                                 </restriction>
     *                               </simpleType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="RepaymentAnnulmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "repaymentStatus",
        "placingDate",
        "placingUserDate",
        "placingInfo",
        "repaymentAnnulmentData"
    })
    public static class RepaymentData {

        /**
         * Статус сведений о погашении задолженности. Возможные значения: 
         * PAID – Задолженность погашена; 
         * UNPAID - Задолженность не погашена.
         * 
         */
        @XmlElement(name = "RepaymentStatus", required = true)
        @XmlSchemaType(name = "string")
        protected RepaimentStatusType repaymentStatus;
        /**
         * Дата размещения сведений о погашении задолженности
         * 
         */
        @XmlElement(name = "PlacingDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar placingDate;
        /**
         * Дата погашения задолженности, указанная пользователем
         * 
         */
        @XmlElement(name = "PlacingUserDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar placingUserDate;
        /**
         * Комментарий при погашении задолженности
         * 
         */
        @XmlElement(name = "PlacingInfo")
        protected String placingInfo;
        /**
         * Сведения об аннулировании сведений о погашении задолженности за ЖКУ
         * 
         */
        @XmlElement(name = "RepaymentAnnulmentData")
        protected ExportDebtDataType.RepaymentData.RepaymentAnnulmentData repaymentAnnulmentData;

        /**
         * Статус сведений о погашении задолженности. Возможные значения: 
         * PAID – Задолженность погашена; 
         * UNPAID - Задолженность не погашена.
         * 
         * @return
         *     possible object is
         *     {@link RepaimentStatusType }
         *     
         */
        public RepaimentStatusType getRepaymentStatus() {
            return repaymentStatus;
        }

        /**
         * Sets the value of the repaymentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link RepaimentStatusType }
         *     
         * @see #getRepaymentStatus()
         */
        public void setRepaymentStatus(RepaimentStatusType value) {
            this.repaymentStatus = value;
        }

        /**
         * Дата размещения сведений о погашении задолженности
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPlacingDate() {
            return placingDate;
        }

        /**
         * Sets the value of the placingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getPlacingDate()
         */
        public void setPlacingDate(XMLGregorianCalendar value) {
            this.placingDate = value;
        }

        /**
         * Дата погашения задолженности, указанная пользователем
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPlacingUserDate() {
            return placingUserDate;
        }

        /**
         * Sets the value of the placingUserDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getPlacingUserDate()
         */
        public void setPlacingUserDate(XMLGregorianCalendar value) {
            this.placingUserDate = value;
        }

        /**
         * Комментарий при погашении задолженности
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlacingInfo() {
            return placingInfo;
        }

        /**
         * Sets the value of the placingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPlacingInfo()
         */
        public void setPlacingInfo(String value) {
            this.placingInfo = value;
        }

        /**
         * Сведения об аннулировании сведений о погашении задолженности за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ExportDebtDataType.RepaymentData.RepaymentAnnulmentData }
         *     
         */
        public ExportDebtDataType.RepaymentData.RepaymentAnnulmentData getRepaymentAnnulmentData() {
            return repaymentAnnulmentData;
        }

        /**
         * Sets the value of the repaymentAnnulmentData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDebtDataType.RepaymentData.RepaymentAnnulmentData }
         *     
         * @see #getRepaymentAnnulmentData()
         */
        public void setRepaymentAnnulmentData(ExportDebtDataType.RepaymentData.RepaymentAnnulmentData value) {
            this.repaymentAnnulmentData = value;
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
         *         <element name="RepaymentAnnulmentReason" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="RepaymentAnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
         *                   <element name="RepaymentAnnulmentTextReason" minOccurs="0">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <minLength value="1"/>
         *                         <maxLength value="1000"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="RepaymentAnnulmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "repaymentAnnulmentReason",
            "repaymentAnnulmentDate"
        })
        public static class RepaymentAnnulmentData {

            /**
             * Причина аннулирования сведений о погашении задолженности за ЖКУ
             * 
             */
            @XmlElement(name = "RepaymentAnnulmentReason")
            protected ExportDebtDataType.RepaymentData.RepaymentAnnulmentData.RepaymentAnnulmentReason repaymentAnnulmentReason;
            /**
             * Дата аннулирования сведений о погашении задолженности за ЖКУ
             * 
             */
            @XmlElement(name = "RepaymentAnnulmentDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar repaymentAnnulmentDate;

            /**
             * Причина аннулирования сведений о погашении задолженности за ЖКУ
             * 
             * @return
             *     possible object is
             *     {@link ExportDebtDataType.RepaymentData.RepaymentAnnulmentData.RepaymentAnnulmentReason }
             *     
             */
            public ExportDebtDataType.RepaymentData.RepaymentAnnulmentData.RepaymentAnnulmentReason getRepaymentAnnulmentReason() {
                return repaymentAnnulmentReason;
            }

            /**
             * Sets the value of the repaymentAnnulmentReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExportDebtDataType.RepaymentData.RepaymentAnnulmentData.RepaymentAnnulmentReason }
             *     
             * @see #getRepaymentAnnulmentReason()
             */
            public void setRepaymentAnnulmentReason(ExportDebtDataType.RepaymentData.RepaymentAnnulmentData.RepaymentAnnulmentReason value) {
                this.repaymentAnnulmentReason = value;
            }

            /**
             * Дата аннулирования сведений о погашении задолженности за ЖКУ
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getRepaymentAnnulmentDate() {
                return repaymentAnnulmentDate;
            }

            /**
             * Sets the value of the repaymentAnnulmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             * @see #getRepaymentAnnulmentDate()
             */
            public void setRepaymentAnnulmentDate(XMLGregorianCalendar value) {
                this.repaymentAnnulmentDate = value;
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
             *         <element name="RepaymentAnnulmentNSIReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
             *         <element name="RepaymentAnnulmentTextReason" minOccurs="0">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <minLength value="1"/>
             *               <maxLength value="1000"/>
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
                "repaymentAnnulmentNSIReason",
                "repaymentAnnulmentTextReason"
            })
            public static class RepaymentAnnulmentReason {

                /**
                 * Причина аннулирования сведений о погашении задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования  информации о погашении задолженности за коммунальные услуги" (реестровый номер 366)
                 * 
                 */
                @XmlElement(name = "RepaymentAnnulmentNSIReason", required = true)
                protected NsiRef repaymentAnnulmentNSIReason;
                /**
                 * Текстовая причина аннулирования сведений о погашении задолженности за ЖКУ. Заполняется, если Причина аннулирования = 3. Иная
                 * 
                 */
                @XmlElement(name = "RepaymentAnnulmentTextReason")
                protected String repaymentAnnulmentTextReason;

                /**
                 * Причина аннулирования сведений о погашении задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования  информации о погашении задолженности за коммунальные услуги" (реестровый номер 366)
                 * 
                 * @return
                 *     possible object is
                 *     {@link NsiRef }
                 *     
                 */
                public NsiRef getRepaymentAnnulmentNSIReason() {
                    return repaymentAnnulmentNSIReason;
                }

                /**
                 * Sets the value of the repaymentAnnulmentNSIReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NsiRef }
                 *     
                 * @see #getRepaymentAnnulmentNSIReason()
                 */
                public void setRepaymentAnnulmentNSIReason(NsiRef value) {
                    this.repaymentAnnulmentNSIReason = value;
                }

                /**
                 * Текстовая причина аннулирования сведений о погашении задолженности за ЖКУ. Заполняется, если Причина аннулирования = 3. Иная
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRepaymentAnnulmentTextReason() {
                    return repaymentAnnulmentTextReason;
                }

                /**
                 * Sets the value of the repaymentAnnulmentTextReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getRepaymentAnnulmentTextReason()
                 */
                public void setRepaymentAnnulmentTextReason(String value) {
                    this.repaymentAnnulmentTextReason = value;
                }

            }

        }

    }

}
