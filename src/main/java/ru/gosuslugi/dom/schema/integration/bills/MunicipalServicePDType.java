
package ru.gosuslugi.dom.schema.integration.bills;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import ru.gosuslugi.dom.schema.integration.nsi_base.NsiRef;


/**
 * Потребление по услуге
 * 
 * <p>Java class for MunicipalServicePDType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MunicipalServicePDType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ServiceType" type="{http://dom.gosuslugi.ru/schema/integration/nsi-base/}nsiRef"/>
 *         <element ref="{http://dom.gosuslugi.ru/schema/integration/base/}OKEI" minOccurs="0"/>
 *         <element name="Rate" type="{http://dom.gosuslugi.ru/schema/integration/bills-base/}SmallMoneyPositiveType"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MunicipalServicePDType", propOrder = {
    "serviceType",
    "okei",
    "rate"
})
public class MunicipalServicePDType {

    /**
     * Код услуги (жилищной, коммунальной или дополнительной)
     * 
     */
    @XmlElement(name = "ServiceType", required = true)
    protected NsiRef serviceType;
    /**
     * Код ОКЕИ
     * 
     */
    @XmlElement(name = "OKEI", namespace = "http://dom.gosuslugi.ru/schema/integration/base/")
    protected String okei;
    /**
     * Тариф
     * 
     */
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;

    /**
     * Код услуги (жилищной, коммунальной или дополнительной)
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
     * Код ОКЕИ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKEI() {
        return okei;
    }

    /**
     * Sets the value of the okei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOKEI()
     */
    public void setOKEI(String value) {
        this.okei = value;
    }

    /**
     * Тариф
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRate()
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

}
