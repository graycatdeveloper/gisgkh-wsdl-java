
package ru.gosuslugi.dom.schema.integration.uk;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Документ закона/нормативно-правового акта уровня муниципальных образований
 * 
 * <p>Java class for DocumentMunicipalType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentMunicipalType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentPortalType">
 *       <sequence>
 *         <element name="Municipal" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentMunicipalType", propOrder = {
    "municipal"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.uk.ImportDocumentMunicipalRequest.Document.ImportDocument.class
})
public class DocumentMunicipalType
    extends DocumentPortalType
{

    /**
     * Действие документа на определенном муниципальном образовании РФ. Для опеарции импорта документов поле должно быть заполнено кодом ОКТМО из полномочий ОМС
     * 
     */
    @XmlElement(name = "Municipal", required = true)
    protected OKTMORefType municipal;

    /**
     * Действие документа на определенном муниципальном образовании РФ. Для опеарции импорта документов поле должно быть заполнено кодом ОКТМО из полномочий ОМС
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getMunicipal() {
        return municipal;
    }

    /**
     * Sets the value of the municipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getMunicipal()
     */
    public void setMunicipal(OKTMORefType value) {
        this.municipal = value;
    }

}
