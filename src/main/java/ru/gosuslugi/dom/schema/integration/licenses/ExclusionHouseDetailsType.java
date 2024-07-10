
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Праметры записи об исключении дома из лицензии
 * 
 * <p>Java class for ExclusionHouseDetailsType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExclusionHouseDetailsType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InclusionEntryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="ExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ExclusionBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element name="ExclusionDocument" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}DocumentType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExclusionHouseDetailsType", propOrder = {
    "inclusionEntryGuid",
    "exclusionDate",
    "exclusionBase",
    "exclusionDocument"
})
public class ExclusionHouseDetailsType {

    /**
     * Идентификатор реестровой записи о включении дома, которая была исключена из лицензии
     * 
     */
    @XmlElement(name = "InclusionEntryGuid", required = true)
    protected String inclusionEntryGuid;
    /**
     * Дата исключения дома из лицензии
     * 
     */
    @XmlElement(name = "ExclusionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exclusionDate;
    /**
     * Основание исключения НСИ 11
     * 
     */
    @XmlElement(name = "ExclusionBase")
    protected NsiRef exclusionBase;
    /**
     * Документ об исключении дома
     * 
     */
    @XmlElement(name = "ExclusionDocument", required = true)
    protected DocumentType exclusionDocument;

    /**
     * Идентификатор реестровой записи о включении дома, которая была исключена из лицензии
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionEntryGuid() {
        return inclusionEntryGuid;
    }

    /**
     * Sets the value of the inclusionEntryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInclusionEntryGuid()
     */
    public void setInclusionEntryGuid(String value) {
        this.inclusionEntryGuid = value;
    }

    /**
     * Дата исключения дома из лицензии
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExclusionDate() {
        return exclusionDate;
    }

    /**
     * Sets the value of the exclusionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getExclusionDate()
     */
    public void setExclusionDate(XMLGregorianCalendar value) {
        this.exclusionDate = value;
    }

    /**
     * Основание исключения НСИ 11
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getExclusionBase() {
        return exclusionBase;
    }

    /**
     * Sets the value of the exclusionBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getExclusionBase()
     */
    public void setExclusionBase(NsiRef value) {
        this.exclusionBase = value;
    }

    /**
     * Документ об исключении дома
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getExclusionDocument() {
        return exclusionDocument;
    }

    /**
     * Sets the value of the exclusionDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     * @see #getExclusionDocument()
     */
    public void setExclusionDocument(DocumentType value) {
        this.exclusionDocument = value;
    }

}
