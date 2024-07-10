
package ru.gosuslugi.dom.schema.integration.licenses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       <choice>
 *         <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *         <element name="ErulNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulNumberType" maxOccurs="unbounded"/>
 *         <element name="LicenseNumber" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}HCSNumberType" maxOccurs="unbounded"/>
 *         <element name="LicenseOrganization" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <choice>
 *                     <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
 *                     <element name="OGRNIP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIPType"/>
 *                   </choice>
 *                   <element name="Region" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <length value="2"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "licenseGUID",
    "erulNumber",
    "licenseNumber",
    "licenseOrganization"
})
@XmlRootElement(name = "exportActualLicenseStateRequest")
public class ExportActualLicenseStateRequest
    extends BaseType
{

    /**
     * Корневой идентификатор лицензии
     * 
     */
    @XmlElement(name = "LicenseGUID")
    protected List<String> licenseGUID;
    /**
     * Номер лицензии по ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulNumber")
    protected List<String> erulNumber;
    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     */
    @XmlElement(name = "LicenseNumber")
    protected List<String> licenseNumber;
    /**
     * Лицензиат
     * 
     */
    @XmlElement(name = "LicenseOrganization")
    protected List<ExportActualLicenseStateRequest.LicenseOrganization> licenseOrganization;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Корневой идентификатор лицензии
     * 
     * Gets the value of the licenseGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicenseGUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the licenseGUID property.
     */
    public List<String> getLicenseGUID() {
        if (licenseGUID == null) {
            licenseGUID = new ArrayList<>();
        }
        return this.licenseGUID;
    }

    /**
     * Номер лицензии по ЕРУЛ
     * 
     * Gets the value of the erulNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erulNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getErulNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the erulNumber property.
     */
    public List<String> getErulNumber() {
        if (erulNumber == null) {
            erulNumber = new ArrayList<>();
        }
        return this.erulNumber;
    }

    /**
     * Номер лицензии по ГИС ЖКХ
     * 
     * Gets the value of the licenseNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicenseNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the licenseNumber property.
     */
    public List<String> getLicenseNumber() {
        if (licenseNumber == null) {
            licenseNumber = new ArrayList<>();
        }
        return this.licenseNumber;
    }

    /**
     * Лицензиат
     * 
     * Gets the value of the licenseOrganization property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licenseOrganization property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLicenseOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportActualLicenseStateRequest.LicenseOrganization }
     * </p>
     * 
     * 
     * @return
     *     The value of the licenseOrganization property.
     */
    public List<ExportActualLicenseStateRequest.LicenseOrganization> getLicenseOrganization() {
        if (licenseOrganization == null) {
            licenseOrganization = new ArrayList<>();
        }
        return this.licenseOrganization;
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
        return version;
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
     *           <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
     *           <element name="OGRNIP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIPType"/>
     *         </choice>
     *         <element name="Region" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <length value="2"/>
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
        "ogrn",
        "ogrnip",
        "region"
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
         * Код региона (ФИАС)
         * 
         */
        @XmlElement(name = "Region")
        protected String region;

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
         * Код региона (ФИАС)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRegion()
         */
        public void setRegion(String value) {
            this.region = value;
        }

    }

}
