
package ru.gosuslugi.dom.schema.integration.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ack">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                   <element name="RequesterMessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ack"
})
@XmlRootElement(name = "AckRequest")
public class AckRequest {

    /**
     * Квитанция
     * 
     */
    @XmlElement(name = "Ack", required = true)
    protected AckRequest.Ack ack;

    /**
     * Квитанция
     * 
     * @return
     *     possible object is
     *     {@link AckRequest.Ack }
     *     
     */
    public AckRequest.Ack getAck() {
        return ack;
    }

    /**
     * Sets the value of the ack property.
     * 
     * @param value
     *     allowed object is
     *     {@link AckRequest.Ack }
     *     
     * @see #getAck()
     */
    public void setAck(AckRequest.Ack value) {
        this.ack = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="MessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *         <element name="RequesterMessageGUID" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "messageGUID",
        "requesterMessageGUID"
    })
    public static class Ack {

        /**
         * Идентификатор сообщения, присвоенный ГИС ЖКХ
         * 
         */
        @XmlElement(name = "MessageGUID", required = true)
        protected String messageGUID;
        /**
         * Идентификатор сообщения, присвоенный поставщиком
         * 
         */
        @XmlElement(name = "RequesterMessageGUID", required = true)
        protected String requesterMessageGUID;

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

        /**
         * Идентификатор сообщения, присвоенный поставщиком
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequesterMessageGUID() {
            return requesterMessageGUID;
        }

        /**
         * Sets the value of the requesterMessageGUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         * @see #getRequesterMessageGUID()
         */
        public void setRequesterMessageGUID(String value) {
            this.requesterMessageGUID = value;
        }

    }

}
