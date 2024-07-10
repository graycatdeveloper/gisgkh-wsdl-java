
package ru.gosuslugi.dom.schema.integration.bills;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Задолженность по услуге за период
 * 
 * <p>Java class for ServiceDebtType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceDebtType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}DebtType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="PaymentInformationGuid" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDebtType", propOrder = {
    "serviceType",
    "paymentInformationGuid"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtType.HousingService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtType.AdditionalService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtType.MunicipalService.class
})
public class ServiceDebtType
    extends DebtType
{

    /**
     * Код услуги (жилищной, коммунальной или дополнительной) из справочников:
     * ЖУ - №50 Вид жилищной услуги;
     * КУ - №51 Коммунальная услуга (справочник исполнителя);
     * ДУ - №1 Дополнительная услуга (справочник исполнителя)
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected NsiRef serviceType;
    /**
     * Идентификатор платежных реквизитов
     * 
     */
    @XmlElement(name = "PaymentInformationGuid")
    protected String paymentInformationGuid;

    /**
     * Код услуги (жилищной, коммунальной или дополнительной) из справочников:
     * ЖУ - №50 Вид жилищной услуги;
     * КУ - №51 Коммунальная услуга (справочник исполнителя);
     * ДУ - №1 Дополнительная услуга (справочник исполнителя)
     * 
     * @return
     *     possible object is
     *     {@link NsiRef }
     *     
     */
    public NsiRef getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NsiRef }
     *     
     * @see #getServiceType()
     */
    public void setServiceType(NsiRef value) {
        this.serviceType = value;
    }

    /**
     * Идентификатор платежных реквизитов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationGuid() {
        return paymentInformationGuid;
    }

    /**
     * Sets the value of the paymentInformationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentInformationGuid()
     */
    public void setPaymentInformationGuid(String value) {
        this.paymentInformationGuid = value;
    }

}
