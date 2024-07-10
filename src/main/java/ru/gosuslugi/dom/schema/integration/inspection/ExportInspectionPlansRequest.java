
package ru.gosuslugi.dom.schema.integration.inspection;

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
 *       <sequence>
 *         <element name="YearFrom" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType" minOccurs="0"/>
 *         <element name="YearTo" type="{http://dom.gosuslugi.ru/schema/integration/base/}YearType" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "yearFrom",
    "yearTo"
})
@XmlRootElement(name = "exportInspectionPlansRequest")
public class ExportInspectionPlansRequest
    extends BaseType
{

    /**
     * Начальный год (включительно). Если не заполнено, то без ограничения начального года.
     * 
     */
    @XmlElement(name = "YearFrom")
    protected Short yearFrom;
    /**
     * Конечный год (включительно). Если не заполнено, то без ограничения конечного года.
     * 
     */
    @XmlElement(name = "YearTo")
    protected Short yearTo;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Начальный год (включительно). Если не заполнено, то без ограничения начального года.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getYearFrom() {
        return yearFrom;
    }

    /**
     * Sets the value of the yearFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     * @see #getYearFrom()
     */
    public void setYearFrom(Short value) {
        this.yearFrom = value;
    }

    /**
     * Конечный год (включительно). Если не заполнено, то без ограничения конечного года.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getYearTo() {
        return yearTo;
    }

    /**
     * Sets the value of the yearTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     * @see #getYearTo()
     */
    public void setYearTo(Short value) {
        this.yearTo = value;
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
            return "11.2.0.1";
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
