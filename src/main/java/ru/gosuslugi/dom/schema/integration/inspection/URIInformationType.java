
package ru.gosuslugi.dom.schema.integration.inspection;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация о регистрации в ЕРП
 * 
 * <p>Java class for URIInformationType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="URIInformationType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <sequence>
 *           <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           <element name="URIRegistrationPlanNumber">
 *             <simpleType>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                 <minInclusive value="0"/>
 *                 <pattern value="\d{1,12}"/>
 *               </restriction>
 *             </simpleType>
 *           </element>
 *         </sequence>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "URIInformationType", propOrder = {
    "shouldNotBeRegistered",
    "shouldBeRegistered",
    "uriRegistrationPlanNumber"
})
@XmlSeeAlso({
    ru.gosuslugi.dom.schema.integration.inspection.ExportInspectionPlanResultType.InspectionPlan.class
})
public class URIInformationType {

    /**
     * Не должен быть зарегистрирован в Едином реестре проверок.
     * 
     */
    @XmlElement(name = "ShouldNotBeRegistered")
    protected Boolean shouldNotBeRegistered;
    /**
     * Должен быть зарегистрирован в Едином реестре проверок.
     * 
     */
    @XmlElement(name = "ShouldBeRegistered")
    protected Boolean shouldBeRegistered;
    /**
     * Регистрационный номер плана в едином реестре проверок
     * 
     */
    @XmlElement(name = "URIRegistrationPlanNumber")
    protected BigInteger uriRegistrationPlanNumber;

    /**
     * Не должен быть зарегистрирован в Едином реестре проверок.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldNotBeRegistered() {
        return shouldNotBeRegistered;
    }

    /**
     * Sets the value of the shouldNotBeRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShouldNotBeRegistered()
     */
    public void setShouldNotBeRegistered(Boolean value) {
        this.shouldNotBeRegistered = value;
    }

    /**
     * Должен быть зарегистрирован в Едином реестре проверок.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShouldBeRegistered() {
        return shouldBeRegistered;
    }

    /**
     * Sets the value of the shouldBeRegistered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     * @see #isShouldBeRegistered()
     */
    public void setShouldBeRegistered(Boolean value) {
        this.shouldBeRegistered = value;
    }

    /**
     * Регистрационный номер плана в едином реестре проверок
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getURIRegistrationPlanNumber() {
        return uriRegistrationPlanNumber;
    }

    /**
     * Sets the value of the uriRegistrationPlanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     * @see #getURIRegistrationPlanNumber()
     */
    public void setURIRegistrationPlanNumber(BigInteger value) {
        this.uriRegistrationPlanNumber = value;
    }

}
