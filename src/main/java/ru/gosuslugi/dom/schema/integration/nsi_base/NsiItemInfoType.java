
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование, дата и время последнего изменения справочника.
 * 
 * <p>Java class for NsiItemInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiItemInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemRegistryNumberType"/>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemNameType"/>
 *         <element name="Modified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiItemInfoType", propOrder = {
    "registryNumber",
    "name",
    "modified"
})
public class NsiItemInfoType {

    /**
     * Реестровый номер справочника.
     * 
     */
    @XmlElement(name = "RegistryNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger registryNumber;
    /**
     * Наименование справочника.
     * 
     */
    @XmlElement(name = "Name", required = true)
    protected String name;
    /**
     * Дата и время последнего изменения справочника.
     * 
     */
    @XmlElement(name = "Modified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;

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
     * Наименование справочника.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getName()
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Дата и время последнего изменения справочника.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getModified()
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

}
