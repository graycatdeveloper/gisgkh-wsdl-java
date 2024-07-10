
package ru.gosuslugi.dom.schema.integration.capital_repair;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.CommonResultType;


/**
 * Расширенный тип ответа на результат импорта
 * 
 * <p>Java class for CapRemCommonResultType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CapRemCommonResultType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}CommonResultType">
 *       <sequence minOccurs="0">
 *         <element name="AccountSpecialGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapRemCommonResultType", propOrder = {
    "accountSpecialGuid"
})
public class CapRemCommonResultType
    extends CommonResultType
{

    /**
     * Идентификатор  специального счета
     * 
     */
    @XmlElement(name = "AccountSpecialGuid")
    protected String accountSpecialGuid;

    /**
     * Идентификатор  специального счета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountSpecialGuid() {
        return accountSpecialGuid;
    }

    /**
     * Sets the value of the accountSpecialGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAccountSpecialGuid()
     */
    public void setAccountSpecialGuid(String value) {
        this.accountSpecialGuid = value;
    }

}
