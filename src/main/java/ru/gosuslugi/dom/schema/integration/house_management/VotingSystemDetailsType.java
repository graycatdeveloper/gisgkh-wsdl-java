
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация о системе, в которой проводится собрание
 * 
 * <p>Java class for VotingSystemDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="VotingSystemDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VotingSystem" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}VotingSystemType"/>
 *         <choice minOccurs="0">
 *           <element name="VotingSystemName">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="2000"/>
 *                 <minLength value="1"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="VotingSystemGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </choice>
 *         <element name="VotingSystemUrl" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="2000"/>
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
@XmlType(name = "VotingSystemDetailsType", propOrder = {
    "votingSystem",
    "votingSystemName",
    "votingSystemGuid",
    "votingSystemUrl"
})
public class VotingSystemDetailsType {

    /**
     * Система, в которой проводится голосование
     * 
     */
    @XmlElement(name = "VotingSystem", required = true)
    @XmlSchemaType(name = "string")
    protected VotingSystemType votingSystem;
    /**
     * Наименование системы
     * 
     */
    @XmlElement(name = "VotingSystemName")
    protected String votingSystemName;
    /**
     * Идентификатор системы. Может быть заполнен только если в VotingSystem выбрано "Региональная информационная система"
     * 
     */
    @XmlElement(name = "VotingSystemGuid")
    protected String votingSystemGuid;
    /**
     * Адрес в сети Интернет. Обязательно если в VotingSystem выбрано "Региональная информационная система" или "Иная система"
     * 
     */
    @XmlElement(name = "VotingSystemUrl")
    protected String votingSystemUrl;

    /**
     * Система, в которой проводится голосование
     * 
     * @return
     *     possible object is
     *     {@link VotingSystemType }
     *     
     */
    public VotingSystemType getVotingSystem() {
        return votingSystem;
    }

    /**
     * Sets the value of the votingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link VotingSystemType }
     *     
     * @see #getVotingSystem()
     */
    public void setVotingSystem(VotingSystemType value) {
        this.votingSystem = value;
    }

    /**
     * Наименование системы
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingSystemName() {
        return votingSystemName;
    }

    /**
     * Sets the value of the votingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingSystemName()
     */
    public void setVotingSystemName(String value) {
        this.votingSystemName = value;
    }

    /**
     * Идентификатор системы. Может быть заполнен только если в VotingSystem выбрано "Региональная информационная система"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingSystemGuid() {
        return votingSystemGuid;
    }

    /**
     * Sets the value of the votingSystemGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingSystemGuid()
     */
    public void setVotingSystemGuid(String value) {
        this.votingSystemGuid = value;
    }

    /**
     * Адрес в сети Интернет. Обязательно если в VotingSystem выбрано "Региональная информационная система" или "Иная система"
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotingSystemUrl() {
        return votingSystemUrl;
    }

    /**
     * Sets the value of the votingSystemUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVotingSystemUrl()
     */
    public void setVotingSystemUrl(String value) {
        this.votingSystemUrl = value;
    }

}
