
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация по отправлению в ЕРУЛ
 * 
 * <p>Java class for ErulSentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ErulSentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}ErulStatusType"/>
 *         <element name="StatusLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="ErulErrorCode" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="500"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ErulErrorMessage" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="500"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="NotSendToErul" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErulSentInfoType", propOrder = {
    "status",
    "statusLastUpdate",
    "erulErrorCode",
    "erulErrorMessage",
    "notSendToErul"
})
public class ErulSentInfoType {

    /**
     * Статус размещения в ЕРУЛ
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ErulStatusType status;
    /**
     * Дата и время последнего обновления статуса
     * 
     */
    @XmlElement(name = "StatusLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusLastUpdate;
    /**
     * Код ошибки ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulErrorCode")
    protected String erulErrorCode;
    /**
     * Текст ошибки ЕРУЛ
     * 
     */
    @XmlElement(name = "ErulErrorMessage")
    protected String erulErrorMessage;
    /**
     * Отказ от отправки в ЕРУЛ
     * 
     */
    @XmlElement(name = "NotSendToErul")
    protected boolean notSendToErul;

    /**
     * Статус размещения в ЕРУЛ
     * 
     * @return
     *     possible object is
     *     {@link ErulStatusType }
     *     
     */
    public ErulStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErulStatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(ErulStatusType value) {
        this.status = value;
    }

    /**
     * Дата и время последнего обновления статуса
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusLastUpdate() {
        return statusLastUpdate;
    }

    /**
     * Sets the value of the statusLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     * @see #getStatusLastUpdate()
     */
    public void setStatusLastUpdate(XMLGregorianCalendar value) {
        this.statusLastUpdate = value;
    }

    /**
     * Код ошибки ЕРУЛ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErulErrorCode() {
        return erulErrorCode;
    }

    /**
     * Sets the value of the erulErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErulErrorCode()
     */
    public void setErulErrorCode(String value) {
        this.erulErrorCode = value;
    }

    /**
     * Текст ошибки ЕРУЛ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErulErrorMessage() {
        return erulErrorMessage;
    }

    /**
     * Sets the value of the erulErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getErulErrorMessage()
     */
    public void setErulErrorMessage(String value) {
        this.erulErrorMessage = value;
    }

    /**
     * Отказ от отправки в ЕРУЛ
     * 
     */
    public boolean isNotSendToErul() {
        return notSendToErul;
    }

    /**
     * Sets the value of the notSendToErul property.
     * 
     */
    public void setNotSendToErul(boolean value) {
        this.notSendToErul = value;
    }

}
