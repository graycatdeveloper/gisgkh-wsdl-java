
package ru.gosuslugi.dom.schema.integration.services;

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
 *         <element name="CompletedWorksByPeriod" type="{http://dom.gosuslugi.ru/schema/integration/services/}CompletedWorksByPeriodType"/>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.5.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "completedWorksByPeriod"
})
@XmlRootElement(name = "importCompletedWorksRequest")
public class ImportCompletedWorksRequest
    extends BaseType
{

    /**
     * Перечень выполненных работ за отчетный период
     * 
     */
    @XmlElement(name = "CompletedWorksByPeriod", required = true)
    protected CompletedWorksByPeriodType completedWorksByPeriod;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Перечень выполненных работ за отчетный период
     * 
     * @return
     *     possible object is
     *     {@link CompletedWorksByPeriodType }
     *     
     */
    public CompletedWorksByPeriodType getCompletedWorksByPeriod() {
        return completedWorksByPeriod;
    }

    /**
     * Sets the value of the completedWorksByPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletedWorksByPeriodType }
     *     
     * @see #getCompletedWorksByPeriod()
     */
    public void setCompletedWorksByPeriod(CompletedWorksByPeriodType value) {
        this.completedWorksByPeriod = value;
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
            return "11.5.0.2";
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
