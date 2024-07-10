
package ru.gosuslugi.dom.schema.integration.inspection;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Основные реквизиты плана проверок.(импорт)
 * 
 * <p>Java class for InspectionPlanType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="InspectionPlanType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Year" type="{http://dom.gosuslugi.ru/schema/integration/inspection/}LimitedYearType"/>
 *         <element name="Sign" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <choice>
 *           <element name="ShouldNotBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           <sequence>
 *             <element name="ShouldBeRegistered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             <element name="URIRegistrationPlanNumber">
 *               <simpleType>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                   <minInclusive value="0"/>
 *                   <pattern value="\d{1,12}"/>
 *                 </restriction>
 *               </simpleType>
 *             </element>
 *           </sequence>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionPlanType", propOrder = {
    "year",
    "sign",
    "shouldNotBeRegistered",
    "shouldBeRegistered",
    "uriRegistrationPlanNumber"
})
public class InspectionPlanType {

    /**
     * Год плана.
     * 
     */
    @XmlElement(name = "Year")
    protected short year;
    /**
     * Признак подписания плана проверок для публикации в ГИС ЖКХ.
     * 
     */
    @XmlElement(name = "Sign")
    protected boolean sign;
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
     * Регистрационный номер плана в Едином реестре проверок
     * 
     */
    @XmlElement(name = "URIRegistrationPlanNumber")
    protected BigInteger uriRegistrationPlanNumber;

    /**
     * Год плана.
     * 
     */
    public short getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(short value) {
        this.year = value;
    }

    /**
     * Признак подписания плана проверок для публикации в ГИС ЖКХ.
     * 
     */
    public boolean isSign() {
        return sign;
    }

    /**
     * Sets the value of the sign property.
     * 
     */
    public void setSign(boolean value) {
        this.sign = value;
    }

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
     * Регистрационный номер плана в Едином реестре проверок
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
