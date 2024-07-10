
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
 *         <element name="importAccountSpecial" maxOccurs="1000">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="TransportGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="AccountSpecialGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <choice>
 *                     <element name="LoadChangeAccountSpecial">
 *                       <complexType>
 *                         <complexContent>
 *                           <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountType">
 *                             <sequence>
 *                               <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             </sequence>
 *                           </extension>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="CloseAccountSpecial">
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
    "importAccountSpecial"
})
@XmlRootElement(name = "importAccountSpecialRequest")
public class ImportAccountSpecialRequest
    extends BaseType
{

    /**
     * Импортируемые сведения об изменении реквизитов и закрытии специального счета
     * 
     */
    @XmlElement(required = true)
    protected List<ImportAccountSpecialRequest.ImportAccountSpecial> importAccountSpecial;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Импортируемые сведения об изменении реквизитов и закрытии специального счета
     * 
     * Gets the value of the importAccountSpecial property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importAccountSpecial property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getImportAccountSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportAccountSpecialRequest.ImportAccountSpecial }
     * </p>
     * 
     * 
     * @return
     *     The value of the importAccountSpecial property.
     */
    public List<ImportAccountSpecialRequest.ImportAccountSpecial> getImportAccountSpecial() {
        if (importAccountSpecial == null) {
            importAccountSpecial = new ArrayList<>();
        }
        return this.importAccountSpecial;
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
     *         <element name="AccountSpecialGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <choice>
     *           <element name="LoadChangeAccountSpecial">
     *             <complexType>
     *               <complexContent>
     *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}AccountType">
     *                   <sequence>
     *                     <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   </sequence>
     *                 </extension>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="CloseAccountSpecial">
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
        "accountSpecialGuid",
        "loadChangeAccountSpecial",
        "closeAccountSpecial"
    })
    public static class ImportAccountSpecial {

        /**
         * Транспортный идентификатор  для выполнения операции со специальным счетом
         * 
         */
        @XmlElement(name = "TransportGuid", required = true)
        protected String transportGuid;
        /**
         * Идентификатор  специального счета
         * 
         */
        @XmlElement(name = "AccountSpecialGuid", required = true)
        protected String accountSpecialGuid;
        /**
         * Импортировать сведения об изменении  реквизитов специального счета
         * 
         */
        @XmlElement(name = "LoadChangeAccountSpecial")
        protected ImportAccountSpecialRequest.ImportAccountSpecial.LoadChangeAccountSpecial loadChangeAccountSpecial;
        /**
         * Информация о закрытии специального счета
         * 
         */
        @XmlElement(name = "CloseAccountSpecial")
        protected ImportAccountSpecialRequest.ImportAccountSpecial.CloseAccountSpecial closeAccountSpecial;

        /**
         * Транспортный идентификатор  для выполнения операции со специальным счетом
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
         * Импортировать сведения об изменении  реквизитов специального счета
         * 
         * @return
         *     possible object is
         *     {@link ImportAccountSpecialRequest.ImportAccountSpecial.LoadChangeAccountSpecial }
         *     
         */
        public ImportAccountSpecialRequest.ImportAccountSpecial.LoadChangeAccountSpecial getLoadChangeAccountSpecial() {
            return loadChangeAccountSpecial;
        }

        /**
         * Sets the value of the loadChangeAccountSpecial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAccountSpecialRequest.ImportAccountSpecial.LoadChangeAccountSpecial }
         *     
         * @see #getLoadChangeAccountSpecial()
         */
        public void setLoadChangeAccountSpecial(ImportAccountSpecialRequest.ImportAccountSpecial.LoadChangeAccountSpecial value) {
            this.loadChangeAccountSpecial = value;
        }

        /**
         * Информация о закрытии специального счета
         * 
         * @return
         *     possible object is
         *     {@link ImportAccountSpecialRequest.ImportAccountSpecial.CloseAccountSpecial }
         *     
         */
        public ImportAccountSpecialRequest.ImportAccountSpecial.CloseAccountSpecial getCloseAccountSpecial() {
            return closeAccountSpecial;
        }

        /**
         * Sets the value of the closeAccountSpecial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportAccountSpecialRequest.ImportAccountSpecial.CloseAccountSpecial }
         *     
         * @see #getCloseAccountSpecial()
         */
        public void setCloseAccountSpecial(ImportAccountSpecialRequest.ImportAccountSpecial.CloseAccountSpecial value) {
            this.closeAccountSpecial = value;
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
        public static class CloseAccountSpecial {

            /**
             * Дата закрытия специального счета
             * 
             */
            @XmlElement(name = "CloseDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar closeDate;

            /**
             * Дата закрытия специального счета
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
         *         <element name="ChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "changeDate"
        })
        public static class LoadChangeAccountSpecial
            extends AccountType
        {

            /**
             * Применяется с (дата с которой изменились реквизиты)
             * 
             */
            @XmlElement(name = "ChangeDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar changeDate;

            /**
             * Применяется с (дата с которой изменились реквизиты)
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

        }

    }

}
