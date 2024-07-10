
package ru.gosuslugi.dom.schema.integration.debts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


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
 *         <element name="Debt" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <choice>
 *                     <element name="PlacingDebt">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DebtObject" type="{http://dom.gosuslugi.ru/schema/integration/debts/}DebtObjectType"/>
 *                               <element name="DebtorData" type="{http://dom.gosuslugi.ru/schema/integration/debts/}DebtorType"/>
 *                               <element name="JudicalAct">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="JudicalActNumber">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               <minLength value="1"/>
 *                                               <maxLength value="255"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="JudicalActDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                         <element name="JudicalActAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
 *                               <element name="AdditionalInfo" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="EditDebt">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
 *                               <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
 *                               <element name="AdditionalInfo" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentDebt">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                               <element name="AnnulmentTextReason" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="PlacingDebtRepayment">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="PlacingInfo" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="PlacingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="AnnulmentDebtRepayment">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                               <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *                               <element name="AnnulmentTextReason" minOccurs="0">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="1000"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.3.1.0""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "debt"
})
@XmlRootElement(name = "importDebtRequest")
public class ImportDebtRequest
    extends BaseType
{

    /**
     * Сведения о задолженностях за ЖКУ
     * 
     */
    @XmlElement(name = "Debt", required = true)
    protected List<ImportDebtRequest.Debt> debt;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Сведения о задолженностях за ЖКУ
     * 
     * Gets the value of the debt property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the debt property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDebt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportDebtRequest.Debt }
     * </p>
     * 
     * 
     * @return
     *     The value of the debt property.
     */
    public List<ImportDebtRequest.Debt> getDebt() {
        if (debt == null) {
            debt = new ArrayList<>();
        }
        return this.debt;
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
            return "13.3.1.0";
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <choice>
     *           <element name="PlacingDebt">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DebtObject" type="{http://dom.gosuslugi.ru/schema/integration/debts/}DebtObjectType"/>
     *                     <element name="DebtorData" type="{http://dom.gosuslugi.ru/schema/integration/debts/}DebtorType"/>
     *                     <element name="JudicalAct">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="JudicalActNumber">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     <minLength value="1"/>
     *                                     <maxLength value="255"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="JudicalActDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                               <element name="JudicalActAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
     *                     <element name="AdditionalInfo" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="EditDebt">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
     *                     <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
     *                     <element name="AdditionalInfo" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentDebt">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                     <element name="AnnulmentTextReason" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="PlacingDebtRepayment">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="PlacingInfo" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="PlacingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="AnnulmentDebtRepayment">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *                     <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
     *                     <element name="AnnulmentTextReason" minOccurs="0">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="1000"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
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
        "transportGUID",
        "placingDebt",
        "editDebt",
        "annulmentDebt",
        "placingDebtRepayment",
        "annulmentDebtRepayment"
    })
    public static class Debt {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Размещение сведений о задолженностях за ЖКУ
         * 
         */
        @XmlElement(name = "PlacingDebt")
        protected ImportDebtRequest.Debt.PlacingDebt placingDebt;
        /**
         * Редактирование сведений о задолженностях за ЖКУ
         * 
         */
        @XmlElement(name = "EditDebt")
        protected ImportDebtRequest.Debt.EditDebt editDebt;
        /**
         * Аннулирование сведений о задолженностях за ЖКУ
         * 
         */
        @XmlElement(name = "AnnulmentDebt")
        protected ImportDebtRequest.Debt.AnnulmentDebt annulmentDebt;
        /**
         * Размещение сведений о погашении задолженности за ЖКУ
         * 
         */
        @XmlElement(name = "PlacingDebtRepayment")
        protected ImportDebtRequest.Debt.PlacingDebtRepayment placingDebtRepayment;
        /**
         * Аннулирование сведений о погашении задолженности за ЖКУ
         * 
         */
        @XmlElement(name = "AnnulmentDebtRepayment")
        protected ImportDebtRequest.Debt.AnnulmentDebtRepayment annulmentDebtRepayment;

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
         * Размещение сведений о задолженностях за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ImportDebtRequest.Debt.PlacingDebt }
         *     
         */
        public ImportDebtRequest.Debt.PlacingDebt getPlacingDebt() {
            return placingDebt;
        }

        /**
         * Sets the value of the placingDebt property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDebtRequest.Debt.PlacingDebt }
         *     
         * @see #getPlacingDebt()
         */
        public void setPlacingDebt(ImportDebtRequest.Debt.PlacingDebt value) {
            this.placingDebt = value;
        }

        /**
         * Редактирование сведений о задолженностях за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ImportDebtRequest.Debt.EditDebt }
         *     
         */
        public ImportDebtRequest.Debt.EditDebt getEditDebt() {
            return editDebt;
        }

        /**
         * Sets the value of the editDebt property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDebtRequest.Debt.EditDebt }
         *     
         * @see #getEditDebt()
         */
        public void setEditDebt(ImportDebtRequest.Debt.EditDebt value) {
            this.editDebt = value;
        }

        /**
         * Аннулирование сведений о задолженностях за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ImportDebtRequest.Debt.AnnulmentDebt }
         *     
         */
        public ImportDebtRequest.Debt.AnnulmentDebt getAnnulmentDebt() {
            return annulmentDebt;
        }

        /**
         * Sets the value of the annulmentDebt property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDebtRequest.Debt.AnnulmentDebt }
         *     
         * @see #getAnnulmentDebt()
         */
        public void setAnnulmentDebt(ImportDebtRequest.Debt.AnnulmentDebt value) {
            this.annulmentDebt = value;
        }

        /**
         * Размещение сведений о погашении задолженности за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ImportDebtRequest.Debt.PlacingDebtRepayment }
         *     
         */
        public ImportDebtRequest.Debt.PlacingDebtRepayment getPlacingDebtRepayment() {
            return placingDebtRepayment;
        }

        /**
         * Sets the value of the placingDebtRepayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDebtRequest.Debt.PlacingDebtRepayment }
         *     
         * @see #getPlacingDebtRepayment()
         */
        public void setPlacingDebtRepayment(ImportDebtRequest.Debt.PlacingDebtRepayment value) {
            this.placingDebtRepayment = value;
        }

        /**
         * Аннулирование сведений о погашении задолженности за ЖКУ
         * 
         * @return
         *     possible object is
         *     {@link ImportDebtRequest.Debt.AnnulmentDebtRepayment }
         *     
         */
        public ImportDebtRequest.Debt.AnnulmentDebtRepayment getAnnulmentDebtRepayment() {
            return annulmentDebtRepayment;
        }

        /**
         * Sets the value of the annulmentDebtRepayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportDebtRequest.Debt.AnnulmentDebtRepayment }
         *     
         * @see #getAnnulmentDebtRepayment()
         */
        public void setAnnulmentDebtRepayment(ImportDebtRequest.Debt.AnnulmentDebtRepayment value) {
            this.annulmentDebtRepayment = value;
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
         *         <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
            "debtGUID",
            "annulmentReason",
            "annulmentTextReason"
        })
        public static class AnnulmentDebt {

            /**
             * Уникальный идентификатор  сведений о задолженности за ЖКУ
             * 
             */
            @XmlElement(name = "DebtGUID", required = true)
            protected String debtGUID;
            /**
             * Причина аннулирования сведений о задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования записи о задолженности за коммунальные услуги" (реестровый номер 365)
             * 
             */
            @XmlElement(name = "AnnulmentReason", required = true)
            protected NsiRef annulmentReason;
            /**
             * Текстовая причина аннулирования сведений о задолженности за ЖКУ. Заполняется, если Причина аннулирования = 5. Иная
             * 
             */
            @XmlElement(name = "AnnulmentTextReason")
            protected String annulmentTextReason;

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
             * Причина аннулирования сведений о задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования записи о задолженности за коммунальные услуги" (реестровый номер 365)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getAnnulmentReason() {
                return annulmentReason;
            }

            /**
             * Sets the value of the annulmentReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getAnnulmentReason()
             */
            public void setAnnulmentReason(NsiRef value) {
                this.annulmentReason = value;
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
         *         <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="AnnulmentReason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
            "debtGUID",
            "annulmentReason",
            "annulmentTextReason"
        })
        public static class AnnulmentDebtRepayment {

            /**
             * Уникальный идентификатор  сведений о задолженности за ЖКУ
             * 
             */
            @XmlElement(name = "DebtGUID", required = true)
            protected String debtGUID;
            /**
             * Причина аннулирования сведений о погашении задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования  информации о погашении задолженности за коммунальные услуги" (реестровый номер 366)
             * 
             */
            @XmlElement(name = "AnnulmentReason", required = true)
            protected NsiRef annulmentReason;
            /**
             * Текстовая причина аннулирования сведений о погашении задолженности за ЖКУ. Заполняется, если Причина аннулирования = 3. Иная
             * 
             */
            @XmlElement(name = "AnnulmentTextReason")
            protected String annulmentTextReason;

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
             * Причина аннулирования сведений о погашении задолженности за ЖКУ. Ссылка на НСИ "Причины аннулирования  информации о погашении задолженности за коммунальные услуги" (реестровый номер 366)
             * 
             * @return
             *     possible object is
             *     {@link NsiRef }
             *     
             */
            public NsiRef getAnnulmentReason() {
                return annulmentReason;
            }

            /**
             * Sets the value of the annulmentReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link NsiRef }
             *     
             * @see #getAnnulmentReason()
             */
            public void setAnnulmentReason(NsiRef value) {
                this.annulmentReason = value;
            }

            /**
             * Текстовая причина аннулирования сведений о погашении задолженности за ЖКУ. Заполняется, если Причина аннулирования = 3. Иная
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
         *         <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
         *         <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
         *         <element name="AdditionalInfo" minOccurs="0">
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
            "debtGUID",
            "act",
            "additionalAttachment",
            "additionalInfo"
        })
        public static class EditDebt {

            /**
             * Уникальный идентификатор  сведений о задолженности за ЖКУ
             * 
             */
            @XmlElement(name = "DebtGUID", required = true)
            protected String debtGUID;
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
         *         <element name="DebtObject" type="{http://dom.gosuslugi.ru/schema/integration/debts/}DebtObjectType"/>
         *         <element name="DebtorData" type="{http://dom.gosuslugi.ru/schema/integration/debts/}DebtorType"/>
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
         *                   <element name="JudicalActAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Act" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
         *         <element name="AdditionalInfo" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="AdditionalAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000" minOccurs="0"/>
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
            "debtObject",
            "debtorData",
            "judicalAct",
            "act",
            "additionalInfo",
            "additionalAttachment"
        })
        public static class PlacingDebt {

            /**
             * Объект жилого фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
             * 
             */
            @XmlElement(name = "DebtObject", required = true)
            protected DebtObjectType debtObject;
            /**
             * Cведения о гражданине, у которого имеется задолженность, подтвержденная судебным актом
             * 
             */
            @XmlElement(name = "DebtorData", required = true)
            protected DebtorType debtorData;
            /**
             * Сведения о судебном акте
             * 
             */
            @XmlElement(name = "JudicalAct", required = true)
            protected ImportDebtRequest.Debt.PlacingDebt.JudicalAct judicalAct;
            /**
             * Акт сверки
             * 
             */
            @XmlElement(name = "Act")
            protected List<AttachmentType> act;
            /**
             * Дополнительная информация
             * 
             */
            @XmlElement(name = "AdditionalInfo")
            protected String additionalInfo;
            /**
             * Дополнительные файлы
             * 
             */
            @XmlElement(name = "AdditionalAttachment")
            protected List<AttachmentType> additionalAttachment;

            /**
             * Объект жилого фонда, по которому имеется непогашенная задолженность, подтвержденная судебным актом
             * 
             * @return
             *     possible object is
             *     {@link DebtObjectType }
             *     
             */
            public DebtObjectType getDebtObject() {
                return debtObject;
            }

            /**
             * Sets the value of the debtObject property.
             * 
             * @param value
             *     allowed object is
             *     {@link DebtObjectType }
             *     
             * @see #getDebtObject()
             */
            public void setDebtObject(DebtObjectType value) {
                this.debtObject = value;
            }

            /**
             * Cведения о гражданине, у которого имеется задолженность, подтвержденная судебным актом
             * 
             * @return
             *     possible object is
             *     {@link DebtorType }
             *     
             */
            public DebtorType getDebtorData() {
                return debtorData;
            }

            /**
             * Sets the value of the debtorData property.
             * 
             * @param value
             *     allowed object is
             *     {@link DebtorType }
             *     
             * @see #getDebtorData()
             */
            public void setDebtorData(DebtorType value) {
                this.debtorData = value;
            }

            /**
             * Сведения о судебном акте
             * 
             * @return
             *     possible object is
             *     {@link ImportDebtRequest.Debt.PlacingDebt.JudicalAct }
             *     
             */
            public ImportDebtRequest.Debt.PlacingDebt.JudicalAct getJudicalAct() {
                return judicalAct;
            }

            /**
             * Sets the value of the judicalAct property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportDebtRequest.Debt.PlacingDebt.JudicalAct }
             *     
             * @see #getJudicalAct()
             */
            public void setJudicalAct(ImportDebtRequest.Debt.PlacingDebt.JudicalAct value) {
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
             *         <element name="JudicalActAttachment" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
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
         *         <element name="DebtGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
         *         <element name="PlacingInfo" minOccurs="0">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="1000"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="PlacingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "debtGUID",
            "placingInfo",
            "placingDate"
        })
        public static class PlacingDebtRepayment {

            /**
             * Уникальный идентификатор  сведений о задолженности за ЖКУ
             * 
             */
            @XmlElement(name = "DebtGUID", required = true)
            protected String debtGUID;
            /**
             * Комментарий при погашении задолженности
             * 
             */
            @XmlElement(name = "PlacingInfo")
            protected String placingInfo;
            /**
             * Дата погашения задолженности
             * 
             */
            @XmlElement(name = "PlacingDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar placingDate;

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
             * Дата погашения задолженности
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

        }

    }

}
