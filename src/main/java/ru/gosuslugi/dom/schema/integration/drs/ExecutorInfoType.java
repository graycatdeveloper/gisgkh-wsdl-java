
package ru.gosuslugi.dom.schema.integration.drs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация об исполнителе
 * 
 * <p>Java class for ExecutorInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExecutorInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="fio" type="{http://dom.gosuslugi.ru/schema/integration/drs/}PersonNameType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutorInfoType", propOrder = {
    "guid",
    "fio"
})
public class ExecutorInfoType {

    /**
     * Идентификатор исполнителя
     * 
     */
    @XmlElement(name = "GUID", required = true)
    protected String guid;
    /**
     * ФИО Исполнителя
     * 
     */
    @XmlElement(required = true)
    protected String fio;

    /**
     * Идентификатор исполнителя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGUID()
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * ФИО Исполнителя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFio()
     */
    public void setFio(String value) {
        this.fio = value;
    }

}
