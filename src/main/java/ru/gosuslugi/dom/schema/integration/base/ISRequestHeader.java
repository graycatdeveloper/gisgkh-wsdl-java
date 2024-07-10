
package ru.gosuslugi.dom.schema.integration.base;

import java.util.ArrayList;
import java.util.List;
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
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}HeaderType">
 *       <sequence>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}ISCreator" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isCreator"
})
@XmlRootElement(name = "ISRequestHeader")
public class ISRequestHeader
    extends HeaderType
{

    /**
     * Сведения об иной ИС, с использованием которой была сформирована информация (589/944/,п.164)
     * 
     */
    @XmlElement(name = "ISCreator")
    protected List<ISCreator> isCreator;

    /**
     * Сведения об иной ИС, с использованием которой была сформирована информация (589/944/,п.164)
     * 
     * Gets the value of the isCreator property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isCreator property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getISCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ISCreator }
     * </p>
     * 
     * 
     * @return
     *     The value of the isCreator property.
     */
    public List<ISCreator> getISCreator() {
        if (isCreator == null) {
            isCreator = new ArrayList<>();
        }
        return this.isCreator;
    }

}
