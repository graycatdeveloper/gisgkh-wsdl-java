
package ru.gosuslugi.dom.schema.integration.tech_conn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Элемент справочника в ЕСНСИ
 * 
 * <p>Java class for EsnsiItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EsnsiItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Name" type="{http://dom.gosuslugi.ru/schema/integration/tech-conn/}String255Type" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsnsiItemType", propOrder = {
    "code",
    "name"
})
public class EsnsiItemType {

    /**
     * Код записи справочника
     * 
     */
    @XmlElement(name = "Code")
    protected int code;
    /**
     * Наименование записи справочника
     * 
     */
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Код записи справочника
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Наименование записи справочника
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

}
