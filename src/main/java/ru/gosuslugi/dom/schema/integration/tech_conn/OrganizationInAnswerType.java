
package ru.gosuslugi.dom.schema.integration.tech_conn;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Организация в ответе по заявлению на определенеи организации для технологического присоединения
 * 
 * <p>Java class for OrganizationInAnswerType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganizationInAnswerType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrganizationInfo">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
 *                   <sequence>
 *                     <element name="ShortName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
 *                     <element name="FactualAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
 *                   </sequence>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="ConnectedResources" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}EsnsiItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationInAnswerType", propOrder = {
    "organizationInfo",
    "connectedResources"
})
public class OrganizationInAnswerType {

    /**
     * Сведения об организации
     * 
     */
    @XmlElement(name = "OrganizationInfo", required = true)
    protected OrganizationInAnswerType.OrganizationInfo organizationInfo;
    /**
     * Ресурсы, доступные к подключению. Справочник "Вид ресурсов или услуг, доступный для подключения" ЕСНСИ
     * 
     */
    @XmlElement(name = "ConnectedResources")
    protected List<EsnsiItemType> connectedResources;

    /**
     * Сведения об организации
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInAnswerType.OrganizationInfo }
     *     
     */
    public OrganizationInAnswerType.OrganizationInfo getOrganizationInfo() {
        return organizationInfo;
    }

    /**
     * Sets the value of the organizationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInAnswerType.OrganizationInfo }
     *     
     * @see #getOrganizationInfo()
     */
    public void setOrganizationInfo(OrganizationInAnswerType.OrganizationInfo value) {
        this.organizationInfo = value;
    }

    /**
     * Ресурсы, доступные к подключению. Справочник "Вид ресурсов или услуг, доступный для подключения" ЕСНСИ
     * 
     * Gets the value of the connectedResources property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectedResources property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getConnectedResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EsnsiItemType }
     * </p>
     * 
     * 
     * @return
     *     The value of the connectedResources property.
     */
    public List<EsnsiItemType> getConnectedResources() {
        if (connectedResources == null) {
            connectedResources = new ArrayList<>();
        }
        return this.connectedResources;
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
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}orgRootEntityGUID"/>
     *         <sequence>
     *           <element name="ShortName" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
     *           <element name="FactualAddress" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String200Type"/>
     *         </sequence>
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
        "orgRootEntityGUID",
        "shortName",
        "factualAddress"
    })
    public static class OrganizationInfo {

        /**
         * Идентификатор корневой сущности организации в реестре организаций
         * 
         */
        @XmlElement(namespace = "http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/")
        protected String orgRootEntityGUID;
        /**
         * Краткое наименование
         * 
         */
        @XmlElement(name = "ShortName")
        protected String shortName;
        /**
         * Адрес места нахождения
         * 
         */
        @XmlElement(name = "FactualAddress")
        protected String factualAddress;

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
         * Краткое наименование
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getShortName()
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * Адрес места нахождения
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFactualAddress() {
            return factualAddress;
        }

        /**
         * Sets the value of the factualAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getFactualAddress()
         */
        public void setFactualAddress(String value) {
            this.factualAddress = value;
        }

    }

}
