
package ru.gosuslugi.dom.schema.integration.uk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Документ закона/нормативно-правового акта регионального уровня
 * 
 * <p>Java class for DocumentRegionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentRegionType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentPortalType">
 *       <choice>
 *         <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Municipal" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="1000"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRegionType", propOrder = {
    "region",
    "municipal"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.uk.ImportDocumentRegionRequest.Document.ImportDocument.class
})
public class DocumentRegionType
    extends DocumentPortalType
{

    /**
     * Действие документа на определенном субъекте РФ. Для опеарции импорта документов поле должно быть заполнено кодом субъекта из пономочий ОГВ.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     */
    @XmlElement(name = "Region")
    protected NsiRef region;
    /**
     * Действие документа на определенном муниципальном образовании РФ.  Для опеарции импорта документов должны быть указаны муниципальные образования, входящие в территорию действий полномочий ОГВ
     * 
     */
    @XmlElement(name = "Municipal")
    protected List<OKTMORefType> municipal;

    /**
     * Действие документа на определенном субъекте РФ. Для опеарции импорта документов поле должно быть заполнено кодом субъекта из пономочий ОГВ.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getRegion()
     */
    public void setRegion(NsiRef value) {
        this.region = value;
    }

    /**
     * Действие документа на определенном муниципальном образовании РФ.  Для опеарции импорта документов должны быть указаны муниципальные образования, входящие в территорию действий полномочий ОГВ
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
