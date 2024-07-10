
package ru.gosuslugi.dom.schema.integration.capital_repair;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Документ программы (плана)
 * 
 * <p>Java class for DocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Kind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="FullName">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String1000Type">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String512Type"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Legislature" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String512Type"/>
 *         <element name="AttachDocument" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "kind",
    "fullName",
    "number",
    "date",
    "legislature",
    "attachDocument"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.capital_repair.ImportDocumentType.LoadDocument.class,
    ExportDocumentType.class
})
public class DocumentType {

    /**
     * Вид документа (НСИ 79). Используются только виды документов, которые могут применяться в программах соответствующего вида.
     * 
     */
    @XmlElement(name = "Kind", required = true)
    protected NsiRef kind;
    /**
     * Полное наименование документа
     * 
     */
    @XmlElement(name = "FullName", required = true)
    protected String fullName;
    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата документа
     * 
     */
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    /**
     * Орган, принявший документ
     * 
     */
    @XmlElement(name = "Legislature", required = true)
    protected String legislature;
    /**
     * Файл документа
     * 
     */
    @XmlElement(name = "AttachDocument", required = true)
    protected List<AttachmentType> attachDocument;

    /**
     * Вид документа (НСИ 79). Используются только виды документов, которые могут применяться в программах соответствующего вида.
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getKind()
     */
    public void setKind(NsiRef value) {
        this.kind = value;
    }

    /**
     * Полное наименование документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFullName()
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Номер документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNumber()
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Дата документа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDate()
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Орган, принявший документ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegislature() {
        return legislature;
    }

    /**
     * Sets the value of the legislature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLegislature()
     */
    public void setLegislature(String value) {
        this.legislature = value;
    }

    /**
     * Файл документа
     * 
     * Gets the value of the attachDocument property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachDocument property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachDocument property.
     */
    public List<AttachmentType> getAttachDocument() {
        if (attachDocument == null) {
            attachDocument = new ArrayList<>();
        }
        return this.attachDocument;
    }

}
