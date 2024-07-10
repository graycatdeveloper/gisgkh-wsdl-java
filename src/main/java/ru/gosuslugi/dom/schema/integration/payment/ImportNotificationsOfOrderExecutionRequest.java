
package ru.gosuslugi.dom.schema.integration.payment;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.base.BaseType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <choice>
 *         <element name="NotificationOfOrderExecutionType" maxOccurs="500">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecutionType">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="NotificationOfOrderExecution139Type" maxOccurs="500">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecution139Type">
 *                 <sequence>
 *                   <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *       <attribute ref="{http://dom.gosuslugi.ru/schema/integration/base/}version use="required" fixed="10.0.1.1""/>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notificationOfOrderExecutionType",
    "notificationOfOrderExecution139Type"
})
@XmlRootElement(name = "importNotificationsOfOrderExecutionRequest")
public class ImportNotificationsOfOrderExecutionRequest
    extends BaseType
{

    /**
     * Извещения о принятии к исполнению распоряжений
     * 
     */
    @XmlElement(name = "NotificationOfOrderExecutionType")
    protected List<ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType> notificationOfOrderExecutionType;
    /**
     * Извещения о принятии к исполнению распоряжений (указание реквизитов платежа по п.139 приказа №589/944 от 28.12.2015)
     * 
     */
    @XmlElement(name = "NotificationOfOrderExecution139Type")
    protected List<ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type> notificationOfOrderExecution139Type;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Извещения о принятии к исполнению распоряжений
     * 
     * Gets the value of the notificationOfOrderExecutionType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationOfOrderExecutionType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotificationOfOrderExecutionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the notificationOfOrderExecutionType property.
     */
    public List<ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecutionType> getNotificationOfOrderExecutionType() {
        if (notificationOfOrderExecutionType == null) {
            notificationOfOrderExecutionType = new ArrayList<>();
        }
        return this.notificationOfOrderExecutionType;
    }

    /**
     * Извещения о принятии к исполнению распоряжений (указание реквизитов платежа по п.139 приказа №589/944 от 28.12.2015)
     * 
     * Gets the value of the notificationOfOrderExecution139Type property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationOfOrderExecution139Type property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotificationOfOrderExecution139Type().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type }
     * </p>
     * 
     * 
     * @return
     *     The value of the notificationOfOrderExecution139Type property.
     */
    public List<ImportNotificationsOfOrderExecutionRequest.NotificationOfOrderExecution139Type> getNotificationOfOrderExecution139Type() {
        if (notificationOfOrderExecution139Type == null) {
            notificationOfOrderExecution139Type = new ArrayList<>();
        }
        return this.notificationOfOrderExecution139Type;
    }

    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "10.0.1.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVersion()
     */
    public void setVersion(String value) {
        this.version = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecution139Type">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transportGUID"
    })
    public static class NotificationOfOrderExecution139Type
        extends ru.gosuslugi.dom.schema.integration.payments_base.NotificationOfOrderExecution139Type
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

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


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecutionType">
     *       <sequence>
     *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}TransportGUID"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transportGUID"
    })
    public static class NotificationOfOrderExecutionType
        extends ru.gosuslugi.dom.schema.integration.payments_base.NotificationOfOrderExecutionType
    {

        /**
         * Транспортный идентификатор
         * 
         */
        @XmlElement(name = "TransportGUID", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
        protected String transportGUID;

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

}
