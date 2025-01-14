
package ru.gosuslugi.dom.schema.integration.payments_base;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Извещение об аннулировании извещения о принятии распоряжения к исполнению
 * 
 * <p>Java class for NotificationOfOrderExecutionCancellationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="NotificationOfOrderExecutionCancellationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrderID" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}OrderIDExportType"/>
 *         <element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="Comment" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="210"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationOfOrderExecutionCancellationType", propOrder = {
    "orderID",
    "cancellationDate",
    "comment",
    "transportGUID"
})
public class NotificationOfOrderExecutionCancellationType {

    /**
     * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0 (тип)
     * 
     */
    @XmlElement(name = "OrderID", required = true)
    protected String orderID;
    /**
     * Дата аннулирования
     * 
     */
    @XmlElement(name = "CancellationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    /**
     * Комментарий
     * 
     */
    @XmlElement(name = "Comment")
    protected String comment;
    /**
     * Транспортный идентификатор
     * 
     */
    @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String transportGUID;

    /**
     * Уникальный идентификатор распоряжения для нужд квитирования, включающий более мягкие огранчиения UI/Excel до 11.8.0 (тип)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOrderID()
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Дата аннулирования
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getCancellationDate()
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Комментарий
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getComment()
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Транспортный идентификатор
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportGUID() {
        return transportGUID;
    }

    /**
     * Sets the value of the transportGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTransportGUID()
     */
    public void setTransportGUID(String value) {
        this.transportGUID = value;
    }

}
