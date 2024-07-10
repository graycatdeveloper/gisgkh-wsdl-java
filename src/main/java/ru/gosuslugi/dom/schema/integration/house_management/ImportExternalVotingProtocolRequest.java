
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *           <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         </sequence>
 *         <element name="ExternalVotingProtocol" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}ExternalVotingProtocolType"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version fixed="13.1.8.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transportGUID",
    "messageGUID",
    "externalVotingProtocol"
})
@XmlRootElement(name = "importExternalVotingProtocolRequest")
public class ImportExternalVotingProtocolRequest
    extends BaseType
{

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Идентификатор сообщения о проведении общего собрания в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "MessageGUID", required = true)
    protected String messageGUID;
    /**
     * Разместить итоги голосования, проведенного с использованием системы, отличной от ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ExternalVotingProtocol", required = true)
    protected ExternalVotingProtocolType externalVotingProtocol;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String version;

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
     * Идентификатор сообщения о проведении общего собрания в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageGUID()
     */
    public void setMessageGUID(String value) {
        this.messageGUID = value;
    }

    /**
     * Разместить итоги голосования, проведенного с использованием системы, отличной от ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link ExternalVotingProtocolType }
     *     
     */
    public ExternalVotingProtocolType getExternalVotingProtocol() {
        return externalVotingProtocol;
    }

    /**
     * Sets the value of the externalVotingProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalVotingProtocolType }
     *     
     * @see #getExternalVotingProtocol()
     */
    public void setExternalVotingProtocol(ExternalVotingProtocolType value) {
        this.externalVotingProtocol = value;
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
            return "13.1.8.1";
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

}
