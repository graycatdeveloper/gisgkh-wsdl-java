
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;


/**
 * Экспортируемая региональная программа капитального ремонта (включая идентификатор, статус, документы и территорию)
 * 
 * <p>Java class for ExportRegionalProgramType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportRegionalProgramType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}RegionalProgramPasportType">
 *       <sequence>
 *         <element name="Territory" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *         <element name="RegionalProgramGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="Documents" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}ExportDocumentType" maxOccurs="1000" minOccurs="0"/>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}StatusExtendedType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportRegionalProgramType", propOrder = {
    "territory",
    "regionalProgramGuid",
    "documents",
    "status"
})
public class ExportRegionalProgramType
    extends RegionalProgramPasportType
{

    /**
     * Территория реализации РПКР (ОКТМО уровня региона)
     * 
     */
    @XmlElement(name = "Territory", required = true)
    protected OKTMORefType territory;
    /**
     * Идентификатор РПКР в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "RegionalProgramGuid", required = true)
    protected String regionalProgramGuid;
    /**
     * Документы РПКР
     * 
     */
    @XmlElement(name = "Documents")
    protected List<ExportDocumentType> documents;
    /**
     * Статус РПКР в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "token")
    protected StatusExtendedType status;

    /**
     * Территория реализации РПКР (ОКТМО уровня региона)
     * 
     * @return
     *     possible object is
     *     {@link OKTMORefType }
     *     
     */
    public OKTMORefType getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link OKTMORefType }
     *     
     * @see #getTerritory()
     */
    public void setTerritory(OKTMORefType value) {
        this.territory = value;
    }

    /**
     * Идентификатор РПКР в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalProgramGuid() {
        return regionalProgramGuid;
    }

    /**
     * Sets the value of the regionalProgramGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRegionalProgramGuid()
     */
    public void setRegionalProgramGuid(String value) {
        this.regionalProgramGuid = value;
    }

    /**
     * Документы РПКР
     * 
     * Gets the value of the documents property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportDocumentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the documents property.
     */
    public List<ExportDocumentType> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<>();
        }
        return this.documents;
    }

    /**
     * Статус РПКР в ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link StatusExtendedType }
     *     
     */
    public StatusExtendedType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusExtendedType }
     *     
     * @see #getStatus()
     */
    public void setStatus(StatusExtendedType value) {
        this.status = value;
    }

}
