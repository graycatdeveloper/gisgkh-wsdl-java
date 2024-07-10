
package ru.gosuslugi.dom.schema.integration.msp;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Расходы на оплату жилого помещения и коммунальных услуг и их компенсация
 * 
 * <p>Java class for ActualCompensationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ActualCompensationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Service" type="{http://dom.gosuslugi.ru/schema/integration/msp/}ServiceType"/>
 *         <element name="FamilySize">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               <minInclusive value="0"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="ServicePaymentSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType"/>
 *         <element name="CompensationSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType" minOccurs="0"/>
 *         <element name="RecalculationSum" type="{http://dom.gosuslugi.ru/schema/integration/msp/}MoneyType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualCompensationType", propOrder = {
    "service",
    "familySize",
    "servicePaymentSum",
    "compensationSum",
    "recalculationSum"
})
public class ActualCompensationType {

    /**
     * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации
     * 
     */
    @XmlElement(name = "Service", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceType service;
    /**
     * Количество членов семьи, на которых распространяется предоставление компенсации расходов
     * 
     */
    @XmlElement(name = "FamilySize")
    protected int familySize;
    /**
     * Размер платы, руб.
     * 
     */
    @XmlElement(name = "ServicePaymentSum", required = true)
    protected BigDecimal servicePaymentSum;
    /**
     * Размер компенсации расходов, руб.
     * 
     */
    @XmlElement(name = "CompensationSum")
    protected BigDecimal compensationSum;
    /**
     * Размер перерасчета компенсации расходов за прошлые периоды, руб.
     * 
     */
    @XmlElement(name = "RecalculationSum")
    protected BigDecimal recalculationSum;

    /**
     * Расходы на оплату жилого помещения и коммунальных услуг, подлежащие компенсации
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     * @see #getService()
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * Количество членов семьи, на которых распространяется предоставление компенсации расходов
     * 
     */
    public int getFamilySize() {
        return familySize;
    }

    /**
     * Sets the value of the familySize property.
     * 
     */
    public void setFamilySize(int value) {
        this.familySize = value;
    }

    /**
     * Размер платы, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicePaymentSum() {
        return servicePaymentSum;
    }

    /**
     * Sets the value of the servicePaymentSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getServicePaymentSum()
     */
    public void setServicePaymentSum(BigDecimal value) {
        this.servicePaymentSum = value;
    }

    /**
     * Размер компенсации расходов, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompensationSum() {
        return compensationSum;
    }

    /**
     * Sets the value of the compensationSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getCompensationSum()
     */
    public void setCompensationSum(BigDecimal value) {
        this.compensationSum = value;
    }

    /**
     * Размер перерасчета компенсации расходов за прошлые периоды, руб.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecalculationSum() {
        return recalculationSum;
    }

    /**
     * Sets the value of the recalculationSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getRecalculationSum()
     */
    public void setRecalculationSum(BigDecimal value) {
        this.recalculationSum = value;
    }

}
