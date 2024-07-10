
package ru.gosuslugi.dom.schema.integration.nsi;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="RegistryNumber">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemRegistryNumberType">
 *               <enumeration value="1"/>
 *               <enumeration value="51"/>
 *               <enumeration value="59"/>
 *               <enumeration value="219"/>
 *               <enumeration value="272"/>
 *               <enumeration value="302"/>
 *               <enumeration value="337"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ModifiedAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registryNumber",
    "modifiedAfter"
})
@XmlRootElement(name = "exportDataProviderNsiItemRequest")
public class ExportDataProviderNsiItemRequest
    extends BaseType
{

    /**
     * Реестровый номер справочника.
     * 
     */
    @XmlElement(name = "RegistryNumber", required = true)
    protected BigInteger registryNumber;
    /**
     * Дата и время, измененные после которой элементы справочника должны быть возвращены в ответе. Если не указана, возвращаются все элементы справочника.
     * 
     */
    @XmlElement(name = "ModifiedAfter")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedAfter;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Реестровый номер справочника.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegistryNumber() {
        return registryNumber;
    }

    /**
     * Sets the value of the registryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getRegistryNumber()
     */
    public void setRegistryNumber(BigInteger value) {
        this.registryNumber = value;
    }

    /**
     * Дата и время, измененные после которой элементы справочника должны быть возвращены в ответе. Если не указана, возвращаются все элементы справочника.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedAfter() {
        return modifiedAfter;
    }

    /**
     * Sets the value of the modifiedAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getModifiedAfter()
     */
    public void setModifiedAfter(XMLGregorianCalendar value) {
        this.modifiedAfter = value;
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
            return "10.0.1.2";
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
