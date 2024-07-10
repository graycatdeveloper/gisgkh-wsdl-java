
package ru.gosuslugi.dom.schema.integration.bills;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Задолженность по услуге за период при импорте
 * 
 * <p>Java class for ServiceDebtImportType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ServiceDebtImportType">
 *   <complexContent>
 *     <extension base="{http://dom.gosuslugi.ru/schema/integration/bills/}DebtImportType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element name="PaymentInformationKey" type="{http://dom.gosuslugi.ru/schema/integration/base/}GUIDType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDebtImportType", propOrder = {
    "serviceType",
    "paymentInformationKey"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtImportType.HousingService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtImportType.AdditionalService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtImportType.MunicipalService.class,
    ru.gosuslugi.dom.schema.integration.bills.PDServiceDebtImportType.GroupMunicipalService.MunicipalService.class
})
public class ServiceDebtImportType
    extends DebtImportType
{

    /**
     * Код услуги из справочника:
     * - для ЖУ - НСИ 50 "Вид жилищной услуги";
     * - для вида КУ - НСИ 3 "Вид коммунальной услуги"; 
     * - для главной КУ - НСИ 51 "Главная коммунальная услуга" (справочник исполнителя);
     * - для ДУ - НСИ 1 "Вид дополнительной услуги" (справочник исполнителя)
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected NsiRef serviceType;
    /**
     * Ссылка на платежные реквизиты
     * 
     */
    @XmlElement(name = "PaymentInformationKey")
    protected String paymentInformationKey;

    /**
     * Код услуги из справочника:
     * - для ЖУ - НСИ 50 "Вид жилищной услуги";
     * - для вида КУ - НСИ 3 "Вид коммунальной услуги"; 
     * - для главной КУ - НСИ 51 "Главная коммунальная услуга" (справочник исполнителя);
     * - для ДУ - НСИ 1 "Вид дополнительной услуги" (справочник исполнителя)
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
     * Ссылка на платежные реквизиты
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInformationKey() {
        return paymentInformationKey;
    }

    /**
     * Sets the value of the paymentInformationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getPaymentInformationKey()
     */
    public void setPaymentInformationKey(String value) {
        this.paymentInformationKey = value;
    }

}
