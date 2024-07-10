
package ru.gosuslugi.dom.schema.integration.fas;

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
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


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
 *         <element name="RSO" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                   <element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <choice>
 *                     <element name="RSOActualDATA">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP" minOccurs="0"/>
 *                               <element name="Name">
 *                                 <simpleType>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     <minLength value="1"/>
 *                                     <maxLength value="255"/>
 *                                   </restriction>
 *                                 </simpleType>
 *                               </element>
 *                               <element name="IsEntpr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                               <choice minOccurs="0">
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
 *                               </choice>
 *                               <element name="Resource" maxOccurs="unbounded">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="ResourseType" type="{http://dom.gosuslugi.ru/schema/integration/fas/}ResourseType"/>
 *                                         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="RegistryOfNaturalMonopolies" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="Number">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               <minLength value="1"/>
 *                                               <maxLength value="50"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                               <element name="RegistryGuaranteeingSuppliers" minOccurs="0">
 *                                 <complexType>
 *                                   <complexContent>
 *                                     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       <sequence>
 *                                         <element name="Number">
 *                                           <simpleType>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               <minLength value="1"/>
 *                                               <maxLength value="50"/>
 *                                             </restriction>
 *                                           </simpleType>
 *                                         </element>
 *                                         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       </sequence>
 *                                     </restriction>
 *                                   </complexContent>
 *                                 </complexType>
 *                               </element>
 *                             </sequence>
 *                           </restriction>
 *                         </complexContent>
 *                       </complexType>
 *                     </element>
 *                     <element name="RemoveRSO">
 *                       <complexType>
 *                         <complexContent>
 *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             <sequence>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
 *                               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
 *                               <choice minOccurs="0">
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
 *                                 <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
 *                               </choice>
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
    "rso"
})
@XmlRootElement(name = "importRSORequest")
public class ImportRSORequest
    extends BaseType
{

    /**
     * Ресурсоснабжающая организация
     * 
     */
    @XmlElement(name = "RSO", required = true)
    protected List<ImportRSORequest.RSO> rso;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Ресурсоснабжающая организация
     * 
     * Gets the value of the rso property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rso property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRSO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportRSORequest.RSO }
     * </p>
     * 
     * 
     * @return
     *     The value of the rso property.
     */
    public List<ImportRSORequest.RSO> getRSO() {
        if (rso == null) {
            rso = new ArrayList<>();
        }
        return this.rso;
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
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *         <element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <choice>
     *           <element name="RSOActualDATA">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP" minOccurs="0"/>
     *                     <element name="Name">
     *                       <simpleType>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           <minLength value="1"/>
     *                           <maxLength value="255"/>
     *                         </restriction>
     *                       </simpleType>
     *                     </element>
     *                     <element name="IsEntpr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                     <choice minOccurs="0">
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
     *                     </choice>
     *                     <element name="Resource" maxOccurs="unbounded">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="ResourseType" type="{http://dom.gosuslugi.ru/schema/integration/fas/}ResourseType"/>
     *                               <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="RegistryOfNaturalMonopolies" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="Number">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     <minLength value="1"/>
     *                                     <maxLength value="50"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                     <element name="RegistryGuaranteeingSuppliers" minOccurs="0">
     *                       <complexType>
     *                         <complexContent>
     *                           <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             <sequence>
     *                               <element name="Number">
     *                                 <simpleType>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     <minLength value="1"/>
     *                                     <maxLength value="50"/>
     *                                   </restriction>
     *                                 </simpleType>
     *                               </element>
     *                               <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             </sequence>
     *                           </restriction>
     *                         </complexContent>
     *                       </complexType>
     *                     </element>
     *                   </sequence>
     *                 </restriction>
     *               </complexContent>
     *             </complexType>
     *           </element>
     *           <element name="RemoveRSO">
     *             <complexType>
     *               <complexContent>
     *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   <sequence>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
     *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
     *                     <choice minOccurs="0">
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
     *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
     *                     </choice>
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
        "actualDate",
        "rsoActualDATA",
        "removeRSO"
    })
    public static class RSO {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;
        /**
         * Дата актуальности сведений
         * 
         */
        @XmlElement(name = "ActualDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar actualDate;
        /**
         * Внести актуальные сведения в реестр
         * 
         */
        @XmlElement(name = "RSOActualDATA")
        protected ImportRSORequest.RSO.RSOActualDATA rsoActualDATA;
        /**
         * Аннулировать сведения в реестре
         * 
         */
        @XmlElement(name = "RemoveRSO")
        protected ImportRSORequest.RSO.RemoveRSO removeRSO;

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
         * Дата актуальности сведений
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getActualDate() {
            return actualDate;
        }

        /**
         * Sets the value of the actualDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getActualDate()
         */
        public void setActualDate(XMLGregorianCalendar value) {
            this.actualDate = value;
        }

        /**
         * Внести актуальные сведения в реестр
         * 
         * @return
         *     possible object is
         *     {@link ImportRSORequest.RSO.RSOActualDATA }
         *     
         */
        public ImportRSORequest.RSO.RSOActualDATA getRSOActualDATA() {
            return rsoActualDATA;
        }

        /**
         * Sets the value of the rsoActualDATA property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportRSORequest.RSO.RSOActualDATA }
         *     
         * @see #getRSOActualDATA()
         */
        public void setRSOActualDATA(ImportRSORequest.RSO.RSOActualDATA value) {
            this.rsoActualDATA = value;
        }

        /**
         * Аннулировать сведения в реестре
         * 
         * @return
         *     possible object is
         *     {@link ImportRSORequest.RSO.RemoveRSO }
         *     
         */
        public ImportRSORequest.RSO.RemoveRSO getRemoveRSO() {
            return removeRSO;
        }

        /**
         * Sets the value of the removeRSO property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImportRSORequest.RSO.RemoveRSO }
         *     
         * @see #getRemoveRSO()
         */
        public void setRemoveRSO(ImportRSORequest.RSO.RemoveRSO value) {
            this.removeRSO = value;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP" minOccurs="0"/>
         *         <element name="Name">
         *           <simpleType>
         *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               <minLength value="1"/>
         *               <maxLength value="255"/>
         *             </restriction>
         *           </simpleType>
         *         </element>
         *         <element name="IsEntpr" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         <choice minOccurs="0">
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
         *         </choice>
         *         <element name="Resource" maxOccurs="unbounded">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="ResourseType" type="{http://dom.gosuslugi.ru/schema/integration/fas/}ResourseType"/>
         *                   <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="RegistryOfNaturalMonopolies" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Number">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <minLength value="1"/>
         *                         <maxLength value="50"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="RegistryGuaranteeingSuppliers" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="Number">
         *                     <simpleType>
         *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         <minLength value="1"/>
         *                         <maxLength value="50"/>
         *                       </restriction>
         *                     </simpleType>
         *                   </element>
         *                   <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
            "inn",
            "kpp",
            "name",
            "isEntpr",
            "ogrn",
            "ogrnip",
            "resource",
            "registryOfNaturalMonopolies",
            "registryGuaranteeingSuppliers"
        })
        public static class RSOActualDATA {

            /**
             * ИНН
             * 
             */
            @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String inn;
            /**
             * КПП
             * 
             */
            @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
            protected String kpp;
            /**
             * Наименование для ЮЛ или фамилия, имя и отчество для ИП
             * 
             */
            @XmlElement(name = "Name", required = true)
            protected String name;
            /**
             * Признак ИП
             * 
             */
            @XmlElement(name = "IsEntpr")
            protected boolean isEntpr;
            /**
             * ОГРН
             * 
             */
            @XmlElement(name = "OGRN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
            protected String ogrn;
            /**
             * ОГРНИП
             * 
             */
            @XmlElement(name = "OGRNIP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
            protected String ogrnip;
            /**
             * Регулируемый вид деятельности по поставке ресурсов
             * 
             */
            @XmlElement(name = "Resource", required = true)
            protected List<ImportRSORequest.RSO.RSOActualDATA.Resource> resource;
            /**
             * Реестр субъектов естественных монополий
             * 
             */
            @XmlElement(name = "RegistryOfNaturalMonopolies")
            protected ImportRSORequest.RSO.RSOActualDATA.RegistryOfNaturalMonopolies registryOfNaturalMonopolies;
            /**
             * Федеральный информационный реестр гарантирующих поставщиков и зон их деятельности
             * 
             */
            @XmlElement(name = "RegistryGuaranteeingSuppliers")
            protected ImportRSORequest.RSO.RSOActualDATA.RegistryGuaranteeingSuppliers registryGuaranteeingSuppliers;

            /**
             * ИНН
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getINN()
             */
            public void setINN(String value) {
                this.inn = value;
            }

            /**
             * КПП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getKPP()
             */
            public void setKPP(String value) {
                this.kpp = value;
            }

            /**
             * Наименование для ЮЛ или фамилия, имя и отчество для ИП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getName()
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Признак ИП
             * 
             */
            public boolean isIsEntpr() {
                return isEntpr;
            }

            /**
             * Sets the value of the isEntpr property.
             * 
             */
            public void setIsEntpr(boolean value) {
                this.isEntpr = value;
            }

            /**
             * ОГРН
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOGRN() {
                return ogrn;
            }

            /**
             * Sets the value of the ogrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOGRN()
             */
            public void setOGRN(String value) {
                this.ogrn = value;
            }

            /**
             * ОГРНИП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOGRNIP() {
                return ogrnip;
            }

            /**
             * Sets the value of the ogrnip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOGRNIP()
             */
            public void setOGRNIP(String value) {
                this.ogrnip = value;
            }

            /**
             * Регулируемый вид деятельности по поставке ресурсов
             * 
             * Gets the value of the resource property.
             * 
             * <p>This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the resource property.</p>
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * </p>
             * <pre>
             * getResource().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImportRSORequest.RSO.RSOActualDATA.Resource }
             * </p>
             * 
             * 
             * @return
             *     The value of the resource property.
             */
            public List<ImportRSORequest.RSO.RSOActualDATA.Resource> getResource() {
                if (resource == null) {
                    resource = new ArrayList<>();
                }
                return this.resource;
            }

            /**
             * Реестр субъектов естественных монополий
             * 
             * @return
             *     possible object is
             *     {@link ImportRSORequest.RSO.RSOActualDATA.RegistryOfNaturalMonopolies }
             *     
             */
            public ImportRSORequest.RSO.RSOActualDATA.RegistryOfNaturalMonopolies getRegistryOfNaturalMonopolies() {
                return registryOfNaturalMonopolies;
            }

            /**
             * Sets the value of the registryOfNaturalMonopolies property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportRSORequest.RSO.RSOActualDATA.RegistryOfNaturalMonopolies }
             *     
             * @see #getRegistryOfNaturalMonopolies()
             */
            public void setRegistryOfNaturalMonopolies(ImportRSORequest.RSO.RSOActualDATA.RegistryOfNaturalMonopolies value) {
                this.registryOfNaturalMonopolies = value;
            }

            /**
             * Федеральный информационный реестр гарантирующих поставщиков и зон их деятельности
             * 
             * @return
             *     possible object is
             *     {@link ImportRSORequest.RSO.RSOActualDATA.RegistryGuaranteeingSuppliers }
             *     
             */
            public ImportRSORequest.RSO.RSOActualDATA.RegistryGuaranteeingSuppliers getRegistryGuaranteeingSuppliers() {
                return registryGuaranteeingSuppliers;
            }

            /**
             * Sets the value of the registryGuaranteeingSuppliers property.
             * 
             * @param value
             *     allowed object is
             *     {@link ImportRSORequest.RSO.RSOActualDATA.RegistryGuaranteeingSuppliers }
             *     
             * @see #getRegistryGuaranteeingSuppliers()
             */
            public void setRegistryGuaranteeingSuppliers(ImportRSORequest.RSO.RSOActualDATA.RegistryGuaranteeingSuppliers value) {
                this.registryGuaranteeingSuppliers = value;
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
             *         <element name="Number">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <minLength value="1"/>
             *               <maxLength value="50"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "number",
                "date"
            })
            public static class RegistryGuaranteeingSuppliers {

                /**
                 * Номер
                 * 
                 */
                @XmlElement(name = "Number", required = true)
                protected String number;
                /**
                 * Дата включения
                 * 
                 */
                @XmlElement(name = "Date", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar date;

                /**
                 * Номер
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNumber()
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Дата включения
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getDate()
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
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
             *         <element name="Number">
             *           <simpleType>
             *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               <minLength value="1"/>
             *               <maxLength value="50"/>
             *             </restriction>
             *           </simpleType>
             *         </element>
             *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                "number",
                "date"
            })
            public static class RegistryOfNaturalMonopolies {

                /**
                 * Номер
                 * 
                 */
                @XmlElement(name = "Number", required = true)
                protected String number;
                /**
                 * Дата включения
                 * 
                 */
                @XmlElement(name = "Date", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar date;

                /**
                 * Номер
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNumber()
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Дата включения
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 * @see #getDate()
                 */
                public void setDate(XMLGregorianCalendar value) {
                    this.date = value;
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
             *         <element name="ResourseType" type="{http://dom.gosuslugi.ru/schema/integration/fas/}ResourseType"/>
             *         <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded"/>
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
                "resourseType",
                "oktmo"
            })
            public static class Resource {

                /**
                 * Регулируемый вид деятельности по поставке ресурсов по справочнику
                 * 
                 */
                @XmlElement(name = "ResourseType", required = true)
                protected String resourseType;
                /**
                 * Муниципальное образование, на территории которого юридическое лицо или индивидуальный предприниматель осуществляет регулируемые виды деятельности по поставке ресурсов
                 * 
                 */
                @XmlElement(name = "OKTMO", required = true)
                protected List<OKTMORefType> oktmo;

                /**
                 * Регулируемый вид деятельности по поставке ресурсов по справочнику
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResourseType() {
                    return resourseType;
                }

                /**
                 * Sets the value of the resourseType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getResourseType()
                 */
                public void setResourseType(String value) {
                    this.resourseType = value;
                }

                /**
                 * Муниципальное образование, на территории которого юридическое лицо или индивидуальный предприниматель осуществляет регулируемые виды деятельности по поставке ресурсов
                 * 
                 * Gets the value of the oktmo property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the oktmo property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getOKTMO().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link OKTMORefType }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the oktmo property.
                 */
                public List<OKTMORefType> getOKTMO() {
                    if (oktmo == null) {
                        oktmo = new ArrayList<>();
                    }
                    return this.oktmo;
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
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INN"/>
         *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP"/>
         *         <choice minOccurs="0">
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
         *           <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
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
            "inn",
            "kpp",
            "ogrn",
            "ogrnip"
        })
        public static class RemoveRSO {

            /**
             * ИНН
             * 
             */
            @XmlElement(name = "INN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String inn;
            /**
             * КПП
             * 
             */
            @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/", required = true)
            protected String kpp;
            /**
             * ОГРН
             * 
             */
            @XmlElement(name = "OGRN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
            protected String ogrn;
            /**
             * ОГРНИП
             * 
             */
            @XmlElement(name = "OGRNIP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
            protected String ogrnip;

            /**
             * ИНН
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getINN() {
                return inn;
            }

            /**
             * Sets the value of the inn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getINN()
             */
            public void setINN(String value) {
                this.inn = value;
            }

            /**
             * КПП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKPP() {
                return kpp;
            }

            /**
             * Sets the value of the kpp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getKPP()
             */
            public void setKPP(String value) {
                this.kpp = value;
            }

            /**
             * ОГРН
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOGRN() {
                return ogrn;
            }

            /**
             * Sets the value of the ogrn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOGRN()
             */
            public void setOGRN(String value) {
                this.ogrn = value;
            }

            /**
             * ОГРНИП
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOGRNIP() {
                return ogrnip;
            }

            /**
             * Sets the value of the ogrnip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             * @see #getOGRNIP()
             */
            public void setOGRNIP(String value) {
                this.ogrnip = value;
            }

        }

    }

}
