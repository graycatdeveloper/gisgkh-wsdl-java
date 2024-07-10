
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
 *         <sequence>
 *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           <element name="StatusVersionProtocol" minOccurs="0">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <enumeration value="Created"/>
 *                 <enumeration value="Posted"/>
 *                 <enumeration value="Edited"/>
 *                 <enumeration value="Annuled"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *         <element name="VotingProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
 *         <element name="RootProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="100"/>
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
    "fiasHouseGuid",
    "statusVersionProtocol",
    "votingProtocolGUID",
    "rootProtocolGUID"
})
@XmlRootElement(name = "exportVotingProtocolRequest")
public class ExportVotingProtocolRequest
    extends BaseType
{

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Статус версии протокола ОСС
     * Допустимые значения:
     * -Created-создан
     * -Posted-Размещен
     * -Edited-На изменении
     * -Annuled-Аннулирован
     * 
     */
    @XmlElement(name = "StatusVersionProtocol")
    protected String statusVersionProtocol;
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
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
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
     * Статус версии протокола ОСС
     * Допустимые значения:
     * -Created-создан
     * -Posted-Размещен
     * -Edited-На изменении
     * -Annuled-Аннулирован
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusVersionProtocol() {
        return statusVersionProtocol;
    }

    /**
     * Sets the value of the statusVersionProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatusVersionProtocol()
     */
    public void setStatusVersionProtocol(String value) {
        this.statusVersionProtocol = value;
    }

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
