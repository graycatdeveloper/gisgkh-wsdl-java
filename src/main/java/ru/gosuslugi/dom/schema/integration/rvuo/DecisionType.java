
package ru.gosuslugi.dom.schema.integration.rvuo;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип данных, описывающий решение об определении управляющей организации
 * 
 * <p>Java class for DecisionType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DecisionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Number" type="{http://dom.gosuslugi.ru/schema/integration/base/}String100Type"/>
 *         <element name="DecisionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="PaymentSize">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="AdditionalInformation" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="1000"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="InfoStatus" type="{http://dom.gosuslugi.ru/schema/integration/rvuo/}InfoStatusType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionType", propOrder = {
    "number",
    "decisionDate",
    "paymentSize",
    "additionalInformation",
    "infoStatus"
})
public class DecisionType {

    /**
     * Номер решения
     * 
     */
    @XmlElement(name = "Number", required = true)
    protected String number;
    /**
     * Дата решения
     * 
     */
    @XmlElement(name = "DecisionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisionDate;
    /**
     * Размер платы за содержание
     * 
     */
    @XmlElement(name = "PaymentSize", required = true)
    protected String paymentSize;
    /**
     * Дополнительная информация
     * 
     */
    @XmlElement(name = "AdditionalInformation")
    protected String additionalInformation;
    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена.
     * 
     */
    @XmlElement(name = "InfoStatus", required = true)
    @XmlSchemaType(name = "string")
    protected InfoStatusType infoStatus;

    /**
     * Номер решения
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
     * Дата решения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getDecisionDate()
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Размер платы за содержание
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSize() {
        return paymentSize;
    }

    /**
     * Sets the value of the paymentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentSize()
     */
    public void setPaymentSize(String value) {
        this.paymentSize = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAdditionalInformation()
     */
    public void setAdditionalInformation(String value) {
        this.additionalInformation = value;
    }

    /**
     * Статус размещаемой информации. Возможные значения: Project - Проект; Placed - Размещена.
     * 
     * @return
     *     possible object is
     *     {@link InfoStatusType }
     *     
     */
    public InfoStatusType getInfoStatus() {
        return infoStatus;
    }

    /**
     * Sets the value of the infoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoStatusType }
     *     
     * @see #getInfoStatus()
     */
    public void setInfoStatus(InfoStatusType value) {
        this.infoStatus = value;
    }

}
