
package ru.gosuslugi.dom.schema.integration.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.volume_quality.GetStateResult;


/**
 * Базовый тип ответа на запрос статуса
 * 
 * <p>Java class for BaseAsyncResponseType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="BaseAsyncResponseType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="RequestState" type="{http://dom.gosuslugi.ru/schema/integration/base/}AsyncRequestStateType"/>
 *         <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAsyncResponseType", propOrder = {
    "requestState",
    "messageGUID"
})
@XmlSeeAlso({
    GetStateResult.class
})
public class BaseAsyncResponseType
    extends BaseType
{

    /**
     * Статус обработки
     * 
     */
    @XmlElement(name = "RequestState")
    protected byte requestState;
    /**
     * Идентификатор сообщения, присвоенный ГИС ЖКХ
     * 
     */
    @XmlElement(name = "MessageGUID", required = true)
    protected String messageGUID;

    /**
     * Статус обработки
     * 
     */
    public byte getRequestState() {
        return requestState;
    }

    /**
     * Sets the value of the requestState property.
     * 
     */
    public void setRequestState(byte value) {
        this.requestState = value;
    }

    /**
     * Идентификатор сообщения, присвоенный ГИС ЖКХ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageGUID() {
        return messageGUID;
    }

    /**
     * Sets the value of the messageGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMessageGUID()
     */
    public void setMessageGUID(String value) {
        this.messageGUID = value;
    }

}
