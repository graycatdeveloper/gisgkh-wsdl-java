
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
import ru.gosuslugi.dom.schema.integration.payments_base.NotificationOfOrderExecutionCancellationType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/base/}BaseType">
 *       <sequence>
 *         <element name="NotificationOfOrderExecutionCancellation" type="{http://dom.gosuslugi.ru/schema/integration/payments-base/}NotificationOfOrderExecutionCancellationType" maxOccurs="500"/>
 *       </sequence>
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
    "notificationOfOrderExecutionCancellation"
})
@XmlRootElement(name = "importNotificationsOfOrderExecutionCancellationRequest")
public class ImportNotificationsOfOrderExecutionCancellationRequest
    extends BaseType
{

    @XmlElement(name = "NotificationOfOrderExecutionCancellation", required = true)
    protected List<NotificationOfOrderExecutionCancellationType> notificationOfOrderExecutionCancellation;
    /**
     * Версия элемента, начиная с которой поддерживается совместимость
     * 
     */
    @XmlAttribute(name = "version", namespace = "http://dom.gosuslugi.ru/schema/integration/base/", required = true)
    protected String version;

    /**
     * Gets the value of the notificationOfOrderExecutionCancellation property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationOfOrderExecutionCancellation property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNotificationOfOrderExecutionCancellation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationOfOrderExecutionCancellationType }
     * </p>
     * 
     * 
     * @return
     *     The value of the notificationOfOrderExecutionCancellation property.
     */
    public List<NotificationOfOrderExecutionCancellationType> getNotificationOfOrderExecutionCancellation() {
        if (notificationOfOrderExecutionCancellation == null) {
            notificationOfOrderExecutionCancellation = new ArrayList<>();
        }
        return this.notificationOfOrderExecutionCancellation;
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

}
