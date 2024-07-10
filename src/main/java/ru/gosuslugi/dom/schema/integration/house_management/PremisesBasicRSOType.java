
package ru.gosuslugi.dom.schema.integration.house_management;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Базовый тип помещения (для импорта от РСО)
 * 
 * <p>Java class for PremisesBasicRSOType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="PremisesBasicRSOType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/house-management/}GKN_EGRP_KeyRSOType">
 *       <sequence>
 *         <element name="PremisesNum" type="{http://dom.gosuslugi.ru/schema/integration/house-management/}PremisesNumType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesBasicRSOType", propOrder = {
    "premisesNum"
})
@XmlSeeAlso({
    ResidentialPremisesRSOType.class,
    NonResidentialPremisesRSOType.class
})
public class PremisesBasicRSOType
    extends GKNEGRPKeyRSOType
{

    /**
     * Номер помещения
     * 
     */
    @XmlElement(name = "PremisesNum", required = true)
    protected String premisesNum;

    /**
     * Номер помещения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremisesNum() {
        return premisesNum;
    }

    /**
     * Sets the value of the premisesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPremisesNum()
     */
    public void setPremisesNum(String value) {
        this.premisesNum = value;
    }

}
