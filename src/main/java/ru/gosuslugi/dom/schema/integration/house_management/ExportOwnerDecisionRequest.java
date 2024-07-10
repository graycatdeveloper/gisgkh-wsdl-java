
package ru.gosuslugi.dom.schema.integration.house_management;

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
 *         <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
 *         <element name="RootProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
 *         <element name="RootOwnerDecisionGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
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
    "votingProtocolGUID",
    "rootProtocolGUID",
    "rootOwnerDecisionGUID",
    "messageGUID"
})
@XmlRootElement(name = "exportOwnerDecisionRequest")
public class ExportOwnerDecisionRequest
    extends BaseType
{

    /**
     * Идентификатор версии протокола голосования
     * 
     */
    @XmlElement(name = "VotingProtocolGUID")
    protected List<String> votingProtocolGUID;
    /**
     * Корневой идентификатор протокола голосования
     * 
     */
    @XmlElement(name = "RootProtocolGUID")
    protected List<String> rootProtocolGUID;
    /**
     * Корневой идентификатор решения собственника по вопросам голосования
     * 
     */
    @XmlElement(name = "RootOwnerDecisionGUID")
    protected List<String> rootOwnerDecisionGUID;
    /**
     * Идентификатор сообщения о проведении ОСС
     * 
     */
    @XmlElement(name = "MessageGUID")
    protected List<String> messageGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор версии протокола голосования
     * 
     * Gets the value of the votingProtocolGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the votingProtocolGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVotingProtocolGUID().add(newItem);
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
     *     The value of the votingProtocolGUID property.
     */
    public List<String> getVotingProtocolGUID() {
        if (votingProtocolGUID == null) {
            votingProtocolGUID = new ArrayList<>();
        }
        return this.votingProtocolGUID;
    }

    /**
     * Корневой идентификатор протокола голосования
     * 
     * Gets the value of the rootProtocolGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootProtocolGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRootProtocolGUID().add(newItem);
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
     *     The value of the rootProtocolGUID property.
     */
    public List<String> getRootProtocolGUID() {
        if (rootProtocolGUID == null) {
            rootProtocolGUID = new ArrayList<>();
        }
        return this.rootProtocolGUID;
    }

    /**
     * Корневой идентификатор решения собственника по вопросам голосования
     * 
     * Gets the value of the rootOwnerDecisionGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootOwnerDecisionGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRootOwnerDecisionGUID().add(newItem);
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
     *     The value of the rootOwnerDecisionGUID property.
     */
    public List<String> getRootOwnerDecisionGUID() {
        if (rootOwnerDecisionGUID == null) {
            rootOwnerDecisionGUID = new ArrayList<>();
        }
        return this.rootOwnerDecisionGUID;
    }

    /**
     * Идентификатор сообщения о проведении ОСС
     * 
     * Gets the value of the messageGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMessageGUID().add(newItem);
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
     *     The value of the messageGUID property.
     */
    public List<String> getMessageGUID() {
        if (messageGUID == null) {
            messageGUID = new ArrayList<>();
        }
        return this.messageGUID;
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

}
