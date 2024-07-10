
package ru.gosuslugi.dom.schema.integration.licenses;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация по отправлению в ЕСИА
 * 
 * <p>Java class for EsiaSentInfoType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="EsiaSentInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Status" type="{http://dom.gosuslugi.ru/schema/integration/licenses/}EsiaStatusType"/>
 *         <element name="StatusLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <sequence minOccurs="0">
 *           <element name="EsiaErrorCode">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="32"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *           <element name="EsiaErrorMessage">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 <maxLength value="512"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsiaSentInfoType", propOrder = {
    "status",
    "statusLastUpdate",
    "esiaErrorCode",
    "esiaErrorMessage"
})
public class EsiaSentInfoType {

    /**
     * Статус отправки информации в ЕСИА
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected EsiaStatusType status;
    /**
     * Дата и время изменения статуса
     * 
     */
    @XmlElement(name = "StatusLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusLastUpdate;
    /**
     * Код ошибки ЕСИА
     * 
     */
    @XmlElement(name = "EsiaErrorCode")
    protected String esiaErrorCode;
    /**
     * Текст ошибки ЕСИА
     * 
     */
    @XmlElement(name = "EsiaErrorMessage")
    protected String esiaErrorMessage;

    /**
     * Статус отправки информации в ЕСИА
     * 
     * @return
     *     possible object is
     *     {@link EsiaStatusType }
     *     
     */
    public EsiaStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsiaStatusType }
     *     
     * @see #getStatus()
     */
    public void setStatus(EsiaStatusType value) {
        this.status = value;
    }

    /**
     * Дата и время изменения статуса
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
     * Код ошибки ЕСИА
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsiaErrorCode() {
        return esiaErrorCode;
    }

    /**
     * Sets the value of the esiaErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEsiaErrorCode()
     */
    public void setEsiaErrorCode(String value) {
        this.esiaErrorCode = value;
    }

    /**
     * Текст ошибки ЕСИА
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsiaErrorMessage() {
        return esiaErrorMessage;
    }

    /**
     * Sets the value of the esiaErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getEsiaErrorMessage()
     */
    public void setEsiaErrorMessage(String value) {
        this.esiaErrorMessage = value;
    }

}
