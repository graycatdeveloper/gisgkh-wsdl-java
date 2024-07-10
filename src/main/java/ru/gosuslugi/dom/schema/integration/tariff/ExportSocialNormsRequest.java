
package ru.gosuslugi.dom.schema.integration.tariff;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


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
 *         <element name="TariffGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *         <sequence>
 *           <element name="OKTMO" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" minOccurs="0"/>
 *           <sequence minOccurs="0">
 *             <element name="DateEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             <element name="DateEffectiveTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           </sequence>
 *           <element name="PublishedOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         </sequence>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="13.2.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tariffGUID",
    "oktmo",
    "dateEffectiveFrom",
    "dateEffectiveTo",
    "publishedOnly"
})
@XmlRootElement(name = "exportSocialNormsRequest")
public class ExportSocialNormsRequest
    extends BaseType
{

    /**
     * Идентификатор тарифа
     * 
     */
    @XmlElement(name = "TariffGUID")
    protected List<String> tariffGUID;
    /**
     * Территория, на которой применяется
     * 
     */
    @XmlElement(name = "OKTMO")
    protected OKTMORefType oktmo;
    /**
     * Дата вступления в силу С
     * 
     */
    @XmlElement(name = "DateEffectiveFrom")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEffectiveFrom;
    /**
     * Дата вступления в силу ПО
     * 
     */
    @XmlElement(name = "DateEffectiveTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEffectiveTo;
    /**
     * Экспортировать только размещенную информацию
     * 
     */
    @XmlElement(name = "PublishedOnly")
    protected Boolean publishedOnly;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Идентификатор тарифа
     * 
     * Gets the value of the tariffGUID property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffGUID property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTariffGUID().add(newItem);
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
     *     The value of the tariffGUID property.
     */
    public List<String> getTariffGUID() {
        if (tariffGUID == null) {
            tariffGUID = new ArrayList<>();
        }
        return this.tariffGUID;
    }

    /**
     * Территория, на которой применяется
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getOKTMO() {
        return oktmo;
    }

    /**
     * Sets the value of the oktmo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getOKTMO()
     */
    public void setOKTMO(OKTMORefType value) {
        this.oktmo = value;
    }

    /**
     * Дата вступления в силу С
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffectiveFrom() {
        return dateEffectiveFrom;
    }

    /**
     * Sets the value of the dateEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateEffectiveFrom()
     */
    public void setDateEffectiveFrom(XMLGregorianCalendar value) {
        this.dateEffectiveFrom = value;
    }

    /**
     * Дата вступления в силу ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEffectiveTo() {
        return dateEffectiveTo;
    }

    /**
     * Sets the value of the dateEffectiveTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDateEffectiveTo()
     */
    public void setDateEffectiveTo(XMLGregorianCalendar value) {
        this.dateEffectiveTo = value;
    }

    /**
     * Экспортировать только размещенную информацию
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublishedOnly() {
        return publishedOnly;
    }

    /**
     * Sets the value of the publishedOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isPublishedOnly()
     */
    public void setPublishedOnly(Boolean value) {
        this.publishedOnly = value;
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
            return "13.2.0.1";
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
