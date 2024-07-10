
package ru.gosuslugi.dom.schema.integration.nsi_base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Составной тип. Элемент справочника.
 * 
 * <p>Java class for NsiElementType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiElementType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiCodeType"/>
 *         <element name="GUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <choice>
 *           <element name="Modified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           <sequence>
 *             <element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             <element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           </sequence>
 *         </choice>
 *         <element name="IsActual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="NsiElementField" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ChildElement" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiElementType", propOrder = {
    "code",
    "guid",
    "modified",
    "startDate",
    "endDate",
    "isActual",
    "nsiElementField",
    "childElement"
})
public class NsiElementType {

    /**
     * Код элемента справочника, уникальный в пределах справочника.
     * 
     */
    @XmlElement(name = "Code", required = true)
    protected String code;
    /**
     * Глобально-уникальный идентификатор элемента справочника.
     * 
     */
    @XmlElement(name = "GUID", required = true)
    protected String guid;
    /**
     * Дата и время последнего изменения элемента справочника (в том числе создания).
     * 
     */
    @XmlElement(name = "Modified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    /**
     * Дата начала действия значения
     * 
     */
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    /**
     * Дата окончания действия значения
     * 
     */
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    /**
     * Признак актуальности элемента справочника.
     * 
     */
    @XmlElement(name = "IsActual")
    protected boolean isActual;
    /**
     * Наименование и значение поля для элемента справочника.
     * 
     */
    @XmlElement(name = "NsiElementField")
    protected List<NsiElementFieldType> nsiElementField;
    /**
     * Дочерний элемент.
     * 
     */
    @XmlElement(name = "ChildElement")
    protected List<NsiElementType> childElement;

    /**
     * Код элемента справочника, уникальный в пределах справочника.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCode()
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Глобально-уникальный идентификатор элемента справочника.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGUID()
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Дата и время последнего изменения элемента справочника (в том числе создания).
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getModified()
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Дата начала действия значения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStartDate()
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата окончания действия значения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getEndDate()
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Признак актуальности элемента справочника.
     * 
     */
    public boolean isIsActual() {
        return isActual;
    }

    /**
     * Sets the value of the isActual property.
     * 
     */
    public void setIsActual(boolean value) {
        this.isActual = value;
    }

    /**
     * Наименование и значение поля для элемента справочника.
     * 
     * Gets the value of the nsiElementField property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsiElementField property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsiElementField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiElementFieldType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nsiElementField property.
     */
    public List<NsiElementFieldType> getNsiElementField() {
        if (nsiElementField == null) {
            nsiElementField = new ArrayList<>();
        }
        return this.nsiElementField;
    }

    /**
     * Дочерний элемент.
     * 
     * Gets the value of the childElement property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childElement property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildElement().add(newItem);
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
     *     The value of the childElement property.
     */
    public List<NsiElementType> getChildElement() {
        if (childElement == null) {
            childElement = new ArrayList<>();
        }
        return this.childElement;
    }

}
