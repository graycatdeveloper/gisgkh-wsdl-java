
package ru.gosuslugi.dom.schema.integration.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ISName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *         <element name="ISOperatorName" type="{http://dom.gosuslugi.ru/schema/integration/base/}String255Type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isName",
    "isOperatorName"
})
@XmlRootElement(name = "ISCreator")
public class ISCreator {

    /**
     * Наименование ИС
     * 
     */
    @XmlElement(name = "ISName", required = true)
    protected String isName;
    /**
     * Наименование Оператора ИС
     * 
     */
    @XmlElement(name = "ISOperatorName", required = true)
    protected String isOperatorName;

    /**
     * Наименование ИС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISName() {
        return isName;
    }

    /**
     * Sets the value of the isName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getISName()
     */
    public void setISName(String value) {
        this.isName = value;
    }

    /**
     * Наименование Оператора ИС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOperatorName() {
        return isOperatorName;
    }

    /**
     * Sets the value of the isOperatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getISOperatorName()
     */
    public void setISOperatorName(String value) {
        this.isOperatorName = value;
    }

}
