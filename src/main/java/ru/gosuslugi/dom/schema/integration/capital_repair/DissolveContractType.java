
package ru.gosuslugi.dom.schema.integration.capital_repair;

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
 * Сведения о расторжении договора на выполнение работ (оказание услуг) по капитальному ремонту
 * 
 * <p>Java class for DissolveContractType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DissolveContractType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Reason" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/capital-repair/}String500Type" minOccurs="0"/>
 *         <element name="DocDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Attach" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="1000"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DissolveContractType", propOrder = {
    "reason",
    "number",
    "docDate",
    "attach"
})
public class DissolveContractType {

    /**
     * Причина расторжения договора (НСИ 54)
     * 
     */
    @XmlElement(name = "Reason", required = true)
    protected NsiRef reason;
    /**
     * Номер документа
     * 
     */
    @XmlElement(name = "Number")
    protected String number;
    /**
     * Дата документа
     * 
     */
    @XmlElement(name = "DocDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDate;
    /**
     * Файлы документа, подтверждающего расторжение договора
     * 
     */
    @XmlElement(name = "Attach", required = true)
    protected List<AttachmentType> attach;

    /**
     * Причина расторжения договора (НСИ 54)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getReason()
     */
    public void setReason(NsiRef value) {
        this.reason = value;
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
    public XMLGregorianCalendar getDocDate() {
        return docDate;
    }

    /**
     * Sets the value of the docDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDocDate()
     */
    public void setDocDate(XMLGregorianCalendar value) {
        this.docDate = value;
    }

    /**
     * Файлы документа, подтверждающего расторжение договора
     * 
     * Gets the value of the attach property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attach property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttach().add(newItem);
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
     *     The value of the attach property.
     */
    public List<AttachmentType> getAttach() {
        if (attach == null) {
            attach = new ArrayList<>();
        }
        return this.attach;
    }

}
