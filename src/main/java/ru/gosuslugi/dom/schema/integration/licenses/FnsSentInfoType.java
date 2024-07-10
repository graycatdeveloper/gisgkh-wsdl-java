
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация по отправлению в ФНС
 * 
 * <p>Java class for FnsSentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FnsSentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}FnsStatusType"/>
 *         <element name="StatusLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="FnsErrorCode" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <maxLength value="2"/>
 *               <minLength value="1"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="FnsErrorMessage" minOccurs="0">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="500"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="NotSendToFns" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FnsSentInfoType", propOrder = {
    "status",
    "statusLastUpdate",
    "fnsErrorCode",
    "fnsErrorMessage",
    "notSendToFns"
})
public class FnsSentInfoType {

    /**
     * Статус размещения в ФНС
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected FnsStatusType status;
    /**
     * Дата и время последнего обновления статуса
     * 
     */
    @XmlElement(name = "StatusLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusLastUpdate;
    /**
     * Код ошибки ФНС
     * 
     */
    @XmlElement(name = "FnsErrorCode")
    protected String fnsErrorCode;
    /**
     * Текст ошибки ФНС
     * 
     */
    @XmlElement(name = "FnsErrorMessage")
    protected String fnsErrorMessage;
    /**
     * Отказ от отправки в ФНС
     * 
     */
    @XmlElement(name = "NotSendToFns")
    protected boolean notSendToFns;

    /**
     * Статус размещения в ФНС
     * 
     * @return
     *     possible object is
     *     {@link FnsStatusType }
     *     
     */
    public FnsStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link FnsStatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(FnsStatusType value) {
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
     * Код ошибки ФНС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnsErrorCode() {
        return fnsErrorCode;
    }

    /**
     * Sets the value of the fnsErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFnsErrorCode()
     */
    public void setFnsErrorCode(String value) {
        this.fnsErrorCode = value;
    }

    /**
     * Текст ошибки ФНС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnsErrorMessage() {
        return fnsErrorMessage;
    }

    /**
     * Sets the value of the fnsErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFnsErrorMessage()
     */
    public void setFnsErrorMessage(String value) {
        this.fnsErrorMessage = value;
    }

    /**
     * Отказ от отправки в ФНС
     * 
     */
    public boolean isNotSendToFns() {
        return notSendToFns;
    }

    /**
     * Sets the value of the notSendToFns property.
     * 
     */
    public void setNotSendToFns(boolean value) {
        this.notSendToFns = value;
    }

}
