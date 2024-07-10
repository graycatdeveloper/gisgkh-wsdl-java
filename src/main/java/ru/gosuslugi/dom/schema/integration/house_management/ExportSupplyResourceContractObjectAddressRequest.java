
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
 *       <choice>
 *         <sequence>
 *           <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         </sequence>
 *         <sequence>
 *           <element name="ExportObjectGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *           <choice>
 *             <element name="ContractRootGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="ContractGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *           </choice>
 *         </sequence>
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
    "exportObjectGUID",
    "contractRootGUID",
    "contractGUID"
})
@XmlRootElement(name = "exportSupplyResourceContractObjectAddressRequest")
public class ExportSupplyResourceContractObjectAddressRequest
    extends BaseType
{

    /**
     * Адрес дома
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Идентификатор объекта жилищного фонда в ГИС ЖКХ для установки экспорта следующей 1000 ОЖФ          При первичном экспорте не заполняется
     * 
     */
    @XmlElement(name = "ExportObjectGUID")
    protected String exportObjectGUID;
    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractRootGUID")
    protected String contractRootGUID;
    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "ContractGUID")
    protected String contractGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Адрес дома
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
     * Идентификатор объекта жилищного фонда в ГИС ЖКХ для установки экспорта следующей 1000 ОЖФ          При первичном экспорте не заполняется
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportObjectGUID() {
        return exportObjectGUID;
    }

    /**
     * Sets the value of the exportObjectGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getExportObjectGUID()
     */
    public void setExportObjectGUID(String value) {
        this.exportObjectGUID = value;
    }

    /**
     * Идентификатор договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractRootGUID() {
        return contractRootGUID;
    }

    /**
     * Sets the value of the contractRootGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractRootGUID()
     */
    public void setContractRootGUID(String value) {
        this.contractRootGUID = value;
    }

    /**
     * Идентификатор версии договора ресурсоснабжения в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractGUID() {
        return contractGUID;
    }

    /**
     * Sets the value of the contractGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getContractGUID()
     */
    public void setContractGUID(String value) {
        this.contractGUID = value;
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
