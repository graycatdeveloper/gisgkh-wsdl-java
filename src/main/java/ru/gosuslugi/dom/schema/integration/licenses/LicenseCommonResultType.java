
package ru.gosuslugi.dom.schema.integration.licenses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.CommonResultType;


/**
 * Расширенный тип ответа на результат импорта
 * 
 * <p>Java class for LicenseCommonResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LicenseCommonResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType">
 *       <sequence minOccurs="0">
 *         <element name="OtherNewEntry" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="NewEntryGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
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
@XmlType(name = "LicenseCommonResultType", propOrder = {
    "otherNewEntry"
})
public class LicenseCommonResultType
    extends CommonResultType
{

    /**
     * Реестровая запись, созданная вместе с импортируемой
     * 
     */
    @XmlElement(name = "OtherNewEntry")
    protected List<LicenseCommonResultType.OtherNewEntry> otherNewEntry;

    /**
     * Реестровая запись, созданная вместе с импортируемой
     * 
     * Gets the value of the otherNewEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherNewEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherNewEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseCommonResultType.OtherNewEntry }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherNewEntry property.
     */
    public List<LicenseCommonResultType.OtherNewEntry> getOtherNewEntry() {
        if (otherNewEntry == null) {
            otherNewEntry = new ArrayList<>();
        }
        return this.otherNewEntry;
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
     *         <element name="LicenseGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="NewEntryGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
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
        "licenseGUID",
        "newEntryGUID"
    })
    public static class OtherNewEntry {

        /**
         * Корневой идентификатор лицензии
         * 
         */
        @XmlElement(name = "LicenseGUID", required = true)
        protected String licenseGUID;
        /**
         * Идентификатор созданной реестровой записи
         * 
         */
        @XmlElement(name = "NewEntryGUID", required = true)
        protected String newEntryGUID;

        /**
         * Корневой идентификатор лицензии
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseGUID() {
            return licenseGUID;
        }

        /**
         * Sets the value of the licenseGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getLicenseGUID()
         */
        public void setLicenseGUID(String value) {
            this.licenseGUID = value;
        }

        /**
         * Идентификатор созданной реестровой записи
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewEntryGUID() {
            return newEntryGUID;
        }

        /**
         * Sets the value of the newEntryGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getNewEntryGUID()
         */
        public void setNewEntryGUID(String value) {
            this.newEntryGUID = value;
        }

    }

}
