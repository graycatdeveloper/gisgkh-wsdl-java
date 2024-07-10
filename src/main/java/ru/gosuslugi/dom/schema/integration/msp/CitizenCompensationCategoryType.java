
package ru.gosuslugi.dom.schema.integration.msp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Категория гражданина, получающего компенсации расходов
 * 
 * <p>Java class for CitizenCompensationCategoryType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CitizenCompensationCategoryType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CategoryGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element name="PeriodFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PeriodTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         <element name="Service" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ServiceType" maxOccurs="16" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CitizenCompensationCategoryType", propOrder = {
    "categoryGuid",
    "periodFrom",
    "periodTo",
    "service"
})
public class CitizenCompensationCategoryType {

    /**
     * Идентификатор отдельной категории гражданин
     * 
     */
    @XmlElement(name = "CategoryGuid", required = true)
    protected String categoryGuid;
    /**
     * Период предоставления компенсации по данной категории С
     * 
     */
    @XmlElement(name = "PeriodFrom", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodFrom;
    /**
     * Период предоставления компенсации по данной категории ПО
     * 
     */
    @XmlElement(name = "PeriodTo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodTo;
    /**
     * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации. Поле обязательно для заполнения, если порядок расчета компенсации расходов в указанной категории - от фактических расходов на оплату жилищно-коммунальных услуг
     * 
     */
    @XmlElement(name = "Service")
    @XmlSchemaType(name = "string")
    protected List<ServiceType> service;

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
     * Период предоставления компенсации по данной категории С
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodFrom() {
        return periodFrom;
    }

    /**
     * Sets the value of the periodFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPeriodFrom()
     */
    public void setPeriodFrom(XMLGregorianCalendar value) {
        this.periodFrom = value;
    }

    /**
     * Период предоставления компенсации по данной категории ПО
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodTo() {
        return periodTo;
    }

    /**
     * Sets the value of the periodTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getPeriodTo()
     */
    public void setPeriodTo(XMLGregorianCalendar value) {
        this.periodTo = value;
    }

    /**
     * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации. Поле обязательно для заполнения, если порядок расчета компенсации расходов в указанной категории - от фактических расходов на оплату жилищно-коммунальных услуг
     * 
     * Gets the value of the service property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * </p>
     * 
     * 
     * @return
     *     The value of the service property.
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<>();
        }
        return this.service;
    }

}
