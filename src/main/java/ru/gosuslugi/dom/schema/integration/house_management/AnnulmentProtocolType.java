
package ru.gosuslugi.dom.schema.integration.house_management;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;
import ru.gosuslugi.dom.schema.integration.organizations_registry_base.RegOrgType;


/**
 * Аннулирование протокола ОСС
 * 
 * <p>Java class for AnnulmentProtocolType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnnulmentProtocolType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Modification" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType">
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <choice minOccurs="0">
 *           <element name="AnnulmentOrganization" type="{http://dom.gosuslugi.ru/schema/integration/organizations-registry-base/}RegOrgType"/>
 *           <element name="AnnulmentOrganizationText" type="{http://dom.gosuslugi.ru/schema/integration/base/}LongTextType"/>
 *         </choice>
 *         <element name="AnnulmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="AnnulmentNumber" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="50"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="NSIModification" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef" minOccurs="0"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/house-management/}Attachments" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnulmentProtocolType", propOrder = {
    "modification",
    "annulmentOrganization",
    "annulmentOrganizationText",
    "annulmentDate",
    "annulmentNumber",
    "nsiModification",
    "attachments"
})
public class AnnulmentProtocolType {

    /**
     * Основание аннулирования протокола
     * 
     */
    @XmlElement(name = "Modification")
    protected String modification;
    /**
     * Организация, принявшая решение об аннулировании
     * 
     */
    @XmlElement(name = "AnnulmentOrganization")
    protected RegOrgType annulmentOrganization;
    /**
     * Организация или физическое лицо, принявшая решение об аннулировании
     * 
     */
    @XmlElement(name = "AnnulmentOrganizationText")
    protected String annulmentOrganizationText;
    /**
     * Дата решения об аннулировании. По умолчанию сохраняется дата выполнения аннулирования
     * 
     */
    @XmlElement(name = "AnnulmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar annulmentDate;
    /**
     * Номер решения об аннулировании
     * 
     */
    @XmlElement(name = "AnnulmentNumber")
    protected String annulmentNumber;
    /**
     * Причина аннулирования по НСИ (НСИ№271). По умолчанию запись с кодом 3 "Ошибка ввода"
     * 
     */
    @XmlElement(name = "NSIModification")
    protected NsiRef nsiModification;
    /**
     * Электронная копия документа об аннулировании. Обязательно добавление хотя бы одного файла, если Причина аннулирования по НСИ "Решение суда" (код записи 1)
     * 
     */
    @XmlElement(name = "Attachments")
    protected List<Attachments> attachments;

    /**
     * Основание аннулирования протокола
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModification() {
        return modification;
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getModification()
     */
    public void setModification(String value) {
        this.modification = value;
    }

    /**
     * Организация, принявшая решение об аннулировании
     * 
     * @return
     *     possible object is
     *     {@link RegOrgType }
     *     
     */
    public RegOrgType getAnnulmentOrganization() {
        return annulmentOrganization;
    }

    /**
     * Sets the value of the annulmentOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegOrgType }
     *     
     * @see #getAnnulmentOrganization()
     */
    public void setAnnulmentOrganization(RegOrgType value) {
        this.annulmentOrganization = value;
    }

    /**
     * Организация или физическое лицо, принявшая решение об аннулировании
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentOrganizationText() {
        return annulmentOrganizationText;
    }

    /**
     * Sets the value of the annulmentOrganizationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnnulmentOrganizationText()
     */
    public void setAnnulmentOrganizationText(String value) {
        this.annulmentOrganizationText = value;
    }

    /**
     * Дата решения об аннулировании. По умолчанию сохраняется дата выполнения аннулирования
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnnulmentDate() {
        return annulmentDate;
    }

    /**
     * Sets the value of the annulmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getAnnulmentDate()
     */
    public void setAnnulmentDate(XMLGregorianCalendar value) {
        this.annulmentDate = value;
    }

    /**
     * Номер решения об аннулировании
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnulmentNumber() {
        return annulmentNumber;
    }

    /**
     * Sets the value of the annulmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAnnulmentNumber()
     */
    public void setAnnulmentNumber(String value) {
        this.annulmentNumber = value;
    }

    /**
     * Причина аннулирования по НСИ (НСИ№271). По умолчанию запись с кодом 3 "Ошибка ввода"
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getNSIModification() {
        return nsiModification;
    }

    /**
     * Sets the value of the nsiModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getNSIModification()
     */
    public void setNSIModification(NsiRef value) {
        this.nsiModification = value;
    }

    /**
     * Электронная копия документа об аннулировании. Обязательно добавление хотя бы одного файла, если Причина аннулирования по НСИ "Решение суда" (код записи 1)
     * 
     * Gets the value of the attachments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachments }
     * </p>
     * 
     * 
     * @return
     *     The value of the attachments property.
     */
    public List<Attachments> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        return this.attachments;
    }

}
