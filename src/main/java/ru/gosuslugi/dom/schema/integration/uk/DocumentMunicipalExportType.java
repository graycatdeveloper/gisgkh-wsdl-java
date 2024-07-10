
package ru.gosuslugi.dom.schema.integration.uk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Документ закона/нормативно-правового акта уровня муниципальных образований для операции экспорта
 * 
 * <p>Java class for DocumentMunicipalExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentMunicipalExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentPortalExportType">
 *       <sequence minOccurs="0">
 *         <element name="Municipal" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMunicipalExportType", propOrder = {
    "municipal"
})
public class DocumentMunicipalExportType
    extends DocumentPortalExportType
{

    /**
     * Действие документа на определенном муниципальном образовании РФ. Для опеарции импорта документов поле должно быть заполнено кодом ОКТМО из полномочий ОМС
     * 
     */
    @XmlElement(name = "Municipal")
    protected List<OKTMORefType> municipal;

    /**
     * Действие документа на определенном муниципальном образовании РФ. Для опеарции импорта документов поле должно быть заполнено кодом ОКТМО из полномочий ОМС
     * 
     * Gets the value of the municipal property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipal property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMunicipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OKTMORefType }
     * </p>
     * 
     * 
     * @return
     *     The value of the municipal property.
     */
    public List<OKTMORefType> getMunicipal() {
        if (municipal == null) {
            municipal = new ArrayList<>();
        }
        return this.municipal;
    }

}
