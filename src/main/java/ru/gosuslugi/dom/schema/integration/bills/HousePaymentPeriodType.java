
package ru.gosuslugi.dom.schema.integration.bills;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Характеристика расчетного периода дома
 * 
 * <p>Java class for HousePaymentPeriodType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="HousePaymentPeriodType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HouseGuid" type="{http://dom.gosuslugi.ru/schema/integration/premises-base/}FIASHouseGUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/bills/}PaymentPeriodStatus"/>
 *         <element name="OpeningDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="ClosingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HousePaymentPeriodType", propOrder = {
    "houseGuid",
    "paymentPeriodStatus",
    "openingDate",
    "closingDate"
})
public class HousePaymentPeriodType {

    /**
     * Глобальный уникальный идентификатор дома
     * 
     */
    @XmlElement(name = "HouseGuid", required = true)
    protected String houseGuid;
    /**
     * Статус расчетного периода. (O)pen - открыт, (C)losed - закрыт,
     * 
     */
    @XmlElement(name = "PaymentPeriodStatus", required = true)
    protected String paymentPeriodStatus;
    /**
     * Дата открытия
     * 
     */
    @XmlElement(name = "OpeningDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar openingDate;
    /**
     * Дата закрытия
     * 
     */
    @XmlElement(name = "ClosingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar closingDate;

    /**
     * Глобальный уникальный идентификатор дома
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseGuid() {
        return houseGuid;
    }

    /**
     * Sets the value of the houseGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHouseGuid()
     */
    public void setHouseGuid(String value) {
        this.houseGuid = value;
    }

    /**
     * Статус расчетного периода. (O)pen - открыт, (C)losed - закрыт,
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPeriodStatus() {
        return paymentPeriodStatus;
    }

    /**
     * Sets the value of the paymentPeriodStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentPeriodStatus()
     */
    public void setPaymentPeriodStatus(String value) {
        this.paymentPeriodStatus = value;
    }

    /**
     * Дата открытия
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOpeningDate() {
        return openingDate;
    }

    /**
     * Sets the value of the openingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getOpeningDate()
     */
    public void setOpeningDate(XMLGregorianCalendar value) {
        this.openingDate = value;
    }

    /**
     * Дата закрытия
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClosingDate() {
        return closingDate;
    }

    /**
     * Sets the value of the closingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getClosingDate()
     */
    public void setClosingDate(XMLGregorianCalendar value) {
        this.closingDate = value;
    }

}
