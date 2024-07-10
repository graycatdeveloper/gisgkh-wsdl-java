
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
 *         <element name="FIASHouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="AccountGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}UnifiedAccountNumber" maxOccurs="1000"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}ServiceID" maxOccurs="1000"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
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
    "accountGUID",
    "unifiedAccountNumber",
    "serviceID"
})
@XmlRootElement(name = "exportAccountRequest")
public class ExportAccountRequest
    extends BaseType
{

    /**
     * Глобальный уникальный идентификатор дома по ФИАС
     * 
     */
    @XmlElement(name = "FIASHouseGuid")
    protected String fiasHouseGuid;
    /**
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     */
    @XmlElement(name = "AccountGUID")
    protected List<String> accountGUID;
    /**
     * Единый лицевой счет
     * 
     */
    @XmlElement(name = "UnifiedAccountNumber", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected List<String> unifiedAccountNumber;
    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     */
    @XmlElement(name = "ServiceID", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected List<String> serviceID;
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
     * Идентификатор ЛС в ГИС ЖКХ (при обновлении данных ЛС)
     * 
     * Gets the value of the accountGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountGUID().add(newItem);
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
     *     The value of the accountGUID property.
     */
    public List<String> getAccountGUID() {
        if (accountGUID == null) {
            accountGUID = new ArrayList<>();
        }
        return this.accountGUID;
    }

    /**
     * Единый лицевой счет
     * 
     * Gets the value of the unifiedAccountNumber property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unifiedAccountNumber property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnifiedAccountNumber().add(newItem);
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
     *     The value of the unifiedAccountNumber property.
     */
    public List<String> getUnifiedAccountNumber() {
        if (unifiedAccountNumber == null) {
            unifiedAccountNumber = new ArrayList<>();
        }
        return this.unifiedAccountNumber;
    }

    /**
     * Идентификатор жилищно-коммунальной услуги
     * 
     * Gets the value of the serviceID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getServiceID().add(newItem);
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
     *     The value of the serviceID property.
     */
    public List<String> getServiceID() {
        if (serviceID == null) {
            serviceID = new ArrayList<>();
        }
        return this.serviceID;
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
            return "10.0.1.1";
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
