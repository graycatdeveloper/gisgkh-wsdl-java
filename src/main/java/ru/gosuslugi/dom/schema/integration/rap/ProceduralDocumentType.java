
package ru.gosuslugi.dom.schema.integration.rap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Процессуальный документ
 * 
 * <p>Java class for ProceduralDocumentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ProceduralDocumentType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocumentKind" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="DocumentName">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String300Type">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DocumentNumber">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="DocumentDate" type="{http://dom.gosuslugi.ru/schema/integration/rap/}LimitedDateType"/>
 *         <element name="Executed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Document" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="100"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProceduralDocumentType", propOrder = {
    "documentKind",
    "documentName",
    "documentNumber",
    "documentDate",
    "executed",
    "document"
})
public class ProceduralDocumentType {

    /**
     * Вид процессуального документа (НСИ-226).
     * 
     * Должен соответствовать категории процессуального документа (НСИ-228).
     * 
     */
    @XmlElement(name = "DocumentKind", required = true)
    protected NsiRef documentKind;
    /**
     * Имя документа
     * 
     */
    @XmlElement(name = "DocumentName", required = true)
    protected String documentName;
    /**
     * Номер процессуального документа
     * 
     */
    @XmlElement(name = "DocumentNumber", required = true)
    protected String documentNumber;
    /**
     * Дата процессуального документа
     * 
     */
    @XmlElement(name = "DocumentDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar documentDate;
    /**
     * Информация об исполнении (true - Исполнено; false - Не исполнено; при незаполнении устанавливается значение по умолчанию - Не заполнено)
     * 
     */
    @XmlElement(name = "Executed")
    protected Boolean executed;
    /**
     * Документ-вложение
     * 
     */
    @XmlElement(name = "Document", required = true)
    protected List<AttachmentType> document;

    /**
     * Вид процессуального документа (НСИ-226).
     * 
     * Должен соответствовать категории процессуального документа (НСИ-228).
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getDocumentKind() {
        return documentKind;
    }

    /**
     * Sets the value of the documentKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getDocumentKind()
     */
    public void setDocumentKind(NsiRef value) {
        this.documentKind = value;
    }

    /**
     * Имя документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentName()
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Номер процессуального документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDocumentNumber()
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Дата процессуального документа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDate() {
        return documentDate;
    }

    /**
     * Sets the value of the documentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDocumentDate()
     */
    public void setDocumentDate(XMLGregorianCalendar value) {
        this.documentDate = value;
    }

    /**
     * Информация об исполнении (true - Исполнено; false - Не исполнено; при незаполнении устанавливается значение по умолчанию - Не заполнено)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExecuted() {
        return executed;
    }

    /**
     * Sets the value of the executed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isExecuted()
     */
    public void setExecuted(Boolean value) {
        this.executed = value;
    }

    /**
     * Документ-вложение
     * 
     * Gets the value of the document property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDocument().add(newItem);
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
     *     The value of the document property.
     */
    public List<AttachmentType> getDocument() {
        if (document == null) {
            document = new ArrayList<>();
        }
        return this.document;
    }

}
