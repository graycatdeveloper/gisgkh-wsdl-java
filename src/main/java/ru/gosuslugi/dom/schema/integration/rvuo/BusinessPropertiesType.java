
package ru.gosuslugi.dom.schema.integration.rvuo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий реквизиты организации
 * 
 * <p>Java class for BusinessPropertiesType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BusinessPropertiesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="OGRN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNType"/>
 *           <element name="OGRNIP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}OGRNIPType"/>
 *         </choice>
 *         <element name="INN" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}INNType"/>
 *         <element name="KPP" type="{http://dom.gosuslugi.ru/schema/integration/organizations-base/}KPPType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPropertiesType", propOrder = {
    "ogrn",
    "ogrnip",
    "inn",
    "kpp"
})
public class BusinessPropertiesType {

    /**
     * ОГРН
     * 
     */
    @XmlElement(name = "OGRN")
    protected String ogrn;
    /**
     * ОГРНИП
     * 
     */
    @XmlElement(name = "OGRNIP")
    protected String ogrnip;
    /**
     * ИНН
     * 
     */
    @XmlElement(name = "INN", required = true)
    protected String inn;
    /**
     * КПП
     * 
     */
    @XmlElement(name = "KPP")
    protected String kpp;

    /**
     * ОГРН
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOGRN()
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * ОГРНИП
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRNIP() {
        return ogrnip;
    }

    /**
     * Sets the value of the ogrnip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOGRNIP()
     */
    public void setOGRNIP(String value) {
        this.ogrnip = value;
    }

    /**
     * ИНН
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getINN()
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * КПП
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKPP()
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

}
