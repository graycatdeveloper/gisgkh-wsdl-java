
package ru.gosuslugi.dom.schema.integration.uk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.RegionType;


/**
 * Документ закона/нормативно-правового акта федерального уровня
 * 
 * <p>Java class for DocumentFederalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentFederalType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentPortalType">
 *       <sequence>
 *         <element name="Аudience" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="HeaderDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="PeopleDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="ProviderDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="GovernmentAuthorityDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="DefaultSearchDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice>
 *           <element name="Federal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/base/}RegionType" maxOccurs="1000"/>
 *         </choice>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentFederalType", propOrder = {
    "\u0430udience",
    "federal",
    "region"
})
public class DocumentFederalType
    extends DocumentPortalType
{

    /**
     * Аудитория документа
     * 
     */
    @XmlElement(name = "\u0410udience")
    protected DocumentFederalType.Аudience аudience;
    /**
     * Дествие документа на всей территории РФ
     * 
     */
    @XmlElement(name = "Federal", defaultValue = "true")
    protected Boolean federal;
    /**
     * Действие документа на определенных субъектах РФ
     * 
     */
    @XmlElement(name = "Region")
    protected List<RegionType> region;

    /**
     * Аудитория документа
     * 
     * @return
     *     possible object is
     *     {@link DocumentFederalType.Аudience }
     *     
     */
    public DocumentFederalType.Аudience getАudience() {
        return аudience;
    }

    /**
     * Sets the value of the аudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFederalType.Аudience }
     *     
     * @see #getАudience()
     */
    public void setАudience(DocumentFederalType.Аudience value) {
        this.аudience = value;
    }

    /**
     * Дествие документа на всей территории РФ
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederal() {
        return federal;
    }

    /**
     * Sets the value of the federal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFederal()
     */
    public void setFederal(Boolean value) {
        this.federal = value;
    }

    /**
     * Действие документа на определенных субъектах РФ
     * 
     * Gets the value of the region property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the region property.
     */
    public List<RegionType> getRegion() {
        if (region == null) {
            region = new ArrayList<>();
        }
        return this.region;
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
     *         <element name="HeaderDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="PeopleDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="ProviderDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="GovernmentAuthorityDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="DefaultSearchDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "headerDocument",
        "peopleDocument",
        "providerDocument",
        "governmentAuthorityDocument",
        "defaultSearchDocument"
    })
    public static class Аudience {

        /**
         * Отображать документ на главной странице портала
         * 
         */
        @XmlElement(name = "HeaderDocument", defaultValue = "true")
        protected Boolean headerDocument;
        /**
         * Отображать документ для получателей услуг
         * 
         */
        @XmlElement(name = "PeopleDocument", defaultValue = "true")
        protected Boolean peopleDocument;
        /**
         * Отображать документ для поставщиков услуг
         * 
         */
        @XmlElement(name = "ProviderDocument", defaultValue = "true")
        protected Boolean providerDocument;
        /**
         * Отображать документ для органов власти
         * 
         */
        @XmlElement(name = "GovernmentAuthorityDocument", defaultValue = "true")
        protected Boolean governmentAuthorityDocument;
        /**
         * Отображать по умолчанию при поиске законов и нормативных актов
         * 
         */
        @XmlElement(name = "DefaultSearchDocument", defaultValue = "true")
        protected Boolean defaultSearchDocument;

        /**
         * Отображать документ на главной странице портала
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHeaderDocument() {
            return headerDocument;
        }

        /**
         * Sets the value of the headerDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isHeaderDocument()
         */
        public void setHeaderDocument(Boolean value) {
            this.headerDocument = value;
        }

        /**
         * Отображать документ для получателей услуг
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPeopleDocument() {
            return peopleDocument;
        }

        /**
         * Sets the value of the peopleDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPeopleDocument()
         */
        public void setPeopleDocument(Boolean value) {
            this.peopleDocument = value;
        }

        /**
         * Отображать документ для поставщиков услуг
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isProviderDocument() {
            return providerDocument;
        }

        /**
         * Sets the value of the providerDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isProviderDocument()
         */
        public void setProviderDocument(Boolean value) {
            this.providerDocument = value;
        }

        /**
         * Отображать документ для органов власти
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isGovernmentAuthorityDocument() {
            return governmentAuthorityDocument;
        }

        /**
         * Sets the value of the governmentAuthorityDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isGovernmentAuthorityDocument()
         */
        public void setGovernmentAuthorityDocument(Boolean value) {
            this.governmentAuthorityDocument = value;
        }

        /**
         * Отображать по умолчанию при поиске законов и нормативных актов
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefaultSearchDocument() {
            return defaultSearchDocument;
        }

        /**
         * Sets the value of the defaultSearchDocument property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isDefaultSearchDocument()
         */
        public void setDefaultSearchDocument(Boolean value) {
            this.defaultSearchDocument = value;
        }

    }

}
