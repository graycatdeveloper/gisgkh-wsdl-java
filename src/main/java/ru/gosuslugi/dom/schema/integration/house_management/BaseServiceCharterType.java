
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * <p>Java class for BaseServiceCharterType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseServiceCharterType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CurrentCharter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ProtocolMeetingOwners" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceCharterType", propOrder = {
    "currentCharter",
    "protocolMeetingOwners"
})
public class BaseServiceCharterType {

    /**
     * Текущий устав
     * 
     */
    @XmlElement(name = "CurrentCharter")
    protected Boolean currentCharter;
    /**
     * Ссылка на протокол собрания собственников
     * 
     */
    @XmlElement(name = "ProtocolMeetingOwners")
    protected AttachmentType protocolMeetingOwners;

    /**
     * Текущий устав
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrentCharter() {
        return currentCharter;
    }

    /**
     * Sets the value of the currentCharter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isCurrentCharter()
     */
    public void setCurrentCharter(Boolean value) {
        this.currentCharter = value;
    }

    /**
     * Ссылка на протокол собрания собственников
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getProtocolMeetingOwners() {
        return protocolMeetingOwners;
    }

    /**
     * Sets the value of the protocolMeetingOwners property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     * @see #getProtocolMeetingOwners()
     */
    public void setProtocolMeetingOwners(AttachmentType value) {
        this.protocolMeetingOwners = value;
    }

}
