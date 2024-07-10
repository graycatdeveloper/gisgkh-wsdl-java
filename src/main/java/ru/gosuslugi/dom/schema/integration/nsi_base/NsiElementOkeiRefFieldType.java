
package ru.gosuslugi.dom.schema.integration.nsi_base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Наименование и значение поля типа "Ссылка на элемент справочника ОКЕИ" для элемента справочника.
 * 
 * <p>Java class for NsiElementOkeiRefFieldType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementOkeiRefFieldType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType">
 *       <sequence>
 *         <element name="Code" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiCodeType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementOkeiRefFieldType", propOrder = {
    "code"
})
public class NsiElementOkeiRefFieldType
    extends NsiElementFieldType
{

    /**
     * Код единицы измерения по справочнику ОКЕИ.
     * 
     */
    @XmlElement(name = "Code")
    protected String code;

    /**
     * Код единицы измерения по справочнику ОКЕИ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

}
