
package ru.gosuslugi.dom.schema.integration.msp;

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


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="LoadCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <choice>
 *           <element name="CitizenCompensationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" maxOccurs="1000"/>
 *           <sequence>
 *             <element name="CategoryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *             <element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *             <element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *           </sequence>
 *         </choice>
 *       </sequence>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="11.8.0.2""/>
 *       <attribute name="Offset" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <minInclusive value="0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *       <attribute name="Limit" use="required">
 *         <simpleType>
 *           <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             <maxInclusive value="1000"/>
 *             <minExclusive value="0"/>
 *           </restriction>
 *         </simpleType>
 *       </attribute>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loadCanceled",
    "citizenCompensationGuid",
    "categoryGuid",
    "fromDate",
    "toDate"
})
@XmlRootElement(name = "exportCitizenCompensationRequest")
public class ExportCitizenCompensationRequest
    extends BaseType
{

    /**
     * Выгружать аннулированные сведения?
     * 
     */
    @XmlElement(name = "LoadCanceled")
    protected boolean loadCanceled;
    /**
     * Идентификатор информации о гражданине в ГИС ЖКХ
     * 
     */
    @XmlElement(name = "CitizenCompensationGuid")
    protected List<String> citizenCompensationGuid;
    /**
     * Идентификатор отдельной категории гражданин
     * 
     */
    @XmlElement(name = "CategoryGuid")
    protected String categoryGuid;
    /**
     * Дата начала предоставления компенсации расходов
     * 
     */
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    /**
     * Дата окончания предоставления компенсации расходов
     * 
     */
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;
    /**
     * Сдвиг относительно первого элемента (первый элемент имеет позицию 0)
     * 
     */
    @XmlAttribute(name = "Offset", required = true)
    protected int offset;
    /**
     * Количество строк с информацией о гражданах, которые необходимо экспортировать
     * 
     */
    @XmlAttribute(name = "Limit", required = true)
    protected int limit;

    /**
     * Выгружать аннулированные сведения?
     * 
     */
    public boolean isLoadCanceled() {
        return loadCanceled;
    }

    /**
     * Sets the value of the loadCanceled property.
     * 
     */
    public void setLoadCanceled(boolean value) {
        this.loadCanceled = value;
    }

    /**
     * Идентификатор информации о гражданине в ГИС ЖКХ
     * 
     * Gets the value of the citizenCompensationGuid property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenCompensationGuid property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCitizenCompensationGuid().add(newItem);
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
     *     The value of the citizenCompensationGuid property.
     */
    public List<String> getCitizenCompensationGuid() {
        if (citizenCompensationGuid == null) {
            citizenCompensationGuid = new ArrayList<>();
        }
        return this.citizenCompensationGuid;
    }

    /**
     * Идентификатор отдельной категории гражданин
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryGuid() {
        return categoryGuid;
    }

    /**
     * Sets the value of the categoryGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getCategoryGuid()
     */
    public void setCategoryGuid(String value) {
        this.categoryGuid = value;
    }

    /**
     * Дата начала предоставления компенсации расходов
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getFromDate()
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Дата окончания предоставления компенсации расходов
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getToDate()
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
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
            return "11.8.0.2";
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

    /**
     * Сдвиг относительно первого элемента (первый элемент имеет позицию 0)
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Количество строк с информацией о гражданах, которые необходимо экспортировать
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

}
