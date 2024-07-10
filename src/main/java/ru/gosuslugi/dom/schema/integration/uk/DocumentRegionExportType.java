
package ru.gosuslugi.dom.schema.integration.uk;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Документ закона/нормативно-правового акта регионального уровня для операции экспорта
 * 
 * <p>Java class for DocumentRegionExportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentRegionExportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/uk/}DocumentPortalExportType">
 *       <choice minOccurs="0">
 *         <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" maxOccurs="unbounded"/>
 *         <element name="Municipal" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType" maxOccurs="unbounded"/>
 *       </choice>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentRegionExportType", propOrder = {
    "region",
    "municipal"
})
public class DocumentRegionExportType
    extends DocumentPortalExportType
{

    /**
     * Действие документа на определенном субъекте РФ. Для опеарции импорта документов поле должно быть заполнено кодом субъекта из пономочий ОГВ.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     */
    @XmlElement(name = "Region")
    protected List<NsiRef> region;
    /**
     * Действие документа на определенном муниципальном образовании РФ.  Для опеарции импорта документов должны быть указаны муниципальные образования, входящие в территорию действий полномочий ОГВ
     * 
     */
    @XmlElement(name = "Municipal")
    protected List<OKTMORefType> municipal;

    /**
     * Действие документа на определенном субъекте РФ. Для опеарции импорта документов поле должно быть заполнено кодом субъекта из пономочий ОГВ.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     * Gets the value of the region property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the region property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRegion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiRef }
     * </p>
     * 
     * 
     * @return
     *     The value of the region property.
     */
    public List<NsiRef> getRegion() {
        if (region == null) {
            region = new ArrayList<>();
        }
        return this.region;
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
