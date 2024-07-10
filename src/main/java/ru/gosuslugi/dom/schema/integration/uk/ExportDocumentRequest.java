
package ru.gosuslugi.dom.schema.integration.uk;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;
import ru.gosuslugi.dom.schema.integration.base.OKTMORefType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <sequence>
 *           <choice>
 *             <element name="Federal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             <element name="Region" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *             <element name="Municipal" type="{http://dom.gosuslugi.ru/schema/integration/base/}OKTMORefType"/>
 *           </choice>
 *           <sequence minOccurs="0">
 *             <element name="AcceptStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             <element name="AcceptEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           </sequence>
 *           <element name="DocumentType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         </sequence>
 *         <element name="DocumentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.2.0.2""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "federal",
    "region",
    "municipal",
    "acceptStartDate",
    "acceptEndDate",
    "documentType",
    "documentGuid"
})
@XmlRootElement(name = "exportDocumentRequest")
public class ExportDocumentRequest
    extends BaseType
{

    /**
     * Сфера действия документа "Федеральный уровень"
     * 
     */
    @XmlElement(name = "Federal", defaultValue = "true")
    protected Boolean federal;
    /**
     * Сфера действия документа "Региональный уровень". Действие документа на определенном субъекте РФ.  (Ссылка на справочник Субъекты РФ). НСИ 237
     * 
     */
    @XmlElement(name = "Region")
    protected NsiRef region;
    /**
     * Сфера действия документа "Муниципальный уровень". Действие документа на определенном муниципальном образовании
     * 
     */
    @XmlElement(name = "Municipal")
    protected OKTMORefType municipal;
    /**
     * Дата начала периода принятия документа органом власти
     * 
     */
    @XmlElement(name = "AcceptStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acceptStartDate;
    /**
     * Дата окончания периода принятия документа органов власти
     * 
     */
    @XmlElement(name = "AcceptEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acceptEndDate;
    /**
     * Вид документа. (Ссылка на справочник "Вид закона и нормативного акта"). НСИ 324
     * 
     */
    @XmlElement(name = "DocumentType")
    protected NsiRef documentType;
    /**
     * Идентификатор документа в системе ГИС ЖКХ
     * 
     */
    @XmlElement(name = "DocumentGuid")
    protected List<String> documentGuid;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Сфера действия документа "Федеральный уровень"
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederal() {
        return federal;
    }

    /**
     * Sets the value of the federal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isFederal()
     */
    public void setFederal(Boolean value) {
        this.federal = value;
    }

    /**
     * Сфера действия документа "Региональный уровень". Действие документа на определенном субъекте РФ.  (Ссылка на справочник Субъекты РФ). НСИ 237
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
     * Сфера действия документа "Муниципальный уровень". Действие документа на определенном муниципальном образовании
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

    /**
     * Дата начала периода принятия документа органом власти
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptStartDate() {
        return acceptStartDate;
    }

    /**
     * Sets the value of the acceptStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAcceptStartDate()
     */
    public void setAcceptStartDate(XMLGregorianCalendar value) {
        this.acceptStartDate = value;
    }

    /**
     * Дата окончания периода принятия документа органов власти
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcceptEndDate() {
        return acceptEndDate;
    }

    /**
     * Sets the value of the acceptEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAcceptEndDate()
     */
    public void setAcceptEndDate(XMLGregorianCalendar value) {
        this.acceptEndDate = value;
    }

    /**
     * Вид документа. (Ссылка на справочник "Вид закона и нормативного акта"). НСИ 324
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDocumentType()
     */
    public void setDocumentType(NsiRef value) {
        this.documentType = value;
    }

    /**
     * Идентификатор документа в системе ГИС ЖКХ
     * 
     * Gets the value of the documentGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocumentGuid().add(newItem);
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
     *     The value of the documentGuid property.
     */
    public List<String> getDocumentGuid() {
        if (documentGuid == null) {
            documentGuid = new ArrayList<>();
        }
        return this.documentGuid;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "11.2.0.2";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
