
package ru.gosuslugi.dom.schema.integration.licenses;

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
import ru.gosuslugi.dom.schema.integration.individual_registry_base.FIOType;


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
 *         <element name="DisqualifiedPerson" maxOccurs="10">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
 *                   <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   <element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType" minOccurs="0"/>
 *                   <element name="LicenseOrganization" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <choice>
 *                             <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
 *                             <element name="OGRNIP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIPType"/>
 *                           </choice>
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
    "disqualifiedPerson"
})
@XmlRootElement(name = "exportDisqualifiedPersonRequest")
public class ExportDisqualifiedPersonRequest
    extends BaseType
{

    /**
     * Информация о дисквалифицированном лице
     * 
     */
    @XmlElement(name = "DisqualifiedPerson", required = true)
    protected List<ExportDisqualifiedPersonRequest.DisqualifiedPerson> disqualifiedPerson;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Информация о дисквалифицированном лице
     * 
     * Gets the value of the disqualifiedPerson property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disqualifiedPerson property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDisqualifiedPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDisqualifiedPersonRequest.DisqualifiedPerson }
     * </p>
     * 
     * 
     * @return
     *     The value of the disqualifiedPerson property.
     */
    public List<ExportDisqualifiedPersonRequest.DisqualifiedPerson> getDisqualifiedPerson() {
        if (disqualifiedPerson == null) {
            disqualifiedPerson = new ArrayList<>();
        }
        return this.disqualifiedPerson;
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
     *         <element name="FIO" type="{http://dom.gosuslugi.ru/schema/integration/individual-registry-base/}FIOType"/>
     *         <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         <element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType" minOccurs="0"/>
     *         <element name="LicenseOrganization" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <choice>
     *                   <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
     *                   <element name="OGRNIP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIPType"/>
     *                 </choice>
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
        "fio",
        "dateOfBirth",
        "birthPlace",
        "licenseNumber",
        "licenseOrganization"
    })
    public static class DisqualifiedPerson {

        /**
         * ФИО
         * 
         */
        @XmlElement(name = "FIO", required = true)
        protected FIOType fio;
        /**
         * Дата рождения
         * 
         */
        @XmlElement(name = "DateOfBirth", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfBirth;
        /**
         * Место рождения
         * 
         */
        @XmlElement(name = "BirthPlace")
        protected String birthPlace;
        /**
         * Номер лицензии
         * 
         */
        @XmlElement(name = "LicenseNumber")
        protected String licenseNumber;
        /**
         * Лицензиат
         * 
         */
        @XmlElement(name = "LicenseOrganization")
        protected ExportDisqualifiedPersonRequest.DisqualifiedPerson.LicenseOrganization licenseOrganization;

        /**
         * ФИО
         * 
         * @return
         *     possible object is
         *     {@link FIOType }
         *     
         */
        public FIOType getFIO() {
            return fio;
        }

        /**
         * Sets the value of the fio property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIOType }
         *     
         * @see #getFIO()
         */
        public void setFIO(FIOType value) {
            this.fio = value;
        }

        /**
         * Дата рождения
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Sets the value of the dateOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         * @see #getDateOfBirth()
         */
        public void setDateOfBirth(XMLGregorianCalendar value) {
            this.dateOfBirth = value;
        }

        /**
         * Место рождения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthPlace() {
            return birthPlace;
        }

        /**
         * Sets the value of the birthPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getBirthPlace()
         */
        public void setBirthPlace(String value) {
            this.birthPlace = value;
        }

        /**
         * Номер лицензии
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseNumber() {
            return licenseNumber;
        }

        /**
         * Sets the value of the licenseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLicenseNumber()
         */
        public void setLicenseNumber(String value) {
            this.licenseNumber = value;
        }

        /**
         * Лицензиат
         * 
         * @return
         *     possible object is
         *     {@link ExportDisqualifiedPersonRequest.DisqualifiedPerson.LicenseOrganization }
         *     
         */
        public ExportDisqualifiedPersonRequest.DisqualifiedPerson.LicenseOrganization getLicenseOrganization() {
            return licenseOrganization;
        }

        /**
         * Sets the value of the licenseOrganization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ExportDisqualifiedPersonRequest.DisqualifiedPerson.LicenseOrganization }
         *     
         * @see #getLicenseOrganization()
         */
        public void setLicenseOrganization(ExportDisqualifiedPersonRequest.DisqualifiedPerson.LicenseOrganization value) {
            this.licenseOrganization = value;
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
         *       <choice>
         *         <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
         *         <element name="OGRNIP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIPType"/>
         *       </choice>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ogrn",
            "ogrnip"
        })
        public static class LicenseOrganization {

            /**
             * ОГРН
             * 
             */
            @XmlElement(name = "OGRN")
            protected String ogrn;
            /**
             * ОГРНИП
             * 
             */
            @XmlElement(name = "OGRNIP")
            protected String ogrnip;

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
