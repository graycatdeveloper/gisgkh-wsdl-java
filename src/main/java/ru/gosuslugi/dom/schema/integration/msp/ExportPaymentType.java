
package ru.gosuslugi.dom.schema.integration.msp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Тип для экcпорта информации о выплате
 * 
 * <p>Java class for ExportPaymentType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExportPaymentType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/msp/}PaymentType">
 *       <sequence>
 *         <element name="PaymentGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/msp/}Status"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportPaymentType", propOrder = {
    "paymentGuid",
    "status"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.msp.ExportCitizenSubsidyType.Payment.class
})
public class ExportPaymentType
    extends PaymentType
{

    /**
     * Идентификатор информации о выплате
     * 
     */
    @XmlElement(name = "PaymentGuid", required = true)
    protected String paymentGuid;
    /**
     * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
     * 
     */
    @XmlElement(name = "Status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String status;

    /**
     * Идентификатор информации о выплате
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentGuid() {
        return paymentGuid;
    }

    /**
     * Sets the value of the paymentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentGuid()
     */
    public void setPaymentGuid(String value) {
        this.paymentGuid = value;
    }

    /**
     * Статус размещения объекта. Возможные значения: Published - Размещено в ГИС ЖКХ, Canceled - Аннулировано, Draft - Проект
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStatus()
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
