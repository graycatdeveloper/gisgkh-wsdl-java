
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.AttachmentType;


/**
 * Данные отчетного периода (Исполнитель коммунальных услуг)
 * 
 * <p>Java class for ReportPeriodIKUInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ReportPeriodIKUInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Paid" type="{http://dom.gosuslugi.ru/schema/integration/bills/}MoneySettlementsType"/>
 *         <element name="SupportingDocuments" type="{http://dom.gosuslugi.ru/schema/integration/base/}AttachmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPeriodIKUInfoType", propOrder = {
    "paid",
    "supportingDocuments"
})
public class ReportPeriodIKUInfoType {

    /**
     * Оплачено
     * 
     */
    @XmlElement(name = "Paid", required = true)
    protected BigDecimal paid;
    /**
     * Сведения о документах, подтверждающих факт оплаты ресурсов, выполнения работ, оказания услуг
     * 
     */
    @XmlElement(name = "SupportingDocuments")
    protected List<AttachmentType> supportingDocuments;

    /**
     * Оплачено
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getPaid()
     */
    public void setPaid(BigDecimal value) {
        this.paid = value;
    }

    /**
     * Сведения о документах, подтверждающих факт оплаты ресурсов, выполнения работ, оказания услуг
     * 
     * Gets the value of the supportingDocuments property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportingDocuments property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSupportingDocuments().add(newItem);
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
     *     The value of the supportingDocuments property.
     */
    public List<AttachmentType> getSupportingDocuments() {
        if (supportingDocuments == null) {
            supportingDocuments = new ArrayList<>();
        }
        return this.supportingDocuments;
    }

}
