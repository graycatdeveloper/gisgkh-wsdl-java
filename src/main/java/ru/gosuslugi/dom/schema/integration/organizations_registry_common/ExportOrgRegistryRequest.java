
package ru.gosuslugi.dom.schema.integration.organizations_registry_common;

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
 *         <element name="SearchCriteria" maxOccurs="100">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <choice>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
 *                       <sequence>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
 *                         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP" minOccurs="0"/>
 *                       </sequence>
 *                       <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}NZA"/>
 *                     </choice>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
 *                     <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
 *                     <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   </choice>
 *                   <element name="isRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="lastEditingDateFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.2.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchCriteria",
    "lastEditingDateFrom"
})
@XmlRootElement(name = "exportOrgRegistryRequest")
public class ExportOrgRegistryRequest
    extends BaseType
{

    /**
     * Критерий поиска организаций.
     * 
     */
    @XmlElement(name = "SearchCriteria", required = true)
    protected List<ExportOrgRegistryRequest.SearchCriteria> searchCriteria;
    /**
     * Время последнего изменения (от)
     * 
     */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastEditingDateFrom;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Критерий поиска организаций.
     * 
     * Gets the value of the searchCriteria property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchCriteria property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSearchCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportOrgRegistryRequest.SearchCriteria }
     * </p>
     * 
     * 
     * @return
     *     The value of the searchCriteria property.
     */
    public List<ExportOrgRegistryRequest.SearchCriteria> getSearchCriteria() {
        if (searchCriteria == null) {
            searchCriteria = new ArrayList<>();
        }
        return this.searchCriteria;
    }

    /**
     * Время последнего изменения (от)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastEditingDateFrom() {
        return lastEditingDateFrom;
    }

    /**
     * Sets the value of the lastEditingDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getLastEditingDateFrom()
     */
    public void setLastEditingDateFrom(XMLGregorianCalendar value) {
        this.lastEditingDateFrom = value;
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
            return "10.0.2.1";
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
     *         <choice>
     *           <choice>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIP"/>
     *             <sequence>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRN"/>
     *               <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPP" minOccurs="0"/>
     *             </sequence>
     *             <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}NZA"/>
     *           </choice>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgVersionGUID"/>
     *           <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
     *           <element name="orgPPAGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         </choice>
     *         <element name="isRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "ogrnip",
        "ogrn",
        "kpp",
        "nza",
        "orgVersionGUID",
        "orgRootEntityGUID",
        "orgPPAGUID",
        "isRegistered"
    })
    public static class SearchCriteria {

        /**
         * ОГРНИП
         * 
         */
        @XmlElement(name = "OGRNIP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
        protected String ogrnip;
        /**
         * ОГРН
         * 
         */
        @XmlElement(name = "OGRN", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
        protected String ogrn;
        /**
         * КПП
         * 
         */
        @XmlElement(name = "KPP", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
        protected String kpp;
        /**
         * НЗА (Номер записи об аккредитации)
         * 
         */
        @XmlElement(name = "NZA", namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-base/")
        protected String nza;
        /**
         * Идентификатор версии записи в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/")
        protected String orgVersionGUID;
        /**
         * Идентификатор корневой сущности организации в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/")
        protected String orgRootEntityGUID;
        /**
         * Идентификатор зарегистрированной организации
         * 
         */
        protected String orgPPAGUID;
        /**
         * Поиск среди организаций, имеющих личных кабинет
         * 
         */
        protected Boolean isRegistered;

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
         * НЗА (Номер записи об аккредитации)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNZA() {
            return nza;
        }

        /**
         * Sets the value of the nza property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNZA()
         */
        public void setNZA(String value) {
            this.nza = value;
        }

        /**
         * Идентификатор версии записи в реестре организаций
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgVersionGUID() {
            return orgVersionGUID;
        }

        /**
         * Sets the value of the orgVersionGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrgVersionGUID()
         */
        public void setOrgVersionGUID(String value) {
            this.orgVersionGUID = value;
        }

        /**
         * Идентификатор корневой сущности организации в реестре организаций
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgRootEntityGUID() {
            return orgRootEntityGUID;
        }

        /**
         * Sets the value of the orgRootEntityGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrgRootEntityGUID()
         */
        public void setOrgRootEntityGUID(String value) {
            this.orgRootEntityGUID = value;
        }

        /**
         * Идентификатор зарегистрированной организации
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrgPPAGUID() {
            return orgPPAGUID;
        }

        /**
         * Sets the value of the orgPPAGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getOrgPPAGUID()
         */
        public void setOrgPPAGUID(String value) {
            this.orgPPAGUID = value;
        }

        /**
         * Поиск среди организаций, имеющих личных кабинет
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsRegistered() {
            return isRegistered;
        }

        /**
         * Sets the value of the isRegistered property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isIsRegistered()
         */
        public void setIsRegistered(Boolean value) {
            this.isRegistered = value;
        }

    }

}
