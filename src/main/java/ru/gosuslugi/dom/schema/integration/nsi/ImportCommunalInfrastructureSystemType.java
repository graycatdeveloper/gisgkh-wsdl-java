
package ru.gosuslugi.dom.schema.integration.nsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Элемент справочника "Система коммунальной инфраструктуры"
 * 
 * <p>Java class for importCommunalInfrastructureSystemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="importCommunalInfrastructureSystemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <sequence>
 *           <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *           <element name="ElementGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         </sequence>
 *         <element name="SystemName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String500Type"/>
 *         <element name="CommunalSystemInfrastructureType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importCommunalInfrastructureSystemType", propOrder = {
    "transportGUID",
    "elementGuid",
    "systemName",
    "communalSystemInfrastructureType"
})
public class ImportCommunalInfrastructureSystemType {

    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;
    /**
     * Идентификатор существующего элемента справочника.
     * 
     */
    @XmlElement(name = "ElementGuid")
    protected String elementGuid;
    /**
     * Наименование системы
     * 
     */
    @XmlElement(name = "SystemName", required = true)
    protected String systemName;
    /**
     * Ссылка на НСИ 42
     * Вид системы коммунальной инфраструктуры
     * 
     */
    @XmlElement(name = "CommunalSystemInfrastructureType", required = true)
    protected NsiRef communalSystemInfrastructureType;

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
     * Идентификатор существующего элемента справочника.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementGuid() {
        return elementGuid;
    }

    /**
     * Sets the value of the elementGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getElementGuid()
     */
    public void setElementGuid(String value) {
        this.elementGuid = value;
    }

    /**
     * Наименование системы
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * Sets the value of the systemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSystemName()
     */
    public void setSystemName(String value) {
        this.systemName = value;
    }

    /**
     * Ссылка на НСИ 42
     * Вид системы коммунальной инфраструктуры
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getCommunalSystemInfrastructureType() {
        return communalSystemInfrastructureType;
    }

    /**
     * Sets the value of the communalSystemInfrastructureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getCommunalSystemInfrastructureType()
     */
    public void setCommunalSystemInfrastructureType(NsiRef value) {
        this.communalSystemInfrastructureType = value;
    }

}
