
package ru.gosuslugi.dom.schema.integration.licenses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Параметры для импорта записи об объединении
 * 
 * <p>Java class for UnionDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UnionDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnionLicenses" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnionDetailsImportType", propOrder = {
    "unionLicenses"
})
public class UnionDetailsImportType {

    /**
     * Идентификаторы лицензий, с которыми выполнялось объединение
     * 
     */
    @XmlElement(name = "UnionLicenses", required = true)
    protected List<String> unionLicenses;

    /**
     * Идентификаторы лицензий, с которыми выполнялось объединение
     * 
     * Gets the value of the unionLicenses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unionLicenses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUnionLicenses().add(newItem);
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
     *     The value of the unionLicenses property.
     */
    public List<String> getUnionLicenses() {
        if (unionLicenses == null) {
            unionLicenses = new ArrayList<>();
        }
        return this.unionLicenses;
    }

}
