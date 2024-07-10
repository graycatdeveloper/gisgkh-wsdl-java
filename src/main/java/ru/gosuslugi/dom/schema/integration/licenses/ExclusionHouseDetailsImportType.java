
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Праметры для иморпта записи об исключении дома из лицензии
 * 
 * <p>Java class for ExclusionHouseDetailsImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExclusionHouseDetailsImportType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InclusionEntryGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *         <element name="ExclusionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ExclusionBase" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
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
@XmlType(name = "ExclusionHouseDetailsImportType", propOrder = {
    "inclusionEntryGUID",
    "exclusionDate",
    "exclusionBase",
    "exclusionDocument"
})
public class ExclusionHouseDetailsImportType {

    /**
     * Идентификатор реестровой записи о включении дома, которая была исключена из лицензии. Не заполняется при исправлении технической ошибки в записи об исключении дома
     * 
     */
    @XmlElement(name = "InclusionEntryGUID")
    protected String inclusionEntryGUID;
    /**
     * Дата исключения дома из лицензии
     * 
     */
    @XmlElement(name = "ExclusionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exclusionDate;
    /**
     * Основание исключения. Заполняется значением справочника "Вид основания для выполнения размещения инфомрации в реестре лицензий"
     * 
     */
    @XmlElement(name = "ExclusionBase", required = true)
    protected NsiRef exclusionBase;
    /**
     * Документ об исключении дома
     * 
     */
    @XmlElement(name = "ExclusionDocument", required = true)
    protected DocumentType exclusionDocument;

    /**
     * Идентификатор реестровой записи о включении дома, которая была исключена из лицензии. Не заполняется при исправлении технической ошибки в записи об исключении дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionEntryGUID() {
        return inclusionEntryGUID;
    }

    /**
     * Sets the value of the inclusionEntryGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getInclusionEntryGUID()
     */
    public void setInclusionEntryGUID(String value) {
        this.inclusionEntryGUID = value;
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
     * Основание исключения. Заполняется значением справочника "Вид основания для выполнения размещения инфомрации в реестре лицензий"
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
