
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 *         <element name="importAccountRegOperator" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="AccountRegOperatorGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *                   <choice>
 *                     <element name="LoadAccountRegOperator">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountType">
 *                             <sequence>
 *                               <element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CloseAccountRegOperator">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CancelAccountRegOperator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   </choice>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importAccountRegOperator"
})
@XmlRootElement(name = "importAccountRegionalOperatorRequest")
public class ImportAccountRegionalOperatorRequest
    extends BaseType
{

    /**
     * Импортируемые сведения о создании/изменении реквизитов/закрытии/ аннулировании счета регионального оператора
     * 
     */
    @XmlElement(required = true)
    protected List<ImportAccountRegionalOperatorRequest.ImportAccountRegOperator> importAccountRegOperator;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемые сведения о создании/изменении реквизитов/закрытии/ аннулировании счета регионального оператора
     * 
     * Gets the value of the importAccountRegOperator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importAccountRegOperator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportAccountRegOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAccountRegionalOperatorRequest.ImportAccountRegOperator }
     * </p>
     * 
     * 
     * @return
     *     The value of the importAccountRegOperator property.
     */
    public List<ImportAccountRegionalOperatorRequest.ImportAccountRegOperator> getImportAccountRegOperator() {
        if (importAccountRegOperator == null) {
            importAccountRegOperator = new ArrayList<>();
        }
        return this.importAccountRegOperator;
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
            return "11.0.0.1";
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
     *         <element name="AccountRegOperatorGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
     *         <choice>
     *           <element name="LoadAccountRegOperator">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountType">
     *                   <sequence>
     *                     <element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CloseAccountRegOperator">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CancelAccountRegOperator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "accountRegOperatorGuid",
        "loadAccountRegOperator",
        "closeAccountRegOperator",
        "cancelAccountRegOperator"
    })
    public static class ImportAccountRegOperator {

        /**
         * Транспортный идентификатор для выполнения операции со сведениями о счете регионального оператора
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор счета регионального оператора
         * 
         */
        @XmlElement(name = "AccountRegOperatorGuid")
        protected String accountRegOperatorGuid;
        /**
         * Добавить/Изменить реквизиты счета регионального оператора
         * 
         */
        @XmlElement(name = "LoadAccountRegOperator")
        protected ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.LoadAccountRegOperator loadAccountRegOperator;
        /**
         * Информация о закрытии счета регионального оператора
         * 
         */
        @XmlElement(name = "CloseAccountRegOperator")
        protected ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.CloseAccountRegOperator closeAccountRegOperator;
        /**
         * Аннулировать счет регионального оператора
         * 
         */
        @XmlElement(name = "CancelAccountRegOperator")
        protected Boolean cancelAccountRegOperator;

        /**
         * Транспортный идентификатор для выполнения операции со сведениями о счете регионального оператора
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
         * Идентификатор счета регионального оператора
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
         * Добавить/Изменить реквизиты счета регионального оператора
         * 
         * @return
         *     possible object is
         *     {@link ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.LoadAccountRegOperator }
         *     
         */
        public ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.LoadAccountRegOperator getLoadAccountRegOperator() {
            return loadAccountRegOperator;
        }

        /**
         * Sets the value of the loadAccountRegOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.LoadAccountRegOperator }
         *     
         * @see #getLoadAccountRegOperator()
         */
        public void setLoadAccountRegOperator(ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.LoadAccountRegOperator value) {
            this.loadAccountRegOperator = value;
        }

        /**
         * Информация о закрытии счета регионального оператора
         * 
         * @return
         *     possible object is
         *     {@link ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.CloseAccountRegOperator }
         *     
         */
        public ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.CloseAccountRegOperator getCloseAccountRegOperator() {
            return closeAccountRegOperator;
        }

        /**
         * Sets the value of the closeAccountRegOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.CloseAccountRegOperator }
         *     
         * @see #getCloseAccountRegOperator()
         */
        public void setCloseAccountRegOperator(ImportAccountRegionalOperatorRequest.ImportAccountRegOperator.CloseAccountRegOperator value) {
            this.closeAccountRegOperator = value;
        }

        /**
         * Аннулировать счет регионального оператора
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelAccountRegOperator() {
            return cancelAccountRegOperator;
        }

        /**
         * Sets the value of the cancelAccountRegOperator property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isCancelAccountRegOperator()
         */
        public void setCancelAccountRegOperator(Boolean value) {
            this.cancelAccountRegOperator = value;
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
         *         <element name="CloseDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "closeDate"
        })
        public static class CloseAccountRegOperator {

            /**
             * Дата закрытия счета регионального оператора
             * 
             */
            @XmlElement(name = "CloseDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar closeDate;

            /**
             * Дата закрытия счета регионального оператора
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
         *         <element name="OpenDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "openDate"
        })
        public static class LoadAccountRegOperator
            extends AccountType
        {

            /**
             * Дата открытия/изменения реквизитов счета регионального оператора
             * 
             */
            @XmlElement(name = "OpenDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar openDate;

            /**
             * Дата открытия/изменения реквизитов счета регионального оператора
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

        }

    }

}
