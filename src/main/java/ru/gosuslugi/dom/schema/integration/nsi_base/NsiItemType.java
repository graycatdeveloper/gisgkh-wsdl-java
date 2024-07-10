
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Данные справочника.
 * 
 * <p>Java class for NsiItemType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiItemType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NsiItemRegistryNumber" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemRegistryNumberType"/>
 *         <element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="NsiElement" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementType" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiItemType", propOrder = {
    "nsiItemRegistryNumber",
    "created",
    "nsiElement"
})
public class NsiItemType {

    /**
     * Реестровый номер справочника.
     * 
     */
    @XmlElement(name = "NsiItemRegistryNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nsiItemRegistryNumber;
    /**
     * Дата и время формирования данных справочника.
     * 
     */
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    /**
     * Элемент справочника верхнего уровня.
     * 
     */
    @XmlElement(name = "NsiElement", required = true)
    protected List<NsiElementType> nsiElement;

    /**
     * Реестровый номер справочника.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNsiItemRegistryNumber() {
        return nsiItemRegistryNumber;
    }

    /**
     * Sets the value of the nsiItemRegistryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getNsiItemRegistryNumber()
     */
    public void setNsiItemRegistryNumber(BigInteger value) {
        this.nsiItemRegistryNumber = value;
    }

    /**
     * Дата и время формирования данных справочника.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCreated()
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Элемент справочника верхнего уровня.
     * 
     * Gets the value of the nsiElement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsiElement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsiElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiElementType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nsiElement property.
     */
    public List<NsiElementType> getNsiElement() {
        if (nsiElement == null) {
            nsiElement = new ArrayList<>();
        }
        return this.nsiElement;
    }

}
