
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
 * Перечень справочников с датой последнего изменения каждого из них.
 * 
 * <p>Java class for NsiListType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NsiListType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="NsiItemInfo" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}NsiItemInfoType" maxOccurs="unbounded"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}ListGroup"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NsiListType", propOrder = {
    "created",
    "nsiItemInfo",
    "listGroup"
})
public class NsiListType {

    /**
     * Дата и время формирования перечня справочников.
     * 
     */
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    /**
     * Наименование, дата и время последнего изменения справочника.
     * 
     */
    @XmlElement(name = "NsiItemInfo", required = true)
    protected List<NsiItemInfoType> nsiItemInfo;
    /**
     * Группа справочника:
     * NSI - (по умолчанию) общесистемный 
     * NSIRAO - ОЖФ
     * 
     */
    @XmlElement(name = "ListGroup", required = true)
    protected String listGroup;

    /**
     * Дата и время формирования перечня справочников.
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
     * Наименование, дата и время последнего изменения справочника.
     * 
     * Gets the value of the nsiItemInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsiItemInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNsiItemInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NsiItemInfoType }
     * </p>
     * 
     * 
     * @return
     *     The value of the nsiItemInfo property.
     */
    public List<NsiItemInfoType> getNsiItemInfo() {
        if (nsiItemInfo == null) {
            nsiItemInfo = new ArrayList<>();
        }
        return this.nsiItemInfo;
    }

    /**
     * Группа справочника:
     * NSI - (по умолчанию) общесистемный 
     * NSIRAO - ОЖФ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListGroup() {
        return listGroup;
    }

    /**
     * Sets the value of the listGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getListGroup()
     */
    public void setListGroup(String value) {
        this.listGroup = value;
    }

}
