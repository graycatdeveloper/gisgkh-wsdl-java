
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgRootAndVersionType;


/**
 * Сведения об АОСС
 * 
 * <p>Java class for AdminOfGeneralMeetingType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AdminOfGeneralMeetingType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CitizenAdministator">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingInitiatorIndType"/>
 *                   <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *                   <element name="PlaceAddress">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="2000"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Phone" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="60"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="Email" maxOccurs="unbounded">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <minLength value="1"/>
 *                         <maxLength value="60"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="LegalEntityAdministrator" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgRootAndVersionType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdminOfGeneralMeetingType", propOrder = {
    "citizenAdministator",
    "legalEntityAdministrator"
})
public class AdminOfGeneralMeetingType {

    /**
     * Физическое лицо (собственник помещений)
     * 
     */
    @XmlElement(name = "CitizenAdministator")
    protected AdminOfGeneralMeetingType.CitizenAdministator citizenAdministator;
    /**
     * Организация инициатор собрания ИП или Юр. лицо (УО)
     * 
     */
    @XmlElement(name = "LegalEntityAdministrator")
    protected RegOrgRootAndVersionType legalEntityAdministrator;

    /**
     * Физическое лицо (собственник помещений)
     * 
     * @return
     *     possible object is
     *     {@link AdminOfGeneralMeetingType.CitizenAdministator }
     *     
     */
    public AdminOfGeneralMeetingType.CitizenAdministator getCitizenAdministator() {
        return citizenAdministator;
    }

    /**
     * Sets the value of the citizenAdministator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminOfGeneralMeetingType.CitizenAdministator }
     *     
     * @see #getCitizenAdministator()
     */
    public void setCitizenAdministator(AdminOfGeneralMeetingType.CitizenAdministator value) {
        this.citizenAdministator = value;
    }

    /**
     * Организация инициатор собрания ИП или Юр. лицо (УО)
     * 
     * @return
     *     possible object is
     *     {@link RegOrgRootAndVersionType }
     *     
     */
    public RegOrgRootAndVersionType getLegalEntityAdministrator() {
        return legalEntityAdministrator;
    }

    /**
     * Sets the value of the legalEntityAdministrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgRootAndVersionType }
     *     
     * @see #getLegalEntityAdministrator()
     */
    public void setLegalEntityAdministrator(RegOrgRootAndVersionType value) {
        this.legalEntityAdministrator = value;
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
     *         <element name="Ind" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingInitiatorIndType"/>
     *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
     *         <element name="PlaceAddress">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="2000"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Phone" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="60"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="Email" maxOccurs="unbounded">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <minLength value="1"/>
     *               <maxLength value="60"/>
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
        "ind",
        "fiasHouseGuid",
        "placeAddress",
        "phone",
        "email"
    })
    public static class CitizenAdministator {

        /**
         * Физическое лицо (собственник помещений)
         * 
         */
        @XmlElement(name = "Ind", required = true)
        protected VotingInitiatorIndType ind;
        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         * Место постояного проживания по ФИАС
         * 
         */
        @XmlElement(name = "FIASHouseGuid", required = true)
        protected String fiasHouseGuid;
        /**
         * Место постоянного проживания
         * 
         */
        @XmlElement(name = "PlaceAddress", required = true)
        protected String placeAddress;
        /**
         * Номер контактного телефона
         * 
         */
        @XmlElement(name = "Phone", required = true)
        protected List<String> phone;
        /**
         * Адрес электронной почты
         * 
         */
        @XmlElement(name = "Email", required = true)
        protected List<String> email;

        /**
         * Физическое лицо (собственник помещений)
         * 
         * @return
         *     possible object is
         *     {@link VotingInitiatorIndType }
         *     
         */
        public VotingInitiatorIndType getInd() {
            return ind;
        }

        /**
         * Sets the value of the ind property.
         * 
         * @param value
         *     allowed object is
         *     {@link VotingInitiatorIndType }
         *     
         * @see #getInd()
         */
        public void setInd(VotingInitiatorIndType value) {
            this.ind = value;
        }

        /**
         * Глобальный уникальный идентификатор дома по ФИАС
         * 
         * Место постояного проживания по ФИАС
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFIASHouseGuid() {
            return fiasHouseGuid;
        }

        /**
         * Sets the value of the fiasHouseGuid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFIASHouseGuid()
         */
        public void setFIASHouseGuid(String value) {
            this.fiasHouseGuid = value;
        }

        /**
         * Место постоянного проживания
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceAddress() {
            return placeAddress;
        }

        /**
         * Sets the value of the placeAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getPlaceAddress()
         */
        public void setPlaceAddress(String value) {
            this.placeAddress = value;
        }

        /**
         * Номер контактного телефона
         * 
         * Gets the value of the phone property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phone property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPhone().add(newItem);
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
         *     The value of the phone property.
         */
        public List<String> getPhone() {
            if (phone == null) {
                phone = new ArrayList<>();
            }
            return this.phone;
        }

        /**
         * Адрес электронной почты
         * 
         * Gets the value of the email property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEmail().add(newItem);
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
         *     The value of the email property.
         */
        public List<String> getEmail() {
            if (email == null) {
                email = new ArrayList<>();
            }
            return this.email;
        }

    }

}
