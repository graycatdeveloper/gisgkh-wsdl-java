
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
 *           <element name="ProtocolGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <choice>
 *           <element name="Protocol">
 *             <complexType>
 *               <complexContent>
 *                 <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ProtocolType">
 *                   <sequence>
 *                     <element name="Placing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   </sequence>
 *                 </extension>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="Placing" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Revert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <element name="Annulment" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}AnnulmentProtocolType"/>
 *         </choice>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.11.0.6""/>
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
    "protocolGUID",
    "protocol",
    "placing",
    "revert",
    "delete",
    "annulment"
})
@XmlRootElement(name = "importVotingProtocolRequest")
public class ImportVotingProtocolRequest
    extends BaseType
{

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Идентификатор версии протокола ОСС в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ProtocolGUID")
    protected String protocolGUID;
    /**
     * Протокол ОСС
     * 
     */
    @XmlElement(name = "Protocol")
    protected ImportVotingProtocolRequest.Protocol protocol;
    /**
     * Разместить протокол ОСС
     * 
     */
    @XmlElement(name = "Placing")
    protected Boolean placing;
    /**
     * Отменить последние изменения
     * 
     */
    @XmlElement(name = "Revert")
    protected Boolean revert;
    /**
     * Удалить протокол ОСС
     * 
     */
    @XmlElement(name = "Delete")
    protected Boolean delete;
    /**
     * Аннулировать голосование и всю связанную информацию
     * 
     */
    @XmlElement(name = "Annulment")
    protected AnnulmentProtocolType annulment;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
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
     * Идентификатор версии протокола ОСС в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolGUID() {
        return protocolGUID;
    }

    /**
     * Sets the value of the protocolGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getProtocolGUID()
     */
    public void setProtocolGUID(String value) {
        this.protocolGUID = value;
    }

    /**
     * Протокол ОСС
     * 
     * @return
     *     possible object is
     *     {@link ImportVotingProtocolRequest.Protocol }
     *     
     */
    public ImportVotingProtocolRequest.Protocol getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportVotingProtocolRequest.Protocol }
     *     
     * @see #getProtocol()
     */
    public void setProtocol(ImportVotingProtocolRequest.Protocol value) {
        this.protocol = value;
    }

    /**
     * Разместить протокол ОСС
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlacing() {
        return placing;
    }

    /**
     * Sets the value of the placing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPlacing()
     */
    public void setPlacing(Boolean value) {
        this.placing = value;
    }

    /**
     * Отменить последние изменения
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRevert() {
        return revert;
    }

    /**
     * Sets the value of the revert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isRevert()
     */
    public void setRevert(Boolean value) {
        this.revert = value;
    }

    /**
     * Удалить протокол ОСС
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isDelete()
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Аннулировать голосование и всю связанную информацию
     * 
     * @return
     *     possible object is
     *     {@link AnnulmentProtocolType }
     *     
     */
    public AnnulmentProtocolType getAnnulment() {
        return annulment;
    }

    /**
     * Sets the value of the annulment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnulmentProtocolType }
     *     
     * @see #getAnnulment()
     */
    public void setAnnulment(AnnulmentProtocolType value) {
        this.annulment = value;
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
            return "11.11.0.6";
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
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}ProtocolType">
     *       <sequence>
     *         <element name="Placing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "placing"
    })
    public static class Protocol
        extends ProtocolType
    {

        /**
         * Разместить протокол
         * 
         */
        @XmlElement(name = "Placing")
        protected Boolean placing;

        /**
         * Разместить протокол
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPlacing() {
            return placing;
        }

        /**
         * Sets the value of the placing property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         * @see #isPlacing()
         */
        public void setPlacing(Boolean value) {
            this.placing = value;
        }

    }

}
