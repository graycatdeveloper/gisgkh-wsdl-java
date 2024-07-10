
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
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/account-base/}AccountGuid" maxOccurs="1000"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}AccountIndividualServiceGUID" maxOccurs="1000"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.0.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountGuid",
    "accountIndividualServiceGUID"
})
@XmlRootElement(name = "exportAccountIndividualServicesRequest")
public class ExportAccountIndividualServicesRequest
    extends BaseType
{

    /**
     * Идентификатор лицевого счета
     * 
     */
    @XmlElement(name = "AccountGuid", namespace = "http://dom.gosuslugi.ru/schema/integration/account-base/")
    protected List<String> accountGuid;
    /**
     * Идентификатор индивидуальной услуги ЛС
     * 
     */
    @XmlElement(name = "AccountIndividualServiceGUID")
    protected List<String> accountIndividualServiceGUID;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор лицевого счета
     * 
     * Gets the value of the accountGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountGuid().add(newItem);
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
     *     The value of the accountGuid property.
     */
    public List<String> getAccountGuid() {
        if (accountGuid == null) {
            accountGuid = new ArrayList<>();
        }
        return this.accountGuid;
    }

    /**
     * Идентификатор индивидуальной услуги ЛС
     * 
     * Gets the value of the accountIndividualServiceGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountIndividualServiceGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAccountIndividualServiceGUID().add(newItem);
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
     *     The value of the accountIndividualServiceGUID property.
     */
    public List<String> getAccountIndividualServiceGUID() {
        if (accountIndividualServiceGUID == null) {
            accountIndividualServiceGUID = new ArrayList<>();
        }
        return this.accountIndividualServiceGUID;
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
            return "11.0.0.1";
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
